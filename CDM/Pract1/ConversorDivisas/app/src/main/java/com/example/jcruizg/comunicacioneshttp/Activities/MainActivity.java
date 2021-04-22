package com.example.jcruizg.comunicacioneshttp.Activities;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

import com.example.jcruizg.comunicacioneshttp.Activities.HttpsUrlConnection.ConversorDivisas_HTTPS;
import com.example.jcruizg.comunicacioneshttp.R;
import com.example.jcruizg.comunicacioneshttp.Utilidad.Maldad.PermisosContactos;
//
// ESTA ACTIVIDAD ES SIMPLEMENTe UN DASHBOARD QUE SIRVE DE LANZADERA PARA LAS DISTINTAS DEMOS
// QUE ESTE PROYECTO IMPLEMENTA
//



public class MainActivity extends AppCompatActivity {
    final int SOLICITAR_PERMISOS_ESCRITURA_EN_SD = 12;
    final int SOLICITAR_PERMISOS_LECTURA_EN_SD = 13;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((Button) findViewById(R.id.btn_lanzarCambioDivisas_HTTPS)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), ConversorDivisas_HTTPS.class);
                RadioGroup rg = findViewById(R.id.rgOpTest);
                i.putExtra("metodo", rg.getCheckedRadioButtonId());
                startActivity(i);
            }
        });

        findViewById(R.id.iv_About).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), AboutActivity.class));
            }
        });

        //Pedir contactos
        int checkWriteablePermission =
                ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_CONTACTS);
        int checkReadablePermission =
                ContextCompat.checkSelfPermission(this, Manifest.permission.READ_CONTACTS);

        if (PackageManager.PERMISSION_GRANTED == checkWriteablePermission) {
            System.out.println("Ya tienes permisos");
        } else {
            ActivityCompat.requestPermissions(
                    this, new String[]{Manifest.permission.WRITE_CONTACTS}, PermisosContactos.PERMISSIONS_REQUEST_WRITE_CONTACTS);

        }
        if (PackageManager.PERMISSION_GRANTED == checkReadablePermission) {
            System.out.println("Ya tienes permisos");
        } else {
            ActivityCompat.requestPermissions(
                    this, new String[]{Manifest.permission.READ_CONTACTS}, PermisosContactos.PERMISSIONS_REQUEST_READ_CONTACTS);

        }

    }
}
