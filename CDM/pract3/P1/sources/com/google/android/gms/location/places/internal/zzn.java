package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

public class zzn implements Parcelable.Creator<PlaceLocalization> {
    static void zza(PlaceLocalization placeLocalization, Parcel parcel, int i) {
        int zzac = zzb.zzac(parcel);
        zzb.zza(parcel, 1, placeLocalization.name, false);
        zzb.zzc(parcel, 1000, placeLocalization.versionCode);
        zzb.zza(parcel, 2, placeLocalization.zzaAM, false);
        zzb.zza(parcel, 3, placeLocalization.zzaAN, false);
        zzb.zza(parcel, 4, placeLocalization.zzaAO, false);
        zzb.zzb(parcel, 5, placeLocalization.zzaAP, false);
        zzb.zzH(parcel, zzac);
    }

    /* renamed from: zzeA */
    public PlaceLocalization createFromParcel(Parcel parcel) {
        ArrayList<String> arrayList = null;
        int zzab = zza.zzab(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (parcel.dataPosition() < zzab) {
            int zzaa = zza.zzaa(parcel);
            switch (zza.zzbA(zzaa)) {
                case 1:
                    str4 = zza.zzo(parcel, zzaa);
                    break;
                case 2:
                    str3 = zza.zzo(parcel, zzaa);
                    break;
                case 3:
                    str2 = zza.zzo(parcel, zzaa);
                    break;
                case 4:
                    str = zza.zzo(parcel, zzaa);
                    break;
                case 5:
                    arrayList = zza.zzC(parcel, zzaa);
                    break;
                case 1000:
                    i = zza.zzg(parcel, zzaa);
                    break;
                default:
                    zza.zzb(parcel, zzaa);
                    break;
            }
        }
        if (parcel.dataPosition() == zzab) {
            return new PlaceLocalization(i, str4, str3, str2, str, arrayList);
        }
        throw new zza.C0031zza("Overread allowed size end=" + zzab, parcel);
    }

    /* renamed from: zzha */
    public PlaceLocalization[] newArray(int i) {
        return new PlaceLocalization[i];
    }
}