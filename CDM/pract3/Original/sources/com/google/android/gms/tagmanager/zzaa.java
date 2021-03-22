package com.google.android.gms.tagmanager;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzag;
import java.util.Map;

/* access modifiers changed from: package-private */
public class zzaa extends zzak {
    private static final String ID = zzad.DEVICE_ID.toString();
    private final Context mContext;

    public zzaa(Context context) {
        super(ID, new String[0]);
        this.mContext = context;
    }

    @Override // com.google.android.gms.tagmanager.zzak
    public zzag.zza zzE(Map<String, zzag.zza> map) {
        String zzaG = zzaG(this.mContext);
        return zzaG == null ? zzdf.zzzQ() : zzdf.zzI(zzaG);
    }

    /* access modifiers changed from: protected */
    public String zzaG(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    @Override // com.google.android.gms.tagmanager.zzak
    public boolean zzyh() {
        return true;
    }
}