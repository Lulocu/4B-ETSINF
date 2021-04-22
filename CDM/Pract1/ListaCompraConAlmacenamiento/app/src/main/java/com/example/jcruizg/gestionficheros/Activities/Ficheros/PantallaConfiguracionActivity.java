package com.example.jcruizg.gestionficheros.Activities.Ficheros;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.jcruizg.gestionficheros.R;

/**************************************************************************************
 *
 *** ACTIVIDAD UTILIZADA EN FICHEROSDEMOS PARA GESTIONAR SU CONFIGURACIÓN
 *
 **************************************************************************************/

public class PantallaConfiguracionActivity extends AppCompatPreferenceActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.pantalla_configuracion);

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

}
