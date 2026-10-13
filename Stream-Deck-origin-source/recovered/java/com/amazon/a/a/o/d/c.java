package com.amazon.a.a.o.d;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class c implements Iterable<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<b, a> f16811a = new HashMap();

    public <T> c a(T t8, T t9, b bVar) {
        if (!a(t8, t9)) {
            this.f16811a.put(bVar, new a(bVar, "'" + t8 + "' != '" + t9 + "'"));
        }
        return this;
    }

    @Override // java.lang.Iterable
    public Iterator<a> iterator() {
        return this.f16811a.values().iterator();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Verifier:");
        Iterator<a> it = this.f16811a.values().iterator();
        while (it.hasNext()) {
            sb.append("\n\t" + it.next());
        }
        return sb.toString();
    }

    private boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public <T extends Comparable<T>> c a(T t8, T t9, b bVar) {
        if (t8.compareTo(t9) <= 0) {
            this.f16811a.put(bVar, new a(bVar, "'" + t8 + "' <= '" + t9 + "'"));
        }
        return this;
    }

    public c a(Exception exc, b bVar) {
        this.f16811a.put(bVar, new a(bVar, "Exception: " + exc));
        return this;
    }

    public boolean a() {
        return !this.f16811a.isEmpty();
    }

    public boolean a(b bVar) {
        return this.f16811a.containsKey(bVar);
    }
}
