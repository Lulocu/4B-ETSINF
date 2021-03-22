package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzi implements Parcelable.Creator<Field> {
    static void zza(Field field, Parcel parcel, int i) {
        int zzac = zzb.zzac(parcel);
        zzb.zza(parcel, 1, field.getName(), false);
        zzb.zzc(parcel, 1000, field.getVersionCode());
        zzb.zzc(parcel, 2, field.getFormat());
        zzb.zzH(parcel, zzac);
    }

    /* renamed from: zzcq */
    public Field createFromParcel(Parcel parcel) {
        int i = 0;
        int zzab = zza.zzab(parcel);
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < zzab) {
            int zzaa = zza.zzaa(parcel);
            switch (zza.zzbA(zzaa)) {
                case 1:
                    str = zza.zzo(parcel, zzaa);
                    break;
                case 2:
                    i = zza.zzg(parcel, zzaa);
                    break;
                case 1000:
                    i2 = zza.zzg(parcel, zzaa);
                    break;
                default:
                    zza.zzb(parcel, zzaa);
                    break;
            }
        }
        if (parcel.dataPosition() == zzab) {
            return new Field(i2, str, i);
        }
        throw new zza.C0031zza("Overread allowed size end=" + zzab, parcel);
    }

    /* renamed from: zzej */
    public Field[] newArray(int i) {
        return new Field[i];
    }
}
