package s7;

/* JADX INFO: renamed from: s7.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2899f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f33281a;

    static {
        Object objB;
        try {
            C6.q.a aVar = C6.q.f1441b;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            kotlin.jvm.internal.t.f(property, "getProperty(...)");
            objB = C6.q.b(Z6.u.m(property));
        } catch (Throwable th) {
            C6.q.a aVar2 = C6.q.f1441b;
            objB = C6.q.b(C6.r.a(th));
        }
        if (C6.q.g(objB)) {
            objB = null;
        }
        Integer num = (Integer) objB;
        f33281a = num != null ? num.intValue() : 2097152;
    }
}
