package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.AbstractPendingResult;
import com.google.android.gms.common.api.PendingResult;
import java.util.ArrayList;
import java.util.List;

public final class Batch extends AbstractPendingResult<BatchResult> {
    private int zzWn;
    private boolean zzWo;
    private boolean zzWp;
    private final PendingResult<?>[] zzWq;
    private final Object zzqt;

    public static final class Builder {
        private List<PendingResult<?>> zzWs = new ArrayList();
        private Looper zzWt;

        public Builder(GoogleApiClient googleApiClient) {
            this.zzWt = googleApiClient.getLooper();
        }

        public <R extends Result> BatchResultToken<R> add(PendingResult<R> pendingResult) {
            BatchResultToken<R> batchResultToken = new BatchResultToken<>(this.zzWs.size());
            this.zzWs.add(pendingResult);
            return batchResultToken;
        }

        public Batch build() {
            return new Batch(this.zzWs, this.zzWt);
        }
    }

    private Batch(List<PendingResult<?>> pendingResultList, Looper looper) {
        super(new AbstractPendingResult.CallbackHandler(looper));
        this.zzqt = new Object();
        this.zzWn = pendingResultList.size();
        this.zzWq = new PendingResult[this.zzWn];
        for (int i = 0; i < pendingResultList.size(); i++) {
            PendingResult<?> pendingResult = pendingResultList.get(i);
            this.zzWq[i] = pendingResult;
            pendingResult.addBatchCallback(new PendingResult.BatchCallback() {
                /* class com.google.android.gms.common.api.Batch.AnonymousClass1 */

                @Override // com.google.android.gms.common.api.PendingResult.BatchCallback
                public void zzs(Status status) {
                    synchronized (Batch.this.zzqt) {
                        if (!Batch.this.isCanceled()) {
                            if (status.isCanceled()) {
                                Batch.this.zzWp = true;
                            } else if (!status.isSuccess()) {
                                Batch.this.zzWo = true;
                            }
                            Batch.zzb(Batch.this);
                            if (Batch.this.zzWn == 0) {
                                if (Batch.this.zzWp) {
                                    Batch.super.cancel();
                                } else {
                                    Batch.this.setResult(new BatchResult(Batch.this.zzWo ? new Status(13) : Status.zzXP, Batch.this.zzWq));
                                }
                            }
                        }
                    }
                }
            });
        }
    }

    static /* synthetic */ int zzb(Batch batch) {
        int i = batch.zzWn;
        batch.zzWn = i - 1;
        return i;
    }

    @Override // com.google.android.gms.common.api.AbstractPendingResult, com.google.android.gms.common.api.PendingResult
    public void cancel() {
        super.cancel();
        for (PendingResult<?> pendingResult : this.zzWq) {
            pendingResult.cancel();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractPendingResult
    public BatchResult createFailedResult(Status status) {
        return new BatchResult(status, this.zzWq);
    }
}
