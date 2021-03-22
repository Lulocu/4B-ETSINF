package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DrivePreferences;

public class OnDrivePreferencesResponse implements SafeParcelable {
    public static final Parcelable.Creator<OnDrivePreferencesResponse> CREATOR = new zzay();
    final int zzCY;
    DrivePreferences zzagi;

    OnDrivePreferencesResponse(int versionCode, DrivePreferences prefs) {
        this.zzCY = versionCode;
        this.zzagi = prefs;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        zzay.zza(this, dest, flags);
    }
}
