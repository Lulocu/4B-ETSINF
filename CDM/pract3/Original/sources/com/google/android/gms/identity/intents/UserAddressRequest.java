package com.google.android.gms.identity.intents;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.CountrySpecification;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class UserAddressRequest implements SafeParcelable {
    public static final Parcelable.Creator<UserAddressRequest> CREATOR = new zza();
    private final int zzCY;
    List<CountrySpecification> zzawx;

    public final class Builder {
        private Builder() {
        }

        public Builder addAllowedCountrySpecification(CountrySpecification countrySpecification) {
            if (UserAddressRequest.this.zzawx == null) {
                UserAddressRequest.this.zzawx = new ArrayList();
            }
            UserAddressRequest.this.zzawx.add(countrySpecification);
            return this;
        }

        public Builder addAllowedCountrySpecifications(Collection<CountrySpecification> countrySpecifications) {
            if (UserAddressRequest.this.zzawx == null) {
                UserAddressRequest.this.zzawx = new ArrayList();
            }
            UserAddressRequest.this.zzawx.addAll(countrySpecifications);
            return this;
        }

        public UserAddressRequest build() {
            if (UserAddressRequest.this.zzawx != null) {
                UserAddressRequest.this.zzawx = Collections.unmodifiableList(UserAddressRequest.this.zzawx);
            }
            return UserAddressRequest.this;
        }
    }

    UserAddressRequest() {
        this.zzCY = 1;
    }

    UserAddressRequest(int versionCode, List<CountrySpecification> allowedCountrySpecifications) {
        this.zzCY = versionCode;
        this.zzawx = allowedCountrySpecifications;
    }

    public static Builder newBuilder() {
        UserAddressRequest userAddressRequest = new UserAddressRequest();
        userAddressRequest.getClass();
        return new Builder();
    }

    public int describeContents() {
        return 0;
    }

    public int getVersionCode() {
        return this.zzCY;
    }

    public void writeToParcel(Parcel out, int flags) {
        zza.zza(this, out, flags);
    }
}
