package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

public class zzb implements Parcelable.Creator<WebImage> {
    static void zza(WebImage webImage, Parcel parcel, int i) {
        int zzac = com.google.android.gms.common.internal.safeparcel.zzb.zzac(parcel);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, 1, webImage.getVersionCode());
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 2, (Parcelable) webImage.getUrl(), i, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, 3, webImage.getWidth());
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, 4, webImage.getHeight());
        com.google.android.gms.common.internal.safeparcel.zzb.zzH(parcel, zzac);
    }

    /* renamed from: zzT */
    public WebImage createFromParcel(Parcel parcel) {
        int zzg;
        int i;
        Uri uri;
        int i2;
        int i3 = 0;
        int zzab = zza.zzab(parcel);
        Uri uri2 = null;
        int i4 = 0;
        int i5 = 0;
        while (parcel.dataPosition() < zzab) {
            int zzaa = zza.zzaa(parcel);
            switch (zza.zzbA(zzaa)) {
                case 1:
                    i = i4;
                    uri = uri2;
                    i2 = zza.zzg(parcel, zzaa);
                    zzg = i3;
                    break;
                case 2:
                    i2 = i5;
                    uri = (Uri) zza.zza(parcel, zzaa, Uri.CREATOR);
                    zzg = i3;
                    i = i4;
                    break;
                case 3:
                    uri = uri2;
                    i2 = i5;
                    i = zza.zzg(parcel, zzaa);
                    zzg = i3;
                    break;
                case 4:
                    zzg = zza.zzg(parcel, zzaa);
                    i = i4;
                    uri = uri2;
                    i2 = i5;
                    break;
                default:
                    zza.zzb(parcel, zzaa);
                    zzg = i3;
                    i = i4;
                    uri = uri2;
                    i2 = i5;
                    break;
            }
            i5 = i2;
            uri2 = uri;
            i4 = i;
            i3 = zzg;
        }
        if (parcel.dataPosition() == zzab) {
            return new WebImage(i5, uri2, i4, i3);
        }
        throw new zza.C0031zza("Overread allowed size end=" + zzab, parcel);
    }

    /* renamed from: zzbn */
    public WebImage[] newArray(int i) {
        return new WebImage[i];
    }
}
