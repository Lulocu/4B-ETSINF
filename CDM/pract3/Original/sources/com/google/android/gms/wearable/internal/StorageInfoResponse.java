package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class StorageInfoResponse implements SafeParcelable {
    public static final Parcelable.Creator<StorageInfoResponse> CREATOR = new zzbh();
    public final int statusCode;
    public final int versionCode;
    public final long zzaUN;
    public final List<PackageStorageInfo> zzaUP;

    StorageInfoResponse(int versionCode2, int statusCode2, long totalSizeBytes, List<PackageStorageInfo> packageStorageInfo) {
        this.versionCode = versionCode2;
        this.statusCode = statusCode2;
        this.zzaUN = totalSizeBytes;
        this.zzaUP = packageStorageInfo;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel out, int flags) {
        zzbh.zza(this, out, flags);
    }
}