package com.example.jcruizg.comunicacioneshttp.Activities.HttpsUrlConnection;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;
import com.example.jcruizg.comunicacioneshttp.Utilidad.Divisas.Divisa;
import com.example.jcruizg.comunicacioneshttp.Utilidad.Divisas.HashDivisas;

import com.example.jcruizg.comunicacioneshttp.R;
import com.example.jcruizg.comunicacioneshttp.Utilidad.Divisas.ProveedorDeDivisasEnFormatoXML;
import com.example.jcruizg.comunicacioneshttp.Utilidad.Divisas.ProveedorDeDivisasPorHTTPS;


import java.util.ArrayList;
import java.util.HashMap;


import com.android.volley.RequestQueue;

public class ConversorDivisas_HTTPS extends AppCompatActivity {
    Spinner sp1 = null, sp2 = null;
    HashDivisas divisas = null;

    protected static final int CODIGO_PETICION = 1;
    protected static final String CLAVE_RESPUESTA_PETICION = "LaClaveQueYoElija";

    //
    // La clase articula la gestión de la petición tanto mediante Handlers como Asynctasks
    //
    enum GESTION_PETICION {handler, asynctask, volley}

    ;

    public Handler objSincronizacion = null;
    ArrayAdapter adapter = null;
    AppCompatActivity autoReferencia = null;

    private RequestQueue requestQueue = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayList<String> array = new ArrayList<String>();

        //
        //Asociamos el layout a la actividad
        //
        setContentView(R.layout.activity_peticiones_get);

        autoReferencia = this;
        //
        //Lanzamiento de la petición HTTP
        //
        int metodoID = getIntent().getIntExtra("metodo", R.id.rbAT);
        switch (metodoID) {
            case R.id.rbAT:
                lanzaPeticionWebParaObtencionDeDivisasporAsyncTask();
                Toast.makeText(this, "Recuperando divisas a través de una AsynTask ...", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rbH:
                lanzaPeticionWebParaObtencionDeDivisasporHandler();
                Toast.makeText(this, "Recuperando divisas utilizando Handlers ...", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rbV:
                lanzaPeticionWebParaObtencionDeDivisasporconVolley();
                Toast.makeText(this, "Recuperando divisas a través de la libreria Volley ...", Toast.LENGTH_SHORT).show();
                break;
        }

        sp1 = findViewById(R.id.sp_currency1);
        sp2 = findViewById(R.id.sp_currency2);

        //Instanciamos el adaptador a utilizar y lo asociamos a los Spinners
        adapter = new ArrayAdapter<String>(autoReferencia, android.R.layout.simple_spinner_item, array);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp1.setAdapter(adapter);
        sp2.setAdapter(adapter);

        Button ibUp = findViewById(R.id.btn_Up);
        Button ibDown = findViewById(R.id.btn_Down);

        final EditText et1 = findViewById(R.id.et_value1);
        final EditText et2 = findViewById(R.id.et_Value2);

        ibUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (et2.getText().toString().length() > 0) {
                    double d = divisas.dameHash().get(sp2.getSelectedItem().toString()).convierte(Double.valueOf(et2.getText().toString()).doubleValue(),
                            divisas.dameHash().get(sp1.getSelectedItem().toString()));
                    et1.setText(Double.valueOf(d).toString(), TextView.BufferType.EDITABLE);

                } else {
                    Toast.makeText(getApplicationContext(), "Conversión imposible. \nDebes introducir algún montante en la divisa B.", Toast.LENGTH_LONG).show();
                }
            }
        });

        ibDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (et1.getText().toString().length() > 0) {
                    double d = divisas.dameHash().get(sp1.getSelectedItem().toString()).convierte(Double.valueOf(et1.getText().toString()).doubleValue(),
                            divisas.dameHash().get(sp2.getSelectedItem().toString()));
                    et2.setText(Double.valueOf(d).toString(), TextView.BufferType.EDITABLE);

                } else {
                    Toast.makeText(getApplicationContext(), "Conversión imposible.\nDebes introducir algún montante en la divisa A.", Toast.LENGTH_LONG).show();
                }
            }
        });
        et1.requestFocus();

        ((Button) findViewById(R.id.btn_Reset)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1.setText("", TextView.BufferType.EDITABLE);
                et2.setText("", TextView.BufferType.EDITABLE);
            }
        });
    }

        void determinaMetodoPeticion(){
            //
            //Lanzamiento de la petición HTTP
            //
            int metodoID = getIntent().getIntExtra("metodo", R.id.rbAT);
            switch (metodoID) {
                case R.id.rbAT:
                    lanzaPeticionWebParaObtencionDeDivisasporAsyncTask();
                    Toast.makeText(this, "Recuperando divisas a través de una AsynTask ...", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.rbH:
                    lanzaPeticionWebParaObtencionDeDivisasporHandler();
                    Toast.makeText(this, "Recuperando divisas utilizando Handlers ...", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.rbV:
                    lanzaPeticionWebParaObtencionDeDivisasporconVolley();
                    Toast.makeText(this, "Recuperando divisas a través de la libreria Volley ...", Toast.LENGTH_SHORT).show();
                    break;
            }
        }

    //
    // NUESTRO ADAPTADOR ES UN SIMPLE ARRAY QUE SERÁ MOSTRADO A TRAVES DE UN DESPLEGABLE CON EL NOMBRE DE LAS DIVISAS EXISTENTES
    // CABE SEÑALAR QUE LOS VALORES DE CAMBIO LOS GESTIONA UN HASHMAP QUE MANTIENE EN TODO MOMENTO LA CORRESPONDENCIA ENTRE EL
    // NOMBRE DE CADA DIVISA Y SU CAMBIO, CONTENIDO EN UN OBJETO DE TIPO DIVISA
    //

    public void actualizaAdapterData(String strConDivisasEnFormatoXML) {
        divisas = new ProveedorDeDivisasEnFormatoXML().obtenerDivisas_desdeString(strConDivisasEnFormatoXML);
        actualizaAdapterData(divisas);
    }


    protected void actualizaAdapterData(HashDivisas d) {
        adapter.clear();
        divisas = d;
        //Poblamos el array con las divisas obtenidas
        if (divisas != null) {
            for (HashMap.Entry<String, Divisa> entry : divisas.dameHash().entrySet()) {
                adapter.add(entry.getKey());
            }
        }
        adapter.notifyDataSetChanged(); //NO ES NECESARIO PORQUE LOS CAMBIOS LOS APLICA EL PROPIO ADAPTER Y, POR TANTO, ESTÁ AL TANTO DE LOS CAMBIOS
    }


    //
    // PETICION DE DIVISAS UTILIZANDO UN HANDLER
    // LA PETICION HTTPS LA REALIZA LA CLASE ProveedorDeDivisasPorHTTPS
    //
    protected void lanzaPeticionWebParaObtencionDeDivisasporHandler() {

        if (objSincronizacion == null) {
            objSincronizacion = new Handler() {
                @Override
                public void handleMessage(Message msg) {
                    //
                    // Se activa cuando el proceso de petición de divisas por HTTP finaliza
                    // con lo que se debe proceder a procesar la respuesta del servidor para
                    // obtener las divisas y luego actualizar la IGU de la app
                    //
                    if (msg.what == CODIGO_PETICION) {
                        Bundle bundle = msg.getData();
                        if (bundle != null) {
                            //Obtención del string en formato XML con las divisas
                            HashDivisas d = (HashDivisas) bundle.getSerializable(CLAVE_RESPUESTA_PETICION);
                            //Procesamiento del string y actualización del adapter
                            actualizaAdapterData(d);
                        }
                    }
                }
            };
        }

        Thread hiloPeticionHTTPS = new Thread() {
            @Override
            public void run() {
                HashDivisas d = new ProveedorDeDivisasPorHTTPS().obtenerDivisas();

                // Send message to main thread to update response text in TextView after read all.
                Message message = new Message();

                // Set message type.
                message.what = CODIGO_PETICION;

                // Create a bundle object.
                Bundle bundle = new Bundle();
                // Put response text in the bundle with the special key.
                bundle.putSerializable(CLAVE_RESPUESTA_PETICION, d);
                // Set bundle data in message.
                message.setData(bundle);
                // Send message to main thread Handler to process.
                objSincronizacion.sendMessage(message);
            }
        };
        hiloPeticionHTTPS.start();
    }

    protected void lanzaPeticionWebParaObtencionDeDivisasporAsyncTask() {
        new miAsyncTaskParaPeticionHTTPS().execute();
    }

    //
    // PETICION DE DIVISAS UTILIZANDO UNA TAREA ASINCRONA
    // LA PETICION HTTPS LA REALIZA LA CLASE ProveedorDeDivisasPorHTTPS
    //
    private class miAsyncTaskParaPeticionHTTPS extends AsyncTask<Void, Void, HashDivisas> {

        @Override
        protected HashDivisas doInBackground(Void... voids) {
            return new ProveedorDeDivisasPorHTTPS().obtenerDivisas();
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(HashDivisas d) {
            super.onPostExecute(d);
            actualizaAdapterData(d);
        }


    }

    //
    // PETICION DE DIVISAS UTILIZANDO VOLLEY
    // LA PETICION HTTPS LA REALIZA LA CLASE ProveedorDeDivisasPorHTTPS
    //
    private void lanzaPeticionWebParaObtencionDeDivisasporconVolley() {
        requestQueue = Volley.newRequestQueue(this);
        Response.Listener<String> responseListener = new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                //
                // LO QUE DEBEMOS HACER SI TODO VA BIEN
                //
                actualizaAdapterData(response);
                requestQueue.stop();
            }
        };
        Response.ErrorListener errorListener = new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                //
                // LO QUE DEBEMOS HACER EN CASO DE PROBLEMAS CON LA PETICIÓN
                //
                requestQueue.stop();
            }
        };

        new ProveedorDeDivisasPorHTTPS().obtenerDivisas(requestQueue, responseListener, errorListener);
    }

    @Override
    protected void onResume() {
        super.onResume();
        determinaMetodoPeticion();
    }
}
