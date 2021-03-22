package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class GetPermissionsRequest implements SafeParcelable {
    public static final Parcelable.Creator<GetPermissionsRequest> CREATOR = new zzai();
    final int zzCY;
    final DriveId zzacT;

    GetPermissionsRequest(int versionCode, DriveId driveId) {
        this.zzCY = versionCode;
        this.zzacT = driveId;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        zzai.zza(this, dest, flags);
    }
}
