package p115m6;

import Q6.k;
import R6.e;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p043e6.dT.GIGvBf;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements Map, e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f30077a = new LinkedHashMap();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f30078a = new a();

        public a() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Map.Entry invoke(Map.Entry $receiver) {
            t.g($receiver, "$this$$receiver");
            return new t(((j) $receiver.getKey()).a(), $receiver.getValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f30079a = new b();

        public b() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Map.Entry invoke(Map.Entry $receiver) {
            t.g($receiver, "$this$$receiver");
            return new t(G.a((String) $receiver.getKey()), $receiver.getValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f30080a = new c();

        public c() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke(j $receiver) {
            t.g($receiver, "$this$$receiver");
            return $receiver.a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f30081a = new d();

        public d() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final j invoke(String $receiver) {
            t.g($receiver, "$this$$receiver");
            return G.a($receiver);
        }
    }

    public Object b(String key) {
        t.g(key, "key");
        return this.f30077a.get(G.a(key));
    }

    public Set c() {
        return new s(this.f30077a.entrySet(), a.f30078a, b.f30079a);
    }

    @Override // java.util.Map
    public void clear() {
        this.f30077a.clear();
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return a((String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.f30077a.containsValue(obj);
    }

    public Set d() {
        return new s(this.f30077a.keySet(), c.f30080a, d.f30081a);
    }

    public int e() {
        return this.f30077a.size();
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return c();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof i)) {
            return false;
        }
        return t.c(((i) obj).f30077a, this.f30077a);
    }

    public Collection f() {
        return this.f30077a.values();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Object put(String key, Object value) {
        t.g(key, "key");
        t.g(value, "value");
        return this.f30077a.put(G.a(key), value);
    }

    @Override // java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof String) {
            return b((String) obj);
        }
        return null;
    }

    public Object h(String key) {
        t.g(key, "key");
        return this.f30077a.remove(G.a(key));
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f30077a.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f30077a.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return d();
    }

    @Override // java.util.Map
    public void putAll(Map from) {
        t.g(from, "from");
        for (Map.Entry entry : from.entrySet()) {
            put((String) entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof String) {
            return h((String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return e();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return f();
    }

    public boolean a(String str) {
        t.g(str, GIGvBf.gfsAgYl);
        return this.f30077a.containsKey(new j(str));
    }
}
