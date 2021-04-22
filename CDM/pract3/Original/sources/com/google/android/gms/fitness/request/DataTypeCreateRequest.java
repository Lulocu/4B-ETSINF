package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.data.Field;
import com.google.android.gms.internal.zzmh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DataTypeCreateRequest implements SafeParcelable {
    public static final Parcelable.Creator<DataTypeCreateRequest> CREATOR = new zzi();
    private final String mName;
    private final int zzCY;
    private final String zzMZ;
    private final List<Field> zzakq;
    private final zzmh zzamk;

    public static class Builder {
        private String mName;
        private List<Field> zzakq = new ArrayList();

        public Builder addField(Field field) {
            if (!this.zzakq.contains(field)) {
                this.zzakq.add(field);
            }
            return this;
        }

        public Builder addField(String name, int format) {
            zzu.zzb(name != null && !name.isEmpty(), "Invalid name specified");
            return addField(Field.zzn(name, format));
        }

        public DataTypeCreateRequest build() {
            boolean z = true;
            zzu.zza(this.mName != null, "Must set the name");
            if (this.zzakq.isEmpty()) {
                z = false;
            }
            zzu.zza(z, "Must specify the data fields");
            return new DataTypeCreateRequest(this);
        }

        public Builder setName(String name) {
            this.mName = name;
            return this;
        }
    }

    DataTypeCreateRequest(int versionCode, String name, List<Field> fields, IBinder callback, String packageName) {
        this.zzCY = versionCode;
        this.mName = name;
        this.zzakq = Collections.unmodifiableList(fields);
        this.zzamk = callback == null ? null : zzmh.zza.zzbs(callback);
        this.zzMZ = packageName;
    }

    private DataTypeCreateRequest(Builder builder) {
        this(builder.mName, builder.zzakq, null, null);
    }

    public DataTypeCreateRequest(DataTypeCreateRequest request, zzmh callback, String packageName) {
        this(request.mName, request.zzakq, callback, packageName);
    }

    public DataTypeCreateRequest(String name, List<Field> fields, zzmh callback, String packageName) {
        this.zzCY = 2;
        this.mName = name;
        this.zzakq = Collections.unmodifiableList(fields);
        this.zzamk = callback;
        this.zzMZ = packageName;
    }

    private boolean zzb(DataTypeCreateRequest dataTypeCreateRequest) {
        return zzt.equal(this.mName, dataTypeCreateRequest.mName) && zzt.equal(this.zzakq, dataTypeCreateRequest.zzakq);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object o) {
        return o == this || ((o instanceof DataTypeCreateRequest) && zzb((DataTypeCreateRequest) o));
    }

    public List<Field> getFields() {
        return this.zzakq;
    }

    public String getName() {
        return this.mName;
    }

    public String getPackageName() {
        return this.zzMZ;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.zzCY;
    }

    public int hashCode() {
        return zzt.hashCode(this.mName, this.zzakq);
    }

    public String toString() {
        return zzt.zzt(this).zzg("name", this.mName).zzg("fields", this.zzakq).toString();
    }

    public void writeToParcel(Parcel dest, int flags) {
        zzi.zza(this, dest, flags);
    }

    public IBinder zzqU() {
        if (this.zzamk == null) {
            return null;
        }
        return this.zzamk.asBinder();
    }
}
