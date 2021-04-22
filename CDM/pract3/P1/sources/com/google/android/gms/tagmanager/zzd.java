package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.plus.PlusShare;
import com.google.android.gms.tagmanager.DataLayer;
import java.util.Map;

/* access modifiers changed from: package-private */
public class zzd implements DataLayer.zzb {
    private final Context zzpH;

    public zzd(Context context) {
        this.zzpH = context;
    }

    @Override // com.google.android.gms.tagmanager.DataLayer.zzb
    public void zzF(Map<String, Object> map) {
        String queryParameter;
        Object obj;
        Object obj2 = map.get("gtm.url");
        Object obj3 = (obj2 != null || (obj = map.get("gtm")) == null || !(obj instanceof Map)) ? obj2 : ((Map) obj).get(PlusShare.KEY_CALL_TO_ACTION_URL);
        if (obj3 != null && (obj3 instanceof String) && (queryParameter = Uri.parse((String) obj3).getQueryParameter("referrer")) != null) {
            zzax.zzk(this.zzpH, queryParameter);
        }
    }
}
