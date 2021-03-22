package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.fitness.data.Subscription;
import com.google.android.gms.internal.zzmu;

public class SubscribeRequest implements SafeParcelable {
    public static final Parcelable.Creator<SubscribeRequest> CREATOR = new zzac();
    private final int zzCY;
    private final String zzMZ;
    private final zzmu zzalN;
    private final Subscription zzamM;
    private final boolean zzamN;

    SubscribeRequest(int versionCode, Subscription subscription, boolean serverOnly, IBinder callback, String packageName) {
        this.zzCY = versionCode;
        this.zzamM = subscription;
        this.zzamN = serverOnly;
        this.zzalN = callback == null ? null : zzmu.zza.zzbF(callback);
        this.zzMZ = packageName;
    }

    public SubscribeRequest(Subscription subscription, boolean serverOnly, zzmu callback, String packageName) {
        this.zzCY = 2;
        this.zzamM = subscription;
        this.zzamN = serverOnly;
        this.zzalN = callback;
        this.zzMZ = packageName;
    }

    public int describeContents() {
        return 0;
    }

    public String getPackageName() {
        return this.zzMZ;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.zzCY;
    }

    public String toString() {
        return zzt.zzt(this).zzg("subscription", this.zzamM).toString();
    }

    public void writeToParcel(Parcel dest, int flags) {
        zzac.zza(this, dest, flags);
    }

    public IBinder zzqU() {
        if (this.zzalN == null) {
            return null;
        }
        return this.zzalN.asBinder();
    }

    public Subscription zzrr() {
        return this.zzamM;
    }

    public boolean zzrs() {
        return this.zzamN;
    }
}