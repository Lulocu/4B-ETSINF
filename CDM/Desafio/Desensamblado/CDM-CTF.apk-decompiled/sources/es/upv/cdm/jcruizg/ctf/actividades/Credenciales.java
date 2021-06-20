package es.upv.cdm.jcruizg.ctf.actividades;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import es.upv.cdm.jcruizg.ctf.R;
import es.upv.cdm.jcruizg.ctf.utilidad.GestionCredenciales;
import es.upv.cdm.jcruizg.ctf.utilidad.informefinal.WatchDog;

public class Credenciales extends AppCompatActivity {
    GestionCredenciales cm = null;
    int numClicks = 0;
    private ProgressDialog progressDialog;
    ViewHolder vh = null;

    /* access modifiers changed from: private */
    public class ViewHolder {
        private EditText etContrasenya = null;
        private EditText etUsuario = null;
        private ImageView ivResultado = null;

        ViewHolder(int i, int i2, int i3) {
            this.etUsuario = (EditText) Credenciales.this.findViewById(i);
            this.etContrasenya = (EditText) Credenciales.this.findViewById(i2);
            this.ivResultado = (ImageView) Credenciales.this.findViewById(i3);
        }

        public EditText getEtUsuario() {
            return this.etUsuario;
        }

        public EditText getEtContrasenya() {
            return this.etContrasenya;
        }

        public ImageView getIvResultado() {
            return this.ivResultado;
        }
    }

    public ViewHolder datosIntroducidos() {
        return this.vh;
    }

    /* access modifiers changed from: protected */
    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.SupportActivity, android.support.v4.app.FragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_credentials);
        WatchDog.addTraza(WatchDog.CLASS.Credenciales, WatchDog.EVENT.IN);
        this.progressDialog = new ProgressDialog(this);
        this.cm = new GestionCredenciales(this);
        ViewHolder viewHolder = new ViewHolder(R.id.etUserSol, R.id.etPasswordSol, R.id.ivCesar);
        this.vh = viewHolder;
        viewHolder.getIvResultado().setVisibility(4);
        this.vh.getIvResultado().setOnClickListener(new View.OnClickListener() {
            /* class es.upv.cdm.jcruizg.ctf.actividades.Credenciales.AnonymousClass1 */

            public void onClick(View view) {
                if (Credenciales.this.numClicks == 0) {
                    new CountDownTimer(6000, 500) {
                        /* class es.upv.cdm.jcruizg.ctf.actividades.Credenciales.AnonymousClass1.AnonymousClass1 */
                        private int oldClicks = 0;

                        public void onTick(long j) {
                            if (this.oldClicks == Credenciales.this.numClicks) {
                                cancel();
                                processClicks();
                            }
                            this.oldClicks = Credenciales.this.numClicks;
                        }

                        public void onFinish() {
                            Credenciales.this.cambiaActividad();
                        }

                        private void processClicks() {
                            Credenciales.this.progressDialog.setMessage("Procesando...");
                            Credenciales.this.progressDialog.show();
                            new Handler().postDelayed(new Runnable() {
                                /* class es.upv.cdm.jcruizg.ctf.actividades.Credenciales.AnonymousClass1.AnonymousClass1.AnonymousClass1 */

                                public void run() {
                                    this.onFinish();
                                    Credenciales.this.progressDialog.dismiss();
                                }
                            }, 1000);
                        }
                    }.start();
                }
                Credenciales.this.numClicks++;
            }
        });
        findViewById(R.id.btnLogin).setOnClickListener(new View.OnClickListener() {
            /* class es.upv.cdm.jcruizg.ctf.actividades.Credenciales.AnonymousClass2 */

            public void onClick(View view) {
                Toast toast;
                String obj = Credenciales.this.vh.getEtUsuario().getText().toString();
                String obj2 = Credenciales.this.vh.getEtContrasenya().getText().toString();
                InputMethodManager inputMethodManager = (InputMethodManager) Credenciales.this.getSystemService("input_method");
                if (Credenciales.this.vh.etUsuario.hasFocus()) {
                    inputMethodManager.hideSoftInputFromWindow(Credenciales.this.vh.etUsuario.getWindowToken(), 0);
                }
                if (Credenciales.this.vh.etContrasenya.hasFocus()) {
                    inputMethodManager.hideSoftInputFromWindow(Credenciales.this.vh.etContrasenya.getWindowToken(), 0);
                }
                if (Credenciales.this.cm.checkCredentials(obj, obj2)) {
                    WatchDog.addTraza(WatchDog.CLASS.Credenciales, WatchDog.EVENT.CREDENTIALS_OK);
                    Credenciales.this.vh.getIvResultado().setImageResource(R.drawable.i123456789);
                    Credenciales.this.vh.getIvResultado().setTag(Integer.valueOf((int) R.drawable.i123456789));
                    toast = Toast.makeText(Credenciales.this.getApplicationContext(), "Las credenciales introducidas son correctas. Ahora DALE AL CÉSAR LO QUE ES DEL CÉSAR. ", 1);
                } else {
                    WatchDog.addTraza(WatchDog.CLASS.Credenciales, WatchDog.EVENT.CREDENTIALS_KO);
                    Credenciales.this.vh.getIvResultado().setImageResource(R.drawable.i0123456789);
                    Credenciales.this.vh.getIvResultado().setTag(Integer.valueOf((int) R.drawable.i0123456789));
                    toast = Toast.makeText(Credenciales.this.getApplicationContext(), "Las credenciales introducidas son incorrectas. Inténtalo de nuevo.", 1);
                }
                LinearLayout linearLayout = (LinearLayout) toast.getView();
                if (linearLayout.getChildCount() > 0) {
                    ((TextView) linearLayout.getChildAt(0)).setGravity(17);
                }
                toast.show();
                Credenciales.this.vh.getIvResultado().setVisibility(0);
            }
        });
        findViewById(R.id.btnCancel).setOnClickListener(new View.OnClickListener() {
            /* class es.upv.cdm.jcruizg.ctf.actividades.Credenciales.AnonymousClass3 */

            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Credenciales.this);
                TextView textView = new TextView(Credenciales.this);
                textView.setText(Html.fromHtml("<center>\n<p>.</p>\n<h2>No te rindas</h2>\n<p>Seguro que intentándolo un poco más lo consigues</p>\n<h2>¡¡¡ Ánimo !!!</h2></center>"));
                textView.setGravity(1);
                builder.setView(textView).setCancelable(false).setPositiveButton("Continuar", new DialogInterface.OnClickListener() {
                    /* class es.upv.cdm.jcruizg.ctf.actividades.Credenciales.AnonymousClass3.AnonymousClass1 */

                    public void onClick(DialogInterface dialogInterface, int i) {
                        Credenciales.this.finish();
                    }
                });
                builder.create().show();
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // android.support.v4.app.FragmentActivity
    public void onResume() {
        super.onResume();
        this.vh.getIvResultado().setImageResource(0);
        this.vh.getIvResultado().setVisibility(4);
        this.numClicks = 0;
    }

    private boolean credencialesOK() {
        if (this.vh.getIvResultado().getVisibility() != 4 && R.drawable.i123456789 == ((Integer) this.vh.getIvResultado().getTag()).intValue()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void cambiaActividad() {
        int i = this.numClicks;
        this.numClicks = 0;
        if (this.vh.getIvResultado().getVisibility() != 0) {
            return;
        }
        if (i == 18) {
            WatchDog.addTraza(WatchDog.CLASS.Credenciales, WatchDog.EVENT.BACKDOOR_FOUND);
            Intent intent = new Intent(getApplicationContext(), Mensaje.class);
            intent.putExtra("User", "324<5@@C0FD6C");
            intent.putExtra("Password", "324<5@@C0A2DDH@C5");
            intent.putExtra("BD", true);
            WatchDog.addTraza(WatchDog.CLASS.Credenciales, WatchDog.EVENT.OUT);
            startActivity(intent);
            return;
        }
        boolean credencialesOK = credencialesOK();
        if (i != 10 || !credencialesOK) {
            if (!(i == 10 || i == 18)) {
                WatchDog.addTraza(WatchDog.CLASS.Credenciales, WatchDog.EVENT.PULSACIONES_KO);
            }
            if (credencialesOK) {
                WatchDog.addTraza(WatchDog.CLASS.Credenciales, WatchDog.EVENT.CREDENTIALS_KO);
            }
            Intent intent2 = new Intent(getApplicationContext(), Informacion.class);
            if (credencialesOK) {
                intent2.putExtra("Cred", true);
            }
            WatchDog.addTraza(WatchDog.CLASS.Credenciales, WatchDog.EVENT.OUT);
            startActivity(intent2);
            return;
        }
        WatchDog.addTraza(WatchDog.CLASS.Credenciales, WatchDog.EVENT.PULSACIONES_OK);
        WatchDog.addTraza(WatchDog.CLASS.Credenciales, WatchDog.EVENT.CREDENTIALS_OK);
        Intent intent3 = new Intent(getApplicationContext(), Mensaje.class);
        intent3.putExtra("User", this.vh.etUsuario.getText().toString());
        intent3.putExtra("Password", this.vh.etContrasenya.getText().toString());
        intent3.putExtra("BD", false);
        WatchDog.addTraza(WatchDog.CLASS.Credenciales, WatchDog.EVENT.OUT);
        startActivity(intent3);
    }
}
