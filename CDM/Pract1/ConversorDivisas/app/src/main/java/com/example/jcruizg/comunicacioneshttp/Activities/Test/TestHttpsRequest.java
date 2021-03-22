package com.example.jcruizg.comunicacioneshttp.Activities.Test;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;
import com.example.jcruizg.comunicacioneshttp.Activities.HttpsUrlConnection.ConversorDivisas_HTTPS;
import com.example.jcruizg.comunicacioneshttp.R;
import com.example.jcruizg.comunicacioneshttp.Utilidad.Divisas.HashDivisas;
import com.example.jcruizg.comunicacioneshttp.Utilidad.Divisas.ProveedorDeDivisasPorHTTPS;


public class TestHttpsRequest extends AppCompatActivity {

    public Handler objSincronizacion = null;
    protected static final int CODIGO_PETICION = 1;
    protected static final String CLAVE_RESPUESTA_PETICION = "LaClaveQueYoElija";

    TextView tv = null;
    private RequestQueue requestQueue = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_https_request);

        tv = findViewById(R.id.tvRpta);

        Button btnPeticion = findViewById(R.id.btnPeticion);
        btnPeticion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                determinaMetodoPeticion();
            }
        });

    }

    void determinaMetodoPeticion() {
        //
        //Lanzamiento de la petición HTTP
        //
        RadioGroup rg = findViewById(R.id.rgOpTest);
        switch (rg.getCheckedRadioButtonId()) {
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
                            String d = (String) bundle.getString(CLAVE_RESPUESTA_PETICION);
                            //Procesamiento del string y actualización del adapter
                            rellenaRespuesta(d);
                        }
                    }
                }
            };
        }

        Thread hiloPeticionHTTPS = new Thread() {
            @Override
            public void run() {
                String d = new ProveedorDeDivisasPorHTTPS().obtenerStringConDivisas();

                // Send message to main thread to update response text in TextView after read all.
                Message message = new Message();

                // Set message type.
                message.what = CODIGO_PETICION;

                // Create a bundle object.
                Bundle bundle = new Bundle();
                // Put response text in the bundle with the special key.
                bundle.putString(CLAVE_RESPUESTA_PETICION, d);
                // Set bundle data in message.
                message.setData(bundle);
                // Send message to main thread Handler to process.
                objSincronizacion.sendMessage(message);
            }
        };
        hiloPeticionHTTPS.start();
    }

    protected void lanzaPeticionWebParaObtencionDeDivisasporAsyncTask() {
        new TestHttpsRequest.miAsyncTaskParaPeticionHTTPS().execute();
    }

    //
    // PETICION DE DIVISAS UTILIZANDO UNA TAREA ASINCRONA
    // LA PETICION HTTPS LA REALIZA LA CLASE ProveedorDeDivisasPorHTTPS
    //
    private class miAsyncTaskParaPeticionHTTPS extends AsyncTask<Void, Void, String> {

        @Override
        protected String doInBackground(Void... voids) {
            return new ProveedorDeDivisasPorHTTPS().obtenerStringConDivisas();
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(String d) {
            super.onPostExecute(d);
            rellenaRespuesta(d);
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
                rellenaRespuesta(response);
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

    void rellenaRespuesta(String s){
        tv.setText(s);
    }
}