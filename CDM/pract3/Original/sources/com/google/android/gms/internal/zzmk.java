package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fitness.request.DailyTotalRequest;
import com.google.android.gms.fitness.request.DataDeleteRequest;
import com.google.android.gms.fitness.request.DataInsertRequest;
import com.google.android.gms.fitness.request.DataReadRequest;
import com.google.android.gms.fitness.request.GetSyncInfoRequest;
import com.google.android.gms.fitness.request.ReadRawRequest;
import com.google.android.gms.fitness.request.ReadStatsRequest;

public interface zzmk extends IInterface {

    public static abstract class zza extends Binder implements zzmk {

        /* access modifiers changed from: private */
        /* renamed from: com.google.android.gms.internal.zzmk$zza$zza  reason: collision with other inner class name */
        public static class C0113zza implements zzmk {
            private IBinder zznF;

            C0113zza(IBinder iBinder) {
                this.zznF = iBinder;
            }

            public IBinder asBinder() {
                return this.zznF;
            }

            @Override // com.google.android.gms.internal.zzmk
            public void zza(DailyTotalRequest dailyTotalRequest) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if (dailyTotalRequest != null) {
                        obtain.writeInt(1);
                        dailyTotalRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zznF.transact(7, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.zzmk
            public void zza(DataDeleteRequest dataDeleteRequest) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if (dataDeleteRequest != null) {
                        obtain.writeInt(1);
                        dataDeleteRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zznF.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.zzmk
            public void zza(DataInsertRequest dataInsertRequest) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if (dataInsertRequest != null) {
                        obtain.writeInt(1);
                        dataInsertRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zznF.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.zzmk
            public void zza(DataReadRequest dataReadRequest) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if (dataReadRequest != null) {
                        obtain.writeInt(1);
                        dataReadRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zznF.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.zzmk
            public void zza(GetSyncInfoRequest getSyncInfoRequest) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if (getSyncInfoRequest != null) {
                        obtain.writeInt(1);
                        getSyncInfoRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zznF.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.zzmk
            public void zza(ReadRawRequest readRawRequest) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if (readRawRequest != null) {
                        obtain.writeInt(1);
                        readRawRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zznF.transact(6, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.zzmk
            public void zza(ReadStatsRequest readStatsRequest) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if (readStatsRequest != null) {
                        obtain.writeInt(1);
                        readStatsRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zznF.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static zzmk zzbv(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof zzmk)) ? new C0113zza(iBinder) : (zzmk) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            DailyTotalRequest dailyTotalRequest = null;
            DataReadRequest dataReadRequest = null;
            DataInsertRequest dataInsertRequest = null;
            DataDeleteRequest dataDeleteRequest = null;
            GetSyncInfoRequest getSyncInfoRequest = null;
            ReadStatsRequest readStatsRequest = null;
            ReadRawRequest readRawRequest = null;
            switch (code) {
                case 1:
                    data.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if (data.readInt() != 0) {
                        dataReadRequest = DataReadRequest.CREATOR.createFromParcel(data);
                    }
                    zza(dataReadRequest);
                    return true;
                case 2:
                    data.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if (data.readInt() != 0) {
                        dataInsertRequest = DataInsertRequest.CREATOR.createFromParcel(data);
                    }
                    zza(dataInsertRequest);
                    return true;
                case 3:
                    data.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if (data.readInt() != 0) {
                        dataDeleteRequest = DataDeleteRequest.CREATOR.createFromParcel(data);
                    }
                    zza(dataDeleteRequest);
                    return true;
                case 4:
                    data.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if (data.readInt() != 0) {
                        getSyncInfoRequest = GetSyncInfoRequest.CREATOR.createFromParcel(data);
                    }
                    zza(getSyncInfoRequest);
                    return true;
                case 5:
                    data.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if (data.readInt() != 0) {
                        readStatsRequest = ReadStatsRequest.CREATOR.createFromParcel(data);
                    }
                    zza(readStatsRequest);
                    return true;
                case 6:
                    data.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if (data.readInt() != 0) {
                        readRawRequest = ReadRawRequest.CREATOR.createFromParcel(data);
                    }
                    zza(readRawRequest);
                    return true;
                case 7:
                    data.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if (data.readInt() != 0) {
                        dailyTotalRequest = DailyTotalRequest.CREATOR.createFromParcel(data);
                    }
                    zza(dailyTotalRequest);
                    return true;
                case 1598968902:
                    reply.writeString("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }
    }

    void zza(DailyTotalRequest dailyTotalRequest) throws RemoteException;

    void zza(DataDeleteRequest dataDeleteRequest) throws RemoteException;

    void zza(DataInsertRequest dataInsertRequest) throws RemoteException;

    void zza(DataReadRequest dataReadRequest) throws RemoteException;

    void zza(GetSyncInfoRequest getSyncInfoRequest) throws RemoteException;

    void zza(ReadRawRequest readRawRequest) throws RemoteException;

    void zza(ReadStatsRequest readStatsRequest) throws RemoteException;
}
