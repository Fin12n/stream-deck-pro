package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class E extends F {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final T f19122f;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b implements Map.Entry {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Map.Entry f19123a;

        public E a() {
            return (E) this.f19123a.getValue();
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f19123a.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            E e8 = (E) this.f19123a.getValue();
            if (e8 == null) {
                return null;
            }
            return e8.g();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof T) {
                return ((E) this.f19123a.getValue()).e((T) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        public b(Map.Entry entry) {
            this.f19123a = entry;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class c implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Iterator f19124a;

        public c(Iterator<Map.Entry<Object, Object>> it) {
            this.f19124a = it;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            Map.Entry entry = (Map.Entry) this.f19124a.next();
            return entry.getValue() instanceof E ? new b(entry) : entry;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f19124a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f19124a.remove();
        }
    }

    public E(T t8, C2106q c2106q, AbstractC2097h abstractC2097h) {
        super(c2106q, abstractC2097h);
        this.f19122f = t8;
    }

    @Override // com.google.protobuf.F
    public boolean equals(Object obj) {
        return g().equals(obj);
    }

    public T g() {
        return d(this.f19122f);
    }

    @Override // com.google.protobuf.F
    public int hashCode() {
        return g().hashCode();
    }

    public String toString() {
        return g().toString();
    }
}
