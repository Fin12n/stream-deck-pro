package p091k0;

import C6.G;
import D6.r;
import D6.z;
import I0.j;
import I0.l;
import J0.AbstractC1028k;
import Q6.k;
import Q6.o;
import Z.JTT.ryTuoS;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.C2635m;
import kotlin.jvm.internal.u;
import p017b7.AbstractC1789i;
import p017b7.J;
import p037e0.AbstractC2214j;
import p037e0.AbstractC2216l;
import p037e0.C2215k;
import p037e0.a0;
import p037e0.j0;
import p037e0.l0;
import p038e1.c0;
import p038e1.d0;
import p046f0.K;
import p055g0.I;
import p055g0.M;
import p055g0.N;
import p073i0.m;
import p109m0.A;
import p109m0.B;
import p109m0.C2663a;
import p109m0.C2671i;
import p109m0.L;
import p215z0.InterfaceC3164l0;
import p215z0.g1;
import p215z0.l1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class y implements M {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final c f28533B = new c(null);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final j f28534C = I0.a.a(a.f28562a, b.f28563a);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public C2215k f28535A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f28536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s f28537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f28538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p091k0.d f28539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC3164l0 f28540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m f28541f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f28542g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public A1.d f28543h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final M f28544i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f28545j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f28546k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f28547l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public B.a f28548m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f28549n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c0 f28550o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d0 f28551p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C2663a f28552q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j f28553r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C2671i f28554s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f28555t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final A f28556u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final InterfaceC3164l0 f28557v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final InterfaceC3164l0 f28558w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final InterfaceC3164l0 f28559x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final B f28560y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public J f28561z;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f28562a = new a();

        public a() {
            super(2);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final List invoke(l lVar, y yVar) {
            return r.q(Integer.valueOf(yVar.p()), Integer.valueOf(yVar.q()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f28563a = new b();

        public b() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final y invoke(List list) {
            return new y(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c {
        public /* synthetic */ c(AbstractC2633k abstractC2633k) {
            this();
        }

        public final j a() {
            return y.f28534C;
        }

        public c() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d implements d0 {
        public d() {
        }

        @Override // p038e1.d0
        public void h(c0 c0Var) {
            y.this.f28550o = c0Var;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f28565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f28566b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f28567c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f28568d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f28570f;

        public e(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f28568d = obj;
            this.f28570f |= Integer.MIN_VALUE;
            return y.this.f(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends u implements k {
        public g() {
            super(1);
        }

        public final Float b(float f8) {
            return Float.valueOf(-y.this.G(-f8));
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((Number) obj).floatValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends I6.l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f28576a;

        public h(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return y.this.new h(dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((h) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f28576a;
            if (i8 == 0) {
                C6.r.b(obj);
                C2215k c2215k = y.this.f28535A;
                Float fC = I6.b.c(0.0f);
                a0 a0VarG = AbstractC2214j.g(0.0f, 400.0f, I6.b.c(0.5f), 1, null);
                this.f28576a = 1;
                if (p037e0.d0.j(c2215k, fC, a0VarG, true, null, this, 8, null) == objF) {
                    return objF;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
            }
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class i extends I6.l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f28578a;

        public i(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return y.this.new i(dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((i) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f28578a;
            if (i8 == 0) {
                C6.r.b(obj);
                C2215k c2215k = y.this.f28535A;
                Float fC = I6.b.c(0.0f);
                a0 a0VarG = AbstractC2214j.g(0.0f, 400.0f, I6.b.c(0.5f), 1, null);
                this.f28578a = 1;
                if (p037e0.d0.j(c2215k, fC, a0VarG, true, null, this, 8, null) == objF) {
                    return objF;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
            }
            return G.f1419a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public y() {
        int i8 = 0;
        this(i8, i8, 3, null);
    }

    public static /* synthetic */ void F(y yVar, float f8, q qVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            qVar = yVar.u();
        }
        yVar.E(f8, qVar);
    }

    public static /* synthetic */ Object I(y yVar, int i8, int i9, G6.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i9 = 0;
        }
        return yVar.H(i8, i9, dVar);
    }

    public static /* synthetic */ void k(y yVar, s sVar, boolean z8, boolean z9, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            z9 = false;
        }
        yVar.j(sVar, z8, z9);
    }

    public final c0 A() {
        return this.f28550o;
    }

    public final d0 B() {
        return this.f28551p;
    }

    public final float C() {
        return ((Number) this.f28535A.getValue()).floatValue();
    }

    public final float D() {
        return this.f28542g;
    }

    public final void E(float f8, q qVar) {
        B.a aVar;
        if (this.f28546k && !qVar.b().isEmpty()) {
            boolean z8 = f8 < 0.0f;
            int index = z8 ? ((l) z.t0(qVar.b())).getIndex() + 1 : ((l) z.i0(qVar.b())).getIndex() - 1;
            if (index == this.f28547l || index < 0 || index >= qVar.a()) {
                return;
            }
            if (this.f28549n != z8 && (aVar = this.f28548m) != null) {
                aVar.cancel();
            }
            this.f28549n = z8;
            this.f28547l = index;
            this.f28548m = this.f28560y.a(index, this.f28555t);
        }
    }

    public final float G(float f8) {
        if ((f8 < 0.0f && !a()) || (f8 > 0.0f && !d())) {
            return 0.0f;
        }
        if (Math.abs(this.f28542g) > 0.5f) {
            throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.f28542g).toString());
        }
        float f9 = this.f28542g + f8;
        this.f28542g = f9;
        if (Math.abs(f9) > 0.5f) {
            s sVar = (s) this.f28540e.getValue();
            float f10 = this.f28542g;
            int iD = S6.c.d(f10);
            s sVar2 = this.f28537b;
            boolean zO = sVar.o(iD, !this.f28536a);
            if (zO && sVar2 != null) {
                zO = sVar2.o(iD, true);
            }
            if (zO) {
                j(sVar, this.f28536a, true);
                L.d(this.f28559x);
                E(f10 - this.f28542g, sVar);
            } else {
                c0 c0Var = this.f28550o;
                if (c0Var != null) {
                    c0Var.i();
                }
                F(this, f10 - this.f28542g, null, 2, null);
            }
        }
        if (Math.abs(this.f28542g) <= 0.5f) {
            return f8;
        }
        float f11 = f8 - this.f28542g;
        this.f28542g = 0.0f;
        return f11;
    }

    public final Object H(int i8, int i9, G6.d dVar) {
        Object objC = M.c(this, null, new f(i8, i9, null), dVar, 1, null);
        return objC == H6.c.f() ? objC : G.f1419a;
    }

    public final void J(boolean z8) {
        this.f28558w.setValue(Boolean.valueOf(z8));
    }

    public final void K(boolean z8) {
        this.f28557v.setValue(Boolean.valueOf(z8));
    }

    public final void L(J j8) {
        this.f28561z = j8;
    }

    public final void M(A1.d dVar) {
        this.f28543h = dVar;
    }

    public final void N(long j8) {
        this.f28555t = j8;
    }

    public final void O(int i8, int i9) {
        this.f28538c.d(i8, i9);
        this.f28553r.f();
        c0 c0Var = this.f28550o;
        if (c0Var != null) {
            c0Var.i();
        }
    }

    public final void P(float f8) {
        if (f8 <= this.f28543h.E0(z.f28580a)) {
            return;
        }
        AbstractC1028k abstractC1028kC = AbstractC1028k.f3974e.c();
        try {
            AbstractC1028k abstractC1028kL = abstractC1028kC.l();
            try {
                float fFloatValue = ((Number) this.f28535A.getValue()).floatValue();
                if (this.f28535A.A()) {
                    this.f28535A = AbstractC2216l.g(this.f28535A, fFloatValue - f8, 0.0f, 0L, 0L, false, 30, null);
                    J j8 = this.f28561z;
                    if (j8 != null) {
                        AbstractC1789i.d(j8, null, null, new h(null), 3, null);
                    }
                } else {
                    this.f28535A = new C2215k(l0.i(C2635m.f28814a), Float.valueOf(-f8), null, 0L, 0L, false, 60, null);
                    J j9 = this.f28561z;
                    if (j9 != null) {
                        AbstractC1789i.d(j9, null, null, new i(null), 3, null);
                    }
                }
                abstractC1028kC.s(abstractC1028kL);
                abstractC1028kC.d();
            } catch (Throwable th) {
                abstractC1028kC.s(abstractC1028kL);
                throw th;
            }
        } catch (Throwable th2) {
            abstractC1028kC.d();
            throw th2;
        }
    }

    public final int Q(m mVar, int i8) {
        return this.f28538c.j(mVar, i8);
    }

    @Override // p055g0.M
    public boolean a() {
        return ((Boolean) this.f28557v.getValue()).booleanValue();
    }

    @Override // p055g0.M
    public boolean b() {
        return this.f28544i.b();
    }

    @Override // p055g0.M
    public boolean d() {
        return ((Boolean) this.f28558w.getValue()).booleanValue();
    }

    @Override // p055g0.M
    public float e(float f8) {
        return this.f28544i.e(f8);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        if (r8.f(r6, r7, r0) == r1) goto L22;
     */
    @Override // p055g0.M
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object f(K k8, o oVar, G6.d dVar) {
        e eVar;
        y yVar;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i8 = eVar.f28570f;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                eVar.f28570f = i8 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object obj = eVar.f28568d;
        Object objF = H6.c.f();
        int i9 = eVar.f28570f;
        if (i9 != 0) {
            if (i9 == 1) {
                oVar = (o) eVar.f28567c;
                k8 = (K) eVar.f28566b;
                yVar = (y) eVar.f28565a;
                C6.r.b(obj);
            } else {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
            }
            return G.f1419a;
        }
        C6.r.b(obj);
        C2663a c2663a = this.f28552q;
        eVar.f28565a = this;
        eVar.f28566b = k8;
        eVar.f28567c = oVar;
        eVar.f28570f = 1;
        if (c2663a.k(eVar) != objF) {
            yVar = this;
        }
        return objF;
        M m8 = yVar.f28544i;
        eVar.f28565a = null;
        eVar.f28566b = null;
        eVar.f28567c = null;
        eVar.f28570f = 2;
    }

    public final void j(s sVar, boolean z8, boolean z9) {
        if (!z8 && this.f28536a) {
            this.f28537b = sVar;
            return;
        }
        if (z8) {
            this.f28536a = true;
        }
        if (z9) {
            this.f28538c.i(sVar.l());
        } else {
            this.f28538c.h(sVar);
            l(sVar);
        }
        J(sVar.h());
        K(sVar.i());
        this.f28542g -= sVar.j();
        this.f28540e.setValue(sVar);
        if (z8) {
            P(sVar.m());
        }
        this.f28545j++;
    }

    public final void l(q qVar) {
        if (this.f28547l == -1 || qVar.b().isEmpty()) {
            return;
        }
        if (this.f28547l != (this.f28549n ? ((l) z.t0(qVar.b())).getIndex() + 1 : ((l) z.i0(qVar.b())).getIndex() - 1)) {
            this.f28547l = -1;
            B.a aVar = this.f28548m;
            if (aVar != null) {
                aVar.cancel();
            }
            this.f28548m = null;
        }
    }

    public final C2663a m() {
        return this.f28552q;
    }

    public final C2671i n() {
        return this.f28554s;
    }

    public final J o() {
        return this.f28561z;
    }

    public final int p() {
        return this.f28538c.a();
    }

    public final int q() {
        return this.f28538c.c();
    }

    public final boolean r() {
        return this.f28536a;
    }

    public final m s() {
        return this.f28541f;
    }

    public final j t() {
        return this.f28553r;
    }

    public final q u() {
        return (q) this.f28540e.getValue();
    }

    public final W6.i v() {
        return (W6.i) this.f28538c.b().getValue();
    }

    public final A w() {
        return this.f28556u;
    }

    public final InterfaceC3164l0 x() {
        return this.f28559x;
    }

    public final s y() {
        return this.f28537b;
    }

    public final B z() {
        return this.f28560y;
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends I6.l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f28571a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f28573c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f28574d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i8, int i9, G6.d dVar) {
            super(2, dVar);
            this.f28573c = i8;
            this.f28574d = i9;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return y.this.new f(this.f28573c, this.f28574d, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(I i8, G6.d dVar) {
            return ((f) create(i8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            H6.c.f();
            if (this.f28571a == 0) {
                C6.r.b(obj);
                y.this.O(this.f28573c, this.f28574d);
                return G.f1419a;
            }
            throw new IllegalStateException(ryTuoS.XaSFOwPZdfN);
        }
    }

    public y(int i8, int i9) {
        w wVar = new w(i8, i9);
        this.f28538c = wVar;
        this.f28539d = new p091k0.d(this);
        this.f28540e = g1.i(z.f28581b, g1.k());
        this.f28541f = p073i0.l.a();
        this.f28543h = A1.f.a(1.0f, 1.0f);
        this.f28544i = N.a(new g());
        this.f28546k = true;
        this.f28547l = -1;
        this.f28551p = new d();
        this.f28552q = new C2663a();
        this.f28553r = new j();
        this.f28554s = new C2671i();
        this.f28555t = A1.c.b(0, 0, 0, 0, 15, null);
        this.f28556u = new A();
        wVar.b();
        Boolean bool = Boolean.FALSE;
        this.f28557v = l1.e(bool, null, 2, null);
        this.f28558w = l1.e(bool, null, 2, null);
        this.f28559x = L.c(null, 1, null);
        this.f28560y = new B();
        j0 j0VarI = l0.i(C2635m.f28814a);
        Float fValueOf = Float.valueOf(0.0f);
        this.f28535A = AbstractC2216l.d(j0VarI, fValueOf, fValueOf, 0L, 0L, false, 56, null);
    }

    public /* synthetic */ y(int i8, int i9, int i10, AbstractC2633k abstractC2633k) {
        this((i10 & 1) != 0 ? 0 : i8, (i10 & 2) != 0 ? 0 : i9);
    }
}
