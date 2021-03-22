package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.plus.internal.model.people.PersonEntity;
import java.util.HashSet;
import java.util.Set;

public class zzb implements Parcelable.Creator<PersonEntity.AgeRangeEntity> {
    static void zza(PersonEntity.AgeRangeEntity ageRangeEntity, Parcel parcel, int i) {
        int zzac = com.google.android.gms.common.internal.safeparcel.zzb.zzac(parcel);
        Set<Integer> set = ageRangeEntity.zzaHQ;
        if (set.contains(1)) {
            com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, 1, ageRangeEntity.zzCY);
        }
        if (set.contains(2)) {
            com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, 2, ageRangeEntity.zzaJh);
        }
        if (set.contains(3)) {
            com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, 3, ageRangeEntity.zzaJi);
        }
        com.google.android.gms.common.internal.safeparcel.zzb.zzH(parcel, zzac);
    }

    /* renamed from: zzfN */
    public PersonEntity.AgeRangeEntity createFromParcel(Parcel parcel) {
        int i = 0;
        int zzab = zza.zzab(parcel);
        HashSet hashSet = new HashSet();
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < zzab) {
            int zzaa = zza.zzaa(parcel);
            switch (zza.zzbA(zzaa)) {
                case 1:
                    i3 = zza.zzg(parcel, zzaa);
                    hashSet.add(1);
                    break;
                case 2:
                    i2 = zza.zzg(parcel, zzaa);
                    hashSet.add(2);
                    break;
                case 3:
                    i = zza.zzg(parcel, zzaa);
                    hashSet.add(3);
                    break;
                default:
                    zza.zzb(parcel, zzaa);
                    break;
            }
        }
        if (parcel.dataPosition() == zzab) {
            return new PersonEntity.AgeRangeEntity(hashSet, i3, i2, i);
        }
        throw new zza.C0031zza("Overread allowed size end=" + zzab, parcel);
    }

    /* renamed from: zziD */
    public PersonEntity.AgeRangeEntity[] newArray(int i) {
        return new PersonEntity.AgeRangeEntity[i];
    }
}
