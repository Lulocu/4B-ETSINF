package com.google.android.gms.internal;

import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class zzoa extends zznq<zzoa> {
    private ProductAction zzIC;
    private final Map<String, List<Product>> zzID = new HashMap();
    private final List<Promotion> zzIE = new ArrayList();
    private final List<Product> zzIF = new ArrayList();

    public String toString() {
        HashMap hashMap = new HashMap();
        if (!this.zzIF.isEmpty()) {
            hashMap.put("products", this.zzIF);
        }
        if (!this.zzIE.isEmpty()) {
            hashMap.put("promotions", this.zzIE);
        }
        if (!this.zzID.isEmpty()) {
            hashMap.put("impressions", this.zzID);
        }
        hashMap.put("productAction", this.zzIC);
        return zzy(hashMap);
    }

    public void zza(Product product, String str) {
        if (product != null) {
            if (str == null) {
                str = "";
            }
            if (!this.zzID.containsKey(str)) {
                this.zzID.put(str, new ArrayList());
            }
            this.zzID.get(str).add(product);
        }
    }

    public void zza(zzoa zzoa) {
        zzoa.zzIF.addAll(this.zzIF);
        zzoa.zzIE.addAll(this.zzIE);
        for (Map.Entry<String, List<Product>> entry : this.zzID.entrySet()) {
            String key = entry.getKey();
            for (Product product : entry.getValue()) {
                zzoa.zza(product, key);
            }
        }
        if (this.zzIC != null) {
            zzoa.zzIC = this.zzIC;
        }
    }

    public ProductAction zzwu() {
        return this.zzIC;
    }

    public List<Product> zzwv() {
        return Collections.unmodifiableList(this.zzIF);
    }

    public Map<String, List<Product>> zzww() {
        return this.zzID;
    }

    public List<Promotion> zzwx() {
        return Collections.unmodifiableList(this.zzIE);
    }
}
