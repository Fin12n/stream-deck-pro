package q7;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: q7.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2871x implements J0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q6.k f32159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f32160b;

    public C2871x(Q6.k compute) {
        kotlin.jvm.internal.t.g(compute, "compute");
        this.f32159a = compute;
        this.f32160b = new ConcurrentHashMap();
    }

    @Override // q7.J0
    public p116m7.b a(X6.d key) {
        Object objPutIfAbsent;
        kotlin.jvm.internal.t.g(key, "key");
        ConcurrentHashMap concurrentHashMap = this.f32160b;
        Class clsA = P6.a.a(key);
        Object c2850m = concurrentHashMap.get(clsA);
        if (c2850m == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsA, (c2850m = new C2850m((p116m7.b) this.f32159a.invoke(key))))) != null) {
            c2850m = objPutIfAbsent;
        }
        return ((C2850m) c2850m).f32125a;
    }
}
