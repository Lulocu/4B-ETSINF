package android.support.v7.internal.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.support.v7.appcompat.R;
import android.view.LayoutInflater;

public class ContextThemeWrapper extends ContextWrapper {
    private LayoutInflater mInflater;
    private Resources.Theme mTheme;
    private int mThemeResource;

    public ContextThemeWrapper(Context base, int themeres) {
        super(base);
        this.mThemeResource = themeres;
    }

    public void setTheme(int resid) {
        this.mThemeResource = resid;
        initializeTheme();
    }

    public int getThemeResId() {
        return this.mThemeResource;
    }

    public Resources.Theme getTheme() {
        if (this.mTheme != null) {
            return this.mTheme;
        }
        if (this.mThemeResource == 0) {
            this.mThemeResource = R.style.Theme_AppCompat_Light;
        }
        initializeTheme();
        return this.mTheme;
    }

    @Override // android.content.Context, android.content.ContextWrapper
    public Object getSystemService(String name) {
        if (!"layout_inflater".equals(name)) {
            return getBaseContext().getSystemService(name);
        }
        if (this.mInflater == null) {
            this.mInflater = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.mInflater;
    }

    /* access modifiers changed from: protected */
    public void onApplyThemeResource(Resources.Theme theme, int resid, boolean first) {
        theme.applyStyle(resid, true);
    }

    private void initializeTheme() {
        boolean first = this.mTheme == null;
        if (first) {
            this.mTheme = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.mTheme.setTo(theme);
            }
        }
        onApplyThemeResource(this.mTheme, this.mThemeResource, first);
    }
}
