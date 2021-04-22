package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.zzj;
import com.google.android.gms.internal.zzmu;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SensorRegistrationRequest implements SafeParcelable {
    public static final Parcelable.Creator<SensorRegistrationRequest> CREATOR = new zzs();
    private final PendingIntent mPendingIntent;
    private final int zzCY;
    private final String zzMZ;
    private final DataType zzajF;
    private final DataSource zzajG;
    private final long zzakP;
    private final int zzakQ;
    private final zzmu zzalN;
    private zzj zzamr;
    int zzams;
    int zzamt;
    private final long zzamu;
    private final long zzamv;
    private final List<LocationRequest> zzamw;
    private final long zzamx;
    private final List<Object> zzamy;

    SensorRegistrationRequest(int versionCode, DataSource dataSource, DataType dataType, IBinder listenerBinder, int samplingIntervalMicrosInt, int maxDeliveryLatencyMicrosInt, long samplingIntervalMicros, long maxDeliveryLatencyMicros, PendingIntent intent, long fastestIntervalMicros, int accuracyMode, List<LocationRequest> locationRequests, long registrationTimeOutMicros, IBinder callback, String packageName) {
        this.zzCY = versionCode;
        this.zzajG = dataSource;
        this.zzajF = dataType;
        this.zzamr = listenerBinder == null ? null : zzj.zza.zzbh(listenerBinder);
        this.zzakP = samplingIntervalMicros == 0 ? (long) samplingIntervalMicrosInt : samplingIntervalMicros;
        this.zzamv = fastestIntervalMicros;
        this.zzamu = maxDeliveryLatencyMicros == 0 ? (long) maxDeliveryLatencyMicrosInt : maxDeliveryLatencyMicros;
        this.zzamw = locationRequests;
        this.mPendingIntent = intent;
        this.zzakQ = accuracyMode;
        this.zzamy = Collections.emptyList();
        this.zzamx = registrationTimeOutMicros;
        this.zzalN = callback == null ? null : zzmu.zza.zzbF(callback);
        this.zzMZ = packageName;
    }

    public SensorRegistrationRequest(DataSource dataSource, DataType dataType, zzj listener, PendingIntent pendingIntent, long samplingIntervalMicros, long fastestIntervalMicros, long maxDeliveryLatencyMicros, int accuracyMode, List<LocationRequest> locationRequests, List<Object> list, long registrationTimeOutMicros, zzmu callback, String packageName) {
        this.zzCY = 5;
        this.zzajG = dataSource;
        this.zzajF = dataType;
        this.zzamr = listener;
        this.mPendingIntent = pendingIntent;
        this.zzakP = samplingIntervalMicros;
        this.zzamv = fastestIntervalMicros;
        this.zzamu = maxDeliveryLatencyMicros;
        this.zzakQ = accuracyMode;
        this.zzamw = locationRequests;
        this.zzamy = list;
        this.zzamx = registrationTimeOutMicros;
        this.zzalN = callback;
        this.zzMZ = packageName;
    }

    public SensorRegistrationRequest(SensorRequest request, zzj listener, PendingIntent intent, zzmu callback, String packageName) {
        this(request.getDataSource(), request.getDataType(), listener, intent, request.getSamplingRate(TimeUnit.MICROSECONDS), request.getFastestRate(TimeUnit.MICROSECONDS), request.getMaxDeliveryLatency(TimeUnit.MICROSECONDS), request.getAccuracyMode(), null, Collections.emptyList(), request.zzrm(), callback, packageName);
    }

    private boolean zzb(SensorRegistrationRequest sensorRegistrationRequest) {
        return zzt.equal(this.zzajG, sensorRegistrationRequest.zzajG) && zzt.equal(this.zzajF, sensorRegistrationRequest.zzajF) && this.zzakP == sensorRegistrationRequest.zzakP && this.zzamv == sensorRegistrationRequest.zzamv && this.zzamu == sensorRegistrationRequest.zzamu && this.zzakQ == sensorRegistrationRequest.zzakQ && zzt.equal(this.zzamw, sensorRegistrationRequest.zzamw);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object that) {
        return this == that || ((that instanceof SensorRegistrationRequest) && zzb((SensorRegistrationRequest) that));
    }

    public int getAccuracyMode() {
        return this.zzakQ;
    }

    public DataSource getDataSource() {
        return this.zzajG;
    }

    public DataType getDataType() {
        return this.zzajF;
    }

    public String getPackageName() {
        return this.zzMZ;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.zzCY;
    }

    public int hashCode() {
        return zzt.hashCode(this.zzajG, this.zzajF, this.zzamr, Long.valueOf(this.zzakP), Long.valueOf(this.zzamv), Long.valueOf(this.zzamu), Integer.valueOf(this.zzakQ), this.zzamw);
    }

    public String toString() {
        return String.format("SensorRegistrationRequest{type %s source %s interval %s fastest %s latency %s}", this.zzajF, this.zzajG, Long.valueOf(this.zzakP), Long.valueOf(this.zzamv), Long.valueOf(this.zzamu));
    }

    public void writeToParcel(Parcel parcel, int flags) {
        zzs.zza(this, parcel, flags);
    }

    public long zzqL() {
        return this.zzakP;
    }

    public IBinder zzqU() {
        if (this.zzalN == null) {
            return null;
        }
        return this.zzalN.asBinder();
    }

    public PendingIntent zzrg() {
        return this.mPendingIntent;
    }

    public long zzrh() {
        return this.zzamv;
    }

    public long zzri() {
        return this.zzamu;
    }

    public List<LocationRequest> zzrj() {
        return this.zzamw;
    }

    public long zzrk() {
        return this.zzamx;
    }

    /* access modifiers changed from: package-private */
    public IBinder zzrl() {
        if (this.zzamr == null) {
            return null;
        }
        return this.zzamr.asBinder();
    }
}
