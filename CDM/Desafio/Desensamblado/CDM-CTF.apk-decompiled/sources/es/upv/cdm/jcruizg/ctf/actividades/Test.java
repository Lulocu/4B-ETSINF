package es.upv.cdm.jcruizg.ctf.actividades;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import es.upv.cdm.jcruizg.ctf.R;
import es.upv.cdm.jcruizg.ctf.utilidad.cifracesar.CifraCesar;
import es.upv.cdm.jcruizg.ctf.utilidad.cifracesar.Cifras;
import es.upv.cdm.jcruizg.ctf.utilidad.cifracesar.ROT;
import es.upv.cdm.jcruizg.ctf.utilidad.informefinal.WatchDog;

public class Test extends AppCompatActivity {
    int tipoCifra = 3;

    /* access modifiers changed from: protected */
    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.SupportActivity, android.support.v4.app.FragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_test);
        WatchDog.addTraza(WatchDog.CLASS.Test, WatchDog.EVENT.IN);
        ((Button) findViewById(R.id.btnCiDe)).setOnClickListener(new View.OnClickListener() {
            /* class es.upv.cdm.jcruizg.ctf.actividades.Test.AnonymousClass1 */

            public void onClick(View view) {
                TextView textView = (TextView) Test.this.findViewById(R.id.tvMsgCiDe);
                String obj = ((EditText) Test.this.findViewById(R.id.etMsgCiDe)).getText().toString();
                ROT nueva = CifraCesar.nueva((String) ((Spinner) Test.this.findViewById(R.id.spCifras)).getSelectedItem());
                WatchDog.addTraza(WatchDog.CLASS.Test, WatchDog.EVENT.CIDE_ACTIVADO);
                if (obj.contains(Cifras.cifradoB.encode("q2?56C2"))) {
                    WatchDog.addTraza(WatchDog.CLASS.Test, WatchDog.EVENT.BANDERA_ENCONTRADA);
                    textView.setText(Cifras.cifradoB.decode("rs|0a0p{{"));
                } else if (nueva != null) {
                    textView.setText(nueva.encode(obj));
                }
            }
        });
    }
}
