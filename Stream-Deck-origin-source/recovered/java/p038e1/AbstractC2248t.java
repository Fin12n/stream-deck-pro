package p038e1;

import A1.r;
import F6.b;
import Q0.f;
import Q0.g;
import Q0.h;
import W6.n;
import p056g1.X;

/* JADX INFO: renamed from: e1.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2248t {
    public static final h a(InterfaceC2247s interfaceC2247s) {
        h hVarT;
        InterfaceC2247s interfaceC2247sN = interfaceC2247s.N();
        return (interfaceC2247sN == null || (hVarT = InterfaceC2247s.t(interfaceC2247sN, interfaceC2247s, false, 2, null)) == null) ? new h(0.0f, 0.0f, r.g(interfaceC2247s.a()), r.f(interfaceC2247s.a())) : hVarT;
    }

    public static final h b(InterfaceC2247s interfaceC2247s) {
        return InterfaceC2247s.t(d(interfaceC2247s), interfaceC2247s, false, 2, null);
    }

    public static final h c(InterfaceC2247s interfaceC2247s) {
        InterfaceC2247s interfaceC2247sD = d(interfaceC2247s);
        h hVarB = b(interfaceC2247s);
        float fG = r.g(interfaceC2247sD.a());
        float f8 = r.f(interfaceC2247sD.a());
        float fJ = n.j(hVarB.i(), 0.0f, fG);
        float fJ2 = n.j(hVarB.l(), 0.0f, f8);
        float fJ3 = n.j(hVarB.j(), 0.0f, fG);
        float fJ4 = n.j(hVarB.e(), 0.0f, f8);
        if (fJ == fJ3 || fJ2 == fJ4) {
            return h.f9087e.a();
        }
        long jN = interfaceC2247sD.n(g.a(fJ, fJ2));
        long jN2 = interfaceC2247sD.n(g.a(fJ3, fJ2));
        long jN3 = interfaceC2247sD.n(g.a(fJ3, fJ4));
        long jN4 = interfaceC2247sD.n(g.a(fJ, fJ4));
        return new h(b.f(f.o(jN), f.o(jN2), f.o(jN4), f.o(jN3)), b.f(f.p(jN), f.p(jN2), f.p(jN4), f.p(jN3)), b.d(f.o(jN), f.o(jN2), f.o(jN4), f.o(jN3)), b.d(f.p(jN), f.p(jN2), f.p(jN4), f.p(jN3)));
    }

    public static final InterfaceC2247s d(InterfaceC2247s interfaceC2247s) {
        InterfaceC2247s interfaceC2247s2;
        InterfaceC2247s interfaceC2247sN = interfaceC2247s.N();
        while (true) {
            InterfaceC2247s interfaceC2247s3 = interfaceC2247sN;
            interfaceC2247s2 = interfaceC2247s;
            interfaceC2247s = interfaceC2247s3;
            if (interfaceC2247s == null) {
                break;
            }
            interfaceC2247sN = interfaceC2247s.N();
        }
        X x8 = interfaceC2247s2 instanceof X ? (X) interfaceC2247s2 : null;
        if (x8 == null) {
            return interfaceC2247s2;
        }
        X xK2 = x8.k2();
        while (true) {
            X x9 = xK2;
            X x10 = x8;
            x8 = x9;
            if (x8 == null) {
                return x10;
            }
            xK2 = x8.k2();
        }
    }

    public static final long e(InterfaceC2247s interfaceC2247s) {
        return interfaceC2247s.S(f.f9082b.c());
    }

    public static final long f(InterfaceC2247s interfaceC2247s) {
        return interfaceC2247s.n(f.f9082b.c());
    }
}
