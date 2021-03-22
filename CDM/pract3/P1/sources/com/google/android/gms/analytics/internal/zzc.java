package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzlb;
import com.google.android.gms.internal.zzns;

public class zzc {
    private final zzf zzJy;

    protected zzc(zzf zzf) {
        zzu.zzu(zzf);
        this.zzJy = zzf;
    }

    private void zza(int i, String str, Object obj, Object obj2, Object obj3) {
        zzaf zzaf = null;
        if (this.zzJy != null) {
            zzaf = this.zzJy.zzid();
        }
        if (zzaf != null) {
            zzaf.zza(i, str, obj, obj2, obj3);
            return;
        }
        String str2 = zzy.zzLb.get();
        if (Log.isLoggable(str2, i)) {
            Log.println(i, str2, zzc(str, obj, obj2, obj3));
        }
    }

    protected static String zzc(String str, Object obj, Object obj2, Object obj3) {
        if (str == null) {
            str = "";
        }
        String zzi = zzi(obj);
        String zzi2 = zzi(obj2);
        String zzi3 = zzi(obj3);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        if (!TextUtils.isEmpty(zzi)) {
            sb.append(str2);
            sb.append(zzi);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(zzi2)) {
            sb.append(str2);
            sb.append(zzi2);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(zzi3)) {
            sb.append(str2);
            sb.append(zzi3);
        }
        return sb.toString();
    }

    private static String zzi(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof Boolean)) {
            return obj instanceof Throwable ? ((Throwable) obj).toString() : obj.toString();
        }
        return obj == Boolean.TRUE ? "true" : "false";
    }

    /* access modifiers changed from: protected */
    public Context getContext() {
        return this.zzJy.getContext();
    }

    public void zza(String str, Object obj) {
        zza(2, str, obj, null, null);
    }

    public void zza(String str, Object obj, Object obj2) {
        zza(2, str, obj, obj2, null);
    }

    public void zza(String str, Object obj, Object obj2, Object obj3) {
        zza(3, str, obj, obj2, obj3);
    }

    public void zzaT(String str) {
        zza(2, str, null, null, null);
    }

    public void zzaU(String str) {
        zza(3, str, null, null, null);
    }

    public void zzaV(String str) {
        zza(4, str, null, null, null);
    }

    public void zzaW(String str) {
        zza(5, str, null, null, null);
    }

    public void zzaX(String str) {
        zza(6, str, null, null, null);
    }

    public void zzb(String str, Object obj) {
        zza(3, str, obj, null, null);
    }

    public void zzb(String str, Object obj, Object obj2) {
        zza(3, str, obj, obj2, null);
    }

    public void zzb(String str, Object obj, Object obj2, Object obj3) {
        zza(5, str, obj, obj2, obj3);
    }

    public void zzc(String str, Object obj) {
        zza(4, str, obj, null, null);
    }

    public void zzc(String str, Object obj, Object obj2) {
        zza(5, str, obj, obj2, null);
    }

    public void zzd(String str, Object obj) {
        zza(5, str, obj, null, null);
    }

    public void zzd(String str, Object obj, Object obj2) {
        zza(6, str, obj, obj2, null);
    }

    public void zze(String str, Object obj) {
        zza(6, str, obj, null, null);
    }

    public zzf zzhM() {
        return this.zzJy;
    }

    /* access modifiers changed from: protected */
    public void zzhN() {
        if (zzhR().zziW()) {
            throw new IllegalStateException("Call only supported on the client side");
        }
    }

    /* access modifiers changed from: protected */
    public void zzhO() {
        this.zzJy.zzhO();
    }

    /* access modifiers changed from: protected */
    public zzlb zzhP() {
        return this.zzJy.zzhP();
    }

    /* access modifiers changed from: protected */
    public zzaf zzhQ() {
        return this.zzJy.zzhQ();
    }

    /* access modifiers changed from: protected */
    public zzr zzhR() {
        return this.zzJy.zzhR();
    }

    /* access modifiers changed from: protected */
    public zzns zzhS() {
        return this.zzJy.zzhS();
    }

    /* access modifiers changed from: protected */
    public zzv zzhT() {
        return this.zzJy.zzhT();
    }

    /* access modifiers changed from: protected */
    public zzai zzhU() {
        return this.zzJy.zzhU();
    }

    /* access modifiers changed from: protected */
    public zzn zzhV() {
        return this.zzJy.zzih();
    }

    /* access modifiers changed from: protected */
    public zza zzhW() {
        return this.zzJy.zzig();
    }

    /* access modifiers changed from: protected */
    public zzk zzhX() {
        return this.zzJy.zzhX();
    }

    /* access modifiers changed from: protected */
    public zzu zzhY() {
        return this.zzJy.zzhY();
    }

    public boolean zzhZ() {
        return Log.isLoggable(zzy.zzLb.get(), 2);
    }

    public GoogleAnalytics zzhg() {
        return this.zzJy.zzie();
    }

    /* access modifiers changed from: protected */
    public zzb zzhl() {
        return this.zzJy.zzhl();
    }

    /* access modifiers changed from: protected */
    public zzan zzhm() {
        return this.zzJy.zzhm();
    }
}
