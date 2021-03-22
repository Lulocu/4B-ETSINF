package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzol;
import com.google.android.gms.nearby.bootstrap.Device;

public class DisconnectRequest implements SafeParcelable {
    public static final zzd CREATOR = new zzd();
    final int versionCode;
    private final Device zzaFh;
    private final zzol zzaFk;

    DisconnectRequest(int versionCode2, Device device, IBinder callback) {
        this.versionCode = versionCode2;
        this.zzaFh = (Device) zzu.zzu(device);
        zzu.zzu(callback);
        this.zzaFk = zzol.zza.zzcX(callback);
    }

    public int describeContents() {
        zzd zzd = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel out, int flags) {
        zzd zzd = CREATOR;
        zzd.zza(this, out, flags);
    }

    public IBinder zzqU() {
        return this.zzaFk.asBinder();
    }

    public Device zzwM() {
        return this.zzaFh;
    }
}
