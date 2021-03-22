package com.google.android.gms.wallet.fragment;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

public final class WalletFragmentInitParams implements SafeParcelable {
    public static final Parcelable.Creator<WalletFragmentInitParams> CREATOR = new zza();
    final int zzCY;
    private String zzOx;
    private MaskedWalletRequest zzaRU;
    private MaskedWallet zzaRV;
    private int zzaSi;

    public final class Builder {
        private Builder() {
        }

        public WalletFragmentInitParams build() {
            boolean z = true;
            zzu.zza((WalletFragmentInitParams.this.zzaRV != null && WalletFragmentInitParams.this.zzaRU == null) || (WalletFragmentInitParams.this.zzaRV == null && WalletFragmentInitParams.this.zzaRU != null), "Exactly one of MaskedWallet or MaskedWalletRequest is required");
            if (WalletFragmentInitParams.this.zzaSi < 0) {
                z = false;
            }
            zzu.zza(z, "masked wallet request code is required and must be non-negative");
            return WalletFragmentInitParams.this;
        }

        public Builder setAccountName(String accountName) {
            WalletFragmentInitParams.this.zzOx = accountName;
            return this;
        }

        public Builder setMaskedWallet(MaskedWallet maskedWallet) {
            WalletFragmentInitParams.this.zzaRV = maskedWallet;
            return this;
        }

        public Builder setMaskedWalletRequest(MaskedWalletRequest request) {
            WalletFragmentInitParams.this.zzaRU = request;
            return this;
        }

        public Builder setMaskedWalletRequestCode(int requestCode) {
            WalletFragmentInitParams.this.zzaSi = requestCode;
            return this;
        }
    }

    private WalletFragmentInitParams() {
        this.zzCY = 1;
        this.zzaSi = -1;
    }

    WalletFragmentInitParams(int versionCode, String accountName, MaskedWalletRequest maskedWalletRequest, int maskedWalletRequestCode, MaskedWallet maskedWallet) {
        this.zzCY = versionCode;
        this.zzOx = accountName;
        this.zzaRU = maskedWalletRequest;
        this.zzaSi = maskedWalletRequestCode;
        this.zzaRV = maskedWallet;
    }

    public static Builder newBuilder() {
        WalletFragmentInitParams walletFragmentInitParams = new WalletFragmentInitParams();
        walletFragmentInitParams.getClass();
        return new Builder();
    }

    public int describeContents() {
        return 0;
    }

    public String getAccountName() {
        return this.zzOx;
    }

    public MaskedWallet getMaskedWallet() {
        return this.zzaRV;
    }

    public MaskedWalletRequest getMaskedWalletRequest() {
        return this.zzaRU;
    }

    public int getMaskedWalletRequestCode() {
        return this.zzaSi;
    }

    public void writeToParcel(Parcel dest, int flags) {
        zza.zza(this, dest, flags);
    }
}
