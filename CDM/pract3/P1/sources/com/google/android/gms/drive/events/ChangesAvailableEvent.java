package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import java.util.Locale;

public final class ChangesAvailableEvent implements SafeParcelable, DriveEvent {
    public static final Parcelable.Creator<ChangesAvailableEvent> CREATOR = new zzb();
    final int zzCY;
    final String zzOx;
    final ChangesAvailableOptions zzadO;

    ChangesAvailableEvent(int versionCode, String accountName, ChangesAvailableOptions changesAvailableOptions) {
        this.zzCY = versionCode;
        this.zzOx = accountName;
        this.zzadO = changesAvailableOptions;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object o) {
        if (o == null || o.getClass() != getClass()) {
            return false;
        }
        if (o == this) {
            return true;
        }
        ChangesAvailableEvent changesAvailableEvent = (ChangesAvailableEvent) o;
        return zzt.equal(this.zzadO, changesAvailableEvent.zzadO) && zzt.equal(this.zzOx, changesAvailableEvent.zzOx);
    }

    @Override // com.google.android.gms.drive.events.DriveEvent
    public int getType() {
        return 4;
    }

    public int hashCode() {
        return zzt.hashCode(this.zzadO, this.zzOx);
    }

    public String toString() {
        return String.format(Locale.US, "ChangesAvailableEvent [changesAvailableOptions=%s]", this.zzadO);
    }

    public void writeToParcel(Parcel dest, int flags) {
        zzb.zza(this, dest, flags);
    }
}
