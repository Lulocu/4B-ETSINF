package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzgd
public final class zzdf {
    public static final zzdg zzvV = new zzdg() {
        /* class com.google.android.gms.internal.zzdf.AnonymousClass1 */

        @Override // com.google.android.gms.internal.zzdg
        public void zza(zzid zzid, Map<String, String> map) {
        }
    };
    public static final zzdg zzvW = new zzdg() {
        /* class com.google.android.gms.internal.zzdf.AnonymousClass2 */

        @Override // com.google.android.gms.internal.zzdg
        public void zza(zzid zzid, Map<String, String> map) {
            String str = map.get("urls");
            if (TextUtils.isEmpty(str)) {
                zzb.zzaC("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String[] split = str.split(",");
            HashMap hashMap = new HashMap();
            PackageManager packageManager = zzid.getContext().getPackageManager();
            for (String str2 : split) {
                String[] split2 = str2.split(";", 2);
                hashMap.put(str2, Boolean.valueOf(packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) != null));
            }
            zzid.zzc("openableURLs", hashMap);
        }
    };
    public static final zzdg zzvX = new zzdg() {
        /* class com.google.android.gms.internal.zzdf.AnonymousClass3 */

        @Override // com.google.android.gms.internal.zzdg
        public void zza(zzid zzid, Map<String, String> map) {
            PackageManager packageManager = zzid.getContext().getPackageManager();
            try {
                try {
                    JSONArray jSONArray = new JSONObject(map.get("data")).getJSONArray("intents");
                    JSONObject jSONObject = new JSONObject();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            String optString = jSONObject2.optString("id");
                            String optString2 = jSONObject2.optString("u");
                            String optString3 = jSONObject2.optString("i");
                            String optString4 = jSONObject2.optString("m");
                            String optString5 = jSONObject2.optString("p");
                            String optString6 = jSONObject2.optString("c");
                            jSONObject2.optString("f");
                            jSONObject2.optString("e");
                            Intent intent = new Intent();
                            if (!TextUtils.isEmpty(optString2)) {
                                intent.setData(Uri.parse(optString2));
                            }
                            if (!TextUtils.isEmpty(optString3)) {
                                intent.setAction(optString3);
                            }
                            if (!TextUtils.isEmpty(optString4)) {
                                intent.setType(optString4);
                            }
                            if (!TextUtils.isEmpty(optString5)) {
                                intent.setPackage(optString5);
                            }
                            if (!TextUtils.isEmpty(optString6)) {
                                String[] split = optString6.split("/", 2);
                                if (split.length == 2) {
                                    intent.setComponent(new ComponentName(split[0], split[1]));
                                }
                            }
                            try {
                                jSONObject.put(optString, packageManager.resolveActivity(intent, 65536) != null);
                            } catch (JSONException e) {
                                zzb.zzb("Error constructing openable urls response.", e);
                            }
                        } catch (JSONException e2) {
                            zzb.zzb("Error parsing the intent data.", e2);
                        }
                    }
                    zzid.zzb("openableIntents", jSONObject);
                } catch (JSONException e3) {
                    zzid.zzb("openableIntents", new JSONObject());
                }
            } catch (JSONException e4) {
                zzid.zzb("openableIntents", new JSONObject());
            }
        }
    };
    public static final zzdg zzvY = new zzdg() {
        /* class com.google.android.gms.internal.zzdf.AnonymousClass4 */

        @Override // com.google.android.gms.internal.zzdg
        public void zza(zzid zzid, Map<String, String> map) {
            Uri uri;
            String str = map.get("u");
            if (str == null) {
                zzb.zzaC("URL missing from click GMSG.");
                return;
            }
            Uri parse = Uri.parse(str);
            try {
                zzan zzgH = zzid.zzgH();
                if (zzgH != null && zzgH.zzb(parse)) {
                    uri = zzgH.zza(parse, zzid.getContext());
                    new zzhp(zzid.getContext(), zzid.zzgI().zzGG, uri.toString()).zzgi();
                }
            } catch (zzao e) {
                zzb.zzaC("Unable to append parameter to URL: " + str);
            }
            uri = parse;
            new zzhp(zzid.getContext(), zzid.zzgI().zzGG, uri.toString()).zzgi();
        }
    };
    public static final zzdg zzvZ = new zzdg() {
        /* class com.google.android.gms.internal.zzdf.AnonymousClass5 */

        @Override // com.google.android.gms.internal.zzdg
        public void zza(zzid zzid, Map<String, String> map) {
            zzc zzgD = zzid.zzgD();
            if (zzgD != null) {
                zzgD.close();
                return;
            }
            zzc zzgE = zzid.zzgE();
            if (zzgE != null) {
                zzgE.close();
            } else {
                zzb.zzaC("A GMSG tried to close something that wasn't an overlay.");
            }
        }
    };
    public static final zzdg zzwa = new zzdg() {
        /* class com.google.android.gms.internal.zzdf.AnonymousClass6 */

        @Override // com.google.android.gms.internal.zzdg
        public void zza(zzid zzid, Map<String, String> map) {
            zzid.zzC("1".equals(map.get("custom_close")));
        }
    };
    public static final zzdg zzwb = new zzdg() {
        /* class com.google.android.gms.internal.zzdf.AnonymousClass7 */

        @Override // com.google.android.gms.internal.zzdg
        public void zza(zzid zzid, Map<String, String> map) {
            String str = map.get("u");
            if (str == null) {
                zzb.zzaC("URL missing from httpTrack GMSG.");
            } else {
                new zzhp(zzid.getContext(), zzid.zzgI().zzGG, str).zzgi();
            }
        }
    };
    public static final zzdg zzwc = new zzdg() {
        /* class com.google.android.gms.internal.zzdf.AnonymousClass8 */

        @Override // com.google.android.gms.internal.zzdg
        public void zza(zzid zzid, Map<String, String> map) {
            zzb.zzaA("Received log message: " + map.get("string"));
        }
    };
    public static final zzdg zzwd = new zzdg() {
        /* class com.google.android.gms.internal.zzdf.AnonymousClass9 */

        @Override // com.google.android.gms.internal.zzdg
        public void zza(zzid zzid, Map<String, String> map) {
            String str = map.get("tx");
            String str2 = map.get("ty");
            String str3 = map.get("td");
            try {
                int parseInt = Integer.parseInt(str);
                int parseInt2 = Integer.parseInt(str2);
                int parseInt3 = Integer.parseInt(str3);
                zzan zzgH = zzid.zzgH();
                if (zzgH != null) {
                    zzgH.zzab().zza(parseInt, parseInt2, parseInt3);
                }
            } catch (NumberFormatException e) {
                zzb.zzaC("Could not parse touch parameters from gmsg.");
            }
        }
    };
    public static final zzdg zzwe = new zzdo();
    public static final zzdg zzwf = new zzds();
}
