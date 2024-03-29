package com.google.android.gms.ads.internal.request;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.request.zzj;

public interface zzi extends IInterface {

    public static abstract class zza extends Binder implements zzi {

        /* access modifiers changed from: private */
        /* renamed from: com.google.android.gms.ads.internal.request.zzi$zza$zza  reason: collision with other inner class name */
        public static class C0013zza implements zzi {
            private IBinder zznF;

            C0013zza(IBinder iBinder) {
                this.zznF = iBinder;
            }

            public IBinder asBinder() {
                return this.zznF;
            }

            @Override // com.google.android.gms.ads.internal.request.zzi
            public void zza(AdRequestInfoParcel adRequestInfoParcel, zzj zzj) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.request.IAdRequestService");
                    if (adRequestInfoParcel != null) {
                        obtain.writeInt(1);
                        adRequestInfoParcel.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(zzj != null ? zzj.asBinder() : null);
                    this.zznF.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.ads.internal.request.zzi
            public AdResponseParcel zze(AdRequestInfoParcel adRequestInfoParcel) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.request.IAdRequestService");
                    if (adRequestInfoParcel != null) {
                        obtain.writeInt(1);
                        adRequestInfoParcel.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zznF.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? AdResponseParcel.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public zza() {
            attachInterface(this, "com.google.android.gms.ads.internal.request.IAdRequestService");
        }

        public static zzi zzU(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof zzi)) ? new C0013zza(iBinder) : (zzi) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            AdRequestInfoParcel adRequestInfoParcel = null;
            switch (code) {
                case 1:
                    data.enforceInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
                    if (data.readInt() != 0) {
                        adRequestInfoParcel = AdRequestInfoParcel.CREATOR.createFromParcel(data);
                    }
                    AdResponseParcel zze = zze(adRequestInfoParcel);
                    reply.writeNoException();
                    if (zze != null) {
                        reply.writeInt(1);
                        zze.writeToParcel(reply, 1);
                    } else {
                        reply.writeInt(0);
                    }
                    return true;
                case 2:
                    data.enforceInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
                    if (data.readInt() != 0) {
                        adRequestInfoParcel = AdRequestInfoParcel.CREATOR.createFromParcel(data);
                    }
                    zza(adRequestInfoParcel, zzj.zza.zzV(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case 1598968902:
                    reply.writeString("com.google.android.gms.ads.internal.request.IAdRequestService");
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }
    }

    void zza(AdRequestInfoParcel adRequestInfoParcel, zzj zzj) throws RemoteException;

    AdResponseParcel zze(AdRequestInfoParcel adRequestInfoParcel) throws RemoteException;
}
