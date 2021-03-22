package com.google.android.gms.wallet.fragment;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

public class zza implements Parcelable.Creator<WalletFragmentInitParams> {
    static void zza(WalletFragmentInitParams walletFragmentInitParams, Parcel parcel, int i) {
        int zzac = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, walletFragmentInitParams.zzCY);
        zzb.zza(parcel, 2, walletFragmentInitParams.getAccountName(), false);
        zzb.zza(parcel, 3, (Parcelable) walletFragmentInitParams.getMaskedWalletRequest(), i, false);
        zzb.zzc(parcel, 4, walletFragmentInitParams.getMaskedWalletRequestCode());
        zzb.zza(parcel, 5, (Parcelable) walletFragmentInitParams.getMaskedWallet(), i, false);
        zzb.zzH(parcel, zzac);
    }

    /* renamed from: zzgv */
    public WalletFragmentInitParams createFromParcel(Parcel parcel) {
        MaskedWallet maskedWallet = null;
        int zzab = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        int i = 0;
        int i2 = -1;
        MaskedWalletRequest maskedWalletRequest = null;
        String str = null;
        while (parcel.dataPosition() < zzab) {
            int zzaa = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.zza.zzbA(zzaa)) {
                case 1:
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, zzaa);
                    break;
                case 2:
                    str = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, zzaa);
                    break;
                case 3:
                    maskedWalletRequest = (MaskedWalletRequest) com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, zzaa, MaskedWalletRequest.CREATOR);
                    break;
                case 4:
                    i2 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, zzaa);
                    break;
                case 5:
                    maskedWallet = (MaskedWallet) com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, zzaa, MaskedWallet.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, zzaa);
                    break;
            }
        }
        if (parcel.dataPosition() == zzab) {
            return new WalletFragmentInitParams(i, str, maskedWalletRequest, i2, maskedWallet);
        }
        throw new zza.C0031zza("Overread allowed size end=" + zzab, parcel);
    }

    /* renamed from: zzjy */
    public WalletFragmentInitParams[] newArray(int i) {
        return new WalletFragmentInitParams[i];
    }
}
