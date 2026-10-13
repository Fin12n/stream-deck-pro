package p100l0;

import A1.n;
import A1.o;
import A1.s;
import A1.t;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import p038e1.a0;
import p109m0.C2668f;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class w implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f29087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f29088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f29089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f29090e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f29091f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f29092g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f29093h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f29094i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f29095j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f29096k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l f29097l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f29098m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f29099n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f29100o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f29101p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f29102q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f29103r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f29104s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f29105t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f29106u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f29107v;

    public /* synthetic */ w(int i8, Object obj, boolean z8, int i9, int i10, boolean z9, t tVar, int i11, int i12, List list, long j8, Object obj2, l lVar, AbstractC2633k abstractC2633k) {
        this(i8, obj, z8, i9, i10, z9, tVar, i11, i12, list, j8, obj2, lVar);
    }

    public static /* synthetic */ void r(w wVar, int i8, int i9, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 16) != 0) {
            i12 = -1;
        }
        if ((i14 & 32) != 0) {
            i13 = -1;
        }
        wVar.q(i8, i9, i10, i11, i12, i13);
    }

    @Override // p100l0.k
    public int a() {
        return this.f29105t;
    }

    @Override // p100l0.k
    public long b() {
        return this.f29104s;
    }

    @Override // p100l0.k
    public int c() {
        return this.f29106u;
    }

    public final void d(int i8) {
        if (this.f29107v) {
            return;
        }
        long jB = b();
        int iJ = this.f29088c ? n.j(jB) : n.j(jB) + i8;
        boolean z8 = this.f29088c;
        int iK = n.k(jB);
        if (z8) {
            iK += i8;
        }
        this.f29104s = o.a(iJ, iK);
        int iN = n();
        for (int i9 = 0; i9 < iN; i9++) {
            C2668f c2668fB = this.f29097l.b(g(), i9);
            if (c2668fB != null) {
                long jN = c2668fB.n();
                int iJ2 = this.f29088c ? n.j(jN) : Integer.valueOf(n.j(jN) + i8).intValue();
                boolean z9 = this.f29088c;
                int iK2 = n.k(jN);
                if (z9) {
                    iK2 += i8;
                }
                c2668fB.x(o.a(iJ2, iK2));
            }
        }
    }

    public final int e() {
        return this.f29088c ? n.j(b()) : n.k(b());
    }

    public final int f() {
        return this.f29089d;
    }

    public Object g() {
        return this.f29087b;
    }

    @Override // p100l0.k
    public int getIndex() {
        return this.f29086a;
    }

    public final int h(long j8) {
        return this.f29088c ? n.k(j8) : n.j(j8);
    }

    public final int i() {
        return this.f29098m;
    }

    public final int j(a0 a0Var) {
        return this.f29088c ? a0Var.h0() : a0Var.y0();
    }

    public final int k() {
        return this.f29099n;
    }

    public final boolean l() {
        return this.f29107v;
    }

    public final Object m(int i8) {
        return ((a0) this.f29094i.get(i8)).e();
    }

    public final int n() {
        return this.f29094i.size();
    }

    public final boolean o() {
        return this.f29088c;
    }

    public final void p(a0.a aVar) {
        a0.a aVar2;
        int iJ;
        int iK;
        if (this.f29100o == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("position() should be called first");
        }
        int iN = n();
        int i8 = 0;
        while (i8 < iN) {
            a0 a0Var = (a0) this.f29094i.get(i8);
            int iJ2 = this.f29101p - j(a0Var);
            int i9 = this.f29102q;
            long jB = b();
            C2668f c2668fB = this.f29097l.b(g(), i8);
            if (c2668fB != null) {
                long jM = c2668fB.m();
                long jA = o.a(n.j(jB) + n.j(jM), n.k(jB) + n.k(jM));
                if ((h(jB) <= iJ2 && h(jA) <= iJ2) || (h(jB) >= i9 && h(jA) >= i9)) {
                    c2668fB.j();
                }
                jB = jA;
            }
            if (this.f29090e) {
                if (this.f29088c) {
                    iJ = n.j(jB);
                } else {
                    iJ = (this.f29100o - n.j(jB)) - j(a0Var);
                }
                if (this.f29088c) {
                    iK = (this.f29100o - n.k(jB)) - j(a0Var);
                } else {
                    iK = n.k(jB);
                }
                jB = o.a(iJ, iK);
            }
            long j8 = this.f29095j;
            long jA2 = o.a(n.j(jB) + n.j(j8), n.k(jB) + n.k(j8));
            if (this.f29088c) {
                aVar2 = aVar;
                a0.a.t(aVar2, a0Var, jA2, 0.0f, null, 6, null);
            } else {
                aVar2 = aVar;
                a0.a.p(aVar2, a0Var, jA2, 0.0f, null, 6, null);
            }
            i8++;
            aVar = aVar2;
        }
    }

    public final void q(int i8, int i9, int i10, int i11, int i12, int i13) {
        boolean z8 = this.f29088c;
        this.f29100o = z8 ? i11 : i10;
        if (!z8) {
            i10 = i11;
        }
        if (z8 && this.f29091f == t.Rtl) {
            i9 = (i10 - i9) - this.f29089d;
        }
        this.f29104s = z8 ? o.a(i9, i8) : o.a(i8, i9);
        this.f29105t = i12;
        this.f29106u = i13;
        this.f29101p = -this.f29092g;
        this.f29102q = this.f29100o + this.f29093h;
    }

    public final void s(boolean z8) {
        this.f29107v = z8;
    }

    public w(int i8, Object obj, boolean z8, int i9, int i10, boolean z9, t tVar, int i11, int i12, List list, long j8, Object obj2, l lVar) {
        this.f29086a = i8;
        this.f29087b = obj;
        this.f29088c = z8;
        this.f29089d = i9;
        this.f29090e = z9;
        this.f29091f = tVar;
        this.f29092g = i11;
        this.f29093h = i12;
        this.f29094i = list;
        this.f29095j = j8;
        this.f29096k = obj2;
        this.f29097l = lVar;
        this.f29100o = Integer.MIN_VALUE;
        int size = list.size();
        int iMax = 0;
        for (int i13 = 0; i13 < size; i13++) {
            a0 a0Var = (a0) list.get(i13);
            iMax = Math.max(iMax, this.f29088c ? a0Var.h0() : a0Var.y0());
        }
        this.f29098m = iMax;
        this.f29099n = W6.n.d(i10 + iMax, 0);
        this.f29103r = this.f29088c ? s.a(this.f29089d, iMax) : s.a(iMax, this.f29089d);
        this.f29104s = n.f446b.a();
        this.f29105t = -1;
        this.f29106u = -1;
    }
}
