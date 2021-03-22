package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.internal.zzef;

public interface zzs extends IInterface {

    public static abstract class zza extends Binder implements zzs {

        /* access modifiers changed from: private */
        /* renamed from: com.google.android.gms.ads.internal.client.zzs$zza$zza  reason: collision with other inner class name */
        public static class C0006zza implements zzs {
            private IBinder zznF;

            C0006zza(IBinder iBinder) {
                this.zznF = iBinder;
            }

            public IBinder asBinder() {
                return this.zznF;
            }

            @Override // com.google.android.gms.ads.internal.client.zzs
            public IBinder zza(zzd zzd, AdSizeParcel adSizeParcel, String str, zzef zzef, int i) throws RemoteException {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    obtain.writeStrongBinder(zzd != null ? zzd.asBinder() : null);
                    if (adSizeParcel != null) {
                        obtain.writeInt(1);
                        adSizeParcel.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    if (zzef != null) {
                        iBinder = zzef.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i);
                    this.zznF.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.ads.internal.client.zzs
            public IBinder zza(zzd zzd, AdSizeParcel adSizeParcel, String str, zzef zzef, int i, int i2) throws RemoteException {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    obtain.writeStrongBinder(zzd != null ? zzd.asBinder() : null);
                    if (adSizeParcel != null) {
                        obtain.writeInt(1);
                        adSizeParcel.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    if (zzef != null) {
                        iBinder = zzef.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.zznF.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static zzs zzl(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof zzs)) ? new C0006zza(iBinder) : (zzs) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            AdSizeParcel adSizeParcel = null;
            switch (code) {
                case 1:
                    data.enforceInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    zzd zzbg = zzd.zza.zzbg(data.readStrongBinder());
                    if (data.readInt() != 0) {
                        adSizeParcel = AdSizeParcel.CREATOR.createFromParcel(data);
                    }
                    IBinder zza = zza(zzbg, adSizeParcel, data.readString(), zzef.zza.zzE(data.readStrongBinder()), data.readInt());
                    reply.writeNoException();
                    reply.writeStrongBinder(zza);
                    return true;
                case 2:
                    data.enforceInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    zzd zzbg2 = zzd.zza.zzbg(data.readStrongBinder());
                    if (data.readInt() != 0) {
                        adSizeParcel = AdSizeParcel.CREATOR.createFromParcel(data);
                    }
                    IBinder zza2 = zza(zzbg2, adSizeParcel, data.readString(), zzef.zza.zzE(data.readStrongBinder()), data.readInt(), data.readInt());
                    reply.writeNoException();
                    reply.writeStrongBinder(zza2);
                    return true;
                case 1598968902:
                    reply.writeString("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }
    }

    IBinder zza(zzd zzd, AdSizeParcel adSizeParcel, String str, zzef zzef, int i) throws RemoteException;

    IBinder zza(zzd zzd, AdSizeParcel adSizeParcel, String str, zzef zzef, int i, int i2) throws RemoteException;
}
