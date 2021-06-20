package es.upv.cdm.jcruizg.ctf.actividades;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import es.upv.cdm.jcruizg.ctf.R;
import es.upv.cdm.jcruizg.ctf.utilidad.Pistas;
import es.upv.cdm.jcruizg.ctf.utilidad.informefinal.WatchDog;

public class Mensaje extends AppCompatActivity {
    private MediaPlayer mp = null;

    /* access modifiers changed from: protected */
    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.SupportActivity, android.support.v4.app.FragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_mensaje);
        WatchDog.addTraza(WatchDog.CLASS.Mensaje, WatchDog.EVENT.IN);
        ((TextView) findViewById(R.id.tvMensajeOn)).setText("w2D D6CG:5@ 3:6? 2= réD2C] w2D 2G6C:8F25@ 6= FDF2C:@ J 4@?EC2D6ñ2 D64C6E@D] p56>áD[ 92D D23:5@ 52C 2= réD2C =@ BF6 6D 56= réD2C[ 6D 564:C[ 92D 4@?D68F:5@ 56E6C>:?2C 4Fá?E2D G646D 923í2 BF6 AF=D2C D@3C6 DF :>286? A2C2 A@56C 4@?E:?F2C] p9@C2 Dó=@ E6 72=E2 =2 32?56C2] $: ?@ =2 92D 6?4@?EC25@ J2[ A@5CáD 56D4F3C:C=2 6? =2 ú?:42 24E:G:525 56 =2 2AA BF6 ?@ 6D A@D:3=6 24E:G2C 2 EC2GéD 56 DF :?E6C72K] $: 4@?D:8F6D 24E:G2C=2[ FE:=:K2 6= E6IE@ Qq2?56C2Q J @3E6?5CáD =@ BF6 E6 72=E2 A2C2 C6D@=G6C 6DE6 56D27í@]");
        WatchDog.addTraza(WatchDog.CLASS.Mensaje, WatchDog.EVENT.MENSAJE_MOSTRADO);
        MediaPlayer create = MediaPlayer.create(this, (int) R.raw.applause);
        this.mp = create;
        create.start();
        this.mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            /* class es.upv.cdm.jcruizg.ctf.actividades.Mensaje.AnonymousClass1 */

            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }

    public void darPista(View view) {
        Pistas._6((TextView) findViewById(R.id.tvPista));
        WatchDog.addTraza(WatchDog.CLASS.Mensaje, WatchDog.EVENT.PISTA_6_Visible);
        ((TextView) findViewById(R.id.tvPista)).setVisibility(0);
    }

    public void darSolucion(View view) {
        Intent intent = getIntent();
        Intent intent2 = new Intent(getApplicationContext(), Solucion.class);
        intent2.putExtra("User", intent.getStringExtra("User"));
        intent2.putExtra("Password", intent.getStringExtra("Password"));
        intent2.putExtra("BD", intent.getBooleanExtra("BD", false));
        WatchDog.addTraza(WatchDog.CLASS.Mensaje, WatchDog.EVENT.OUT);
        this.mp.release();
        startActivity(intent2);
    }
}
