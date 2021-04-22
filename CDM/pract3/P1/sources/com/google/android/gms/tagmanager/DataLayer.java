package com.google.android.gms.tagmanager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataLayer {
    public static final String EVENT_KEY = "event";
    public static final Object OBJECT_NOT_PRESENT = new Object();
    static final String[] zzaLf = "gtm.lifetime".toString().split("\\.");
    private static final Pattern zzaLg = Pattern.compile("(\\d+)\\s*([smhd]?)");
    private final ConcurrentHashMap<zzb, Integer> zzaLh;
    private final Map<String, Object> zzaLi;
    private final ReentrantLock zzaLj;
    private final LinkedList<Map<String, Object>> zzaLk;
    private final zzc zzaLl;
    private final CountDownLatch zzaLm;

    /* access modifiers changed from: package-private */
    public static final class zza {
        public final Object zzGK;
        public final String zztw;

        zza(String str, Object obj) {
            this.zztw = str;
            this.zzGK = obj;
        }

        public boolean equals(Object o) {
            if (!(o instanceof zza)) {
                return false;
            }
            zza zza = (zza) o;
            return this.zztw.equals(zza.zztw) && this.zzGK.equals(zza.zzGK);
        }

        public int hashCode() {
            return Arrays.hashCode(new Integer[]{Integer.valueOf(this.zztw.hashCode()), Integer.valueOf(this.zzGK.hashCode())});
        }

        public String toString() {
            return "Key: " + this.zztw + " value: " + this.zzGK.toString();
        }
    }

    /* access modifiers changed from: package-private */
    public interface zzb {
        void zzF(Map<String, Object> map);
    }

    /* access modifiers changed from: package-private */
    public interface zzc {

        public interface zza {
            void zzo(List<zza> list);
        }

        void zza(zza zza2);

        void zza(List<zza> list, long j);

        void zzep(String str);
    }

    DataLayer() {
        this(new zzc() {
            /* class com.google.android.gms.tagmanager.DataLayer.AnonymousClass1 */

            @Override // com.google.android.gms.tagmanager.DataLayer.zzc
            public void zza(zzc.zza zza) {
                zza.zzo(new ArrayList());
            }

            @Override // com.google.android.gms.tagmanager.DataLayer.zzc
            public void zza(List<zza> list, long j) {
            }

            @Override // com.google.android.gms.tagmanager.DataLayer.zzc
            public void zzep(String str) {
            }
        });
    }

    DataLayer(zzc persistentStore) {
        this.zzaLl = persistentStore;
        this.zzaLh = new ConcurrentHashMap<>();
        this.zzaLi = new HashMap();
        this.zzaLj = new ReentrantLock();
        this.zzaLk = new LinkedList<>();
        this.zzaLm = new CountDownLatch(1);
        zzyy();
    }

    public static List<Object> listOf(Object... objects) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objects) {
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static Map<String, Object> mapOf(Object... objects) {
        if (objects.length % 2 != 0) {
            throw new IllegalArgumentException("expected even number of key-value pairs");
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < objects.length; i += 2) {
            if (!(objects[i] instanceof String)) {
                throw new IllegalArgumentException("key is not a string: " + objects[i]);
            }
            hashMap.put((String) objects[i], objects[i + 1]);
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void zzH(Map<String, Object> map) {
        this.zzaLj.lock();
        try {
            this.zzaLk.offer(map);
            if (this.zzaLj.getHoldCount() == 1) {
                zzyz();
            }
            zzI(map);
        } finally {
            this.zzaLj.unlock();
        }
    }

    private void zzI(Map<String, Object> map) {
        Long zzJ = zzJ(map);
        if (zzJ != null) {
            List<zza> zzL = zzL(map);
            zzL.remove("gtm.lifetime");
            this.zzaLl.zza(zzL, zzJ.longValue());
        }
    }

    private Long zzJ(Map<String, Object> map) {
        Object zzK = zzK(map);
        if (zzK == null) {
            return null;
        }
        return zzeo(zzK.toString());
    }

    private Object zzK(Map<String, Object> map) {
        String[] strArr = zzaLf;
        int length = strArr.length;
        int i = 0;
        Map<String, Object> map2 = map;
        while (i < length) {
            String str = strArr[i];
            if (!(map2 instanceof Map)) {
                return null;
            }
            i++;
            map2 = map2.get(str);
        }
        return map2;
    }

    private List<zza> zzL(Map<String, Object> map) {
        ArrayList arrayList = new ArrayList();
        zza(map, "", arrayList);
        return arrayList;
    }

    private void zzM(Map<String, Object> map) {
        synchronized (this.zzaLi) {
            for (String str : map.keySet()) {
                zzc(zzj(str, map.get(str)), this.zzaLi);
            }
        }
        zzN(map);
    }

    private void zzN(Map<String, Object> map) {
        for (zzb zzb2 : this.zzaLh.keySet()) {
            zzb2.zzF(map);
        }
    }

    private void zza(Map<String, Object> map, String str, Collection<zza> collection) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String str2 = str + (str.length() == 0 ? "" : ".") + entry.getKey();
            if (entry.getValue() instanceof Map) {
                zza((Map) entry.getValue(), str2, collection);
            } else if (!str2.equals("gtm.lifetime")) {
                collection.add(new zza(str2, entry.getValue()));
            }
        }
    }

    static Long zzeo(String str) {
        long j;
        Matcher matcher = zzaLg.matcher(str);
        if (!matcher.matches()) {
            zzbg.zzaA("unknown _lifetime: " + str);
            return null;
        }
        try {
            j = Long.parseLong(matcher.group(1));
        } catch (NumberFormatException e) {
            zzbg.zzaC("illegal number in _lifetime value: " + str);
            j = 0;
        }
        if (j <= 0) {
            zzbg.zzaA("non-positive _lifetime: " + str);
            return null;
        }
        String group = matcher.group(2);
        if (group.length() == 0) {
            return Long.valueOf(j);
        }
        switch (group.charAt(0)) {
            case 'd':
                return Long.valueOf(j * 1000 * 60 * 60 * 24);
            case 'h':
                return Long.valueOf(j * 1000 * 60 * 60);
            case 'm':
                return Long.valueOf(j * 1000 * 60);
            case 's':
                return Long.valueOf(j * 1000);
            default:
                zzbg.zzaC("unknown units in _lifetime: " + str);
                return null;
        }
    }

    private void zzyy() {
        this.zzaLl.zza(new zzc.zza() {
            /* class com.google.android.gms.tagmanager.DataLayer.AnonymousClass2 */

            @Override // com.google.android.gms.tagmanager.DataLayer.zzc.zza
            public void zzo(List<zza> list) {
                for (zza zza : list) {
                    DataLayer.this.zzH(DataLayer.this.zzj(zza.zztw, zza.zzGK));
                }
                DataLayer.this.zzaLm.countDown();
            }
        });
    }

    private void zzyz() {
        int i = 0;
        while (true) {
            Map<String, Object> poll = this.zzaLk.poll();
            if (poll != null) {
                zzM(poll);
                i++;
                if (i > 500) {
                    this.zzaLk.clear();
                    throw new RuntimeException("Seems like an infinite loop of pushing to the data layer");
                }
            } else {
                return;
            }
        }
    }

    public Object get(String key) {
        synchronized (this.zzaLi) {
            Map<String, Object> map = this.zzaLi;
            String[] split = key.split("\\.");
            int length = split.length;
            Map<String, Object> map2 = map;
            int i = 0;
            while (i < length) {
                String str = split[i];
                if (!(map2 instanceof Map)) {
                    return null;
                }
                Object obj = map2.get(str);
                if (obj == null) {
                    return null;
                }
                i++;
                map2 = obj;
            }
            return map2;
        }
    }

    public void push(String key, Object value) {
        push(zzj(key, value));
    }

    public void push(Map<String, Object> update) {
        try {
            this.zzaLm.await();
        } catch (InterruptedException e) {
            zzbg.zzaC("DataLayer.push: unexpected InterruptedException");
        }
        zzH(update);
    }

    public void pushEvent(String eventName, Map<String, Object> update) {
        HashMap hashMap = new HashMap(update);
        hashMap.put("event", eventName);
        push(hashMap);
    }

    public String toString() {
        String sb;
        synchronized (this.zzaLi) {
            StringBuilder sb2 = new StringBuilder();
            for (Map.Entry<String, Object> entry : this.zzaLi.entrySet()) {
                sb2.append(String.format("{\n\tKey: %s\n\tValue: %s\n}\n", entry.getKey(), entry.getValue()));
            }
            sb = sb2.toString();
        }
        return sb;
    }

    /* access modifiers changed from: package-private */
    public void zza(zzb zzb2) {
        this.zzaLh.put(zzb2, 0);
    }

    /* access modifiers changed from: package-private */
    public void zzb(List<Object> list, List<Object> list2) {
        while (list2.size() < list.size()) {
            list2.add(null);
        }
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            if (obj instanceof List) {
                if (!(list2.get(i) instanceof List)) {
                    list2.set(i, new ArrayList());
                }
                zzb((List) obj, (List) list2.get(i));
            } else if (obj instanceof Map) {
                if (!(list2.get(i) instanceof Map)) {
                    list2.set(i, new HashMap());
                }
                zzc((Map) obj, (Map) list2.get(i));
            } else if (obj != OBJECT_NOT_PRESENT) {
                list2.set(i, obj);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void zzc(Map<String, Object> map, Map<String, Object> map2) {
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj instanceof List) {
                if (!(map2.get(str) instanceof List)) {
                    map2.put(str, new ArrayList());
                }
                zzb((List) obj, (List) map2.get(str));
            } else if (obj instanceof Map) {
                if (!(map2.get(str) instanceof Map)) {
                    map2.put(str, new HashMap());
                }
                zzc((Map) obj, (Map) map2.get(str));
            } else {
                map2.put(str, obj);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void zzen(String str) {
        push(str, null);
        this.zzaLl.zzep(str);
    }

    /* access modifiers changed from: package-private */
    public Map<String, Object> zzj(String str, Object obj) {
        HashMap hashMap = new HashMap();
        String[] split = str.toString().split("\\.");
        int i = 0;
        HashMap hashMap2 = hashMap;
        while (i < split.length - 1) {
            HashMap hashMap3 = new HashMap();
            hashMap2.put(split[i], hashMap3);
            i++;
            hashMap2 = hashMap3;
        }
        hashMap2.put(split[split.length - 1], obj);
        return hashMap;
    }
}
