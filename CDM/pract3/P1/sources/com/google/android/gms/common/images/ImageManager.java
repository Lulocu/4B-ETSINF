package com.google.android.gms.common.images;

import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.util.Log;
import android.widget.ImageView;
import com.google.android.gms.common.images.zza;
import com.google.android.gms.internal.zzkj;
import com.google.android.gms.internal.zzku;
import com.google.android.gms.internal.zzlk;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class ImageManager {
    private static final Object zzYN = new Object();
    private static HashSet<Uri> zzYO = new HashSet<>();
    private static ImageManager zzYP;
    private static ImageManager zzYQ;
    private final Context mContext;
    private final Handler mHandler = new Handler(Looper.getMainLooper());
    private final ExecutorService zzYR = Executors.newFixedThreadPool(4);
    private final zzb zzYS;
    private final zzkj zzYT;
    private final Map<zza, ImageReceiver> zzYU;
    private final Map<Uri, ImageReceiver> zzYV;
    private final Map<Uri, Long> zzYW;

    /* access modifiers changed from: private */
    public final class ImageReceiver extends ResultReceiver {
        private final Uri mUri;
        private final ArrayList<zza> zzYX = new ArrayList<>();

        ImageReceiver(Uri uri) {
            super(new Handler(Looper.getMainLooper()));
            this.mUri = uri;
        }

        public void onReceiveResult(int resultCode, Bundle resultData) {
            ImageManager.this.zzYR.execute(new zzc(this.mUri, (ParcelFileDescriptor) resultData.getParcelable("com.google.android.gms.extra.fileDescriptor")));
        }

        public void zzb(zza zza) {
            com.google.android.gms.common.internal.zzb.zzbY("ImageReceiver.addImageRequest() must be called in the main thread");
            this.zzYX.add(zza);
        }

        public void zzc(zza zza) {
            com.google.android.gms.common.internal.zzb.zzbY("ImageReceiver.removeImageRequest() must be called in the main thread");
            this.zzYX.remove(zza);
        }

        public void zzno() {
            Intent intent = new Intent("com.google.android.gms.common.images.LOAD_IMAGE");
            intent.putExtra("com.google.android.gms.extras.uri", this.mUri);
            intent.putExtra("com.google.android.gms.extras.resultReceiver", this);
            intent.putExtra("com.google.android.gms.extras.priority", 3);
            ImageManager.this.mContext.sendBroadcast(intent);
        }
    }

    public interface OnImageLoadedListener {
        void onImageLoaded(Uri uri, Drawable drawable, boolean z);
    }

    /* access modifiers changed from: private */
    public static final class zza {
        static int zza(ActivityManager activityManager) {
            return activityManager.getLargeMemoryClass();
        }
    }

    /* access modifiers changed from: private */
    public static final class zzb extends zzku<zza.C0028zza, Bitmap> {
        public zzb(Context context) {
            super(zzag(context));
        }

        private static int zzag(Context context) {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            return (int) (((float) (((!((context.getApplicationInfo().flags & AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_START) != 0) || !zzlk.zzoR()) ? activityManager.getMemoryClass() : zza.zza(activityManager)) * AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_START)) * 0.33f);
        }

        /* access modifiers changed from: protected */
        /* renamed from: zza */
        public int sizeOf(zza.C0028zza zza, Bitmap bitmap) {
            return bitmap.getHeight() * bitmap.getRowBytes();
        }

        /* access modifiers changed from: protected */
        /* renamed from: zza */
        public void entryRemoved(boolean z, zza.C0028zza zza, Bitmap bitmap, Bitmap bitmap2) {
            super.entryRemoved(z, zza, bitmap, bitmap2);
        }
    }

    private final class zzc implements Runnable {
        private final Uri mUri;
        private final ParcelFileDescriptor zzYZ;

        public zzc(Uri uri, ParcelFileDescriptor parcelFileDescriptor) {
            this.mUri = uri;
            this.zzYZ = parcelFileDescriptor;
        }

        public void run() {
            com.google.android.gms.common.internal.zzb.zzbZ("LoadBitmapFromDiskRunnable can't be executed in the main thread");
            boolean z = false;
            Bitmap bitmap = null;
            if (this.zzYZ != null) {
                try {
                    bitmap = BitmapFactory.decodeFileDescriptor(this.zzYZ.getFileDescriptor());
                } catch (OutOfMemoryError e) {
                    Log.e("ImageManager", "OOM while loading bitmap for uri: " + this.mUri, e);
                    z = true;
                }
                try {
                    this.zzYZ.close();
                } catch (IOException e2) {
                    Log.e("ImageManager", "closed failed", e2);
                }
            }
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ImageManager.this.mHandler.post(new zzf(this.mUri, bitmap, z, countDownLatch));
            try {
                countDownLatch.await();
            } catch (InterruptedException e3) {
                Log.w("ImageManager", "Latch interrupted while posting " + this.mUri);
            }
        }
    }

    /* access modifiers changed from: private */
    public final class zzd implements Runnable {
        private final zza zzZa;

        public zzd(zza zza) {
            this.zzZa = zza;
        }

        public void run() {
            com.google.android.gms.common.internal.zzb.zzbY("LoadImageRunnable must be executed on the main thread");
            ImageReceiver imageReceiver = (ImageReceiver) ImageManager.this.zzYU.get(this.zzZa);
            if (imageReceiver != null) {
                ImageManager.this.zzYU.remove(this.zzZa);
                imageReceiver.zzc(this.zzZa);
            }
            zza.C0028zza zza = this.zzZa.zzZc;
            if (zza.uri == null) {
                this.zzZa.zza(ImageManager.this.mContext, ImageManager.this.zzYT, true);
                return;
            }
            Bitmap zza2 = ImageManager.this.zza((ImageManager) zza);
            if (zza2 != null) {
                this.zzZa.zza(ImageManager.this.mContext, zza2, true);
                return;
            }
            Long l = (Long) ImageManager.this.zzYW.get(zza.uri);
            if (l != null) {
                if (SystemClock.elapsedRealtime() - l.longValue() < 3600000) {
                    this.zzZa.zza(ImageManager.this.mContext, ImageManager.this.zzYT, true);
                    return;
                }
                ImageManager.this.zzYW.remove(zza.uri);
            }
            this.zzZa.zza(ImageManager.this.mContext, ImageManager.this.zzYT);
            ImageReceiver imageReceiver2 = (ImageReceiver) ImageManager.this.zzYV.get(zza.uri);
            if (imageReceiver2 == null) {
                imageReceiver2 = new ImageReceiver(zza.uri);
                ImageManager.this.zzYV.put(zza.uri, imageReceiver2);
            }
            imageReceiver2.zzb(this.zzZa);
            if (!(this.zzZa instanceof zza.zzc)) {
                ImageManager.this.zzYU.put(this.zzZa, imageReceiver2);
            }
            synchronized (ImageManager.zzYN) {
                if (!ImageManager.zzYO.contains(zza.uri)) {
                    ImageManager.zzYO.add(zza.uri);
                    imageReceiver2.zzno();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static final class zze implements ComponentCallbacks2 {
        private final zzb zzYS;

        public zze(zzb zzb) {
            this.zzYS = zzb;
        }

        public void onConfigurationChanged(Configuration newConfig) {
        }

        public void onLowMemory() {
            this.zzYS.evictAll();
        }

        public void onTrimMemory(int level) {
            if (level >= 60) {
                this.zzYS.evictAll();
            } else if (level >= 20) {
                this.zzYS.trimToSize(this.zzYS.size() / 2);
            }
        }
    }

    private final class zzf implements Runnable {
        private final Bitmap mBitmap;
        private final Uri mUri;
        private boolean zzZb;
        private final CountDownLatch zzoD;

        public zzf(Uri uri, Bitmap bitmap, boolean z, CountDownLatch countDownLatch) {
            this.mUri = uri;
            this.mBitmap = bitmap;
            this.zzZb = z;
            this.zzoD = countDownLatch;
        }

        private void zza(ImageReceiver imageReceiver, boolean z) {
            ArrayList arrayList = imageReceiver.zzYX;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                zza zza = (zza) arrayList.get(i);
                if (z) {
                    zza.zza(ImageManager.this.mContext, this.mBitmap, false);
                } else {
                    ImageManager.this.zzYW.put(this.mUri, Long.valueOf(SystemClock.elapsedRealtime()));
                    zza.zza(ImageManager.this.mContext, ImageManager.this.zzYT, false);
                }
                if (!(zza instanceof zza.zzc)) {
                    ImageManager.this.zzYU.remove(zza);
                }
            }
        }

        public void run() {
            com.google.android.gms.common.internal.zzb.zzbY("OnBitmapLoadedRunnable must be executed in the main thread");
            boolean z = this.mBitmap != null;
            if (ImageManager.this.zzYS != null) {
                if (this.zzZb) {
                    ImageManager.this.zzYS.evictAll();
                    System.gc();
                    this.zzZb = false;
                    ImageManager.this.mHandler.post(this);
                    return;
                } else if (z) {
                    ImageManager.this.zzYS.put(new zza.C0028zza(this.mUri), this.mBitmap);
                }
            }
            ImageReceiver imageReceiver = (ImageReceiver) ImageManager.this.zzYV.remove(this.mUri);
            if (imageReceiver != null) {
                zza(imageReceiver, z);
            }
            this.zzoD.countDown();
            synchronized (ImageManager.zzYN) {
                ImageManager.zzYO.remove(this.mUri);
            }
        }
    }

    private ImageManager(Context context, boolean withMemoryCache) {
        this.mContext = context.getApplicationContext();
        if (withMemoryCache) {
            this.zzYS = new zzb(this.mContext);
            if (zzlk.zzoU()) {
                zznl();
            }
        } else {
            this.zzYS = null;
        }
        this.zzYT = new zzkj();
        this.zzYU = new HashMap();
        this.zzYV = new HashMap();
        this.zzYW = new HashMap();
    }

    public static ImageManager create(Context context) {
        return zzb(context, false);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private Bitmap zza(zza.C0028zza zza2) {
        if (this.zzYS == null) {
            return null;
        }
        return (Bitmap) this.zzYS.get(zza2);
    }

    public static ImageManager zzb(Context context, boolean z) {
        if (z) {
            if (zzYQ == null) {
                zzYQ = new ImageManager(context, true);
            }
            return zzYQ;
        }
        if (zzYP == null) {
            zzYP = new ImageManager(context, false);
        }
        return zzYP;
    }

    private void zznl() {
        this.mContext.registerComponentCallbacks(new zze(this.zzYS));
    }

    public void loadImage(ImageView imageView, int resId) {
        zza(new zza.zzb(imageView, resId));
    }

    public void loadImage(ImageView imageView, Uri uri) {
        zza(new zza.zzb(imageView, uri));
    }

    public void loadImage(ImageView imageView, Uri uri, int defaultResId) {
        zza.zzb zzb2 = new zza.zzb(imageView, uri);
        zzb2.zzbm(defaultResId);
        zza(zzb2);
    }

    public void loadImage(OnImageLoadedListener listener, Uri uri) {
        zza(new zza.zzc(listener, uri));
    }

    public void loadImage(OnImageLoadedListener listener, Uri uri, int defaultResId) {
        zza.zzc zzc2 = new zza.zzc(listener, uri);
        zzc2.zzbm(defaultResId);
        zza(zzc2);
    }

    public void zza(zza zza2) {
        com.google.android.gms.common.internal.zzb.zzbY("ImageManager.loadImage() must be called in the main thread");
        new zzd(zza2).run();
    }
}
