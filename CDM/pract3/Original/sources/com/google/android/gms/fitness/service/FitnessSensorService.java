package com.google.android.gms.fitness.service;

import android.app.AppOpsManager;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.internal.service.FitnessDataSourcesRequest;
import com.google.android.gms.fitness.internal.service.FitnessUnregistrationRequest;
import com.google.android.gms.fitness.internal.service.zzc;
import com.google.android.gms.fitness.result.DataSourcesResult;
import com.google.android.gms.internal.zzlk;
import com.google.android.gms.internal.zzmg;
import com.google.android.gms.internal.zzmu;
import java.util.List;

public abstract class FitnessSensorService extends Service {
    public static final String SERVICE_INTERFACE = "com.google.android.gms.fitness.service.FitnessSensorService";
    private zza zzamY;

    private static class zza extends zzc.zza {
        private final FitnessSensorService zzamZ;

        private zza(FitnessSensorService fitnessSensorService) {
            this.zzamZ = fitnessSensorService;
        }

        @Override // com.google.android.gms.fitness.internal.service.zzc
        public void zza(FitnessDataSourcesRequest fitnessDataSourcesRequest, zzmg zzmg) throws RemoteException {
            this.zzamZ.zzrA();
            zzmg.zza(new DataSourcesResult(this.zzamZ.onFindDataSources(fitnessDataSourcesRequest.getDataTypes()), Status.zzXP));
        }

        @Override // com.google.android.gms.fitness.internal.service.zzc
        public void zza(FitnessUnregistrationRequest fitnessUnregistrationRequest, zzmu zzmu) throws RemoteException {
            this.zzamZ.zzrA();
            if (this.zzamZ.onUnregister(fitnessUnregistrationRequest.getDataSource())) {
                zzmu.zzm(Status.zzXP);
            } else {
                zzmu.zzm(new Status(13));
            }
        }

        @Override // com.google.android.gms.fitness.internal.service.zzc
        public void zza(FitnessSensorServiceRequest fitnessSensorServiceRequest, zzmu zzmu) throws RemoteException {
            this.zzamZ.zzrA();
            if (this.zzamZ.onRegister(fitnessSensorServiceRequest)) {
                zzmu.zzm(Status.zzXP);
            } else {
                zzmu.zzm(new Status(13));
            }
        }
    }

    public final IBinder onBind(Intent intent) {
        if (!SERVICE_INTERFACE.equals(intent.getAction())) {
            return null;
        }
        if (Log.isLoggable("FitnessSensorService", 3)) {
            Log.d("FitnessSensorService", "Intent " + intent + " received by " + getClass().getName());
        }
        return this.zzamY.asBinder();
    }

    public void onCreate() {
        super.onCreate();
        this.zzamY = new zza();
    }

    public abstract List<DataSource> onFindDataSources(List<DataType> list);

    public abstract boolean onRegister(FitnessSensorServiceRequest fitnessSensorServiceRequest);

    public abstract boolean onUnregister(DataSource dataSource);

    /* access modifiers changed from: protected */
    public void zzrA() throws SecurityException {
        int callingUid = Binder.getCallingUid();
        if (zzlk.zzoX()) {
            ((AppOpsManager) getSystemService("appops")).checkPackage(callingUid, "com.google.android.gms");
            return;
        }
        String[] packagesForUid = getPackageManager().getPackagesForUid(callingUid);
        if (packagesForUid != null) {
            for (String str : packagesForUid) {
                if (str.equals("com.google.android.gms")) {
                    return;
                }
            }
        }
        throw new SecurityException("Unauthorized caller");
    }
}
