package com.google.android.gms.plus;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.FrameLayout;

public class PlusOneDummyView extends FrameLayout {
    public static final String TAG = "PlusOneDummyView";

    /* access modifiers changed from: private */
    public static class zza implements zzd {
        private Context mContext;

        private zza(Context context) {
            this.mContext = context;
        }

        @Override // com.google.android.gms.plus.PlusOneDummyView.zzd
        public Drawable getDrawable(int size) {
            return this.mContext.getResources().getDrawable(17301508);
        }

        @Override // com.google.android.gms.plus.PlusOneDummyView.zzd
        public boolean isValid() {
            return true;
        }
    }

    /* access modifiers changed from: private */
    public static class zzb implements zzd {
        private Context mContext;

        private zzb(Context context) {
            this.mContext = context;
        }

        @Override // com.google.android.gms.plus.PlusOneDummyView.zzd
        public Drawable getDrawable(int size) {
            String str;
            try {
                Resources resources = this.mContext.createPackageContext("com.google.android.gms", 4).getResources();
                switch (size) {
                    case 0:
                        str = "ic_plusone_small";
                        break;
                    case 1:
                        str = "ic_plusone_medium";
                        break;
                    case 2:
                        str = "ic_plusone_tall";
                        break;
                    default:
                        str = "ic_plusone_standard";
                        break;
                }
                return resources.getDrawable(resources.getIdentifier(str, "drawable", "com.google.android.gms"));
            } catch (PackageManager.NameNotFoundException e) {
                return null;
            }
        }

        @Override // com.google.android.gms.plus.PlusOneDummyView.zzd
        public boolean isValid() {
            try {
                this.mContext.createPackageContext("com.google.android.gms", 4).getResources();
                return true;
            } catch (PackageManager.NameNotFoundException e) {
                return false;
            }
        }
    }

    /* access modifiers changed from: private */
    public static class zzc implements zzd {
        private Context mContext;

        private zzc(Context context) {
            this.mContext = context;
        }

        @Override // com.google.android.gms.plus.PlusOneDummyView.zzd
        public Drawable getDrawable(int size) {
            String str;
            switch (size) {
                case 0:
                    str = "ic_plusone_small_off_client";
                    break;
                case 1:
                    str = "ic_plusone_medium_off_client";
                    break;
                case 2:
                    str = "ic_plusone_tall_off_client";
                    break;
                default:
                    str = "ic_plusone_standard_off_client";
                    break;
            }
            return this.mContext.getResources().getDrawable(this.mContext.getResources().getIdentifier(str, "drawable", this.mContext.getPackageName()));
        }

        @Override // com.google.android.gms.plus.PlusOneDummyView.zzd
        public boolean isValid() {
            return (this.mContext.getResources().getIdentifier("ic_plusone_small_off_client", "drawable", this.mContext.getPackageName()) == 0 || this.mContext.getResources().getIdentifier("ic_plusone_medium_off_client", "drawable", this.mContext.getPackageName()) == 0 || this.mContext.getResources().getIdentifier("ic_plusone_tall_off_client", "drawable", this.mContext.getPackageName()) == 0 || this.mContext.getResources().getIdentifier("ic_plusone_standard_off_client", "drawable", this.mContext.getPackageName()) == 0) ? false : true;
        }
    }

    /* access modifiers changed from: private */
    public interface zzd {
        Drawable getDrawable(int i);

        boolean isValid();
    }

    public PlusOneDummyView(Context context, int size) {
        super(context);
        Button button = new Button(context);
        button.setEnabled(false);
        button.setBackgroundDrawable(zzxq().getDrawable(size));
        Point zzix = zzix(size);
        addView(button, new FrameLayout.LayoutParams(zzix.x, zzix.y, 17));
    }

    private Point zzix(int i) {
        int i2 = 24;
        int i3 = 20;
        Point point = new Point();
        switch (i) {
            case 0:
                i3 = 14;
                break;
            case 1:
                i2 = 32;
                break;
            case 2:
                i2 = 50;
                break;
            default:
                i2 = 38;
                i3 = 24;
                break;
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        float applyDimension = TypedValue.applyDimension(1, (float) i2, displayMetrics);
        float applyDimension2 = TypedValue.applyDimension(1, (float) i3, displayMetrics);
        point.x = (int) (((double) applyDimension) + 0.5d);
        point.y = (int) (((double) applyDimension2) + 0.5d);
        return point;
    }

    private zzd zzxq() {
        zzd zzb2 = new zzb(getContext());
        if (!zzb2.isValid()) {
            zzb2 = new zzc(getContext());
        }
        return !zzb2.isValid() ? new zza(getContext()) : zzb2;
    }
}