package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2039m implements Map, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient AbstractC2043n f18982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient AbstractC2043n f18983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient AbstractC2015g f18984c;

    public static AbstractC2039m c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        AbstractC2007e.a("com.android.vending.billing.PURCHASES_UPDATED", obj2);
        AbstractC2007e.a("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", obj4);
        AbstractC2007e.a("com.android.vending.billing.ALTERNATIVE_BILLING", obj6);
        return C2068u.g(3, new Object[]{"com.android.vending.billing.PURCHASES_UPDATED", obj2, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", obj4, "com.android.vending.billing.ALTERNATIVE_BILLING", obj6}, null);
    }

    public abstract AbstractC2015g a();

    @Override // java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC2015g values() {
        AbstractC2015g abstractC2015g = this.f18984c;
        if (abstractC2015g != null) {
            return abstractC2015g;
        }
        AbstractC2015g abstractC2015gA = a();
        this.f18984c = abstractC2015gA;
        return abstractC2015gA;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public abstract AbstractC2043n d();

    public abstract AbstractC2043n e();

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final AbstractC2043n entrySet() {
        AbstractC2043n abstractC2043n = this.f18982a;
        if (abstractC2043n != null) {
            return abstractC2043n;
        }
        AbstractC2043n abstractC2043nD = d();
        this.f18982a = abstractC2043nD;
        return abstractC2043nD;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return AbstractC2071v.a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        AbstractC2043n abstractC2043n = this.f18983b;
        if (abstractC2043n != null) {
            return abstractC2043n;
        }
        AbstractC2043n abstractC2043nE = e();
        this.f18983b = abstractC2043nE;
        return abstractC2043nE;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        if (size < 0) {
            throw new IllegalArgumentException("size cannot be negative but was: " + size);
        }
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb.append('{');
        boolean z8 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z8) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z8 = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
