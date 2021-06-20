package es.upv.cdm.jcruizg.ctf.actividades;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.support.v4.content.FileProvider;
import android.support.v7.app.AppCompatActivity;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import es.upv.cdm.jcruizg.ctf.R;
import es.upv.cdm.jcruizg.ctf.utilidad.cifracesar.CifraCesar;
import es.upv.cdm.jcruizg.ctf.utilidad.cifracesar.TipoCifra;
import es.upv.cdm.jcruizg.ctf.utilidad.informefinal.RSAUtil;
import es.upv.cdm.jcruizg.ctf.utilidad.informefinal.SHA256;
import es.upv.cdm.jcruizg.ctf.utilidad.informefinal.WatchDog;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Solucion extends AppCompatActivity {
    Respuesta respuesta = new Respuesta();
    ViewHolder vh = new ViewHolder();

    /* access modifiers changed from: package-private */
    public class Respuesta {
        String androidID = null;
        String bandera = null;
        String password = null;
        String user = null;

        Respuesta() {
        }
    }

    class ViewHolder {
        TextView bandera = null;
        TextView password = null;
        TextView user = null;

        ViewHolder() {
        }
    }

    /* access modifiers changed from: package-private */
    public String getFileName(Respuesta respuesta2) {
        return respuesta2.androidID + "-" + new SimpleDateFormat("yyyy_MMMM_d_hh-mm").format(new Date()) + "-TrazaCTF.jcc";
    }

    /* access modifiers changed from: package-private */
    public File workingDirectory() {
        if (Build.VERSION.SDK_INT >= 24) {
            return getFilesDir();
        }
        return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x006a, code lost:
        if (r7 == false) goto L_0x006c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009b  */
    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.SupportActivity, android.support.v4.app.FragmentActivity
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r7) {
        /*
        // Method dump skipped, instructions count: 180
        */
        throw new UnsupportedOperationException("Method not decompiled: es.upv.cdm.jcruizg.ctf.actividades.Solucion.onCreate(android.os.Bundle):void");
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void procesaRespuesta() {
        generaInforme();
        notificaInformeGenerado();
    }

    private void generaInforme() {
        String str;
        try {
            WatchDog.addTraza(WatchDog.CLASS.Solucion, WatchDog.EVENT.SOLUCION, Base64.encodeToString(RSAUtil.encrypt(this.respuesta.user), 2) + WatchDog.SEPARADOR_PARTES + Base64.encodeToString(RSAUtil.encrypt(this.respuesta.password), 2) + WatchDog.SEPARADOR_PARTES + Base64.encodeToString(RSAUtil.encrypt(this.respuesta.bandera), 2) + WatchDog.SEPARADOR_PARTES + Base64.encodeToString(RSAUtil.encrypt(this.respuesta.androidID), 2));
        } catch (Exception e) {
            Log.e("Error Cifrando UCBI", e.toString());
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(WatchDog.traza.toString());
        Log.i("TRAZA:", stringBuffer.toString());
        String str2 = null;
        try {
            str = SHA256.computeHash(stringBuffer.toString());
        } catch (Exception unused) {
            str = null;
        }
        try {
            str2 = Base64.encodeToString(RSAUtil.encrypt(str), 2);
        } catch (Exception e2) {
            Log.e("Error Cifrando digest", e2.toString());
        }
        stringBuffer.append(str2);
        String encode = CifraCesar.nueva(TipoCifra.ROT47).encode(stringBuffer.toString());
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(openFileOutput(getFileName(this.respuesta), 0));
            outputStreamWriter.write(encode);
            outputStreamWriter.close();
        } catch (Exception unused2) {
            Log.i("Ficheros", "Error al escribir el fichero de informe en memoria interna");
        }
    }

    private void notificaInformeGenerado() {
        TextView textView = (TextView) findViewById(R.id.tvInforme);
        textView.setText(getFileName(this.respuesta) + getResources().getString(R.string.txtInstFinal));
        textView.setVisibility(0);
        ((TextView) findViewById(R.id.btnEmail)).setVisibility(0);
        Toast makeText = Toast.makeText(this, "Fichero de traza generado con éxito", 1);
        LinearLayout linearLayout = (LinearLayout) makeText.getView();
        if (linearLayout.getChildCount() > 0) {
            ((TextView) linearLayout.getChildAt(0)).setGravity(17);
        }
        makeText.show();
    }

    @Override // android.support.v4.app.FragmentActivity
    public void onBackPressed() {
        super.onBackPressed();
        finishAffinity();
    }

    /* access modifiers changed from: protected */
    @Override // android.support.v4.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    public void writeToExternal(Context context, String str) {
        try {
            File file = new File(context.getExternalFilesDir(null), getFileName(this.respuesta));
            FileInputStream fileInputStream = new FileInputStream(context.getFilesDir() + File.separator + getFileName(this.respuesta));
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[fileInputStream.available()];
            Log.i("Available ", fileInputStream.available() + "");
            Log.i("Result", fileInputStream.read(bArr) + "");
            fileOutputStream.write(bArr);
            fileInputStream.close();
            fileOutputStream.close();
            Log.i("Copying to", "" + context.getExternalFilesDir(null) + File.separator + str);
            Log.i("Copying from", context.getFilesDir() + File.separator + str + "");
        } catch (Exception e) {
            Toast.makeText(context, "File write failed: " + e.getLocalizedMessage(), 1).show();
        }
    }

    public void enviaEmail(View view) {
        Uri uri;
        try {
            File file = new File(getFilesDir(), getFileName(this.respuesta));
            new String[]{"jcruizg@disca.upv.es"};
            if (Build.VERSION.SDK_INT >= 24) {
                uri = FileProvider.getUriForFile(getApplicationContext(), getPackageName() + ".provider", file);
            } else {
                writeToExternal(this, getFileName(this.respuesta));
                uri = Uri.fromFile(new File(getExternalFilesDir(null), getFileName(this.respuesta)));
                Log.i("CDM-Info", file.getAbsolutePath());
            }
            Intent intent = new Intent("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.SUBJECT", "Resultado CTF: " + getFileName(this.respuesta));
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", "Adjunto a este mensaje tu fichero de traza.\nDebe formar parte de la memoria del proyecto que subas a PoliformaT.\nSaludos,\nJuan Carlos");
            intent.addFlags(1);
            intent.addFlags(2);
            intent.putExtra("android.intent.extra.STREAM", uri);
            Log.i("CDM-URI:", file.getAbsolutePath());
            try {
                startActivityForResult(Intent.createChooser(intent, "Enviando TrazaCTF.jcc por email..."), 0);
            } catch (ActivityNotFoundException unused) {
                Toast makeText = Toast.makeText(this, "No tienes ningún cliente de email operativo.", 0);
                LinearLayout linearLayout = (LinearLayout) makeText.getView();
                if (linearLayout.getChildCount() > 0) {
                    ((TextView) linearLayout.getChildAt(0)).setGravity(17);
                }
                makeText.show();
            }
        } catch (Exception e) {
            Log.e("CDM-Emailing", "excepción", e);
            Toast makeText2 = Toast.makeText(this, "El email no se ha podido enviar. Consulta el log de la app para más información", 1);
            LinearLayout linearLayout2 = (LinearLayout) makeText2.getView();
            if (linearLayout2.getChildCount() > 0) {
                ((TextView) linearLayout2.getChildAt(0)).setGravity(17);
            }
            makeText2.show();
        }
    }
}
