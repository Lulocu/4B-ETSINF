package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.zzu;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class zzm extends Fragment implements DialogInterface.OnCancelListener {
    private boolean mStarted;
    private boolean zzXV;
    private int zzXW = -1;
    private ConnectionResult zzXX;
    private final Handler zzXY = new Handler(Looper.getMainLooper());
    private final SparseArray<zza> zzXZ = new SparseArray<>();

    /* access modifiers changed from: private */
    public class zza implements GoogleApiClient.OnConnectionFailedListener {
        public final int zzYa;
        public final GoogleApiClient zzYb;
        public final GoogleApiClient.OnConnectionFailedListener zzYc;

        public zza(int i, GoogleApiClient googleApiClient, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
            this.zzYa = i;
            this.zzYb = googleApiClient;
            this.zzYc = onConnectionFailedListener;
            googleApiClient.registerConnectionFailedListener(this);
        }

        public void dump(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
            writer.append((CharSequence) prefix).append("GoogleApiClient #").print(this.zzYa);
            writer.println(":");
            this.zzYb.dump(prefix + "  ", fd, writer, args);
        }

        @Override // com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
        public void onConnectionFailed(ConnectionResult result) {
            zzm.this.zzXY.post(new zzb(this.zzYa, result));
        }

        public void zzmW() {
            this.zzYb.unregisterConnectionFailedListener(this);
            this.zzYb.disconnect();
        }
    }

    private class zzb implements Runnable {
        private final int zzYe;
        private final ConnectionResult zzYf;

        public zzb(int i, ConnectionResult connectionResult) {
            this.zzYe = i;
            this.zzYf = connectionResult;
        }

        public void run() {
            if (zzm.this.mStarted && !zzm.this.zzXV) {
                zzm.this.zzXV = true;
                zzm.this.zzXW = this.zzYe;
                zzm.this.zzXX = this.zzYf;
                if (this.zzYf.hasResolution()) {
                    try {
                        this.zzYf.startResolutionForResult(zzm.this.getActivity(), ((zzm.this.getActivity().getSupportFragmentManager().getFragments().indexOf(zzm.this) + 1) << 16) + 1);
                    } catch (IntentSender.SendIntentException e) {
                        zzm.this.zzmV();
                    }
                } else if (GooglePlayServicesUtil.isUserRecoverableError(this.zzYf.getErrorCode())) {
                    GooglePlayServicesUtil.showErrorDialogFragment(this.zzYf.getErrorCode(), zzm.this.getActivity(), zzm.this, 2, zzm.this);
                } else {
                    zzm.this.zza((zzm) this.zzYe, (int) this.zzYf);
                }
            }
        }
    }

    public static zzm zza(FragmentActivity fragmentActivity) {
        zzu.zzbY("Must be called from main thread of process");
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        try {
            zzm zzm = (zzm) supportFragmentManager.findFragmentByTag("GmsSupportLifecycleFragment");
            if (zzm != null && !zzm.isRemoving()) {
                return zzm;
            }
            zzm zzm2 = new zzm();
            supportFragmentManager.beginTransaction().add(zzm2, "GmsSupportLifecycleFragment").commit();
            supportFragmentManager.executePendingTransactions();
            return zzm2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag GmsSupportLifecycleFragment is not a SupportLifecycleFragment", e);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void zza(int i, ConnectionResult connectionResult) {
        Log.w("GmsSupportLifecycleFragment", "Unresolved error while connecting client. Stopping auto-manage.");
        zza zza2 = this.zzXZ.get(i);
        if (zza2 != null) {
            zzbb(i);
            GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener = zza2.zzYc;
            if (onConnectionFailedListener != null) {
                onConnectionFailedListener.onConnectionFailed(connectionResult);
            }
        }
        zzmV();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void zzmV() {
        this.zzXV = false;
        this.zzXW = -1;
        this.zzXX = null;
        for (int i = 0; i < this.zzXZ.size(); i++) {
            this.zzXZ.valueAt(i).zzYb.connect();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void dump(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
        super.dump(prefix, fd, writer, args);
        for (int i = 0; i < this.zzXZ.size(); i++) {
            this.zzXZ.valueAt(i).dump(prefix, fd, writer, args);
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        if (com.google.android.gms.common.GooglePlayServicesUtil.isGooglePlayServicesAvailable(getActivity()) == 0) goto L_0x0006;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r5 == -1) goto L_0x0006;
     */
    @Override // android.support.v4.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r4, int r5, android.content.Intent r6) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            switch(r4) {
                case 1: goto L_0x0017;
                case 2: goto L_0x000c;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = r1
        L_0x0006:
            if (r0 == 0) goto L_0x001b
            r3.zzmV()
        L_0x000b:
            return
        L_0x000c:
            android.support.v4.app.FragmentActivity r2 = r3.getActivity()
            int r2 = com.google.android.gms.common.GooglePlayServicesUtil.isGooglePlayServicesAvailable(r2)
            if (r2 != 0) goto L_0x0005
            goto L_0x0006
        L_0x0017:
            r2 = -1
            if (r5 != r2) goto L_0x0005
            goto L_0x0006
        L_0x001b:
            int r0 = r3.zzXW
            com.google.android.gms.common.ConnectionResult r1 = r3.zzXX
            r3.zza(r0, r1)
            goto L_0x000b
            switch-data {1->0x0017, 2->0x000c, }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.zzm.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onCancel(DialogInterface dialogInterface) {
        zza(this.zzXW, new ConnectionResult(13, null));
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            this.zzXV = savedInstanceState.getBoolean("resolving_error", false);
            this.zzXW = savedInstanceState.getInt("failed_client_id", -1);
            if (this.zzXW >= 0) {
                this.zzXX = new ConnectionResult(savedInstanceState.getInt("failed_status"), (PendingIntent) savedInstanceState.getParcelable("failed_resolution"));
            }
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putBoolean("resolving_error", this.zzXV);
        if (this.zzXW >= 0) {
            outState.putInt("failed_client_id", this.zzXW);
            outState.putInt("failed_status", this.zzXX.getErrorCode());
            outState.putParcelable("failed_resolution", this.zzXX.getResolution());
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onStart() {
        super.onStart();
        this.mStarted = true;
        if (!this.zzXV) {
            for (int i = 0; i < this.zzXZ.size(); i++) {
                this.zzXZ.valueAt(i).zzYb.connect();
            }
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onStop() {
        super.onStop();
        this.mStarted = false;
        for (int i = 0; i < this.zzXZ.size(); i++) {
            this.zzXZ.valueAt(i).zzYb.disconnect();
        }
    }

    public void zza(int i, GoogleApiClient googleApiClient, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        zzu.zzb(googleApiClient, "GoogleApiClient instance cannot be null");
        zzu.zza(this.zzXZ.indexOfKey(i) < 0, "Already managing a GoogleApiClient with id " + i);
        this.zzXZ.put(i, new zza(i, googleApiClient, onConnectionFailedListener));
        if (this.mStarted && !this.zzXV) {
            googleApiClient.connect();
        }
    }

    public void zzbb(int i) {
        zza zza2 = this.zzXZ.get(i);
        this.zzXZ.remove(i);
        if (zza2 != null) {
            zza2.zzmW();
        }
    }
}
