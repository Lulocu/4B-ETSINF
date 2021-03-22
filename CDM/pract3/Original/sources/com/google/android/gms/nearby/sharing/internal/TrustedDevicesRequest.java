package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.nearby.sharing.internal.zzc;

public final class TrustedDevicesRequest implements SafeParcelable {
    public static final Parcelable.Creator<TrustedDevicesRequest> CREATOR = new zzk();
    final int versionCode;
    public zzc zzaGt;
    public String zzaGv;
    public byte[] zzaGw;

    TrustedDevicesRequest(int versionCode2, String deviceIdentifier, byte[] message, IBinder callbackAsBinder) {
        this.versionCode = versionCode2;
        this.zzaGv = (String) zzu.zzu(deviceIdentifier);
        this.zzaGw = (byte[]) zzu.zzu(message);
        this.zzaGt = zzc.zza.zzdj(callbackAsBinder);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        zzk.zza(this, dest, flags);
    }

    /* access modifiers changed from: package-private */
    public IBinder zzxa() {
        return this.zzaGt.asBinder();
    }
}
