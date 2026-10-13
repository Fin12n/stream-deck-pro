package androidx.compose.ui.focus;

import V.ocy.SVzBK;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p038e1.InterfaceC2232c;
import p056g1.AbstractC2347k;
import p056g1.AbstractC2348l;
import p056g1.InterfaceC2346j;
import p056g1.Z;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14638a;

        static {
            int[] iArr = new int[P0.m.values().length];
            try {
                iArr[P0.m.ActiveParent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[P0.m.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[P0.m.f8855c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[P0.m.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f14638a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FocusTargetNode f14639a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ FocusTargetNode f14640b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f14641c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Q6.k f14642d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i8, Q6.k kVar) {
            super(1);
            this.f14639a = focusTargetNode;
            this.f14640b = focusTargetNode2;
            this.f14641c = i8;
            this.f14642d = kVar;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC2232c.a aVar) {
            boolean zR = m.r(this.f14639a, this.f14640b, this.f14641c, this.f14642d);
            Boolean boolValueOf = Boolean.valueOf(zR);
            if (zR || !aVar.a()) {
                return boolValueOf;
            }
            return null;
        }
    }

    public static final FocusTargetNode b(FocusTargetNode focusTargetNode) {
        if (focusTargetNode.k2() != P0.m.ActiveParent) {
            throw new IllegalStateException("Searching for active node in inactive hierarchy");
        }
        FocusTargetNode focusTargetNodeB = k.b(focusTargetNode);
        if (focusTargetNodeB != null) {
            return focusTargetNodeB;
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild");
    }

    public static final boolean c(Q0.h hVar, Q0.h hVar2, Q0.h hVar3, int i8) {
        if (d(hVar3, i8, hVar) || !d(hVar2, i8, hVar)) {
            return false;
        }
        if (!e(hVar3, i8, hVar)) {
            return true;
        }
        c.a aVar = c.f14597b;
        return c.l(i8, aVar.d()) || c.l(i8, aVar.g()) || f(hVar2, i8, hVar) < g(hVar3, i8, hVar);
    }

    public static final boolean d(Q0.h hVar, int i8, Q0.h hVar2) {
        c.a aVar = c.f14597b;
        if (c.l(i8, aVar.d()) ? true : c.l(i8, aVar.g())) {
            return hVar.e() > hVar2.l() && hVar.l() < hVar2.e();
        }
        if (c.l(i8, aVar.h()) ? true : c.l(i8, aVar.a())) {
            return hVar.j() > hVar2.i() && hVar.i() < hVar2.j();
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    public static final boolean e(Q0.h hVar, int i8, Q0.h hVar2) {
        c.a aVar = c.f14597b;
        if (c.l(i8, aVar.d())) {
            return hVar2.i() >= hVar.j();
        }
        if (c.l(i8, aVar.g())) {
            return hVar2.j() <= hVar.i();
        }
        if (c.l(i8, aVar.h())) {
            return hVar2.l() >= hVar.e();
        }
        if (c.l(i8, aVar.a())) {
            return hVar2.e() <= hVar.l();
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    public static final float f(Q0.h hVar, int i8, Q0.h hVar2) {
        float fL;
        float fE;
        float fL2;
        float fE2;
        float f8;
        c.a aVar = c.f14597b;
        if (!c.l(i8, aVar.d())) {
            if (c.l(i8, aVar.g())) {
                fL = hVar.i();
                fE = hVar2.j();
            } else if (c.l(i8, aVar.h())) {
                fL2 = hVar2.l();
                fE2 = hVar.e();
            } else {
                if (!c.l(i8, aVar.a())) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                fL = hVar.l();
                fE = hVar2.e();
            }
            f8 = fL - fE;
            return Math.max(0.0f, f8);
        }
        fL2 = hVar2.i();
        fE2 = hVar.j();
        f8 = fL2 - fE2;
        return Math.max(0.0f, f8);
    }

    public static final float g(Q0.h hVar, int i8, Q0.h hVar2) {
        float fE;
        float fE2;
        float fL;
        float fL2;
        float f8;
        c.a aVar = c.f14597b;
        if (!c.l(i8, aVar.d())) {
            if (c.l(i8, aVar.g())) {
                fE = hVar.j();
                fE2 = hVar2.j();
            } else if (c.l(i8, aVar.h())) {
                fL = hVar2.l();
                fL2 = hVar.l();
            } else {
                if (!c.l(i8, aVar.a())) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                fE = hVar.e();
                fE2 = hVar2.e();
            }
            f8 = fE - fE2;
            return Math.max(1.0f, f8);
        }
        fL = hVar2.i();
        fL2 = hVar.i();
        f8 = fL - fL2;
        return Math.max(1.0f, f8);
    }

    public static final Q0.h h(Q0.h hVar) {
        return new Q0.h(hVar.j(), hVar.e(), hVar.j(), hVar.e());
    }

    public static final void i(InterfaceC2346j interfaceC2346j, B0.d dVar) {
        int iA = Z.a(1024);
        if (!interfaceC2346j.I0().K1()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        B0.d dVar2 = new B0.d(new L0.i.c[16], 0);
        L0.i.c cVarB1 = interfaceC2346j.I0().B1();
        if (cVarB1 == null) {
            AbstractC2347k.c(dVar2, interfaceC2346j.I0());
        } else {
            dVar2.d(cVarB1);
        }
        while (dVar2.v()) {
            L0.i.c cVarG = (L0.i.c) dVar2.D(dVar2.s() - 1);
            if ((cVarG.A1() & iA) == 0) {
                AbstractC2347k.c(dVar2, cVarG);
            } else {
                while (cVarG != null) {
                    if ((cVarG.F1() & iA) != 0) {
                        B0.d dVar3 = null;
                        while (cVarG != null) {
                            if (cVarG instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode = (FocusTargetNode) cVarG;
                                if (focusTargetNode.K1()) {
                                    if (focusTargetNode.i2().e()) {
                                        dVar.d(focusTargetNode);
                                    } else {
                                        i(focusTargetNode, dVar);
                                    }
                                }
                            } else if ((cVarG.F1() & iA) != 0 && (cVarG instanceof AbstractC2348l)) {
                                int i8 = 0;
                                for (L0.i.c cVarE2 = ((AbstractC2348l) cVarG).e2(); cVarE2 != null; cVarE2 = cVarE2.B1()) {
                                    if ((cVarE2.F1() & iA) != 0) {
                                        i8++;
                                        if (i8 == 1) {
                                            cVarG = cVarE2;
                                        } else {
                                            if (dVar3 == null) {
                                                dVar3 = new B0.d(new L0.i.c[16], 0);
                                            }
                                            if (cVarG != null) {
                                                dVar3.d(cVarG);
                                                cVarG = null;
                                            }
                                            dVar3.d(cVarE2);
                                        }
                                    }
                                }
                                if (i8 == 1) {
                                }
                            }
                            cVarG = AbstractC2347k.g(dVar3);
                        }
                        break;
                    }
                    cVarG = cVarG.B1();
                }
            }
        }
    }

    public static final boolean k(FocusTargetNode focusTargetNode, int i8, Q6.k kVar) {
        Q0.h hVarH;
        B0.d dVar = new B0.d(new FocusTargetNode[16], 0);
        i(focusTargetNode, dVar);
        if (dVar.s() <= 1) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) (dVar.u() ? null : dVar.r()[0]);
            if (focusTargetNode2 != null) {
                return ((Boolean) kVar.invoke(focusTargetNode2)).booleanValue();
            }
            return false;
        }
        c.a aVar = c.f14597b;
        if (c.l(i8, aVar.b())) {
            i8 = aVar.g();
        }
        if (c.l(i8, aVar.g()) ? true : c.l(i8, aVar.a())) {
            hVarH = s(k.d(focusTargetNode));
        } else {
            if (!(c.l(i8, aVar.d()) ? true : c.l(i8, aVar.h()))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            hVarH = h(k.d(focusTargetNode));
        }
        FocusTargetNode focusTargetNodeJ = j(dVar, hVarH, i8);
        if (focusTargetNodeJ != null) {
            return ((Boolean) kVar.invoke(focusTargetNodeJ)).booleanValue();
        }
        return false;
    }

    public static final boolean l(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i8, Q6.k kVar) {
        if (r(focusTargetNode, focusTargetNode2, i8, kVar)) {
            return true;
        }
        Boolean bool = (Boolean) androidx.compose.ui.focus.a.a(focusTargetNode, i8, new b(focusTargetNode, focusTargetNode2, i8, kVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean m(Q0.h hVar, Q0.h hVar2, Q0.h hVar3, int i8) {
        if (!n(hVar, i8, hVar3)) {
            return false;
        }
        if (n(hVar2, i8, hVar3) && !c(hVar3, hVar, hVar2, i8)) {
            return !c(hVar3, hVar2, hVar, i8) && q(i8, hVar3, hVar) < q(i8, hVar3, hVar2);
        }
        return true;
    }

    public static final boolean n(Q0.h hVar, int i8, Q0.h hVar2) {
        c.a aVar = c.f14597b;
        if (c.l(i8, aVar.d())) {
            return (hVar2.j() > hVar.j() || hVar2.i() >= hVar.j()) && hVar2.i() > hVar.i();
        }
        if (c.l(i8, aVar.g())) {
            return (hVar2.i() < hVar.i() || hVar2.j() <= hVar.i()) && hVar2.j() < hVar.j();
        }
        if (c.l(i8, aVar.h())) {
            return (hVar2.e() > hVar.e() || hVar2.l() >= hVar.e()) && hVar2.l() > hVar.l();
        }
        if (c.l(i8, aVar.a())) {
            return (hVar2.l() < hVar.l() || hVar2.e() <= hVar.l()) && hVar2.e() < hVar.e();
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    public static final float o(Q0.h hVar, int i8, Q0.h hVar2) {
        float fL;
        float fE;
        float fL2;
        float fE2;
        float f8;
        c.a aVar = c.f14597b;
        if (!c.l(i8, aVar.d())) {
            if (c.l(i8, aVar.g())) {
                fL = hVar.i();
                fE = hVar2.j();
            } else if (c.l(i8, aVar.h())) {
                fL2 = hVar2.l();
                fE2 = hVar.e();
            } else {
                if (!c.l(i8, aVar.a())) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                fL = hVar.l();
                fE = hVar2.e();
            }
            f8 = fL - fE;
            return Math.max(0.0f, f8);
        }
        fL2 = hVar2.i();
        fE2 = hVar.j();
        f8 = fL2 - fE2;
        return Math.max(0.0f, f8);
    }

    public static final float p(Q0.h hVar, int i8, Q0.h hVar2) {
        float f8;
        float fI;
        float fI2;
        float fN;
        c.a aVar = c.f14597b;
        if (c.l(i8, aVar.d()) ? true : c.l(i8, aVar.g())) {
            f8 = 2;
            fI = hVar2.l() + (hVar2.h() / f8);
            fI2 = hVar.l();
            fN = hVar.h();
        } else {
            if (!(c.l(i8, aVar.h()) ? true : c.l(i8, aVar.a()))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f8 = 2;
            fI = hVar2.i() + (hVar2.n() / f8);
            fI2 = hVar.i();
            fN = hVar.n();
        }
        return fI - (fI2 + (fN / f8));
    }

    public static final long q(int i8, Q0.h hVar, Q0.h hVar2) {
        long jAbs = (long) Math.abs(o(hVar2, i8, hVar));
        long jAbs2 = (long) Math.abs(p(hVar2, i8, hVar));
        return (((long) 13) * jAbs * jAbs) + (jAbs2 * jAbs2);
    }

    public static final boolean r(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i8, Q6.k kVar) {
        FocusTargetNode focusTargetNodeJ;
        B0.d dVar = new B0.d(new FocusTargetNode[16], 0);
        int iA = Z.a(1024);
        if (!focusTargetNode.I0().K1()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        B0.d dVar2 = new B0.d(new L0.i.c[16], 0);
        L0.i.c cVarB1 = focusTargetNode.I0().B1();
        if (cVarB1 == null) {
            AbstractC2347k.c(dVar2, focusTargetNode.I0());
        } else {
            dVar2.d(cVarB1);
        }
        while (dVar2.v()) {
            L0.i.c cVarG = (L0.i.c) dVar2.D(dVar2.s() - 1);
            if ((cVarG.A1() & iA) == 0) {
                AbstractC2347k.c(dVar2, cVarG);
            } else {
                while (cVarG != null) {
                    if ((cVarG.F1() & iA) != 0) {
                        B0.d dVar3 = null;
                        while (cVarG != null) {
                            if (cVarG instanceof FocusTargetNode) {
                                dVar.d((FocusTargetNode) cVarG);
                            } else if ((cVarG.F1() & iA) != 0 && (cVarG instanceof AbstractC2348l)) {
                                int i9 = 0;
                                for (L0.i.c cVarE2 = ((AbstractC2348l) cVarG).e2(); cVarE2 != null; cVarE2 = cVarE2.B1()) {
                                    if ((cVarE2.F1() & iA) != 0) {
                                        i9++;
                                        if (i9 == 1) {
                                            cVarG = cVarE2;
                                        } else {
                                            if (dVar3 == null) {
                                                dVar3 = new B0.d(new L0.i.c[16], 0);
                                            }
                                            if (cVarG != null) {
                                                dVar3.d(cVarG);
                                                cVarG = null;
                                            }
                                            dVar3.d(cVarE2);
                                        }
                                    }
                                }
                                if (i9 == 1) {
                                }
                            }
                            cVarG = AbstractC2347k.g(dVar3);
                        }
                        break;
                    }
                    cVarG = cVarG.B1();
                }
            }
        }
        while (dVar.v() && (focusTargetNodeJ = j(dVar, k.d(focusTargetNode2), i8)) != null) {
            if (focusTargetNodeJ.i2().e()) {
                return ((Boolean) kVar.invoke(focusTargetNodeJ)).booleanValue();
            }
            if (l(focusTargetNodeJ, focusTargetNode2, i8, kVar)) {
                return true;
            }
            dVar.z(focusTargetNodeJ);
        }
        return false;
    }

    public static final Q0.h s(Q0.h hVar) {
        return new Q0.h(hVar.i(), hVar.l(), hVar.i(), hVar.l());
    }

    public static final Boolean t(FocusTargetNode focusTargetNode, int i8, Q6.k kVar) {
        P0.m mVarK2 = focusTargetNode.k2();
        int[] iArr = a.f14638a;
        int i9 = iArr[mVarK2.ordinal()];
        if (i9 != 1) {
            if (i9 == 2 || i9 == 3) {
                return Boolean.valueOf(k(focusTargetNode, i8, kVar));
            }
            if (i9 == 4) {
                return focusTargetNode.i2().e() ? (Boolean) kVar.invoke(focusTargetNode) : Boolean.FALSE;
            }
            throw new C6.m();
        }
        FocusTargetNode focusTargetNodeF = k.f(focusTargetNode);
        if (focusTargetNodeF == null) {
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        int i10 = iArr[focusTargetNodeF.k2().ordinal()];
        if (i10 == 1) {
            Boolean boolT = t(focusTargetNodeF, i8, kVar);
            return !t.c(boolT, Boolean.FALSE) ? boolT : Boolean.valueOf(l(focusTargetNode, b(focusTargetNodeF), i8, kVar));
        }
        if (i10 == 2 || i10 == 3) {
            return Boolean.valueOf(l(focusTargetNode, focusTargetNodeF, i8, kVar));
        }
        if (i10 != 4) {
            throw new C6.m();
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild");
    }

    public static final FocusTargetNode j(B0.d dVar, Q0.h hVar, int i8) {
        Q0.h hVarS;
        c.a aVar = c.f14597b;
        if (c.l(i8, aVar.d())) {
            hVarS = hVar.s(hVar.n() + 1, 0.0f);
        } else if (c.l(i8, aVar.g())) {
            hVarS = hVar.s(-(hVar.n() + 1), 0.0f);
        } else if (c.l(i8, aVar.h())) {
            hVarS = hVar.s(0.0f, hVar.h() + 1);
        } else {
            if (!c.l(i8, aVar.a())) {
                throw new IllegalStateException(SVzBK.VaMdcKuyHPBGgZG);
            }
            hVarS = hVar.s(0.0f, -(hVar.h() + 1));
        }
        int iS = dVar.s();
        FocusTargetNode focusTargetNode = null;
        if (iS > 0) {
            Object[] objArrR = dVar.r();
            int i9 = 0;
            do {
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArrR[i9];
                if (k.g(focusTargetNode2)) {
                    Q0.h hVarD = k.d(focusTargetNode2);
                    if (m(hVarD, hVarS, hVar, i8)) {
                        focusTargetNode = focusTargetNode2;
                        hVarS = hVarD;
                    }
                }
                i9++;
            } while (i9 < iS);
        }
        return focusTargetNode;
    }
}
