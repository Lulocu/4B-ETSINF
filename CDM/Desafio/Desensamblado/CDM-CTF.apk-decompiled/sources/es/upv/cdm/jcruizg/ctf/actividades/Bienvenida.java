package es.upv.cdm.jcruizg.ctf.actividades;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import es.upv.cdm.jcruizg.ctf.R;
import es.upv.cdm.jcruizg.ctf.utilidad.Pistas;
import es.upv.cdm.jcruizg.ctf.utilidad.informefinal.WatchDog;

public class Bienvenida extends AppCompatActivity {
    TextView tv1 = null;
    TextView tv2 = null;

    /* access modifiers changed from: protected */
    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.SupportActivity, android.support.v4.app.FragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        WatchDog.initializeHashMaps();
        WatchDog.addTraza(WatchDog.CLASS.Bienvenida, WatchDog.EVENT.IN);
        getSupportActionBar().hide();
        this.tv1 = (TextView) findViewById(R.id.tvMovil1);
        this.tv2 = (TextView) findViewById(R.id.tvMovil2);
        this.tv1.setText("Pulsa la pantalla para comenzar");
        this.tv2.setText("Pulsa la pantalla para comenzar");
        Pistas.inicializa(getApplicationContext());
        Pistas._1();
        RunAnimation();
    }

    private void RunAnimation() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(9000L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class es.upv.cdm.jcruizg.ctf.actividades.Bienvenida.AnonymousClass1 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float width = (float) Bienvenida.this.tv1.getWidth();
                float f = floatValue * width;
                Bienvenida.this.tv1.setTranslationX(f);
                Bienvenida.this.tv2.setTranslationX(f - width);
            }
        });
        ofFloat.start();
    }

    public void start(View view) {
        WatchDog.addTraza(WatchDog.CLASS.Bienvenida, WatchDog.EVENT.OUT);
        startActivity(new Intent(getApplicationContext(), Credenciales.class));
    }
}
