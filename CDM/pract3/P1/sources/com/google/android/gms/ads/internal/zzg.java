package com.google.android.gms.ads.internal;

import android.content.Context;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzaj;
import com.google.android.gms.internal.zzam;
import com.google.android.gms.internal.zzbz;
import com.google.android.gms.internal.zzgd;
import com.google.android.gms.internal.zzhk;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* access modifiers changed from: package-private */
@zzgd
public class zzg implements zzaj, Runnable {
    private final List<Object[]> zzoB = new Vector();
    private final AtomicReference<zzaj> zzoC = new AtomicReference<>();
    CountDownLatch zzoD = new CountDownLatch(1);
    private zzp zzon;

    public zzg(zzp zzp) {
        this.zzon = zzp;
        if (zzk.zzcA().zzgw()) {
            zzhk.zza(this);
        } else {
            run();
        }
    }

    private void zzbf() {
        if (!this.zzoB.isEmpty()) {
            for (Object[] objArr : this.zzoB) {
                if (objArr.length == 1) {
                    this.zzoC.get().zza((MotionEvent) objArr[0]);
                } else if (objArr.length == 3) {
                    this.zzoC.get().zza(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                }
            }
            this.zzoB.clear();
        }
    }

    private Context zzp(Context context) {
        Context applicationContext;
        return (zzbz.zztM.get().booleanValue() && (applicationContext = context.getApplicationContext()) != null) ? applicationContext : context;
    }

    public void run() {
        try {
            zza(zzb(this.zzon.zzpJ.zzGG, zzp(this.zzon.zzpH), !zzbz.zztU.get().booleanValue() || this.zzon.zzpJ.zzGJ));
        } finally {
            this.zzoD.countDown();
            this.zzon = null;
        }
    }

    @Override // com.google.android.gms.internal.zzaj
    public String zza(Context context, String str) {
        zzaj zzaj;
        if (!zzbe() || (zzaj = this.zzoC.get()) == null) {
            return "";
        }
        zzbf();
        return zzaj.zza(zzp(context), str);
    }

    @Override // com.google.android.gms.internal.zzaj
    public void zza(int i, int i2, int i3) {
        zzaj zzaj = this.zzoC.get();
        if (zzaj != null) {
            zzbf();
            zzaj.zza(i, i2, i3);
            return;
        }
        this.zzoB.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    @Override // com.google.android.gms.internal.zzaj
    public void zza(MotionEvent motionEvent) {
        zzaj zzaj = this.zzoC.get();
        if (zzaj != null) {
            zzbf();
            zzaj.zza(motionEvent);
            return;
        }
        this.zzoB.add(new Object[]{motionEvent});
    }

    /* access modifiers changed from: protected */
    public void zza(zzaj zzaj) {
        this.zzoC.set(zzaj);
    }

    /* access modifiers changed from: protected */
    public zzaj zzb(String str, Context context, boolean z) {
        return zzam.zza(str, context, z);
    }

    @Override // com.google.android.gms.internal.zzaj
    public String zzb(Context context) {
        zzaj zzaj;
        if (!zzbe() || (zzaj = this.zzoC.get()) == null) {
            return "";
        }
        zzbf();
        return zzaj.zzb(zzp(context));
    }

    /* access modifiers changed from: protected */
    public boolean zzbe() {
        try {
            this.zzoD.await();
            return true;
        } catch (InterruptedException e) {
            zzb.zzd("Interrupted during GADSignals creation.", e);
            return false;
        }
    }
}
