package com.google.android.gms.internal;

import android.support.v4.media.TransportMediator;
import java.io.IOException;
import java.util.Arrays;

public interface zzrr {

    public static final class zza extends zzrh<zza> {
        public String[] zzaWp;
        public String[] zzaWq;
        public int[] zzaWr;
        public int[] zzaWs;

        public zza() {
            zzBW();
        }

        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof zza)) {
                return false;
            }
            zza zza = (zza) o;
            if (!zzrl.equals(this.zzaWp, zza.zzaWp) || !zzrl.equals(this.zzaWq, zza.zzaWq) || !zzrl.equals(this.zzaWr, zza.zzaWr) || !zzrl.equals(this.zzaWs, zza.zzaWs)) {
                return false;
            }
            return zza(zza);
        }

        public int hashCode() {
            return ((((((((zzrl.hashCode(this.zzaWp) + 527) * 31) + zzrl.hashCode(this.zzaWq)) * 31) + zzrl.hashCode(this.zzaWr)) * 31) + zzrl.hashCode(this.zzaWs)) * 31) + zzBI();
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.zzrh, com.google.android.gms.internal.zzrn
        public int zzB() {
            int i;
            int zzB = super.zzB();
            if (this.zzaWp == null || this.zzaWp.length <= 0) {
                i = zzB;
            } else {
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < this.zzaWp.length; i4++) {
                    String str = this.zzaWp[i4];
                    if (str != null) {
                        i3++;
                        i2 += zzrg.zzfj(str);
                    }
                }
                i = zzB + i2 + (i3 * 1);
            }
            if (this.zzaWq != null && this.zzaWq.length > 0) {
                int i5 = 0;
                int i6 = 0;
                for (int i7 = 0; i7 < this.zzaWq.length; i7++) {
                    String str2 = this.zzaWq[i7];
                    if (str2 != null) {
                        i6++;
                        i5 += zzrg.zzfj(str2);
                    }
                }
                i = i + i5 + (i6 * 1);
            }
            if (this.zzaWr != null && this.zzaWr.length > 0) {
                int i8 = 0;
                for (int i9 = 0; i9 < this.zzaWr.length; i9++) {
                    i8 += zzrg.zzkJ(this.zzaWr[i9]);
                }
                i = i + i8 + (this.zzaWr.length * 1);
            }
            if (this.zzaWs == null || this.zzaWs.length <= 0) {
                return i;
            }
            int i10 = 0;
            for (int i11 = 0; i11 < this.zzaWs.length; i11++) {
                i10 += zzrg.zzkJ(this.zzaWs[i11]);
            }
            return i + i10 + (this.zzaWs.length * 1);
        }

        /* renamed from: zzB */
        public zza zzb(zzrf zzrf) throws IOException {
            while (true) {
                int zzBr = zzrf.zzBr();
                switch (zzBr) {
                    case 0:
                        break;
                    case 10:
                        int zzb = zzrq.zzb(zzrf, 10);
                        int length = this.zzaWp == null ? 0 : this.zzaWp.length;
                        String[] strArr = new String[(zzb + length)];
                        if (length != 0) {
                            System.arraycopy(this.zzaWp, 0, strArr, 0, length);
                        }
                        while (length < strArr.length - 1) {
                            strArr[length] = zzrf.readString();
                            zzrf.zzBr();
                            length++;
                        }
                        strArr[length] = zzrf.readString();
                        this.zzaWp = strArr;
                        break;
                    case 18:
                        int zzb2 = zzrq.zzb(zzrf, 18);
                        int length2 = this.zzaWq == null ? 0 : this.zzaWq.length;
                        String[] strArr2 = new String[(zzb2 + length2)];
                        if (length2 != 0) {
                            System.arraycopy(this.zzaWq, 0, strArr2, 0, length2);
                        }
                        while (length2 < strArr2.length - 1) {
                            strArr2[length2] = zzrf.readString();
                            zzrf.zzBr();
                            length2++;
                        }
                        strArr2[length2] = zzrf.readString();
                        this.zzaWq = strArr2;
                        break;
                    case 24:
                        int zzb3 = zzrq.zzb(zzrf, 24);
                        int length3 = this.zzaWr == null ? 0 : this.zzaWr.length;
                        int[] iArr = new int[(zzb3 + length3)];
                        if (length3 != 0) {
                            System.arraycopy(this.zzaWr, 0, iArr, 0, length3);
                        }
                        while (length3 < iArr.length - 1) {
                            iArr[length3] = zzrf.zzBu();
                            zzrf.zzBr();
                            length3++;
                        }
                        iArr[length3] = zzrf.zzBu();
                        this.zzaWr = iArr;
                        break;
                    case 26:
                        int zzkC = zzrf.zzkC(zzrf.zzBy());
                        int position = zzrf.getPosition();
                        int i = 0;
                        while (zzrf.zzBD() > 0) {
                            zzrf.zzBu();
                            i++;
                        }
                        zzrf.zzkE(position);
                        int length4 = this.zzaWr == null ? 0 : this.zzaWr.length;
                        int[] iArr2 = new int[(i + length4)];
                        if (length4 != 0) {
                            System.arraycopy(this.zzaWr, 0, iArr2, 0, length4);
                        }
                        while (length4 < iArr2.length) {
                            iArr2[length4] = zzrf.zzBu();
                            length4++;
                        }
                        this.zzaWr = iArr2;
                        zzrf.zzkD(zzkC);
                        break;
                    case 32:
                        int zzb4 = zzrq.zzb(zzrf, 32);
                        int length5 = this.zzaWs == null ? 0 : this.zzaWs.length;
                        int[] iArr3 = new int[(zzb4 + length5)];
                        if (length5 != 0) {
                            System.arraycopy(this.zzaWs, 0, iArr3, 0, length5);
                        }
                        while (length5 < iArr3.length - 1) {
                            iArr3[length5] = zzrf.zzBu();
                            zzrf.zzBr();
                            length5++;
                        }
                        iArr3[length5] = zzrf.zzBu();
                        this.zzaWs = iArr3;
                        break;
                    case 34:
                        int zzkC2 = zzrf.zzkC(zzrf.zzBy());
                        int position2 = zzrf.getPosition();
                        int i2 = 0;
                        while (zzrf.zzBD() > 0) {
                            zzrf.zzBu();
                            i2++;
                        }
                        zzrf.zzkE(position2);
                        int length6 = this.zzaWs == null ? 0 : this.zzaWs.length;
                        int[] iArr4 = new int[(i2 + length6)];
                        if (length6 != 0) {
                            System.arraycopy(this.zzaWs, 0, iArr4, 0, length6);
                        }
                        while (length6 < iArr4.length) {
                            iArr4[length6] = zzrf.zzBu();
                            length6++;
                        }
                        this.zzaWs = iArr4;
                        zzrf.zzkD(zzkC2);
                        break;
                    default:
                        if (zza(zzrf, zzBr)) {
                            break;
                        } else {
                            break;
                        }
                }
            }
            return this;
        }

        public zza zzBW() {
            this.zzaWp = zzrq.zzaWm;
            this.zzaWq = zzrq.zzaWm;
            this.zzaWr = zzrq.zzaWh;
            this.zzaWs = zzrq.zzaWh;
            this.zzaVU = null;
            this.zzaWf = -1;
            return this;
        }

        @Override // com.google.android.gms.internal.zzrh, com.google.android.gms.internal.zzrn
        public void zza(zzrg zzrg) throws IOException {
            if (this.zzaWp != null && this.zzaWp.length > 0) {
                for (int i = 0; i < this.zzaWp.length; i++) {
                    String str = this.zzaWp[i];
                    if (str != null) {
                        zzrg.zzb(1, str);
                    }
                }
            }
            if (this.zzaWq != null && this.zzaWq.length > 0) {
                for (int i2 = 0; i2 < this.zzaWq.length; i2++) {
                    String str2 = this.zzaWq[i2];
                    if (str2 != null) {
                        zzrg.zzb(2, str2);
                    }
                }
            }
            if (this.zzaWr != null && this.zzaWr.length > 0) {
                for (int i3 = 0; i3 < this.zzaWr.length; i3++) {
                    zzrg.zzy(3, this.zzaWr[i3]);
                }
            }
            if (this.zzaWs != null && this.zzaWs.length > 0) {
                for (int i4 = 0; i4 < this.zzaWs.length; i4++) {
                    zzrg.zzy(4, this.zzaWs[i4]);
                }
            }
            super.zza(zzrg);
        }
    }

    public static final class zzb extends zzrh<zzb> {
        public String version;
        public int zzaWt;
        public String zzaWu;

        public zzb() {
            zzBX();
        }

        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof zzb)) {
                return false;
            }
            zzb zzb = (zzb) o;
            if (this.zzaWt != zzb.zzaWt) {
                return false;
            }
            if (this.zzaWu == null) {
                if (zzb.zzaWu != null) {
                    return false;
                }
            } else if (!this.zzaWu.equals(zzb.zzaWu)) {
                return false;
            }
            if (this.version == null) {
                if (zzb.version != null) {
                    return false;
                }
            } else if (!this.version.equals(zzb.version)) {
                return false;
            }
            return zza(zzb);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.zzaWu == null ? 0 : this.zzaWu.hashCode()) + ((this.zzaWt + 527) * 31)) * 31;
            if (this.version != null) {
                i = this.version.hashCode();
            }
            return ((hashCode + i) * 31) + zzBI();
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.zzrh, com.google.android.gms.internal.zzrn
        public int zzB() {
            int zzB = super.zzB();
            if (this.zzaWt != 0) {
                zzB += zzrg.zzA(1, this.zzaWt);
            }
            if (!this.zzaWu.equals("")) {
                zzB += zzrg.zzk(2, this.zzaWu);
            }
            return !this.version.equals("") ? zzB + zzrg.zzk(3, this.version) : zzB;
        }

        public zzb zzBX() {
            this.zzaWt = 0;
            this.zzaWu = "";
            this.version = "";
            this.zzaVU = null;
            this.zzaWf = -1;
            return this;
        }

        /* renamed from: zzC */
        public zzb zzb(zzrf zzrf) throws IOException {
            while (true) {
                int zzBr = zzrf.zzBr();
                switch (zzBr) {
                    case 0:
                        break;
                    case 8:
                        int zzBu = zzrf.zzBu();
                        switch (zzBu) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                                this.zzaWt = zzBu;
                                continue;
                        }
                    case 18:
                        this.zzaWu = zzrf.readString();
                        break;
                    case 26:
                        this.version = zzrf.readString();
                        break;
                    default:
                        if (zza(zzrf, zzBr)) {
                            break;
                        } else {
                            break;
                        }
                }
            }
            return this;
        }

        @Override // com.google.android.gms.internal.zzrh, com.google.android.gms.internal.zzrn
        public void zza(zzrg zzrg) throws IOException {
            if (this.zzaWt != 0) {
                zzrg.zzy(1, this.zzaWt);
            }
            if (!this.zzaWu.equals("")) {
                zzrg.zzb(2, this.zzaWu);
            }
            if (!this.version.equals("")) {
                zzrg.zzb(3, this.version);
            }
            super.zza(zzrg);
        }
    }

    public static final class zzc extends zzrh<zzc> {
        public byte[] zzaWv;
        public byte[][] zzaWw;
        public boolean zzaWx;

        public zzc() {
            zzBY();
        }

        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof zzc)) {
                return false;
            }
            zzc zzc = (zzc) o;
            if (!Arrays.equals(this.zzaWv, zzc.zzaWv) || !zzrl.zza(this.zzaWw, zzc.zzaWw) || this.zzaWx != zzc.zzaWx) {
                return false;
            }
            return zza(zzc);
        }

        public int hashCode() {
            return (((this.zzaWx ? 1231 : 1237) + ((((Arrays.hashCode(this.zzaWv) + 527) * 31) + zzrl.zza(this.zzaWw)) * 31)) * 31) + zzBI();
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.zzrh, com.google.android.gms.internal.zzrn
        public int zzB() {
            int zzB = super.zzB();
            if (!Arrays.equals(this.zzaWv, zzrq.zzaWo)) {
                zzB += zzrg.zzb(1, this.zzaWv);
            }
            if (this.zzaWw != null && this.zzaWw.length > 0) {
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < this.zzaWw.length; i3++) {
                    byte[] bArr = this.zzaWw[i3];
                    if (bArr != null) {
                        i2++;
                        i += zzrg.zzC(bArr);
                    }
                }
                zzB = zzB + i + (i2 * 1);
            }
            return this.zzaWx ? zzB + zzrg.zzc(3, this.zzaWx) : zzB;
        }

        public zzc zzBY() {
            this.zzaWv = zzrq.zzaWo;
            this.zzaWw = zzrq.zzaWn;
            this.zzaWx = false;
            this.zzaVU = null;
            this.zzaWf = -1;
            return this;
        }

        /* renamed from: zzD */
        public zzc zzb(zzrf zzrf) throws IOException {
            while (true) {
                int zzBr = zzrf.zzBr();
                switch (zzBr) {
                    case 0:
                        break;
                    case 10:
                        this.zzaWv = zzrf.readBytes();
                        break;
                    case 18:
                        int zzb = zzrq.zzb(zzrf, 18);
                        int length = this.zzaWw == null ? 0 : this.zzaWw.length;
                        byte[][] bArr = new byte[(zzb + length)][];
                        if (length != 0) {
                            System.arraycopy(this.zzaWw, 0, bArr, 0, length);
                        }
                        while (length < bArr.length - 1) {
                            bArr[length] = zzrf.readBytes();
                            zzrf.zzBr();
                            length++;
                        }
                        bArr[length] = zzrf.readBytes();
                        this.zzaWw = bArr;
                        break;
                    case 24:
                        this.zzaWx = zzrf.zzBv();
                        break;
                    default:
                        if (zza(zzrf, zzBr)) {
                            break;
                        } else {
                            break;
                        }
                }
            }
            return this;
        }

        @Override // com.google.android.gms.internal.zzrh, com.google.android.gms.internal.zzrn
        public void zza(zzrg zzrg) throws IOException {
            if (!Arrays.equals(this.zzaWv, zzrq.zzaWo)) {
                zzrg.zza(1, this.zzaWv);
            }
            if (this.zzaWw != null && this.zzaWw.length > 0) {
                for (int i = 0; i < this.zzaWw.length; i++) {
                    byte[] bArr = this.zzaWw[i];
                    if (bArr != null) {
                        zzrg.zza(2, bArr);
                    }
                }
            }
            if (this.zzaWx) {
                zzrg.zzb(3, this.zzaWx);
            }
            super.zza(zzrg);
        }
    }

    public static final class zzd extends zzrh<zzd> {
        public String tag;
        public int zzaWA;
        public int zzaWB;
        public boolean zzaWC;
        public zze[] zzaWD;
        public zzb zzaWE;
        public byte[] zzaWF;
        public byte[] zzaWG;
        public byte[] zzaWH;
        public zza zzaWI;
        public String zzaWJ;
        public long zzaWK;
        public zzc zzaWL;
        public byte[] zzaWM;
        public long zzaWy;
        public long zzaWz;

        public zzd() {
            zzBZ();
        }

        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof zzd)) {
                return false;
            }
            zzd zzd = (zzd) o;
            if (this.zzaWy != zzd.zzaWy || this.zzaWz != zzd.zzaWz) {
                return false;
            }
            if (this.tag == null) {
                if (zzd.tag != null) {
                    return false;
                }
            } else if (!this.tag.equals(zzd.tag)) {
                return false;
            }
            if (this.zzaWA != zzd.zzaWA || this.zzaWB != zzd.zzaWB || this.zzaWC != zzd.zzaWC || !zzrl.equals(this.zzaWD, zzd.zzaWD)) {
                return false;
            }
            if (this.zzaWE == null) {
                if (zzd.zzaWE != null) {
                    return false;
                }
            } else if (!this.zzaWE.equals(zzd.zzaWE)) {
                return false;
            }
            if (!Arrays.equals(this.zzaWF, zzd.zzaWF) || !Arrays.equals(this.zzaWG, zzd.zzaWG) || !Arrays.equals(this.zzaWH, zzd.zzaWH)) {
                return false;
            }
            if (this.zzaWI == null) {
                if (zzd.zzaWI != null) {
                    return false;
                }
            } else if (!this.zzaWI.equals(zzd.zzaWI)) {
                return false;
            }
            if (this.zzaWJ == null) {
                if (zzd.zzaWJ != null) {
                    return false;
                }
            } else if (!this.zzaWJ.equals(zzd.zzaWJ)) {
                return false;
            }
            if (this.zzaWK != zzd.zzaWK) {
                return false;
            }
            if (this.zzaWL == null) {
                if (zzd.zzaWL != null) {
                    return false;
                }
            } else if (!this.zzaWL.equals(zzd.zzaWL)) {
                return false;
            }
            if (Arrays.equals(this.zzaWM, zzd.zzaWM)) {
                return zza(zzd);
            }
            return false;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((((this.zzaWJ == null ? 0 : this.zzaWJ.hashCode()) + (((this.zzaWI == null ? 0 : this.zzaWI.hashCode()) + (((((((((this.zzaWE == null ? 0 : this.zzaWE.hashCode()) + (((((this.zzaWC ? 1231 : 1237) + (((((((this.tag == null ? 0 : this.tag.hashCode()) + ((((((int) (this.zzaWy ^ (this.zzaWy >>> 32))) + 527) * 31) + ((int) (this.zzaWz ^ (this.zzaWz >>> 32)))) * 31)) * 31) + this.zzaWA) * 31) + this.zzaWB) * 31)) * 31) + zzrl.hashCode(this.zzaWD)) * 31)) * 31) + Arrays.hashCode(this.zzaWF)) * 31) + Arrays.hashCode(this.zzaWG)) * 31) + Arrays.hashCode(this.zzaWH)) * 31)) * 31)) * 31) + ((int) (this.zzaWK ^ (this.zzaWK >>> 32)))) * 31;
            if (this.zzaWL != null) {
                i = this.zzaWL.hashCode();
            }
            return ((((hashCode + i) * 31) + Arrays.hashCode(this.zzaWM)) * 31) + zzBI();
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.zzrh, com.google.android.gms.internal.zzrn
        public int zzB() {
            int zzB = super.zzB();
            if (this.zzaWy != 0) {
                zzB += zzrg.zzd(1, this.zzaWy);
            }
            if (!this.tag.equals("")) {
                zzB += zzrg.zzk(2, this.tag);
            }
            if (this.zzaWD != null && this.zzaWD.length > 0) {
                int i = zzB;
                for (int i2 = 0; i2 < this.zzaWD.length; i2++) {
                    zze zze = this.zzaWD[i2];
                    if (zze != null) {
                        i += zzrg.zzc(3, zze);
                    }
                }
                zzB = i;
            }
            if (!Arrays.equals(this.zzaWF, zzrq.zzaWo)) {
                zzB += zzrg.zzb(6, this.zzaWF);
            }
            if (this.zzaWI != null) {
                zzB += zzrg.zzc(7, this.zzaWI);
            }
            if (!Arrays.equals(this.zzaWG, zzrq.zzaWo)) {
                zzB += zzrg.zzb(8, this.zzaWG);
            }
            if (this.zzaWE != null) {
                zzB += zzrg.zzc(9, this.zzaWE);
            }
            if (this.zzaWC) {
                zzB += zzrg.zzc(10, this.zzaWC);
            }
            if (this.zzaWA != 0) {
                zzB += zzrg.zzA(11, this.zzaWA);
            }
            if (this.zzaWB != 0) {
                zzB += zzrg.zzA(12, this.zzaWB);
            }
            if (!Arrays.equals(this.zzaWH, zzrq.zzaWo)) {
                zzB += zzrg.zzb(13, this.zzaWH);
            }
            if (!this.zzaWJ.equals("")) {
                zzB += zzrg.zzk(14, this.zzaWJ);
            }
            if (this.zzaWK != 180000) {
                zzB += zzrg.zze(15, this.zzaWK);
            }
            if (this.zzaWL != null) {
                zzB += zzrg.zzc(16, this.zzaWL);
            }
            if (this.zzaWz != 0) {
                zzB += zzrg.zzd(17, this.zzaWz);
            }
            return !Arrays.equals(this.zzaWM, zzrq.zzaWo) ? zzB + zzrg.zzb(18, this.zzaWM) : zzB;
        }

        public zzd zzBZ() {
            this.zzaWy = 0;
            this.zzaWz = 0;
            this.tag = "";
            this.zzaWA = 0;
            this.zzaWB = 0;
            this.zzaWC = false;
            this.zzaWD = zze.zzCa();
            this.zzaWE = null;
            this.zzaWF = zzrq.zzaWo;
            this.zzaWG = zzrq.zzaWo;
            this.zzaWH = zzrq.zzaWo;
            this.zzaWI = null;
            this.zzaWJ = "";
            this.zzaWK = 180000;
            this.zzaWL = null;
            this.zzaWM = zzrq.zzaWo;
            this.zzaVU = null;
            this.zzaWf = -1;
            return this;
        }

        /* renamed from: zzE */
        public zzd zzb(zzrf zzrf) throws IOException {
            while (true) {
                int zzBr = zzrf.zzBr();
                switch (zzBr) {
                    case 0:
                        break;
                    case 8:
                        this.zzaWy = zzrf.zzBt();
                        break;
                    case 18:
                        this.tag = zzrf.readString();
                        break;
                    case 26:
                        int zzb = zzrq.zzb(zzrf, 26);
                        int length = this.zzaWD == null ? 0 : this.zzaWD.length;
                        zze[] zzeArr = new zze[(zzb + length)];
                        if (length != 0) {
                            System.arraycopy(this.zzaWD, 0, zzeArr, 0, length);
                        }
                        while (length < zzeArr.length - 1) {
                            zzeArr[length] = new zze();
                            zzrf.zza(zzeArr[length]);
                            zzrf.zzBr();
                            length++;
                        }
                        zzeArr[length] = new zze();
                        zzrf.zza(zzeArr[length]);
                        this.zzaWD = zzeArr;
                        break;
                    case 50:
                        this.zzaWF = zzrf.readBytes();
                        break;
                    case 58:
                        if (this.zzaWI == null) {
                            this.zzaWI = new zza();
                        }
                        zzrf.zza(this.zzaWI);
                        break;
                    case 66:
                        this.zzaWG = zzrf.readBytes();
                        break;
                    case 74:
                        if (this.zzaWE == null) {
                            this.zzaWE = new zzb();
                        }
                        zzrf.zza(this.zzaWE);
                        break;
                    case 80:
                        this.zzaWC = zzrf.zzBv();
                        break;
                    case 88:
                        this.zzaWA = zzrf.zzBu();
                        break;
                    case 96:
                        this.zzaWB = zzrf.zzBu();
                        break;
                    case 106:
                        this.zzaWH = zzrf.readBytes();
                        break;
                    case 114:
                        this.zzaWJ = zzrf.readString();
                        break;
                    case 120:
                        this.zzaWK = zzrf.zzBx();
                        break;
                    case TransportMediator.KEYCODE_MEDIA_RECORD:
                        if (this.zzaWL == null) {
                            this.zzaWL = new zzc();
                        }
                        zzrf.zza(this.zzaWL);
                        break;
                    case 136:
                        this.zzaWz = zzrf.zzBt();
                        break;
                    case 146:
                        this.zzaWM = zzrf.readBytes();
                        break;
                    default:
                        if (zza(zzrf, zzBr)) {
                            break;
                        } else {
                            break;
                        }
                }
            }
            return this;
        }

        @Override // com.google.android.gms.internal.zzrh, com.google.android.gms.internal.zzrn
        public void zza(zzrg zzrg) throws IOException {
            if (this.zzaWy != 0) {
                zzrg.zzb(1, this.zzaWy);
            }
            if (!this.tag.equals("")) {
                zzrg.zzb(2, this.tag);
            }
            if (this.zzaWD != null && this.zzaWD.length > 0) {
                for (int i = 0; i < this.zzaWD.length; i++) {
                    zze zze = this.zzaWD[i];
                    if (zze != null) {
                        zzrg.zza(3, zze);
                    }
                }
            }
            if (!Arrays.equals(this.zzaWF, zzrq.zzaWo)) {
                zzrg.zza(6, this.zzaWF);
            }
            if (this.zzaWI != null) {
                zzrg.zza(7, this.zzaWI);
            }
            if (!Arrays.equals(this.zzaWG, zzrq.zzaWo)) {
                zzrg.zza(8, this.zzaWG);
            }
            if (this.zzaWE != null) {
                zzrg.zza(9, this.zzaWE);
            }
            if (this.zzaWC) {
                zzrg.zzb(10, this.zzaWC);
            }
            if (this.zzaWA != 0) {
                zzrg.zzy(11, this.zzaWA);
            }
            if (this.zzaWB != 0) {
                zzrg.zzy(12, this.zzaWB);
            }
            if (!Arrays.equals(this.zzaWH, zzrq.zzaWo)) {
                zzrg.zza(13, this.zzaWH);
            }
            if (!this.zzaWJ.equals("")) {
                zzrg.zzb(14, this.zzaWJ);
            }
            if (this.zzaWK != 180000) {
                zzrg.zzc(15, this.zzaWK);
            }
            if (this.zzaWL != null) {
                zzrg.zza(16, this.zzaWL);
            }
            if (this.zzaWz != 0) {
                zzrg.zzb(17, this.zzaWz);
            }
            if (!Arrays.equals(this.zzaWM, zzrq.zzaWo)) {
                zzrg.zza(18, this.zzaWM);
            }
            super.zza(zzrg);
        }
    }

    public static final class zze extends zzrh<zze> {
        private static volatile zze[] zzaWN;
        public String value;
        public String zzaC;

        public zze() {
            zzCb();
        }

        public static zze[] zzCa() {
            if (zzaWN == null) {
                synchronized (zzrl.zzaWe) {
                    if (zzaWN == null) {
                        zzaWN = new zze[0];
                    }
                }
            }
            return zzaWN;
        }

        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof zze)) {
                return false;
            }
            zze zze = (zze) o;
            if (this.zzaC == null) {
                if (zze.zzaC != null) {
                    return false;
                }
            } else if (!this.zzaC.equals(zze.zzaC)) {
                return false;
            }
            if (this.value == null) {
                if (zze.value != null) {
                    return false;
                }
            } else if (!this.value.equals(zze.value)) {
                return false;
            }
            return zza(zze);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.zzaC == null ? 0 : this.zzaC.hashCode()) + 527) * 31;
            if (this.value != null) {
                i = this.value.hashCode();
            }
            return ((hashCode + i) * 31) + zzBI();
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.zzrh, com.google.android.gms.internal.zzrn
        public int zzB() {
            int zzB = super.zzB();
            if (!this.zzaC.equals("")) {
                zzB += zzrg.zzk(1, this.zzaC);
            }
            return !this.value.equals("") ? zzB + zzrg.zzk(2, this.value) : zzB;
        }

        public zze zzCb() {
            this.zzaC = "";
            this.value = "";
            this.zzaVU = null;
            this.zzaWf = -1;
            return this;
        }

        /* renamed from: zzF */
        public zze zzb(zzrf zzrf) throws IOException {
            while (true) {
                int zzBr = zzrf.zzBr();
                switch (zzBr) {
                    case 0:
                        break;
                    case 10:
                        this.zzaC = zzrf.readString();
                        break;
                    case 18:
                        this.value = zzrf.readString();
                        break;
                    default:
                        if (zza(zzrf, zzBr)) {
                            break;
                        } else {
                            break;
                        }
                }
            }
            return this;
        }

        @Override // com.google.android.gms.internal.zzrh, com.google.android.gms.internal.zzrn
        public void zza(zzrg zzrg) throws IOException {
            if (!this.zzaC.equals("")) {
                zzrg.zzb(1, this.zzaC);
            }
            if (!this.value.equals("")) {
                zzrg.zzb(2, this.value);
            }
            super.zza(zzrg);
        }
    }
}
