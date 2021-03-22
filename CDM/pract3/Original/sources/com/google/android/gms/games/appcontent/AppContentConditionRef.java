package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;

public final class AppContentConditionRef extends MultiDataBufferRef implements AppContentCondition {
    AppContentConditionRef(ArrayList<DataHolder> dataHolderCollection, int dataRow) {
        super(dataHolderCollection, 4, dataRow);
    }

    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.common.data.zzc
    public boolean equals(Object obj) {
        return AppContentConditionEntity.zza(this, obj);
    }

    @Override // com.google.android.gms.common.data.zzc
    public int hashCode() {
        return AppContentConditionEntity.zza(this);
    }

    public String toString() {
        return AppContentConditionEntity.zzb(this);
    }

    public void writeToParcel(Parcel dest, int flags) {
        ((AppContentConditionEntity) freeze()).writeToParcel(dest, flags);
    }

    @Override // com.google.android.gms.games.appcontent.AppContentCondition
    public String zzse() {
        return getString("condition_default_value");
    }

    @Override // com.google.android.gms.games.appcontent.AppContentCondition
    public String zzsf() {
        return getString("condition_expected_value");
    }

    @Override // com.google.android.gms.games.appcontent.AppContentCondition
    public String zzsg() {
        return getString("condition_predicate");
    }

    @Override // com.google.android.gms.games.appcontent.AppContentCondition
    public Bundle zzsh() {
        return AppContentUtils.zzd(this.zzWu, this.zzaoD, "condition_predicate_parameters", this.zzYs);
    }

    /* renamed from: zzsi */
    public AppContentCondition freeze() {
        return new AppContentConditionEntity(this);
    }
}
