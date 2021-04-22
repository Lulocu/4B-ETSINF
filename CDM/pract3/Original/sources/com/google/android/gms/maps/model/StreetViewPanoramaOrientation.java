package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;

public class StreetViewPanoramaOrientation implements SafeParcelable {
    public static final zzl CREATOR = new zzl();
    public final float bearing;
    public final float tilt;
    private final int zzCY;

    public static final class Builder {
        public float bearing;
        public float tilt;

        public Builder() {
        }

        public Builder(StreetViewPanoramaOrientation previous) {
            this.bearing = previous.bearing;
            this.tilt = previous.tilt;
        }

        public Builder bearing(float bearing2) {
            this.bearing = bearing2;
            return this;
        }

        public StreetViewPanoramaOrientation build() {
            return new StreetViewPanoramaOrientation(this.tilt, this.bearing);
        }

        public Builder tilt(float tilt2) {
            this.tilt = tilt2;
            return this;
        }
    }

    public StreetViewPanoramaOrientation(float tilt2, float bearing2) {
        this(1, tilt2, bearing2);
    }

    StreetViewPanoramaOrientation(int versionCode, float tilt2, float bearing2) {
        zzu.zzb(-90.0f <= tilt2 && tilt2 <= 90.0f, "Tilt needs to be between -90 and 90 inclusive");
        this.zzCY = versionCode;
        this.tilt = 0.0f + tilt2;
        this.bearing = (((double) bearing2) <= 0.0d ? (bearing2 % 360.0f) + 360.0f : bearing2) % 360.0f;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreetViewPanoramaOrientation orientation) {
        return new Builder(orientation);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StreetViewPanoramaOrientation)) {
            return false;
        }
        StreetViewPanoramaOrientation streetViewPanoramaOrientation = (StreetViewPanoramaOrientation) o;
        return Float.floatToIntBits(this.tilt) == Float.floatToIntBits(streetViewPanoramaOrientation.tilt) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(streetViewPanoramaOrientation.bearing);
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.zzCY;
    }

    public int hashCode() {
        return zzt.hashCode(Float.valueOf(this.tilt), Float.valueOf(this.bearing));
    }

    public String toString() {
        return zzt.zzt(this).zzg("tilt", Float.valueOf(this.tilt)).zzg("bearing", Float.valueOf(this.bearing)).toString();
    }

    public void writeToParcel(Parcel out, int flags) {
        zzl.zza(this, out, flags);
    }
}
