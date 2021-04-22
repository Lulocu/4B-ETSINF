package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzg implements Parcelable.Creator<ReceiveContentRequest> {
    static void zza(ReceiveContentRequest receiveContentRequest, Parcel parcel, int i) {
        int zzac = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, receiveContentRequest.versionCode);
        zzb.zza(parcel, 2, receiveContentRequest.zzaGp, false);
        zzb.zza(parcel, 3, receiveContentRequest.zzxj(), false);
        zzb.zza(parcel, 4, receiveContentRequest.packageName, false);
        zzb.zza(parcel, 5, receiveContentRequest.zzxa(), false);
        zzb.zzH(parcel, zzac);
    }

    /* renamed from: zzfD */
    public ReceiveContentRequest createFromParcel(Parcel parcel) {
        IBinder iBinder = null;
        int zzab = zza.zzab(parcel);
        int i = 0;
        String str = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        while (parcel.dataPosition() < zzab) {
            int zzaa = zza.zzaa(parcel);
            switch (zza.zzbA(zzaa)) {
                case 1:
                    i = zza.zzg(parcel, zzaa);
                    break;
                case 2:
                    iBinder3 = zza.zzp(parcel, zzaa);
                    break;
                case 3:
                    iBinder2 = zza.zzp(parcel, zzaa);
                    break;
                case 4:
                    str = zza.zzo(parcel, zzaa);
                    break;
                case 5:
                    iBinder = zza.zzp(parcel, zzaa);
                    break;
                default:
                    zza.zzb(parcel, zzaa);
                    break;
            }
        }
        if (parcel.dataPosition() == zzab) {
            return new ReceiveContentRequest(i, iBinder3, iBinder2, str, iBinder);
        }
        throw new zza.C0031zza("Overread allowed size end=" + zzab, parcel);
    }

    /* renamed from: zzis */
    public ReceiveContentRequest[] newArray(int i) {
        return new ReceiveContentRequest[i];
    }
}
