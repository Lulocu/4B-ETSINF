package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.internal.ILocationSourceDelegate;
import com.google.android.gms.maps.internal.IProjectionDelegate;
import com.google.android.gms.maps.internal.IUiSettingsDelegate;
import com.google.android.gms.maps.internal.zzb;
import com.google.android.gms.maps.internal.zzd;
import com.google.android.gms.maps.internal.zze;
import com.google.android.gms.maps.internal.zzf;
import com.google.android.gms.maps.internal.zzg;
import com.google.android.gms.maps.internal.zzh;
import com.google.android.gms.maps.internal.zzj;
import com.google.android.gms.maps.internal.zzk;
import com.google.android.gms.maps.internal.zzl;
import com.google.android.gms.maps.internal.zzm;
import com.google.android.gms.maps.internal.zzn;
import com.google.android.gms.maps.internal.zzo;
import com.google.android.gms.maps.internal.zzp;
import com.google.android.gms.maps.internal.zzq;
import com.google.android.gms.maps.internal.zzw;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.internal.CameraUpdateParcelable;
import com.google.android.gms.maps.model.internal.GroundOverlayOptionsParcelable;
import com.google.android.gms.maps.model.internal.IPolylineDelegate;
import com.google.android.gms.maps.model.internal.MarkerOptionsParcelable;
import com.google.android.gms.maps.model.internal.zze;
import com.google.android.gms.maps.model.internal.zzf;
import com.google.android.gms.maps.model.internal.zzg;
import com.google.android.gms.maps.model.internal.zzi;
import com.google.android.gms.maps.model.internal.zzj;
import com.google.android.gms.maps.model.internal.zzk;

public interface IGoogleMapDelegate extends IInterface {

    public static abstract class zza extends Binder implements IGoogleMapDelegate {

        /* renamed from: com.google.android.gms.maps.internal.IGoogleMapDelegate$zza$zza  reason: collision with other inner class name */
        private static class C0163zza implements IGoogleMapDelegate {
            private IBinder zznF;

            C0163zza(IBinder iBinder) {
                this.zznF = iBinder;
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public zze addCircle(CircleOptions options) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (options != null) {
                        obtain.writeInt(1);
                        options.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zznF.transact(35, obtain, obtain2, 0);
                    obtain2.readException();
                    return zze.zza.zzcL(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public zzf addGroundOverlay(GroundOverlayOptions options) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (options != null) {
                        obtain.writeInt(1);
                        options.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zznF.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    return zzf.zza.zzcM(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public zzf addGroundOverlay2(GroundOverlayOptions options, GroundOverlayOptionsParcelable parcelableOptions) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (options != null) {
                        obtain.writeInt(1);
                        options.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (parcelableOptions != null) {
                        obtain.writeInt(1);
                        parcelableOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zznF.transact(70, obtain, obtain2, 0);
                    obtain2.readException();
                    return zzf.zza.zzcM(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public zzi addMarker(MarkerOptions options) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (options != null) {
                        obtain.writeInt(1);
                        options.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zznF.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    return zzi.zza.zzcP(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public zzi addMarker2(MarkerOptions options, MarkerOptionsParcelable parcelableOptions) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (options != null) {
                        obtain.writeInt(1);
                        options.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (parcelableOptions != null) {
                        obtain.writeInt(1);
                        parcelableOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zznF.transact(68, obtain, obtain2, 0);
                    obtain2.readException();
                    return zzi.zza.zzcP(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public zzj addPolygon(PolygonOptions options) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (options != null) {
                        obtain.writeInt(1);
                        options.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zznF.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return zzj.zza.zzcQ(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public IPolylineDelegate addPolyline(PolylineOptions options) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (options != null) {
                        obtain.writeInt(1);
                        options.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zznF.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return IPolylineDelegate.zza.zzcR(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public zzk addTileOverlay(TileOverlayOptions options) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (options != null) {
                        obtain.writeInt(1);
                        options.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zznF.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    return zzk.zza.zzcS(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void animateCamera(zzd update) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(update != null ? update.asBinder() : null);
                    this.zznF.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void animateCamera2(CameraUpdateParcelable update) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (update != null) {
                        obtain.writeInt(1);
                        update.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zznF.transact(65, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void animateCameraWithCallback(zzd update, zzb callback) throws RemoteException {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(update != null ? update.asBinder() : null);
                    if (callback != null) {
                        iBinder = callback.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.zznF.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void animateCameraWithCallback2(CameraUpdateParcelable update, zzb callback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (update != null) {
                        obtain.writeInt(1);
                        update.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    this.zznF.transact(66, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void animateCameraWithDurationAndCallback(zzd update, int durationMs, zzb callback) throws RemoteException {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(update != null ? update.asBinder() : null);
                    obtain.writeInt(durationMs);
                    if (callback != null) {
                        iBinder = callback.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.zznF.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void animateCameraWithDurationAndCallback2(CameraUpdateParcelable update, int durationMs, zzb callback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (update != null) {
                        obtain.writeInt(1);
                        update.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(durationMs);
                    obtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    this.zznF.transact(67, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.zznF;
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void clear() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.zznF.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public CameraPosition getCameraPosition() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.zznF.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? CameraPosition.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public zzg getFocusedBuilding() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.zznF.transact(44, obtain, obtain2, 0);
                    obtain2.readException();
                    return zzg.zza.zzcN(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void getMapAsync(zzm callback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    this.zznF.transact(53, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public int getMapType() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.zznF.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public float getMaxZoomLevel() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.zznF.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readFloat();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public float getMinZoomLevel() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.zznF.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readFloat();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public Location getMyLocation() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.zznF.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Location) Location.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public IProjectionDelegate getProjection() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.zznF.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                    return IProjectionDelegate.zza.zzcE(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public IUiSettingsDelegate getUiSettings() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.zznF.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                    return IUiSettingsDelegate.zza.zzcJ(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public boolean isBuildingsEnabled() throws RemoteException {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.zznF.transact(40, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public boolean isIndoorEnabled() throws RemoteException {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.zznF.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public boolean isMyLocationEnabled() throws RemoteException {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.zznF.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public boolean isTrafficEnabled() throws RemoteException {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.zznF.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void moveCamera(zzd update) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(update != null ? update.asBinder() : null);
                    this.zznF.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void moveCamera2(CameraUpdateParcelable update) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (update != null) {
                        obtain.writeInt(1);
                        update.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zznF.transact(64, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void onCreate(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zznF.transact(54, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void onDestroy() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.zznF.transact(57, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void onLowMemory() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.zznF.transact(58, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void onPause() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.zznF.transact(56, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void onResume() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.zznF.transact(55, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void onSaveInstanceState(Bundle outState) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (outState != null) {
                        obtain.writeInt(1);
                        outState.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zznF.transact(60, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        outState.readFromParcel(obtain2);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setBuildingsEnabled(boolean enabled) throws RemoteException {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (enabled) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.zznF.transact(41, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setContentDescription(String description) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeString(description);
                    this.zznF.transact(61, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public boolean setIndoorEnabled(boolean enabled) throws RemoteException {
                boolean z = true;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeInt(enabled ? 1 : 0);
                    this.zznF.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setInfoWindowAdapter(zzd adapter) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(adapter != null ? adapter.asBinder() : null);
                    this.zznF.transact(33, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setInfoWindowRenderer(zze infoWindowRenderer) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(infoWindowRenderer != null ? infoWindowRenderer.asBinder() : null);
                    this.zznF.transact(69, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setLocationSource(ILocationSourceDelegate source) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(source != null ? source.asBinder() : null);
                    this.zznF.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setMapType(int type) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeInt(type);
                    this.zznF.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setMyLocationEnabled(boolean enabled) throws RemoteException {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (enabled) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.zznF.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnCameraChangeListener(zzf listener) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(listener != null ? listener.asBinder() : null);
                    this.zznF.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnIndoorStateChangeListener(zzg listener) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(listener != null ? listener.asBinder() : null);
                    this.zznF.transact(45, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnInfoWindowClickListener(zzh listener) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(listener != null ? listener.asBinder() : null);
                    this.zznF.transact(32, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnMapClickListener(zzj listener) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(listener != null ? listener.asBinder() : null);
                    this.zznF.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnMapLoadedCallback(zzk callback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    this.zznF.transact(42, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnMapLongClickListener(zzl listener) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(listener != null ? listener.asBinder() : null);
                    this.zznF.transact(29, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnMarkerClickListener(zzn listener) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(listener != null ? listener.asBinder() : null);
                    this.zznF.transact(30, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnMarkerDragListener(zzo listener) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(listener != null ? listener.asBinder() : null);
                    this.zznF.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnMyLocationButtonClickListener(zzp listener) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(listener != null ? listener.asBinder() : null);
                    this.zznF.transact(37, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnMyLocationChangeListener(zzq listener) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(listener != null ? listener.asBinder() : null);
                    this.zznF.transact(36, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setPadding(int left, int top, int right, int bottom) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeInt(left);
                    obtain.writeInt(top);
                    obtain.writeInt(right);
                    obtain.writeInt(bottom);
                    this.zznF.transact(39, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setTrafficEnabled(boolean enabled) throws RemoteException {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (enabled) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.zznF.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void snapshot(zzw callback, zzd bitmap) throws RemoteException {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (bitmap != null) {
                        iBinder = bitmap.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.zznF.transact(38, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void stopAnimation() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.zznF.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public boolean useViewLifecycleWhenInFragment() throws RemoteException {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.zznF.transact(59, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static IGoogleMapDelegate zzch(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IGoogleMapDelegate)) ? new C0163zza(iBinder) : (IGoogleMapDelegate) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            int i = 0;
            boolean z = false;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            boolean z2 = false;
            int i5 = 0;
            boolean z3 = false;
            IBinder iBinder = null;
            IBinder iBinder2 = null;
            IBinder iBinder3 = null;
            IBinder iBinder4 = null;
            IBinder iBinder5 = null;
            IBinder iBinder6 = null;
            IBinder iBinder7 = null;
            IBinder iBinder8 = null;
            IBinder iBinder9 = null;
            IBinder iBinder10 = null;
            CameraUpdateParcelable cameraUpdateParcelable = null;
            CameraUpdateParcelable cameraUpdateParcelable2 = null;
            CameraUpdateParcelable cameraUpdateParcelable3 = null;
            CameraUpdateParcelable cameraUpdateParcelable4 = null;
            IBinder iBinder11 = null;
            switch (code) {
                case 1:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    CameraPosition cameraPosition = getCameraPosition();
                    reply.writeNoException();
                    if (cameraPosition != null) {
                        reply.writeInt(1);
                        cameraPosition.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                case 2:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    float maxZoomLevel = getMaxZoomLevel();
                    reply.writeNoException();
                    reply.writeFloat(maxZoomLevel);
                    return true;
                case 3:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    float minZoomLevel = getMinZoomLevel();
                    reply.writeNoException();
                    reply.writeFloat(minZoomLevel);
                    return true;
                case 4:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    moveCamera(zzd.zza.zzbg(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case 5:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    animateCamera(zzd.zza.zzbg(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case 6:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    animateCameraWithCallback(zzd.zza.zzbg(data.readStrongBinder()), zzb.zza.zzcf(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case 7:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    animateCameraWithDurationAndCallback(zzd.zza.zzbg(data.readStrongBinder()), data.readInt(), zzb.zza.zzcf(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case 8:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    stopAnimation();
                    reply.writeNoException();
                    return true;
                case 9:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    IPolylineDelegate addPolyline = addPolyline(data.readInt() != 0 ? PolylineOptions.CREATOR.createFromParcel(data) : null);
                    reply.writeNoException();
                    if (addPolyline != null) {
                        iBinder2 = addPolyline.asBinder();
                    }
                    reply.writeStrongBinder(iBinder2);
                    return true;
                case 10:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    zzj addPolygon = addPolygon(data.readInt() != 0 ? PolygonOptions.CREATOR.createFromParcel(data) : null);
                    reply.writeNoException();
                    if (addPolygon != null) {
                        iBinder3 = addPolygon.asBinder();
                    }
                    reply.writeStrongBinder(iBinder3);
                    return true;
                case 11:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    zzi addMarker = addMarker(data.readInt() != 0 ? MarkerOptions.CREATOR.createFromParcel(data) : null);
                    reply.writeNoException();
                    if (addMarker != null) {
                        iBinder4 = addMarker.asBinder();
                    }
                    reply.writeStrongBinder(iBinder4);
                    return true;
                case 12:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    zzf addGroundOverlay = addGroundOverlay(data.readInt() != 0 ? GroundOverlayOptions.CREATOR.createFromParcel(data) : null);
                    reply.writeNoException();
                    if (addGroundOverlay != null) {
                        iBinder5 = addGroundOverlay.asBinder();
                    }
                    reply.writeStrongBinder(iBinder5);
                    return true;
                case 13:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    zzk addTileOverlay = addTileOverlay(data.readInt() != 0 ? TileOverlayOptions.CREATOR.createFromParcel(data) : null);
                    reply.writeNoException();
                    if (addTileOverlay != null) {
                        iBinder6 = addTileOverlay.asBinder();
                    }
                    reply.writeStrongBinder(iBinder6);
                    return true;
                case 14:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    clear();
                    reply.writeNoException();
                    return true;
                case 15:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    int mapType = getMapType();
                    reply.writeNoException();
                    reply.writeInt(mapType);
                    return true;
                case 16:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    setMapType(data.readInt());
                    reply.writeNoException();
                    return true;
                case 17:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    boolean isTrafficEnabled = isTrafficEnabled();
                    reply.writeNoException();
                    reply.writeInt(isTrafficEnabled ? 1 : 0);
                    return true;
                case 18:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (data.readInt() != 0) {
                        z = true;
                    }
                    setTrafficEnabled(z);
                    reply.writeNoException();
                    return true;
                case 19:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    boolean isIndoorEnabled = isIndoorEnabled();
                    reply.writeNoException();
                    if (isIndoorEnabled) {
                        i2 = 1;
                    }
                    reply.writeInt(i2);
                    return true;
                case 20:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    boolean indoorEnabled = setIndoorEnabled(data.readInt() != 0);
                    reply.writeNoException();
                    if (indoorEnabled) {
                        i3 = 1;
                    }
                    reply.writeInt(i3);
                    return true;
                case 21:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    boolean isMyLocationEnabled = isMyLocationEnabled();
                    reply.writeNoException();
                    if (isMyLocationEnabled) {
                        i4 = 1;
                    }
                    reply.writeInt(i4);
                    return true;
                case 22:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (data.readInt() != 0) {
                        z2 = true;
                    }
                    setMyLocationEnabled(z2);
                    reply.writeNoException();
                    return true;
                case 23:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    Location myLocation = getMyLocation();
                    reply.writeNoException();
                    if (myLocation != null) {
                        reply.writeInt(1);
                        myLocation.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                case 24:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    setLocationSource(ILocationSourceDelegate.zza.zzck(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case 25:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    IUiSettingsDelegate uiSettings = getUiSettings();
                    reply.writeNoException();
                    if (uiSettings != null) {
                        iBinder7 = uiSettings.asBinder();
                    }
                    reply.writeStrongBinder(iBinder7);
                    return true;
                case 26:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    IProjectionDelegate projection = getProjection();
                    reply.writeNoException();
                    if (projection != null) {
                        iBinder8 = projection.asBinder();
                    }
                    reply.writeStrongBinder(iBinder8);
                    return true;
                case 27:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    setOnCameraChangeListener(zzf.zza.zzcn(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case 28:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    setOnMapClickListener(zzj.zza.zzcr(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case 29:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    setOnMapLongClickListener(zzl.zza.zzct(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case 30:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    setOnMarkerClickListener(zzn.zza.zzcv(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case 31:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    setOnMarkerDragListener(zzo.zza.zzcw(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case 32:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    setOnInfoWindowClickListener(zzh.zza.zzcp(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case 33:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    setInfoWindowAdapter(zzd.zza.zzci(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case 35:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    zze addCircle = addCircle(data.readInt() != 0 ? CircleOptions.CREATOR.createFromParcel(data) : null);
                    reply.writeNoException();
                    if (addCircle != null) {
                        iBinder9 = addCircle.asBinder();
                    }
                    reply.writeStrongBinder(iBinder9);
                    return true;
                case 36:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    setOnMyLocationChangeListener(zzq.zza.zzcy(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case 37:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    setOnMyLocationButtonClickListener(zzp.zza.zzcx(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case 38:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    snapshot(zzw.zza.zzcF(data.readStrongBinder()), zzd.zza.zzbg(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case 39:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    setPadding(data.readInt(), data.readInt(), data.readInt(), data.readInt());
                    reply.writeNoException();
                    return true;
                case 40:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    boolean isBuildingsEnabled = isBuildingsEnabled();
                    reply.writeNoException();
                    if (isBuildingsEnabled) {
                        i5 = 1;
                    }
                    reply.writeInt(i5);
                    return true;
                case 41:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (data.readInt() != 0) {
                        z3 = true;
                    }
                    setBuildingsEnabled(z3);
                    reply.writeNoException();
                    return true;
                case 42:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    setOnMapLoadedCallback(zzk.zza.zzcs(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case 44:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    zzg focusedBuilding = getFocusedBuilding();
                    reply.writeNoException();
                    if (focusedBuilding != null) {
                        iBinder10 = focusedBuilding.asBinder();
                    }
                    reply.writeStrongBinder(iBinder10);
                    return true;
                case 45:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    setOnIndoorStateChangeListener(zzg.zza.zzco(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case 53:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    getMapAsync(zzm.zza.zzcu(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case 54:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    onCreate(data.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(data) : null);
                    reply.writeNoException();
                    return true;
                case 55:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    onResume();
                    reply.writeNoException();
                    return true;
                case 56:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    onPause();
                    reply.writeNoException();
                    return true;
                case 57:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    onDestroy();
                    reply.writeNoException();
                    return true;
                case 58:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    onLowMemory();
                    reply.writeNoException();
                    return true;
                case 59:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    boolean useViewLifecycleWhenInFragment = useViewLifecycleWhenInFragment();
                    reply.writeNoException();
                    if (useViewLifecycleWhenInFragment) {
                        i = 1;
                    }
                    reply.writeInt(i);
                    return true;
                case 60:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    Bundle bundle = data.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(data) : null;
                    onSaveInstanceState(bundle);
                    reply.writeNoException();
                    if (bundle != null) {
                        reply.writeInt(1);
                        bundle.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                case 61:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    setContentDescription(data.readString());
                    reply.writeNoException();
                    return true;
                case 64:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (data.readInt() != 0) {
                        cameraUpdateParcelable = CameraUpdateParcelable.CREATOR.createFromParcel(data);
                    }
                    moveCamera2(cameraUpdateParcelable);
                    reply.writeNoException();
                    return true;
                case 65:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (data.readInt() != 0) {
                        cameraUpdateParcelable2 = CameraUpdateParcelable.CREATOR.createFromParcel(data);
                    }
                    animateCamera2(cameraUpdateParcelable2);
                    reply.writeNoException();
                    return true;
                case 66:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (data.readInt() != 0) {
                        cameraUpdateParcelable3 = CameraUpdateParcelable.CREATOR.createFromParcel(data);
                    }
                    animateCameraWithCallback2(cameraUpdateParcelable3, zzb.zza.zzcf(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case 67:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (data.readInt() != 0) {
                        cameraUpdateParcelable4 = CameraUpdateParcelable.CREATOR.createFromParcel(data);
                    }
                    animateCameraWithDurationAndCallback2(cameraUpdateParcelable4, data.readInt(), zzb.zza.zzcf(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case 68:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    zzi addMarker2 = addMarker2(data.readInt() != 0 ? MarkerOptions.CREATOR.createFromParcel(data) : null, data.readInt() != 0 ? MarkerOptionsParcelable.CREATOR.createFromParcel(data) : null);
                    reply.writeNoException();
                    if (addMarker2 != null) {
                        iBinder11 = addMarker2.asBinder();
                    }
                    reply.writeStrongBinder(iBinder11);
                    return true;
                case 69:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    setInfoWindowRenderer(zze.zza.zzcj(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case 70:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    com.google.android.gms.maps.model.internal.zzf addGroundOverlay2 = addGroundOverlay2(data.readInt() != 0 ? GroundOverlayOptions.CREATOR.createFromParcel(data) : null, data.readInt() != 0 ? GroundOverlayOptionsParcelable.CREATOR.createFromParcel(data) : null);
                    reply.writeNoException();
                    if (addGroundOverlay2 != null) {
                        iBinder = addGroundOverlay2.asBinder();
                    }
                    reply.writeStrongBinder(iBinder);
                    return true;
                case 1598968902:
                    reply.writeString("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }
    }

    com.google.android.gms.maps.model.internal.zze addCircle(CircleOptions circleOptions) throws RemoteException;

    com.google.android.gms.maps.model.internal.zzf addGroundOverlay(GroundOverlayOptions groundOverlayOptions) throws RemoteException;

    com.google.android.gms.maps.model.internal.zzf addGroundOverlay2(GroundOverlayOptions groundOverlayOptions, GroundOverlayOptionsParcelable groundOverlayOptionsParcelable) throws RemoteException;

    zzi addMarker(MarkerOptions markerOptions) throws RemoteException;

    zzi addMarker2(MarkerOptions markerOptions, MarkerOptionsParcelable markerOptionsParcelable) throws RemoteException;

    com.google.android.gms.maps.model.internal.zzj addPolygon(PolygonOptions polygonOptions) throws RemoteException;

    IPolylineDelegate addPolyline(PolylineOptions polylineOptions) throws RemoteException;

    com.google.android.gms.maps.model.internal.zzk addTileOverlay(TileOverlayOptions tileOverlayOptions) throws RemoteException;

    void animateCamera(com.google.android.gms.dynamic.zzd zzd) throws RemoteException;

    void animateCamera2(CameraUpdateParcelable cameraUpdateParcelable) throws RemoteException;

    void animateCameraWithCallback(com.google.android.gms.dynamic.zzd zzd, zzb zzb) throws RemoteException;

    void animateCameraWithCallback2(CameraUpdateParcelable cameraUpdateParcelable, zzb zzb) throws RemoteException;

    void animateCameraWithDurationAndCallback(com.google.android.gms.dynamic.zzd zzd, int i, zzb zzb) throws RemoteException;

    void animateCameraWithDurationAndCallback2(CameraUpdateParcelable cameraUpdateParcelable, int i, zzb zzb) throws RemoteException;

    void clear() throws RemoteException;

    CameraPosition getCameraPosition() throws RemoteException;

    com.google.android.gms.maps.model.internal.zzg getFocusedBuilding() throws RemoteException;

    void getMapAsync(zzm zzm) throws RemoteException;

    int getMapType() throws RemoteException;

    float getMaxZoomLevel() throws RemoteException;

    float getMinZoomLevel() throws RemoteException;

    Location getMyLocation() throws RemoteException;

    IProjectionDelegate getProjection() throws RemoteException;

    IUiSettingsDelegate getUiSettings() throws RemoteException;

    boolean isBuildingsEnabled() throws RemoteException;

    boolean isIndoorEnabled() throws RemoteException;

    boolean isMyLocationEnabled() throws RemoteException;

    boolean isTrafficEnabled() throws RemoteException;

    void moveCamera(com.google.android.gms.dynamic.zzd zzd) throws RemoteException;

    void moveCamera2(CameraUpdateParcelable cameraUpdateParcelable) throws RemoteException;

    void onCreate(Bundle bundle) throws RemoteException;

    void onDestroy() throws RemoteException;

    void onLowMemory() throws RemoteException;

    void onPause() throws RemoteException;

    void onResume() throws RemoteException;

    void onSaveInstanceState(Bundle bundle) throws RemoteException;

    void setBuildingsEnabled(boolean z) throws RemoteException;

    void setContentDescription(String str) throws RemoteException;

    boolean setIndoorEnabled(boolean z) throws RemoteException;

    void setInfoWindowAdapter(zzd zzd) throws RemoteException;

    void setInfoWindowRenderer(zze zze) throws RemoteException;

    void setLocationSource(ILocationSourceDelegate iLocationSourceDelegate) throws RemoteException;

    void setMapType(int i) throws RemoteException;

    void setMyLocationEnabled(boolean z) throws RemoteException;

    void setOnCameraChangeListener(zzf zzf) throws RemoteException;

    void setOnIndoorStateChangeListener(zzg zzg) throws RemoteException;

    void setOnInfoWindowClickListener(zzh zzh) throws RemoteException;

    void setOnMapClickListener(zzj zzj) throws RemoteException;

    void setOnMapLoadedCallback(zzk zzk) throws RemoteException;

    void setOnMapLongClickListener(zzl zzl) throws RemoteException;

    void setOnMarkerClickListener(zzn zzn) throws RemoteException;

    void setOnMarkerDragListener(zzo zzo) throws RemoteException;

    void setOnMyLocationButtonClickListener(zzp zzp) throws RemoteException;

    void setOnMyLocationChangeListener(zzq zzq) throws RemoteException;

    void setPadding(int i, int i2, int i3, int i4) throws RemoteException;

    void setTrafficEnabled(boolean z) throws RemoteException;

    void snapshot(zzw zzw, com.google.android.gms.dynamic.zzd zzd) throws RemoteException;

    void stopAnimation() throws RemoteException;

    boolean useViewLifecycleWhenInFragment() throws RemoteException;
}
