package androidx.compose.ui.focus;

import A1.t;
import C6.G;
import P0.q;
import android.view.KeyEvent;
import java.util.ArrayList;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.u;
import p010b0.s;
import p056g1.AbstractC2347k;
import p056g1.AbstractC2348l;
import p056g1.InterfaceC2346j;
import p056g1.U;
import p056g1.Z;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class FocusOwnerImpl implements P0.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P0.e f14576b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public t f14579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s f14580f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FocusTargetNode f14575a = new FocusTargetNode();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f14577c = new q();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final L0.i f14578d = new U() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        public boolean equals(Object obj) {
            return obj == this;
        }

        @Override // p056g1.U
        public int hashCode() {
            return this.f14588b.r().hashCode();
        }

        @Override // p056g1.U
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public FocusTargetNode k() {
            return this.f14588b.r();
        }

        @Override // p056g1.U
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void p(FocusTargetNode focusTargetNode) {
        }
    };

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14581a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f14582b;

        static {
            int[] iArr = new int[P0.a.values().length];
            try {
                iArr[P0.a.Redirected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[P0.a.Cancelled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[P0.a.RedirectCancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[P0.a.None.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f14581a = iArr;
            int[] iArr2 = new int[P0.m.values().length];
            try {
                iArr2[P0.m.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[P0.m.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[P0.m.f8855c.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[P0.m.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f14582b = iArr2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FocusTargetNode f14583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ FocusOwnerImpl f14584b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f14585c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ F f14586d;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f14587a;

            static {
                int[] iArr = new int[P0.a.values().length];
                try {
                    iArr[P0.a.Redirected.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[P0.a.Cancelled.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[P0.a.RedirectCancelled.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[P0.a.None.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f14587a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(FocusTargetNode focusTargetNode, FocusOwnerImpl focusOwnerImpl, int i8, F f8) {
            super(1);
            this.f14583a = focusTargetNode;
            this.f14584b = focusOwnerImpl;
            this.f14585c = i8;
            this.f14586d = f8;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            L0.i.c cVar;
            boolean zI;
            androidx.compose.ui.node.a aVarJ0;
            if (kotlin.jvm.internal.t.c(focusTargetNode, this.f14583a)) {
                return Boolean.FALSE;
            }
            int iA = Z.a(1024);
            if (!focusTargetNode.I0().K1()) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            L0.i.c cVarH1 = focusTargetNode.I0().H1();
            p056g1.F fK = AbstractC2347k.k(focusTargetNode);
            loop0: while (true) {
                cVar = null;
                zI = true;
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
            if (cVar == null) {
                throw new IllegalStateException("Focus search landed at the root.");
            }
            q qVarG = this.f14584b.g();
            int i9 = this.f14585c;
            F f8 = this.f14586d;
            try {
                if (qVarG.f8861c) {
                    qVarG.g();
                }
                qVarG.f();
                int i10 = a.f14587a[j.h(focusTargetNode, i9).ordinal()];
                if (i10 != 1) {
                    if (i10 == 2 || i10 == 3) {
                        f8.f28775a = true;
                    } else {
                        if (i10 != 4) {
                            throw new C6.m();
                        }
                        zI = j.i(focusTargetNode);
                    }
                }
                Boolean boolValueOf = Boolean.valueOf(zI);
                qVarG.h();
                return boolValueOf;
            } catch (Throwable th) {
                qVarG.h();
                throw th;
            }
        }
    }

    public FocusOwnerImpl(Q6.k kVar) {
        this.f14576b = new P0.e(kVar);
    }

    @Override // P0.g
    public void a(t tVar) {
        this.f14579e = tVar;
    }

    @Override // P0.g
    public void b(FocusTargetNode focusTargetNode) {
        this.f14576b.f(focusTargetNode);
    }

    @Override // P0.g
    public L0.i c() {
        return this.f14578d;
    }

    @Override // P0.g
    public void d() {
        if (this.f14575a.k2() == P0.m.Inactive) {
            this.f14575a.n2(P0.m.Active);
        }
    }

    @Override // P0.g
    public void e(boolean z8, boolean z9) {
        P0.m mVar;
        q qVarG = g();
        try {
            if (qVarG.f8861c) {
                qVarG.g();
            }
            qVarG.f();
            if (!z8) {
                int i8 = a.f14581a[j.e(this.f14575a, c.f14597b.c()).ordinal()];
                if (i8 == 1 || i8 == 2 || i8 == 3) {
                    qVarG.h();
                    return;
                }
            }
            P0.m mVarK2 = this.f14575a.k2();
            if (j.c(this.f14575a, z8, z9)) {
                FocusTargetNode focusTargetNode = this.f14575a;
                int i9 = a.f14582b[mVarK2.ordinal()];
                if (i9 == 1 || i9 == 2 || i9 == 3) {
                    mVar = P0.m.Active;
                } else {
                    if (i9 != 4) {
                        throw new C6.m();
                    }
                    mVar = P0.m.Inactive;
                }
                focusTargetNode.n2(mVar);
            }
            G g8 = G.f1419a;
            qVarG.h();
        } catch (Throwable th) {
            qVarG.h();
            throw th;
        }
    }

    @Override // P0.g
    public q g() {
        return this.f14577c;
    }

    @Override // P0.g
    public Q0.h h() {
        FocusTargetNode focusTargetNodeB = k.b(this.f14575a);
        if (focusTargetNodeB != null) {
            return k.d(focusTargetNodeB);
        }
        return null;
    }

    @Override // P0.f
    public boolean i(int i8) {
        FocusTargetNode focusTargetNodeB = k.b(this.f14575a);
        if (focusTargetNodeB == null) {
            return false;
        }
        g gVarA = k.a(focusTargetNodeB, i8, q());
        g.a aVar = g.f14622b;
        if (gVarA != aVar.b()) {
            return gVarA != aVar.a() && gVarA.c();
        }
        F f8 = new F();
        return !f8.f28775a && (k.e(this.f14575a, i8, q(), new b(focusTargetNodeB, this, i8, f8)) || u(i8));
    }

    @Override // P0.g
    public boolean j(KeyEvent keyEvent) {
        androidx.compose.ui.node.a aVarJ0;
        FocusTargetNode focusTargetNodeB = k.b(this.f14575a);
        if (focusTargetNodeB != null) {
            int iA = Z.a(131072);
            if (!focusTargetNodeB.I0().K1()) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            L0.i.c cVarH1 = focusTargetNodeB.I0().H1();
            p056g1.F fK = AbstractC2347k.k(focusTargetNodeB);
            while (fK != null) {
                if ((fK.j0().k().A1() & iA) != 0) {
                    while (cVarH1 != null) {
                        if ((cVarH1.F1() & iA) != 0) {
                            L0.i.c cVarG = cVarH1;
                            B0.d dVar = null;
                            while (cVarG != null) {
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
            p063h.s.a(null);
        }
        return false;
    }

    @Override // P0.g
    public void k() {
        j.c(this.f14575a, true, true);
    }

    @Override // P0.g
    public void l(P0.c cVar) {
        this.f14576b.d(cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18, types: [B0.d] */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21, types: [B0.d] */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v4, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v5, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r1v6, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r1v7, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [B0.d] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [B0.d] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19, types: [B0.d] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22, types: [B0.d] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    @Override // P0.g
    public boolean m(p029d1.c cVar) {
        p029d1.a aVar;
        int size;
        androidx.compose.ui.node.a aVarJ0;
        ?? G8;
        androidx.compose.ui.node.a aVarJ1;
        FocusTargetNode focusTargetNodeB = k.b(this.f14575a);
        if (focusTargetNodeB != null) {
            int iA = Z.a(16384);
            if (!focusTargetNodeB.I0().K1()) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            L0.i.c cVarH1 = focusTargetNodeB.I0().H1();
            p056g1.F fK = AbstractC2347k.k(focusTargetNodeB);
            loop0: while (true) {
                if (fK == null) {
                    G8 = 0;
                    break;
                }
                if ((fK.j0().k().A1() & iA) != 0) {
                    while (cVarH1 != null) {
                        if ((cVarH1.F1() & iA) != 0) {
                            ?? dVar = 0;
                            G8 = cVarH1;
                            while (G8 != 0) {
                                if (G8 instanceof p029d1.a) {
                                    break loop0;
                                }
                                if ((G8.F1() & iA) != 0 && (G8 instanceof AbstractC2348l)) {
                                    L0.i.c cVarE2 = ((AbstractC2348l) G8).e2();
                                    int i8 = 0;
                                    while (cVarE2 != null) {
                                        if ((cVarE2.F1() & iA) != 0) {
                                            i8++;
                                            if (i8 == 1) {
                                                G8 = G8;
                                                dVar = dVar;
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
                                        } else {
                                            G8 = G8;
                                            dVar = dVar;
                                        }
                                        cVarE2 = cVarE2.B1();
                                        G8 = G8;
                                        dVar = dVar;
                                    }
                                    if (i8 == 1) {
                                        G8 = G8;
                                        dVar = dVar;
                                    } else {
                                        G8 = G8;
                                        dVar = dVar;
                                    }
                                }
                                G8 = AbstractC2347k.g(dVar);
                            }
                        }
                        cVarH1 = cVarH1.H1();
                    }
                }
                fK = fK.m0();
                cVarH1 = (fK == null || (aVarJ1 = fK.j0()) == null) ? null : aVarJ1.p();
            }
            aVar = (p029d1.a) G8;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            int iA2 = Z.a(16384);
            if (!aVar.I0().K1()) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            L0.i.c cVarH2 = aVar.I0().H1();
            p056g1.F fK2 = AbstractC2347k.k(aVar);
            ArrayList arrayList = null;
            while (fK2 != null) {
                if ((fK2.j0().k().A1() & iA2) != 0) {
                    while (cVarH2 != null) {
                        if ((cVarH2.F1() & iA2) != 0) {
                            L0.i.c cVarG = cVarH2;
                            B0.d dVar2 = null;
                            while (cVarG != null) {
                                if (cVarG instanceof p029d1.a) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(cVarG);
                                } else if ((cVarG.F1() & iA2) != 0 && (cVarG instanceof AbstractC2348l)) {
                                    int i9 = 0;
                                    for (L0.i.c cVarE3 = ((AbstractC2348l) cVarG).e2(); cVarE3 != null; cVarE3 = cVarE3.B1()) {
                                        if ((cVarE3.F1() & iA2) != 0) {
                                            i9++;
                                            if (i9 == 1) {
                                                cVarG = cVarE3;
                                            } else {
                                                if (dVar2 == null) {
                                                    dVar2 = new B0.d(new L0.i.c[16], 0);
                                                }
                                                if (cVarG != null) {
                                                    dVar2.d(cVarG);
                                                    cVarG = null;
                                                }
                                                dVar2.d(cVarE3);
                                            }
                                        }
                                    }
                                    if (i9 == 1) {
                                    }
                                }
                                cVarG = AbstractC2347k.g(dVar2);
                            }
                        }
                        cVarH2 = cVarH2.H1();
                    }
                }
                fK2 = fK2.m0();
                cVarH2 = (fK2 == null || (aVarJ0 = fK2.j0()) == null) ? null : aVarJ0.p();
            }
            if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                while (true) {
                    int i10 = size - 1;
                    if (((p029d1.a) arrayList.get(size)).Q0(cVar)) {
                        return true;
                    }
                    if (i10 < 0) {
                        break;
                    }
                    size = i10;
                }
            }
            ?? I8 = aVar.I0();
            ?? dVar3 = 0;
            while (I8 != 0) {
                if (I8 instanceof p029d1.a) {
                    if (((p029d1.a) I8).Q0(cVar)) {
                        return true;
                    }
                } else if ((I8.F1() & iA2) != 0 && (I8 instanceof AbstractC2348l)) {
                    L0.i.c cVarE4 = ((AbstractC2348l) I8).e2();
                    int i11 = 0;
                    while (cVarE4 != null) {
                        if ((cVarE4.F1() & iA2) != 0) {
                            i11++;
                            if (i11 == 1) {
                                I8 = I8;
                                dVar3 = dVar3;
                                dVar3 = dVar3;
                                I8 = cVarE4;
                            } else {
                                if (dVar3 == 0) {
                                    dVar3 = new B0.d(new L0.i.c[16], 0);
                                }
                                if (I8 != 0) {
                                    dVar3.d(I8);
                                    I8 = 0;
                                }
                                dVar3.d(cVarE4);
                            }
                        } else {
                            I8 = I8;
                            dVar3 = dVar3;
                        }
                        cVarE4 = cVarE4.B1();
                        I8 = I8;
                        dVar3 = dVar3;
                    }
                    if (i11 == 1) {
                        I8 = I8;
                        dVar3 = dVar3;
                    } else {
                        I8 = I8;
                        dVar3 = dVar3;
                    }
                }
                I8 = AbstractC2347k.g(dVar3);
            }
            ?? I9 = aVar.I0();
            ?? dVar4 = 0;
            while (I9 != 0) {
                if (I9 instanceof p029d1.a) {
                    if (((p029d1.a) I9).q1(cVar)) {
                        return true;
                    }
                } else if ((I9.F1() & iA2) != 0 && (I9 instanceof AbstractC2348l)) {
                    L0.i.c cVarE5 = ((AbstractC2348l) I9).e2();
                    int i12 = 0;
                    while (cVarE5 != null) {
                        if ((cVarE5.F1() & iA2) != 0) {
                            i12++;
                            if (i12 == 1) {
                                I9 = I9;
                                dVar4 = dVar4;
                                dVar4 = dVar4;
                                I9 = cVarE5;
                            } else {
                                if (dVar4 == 0) {
                                    dVar4 = new B0.d(new L0.i.c[16], 0);
                                }
                                if (I9 != 0) {
                                    dVar4.d(I9);
                                    I9 = 0;
                                }
                                dVar4.d(cVarE5);
                            }
                        } else {
                            I9 = I9;
                            dVar4 = dVar4;
                        }
                        cVarE5 = cVarE5.B1();
                        I9 = I9;
                        dVar4 = dVar4;
                    }
                    if (i12 == 1) {
                        I9 = I9;
                        dVar4 = dVar4;
                    } else {
                        I9 = I9;
                        dVar4 = dVar4;
                    }
                }
                I9 = AbstractC2347k.g(dVar4);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    if (((p029d1.a) arrayList.get(i13)).q1(cVar)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // P0.f
    public void n(boolean z8) {
        e(z8, true);
    }

    @Override // P0.g
    public void o(P0.h hVar) {
        this.f14576b.e(hVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18, types: [B0.d] */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21, types: [B0.d] */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r2v10, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [B0.d] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15, types: [B0.d] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v4, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v5, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17, types: [B0.d] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20, types: [B0.d] */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v38, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference failed for: r9v40, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r9v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v42 */
    /* JADX WARN: Type inference failed for: r9v43 */
    /* JADX WARN: Type inference failed for: r9v44 */
    /* JADX WARN: Type inference failed for: r9v45 */
    /* JADX WARN: Type inference failed for: r9v46 */
    /* JADX WARN: Type inference failed for: r9v47 */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // P0.g
    public boolean p(KeyEvent keyEvent) {
        int size;
        androidx.compose.ui.node.a aVarJ0;
        ?? G8;
        androidx.compose.ui.node.a aVarJ1;
        if (!t(keyEvent)) {
            return false;
        }
        FocusTargetNode focusTargetNodeB = k.b(this.f14575a);
        if (focusTargetNodeB == null) {
            throw new IllegalStateException("Event can't be processed because we do not have an active focus target.");
        }
        L0.i.c cVarS = s(focusTargetNodeB);
        if (cVarS == null) {
            int iA = Z.a(8192);
            if (!focusTargetNodeB.I0().K1()) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            L0.i.c cVarH1 = focusTargetNodeB.I0().H1();
            p056g1.F fK = AbstractC2347k.k(focusTargetNodeB);
            loop0: while (true) {
                if (fK == null) {
                    G8 = 0;
                    break;
                }
                if ((fK.j0().k().A1() & iA) != 0) {
                    while (cVarH1 != null) {
                        if ((cVarH1.F1() & iA) != 0) {
                            ?? dVar = 0;
                            G8 = cVarH1;
                            while (G8 != 0) {
                                if (G8 instanceof Z0.e) {
                                    break loop0;
                                }
                                if ((G8.F1() & iA) != 0 && (G8 instanceof AbstractC2348l)) {
                                    L0.i.c cVarE2 = ((AbstractC2348l) G8).e2();
                                    int i8 = 0;
                                    while (cVarE2 != null) {
                                        if ((cVarE2.F1() & iA) != 0) {
                                            i8++;
                                            if (i8 == 1) {
                                                G8 = G8;
                                                dVar = dVar;
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
                                        } else {
                                            G8 = G8;
                                            dVar = dVar;
                                        }
                                        cVarE2 = cVarE2.B1();
                                        G8 = G8;
                                        dVar = dVar;
                                    }
                                    if (i8 == 1) {
                                        G8 = G8;
                                        dVar = dVar;
                                    } else {
                                        G8 = G8;
                                        dVar = dVar;
                                    }
                                }
                                G8 = AbstractC2347k.g(dVar);
                            }
                        }
                        cVarH1 = cVarH1.H1();
                    }
                }
                fK = fK.m0();
                cVarH1 = (fK == null || (aVarJ1 = fK.j0()) == null) ? null : aVarJ1.p();
            }
            Z0.e eVar = (Z0.e) G8;
            cVarS = eVar != null ? eVar.I0() : null;
        }
        if (cVarS != null) {
            int iA2 = Z.a(8192);
            if (!cVarS.I0().K1()) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            L0.i.c cVarH2 = cVarS.I0().H1();
            p056g1.F fK2 = AbstractC2347k.k(cVarS);
            ArrayList arrayList = null;
            while (fK2 != null) {
                if ((fK2.j0().k().A1() & iA2) != 0) {
                    while (cVarH2 != null) {
                        if ((cVarH2.F1() & iA2) != 0) {
                            L0.i.c cVarG = cVarH2;
                            B0.d dVar2 = null;
                            while (cVarG != null) {
                                if (cVarG instanceof Z0.e) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(cVarG);
                                } else if ((cVarG.F1() & iA2) != 0 && (cVarG instanceof AbstractC2348l)) {
                                    int i9 = 0;
                                    for (L0.i.c cVarE3 = ((AbstractC2348l) cVarG).e2(); cVarE3 != null; cVarE3 = cVarE3.B1()) {
                                        if ((cVarE3.F1() & iA2) != 0) {
                                            i9++;
                                            if (i9 == 1) {
                                                cVarG = cVarE3;
                                            } else {
                                                if (dVar2 == null) {
                                                    dVar2 = new B0.d(new L0.i.c[16], 0);
                                                }
                                                if (cVarG != null) {
                                                    dVar2.d(cVarG);
                                                    cVarG = null;
                                                }
                                                dVar2.d(cVarE3);
                                            }
                                        }
                                    }
                                    if (i9 == 1) {
                                    }
                                }
                                cVarG = AbstractC2347k.g(dVar2);
                            }
                        }
                        cVarH2 = cVarH2.H1();
                    }
                }
                fK2 = fK2.m0();
                cVarH2 = (fK2 == null || (aVarJ0 = fK2.j0()) == null) ? null : aVarJ0.p();
            }
            if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                while (true) {
                    int i10 = size - 1;
                    if (((Z0.e) arrayList.get(size)).y(keyEvent)) {
                        return true;
                    }
                    if (i10 < 0) {
                        break;
                    }
                    size = i10;
                }
            }
            ?? I8 = cVarS.I0();
            ?? dVar3 = 0;
            while (I8 != 0) {
                if (I8 instanceof Z0.e) {
                    if (((Z0.e) I8).y(keyEvent)) {
                        return true;
                    }
                } else if ((I8.F1() & iA2) != 0 && (I8 instanceof AbstractC2348l)) {
                    L0.i.c cVarE4 = ((AbstractC2348l) I8).e2();
                    int i11 = 0;
                    while (cVarE4 != null) {
                        if ((cVarE4.F1() & iA2) != 0) {
                            i11++;
                            if (i11 == 1) {
                                I8 = I8;
                                dVar3 = dVar3;
                                dVar3 = dVar3;
                                I8 = cVarE4;
                            } else {
                                if (dVar3 == 0) {
                                    dVar3 = new B0.d(new L0.i.c[16], 0);
                                }
                                if (I8 != 0) {
                                    dVar3.d(I8);
                                    I8 = 0;
                                }
                                dVar3.d(cVarE4);
                            }
                        } else {
                            I8 = I8;
                            dVar3 = dVar3;
                        }
                        cVarE4 = cVarE4.B1();
                        I8 = I8;
                        dVar3 = dVar3;
                    }
                    if (i11 == 1) {
                        I8 = I8;
                        dVar3 = dVar3;
                    } else {
                        I8 = I8;
                        dVar3 = dVar3;
                    }
                }
                I8 = AbstractC2347k.g(dVar3);
            }
            ?? I9 = cVarS.I0();
            ?? dVar4 = 0;
            while (I9 != 0) {
                if (I9 instanceof Z0.e) {
                    if (((Z0.e) I9).W(keyEvent)) {
                        return true;
                    }
                } else if ((I9.F1() & iA2) != 0 && (I9 instanceof AbstractC2348l)) {
                    L0.i.c cVarE5 = ((AbstractC2348l) I9).e2();
                    int i12 = 0;
                    while (cVarE5 != null) {
                        if ((cVarE5.F1() & iA2) != 0) {
                            i12++;
                            if (i12 == 1) {
                                I9 = I9;
                                dVar4 = dVar4;
                                dVar4 = dVar4;
                                I9 = cVarE5;
                            } else {
                                if (dVar4 == 0) {
                                    dVar4 = new B0.d(new L0.i.c[16], 0);
                                }
                                if (I9 != 0) {
                                    dVar4.d(I9);
                                    I9 = 0;
                                }
                                dVar4.d(cVarE5);
                            }
                        } else {
                            I9 = I9;
                            dVar4 = dVar4;
                        }
                        cVarE5 = cVarE5.B1();
                        I9 = I9;
                        dVar4 = dVar4;
                    }
                    if (i12 == 1) {
                        I9 = I9;
                        dVar4 = dVar4;
                    } else {
                        I9 = I9;
                        dVar4 = dVar4;
                    }
                }
                I9 = AbstractC2347k.g(dVar4);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    if (((Z0.e) arrayList.get(i13)).W(keyEvent)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public t q() {
        t tVar = this.f14579e;
        if (tVar != null) {
            return tVar;
        }
        kotlin.jvm.internal.t.t("layoutDirection");
        return null;
    }

    public final FocusTargetNode r() {
        return this.f14575a;
    }

    public final L0.i.c s(InterfaceC2346j interfaceC2346j) {
        int iA = Z.a(1024) | Z.a(8192);
        if (!interfaceC2346j.I0().K1()) {
            throw new IllegalStateException("visitLocalDescendants called on an unattached node");
        }
        L0.i.c cVarI0 = interfaceC2346j.I0();
        L0.i.c cVar = null;
        if ((cVarI0.A1() & iA) != 0) {
            for (L0.i.c cVarB1 = cVarI0.B1(); cVarB1 != null; cVarB1 = cVarB1.B1()) {
                if ((cVarB1.F1() & iA) != 0) {
                    if ((Z.a(1024) & cVarB1.F1()) != 0) {
                        return cVar;
                    }
                    cVar = cVarB1;
                }
            }
        }
        return cVar;
    }

    public final boolean t(KeyEvent keyEvent) {
        long jA = Z0.d.a(keyEvent);
        int iB = Z0.d.b(keyEvent);
        Z0.c.a aVar = Z0.c.f12836a;
        if (Z0.c.e(iB, aVar.a())) {
            s sVar = this.f14580f;
            if (sVar == null) {
                sVar = new s(3);
                this.f14580f = sVar;
            }
            sVar.k(jA);
        } else if (Z0.c.e(iB, aVar.b())) {
            s sVar2 = this.f14580f;
            if (sVar2 == null || !sVar2.a(jA)) {
                return false;
            }
            s sVar3 = this.f14580f;
            if (sVar3 != null) {
                sVar3.l(jA);
            }
        }
        return true;
    }

    public final boolean u(int i8) {
        if (this.f14575a.k2().c() && !this.f14575a.k2().a()) {
            c.a aVar = c.f14597b;
            if (c.l(i8, aVar.e()) ? true : c.l(i8, aVar.f())) {
                n(false);
                if (this.f14575a.k2().a()) {
                    return i(i8);
                }
                return false;
            }
        }
        return false;
    }
}
