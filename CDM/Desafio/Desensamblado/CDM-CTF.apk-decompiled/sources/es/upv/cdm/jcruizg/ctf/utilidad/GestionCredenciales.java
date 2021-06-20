package es.upv.cdm.jcruizg.ctf.utilidad;

import android.content.Context;
import android.content.res.Resources;
import es.upv.cdm.jcruizg.ctf.utilidad.cifracesar.Cifras;
import es.upv.cdm.jcruizg.ctf.utilidad.informefinal.WatchDog;
import java.util.StringTokenizer;

public class GestionCredenciales {
    private Context ctx;
    private String password;
    private Resources res;
    private String user;

    public GestionCredenciales(Context context) {
        this.res = null;
        this.user = null;
        this.password = null;
        this.res = Resources.getSystem();
        this.ctx = context;
        InitializeCredentials();
    }

    private void InitializeCredentials() {
        procesaCredenciales();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002c A[SYNTHETIC, Splitter:B:13:0x002c] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void procesaCredenciales() {
        /*
            r6 = this;
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0030, all -> 0x0026 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0030, all -> 0x0026 }
            android.content.Context r3 = r6.ctx     // Catch:{ IOException -> 0x0030, all -> 0x0026 }
            android.content.res.AssetManager r3 = r3.getAssets()     // Catch:{ IOException -> 0x0030, all -> 0x0026 }
            java.lang.String r4 = "credentials"
            java.io.InputStream r3 = r3.open(r4)     // Catch:{ IOException -> 0x0030, all -> 0x0026 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0030, all -> 0x0026 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0030, all -> 0x0026 }
            java.lang.String r0 = r1.readLine()     // Catch:{ IOException -> 0x0024, all -> 0x0022 }
            r6.processLine(r0)     // Catch:{ IOException -> 0x0024, all -> 0x0022 }
            r1.close()     // Catch:{ IOException -> 0x0036 }
            goto L_0x0036
        L_0x0022:
            r0 = move-exception
            goto L_0x002a
        L_0x0024:
            r0 = r1
            goto L_0x0031
        L_0x0026:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L_0x002a:
            if (r1 == 0) goto L_0x002f
            r1.close()     // Catch:{ IOException -> 0x002f }
        L_0x002f:
            throw r0
        L_0x0030:
        L_0x0031:
            if (r0 == 0) goto L_0x0036
            r0.close()
        L_0x0036:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: es.upv.cdm.jcruizg.ctf.utilidad.GestionCredenciales.procesaCredenciales():void");
    }

    private void processLine(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, "&");
        this.user = stringTokenizer.nextToken();
        this.password = stringTokenizer.nextToken();
    }

    public String getString(int i) {
        return this.res.getString(i);
    }

    public boolean checkUser(String str) {
        if (str == null) {
            WatchDog.addTraza(WatchDog.CLASS.GestorCredenciales, WatchDog.EVENT.USUARIO_KO);
        } else if (this.user.equals(Cifras.cifradoU.encode(str))) {
            WatchDog.addTraza(WatchDog.CLASS.GestorCredenciales, WatchDog.EVENT.USUARIO_OK);
            return true;
        }
        return false;
    }

    public boolean checkPassword(String str) {
        if (str == null) {
            WatchDog.addTraza(WatchDog.CLASS.GestorCredenciales, WatchDog.EVENT.f2CONTRASEA_KO);
        } else if (this.password.equals(Cifras.cifradoP.encode(str))) {
            WatchDog.addTraza(WatchDog.CLASS.GestorCredenciales, WatchDog.EVENT.f3CONTRASEA_OK);
            return true;
        }
        return false;
    }

    public boolean checkCredentials(String str, String str2) {
        boolean checkUser = checkUser(str);
        boolean checkPassword = checkPassword(str2);
        if (!checkUser) {
            if (!checkPassword) {
                Pistas._1();
                return false;
            }
            Pistas._3();
            return false;
        } else if (!checkPassword) {
            Pistas._2();
            return false;
        } else {
            Pistas._4();
            return true;
        }
    }
}
