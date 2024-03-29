package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.DrawableRes;
import android.support.v7.appcompat.R;
import android.support.v7.internal.widget.TintManager;
import android.support.v7.internal.widget.TintTypedArray;
import android.util.AttributeSet;
import android.widget.CheckBox;

public class AppCompatCheckBox extends CheckBox {
    private static final int[] TINT_ATTRS = {16843015};
    private Drawable mButtonDrawable;
    private TintManager mTintManager;

    public AppCompatCheckBox(Context context) {
        this(context, null);
    }

    public AppCompatCheckBox(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.checkboxStyle);
    }

    public AppCompatCheckBox(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        if (TintManager.SHOULD_BE_USED) {
            TintTypedArray a = TintTypedArray.obtainStyledAttributes(getContext(), attrs, TINT_ATTRS, defStyleAttr, 0);
            setButtonDrawable(a.getDrawable(0));
            a.recycle();
            this.mTintManager = a.getTintManager();
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable buttonDrawable) {
        super.setButtonDrawable(buttonDrawable);
        this.mButtonDrawable = buttonDrawable;
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(@DrawableRes int resId) {
        if (this.mTintManager != null) {
            setButtonDrawable(this.mTintManager.getDrawable(resId));
        } else {
            super.setButtonDrawable(resId);
        }
    }

    public int getCompoundPaddingLeft() {
        int padding = super.getCompoundPaddingLeft();
        if (Build.VERSION.SDK_INT >= 17 || this.mButtonDrawable == null) {
            return padding;
        }
        return padding + this.mButtonDrawable.getIntrinsicWidth();
    }
}
