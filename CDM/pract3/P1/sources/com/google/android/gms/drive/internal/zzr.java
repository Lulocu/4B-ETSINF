package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zza;
import com.google.android.gms.drive.Drive;

public abstract class zzr<R extends Result> extends zza.AbstractC0027zza<R, zzs> {

    public static abstract class zza extends zzr<Status> {
        public zza(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* access modifiers changed from: protected */
        /* renamed from: zzb */
        public Status createFailedResult(Status status) {
            return status;
        }
    }

    public zzr(GoogleApiClient googleApiClient) {
        super(Drive.zzNX, googleApiClient);
    }
}
