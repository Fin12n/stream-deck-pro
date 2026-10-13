package p038e1;

import A1.n;
import A1.r;
import A1.s;
import C6.G;
import Q6.k;
import Q6.p;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.J;
import p056g1.A;
import p056g1.AbstractC2347k;
import p056g1.AbstractC2348l;
import p056g1.F;
import p056g1.P;
import p056g1.X;
import p056g1.Z;
import p056g1.b0;

/* JADX INFO: renamed from: e1.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2242m extends L0.i.c implements A {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p f20506n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b f20507o = new b();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final F f20508p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public E f20509q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f20510r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public A1.b f20511s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a f20512t;

    /* JADX INFO: renamed from: e1.m$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class a extends a0 implements G {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public G f20513f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public a0 f20514g;

        public a(G g8) {
            this.f20513f = g8;
        }

        @Override // p038e1.a0
        public void D0(long j8, float f8, k kVar) {
            float f9;
            G g8;
            if (!C2242m.this.h2()) {
                j8 = n.f446b.a();
            }
            long j9 = j8;
            X xC1 = C2242m.this.I0().C1();
            t.d(xC1);
            a0.a aVarD1 = xC1.d1();
            if (kVar != null) {
                a0 a0Var = this.f20514g;
                f9 = f8;
                if (a0Var != null) {
                    aVarD1.s(a0Var, j9, f9, kVar);
                    g8 = G.f1419a;
                } else {
                    g8 = null;
                }
                if (g8 != null) {
                    return;
                }
            } else {
                f9 = f8;
            }
            a0 a0Var2 = this.f20514g;
            if (a0Var2 != null) {
                aVarD1.g(a0Var2, j9, f9);
                G g9 = G.f1419a;
            }
        }

        @Override // p038e1.InterfaceC2243n
        public int F(int i8) {
            return this.f20513f.F(i8);
        }

        @Override // p038e1.InterfaceC2243n
        public int G(int i8) {
            return this.f20513f.G(i8);
        }

        @Override // p038e1.G
        public a0 J(long j8) {
            a0 a0VarJ;
            if (C2242m.this.h2()) {
                a0VarJ = this.f20513f.J(j8);
                J0(j8);
                I0(s.a(a0VarJ.y0(), a0VarJ.h0()));
            } else {
                G g8 = this.f20513f;
                A1.b bVar = C2242m.this.f20511s;
                t.d(bVar);
                a0VarJ = g8.J(bVar.s());
                C2242m c2242m = C2242m.this;
                A1.b bVar2 = c2242m.f20511s;
                t.d(bVar2);
                J0(bVar2.s());
                I0(c2242m.h2() ? s.a(a0VarJ.y0(), a0VarJ.h0()) : c2242m.f20507o.f());
            }
            this.f20514g = a0VarJ;
            return this;
        }

        public final void L0(G g8) {
            this.f20513f = g8;
        }

        @Override // p038e1.K
        public int Q(AbstractC2230a abstractC2230a) {
            a0 a0Var = this.f20514g;
            t.d(a0Var);
            return a0Var.Q(abstractC2230a);
        }

        @Override // p038e1.InterfaceC2243n
        public int W(int i8) {
            return this.f20513f.W(i8);
        }

        @Override // p038e1.K, p038e1.InterfaceC2243n
        public Object e() {
            return this.f20513f.e();
        }

        @Override // p038e1.InterfaceC2243n
        public int g(int i8) {
            return this.f20513f.g(i8);
        }
    }

    /* JADX INFO: renamed from: e1.m$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class b implements E, J, J {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f20516a = r.f455b.a();

        /* JADX INFO: renamed from: e1.m$b$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements I {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f20518a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f20519b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Map f20520c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ k f20521d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ C2242m f20522e;

            public a(int i8, int i9, Map map, k kVar, C2242m c2242m) {
                this.f20521d = kVar;
                this.f20522e = c2242m;
                this.f20518a = i8;
                this.f20519b = i9;
                this.f20520c = map;
            }

            @Override // p038e1.I
            public Map c() {
                return this.f20520c;
            }

            @Override // p038e1.I
            public void d() {
                k kVar = this.f20521d;
                X xC1 = this.f20522e.C1();
                t.d(xC1);
                kVar.invoke(xC1.d1());
            }

            @Override // p038e1.I
            public int f() {
                return this.f20519b;
            }

            @Override // p038e1.I
            public int g() {
                return this.f20518a;
            }
        }

        public b() {
        }

        @Override // p038e1.InterfaceC2244o
        public boolean B0() {
            return false;
        }

        @Override // p038e1.J
        public I b1(int i8, int i9, Map map, k kVar) {
            if ((i8 & (-16777216)) == 0 && ((-16777216) & i9) == 0) {
                return new a(i8, i9, map, kVar, C2242m.this);
            }
            throw new IllegalStateException(("Size(" + i8 + " x " + i9 + ") is out of range. Each dimension must be between 0 and 16777215.").toString());
        }

        public long f() {
            return this.f20516a;
        }

        public void g(long j8) {
            this.f20516a = j8;
        }

        @Override // p017b7.J
        public G6.g getCoroutineContext() {
            return C2242m.this.D1().getCoroutineContext();
        }

        @Override // A1.d
        public float getDensity() {
            X xC1 = C2242m.this.C1();
            t.d(xC1);
            return xC1.getDensity();
        }

        @Override // p038e1.InterfaceC2244o
        public A1.t getLayoutDirection() {
            X xC1 = C2242m.this.C1();
            t.d(xC1);
            return xC1.getLayoutDirection();
        }

        @Override // A1.l
        public float x0() {
            X xC1 = C2242m.this.C1();
            t.d(xC1);
            return xC1.x0();
        }
    }

    /* JADX INFO: renamed from: e1.m$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC2247s invoke() {
            X xC1 = C2242m.this.C1();
            t.d(xC1);
            return xC1;
        }
    }

    /* JADX INFO: renamed from: e1.m$d */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d implements b0.e {
        public d() {
        }

        @Override // g1.b0.e
        public final I c(J j8, G g8, long j9) {
            return (I) C2242m.this.f2().invoke(C2242m.this.f20507o, g8, A1.b.b(j9));
        }
    }

    /* JADX INFO: renamed from: e1.m$e */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e implements b0.e {
        public e() {
        }

        @Override // g1.b0.e
        public final I c(J j8, G g8, long j9) {
            return (I) C2242m.this.f2().invoke(C2242m.this.f20507o, g8, A1.b.b(j9));
        }
    }

    /* JADX INFO: renamed from: e1.m$f */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a0 f20526a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(a0 a0Var) {
            super(1);
            this.f20526a = a0Var;
        }

        public final void b(a0.a aVar) {
            a0.a.f(aVar, this.f20526a, 0, 0, 0.0f, 4, null);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((a0.a) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: e1.m$g */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g implements b0.e {
        public g() {
        }

        @Override // g1.b0.e
        public final I c(J j8, G g8, long j9) {
            return (I) C2242m.this.f2().invoke(C2242m.this.f20507o, g8, A1.b.b(j9));
        }
    }

    /* JADX INFO: renamed from: e1.m$h */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h implements b0.e {
        public h() {
        }

        @Override // g1.b0.e
        public final I c(J j8, G g8, long j9) {
            return (I) C2242m.this.f2().invoke(C2242m.this.f20507o, g8, A1.b.b(j9));
        }
    }

    /* JADX INFO: renamed from: e1.m$i */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class i extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ F f20529a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(F f8) {
            super(0);
            this.f20529a = f8;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC2247s invoke() {
            F fM0 = this.f20529a.m0();
            t.d(fM0);
            return fM0.O().a2();
        }
    }

    public C2242m(p pVar) {
        this.f20506n = pVar;
        F f8 = new F(new c());
        this.f20508p = f8;
        this.f20509q = f8;
        this.f20510r = true;
    }

    @Override // L0.i.c
    public void N1() {
        F f8;
        F f9;
        androidx.compose.ui.node.a aVarJ0;
        P pE2;
        X xC1 = C1();
        if (((xC1 == null || (pE2 = xC1.e2()) == null) ? null : pE2.H1()) == null) {
            throw new IllegalStateException("could not fetch lookahead coordinates");
        }
        F fZ = AbstractC2347k.k(this).Z();
        if (fZ == null || !fZ.M0()) {
            int iA = Z.a(512);
            if (!I0().K1()) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            L0.i.c cVarH1 = I0().H1();
            F fK = AbstractC2347k.k(this);
            C2242m c2242m = null;
            while (fK != null) {
                if ((fK.j0().k().A1() & iA) != 0) {
                    while (cVarH1 != null) {
                        if ((cVarH1.F1() & iA) != 0) {
                            B0.d dVar = null;
                            L0.i.c cVarG = cVarH1;
                            while (cVarG != null) {
                                if (cVarG instanceof C2242m) {
                                    c2242m = (C2242m) cVarG;
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
            if (c2242m == null || (f8 = c2242m.f20508p) == null) {
                f8 = this.f20508p;
            }
            f9 = f8;
        } else {
            f9 = new F(new i(fZ));
        }
        this.f20509q = f9;
    }

    @Override // p056g1.A
    public I c(J j8, G g8, long j9) {
        a0 a0VarJ = g8.J(j9);
        return J.X0(j8, a0VarJ.y0(), a0VarJ.h0(), null, new f(a0VarJ), 4, null);
    }

    public final p f2() {
        return this.f20506n;
    }

    public final I g2(J j8, G g8, long j9, long j10, long j11) {
        this.f20507o.g(j10);
        this.f20511s = A1.b.b(j11);
        a aVar = this.f20512t;
        if (aVar == null) {
            aVar = new a(g8);
        }
        this.f20512t = aVar;
        aVar.L0(g8);
        return (I) this.f20506n.invoke(this.f20507o, aVar, A1.b.b(j9));
    }

    public final boolean h2() {
        return this.f20510r;
    }

    public final int i2(InterfaceC2244o interfaceC2244o, InterfaceC2243n interfaceC2243n, int i8) {
        return b0.f23562a.a(new d(), interfaceC2244o, interfaceC2243n, i8);
    }

    public final int j2(InterfaceC2244o interfaceC2244o, InterfaceC2243n interfaceC2243n, int i8) {
        return b0.f23562a.b(new e(), interfaceC2244o, interfaceC2243n, i8);
    }

    public final int k2(InterfaceC2244o interfaceC2244o, InterfaceC2243n interfaceC2243n, int i8) {
        return b0.f23562a.c(new g(), interfaceC2244o, interfaceC2243n, i8);
    }

    public final int l2(InterfaceC2244o interfaceC2244o, InterfaceC2243n interfaceC2243n, int i8) {
        return b0.f23562a.d(new h(), interfaceC2244o, interfaceC2243n, i8);
    }
}
