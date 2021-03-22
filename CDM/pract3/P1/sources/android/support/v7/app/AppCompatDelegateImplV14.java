package android.support.v7.app;

import android.content.Context;
import android.support.v7.app.AppCompatDelegateImplBase;
import android.support.v7.internal.view.SupportActionModeWrapper;
import android.view.ActionMode;
import android.view.Window;

/* access modifiers changed from: package-private */
public class AppCompatDelegateImplV14 extends AppCompatDelegateImplV11 {
    private boolean mHandleNativeActionModes = true;

    AppCompatDelegateImplV14(Context context, Window window, AppCompatCallback callback) {
        super(context, window, callback);
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.v7.app.AppCompatDelegateImplBase
    public Window.Callback wrapWindowCallback(Window.Callback callback) {
        return new AppCompatWindowCallbackV14(callback);
    }

    @Override // android.support.v7.app.AppCompatDelegateImplBase, android.support.v7.app.AppCompatDelegate
    public void setHandleNativeActionModesEnabled(boolean enabled) {
        this.mHandleNativeActionModes = enabled;
    }

    @Override // android.support.v7.app.AppCompatDelegateImplBase, android.support.v7.app.AppCompatDelegate
    public boolean isHandleNativeActionModesEnabled() {
        return this.mHandleNativeActionModes;
    }

    class AppCompatWindowCallbackV14 extends AppCompatDelegateImplBase.AppCompatWindowCallbackBase {
        AppCompatWindowCallbackV14(Window.Callback callback) {
            super(callback);
        }

        @Override // android.support.v7.internal.view.WindowCallbackWrapper
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (AppCompatDelegateImplV14.this.mHandleNativeActionModes) {
                return startAsSupportActionMode(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        /* access modifiers changed from: package-private */
        public final ActionMode startAsSupportActionMode(ActionMode.Callback callback) {
            SupportActionModeWrapper.CallbackWrapper callbackWrapper = new SupportActionModeWrapper.CallbackWrapper(AppCompatDelegateImplV14.this.mContext, callback);
            android.support.v7.view.ActionMode supportActionMode = AppCompatDelegateImplV14.this.startSupportActionMode(callbackWrapper);
            if (supportActionMode == null) {
                return null;
            }
            SupportActionModeWrapper newActionMode = new SupportActionModeWrapper(AppCompatDelegateImplV14.this.mContext, supportActionMode);
            callbackWrapper.addActionModeWrapper(newActionMode);
            return newActionMode;
        }
    }
}
