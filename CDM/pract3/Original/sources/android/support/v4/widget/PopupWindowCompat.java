package android.support.v4.widget;

import android.os.Build;
import android.view.View;
import android.widget.PopupWindow;

public class PopupWindowCompat {
    static final PopupWindowImpl IMPL;

    interface PopupWindowImpl {
        void showAsDropDown(PopupWindow popupWindow, View view, int i, int i2, int i3);
    }

    static class BasePopupWindowImpl implements PopupWindowImpl {
        BasePopupWindowImpl() {
        }

        @Override // android.support.v4.widget.PopupWindowCompat.PopupWindowImpl
        public void showAsDropDown(PopupWindow popup, View anchor, int xoff, int yoff, int gravity) {
            popup.showAsDropDown(anchor, xoff, yoff);
        }
    }

    static class KitKatPopupWindowImpl extends BasePopupWindowImpl {
        KitKatPopupWindowImpl() {
        }

        @Override // android.support.v4.widget.PopupWindowCompat.PopupWindowImpl, android.support.v4.widget.PopupWindowCompat.BasePopupWindowImpl
        public void showAsDropDown(PopupWindow popup, View anchor, int xoff, int yoff, int gravity) {
            PopupWindowCompatKitKat.showAsDropDown(popup, anchor, xoff, yoff, gravity);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            IMPL = new KitKatPopupWindowImpl();
        } else {
            IMPL = new BasePopupWindowImpl();
        }
    }

    private PopupWindowCompat() {
    }

    public static void showAsDropDown(PopupWindow popup, View anchor, int xoff, int yoff, int gravity) {
        IMPL.showAsDropDown(popup, anchor, xoff, yoff, gravity);
    }
}
