package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.location.places.AutocompletePrediction;
import com.google.android.gms.plus.PlusShare;
import java.util.List;

public class AutocompletePredictionEntity implements SafeParcelable, AutocompletePrediction {
    public static final Parcelable.Creator<AutocompletePredictionEntity> CREATOR = new zza();
    final int zzCY;
    final List<SubstringEntity> zzaAe;
    final int zzaAf;
    final String zzakM;
    final String zzazK;
    final List<Integer> zzazo;

    public static class SubstringEntity implements SafeParcelable, AutocompletePrediction.Substring {
        public static final Parcelable.Creator<SubstringEntity> CREATOR = new zzu();
        final int mLength;
        final int mOffset;
        final int zzCY;

        public SubstringEntity(int versionCode, int offset, int length) {
            this.zzCY = versionCode;
            this.mOffset = offset;
            this.mLength = length;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof SubstringEntity)) {
                return false;
            }
            SubstringEntity substringEntity = (SubstringEntity) object;
            return zzt.equal(Integer.valueOf(this.mOffset), Integer.valueOf(substringEntity.mOffset)) && zzt.equal(Integer.valueOf(this.mLength), Integer.valueOf(substringEntity.mLength));
        }

        @Override // com.google.android.gms.location.places.AutocompletePrediction.Substring
        public int getLength() {
            return this.mLength;
        }

        @Override // com.google.android.gms.location.places.AutocompletePrediction.Substring
        public int getOffset() {
            return this.mOffset;
        }

        public int hashCode() {
            return zzt.hashCode(Integer.valueOf(this.mOffset), Integer.valueOf(this.mLength));
        }

        public String toString() {
            return zzt.zzt(this).zzg("offset", Integer.valueOf(this.mOffset)).zzg("length", Integer.valueOf(this.mLength)).toString();
        }

        public void writeToParcel(Parcel parcel, int flags) {
            zzu.zza(this, parcel, flags);
        }
    }

    AutocompletePredictionEntity(int versionCode, String description, String placeId, List<Integer> placeTypes, List<SubstringEntity> substrings, int personalizationType) {
        this.zzCY = versionCode;
        this.zzakM = description;
        this.zzazK = placeId;
        this.zzazo = placeTypes;
        this.zzaAe = substrings;
        this.zzaAf = personalizationType;
    }

    public static AutocompletePredictionEntity zza(String str, String str2, List<Integer> list, List<SubstringEntity> list2, int i) {
        return new AutocompletePredictionEntity(0, (String) zzu.zzu(str), str2, list, list2, i);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof AutocompletePredictionEntity)) {
            return false;
        }
        AutocompletePredictionEntity autocompletePredictionEntity = (AutocompletePredictionEntity) object;
        return zzt.equal(this.zzakM, autocompletePredictionEntity.zzakM) && zzt.equal(this.zzazK, autocompletePredictionEntity.zzazK) && zzt.equal(this.zzazo, autocompletePredictionEntity.zzazo) && zzt.equal(this.zzaAe, autocompletePredictionEntity.zzaAe) && zzt.equal(Integer.valueOf(this.zzaAf), Integer.valueOf(autocompletePredictionEntity.zzaAf));
    }

    @Override // com.google.android.gms.location.places.AutocompletePrediction
    public String getDescription() {
        return this.zzakM;
    }

    @Override // com.google.android.gms.location.places.AutocompletePrediction
    public List<? extends AutocompletePrediction.Substring> getMatchedSubstrings() {
        return this.zzaAe;
    }

    @Override // com.google.android.gms.location.places.AutocompletePrediction
    public String getPlaceId() {
        return this.zzazK;
    }

    @Override // com.google.android.gms.location.places.AutocompletePrediction
    public List<Integer> getPlaceTypes() {
        return this.zzazo;
    }

    public int hashCode() {
        return zzt.hashCode(this.zzakM, this.zzazK, this.zzazo, this.zzaAe, Integer.valueOf(this.zzaAf));
    }

    @Override // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
        return true;
    }

    public String toString() {
        return zzt.zzt(this).zzg(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION, this.zzakM).zzg("placeId", this.zzazK).zzg("placeTypes", this.zzazo).zzg("substrings", this.zzaAe).toString();
    }

    public void writeToParcel(Parcel parcel, int flags) {
        zza.zza(this, parcel, flags);
    }

    /* renamed from: zzuL */
    public AutocompletePrediction freeze() {
        return this;
    }
}