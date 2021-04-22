package android.support.v7.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;

/* access modifiers changed from: package-private */
public class AppCompatDelegateImplV11 extends AppCompatDelegateImplV7 {
    AppCompatDelegateImplV11(Context context, Window window, AppCompatCallback callback) {
        super(context, window, callback);
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.v7.app.AppCompatDelegateImplV7
    public View callActivityOnCreateView(View parent, String name, Context context, AttributeSet attrs) {
        View view = super.callActivityOnCreateView(parent, name, context, attrs);
        if (view != null) {
            return view;
        }
        if (this.mOriginalWindowCallback instanceof LayoutInflater.Factory2) {
            return ((LayoutInflater.Factory2) this.mOriginalWindowCallback).onCreateView(parent, name, context, attrs);
        }
        return null;
    }
}
