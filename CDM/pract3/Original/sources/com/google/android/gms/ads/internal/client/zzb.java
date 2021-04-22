package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.internal.zzgd;

@zzgd
public final class zzb extends zzm.zza {
    private final zza zzrU;

    public zzb(zza zza) {
        this.zzrU = zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzm
    public void onAdClicked() {
        this.zzrU.onAdClicked();
    }
}
