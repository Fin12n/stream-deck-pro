package p143q0;

import A1.d;
import A1.h;
import C6.G;
import D6.r;
import P0.f;
import Q6.k;
import R0.F0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p038e1.InterfaceC2247s;
import p065h1.H0;
import p128o1.C2739d;
import p128o1.I;
import p168t1.AbstractC3009n;
import p176u1.C3029m;
import p176u1.C3035t;
import p176u1.M;
import p215z0.D0;
import p215z0.InterfaceC3164l0;
import p215z0.l1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public E f31521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D0 f31522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final H0 f31523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3029m f31524d = new C3029m();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p176u1.V f31525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC3164l0 f31526f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC3164l0 f31527g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InterfaceC2247s f31528h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final InterfaceC3164l0 f31529i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C2739d f31530j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final InterfaceC3164l0 f31531k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InterfaceC3164l0 f31532l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final InterfaceC3164l0 f31533m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final InterfaceC3164l0 f31534n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final InterfaceC3164l0 f31535o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f31536p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final InterfaceC3164l0 f31537q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C2822w f31538r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public k f31539s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k f31540t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final k f31541u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final F0 f31542v;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {
        public a() {
            super(1);
        }

        public final void b(int i8) {
            V.this.f31538r.d(i8);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b(((C3035t) obj).o());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {
        public b() {
            super(1);
        }

        public final void b(M m8) {
            String strH = m8.h();
            C2739d c2739dT = V.this.t();
            if (!t.c(strH, c2739dT != null ? c2739dT.i() : null)) {
                V.this.w(EnumC2814n.None);
            }
            V.this.f31539s.invoke(m8);
            V.this.m().invalidate();
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((M) obj);
            return G.f1419a;
        }
    }

    public V(E e8, D0 d8, H0 h8) {
        this.f31521a = e8;
        this.f31522b = d8;
        this.f31523c = h8;
        Boolean bool = Boolean.FALSE;
        this.f31526f = l1.e(bool, null, 2, null);
        this.f31527g = l1.e(h.d(h.m(0)), null, 2, null);
        this.f31529i = l1.e(null, null, 2, null);
        this.f31531k = l1.e(EnumC2814n.None, null, 2, null);
        this.f31532l = l1.e(bool, null, 2, null);
        this.f31533m = l1.e(bool, null, 2, null);
        this.f31534n = l1.e(bool, null, 2, null);
        this.f31535o = l1.e(bool, null, 2, null);
        this.f31536p = true;
        this.f31537q = l1.e(Boolean.TRUE, null, 2, null);
        this.f31538r = new C2822w(h8);
        this.f31539s = c.f31545a;
        this.f31540t = new b();
        this.f31541u = new a();
        this.f31542v = R0.M.a();
    }

    public final void A(InterfaceC2247s interfaceC2247s) {
        this.f31528h = interfaceC2247s;
    }

    public final void B(X x8) {
        this.f31529i.setValue(x8);
        this.f31536p = false;
    }

    public final void C(float f8) {
        this.f31527g.setValue(h.d(f8));
    }

    public final void D(boolean z8) {
        this.f31535o.setValue(Boolean.valueOf(z8));
    }

    public final void E(boolean z8) {
        this.f31532l.setValue(Boolean.valueOf(z8));
    }

    public final void F(boolean z8) {
        this.f31534n.setValue(Boolean.valueOf(z8));
    }

    public final void G(boolean z8) {
        this.f31533m.setValue(Boolean.valueOf(z8));
    }

    public final void H(C2739d c2739d, C2739d c2739d2, I i8, boolean z8, d dVar, AbstractC3009n.b bVar, k kVar, C2823x c2823x, f fVar, long j8) {
        this.f31539s = kVar;
        this.f31542v.t(j8);
        C2822w c2822w = this.f31538r;
        c2822w.f(c2823x);
        c2822w.e(fVar);
        this.f31530j = c2739d;
        E eC = F.c(this.f31521a, c2739d2, i8, dVar, bVar, z8, 0, 0, 0, r.n(), 448, null);
        if (this.f31521a != eC) {
            this.f31536p = true;
        }
        this.f31521a = eC;
    }

    public final EnumC2814n c() {
        return (EnumC2814n) this.f31531k.getValue();
    }

    public final boolean d() {
        return ((Boolean) this.f31526f.getValue()).booleanValue();
    }

    public final p176u1.V e() {
        return this.f31525e;
    }

    public final H0 f() {
        return this.f31523c;
    }

    public final InterfaceC2247s g() {
        InterfaceC2247s interfaceC2247s = this.f31528h;
        if (interfaceC2247s == null || !interfaceC2247s.y()) {
            return null;
        }
        return interfaceC2247s;
    }

    public final X h() {
        return (X) this.f31529i.getValue();
    }

    public final float i() {
        return ((h) this.f31527g.getValue()).w();
    }

    public final k j() {
        return this.f31541u;
    }

    public final k k() {
        return this.f31540t;
    }

    public final C3029m l() {
        return this.f31524d;
    }

    public final D0 m() {
        return this.f31522b;
    }

    public final F0 n() {
        return this.f31542v;
    }

    public final boolean o() {
        return ((Boolean) this.f31535o.getValue()).booleanValue();
    }

    public final boolean p() {
        return ((Boolean) this.f31532l.getValue()).booleanValue();
    }

    public final boolean q() {
        return ((Boolean) this.f31534n.getValue()).booleanValue();
    }

    public final boolean r() {
        return ((Boolean) this.f31533m.getValue()).booleanValue();
    }

    public final E s() {
        return this.f31521a;
    }

    public final C2739d t() {
        return this.f31530j;
    }

    public final boolean u() {
        return ((Boolean) this.f31537q.getValue()).booleanValue();
    }

    public final boolean v() {
        return this.f31536p;
    }

    public final void w(EnumC2814n enumC2814n) {
        this.f31531k.setValue(enumC2814n);
    }

    public final void x(boolean z8) {
        this.f31526f.setValue(Boolean.valueOf(z8));
    }

    public final void y(boolean z8) {
        this.f31537q.setValue(Boolean.valueOf(z8));
    }

    public final void z(p176u1.V v8) {
        this.f31525e = v8;
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f31545a = new c();

        public c() {
            super(1);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((M) obj);
            return G.f1419a;
        }

        public final void b(M m8) {
        }
    }
}
