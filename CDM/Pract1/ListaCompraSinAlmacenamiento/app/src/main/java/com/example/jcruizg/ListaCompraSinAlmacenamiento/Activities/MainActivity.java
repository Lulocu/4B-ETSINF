package com.example.jcruizg.ListaCompraSinAlmacenamiento.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.jcruizg.ListaCompraSinAlmacenamiento.Activities.ListView.LVConMenusActivity;
import com.example.jcruizg.ListaCompraSinAlmacenamiento.R;

//
// ESTA ACTIVIDAD ES SIMPLEMENTE UN DASHBOARD QUE SIRVE DE LANZADERA PARA LAS DISTINTAS DEMOS
// QUE ESTE PROYECTO IMPLEMENTA
//

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        ((Button)findViewById(R.id.btn_goToMenuDemo)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), LVConMenusActivity.class);
                startActivity(i);
            }
        });

        ((ImageView)findViewById(R.id.iv_About)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), AboutActivity.class);
                startActivity(i);
            }
        });

    }
}
