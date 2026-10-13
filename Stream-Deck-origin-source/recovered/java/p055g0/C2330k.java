package p055g0;

import A1.r;
import A1.s;
import C6.G;
import C6.m;
import C6.q;
import G6.d;
import I6.l;
import L0.i;
import Q0.f;
import Q0.h;
import Q6.k;
import Q6.o;
import Z6.C1694a;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.AbstractC1789i;
import p017b7.AbstractC1823z0;
import p017b7.B0;
import p017b7.C1797m;
import p017b7.I;
import p017b7.InterfaceC1795l;
import p017b7.InterfaceC1815v0;
import p017b7.J;
import p017b7.L;
import p038e1.InterfaceC2247s;
import p056g1.InterfaceC2361z;
import p118n0.g;
import p211y4.vJ.RaiWHuj;

/* JADX INFO: renamed from: g0.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2330k extends i.c implements g, InterfaceC2361z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public B f23147n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public M f23148o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f23149p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public InterfaceC2329j f23150q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public InterfaceC2247s f23152s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public InterfaceC2247s f23153t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public h f23154u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f23155v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f23157x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Q f23158y;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C2328i f23151r = new C2328i();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f23156w = r.f455b.a();

    /* JADX INFO: renamed from: g0.k$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function0 f23159a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC1795l f23160b;

        public a(Function0 function0, InterfaceC1795l interfaceC1795l) {
            this.f23159a = function0;
            this.f23160b = interfaceC1795l;
        }

        public final InterfaceC1795l a() {
            return this.f23160b;
        }

        public final Function0 b() {
            return this.f23159a;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0050  */
        public String toString() {
            String str;
            I i8 = (I) this.f23160b.getContext().A(I.f15900c);
            String strL0 = i8 != null ? i8.L0() : null;
            StringBuilder sb = new StringBuilder();
            sb.append("Request@");
            String string = Integer.toString(hashCode(), C1694a.a(16));
            t.f(string, "toString(this, checkRadix(radix))");
            sb.append(string);
            if (strL0 != null) {
                str = '[' + strL0 + "](";
                if (str == null) {
                    str = RaiWHuj.irYccWcH;
                }
            } else {
                str = RaiWHuj.irYccWcH;
            }
            sb.append(str);
            sb.append("currentBounds()=");
            sb.append(this.f23159a.invoke());
            sb.append(", continuation=");
            sb.append(this.f23160b);
            sb.append(')');
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: g0.k$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23161a;

        static {
            int[] iArr = new int[B.values().length];
            try {
                iArr[B.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[B.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f23161a = iArr;
        }
    }

    /* JADX INFO: renamed from: g0.k$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f23162a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f23163b;

        /* JADX INFO: renamed from: g0.k$c$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends l implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f23165a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f23166b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ C2330k f23167c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ InterfaceC1815v0 f23168d;

            /* JADX INFO: renamed from: g0.k$c$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0537a extends u implements k {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ C2330k f23169a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ I f23170b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1815v0 f23171c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0537a(C2330k c2330k, I i8, InterfaceC1815v0 interfaceC1815v0) {
                    super(1);
                    this.f23169a = c2330k;
                    this.f23170b = i8;
                    this.f23171c = interfaceC1815v0;
                }

                public final void b(float f8) {
                    float f9 = this.f23169a.f23149p ? 1.0f : -1.0f;
                    float fA = f9 * this.f23170b.a(f9 * f8);
                    if (Math.abs(fA) < Math.abs(f8)) {
                        B0.f(this.f23171c, "Scroll animation cancelled because scroll was not consumed (" + fA + " < " + f8 + ')', null, 2, null);
                    }
                }

                @Override // Q6.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b(((Number) obj).floatValue());
                    return G.f1419a;
                }
            }

            /* JADX INFO: renamed from: g0.k$c$a$b */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class b extends u implements Function0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ C2330k f23172a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(C2330k c2330k) {
                    super(0);
                    this.f23172a = c2330k;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m198invoke();
                    return G.f1419a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m198invoke() {
                    C2328i c2328i = this.f23172a.f23151r;
                    C2330k c2330k = this.f23172a;
                    while (true) {
                        if (!c2328i.f23139a.v()) {
                            break;
                        }
                        h hVar = (h) ((a) c2328i.f23139a.x()).b().invoke();
                        if (!(hVar == null ? true : C2330k.w2(c2330k, hVar, 0L, 1, null))) {
                            break;
                        } else {
                            ((a) c2328i.f23139a.D(c2328i.f23139a.s() - 1)).a().resumeWith(q.b(G.f1419a));
                        }
                    }
                    if (this.f23172a.f23155v) {
                        h hVarT2 = this.f23172a.t2();
                        if (hVarT2 != null && C2330k.w2(this.f23172a, hVarT2, 0L, 1, null)) {
                            this.f23172a.f23155v = false;
                        }
                    }
                    this.f23172a.f23158y.j(this.f23172a.o2());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C2330k c2330k, InterfaceC1815v0 interfaceC1815v0, d dVar) {
                super(2, dVar);
                this.f23167c = c2330k;
                this.f23168d = interfaceC1815v0;
            }

            @Override // I6.a
            public final d create(Object obj, d dVar) {
                a aVar = new a(this.f23167c, this.f23168d, dVar);
                aVar.f23166b = obj;
                return aVar;
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(I i8, d dVar) {
                return ((a) create(i8, dVar)).invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                Object objF = H6.c.f();
                int i8 = this.f23165a;
                if (i8 == 0) {
                    C6.r.b(obj);
                    I i9 = (I) this.f23166b;
                    this.f23167c.f23158y.j(this.f23167c.o2());
                    Q q8 = this.f23167c.f23158y;
                    C0537a c0537a = new C0537a(this.f23167c, i9, this.f23168d);
                    b bVar = new b(this.f23167c);
                    this.f23165a = 1;
                    if (q8.h(c0537a, bVar, this) == objF) {
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

        public c(d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final d create(Object obj, d dVar) {
            c cVar = C2330k.this.new c(dVar);
            cVar.f23163b = obj;
            return cVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, d dVar) {
            return ((c) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Throwable th;
            c cVar;
            CancellationException cancellationException;
            Object objF = H6.c.f();
            int i8 = this.f23162a;
            try {
                if (i8 == 0) {
                    C6.r.b(obj);
                    InterfaceC1815v0 interfaceC1815v0N = AbstractC1823z0.n(((J) this.f23163b).getCoroutineContext());
                    try {
                        C2330k.this.f23157x = true;
                        M m8 = C2330k.this.f23148o;
                        a aVar = new a(C2330k.this, interfaceC1815v0N, null);
                        this.f23162a = 1;
                        cVar = this;
                        try {
                            if (M.c(m8, null, aVar, cVar, 1, null) == objF) {
                                return objF;
                            }
                        } catch (CancellationException e8) {
                            e = e8;
                            cancellationException = e;
                            throw cancellationException;
                        }
                    } catch (CancellationException e9) {
                        e = e9;
                        cancellationException = e;
                        throw cancellationException;
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        C2330k.this.f23157x = false;
                        C2330k.this.f23151r.b(null);
                        C2330k.this.f23155v = false;
                        throw th;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        C6.r.b(obj);
                        cVar = this;
                    } catch (CancellationException e10) {
                        cancellationException = e10;
                        throw cancellationException;
                    } catch (Throwable th3) {
                        th = th3;
                        C2330k.this.f23157x = false;
                        C2330k.this.f23151r.b(null);
                        C2330k.this.f23155v = false;
                        throw th;
                    }
                }
                C2330k.this.f23151r.d();
                C2330k.this.f23157x = false;
                C2330k.this.f23151r.b(null);
                C2330k.this.f23155v = false;
                return G.f1419a;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public C2330k(B b8, M m8, boolean z8, InterfaceC2329j interfaceC2329j) {
        this.f23147n = b8;
        this.f23148o = m8;
        this.f23149p = z8;
        this.f23150q = interfaceC2329j;
        this.f23158y = new Q(this.f23150q.b());
    }

    public static /* synthetic */ boolean w2(C2330k c2330k, h hVar, long j8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            j8 = c2330k.f23156w;
        }
        return c2330k.v2(hVar, j8);
    }

    public final void A2(B b8, M m8, boolean z8, InterfaceC2329j interfaceC2329j) {
        this.f23147n = b8;
        this.f23148o = m8;
        this.f23149p = z8;
        this.f23150q = interfaceC2329j;
    }

    @Override // p118n0.g
    public h D0(h hVar) {
        if (r.e(this.f23156w, r.f455b.a())) {
            throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.");
        }
        return r2(hVar, this.f23156w);
    }

    @Override // p056g1.InterfaceC2361z
    public void R(InterfaceC2247s interfaceC2247s) {
        this.f23152s = interfaceC2247s;
    }

    @Override // p056g1.InterfaceC2361z
    public void e(long j8) {
        h hVarT2;
        long j9 = this.f23156w;
        this.f23156w = j8;
        if (p2(j8, j9) < 0 && (hVarT2 = t2()) != null) {
            h hVar = this.f23154u;
            if (hVar == null) {
                hVar = hVarT2;
            }
            if (!this.f23157x && !this.f23155v && v2(hVar, j9) && !v2(hVarT2, j8)) {
                this.f23155v = true;
                x2();
            }
            this.f23154u = hVarT2;
        }
    }

    @Override // p118n0.g
    public Object n1(Function0 function0, d dVar) {
        h hVar = (h) function0.invoke();
        if (hVar == null || w2(this, hVar, 0L, 1, null)) {
            return G.f1419a;
        }
        C1797m c1797m = new C1797m(H6.b.c(dVar), 1);
        c1797m.z();
        if (this.f23151r.c(new a(function0, c1797m)) && !this.f23157x) {
            x2();
        }
        Object objS = c1797m.s();
        if (objS == H6.c.f()) {
            I6.h.c(dVar);
        }
        return objS == H6.c.f() ? objS : G.f1419a;
    }

    public final float o2() {
        if (r.e(this.f23156w, r.f455b.a())) {
            return 0.0f;
        }
        h hVarS2 = s2();
        if (hVarS2 == null) {
            hVarS2 = this.f23155v ? t2() : null;
            if (hVarS2 == null) {
                return 0.0f;
            }
        }
        long jC = s.c(this.f23156w);
        int i8 = b.f23161a[this.f23147n.ordinal()];
        if (i8 == 1) {
            return this.f23150q.a(hVarS2.l(), hVarS2.e() - hVarS2.l(), Q0.l.g(jC));
        }
        if (i8 == 2) {
            return this.f23150q.a(hVarS2.i(), hVarS2.j() - hVarS2.i(), Q0.l.i(jC));
        }
        throw new m();
    }

    public final int p2(long j8, long j9) {
        int i8 = b.f23161a[this.f23147n.ordinal()];
        if (i8 == 1) {
            return t.h(r.f(j8), r.f(j9));
        }
        if (i8 == 2) {
            return t.h(r.g(j8), r.g(j9));
        }
        throw new m();
    }

    public final int q2(long j8, long j9) {
        int i8 = b.f23161a[this.f23147n.ordinal()];
        if (i8 == 1) {
            return Float.compare(Q0.l.g(j8), Q0.l.g(j9));
        }
        if (i8 == 2) {
            return Float.compare(Q0.l.i(j8), Q0.l.i(j9));
        }
        throw new m();
    }

    public final h r2(h hVar, long j8) {
        return hVar.t(f.w(z2(hVar, j8)));
    }

    public final h s2() {
        B0.d dVar = this.f23151r.f23139a;
        int iS = dVar.s();
        h hVar = null;
        if (iS > 0) {
            int i8 = iS - 1;
            Object[] objArrR = dVar.r();
            do {
                h hVar2 = (h) ((a) objArrR[i8]).b().invoke();
                if (hVar2 != null) {
                    if (q2(hVar2.k(), s.c(this.f23156w)) > 0) {
                        return hVar == null ? hVar2 : hVar;
                    }
                    hVar = hVar2;
                }
                i8--;
            } while (i8 >= 0);
        }
        return hVar;
    }

    public final h t2() {
        InterfaceC2247s interfaceC2247s;
        InterfaceC2247s interfaceC2247s2 = this.f23152s;
        if (interfaceC2247s2 != null) {
            if (!interfaceC2247s2.y()) {
                interfaceC2247s2 = null;
            }
            if (interfaceC2247s2 != null && (interfaceC2247s = this.f23153t) != null) {
                if (!interfaceC2247s.y()) {
                    interfaceC2247s = null;
                }
                if (interfaceC2247s != null) {
                    return interfaceC2247s2.O(interfaceC2247s, false);
                }
            }
        }
        return null;
    }

    public final long u2() {
        return this.f23156w;
    }

    public final boolean v2(h hVar, long j8) {
        long jZ2 = z2(hVar, j8);
        return Math.abs(f.o(jZ2)) <= 0.5f && Math.abs(f.p(jZ2)) <= 0.5f;
    }

    public final void x2() {
        if (this.f23157x) {
            throw new IllegalStateException("launchAnimation called when previous animation was running");
        }
        AbstractC1789i.d(D1(), null, L.UNDISPATCHED, new c(null), 1, null);
    }

    public final void y2(InterfaceC2247s interfaceC2247s) {
        this.f23153t = interfaceC2247s;
    }

    public final long z2(h hVar, long j8) {
        long jC = s.c(j8);
        int i8 = b.f23161a[this.f23147n.ordinal()];
        if (i8 == 1) {
            return Q0.g.a(0.0f, this.f23150q.a(hVar.l(), hVar.e() - hVar.l(), Q0.l.g(jC)));
        }
        if (i8 == 2) {
            return Q0.g.a(this.f23150q.a(hVar.i(), hVar.j() - hVar.i(), Q0.l.i(jC)), 0.0f);
        }
        throw new m();
    }
}
