package androidx.compose.ui.focus;

import C6.G;
import P0.p;
import P0.q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p056g1.AbstractC2347k;
import p056g1.AbstractC2348l;
import p056g1.F;
import p056g1.X;
import p056g1.Z;
import p056g1.d0;
import p056g1.h0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f14629b;

        static {
            int[] iArr = new int[P0.a.values().length];
            try {
                iArr[P0.a.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[P0.a.Redirected.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[P0.a.Cancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[P0.a.RedirectCancelled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f14628a = iArr;
            int[] iArr2 = new int[P0.m.values().length];
            try {
                iArr2[P0.m.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[P0.m.f8855c.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[P0.m.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[P0.m.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f14629b = iArr2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FocusTargetNode f14630a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(FocusTargetNode focusTargetNode) {
            super(0);
            this.f14630a = focusTargetNode;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m83invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m83invoke() {
            this.f14630a.i2();
        }
    }

    public static final boolean a(FocusTargetNode focusTargetNode, boolean z8, boolean z9) {
        FocusTargetNode focusTargetNodeF = k.f(focusTargetNode);
        if (focusTargetNodeF != null) {
            return c(focusTargetNodeF, z8, z9);
        }
        return true;
    }

    public static /* synthetic */ boolean b(FocusTargetNode focusTargetNode, boolean z8, boolean z9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        if ((i8 & 2) != 0) {
            z9 = true;
        }
        return a(focusTargetNode, z8, z9);
    }

    public static final boolean c(FocusTargetNode focusTargetNode, boolean z8, boolean z9) {
        int i8 = a.f14629b[focusTargetNode.k2().ordinal()];
        if (i8 == 1) {
            focusTargetNode.n2(P0.m.Inactive);
            if (z9) {
                P0.d.c(focusTargetNode);
            }
            return true;
        }
        if (i8 == 2) {
            if (z8) {
                focusTargetNode.n2(P0.m.Inactive);
                if (z9) {
                    P0.d.c(focusTargetNode);
                }
            }
            return z8;
        }
        if (i8 != 3) {
            if (i8 == 4) {
                return true;
            }
            throw new C6.m();
        }
        if (!a(focusTargetNode, z8, z9)) {
            return false;
        }
        focusTargetNode.n2(P0.m.Inactive);
        if (z9) {
            P0.d.c(focusTargetNode);
        }
        return true;
    }

    public static final boolean d(FocusTargetNode focusTargetNode) {
        d0.a(focusTargetNode, new b(focusTargetNode));
        int i8 = a.f14629b[focusTargetNode.k2().ordinal()];
        if (i8 != 3 && i8 != 4) {
            return true;
        }
        focusTargetNode.n2(P0.m.Active);
        return true;
    }

    public static final P0.a e(FocusTargetNode focusTargetNode, int i8) {
        int i9 = a.f14629b[focusTargetNode.k2().ordinal()];
        if (i9 != 1) {
            if (i9 == 2) {
                return P0.a.Cancelled;
            }
            if (i9 == 3) {
                P0.a aVarE = e(m(focusTargetNode), i8);
                if (aVarE == P0.a.None) {
                    aVarE = null;
                }
                return aVarE == null ? g(focusTargetNode, i8) : aVarE;
            }
            if (i9 != 4) {
                throw new C6.m();
            }
        }
        return P0.a.None;
    }

    public static final P0.a f(FocusTargetNode focusTargetNode, int i8) {
        if (!focusTargetNode.f14591o) {
            focusTargetNode.f14591o = true;
            try {
                g gVar = (g) focusTargetNode.i2().m().invoke(c.i(i8));
                g.a aVar = g.f14622b;
                if (gVar != aVar.b()) {
                    if (gVar == aVar.a()) {
                        return P0.a.Cancelled;
                    }
                    return gVar.c() ? P0.a.Redirected : P0.a.RedirectCancelled;
                }
            } finally {
                focusTargetNode.f14591o = false;
            }
        }
        return P0.a.None;
    }

    public static final P0.a g(FocusTargetNode focusTargetNode, int i8) {
        if (!focusTargetNode.f14590n) {
            focusTargetNode.f14590n = true;
            try {
                g gVar = (g) focusTargetNode.i2().i().invoke(c.i(i8));
                g.a aVar = g.f14622b;
                if (gVar != aVar.b()) {
                    if (gVar == aVar.a()) {
                        return P0.a.Cancelled;
                    }
                    return gVar.c() ? P0.a.Redirected : P0.a.RedirectCancelled;
                }
            } finally {
                focusTargetNode.f14590n = false;
            }
        }
        return P0.a.None;
    }

    public static final P0.a h(FocusTargetNode focusTargetNode, int i8) {
        L0.i.c cVarG;
        androidx.compose.ui.node.a aVarJ0;
        int i9 = a.f14629b[focusTargetNode.k2().ordinal()];
        if (i9 == 1 || i9 == 2) {
            return P0.a.None;
        }
        if (i9 == 3) {
            return e(m(focusTargetNode), i8);
        }
        if (i9 != 4) {
            throw new C6.m();
        }
        int iA = Z.a(1024);
        if (!focusTargetNode.I0().K1()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        L0.i.c cVarH1 = focusTargetNode.I0().H1();
        F fK = AbstractC2347k.k(focusTargetNode);
        loop0: while (true) {
            if (fK == null) {
                cVarG = null;
                break;
            }
            if ((fK.j0().k().A1() & iA) != 0) {
                while (cVarH1 != null) {
                    if ((cVarH1.F1() & iA) != 0) {
                        cVarG = cVarH1;
                        B0.d dVar = null;
                        while (cVarG != null) {
                            if (cVarG instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if ((cVarG.F1() & iA) != 0 && (cVarG instanceof AbstractC2348l)) {
                                int i10 = 0;
                                for (L0.i.c cVarE2 = ((AbstractC2348l) cVarG).e2(); cVarE2 != null; cVarE2 = cVarE2.B1()) {
                                    if ((cVarE2.F1() & iA) != 0) {
                                        i10++;
                                        if (i10 == 1) {
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
                                if (i10 == 1) {
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
        FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarG;
        if (focusTargetNode2 == null) {
            return P0.a.None;
        }
        int i11 = a.f14629b[focusTargetNode2.k2().ordinal()];
        if (i11 == 1) {
            return f(focusTargetNode2, i8);
        }
        if (i11 == 2) {
            return P0.a.Cancelled;
        }
        if (i11 == 3) {
            return h(focusTargetNode2, i8);
        }
        if (i11 != 4) {
            throw new C6.m();
        }
        P0.a aVarH = h(focusTargetNode2, i8);
        P0.a aVar = aVarH != P0.a.None ? aVarH : null;
        return aVar == null ? f(focusTargetNode2, i8) : aVar;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00da  */
    public static final boolean i(FocusTargetNode focusTargetNode) {
        androidx.compose.ui.node.a aVarJ0;
        int i8 = a.f14629b[focusTargetNode.k2().ordinal()];
        boolean zK = true;
        if (i8 != 1 && i8 != 2) {
            L0.i.c cVar = null;
            if (i8 != 3) {
                if (i8 != 4) {
                    throw new C6.m();
                }
                int iA = Z.a(1024);
                if (!focusTargetNode.I0().K1()) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                L0.i.c cVarH1 = focusTargetNode.I0().H1();
                F fK = AbstractC2347k.k(focusTargetNode);
                loop0: while (fK != null) {
                    if ((fK.j0().k().A1() & iA) != 0) {
                        while (cVarH1 != null) {
                            if ((cVarH1.F1() & iA) != 0) {
                                L0.i.c cVarG = cVarH1;
                                B0.d dVar = null;
                                while (cVarG != null) {
                                    if (cVarG instanceof FocusTargetNode) {
                                        cVar = cVarG;
                                        break loop0;
                                    }
                                    if ((cVarG.F1() & iA) != 0 && (cVarG instanceof AbstractC2348l)) {
                                        int i9 = 0;
                                        for (L0.i.c cVarE2 = ((AbstractC2348l) cVarG).e2(); cVarE2 != null; cVarE2 = cVarE2.B1()) {
                                            if ((cVarE2.F1() & iA) != 0) {
                                                i9++;
                                                if (i9 == 1) {
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
                                        if (i9 == 1) {
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
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVar;
                if (focusTargetNode2 != null) {
                    P0.m mVarK2 = focusTargetNode2.k2();
                    zK = k(focusTargetNode2, focusTargetNode);
                    if (zK && mVarK2 != focusTargetNode2.k2()) {
                        P0.d.c(focusTargetNode2);
                    }
                } else if (!l(focusTargetNode) || !d(focusTargetNode)) {
                    zK = false;
                }
            } else if (!b(focusTargetNode, false, false, 3, null) || !d(focusTargetNode)) {
                zK = false;
            }
        }
        if (zK) {
            P0.d.c(focusTargetNode);
        }
        return zK;
    }

    public static final boolean j(FocusTargetNode focusTargetNode) {
        q qVarD = p.d(focusTargetNode);
        try {
            if (qVarD.f8861c) {
                qVarD.g();
            }
            qVarD.f();
            int i8 = a.f14628a[h(focusTargetNode, c.f14597b.b()).ordinal()];
            boolean zI = true;
            if (i8 == 1) {
                zI = i(focusTargetNode);
            } else if (i8 != 2) {
                if (i8 != 3 && i8 != 4) {
                    throw new C6.m();
                }
                zI = false;
            }
            qVarD.h();
            return zI;
        } catch (Throwable th) {
            qVarD.h();
            throw th;
        }
    }

    public static final boolean k(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        L0.i.c cVar;
        L0.i.c cVarG;
        androidx.compose.ui.node.a aVarJ0;
        androidx.compose.ui.node.a aVarJ1;
        int iA = Z.a(1024);
        if (!focusTargetNode2.I0().K1()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        L0.i.c cVarH1 = focusTargetNode2.I0().H1();
        F fK = AbstractC2347k.k(focusTargetNode2);
        loop0: while (true) {
            cVar = null;
            if (fK == null) {
                cVarG = null;
                break;
            }
            if ((fK.j0().k().A1() & iA) != 0) {
                while (cVarH1 != null) {
                    if ((cVarH1.F1() & iA) != 0) {
                        cVarG = cVarH1;
                        B0.d dVar = null;
                        while (cVarG != null) {
                            if (cVarG instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if ((cVarG.F1() & iA) != 0 && (cVarG instanceof AbstractC2348l)) {
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
            cVarH1 = (fK == null || (aVarJ1 = fK.j0()) == null) ? null : aVarJ1.p();
        }
        if (!t.c(cVarG, focusTargetNode)) {
            throw new IllegalStateException("Non child node cannot request focus.");
        }
        int i9 = a.f14629b[focusTargetNode.k2().ordinal()];
        if (i9 == 1) {
            boolean zD = d(focusTargetNode2);
            if (zD) {
                focusTargetNode.n2(P0.m.ActiveParent);
            }
            return zD;
        }
        if (i9 != 2) {
            if (i9 != 3) {
                if (i9 != 4) {
                    throw new C6.m();
                }
                int iA2 = Z.a(1024);
                if (!focusTargetNode.I0().K1()) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                L0.i.c cVarH2 = focusTargetNode.I0().H1();
                F fK2 = AbstractC2347k.k(focusTargetNode);
                loop4: while (fK2 != null) {
                    if ((fK2.j0().k().A1() & iA2) != 0) {
                        while (cVarH2 != null) {
                            if ((cVarH2.F1() & iA2) != 0) {
                                L0.i.c cVarG2 = cVarH2;
                                B0.d dVar2 = null;
                                while (cVarG2 != null) {
                                    if (cVarG2 instanceof FocusTargetNode) {
                                        cVar = cVarG2;
                                        break loop4;
                                    }
                                    if ((cVarG2.F1() & iA2) != 0 && (cVarG2 instanceof AbstractC2348l)) {
                                        int i10 = 0;
                                        for (L0.i.c cVarE3 = ((AbstractC2348l) cVarG2).e2(); cVarE3 != null; cVarE3 = cVarE3.B1()) {
                                            if ((cVarE3.F1() & iA2) != 0) {
                                                i10++;
                                                if (i10 == 1) {
                                                    cVarG2 = cVarE3;
                                                } else {
                                                    if (dVar2 == null) {
                                                        dVar2 = new B0.d(new L0.i.c[16], 0);
                                                    }
                                                    if (cVarG2 != null) {
                                                        dVar2.d(cVarG2);
                                                        cVarG2 = null;
                                                    }
                                                    dVar2.d(cVarE3);
                                                }
                                            }
                                        }
                                        if (i10 == 1) {
                                        }
                                    }
                                    cVarG2 = AbstractC2347k.g(dVar2);
                                }
                            }
                            cVarH2 = cVarH2.H1();
                        }
                    }
                    fK2 = fK2.m0();
                    cVarH2 = (fK2 == null || (aVarJ0 = fK2.j0()) == null) ? null : aVarJ0.p();
                }
                FocusTargetNode focusTargetNode3 = (FocusTargetNode) cVar;
                if (focusTargetNode3 == null && l(focusTargetNode)) {
                    focusTargetNode.n2(P0.m.Active);
                    return k(focusTargetNode, focusTargetNode2);
                }
                if (focusTargetNode3 == null || !k(focusTargetNode3, focusTargetNode)) {
                    return false;
                }
                boolean zK = k(focusTargetNode, focusTargetNode2);
                if (focusTargetNode.k2() != P0.m.ActiveParent) {
                    throw new IllegalStateException("Deactivated node is focused");
                }
                if (zK) {
                    P0.d.c(focusTargetNode3);
                }
                return zK;
            }
            m(focusTargetNode);
            if (b(focusTargetNode, false, false, 3, null) && d(focusTargetNode2)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean l(FocusTargetNode focusTargetNode) {
        F fH1;
        h0 h0VarL0;
        X xC1 = focusTargetNode.C1();
        if (xC1 == null || (fH1 = xC1.h1()) == null || (h0VarL0 = fH1.l0()) == null) {
            throw new IllegalStateException("Owner not initialized.");
        }
        return h0VarL0.requestFocus();
    }

    public static final FocusTargetNode m(FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNodeF = k.f(focusTargetNode);
        if (focusTargetNodeF != null) {
            return focusTargetNodeF;
        }
        throw new IllegalArgumentException("ActiveParent with no focused child");
    }
}
