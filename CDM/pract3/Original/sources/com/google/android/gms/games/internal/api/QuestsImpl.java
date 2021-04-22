package com.google.android.gms.games.internal.api;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.quest.Milestone;
import com.google.android.gms.games.quest.Quest;
import com.google.android.gms.games.quest.QuestBuffer;
import com.google.android.gms.games.quest.QuestUpdateListener;
import com.google.android.gms.games.quest.Quests;

public final class QuestsImpl implements Quests {

    /* renamed from: com.google.android.gms.games.internal.api.QuestsImpl$5  reason: invalid class name */
    class AnonymousClass5 extends LoadsImpl {
        final /* synthetic */ String zzaqA;
        final /* synthetic */ int zzaqV;
        final /* synthetic */ boolean zzaqy;
        final /* synthetic */ int[] zzarI;
        final /* synthetic */ String zzarK;

        /* access modifiers changed from: protected */
        public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza(this, this.zzaqA, this.zzarK, this.zzarI, this.zzaqV, this.zzaqy);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.QuestsImpl$6  reason: invalid class name */
    class AnonymousClass6 extends LoadsImpl {
        final /* synthetic */ String zzaqA;
        final /* synthetic */ boolean zzaqy;
        final /* synthetic */ String[] zzarJ;
        final /* synthetic */ String zzarK;

        /* access modifiers changed from: protected */
        public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza(this, this.zzaqA, this.zzarK, this.zzaqy, this.zzarJ);
        }
    }

    private static abstract class AcceptImpl extends Games.BaseGamesApiMethodImpl<Quests.AcceptQuestResult> {
        private AcceptImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: zzan */
        public Quests.AcceptQuestResult createFailedResult(final Status status) {
            return new Quests.AcceptQuestResult() {
                /* class com.google.android.gms.games.internal.api.QuestsImpl.AcceptImpl.AnonymousClass1 */

                @Override // com.google.android.gms.games.quest.Quests.AcceptQuestResult
                public Quest getQuest() {
                    return null;
                }

                @Override // com.google.android.gms.common.api.Result
                public Status getStatus() {
                    return status;
                }
            };
        }
    }

    private static abstract class ClaimImpl extends Games.BaseGamesApiMethodImpl<Quests.ClaimMilestoneResult> {
        private ClaimImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: zzao */
        public Quests.ClaimMilestoneResult createFailedResult(final Status status) {
            return new Quests.ClaimMilestoneResult() {
                /* class com.google.android.gms.games.internal.api.QuestsImpl.ClaimImpl.AnonymousClass1 */

                @Override // com.google.android.gms.games.quest.Quests.ClaimMilestoneResult
                public Milestone getMilestone() {
                    return null;
                }

                @Override // com.google.android.gms.games.quest.Quests.ClaimMilestoneResult
                public Quest getQuest() {
                    return null;
                }

                @Override // com.google.android.gms.common.api.Result
                public Status getStatus() {
                    return status;
                }
            };
        }
    }

    private static abstract class LoadsImpl extends Games.BaseGamesApiMethodImpl<Quests.LoadQuestsResult> {
        private LoadsImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: zzap */
        public Quests.LoadQuestsResult createFailedResult(final Status status) {
            return new Quests.LoadQuestsResult() {
                /* class com.google.android.gms.games.internal.api.QuestsImpl.LoadsImpl.AnonymousClass1 */

                @Override // com.google.android.gms.games.quest.Quests.LoadQuestsResult
                public QuestBuffer getQuests() {
                    return new QuestBuffer(DataHolder.zzbi(status.getStatusCode()));
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

    @Override // com.google.android.gms.games.quest.Quests
    public PendingResult<Quests.AcceptQuestResult> accept(GoogleApiClient apiClient, final String questId) {
        return apiClient.zzb(new AcceptImpl(apiClient) {
            /* class com.google.android.gms.games.internal.api.QuestsImpl.AnonymousClass1 */

            /* access modifiers changed from: protected */
            public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
                gamesClientImpl.zzh(this, questId);
            }
        });
    }

    @Override // com.google.android.gms.games.quest.Quests
    public PendingResult<Quests.ClaimMilestoneResult> claim(GoogleApiClient apiClient, final String questId, final String milestoneId) {
        return apiClient.zzb(new ClaimImpl(apiClient) {
            /* class com.google.android.gms.games.internal.api.QuestsImpl.AnonymousClass2 */

            /* access modifiers changed from: protected */
            public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
                gamesClientImpl.zzb(this, questId, milestoneId);
            }
        });
    }

    @Override // com.google.android.gms.games.quest.Quests
    public Intent getQuestIntent(GoogleApiClient apiClient, String questId) {
        return Games.zzd(apiClient).zzcO(questId);
    }

    @Override // com.google.android.gms.games.quest.Quests
    public Intent getQuestsIntent(GoogleApiClient apiClient, int[] questSelectors) {
        return Games.zzd(apiClient).zzb(questSelectors);
    }

    @Override // com.google.android.gms.games.quest.Quests
    public PendingResult<Quests.LoadQuestsResult> load(GoogleApiClient apiClient, final int[] questSelectors, final int sortOrder, final boolean forceReload) {
        return apiClient.zza(new LoadsImpl(apiClient) {
            /* class com.google.android.gms.games.internal.api.QuestsImpl.AnonymousClass3 */

            /* access modifiers changed from: protected */
            public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
                gamesClientImpl.zza(this, questSelectors, sortOrder, forceReload);
            }
        });
    }

    @Override // com.google.android.gms.games.quest.Quests
    public PendingResult<Quests.LoadQuestsResult> loadByIds(GoogleApiClient apiClient, final boolean forceReload, final String... questIds) {
        return apiClient.zza(new LoadsImpl(apiClient) {
            /* class com.google.android.gms.games.internal.api.QuestsImpl.AnonymousClass4 */

            /* access modifiers changed from: protected */
            public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
                gamesClientImpl.zzb(this, forceReload, questIds);
            }
        });
    }

    @Override // com.google.android.gms.games.quest.Quests
    public void registerQuestUpdateListener(GoogleApiClient apiClient, QuestUpdateListener listener) {
        GamesClientImpl zzb = Games.zzb(apiClient, false);
        if (zzb != null) {
            zzb.zzc(apiClient.zzo(listener));
        }
    }

    @Override // com.google.android.gms.games.quest.Quests
    public void showStateChangedPopup(GoogleApiClient apiClient, String questId) {
        GamesClientImpl zzb = Games.zzb(apiClient, false);
        if (zzb != null) {
            zzb.zzcP(questId);
        }
    }

    @Override // com.google.android.gms.games.quest.Quests
    public void unregisterQuestUpdateListener(GoogleApiClient apiClient) {
        GamesClientImpl zzb = Games.zzb(apiClient, false);
        if (zzb != null) {
            zzb.zzsF();
        }
    }
}
