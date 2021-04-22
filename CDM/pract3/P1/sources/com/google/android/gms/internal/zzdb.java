package com.google.android.gms.internal;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.internal.zzcw;

@zzgd
public class zzdb extends zzcw.zza {
    private final NativeCustomTemplateAd.OnCustomClickListener zzvS;

    public zzdb(NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
        this.zzvS = onCustomClickListener;
    }

    @Override // com.google.android.gms.internal.zzcw
    public void zza(zzcs zzcs, String str) {
        this.zzvS.onCustomClick(new zzct(zzcs), str);
    }
}
