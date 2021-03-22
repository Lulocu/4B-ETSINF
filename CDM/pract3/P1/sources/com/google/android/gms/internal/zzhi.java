package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.ads.internal.zzo;

@zzgd
public class zzhi extends Handler {
    public zzhi(Looper looper) {
        super(looper);
    }

    public void handleMessage(Message msg) {
        try {
            super.handleMessage(msg);
        } catch (Exception e) {
            zzo.zzby().zzc((Throwable) e, false);
            throw e;
        }
    }
}
