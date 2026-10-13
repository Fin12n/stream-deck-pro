package s7;

import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: s7.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2912t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f33304a = AbstractC2911s.a(16);

    /* JADX INFO: renamed from: s7.t$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
    }

    public final Object a(o7.f descriptor, a key) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        kotlin.jvm.internal.t.g(key, "key");
        Map map = (Map) this.f33304a.get(descriptor);
        Object obj = map != null ? map.get(key) : null;
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public final Object b(o7.f descriptor, a key, Function0 defaultValue) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        kotlin.jvm.internal.t.g(key, "key");
        kotlin.jvm.internal.t.g(defaultValue, "defaultValue");
        Object objA = a(descriptor, key);
        if (objA != null) {
            return objA;
        }
        Object objInvoke = defaultValue.invoke();
        c(descriptor, key, objInvoke);
        return objInvoke;
    }

    public final void c(o7.f descriptor, a key, Object value) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        kotlin.jvm.internal.t.g(key, "key");
        kotlin.jvm.internal.t.g(value, "value");
        Map map = this.f33304a;
        Object objA = map.get(descriptor);
        if (objA == null) {
            objA = AbstractC2911s.a(2);
            map.put(descriptor, objA);
        }
        ((Map) objA).put(key, value);
    }
}
