package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.zzkx;
import com.google.android.gms.internal.zzky;
import com.google.android.gms.internal.zzlh;
import com.google.android.gms.internal.zzli;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SafeParcelResponse extends FastJsonResponse implements SafeParcelable {
    public static final zze CREATOR = new zze();
    private final String mClassName;
    private final int zzCY;
    private final FieldMappingDictionary zzabO;
    private final Parcel zzabV;
    private final int zzabW;
    private int zzabX;
    private int zzabY;

    SafeParcelResponse(int versionCode, Parcel parcel, FieldMappingDictionary fieldMappingDictionary) {
        this.zzCY = versionCode;
        this.zzabV = (Parcel) zzu.zzu(parcel);
        this.zzabW = 2;
        this.zzabO = fieldMappingDictionary;
        if (this.zzabO == null) {
            this.mClassName = null;
        } else {
            this.mClassName = this.zzabO.zzoC();
        }
        this.zzabX = 2;
    }

    private SafeParcelResponse(SafeParcelable safeParcelable, FieldMappingDictionary dictionary, String className) {
        this.zzCY = 1;
        this.zzabV = Parcel.obtain();
        safeParcelable.writeToParcel(this.zzabV, 0);
        this.zzabW = 1;
        this.zzabO = (FieldMappingDictionary) zzu.zzu(dictionary);
        this.mClassName = (String) zzu.zzu(className);
        this.zzabX = 2;
    }

    private static HashMap<Integer, Map.Entry<String, FastJsonResponse.Field<?, ?>>> zzC(Map<String, FastJsonResponse.Field<?, ?>> map) {
        HashMap<Integer, Map.Entry<String, FastJsonResponse.Field<?, ?>>> hashMap = new HashMap<>();
        for (Map.Entry<String, FastJsonResponse.Field<?, ?>> entry : map.entrySet()) {
            hashMap.put(Integer.valueOf(entry.getValue().zzot()), entry);
        }
        return hashMap;
    }

    public static <T extends FastJsonResponse & SafeParcelable> SafeParcelResponse zza(T t) {
        String canonicalName = t.getClass().getCanonicalName();
        return new SafeParcelResponse(t, zzb(t), canonicalName);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.google.android.gms.common.server.response.FieldMappingDictionary */
    /* JADX WARN: Multi-variable type inference failed */
    private static void zza(FieldMappingDictionary fieldMappingDictionary, FastJsonResponse fastJsonResponse) {
        Class<?> cls = fastJsonResponse.getClass();
        if (!fieldMappingDictionary.zzb(cls)) {
            Map<String, FastJsonResponse.Field<?, ?>> zzom = fastJsonResponse.zzom();
            fieldMappingDictionary.zza(cls, zzom);
            for (String str : zzom.keySet()) {
                FastJsonResponse.Field<?, ?> field = zzom.get(str);
                Class<? extends FastJsonResponse> zzou = field.zzou();
                if (zzou != null) {
                    try {
                        zza(fieldMappingDictionary, (FastJsonResponse) zzou.newInstance());
                    } catch (InstantiationException e) {
                        throw new IllegalStateException("Could not instantiate an object of type " + field.zzou().getCanonicalName(), e);
                    } catch (IllegalAccessException e2) {
                        throw new IllegalStateException("Could not access object of type " + field.zzou().getCanonicalName(), e2);
                    }
                }
            }
        }
    }

    private void zza(StringBuilder sb, int i, Object obj) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"").append(zzlh.zzcr(obj.toString())).append("\"");
                return;
            case 8:
                sb.append("\"").append(zzky.zzi((byte[]) obj)).append("\"");
                return;
            case 9:
                sb.append("\"").append(zzky.zzj((byte[]) obj));
                sb.append("\"");
                return;
            case 10:
                zzli.zza(sb, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException("Unknown type = " + i);
        }
    }

    private void zza(StringBuilder sb, FastJsonResponse.Field<?, ?> field, Parcel parcel, int i) {
        switch (field.zzol()) {
            case 0:
                zzb(sb, field, zza(field, Integer.valueOf(zza.zzg(parcel, i))));
                return;
            case 1:
                zzb(sb, field, zza(field, zza.zzk(parcel, i)));
                return;
            case 2:
                zzb(sb, field, zza(field, Long.valueOf(zza.zzi(parcel, i))));
                return;
            case 3:
                zzb(sb, field, zza(field, Float.valueOf(zza.zzl(parcel, i))));
                return;
            case 4:
                zzb(sb, field, zza(field, Double.valueOf(zza.zzm(parcel, i))));
                return;
            case 5:
                zzb(sb, field, zza(field, zza.zzn(parcel, i)));
                return;
            case 6:
                zzb(sb, field, zza(field, Boolean.valueOf(zza.zzc(parcel, i))));
                return;
            case 7:
                zzb(sb, field, zza(field, zza.zzo(parcel, i)));
                return;
            case 8:
            case 9:
                zzb(sb, field, zza(field, zza.zzr(parcel, i)));
                return;
            case 10:
                zzb(sb, field, zza(field, zzh(zza.zzq(parcel, i))));
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException("Unknown field out type = " + field.zzol());
        }
    }

    private void zza(StringBuilder sb, String str, FastJsonResponse.Field<?, ?> field, Parcel parcel, int i) {
        sb.append("\"").append(str).append("\":");
        if (field.zzow()) {
            zza(sb, field, parcel, i);
        } else {
            zzb(sb, field, parcel, i);
        }
    }

    private void zza(StringBuilder sb, Map<String, FastJsonResponse.Field<?, ?>> map, Parcel parcel) {
        HashMap<Integer, Map.Entry<String, FastJsonResponse.Field<?, ?>>> zzC = zzC(map);
        sb.append('{');
        int zzab = zza.zzab(parcel);
        boolean z = false;
        while (parcel.dataPosition() < zzab) {
            int zzaa = zza.zzaa(parcel);
            Map.Entry<String, FastJsonResponse.Field<?, ?>> entry = zzC.get(Integer.valueOf(zza.zzbA(zzaa)));
            if (entry != null) {
                if (z) {
                    sb.append(",");
                }
                zza(sb, entry.getKey(), entry.getValue(), parcel, zzaa);
                z = true;
            }
        }
        if (parcel.dataPosition() != zzab) {
            throw new zza.C0031zza("Overread allowed size end=" + zzab, parcel);
        }
        sb.append('}');
    }

    private static FieldMappingDictionary zzb(FastJsonResponse fastJsonResponse) {
        FieldMappingDictionary fieldMappingDictionary = new FieldMappingDictionary(fastJsonResponse.getClass());
        zza(fieldMappingDictionary, fastJsonResponse);
        fieldMappingDictionary.zzoA();
        fieldMappingDictionary.zzoz();
        return fieldMappingDictionary;
    }

    private void zzb(StringBuilder sb, FastJsonResponse.Field<?, ?> field, Parcel parcel, int i) {
        if (field.zzor()) {
            sb.append("[");
            switch (field.zzol()) {
                case 0:
                    zzkx.zza(sb, zza.zzu(parcel, i));
                    break;
                case 1:
                    zzkx.zza(sb, zza.zzw(parcel, i));
                    break;
                case 2:
                    zzkx.zza(sb, zza.zzv(parcel, i));
                    break;
                case 3:
                    zzkx.zza(sb, zza.zzx(parcel, i));
                    break;
                case 4:
                    zzkx.zza(sb, zza.zzy(parcel, i));
                    break;
                case 5:
                    zzkx.zza(sb, zza.zzz(parcel, i));
                    break;
                case 6:
                    zzkx.zza(sb, zza.zzt(parcel, i));
                    break;
                case 7:
                    zzkx.zza(sb, zza.zzA(parcel, i));
                    break;
                case 8:
                case 9:
                case 10:
                    throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                case 11:
                    Parcel[] zzE = zza.zzE(parcel, i);
                    int length = zzE.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        if (i2 > 0) {
                            sb.append(",");
                        }
                        zzE[i2].setDataPosition(0);
                        zza(sb, field.zzoy(), zzE[i2]);
                    }
                    break;
                default:
                    throw new IllegalStateException("Unknown field type out.");
            }
            sb.append("]");
            return;
        }
        switch (field.zzol()) {
            case 0:
                sb.append(zza.zzg(parcel, i));
                return;
            case 1:
                sb.append(zza.zzk(parcel, i));
                return;
            case 2:
                sb.append(zza.zzi(parcel, i));
                return;
            case 3:
                sb.append(zza.zzl(parcel, i));
                return;
            case 4:
                sb.append(zza.zzm(parcel, i));
                return;
            case 5:
                sb.append(zza.zzn(parcel, i));
                return;
            case 6:
                sb.append(zza.zzc(parcel, i));
                return;
            case 7:
                sb.append("\"").append(zzlh.zzcr(zza.zzo(parcel, i))).append("\"");
                return;
            case 8:
                sb.append("\"").append(zzky.zzi(zza.zzr(parcel, i))).append("\"");
                return;
            case 9:
                sb.append("\"").append(zzky.zzj(zza.zzr(parcel, i)));
                sb.append("\"");
                return;
            case 10:
                Bundle zzq = zza.zzq(parcel, i);
                Set<String> keySet = zzq.keySet();
                keySet.size();
                sb.append("{");
                boolean z = true;
                for (String str : keySet) {
                    if (!z) {
                        sb.append(",");
                    }
                    sb.append("\"").append(str).append("\"");
                    sb.append(":");
                    sb.append("\"").append(zzlh.zzcr(zzq.getString(str))).append("\"");
                    z = false;
                }
                sb.append("}");
                return;
            case 11:
                Parcel zzD = zza.zzD(parcel, i);
                zzD.setDataPosition(0);
                zza(sb, field.zzoy(), zzD);
                return;
            default:
                throw new IllegalStateException("Unknown field type out");
        }
    }

    private void zzb(StringBuilder sb, FastJsonResponse.Field<?, ?> field, Object obj) {
        if (field.zzoq()) {
            zzb(sb, field, (ArrayList) obj);
        } else {
            zza(sb, field.zzok(), obj);
        }
    }

    private void zzb(StringBuilder sb, FastJsonResponse.Field<?, ?> field, ArrayList<?> arrayList) {
        sb.append("[");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                sb.append(",");
            }
            zza(sb, field.zzok(), arrayList.get(i));
        }
        sb.append("]");
    }

    public static HashMap<String, String> zzh(Bundle bundle) {
        HashMap<String, String> hashMap = new HashMap<>();
        for (String str : bundle.keySet()) {
            hashMap.put(str, bundle.getString(str));
        }
        return hashMap;
    }

    public int describeContents() {
        zze zze = CREATOR;
        return 0;
    }

    public int getVersionCode() {
        return this.zzCY;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public String toString() {
        zzu.zzb(this.zzabO, "Cannot convert to JSON on client side.");
        Parcel zzoE = zzoE();
        zzoE.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        zza(sb, this.zzabO.zzco(this.mClassName), zzoE);
        return sb.toString();
    }

    public void writeToParcel(Parcel out, int flags) {
        zze zze = CREATOR;
        zze.zza(this, out, flags);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public Object zzck(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public boolean zzcl(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public Parcel zzoE() {
        switch (this.zzabX) {
            case 0:
                this.zzabY = zzb.zzac(this.zzabV);
                zzb.zzH(this.zzabV, this.zzabY);
                this.zzabX = 2;
                break;
            case 1:
                zzb.zzH(this.zzabV, this.zzabY);
                this.zzabX = 2;
                break;
        }
        return this.zzabV;
    }

    /* access modifiers changed from: package-private */
    public FieldMappingDictionary zzoF() {
        switch (this.zzabW) {
            case 0:
                return null;
            case 1:
                return this.zzabO;
            case 2:
                return this.zzabO;
            default:
                throw new IllegalStateException("Invalid creation type: " + this.zzabW);
        }
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public Map<String, FastJsonResponse.Field<?, ?>> zzom() {
        if (this.zzabO == null) {
            return null;
        }
        return this.zzabO.zzco(this.mClassName);
    }
}
