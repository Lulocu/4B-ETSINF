package com.google.android.gms.games.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.internal.zzlk;
import java.lang.ref.WeakReference;

public class PopupManager {
    protected GamesClientImpl zzaqt;
    protected PopupLocationInfo zzaqu;

    public static final class PopupLocationInfo {
        public int bottom;
        public int gravity;
        public int left;
        public int right;
        public int top;
        public IBinder zzaqv;
        public int zzaqw;

        private PopupLocationInfo(int gravity2, IBinder windowToken) {
            this.zzaqw = -1;
            this.left = 0;
            this.top = 0;
            this.right = 0;
            this.bottom = 0;
            this.gravity = gravity2;
            this.zzaqv = windowToken;
        }

        public Bundle zztc() {
            Bundle bundle = new Bundle();
            bundle.putInt("popupLocationInfo.gravity", this.gravity);
            bundle.putInt("popupLocationInfo.displayId", this.zzaqw);
            bundle.putInt("popupLocationInfo.left", this.left);
            bundle.putInt("popupLocationInfo.top", this.top);
            bundle.putInt("popupLocationInfo.right", this.right);
            bundle.putInt("popupLocationInfo.bottom", this.bottom);
            return bundle;
        }
    }

    /* access modifiers changed from: private */
    public static final class PopupManagerHCMR1 extends PopupManager implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
        private boolean zzaoV = false;
        private WeakReference<View> zzaqx;

        protected PopupManagerHCMR1(GamesClientImpl gamesClientImpl, int gravity) {
            super(gamesClientImpl, gravity);
        }

        private void zzp(View view) {
            Display display;
            int i = -1;
            if (zzlk.zzoW() && (display = view.getDisplay()) != null) {
                i = display.getDisplayId();
            }
            IBinder windowToken = view.getWindowToken();
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int width = view.getWidth();
            int height = view.getHeight();
            this.zzaqu.zzaqw = i;
            this.zzaqu.zzaqv = windowToken;
            this.zzaqu.left = iArr[0];
            this.zzaqu.top = iArr[1];
            this.zzaqu.right = iArr[0] + width;
            this.zzaqu.bottom = iArr[1] + height;
            if (this.zzaoV) {
                zztd();
                this.zzaoV = false;
            }
        }

        public void onGlobalLayout() {
            View view;
            if (this.zzaqx != null && (view = this.zzaqx.get()) != null) {
                zzp(view);
            }
        }

        public void onViewAttachedToWindow(View v) {
            zzp(v);
        }

        public void onViewDetachedFromWindow(View v) {
            this.zzaqt.zzsR();
            v.removeOnAttachStateChangeListener(this);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.games.internal.PopupManager
        public void zzfF(int i) {
            this.zzaqu = new PopupLocationInfo(i, null);
        }

        @Override // com.google.android.gms.games.internal.PopupManager
        public void zzo(View view) {
            this.zzaqt.zzsR();
            if (this.zzaqx != null) {
                View view2 = this.zzaqx.get();
                Context context = this.zzaqt.getContext();
                if (view2 == null && (context instanceof Activity)) {
                    view2 = ((Activity) context).getWindow().getDecorView();
                }
                if (view2 != null) {
                    view2.removeOnAttachStateChangeListener(this);
                    ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                    if (zzlk.zzoV()) {
                        viewTreeObserver.removeOnGlobalLayoutListener(this);
                    } else {
                        viewTreeObserver.removeGlobalOnLayoutListener(this);
                    }
                }
            }
            this.zzaqx = null;
            Context context2 = this.zzaqt.getContext();
            if (view == null && (context2 instanceof Activity)) {
                View findViewById = ((Activity) context2).findViewById(16908290);
                if (findViewById == null) {
                    findViewById = ((Activity) context2).getWindow().getDecorView();
                }
                GamesLog.zzu("PopupManager", "You have not specified a View to use as content view for popups. Falling back to the Activity content view. Note that this may not work as expected in multi-screen environments");
                view = findViewById;
            }
            if (view != null) {
                zzp(view);
                this.zzaqx = new WeakReference<>(view);
                view.addOnAttachStateChangeListener(this);
                view.getViewTreeObserver().addOnGlobalLayoutListener(this);
                return;
            }
            GamesLog.zzv("PopupManager", "No content view usable to display popups. Popups will not be displayed in response to this client's calls. Use setViewForPopups() to set your content view.");
        }

        @Override // com.google.android.gms.games.internal.PopupManager
        public void zztd() {
            if (this.zzaqu.zzaqv != null) {
                PopupManager.super.zztd();
            } else {
                this.zzaoV = this.zzaqx != null;
            }
        }
    }

    private PopupManager(GamesClientImpl gamesClientImpl, int gravity) {
        this.zzaqt = gamesClientImpl;
        zzfF(gravity);
    }

    public static PopupManager zza(GamesClientImpl gamesClientImpl, int i) {
        return zzlk.zzoS() ? new PopupManagerHCMR1(gamesClientImpl, i) : new PopupManager(gamesClientImpl, i);
    }

    public void setGravity(int gravity) {
        this.zzaqu.gravity = gravity;
    }

    /* access modifiers changed from: protected */
    public void zzfF(int i) {
        this.zzaqu = new PopupLocationInfo(i, new Binder());
    }

    public void zzo(View view) {
    }

    public void zztd() {
        this.zzaqt.zza(this.zzaqu.zzaqv, this.zzaqu.zztc());
    }

    public Bundle zzte() {
        return this.zzaqu.zztc();
    }

    public IBinder zztf() {
        return this.zzaqu.zzaqv;
    }

    public PopupLocationInfo zztg() {
        return this.zzaqu;
    }
}