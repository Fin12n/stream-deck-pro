package A0;

import C6.C0920i;
import Q6.k;
import Q6.o;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import p215z0.AbstractC3169o;
import p215z0.AbstractC3173q;
import p215z0.B;
import p215z0.C3147d;
import p215z0.C3154g0;
import p215z0.C3156h0;
import p215z0.C3165m;
import p215z0.InterfaceC3171p;
import p215z0.L0;
import p215z0.Q;
import p215z0.S0;
import p215z0.T0;
import p215z0.p1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f358m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f359n = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3165m f360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public A0.a f361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f362c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f365f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f366g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f371l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Q f363d = new Q();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f364e = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p1 f367h = new p1();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f368i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f369j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f370k = -1;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    public b(C3165m c3165m, A0.a aVar) {
        this.f360a = c3165m;
        this.f361b = aVar;
    }

    public static /* synthetic */ void D(b bVar, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        bVar.C(z8);
    }

    public static /* synthetic */ void H(b bVar, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        bVar.G(z8);
    }

    public final void A() {
        int i8 = this.f366g;
        if (i8 > 0) {
            this.f361b.E(i8);
            this.f366g = 0;
        }
        if (this.f367h.d()) {
            this.f361b.j(this.f367h.i());
            this.f367h.a();
        }
    }

    public final void B() {
        H(this, false, 1, null);
        J();
    }

    public final void C(boolean z8) {
        G(z8);
    }

    public final void E(int i8, int i9, int i10) {
        z();
        this.f361b.t(i8, i9, i10);
    }

    public final void F() {
        int i8 = this.f371l;
        if (i8 > 0) {
            int i9 = this.f368i;
            if (i9 >= 0) {
                I(i9, i8);
                this.f368i = -1;
            } else {
                E(this.f370k, this.f369j, i8);
                this.f369j = -1;
                this.f370k = -1;
            }
            this.f371l = 0;
        }
    }

    public final void G(boolean z8) {
        int iS = z8 ? p().s() : p().k();
        int i8 = iS - this.f365f;
        if (!(i8 >= 0)) {
            AbstractC3169o.v("Tried to seek backward");
            throw new C0920i();
        }
        if (i8 > 0) {
            this.f361b.e(i8);
            this.f365f = iS;
        }
    }

    public final void I(int i8, int i9) {
        z();
        this.f361b.x(i8, i9);
    }

    public final void J() {
        S0 s0P;
        int iS;
        if (p().u() <= 0 || this.f363d.g(-2) == (iS = (s0P = p()).s())) {
            return;
        }
        l();
        if (iS > 0) {
            C3147d c3147dA = s0P.a(iS);
            this.f363d.i(iS);
            k(c3147dA);
        }
    }

    public final void K() {
        A();
        if (this.f362c) {
            U();
            j();
        }
    }

    public final void L(B b8, AbstractC3173q abstractC3173q, C3156h0 c3156h0) {
        this.f361b.u(b8, abstractC3173q, c3156h0);
    }

    public final void M(L0 l8) {
        this.f361b.v(l8);
    }

    public final void N() {
        B();
        this.f361b.w();
        this.f365f += p().p();
    }

    public final void O(int i8, int i9) {
        if (i9 > 0) {
            if (!(i8 >= 0)) {
                AbstractC3169o.v(("Invalid remove index " + i8).toString());
                throw new C0920i();
            }
            if (this.f368i == i8) {
                this.f371l += i9;
                return;
            }
            F();
            this.f368i = i8;
            this.f371l = i9;
        }
    }

    public final void P() {
        this.f361b.y();
    }

    public final void Q() {
        this.f362c = false;
        this.f363d.a();
        this.f365f = 0;
    }

    public final void R(A0.a aVar) {
        this.f361b = aVar;
    }

    public final void S(boolean z8) {
        this.f364e = z8;
    }

    public final void T(Function0 function0) {
        this.f361b.z(function0);
    }

    public final void U() {
        this.f361b.A();
    }

    public final void V(Object obj) {
        D(this, false, 1, null);
        this.f361b.B(obj);
    }

    public final void W(Object obj, o oVar) {
        z();
        this.f361b.C(obj, oVar);
    }

    public final void X(Object obj, int i8) {
        C(true);
        this.f361b.D(obj, i8);
    }

    public final void Y(Object obj) {
        z();
        this.f361b.F(obj);
    }

    public final void a(List list, H0.d dVar) {
        this.f361b.f(list, dVar);
    }

    public final void b(C3154g0 c3154g0, AbstractC3173q abstractC3173q, C3156h0 c3156h0, C3156h0 c3156h1) {
        this.f361b.g(c3154g0, abstractC3173q, c3156h0, c3156h1);
    }

    public final void c() {
        D(this, false, 1, null);
        this.f361b.h();
    }

    public final void d(H0.d dVar, C3147d c3147d) {
        A();
        this.f361b.i(dVar, c3147d);
    }

    public final void e(k kVar, InterfaceC3171p interfaceC3171p) {
        this.f361b.k(kVar, interfaceC3171p);
    }

    public final void f() {
        int iS = p().s();
        if (!(this.f363d.g(-1) <= iS)) {
            AbstractC3169o.v("Missed recording an endGroup");
            throw new C0920i();
        }
        if (this.f363d.g(-1) == iS) {
            D(this, false, 1, null);
            this.f363d.h();
            this.f361b.l();
        }
    }

    public final void g() {
        this.f361b.m();
        this.f365f = 0;
    }

    public final void h() {
        F();
    }

    public final void i(int i8, int i9) {
        h();
        A();
        int iK = p().G(i9) ? 1 : p().K(i9);
        if (iK > 0) {
            O(i8, iK);
        }
    }

    public final void j() {
        if (this.f362c) {
            D(this, false, 1, null);
            D(this, false, 1, null);
            this.f361b.l();
            this.f362c = false;
        }
    }

    public final void k(C3147d c3147d) {
        D(this, false, 1, null);
        this.f361b.n(c3147d);
        this.f362c = true;
    }

    public final void l() {
        if (this.f362c || !this.f364e) {
            return;
        }
        D(this, false, 1, null);
        this.f361b.o();
        this.f362c = true;
    }

    public final void m() {
        A();
        if (this.f363d.d()) {
            return;
        }
        AbstractC3169o.v("Missed recording an endGroup()");
        throw new C0920i();
    }

    public final A0.a n() {
        return this.f361b;
    }

    public final boolean o() {
        return this.f364e;
    }

    public final S0 p() {
        return this.f360a.E0();
    }

    public final void q(A0.a aVar, H0.d dVar) {
        this.f361b.p(aVar, dVar);
    }

    public final void r(C3147d c3147d, T0 t8) {
        A();
        B();
        this.f361b.q(c3147d, t8);
    }

    public final void s(C3147d c3147d, T0 t8, c cVar) {
        A();
        B();
        this.f361b.r(c3147d, t8, cVar);
    }

    public final void t(int i8) {
        B();
        this.f361b.s(i8);
    }

    public final void u(Object obj) {
        this.f367h.h(obj);
    }

    public final void v(int i8, int i9, int i10) {
        if (i10 > 0) {
            int i11 = this.f371l;
            if (i11 > 0 && this.f369j == i8 - i11 && this.f370k == i9 - i11) {
                this.f371l = i11 + i10;
                return;
            }
            F();
            this.f369j = i8;
            this.f370k = i9;
            this.f371l = i10;
        }
    }

    public final void w(int i8) {
        this.f365f += i8 - p().k();
    }

    public final void x(int i8) {
        this.f365f = i8;
    }

    public final void y() {
        if (this.f367h.d()) {
            this.f367h.g();
        } else {
            this.f366g++;
        }
    }

    public final void z() {
        A();
    }
}
