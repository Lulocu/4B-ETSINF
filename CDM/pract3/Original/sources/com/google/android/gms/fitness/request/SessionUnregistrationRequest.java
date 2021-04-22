package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.internal.zzmu;

public class SessionUnregistrationRequest implements SafeParcelable {
    public static final Parcelable.Creator<SessionUnregistrationRequest> CREATOR = new zzz();
    private final PendingIntent mPendingIntent;
    private final int zzCY;
    private final String zzMZ;
    private final zzmu zzalN;

    SessionUnregistrationRequest(int versionCode, PendingIntent intent, IBinder callback, String packageName) {
        this.zzCY = versionCode;
        this.mPendingIntent = intent;
        this.zzalN = callback == null ? null : zzmu.zza.zzbF(callback);
        this.zzMZ = packageName;
    }

    public SessionUnregistrationRequest(PendingIntent pendingIntent, zzmu callback, String packageName) {
        this.zzCY = 4;
        this.mPendingIntent = pendingIntent;
        this.zzalN = callback;
        this.zzMZ = packageName;
    }

    private boolean zzb(SessionUnregistrationRequest sessionUnregistrationRequest) {
        return zzt.equal(this.mPendingIntent, sessionUnregistrationRequest.mPendingIntent);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object that) {
        return this == that || ((that instanceof SessionUnregistrationRequest) && zzb((SessionUnregistrationRequest) that));
    }

    public String getPackageName() {
        return this.zzMZ;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.zzCY;
    }

    public int hashCode() {
        return zzt.hashCode(this.mPendingIntent);
    }

    public String toString() {
        return zzt.zzt(this).zzg("pendingIntent", this.mPendingIntent).toString();
    }

    public void writeToParcel(Parcel parcel, int flags) {
        zzz.zza(this, parcel, flags);
    }

    public IBinder zzqU() {
        if (this.zzalN == null) {
            return null;
        }
        return this.zzalN.asBinder();
    }

    public PendingIntent zzrg() {
        return this.mPendingIntent;
    }
}
