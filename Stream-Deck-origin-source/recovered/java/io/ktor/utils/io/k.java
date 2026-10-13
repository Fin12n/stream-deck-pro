package io.ktor.utils.io;

import C6.G;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class k {
    public static final boolean a(j jVar) {
        kotlin.jvm.internal.t.g(jVar, "<this>");
        return jVar.d(null);
    }

    public static final Object b(j jVar, byte[] bArr, G6.d dVar) {
        Object objL = jVar.l(bArr, 0, bArr.length, dVar);
        return objL == H6.c.f() ? objL : G.f1419a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object c(j jVar, String str, G6.d dVar) {
        p205x6.j jVar2 = new p205x6.j(null, 1, 0 == true ? 1 : 0);
        try {
            p205x6.y.i(jVar2, str, 0, 0, null, 14, null);
            Object objK = jVar.K(jVar2.M1(), dVar);
            return objK == H6.c.f() ? objK : G.f1419a;
        } catch (Throwable th) {
            jVar2.T0();
            throw th;
        }
    }
}
