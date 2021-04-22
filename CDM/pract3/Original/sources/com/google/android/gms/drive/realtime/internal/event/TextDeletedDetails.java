package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class TextDeletedDetails implements SafeParcelable {
    public static final Parcelable.Creator<TextDeletedDetails> CREATOR = new zzf();
    final int mIndex;
    final int zzCY;
    final int zzaiX;

    TextDeletedDetails(int versionCode, int index, int stringDataIndex) {
        this.zzCY = versionCode;
        this.mIndex = index;
        this.zzaiX = stringDataIndex;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        zzf.zza(this, dest, flags);
    }
}
