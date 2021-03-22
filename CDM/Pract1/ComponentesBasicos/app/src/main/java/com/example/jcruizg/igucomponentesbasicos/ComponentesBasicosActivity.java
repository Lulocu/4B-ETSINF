package com.example.jcruizg.igucomponentesbasicos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

/*******************************************************************
 *
 ** ACTIVIDAD MUY SENCILLA DISEÑADA PARA MOSTRAR CÓMO PODEMOS TRABAJAR
 *  CON UNA INTERFAZ BÁSICA EN ANDROID. SIMULA UNA ACTIVIDAD DE CONFIGURACIÓN
 *  PARA UNA APP REAL.
 */
 public class ComponentesBasicosActivity extends AppCompatActivity {
    //
    //Componentes del IGU que sólo se hacen visibles cuando deseamos elegir el idioma
    //
    Button botonCambioIdioma = null;
    RadioGroup grupoDeIdiomas = null;
    TextView textoIdiomasSoportados = null;

    //
    // CHECKBOX DE ELEGIR IDIOMA, NECESITAMOS SU REFERENCIA PORQUE CUANDO SE SELECCIONE
    // DEBEREMOS HACER VISIBLES LOS COMPONENTES DEL IGU QUE SON INVISIBLES Y A LA INVERSA.
    //
    CheckBox cbElegirIdioma = null;
    //
    // EN idiomaActualmenteElegido MEMORIZAREMOS EL ÚLTIMO IDIOMA ELEGIDO Y VALIDADO POR EL USUARIO
    //
    String idiomaActualmenteElegido = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.igu_componentes_basicos);

        findViewById(R.id.iv_About).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), AboutActivity.class));
            }
        });

        botonCambioIdioma = (Button)findViewById(R.id.btn_CambioIdioma);
        botonCambioIdioma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //
                // PULSACIÓN EN EL BOTÓN DE CAMBIO DE IDIOMA. CUANDO ESTO OCURRE CAMBIAMOS EL IDIOMA ELEGIDO POR EL USUARIO.
                // SI NO SE PULSA EL BOTÓN, AUNQUE EL USUARIO CAMBIE DE IDIOMA NO VALIDAREMOS SU ELECCIÓN
                //
                idiomaActualmenteElegido = ((RadioButton) findViewById(grupoDeIdiomas.getCheckedRadioButtonId())).getText().toString();
                Toast.makeText(getApplicationContext(),"Cambio de idioma efectuado a " + idiomaActualmenteElegido, Toast.LENGTH_SHORT).show();
                //
                // REALMENTE NO ESTAMOS CAMBIANDO DE IDIOMA LA APP, ESTO ES SÓLO UN EJEMPLO
                //
            }
        });
        grupoDeIdiomas = (RadioGroup)findViewById(R.id.radioGroup);
        textoIdiomasSoportados = (TextView)findViewById(R.id.tvIdiomasSoportados);

        //
        // ESTO LO HACEMOS PARA QUE SEA EL EDITTEXT DEL NOMBRE EL QUE TENGA EL FOCO
        //
        ((EditText) findViewById(R.id.et_Nombre)).requestFocus();

        cbElegirIdioma = (CheckBox)findViewById(R.id.cb_ElegirIdioma);
        cbElegirIdioma.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                   setVisibility(View.VISIBLE);
                } else {
                    setVisibility(View.INVISIBLE);
                }
            }

            void setVisibility(int visibility){
                botonCambioIdioma.setVisibility(visibility);
                grupoDeIdiomas.setVisibility(visibility);
                textoIdiomasSoportados.setVisibility(visibility);
            }
        });
        //
        // CUANDO PULSAMOS SOBRE EL BOTÓN APLICAR, LO QUE HACEMOS ES SIMPLEMENTE MOSTRAR LAS DISTINTAS OPCIONES
        // ELEGIDAS POR EL USUARIO
        //
        ((Button)findViewById(R.id.btn_AplicarConf)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String idiomaElegido = "Idioma elegido: [DEFAULT:Español]";
                if (cbElegirIdioma.isChecked()) idiomaElegido = "Idioma elegido: "+idiomaActualmenteElegido;
                String nombreUsuario = "Nombre: " + ((EditText)findViewById(R.id.et_Nombre)).getText().toString();
                //
                // TENEMOS MUCHO CUIDADO A LA HORA DE MOSTRAR LA CONTRASEÑA PARA NO MOSTRAR LOS CARACTERES INTRODUCIDOS POR EL USUARIO, YA QUE ÉSTOS
                // SON SECRETOS. LO QUE HACEMOS ES REEMPLAZAR CADA UNO DE LOS CARACTERES POR EL CARACTER "?"
                //
                String contrasenyaUsuario = "Contraseña: " +
                        ((EditText)findViewById(R.id.et_Contrasenya)).getText().toString().replaceAll(".","?");
                Toast.makeText(getApplicationContext(),nombreUsuario+"\n"+contrasenyaUsuario+"\n"+idiomaElegido, Toast.LENGTH_SHORT).show();
            }
        });


    }



}
