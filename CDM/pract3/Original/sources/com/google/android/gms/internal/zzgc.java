package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.LinkedList;

@zzgd
public class zzgc implements Thread.UncaughtExceptionHandler {
    private Context mContext;
    private Thread.UncaughtExceptionHandler zzCa;
    private Thread.UncaughtExceptionHandler zzCb;
    private VersionInfoParcel zzCc;

    public zzgc(Context context, VersionInfoParcel versionInfoParcel, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread.UncaughtExceptionHandler uncaughtExceptionHandler2) {
        this.zzCa = uncaughtExceptionHandler;
        this.zzCb = uncaughtExceptionHandler2;
        this.mContext = context;
        this.zzCc = versionInfoParcel;
    }

    public static zzgc zza(Context context, Thread thread, VersionInfoParcel versionInfoParcel) {
        if (context == null || thread == null || versionInfoParcel == null) {
            return null;
        }
        if (!zzz(context)) {
            return null;
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = thread.getUncaughtExceptionHandler();
        zzgc zzgc = new zzgc(context, versionInfoParcel, uncaughtExceptionHandler, Thread.getDefaultUncaughtExceptionHandler());
        if (uncaughtExceptionHandler != null && (uncaughtExceptionHandler instanceof zzgc)) {
            return (zzgc) uncaughtExceptionHandler;
        }
        try {
            thread.setUncaughtExceptionHandler(zzgc);
            return zzgc;
        } catch (SecurityException e) {
            zzb.zzc("Fail to set UncaughtExceptionHandler.", e);
            return null;
        }
    }

    private Throwable zzb(Throwable th) {
        Throwable th2;
        if (zzbz.zztH.get().booleanValue()) {
            return th;
        }
        LinkedList linkedList = new LinkedList();
        while (th != null) {
            linkedList.push(th);
            th = th.getCause();
        }
        Throwable th3 = null;
        while (!linkedList.isEmpty()) {
            Throwable th4 = (Throwable) linkedList.pop();
            StackTraceElement[] stackTrace = th4.getStackTrace();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new StackTraceElement(th4.getClass().getName(), "<filtered>", "<filtered>", 1));
            boolean z = false;
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (zzal(stackTraceElement.getClassName())) {
                    arrayList.add(stackTraceElement);
                    z = true;
                } else if (zzam(stackTraceElement.getClassName())) {
                    arrayList.add(stackTraceElement);
                } else {
                    arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                }
            }
            if (z) {
                th2 = th3 == null ? new Throwable(th4.getMessage()) : new Throwable(th4.getMessage(), th3);
                th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            } else {
                th2 = th3;
            }
            th3 = th2;
        }
        return th3;
    }

    private static boolean zzz(Context context) {
        return zzbz.zztG.get().booleanValue();
    }

    public void uncaughtException(Thread thread, Throwable exception) {
        if (zza(exception)) {
            if (Looper.getMainLooper().getThread() != thread) {
                zza(exception, true);
                return;
            }
            zza(exception, false);
        }
        if (this.zzCa != null) {
            this.zzCa.uncaughtException(thread, exception);
        } else if (this.zzCb != null) {
            this.zzCb.uncaughtException(thread, exception);
        }
    }

    public void zza(Throwable th, boolean z) {
        Throwable zzb;
        if (zzz(this.mContext) && (zzb = zzb(th)) != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(zzb(zzb, z));
            zzo.zzbv().zza(this.mContext, this.zzCc.zzGG, arrayList, zzo.zzby().zzgb());
        }
    }

    /* access modifiers changed from: protected */
    public boolean zza(Throwable th) {
        boolean z = true;
        if (th == null) {
            return false;
        }
        boolean z2 = false;
        boolean z3 = false;
        while (th != null) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (zzal(stackTraceElement.getClassName())) {
                    z3 = true;
                }
                if (getClass().getName().equals(stackTraceElement.getClassName())) {
                    z2 = true;
                }
            }
            th = th.getCause();
        }
        if (!z3 || z2) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public boolean zzal(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith("com.google.android.gms.ads")) {
            return true;
        }
        if (str.startsWith("com.google.ads")) {
            return true;
        }
        try {
            return Class.forName(str).isAnnotationPresent(zzgd.class);
        } catch (Exception e) {
            zzb.zza("Fail to check class type for class " + str, e);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean zzam(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("android.") || str.startsWith("java.");
    }

    /* access modifiers changed from: package-private */
    public String zzb(Throwable th, boolean z) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT)).appendQueryParameter("device", zzo.zzbv().zzgo()).appendQueryParameter("js", this.zzCc.zzGG).appendQueryParameter("appid", this.mContext.getApplicationContext().getPackageName()).appendQueryParameter("stacktrace", stringWriter.toString()).appendQueryParameter("eids", TextUtils.join(",", zzbz.zzdb())).appendQueryParameter("trapped", String.valueOf(z)).toString();
    }
}
