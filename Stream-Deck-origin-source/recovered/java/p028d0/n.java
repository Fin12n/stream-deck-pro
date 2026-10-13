package p028d0;

import A1.o;
import A1.r;
import A1.s;
import A1.t;
import C6.G;
import C6.m;
import Q6.k;
import kotlin.jvm.internal.u;
import p037e0.E;
import p037e0.f0;
import p038e1.I;
import p038e1.J;
import p038e1.a0;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class n extends u {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public f0 f19694n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public f0.a f19695o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public f0.a f19696p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public f0.a f19697q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public androidx.compose.animation.f f19698r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public androidx.compose.animation.g f19699s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public t f19700t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f19701u;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public L0.c f19704x;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f19702v = p028d0.h.a();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f19703w = A1.c.b(0, 0, 0, 0, 15, null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final k f19705y = new h();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final k f19706z = new i();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19707a;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.PreEnter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.PostExit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f19707a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a0 f19708a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a0 a0Var) {
            super(1);
            this.f19708a = a0Var;
        }

        public final void b(a0.a aVar) {
            a0.a.f(aVar, this.f19708a, 0, 0, 0.0f, 4, null);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((a0.a) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a0 f19709a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f19710b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f19711c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k f19712d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a0 a0Var, long j8, long j9, k kVar) {
            super(1);
            this.f19709a = a0Var;
            this.f19710b = j8;
            this.f19711c = j9;
            this.f19712d = kVar;
        }

        public final void b(a0.a aVar) {
            aVar.q(this.f19709a, A1.n.j(this.f19711c) + A1.n.j(this.f19710b), A1.n.k(this.f19711c) + A1.n.k(this.f19710b), 0.0f, this.f19712d);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((a0.a) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f19714b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j8) {
            super(1);
            this.f19714b = j8;
        }

        public final long b(l lVar) {
            return n.this.o2(lVar, this.f19714b);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return r.b(b((l) obj));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f19715a = new e();

        public e() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final E invoke(f0.b bVar) {
            return androidx.compose.animation.e.f14248c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends u implements k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f19717b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(long j8) {
            super(1);
            this.f19717b = j8;
        }

        public final long b(l lVar) {
            return n.this.q2(lVar, this.f19717b);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return A1.n.b(b((l) obj));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends u implements k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f19719b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(long j8) {
            super(1);
            this.f19719b = j8;
        }

        public final long b(l lVar) {
            return n.this.p2(lVar, this.f19719b);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return A1.n.b(b((l) obj));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends u implements k {
        public h() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final E invoke(f0.b bVar) {
            l lVar = l.PreEnter;
            l lVar2 = l.Visible;
            E eB = null;
            if (bVar.b(lVar, lVar2)) {
                p028d0.i iVarA = n.this.e2().b().a();
                if (iVarA != null) {
                    eB = iVarA.b();
                }
            } else if (bVar.b(lVar2, l.PostExit)) {
                p028d0.i iVarA2 = n.this.f2().b().a();
                if (iVarA2 != null) {
                    eB = iVarA2.b();
                }
            } else {
                eB = androidx.compose.animation.e.f14249d;
            }
            return eB == null ? androidx.compose.animation.e.f14249d : eB;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class i extends u implements k {
        public i() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final E invoke(f0.b bVar) {
            E eA;
            E eA2;
            l lVar = l.PreEnter;
            l lVar2 = l.Visible;
            if (bVar.b(lVar, lVar2)) {
                B bF = n.this.e2().b().f();
                return (bF == null || (eA2 = bF.a()) == null) ? androidx.compose.animation.e.f14248c : eA2;
            }
            if (!bVar.b(lVar2, l.PostExit)) {
                return androidx.compose.animation.e.f14248c;
            }
            B bF2 = n.this.f2().b().f();
            return (bF2 == null || (eA = bF2.a()) == null) ? androidx.compose.animation.e.f14248c : eA;
        }
    }

    public n(f0 f0Var, e0.f0.a aVar, e0.f0.a aVar2, e0.f0.a aVar3, androidx.compose.animation.f fVar, androidx.compose.animation.g gVar, t tVar) {
        this.f19694n = f0Var;
        this.f19695o = aVar;
        this.f19696p = aVar2;
        this.f19697q = aVar3;
        this.f19698r = fVar;
        this.f19699s = gVar;
        this.f19700t = tVar;
    }

    @Override // L0.i.c
    public void N1() {
        super.N1();
        this.f19701u = false;
        this.f19702v = p028d0.h.a();
    }

    @Override // p056g1.A
    public I c(J j8, p038e1.G g8, long j9) {
        q1 q1VarA;
        q1 q1VarA2;
        if (this.f19694n.h() == this.f19694n.n()) {
            this.f19704x = null;
        } else if (this.f19704x == null) {
            L0.c cVarD2 = d2();
            if (cVarD2 == null) {
                cVarD2 = L0.c.f4806a.m();
            }
            this.f19704x = cVarD2;
        }
        if (j8.B0()) {
            a0 a0VarJ = g8.J(j9);
            long jA = s.a(a0VarJ.y0(), a0VarJ.h0());
            this.f19702v = jA;
            j2(j9);
            return J.X0(j8, r.g(jA), r.f(jA), null, new b(a0VarJ), 4, null);
        }
        k kVarA = this.f19700t.a();
        a0 a0VarJ2 = g8.J(j9);
        long jA2 = s.a(a0VarJ2.y0(), a0VarJ2.h0());
        long j10 = p028d0.h.b(this.f19702v) ? this.f19702v : jA2;
        f0.a aVar = this.f19695o;
        q1 q1VarA3 = aVar != null ? aVar.a(this.f19705y, new d(j10)) : null;
        if (q1VarA3 != null) {
            jA2 = ((r) q1VarA3.getValue()).j();
        }
        long jD = A1.c.d(j9, jA2);
        f0.a aVar2 = this.f19696p;
        long jA3 = (aVar2 == null || (q1VarA2 = aVar2.a(e.f19715a, new f(j10))) == null) ? A1.n.f446b.a() : ((A1.n) q1VarA2.getValue()).n();
        f0.a aVar3 = this.f19697q;
        long jA4 = (aVar3 == null || (q1VarA = aVar3.a(this.f19706z, new g(j10))) == null) ? A1.n.f446b.a() : ((A1.n) q1VarA.getValue()).n();
        L0.c cVar = this.f19704x;
        long jA5 = cVar != null ? cVar.a(j10, jD, t.Ltr) : A1.n.f446b.a();
        return J.X0(j8, r.g(jD), r.f(jD), null, new c(a0VarJ2, o.a(A1.n.j(jA5) + A1.n.j(jA4), A1.n.k(jA5) + A1.n.k(jA4)), jA3, kVarA), 4, null);
    }

    public final L0.c d2() {
        L0.c cVarA;
        L0.c cVarA2;
        if (this.f19694n.l().b(l.PreEnter, l.Visible)) {
            p028d0.i iVarA = this.f19698r.b().a();
            if (iVarA != null && (cVarA2 = iVarA.a()) != null) {
                return cVarA2;
            }
            p028d0.i iVarA2 = this.f19699s.b().a();
            if (iVarA2 != null) {
                return iVarA2.a();
            }
            return null;
        }
        p028d0.i iVarA3 = this.f19699s.b().a();
        if (iVarA3 != null && (cVarA = iVarA3.a()) != null) {
            return cVarA;
        }
        p028d0.i iVarA4 = this.f19698r.b().a();
        if (iVarA4 != null) {
            return iVarA4.a();
        }
        return null;
    }

    public final androidx.compose.animation.f e2() {
        return this.f19698r;
    }

    public final androidx.compose.animation.g f2() {
        return this.f19699s;
    }

    public final void g2(androidx.compose.animation.f fVar) {
        this.f19698r = fVar;
    }

    public final void h2(androidx.compose.animation.g gVar) {
        this.f19699s = gVar;
    }

    public final void i2(t tVar) {
        this.f19700t = tVar;
    }

    public final void j2(long j8) {
        this.f19701u = true;
        this.f19703w = j8;
    }

    public final void k2(f0.a aVar) {
        this.f19696p = aVar;
    }

    public final void l2(f0.a aVar) {
        this.f19695o = aVar;
    }

    public final void m2(f0.a aVar) {
        this.f19697q = aVar;
    }

    public final void n2(f0 f0Var) {
        this.f19694n = f0Var;
    }

    public final long o2(l lVar, long j8) {
        k kVarD;
        k kVarD2;
        int i8 = a.f19707a[lVar.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                p028d0.i iVarA = this.f19698r.b().a();
                if (iVarA != null && (kVarD = iVarA.d()) != null) {
                    return ((r) kVarD.invoke(r.b(j8))).j();
                }
            } else {
                if (i8 != 3) {
                    throw new m();
                }
                p028d0.i iVarA2 = this.f19699s.b().a();
                if (iVarA2 != null && (kVarD2 = iVarA2.d()) != null) {
                    return ((r) kVarD2.invoke(r.b(j8))).j();
                }
            }
        }
        return j8;
    }

    public final long p2(l lVar, long j8) {
        k kVarB;
        k kVarB2;
        B bF = this.f19698r.b().f();
        long jA = (bF == null || (kVarB2 = bF.b()) == null) ? A1.n.f446b.a() : ((A1.n) kVarB2.invoke(r.b(j8))).n();
        B bF2 = this.f19699s.b().f();
        long jA2 = (bF2 == null || (kVarB = bF2.b()) == null) ? A1.n.f446b.a() : ((A1.n) kVarB.invoke(r.b(j8))).n();
        int i8 = a.f19707a[lVar.ordinal()];
        if (i8 == 1) {
            return A1.n.f446b.a();
        }
        if (i8 == 2) {
            return jA;
        }
        if (i8 == 3) {
            return jA2;
        }
        throw new m();
    }

    public final long q2(l lVar, long j8) {
        if (this.f19704x == null) {
            return A1.n.f446b.a();
        }
        if (d2() == null) {
            return A1.n.f446b.a();
        }
        if (kotlin.jvm.internal.t.c(this.f19704x, d2())) {
            return A1.n.f446b.a();
        }
        int i8 = a.f19707a[lVar.ordinal()];
        if (i8 == 1) {
            return A1.n.f446b.a();
        }
        if (i8 == 2) {
            return A1.n.f446b.a();
        }
        if (i8 != 3) {
            throw new m();
        }
        p028d0.i iVarA = this.f19699s.b().a();
        if (iVarA == null) {
            return A1.n.f446b.a();
        }
        long j9 = ((r) iVarA.d().invoke(r.b(j8))).j();
        L0.c cVarD2 = d2();
        kotlin.jvm.internal.t.d(cVarD2);
        t tVar = t.Ltr;
        long jA = cVarD2.a(j8, j9, tVar);
        L0.c cVar = this.f19704x;
        kotlin.jvm.internal.t.d(cVar);
        long jA2 = cVar.a(j8, j9, tVar);
        return o.a(A1.n.j(jA) - A1.n.j(jA2), A1.n.k(jA) - A1.n.k(jA2));
    }
}
