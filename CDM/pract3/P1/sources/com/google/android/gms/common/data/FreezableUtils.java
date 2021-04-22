package com.google.android.gms.common.data;

import java.util.ArrayList;

public final class FreezableUtils {
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.ArrayList<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(ArrayList<E> list) {
        ArrayList<T> arrayList = (ArrayList<T>) new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(list.get(i).freeze());
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.ArrayList<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(E[] array) {
        ArrayList<T> arrayList = (ArrayList<T>) new ArrayList(array.length);
        for (E e : array) {
            arrayList.add(e.freeze());
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.ArrayList<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(Iterable<E> iterable) {
        ArrayList<T> arrayList = (ArrayList<T>) new ArrayList();
        for (E e : iterable) {
            arrayList.add(e.freeze());
        }
        return arrayList;
    }
}
