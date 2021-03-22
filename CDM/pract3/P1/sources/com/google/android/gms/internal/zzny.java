package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.HashMap;

public final class zzny extends zznq<zzny> {
    private String mName;
    private String zzKI;
    private String zzaEA;
    private String zzaEB;
    private String zzaEC;
    private String zzaED;
    private String zzaEy;
    private String zzaEz;
    private String zzazL;
    private String zzuU;

    public String getContent() {
        return this.zzuU;
    }

    public String getId() {
        return this.zzKI;
    }

    public String getName() {
        return this.mName;
    }

    public String getSource() {
        return this.zzazL;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("name", this.mName);
        hashMap.put("source", this.zzazL);
        hashMap.put("medium", this.zzaEy);
        hashMap.put("keyword", this.zzaEz);
        hashMap.put("content", this.zzuU);
        hashMap.put("id", this.zzKI);
        hashMap.put("adNetworkId", this.zzaEA);
        hashMap.put("gclid", this.zzaEB);
        hashMap.put("dclid", this.zzaEC);
        hashMap.put("aclid", this.zzaED);
        return zzy(hashMap);
    }

    public void zza(zzny zzny) {
        if (!TextUtils.isEmpty(this.mName)) {
            zzny.setName(this.mName);
        }
        if (!TextUtils.isEmpty(this.zzazL)) {
            zzny.zzdx(this.zzazL);
        }
        if (!TextUtils.isEmpty(this.zzaEy)) {
            zzny.zzdy(this.zzaEy);
        }
        if (!TextUtils.isEmpty(this.zzaEz)) {
            zzny.zzdz(this.zzaEz);
        }
        if (!TextUtils.isEmpty(this.zzuU)) {
            zzny.zzdA(this.zzuU);
        }
        if (!TextUtils.isEmpty(this.zzKI)) {
            zzny.zzdB(this.zzKI);
        }
        if (!TextUtils.isEmpty(this.zzaEA)) {
            zzny.zzdC(this.zzaEA);
        }
        if (!TextUtils.isEmpty(this.zzaEB)) {
            zzny.zzdD(this.zzaEB);
        }
        if (!TextUtils.isEmpty(this.zzaEC)) {
            zzny.zzdE(this.zzaEC);
        }
        if (!TextUtils.isEmpty(this.zzaED)) {
            zzny.zzdF(this.zzaED);
        }
    }

    public void zzdA(String str) {
        this.zzuU = str;
    }

    public void zzdB(String str) {
        this.zzKI = str;
    }

    public void zzdC(String str) {
        this.zzaEA = str;
    }

    public void zzdD(String str) {
        this.zzaEB = str;
    }

    public void zzdE(String str) {
        this.zzaEC = str;
    }

    public void zzdF(String str) {
        this.zzaED = str;
    }

    public void zzdx(String str) {
        this.zzazL = str;
    }

    public void zzdy(String str) {
        this.zzaEy = str;
    }

    public void zzdz(String str) {
        this.zzaEz = str;
    }

    public String zzwj() {
        return this.zzaEy;
    }

    public String zzwk() {
        return this.zzaEz;
    }

    public String zzwl() {
        return this.zzaEA;
    }

    public String zzwm() {
        return this.zzaEB;
    }

    public String zzwn() {
        return this.zzaEC;
    }

    public String zzwo() {
        return this.zzaED;
    }
}
