package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;

/* access modifiers changed from: package-private */
public class zzcv {
    static void zza(Context context, String str, String str2, String str3) {
        SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
        edit.putString(str2, str3);
        zza(edit);
    }

    static void zza(final SharedPreferences.Editor editor) {
        if (Build.VERSION.SDK_INT >= 9) {
            editor.apply();
        } else {
            new Thread(new Runnable() {
                /* class com.google.android.gms.tagmanager.zzcv.AnonymousClass1 */

                public void run() {
                    editor.commit();
                }
            }).start();
        }
    }
}
