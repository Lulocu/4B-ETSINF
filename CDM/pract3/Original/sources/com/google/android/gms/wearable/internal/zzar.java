package com.google.android.gms.wearable.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

public interface zzar extends IInterface {

    public static abstract class zza extends Binder implements zzar {

        /* renamed from: com.google.android.gms.wearable.internal.zzar$zza$zza  reason: collision with other inner class name */
        private static class C0223zza implements zzar {
            private IBinder zznF;

            C0223zza(IBinder iBinder) {
                this.zznF = iBinder;
            }

            public IBinder asBinder() {
                return this.zznF;
            }

            @Override // com.google.android.gms.wearable.internal.zzar
            public void zza(Status status) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zznF.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.zzar
            public void zza(AddLocalCapabilityResponse addLocalCapabilityResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (addLocalCapabilityResponse != null) {
                        obtain.writeInt(1);
                        addLocalCapabilityResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zznF.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.zzar
            public void zza(ChannelReceiveFileResponse channelReceiveFileResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (channelReceiveFileResponse != null) {
                        obtain.writeInt(1);
                        channelReceiveFileResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zznF.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.zzar
            public void zza(ChannelSendFileResponse channelSendFileResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (channelSendFileResponse != null) {
                        obtain.writeInt(1);
                        channelSendFileResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zznF.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.zzar
            public void zza(CloseChannelResponse closeChannelResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (closeChannelResponse != null) {
                        obtain.writeInt(1);
                        closeChannelResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zznF.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.zzar
            public void zza(DeleteDataItemsResponse deleteDataItemsResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (deleteDataItemsResponse != null) {
                        obtain.writeInt(1);
                        deleteDataItemsResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zznF.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.zzar
            public void zza(GetAllCapabilitiesResponse getAllCapabilitiesResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (getAllCapabilitiesResponse != null) {
                        obtain.writeInt(1);
                        getAllCapabilitiesResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zznF.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.zzar
            public void zza(GetCapabilityResponse getCapabilityResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (getCapabilityResponse != null) {
                        obtain.writeInt(1);
                        getCapabilityResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zznF.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.zzar
            public void zza(GetChannelInputStreamResponse getChannelInputStreamResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (getChannelInputStreamResponse != null) {
                        obtain.writeInt(1);
                        getChannelInputStreamResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zznF.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.zzar
            public void zza(GetChannelOutputStreamResponse getChannelOutputStreamResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (getChannelOutputStreamResponse != null) {
                        obtain.writeInt(1);
                        getChannelOutputStreamResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zznF.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.zzar
            public void zza(GetCloudSyncOptInOutDoneResponse getCloudSyncOptInOutDoneResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (getCloudSyncOptInOutDoneResponse != null) {
                        obtain.writeInt(1);
                        getCloudSyncOptInOutDoneResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zznF.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.zzar
            public void zza(GetCloudSyncSettingResponse getCloudSyncSettingResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (getCloudSyncSettingResponse != null) {
                        obtain.writeInt(1);
                        getCloudSyncSettingResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zznF.transact(29, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.zzar
            public void zza(GetConfigResponse getConfigResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (getConfigResponse != null) {
                        obtain.writeInt(1);
                        getConfigResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zznF.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.zzar
            public void zza(GetConfigsResponse getConfigsResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (getConfigsResponse != null) {
                        obtain.writeInt(1);
                        getConfigsResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zznF.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.zzar
            public void zza(GetConnectedNodesResponse getConnectedNodesResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (getConnectedNodesResponse != null) {
                        obtain.writeInt(1);
                        getConnectedNodesResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zznF.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.zzar
            public void zza(GetDataItemResponse getDataItemResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (getDataItemResponse != null) {
                        obtain.writeInt(1);
                        getDataItemResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zznF.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.zzar
            public void zza(GetFdForAssetResponse getFdForAssetResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (getFdForAssetResponse != null) {
                        obtain.writeInt(1);
                        getFdForAssetResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zznF.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.zzar
            public void zza(GetLocalNodeResponse getLocalNodeResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (getLocalNodeResponse != null) {
                        obtain.writeInt(1);
                        getLocalNodeResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zznF.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.zzar
            public void zza(OpenChannelResponse openChannelResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (openChannelResponse != null) {
                        obtain.writeInt(1);
                        openChannelResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zznF.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.zzar
            public void zza(PutDataResponse putDataResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (putDataResponse != null) {
                        obtain.writeInt(1);
                        putDataResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zznF.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.zzar
            public void zza(RemoveLocalCapabilityResponse removeLocalCapabilityResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (removeLocalCapabilityResponse != null) {
                        obtain.writeInt(1);
                        removeLocalCapabilityResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zznF.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.zzar
            public void zza(SendMessageResponse sendMessageResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (sendMessageResponse != null) {
                        obtain.writeInt(1);
                        sendMessageResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zznF.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.zzar
            public void zza(StorageInfoResponse storageInfoResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (storageInfoResponse != null) {
                        obtain.writeInt(1);
                        storageInfoResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zznF.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.zzar
            public void zzad(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zznF.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.zzar
            public void zzb(CloseChannelResponse closeChannelResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (closeChannelResponse != null) {
                        obtain.writeInt(1);
                        closeChannelResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zznF.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public zza() {
            attachInterface(this, "com.google.android.gms.wearable.internal.IWearableCallbacks");
        }

        public static zzar zzdO(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof zzar)) ? new C0223zza(iBinder) : (zzar) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            RemoveLocalCapabilityResponse removeLocalCapabilityResponse = null;
            GetConfigResponse getConfigResponse = null;
            GetConfigsResponse getConfigsResponse = null;
            GetCloudSyncOptInOutDoneResponse getCloudSyncOptInOutDoneResponse = null;
            GetCloudSyncSettingResponse getCloudSyncSettingResponse = null;
            PutDataResponse putDataResponse = null;
            GetDataItemResponse getDataItemResponse = null;
            DataHolder dataHolder = null;
            DeleteDataItemsResponse deleteDataItemsResponse = null;
            SendMessageResponse sendMessageResponse = null;
            GetFdForAssetResponse getFdForAssetResponse = null;
            GetLocalNodeResponse getLocalNodeResponse = null;
            GetConnectedNodesResponse getConnectedNodesResponse = null;
            OpenChannelResponse openChannelResponse = null;
            CloseChannelResponse closeChannelResponse = null;
            CloseChannelResponse closeChannelResponse2 = null;
            GetChannelInputStreamResponse getChannelInputStreamResponse = null;
            GetChannelOutputStreamResponse getChannelOutputStreamResponse = null;
            ChannelReceiveFileResponse channelReceiveFileResponse = null;
            ChannelSendFileResponse channelSendFileResponse = null;
            Status status = null;
            StorageInfoResponse storageInfoResponse = null;
            GetCapabilityResponse getCapabilityResponse = null;
            GetAllCapabilitiesResponse getAllCapabilitiesResponse = null;
            AddLocalCapabilityResponse addLocalCapabilityResponse = null;
            switch (code) {
                case 2:
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (data.readInt() != 0) {
                        getConfigResponse = GetConfigResponse.CREATOR.createFromParcel(data);
                    }
                    zza(getConfigResponse);
                    reply.writeNoException();
                    return true;
                case 3:
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (data.readInt() != 0) {
                        putDataResponse = PutDataResponse.CREATOR.createFromParcel(data);
                    }
                    zza(putDataResponse);
                    reply.writeNoException();
                    return true;
                case 4:
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (data.readInt() != 0) {
                        getDataItemResponse = GetDataItemResponse.CREATOR.createFromParcel(data);
                    }
                    zza(getDataItemResponse);
                    reply.writeNoException();
                    return true;
                case 5:
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (data.readInt() != 0) {
                        dataHolder = DataHolder.CREATOR.createFromParcel(data);
                    }
                    zzad(dataHolder);
                    reply.writeNoException();
                    return true;
                case 6:
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (data.readInt() != 0) {
                        deleteDataItemsResponse = DeleteDataItemsResponse.CREATOR.createFromParcel(data);
                    }
                    zza(deleteDataItemsResponse);
                    reply.writeNoException();
                    return true;
                case 7:
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (data.readInt() != 0) {
                        sendMessageResponse = SendMessageResponse.CREATOR.createFromParcel(data);
                    }
                    zza(sendMessageResponse);
                    reply.writeNoException();
                    return true;
                case 8:
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (data.readInt() != 0) {
                        getFdForAssetResponse = GetFdForAssetResponse.CREATOR.createFromParcel(data);
                    }
                    zza(getFdForAssetResponse);
                    reply.writeNoException();
                    return true;
                case 9:
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (data.readInt() != 0) {
                        getLocalNodeResponse = GetLocalNodeResponse.CREATOR.createFromParcel(data);
                    }
                    zza(getLocalNodeResponse);
                    reply.writeNoException();
                    return true;
                case 10:
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (data.readInt() != 0) {
                        getConnectedNodesResponse = GetConnectedNodesResponse.CREATOR.createFromParcel(data);
                    }
                    zza(getConnectedNodesResponse);
                    reply.writeNoException();
                    return true;
                case 11:
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (data.readInt() != 0) {
                        status = Status.CREATOR.createFromParcel(data);
                    }
                    zza(status);
                    reply.writeNoException();
                    return true;
                case 12:
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (data.readInt() != 0) {
                        storageInfoResponse = StorageInfoResponse.CREATOR.createFromParcel(data);
                    }
                    zza(storageInfoResponse);
                    reply.writeNoException();
                    return true;
                case 13:
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (data.readInt() != 0) {
                        getConfigsResponse = GetConfigsResponse.CREATOR.createFromParcel(data);
                    }
                    zza(getConfigsResponse);
                    reply.writeNoException();
                    return true;
                case 14:
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (data.readInt() != 0) {
                        openChannelResponse = OpenChannelResponse.CREATOR.createFromParcel(data);
                    }
                    zza(openChannelResponse);
                    reply.writeNoException();
                    return true;
                case 15:
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (data.readInt() != 0) {
                        closeChannelResponse = CloseChannelResponse.CREATOR.createFromParcel(data);
                    }
                    zza(closeChannelResponse);
                    reply.writeNoException();
                    return true;
                case 16:
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (data.readInt() != 0) {
                        closeChannelResponse2 = CloseChannelResponse.CREATOR.createFromParcel(data);
                    }
                    zzb(closeChannelResponse2);
                    reply.writeNoException();
                    return true;
                case 17:
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (data.readInt() != 0) {
                        getChannelInputStreamResponse = GetChannelInputStreamResponse.CREATOR.createFromParcel(data);
                    }
                    zza(getChannelInputStreamResponse);
                    reply.writeNoException();
                    return true;
                case 18:
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (data.readInt() != 0) {
                        getChannelOutputStreamResponse = GetChannelOutputStreamResponse.CREATOR.createFromParcel(data);
                    }
                    zza(getChannelOutputStreamResponse);
                    reply.writeNoException();
                    return true;
                case 19:
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (data.readInt() != 0) {
                        channelReceiveFileResponse = ChannelReceiveFileResponse.CREATOR.createFromParcel(data);
                    }
                    zza(channelReceiveFileResponse);
                    reply.writeNoException();
                    return true;
                case 20:
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (data.readInt() != 0) {
                        channelSendFileResponse = ChannelSendFileResponse.CREATOR.createFromParcel(data);
                    }
                    zza(channelSendFileResponse);
                    reply.writeNoException();
                    return true;
                case 22:
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (data.readInt() != 0) {
                        getCapabilityResponse = GetCapabilityResponse.CREATOR.createFromParcel(data);
                    }
                    zza(getCapabilityResponse);
                    reply.writeNoException();
                    return true;
                case 23:
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (data.readInt() != 0) {
                        getAllCapabilitiesResponse = GetAllCapabilitiesResponse.CREATOR.createFromParcel(data);
                    }
                    zza(getAllCapabilitiesResponse);
                    reply.writeNoException();
                    return true;
                case 26:
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (data.readInt() != 0) {
                        addLocalCapabilityResponse = AddLocalCapabilityResponse.CREATOR.createFromParcel(data);
                    }
                    zza(addLocalCapabilityResponse);
                    reply.writeNoException();
                    return true;
                case 27:
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (data.readInt() != 0) {
                        removeLocalCapabilityResponse = RemoveLocalCapabilityResponse.CREATOR.createFromParcel(data);
                    }
                    zza(removeLocalCapabilityResponse);
                    reply.writeNoException();
                    return true;
                case 28:
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (data.readInt() != 0) {
                        getCloudSyncOptInOutDoneResponse = GetCloudSyncOptInOutDoneResponse.CREATOR.createFromParcel(data);
                    }
                    zza(getCloudSyncOptInOutDoneResponse);
                    reply.writeNoException();
                    return true;
                case 29:
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (data.readInt() != 0) {
                        getCloudSyncSettingResponse = GetCloudSyncSettingResponse.CREATOR.createFromParcel(data);
                    }
                    zza(getCloudSyncSettingResponse);
                    reply.writeNoException();
                    return true;
                case 1598968902:
                    reply.writeString("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }
    }

    void zza(Status status) throws RemoteException;

    void zza(AddLocalCapabilityResponse addLocalCapabilityResponse) throws RemoteException;

    void zza(ChannelReceiveFileResponse channelReceiveFileResponse) throws RemoteException;

    void zza(ChannelSendFileResponse channelSendFileResponse) throws RemoteException;

    void zza(CloseChannelResponse closeChannelResponse) throws RemoteException;

    void zza(DeleteDataItemsResponse deleteDataItemsResponse) throws RemoteException;

    void zza(GetAllCapabilitiesResponse getAllCapabilitiesResponse) throws RemoteException;

    void zza(GetCapabilityResponse getCapabilityResponse) throws RemoteException;

    void zza(GetChannelInputStreamResponse getChannelInputStreamResponse) throws RemoteException;

    void zza(GetChannelOutputStreamResponse getChannelOutputStreamResponse) throws RemoteException;

    void zza(GetCloudSyncOptInOutDoneResponse getCloudSyncOptInOutDoneResponse) throws RemoteException;

    void zza(GetCloudSyncSettingResponse getCloudSyncSettingResponse) throws RemoteException;

    void zza(GetConfigResponse getConfigResponse) throws RemoteException;

    void zza(GetConfigsResponse getConfigsResponse) throws RemoteException;

    void zza(GetConnectedNodesResponse getConnectedNodesResponse) throws RemoteException;

    void zza(GetDataItemResponse getDataItemResponse) throws RemoteException;

    void zza(GetFdForAssetResponse getFdForAssetResponse) throws RemoteException;

    void zza(GetLocalNodeResponse getLocalNodeResponse) throws RemoteException;

    void zza(OpenChannelResponse openChannelResponse) throws RemoteException;

    void zza(PutDataResponse putDataResponse) throws RemoteException;

    void zza(RemoveLocalCapabilityResponse removeLocalCapabilityResponse) throws RemoteException;

    void zza(SendMessageResponse sendMessageResponse) throws RemoteException;

    void zza(StorageInfoResponse storageInfoResponse) throws RemoteException;

    void zzad(DataHolder dataHolder) throws RemoteException;

    void zzb(CloseChannelResponse closeChannelResponse) throws RemoteException;
}
