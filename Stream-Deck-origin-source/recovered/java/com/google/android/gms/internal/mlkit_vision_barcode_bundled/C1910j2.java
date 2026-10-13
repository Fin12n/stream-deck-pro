package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.j2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1910j2 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparable f18585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f18586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC1940p2 f18587c;

    public C1910j2(AbstractC1940p2 abstractC1940p2, Comparable comparable, Object obj) {
        this.f18587c = abstractC1940p2;
        this.f18585a = comparable;
        this.f18586b = obj;
    }

    public static final boolean b(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public final Comparable a() {
        return this.f18585a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f18585a.compareTo(((C1910j2) obj).f18585a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return b(this.f18585a, entry.getKey()) && b(this.f18586b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f18585a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f18586b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f18585a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f18586b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f18587c.o();
        Object obj2 = this.f18586b;
        this.f18586b = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.f18585a) + com.amazon.a.a.o.b.f.f16778b + String.valueOf(this.f18586b);
    }
}
