package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzf implements Parcelable.Creator<PutDataRequest> {
    static void zza(PutDataRequest putDataRequest, Parcel parcel, int i) {
        int zzac = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, putDataRequest.zzCY);
        zzb.zza(parcel, 2, (Parcelable) putDataRequest.getUri(), i, false);
        zzb.zza(parcel, 4, putDataRequest.zzAR(), false);
        zzb.zza(parcel, 5, putDataRequest.getData(), false);
        zzb.zzH(parcel, zzac);
    }

    /* renamed from: zzgJ */
    public PutDataRequest createFromParcel(Parcel parcel) {
        byte[] zzr;
        Bundle bundle;
        Uri uri;
        int i;
        byte[] bArr = null;
        int zzab = zza.zzab(parcel);
        int i2 = 0;
        Bundle bundle2 = null;
        Uri uri2 = null;
        while (parcel.dataPosition() < zzab) {
            int zzaa = zza.zzaa(parcel);
            switch (zza.zzbA(zzaa)) {
                case 1:
                    bundle = bundle2;
                    uri = uri2;
                    i = zza.zzg(parcel, zzaa);
                    zzr = bArr;
                    break;
                case 2:
                    i = i2;
                    uri = (Uri) zza.zza(parcel, zzaa, Uri.CREATOR);
                    zzr = bArr;
                    bundle = bundle2;
                    break;
                case 3:
                default:
                    zza.zzb(parcel, zzaa);
                    zzr = bArr;
                    bundle = bundle2;
                    uri = uri2;
                    i = i2;
                    break;
                case 4:
                    uri = uri2;
                    i = i2;
                    bundle = zza.zzq(parcel, zzaa);
                    zzr = bArr;
                    break;
                case 5:
                    zzr = zza.zzr(parcel, zzaa);
                    bundle = bundle2;
                    uri = uri2;
                    i = i2;
                    break;
            }
            i2 = i;
            uri2 = uri;
            bundle2 = bundle;
            bArr = zzr;
        }
        if (parcel.dataPosition() == zzab) {
            return new PutDataRequest(i2, uri2, bundle2, bArr);
        }
        throw new zza.C0031zza("Overread allowed size end=" + zzab, parcel);
    }

    /* renamed from: zzjO */
    public PutDataRequest[] newArray(int i) {
        return new PutDataRequest[i];
    }
}
