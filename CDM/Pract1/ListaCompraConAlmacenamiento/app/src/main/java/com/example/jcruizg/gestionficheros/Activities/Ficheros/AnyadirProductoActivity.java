package com.example.jcruizg.gestionficheros.Activities.Ficheros;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;

import com.example.jcruizg.gestionficheros.Adapters.MiCustomAdapter;
import com.example.jcruizg.gestionficheros.R;
import com.example.jcruizg.gestionficheros.Utilidad.Compras.Producto;

public class AnyadirProductoActivity extends AppCompatActivity {

    MiCustomAdapter adapter = null;

    @Override
    public void onBackPressed() {
        setResult(RESULT_CANCELED, null);
        super.onBackPressed();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anyadir_producto);

        ((Button) findViewById(R.id.btn_SI)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText nombreProducto = findViewById(R.id.et_nombreProducto);
                Spinner spLugar = findViewById(R.id.sp_lugarCompra);
                RadioGroup rgNecesidad = findViewById(R.id.rg_necesidad);

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
                Producto p = new Producto(nombre, lugar, necesidad);
                Intent resultIntent = new Intent();
                resultIntent.putExtra("Producto",p);
                setResult(RESULT_OK, resultIntent);
                finish();
            }
        });

        ((Button) findViewById(R.id.btn_NO)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setResult(RESULT_CANCELED, null);
                finish();
            }
        });


    }
}
