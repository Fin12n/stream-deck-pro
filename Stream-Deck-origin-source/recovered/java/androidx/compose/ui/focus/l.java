package androidx.compose.ui.focus;

import P0.r;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p038e1.InterfaceC2232c;
import p056g1.AbstractC2347k;
import p056g1.AbstractC2348l;
import p056g1.F;
import p056g1.Z;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14633a;

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
            f14633a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FocusTargetNode f14634a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ FocusTargetNode f14635b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f14636c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Q6.k f14637d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i8, Q6.k kVar) {
            super(1);
            this.f14634a = focusTargetNode;
            this.f14635b = focusTargetNode2;
            this.f14636c = i8;
            this.f14637d = kVar;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC2232c.a aVar) {
            boolean zI = l.i(this.f14634a, this.f14635b, this.f14636c, this.f14637d);
            Boolean boolValueOf = Boolean.valueOf(zI);
            if (zI || !aVar.a()) {
                return boolValueOf;
            }
            return null;
        }
    }

    public static final boolean b(FocusTargetNode focusTargetNode, Q6.k kVar) {
        P0.m mVarK2 = focusTargetNode.k2();
        int[] iArr = a.f14633a;
        int i8 = iArr[mVarK2.ordinal()];
        if (i8 != 1) {
            if (i8 == 2 || i8 == 3) {
                return g(focusTargetNode, kVar);
            }
            if (i8 != 4) {
                throw new C6.m();
            }
            if (!g(focusTargetNode, kVar)) {
                if (!(focusTargetNode.i2().e() ? ((Boolean) kVar.invoke(focusTargetNode)).booleanValue() : false)) {
                    return false;
                }
            }
            return true;
        }
        FocusTargetNode focusTargetNodeF = k.f(focusTargetNode);
        if (focusTargetNodeF == null) {
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        int i9 = iArr[focusTargetNodeF.k2().ordinal()];
        if (i9 == 1) {
            return b(focusTargetNodeF, kVar) || d(focusTargetNode, focusTargetNodeF, c.f14597b.f(), kVar) || (focusTargetNodeF.i2().e() && ((Boolean) kVar.invoke(focusTargetNodeF)).booleanValue());
        }
        if (i9 == 2 || i9 == 3) {
            return d(focusTargetNode, focusTargetNodeF, c.f14597b.f(), kVar);
        }
        if (i9 != 4) {
            throw new C6.m();
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild");
    }

    public static final boolean c(FocusTargetNode focusTargetNode, Q6.k kVar) {
        int i8 = a.f14633a[focusTargetNode.k2().ordinal()];
        if (i8 == 1) {
            FocusTargetNode focusTargetNodeF = k.f(focusTargetNode);
            if (focusTargetNodeF != null) {
                return c(focusTargetNodeF, kVar) || d(focusTargetNode, focusTargetNodeF, c.f14597b.e(), kVar);
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        if (i8 == 2 || i8 == 3) {
            return h(focusTargetNode, kVar);
        }
        if (i8 == 4) {
            return focusTargetNode.i2().e() ? ((Boolean) kVar.invoke(focusTargetNode)).booleanValue() : h(focusTargetNode, kVar);
        }
        throw new C6.m();
    }

    public static final boolean d(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i8, Q6.k kVar) {
        if (i(focusTargetNode, focusTargetNode2, i8, kVar)) {
            return true;
        }
        Boolean bool = (Boolean) androidx.compose.ui.focus.a.a(focusTargetNode, i8, new b(focusTargetNode, focusTargetNode2, i8, kVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean e(FocusTargetNode focusTargetNode) {
        L0.i.c cVar;
        androidx.compose.ui.node.a aVarJ0;
        int iA = Z.a(1024);
        if (!focusTargetNode.I0().K1()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        L0.i.c cVarH1 = focusTargetNode.I0().H1();
        F fK = AbstractC2347k.k(focusTargetNode);
        loop0: while (true) {
            cVar = null;
            if (fK == null) {
                break;
            }
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
        return cVar == null;
    }

    public static final boolean f(FocusTargetNode focusTargetNode, int i8, Q6.k kVar) {
        c.a aVar = c.f14597b;
        if (c.l(i8, aVar.e())) {
            return c(focusTargetNode, kVar);
        }
        if (c.l(i8, aVar.f())) {
            return b(focusTargetNode, kVar);
        }
        throw new IllegalStateException("This function should only be used for 1-D focus search");
    }

    public static final boolean g(FocusTargetNode focusTargetNode, Q6.k kVar) {
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
        dVar.I(r.f8862a);
        int iS = dVar.s();
        if (iS > 0) {
            int i9 = iS - 1;
            Object[] objArrR = dVar.r();
            do {
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArrR[i9];
                if (k.g(focusTargetNode2) && b(focusTargetNode2, kVar)) {
                    return true;
                }
                i9--;
            } while (i9 >= 0);
        }
        return false;
    }

    public static final boolean h(FocusTargetNode focusTargetNode, Q6.k kVar) {
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
        dVar.I(r.f8862a);
        int iS = dVar.s();
        if (iS > 0) {
            Object[] objArrR = dVar.r();
            int i9 = 0;
            do {
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArrR[i9];
                if (k.g(focusTargetNode2) && c(focusTargetNode2, kVar)) {
                    return true;
                }
                i9++;
            } while (i9 < iS);
        }
        return false;
    }

    public static final boolean i(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i8, Q6.k kVar) {
        if (focusTargetNode.k2() != P0.m.ActiveParent) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.");
        }
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
        dVar.I(r.f8862a);
        c.a aVar = c.f14597b;
        if (c.l(i8, aVar.e())) {
            W6.i iVar = new W6.i(0, dVar.s() - 1);
            int iS = iVar.s();
            int iT = iVar.t();
            if (iS <= iT) {
                boolean z8 = false;
                while (true) {
                    if (z8) {
                        FocusTargetNode focusTargetNode3 = (FocusTargetNode) dVar.r()[iS];
                        if (k.g(focusTargetNode3) && c(focusTargetNode3, kVar)) {
                            return true;
                        }
                    }
                    if (t.c(dVar.r()[iS], focusTargetNode2)) {
                        z8 = true;
                    }
                    if (iS == iT) {
                        break;
                    }
                    iS++;
                }
            }
        } else {
            if (!c.l(i8, aVar.f())) {
                throw new IllegalStateException("This function should only be used for 1-D focus search");
            }
            W6.i iVar2 = new W6.i(0, dVar.s() - 1);
            int iS2 = iVar2.s();
            int iT2 = iVar2.t();
            if (iS2 <= iT2) {
                boolean z9 = false;
                while (true) {
                    if (z9) {
                        FocusTargetNode focusTargetNode4 = (FocusTargetNode) dVar.r()[iT2];
                        if (k.g(focusTargetNode4) && b(focusTargetNode4, kVar)) {
                            return true;
                        }
                    }
                    if (t.c(dVar.r()[iT2], focusTargetNode2)) {
                        z9 = true;
                    }
                    if (iT2 == iS2) {
                        break;
                    }
                    iT2--;
                }
            }
        }
        if (c.l(i8, c.f14597b.e()) || !focusTargetNode.i2().e() || e(focusTargetNode)) {
            return false;
        }
        return ((Boolean) kVar.invoke(focusTargetNode)).booleanValue();
    }
}
