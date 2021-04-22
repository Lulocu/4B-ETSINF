package com.google.android.gms.plus.internal.model.moments;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.HashSet;
import java.util.Set;

public class zzb implements Parcelable.Creator<MomentEntity> {
    static void zza(MomentEntity momentEntity, Parcel parcel, int i) {
        int zzac = com.google.android.gms.common.internal.safeparcel.zzb.zzac(parcel);
        Set<Integer> set = momentEntity.zzaHQ;
        if (set.contains(1)) {
            com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, 1, momentEntity.zzCY);
        }
        if (set.contains(2)) {
            com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 2, momentEntity.zzKI, true);
        }
        if (set.contains(4)) {
            com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 4, (Parcelable) momentEntity.zzaIL, i, true);
        }
        if (set.contains(5)) {
            com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 5, momentEntity.zzaID, true);
        }
        if (set.contains(6)) {
            com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 6, (Parcelable) momentEntity.zzaIM, i, true);
        }
        if (set.contains(7)) {
            com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 7, momentEntity.zzEl, true);
        }
        com.google.android.gms.common.internal.safeparcel.zzb.zzH(parcel, zzac);
    }

    /* renamed from: zzfL */
    public MomentEntity createFromParcel(Parcel parcel) {
        String str = null;
        int zzab = zza.zzab(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        ItemScopeEntity itemScopeEntity = null;
        String str2 = null;
        ItemScopeEntity itemScopeEntity2 = null;
        String str3 = null;
        while (parcel.dataPosition() < zzab) {
            int zzaa = zza.zzaa(parcel);
            switch (zza.zzbA(zzaa)) {
                case 1:
                    i = zza.zzg(parcel, zzaa);
                    hashSet.add(1);
                    break;
                case 2:
                    str3 = zza.zzo(parcel, zzaa);
                    hashSet.add(2);
                    break;
                case 3:
                default:
                    zza.zzb(parcel, zzaa);
                    break;
                case 4:
                    hashSet.add(4);
                    itemScopeEntity2 = (ItemScopeEntity) zza.zza(parcel, zzaa, ItemScopeEntity.CREATOR);
                    break;
                case 5:
                    str2 = zza.zzo(parcel, zzaa);
                    hashSet.add(5);
                    break;
                case 6:
                    hashSet.add(6);
                    itemScopeEntity = (ItemScopeEntity) zza.zza(parcel, zzaa, ItemScopeEntity.CREATOR);
                    break;
                case 7:
                    str = zza.zzo(parcel, zzaa);
                    hashSet.add(7);
                    break;
            }
        }
        if (parcel.dataPosition() == zzab) {
            return new MomentEntity(hashSet, i, str3, itemScopeEntity2, str2, itemScopeEntity, str);
        }
        throw new zza.C0031zza("Overread allowed size end=" + zzab, parcel);
    }

    /* renamed from: zziB */
    public MomentEntity[] newArray(int i) {
        return new MomentEntity[i];
    }
}
