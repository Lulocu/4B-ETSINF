package android.support.v4.view;

import android.animation.ValueAnimator;
import android.view.View;

class ViewPropertyAnimatorCompatKK {
    ViewPropertyAnimatorCompatKK() {
    }

    public static void setUpdateListener(final View view, final ViewPropertyAnimatorUpdateListener listener) {
        view.animate().setUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class android.support.v4.view.ViewPropertyAnimatorCompatKK.AnonymousClass1 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                listener.onAnimationUpdate(view);
            }
        });
    }
}
