package es.upv.cdm.jcruizg.ctf.utilidad;

import android.content.Context;
import android.util.Log;
import android.widget.TextView;
import es.upv.cdm.jcruizg.ctf.R;
import es.upv.cdm.jcruizg.ctf.utilidad.informefinal.WatchDog;

public class Pistas {
    public static String pista1;
    public static String pista2;
    public static String pista3;
    public static String pista4;
    public static String pista5;
    public static String pista6;

    public static void inicializa(Context context) {
        pista1 = context.getResources().getString(R.string.pista1);
        pista2 = context.getResources().getString(R.string.pista2);
        pista3 = context.getResources().getString(R.string.pista3);
        pista4 = context.getResources().getString(R.string.pista4);
        pista5 = context.getResources().getString(R.string.pista5);
        pista6 = context.getResources().getString(R.string.pista6);
    }

    public static void _1() {
        WatchDog.addTraza(WatchDog.CLASS.Pistas, WatchDog.EVENT.PISTA_1);
        Log.i("[PISTA_1]", pista1);
    }

    public static void _2() {
        WatchDog.addTraza(WatchDog.CLASS.Pistas, WatchDog.EVENT.PISTA_2);
        Log.i("[PISTA_2]", pista2);
    }

    public static void _3() {
        WatchDog.addTraza(WatchDog.CLASS.Pistas, WatchDog.EVENT.PISTA_3);
        Log.i("[PISTA_3]", pista3);
    }

    public static void _4() {
        WatchDog.addTraza(WatchDog.CLASS.Pistas, WatchDog.EVENT.PISTA_4);
        Log.i("[PISTA_4]", pista4);
    }

    public static void _5(TextView textView) {
        WatchDog.addTraza(WatchDog.CLASS.Pistas, WatchDog.EVENT.PISTA_5);
        textView.setText(pista5);
    }

    public static void _6(TextView textView) {
        WatchDog.addTraza(WatchDog.CLASS.Pistas, WatchDog.EVENT.PISTA_6);
        textView.setText(pista6);
    }
}
