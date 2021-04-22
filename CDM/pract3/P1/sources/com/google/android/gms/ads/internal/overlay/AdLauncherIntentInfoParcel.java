package com.google.android.gms.ads.internal.overlay;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzgd;

@zzgd
public final class AdLauncherIntentInfoParcel implements SafeParcelable {
    public static final zzb CREATOR = new zzb();
    public final String mimeType;
    public final String packageName;
    public final int versionCode;
    public final String zzze;
    public final String zzzf;
    public final String zzzg;
    public final String zzzh;
    public final String zzzi;

    public AdLauncherIntentInfoParcel(int versionCode2, String intentAction, String url, String mimeType2, String packageName2, String componentName, String intentFlagsString, String intentExtrasString) {
        this.versionCode = versionCode2;
        this.zzze = intentAction;
        this.zzzf = url;
        this.mimeType = mimeType2;
        this.packageName = packageName2;
        this.zzzg = componentName;
        this.zzzh = intentFlagsString;
        this.zzzi = intentExtrasString;
    }

    public AdLauncherIntentInfoParcel(String intentAction, String url, String mimeType2, String packageName2, String componentName, String intentFlagsString, String intentExtrasString) {
        this(1, intentAction, url, mimeType2, packageName2, componentName, intentFlagsString, intentExtrasString);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel out, int flags) {
        zzb.zza(this, out, flags);
    }
}
