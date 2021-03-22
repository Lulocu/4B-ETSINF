package com.google.android.gms.internal;

import java.io.IOException;

public final class zzrd extends zzrh<zzrd> {
    public String[] zzaVE;
    public int[] zzaVF;
    public byte[][] zzaVG;

    public zzrd() {
        zzBq();
    }

    public static zzrd zzx(byte[] bArr) throws zzrm {
        return (zzrd) zzrn.zza(new zzrd(), bArr);
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof zzrd)) {
            return false;
        }
        zzrd zzrd = (zzrd) o;
        if (!zzrl.equals(this.zzaVE, zzrd.zzaVE) || !zzrl.equals(this.zzaVF, zzrd.zzaVF) || !zzrl.zza(this.zzaVG, zzrd.zzaVG)) {
            return false;
        }
        return zza(zzrd);
    }

    public int hashCode() {
        return ((((((zzrl.hashCode(this.zzaVE) + 527) * 31) + zzrl.hashCode(this.zzaVF)) * 31) + zzrl.zza(this.zzaVG)) * 31) + zzBI();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.zzrh, com.google.android.gms.internal.zzrn
    public int zzB() {
        int i;
        int zzB = super.zzB();
        if (this.zzaVE == null || this.zzaVE.length <= 0) {
            i = zzB;
        } else {
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < this.zzaVE.length; i4++) {
                String str = this.zzaVE[i4];
                if (str != null) {
                    i3++;
                    i2 += zzrg.zzfj(str);
                }
            }
            i = zzB + i2 + (i3 * 1);
        }
        if (this.zzaVF != null && this.zzaVF.length > 0) {
            int i5 = 0;
            for (int i6 = 0; i6 < this.zzaVF.length; i6++) {
                i5 += zzrg.zzkJ(this.zzaVF[i6]);
            }
            i = i + i5 + (this.zzaVF.length * 1);
        }
        if (this.zzaVG == null || this.zzaVG.length <= 0) {
            return i;
        }
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < this.zzaVG.length; i9++) {
            byte[] bArr = this.zzaVG[i9];
            if (bArr != null) {
                i8++;
                i7 += zzrg.zzC(bArr);
            }
        }
        return i + i7 + (i8 * 1);
    }

    public zzrd zzBq() {
        this.zzaVE = zzrq.zzaWm;
        this.zzaVF = zzrq.zzaWh;
        this.zzaVG = zzrq.zzaWn;
        this.zzaVU = null;
        this.zzaWf = -1;
        return this;
    }

    @Override // com.google.android.gms.internal.zzrh, com.google.android.gms.internal.zzrn
    public void zza(zzrg zzrg) throws IOException {
        if (this.zzaVE != null && this.zzaVE.length > 0) {
            for (int i = 0; i < this.zzaVE.length; i++) {
                String str = this.zzaVE[i];
                if (str != null) {
                    zzrg.zzb(1, str);
                }
            }
        }
        if (this.zzaVF != null && this.zzaVF.length > 0) {
            for (int i2 = 0; i2 < this.zzaVF.length; i2++) {
                zzrg.zzy(2, this.zzaVF[i2]);
            }
        }
        if (this.zzaVG != null && this.zzaVG.length > 0) {
            for (int i3 = 0; i3 < this.zzaVG.length; i3++) {
                byte[] bArr = this.zzaVG[i3];
                if (bArr != null) {
                    zzrg.zza(3, bArr);
                }
            }
        }
        super.zza(zzrg);
    }

    /* renamed from: zzz */
    public zzrd zzb(zzrf zzrf) throws IOException {
        while (true) {
            int zzBr = zzrf.zzBr();
            switch (zzBr) {
                case 0:
                    break;
                case 10:
                    int zzb = zzrq.zzb(zzrf, 10);
                    int length = this.zzaVE == null ? 0 : this.zzaVE.length;
                    String[] strArr = new String[(zzb + length)];
                    if (length != 0) {
                        System.arraycopy(this.zzaVE, 0, strArr, 0, length);
                    }
                    while (length < strArr.length - 1) {
                        strArr[length] = zzrf.readString();
                        zzrf.zzBr();
                        length++;
                    }
                    strArr[length] = zzrf.readString();
                    this.zzaVE = strArr;
                    break;
                case 16:
                    int zzb2 = zzrq.zzb(zzrf, 16);
                    int length2 = this.zzaVF == null ? 0 : this.zzaVF.length;
                    int[] iArr = new int[(zzb2 + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.zzaVF, 0, iArr, 0, length2);
                    }
                    while (length2 < iArr.length - 1) {
                        iArr[length2] = zzrf.zzBu();
                        zzrf.zzBr();
                        length2++;
                    }
                    iArr[length2] = zzrf.zzBu();
                    this.zzaVF = iArr;
                    break;
                case 18:
                    int zzkC = zzrf.zzkC(zzrf.zzBy());
                    int position = zzrf.getPosition();
                    int i = 0;
                    while (zzrf.zzBD() > 0) {
                        zzrf.zzBu();
                        i++;
                    }
                    zzrf.zzkE(position);
                    int length3 = this.zzaVF == null ? 0 : this.zzaVF.length;
                    int[] iArr2 = new int[(i + length3)];
                    if (length3 != 0) {
                        System.arraycopy(this.zzaVF, 0, iArr2, 0, length3);
                    }
                    while (length3 < iArr2.length) {
                        iArr2[length3] = zzrf.zzBu();
                        length3++;
                    }
                    this.zzaVF = iArr2;
                    zzrf.zzkD(zzkC);
                    break;
                case 26:
                    int zzb3 = zzrq.zzb(zzrf, 26);
                    int length4 = this.zzaVG == null ? 0 : this.zzaVG.length;
                    byte[][] bArr = new byte[(zzb3 + length4)][];
                    if (length4 != 0) {
                        System.arraycopy(this.zzaVG, 0, bArr, 0, length4);
                    }
                    while (length4 < bArr.length - 1) {
                        bArr[length4] = zzrf.readBytes();
                        zzrf.zzBr();
                        length4++;
                    }
                    bArr[length4] = zzrf.readBytes();
                    this.zzaVG = bArr;
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
}
