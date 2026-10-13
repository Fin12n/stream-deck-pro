package p038e1;

import A1.b;
import A1.n;
import A1.o;
import A1.r;
import A1.s;
import A1.t;
import Q6.k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a0 implements K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f20440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f20442c = s.a(0, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f20443d = b0.f20450b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f20444e = n.f446b.a();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class a {
        public static /* synthetic */ void f(a aVar, a0 a0Var, int i8, int i9, float f8, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
            }
            if ((i10 & 4) != 0) {
                f8 = 0.0f;
            }
            aVar.e(a0Var, i8, i9, f8);
        }

        public static /* synthetic */ void h(a aVar, a0 a0Var, long j8, float f8, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
            }
            if ((i8 & 2) != 0) {
                f8 = 0.0f;
            }
            aVar.g(a0Var, j8, f8);
        }

        public static /* synthetic */ void j(a aVar, a0 a0Var, int i8, int i9, float f8, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
            }
            if ((i10 & 4) != 0) {
                f8 = 0.0f;
            }
            aVar.i(a0Var, i8, i9, f8);
        }

        public static /* synthetic */ void l(a aVar, a0 a0Var, long j8, float f8, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
            }
            if ((i8 & 2) != 0) {
                f8 = 0.0f;
            }
            aVar.k(a0Var, j8, f8);
        }

        public static /* synthetic */ void n(a aVar, a0 a0Var, int i8, int i9, float f8, k kVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i10 & 4) != 0) {
                f8 = 0.0f;
            }
            float f9 = f8;
            if ((i10 & 8) != 0) {
                kVar = b0.f20449a;
            }
            aVar.m(a0Var, i8, i9, f9, kVar);
        }

        public static /* synthetic */ void p(a aVar, a0 a0Var, long j8, float f8, k kVar, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i8 & 2) != 0) {
                f8 = 0.0f;
            }
            float f9 = f8;
            if ((i8 & 4) != 0) {
                kVar = b0.f20449a;
            }
            aVar.o(a0Var, j8, f9, kVar);
        }

        public static /* synthetic */ void r(a aVar, a0 a0Var, int i8, int i9, float f8, k kVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if ((i10 & 4) != 0) {
                f8 = 0.0f;
            }
            float f9 = f8;
            if ((i10 & 8) != 0) {
                kVar = b0.f20449a;
            }
            aVar.q(a0Var, i8, i9, f9, kVar);
        }

        public static /* synthetic */ void t(a aVar, a0 a0Var, long j8, float f8, k kVar, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i8 & 2) != 0) {
                f8 = 0.0f;
            }
            float f9 = f8;
            if ((i8 & 4) != 0) {
                kVar = b0.f20449a;
            }
            aVar.s(a0Var, j8, f9, kVar);
        }

        public abstract t c();

        public abstract int d();

        public final void e(a0 a0Var, int i8, int i9, float f8) {
            long jA = o.a(i8, i9);
            long j8 = a0Var.f20444e;
            a0Var.D0(o.a(n.j(jA) + n.j(j8), n.k(jA) + n.k(j8)), f8, null);
        }

        public final void g(a0 a0Var, long j8, float f8) {
            long j9 = a0Var.f20444e;
            a0Var.D0(o.a(n.j(j8) + n.j(j9), n.k(j8) + n.k(j9)), f8, null);
        }

        public final void i(a0 a0Var, int i8, int i9, float f8) {
            long jA = o.a(i8, i9);
            if (c() == t.Ltr || d() == 0) {
                long j8 = a0Var.f20444e;
                a0Var.D0(o.a(n.j(jA) + n.j(j8), n.k(jA) + n.k(j8)), f8, null);
            } else {
                long jA2 = o.a((d() - a0Var.y0()) - n.j(jA), n.k(jA));
                long j9 = a0Var.f20444e;
                a0Var.D0(o.a(n.j(jA2) + n.j(j9), n.k(jA2) + n.k(j9)), f8, null);
            }
        }

        public final void k(a0 a0Var, long j8, float f8) {
            if (c() == t.Ltr || d() == 0) {
                long j9 = a0Var.f20444e;
                a0Var.D0(o.a(n.j(j8) + n.j(j9), n.k(j8) + n.k(j9)), f8, null);
            } else {
                long jA = o.a((d() - a0Var.y0()) - n.j(j8), n.k(j8));
                long j10 = a0Var.f20444e;
                a0Var.D0(o.a(n.j(jA) + n.j(j10), n.k(jA) + n.k(j10)), f8, null);
            }
        }

        public final void m(a0 a0Var, int i8, int i9, float f8, k kVar) {
            long jA = o.a(i8, i9);
            if (c() == t.Ltr || d() == 0) {
                long j8 = a0Var.f20444e;
                a0Var.D0(o.a(n.j(jA) + n.j(j8), n.k(jA) + n.k(j8)), f8, kVar);
            } else {
                long jA2 = o.a((d() - a0Var.y0()) - n.j(jA), n.k(jA));
                long j9 = a0Var.f20444e;
                a0Var.D0(o.a(n.j(jA2) + n.j(j9), n.k(jA2) + n.k(j9)), f8, kVar);
            }
        }

        public final void o(a0 a0Var, long j8, float f8, k kVar) {
            if (c() == t.Ltr || d() == 0) {
                long j9 = a0Var.f20444e;
                a0Var.D0(o.a(n.j(j8) + n.j(j9), n.k(j8) + n.k(j9)), f8, kVar);
            } else {
                long jA = o.a((d() - a0Var.y0()) - n.j(j8), n.k(j8));
                long j10 = a0Var.f20444e;
                a0Var.D0(o.a(n.j(jA) + n.j(j10), n.k(jA) + n.k(j10)), f8, kVar);
            }
        }

        public final void q(a0 a0Var, int i8, int i9, float f8, k kVar) {
            long jA = o.a(i8, i9);
            long j8 = a0Var.f20444e;
            a0Var.D0(o.a(n.j(jA) + n.j(j8), n.k(jA) + n.k(j8)), f8, kVar);
        }

        public final void s(a0 a0Var, long j8, float f8, k kVar) {
            long j9 = a0Var.f20444e;
            a0Var.D0(o.a(n.j(j8) + n.j(j9), n.k(j8) + n.k(j9)), f8, kVar);
        }
    }

    public abstract void D0(long j8, float f8, k kVar);

    public final void I0(long j8) {
        if (r.e(this.f20442c, j8)) {
            return;
        }
        this.f20442c = j8;
        z0();
    }

    public final void J0(long j8) {
        if (b.g(this.f20443d, j8)) {
            return;
        }
        this.f20443d = j8;
        z0();
    }

    public final long g0() {
        return this.f20444e;
    }

    public final int h0() {
        return this.f20441b;
    }

    public int k0() {
        return r.f(this.f20442c);
    }

    public final long u0() {
        return this.f20442c;
    }

    public int v0() {
        return r.g(this.f20442c);
    }

    public final long w0() {
        return this.f20443d;
    }

    public final int y0() {
        return this.f20440a;
    }

    public final void z0() {
        this.f20440a = W6.n.k(r.g(this.f20442c), b.p(this.f20443d), b.n(this.f20443d));
        this.f20441b = W6.n.k(r.f(this.f20442c), b.o(this.f20443d), b.m(this.f20443d));
        this.f20444e = o.a((this.f20440a - r.g(this.f20442c)) / 2, (this.f20441b - r.f(this.f20442c)) / 2);
    }
}
