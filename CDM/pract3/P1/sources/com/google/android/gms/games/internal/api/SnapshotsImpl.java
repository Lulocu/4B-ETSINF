package com.google.android.gms.games.internal.api;

import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.snapshot.Snapshot;
import com.google.android.gms.games.snapshot.SnapshotContents;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.SnapshotMetadataBuffer;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;
import com.google.android.gms.games.snapshot.Snapshots;

public final class SnapshotsImpl implements Snapshots {

    /* renamed from: com.google.android.gms.games.internal.api.SnapshotsImpl$6  reason: invalid class name */
    class AnonymousClass6 extends LoadImpl {
        final /* synthetic */ String zzTE;
        final /* synthetic */ String zzaqA;
        final /* synthetic */ boolean zzaqy;

        /* access modifiers changed from: protected */
        public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzc(this, this.zzTE, this.zzaqA, this.zzaqy);
        }
    }

    private static abstract class CommitImpl extends Games.BaseGamesApiMethodImpl<Snapshots.CommitSnapshotResult> {
        private CommitImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: zzau */
        public Snapshots.CommitSnapshotResult createFailedResult(final Status status) {
            return new Snapshots.CommitSnapshotResult() {
                /* class com.google.android.gms.games.internal.api.SnapshotsImpl.CommitImpl.AnonymousClass1 */

                @Override // com.google.android.gms.games.snapshot.Snapshots.CommitSnapshotResult
                public SnapshotMetadata getSnapshotMetadata() {
                    return null;
                }

                @Override // com.google.android.gms.common.api.Result
                public Status getStatus() {
                    return status;
                }
            };
        }
    }

    private static abstract class DeleteImpl extends Games.BaseGamesApiMethodImpl<Snapshots.DeleteSnapshotResult> {
        private DeleteImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: zzav */
        public Snapshots.DeleteSnapshotResult createFailedResult(final Status status) {
            return new Snapshots.DeleteSnapshotResult() {
                /* class com.google.android.gms.games.internal.api.SnapshotsImpl.DeleteImpl.AnonymousClass1 */

                @Override // com.google.android.gms.games.snapshot.Snapshots.DeleteSnapshotResult
                public String getSnapshotId() {
                    return null;
                }

                @Override // com.google.android.gms.common.api.Result
                public Status getStatus() {
                    return status;
                }
            };
        }
    }

    private static abstract class LoadImpl extends Games.BaseGamesApiMethodImpl<Snapshots.LoadSnapshotsResult> {
        private LoadImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: zzaw */
        public Snapshots.LoadSnapshotsResult createFailedResult(final Status status) {
            return new Snapshots.LoadSnapshotsResult() {
                /* class com.google.android.gms.games.internal.api.SnapshotsImpl.LoadImpl.AnonymousClass1 */

                @Override // com.google.android.gms.games.snapshot.Snapshots.LoadSnapshotsResult
                public SnapshotMetadataBuffer getSnapshots() {
                    return new SnapshotMetadataBuffer(DataHolder.zzbi(14));
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

    private static abstract class OpenImpl extends Games.BaseGamesApiMethodImpl<Snapshots.OpenSnapshotResult> {
        private OpenImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: zzax */
        public Snapshots.OpenSnapshotResult createFailedResult(final Status status) {
            return new Snapshots.OpenSnapshotResult() {
                /* class com.google.android.gms.games.internal.api.SnapshotsImpl.OpenImpl.AnonymousClass1 */

                @Override // com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult
                public String getConflictId() {
                    return null;
                }

                @Override // com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult
                public Snapshot getConflictingSnapshot() {
                    return null;
                }

                @Override // com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult
                public SnapshotContents getResolutionSnapshotContents() {
                    return null;
                }

                @Override // com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult
                public Snapshot getSnapshot() {
                    return null;
                }

                @Override // com.google.android.gms.common.api.Result
                public Status getStatus() {
                    return status;
                }
            };
        }
    }

    @Override // com.google.android.gms.games.snapshot.Snapshots
    public PendingResult<Snapshots.CommitSnapshotResult> commitAndClose(GoogleApiClient apiClient, final Snapshot snapshot, final SnapshotMetadataChange metadataChange) {
        return apiClient.zzb(new CommitImpl(apiClient) {
            /* class com.google.android.gms.games.internal.api.SnapshotsImpl.AnonymousClass3 */

            /* access modifiers changed from: protected */
            public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
                gamesClientImpl.zza(this, snapshot, metadataChange);
            }
        });
    }

    @Override // com.google.android.gms.games.snapshot.Snapshots
    public PendingResult<Snapshots.DeleteSnapshotResult> delete(GoogleApiClient apiClient, final SnapshotMetadata metadata) {
        return apiClient.zzb(new DeleteImpl(apiClient) {
            /* class com.google.android.gms.games.internal.api.SnapshotsImpl.AnonymousClass4 */

            /* access modifiers changed from: protected */
            public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
                gamesClientImpl.zzi(this, metadata.getSnapshotId());
            }
        });
    }

    @Override // com.google.android.gms.games.snapshot.Snapshots
    public void discardAndClose(GoogleApiClient apiClient, Snapshot snapshot) {
        Games.zzd(apiClient).zza(snapshot);
    }

    @Override // com.google.android.gms.games.snapshot.Snapshots
    public int getMaxCoverImageSize(GoogleApiClient apiClient) {
        return Games.zzd(apiClient).zzsQ();
    }

    @Override // com.google.android.gms.games.snapshot.Snapshots
    public int getMaxDataSize(GoogleApiClient apiClient) {
        return Games.zzd(apiClient).zzsP();
    }

    @Override // com.google.android.gms.games.snapshot.Snapshots
    public Intent getSelectSnapshotIntent(GoogleApiClient apiClient, String title, boolean allowAddButton, boolean allowDelete, int maxSnapshots) {
        return Games.zzd(apiClient).zza(title, allowAddButton, allowDelete, maxSnapshots);
    }

    @Override // com.google.android.gms.games.snapshot.Snapshots
    public SnapshotMetadata getSnapshotFromBundle(Bundle extras) {
        if (extras == null || !extras.containsKey(Snapshots.EXTRA_SNAPSHOT_METADATA)) {
            return null;
        }
        return (SnapshotMetadata) extras.getParcelable(Snapshots.EXTRA_SNAPSHOT_METADATA);
    }

    @Override // com.google.android.gms.games.snapshot.Snapshots
    public PendingResult<Snapshots.LoadSnapshotsResult> load(GoogleApiClient apiClient, final boolean forceReload) {
        return apiClient.zza(new LoadImpl(apiClient) {
            /* class com.google.android.gms.games.internal.api.SnapshotsImpl.AnonymousClass1 */

            /* access modifiers changed from: protected */
            public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
                gamesClientImpl.zze(this, forceReload);
            }
        });
    }

    @Override // com.google.android.gms.games.snapshot.Snapshots
    public PendingResult<Snapshots.OpenSnapshotResult> open(GoogleApiClient apiClient, SnapshotMetadata metadata) {
        return open(apiClient, metadata.getUniqueName(), false);
    }

    @Override // com.google.android.gms.games.snapshot.Snapshots
    public PendingResult<Snapshots.OpenSnapshotResult> open(GoogleApiClient apiClient, SnapshotMetadata metadata, int conflictPolicy) {
        return open(apiClient, metadata.getUniqueName(), false, conflictPolicy);
    }

    @Override // com.google.android.gms.games.snapshot.Snapshots
    public PendingResult<Snapshots.OpenSnapshotResult> open(GoogleApiClient apiClient, String fileName, boolean createIfNotFound) {
        return open(apiClient, fileName, createIfNotFound, -1);
    }

    @Override // com.google.android.gms.games.snapshot.Snapshots
    public PendingResult<Snapshots.OpenSnapshotResult> open(GoogleApiClient apiClient, final String fileName, final boolean createIfNotFound, final int conflictPolicy) {
        return apiClient.zzb(new OpenImpl(apiClient) {
            /* class com.google.android.gms.games.internal.api.SnapshotsImpl.AnonymousClass2 */

            /* access modifiers changed from: protected */
            public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
                gamesClientImpl.zza(this, fileName, createIfNotFound, conflictPolicy);
            }
        });
    }

    @Override // com.google.android.gms.games.snapshot.Snapshots
    public PendingResult<Snapshots.OpenSnapshotResult> resolveConflict(GoogleApiClient apiClient, String conflictId, Snapshot snapshot) {
        SnapshotMetadata metadata = snapshot.getMetadata();
        return resolveConflict(apiClient, conflictId, metadata.getSnapshotId(), new SnapshotMetadataChange.Builder().fromMetadata(metadata).build(), snapshot.getSnapshotContents());
    }

    @Override // com.google.android.gms.games.snapshot.Snapshots
    public PendingResult<Snapshots.OpenSnapshotResult> resolveConflict(GoogleApiClient apiClient, final String conflictId, final String snapshotId, final SnapshotMetadataChange metadataChange, final SnapshotContents snapshotContents) {
        return apiClient.zzb(new OpenImpl(apiClient) {
            /* class com.google.android.gms.games.internal.api.SnapshotsImpl.AnonymousClass5 */

            /* access modifiers changed from: protected */
            public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
                gamesClientImpl.zza(this, conflictId, snapshotId, metadataChange, snapshotContents);
            }
        });
    }
}
