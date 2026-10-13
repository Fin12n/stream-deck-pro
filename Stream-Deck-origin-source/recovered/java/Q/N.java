package Q;

import A.G0;
import A.S0;
import H.AbstractC0994n0;
import H.g1;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix f8948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f8950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f8951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f8952f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g1 f8953g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8954h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8955i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public S0 f8957k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f8958l;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f8956j = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Set f8959m = new HashSet();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f8960n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f8961o = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a extends AbstractC0994n0 {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final Y4.a f8962o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public F1.c.a f8963p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public AbstractC0994n0 f8964q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Q f8965r;

        public a(Size size, int i8) {
            super(size, i8);
            this.f8962o = F1.c.a(new F1.c.InterfaceC0112c() { // from class: Q.L
                @Override // F1.c.InterfaceC0112c
                public final Object a(F1.c.a aVar) {
                    return N.a.r(this.f8945a, aVar);
                }
            });
        }

        public static /* synthetic */ void q(a aVar) {
            Q q8 = aVar.f8965r;
            if (q8 != null) {
                q8.v();
            }
            if (aVar.f8964q == null) {
                aVar.f8963p.d();
            }
            aVar.f8964q = null;
        }

        public static /* synthetic */ Object r(a aVar, F1.c.a aVar2) {
            aVar.f8963p = aVar2;
            return "SettableFuture hashCode: " + aVar.hashCode();
        }

        @Override // H.AbstractC0994n0
        public void d() {
            super.d();
            I.w.e(new Runnable() { // from class: Q.K
                @Override // java.lang.Runnable
                public final void run() {
                    N.a.q(this.f8944a);
                }
            });
        }

        @Override // H.AbstractC0994n0
        public Y4.a o() {
            return this.f8962o;
        }

        public boolean s() {
            I.w.b();
            return this.f8964q == null && !m();
        }

        public void t(Q q8) {
            T1.f.j(this.f8965r == null, "Consumer can only be linked once.");
            this.f8965r = q8;
        }

        public boolean u(final AbstractC0994n0 abstractC0994n0, Runnable runnable) {
            I.w.b();
            T1.f.g(abstractC0994n0);
            AbstractC0994n0 abstractC0994n1 = this.f8964q;
            if (abstractC0994n1 == abstractC0994n0) {
                return false;
            }
            T1.f.j(abstractC0994n1 == null, "A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider");
            T1.f.b(h().equals(abstractC0994n0.h()), String.format("The provider's size(%s) must match the parent(%s)", h(), abstractC0994n0.h()));
            T1.f.b(i() == abstractC0994n0.i(), String.format("The provider's format(%s) must match the parent(%s)", Integer.valueOf(i()), Integer.valueOf(abstractC0994n0.i())));
            T1.f.j(!m(), "The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.");
            this.f8964q = abstractC0994n0;
            K.n.t(abstractC0994n0.j(), this.f8963p);
            abstractC0994n0.l();
            k().a(new Runnable() { // from class: Q.M
                @Override // java.lang.Runnable
                public final void run() {
                    abstractC0994n0.e();
                }
            }, J.a.a());
            abstractC0994n0.f().a(runnable, J.a.d());
            return true;
        }
    }

    public N(int i8, int i9, g1 g1Var, Matrix matrix, boolean z8, Rect rect, int i10, int i11, boolean z9) {
        this.f8952f = i8;
        this.f8947a = i9;
        this.f8953g = g1Var;
        this.f8948b = matrix;
        this.f8949c = z8;
        this.f8950d = rect;
        this.f8955i = i10;
        this.f8954h = i11;
        this.f8951e = z9;
        this.f8958l = new a(g1Var.f(), i9);
    }

    public static /* synthetic */ void a(final N n8) {
        n8.getClass();
        J.a.d().execute(new Runnable() { // from class: Q.I
            @Override // java.lang.Runnable
            public final void run() {
                N.b(this.f8942a);
            }
        });
    }

    public static /* synthetic */ void b(N n8) {
        if (n8.f8960n) {
            return;
        }
        n8.u();
    }

    public static /* synthetic */ void c(N n8, int i8, int i9) {
        boolean z8;
        boolean z9 = true;
        if (n8.f8955i != i8) {
            n8.f8955i = i8;
            z8 = true;
        } else {
            z8 = false;
        }
        if (n8.f8954h != i9) {
            n8.f8954h = i9;
        } else {
            z9 = z8;
        }
        if (z9) {
            n8.w();
        }
    }

    public static /* synthetic */ Y4.a d(N n8, final a aVar, int i8, G0.a aVar2, G0.a aVar3, Surface surface) {
        n8.getClass();
        T1.f.g(surface);
        try {
            aVar.l();
            Q q8 = new Q(surface, n8.s(), i8, n8.f8953g.f(), aVar2, aVar3, n8.f8948b);
            q8.t().a(new Runnable() { // from class: Q.J
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.e();
                }
            }, J.a.a());
            aVar.t(q8);
            return K.n.p(q8);
        } catch (AbstractC0994n0.a e8) {
            return K.n.n(e8);
        }
    }

    public void e(Runnable runnable) {
        I.w.b();
        h();
        this.f8959m.add(runnable);
    }

    public void f(T1.a aVar) {
        T1.f.g(aVar);
        this.f8961o.add(aVar);
    }

    public final void g() {
        T1.f.j(!this.f8956j, "Consumer can only be linked once.");
        this.f8956j = true;
    }

    public final void h() {
        T1.f.j(!this.f8960n, "Edge is already closed.");
    }

    public final void i() {
        I.w.b();
        this.f8958l.d();
        this.f8960n = true;
        this.f8961o.clear();
        this.f8959m.clear();
    }

    public Y4.a j(final int i8, final G0.a aVar, final G0.a aVar2) {
        I.w.b();
        h();
        g();
        final a aVar3 = this.f8958l;
        return K.n.y(aVar3.j(), new K.a() { // from class: Q.H
            @Override // K.a
            public final Y4.a apply(Object obj) {
                return N.d(this.f8937a, aVar3, i8, aVar, aVar2, (Surface) obj);
            }
        }, J.a.d());
    }

    public S0 k(H.J j8) {
        return l(j8, true);
    }

    public S0 l(H.J j8, boolean z8) {
        I.w.b();
        h();
        S0 s8 = new S0(this.f8953g.f(), j8, z8, this.f8953g.b(), this.f8953g.g(), this.f8953g.c(), new Runnable() { // from class: Q.E
            @Override // java.lang.Runnable
            public final void run() {
                N.a(this.f8934a);
            }
        });
        try {
            final AbstractC0994n0 abstractC0994n0N = s8.n();
            a aVar = this.f8958l;
            Objects.requireNonNull(aVar);
            if (aVar.u(abstractC0994n0N, new F(aVar))) {
                Y4.a aVarK = aVar.k();
                Objects.requireNonNull(abstractC0994n0N);
                aVarK.a(new Runnable() { // from class: Q.G
                    @Override // java.lang.Runnable
                    public final void run() {
                        abstractC0994n0N.d();
                    }
                }, J.a.a());
            }
            this.f8957k = s8;
            w();
            return s8;
        } catch (AbstractC0994n0.a e8) {
            throw new AssertionError("Surface is somehow already closed", e8);
        } catch (RuntimeException e9) {
            s8.w();
            throw e9;
        }
    }

    public final void m() {
        I.w.b();
        h();
        this.f8958l.d();
    }

    public Rect n() {
        return this.f8950d;
    }

    public AbstractC0994n0 o() {
        I.w.b();
        h();
        g();
        return this.f8958l;
    }

    public int p() {
        return this.f8955i;
    }

    public Matrix q() {
        return this.f8948b;
    }

    public g1 r() {
        return this.f8953g;
    }

    public int s() {
        return this.f8952f;
    }

    public boolean t() {
        return this.f8949c;
    }

    public String toString() {
        return "SurfaceEdge{targets=" + this.f8952f + ", format=" + this.f8947a + ", resolution=" + this.f8953g.f() + ", cropRect=" + this.f8950d + ", rotationDegrees=" + this.f8955i + ", mirroring=" + this.f8951e + ", sensorToBufferTransform= " + this.f8948b + ", rotationInTransform= " + I.x.g(this.f8948b) + ", isMirrorInTransform= " + I.x.l(this.f8948b) + ", isClosed=" + this.f8960n + '}';
    }

    public void u() {
        I.w.b();
        h();
        if (this.f8958l.s()) {
            return;
        }
        this.f8956j = false;
        this.f8958l.d();
        this.f8958l = new a(this.f8953g.f(), this.f8947a);
        Iterator it = this.f8959m.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public boolean v() {
        return this.f8951e;
    }

    public final void w() {
        I.w.b();
        S0.h hVarG = S0.h.g(this.f8950d, this.f8955i, this.f8954h, t(), this.f8948b, this.f8951e);
        S0 s8 = this.f8957k;
        if (s8 != null) {
            s8.v(hVarG);
        }
        Iterator it = this.f8961o.iterator();
        while (it.hasNext()) {
            ((T1.a) it.next()).accept(hVarG);
        }
    }

    public void x(AbstractC0994n0 abstractC0994n0) {
        I.w.b();
        h();
        a aVar = this.f8958l;
        Objects.requireNonNull(aVar);
        aVar.u(abstractC0994n0, new F(aVar));
    }

    public void y(final int i8, final int i9) {
        I.w.e(new Runnable() { // from class: Q.D
            @Override // java.lang.Runnable
            public final void run() {
                N.c(this.f8931a, i8, i9);
            }
        });
    }
}
