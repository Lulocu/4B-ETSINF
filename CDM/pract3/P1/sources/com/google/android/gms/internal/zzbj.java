package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

@zzgd
public class zzbj implements Application.ActivityLifecycleCallbacks {
    private Activity mActivity;
    private Context mContext;
    private final Object zzqt = new Object();

    public zzbj(Application application, Activity activity) {
        application.registerActivityLifecycleCallbacks(this);
        setActivity(activity);
        this.mContext = application.getApplicationContext();
    }

    private void setActivity(Activity activity) {
        synchronized (this.zzqt) {
            if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                this.mActivity = activity;
            }
        }
    }

    public Activity getActivity() {
        return this.mActivity;
    }

    public Context getContext() {
        return this.mContext;
    }

    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
    }

    public void onActivityDestroyed(Activity activity) {
        synchronized (this.zzqt) {
            if (this.mActivity != null) {
                if (this.mActivity.equals(activity)) {
                    this.mActivity = null;
                }
            }
        }
    }

    public void onActivityPaused(Activity activity) {
        setActivity(activity);
    }

    public void onActivityResumed(Activity activity) {
        setActivity(activity);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle savedInstanceState) {
    }

    public void onActivityStarted(Activity activity) {
        setActivity(activity);
    }

    public void onActivityStopped(Activity activity) {
    }
}
