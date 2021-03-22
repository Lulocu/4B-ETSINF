package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class SnapshotEntityCreator implements Parcelable.Creator<SnapshotEntity> {
    static void zza(SnapshotEntity snapshotEntity, Parcel parcel, int i) {
        int zzac = zzb.zzac(parcel);
        zzb.zza(parcel, 1, (Parcelable) snapshotEntity.getMetadata(), i, false);
        zzb.zzc(parcel, 1000, snapshotEntity.getVersionCode());
        zzb.zza(parcel, 3, (Parcelable) snapshotEntity.getSnapshotContents(), i, false);
        zzb.zzH(parcel, zzac);
    }

    /* renamed from: zzdS */
    public SnapshotEntity createFromParcel(Parcel parcel) {
        SnapshotContentsEntity snapshotContentsEntity;
        SnapshotMetadataEntity snapshotMetadataEntity;
        int i;
        SnapshotContentsEntity snapshotContentsEntity2 = null;
        int zzab = zza.zzab(parcel);
        int i2 = 0;
        SnapshotMetadataEntity snapshotMetadataEntity2 = null;
        while (parcel.dataPosition() < zzab) {
            int zzaa = zza.zzaa(parcel);
            switch (zza.zzbA(zzaa)) {
                case 1:
                    SnapshotMetadataEntity snapshotMetadataEntity3 = (SnapshotMetadataEntity) zza.zza(parcel, zzaa, SnapshotMetadataEntity.CREATOR);
                    i = i2;
                    snapshotContentsEntity = snapshotContentsEntity2;
                    snapshotMetadataEntity = snapshotMetadataEntity3;
                    break;
                case 3:
                    snapshotContentsEntity = (SnapshotContentsEntity) zza.zza(parcel, zzaa, SnapshotContentsEntity.CREATOR);
                    snapshotMetadataEntity = snapshotMetadataEntity2;
                    i = i2;
                    break;
                case 1000:
                    snapshotMetadataEntity = snapshotMetadataEntity2;
                    i = zza.zzg(parcel, zzaa);
                    snapshotContentsEntity = snapshotContentsEntity2;
                    break;
                default:
                    zza.zzb(parcel, zzaa);
                    snapshotContentsEntity = snapshotContentsEntity2;
                    snapshotMetadataEntity = snapshotMetadataEntity2;
                    i = i2;
                    break;
            }
            i2 = i;
            snapshotMetadataEntity2 = snapshotMetadataEntity;
            snapshotContentsEntity2 = snapshotContentsEntity;
        }
        if (parcel.dataPosition() == zzab) {
            return new SnapshotEntity(i2, snapshotMetadataEntity2, snapshotContentsEntity2);
        }
        throw new zza.C0031zza("Overread allowed size end=" + zzab, parcel);
    }

    /* renamed from: zzgc */
    public SnapshotEntity[] newArray(int i) {
        return new SnapshotEntity[i];
    }
}
