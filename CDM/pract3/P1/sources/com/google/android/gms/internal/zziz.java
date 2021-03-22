package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.zziy;

public interface zziz extends IInterface {

    public static abstract class zza extends Binder implements zziz {

        /* access modifiers changed from: private */
        /* renamed from: com.google.android.gms.internal.zziz$zza$zza  reason: collision with other inner class name */
        public static class C0092zza implements zziz {
            private IBinder zznF;

            C0092zza(IBinder iBinder) {
                this.zznF = iBinder;
            }

            public IBinder asBinder() {
                return this.zznF;
            }

            @Override // com.google.android.gms.internal.zziz
            public void zza(zziy zziy, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appinvite.internal.IAppInviteService");
                    obtain.writeStrongBinder(zziy != null ? zziy.asBinder() : null);
                    obtain.writeString(str);
                    this.zznF.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.zziz
            public void zzb(zziy zziy, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appinvite.internal.IAppInviteService");
                    obtain.writeStrongBinder(zziy != null ? zziy.asBinder() : null);
                    obtain.writeString(str);
                    this.zznF.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static zziz zzai(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appinvite.internal.IAppInviteService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof zziz)) ? new C0092zza(iBinder) : (zziz) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch (code) {
                case 1:
                    data.enforceInterface("com.google.android.gms.appinvite.internal.IAppInviteService");
                    zzb(zziy.zza.zzah(data.readStrongBinder()), data.readString());
                    reply.writeNoException();
                    return true;
                case 2:
                    data.enforceInterface("com.google.android.gms.appinvite.internal.IAppInviteService");
                    zza(zziy.zza.zzah(data.readStrongBinder()), data.readString());
                    reply.writeNoException();
                    return true;
                case 1598968902:
                    reply.writeString("com.google.android.gms.appinvite.internal.IAppInviteService");
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }
    }

    void zza(zziy zziy, String str) throws RemoteException;

    void zzb(zziy zziy, String str) throws RemoteException;
}
