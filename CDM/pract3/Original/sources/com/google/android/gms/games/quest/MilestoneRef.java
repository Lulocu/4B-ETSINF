package com.google.android.gms.games.quest;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;

public final class MilestoneRef extends zzc implements Milestone {
    MilestoneRef(DataHolder holder, int dataRow) {
        super(holder, dataRow);
    }

    private long zztM() {
        return getLong("initial_value");
    }

    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.common.data.zzc
    public boolean equals(Object obj) {
        return MilestoneEntity.zza(this, obj);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public Milestone freeze() {
        return new MilestoneEntity(this);
    }

    @Override // com.google.android.gms.games.quest.Milestone
    public byte[] getCompletionRewardData() {
        return getByteArray("completion_reward_data");
    }

    @Override // com.google.android.gms.games.quest.Milestone
    public long getCurrentProgress() {
        switch (getState()) {
            case 1:
            default:
                return 0;
            case 2:
                return getLong("current_value") - zztM();
            case 3:
            case 4:
                return getTargetProgress();
        }
    }

    @Override // com.google.android.gms.games.quest.Milestone
    public String getEventId() {
        return getString("external_event_id");
    }

    @Override // com.google.android.gms.games.quest.Milestone
    public String getMilestoneId() {
        return getString("external_milestone_id");
    }

    @Override // com.google.android.gms.games.quest.Milestone
    public int getState() {
        return getInteger("milestone_state");
    }

    @Override // com.google.android.gms.games.quest.Milestone
    public long getTargetProgress() {
        return getLong("target_value");
    }

    @Override // com.google.android.gms.common.data.zzc
    public int hashCode() {
        return MilestoneEntity.zza(this);
    }

    public String toString() {
        return MilestoneEntity.zzb(this);
    }

    public void writeToParcel(Parcel dest, int flags) {
        ((MilestoneEntity) freeze()).writeToParcel(dest, flags);
    }
}
