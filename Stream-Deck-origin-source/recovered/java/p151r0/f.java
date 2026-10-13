package p151r0;

import A1.b;
import A1.c;
import A1.d;
import A1.r;
import A1.t;
import C6.G;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import p128o1.C2739d;
import p128o1.C2744i;
import p128o1.C2745j;
import p128o1.D;
import p128o1.E;
import p128o1.I;
import p128o1.J;
import p128o1.n;
import p128o1.q;
import p128o1.s;
import p143q0.F;
import p168t1.AbstractC3009n;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f32211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public I f32212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AbstractC3009n.b f32213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f32214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f32215e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f32216f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f32217g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f32218h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d f32219i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public n f32220j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f32221k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f32222l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c f32223m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public q f32224n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public t f32225o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f32226p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f32227q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f32228r;

    public /* synthetic */ f(String str, I i8, AbstractC3009n.b bVar, int i9, boolean z8, int i10, int i11, AbstractC2633k abstractC2633k) {
        this(str, i8, bVar, i9, z8, i10, i11);
    }

    public final d a() {
        return this.f32219i;
    }

    public final boolean b() {
        return this.f32221k;
    }

    public final long c() {
        return this.f32222l;
    }

    public final G d() {
        q qVar = this.f32224n;
        if (qVar != null) {
            qVar.a();
        }
        return G.f1419a;
    }

    public final n e() {
        return this.f32220j;
    }

    public final int f(int i8, t tVar) {
        int i9 = this.f32227q;
        int i10 = this.f32228r;
        if (i8 == i9 && i9 != -1) {
            return i10;
        }
        int iA = F.a(g(c.a(0, i8, 0, Integer.MAX_VALUE), tVar).f());
        this.f32227q = i8;
        this.f32228r = iA;
        return iA;
    }

    public final n g(long j8, t tVar) {
        q qVarN = n(tVar);
        return s.c(qVarN, b.a(j8, this.f32215e, this.f32214d, qVarN.h()), b.b(this.f32215e, this.f32214d, this.f32216f), p216z1.t.e(this.f32214d, p216z1.t.f39054a.b()));
    }

    public final boolean h(long j8, t tVar) {
        t tVar2;
        boolean z8 = true;
        if (this.f32217g > 1) {
            c.a aVar = c.f32183h;
            c cVar = this.f32223m;
            I i8 = this.f32212b;
            d dVar = this.f32219i;
            kotlin.jvm.internal.t.d(dVar);
            tVar2 = tVar;
            c cVarA = aVar.a(cVar, tVar2, i8, dVar, this.f32213c);
            this.f32223m = cVarA;
            j8 = cVarA.c(j8, this.f32217g);
        } else {
            tVar2 = tVar;
        }
        boolean z9 = false;
        if (l(j8, tVar2)) {
            n nVarG = g(j8, tVar2);
            this.f32226p = j8;
            long jD = c.d(j8, A1.s.a(F.a(nVarG.g()), F.a(nVarG.f())));
            this.f32222l = jD;
            if (!p216z1.t.e(this.f32214d, p216z1.t.f39054a.c()) && (r.g(jD) < nVarG.g() || r.f(jD) < nVarG.f())) {
                z9 = true;
            }
            this.f32221k = z9;
            this.f32220j = nVarG;
            return true;
        }
        if (!b.g(j8, this.f32226p)) {
            n nVar = this.f32220j;
            kotlin.jvm.internal.t.d(nVar);
            long jD2 = c.d(j8, A1.s.a(F.a(Math.min(nVar.h(), nVar.g())), F.a(nVar.f())));
            this.f32222l = jD2;
            if (p216z1.t.e(this.f32214d, p216z1.t.f39054a.c()) || (r.g(jD2) >= nVar.g() && r.f(jD2) >= nVar.f())) {
                z8 = false;
            }
            this.f32221k = z8;
            this.f32226p = j8;
        }
        return false;
    }

    public final void i() {
        this.f32220j = null;
        this.f32224n = null;
        this.f32225o = null;
        this.f32227q = -1;
        this.f32228r = -1;
        this.f32226p = b.f422b.c(0, 0);
        this.f32222l = A1.s.a(0, 0);
        this.f32221k = false;
    }

    public final int j(t tVar) {
        return F.a(n(tVar).h());
    }

    public final int k(t tVar) {
        return F.a(n(tVar).c());
    }

    public final boolean l(long j8, t tVar) {
        q qVar;
        n nVar = this.f32220j;
        if (nVar == null || (qVar = this.f32224n) == null || qVar.a() || tVar != this.f32225o) {
            return true;
        }
        if (b.g(j8, this.f32226p)) {
            return false;
        }
        return b.n(j8) != b.n(this.f32226p) || ((float) b.m(j8)) < nVar.f() || nVar.z();
    }

    public final void m(d dVar) {
        d dVar2 = this.f32219i;
        long jD = dVar != null ? a.d(dVar) : a.f32181a.a();
        if (dVar2 == null) {
            this.f32219i = dVar;
            this.f32218h = jD;
        } else if (dVar == null || !a.e(this.f32218h, jD)) {
            this.f32219i = dVar;
            this.f32218h = jD;
            i();
        }
    }

    public final q n(t tVar) {
        q qVarB = this.f32224n;
        if (qVarB == null || tVar != this.f32225o || qVarB.a()) {
            this.f32225o = tVar;
            String str = this.f32211a;
            I iD = J.d(this.f32212b, tVar);
            d dVar = this.f32219i;
            kotlin.jvm.internal.t.d(dVar);
            qVarB = p128o1.r.b(str, iD, null, null, dVar, this.f32213c, 12, null);
        }
        this.f32224n = qVarB;
        return qVarB;
    }

    public final E o(I i8) {
        d dVar;
        t tVar = this.f32225o;
        if (tVar == null || (dVar = this.f32219i) == null) {
            return null;
        }
        C2739d c2739d = new C2739d(this.f32211a, null, null, 6, null);
        if (this.f32220j == null || this.f32224n == null) {
            return null;
        }
        long jE = b.e(this.f32226p, 0, 0, 0, 0, 10, null);
        return new E(new D(c2739d, i8, D6.r.n(), this.f32216f, this.f32215e, this.f32214d, dVar, tVar, this.f32213c, jE, (AbstractC2633k) null), new C2744i(new C2745j(c2739d, i8, (List<C2739d.b>) D6.r.n(), dVar, this.f32213c), jE, this.f32216f, p216z1.t.e(this.f32214d, p216z1.t.f39054a.b()), null), this.f32222l, null);
    }

    public final void p(String str, I i8, AbstractC3009n.b bVar, int i9, boolean z8, int i10, int i11) {
        this.f32211a = str;
        this.f32212b = i8;
        this.f32213c = bVar;
        this.f32214d = i9;
        this.f32215e = z8;
        this.f32216f = i10;
        this.f32217g = i11;
        i();
    }

    public f(String str, I i8, AbstractC3009n.b bVar, int i9, boolean z8, int i10, int i11) {
        this.f32211a = str;
        this.f32212b = i8;
        this.f32213c = bVar;
        this.f32214d = i9;
        this.f32215e = z8;
        this.f32216f = i10;
        this.f32217g = i11;
        this.f32218h = a.f32181a.a();
        this.f32222l = A1.s.a(0, 0);
        this.f32226p = b.f422b.c(0, 0);
        this.f32227q = -1;
        this.f32228r = -1;
    }

    public /* synthetic */ f(String str, I i8, AbstractC3009n.b bVar, int i9, boolean z8, int i10, int i11, int i12, AbstractC2633k abstractC2633k) {
        this(str, i8, bVar, (i12 & 8) != 0 ? p216z1.t.f39054a.a() : i9, (i12 & 16) != 0 ? true : z8, (i12 & 32) != 0 ? Integer.MAX_VALUE : i10, (i12 & 64) != 0 ? 1 : i11, null);
    }
}
