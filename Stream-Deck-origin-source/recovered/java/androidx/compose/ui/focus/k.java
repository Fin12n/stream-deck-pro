package androidx.compose.ui.focus;

import A1.t;
import p038e1.AbstractC2248t;
import p056g1.AbstractC2347k;
import p056g1.AbstractC2348l;
import p056g1.F;
import p056g1.X;
import p056g1.Z;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14631a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f14632b;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f14631a = iArr;
            int[] iArr2 = new int[P0.m.values().length];
            try {
                iArr2[P0.m.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[P0.m.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[P0.m.f8855c.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[P0.m.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            f14632b = iArr2;
        }
    }

    public static final g a(FocusTargetNode focusTargetNode, int i8, t tVar) {
        g gVarJ;
        g gVar;
        g gVarC;
        e eVarI2 = focusTargetNode.i2();
        c.a aVar = c.f14597b;
        if (c.l(i8, aVar.e())) {
            return eVarI2.h();
        }
        if (c.l(i8, aVar.f())) {
            return eVarI2.f();
        }
        if (c.l(i8, aVar.h())) {
            return eVarI2.g();
        }
        if (c.l(i8, aVar.a())) {
            return eVarI2.k();
        }
        if (c.l(i8, aVar.d())) {
            int i9 = a.f14631a[tVar.ordinal()];
            if (i9 == 1) {
                gVarC = eVarI2.c();
            } else {
                if (i9 != 2) {
                    throw new C6.m();
                }
                gVarC = eVarI2.j();
            }
            gVar = gVarC != g.f14622b.b() ? gVarC : null;
            return gVar == null ? eVarI2.a() : gVar;
        }
        if (!c.l(i8, aVar.g())) {
            if (c.l(i8, aVar.b())) {
                return (g) eVarI2.m().invoke(c.i(i8));
            }
            if (c.l(i8, aVar.c())) {
                return (g) eVarI2.i().invoke(c.i(i8));
            }
            throw new IllegalStateException("invalid FocusDirection");
        }
        int i10 = a.f14631a[tVar.ordinal()];
        if (i10 == 1) {
            gVarJ = eVarI2.j();
        } else {
            if (i10 != 2) {
                throw new C6.m();
            }
            gVarJ = eVarI2.c();
        }
        gVar = gVarJ != g.f14622b.b() ? gVarJ : null;
        return gVar == null ? eVarI2.d() : gVar;
    }

    public static final FocusTargetNode b(FocusTargetNode focusTargetNode) {
        int i8 = a.f14632b[focusTargetNode.k2().ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                int iA = Z.a(1024);
                if (!focusTargetNode.I0().K1()) {
                    throw new IllegalStateException("visitChildren called on an unattached node");
                }
                B0.d dVar = new B0.d(new L0.i.c[16], 0);
                L0.i.c cVarB1 = focusTargetNode.I0().B1();
                if (cVarB1 == null) {
                    AbstractC2347k.c(dVar, focusTargetNode.I0());
                } else {
                    dVar.d(cVarB1);
                }
                while (dVar.v()) {
                    L0.i.c cVarG = (L0.i.c) dVar.D(dVar.s() - 1);
                    if ((cVarG.A1() & iA) == 0) {
                        AbstractC2347k.c(dVar, cVarG);
                    } else {
                        while (cVarG != null) {
                            if ((cVarG.F1() & iA) != 0) {
                                B0.d dVar2 = null;
                                while (cVarG != null) {
                                    if (cVarG instanceof FocusTargetNode) {
                                        FocusTargetNode focusTargetNodeB = b((FocusTargetNode) cVarG);
                                        if (focusTargetNodeB != null) {
                                            return focusTargetNodeB;
                                        }
                                    } else if ((cVarG.F1() & iA) != 0 && (cVarG instanceof AbstractC2348l)) {
                                        int i9 = 0;
                                        for (L0.i.c cVarE2 = ((AbstractC2348l) cVarG).e2(); cVarE2 != null; cVarE2 = cVarE2.B1()) {
                                            if ((cVarE2.F1() & iA) != 0) {
                                                i9++;
                                                if (i9 == 1) {
                                                    cVarG = cVarE2;
                                                } else {
                                                    if (dVar2 == null) {
                                                        dVar2 = new B0.d(new L0.i.c[16], 0);
                                                    }
                                                    if (cVarG != null) {
                                                        dVar2.d(cVarG);
                                                        cVarG = null;
                                                    }
                                                    dVar2.d(cVarE2);
                                                }
                                            }
                                        }
                                        if (i9 == 1) {
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
                return null;
            }
            if (i8 != 3) {
                if (i8 == 4) {
                    return null;
                }
                throw new C6.m();
            }
        }
        return focusTargetNode;
    }

    public static final FocusTargetNode c(FocusTargetNode focusTargetNode) {
        androidx.compose.ui.node.a aVarJ0;
        int iA = Z.a(1024);
        if (!focusTargetNode.I0().K1()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        L0.i.c cVarH1 = focusTargetNode.I0().H1();
        F fK = AbstractC2347k.k(focusTargetNode);
        while (fK != null) {
            if ((fK.j0().k().A1() & iA) != 0) {
                while (cVarH1 != null) {
                    if ((cVarH1.F1() & iA) != 0) {
                        L0.i.c cVarG = cVarH1;
                        B0.d dVar = null;
                        while (cVarG != null) {
                            if (cVarG instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarG;
                                if (focusTargetNode2.i2().e()) {
                                    return focusTargetNode2;
                                }
                            } else if ((cVarG.F1() & iA) != 0 && (cVarG instanceof AbstractC2348l)) {
                                int i8 = 0;
                                for (L0.i.c cVarE2 = ((AbstractC2348l) cVarG).e2(); cVarE2 != null; cVarE2 = cVarE2.B1()) {
                                    if ((cVarE2.F1() & iA) != 0) {
                                        i8++;
                                        if (i8 == 1) {
                                            cVarG = cVarE2;
                                        } else {
                                            if (dVar == null) {
                                                dVar = new B0.d(new L0.i.c[16], 0);
                                            }
                                            if (cVarG != null) {
                                                dVar.d(cVarG);
                                                cVarG = null;
                                            }
                                            dVar.d(cVarE2);
                                        }
                                    }
                                }
                                if (i8 == 1) {
                                }
                            }
                            cVarG = AbstractC2347k.g(dVar);
                        }
                    }
                    cVarH1 = cVarH1.H1();
                }
            }
            fK = fK.m0();
            cVarH1 = (fK == null || (aVarJ0 = fK.j0()) == null) ? null : aVarJ0.p();
        }
        return null;
    }

    public static final Q0.h d(FocusTargetNode focusTargetNode) {
        Q0.h hVarO;
        X xC1 = focusTargetNode.C1();
        return (xC1 == null || (hVarO = AbstractC2248t.d(xC1).O(xC1, false)) == null) ? Q0.h.f9087e.a() : hVarO;
    }

    public static final boolean e(FocusTargetNode focusTargetNode, int i8, t tVar, Q6.k kVar) {
        int iG;
        Boolean boolT;
        c.a aVar = c.f14597b;
        if (c.l(i8, aVar.e()) ? true : c.l(i8, aVar.f())) {
            return l.f(focusTargetNode, i8, kVar);
        }
        if (c.l(i8, aVar.d()) ? true : c.l(i8, aVar.g()) ? true : c.l(i8, aVar.h()) ? true : c.l(i8, aVar.a())) {
            Boolean boolT2 = m.t(focusTargetNode, i8, kVar);
            if (boolT2 != null) {
                return boolT2.booleanValue();
            }
            return false;
        }
        if (c.l(i8, aVar.b())) {
            int i9 = a.f14631a[tVar.ordinal()];
            if (i9 == 1) {
                iG = aVar.g();
            } else {
                if (i9 != 2) {
                    throw new C6.m();
                }
                iG = aVar.d();
            }
            FocusTargetNode focusTargetNodeB = b(focusTargetNode);
            if (focusTargetNodeB == null || (boolT = m.t(focusTargetNodeB, iG, kVar)) == null) {
                return false;
            }
            return boolT.booleanValue();
        }
        if (!c.l(i8, aVar.c())) {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) c.n(i8))).toString());
        }
        FocusTargetNode focusTargetNodeB2 = b(focusTargetNode);
        FocusTargetNode focusTargetNodeC = focusTargetNodeB2 != null ? c(focusTargetNodeB2) : null;
        if (focusTargetNodeC == null || kotlin.jvm.internal.t.c(focusTargetNodeC, focusTargetNode)) {
            return false;
        }
        return ((Boolean) kVar.invoke(focusTargetNodeC)).booleanValue();
    }

    public static final FocusTargetNode f(FocusTargetNode focusTargetNode) {
        if (!focusTargetNode.I0().K1()) {
            return null;
        }
        int iA = Z.a(1024);
        if (!focusTargetNode.I0().K1()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        B0.d dVar = new B0.d(new L0.i.c[16], 0);
        L0.i.c cVarB1 = focusTargetNode.I0().B1();
        if (cVarB1 == null) {
            AbstractC2347k.c(dVar, focusTargetNode.I0());
        } else {
            dVar.d(cVarB1);
        }
        while (dVar.v()) {
            L0.i.c cVarG = (L0.i.c) dVar.D(dVar.s() - 1);
            if ((cVarG.A1() & iA) == 0) {
                AbstractC2347k.c(dVar, cVarG);
            } else {
                while (cVarG != null) {
                    if ((cVarG.F1() & iA) != 0) {
                        B0.d dVar2 = null;
                        while (cVarG != null) {
                            if (cVarG instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarG;
                                if (focusTargetNode2.I0().K1()) {
                                    int i8 = a.f14632b[focusTargetNode2.k2().ordinal()];
                                    if (i8 == 1 || i8 == 2 || i8 == 3) {
                                        return focusTargetNode2;
                                    }
                                }
                            } else if ((cVarG.F1() & iA) != 0 && (cVarG instanceof AbstractC2348l)) {
                                int i9 = 0;
                                for (L0.i.c cVarE2 = ((AbstractC2348l) cVarG).e2(); cVarE2 != null; cVarE2 = cVarE2.B1()) {
                                    if ((cVarE2.F1() & iA) != 0) {
                                        i9++;
                                        if (i9 == 1) {
                                            cVarG = cVarE2;
                                        } else {
                                            if (dVar2 == null) {
                                                dVar2 = new B0.d(new L0.i.c[16], 0);
                                            }
                                            if (cVarG != null) {
                                                dVar2.d(cVarG);
                                                cVarG = null;
                                            }
                                            dVar2.d(cVarE2);
                                        }
                                    }
                                }
                                if (i9 == 1) {
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
        return null;
    }

    public static final boolean g(FocusTargetNode focusTargetNode) {
        F fH1;
        X xC1;
        F fH2;
        X xC2 = focusTargetNode.C1();
        return (xC2 == null || (fH1 = xC2.h1()) == null || !fH1.f() || (xC1 = focusTargetNode.C1()) == null || (fH2 = xC1.h1()) == null || !fH2.I0()) ? false : true;
    }
}
