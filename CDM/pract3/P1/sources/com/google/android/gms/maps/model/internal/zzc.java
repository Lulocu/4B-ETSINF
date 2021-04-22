package com.google.android.gms.maps.model.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzc implements Parcelable.Creator<GroundOverlayOptionsParcelable> {
    static void zza(GroundOverlayOptionsParcelable groundOverlayOptionsParcelable, Parcel parcel, int i) {
        int zzac = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, groundOverlayOptionsParcelable.getVersionCode());
        zzb.zza(parcel, 2, (Parcelable) groundOverlayOptionsParcelable.zzvM(), i, false);
        zzb.zzH(parcel, zzac);
    }

    /* renamed from: zzfc */
    public GroundOverlayOptionsParcelable createFromParcel(Parcel parcel) {
        int zzab = zza.zzab(parcel);
        int i = 0;
        BitmapDescriptorParcelable bitmapDescriptorParcelable = null;
        while (parcel.dataPosition() < zzab) {
            int zzaa = zza.zzaa(parcel);
            switch (zza.zzbA(zzaa)) {
                case 1:
                    i = zza.zzg(parcel, zzaa);
                    break;
                case 2:
                    bitmapDescriptorParcelable = (BitmapDescriptorParcelable) zza.zza(parcel, zzaa, BitmapDescriptorParcelable.CREATOR);
                    break;
                default:
                    zza.zzb(parcel, zzaa);
                    break;
            }
        }
        if (parcel.dataPosition() == zzab) {
            return new GroundOverlayOptionsParcelable(i, bitmapDescriptorParcelable);
        }
        throw new zza.C0031zza("Overread allowed size end=" + zzab, parcel);
    }

    /* renamed from: zzhC */
    public GroundOverlayOptionsParcelable[] newArray(int i) {
        return new GroundOverlayOptionsParcelable[i];
    }
}
