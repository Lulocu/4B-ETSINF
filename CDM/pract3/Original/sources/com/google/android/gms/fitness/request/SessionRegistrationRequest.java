package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.internal.zzmu;

public class SessionRegistrationRequest implements SafeParcelable {
    public static final Parcelable.Creator<SessionRegistrationRequest> CREATOR = new zzw();
    private final PendingIntent mPendingIntent;
    private final int zzCY;
    private final String zzMZ;
    private final zzmu zzalN;
    private final int zzamI;

    SessionRegistrationRequest(int versionCode, PendingIntent intent, IBinder callback, String packageName, int sessionRegistrationOption) {
        this.zzCY = versionCode;
        this.mPendingIntent = intent;
        this.zzalN = callback == null ? null : zzmu.zza.zzbF(callback);
        this.zzMZ = packageName;
        this.zzamI = sessionRegistrationOption;
    }

    public SessionRegistrationRequest(PendingIntent pendingIntent, zzmu callback, String packageName, int sessionRegistrationOption) {
        this.zzCY = 5;
        this.mPendingIntent = pendingIntent;
        this.zzalN = callback;
        this.zzMZ = packageName;
        this.zzamI = sessionRegistrationOption;
    }

    private boolean zzb(SessionRegistrationRequest sessionRegistrationRequest) {
        return this.zzamI == sessionRegistrationRequest.zzamI && zzt.equal(this.mPendingIntent, sessionRegistrationRequest.mPendingIntent);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object that) {
        return this == that || ((that instanceof SessionRegistrationRequest) && zzb((SessionRegistrationRequest) that));
    }

    public String getPackageName() {
        return this.zzMZ;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.zzCY;
    }

    public int hashCode() {
        return zzt.hashCode(this.mPendingIntent, Integer.valueOf(this.zzamI));
    }

    public String toString() {
        return zzt.zzt(this).zzg("pendingIntent", this.mPendingIntent).zzg("sessionRegistrationOption", Integer.valueOf(this.zzamI)).toString();
    }

    public void writeToParcel(Parcel parcel, int flags) {
        zzw.zza(this, parcel, flags);
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

    public int zzrp() {
        return this.zzamI;
    }
}
