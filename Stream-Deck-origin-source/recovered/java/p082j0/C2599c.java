package p082j0;

import A1.b;
import A1.r;
import A1.s;
import C6.G;
import L0.i;
import Q6.k;
import S6.c;
import kotlin.jvm.internal.u;
import p038e1.I;
import p038e1.InterfaceC2243n;
import p038e1.InterfaceC2244o;
import p038e1.J;
import p038e1.a0;
import p056g1.A;

/* JADX INFO: renamed from: j0.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2599c extends i.c implements A {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f27934n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f27935o;

    /* JADX INFO: renamed from: j0.c$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a0 f27936a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a0 a0Var) {
            super(1);
            this.f27936a = a0Var;
        }

        public final void b(a0.a aVar) {
            a0.a.j(aVar, this.f27936a, 0, 0, 0.0f, 4, null);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((a0.a) obj);
            return G.f1419a;
        }
    }

    public C2599c(float f8, boolean z8) {
        this.f27934n = f8;
        this.f27935o = z8;
    }

    public static /* synthetic */ long h2(C2599c c2599c, long j8, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = true;
        }
        return c2599c.g2(j8, z8);
    }

    public static /* synthetic */ long j2(C2599c c2599c, long j8, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = true;
        }
        return c2599c.i2(j8, z8);
    }

    public static /* synthetic */ long l2(C2599c c2599c, long j8, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = true;
        }
        return c2599c.k2(j8, z8);
    }

    public static /* synthetic */ long n2(C2599c c2599c, long j8, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = true;
        }
        return c2599c.m2(j8, z8);
    }

    @Override // p056g1.A
    public I c(J j8, p038e1.G g8, long j9) {
        long jD2 = d2(j9);
        if (!r.e(jD2, r.f455b.a())) {
            j9 = b.f422b.c(r.g(jD2), r.f(jD2));
        }
        a0 a0VarJ = g8.J(j9);
        return J.X0(j8, a0VarJ.y0(), a0VarJ.h0(), null, new a(a0VarJ), 4, null);
    }

    public final long d2(long j8) {
        if (this.f27935o) {
            long jH2 = h2(this, j8, false, 1, null);
            r.a aVar = r.f455b;
            if (!r.e(jH2, aVar.a())) {
                return jH2;
            }
            long jJ2 = j2(this, j8, false, 1, null);
            if (!r.e(jJ2, aVar.a())) {
                return jJ2;
            }
            long jL2 = l2(this, j8, false, 1, null);
            if (!r.e(jL2, aVar.a())) {
                return jL2;
            }
            long jN2 = n2(this, j8, false, 1, null);
            if (!r.e(jN2, aVar.a())) {
                return jN2;
            }
            long jG2 = g2(j8, false);
            if (!r.e(jG2, aVar.a())) {
                return jG2;
            }
            long jI2 = i2(j8, false);
            if (!r.e(jI2, aVar.a())) {
                return jI2;
            }
            long jK2 = k2(j8, false);
            if (!r.e(jK2, aVar.a())) {
                return jK2;
            }
            long jM2 = m2(j8, false);
            if (!r.e(jM2, aVar.a())) {
                return jM2;
            }
        } else {
            long jJ3 = j2(this, j8, false, 1, null);
            r.a aVar2 = r.f455b;
            if (!r.e(jJ3, aVar2.a())) {
                return jJ3;
            }
            long jH3 = h2(this, j8, false, 1, null);
            if (!r.e(jH3, aVar2.a())) {
                return jH3;
            }
            long jN3 = n2(this, j8, false, 1, null);
            if (!r.e(jN3, aVar2.a())) {
                return jN3;
            }
            long jL3 = l2(this, j8, false, 1, null);
            if (!r.e(jL3, aVar2.a())) {
                return jL3;
            }
            long jI3 = i2(j8, false);
            if (!r.e(jI3, aVar2.a())) {
                return jI3;
            }
            long jG3 = g2(j8, false);
            if (!r.e(jG3, aVar2.a())) {
                return jG3;
            }
            long jM3 = m2(j8, false);
            if (!r.e(jM3, aVar2.a())) {
                return jM3;
            }
            long jK3 = k2(j8, false);
            if (!r.e(jK3, aVar2.a())) {
                return jK3;
            }
        }
        return r.f455b.a();
    }

    public final void e2(float f8) {
        this.f27934n = f8;
    }

    public final void f2(boolean z8) {
        this.f27935o = z8;
    }

    @Override // p056g1.A
    public int g(InterfaceC2244o interfaceC2244o, InterfaceC2243n interfaceC2243n, int i8) {
        return i8 != Integer.MAX_VALUE ? c.d(i8 * this.f27934n) : interfaceC2243n.G(i8);
    }

    public final long g2(long j8, boolean z8) {
        int iD;
        int iM = b.m(j8);
        if (iM != Integer.MAX_VALUE && (iD = c.d(iM * this.f27934n)) > 0) {
            long jA = s.a(iD, iM);
            if (!z8 || A1.c.h(j8, jA)) {
                return jA;
            }
        }
        return r.f455b.a();
    }

    public final long i2(long j8, boolean z8) {
        int iD;
        int iN = b.n(j8);
        if (iN != Integer.MAX_VALUE && (iD = c.d(iN / this.f27934n)) > 0) {
            long jA = s.a(iN, iD);
            if (!z8 || A1.c.h(j8, jA)) {
                return jA;
            }
        }
        return r.f455b.a();
    }

    public final long k2(long j8, boolean z8) {
        int iO = b.o(j8);
        int iD = c.d(iO * this.f27934n);
        if (iD > 0) {
            long jA = s.a(iD, iO);
            if (!z8 || A1.c.h(j8, jA)) {
                return jA;
            }
        }
        return r.f455b.a();
    }

    public final long m2(long j8, boolean z8) {
        int iP = b.p(j8);
        int iD = c.d(iP / this.f27934n);
        if (iD > 0) {
            long jA = s.a(iP, iD);
            if (!z8 || A1.c.h(j8, jA)) {
                return jA;
            }
        }
        return r.f455b.a();
    }

    @Override // p056g1.A
    public int n(InterfaceC2244o interfaceC2244o, InterfaceC2243n interfaceC2243n, int i8) {
        return i8 != Integer.MAX_VALUE ? c.d(i8 / this.f27934n) : interfaceC2243n.W(i8);
    }

    @Override // p056g1.A
    public int o(InterfaceC2244o interfaceC2244o, InterfaceC2243n interfaceC2243n, int i8) {
        return i8 != Integer.MAX_VALUE ? c.d(i8 * this.f27934n) : interfaceC2243n.F(i8);
    }

    @Override // p056g1.A
    public int t(InterfaceC2244o interfaceC2244o, InterfaceC2243n interfaceC2243n, int i8) {
        return i8 != Integer.MAX_VALUE ? c.d(i8 / this.f27934n) : interfaceC2243n.g(i8);
    }
}
