package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.zzu;
import java.util.HashMap;

public final class zzip extends zznq<zzip> {
    private String zzEO;
    private String zzJc;
    private String zzJd;
    private String zzJe;
    private boolean zzJf;
    private String zzJg;
    private boolean zzJh;
    private double zzJi;

    public String getClientId() {
        return this.zzJd;
    }

    public String getUserId() {
        return this.zzEO;
    }

    public void setClientId(String clientId) {
        this.zzJd = clientId;
    }

    public void setSampleRate(double percentage) {
        zzu.zzb(percentage >= 0.0d && percentage <= 100.0d, "Sample rate must be between 0% and 100%");
        this.zzJi = percentage;
    }

    public void setUserId(String userId) {
        this.zzEO = userId;
    }

    public String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("hitType", this.zzJc);
        hashMap.put("clientId", this.zzJd);
        hashMap.put("userId", this.zzEO);
        hashMap.put("androidAdId", this.zzJe);
        hashMap.put("AdTargetingEnabled", Boolean.valueOf(this.zzJf));
        hashMap.put("sessionControl", this.zzJg);
        hashMap.put("nonInteraction", Boolean.valueOf(this.zzJh));
        hashMap.put("sampleRate", Double.valueOf(this.zzJi));
        return zzy(hashMap);
    }

    public void zzE(boolean z) {
        this.zzJf = z;
    }

    public void zzF(boolean z) {
        this.zzJh = z;
    }

    public void zza(zzip zzip) {
        if (!TextUtils.isEmpty(this.zzJc)) {
            zzip.zzaN(this.zzJc);
        }
        if (!TextUtils.isEmpty(this.zzJd)) {
            zzip.setClientId(this.zzJd);
        }
        if (!TextUtils.isEmpty(this.zzEO)) {
            zzip.setUserId(this.zzEO);
        }
        if (!TextUtils.isEmpty(this.zzJe)) {
            zzip.zzaO(this.zzJe);
        }
        if (this.zzJf) {
            zzip.zzE(true);
        }
        if (!TextUtils.isEmpty(this.zzJg)) {
            zzip.zzaP(this.zzJg);
        }
        if (this.zzJh) {
            zzip.zzF(this.zzJh);
        }
        if (this.zzJi != 0.0d) {
            zzip.setSampleRate(this.zzJi);
        }
    }

    public void zzaN(String str) {
        this.zzJc = str;
    }

    public void zzaO(String str) {
        this.zzJe = str;
    }

    public void zzaP(String str) {
        this.zzJg = str;
    }

    public boolean zzhA() {
        return this.zzJh;
    }

    public double zzhB() {
        return this.zzJi;
    }

    public String zzhw() {
        return this.zzJc;
    }

    public String zzhx() {
        return this.zzJe;
    }

    public boolean zzhy() {
        return this.zzJf;
    }

    public String zzhz() {
        return this.zzJg;
    }
}
