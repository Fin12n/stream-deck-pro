package N4;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: N4.l0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1207l0 implements Map, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient AbstractC1219m0 f7192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient AbstractC1219m0 f7193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient AbstractC1123e0 f7194c;

    public static AbstractC1207l0 c(Object obj, Object obj2) {
        N.b("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return D0.g(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    }

    public abstract AbstractC1123e0 a();

    @Override // java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC1123e0 values() {
        AbstractC1123e0 abstractC1123e0 = this.f7194c;
        if (abstractC1123e0 != null) {
            return abstractC1123e0;
        }
        AbstractC1123e0 abstractC1123e0A = a();
        this.f7194c = abstractC1123e0A;
        return abstractC1123e0A;
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

    public abstract AbstractC1219m0 d();

    public abstract AbstractC1219m0 e();

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
    public final AbstractC1219m0 entrySet() {
        AbstractC1219m0 abstractC1219m0 = this.f7192a;
        if (abstractC1219m0 != null) {
            return abstractC1219m0;
        }
        AbstractC1219m0 abstractC1219m0D = d();
        this.f7192a = abstractC1219m0D;
        return abstractC1219m0D;
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
        return F0.a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        AbstractC1219m0 abstractC1219m0 = this.f7193b;
        if (abstractC1219m0 != null) {
            return abstractC1219m0;
        }
        AbstractC1219m0 abstractC1219m0E = e();
        this.f7193b = abstractC1219m0E;
        return abstractC1219m0E;
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
        N.a(size, "size");
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
