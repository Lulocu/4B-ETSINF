package com.google.android.gms.common.api;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.zza;
import com.google.android.gms.common.api.zzg;

public class zzd implements zzh {
    private final zzg zzWK;

    public zzd(zzg zzg) {
        this.zzWK = zzg;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.google.android.gms.common.api.zzg$zze<A extends com.google.android.gms.common.api.Api$Client> */
    /* JADX WARN: Multi-variable type inference failed */
    private <A extends Api.Client> void zza(zzg.zze<A> zze) throws DeadObjectException {
        this.zzWK.zzb(zze);
        Api.Client zza = this.zzWK.zza(zze.zzms());
        if (zza.isConnected() || !this.zzWK.zzXv.containsKey(zze.zzms())) {
            zze.zzb(zza);
        } else {
            zze.zzr(new Status(17));
        }
    }

    @Override // com.google.android.gms.common.api.zzh
    public void begin() {
        while (!this.zzWK.zzXo.isEmpty()) {
            try {
                zza(this.zzWK.zzXo.remove());
            } catch (DeadObjectException e) {
                Log.w("GoogleApiClientConnected", "Service died while flushing queue", e);
            }
        }
    }

    @Override // com.google.android.gms.common.api.zzh
    public void connect() {
    }

    @Override // com.google.android.gms.common.api.zzh
    public String getName() {
        return "CONNECTED";
    }

    @Override // com.google.android.gms.common.api.zzh
    public void onConnected(Bundle connectionHint) {
    }

    @Override // com.google.android.gms.common.api.zzh
    public void onConnectionSuspended(int cause) {
        switch (cause) {
            case 1:
                this.zzWK.zzmQ();
                zzaV(cause);
                return;
            case 2:
                zzaV(cause);
                this.zzWK.connect();
                return;
            default:
                return;
        }
    }

    @Override // com.google.android.gms.common.api.zzh
    public <A extends Api.Client, R extends Result, T extends zza.AbstractC0027zza<R, A>> T zza(T t) {
        return (T) zzb(t);
    }

    @Override // com.google.android.gms.common.api.zzh
    public void zza(ConnectionResult connectionResult, Api<?> api, int i) {
    }

    @Override // com.google.android.gms.common.api.zzh
    public void zzaV(int i) {
        boolean z = i == -1;
        if (z) {
            this.zzWK.zzmK();
            this.zzWK.zzXv.clear();
        } else {
            for (zzg.zze<?> zze : this.zzWK.zzXA) {
                zze.forceFailureUnlessReady(new Status(8, "The connection to Google Play services was lost"));
            }
        }
        this.zzWK.zze(null);
        if (!z) {
            this.zzWK.zzXn.zzbu(i);
        }
        this.zzWK.zzXn.zznT();
    }

    @Override // com.google.android.gms.common.api.zzh
    public <A extends Api.Client, T extends zza.AbstractC0027zza<? extends Result, A>> T zzb(T t) {
        try {
            zza((zzg.zze) t);
        } catch (DeadObjectException e) {
            zzaV(1);
        }
        return t;
    }
}
