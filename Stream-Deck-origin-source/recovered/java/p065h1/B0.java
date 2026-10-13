package p065h1;

import A1.n;
import A1.r;
import A1.t;
import C6.G;
import Q0.m;
import Q6.k;
import Q6.o;
import R0.AbstractC1602n0;
import R0.C1588g0;
import R0.F;
import R0.F0;
import R0.H0;
import R0.InterfaceC1586f0;
import R0.M;
import R0.N0;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Build;
import androidx.compose.ui.graphics.d;
import androidx.compose.ui.graphics.f;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.u;
import p056g1.g0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class B0 implements g0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f24070n = new b(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f24071o = 8;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final o f24072p = a.f24086a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AndroidComposeView f24073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f24074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Function0 f24075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f24076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2420v0 f24077e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f24078f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f24079g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public F0 f24080h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C2411q0 f24081i = new C2411q0(f24072p);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C1588g0 f24082j = new C1588g0();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f24083k = f.f14706b.a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InterfaceC2379a0 f24084l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f24085m;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f24086a = new a();

        public a() {
            super(2);
        }

        public final void b(InterfaceC2379a0 interfaceC2379a0, Matrix matrix) {
            interfaceC2379a0.K(matrix);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC2379a0) obj, (Matrix) obj2);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {
        public /* synthetic */ b(AbstractC2633k abstractC2633k) {
            this();
        }

        public b() {
        }
    }

    public B0(AndroidComposeView androidComposeView, k kVar, Function0 function0) {
        this.f24073a = androidComposeView;
        this.f24074b = kVar;
        this.f24075c = function0;
        this.f24077e = new C2420v0(androidComposeView.getDensity());
        InterfaceC2379a0 c2428z0 = Build.VERSION.SDK_INT >= 29 ? new C2428z0(androidComposeView) : new C2424x0(androidComposeView);
        c2428z0.I(true);
        c2428z0.q(false);
        this.f24084l = c2428z0;
    }

    @Override // p056g1.g0
    public void a(float[] fArr) {
        R0.B0.k(fArr, this.f24081i.b(this.f24084l));
    }

    @Override // p056g1.g0
    public boolean b(long j8) {
        float fO = Q0.f.o(j8);
        float fP = Q0.f.p(j8);
        if (this.f24084l.D()) {
            return 0.0f <= fO && fO < ((float) this.f24084l.g()) && 0.0f <= fP && fP < ((float) this.f24084l.f());
        }
        if (this.f24084l.G()) {
            return this.f24077e.f(j8);
        }
        return true;
    }

    @Override // p056g1.g0
    public long c(long j8, boolean z8) {
        if (!z8) {
            return R0.B0.f(this.f24081i.b(this.f24084l), j8);
        }
        float[] fArrA = this.f24081i.a(this.f24084l);
        return fArrA != null ? R0.B0.f(fArrA, j8) : Q0.f.f9082b.a();
    }

    @Override // p056g1.g0
    public void d(long j8) {
        int iG = r.g(j8);
        int iF = r.f(j8);
        float f8 = iG;
        this.f24084l.o(f.f(this.f24083k) * f8);
        float f9 = iF;
        this.f24084l.x(f.g(this.f24083k) * f9);
        InterfaceC2379a0 interfaceC2379a0 = this.f24084l;
        if (interfaceC2379a0.t(interfaceC2379a0.a(), this.f24084l.E(), this.f24084l.a() + iG, this.f24084l.E() + iF)) {
            this.f24077e.i(m.a(f8, f9));
            this.f24084l.B(this.f24077e.d());
            invalidate();
            this.f24081i.c();
        }
    }

    @Override // p056g1.g0
    public void destroy() {
        if (this.f24084l.A()) {
            this.f24084l.u();
        }
        this.f24074b = null;
        this.f24075c = null;
        this.f24078f = true;
        m(false);
        this.f24073a.r0();
        this.f24073a.p0(this);
    }

    @Override // p056g1.g0
    public void e(d dVar, t tVar, A1.d dVar2) {
        Function0 function0;
        int iM = dVar.m() | this.f24085m;
        int i8 = iM & 4096;
        if (i8 != 0) {
            this.f24083k = dVar.S0();
        }
        boolean z8 = false;
        boolean z9 = this.f24084l.G() && !this.f24077e.e();
        if ((iM & 1) != 0) {
            this.f24084l.p(dVar.A());
        }
        if ((iM & 2) != 0) {
            this.f24084l.k(dVar.m1());
        }
        if ((iM & 4) != 0) {
            this.f24084l.b(dVar.c());
        }
        if ((iM & 8) != 0) {
            this.f24084l.s(dVar.P0());
        }
        if ((iM & 16) != 0) {
            this.f24084l.j(dVar.C0());
        }
        if ((iM & 32) != 0) {
            this.f24084l.y(dVar.o());
        }
        if ((iM & 64) != 0) {
            this.f24084l.F(AbstractC1602n0.j(dVar.e()));
        }
        if ((iM & 128) != 0) {
            this.f24084l.J(AbstractC1602n0.j(dVar.t()));
        }
        if ((iM & 1024) != 0) {
            this.f24084l.i(dVar.j0());
        }
        if ((iM & 256) != 0) {
            this.f24084l.w(dVar.U0());
        }
        if ((iM & 512) != 0) {
            this.f24084l.h(dVar.b0());
        }
        if ((iM & 2048) != 0) {
            this.f24084l.v(dVar.N0());
        }
        if (i8 != 0) {
            this.f24084l.o(f.f(this.f24083k) * this.f24084l.g());
            this.f24084l.x(f.g(this.f24083k) * this.f24084l.f());
        }
        boolean z10 = dVar.f() && dVar.q() != N0.a();
        if ((iM & 24576) != 0) {
            this.f24084l.H(z10);
            this.f24084l.q(dVar.f() && dVar.q() == N0.a());
        }
        if ((131072 & iM) != 0) {
            this.f24084l.r(dVar.n());
        }
        if ((32768 & iM) != 0) {
            this.f24084l.l(dVar.g());
        }
        boolean zH = this.f24077e.h(dVar.q(), dVar.c(), z10, dVar.o(), tVar, dVar2);
        if (this.f24077e.b()) {
            this.f24084l.B(this.f24077e.d());
        }
        if (z10 && !this.f24077e.e()) {
            z8 = true;
        }
        if (z9 != z8 || (z8 && zH)) {
            invalidate();
        } else {
            n();
        }
        if (!this.f24079g && this.f24084l.L() > 0.0f && (function0 = this.f24075c) != null) {
            function0.invoke();
        }
        if ((iM & 7963) != 0) {
            this.f24081i.c();
        }
        this.f24085m = dVar.m();
    }

    @Override // p056g1.g0
    public void f(InterfaceC1586f0 interfaceC1586f0) {
        Canvas canvasD = F.d(interfaceC1586f0);
        if (canvasD.isHardwareAccelerated()) {
            j();
            boolean z8 = this.f24084l.L() > 0.0f;
            this.f24079g = z8;
            if (z8) {
                interfaceC1586f0.y();
            }
            this.f24084l.n(canvasD);
            if (this.f24079g) {
                interfaceC1586f0.l();
                return;
            }
            return;
        }
        float fA = this.f24084l.a();
        float fE = this.f24084l.E();
        float fD = this.f24084l.d();
        float fM = this.f24084l.m();
        if (this.f24084l.c() < 1.0f) {
            F0 f0A = this.f24080h;
            if (f0A == null) {
                f0A = M.a();
                this.f24080h = f0A;
            }
            f0A.b(this.f24084l.c());
            canvasD.saveLayer(fA, fE, fD, fM, f0A.k());
        } else {
            interfaceC1586f0.k();
        }
        interfaceC1586f0.d(fA, fE);
        interfaceC1586f0.o(this.f24081i.b(this.f24084l));
        l(interfaceC1586f0);
        k kVar = this.f24074b;
        if (kVar != null) {
            kVar.invoke(interfaceC1586f0);
        }
        interfaceC1586f0.x();
        m(false);
    }

    @Override // p056g1.g0
    public void g(Q0.d dVar, boolean z8) {
        if (!z8) {
            R0.B0.g(this.f24081i.b(this.f24084l), dVar);
            return;
        }
        float[] fArrA = this.f24081i.a(this.f24084l);
        if (fArrA == null) {
            dVar.g(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            R0.B0.g(fArrA, dVar);
        }
    }

    @Override // p056g1.g0
    public void h(float[] fArr) {
        float[] fArrA = this.f24081i.a(this.f24084l);
        if (fArrA != null) {
            R0.B0.k(fArr, fArrA);
        }
    }

    @Override // p056g1.g0
    public void i(long j8) {
        int iA = this.f24084l.a();
        int iE = this.f24084l.E();
        int iJ = n.j(j8);
        int iK = n.k(j8);
        if (iA == iJ && iE == iK) {
            return;
        }
        if (iA != iJ) {
            this.f24084l.e(iJ - iA);
        }
        if (iE != iK) {
            this.f24084l.z(iK - iE);
        }
        n();
        this.f24081i.c();
    }

    @Override // p056g1.g0
    public void invalidate() {
        if (this.f24076d || this.f24078f) {
            return;
        }
        this.f24073a.invalidate();
        m(true);
    }

    @Override // p056g1.g0
    public void j() {
        if (this.f24076d || !this.f24084l.A()) {
            H0 h0C = (!this.f24084l.G() || this.f24077e.e()) ? null : this.f24077e.c();
            k kVar = this.f24074b;
            if (kVar != null) {
                this.f24084l.C(this.f24082j, h0C, kVar);
            }
            m(false);
        }
    }

    @Override // p056g1.g0
    public void k(k kVar, Function0 function0) {
        m(false);
        this.f24078f = false;
        this.f24079g = false;
        this.f24083k = f.f14706b.a();
        this.f24074b = kVar;
        this.f24075c = function0;
    }

    public final void l(InterfaceC1586f0 interfaceC1586f0) {
        if (this.f24084l.G() || this.f24084l.D()) {
            this.f24077e.a(interfaceC1586f0);
        }
    }

    public final void m(boolean z8) {
        if (z8 != this.f24076d) {
            this.f24076d = z8;
            this.f24073a.k0(this, z8);
        }
    }

    public final void n() {
        d1.f24276a.a(this.f24073a);
    }
}
