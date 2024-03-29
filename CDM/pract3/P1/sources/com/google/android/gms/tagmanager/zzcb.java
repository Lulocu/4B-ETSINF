package com.google.android.gms.tagmanager;

import android.net.Uri;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/* access modifiers changed from: package-private */
public class zzcb {
    private static zzcb zzaME;
    private volatile String zzaKy;
    private volatile zza zzaMF;
    private volatile String zzaMG;
    private volatile String zzaMH;

    /* access modifiers changed from: package-private */
    public enum zza {
        NONE,
        CONTAINER,
        CONTAINER_DEBUG
    }

    zzcb() {
        clear();
    }

    private String zzeA(String str) {
        return str.split("&")[0].split("=")[1];
    }

    private String zzm(Uri uri) {
        return uri.getQuery().replace("&gtm_debug=x", "");
    }

    static zzcb zzzf() {
        zzcb zzcb;
        synchronized (zzcb.class) {
            if (zzaME == null) {
                zzaME = new zzcb();
            }
            zzcb = zzaME;
        }
        return zzcb;
    }

    /* access modifiers changed from: package-private */
    public void clear() {
        this.zzaMF = zza.NONE;
        this.zzaMG = null;
        this.zzaKy = null;
        this.zzaMH = null;
    }

    /* access modifiers changed from: package-private */
    public String getContainerId() {
        return this.zzaKy;
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean zzl(Uri uri) {
        boolean z = true;
        synchronized (this) {
            try {
                String decode = URLDecoder.decode(uri.toString(), "UTF-8");
                if (decode.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_auth=\\S+&gtm_preview=\\d+(&gtm_debug=x)?$")) {
                    zzbg.zzaB("Container preview url: " + decode);
                    if (decode.matches(".*?&gtm_debug=x$")) {
                        this.zzaMF = zza.CONTAINER_DEBUG;
                    } else {
                        this.zzaMF = zza.CONTAINER;
                    }
                    this.zzaMH = zzm(uri);
                    if (this.zzaMF == zza.CONTAINER || this.zzaMF == zza.CONTAINER_DEBUG) {
                        this.zzaMG = "/r?" + this.zzaMH;
                    }
                    this.zzaKy = zzeA(this.zzaMH);
                } else if (!decode.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_preview=$")) {
                    zzbg.zzaC("Invalid preview uri: " + decode);
                    z = false;
                } else if (zzeA(uri.getQuery()).equals(this.zzaKy)) {
                    zzbg.zzaB("Exit preview mode for container: " + this.zzaKy);
                    this.zzaMF = zza.NONE;
                    this.zzaMG = null;
                } else {
                    z = false;
                }
            } catch (UnsupportedEncodingException e) {
                z = false;
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public zza zzzg() {
        return this.zzaMF;
    }

    /* access modifiers changed from: package-private */
    public String zzzh() {
        return this.zzaMG;
    }
}
