package androidx.compose.ui.graphics;

import C6.G;
import L0.i;
import Q6.k;
import R0.C1598l0;
import R0.O0;
import R0.T0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.u;
import p038e1.I;
import p038e1.J;
import p038e1.a0;
import p056g1.A;
import p056g1.AbstractC2347k;
import p056g1.X;
import p056g1.Z;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e extends i.c implements A {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public O0 f14685A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f14686B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f14687C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f14688D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public k f14689E;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f14690n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f14691o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f14692p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f14693q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f14694r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f14695s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f14696t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f14697u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f14698v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f14699w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f14700x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public T0 f14701y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f14702z;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {
        public a() {
            super(1);
        }

        public final void b(c cVar) {
            cVar.p(e.this.A());
            cVar.k(e.this.m1());
            cVar.b(e.this.e2());
            cVar.s(e.this.P0());
            cVar.j(e.this.C0());
            cVar.B(e.this.j2());
            cVar.w(e.this.U0());
            cVar.h(e.this.b0());
            cVar.i(e.this.j0());
            cVar.v(e.this.N0());
            cVar.W0(e.this.S0());
            cVar.x(e.this.k2());
            cVar.R0(e.this.g2());
            cVar.r(e.this.i2());
            cVar.H0(e.this.f2());
            cVar.Z0(e.this.l2());
            cVar.l(e.this.h2());
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((c) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a0 f14704a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f14705b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a0 a0Var, e eVar) {
            super(1);
            this.f14704a = a0Var;
            this.f14705b = eVar;
        }

        public final void b(a0.a aVar) {
            a0.a.r(aVar, this.f14704a, 0, 0, 0.0f, this.f14705b.f14689E, 4, null);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((a0.a) obj);
            return G.f1419a;
        }
    }

    public /* synthetic */ e(float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, long j8, T0 t8, boolean z8, O0 o8, long j9, long j10, int i8, AbstractC2633k abstractC2633k) {
        this(f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, j8, t8, z8, o8, j9, j10, i8);
    }

    public final float A() {
        return this.f14690n;
    }

    public final void B(float f8) {
        this.f14695s = f8;
    }

    public final float C0() {
        return this.f14694r;
    }

    public final void H0(long j8) {
        this.f14686B = j8;
    }

    @Override // L0.i.c
    public boolean I1() {
        return false;
    }

    public final float N0() {
        return this.f14699w;
    }

    public final float P0() {
        return this.f14693q;
    }

    public final void R0(boolean z8) {
        this.f14702z = z8;
    }

    public final long S0() {
        return this.f14700x;
    }

    public final float U0() {
        return this.f14696t;
    }

    public final void W0(long j8) {
        this.f14700x = j8;
    }

    public final void Z0(long j8) {
        this.f14687C = j8;
    }

    public final void b(float f8) {
        this.f14692p = f8;
    }

    public final float b0() {
        return this.f14697u;
    }

    @Override // p056g1.A
    public I c(J j8, p038e1.G g8, long j9) {
        a0 a0VarJ = g8.J(j9);
        return J.X0(j8, a0VarJ.y0(), a0VarJ.h0(), null, new b(a0VarJ, this), 4, null);
    }

    public final float e2() {
        return this.f14692p;
    }

    public final long f2() {
        return this.f14686B;
    }

    public final boolean g2() {
        return this.f14702z;
    }

    public final void h(float f8) {
        this.f14697u = f8;
    }

    public final int h2() {
        return this.f14688D;
    }

    public final void i(float f8) {
        this.f14698v = f8;
    }

    public final O0 i2() {
        return this.f14685A;
    }

    public final void j(float f8) {
        this.f14694r = f8;
    }

    public final float j0() {
        return this.f14698v;
    }

    public final float j2() {
        return this.f14695s;
    }

    public final void k(float f8) {
        this.f14691o = f8;
    }

    public final T0 k2() {
        return this.f14701y;
    }

    public final void l(int i8) {
        this.f14688D = i8;
    }

    public final long l2() {
        return this.f14687C;
    }

    public final float m1() {
        return this.f14691o;
    }

    public final void m2() {
        X xJ2 = AbstractC2347k.h(this, Z.a(2)).j2();
        if (xJ2 != null) {
            xJ2.U2(this.f14689E, true);
        }
    }

    public final void p(float f8) {
        this.f14690n = f8;
    }

    public final void r(O0 o8) {
        this.f14685A = o8;
    }

    public final void s(float f8) {
        this.f14693q = f8;
    }

    public String toString() {
        return "SimpleGraphicsLayerModifier(scaleX=" + this.f14690n + ", scaleY=" + this.f14691o + ", alpha = " + this.f14692p + ", translationX=" + this.f14693q + ", translationY=" + this.f14694r + ", shadowElevation=" + this.f14695s + ", rotationX=" + this.f14696t + ", rotationY=" + this.f14697u + ", rotationZ=" + this.f14698v + ", cameraDistance=" + this.f14699w + ", transformOrigin=" + ((Object) f.i(this.f14700x)) + ", shape=" + this.f14701y + ", clip=" + this.f14702z + ", renderEffect=" + this.f14685A + ", ambientShadowColor=" + ((Object) C1598l0.x(this.f14686B)) + ", spotShadowColor=" + ((Object) C1598l0.x(this.f14687C)) + ", compositingStrategy=" + ((Object) androidx.compose.ui.graphics.a.g(this.f14688D)) + ')';
    }

    public final void v(float f8) {
        this.f14699w = f8;
    }

    public final void w(float f8) {
        this.f14696t = f8;
    }

    public final void x(T0 t8) {
        this.f14701y = t8;
    }

    public /* synthetic */ e(float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, long j8, T0 t8, boolean z8, O0 o8, long j9, long j10, int i8, int i9, AbstractC2633k abstractC2633k) {
        this(f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, j8, t8, z8, o8, j9, j10, (i9 & 65536) != 0 ? androidx.compose.ui.graphics.a.f14661a.a() : i8, null);
    }

    public e(float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, long j8, T0 t8, boolean z8, O0 o8, long j9, long j10, int i8) {
        this.f14690n = f8;
        this.f14691o = f9;
        this.f14692p = f10;
        this.f14693q = f11;
        this.f14694r = f12;
        this.f14695s = f13;
        this.f14696t = f14;
        this.f14697u = f15;
        this.f14698v = f16;
        this.f14699w = f17;
        this.f14700x = j8;
        this.f14701y = t8;
        this.f14702z = z8;
        this.f14685A = o8;
        this.f14686B = j9;
        this.f14687C = j10;
        this.f14688D = i8;
        this.f14689E = new a();
    }
}
