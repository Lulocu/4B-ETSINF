package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.android.gms.nearby.messages.internal.zza;
import com.google.android.gms.nearby.messages.internal.zzb;

public final class SubscribeRequest implements SafeParcelable {
    public static final Parcelable.Creator<SubscribeRequest> CREATOR = new zzj();
    final int zzCY;
    public final Strategy zzaGc;
    public final zzb zzaGd;
    public final String zzaGe;
    public final zza zzaGf;
    public final MessageFilter zzaGg;
    public final PendingIntent zzaGh;
    public final int zzaGi;
    public final String zzayp;

    SubscribeRequest(int versionCode, IBinder messageListener, Strategy strategy, IBinder callbackAsBinder, MessageFilter filter, PendingIntent pendingIntent, int messageListenerKey, String zeroPartyPackageName, String realClientPackageName) {
        this.zzCY = versionCode;
        this.zzaGf = zza.AbstractBinderC0204zza.zzdd(messageListener);
        this.zzaGc = strategy;
        this.zzaGd = zzb.zza.zzde(callbackAsBinder);
        this.zzaGg = filter;
        this.zzaGh = pendingIntent;
        this.zzaGi = messageListenerKey;
        this.zzayp = zeroPartyPackageName;
        this.zzaGe = realClientPackageName;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        zzj.zza(this, dest, flags);
    }

    /* access modifiers changed from: package-private */
    public IBinder zzxa() {
        if (this.zzaGd == null) {
            return null;
        }
        return this.zzaGd.asBinder();
    }

    /* access modifiers changed from: package-private */
    public IBinder zzxb() {
        if (this.zzaGf == null) {
            return null;
        }
        return this.zzaGf.asBinder();
    }
}
