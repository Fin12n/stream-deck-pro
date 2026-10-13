package p056g1;

import A1.n;
import A1.o;
import A1.r;
import A1.s;
import A1.t;
import J0.AbstractC1028k;
import Q0.m;
import R0.B0;
import R0.F0;
import R0.InterfaceC1586f0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.J;
import kotlin.jvm.internal.u;
import p038e1.AbstractC2248t;
import p038e1.C;
import p038e1.G;
import p038e1.I;
import p038e1.InterfaceC2247s;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class X extends O implements G, InterfaceC2247s, i0 {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final e f23495B = new e(null);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final Q6.k f23496C = d.f23523a;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final Q6.k f23497D = c.f23522a;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final androidx.compose.ui.graphics.d f23498E = new androidx.compose.ui.graphics.d();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final C2360y f23499F = new C2360y();

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final float[] f23500G = B0.c(null, 1, null);

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final f f23501H = new a();

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final f f23502I = new b();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public g0 f23503A;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final F f23504i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public X f23505j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public X f23506k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f23507l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f23508m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Q6.k f23509n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public I f23513r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Map f23514s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f23516u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Q0.d f23517v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C2360y f23518w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f23521z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public A1.d f23510o = h1().I();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public t f23511p = h1().getLayoutDirection();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f23512q = 0.8f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f23515t = n.f446b.a();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Q6.k f23519x = new g();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Function0 f23520y = new j();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements f {
        @Override // g1.X.f
        public int a() {
            return Z.a(16);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v0, types: [L0.i$c] */
        /* JADX WARN: Type inference failed for: r10v1, types: [L0.i$c] */
        /* JADX WARN: Type inference failed for: r10v10 */
        /* JADX WARN: Type inference failed for: r10v11 */
        /* JADX WARN: Type inference failed for: r10v12 */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r10v5, types: [L0.i$c] */
        /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v7 */
        /* JADX WARN: Type inference failed for: r10v8 */
        /* JADX WARN: Type inference failed for: r10v9 */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v10 */
        /* JADX WARN: Type inference failed for: r3v11 */
        /* JADX WARN: Type inference failed for: r3v2 */
        /* JADX WARN: Type inference failed for: r3v3, types: [B0.d] */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r3v5 */
        /* JADX WARN: Type inference failed for: r3v6, types: [B0.d] */
        /* JADX WARN: Type inference failed for: r3v8 */
        /* JADX WARN: Type inference failed for: r3v9 */
        /* JADX WARN: Type inference failed for: r5v4 */
        @Override // g1.X.f
        public boolean b(L0.i.c cVar) {
            int iA = Z.a(16);
            ?? dVar = 0;
            while (cVar != 0) {
                if (cVar instanceof m0) {
                    if (((m0) cVar).k0()) {
                        return true;
                    }
                } else if ((cVar.F1() & iA) != 0 && (cVar instanceof AbstractC2348l)) {
                    L0.i.c cVarE2 = ((AbstractC2348l) cVar).e2();
                    int i8 = 0;
                    while (cVarE2 != null) {
                        if ((cVarE2.F1() & iA) != 0) {
                            i8++;
                            if (i8 == 1) {
                                dVar = dVar;
                                cVar = cVar;
                                dVar = dVar;
                                cVar = cVarE2;
                            } else {
                                if (dVar == 0) {
                                    dVar = new B0.d(new L0.i.c[16], 0);
                                }
                                if (cVar != 0) {
                                    dVar.d(cVar);
                                    cVar = 0;
                                }
                                dVar.d(cVarE2);
                            }
                        } else {
                            dVar = dVar;
                            cVar = cVar;
                        }
                        cVarE2 = cVarE2.B1();
                        dVar = dVar;
                        cVar = cVar;
                    }
                    if (i8 == 1) {
                        dVar = dVar;
                        cVar = cVar;
                    } else {
                        dVar = dVar;
                        cVar = cVar;
                    }
                }
                cVar = AbstractC2347k.g(dVar);
            }
            return false;
        }

        @Override // g1.X.f
        public void c(F f8, long j8, C2355t c2355t, boolean z8, boolean z9) {
            f8.v0(j8, c2355t, z8, z9);
        }

        @Override // g1.X.f
        public boolean d(F f8) {
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements f {
        @Override // g1.X.f
        public int a() {
            return Z.a(8);
        }

        @Override // g1.X.f
        public boolean b(L0.i.c cVar) {
            return false;
        }

        @Override // g1.X.f
        public void c(F f8, long j8, C2355t c2355t, boolean z8, boolean z9) {
            f8.x0(j8, c2355t, z8, z9);
        }

        @Override // g1.X.f
        public boolean d(F f8) {
            p110m1.k kVarG = f8.G();
            boolean z8 = false;
            if (kVarG != null && kVarG.D()) {
                z8 = true;
            }
            return !z8;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f23522a = new c();

        public c() {
            super(1);
        }

        public final void b(X x8) {
            g0 g0VarD2 = x8.d2();
            if (g0VarD2 != null) {
                g0VarD2.invalidate();
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((X) obj);
            return C6.G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f23523a = new d();

        public d() {
            super(1);
        }

        public final void b(X x8) {
            if (x8.L()) {
                C2360y c2360y = x8.f23518w;
                if (c2360y == null) {
                    X.X2(x8, false, 1, null);
                    return;
                }
                X.f23499F.b(c2360y);
                X.X2(x8, false, 1, null);
                if (X.f23499F.c(c2360y)) {
                    return;
                }
                F fH1 = x8.h1();
                K kT = fH1.T();
                if (kT.s() > 0) {
                    if (kT.t() || kT.u()) {
                        F.k1(fH1, false, 1, null);
                    }
                    kT.F().H1();
                }
                h0 h0VarL0 = fH1.l0();
                if (h0VarL0 != null) {
                    h0VarL0.i(fH1);
                }
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((X) obj);
            return C6.G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e {
        public /* synthetic */ e(AbstractC2633k abstractC2633k) {
            this();
        }

        public final f a() {
            return X.f23501H;
        }

        public final f b() {
            return X.f23502I;
        }

        public e() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface f {
        int a();

        boolean b(L0.i.c cVar);

        void c(F f8, long j8, C2355t c2355t, boolean z8, boolean z9);

        boolean d(F f8);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends u implements Q6.k {

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ X f23525a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC1586f0 f23526b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(X x8, InterfaceC1586f0 interfaceC1586f0) {
                super(0);
                this.f23525a = x8;
                this.f23526b = interfaceC1586f0;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m207invoke();
                return C6.G.f1419a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m207invoke() {
                this.f23525a.U1(this.f23526b);
            }
        }

        public g() {
            super(1);
        }

        public final void b(InterfaceC1586f0 interfaceC1586f0) {
            if (!X.this.h1().f()) {
                X.this.f23521z = true;
            } else {
                X.this.h2().i(X.this, X.f23497D, new a(X.this, interfaceC1586f0));
                X.this.f23521z = false;
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((InterfaceC1586f0) obj);
            return C6.G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends u implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ L0.i.c f23528b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f f23529c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f23530d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ C2355t f23531e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f23532f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f23533g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(L0.i.c cVar, f fVar, long j8, C2355t c2355t, boolean z8, boolean z9) {
            super(0);
            this.f23528b = cVar;
            this.f23529c = fVar;
            this.f23530d = j8;
            this.f23531e = c2355t;
            this.f23532f = z8;
            this.f23533g = z9;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m208invoke();
            return C6.G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m208invoke() {
            X.this.p2(Y.b(this.f23528b, this.f23529c.a(), Z.a(2)), this.f23529c, this.f23530d, this.f23531e, this.f23532f, this.f23533g);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class i extends u implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ L0.i.c f23535b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f f23536c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f23537d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ C2355t f23538e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f23539f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f23540g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ float f23541h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(L0.i.c cVar, f fVar, long j8, C2355t c2355t, boolean z8, boolean z9, float f8) {
            super(0);
            this.f23535b = cVar;
            this.f23536c = fVar;
            this.f23537d = j8;
            this.f23538e = c2355t;
            this.f23539f = z8;
            this.f23540g = z9;
            this.f23541h = f8;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m209invoke();
            return C6.G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m209invoke() {
            X.this.q2(Y.b(this.f23535b, this.f23536c.a(), Z.a(2)), this.f23536c, this.f23537d, this.f23538e, this.f23539f, this.f23540g, this.f23541h);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class j extends u implements Function0 {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m210invoke();
            return C6.G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m210invoke() {
            X xK2 = X.this.k2();
            if (xK2 != null) {
                xK2.t2();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class k extends u implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ L0.i.c f23544b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f f23545c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f23546d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ C2355t f23547e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f23548f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f23549g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ float f23550h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(L0.i.c cVar, f fVar, long j8, C2355t c2355t, boolean z8, boolean z9, float f8) {
            super(0);
            this.f23544b = cVar;
            this.f23545c = fVar;
            this.f23546d = j8;
            this.f23547e = c2355t;
            this.f23548f = z8;
            this.f23549g = z9;
            this.f23550h = f8;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m211invoke();
            return C6.G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m211invoke() {
            X.this.O2(Y.b(this.f23544b, this.f23545c.a(), Z.a(2)), this.f23545c, this.f23546d, this.f23547e, this.f23548f, this.f23549g, this.f23550h);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class l extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Q6.k f23551a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Q6.k kVar) {
            super(0);
            this.f23551a = kVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m212invoke();
            return C6.G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m212invoke() {
            this.f23551a.invoke(X.f23498E);
        }
    }

    public X(F f8) {
        this.f23504i = f8;
    }

    public static /* synthetic */ void I2(X x8, Q0.d dVar, boolean z8, boolean z9, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
        }
        if ((i8 & 4) != 0) {
            z9 = false;
        }
        x8.H2(dVar, z8, z9);
    }

    public static /* synthetic */ void V2(X x8, Q6.k kVar, boolean z8, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerBlock");
        }
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        x8.U2(kVar, z8);
    }

    public static /* synthetic */ void X2(X x8, boolean z8, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerParameters");
        }
        if ((i8 & 1) != 0) {
            z8 = true;
        }
        x8.W2(z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j0 h2() {
        return J.b(h1()).getSnapshotObserver();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [B0.d] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [B0.d] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v4 */
    public void A2(int i8, int i9) {
        g0 g0Var = this.f23503A;
        if (g0Var != null) {
            g0Var.d(s.a(i8, i9));
        } else {
            X x8 = this.f23506k;
            if (x8 != null) {
                x8.t2();
            }
        }
        I0(s.a(i8, i9));
        W2(false);
        int iA = Z.a(4);
        boolean zI = a0.i(iA);
        L0.i.c cVarI2 = i2();
        if (zI || (cVarI2 = cVarI2.H1()) != null) {
            for (L0.i.c cVarO2 = o2(zI); cVarO2 != null && (cVarO2.A1() & iA) != 0; cVarO2 = cVarO2.B1()) {
                if ((cVarO2.F1() & iA) != 0) {
                    ?? G8 = cVarO2;
                    ?? dVar = 0;
                    while (G8 != 0) {
                        if (G8 instanceof InterfaceC2353q) {
                            ((InterfaceC2353q) G8).h0();
                        } else if ((G8.F1() & iA) != 0 && (G8 instanceof AbstractC2348l)) {
                            L0.i.c cVarE2 = ((AbstractC2348l) G8).e2();
                            int i10 = 0;
                            G8 = G8;
                            dVar = dVar;
                            while (cVarE2 != null) {
                                if ((cVarE2.F1() & iA) != 0) {
                                    i10++;
                                    if (i10 == 1) {
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
                            if (i10 == 1) {
                            }
                        }
                        G8 = AbstractC2347k.g(dVar);
                    }
                }
                if (cVarO2 == cVarI2) {
                    break;
                }
            }
        }
        h0 h0VarL0 = h1().l0();
        if (h0VarL0 != null) {
            h0VarL0.l(h1());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v3, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2, types: [B0.d] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [B0.d] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v5 */
    public final void B2() {
        L0.i.c cVarH1;
        if (m2(Z.a(128))) {
            AbstractC1028k abstractC1028kC = AbstractC1028k.f3974e.c();
            try {
                AbstractC1028k abstractC1028kL = abstractC1028kC.l();
                try {
                    int iA = Z.a(128);
                    boolean zI = a0.i(iA);
                    if (!zI) {
                        cVarH1 = i2().H1();
                        if (cVarH1 == null) {
                        }
                        C6.G g8 = C6.G.f1419a;
                        abstractC1028kC.s(abstractC1028kL);
                        abstractC1028kC.d();
                    }
                    cVarH1 = i2();
                    for (L0.i.c cVarO2 = o2(zI); cVarO2 != null && (cVarO2.A1() & iA) != 0; cVarO2 = cVarO2.B1()) {
                        if ((cVarO2.F1() & iA) != 0) {
                            ?? G8 = cVarO2;
                            ?? dVar = 0;
                            while (G8 != 0) {
                                if (G8 instanceof InterfaceC2361z) {
                                    ((InterfaceC2361z) G8).e(u0());
                                } else if ((G8.F1() & iA) != 0 && (G8 instanceof AbstractC2348l)) {
                                    L0.i.c cVarE2 = ((AbstractC2348l) G8).e2();
                                    int i8 = 0;
                                    G8 = G8;
                                    dVar = dVar;
                                    while (cVarE2 != null) {
                                        if ((cVarE2.F1() & iA) != 0) {
                                            i8++;
                                            if (i8 == 1) {
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
                                    if (i8 == 1) {
                                    }
                                }
                                G8 = AbstractC2347k.g(dVar);
                            }
                        }
                        if (cVarO2 == cVarH1) {
                            break;
                        }
                    }
                    C6.G g9 = C6.G.f1419a;
                    abstractC1028kC.s(abstractC1028kL);
                    abstractC1028kC.d();
                } catch (Throwable th) {
                    abstractC1028kC.s(abstractC1028kL);
                    throw th;
                }
            } catch (Throwable th2) {
                abstractC1028kC.d();
                throw th2;
            }
        }
    }

    @Override // p038e1.InterfaceC2247s
    public void C(InterfaceC2247s interfaceC2247s, float[] fArr) {
        X xP2 = P2(interfaceC2247s);
        xP2.x2();
        X xW1 = W1(xP2);
        B0.h(fArr);
        xP2.T2(xW1, fArr);
        S2(xW1, fArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [B0.d] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [B0.d] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void C2() {
        int iA = Z.a(128);
        boolean zI = a0.i(iA);
        L0.i.c cVarI2 = i2();
        if (!zI && (cVarI2 = cVarI2.H1()) == null) {
            return;
        }
        for (L0.i.c cVarO2 = o2(zI); cVarO2 != null && (cVarO2.A1() & iA) != 0; cVarO2 = cVarO2.B1()) {
            if ((cVarO2.F1() & iA) != 0) {
                ?? G8 = cVarO2;
                ?? dVar = 0;
                while (G8 != 0) {
                    if (G8 instanceof InterfaceC2361z) {
                        ((InterfaceC2361z) G8).R(this);
                    } else if ((G8.F1() & iA) != 0 && (G8 instanceof AbstractC2348l)) {
                        L0.i.c cVarE2 = ((AbstractC2348l) G8).e2();
                        int i8 = 0;
                        G8 = G8;
                        dVar = dVar;
                        while (cVarE2 != null) {
                            if ((cVarE2.F1() & iA) != 0) {
                                i8++;
                                if (i8 == 1) {
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
                        if (i8 == 1) {
                        }
                    }
                    G8 = AbstractC2347k.g(dVar);
                }
            }
            if (cVarO2 == cVarI2) {
                return;
            }
        }
    }

    @Override // p038e1.a0
    public void D0(long j8, float f8, Q6.k kVar) {
        F2(j8, f8, kVar);
    }

    public final void D2() {
        this.f23507l = true;
        this.f23520y.invoke();
        if (this.f23503A != null) {
            V2(this, null, false, 2, null);
        }
    }

    public void E2(InterfaceC1586f0 interfaceC1586f0) {
        X x8 = this.f23505j;
        if (x8 != null) {
            x8.S1(interfaceC1586f0);
        }
    }

    public final void F2(long j8, float f8, Q6.k kVar) {
        V2(this, kVar, false, 2, null);
        if (!n.i(f1(), j8)) {
            K2(j8);
            h1().T().F().H1();
            g0 g0Var = this.f23503A;
            if (g0Var != null) {
                g0Var.i(j8);
            } else {
                X x8 = this.f23506k;
                if (x8 != null) {
                    x8.t2();
                }
            }
            g1(this);
            h0 h0VarL0 = h1().l0();
            if (h0VarL0 != null) {
                h0VarL0.l(h1());
            }
        }
        this.f23516u = f8;
    }

    public final void G2(long j8, float f8, Q6.k kVar) {
        long jG0 = g0();
        F2(o.a(n.j(j8) + n.j(jG0), n.k(j8) + n.k(jG0)), f8, kVar);
    }

    public final void H2(Q0.d dVar, boolean z8, boolean z9) {
        g0 g0Var = this.f23503A;
        if (g0Var != null) {
            if (this.f23508m) {
                if (z9) {
                    long jF2 = f2();
                    float fI = Q0.l.i(jF2) / 2.0f;
                    float fG = Q0.l.g(jF2) / 2.0f;
                    dVar.e(-fI, -fG, r.g(a()) + fI, r.f(a()) + fG);
                } else if (z8) {
                    dVar.e(0.0f, 0.0f, r.g(a()), r.f(a()));
                }
                if (dVar.f()) {
                    return;
                }
            }
            g0Var.g(dVar, false);
        }
        float fJ = n.j(f1());
        dVar.i(dVar.b() + fJ);
        dVar.j(dVar.c() + fJ);
        float fK = n.k(f1());
        dVar.k(dVar.d() + fK);
        dVar.h(dVar.a() + fK);
    }

    public void J2(I i8) {
        I i9 = this.f23513r;
        if (i8 != i9) {
            this.f23513r = i8;
            if (i9 == null || i8.g() != i9.g() || i8.f() != i9.f()) {
                A2(i8.g(), i8.f());
            }
            Map map = this.f23514s;
            if (((map == null || map.isEmpty()) && i8.c().isEmpty()) || kotlin.jvm.internal.t.c(i8.c(), this.f23514s)) {
                return;
            }
            Z1().c().m();
            Map linkedHashMap = this.f23514s;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                this.f23514s = linkedHashMap;
            }
            linkedHashMap.clear();
            linkedHashMap.putAll(i8.c());
        }
    }

    @Override // p038e1.InterfaceC2247s
    public long K(long j8) {
        if (!y()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        InterfaceC2247s interfaceC2247sD = AbstractC2248t.d(this);
        return o(interfaceC2247sD, Q0.f.s(J.b(h1()).g(j8), AbstractC2248t.e(interfaceC2247sD)));
    }

    public void K2(long j8) {
        this.f23515t = j8;
    }

    @Override // p056g1.i0
    public boolean L() {
        return (this.f23503A == null || this.f23507l || !h1().I0()) ? false : true;
    }

    public final void L2(X x8) {
        this.f23505j = x8;
    }

    public final void M2(X x8) {
        this.f23506k = x8;
    }

    @Override // p038e1.InterfaceC2247s
    public final InterfaceC2247s N() {
        if (!y()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        x2();
        return h1().k0().f23506k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [B0.d] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [B0.d] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public final boolean N2() {
        L0.i.c cVarO2 = o2(a0.i(Z.a(16)));
        if (cVarO2 != null && cVarO2.K1()) {
            int iA = Z.a(16);
            if (!cVarO2.I0().K1()) {
                throw new IllegalStateException("visitLocalDescendants called on an unattached node");
            }
            L0.i.c cVarI0 = cVarO2.I0();
            if ((cVarI0.A1() & iA) != 0) {
                for (L0.i.c cVarB1 = cVarI0.B1(); cVarB1 != null; cVarB1 = cVarB1.B1()) {
                    if ((cVarB1.F1() & iA) != 0) {
                        ?? G8 = cVarB1;
                        ?? dVar = 0;
                        while (G8 != 0) {
                            if (G8 instanceof m0) {
                                if (((m0) G8).d1()) {
                                    return true;
                                }
                            } else if ((G8.F1() & iA) != 0 && (G8 instanceof AbstractC2348l)) {
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
                }
            }
        }
        return false;
    }

    @Override // p038e1.InterfaceC2247s
    public Q0.h O(InterfaceC2247s interfaceC2247s, boolean z8) {
        if (!y()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!interfaceC2247s.y()) {
            throw new IllegalStateException(("LayoutCoordinates " + interfaceC2247s + " is not attached!").toString());
        }
        X xP2 = P2(interfaceC2247s);
        xP2.x2();
        X xW1 = W1(xP2);
        Q0.d dVarG2 = g2();
        dVarG2.i(0.0f);
        dVarG2.k(0.0f);
        dVarG2.j(r.g(interfaceC2247s.a()));
        dVarG2.h(r.f(interfaceC2247s.a()));
        X x8 = xP2;
        while (x8 != xW1) {
            boolean z9 = z8;
            I2(x8, dVarG2, z9, false, 4, null);
            if (dVarG2.f()) {
                return Q0.h.f9087e.a();
            }
            x8 = x8.f23506k;
            kotlin.jvm.internal.t.d(x8);
            z8 = z9;
        }
        O1(xW1, dVarG2, z8);
        return Q0.e.a(dVarG2);
    }

    @Override // p056g1.O
    public O O0() {
        return this.f23505j;
    }

    public final void O1(X x8, Q0.d dVar, boolean z8) {
        if (x8 == this) {
            return;
        }
        X x9 = this.f23506k;
        if (x9 != null) {
            x9.O1(x8, dVar, z8);
        }
        Y1(dVar, z8);
    }

    public final void O2(L0.i.c cVar, f fVar, long j8, C2355t c2355t, boolean z8, boolean z9, float f8) {
        if (cVar == null) {
            s2(fVar, j8, c2355t, z8, z9);
        } else if (fVar.b(cVar)) {
            c2355t.L(cVar, f8, z9, new k(cVar, fVar, j8, c2355t, z8, z9, f8));
        } else {
            O2(Y.b(cVar, fVar.a(), Z.a(2)), fVar, j8, c2355t, z8, z9, f8);
        }
    }

    public final long P1(X x8, long j8) {
        if (x8 == this) {
            return j8;
        }
        X x9 = this.f23506k;
        return (x9 == null || kotlin.jvm.internal.t.c(x8, x9)) ? X1(j8) : X1(x9.P1(x8, j8));
    }

    public final X P2(InterfaceC2247s interfaceC2247s) {
        X xB;
        C c8 = interfaceC2247s instanceof C ? (C) interfaceC2247s : null;
        if (c8 != null && (xB = c8.b()) != null) {
            return xB;
        }
        kotlin.jvm.internal.t.e(interfaceC2247s, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (X) interfaceC2247s;
    }

    @Override // p056g1.O
    public boolean Q0() {
        return this.f23513r != null;
    }

    public final long Q1(long j8) {
        return m.a(Math.max(0.0f, (Q0.l.i(j8) - v0()) / 2.0f), Math.max(0.0f, (Q0.l.g(j8) - k0()) / 2.0f));
    }

    public long Q2(long j8) {
        g0 g0Var = this.f23503A;
        if (g0Var != null) {
            j8 = g0Var.c(j8, false);
        }
        return o.c(j8, f1());
    }

    public final float R1(long j8, long j9) {
        if (v0() >= Q0.l.i(j9) && k0() >= Q0.l.g(j9)) {
            return Float.POSITIVE_INFINITY;
        }
        long jQ1 = Q1(j9);
        float fI = Q0.l.i(jQ1);
        float fG = Q0.l.g(jQ1);
        long jW2 = w2(j8);
        if ((fI > 0.0f || fG > 0.0f) && Q0.f.o(jW2) <= fI && Q0.f.p(jW2) <= fG) {
            return Q0.f.n(jW2);
        }
        return Float.POSITIVE_INFINITY;
    }

    public final Q0.h R2() {
        if (!y()) {
            return Q0.h.f9087e.a();
        }
        InterfaceC2247s interfaceC2247sD = AbstractC2248t.d(this);
        Q0.d dVarG2 = g2();
        long jQ1 = Q1(f2());
        dVarG2.i(-Q0.l.i(jQ1));
        dVarG2.k(-Q0.l.g(jQ1));
        dVarG2.j(v0() + Q0.l.i(jQ1));
        dVarG2.h(k0() + Q0.l.g(jQ1));
        X x8 = this;
        while (x8 != interfaceC2247sD) {
            x8.H2(dVarG2, false, true);
            if (dVarG2.f()) {
                return Q0.h.f9087e.a();
            }
            x8 = x8.f23506k;
            kotlin.jvm.internal.t.d(x8);
        }
        return Q0.e.a(dVarG2);
    }

    @Override // p038e1.InterfaceC2247s
    public long S(long j8) {
        if (!y()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        x2();
        for (X x8 = this; x8 != null; x8 = x8.f23506k) {
            j8 = x8.Q2(j8);
        }
        return j8;
    }

    public final void S1(InterfaceC1586f0 interfaceC1586f0) {
        g0 g0Var = this.f23503A;
        if (g0Var != null) {
            g0Var.f(interfaceC1586f0);
            return;
        }
        float fJ = n.j(f1());
        float fK = n.k(f1());
        interfaceC1586f0.d(fJ, fK);
        U1(interfaceC1586f0);
        interfaceC1586f0.d(-fJ, -fK);
    }

    public final void S2(X x8, float[] fArr) {
        if (kotlin.jvm.internal.t.c(x8, this)) {
            return;
        }
        X x9 = this.f23506k;
        kotlin.jvm.internal.t.d(x9);
        x9.S2(x8, fArr);
        if (!n.i(f1(), n.f446b.a())) {
            float[] fArr2 = f23500G;
            B0.h(fArr2);
            B0.n(fArr2, -n.j(f1()), -n.k(f1()), 0.0f, 4, null);
            B0.k(fArr, fArr2);
        }
        g0 g0Var = this.f23503A;
        if (g0Var != null) {
            g0Var.h(fArr);
        }
    }

    @Override // p056g1.O
    public I T0() {
        I i8 = this.f23513r;
        if (i8 != null) {
            return i8;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    public final void T1(InterfaceC1586f0 interfaceC1586f0, F0 f8) {
        interfaceC1586f0.w(new Q0.h(0.5f, 0.5f, r.g(u0()) - 0.5f, r.f(u0()) - 0.5f), f8);
    }

    public final void T2(X x8, float[] fArr) {
        X x9 = this;
        while (!kotlin.jvm.internal.t.c(x9, x8)) {
            g0 g0Var = x9.f23503A;
            if (g0Var != null) {
                g0Var.a(fArr);
            }
            long jF1 = x9.f1();
            if (!n.i(jF1, n.f446b.a())) {
                float[] fArr2 = f23500G;
                B0.h(fArr2);
                B0.n(fArr2, n.j(jF1), n.k(jF1), 0.0f, 4, null);
                B0.k(fArr, fArr2);
            }
            x9 = x9.f23506k;
            kotlin.jvm.internal.t.d(x9);
        }
    }

    public final void U1(InterfaceC1586f0 interfaceC1586f0) {
        L0.i.c cVarN2 = n2(Z.a(4));
        if (cVarN2 == null) {
            E2(interfaceC1586f0);
        } else {
            h1().a0().c(interfaceC1586f0, s.c(a()), this, cVarN2);
        }
    }

    public final void U2(Q6.k kVar, boolean z8) {
        h0 h0VarL0;
        F fH1 = h1();
        boolean z9 = (!z8 && this.f23509n == kVar && kotlin.jvm.internal.t.c(this.f23510o, fH1.I()) && this.f23511p == fH1.getLayoutDirection()) ? false : true;
        this.f23509n = kVar;
        this.f23510o = fH1.I();
        this.f23511p = fH1.getLayoutDirection();
        if (!fH1.I0() || kVar == null) {
            g0 g0Var = this.f23503A;
            if (g0Var != null) {
                g0Var.destroy();
                fH1.r1(true);
                this.f23520y.invoke();
                if (y() && (h0VarL0 = fH1.l0()) != null) {
                    h0VarL0.l(fH1);
                }
            }
            this.f23503A = null;
            this.f23521z = false;
            return;
        }
        if (this.f23503A != null) {
            if (z9) {
                X2(this, false, 1, null);
                return;
            }
            return;
        }
        g0 g0VarK = J.b(fH1).k(this.f23519x, this.f23520y);
        g0VarK.d(u0());
        g0VarK.i(f1());
        this.f23503A = g0VarK;
        X2(this, false, 1, null);
        fH1.r1(true);
        this.f23520y.invoke();
    }

    public abstract void V1();

    public final X W1(X x8) {
        F fH1 = x8.h1();
        F fH2 = h1();
        if (fH1 == fH2) {
            L0.i.c cVarI2 = x8.i2();
            L0.i.c cVarI3 = i2();
            int iA = Z.a(2);
            if (!cVarI3.I0().K1()) {
                throw new IllegalStateException("visitLocalAncestors called on an unattached node");
            }
            for (L0.i.c cVarH1 = cVarI3.I0().H1(); cVarH1 != null; cVarH1 = cVarH1.H1()) {
                if ((cVarH1.F1() & iA) != 0 && cVarH1 == cVarI2) {
                    return x8;
                }
            }
            return this;
        }
        while (fH1.J() > fH2.J()) {
            fH1 = fH1.m0();
            kotlin.jvm.internal.t.d(fH1);
        }
        while (fH2.J() > fH1.J()) {
            fH2 = fH2.m0();
            kotlin.jvm.internal.t.d(fH2);
        }
        while (fH1 != fH2) {
            fH1 = fH1.m0();
            fH2 = fH2.m0();
            if (fH1 == null || fH2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (fH2 != h1()) {
            if (fH1 != x8.h1()) {
                return fH1.O();
            }
            return x8;
        }
        return this;
    }

    public final void W2(boolean z8) {
        h0 h0VarL0;
        g0 g0Var = this.f23503A;
        if (g0Var == null) {
            if (this.f23509n != null) {
                throw new IllegalStateException("null layer with a non-null layerBlock");
            }
            return;
        }
        Q6.k kVar = this.f23509n;
        if (kVar == null) {
            throw new IllegalStateException("updateLayerParameters requires a non-null layerBlock");
        }
        androidx.compose.ui.graphics.d dVar = f23498E;
        dVar.u();
        dVar.y(h1().I());
        dVar.C(s.c(a()));
        h2().i(this, f23496C, new l(kVar));
        C2360y c2360y = this.f23518w;
        if (c2360y == null) {
            c2360y = new C2360y();
            this.f23518w = c2360y;
        }
        c2360y.a(dVar);
        g0Var.e(dVar, h1().getLayoutDirection(), h1().I());
        this.f23508m = dVar.f();
        this.f23512q = dVar.c();
        if (!z8 || (h0VarL0 = h1().l0()) == null) {
            return;
        }
        h0VarL0.l(h1());
    }

    public long X1(long j8) {
        long jB = o.b(j8, f1());
        g0 g0Var = this.f23503A;
        return g0Var != null ? g0Var.c(jB, true) : jB;
    }

    public final void Y1(Q0.d dVar, boolean z8) {
        float fJ = n.j(f1());
        dVar.i(dVar.b() - fJ);
        dVar.j(dVar.c() - fJ);
        float fK = n.k(f1());
        dVar.k(dVar.d() - fK);
        dVar.h(dVar.a() - fK);
        g0 g0Var = this.f23503A;
        if (g0Var != null) {
            g0Var.g(dVar, true);
            if (this.f23508m && z8) {
                dVar.e(0.0f, 0.0f, r.g(a()), r.f(a()));
                dVar.f();
            }
        }
    }

    public final boolean Y2(long j8) {
        if (!Q0.g.b(j8)) {
            return false;
        }
        g0 g0Var = this.f23503A;
        return g0Var == null || !this.f23508m || g0Var.b(j8);
    }

    public InterfaceC2338b Z1() {
        return h1().T().r();
    }

    @Override // p038e1.InterfaceC2247s
    public final long a() {
        return u0();
    }

    public final boolean b2() {
        return this.f23521z;
    }

    public final long c2() {
        return w0();
    }

    public final g0 d2() {
        return this.f23503A;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [B0.d] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [B0.d] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v6 */
    @Override // p038e1.K, p038e1.InterfaceC2243n
    public Object e() {
        if (!h1().j0().r(Z.a(64))) {
            return null;
        }
        i2();
        J j8 = new J();
        for (L0.i.c cVarP = h1().j0().p(); cVarP != null; cVarP = cVarP.H1()) {
            if ((Z.a(64) & cVarP.F1()) != 0) {
                int iA = Z.a(64);
                ?? dVar = 0;
                ?? G8 = cVarP;
                while (G8 != 0) {
                    if (G8 instanceof k0) {
                        j8.f28779a = ((k0) G8).f(h1().I(), j8.f28779a);
                    } else if ((G8.F1() & iA) != 0 && (G8 instanceof AbstractC2348l)) {
                        L0.i.c cVarE2 = ((AbstractC2348l) G8).e2();
                        int i8 = 0;
                        G8 = G8;
                        dVar = dVar;
                        while (cVarE2 != null) {
                            if ((cVarE2.F1() & iA) != 0) {
                                i8++;
                                if (i8 == 1) {
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
                        if (i8 == 1) {
                        }
                    }
                    G8 = AbstractC2347k.g(dVar);
                }
            }
        }
        return j8.f28779a;
    }

    public abstract P e2();

    @Override // p056g1.O
    public long f1() {
        return this.f23515t;
    }

    public final long f2() {
        return this.f23510o.i1(h1().q0().d());
    }

    public final Q0.d g2() {
        Q0.d dVar = this.f23517v;
        if (dVar != null) {
            return dVar;
        }
        Q0.d dVar2 = new Q0.d(0.0f, 0.0f, 0.0f, 0.0f);
        this.f23517v = dVar2;
        return dVar2;
    }

    @Override // A1.d
    public float getDensity() {
        return h1().I().getDensity();
    }

    @Override // p038e1.InterfaceC2244o
    public t getLayoutDirection() {
        return h1().getLayoutDirection();
    }

    @Override // p056g1.S
    public F h1() {
        return this.f23504i;
    }

    public abstract L0.i.c i2();

    public final X j2() {
        return this.f23505j;
    }

    public final X k2() {
        return this.f23506k;
    }

    public final float l2() {
        return this.f23516u;
    }

    public final boolean m2(int i8) {
        L0.i.c cVarO2 = o2(a0.i(i8));
        return cVarO2 != null && AbstractC2347k.e(cVarO2, i8);
    }

    @Override // p038e1.InterfaceC2247s
    public long n(long j8) {
        return J.b(h1()).f(S(j8));
    }

    public final L0.i.c n2(int i8) {
        boolean zI = a0.i(i8);
        L0.i.c cVarI2 = i2();
        if (!zI && (cVarI2 = cVarI2.H1()) == null) {
            return null;
        }
        for (L0.i.c cVarO2 = o2(zI); cVarO2 != null && (cVarO2.A1() & i8) != 0; cVarO2 = cVarO2.B1()) {
            if ((cVarO2.F1() & i8) != 0) {
                return cVarO2;
            }
            if (cVarO2 == cVarI2) {
                return null;
            }
        }
        return null;
    }

    @Override // p038e1.InterfaceC2247s
    public long o(InterfaceC2247s interfaceC2247s, long j8) {
        if (interfaceC2247s instanceof C) {
            return Q0.f.w(interfaceC2247s.o(this, Q0.f.w(j8)));
        }
        X xP2 = P2(interfaceC2247s);
        xP2.x2();
        X xW1 = W1(xP2);
        while (xP2 != xW1) {
            j8 = xP2.Q2(j8);
            xP2 = xP2.f23506k;
            kotlin.jvm.internal.t.d(xP2);
        }
        return P1(xW1, j8);
    }

    @Override // p056g1.O
    public void o1() {
        D0(f1(), this.f23516u, this.f23509n);
    }

    public final L0.i.c o2(boolean z8) {
        L0.i.c cVarI2;
        if (h1().k0() == this) {
            return h1().j0().k();
        }
        if (!z8) {
            X x8 = this.f23506k;
            if (x8 != null) {
                return x8.i2();
            }
            return null;
        }
        X x9 = this.f23506k;
        if (x9 == null || (cVarI2 = x9.i2()) == null) {
            return null;
        }
        return cVarI2.B1();
    }

    public final void p2(L0.i.c cVar, f fVar, long j8, C2355t c2355t, boolean z8, boolean z9) {
        if (cVar == null) {
            s2(fVar, j8, c2355t, z8, z9);
        } else {
            c2355t.F(cVar, z9, new h(cVar, fVar, j8, c2355t, z8, z9));
        }
    }

    public final void q2(L0.i.c cVar, f fVar, long j8, C2355t c2355t, boolean z8, boolean z9, float f8) {
        if (cVar == null) {
            s2(fVar, j8, c2355t, z8, z9);
        } else {
            c2355t.G(cVar, f8, z9, new i(cVar, fVar, j8, c2355t, z8, z9, f8));
        }
    }

    public final void r2(f fVar, long j8, C2355t c2355t, boolean z8, boolean z9) {
        L0.i.c cVarN2 = n2(fVar.a());
        if (!Y2(j8)) {
            if (z8) {
                float fR1 = R1(j8, f2());
                if (Float.isInfinite(fR1) || Float.isNaN(fR1) || !c2355t.I(fR1, false)) {
                    return;
                }
                q2(cVarN2, fVar, j8, c2355t, z8, false, fR1);
                return;
            }
            return;
        }
        if (cVarN2 == null) {
            s2(fVar, j8, c2355t, z8, z9);
            return;
        }
        if (u2(j8)) {
            p2(cVarN2, fVar, j8, c2355t, z8, z9);
            return;
        }
        float fR2 = !z8 ? Float.POSITIVE_INFINITY : R1(j8, f2());
        if (Float.isInfinite(fR2) || Float.isNaN(fR2) || !c2355t.I(fR2, z9)) {
            O2(cVarN2, fVar, j8, c2355t, z8, z9, fR2);
        } else {
            q2(cVarN2, fVar, j8, c2355t, z8, z9, fR2);
        }
    }

    public void s2(f fVar, long j8, C2355t c2355t, boolean z8, boolean z9) {
        X x8 = this.f23505j;
        if (x8 != null) {
            x8.r2(fVar, x8.X1(j8), c2355t, z8, z9);
        }
    }

    public void t2() {
        g0 g0Var = this.f23503A;
        if (g0Var != null) {
            g0Var.invalidate();
            return;
        }
        X x8 = this.f23506k;
        if (x8 != null) {
            x8.t2();
        }
    }

    public final boolean u2(long j8) {
        float fO = Q0.f.o(j8);
        float fP = Q0.f.p(j8);
        return fO >= 0.0f && fP >= 0.0f && fO < ((float) v0()) && fP < ((float) k0());
    }

    public final boolean v2() {
        if (this.f23503A != null && this.f23512q <= 0.0f) {
            return true;
        }
        X x8 = this.f23506k;
        if (x8 != null) {
            return x8.v2();
        }
        return false;
    }

    public final long w2(long j8) {
        float fO = Q0.f.o(j8);
        float fMax = Math.max(0.0f, fO < 0.0f ? -fO : fO - v0());
        float fP = Q0.f.p(j8);
        return Q0.g.a(fMax, Math.max(0.0f, fP < 0.0f ? -fP : fP - k0()));
    }

    @Override // A1.l
    public float x0() {
        return h1().I().x0();
    }

    public final void x2() {
        h1().T().P();
    }

    @Override // p038e1.InterfaceC2247s
    public boolean y() {
        return i2().K1();
    }

    public void y2() {
        g0 g0Var = this.f23503A;
        if (g0Var != null) {
            g0Var.invalidate();
        }
    }

    public final void z2() {
        U2(this.f23509n, true);
        g0 g0Var = this.f23503A;
        if (g0Var != null) {
            g0Var.invalidate();
        }
    }

    public InterfaceC2247s a2() {
        return this;
    }
}
