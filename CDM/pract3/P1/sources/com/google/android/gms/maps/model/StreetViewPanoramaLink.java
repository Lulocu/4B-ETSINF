package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;

public class StreetViewPanoramaLink implements SafeParcelable {
    public static final zzj CREATOR = new zzj();
    public final float bearing;
    public final String panoId;
    private final int zzCY;

    StreetViewPanoramaLink(int versionCode, String panoId2, float bearing2) {
        this.zzCY = versionCode;
        this.panoId = panoId2;
        this.bearing = (((double) bearing2) <= 0.0d ? (bearing2 % 360.0f) + 360.0f : bearing2) % 360.0f;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StreetViewPanoramaLink)) {
            return false;
        }
        StreetViewPanoramaLink streetViewPanoramaLink = (StreetViewPanoramaLink) o;
        return this.panoId.equals(streetViewPanoramaLink.panoId) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(streetViewPanoramaLink.bearing);
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.zzCY;
    }

    public int hashCode() {
        return zzt.hashCode(this.panoId, Float.valueOf(this.bearing));
    }

    public String toString() {
        return zzt.zzt(this).zzg("panoId", this.panoId).zzg("bearing", Float.valueOf(this.bearing)).toString();
    }

    public void writeToParcel(Parcel out, int flags) {
        zzj.zza(this, out, flags);
    }
}