package com.google.android.gms.games.internal.api;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zza;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.Players;
import com.google.android.gms.games.internal.GamesClientImpl;

public final class PlayersImpl implements Players {

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl$10  reason: invalid class name */
    class AnonymousClass10 extends LoadPlayersImpl {
        final /* synthetic */ String zzaqA;
        final /* synthetic */ int zzarv;

        /* access modifiers changed from: protected */
        public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza((zza.zzb<Players.LoadPlayersResult>) this, "nearby", this.zzaqA, this.zzarv, true, false);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl$11  reason: invalid class name */
    class AnonymousClass11 extends LoadPlayersImpl {
        final /* synthetic */ String zzaqA;
        final /* synthetic */ boolean zzaqy;
        final /* synthetic */ int zzarv;

        /* access modifiers changed from: protected */
        public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza((zza.zzb<Players.LoadPlayersResult>) this, "played_with", this.zzaqA, this.zzarv, false, this.zzaqy);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl$12  reason: invalid class name */
    class AnonymousClass12 extends LoadPlayersImpl {
        final /* synthetic */ String zzaqA;
        final /* synthetic */ int zzarv;

        /* access modifiers changed from: protected */
        public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza((zza.zzb<Players.LoadPlayersResult>) this, "played_with", this.zzaqA, this.zzarv, true, false);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl$13  reason: invalid class name */
    class AnonymousClass13 extends LoadPlayersImpl {
        final /* synthetic */ boolean zzaqy;
        final /* synthetic */ int zzarv;

        /* access modifiers changed from: protected */
        public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzb((zza.zzb<Players.LoadPlayersResult>) this, this.zzarv, false, this.zzaqy);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl$14  reason: invalid class name */
    class AnonymousClass14 extends LoadPlayersImpl {
        final /* synthetic */ int zzarv;

        /* access modifiers changed from: protected */
        public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzb((zza.zzb<Players.LoadPlayersResult>) this, this.zzarv, true, false);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl$15  reason: invalid class name */
    class AnonymousClass15 extends LoadPlayersImpl {
        final /* synthetic */ boolean zzaqy;
        final /* synthetic */ int zzarv;

        /* access modifiers changed from: protected */
        public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzc((zza.zzb<Players.LoadPlayersResult>) this, this.zzarv, false, this.zzaqy);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl$16  reason: invalid class name */
    class AnonymousClass16 extends LoadPlayersImpl {
        final /* synthetic */ int zzarv;

        /* access modifiers changed from: protected */
        public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzc((zza.zzb<Players.LoadPlayersResult>) this, this.zzarv, true, false);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl$17  reason: invalid class name */
    class AnonymousClass17 extends LoadPlayersImpl {
        final /* synthetic */ boolean zzaqy;
        final /* synthetic */ int zzarv;

        /* access modifiers changed from: protected */
        public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzd(this, this.zzarv, false, this.zzaqy);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl$18  reason: invalid class name */
    class AnonymousClass18 extends LoadPlayersImpl {
        final /* synthetic */ int zzarv;

        /* access modifiers changed from: protected */
        public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzd(this, this.zzarv, true, false);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl$19  reason: invalid class name */
    class AnonymousClass19 extends LoadPlayersImpl {
        final /* synthetic */ String zzaqR;
        final /* synthetic */ boolean zzaqy;
        final /* synthetic */ int zzarv;

        /* access modifiers changed from: protected */
        public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzb(this, this.zzaqR, this.zzarv, false, this.zzaqy);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl$20  reason: invalid class name */
    class AnonymousClass20 extends LoadPlayersImpl {
        final /* synthetic */ String zzaqR;
        final /* synthetic */ int zzarv;

        /* access modifiers changed from: protected */
        public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzb(this, this.zzaqR, this.zzarv, true, false);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl$21  reason: invalid class name */
    class AnonymousClass21 extends LoadPlayersImpl {
        final /* synthetic */ boolean zzaqy;
        final /* synthetic */ String zzarm;
        final /* synthetic */ int zzarv;
        final /* synthetic */ String zzarw;

        /* access modifiers changed from: protected */
        public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzb((zza.zzb<Players.LoadPlayersResult>) this, this.zzarw, this.zzarm, this.zzarv, false, this.zzaqy);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl$22  reason: invalid class name */
    class AnonymousClass22 extends LoadPlayersImpl {
        final /* synthetic */ String zzarm;
        final /* synthetic */ int zzarv;
        final /* synthetic */ String zzarw;

        /* access modifiers changed from: protected */
        public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzb((zza.zzb<Players.LoadPlayersResult>) this, this.zzarw, this.zzarm, this.zzarv, true, false);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl$23  reason: invalid class name */
    class AnonymousClass23 extends LoadXpForGameCategoriesResultImpl {
        final /* synthetic */ String zzarx;

        /* access modifiers changed from: protected */
        public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzl(this, this.zzarx);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl$24  reason: invalid class name */
    class AnonymousClass24 extends LoadXpStreamResultImpl {
        final /* synthetic */ String zzarx;
        final /* synthetic */ int zzary;

        /* access modifiers changed from: protected */
        public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzc(this, this.zzarx, this.zzary);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl$25  reason: invalid class name */
    class AnonymousClass25 extends LoadXpStreamResultImpl {
        final /* synthetic */ String zzarx;
        final /* synthetic */ int zzary;

        /* access modifiers changed from: protected */
        public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzd(this, this.zzarx, this.zzary);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl$26  reason: invalid class name */
    class AnonymousClass26 extends LoadProfileSettingsResultImpl {
        final /* synthetic */ boolean zzaqy;

        /* access modifiers changed from: protected */
        public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzf(this, this.zzaqy);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl$27  reason: invalid class name */
    class AnonymousClass27 extends UpdateProfileSettingsResultImpl {
        final /* synthetic */ boolean zzarz;

        /* access modifiers changed from: protected */
        public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzg(this, this.zzarz);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl$3  reason: invalid class name */
    class AnonymousClass3 extends LoadPlayersImpl {
        final /* synthetic */ String[] zzarA;

        /* access modifiers changed from: protected */
        public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza(this, this.zzarA);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl$9  reason: invalid class name */
    class AnonymousClass9 extends LoadPlayersImpl {
        final /* synthetic */ String zzaqA;
        final /* synthetic */ int zzarv;

        /* access modifiers changed from: protected */
        public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza((zza.zzb<Players.LoadPlayersResult>) this, "nearby", this.zzaqA, this.zzarv, false, false);
        }
    }

    private static abstract class LoadPlayersImpl extends Games.BaseGamesApiMethodImpl<Players.LoadPlayersResult> {
        private LoadPlayersImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: zzaj */
        public Players.LoadPlayersResult createFailedResult(final Status status) {
            return new Players.LoadPlayersResult() {
                /* class com.google.android.gms.games.internal.api.PlayersImpl.LoadPlayersImpl.AnonymousClass1 */

                @Override // com.google.android.gms.games.Players.LoadPlayersResult
                public PlayerBuffer getPlayers() {
                    return new PlayerBuffer(DataHolder.zzbi(14));
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

    private static abstract class LoadProfileSettingsResultImpl extends Games.BaseGamesApiMethodImpl<Players.LoadProfileSettingsResult> {
        /* access modifiers changed from: protected */
        /* renamed from: zzak */
        public Players.LoadProfileSettingsResult createFailedResult(final Status status) {
            return new Players.LoadProfileSettingsResult() {
                /* class com.google.android.gms.games.internal.api.PlayersImpl.LoadProfileSettingsResultImpl.AnonymousClass1 */

                @Override // com.google.android.gms.common.api.Result
                public Status getStatus() {
                    return status;
                }

                @Override // com.google.android.gms.games.Players.LoadProfileSettingsResult
                public boolean isProfileVisible() {
                    return true;
                }

                @Override // com.google.android.gms.games.Players.LoadProfileSettingsResult
                public boolean isVisibilityExplicitlySet() {
                    return false;
                }
            };
        }
    }

    private static abstract class LoadXpForGameCategoriesResultImpl extends Games.BaseGamesApiMethodImpl<Players.LoadXpForGameCategoriesResult> {
        /* renamed from: zzal */
        public Players.LoadXpForGameCategoriesResult createFailedResult(final Status status) {
            return new Players.LoadXpForGameCategoriesResult() {
                /* class com.google.android.gms.games.internal.api.PlayersImpl.LoadXpForGameCategoriesResultImpl.AnonymousClass1 */

                @Override // com.google.android.gms.common.api.Result
                public Status getStatus() {
                    return status;
                }
            };
        }
    }

    private static abstract class LoadXpStreamResultImpl extends Games.BaseGamesApiMethodImpl<Players.LoadXpStreamResult> {
        /* renamed from: zzam */
        public Players.LoadXpStreamResult createFailedResult(final Status status) {
            return new Players.LoadXpStreamResult() {
                /* class com.google.android.gms.games.internal.api.PlayersImpl.LoadXpStreamResultImpl.AnonymousClass1 */

                @Override // com.google.android.gms.common.api.Result
                public Status getStatus() {
                    return status;
                }
            };
        }
    }

    private static abstract class UpdateProfileSettingsResultImpl extends Games.BaseGamesApiMethodImpl<Status> {
        /* access modifiers changed from: protected */
        /* renamed from: zzb */
        public Status createFailedResult(Status status) {
            return status;
        }
    }

    @Override // com.google.android.gms.games.Players
    public Intent getCompareProfileIntent(GoogleApiClient apiClient, Player player) {
        return Games.zzd(apiClient).zza(new PlayerEntity(player));
    }

    @Override // com.google.android.gms.games.Players
    public Player getCurrentPlayer(GoogleApiClient apiClient) {
        return Games.zzd(apiClient).zzsx();
    }

    @Override // com.google.android.gms.games.Players
    public String getCurrentPlayerId(GoogleApiClient apiClient) {
        return Games.zzd(apiClient).zzsw();
    }

    @Override // com.google.android.gms.games.Players
    public Intent getPlayerSearchIntent(GoogleApiClient apiClient) {
        return Games.zzd(apiClient).zzsH();
    }

    @Override // com.google.android.gms.games.Players
    public PendingResult<Players.LoadPlayersResult> loadConnectedPlayers(GoogleApiClient apiClient, final boolean forceReload) {
        return apiClient.zza(new LoadPlayersImpl(apiClient) {
            /* class com.google.android.gms.games.internal.api.PlayersImpl.AnonymousClass8 */

            /* access modifiers changed from: protected */
            public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
                gamesClientImpl.zza(this, forceReload);
            }
        });
    }

    @Override // com.google.android.gms.games.Players
    public PendingResult<Players.LoadPlayersResult> loadInvitablePlayers(GoogleApiClient apiClient, final int pageSize, final boolean forceReload) {
        return apiClient.zza(new LoadPlayersImpl(apiClient) {
            /* class com.google.android.gms.games.internal.api.PlayersImpl.AnonymousClass4 */

            /* access modifiers changed from: protected */
            public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
                gamesClientImpl.zza((zza.zzb<Players.LoadPlayersResult>) this, pageSize, false, forceReload);
            }
        });
    }

    @Override // com.google.android.gms.games.Players
    public PendingResult<Players.LoadPlayersResult> loadMoreInvitablePlayers(GoogleApiClient apiClient, final int pageSize) {
        return apiClient.zza(new LoadPlayersImpl(apiClient) {
            /* class com.google.android.gms.games.internal.api.PlayersImpl.AnonymousClass5 */

            /* access modifiers changed from: protected */
            public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
                gamesClientImpl.zza((zza.zzb<Players.LoadPlayersResult>) this, pageSize, true, false);
            }
        });
    }

    @Override // com.google.android.gms.games.Players
    public PendingResult<Players.LoadPlayersResult> loadMoreRecentlyPlayedWithPlayers(GoogleApiClient apiClient, final int pageSize) {
        return apiClient.zza(new LoadPlayersImpl(apiClient) {
            /* class com.google.android.gms.games.internal.api.PlayersImpl.AnonymousClass7 */

            /* access modifiers changed from: protected */
            public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
                gamesClientImpl.zza((zza.zzb<Players.LoadPlayersResult>) this, "played_with", pageSize, true, false);
            }
        });
    }

    @Override // com.google.android.gms.games.Players
    public PendingResult<Players.LoadPlayersResult> loadPlayer(GoogleApiClient apiClient, final String playerId) {
        return apiClient.zza(new LoadPlayersImpl(apiClient) {
            /* class com.google.android.gms.games.internal.api.PlayersImpl.AnonymousClass1 */

            /* access modifiers changed from: protected */
            public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
                gamesClientImpl.zza((zza.zzb<Players.LoadPlayersResult>) this, playerId, false);
            }
        });
    }

    @Override // com.google.android.gms.games.Players
    public PendingResult<Players.LoadPlayersResult> loadPlayer(GoogleApiClient apiClient, final String playerId, final boolean forceReload) {
        return apiClient.zza(new LoadPlayersImpl(apiClient) {
            /* class com.google.android.gms.games.internal.api.PlayersImpl.AnonymousClass2 */

            /* access modifiers changed from: protected */
            public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
                gamesClientImpl.zza(this, playerId, forceReload);
            }
        });
    }

    @Override // com.google.android.gms.games.Players
    public PendingResult<Players.LoadPlayersResult> loadRecentlyPlayedWithPlayers(GoogleApiClient apiClient, final int pageSize, final boolean forceReload) {
        return apiClient.zza(new LoadPlayersImpl(apiClient) {
            /* class com.google.android.gms.games.internal.api.PlayersImpl.AnonymousClass6 */

            /* access modifiers changed from: protected */
            public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
                gamesClientImpl.zza((zza.zzb<Players.LoadPlayersResult>) this, "played_with", pageSize, false, forceReload);
            }
        });
    }
}
