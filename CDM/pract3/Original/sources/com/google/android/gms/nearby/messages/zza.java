package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zza implements Parcelable.Creator<Message> {
    static void zza(Message message, Parcel parcel, int i) {
        int zzac = zzb.zzac(parcel);
        zzb.zza(parcel, 1, message.zzwV(), false);
        zzb.zzc(parcel, 1000, message.versionCode);
        zzb.zza(parcel, 2, message.getType(), false);
        zzb.zza(parcel, 3, message.getNamespace(), false);
        zzb.zzH(parcel, zzac);
    }

    /* renamed from: zzfp */
    public Message createFromParcel(Parcel parcel) {
        String str = null;
        int zzab = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        int i = 0;
        String str2 = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < zzab) {
            int zzaa = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.zza.zzbA(zzaa)) {
                case 1:
                    bArr = com.google.android.gms.common.internal.safeparcel.zza.zzr(parcel, zzaa);
                    break;
                case 2:
                    str = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, zzaa);
                    break;
                case 3:
                    str2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, zzaa);
                    break;
                case 1000:
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, zzaa);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, zzaa);
                    break;
            }
        }
        if (parcel.dataPosition() == zzab) {
            return new Message(i, bArr, str2, str);
        }
        throw new zza.C0031zza("Overread allowed size end=" + zzab, parcel);
    }

    /* renamed from: zzic */
    public Message[] newArray(int i) {
        return new Message[i];
    }
}
