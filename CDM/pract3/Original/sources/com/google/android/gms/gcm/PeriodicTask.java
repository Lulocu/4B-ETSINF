package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.gcm.Task;

public class PeriodicTask extends Task {
    public static final Parcelable.Creator<PeriodicTask> CREATOR = new Parcelable.Creator<PeriodicTask>() {
        /* class com.google.android.gms.gcm.PeriodicTask.AnonymousClass1 */

        /* renamed from: zzdX */
        public PeriodicTask createFromParcel(Parcel parcel) {
            return new PeriodicTask(parcel);
        }

        /* renamed from: zzgj */
        public PeriodicTask[] newArray(int i) {
            return new PeriodicTask[i];
        }
    };
    protected long mFlexInSeconds;
    protected long mIntervalInSeconds;

    public static class Builder extends Task.Builder {
        private long zzawd = -1;
        private long zzawe = -1;

        public Builder() {
            this.isPersisted = true;
        }

        @Override // com.google.android.gms.gcm.Task.Builder
        public PeriodicTask build() {
            checkConditions();
            return new PeriodicTask(this);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.gcm.Task.Builder
        public void checkConditions() {
            super.checkConditions();
            if (this.zzawd == -1) {
                throw new IllegalArgumentException("Must call setPeriod(long) to establish an execution interval for this periodic task.");
            } else if (this.zzawe == -1) {
                this.zzawe = (long) (((float) this.zzawd) * 0.1f);
            }
        }

        public Builder setFlex(long flexInSeconds) {
            this.zzawe = flexInSeconds;
            return this;
        }

        public Builder setPeriod(long intervalInSeconds) {
            this.zzawd = intervalInSeconds;
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.Builder
        public Builder setPersisted(boolean isPersisted) {
            this.isPersisted = isPersisted;
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.Builder
        public Builder setRequiredNetwork(int requiredNetworkState) {
            this.requiredNetworkState = requiredNetworkState;
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.Builder
        public Builder setRequiresCharging(boolean requiresCharging) {
            this.requiresCharging = requiresCharging;
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.Builder
        public Builder setService(Class<? extends GcmTaskService> gcmTaskService) {
            this.gcmTaskService = gcmTaskService.getName();
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.Builder
        public Builder setTag(String tag) {
            this.tag = tag;
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.Builder
        public Builder setUpdateCurrent(boolean updateCurrent) {
            this.updateCurrent = updateCurrent;
            return this;
        }
    }

    @Deprecated
    private PeriodicTask(Parcel in) {
        super(in);
        this.mIntervalInSeconds = -1;
        this.mFlexInSeconds = -1;
        this.mIntervalInSeconds = in.readLong();
        this.mFlexInSeconds = in.readLong();
    }

    private PeriodicTask(Builder builder) {
        super(builder);
        this.mIntervalInSeconds = -1;
        this.mFlexInSeconds = -1;
        this.mIntervalInSeconds = builder.zzawd;
        this.mFlexInSeconds = builder.zzawe;
    }

    public long getFlex() {
        return this.mFlexInSeconds;
    }

    public long getPeriod() {
        return this.mIntervalInSeconds;
    }

    @Override // com.google.android.gms.gcm.Task
    public void toBundle(Bundle bundle) {
        super.toBundle(bundle);
        bundle.putLong("period", this.mIntervalInSeconds);
        bundle.putLong("period_flex", this.mFlexInSeconds);
    }

    public String toString() {
        return super.toString() + " " + "period=" + getPeriod() + " " + "flex=" + getFlex();
    }

    @Override // com.google.android.gms.gcm.Task
    public void writeToParcel(Parcel parcel, int flags) {
        super.writeToParcel(parcel, flags);
        parcel.writeLong(this.mIntervalInSeconds);
        parcel.writeLong(this.mFlexInSeconds);
    }
}
