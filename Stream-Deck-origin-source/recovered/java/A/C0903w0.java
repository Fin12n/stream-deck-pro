package A;

import H.AbstractC0994n0;
import H.InterfaceC0984i0;
import H.InterfaceC1015y0;
import H.InterfaceC1017z0;
import H.c1;
import H.g1;
import H.u1;
import H.v1;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: A.w0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C0903w0 extends T0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public c f328r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Executor f329s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public c1.b f330t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public AbstractC0994n0 f331u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Q.N f332v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public S0 f333w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Q.W f334x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public c1.c f335y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final b f327z = new b();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final Executor f326A = J.a.d();

    /* JADX INFO: renamed from: A.w0$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements u1.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final H.O0 f336a;

        public a() {
            this(H.O0.i0());
        }

        public static a d(InterfaceC0984i0 interfaceC0984i0) {
            return new a(H.O0.j0(interfaceC0984i0));
        }

        @Override // A.K
        public H.N0 a() {
            return this.f336a;
        }

        public C0903w0 c() {
            H.U0 u0B = b();
            InterfaceC1017z0.k(u0B);
            return new C0903w0(u0B);
        }

        @Override // H.u1.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public H.U0 b() {
            return new H.U0(H.T0.h0(this.f336a));
        }

        public a f(v1.b bVar) {
            a().L(u1.f3222G, bVar);
            return this;
        }

        public a g(J j8) {
            a().L(InterfaceC1015y0.f3285l, j8);
            return this;
        }

        public a h(boolean z8) {
            a().L(u1.f3221F, Boolean.valueOf(z8));
            return this;
        }

        public a i(T.c cVar) {
            a().L(InterfaceC1017z0.f3294u, cVar);
            return this;
        }

        public a j(int i8) {
            a().L(u1.f3216A, Integer.valueOf(i8));
            return this;
        }

        public a k(int i8) {
            if (i8 == -1) {
                i8 = 0;
            }
            a().L(InterfaceC1017z0.f3286m, Integer.valueOf(i8));
            return this;
        }

        public a l(Class cls) {
            a().L(L.q.f4795N, cls);
            if (a().f(L.q.f4794M, null) == null) {
                m(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public a m(String str) {
            a().L(L.q.f4794M, str);
            return this;
        }

        public a(H.O0 o8) {
            this.f336a = o8;
            Class cls = (Class) o8.f(L.q.f4795N, null);
            if (cls != null && !cls.equals(C0903w0.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            f(v1.b.PREVIEW);
            l(C0903w0.class);
            InterfaceC0984i0.a aVar = InterfaceC1017z0.f3289p;
            if (((Integer) o8.f(aVar, -1)).intValue() == -1) {
                o8.L(aVar, 2);
            }
        }
    }

    /* JADX INFO: renamed from: A.w0$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final T.c f337a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final H.U0 f338b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final J f339c;

        static {
            T.c cVarA = new T.c.a().d(T.a.f9781c).f(T.d.f9793c).a();
            f337a = cVarA;
            J j8 = J.f87c;
            f339c = j8;
            f338b = new a().j(2).k(0).i(cVarA).h(true).g(j8).b();
        }

        public H.U0 a() {
            return f338b;
        }
    }

    /* JADX INFO: renamed from: A.w0$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface c {
        void a(S0 s8);
    }

    public C0903w0(H.U0 u8) {
        super(u8);
        this.f329s = f326A;
    }

    public static /* synthetic */ void d0(C0903w0 c0903w0, c1 c1Var, c1.g gVar) {
        if (c0903w0.i() == null) {
            return;
        }
        c0903w0.o0((H.U0) c0903w0.l(), c0903w0.g());
        c0903w0.K();
    }

    private void g0() {
        c1.c cVar = this.f335y;
        if (cVar != null) {
            cVar.b();
            this.f335y = null;
        }
        AbstractC0994n0 abstractC0994n0 = this.f331u;
        if (abstractC0994n0 != null) {
            abstractC0994n0.d();
            this.f331u = null;
        }
        Q.W w8 = this.f334x;
        if (w8 != null) {
            w8.f();
            this.f334x = null;
        }
        Q.N n8 = this.f332v;
        if (n8 != null) {
            n8.i();
            this.f332v = null;
        }
        S0 s8 = this.f333w;
        if (s8 != null) {
            s8.l();
        }
        this.f333w = null;
    }

    @Override // A.T0
    public Set B() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    @Override // A.T0
    public u1.b D(InterfaceC0984i0 interfaceC0984i0) {
        return a.d(interfaceC0984i0);
    }

    @Override // A.T0
    public u1 O(H.I i8, u1.b bVar) {
        bVar.a().L(InterfaceC1015y0.f3283j, 34);
        return bVar.b();
    }

    @Override // A.T0
    public g1 R(InterfaceC0984i0 interfaceC0984i0) {
        this.f330t.g(interfaceC0984i0);
        a0(M.a(new Object[]{this.f330t.p()}));
        return g().i().d(interfaceC0984i0).a();
    }

    @Override // A.T0
    public g1 S(g1 g1Var, g1 g1Var2) {
        AbstractC0890p0.a("Preview", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + g1Var + ", secondaryStreamSpec " + g1Var2);
        o0((H.U0) l(), g1Var);
        return g1Var;
    }

    @Override // A.T0
    public void T() {
        g0();
    }

    @Override // A.T0
    public void Y(Rect rect) {
        super.Y(rect);
        k0();
    }

    public final void f0(c1.b bVar, g1 g1Var) {
        if (this.f328r != null) {
            bVar.n(this.f331u, g1Var.b(), s(), q());
        }
        c1.c cVar = this.f335y;
        if (cVar != null) {
            cVar.b();
        }
        c1.c cVar2 = new c1.c(new c1.d() { // from class: A.v0
            @Override // H.c1.d
            public final void a(c1 c1Var, c1.g gVar) {
                C0903w0.d0(this.f319a, c1Var, gVar);
            }
        });
        this.f335y = cVar2;
        bVar.r(cVar2);
    }

    public final c1.b h0(H.U0 u8, g1 g1Var) {
        I.w.b();
        H.J jI = i();
        Objects.requireNonNull(jI);
        H.J j8 = jI;
        g0();
        T1.f.i(this.f332v == null);
        Matrix matrixY = y();
        boolean zP = j8.p();
        Rect rectI0 = i0(g1Var.f());
        Objects.requireNonNull(rectI0);
        this.f332v = new Q.N(1, 34, g1Var, matrixY, zP, rectI0, u(j8, G(j8)), f(), n0(j8));
        n();
        this.f332v.e(new Runnable() { // from class: A.t0
            @Override // java.lang.Runnable
            public final void run() {
                this.f310a.K();
            }
        });
        S0 s0K = this.f332v.k(j8);
        this.f333w = s0K;
        this.f331u = s0K.n();
        if (this.f328r != null) {
            j0();
        }
        c1.b bVarQ = c1.b.q(u8, g1Var.f());
        bVarQ.x(g1Var.g());
        b(bVarQ, g1Var);
        bVarQ.w(u8.W());
        if (g1Var.d() != null) {
            bVarQ.g(g1Var.d());
        }
        f0(bVarQ, g1Var);
        return bVarQ;
    }

    public final Rect i0(Size size) {
        if (E() != null) {
            return E();
        }
        if (size != null) {
            return new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        return null;
    }

    public final void j0() {
        k0();
        final c cVar = (c) T1.f.g(this.f328r);
        final S0 s8 = (S0) T1.f.g(this.f333w);
        this.f329s.execute(new Runnable() { // from class: A.u0
            @Override // java.lang.Runnable
            public final void run() {
                cVar.a(s8);
            }
        });
    }

    public final void k0() {
        H.J jI = i();
        Q.N n8 = this.f332v;
        if (jI == null || n8 == null) {
            return;
        }
        n8.y(u(jI, G(jI)), f());
    }

    public void l0(c cVar) {
        m0(f326A, cVar);
    }

    @Override // A.T0
    public u1 m(boolean z8, v1 v1Var) {
        b bVar = f327z;
        InterfaceC0984i0 interfaceC0984i0A = v1Var.a(bVar.a().O(), 1);
        if (z8) {
            interfaceC0984i0A = InterfaceC0984i0.p(interfaceC0984i0A, bVar.a());
        }
        if (interfaceC0984i0A == null) {
            return null;
        }
        return D(interfaceC0984i0A).b();
    }

    public void m0(Executor executor, c cVar) {
        I.w.b();
        if (cVar == null) {
            this.f328r = null;
            J();
            return;
        }
        this.f328r = cVar;
        this.f329s = executor;
        if (h() != null) {
            o0((H.U0) l(), g());
            K();
        }
        I();
    }

    public final boolean n0(H.J j8) {
        return j8.p() && G(j8);
    }

    public final void o0(H.U0 u8, g1 g1Var) {
        c1.b bVarH0 = h0(u8, g1Var);
        this.f330t = bVarH0;
        a0(M.a(new Object[]{bVarH0.p()}));
    }

    public String toString() {
        return "Preview:" + r();
    }
}
