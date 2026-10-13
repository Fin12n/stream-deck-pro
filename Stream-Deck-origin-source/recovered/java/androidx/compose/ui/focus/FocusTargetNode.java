package androidx.compose.ui.focus;

import C6.G;
import P0.n;
import P0.p;
import P0.q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.J;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p038e1.AbstractC2233d;
import p038e1.InterfaceC2232c;
import p056g1.AbstractC2347k;
import p056g1.AbstractC2348l;
import p056g1.F;
import p056g1.InterfaceC2344h;
import p056g1.U;
import p056g1.Z;
import p056g1.c0;
import p056g1.d0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class FocusTargetNode extends L0.i.c implements InterfaceC2344h, n, c0, p047f1.h {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f14590n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f14591o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public P0.m f14592p = P0.m.Inactive;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14594a;

        static {
            int[] iArr = new int[P0.m.values().length];
            try {
                iArr[P0.m.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[P0.m.f8855c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[P0.m.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[P0.m.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f14594a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ J f14595a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ FocusTargetNode f14596b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(J j8, FocusTargetNode focusTargetNode) {
            super(0);
            this.f14595a = j8;
            this.f14596b = focusTargetNode;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m82invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m82invoke() {
            this.f14595a.f28779a = this.f14596b.i2();
        }
    }

    @Override // p056g1.c0
    public void O0() {
        P0.m mVarK2 = k2();
        l2();
        if (mVarK2 != k2()) {
            P0.d.c(this);
        }
    }

    @Override // L0.i.c
    public void P1() {
        int i8 = a.f14594a[k2().ordinal()];
        if (i8 == 1 || i8 == 2) {
            AbstractC2347k.l(this).getFocusOwner().n(true);
            return;
        }
        if (i8 != 3) {
            if (i8 != 4) {
                return;
            }
            m2();
            return;
        }
        m2();
        q qVarD = p.d(this);
        try {
            if (qVarD.f8861c) {
                qVarD.g();
            }
            qVarD.f();
            n2(P0.m.Inactive);
            G g8 = G.f1419a;
        } finally {
            qVarD.h();
        }
    }

    public final void h2() {
        P0.m mVarI = p.d(this).i(this);
        if (mVarI == null) {
            throw new IllegalStateException("committing a node that was not updated in the current transaction");
        }
        this.f14592p = mVarI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [B0.d] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [B0.d] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final e i2() {
        androidx.compose.ui.node.a aVarJ0;
        f fVar = new f();
        int iA = Z.a(2048);
        int iA2 = Z.a(1024);
        L0.i.c cVarI0 = I0();
        int i8 = iA | iA2;
        if (!I0().K1()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        L0.i.c cVarI1 = I0();
        F fK = AbstractC2347k.k(this);
        while (fK != null) {
            if ((fK.j0().k().A1() & i8) != 0) {
                while (cVarI1 != null) {
                    if ((cVarI1.F1() & i8) != 0) {
                        if (cVarI1 != cVarI0 && (cVarI1.F1() & iA2) != 0) {
                            return fVar;
                        }
                        if ((cVarI1.F1() & iA) != 0) {
                            ?? G8 = cVarI1;
                            ?? dVar = 0;
                            while (G8 != 0) {
                                if (G8 instanceof P0.h) {
                                    ((P0.h) G8).S(fVar);
                                } else if ((G8.F1() & iA) != 0 && (G8 instanceof AbstractC2348l)) {
                                    L0.i.c cVarE2 = ((AbstractC2348l) G8).e2();
                                    int i9 = 0;
                                    G8 = G8;
                                    dVar = dVar;
                                    while (cVarE2 != null) {
                                        if ((cVarE2.F1() & iA) != 0) {
                                            i9++;
                                            if (i9 == 1) {
                                                dVar = dVar;
                                                G8 = cVarE2;
                                            } else {
                                                if (dVar == 0) {
                                                    dVar = new B0.d(new L0.i.c[16], 0);
                                                }
                                                if (G8 != 0) {
                                                    dVar.d(G8);
                                                    G8 = 0;
                                                }
                                                dVar.d(cVarE2);
                                            }
                                        }
                                        cVarE2 = cVarE2.B1();
                                        G8 = G8;
                                        dVar = dVar;
                                    }
                                    if (i9 == 1) {
                                    }
                                }
                                G8 = AbstractC2347k.g(dVar);
                            }
                        }
                    }
                    cVarI1 = cVarI1.H1();
                }
            }
            fK = fK.m0();
            cVarI1 = (fK == null || (aVarJ0 = fK.j0()) == null) ? null : aVarJ0.p();
        }
        return fVar;
    }

    public final InterfaceC2232c j2() {
        return (InterfaceC2232c) u(AbstractC2233d.a());
    }

    public P0.m k2() {
        P0.m mVarI;
        q qVarB = p.b(this);
        return (qVarB == null || (mVarI = qVarB.i(this)) == null) ? this.f14592p : mVarI;
    }

    public final void l2() {
        e eVar;
        int i8 = a.f14594a[k2().ordinal()];
        if (i8 == 1 || i8 == 2) {
            J j8 = new J();
            d0.a(this, new b(j8, this));
            Object obj = j8.f28779a;
            if (obj == null) {
                t.t("focusProperties");
                eVar = null;
            } else {
                eVar = (e) obj;
            }
            if (eVar.e()) {
                return;
            }
            AbstractC2347k.l(this).getFocusOwner().n(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r0v1, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v2, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [B0.d] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [B0.d] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [B0.d] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [B0.d] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r8v7 */
    public final void m2() {
        androidx.compose.ui.node.a aVarJ0;
        ?? I8 = I0();
        int iA = Z.a(4096);
        ?? dVar = 0;
        while (I8 != 0) {
            if (I8 instanceof P0.c) {
                P0.d.b((P0.c) I8);
            } else if ((I8.F1() & iA) != 0 && (I8 instanceof AbstractC2348l)) {
                L0.i.c cVarE2 = ((AbstractC2348l) I8).e2();
                int i8 = 0;
                while (cVarE2 != null) {
                    if ((cVarE2.F1() & iA) != 0) {
                        i8++;
                        if (i8 == 1) {
                            I8 = I8;
                            dVar = dVar;
                            dVar = dVar;
                            I8 = cVarE2;
                        } else {
                            if (dVar == 0) {
                                dVar = new B0.d(new L0.i.c[16], 0);
                            }
                            if (I8 != 0) {
                                dVar.d(I8);
                                I8 = 0;
                            }
                            dVar.d(cVarE2);
                        }
                    } else {
                        I8 = I8;
                        dVar = dVar;
                    }
                    cVarE2 = cVarE2.B1();
                    I8 = I8;
                    dVar = dVar;
                }
                if (i8 == 1) {
                    I8 = I8;
                    dVar = dVar;
                } else {
                    I8 = I8;
                    dVar = dVar;
                }
            }
            I8 = AbstractC2347k.g(dVar);
        }
        int iA2 = Z.a(4096) | Z.a(1024);
        if (!I0().K1()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        L0.i.c cVarH1 = I0().H1();
        F fK = AbstractC2347k.k(this);
        while (fK != null) {
            if ((fK.j0().k().A1() & iA2) != 0) {
                while (cVarH1 != null) {
                    if ((cVarH1.F1() & iA2) != 0 && (Z.a(1024) & cVarH1.F1()) == 0 && cVarH1.K1()) {
                        int iA3 = Z.a(4096);
                        ?? dVar2 = 0;
                        ?? G8 = cVarH1;
                        while (G8 != 0) {
                            if (G8 instanceof P0.c) {
                                P0.d.b((P0.c) G8);
                            } else if ((G8.F1() & iA3) != 0 && (G8 instanceof AbstractC2348l)) {
                                L0.i.c cVarE3 = ((AbstractC2348l) G8).e2();
                                int i9 = 0;
                                while (cVarE3 != null) {
                                    if ((cVarE3.F1() & iA3) != 0) {
                                        i9++;
                                        if (i9 == 1) {
                                            G8 = G8;
                                            dVar2 = dVar2;
                                            dVar2 = dVar2;
                                            G8 = cVarE3;
                                        } else {
                                            if (dVar2 == 0) {
                                                dVar2 = new B0.d(new L0.i.c[16], 0);
                                            }
                                            if (G8 != 0) {
                                                dVar2.d(G8);
                                                G8 = 0;
                                            }
                                            dVar2.d(cVarE3);
                                        }
                                    } else {
                                        G8 = G8;
                                        dVar2 = dVar2;
                                    }
                                    cVarE3 = cVarE3.B1();
                                    G8 = G8;
                                    dVar2 = dVar2;
                                }
                                if (i9 == 1) {
                                    G8 = G8;
                                    dVar2 = dVar2;
                                } else {
                                    G8 = G8;
                                    dVar2 = dVar2;
                                }
                            }
                            G8 = AbstractC2347k.g(dVar2);
                        }
                    }
                    cVarH1 = cVarH1.H1();
                }
            }
            fK = fK.m0();
            cVarH1 = (fK == null || (aVarJ0 = fK.j0()) == null) ? null : aVarJ0.p();
        }
    }

    public void n2(P0.m mVar) {
        p.d(this).j(this, mVar);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class FocusTargetElement extends U {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FocusTargetElement f14593b = new FocusTargetElement();

        private FocusTargetElement() {
        }

        public boolean equals(Object obj) {
            return obj == this;
        }

        @Override // p056g1.U
        public int hashCode() {
            return 1739042953;
        }

        @Override // p056g1.U
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public FocusTargetNode k() {
            return new FocusTargetNode();
        }

        @Override // p056g1.U
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void p(FocusTargetNode focusTargetNode) {
        }
    }
}
