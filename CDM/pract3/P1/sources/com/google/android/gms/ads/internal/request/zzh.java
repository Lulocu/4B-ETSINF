package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

public class zzh implements Parcelable.Creator<AdResponseParcel> {
    static void zza(AdResponseParcel adResponseParcel, Parcel parcel, int i) {
        int zzac = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, adResponseParcel.versionCode);
        zzb.zza(parcel, 2, adResponseParcel.zzzG, false);
        zzb.zza(parcel, 3, adResponseParcel.zzCI, false);
        zzb.zzb(parcel, 4, adResponseParcel.zzxF, false);
        zzb.zzc(parcel, 5, adResponseParcel.errorCode);
        zzb.zzb(parcel, 6, adResponseParcel.zzxG, false);
        zzb.zza(parcel, 7, adResponseParcel.zzCJ);
        zzb.zza(parcel, 8, adResponseParcel.zzCK);
        zzb.zza(parcel, 9, adResponseParcel.zzCL);
        zzb.zzb(parcel, 10, adResponseParcel.zzCM, false);
        zzb.zza(parcel, 11, adResponseParcel.zzxJ);
        zzb.zzc(parcel, 12, adResponseParcel.orientation);
        zzb.zza(parcel, 13, adResponseParcel.zzCN, false);
        zzb.zza(parcel, 14, adResponseParcel.zzCO);
        zzb.zza(parcel, 15, adResponseParcel.zzCP, false);
        zzb.zza(parcel, 19, adResponseParcel.zzCR, false);
        zzb.zza(parcel, 18, adResponseParcel.zzCQ);
        zzb.zza(parcel, 21, adResponseParcel.zzCS, false);
        zzb.zza(parcel, 23, adResponseParcel.zzsp);
        zzb.zza(parcel, 22, adResponseParcel.zzCT);
        zzb.zza(parcel, 25, adResponseParcel.zzCU);
        zzb.zza(parcel, 24, adResponseParcel.zzCu);
        zzb.zzc(parcel, 27, adResponseParcel.zzCW);
        zzb.zza(parcel, 26, adResponseParcel.zzCV);
        zzb.zza(parcel, 28, (Parcelable) adResponseParcel.zzCX, i, false);
        zzb.zzH(parcel, zzac);
    }

    /* renamed from: zzD */
    public AdResponseParcel[] newArray(int i) {
        return new AdResponseParcel[i];
    }

    /* renamed from: zzk */
    public AdResponseParcel createFromParcel(Parcel parcel) {
        int zzab = zza.zzab(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        ArrayList<String> arrayList = null;
        int i2 = 0;
        ArrayList<String> arrayList2 = null;
        long j = 0;
        boolean z = false;
        long j2 = 0;
        ArrayList<String> arrayList3 = null;
        long j3 = 0;
        int i3 = 0;
        String str3 = null;
        long j4 = 0;
        String str4 = null;
        boolean z2 = false;
        String str5 = null;
        String str6 = null;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        int i4 = 0;
        LargeParcelTeleporter largeParcelTeleporter = null;
        while (parcel.dataPosition() < zzab) {
            int zzaa = zza.zzaa(parcel);
            switch (zza.zzbA(zzaa)) {
                case 1:
                    i = zza.zzg(parcel, zzaa);
                    break;
                case 2:
                    str = zza.zzo(parcel, zzaa);
                    break;
                case 3:
                    str2 = zza.zzo(parcel, zzaa);
                    break;
                case 4:
                    arrayList = zza.zzC(parcel, zzaa);
                    break;
                case 5:
                    i2 = zza.zzg(parcel, zzaa);
                    break;
                case 6:
                    arrayList2 = zza.zzC(parcel, zzaa);
                    break;
                case 7:
                    j = zza.zzi(parcel, zzaa);
                    break;
                case 8:
                    z = zza.zzc(parcel, zzaa);
                    break;
                case 9:
                    j2 = zza.zzi(parcel, zzaa);
                    break;
                case 10:
                    arrayList3 = zza.zzC(parcel, zzaa);
                    break;
                case 11:
                    j3 = zza.zzi(parcel, zzaa);
                    break;
                case 12:
                    i3 = zza.zzg(parcel, zzaa);
                    break;
                case 13:
                    str3 = zza.zzo(parcel, zzaa);
                    break;
                case 14:
                    j4 = zza.zzi(parcel, zzaa);
                    break;
                case 15:
                    str4 = zza.zzo(parcel, zzaa);
                    break;
                case 16:
                case 17:
                case 20:
                default:
                    zza.zzb(parcel, zzaa);
                    break;
                case 18:
                    z2 = zza.zzc(parcel, zzaa);
                    break;
                case 19:
                    str5 = zza.zzo(parcel, zzaa);
                    break;
                case 21:
                    str6 = zza.zzo(parcel, zzaa);
                    break;
                case 22:
                    z3 = zza.zzc(parcel, zzaa);
                    break;
                case 23:
                    z4 = zza.zzc(parcel, zzaa);
                    break;
                case 24:
                    z5 = zza.zzc(parcel, zzaa);
                    break;
                case 25:
                    z6 = zza.zzc(parcel, zzaa);
                    break;
                case 26:
                    z7 = zza.zzc(parcel, zzaa);
                    break;
                case 27:
                    i4 = zza.zzg(parcel, zzaa);
                    break;
                case 28:
                    largeParcelTeleporter = (LargeParcelTeleporter) zza.zza(parcel, zzaa, LargeParcelTeleporter.CREATOR);
                    break;
            }
        }
        if (parcel.dataPosition() == zzab) {
            return new AdResponseParcel(i, str, str2, arrayList, i2, arrayList2, j, z, j2, arrayList3, j3, i3, str3, j4, str4, z2, str5, str6, z3, z4, z5, z6, z7, i4, largeParcelTeleporter);
        }
        throw new zza.C0031zza("Overread allowed size end=" + zzab, parcel);
    }
}
