package com.example.jcruizg.ListaCompraSinAlmacenamiento.Activities.ListView;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;

import com.example.jcruizg.ListaCompraSinAlmacenamiento.Adapters.MiCustomAdapter;
import com.example.jcruizg.ListaCompraSinAlmacenamiento.R;
import com.example.jcruizg.ListaCompraSinAlmacenamiento.Utilidad.Compras.Producto;

//
// ESTA ACTIVIDAD NOS PERMITE AÑADIR UN NUEVO PRODUCTO A NUESTRA LISTA DE LA COMPRA
//
public class AnyadirProductoActivity extends AppCompatActivity {

    MiCustomAdapter adapter = null;
    //
    //INDICAMOS AL LLAMADOR QUE LA SOLICITUD DE AÑADIR UN PRODUCTO SE HA CANCELADO
    //
    @Override
    public void onBackPressed() {
        setResult(RESULT_CANCELED, null);
        super.onBackPressed();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anyadir_producto); //LAYOUT UTILIZADO

        //
        // EN CASO DE PULSAR EL BOTÓN DE AÑADIR CREAMOS EL PRODUCTO Y LO ENVIAMOS AL LLAMADOR
        //
        ((Button) findViewById(R.id.btn_SI)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText nombreProducto = findViewById(R.id.et_nombreProducto);
                Spinner spLugar = findViewById(R.id.sp_lugarCompra);
                RadioGroup rgNecesidad = findViewById(R.id.rg_necesidad);
                //
                // RECABAR LA INFORMACIÓN INTRODUCIDA POR EL USUARIO
                //
                String nombre = nombreProducto.getText().toString();
                String lugar = spLugar.getSelectedItem().toString();
                int necesidad;
                switch (rgNecesidad.getCheckedRadioButtonId()) {
                    case R.id.rb_necesario:
                        necesidad = R.drawable.necesario;
                        break;
                    case R.id.rb_pocoNecesario:
                        necesidad = R.drawable.poco_necesario;
                        break;
                    case R.id.rb_nadaNecesario:
                        necesidad = R.drawable.nada_necesario;
                        break;
                    case R.id.rb_muyNecesario:
                    default:
                        necesidad = R.drawable.muy_necesario;
                        break;
                }
                Producto p = new Producto(nombre, lugar, necesidad); //CREAR EL PRODUCTO
                Intent resultIntent = new Intent();
                resultIntent.putExtra("Producto",p); //INTRODUCIR EL PRODUCTO EN EL INTENT DE RESPUESTA
                setResult(RESULT_OK, resultIntent); //INDICAR EN LA RESPUESTA QUE TODO HA IDO OK
                finish(); //TERMINAR CON LA EJECUCIÓN DE LA ACTIVIDAD
            }
        });

        //
        // EN CASO DE QUE EL USUARIO CANCELE LA PETICIÓN HACEMOS LO MISMO QUE SI PULSA BACK
        //
        ((Button) findViewById(R.id.btn_NO)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setResult(RESULT_CANCELED, null); //SEÑALAMOS QUE LA OPERACIÓN HA SIDO CANCELADA
                finish(); //TERMINAMOS CON LA EJECUCIÓN DE LA ACTIVIDAD
            }
        });


    }
}
