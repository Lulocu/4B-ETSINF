package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.zzu;

public abstract class zzg<T> {
    private final String zzaju;
    private T zzajv;

    public static class zza extends Exception {
        public zza(String str) {
            super(str);
        }

        public zza(String str, Throwable th) {
            super(str, th);
        }
    }

    protected zzg(String str) {
        this.zzaju = str;
    }

    /* access modifiers changed from: protected */
    public final T zzak(Context context) throws zza {
        if (this.zzajv == null) {
            zzu.zzu(context);
            Context remoteContext = GooglePlayServicesUtil.getRemoteContext(context);
            if (remoteContext == null) {
                throw new zza("Could not get remote context.");
            }
            try {
                this.zzajv = zzd((IBinder) remoteContext.getClassLoader().loadClass(this.zzaju).newInstance());
            } catch (ClassNotFoundException e) {
                throw new zza("Could not load creator class.", e);
            } catch (InstantiationException e2) {
                throw new zza("Could not instantiate creator.", e2);
            } catch (IllegalAccessException e3) {
                throw new zza("Could not access creator.", e3);
            }
        }
        return this.zzajv;
    }

    /* access modifiers changed from: protected */
    public abstract T zzd(IBinder iBinder);
}