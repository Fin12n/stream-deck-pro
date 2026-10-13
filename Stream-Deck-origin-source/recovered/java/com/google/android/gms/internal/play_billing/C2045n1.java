package com.google.android.gms.internal.play_billing;

import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.n1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2045n1 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparable f18991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f18992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC2067t1 f18993c;

    public C2045n1(AbstractC2067t1 abstractC2067t1, Comparable comparable, Object obj) {
        this.f18993c = abstractC2067t1;
        this.f18991a = comparable;
        this.f18992b = obj;
    }

    public static final boolean b(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public final Comparable a() {
        return this.f18991a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f18991a.compareTo(((C2045n1) obj).f18991a);
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
        return b(this.f18991a, entry.getKey()) && b(this.f18992b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f18991a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f18992b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f18991a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f18992b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f18993c.n();
        Object obj2 = this.f18992b;
        this.f18992b = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.f18991a) + com.amazon.a.a.o.b.f.f16778b + String.valueOf(this.f18992b);
    }
}
