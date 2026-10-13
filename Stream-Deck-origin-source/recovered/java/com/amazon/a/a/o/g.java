package com.amazon.a.a.o;

import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class g<T> implements Iterable<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakHashMap<T, Object> f16812a = new WeakHashMap<>();

    public void a(T t8) {
        this.f16812a.put(t8, null);
    }

    public void b(T t8) {
        this.f16812a.remove(t8);
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return this.f16812a.keySet().iterator();
    }

    public String toString() {
        return this.f16812a.keySet().toString();
    }

    public boolean a() {
        return this.f16812a.isEmpty();
    }

    public int b() {
        return this.f16812a.size();
    }
}
