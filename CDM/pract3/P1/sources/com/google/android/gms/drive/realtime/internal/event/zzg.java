package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzg implements Parcelable.Creator<TextInsertedDetails> {
    static void zza(TextInsertedDetails textInsertedDetails, Parcel parcel, int i) {
        int zzac = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, textInsertedDetails.zzCY);
        zzb.zzc(parcel, 2, textInsertedDetails.mIndex);
        zzb.zzc(parcel, 3, textInsertedDetails.zzaiX);
        zzb.zzH(parcel, zzac);
    }

    /* renamed from: zzcd */
    public TextInsertedDetails createFromParcel(Parcel parcel) {
        int i = 0;
        int zzab = zza.zzab(parcel);
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < zzab) {
            int zzaa = zza.zzaa(parcel);
            switch (zza.zzbA(zzaa)) {
                case 1:
                    i3 = zza.zzg(parcel, zzaa);
                    break;
                case 2:
                    i2 = zza.zzg(parcel, zzaa);
                    break;
                case 3:
                    i = zza.zzg(parcel, zzaa);
                    break;
                default:
                    zza.zzb(parcel, zzaa);
                    break;
            }
        }
        if (parcel.dataPosition() == zzab) {
            return new TextInsertedDetails(i3, i2, i);
        }
        throw new zza.C0031zza("Overread allowed size end=" + zzab, parcel);
    }

    /* renamed from: zzdT */
    public TextInsertedDetails[] newArray(int i) {
        return new TextInsertedDetails[i];
    }
}
