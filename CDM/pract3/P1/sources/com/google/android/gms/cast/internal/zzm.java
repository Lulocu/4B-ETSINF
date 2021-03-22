package com.google.android.gms.cast.internal;

import android.os.SystemClock;
import android.support.v7.media.MediaRouteProviderProtocol;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.RemoteMediaPlayer;
import com.google.android.gms.cast.TextTrackStyle;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class zzm extends zzc {
    private static final String NAMESPACE = zzf.zzbE("com.google.cast.media");
    private final List<zzp> zzTo = new ArrayList();
    private long zzUY;
    private MediaStatus zzUZ;
    private final zzp zzVa = new zzp(86400000);
    private final zzp zzVb = new zzp(86400000);
    private final zzp zzVc = new zzp(86400000);
    private final zzp zzVd = new zzp(86400000);
    private final zzp zzVe = new zzp(86400000);
    private final zzp zzVf = new zzp(86400000);
    private final zzp zzVg = new zzp(86400000);
    private final zzp zzVh = new zzp(86400000);
    private final zzp zzVi = new zzp(86400000);
    private final zzp zzVj = new zzp(86400000);
    private final zzp zzVk = new zzp(86400000);
    private final zzp zzVl = new zzp(86400000);
    private final zzp zzVm = new zzp(86400000);
    private final zzp zzVn = new zzp(86400000);

    public zzm(String str) {
        super(NAMESPACE, "MediaControlChannel", str, 1000);
        this.zzTo.add(this.zzVa);
        this.zzTo.add(this.zzVb);
        this.zzTo.add(this.zzVc);
        this.zzTo.add(this.zzVd);
        this.zzTo.add(this.zzVe);
        this.zzTo.add(this.zzVf);
        this.zzTo.add(this.zzVg);
        this.zzTo.add(this.zzVh);
        this.zzTo.add(this.zzVi);
        this.zzTo.add(this.zzVj);
        this.zzTo.add(this.zzVk);
        this.zzTo.add(this.zzVl);
        this.zzTo.add(this.zzVm);
        this.zzTo.add(this.zzVn);
        zzmc();
    }

    private void zza(long j, JSONObject jSONObject) throws JSONException {
        int i;
        boolean z = true;
        boolean zzB = this.zzVa.zzB(j);
        boolean z2 = this.zzVe.zzme() && !this.zzVe.zzB(j);
        if ((!this.zzVf.zzme() || this.zzVf.zzB(j)) && (!this.zzVg.zzme() || this.zzVg.zzB(j))) {
            z = false;
        }
        int i2 = z2 ? 2 : 0;
        if (z) {
            i2 |= 1;
        }
        if (zzB || this.zzUZ == null) {
            this.zzUZ = new MediaStatus(jSONObject);
            this.zzUY = SystemClock.elapsedRealtime();
            i = 31;
        } else {
            i = this.zzUZ.zza(jSONObject, i2);
        }
        if ((i & 1) != 0) {
            this.zzUY = SystemClock.elapsedRealtime();
            onStatusUpdated();
        }
        if ((i & 2) != 0) {
            this.zzUY = SystemClock.elapsedRealtime();
            onStatusUpdated();
        }
        if ((i & 4) != 0) {
            onMetadataUpdated();
        }
        if ((i & 8) != 0) {
            onQueueStatusUpdated();
        }
        if ((i & 16) != 0) {
            onPreloadStatusUpdated();
        }
        for (zzp zzp : this.zzTo) {
            zzp.zzc(j, 0);
        }
    }

    private void zzmc() {
        this.zzUY = 0;
        this.zzUZ = null;
        for (zzp zzp : this.zzTo) {
            zzp.clear();
        }
    }

    public long getApproximateStreamPosition() {
        MediaInfo mediaInfo = getMediaInfo();
        if (mediaInfo == null || this.zzUY == 0) {
            return 0;
        }
        double playbackRate = this.zzUZ.getPlaybackRate();
        long streamPosition = this.zzUZ.getStreamPosition();
        int playerState = this.zzUZ.getPlayerState();
        if (playbackRate == 0.0d || playerState != 2) {
            return streamPosition;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.zzUY;
        long j = elapsedRealtime < 0 ? 0 : elapsedRealtime;
        if (j == 0) {
            return streamPosition;
        }
        long streamDuration = mediaInfo.getStreamDuration();
        long j2 = streamPosition + ((long) (((double) j) * playbackRate));
        if (streamDuration <= 0 || j2 <= streamDuration) {
            streamDuration = j2 < 0 ? 0 : j2;
        }
        return streamDuration;
    }

    public MediaInfo getMediaInfo() {
        if (this.zzUZ == null) {
            return null;
        }
        return this.zzUZ.getMediaInfo();
    }

    public MediaStatus getMediaStatus() {
        return this.zzUZ;
    }

    public long getStreamDuration() {
        MediaInfo mediaInfo = getMediaInfo();
        if (mediaInfo != null) {
            return mediaInfo.getStreamDuration();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void onMetadataUpdated() {
    }

    /* access modifiers changed from: protected */
    public void onPreloadStatusUpdated() {
    }

    /* access modifiers changed from: protected */
    public void onQueueStatusUpdated() {
    }

    /* access modifiers changed from: protected */
    public void onStatusUpdated() {
    }

    public long zza(zzo zzo) throws IOException {
        JSONObject jSONObject = new JSONObject();
        long zzlK = zzlK();
        this.zzVh.zza(zzlK, zzo);
        zzQ(true);
        try {
            jSONObject.put("requestId", zzlK);
            jSONObject.put("type", "GET_STATUS");
            if (this.zzUZ != null) {
                jSONObject.put("mediaSessionId", this.zzUZ.zzls());
            }
        } catch (JSONException e) {
        }
        zza(jSONObject.toString(), zzlK, (String) null);
        return zzlK;
    }

    public long zza(zzo zzo, double d, JSONObject jSONObject) throws IOException, IllegalStateException, IllegalArgumentException {
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            throw new IllegalArgumentException("Volume cannot be " + d);
        }
        JSONObject jSONObject2 = new JSONObject();
        long zzlK = zzlK();
        this.zzVf.zza(zzlK, zzo);
        zzQ(true);
        try {
            jSONObject2.put("requestId", zzlK);
            jSONObject2.put("type", "SET_VOLUME");
            jSONObject2.put("mediaSessionId", zzls());
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("level", d);
            jSONObject2.put(MediaRouteProviderProtocol.CLIENT_DATA_VOLUME, jSONObject3);
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        zza(jSONObject2.toString(), zzlK, (String) null);
        return zzlK;
    }

    public long zza(zzo zzo, int i, MediaQueueItem[] mediaQueueItemArr, int i2, Integer num, JSONObject jSONObject) throws IOException, IllegalStateException {
        JSONObject jSONObject2 = new JSONObject();
        long zzlK = zzlK();
        this.zzVl.zza(zzlK, zzo);
        zzQ(true);
        try {
            jSONObject2.put("requestId", zzlK);
            jSONObject2.put("type", "QUEUE_UPDATE");
            jSONObject2.put("mediaSessionId", zzls());
            if (i != 0) {
                jSONObject2.put("currentItemId", i);
            }
            if (i2 != 0) {
                jSONObject2.put("jump", i2);
            }
            if (mediaQueueItemArr != null && mediaQueueItemArr.length > 0) {
                JSONArray jSONArray = new JSONArray();
                for (int i3 = 0; i3 < mediaQueueItemArr.length; i3++) {
                    jSONArray.put(i3, mediaQueueItemArr[i3].toJson());
                }
                jSONObject2.put("items", jSONArray);
            }
            if (num != null) {
                switch (num.intValue()) {
                    case 0:
                        jSONObject2.put("repeatMode", "REPEAT_OFF");
                        break;
                    case 1:
                        jSONObject2.put("repeatMode", "REPEAT_ALL");
                        break;
                    case 2:
                        jSONObject2.put("repeatMode", "REPEAT_SINGLE");
                        break;
                    case 3:
                        jSONObject2.put("repeatMode", "REPEAT_ALL_AND_SHUFFLE");
                        break;
                }
            }
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        zza(jSONObject2.toString(), zzlK, (String) null);
        return zzlK;
    }

    public long zza(zzo zzo, long j, int i, JSONObject jSONObject) throws IOException, IllegalStateException {
        JSONObject jSONObject2 = new JSONObject();
        long zzlK = zzlK();
        this.zzVe.zza(zzlK, zzo);
        zzQ(true);
        try {
            jSONObject2.put("requestId", zzlK);
            jSONObject2.put("type", "SEEK");
            jSONObject2.put("mediaSessionId", zzls());
            jSONObject2.put("currentTime", zzf.zzA(j));
            if (i == 1) {
                jSONObject2.put("resumeState", "PLAYBACK_START");
            } else if (i == 2) {
                jSONObject2.put("resumeState", "PLAYBACK_PAUSE");
            }
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        zza(jSONObject2.toString(), zzlK, (String) null);
        return zzlK;
    }

    public long zza(zzo zzo, MediaInfo mediaInfo, boolean z, long j, long[] jArr, JSONObject jSONObject) throws IOException {
        JSONObject jSONObject2 = new JSONObject();
        long zzlK = zzlK();
        this.zzVa.zza(zzlK, zzo);
        zzQ(true);
        try {
            jSONObject2.put("requestId", zzlK);
            jSONObject2.put("type", "LOAD");
            jSONObject2.put("media", mediaInfo.toJson());
            jSONObject2.put("autoplay", z);
            jSONObject2.put("currentTime", zzf.zzA(j));
            if (jArr != null) {
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < jArr.length; i++) {
                    jSONArray.put(i, jArr[i]);
                }
                jSONObject2.put("activeTrackIds", jSONArray);
            }
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        zza(jSONObject2.toString(), zzlK, (String) null);
        return zzlK;
    }

    public long zza(zzo zzo, TextTrackStyle textTrackStyle) throws IOException {
        JSONObject jSONObject = new JSONObject();
        long zzlK = zzlK();
        this.zzVj.zza(zzlK, zzo);
        zzQ(true);
        try {
            jSONObject.put("requestId", zzlK);
            jSONObject.put("type", "EDIT_TRACKS_INFO");
            if (textTrackStyle != null) {
                jSONObject.put("textTrackStyle", textTrackStyle.toJson());
            }
            jSONObject.put("mediaSessionId", zzls());
        } catch (JSONException e) {
        }
        zza(jSONObject.toString(), zzlK, (String) null);
        return zzlK;
    }

    public long zza(zzo zzo, JSONObject jSONObject) throws IOException {
        JSONObject jSONObject2 = new JSONObject();
        long zzlK = zzlK();
        this.zzVb.zza(zzlK, zzo);
        zzQ(true);
        try {
            jSONObject2.put("requestId", zzlK);
            jSONObject2.put("type", "PAUSE");
            jSONObject2.put("mediaSessionId", zzls());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        zza(jSONObject2.toString(), zzlK, (String) null);
        return zzlK;
    }

    public long zza(zzo zzo, boolean z, JSONObject jSONObject) throws IOException, IllegalStateException {
        JSONObject jSONObject2 = new JSONObject();
        long zzlK = zzlK();
        this.zzVg.zza(zzlK, zzo);
        zzQ(true);
        try {
            jSONObject2.put("requestId", zzlK);
            jSONObject2.put("type", "SET_VOLUME");
            jSONObject2.put("mediaSessionId", zzls());
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("muted", z);
            jSONObject2.put(MediaRouteProviderProtocol.CLIENT_DATA_VOLUME, jSONObject3);
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        zza(jSONObject2.toString(), zzlK, (String) null);
        return zzlK;
    }

    public long zza(zzo zzo, int[] iArr, int i, JSONObject jSONObject) throws IOException, IllegalStateException, IllegalArgumentException {
        if (iArr == null || iArr.length == 0) {
            throw new IllegalArgumentException("itemIdsToReorder must not be null or empty.");
        }
        JSONObject jSONObject2 = new JSONObject();
        long zzlK = zzlK();
        this.zzVn.zza(zzlK, zzo);
        zzQ(true);
        try {
            jSONObject2.put("requestId", zzlK);
            jSONObject2.put("type", "QUEUE_REORDER");
            jSONObject2.put("mediaSessionId", zzls());
            JSONArray jSONArray = new JSONArray();
            for (int i2 = 0; i2 < iArr.length; i2++) {
                jSONArray.put(i2, iArr[i2]);
            }
            jSONObject2.put("itemIds", jSONArray);
            if (i != 0) {
                jSONObject2.put("insertBefore", i);
            }
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        zza(jSONObject2.toString(), zzlK, (String) null);
        return zzlK;
    }

    public long zza(zzo zzo, int[] iArr, JSONObject jSONObject) throws IOException, IllegalStateException, IllegalArgumentException {
        if (iArr == null || iArr.length == 0) {
            throw new IllegalArgumentException("itemIdsToRemove must not be null or empty.");
        }
        JSONObject jSONObject2 = new JSONObject();
        long zzlK = zzlK();
        this.zzVm.zza(zzlK, zzo);
        zzQ(true);
        try {
            jSONObject2.put("requestId", zzlK);
            jSONObject2.put("type", "QUEUE_REMOVE");
            jSONObject2.put("mediaSessionId", zzls());
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < iArr.length; i++) {
                jSONArray.put(i, iArr[i]);
            }
            jSONObject2.put("itemIds", jSONArray);
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        zza(jSONObject2.toString(), zzlK, (String) null);
        return zzlK;
    }

    public long zza(zzo zzo, long[] jArr) throws IOException {
        JSONObject jSONObject = new JSONObject();
        long zzlK = zzlK();
        this.zzVi.zza(zzlK, zzo);
        zzQ(true);
        try {
            jSONObject.put("requestId", zzlK);
            jSONObject.put("type", "EDIT_TRACKS_INFO");
            jSONObject.put("mediaSessionId", zzls());
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < jArr.length; i++) {
                jSONArray.put(i, jArr[i]);
            }
            jSONObject.put("activeTrackIds", jSONArray);
        } catch (JSONException e) {
        }
        zza(jSONObject.toString(), zzlK, (String) null);
        return zzlK;
    }

    public long zza(zzo zzo, MediaQueueItem[] mediaQueueItemArr, int i, int i2, JSONObject jSONObject) throws IOException, IllegalArgumentException {
        if (mediaQueueItemArr == null || mediaQueueItemArr.length == 0) {
            throw new IllegalArgumentException("items must not be null or empty.");
        } else if (i < 0 || i >= mediaQueueItemArr.length) {
            throw new IllegalArgumentException("Invalid startIndex: " + i);
        } else {
            JSONObject jSONObject2 = new JSONObject();
            long zzlK = zzlK();
            this.zzVa.zza(zzlK, zzo);
            zzQ(true);
            try {
                jSONObject2.put("requestId", zzlK);
                jSONObject2.put("type", "QUEUE_LOAD");
                JSONArray jSONArray = new JSONArray();
                for (int i3 = 0; i3 < mediaQueueItemArr.length; i3++) {
                    jSONArray.put(i3, mediaQueueItemArr[i3].toJson());
                }
                jSONObject2.put("items", jSONArray);
                switch (i2) {
                    case 0:
                        jSONObject2.put("repeatMode", "REPEAT_OFF");
                        break;
                    case 1:
                        jSONObject2.put("repeatMode", "REPEAT_ALL");
                        break;
                    case 2:
                        jSONObject2.put("repeatMode", "REPEAT_SINGLE");
                        break;
                    case 3:
                        jSONObject2.put("repeatMode", "REPEAT_ALL_AND_SHUFFLE");
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid repeat mode: " + i2);
                }
                jSONObject2.put("startIndex", i);
                if (jSONObject != null) {
                    jSONObject2.put("customData", jSONObject);
                }
            } catch (JSONException e) {
            }
            zza(jSONObject2.toString(), zzlK, (String) null);
            return zzlK;
        }
    }

    public long zza(zzo zzo, MediaQueueItem[] mediaQueueItemArr, int i, JSONObject jSONObject) throws IOException, IllegalStateException, IllegalStateException {
        if (mediaQueueItemArr == null || mediaQueueItemArr.length == 0) {
            throw new IllegalArgumentException("itemsToInsert must not be null or empty.");
        }
        JSONObject jSONObject2 = new JSONObject();
        long zzlK = zzlK();
        this.zzVk.zza(zzlK, zzo);
        zzQ(true);
        try {
            jSONObject2.put("requestId", zzlK);
            jSONObject2.put("type", "QUEUE_INSERT");
            jSONObject2.put("mediaSessionId", zzls());
            JSONArray jSONArray = new JSONArray();
            for (int i2 = 0; i2 < mediaQueueItemArr.length; i2++) {
                jSONArray.put(i2, mediaQueueItemArr[i2].toJson());
            }
            jSONObject2.put("items", jSONArray);
            if (i != 0) {
                jSONObject2.put("insertBefore", i);
            }
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        zza(jSONObject2.toString(), zzlK, (String) null);
        return zzlK;
    }

    public long zzb(zzo zzo, JSONObject jSONObject) throws IOException {
        JSONObject jSONObject2 = new JSONObject();
        long zzlK = zzlK();
        this.zzVd.zza(zzlK, zzo);
        zzQ(true);
        try {
            jSONObject2.put("requestId", zzlK);
            jSONObject2.put("type", "STOP");
            jSONObject2.put("mediaSessionId", zzls());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        zza(jSONObject2.toString(), zzlK, (String) null);
        return zzlK;
    }

    @Override // com.google.android.gms.cast.internal.zzd
    public void zzb(long j, int i) {
        for (zzp zzp : this.zzTo) {
            zzp.zzc(j, i);
        }
    }

    @Override // com.google.android.gms.cast.internal.zzd
    public final void zzbB(String str) {
        this.zzUi.zzb("message received: %s", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("type");
            long optLong = jSONObject.optLong("requestId", -1);
            if (string.equals("MEDIA_STATUS")) {
                JSONArray jSONArray = jSONObject.getJSONArray("status");
                if (jSONArray.length() > 0) {
                    zza(optLong, jSONArray.getJSONObject(0));
                    return;
                }
                this.zzUZ = null;
                onStatusUpdated();
                onMetadataUpdated();
                onQueueStatusUpdated();
                onPreloadStatusUpdated();
                this.zzVh.zzc(optLong, 0);
            } else if (string.equals("INVALID_PLAYER_STATE")) {
                this.zzUi.zzf("received unexpected error: Invalid Player State.", new Object[0]);
                JSONObject optJSONObject = jSONObject.optJSONObject("customData");
                for (zzp zzp : this.zzTo) {
                    zzp.zzc(optLong, 2100, optJSONObject);
                }
            } else if (string.equals("LOAD_FAILED")) {
                this.zzVa.zzc(optLong, 2100, jSONObject.optJSONObject("customData"));
            } else if (string.equals("LOAD_CANCELLED")) {
                this.zzVa.zzc(optLong, RemoteMediaPlayer.STATUS_CANCELED, jSONObject.optJSONObject("customData"));
            } else if (string.equals("INVALID_REQUEST")) {
                this.zzUi.zzf("received unexpected error: Invalid Request.", new Object[0]);
                JSONObject optJSONObject2 = jSONObject.optJSONObject("customData");
                for (zzp zzp2 : this.zzTo) {
                    zzp2.zzc(optLong, 2100, optJSONObject2);
                }
            }
        } catch (JSONException e) {
            this.zzUi.zzf("Message is malformed (%s); ignoring: %s", e.getMessage(), str);
        }
    }

    public long zzc(zzo zzo, JSONObject jSONObject) throws IOException, IllegalStateException {
        JSONObject jSONObject2 = new JSONObject();
        long zzlK = zzlK();
        this.zzVc.zza(zzlK, zzo);
        zzQ(true);
        try {
            jSONObject2.put("requestId", zzlK);
            jSONObject2.put("type", "PLAY");
            jSONObject2.put("mediaSessionId", zzls());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        zza(jSONObject2.toString(), zzlK, (String) null);
        return zzlK;
    }

    @Override // com.google.android.gms.cast.internal.zzd, com.google.android.gms.cast.internal.zzc
    public void zzlJ() {
        super.zzlJ();
        zzmc();
    }

    public long zzls() throws IllegalStateException {
        if (this.zzUZ != null) {
            return this.zzUZ.zzls();
        }
        throw new IllegalStateException("No current media session");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.cast.internal.zzc
    public boolean zzz(long j) {
        boolean z;
        for (zzp zzp : this.zzTo) {
            zzp.zzd(j, RemoteMediaPlayer.STATUS_TIMED_OUT);
        }
        synchronized (zzp.zzVr) {
            Iterator<zzp> it = this.zzTo.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().zzme()) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
        }
        return z;
    }
}
