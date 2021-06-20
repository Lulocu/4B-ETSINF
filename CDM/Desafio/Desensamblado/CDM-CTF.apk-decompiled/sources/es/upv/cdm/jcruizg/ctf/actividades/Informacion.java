package es.upv.cdm.jcruizg.ctf.actividades;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import es.upv.cdm.jcruizg.ctf.R;
import es.upv.cdm.jcruizg.ctf.utilidad.informefinal.WatchDog;

public class Informacion extends AppCompatActivity {
    boolean credentialsOK = false;

    /* access modifiers changed from: protected */
    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.SupportActivity, android.support.v4.app.FragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_no);
        WatchDog.addTraza(WatchDog.CLASS.Informacion, WatchDog.EVENT.IN);
        ((TextView) findViewById(R.id.tvMensajeNo)).setText("¡¡¡No te rindas e inténtalo de nuevo!!!");
        MediaPlayer create = MediaPlayer.create(this, (int) R.raw.failure);
        create.start();
        create.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            /* class es.upv.cdm.jcruizg.ctf.actividades.Informacion.AnonymousClass1 */

            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        this.credentialsOK = getIntent().getBooleanExtra("Cred", false);
        TextView textView = (TextView) findViewById(R.id.tvIntroNo);
        if (this.credentialsOK) {
            WatchDog.addTraza(WatchDog.CLASS.Informacion, WatchDog.EVENT.CREDENTIALS_OK);
            textView.setText(R.string.introNo2);
            return;
        }
        WatchDog.addTraza(WatchDog.CLASS.Informacion, WatchDog.EVENT.CREDENTIALS_KO);
        textView.setText(R.string.introNo1);
    }

    @Override // android.support.v4.app.FragmentActivity
    public void onBackPressed() {
        super.onBackPressed();
        if (this.credentialsOK) {
            startActivity(new Intent(getApplicationContext(), Pista.class));
        }
        WatchDog.addTraza(WatchDog.CLASS.Informacion, WatchDog.EVENT.OUT);
    }
}
