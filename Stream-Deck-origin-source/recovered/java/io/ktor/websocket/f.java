package io.ktor.websocket;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f {
    public static final a a(e.b bVar) {
        kotlin.jvm.internal.t.g(bVar, "<this>");
        if (bVar.c().length < 2) {
            return null;
        }
        p205x6.j jVar = new p205x6.j(null, 1, null);
        try {
            p205x6.u.d(jVar, bVar.c(), 0, 0, 6, null);
            p205x6.k kVarM1 = jVar.M1();
            return new a(p205x6.q.e(kVarM1), p205x6.n.X1(kVarM1, 0, 0, 3, null));
        } catch (Throwable th) {
            jVar.T0();
            throw th;
        }
    }
}
