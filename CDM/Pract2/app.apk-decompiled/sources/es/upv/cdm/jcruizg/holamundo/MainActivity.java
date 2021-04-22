package es.upv.cdm.jcruizg.holamundo;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    /* access modifiers changed from: protected */
    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.SupportActivity, android.support.v4.app.FragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        Log.i("MainActivity", "[OnCreate]: Ya estoy funcionando !!!");
        Toast.makeText(getApplicationContext(), "¡¡¡ Pulsa el botón para autenticarte !!!", 1).show();
        findViewById(R.id.btnPulsame).setOnClickListener(new View.OnClickListener() {
            /* class es.upv.cdm.jcruizg.holamundo.MainActivity.AnonymousClass1 */

            public void onClick(View view) {
                MainActivity mainActivity = MainActivity.this;
                mainActivity.startActivity(new Intent(mainActivity.getApplicationContext(), LoginActivity.class));
                if (Build.DEVICE.contains("generic")) {
                    Log.i("[MainActivity]", "Ejecutas el código en un emulador");
                } else {
                    Log.i("[MainActivity]", "Ejecutas el código en un dispositivo real");
                }
            }
        });
    }
}
