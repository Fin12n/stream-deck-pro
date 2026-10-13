package p065h1;

import A1.d;
import A1.t;
import Q0.a;
import Q0.b;
import Q0.f;
import Q0.g;
import Q0.h;
import Q0.j;
import Q0.k;
import Q0.l;
import Q0.m;
import R0.D0;
import R0.H0;
import R0.InterfaceC1586f0;
import R0.N;
import R0.N0;
import R0.T;
import R0.T0;
import S6.c;
import android.graphics.Outline;
import android.os.Build;

/* JADX INFO: renamed from: h1.v0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2420v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f24345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f24346b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Outline f24347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f24348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public T0 f24349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public H0 f24350f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public H0 f24351g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f24352h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f24353i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public H0 f24354j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public j f24355k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f24356l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f24357m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f24358n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f24359o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public t f24360p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public H0 f24361q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public H0 f24362r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public D0 f24363s;

    public C2420v0(d dVar) {
        this.f24345a = dVar;
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f24347c = outline;
        l.a aVar = l.f9103b;
        this.f24348d = aVar.b();
        this.f24349e = N0.a();
        this.f24357m = f.f9082b.c();
        this.f24358n = aVar.b();
        this.f24360p = t.Ltr;
    }

    public final void a(InterfaceC1586f0 interfaceC1586f0) {
        H0 h0C = c();
        if (h0C != null) {
            InterfaceC1586f0.m(interfaceC1586f0, h0C, 0, 2, null);
            return;
        }
        float f8 = this.f24356l;
        if (f8 <= 0.0f) {
            InterfaceC1586f0.q(interfaceC1586f0, f.o(this.f24357m), f.p(this.f24357m), l.i(this.f24358n) + f.o(this.f24357m), l.g(this.f24358n) + f.p(this.f24357m), 0, 16, null);
            return;
        }
        H0 h0A = this.f24354j;
        j jVar = this.f24355k;
        if (h0A == null || !g(jVar, this.f24357m, this.f24358n, f8)) {
            j jVarC = k.c(f.o(this.f24357m), f.p(this.f24357m), f.o(this.f24357m) + l.i(this.f24358n), f.p(this.f24357m) + l.g(this.f24358n), b.b(this.f24356l, 0.0f, 2, null));
            if (h0A == null) {
                h0A = T.a();
            } else {
                h0A.reset();
            }
            h0A.i(jVarC);
            this.f24355k = jVarC;
            this.f24354j = h0A;
        }
        InterfaceC1586f0.m(interfaceC1586f0, h0A, 0, 2, null);
    }

    public final boolean b() {
        return this.f24352h;
    }

    public final H0 c() {
        j();
        return this.f24351g;
    }

    public final Outline d() {
        j();
        if (this.f24359o && this.f24346b) {
            return this.f24347c;
        }
        return null;
    }

    public final boolean e() {
        return !this.f24353i;
    }

    public final boolean f(long j8) {
        D0 d8;
        if (this.f24359o && (d8 = this.f24363s) != null) {
            return G0.b(d8, f.o(j8), f.p(j8), this.f24361q, this.f24362r);
        }
        return true;
    }

    public final boolean g(j jVar, long j8, long j9, float f8) {
        return jVar != null && k.d(jVar) && jVar.e() == f.o(j8) && jVar.g() == f.p(j8) && jVar.f() == f.o(j8) + l.i(j9) && jVar.a() == f.p(j8) + l.g(j9) && a.d(jVar.h()) == f8;
    }

    public final boolean h(T0 t8, float f8, boolean z8, float f9, t tVar, d dVar) {
        this.f24347c.setAlpha(f8);
        boolean zC = kotlin.jvm.internal.t.c(this.f24349e, t8);
        boolean z9 = !zC;
        if (!zC) {
            this.f24349e = t8;
            this.f24352h = true;
        }
        boolean z10 = z8 || f9 > 0.0f;
        if (this.f24359o != z10) {
            this.f24359o = z10;
            this.f24352h = true;
        }
        if (this.f24360p != tVar) {
            this.f24360p = tVar;
            this.f24352h = true;
        }
        if (!kotlin.jvm.internal.t.c(this.f24345a, dVar)) {
            this.f24345a = dVar;
            this.f24352h = true;
        }
        return z9;
    }

    public final void i(long j8) {
        if (l.f(this.f24348d, j8)) {
            return;
        }
        this.f24348d = j8;
        this.f24352h = true;
    }

    public final void j() {
        if (this.f24352h) {
            this.f24357m = f.f9082b.c();
            long j8 = this.f24348d;
            this.f24358n = j8;
            this.f24356l = 0.0f;
            this.f24351g = null;
            this.f24352h = false;
            this.f24353i = false;
            if (!this.f24359o || l.i(j8) <= 0.0f || l.g(this.f24348d) <= 0.0f) {
                this.f24347c.setEmpty();
                return;
            }
            this.f24346b = true;
            D0 d0A = this.f24349e.a(this.f24348d, this.f24360p, this.f24345a);
            this.f24363s = d0A;
            if (d0A instanceof D0.b) {
                l(((D0.b) d0A).a());
            } else if (d0A instanceof D0.c) {
                m(((D0.c) d0A).a());
            } else if (d0A instanceof D0.a) {
                k(((D0.a) d0A).a());
            }
        }
    }

    public final void k(H0 h8) {
        if (Build.VERSION.SDK_INT > 28 || h8.a()) {
            Outline outline = this.f24347c;
            if (!(h8 instanceof N)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            outline.setConvexPath(((N) h8).t());
            this.f24353i = !this.f24347c.canClip();
        } else {
            this.f24346b = false;
            this.f24347c.setEmpty();
            this.f24353i = true;
        }
        this.f24351g = h8;
    }

    public final void l(h hVar) {
        this.f24357m = g.a(hVar.i(), hVar.l());
        this.f24358n = m.a(hVar.n(), hVar.h());
        this.f24347c.setRect(c.d(hVar.i()), c.d(hVar.l()), c.d(hVar.j()), c.d(hVar.e()));
    }

    public final void m(j jVar) {
        float fD = a.d(jVar.h());
        this.f24357m = g.a(jVar.e(), jVar.g());
        this.f24358n = m.a(jVar.j(), jVar.d());
        if (k.d(jVar)) {
            this.f24347c.setRoundRect(c.d(jVar.e()), c.d(jVar.g()), c.d(jVar.f()), c.d(jVar.a()), fD);
            this.f24356l = fD;
            return;
        }
        H0 h0A = this.f24350f;
        if (h0A == null) {
            h0A = T.a();
            this.f24350f = h0A;
        }
        h0A.reset();
        h0A.i(jVar);
        k(h0A);
    }
}
