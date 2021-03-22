package com.google.android.gms.games.internal.api;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.request.GameRequestBuffer;
import com.google.android.gms.games.request.OnRequestReceivedListener;
import com.google.android.gms.games.request.Requests;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class RequestsImpl implements Requests {

    /* renamed from: com.google.android.gms.games.internal.api.RequestsImpl$4  reason: invalid class name */
    class AnonymousClass4 extends SendRequestImpl {
        final /* synthetic */ String zzaqA;
        final /* synthetic */ String[] zzarS;
        final /* synthetic */ int zzarT;
        final /* synthetic */ byte[] zzarU;
        final /* synthetic */ int zzarV;

        /* access modifiers changed from: protected */
        public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza(this, this.zzaqA, this.zzarS, this.zzarT, this.zzarU, this.zzarV);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.RequestsImpl$5  reason: invalid class name */
    class AnonymousClass5 extends SendRequestImpl {
        final /* synthetic */ String zzaqA;
        final /* synthetic */ String[] zzarS;
        final /* synthetic */ int zzarT;
        final /* synthetic */ byte[] zzarU;
        final /* synthetic */ int zzarV;

        /* access modifiers changed from: protected */
        public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza(this, this.zzaqA, this.zzarS, this.zzarT, this.zzarU, this.zzarV);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.RequestsImpl$6  reason: invalid class name */
    class AnonymousClass6 extends UpdateRequestsImpl {
        final /* synthetic */ String zzaqA;
        final /* synthetic */ String zzarK;
        final /* synthetic */ String[] zzarO;

        /* access modifiers changed from: protected */
        public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza(this, this.zzaqA, this.zzarK, this.zzarO);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.RequestsImpl$7  reason: invalid class name */
    class AnonymousClass7 extends LoadRequestsImpl {
        final /* synthetic */ String zzaqA;
        final /* synthetic */ int zzaqV;
        final /* synthetic */ String zzarK;
        final /* synthetic */ int zzarQ;
        final /* synthetic */ int zzarR;

        /* access modifiers changed from: protected */
        public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza(this, this.zzaqA, this.zzarK, this.zzarQ, this.zzarR, this.zzaqV);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.RequestsImpl$8  reason: invalid class name */
    class AnonymousClass8 extends LoadRequestSummariesImpl {
        final /* synthetic */ String zzarK;
        final /* synthetic */ int zzarR;

        /* access modifiers changed from: protected */
        public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzf(this, this.zzarK, this.zzarR);
        }
    }

    private static abstract class LoadRequestSummariesImpl extends Games.BaseGamesApiMethodImpl<Requests.LoadRequestSummariesResult> {
        /* renamed from: zzaq */
        public Requests.LoadRequestSummariesResult createFailedResult(final Status status) {
            return new Requests.LoadRequestSummariesResult() {
                /* class com.google.android.gms.games.internal.api.RequestsImpl.LoadRequestSummariesImpl.AnonymousClass1 */

                @Override // com.google.android.gms.common.api.Result
                public Status getStatus() {
                    return status;
                }

                @Override // com.google.android.gms.common.api.Releasable
                public void release() {
                }
            };
        }
    }

    private static abstract class LoadRequestsImpl extends Games.BaseGamesApiMethodImpl<Requests.LoadRequestsResult> {
        private LoadRequestsImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: zzar */
        public Requests.LoadRequestsResult createFailedResult(final Status status) {
            return new Requests.LoadRequestsResult() {
                /* class com.google.android.gms.games.internal.api.RequestsImpl.LoadRequestsImpl.AnonymousClass1 */

                @Override // com.google.android.gms.games.request.Requests.LoadRequestsResult
                public GameRequestBuffer getRequests(int type) {
                    return new GameRequestBuffer(DataHolder.zzbi(status.getStatusCode()));
                }

                @Override // com.google.android.gms.common.api.Result
                public Status getStatus() {
                    return status;
                }

                @Override // com.google.android.gms.common.api.Releasable
                public void release() {
                }
            };
        }
    }

    private static abstract class SendRequestImpl extends Games.BaseGamesApiMethodImpl<Requests.SendRequestResult> {
        /* renamed from: zzas */
        public Requests.SendRequestResult createFailedResult(final Status status) {
            return new Requests.SendRequestResult() {
                /* class com.google.android.gms.games.internal.api.RequestsImpl.SendRequestImpl.AnonymousClass1 */

                @Override // com.google.android.gms.common.api.Result
                public Status getStatus() {
                    return status;
                }
            };
        }
    }

    private static abstract class UpdateRequestsImpl extends Games.BaseGamesApiMethodImpl<Requests.UpdateRequestsResult> {
        private UpdateRequestsImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: zzat */
        public Requests.UpdateRequestsResult createFailedResult(final Status status) {
            return new Requests.UpdateRequestsResult() {
                /* class com.google.android.gms.games.internal.api.RequestsImpl.UpdateRequestsImpl.AnonymousClass1 */

                @Override // com.google.android.gms.games.request.Requests.UpdateRequestsResult
                public Set<String> getRequestIds() {
                    return null;
                }

                @Override // com.google.android.gms.games.request.Requests.UpdateRequestsResult
                public int getRequestOutcome(String requestId) {
                    throw new IllegalArgumentException("Unknown request ID " + requestId);
                }

                @Override // com.google.android.gms.common.api.Result
                public Status getStatus() {
                    return status;
                }

                @Override // com.google.android.gms.common.api.Releasable
                public void release() {
                }
            };
        }
    }

    @Override // com.google.android.gms.games.request.Requests
    public PendingResult<Requests.UpdateRequestsResult> acceptRequest(GoogleApiClient apiClient, String requestId) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(requestId);
        return acceptRequests(apiClient, arrayList);
    }

    @Override // com.google.android.gms.games.request.Requests
    public PendingResult<Requests.UpdateRequestsResult> acceptRequests(GoogleApiClient apiClient, List<String> requestIds) {
        final String[] strArr = requestIds == null ? null : (String[]) requestIds.toArray(new String[requestIds.size()]);
        return apiClient.zzb(new UpdateRequestsImpl(apiClient) {
            /* class com.google.android.gms.games.internal.api.RequestsImpl.AnonymousClass1 */

            /* access modifiers changed from: protected */
            public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
                gamesClientImpl.zzb(this, strArr);
            }
        });
    }

    @Override // com.google.android.gms.games.request.Requests
    public PendingResult<Requests.UpdateRequestsResult> dismissRequest(GoogleApiClient apiClient, String requestId) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(requestId);
        return dismissRequests(apiClient, arrayList);
    }

    @Override // com.google.android.gms.games.request.Requests
    public PendingResult<Requests.UpdateRequestsResult> dismissRequests(GoogleApiClient apiClient, List<String> requestIds) {
        final String[] strArr = requestIds == null ? null : (String[]) requestIds.toArray(new String[requestIds.size()]);
        return apiClient.zzb(new UpdateRequestsImpl(apiClient) {
            /* class com.google.android.gms.games.internal.api.RequestsImpl.AnonymousClass2 */

            /* access modifiers changed from: protected */
            public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
                gamesClientImpl.zzc(this, strArr);
            }
        });
    }

    @Override // com.google.android.gms.games.request.Requests
    public ArrayList<GameRequest> getGameRequestsFromBundle(Bundle extras) {
        if (extras == null || !extras.containsKey(Requests.EXTRA_REQUESTS)) {
            return new ArrayList<>();
        }
        ArrayList arrayList = (ArrayList) extras.get(Requests.EXTRA_REQUESTS);
        ArrayList<GameRequest> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add((GameRequest) arrayList.get(i));
        }
        return arrayList2;
    }

    @Override // com.google.android.gms.games.request.Requests
    public ArrayList<GameRequest> getGameRequestsFromInboxResponse(Intent response) {
        return response == null ? new ArrayList<>() : getGameRequestsFromBundle(response.getExtras());
    }

    @Override // com.google.android.gms.games.request.Requests
    public Intent getInboxIntent(GoogleApiClient apiClient) {
        return Games.zzd(apiClient).zzsM();
    }

    @Override // com.google.android.gms.games.request.Requests
    public int getMaxLifetimeDays(GoogleApiClient apiClient) {
        return Games.zzd(apiClient).zzsO();
    }

    @Override // com.google.android.gms.games.request.Requests
    public int getMaxPayloadSize(GoogleApiClient apiClient) {
        return Games.zzd(apiClient).zzsN();
    }

    @Override // com.google.android.gms.games.request.Requests
    public Intent getSendIntent(GoogleApiClient apiClient, int type, byte[] payload, int requestLifetimeDays, Bitmap icon, String description) {
        return Games.zzd(apiClient).zza(type, payload, requestLifetimeDays, icon, description);
    }

    @Override // com.google.android.gms.games.request.Requests
    public PendingResult<Requests.LoadRequestsResult> loadRequests(GoogleApiClient apiClient, final int requestDirection, final int types, final int sortOrder) {
        return apiClient.zza(new LoadRequestsImpl(apiClient) {
            /* class com.google.android.gms.games.internal.api.RequestsImpl.AnonymousClass3 */

            /* access modifiers changed from: protected */
            public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
                gamesClientImpl.zza(this, requestDirection, types, sortOrder);
            }
        });
    }

    @Override // com.google.android.gms.games.request.Requests
    public void registerRequestListener(GoogleApiClient apiClient, OnRequestReceivedListener listener) {
        GamesClientImpl zzb = Games.zzb(apiClient, false);
        if (zzb != null) {
            zzb.zzd(apiClient.zzo(listener));
        }
    }

    @Override // com.google.android.gms.games.request.Requests
    public void unregisterRequestListener(GoogleApiClient apiClient) {
        GamesClientImpl zzb = Games.zzb(apiClient, false);
        if (zzb != null) {
            zzb.zzsG();
        }
    }
}
