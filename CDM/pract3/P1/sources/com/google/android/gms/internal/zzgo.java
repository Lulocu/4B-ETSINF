package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.reward.client.RewardedVideoAdRequestParcel;
import com.google.android.gms.ads.internal.reward.client.zzd;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzo;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzha;
import java.util.HashMap;

@zzgd
public class zzgo extends zzb implements zzgs {
    private zzd zzEN;
    private String zzEO;
    private boolean zzEP;
    private HashMap<String, zzgp> zzEQ = new HashMap<>();

    public zzgo(Context context, AdSizeParcel adSizeParcel, zzef zzef, VersionInfoParcel versionInfoParcel) {
        super(context, adSizeParcel, null, zzef, versionInfoParcel);
    }

    @Override // com.google.android.gms.ads.internal.client.zzr, com.google.android.gms.ads.internal.zza
    public void destroy() {
        zzu.zzbY("destroy must be called on the main UI thread.");
        for (String str : this.zzEQ.keySet()) {
            try {
                zzgp zzgp = this.zzEQ.get(str);
                if (!(zzgp == null || zzgp.zzfM() == null)) {
                    zzgp.zzfM().destroy();
                }
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzb.zzaC("Fail to destroy adapter: " + str);
            }
        }
    }

    public boolean isLoaded() {
        zzu.zzbY("isLoaded must be called on the main UI thread.");
        return this.zzon.zzpL == null && this.zzon.zzpM == null && this.zzon.zzpO != null;
    }

    @Override // com.google.android.gms.internal.zzgs
    public void onRewardedVideoAdClosed() {
        if (this.zzEN != null) {
            try {
                this.zzEN.onRewardedVideoAdClosed();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call RewardedVideoAdListener.onAdClosed().", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.zzgs
    public void onRewardedVideoAdLeftApplication() {
        if (this.zzEN != null) {
            try {
                this.zzEN.onRewardedVideoAdLeftApplication();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call RewardedVideoAdListener.onAdLeftApplication().", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.zzgs
    public void onRewardedVideoAdOpened() {
        recordImpression();
        if (this.zzEN != null) {
            try {
                this.zzEN.onRewardedVideoAdOpened();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call RewardedVideoAdListener.onAdOpened().", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.zzgs
    public void onRewardedVideoStarted() {
        zzo.zzbG().zza(this.zzon.zzpH, this.zzon.zzpJ.zzGG, this.zzon.zzpO, this.zzon.zzpG, false, this.zzon.zzpO.zzxZ.zzxB);
        if (this.zzEN != null) {
            try {
                this.zzEN.onRewardedVideoStarted();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call RewardedVideoAdListener.onVideoStarted().", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzr, com.google.android.gms.ads.internal.zza, com.google.android.gms.ads.internal.zzb
    public void pause() {
        zzu.zzbY("pause must be called on the main UI thread.");
        for (String str : this.zzEQ.keySet()) {
            try {
                zzgp zzgp = this.zzEQ.get(str);
                if (!(zzgp == null || zzgp.zzfM() == null)) {
                    zzgp.zzfM().pause();
                }
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzb.zzaC("Fail to pause adapter: " + str);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzr, com.google.android.gms.ads.internal.zza, com.google.android.gms.ads.internal.zzb
    public void resume() {
        zzu.zzbY("resume must be called on the main UI thread.");
        for (String str : this.zzEQ.keySet()) {
            try {
                zzgp zzgp = this.zzEQ.get(str);
                if (!(zzgp == null || zzgp.zzfM() == null)) {
                    zzgp.zzfM().resume();
                }
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzb.zzaC("Fail to resume adapter: " + str);
            }
        }
    }

    public void setUserId(String userId) {
        zzu.zzbY("setUserId must be called on the main UI thread.");
        this.zzEO = userId;
    }

    public void zza(RewardedVideoAdRequestParcel rewardedVideoAdRequestParcel) {
        zzu.zzbY("loadAd must be called on the main UI thread.");
        if (TextUtils.isEmpty(rewardedVideoAdRequestParcel.zzpG)) {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Invalid ad unit id. Aborting.");
            return;
        }
        this.zzEP = false;
        this.zzon.zzpG = rewardedVideoAdRequestParcel.zzpG;
        super.zza(rewardedVideoAdRequestParcel.zzCm);
    }

    public void zza(zzd zzd) {
        zzu.zzbY("setRewardedVideoAdListener must be called on the main UI thread.");
        this.zzEN = zzd;
    }

    @Override // com.google.android.gms.internal.zzgs
    public void zza(RewardItemParcel rewardItemParcel) {
        zzo.zzbG().zza(this.zzon.zzpH, this.zzon.zzpJ.zzGG, this.zzon.zzpO, this.zzon.zzpG, false, this.zzon.zzpO.zzxZ.zzxC);
        if (this.zzEN != null) {
            try {
                if (this.zzon.zzpO == null || this.zzon.zzpO.zzFm == null || TextUtils.isEmpty(this.zzon.zzpO.zzFm.zzxK)) {
                    this.zzEN.zza(new zzgm(rewardItemParcel.type, rewardItemParcel.zzFk));
                } else {
                    this.zzEN.zza(new zzgm(this.zzon.zzpO.zzFm.zzxK, this.zzon.zzpO.zzFm.zzxL));
                }
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call RewardedVideoAdListener.onRewarded().", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.zza, com.google.android.gms.ads.internal.zzb
    public boolean zza(zzha zzha, zzha zzha2) {
        if (this.zzEN == null) {
            return true;
        }
        try {
            this.zzEN.onRewardedVideoAdLoaded();
            return true;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call RewardedVideoAdListener.onAdLoaded().", e);
            return true;
        }
    }

    public zzgp zzao(String str) {
        Exception e;
        zzgp zzgp = this.zzEQ.get(str);
        if (zzgp != null) {
            return zzgp;
        }
        try {
            zzgp zzgp2 = new zzgp(this.zzoq.zzY(str), this);
            try {
                this.zzEQ.put(str, zzgp2);
                return zzgp2;
            } catch (Exception e2) {
                zzgp = zzgp2;
                e = e2;
                com.google.android.gms.ads.internal.util.client.zzb.zzd("Fail to instantiate adapter " + str, e);
                return zzgp;
            }
        } catch (Exception e3) {
            e = e3;
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Fail to instantiate adapter " + str, e);
            return zzgp;
        }
    }

    @Override // com.google.android.gms.ads.internal.zza
    public boolean zzb(zzha.zza zza) {
        if (zza.errorCode != -2) {
            zzb(new zzha(zza, null, null, null, null, null, null));
        } else {
            this.zzon.zzqh = 0;
            this.zzon.zzpM = new zzgv(this.zzon.zzpH, this.zzEO, zza, this);
            this.zzon.zzpM.zzgi();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.internal.zza
    public boolean zze(int i) {
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("Failed to load ad: " + i);
        if (this.zzEN == null) {
            return false;
        }
        try {
            this.zzEN.onRewardedVideoAdFailedToLoad(i);
            return true;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call RewardedVideoAdListener.onAdFailedToLoad().", e);
            return false;
        }
    }

    public void zzfK() {
        zzu.zzbY("showAd must be called on the main UI thread.");
        if (!isLoaded() || this.zzEP) {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("The reward video has not loaded.");
            return;
        }
        this.zzEP = true;
        zzgp zzao = zzao(this.zzon.zzpO.zzyb);
        if (zzao != null && zzao.zzfM() != null) {
            try {
                zzao.zzfM().showVideo();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call showVideo.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.zzgs
    public void zzfL() {
        onAdClicked();
    }
}
