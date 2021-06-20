package es.upv.cdm.jcruizg.ctf.actividades;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import es.upv.cdm.jcruizg.ctf.R;
import es.upv.cdm.jcruizg.ctf.utilidad.Pistas;
import es.upv.cdm.jcruizg.ctf.utilidad.informefinal.WatchDog;

public class Pista extends AppCompatActivity {
    public int currentCount = 10;
    public TextView tvCounter = null;

    /* access modifiers changed from: protected */
    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.SupportActivity, android.support.v4.app.FragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_pista);
        WatchDog.addTraza(WatchDog.CLASS.Pista, WatchDog.EVENT.IN);
        Pistas._5((TextView) findViewById(R.id.tvPista));
        this.currentCount = 10;
        this.tvCounter = (TextView) findViewById(R.id.tvCounter);
        new MyCountDownTimer(10000, 1000).start();
    }

    public class MyCountDownTimer extends CountDownTimer {
        public MyCountDownTimer(long j, long j2) {
            super(j, j2);
        }

        public void onTick(long j) {
            if (Pista.this.tvCounter != null) {
                TextView textView = Pista.this.tvCounter;
                Pista pista = Pista.this;
                int i = pista.currentCount;
                pista.currentCount = i - 1;
                textView.setText(String.valueOf(i));
            }
        }

        public void onFinish() {
            WatchDog.addTraza(WatchDog.CLASS.Pista, WatchDog.EVENT.OUT);
            Pista.this.finish();
        }
    }
}
