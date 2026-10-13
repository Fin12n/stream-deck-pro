package p017b7;

import C6.G;
import C6.m;
import G6.d;
import G6.e;
import G6.g;
import H6.b;
import H6.c;
import I6.h;
import p008a7.a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class U {
    public static final Object a(long j8, d dVar) {
        if (j8 <= 0) {
            return G.f1419a;
        }
        C1797m c1797m = new C1797m(b.c(dVar), 1);
        c1797m.z();
        if (j8 < Long.MAX_VALUE) {
            c(c1797m.getContext()).w0(j8, c1797m);
        }
        Object objS = c1797m.s();
        if (objS == c.f()) {
            h.c(dVar);
        }
        return objS == c.f() ? objS : G.f1419a;
    }

    public static final Object b(long j8, d dVar) {
        Object objA = a(d(j8), dVar);
        return objA == c.f() ? objA : G.f1419a;
    }

    public static final T c(g gVar) {
        g.b bVarA = gVar.A(e.f2817J);
        T t8 = bVarA instanceof T ? (T) bVarA : null;
        return t8 == null ? P.a() : t8;
    }

    public static final long d(long j8) {
        boolean zN = a.N(j8);
        if (zN) {
            return a.z(a.O(j8, p008a7.c.t(999999L, p008a7.d.NANOSECONDS)));
        }
        if (zN) {
            throw new m();
        }
        return 0L;
    }
}
