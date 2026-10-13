package p056g1;

import L0.i;
import P0.c;
import P0.d;
import P0.h;
import P0.p;
import Z0.e;
import androidx.compose.ui.focus.FocusTargetNode;
import p011b1.G;
import p029d1.a;
import p038e1.C2242m;
import p038e1.InterfaceC2253y;
import p038e1.Q;
import p038e1.T;
import p038e1.X;
import p047f1.j;
import p110m1.m;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {
    public static final void a(i.c cVar) {
        if (!cVar.K1()) {
            throw new IllegalStateException("autoInvalidateInsertedNode called on unattached node");
        }
        b(cVar, -1, 1);
    }

    public static final void b(i.c cVar, int i8, int i9) {
        if (!(cVar instanceof AbstractC2348l)) {
            c(cVar, i8 & cVar.F1(), i9);
            return;
        }
        AbstractC2348l abstractC2348l = (AbstractC2348l) cVar;
        c(cVar, abstractC2348l.f2() & i8, i9);
        int i10 = (~abstractC2348l.f2()) & i8;
        for (i.c cVarE2 = abstractC2348l.e2(); cVarE2 != null; cVarE2 = cVarE2.B1()) {
            b(cVarE2, i10, i9);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(i.c cVar, int i8, int i9) {
        if (i9 != 0 || cVar.I1()) {
            if ((Z.a(2) & i8) != 0 && (cVar instanceof A)) {
                D.b((A) cVar);
                if (i9 == 2) {
                    AbstractC2347k.h(cVar, Z.a(2)).D2();
                }
            }
            if ((Z.a(256) & i8) != 0 && (cVar instanceof InterfaceC2354s)) {
                AbstractC2347k.k(cVar).E0();
            }
            if ((Z.a(4) & i8) != 0 && (cVar instanceof InterfaceC2353q)) {
                r.a((InterfaceC2353q) cVar);
            }
            if ((Z.a(8) & i8) != 0 && (cVar instanceof p0)) {
                q0.b((p0) cVar);
            }
            if ((Z.a(64) & i8) != 0 && (cVar instanceof k0)) {
                l0.a((k0) cVar);
            }
            if ((Z.a(1024) & i8) != 0 && (cVar instanceof FocusTargetNode)) {
                if (i9 == 2) {
                    cVar.P1();
                } else {
                    AbstractC2347k.l(cVar).getFocusOwner().b((FocusTargetNode) cVar);
                }
            }
            if ((Z.a(2048) & i8) != 0 && (cVar instanceof h)) {
                h hVar = (h) cVar;
                if (k(hVar)) {
                    if (i9 == 2) {
                        j(hVar);
                    } else {
                        P0.i.a(hVar);
                    }
                }
            }
            if ((i8 & Z.a(4096)) == 0 || !(cVar instanceof c)) {
                return;
            }
            d.b((c) cVar);
        }
    }

    public static final void d(i.c cVar) {
        if (!cVar.K1()) {
            throw new IllegalStateException("autoInvalidateRemovedNode called on unattached node");
        }
        b(cVar, -1, 2);
    }

    public static final void e(i.c cVar) {
        if (!cVar.K1()) {
            throw new IllegalStateException("autoInvalidateUpdatedNode called on unattached node");
        }
        b(cVar, -1, 0);
    }

    public static final int f(i.b bVar) {
        int iA = Z.a(1);
        if (bVar instanceof InterfaceC2253y) {
            iA |= Z.a(2);
        }
        if (bVar instanceof O0.h) {
            iA |= Z.a(4);
        }
        if (bVar instanceof m) {
            iA |= Z.a(8);
        }
        if (bVar instanceof G) {
            iA |= Z.a(16);
        }
        if ((bVar instanceof p047f1.d) || (bVar instanceof j)) {
            iA |= Z.a(32);
        }
        if (bVar instanceof Q) {
            iA |= Z.a(256);
        }
        if (bVar instanceof X) {
            iA |= Z.a(64);
        }
        return bVar instanceof T ? Z.a(128) | iA : iA;
    }

    public static final int g(i.c cVar) {
        if (cVar.F1() != 0) {
            return cVar.F1();
        }
        int iA = Z.a(1);
        if (cVar instanceof A) {
            iA |= Z.a(2);
        }
        if (cVar instanceof InterfaceC2353q) {
            iA |= Z.a(4);
        }
        if (cVar instanceof p0) {
            iA |= Z.a(8);
        }
        if (cVar instanceof m0) {
            iA |= Z.a(16);
        }
        if (cVar instanceof p047f1.h) {
            iA |= Z.a(32);
        }
        if (cVar instanceof k0) {
            iA |= Z.a(64);
        }
        if (cVar instanceof InterfaceC2361z) {
            iA |= Z.a(128);
        }
        if (cVar instanceof InterfaceC2354s) {
            iA |= Z.a(256);
        }
        if (cVar instanceof C2242m) {
            iA |= Z.a(512);
        }
        if (cVar instanceof FocusTargetNode) {
            iA |= Z.a(1024);
        }
        if (cVar instanceof h) {
            iA |= Z.a(2048);
        }
        if (cVar instanceof c) {
            iA |= Z.a(4096);
        }
        if (cVar instanceof e) {
            iA |= Z.a(8192);
        }
        if (cVar instanceof a) {
            iA |= Z.a(16384);
        }
        if (cVar instanceof InterfaceC2344h) {
            iA |= Z.a(32768);
        }
        return cVar instanceof u0 ? Z.a(262144) | iA : iA;
    }

    public static final int h(i.c cVar) {
        if (!(cVar instanceof AbstractC2348l)) {
            return g(cVar);
        }
        AbstractC2348l abstractC2348l = (AbstractC2348l) cVar;
        int iF2 = abstractC2348l.f2();
        for (i.c cVarE2 = abstractC2348l.e2(); cVarE2 != null; cVarE2 = cVarE2.B1()) {
            iF2 |= h(cVarE2);
        }
        return iF2;
    }

    public static final boolean i(int i8) {
        return (i8 & Z.a(128)) != 0;
    }

    public static final void j(h hVar) {
        int iA = Z.a(1024);
        if (!hVar.I0().K1()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        B0.d dVar = new B0.d(new i.c[16], 0);
        i.c cVarB1 = hVar.I0().B1();
        if (cVarB1 == null) {
            AbstractC2347k.c(dVar, hVar.I0());
        } else {
            dVar.d(cVarB1);
        }
        while (dVar.v()) {
            i.c cVarG = (i.c) dVar.D(dVar.s() - 1);
            if ((cVarG.A1() & iA) == 0) {
                AbstractC2347k.c(dVar, cVarG);
            } else {
                while (cVarG != null) {
                    if ((cVarG.F1() & iA) != 0) {
                        B0.d dVar2 = null;
                        while (cVarG != null) {
                            if (cVarG instanceof FocusTargetNode) {
                                p.c((FocusTargetNode) cVarG);
                            } else if ((cVarG.F1() & iA) != 0 && (cVarG instanceof AbstractC2348l)) {
                                int i8 = 0;
                                for (i.c cVarE2 = ((AbstractC2348l) cVarG).e2(); cVarE2 != null; cVarE2 = cVarE2.B1()) {
                                    if ((cVarE2.F1() & iA) != 0) {
                                        i8++;
                                        if (i8 == 1) {
                                            cVarG = cVarE2;
                                        } else {
                                            if (dVar2 == null) {
                                                dVar2 = new B0.d(new i.c[16], 0);
                                            }
                                            if (cVarG != null) {
                                                dVar2.d(cVarG);
                                                cVarG = null;
                                            }
                                            dVar2.d(cVarE2);
                                        }
                                    }
                                }
                                if (i8 == 1) {
                                }
                            }
                            cVarG = AbstractC2347k.g(dVar2);
                        }
                        break;
                    }
                    cVarG = cVarG.B1();
                }
            }
        }
    }

    public static final boolean k(h hVar) {
        C2341e c2341e = C2341e.f23584a;
        c2341e.n();
        hVar.S(c2341e);
        return c2341e.b();
    }
}
