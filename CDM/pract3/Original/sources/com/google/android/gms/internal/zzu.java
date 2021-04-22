package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class zzu {
    protected static final Comparator<byte[]> zzaw = new Comparator<byte[]>() {
        /* class com.google.android.gms.internal.zzu.AnonymousClass1 */

        /* renamed from: zza */
        public int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    };
    private List<byte[]> zzas = new LinkedList();
    private List<byte[]> zzat = new ArrayList(64);
    private int zzau = 0;
    private final int zzav;

    public zzu(int i) {
        this.zzav = i;
    }

    private synchronized void zzy() {
        while (this.zzau > this.zzav) {
            byte[] remove = this.zzas.remove(0);
            this.zzat.remove(remove);
            this.zzau -= remove.length;
        }
    }

    public synchronized void zza(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.zzav) {
                this.zzas.add(bArr);
                int binarySearch = Collections.binarySearch(this.zzat, bArr, zzaw);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.zzat.add(binarySearch, bArr);
                this.zzau += bArr.length;
                zzy();
            }
        }
    }

    public synchronized byte[] zzb(int i) {
        byte[] bArr;
        int i2 = 0;
        while (true) {
            if (i2 >= this.zzat.size()) {
                bArr = new byte[i];
                break;
            }
            bArr = this.zzat.get(i2);
            if (bArr.length >= i) {
                this.zzau -= bArr.length;
                this.zzat.remove(i2);
                this.zzas.remove(bArr);
                break;
            }
            i2++;
        }
        return bArr;
    }
}
