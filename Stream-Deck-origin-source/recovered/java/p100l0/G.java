package p100l0;

import D6.r;
import D6.z;
import I0.j;
import I0.l;
import Q6.k;
import Q6.o;
import W6.i;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.u;
import p038e1.c0;
import p038e1.d0;
import p046f0.K;
import p055g0.I;
import p055g0.M;
import p055g0.N;
import p073i0.m;
import p109m0.A;
import p109m0.B;
import p109m0.C2663a;
import p109m0.C2671i;
import p109m0.L;
import p215z0.InterfaceC3160j0;
import p215z0.InterfaceC3164l0;
import p215z0.X0;
import p215z0.g1;
import p215z0.l1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class G implements M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B f28918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3164l0 f28919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f28920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f28921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC3160j0 f28922e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public A1.d f28923f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f28924g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final M f28925h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f28926i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f28927j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f28928k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final B0.d f28929l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f28930m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c0 f28931n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final d0 f28932o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C2663a f28933p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final InterfaceC3164l0 f28934q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l f28935r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C2671i f28936s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C2644e f28937t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final A f28938u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final InterfaceC3164l0 f28939v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final InterfaceC3164l0 f28940w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final InterfaceC3164l0 f28941x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final B f28942y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final c f28917z = new c(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final j f28916A = I0.a.a(a.f28943a, b.f28944a);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f28943a = new a();

        public a() {
            super(2);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final List invoke(l lVar, G g8) {
            return r.q(Integer.valueOf(g8.m()), Integer.valueOf(g8.n()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f28944a = new b();

        public b() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final G invoke(List list) {
            return new G(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c {
        public /* synthetic */ c(AbstractC2633k abstractC2633k) {
            this();
        }

        public final j a() {
            return G.f28916A;
        }

        public c() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f28945a = new d();

        public d() {
            super(1);
        }

        public final List b(int i8) {
            return r.n();
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((Number) obj).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e implements d0 {
        public e() {
        }

        @Override // p038e1.d0
        public void h(c0 c0Var) {
            G.this.I(c0Var);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f28947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f28948b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f28949c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f28950d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f28952f;

        public f(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f28950d = obj;
            this.f28952f |= Integer.MIN_VALUE;
            return G.this.f(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends I6.l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f28953a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f28955c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f28956d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i8, int i9, G6.d dVar) {
            super(2, dVar);
            this.f28955c = i8;
            this.f28956d = i9;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return G.this.new g(this.f28955c, this.f28956d, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(I i8, G6.d dVar) {
            return ((g) create(i8, dVar)).invokeSuspend(C6.G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            H6.c.f();
            if (this.f28953a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6.r.b(obj);
            G.this.L(this.f28955c, this.f28956d);
            return C6.G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends u implements k {
        public h() {
            super(1);
        }

        public final Float b(float f8) {
            return Float.valueOf(-G.this.B(-f8));
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((Number) obj).floatValue());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public G() {
        int i8 = 0;
        this(i8, i8, 3, null);
    }

    public static /* synthetic */ void A(G g8, float f8, t tVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            tVar = (t) g8.f28919b.getValue();
        }
        g8.z(f8, tVar);
    }

    public static /* synthetic */ Object D(G g8, int i8, int i9, G6.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i9 = 0;
        }
        return g8.C(i8, i9, dVar);
    }

    private void E(boolean z8) {
        this.f28941x.setValue(Boolean.valueOf(z8));
    }

    private void F(boolean z8) {
        this.f28940w.setValue(Boolean.valueOf(z8));
    }

    public static /* synthetic */ void i(G g8, v vVar, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        g8.h(vVar, z8);
    }

    public final float B(float f8) {
        if ((f8 < 0.0f && !a()) || (f8 > 0.0f && !d())) {
            return 0.0f;
        }
        if (Math.abs(this.f28921d) > 0.5f) {
            throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.f28921d).toString());
        }
        float f9 = this.f28921d + f8;
        this.f28921d = f9;
        if (Math.abs(f9) > 0.5f) {
            v vVar = (v) this.f28919b.getValue();
            float f10 = this.f28921d;
            if (vVar.o(S6.c.d(f10))) {
                h(vVar, true);
                L.d(this.f28939v);
                z(f10 - this.f28921d, vVar);
            } else {
                c0 c0Var = this.f28931n;
                if (c0Var != null) {
                    c0Var.i();
                }
                A(this, f10 - this.f28921d, null, 2, null);
            }
        }
        if (Math.abs(this.f28921d) <= 0.5f) {
            return f8;
        }
        float f11 = f8 - this.f28921d;
        this.f28921d = 0.0f;
        return f11;
    }

    public final Object C(int i8, int i9, G6.d dVar) {
        Object objC = M.c(this, null, new g(i8, i9, null), dVar, 1, null);
        return objC == H6.c.f() ? objC : C6.G.f1419a;
    }

    public final void G(A1.d dVar) {
        this.f28923f = dVar;
    }

    public final void H(k kVar) {
        this.f28934q.setValue(kVar);
    }

    public final void I(c0 c0Var) {
        this.f28931n = c0Var;
    }

    public final void J(int i8) {
        this.f28922e.p(i8);
    }

    public final void K(boolean z8) {
        this.f28924g = z8;
    }

    public final void L(int i8, int i9) {
        this.f28918a.d(i8, i9);
        this.f28935r.g();
        c0 c0Var = this.f28931n;
        if (c0Var != null) {
            c0Var.i();
        }
    }

    public final int M(n nVar, int i8) {
        return this.f28918a.j(nVar, i8);
    }

    @Override // p055g0.M
    public boolean a() {
        return ((Boolean) this.f28940w.getValue()).booleanValue();
    }

    @Override // p055g0.M
    public boolean b() {
        return this.f28925h.b();
    }

    @Override // p055g0.M
    public boolean d() {
        return ((Boolean) this.f28941x.getValue()).booleanValue();
    }

    @Override // p055g0.M
    public float e(float f8) {
        return this.f28925h.e(f8);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        if (r8.f(r6, r7, r0) == r1) goto L22;
     */
    @Override // p055g0.M
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object f(K k8, o oVar, G6.d dVar) {
        f fVar;
        G g8;
        if (dVar instanceof f) {
            fVar = (f) dVar;
            int i8 = fVar.f28952f;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                fVar.f28952f = i8 - Integer.MIN_VALUE;
            } else {
                fVar = new f(dVar);
            }
        } else {
            fVar = new f(dVar);
        }
        Object obj = fVar.f28950d;
        Object objF = H6.c.f();
        int i9 = fVar.f28952f;
        if (i9 != 0) {
            if (i9 == 1) {
                oVar = (o) fVar.f28949c;
                k8 = (K) fVar.f28948b;
                g8 = (G) fVar.f28947a;
                C6.r.b(obj);
            } else {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
            }
            return C6.G.f1419a;
        }
        C6.r.b(obj);
        C2663a c2663a = this.f28933p;
        fVar.f28947a = this;
        fVar.f28948b = k8;
        fVar.f28949c = oVar;
        fVar.f28952f = 1;
        if (c2663a.k(fVar) != objF) {
            g8 = this;
        }
        return objF;
        M m8 = g8.f28925h;
        fVar.f28947a = null;
        fVar.f28948b = null;
        fVar.f28949c = null;
        fVar.f28952f = 2;
    }

    public final void h(v vVar, boolean z8) {
        this.f28921d -= vVar.i();
        this.f28919b.setValue(vVar);
        if (z8) {
            this.f28918a.i(vVar.k());
        } else {
            this.f28918a.h(vVar);
            j(vVar);
        }
        E(vVar.e());
        F(vVar.h());
        this.f28926i++;
    }

    public final void j(t tVar) {
        int iA;
        if (this.f28928k == -1 || tVar.b().isEmpty()) {
            return;
        }
        if (this.f28930m) {
            k kVar = (k) z.t0(tVar.b());
            iA = (this.f28924g ? kVar.a() : kVar.c()) + 1;
        } else {
            k kVar2 = (k) z.i0(tVar.b());
            iA = (this.f28924g ? kVar2.a() : kVar2.c()) - 1;
        }
        if (this.f28928k != iA) {
            this.f28928k = -1;
            B0.d dVar = this.f28929l;
            int iS = dVar.s();
            if (iS > 0) {
                Object[] objArrR = dVar.r();
                int i8 = 0;
                do {
                    ((B.a) objArrR[i8]).cancel();
                    i8++;
                } while (i8 < iS);
            }
            this.f28929l.m();
        }
    }

    public final C2663a k() {
        return this.f28933p;
    }

    public final C2671i l() {
        return this.f28936s;
    }

    public final int m() {
        return this.f28918a.a();
    }

    public final int n() {
        return this.f28918a.c();
    }

    public final m o() {
        return this.f28920c;
    }

    public final t p() {
        return (t) this.f28919b.getValue();
    }

    public final i q() {
        return (i) this.f28918a.b().getValue();
    }

    public final A r() {
        return this.f28938u;
    }

    public final l s() {
        return this.f28935r;
    }

    public final InterfaceC3164l0 t() {
        return this.f28939v;
    }

    public final k u() {
        return (k) this.f28934q.getValue();
    }

    public final B v() {
        return this.f28942y;
    }

    public final c0 w() {
        return this.f28931n;
    }

    public final d0 x() {
        return this.f28932o;
    }

    public final float y() {
        return this.f28921d;
    }

    public final void z(float f8, t tVar) {
        int iA;
        int index;
        B0.d dVar;
        int iS;
        B b8 = this.f28942y;
        if (this.f28927j && !tVar.b().isEmpty()) {
            boolean z8 = f8 < 0.0f;
            if (z8) {
                k kVar = (k) z.t0(tVar.b());
                iA = (this.f28924g ? kVar.a() : kVar.c()) + 1;
                index = ((k) z.t0(tVar.b())).getIndex() + 1;
            } else {
                k kVar2 = (k) z.i0(tVar.b());
                iA = (this.f28924g ? kVar2.a() : kVar2.c()) - 1;
                index = ((k) z.i0(tVar.b())).getIndex() - 1;
            }
            if (iA == this.f28928k || index < 0 || index >= tVar.a()) {
                return;
            }
            if (this.f28930m != z8 && (iS = (dVar = this.f28929l).s()) > 0) {
                Object[] objArrR = dVar.r();
                int i8 = 0;
                do {
                    ((B.a) objArrR[i8]).cancel();
                    i8++;
                } while (i8 < iS);
            }
            this.f28930m = z8;
            this.f28928k = iA;
            this.f28929l.m();
            List list = (List) u().invoke(Integer.valueOf(iA));
            int size = list.size();
            for (int i9 = 0; i9 < size; i9++) {
                C6.o oVar = (C6.o) list.get(i9);
                this.f28929l.d(b8.a(((Number) oVar.c()).intValue(), ((A1.b) oVar.d()).s()));
            }
        }
    }

    public G(int i8, int i9) {
        B b8 = new B(i8, i9);
        this.f28918a = b8;
        this.f28919b = g1.i(H.f28958a, g1.k());
        this.f28920c = p073i0.l.a();
        this.f28922e = X0.a(0);
        this.f28923f = A1.f.a(1.0f, 1.0f);
        this.f28924g = true;
        this.f28925h = N.a(new h());
        this.f28927j = true;
        this.f28928k = -1;
        this.f28929l = new B0.d(new B.a[16], 0);
        this.f28932o = new e();
        this.f28933p = new C2663a();
        this.f28934q = l1.e(d.f28945a, null, 2, null);
        this.f28935r = new l();
        this.f28936s = new C2671i();
        this.f28937t = new C2644e(this);
        this.f28938u = new A();
        b8.b();
        this.f28939v = L.c(null, 1, null);
        Boolean bool = Boolean.FALSE;
        this.f28940w = l1.e(bool, null, 2, null);
        this.f28941x = l1.e(bool, null, 2, null);
        this.f28942y = new B();
    }

    public /* synthetic */ G(int i8, int i9, int i10, AbstractC2633k abstractC2633k) {
        this((i10 & 1) != 0 ? 0 : i8, (i10 & 2) != 0 ? 0 : i9);
    }
}
