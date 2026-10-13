package androidx.compose.ui.graphics;

import Q0.l;
import R0.AbstractC1619w0;
import R0.C1598l0;
import R0.N0;
import R0.O0;
import R0.T0;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14665a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f14669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f14670f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f14671g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f14674j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f14675k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f14676l;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f14680p;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public O0 f14684t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f14666b = 1.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f14667c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f14668d = 1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f14672h = AbstractC1619w0.a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f14673i = AbstractC1619w0.a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f14677m = 8.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f14678n = f.f14706b.a();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public T0 f14679o = N0.a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f14681q = a.f14661a.a();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f14682r = l.f9103b.a();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public A1.d f14683s = A1.f.b(1.0f, 0.0f, 2, null);

    @Override // androidx.compose.ui.graphics.c
    public float A() {
        return this.f14666b;
    }

    @Override // androidx.compose.ui.graphics.c
    public void B(float f8) {
        if (this.f14671g == f8) {
            return;
        }
        this.f14665a |= 32;
        this.f14671g = f8;
    }

    public void C(long j8) {
        this.f14682r = j8;
    }

    @Override // androidx.compose.ui.graphics.c
    public float C0() {
        return this.f14670f;
    }

    @Override // androidx.compose.ui.graphics.c
    public void H0(long j8) {
        if (C1598l0.q(this.f14672h, j8)) {
            return;
        }
        this.f14665a |= 64;
        this.f14672h = j8;
    }

    @Override // androidx.compose.ui.graphics.c
    public float N0() {
        return this.f14677m;
    }

    @Override // androidx.compose.ui.graphics.c
    public float P0() {
        return this.f14669e;
    }

    @Override // androidx.compose.ui.graphics.c
    public void R0(boolean z8) {
        if (this.f14680p != z8) {
            this.f14665a |= 16384;
            this.f14680p = z8;
        }
    }

    @Override // androidx.compose.ui.graphics.c
    public long S0() {
        return this.f14678n;
    }

    @Override // androidx.compose.ui.graphics.c
    public float U0() {
        return this.f14674j;
    }

    @Override // androidx.compose.ui.graphics.c
    public void W0(long j8) {
        if (f.e(this.f14678n, j8)) {
            return;
        }
        this.f14665a |= 4096;
        this.f14678n = j8;
    }

    @Override // androidx.compose.ui.graphics.c
    public void Z0(long j8) {
        if (C1598l0.q(this.f14673i, j8)) {
            return;
        }
        this.f14665a |= 128;
        this.f14673i = j8;
    }

    @Override // androidx.compose.ui.graphics.c
    public void b(float f8) {
        if (this.f14668d == f8) {
            return;
        }
        this.f14665a |= 4;
        this.f14668d = f8;
    }

    @Override // androidx.compose.ui.graphics.c
    public float b0() {
        return this.f14675k;
    }

    public float c() {
        return this.f14668d;
    }

    public long e() {
        return this.f14672h;
    }

    public boolean f() {
        return this.f14680p;
    }

    public int g() {
        return this.f14681q;
    }

    @Override // A1.d
    public float getDensity() {
        return this.f14683s.getDensity();
    }

    @Override // androidx.compose.ui.graphics.c
    public void h(float f8) {
        if (this.f14675k == f8) {
            return;
        }
        this.f14665a |= 512;
        this.f14675k = f8;
    }

    @Override // androidx.compose.ui.graphics.c
    public void i(float f8) {
        if (this.f14676l == f8) {
            return;
        }
        this.f14665a |= 1024;
        this.f14676l = f8;
    }

    @Override // androidx.compose.ui.graphics.c
    public void j(float f8) {
        if (this.f14670f == f8) {
            return;
        }
        this.f14665a |= 16;
        this.f14670f = f8;
    }

    @Override // androidx.compose.ui.graphics.c
    public float j0() {
        return this.f14676l;
    }

    @Override // androidx.compose.ui.graphics.c
    public void k(float f8) {
        if (this.f14667c == f8) {
            return;
        }
        this.f14665a |= 2;
        this.f14667c = f8;
    }

    @Override // androidx.compose.ui.graphics.c
    public void l(int i8) {
        if (a.e(this.f14681q, i8)) {
            return;
        }
        this.f14665a |= 32768;
        this.f14681q = i8;
    }

    public final int m() {
        return this.f14665a;
    }

    @Override // androidx.compose.ui.graphics.c
    public float m1() {
        return this.f14667c;
    }

    public O0 n() {
        return this.f14684t;
    }

    public float o() {
        return this.f14671g;
    }

    @Override // androidx.compose.ui.graphics.c
    public void p(float f8) {
        if (this.f14666b == f8) {
            return;
        }
        this.f14665a |= 1;
        this.f14666b = f8;
    }

    public T0 q() {
        return this.f14679o;
    }

    @Override // androidx.compose.ui.graphics.c
    public void r(O0 o8) {
        if (t.c(this.f14684t, o8)) {
            return;
        }
        this.f14665a |= 131072;
        this.f14684t = o8;
    }

    @Override // androidx.compose.ui.graphics.c
    public void s(float f8) {
        if (this.f14669e == f8) {
            return;
        }
        this.f14665a |= 8;
        this.f14669e = f8;
    }

    public long t() {
        return this.f14673i;
    }

    public final void u() {
        p(1.0f);
        k(1.0f);
        b(1.0f);
        s(0.0f);
        j(0.0f);
        B(0.0f);
        H0(AbstractC1619w0.a());
        Z0(AbstractC1619w0.a());
        w(0.0f);
        h(0.0f);
        i(0.0f);
        v(8.0f);
        W0(f.f14706b.a());
        x(N0.a());
        R0(false);
        r(null);
        l(a.f14661a.a());
        C(l.f9103b.a());
        this.f14665a = 0;
    }

    @Override // androidx.compose.ui.graphics.c
    public void v(float f8) {
        if (this.f14677m == f8) {
            return;
        }
        this.f14665a |= 2048;
        this.f14677m = f8;
    }

    @Override // androidx.compose.ui.graphics.c
    public void w(float f8) {
        if (this.f14674j == f8) {
            return;
        }
        this.f14665a |= 256;
        this.f14674j = f8;
    }

    @Override // androidx.compose.ui.graphics.c
    public void x(T0 t8) {
        if (t.c(this.f14679o, t8)) {
            return;
        }
        this.f14665a |= 8192;
        this.f14679o = t8;
    }

    @Override // A1.l
    public float x0() {
        return this.f14683s.x0();
    }

    public final void y(A1.d dVar) {
        this.f14683s = dVar;
    }
}
