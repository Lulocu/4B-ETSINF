package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzew;
import com.google.android.gms.internal.zzex;

public class AdActivity extends Activity {
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    public static final String SIMPLE_CLASS_NAME = "AdActivity";
    private zzex zznG;

    private void zzaE() {
        if (this.zznG != null) {
            try {
                this.zznG.zzaE();
            } catch (RemoteException e) {
                zzb.zzd("Could not forward setContentViewSet to ad overlay:", e);
            }
        }
    }

    public void onBackPressed() {
        try {
            if (this.zznG != null) {
                this.zznG.onBackPressed();
            }
        } catch (RemoteException e) {
            zzb.zzd("Could not forward onBackPressed to ad overlay:", e);
        }
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.zznG = zzew.zzb(this);
        if (this.zznG == null) {
            zzb.zzaC("Could not create ad overlay.");
            finish();
            return;
        }
        try {
            this.zznG.onCreate(savedInstanceState);
        } catch (RemoteException e) {
            zzb.zzd("Could not forward onCreate to ad overlay:", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        try {
            if (this.zznG != null) {
                this.zznG.onDestroy();
            }
        } catch (RemoteException e) {
            zzb.zzd("Could not forward onDestroy to ad overlay:", e);
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        try {
            if (this.zznG != null) {
                this.zznG.onPause();
            }
        } catch (RemoteException e) {
            zzb.zzd("Could not forward onPause to ad overlay:", e);
            finish();
        }
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        super.onRestart();
        try {
            if (this.zznG != null) {
                this.zznG.onRestart();
            }
        } catch (RemoteException e) {
            zzb.zzd("Could not forward onRestart to ad overlay:", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        try {
            if (this.zznG != null) {
                this.zznG.onResume();
            }
        } catch (RemoteException e) {
            zzb.zzd("Could not forward onResume to ad overlay:", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle outState) {
        try {
            if (this.zznG != null) {
                this.zznG.onSaveInstanceState(outState);
            }
        } catch (RemoteException e) {
            zzb.zzd("Could not forward onSaveInstanceState to ad overlay:", e);
            finish();
        }
        super.onSaveInstanceState(outState);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        try {
            if (this.zznG != null) {
                this.zznG.onStart();
            }
        } catch (RemoteException e) {
            zzb.zzd("Could not forward onStart to ad overlay:", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        try {
            if (this.zznG != null) {
                this.zznG.onStop();
            }
        } catch (RemoteException e) {
            zzb.zzd("Could not forward onStop to ad overlay:", e);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        zzaE();
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        zzaE();
    }

    public void setContentView(View view, ViewGroup.LayoutParams params) {
        super.setContentView(view, params);
        zzaE();
    }
}
