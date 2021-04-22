package com.example.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView s = findViewById(R.id.tvMensaje);
        s.setText(R.string.mensaje);
        Log.d("holaMundo.MainActivity","Mensaje cambiado");

        findViewById(R.id.iv_About).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), AboutActivity.class));
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("holaMundo.MainActivity","onStart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("holaMundo.MainActivity","onResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("holaMundo.MainActivity","onPause");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("holaMundo.MainActivity","onStop");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("holaMundo.MainActivity","onDestroy");
    }
}