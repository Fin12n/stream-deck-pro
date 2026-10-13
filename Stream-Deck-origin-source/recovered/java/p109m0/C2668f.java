package p109m0;

import A1.n;
import A1.o;
import C6.G;
import C6.r;
import I6.l;
import Q6.k;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.C2635m;
import kotlin.jvm.internal.u;
import p017b7.AbstractC1789i;
import p017b7.J;
import p037e0.C2205a;
import p037e0.E;
import p037e0.a0;
import p037e0.l0;
import p215z0.AbstractC3185w0;
import p215z0.InterfaceC3158i0;
import p215z0.InterfaceC3164l0;
import p215z0.l1;

/* JADX INFO: renamed from: m0.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2668f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f29376m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f29377n = 8;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f29378o = o.a(Integer.MAX_VALUE, Integer.MAX_VALUE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J f29379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public E f29380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public E f29381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC3164l0 f29382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC3164l0 f29383e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f29384f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C2205a f29385g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C2205a f29386h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final InterfaceC3164l0 f29387i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final InterfaceC3158i0 f29388j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final k f29389k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f29390l;

    /* JADX INFO: renamed from: m0.f$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final long a() {
            return C2668f.f29378o;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: m0.f$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f29391a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ E f29393c;

        /* JADX INFO: renamed from: m0.f$b$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C2668f f29394a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C2668f c2668f) {
                super(1);
                this.f29394a = c2668f;
            }

            public final void b(C2205a c2205a) {
                this.f29394a.y(((Number) c2205a.m()).floatValue());
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((C2205a) obj);
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(E e8, G6.d dVar) {
            super(2, dVar);
            this.f29393c = e8;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return C2668f.this.new b(this.f29393c, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((b) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
        
            if (p037e0.C2205a.f(r4, r5, r6, null, r8, r9, 4, null) == r0) goto L22;
         */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Throwable th;
            b bVar;
            Object objF = H6.c.f();
            int i8 = this.f29391a;
            try {
                if (i8 == 0) {
                    r.b(obj);
                    try {
                        C2205a c2205a = C2668f.this.f29386h;
                        Float fC = I6.b.c(0.0f);
                        this.f29391a = 1;
                        if (c2205a.t(fC, this) == objF) {
                        }
                        return objF;
                    } catch (Throwable th2) {
                        th = th2;
                        bVar = this;
                        th = th;
                        C2668f.this.r(false);
                        throw th;
                    }
                }
                try {
                    if (i8 == 1) {
                        r.b(obj);
                    } else {
                        if (i8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r.b(obj);
                        bVar = this;
                    }
                    C2668f.this.r(false);
                    return G.f1419a;
                } catch (Throwable th3) {
                    th = th3;
                    bVar = this;
                    C2668f.this.r(false);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
                C2668f.this.r(false);
                throw th;
            }
            C2205a c2205a2 = C2668f.this.f29386h;
            Float fC2 = I6.b.c(1.0f);
            E e8 = this.f29393c;
            a aVar = new a(C2668f.this);
            this.f29391a = 2;
            bVar = this;
        }
    }

    /* JADX INFO: renamed from: m0.f$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f29395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f29396b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ E f29398d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ long f29399e;

        /* JADX INFO: renamed from: m0.f$c$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C2668f f29400a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f29401b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C2668f c2668f, long j8) {
                super(1);
                this.f29400a = c2668f;
                this.f29401b = j8;
            }

            public final void b(C2205a c2205a) {
                C2668f c2668f = this.f29400a;
                long jN = ((n) c2205a.m()).n();
                long j8 = this.f29401b;
                c2668f.v(o.a(n.j(jN) - n.j(j8), n.k(jN) - n.k(j8)));
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((C2205a) obj);
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(E e8, long j8, G6.d dVar) {
            super(2, dVar);
            this.f29398d = e8;
            this.f29399e = j8;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return C2668f.this.new c(this.f29398d, this.f29399e, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((c) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x00b6, code lost:
        
            if (p037e0.C2205a.f(r12, r4, r5, null, r7, r8, 4, null) == r0) goto L32;
         */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            E e8;
            E e9;
            c cVar;
            Object objF = H6.c.f();
            int i8 = this.f29396b;
            try {
                try {
                    if (i8 != 0) {
                        if (i8 == 1) {
                            e9 = (E) this.f29395a;
                            r.b(obj);
                        } else {
                            if (i8 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            r.b(obj);
                            cVar = this;
                        }
                        C2668f.this.u(false);
                        return G.f1419a;
                    }
                    r.b(obj);
                    if (C2668f.this.f29385g.p()) {
                        E e10 = this.f29398d;
                        e8 = e10 instanceof a0 ? (a0) e10 : AbstractC2669g.f29409a;
                    } else {
                        e8 = this.f29398d;
                    }
                    e9 = e8;
                    if (!C2668f.this.f29385g.p()) {
                        C2205a c2205a = C2668f.this.f29385g;
                        n nVarB = n.b(this.f29399e);
                        this.f29395a = e9;
                        this.f29396b = 1;
                        if (c2205a.t(nVarB, this) == objF) {
                        }
                        return objF;
                    }
                    return G.f1419a;
                } catch (CancellationException unused) {
                }
                E e11 = e9;
                long jN = ((n) C2668f.this.f29385g.m()).n();
                long j8 = this.f29399e;
                long jA = o.a(n.j(jN) - n.j(j8), n.k(jN) - n.k(j8));
                C2205a c2205a2 = C2668f.this.f29385g;
                n nVarB2 = n.b(jA);
                a aVar = new a(C2668f.this, jA);
                this.f29395a = null;
                this.f29396b = 2;
                cVar = this;
            } catch (CancellationException unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: m0.f$d */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f29402a;

        public d(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return C2668f.this.new d(dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((d) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f29402a;
            if (i8 == 0) {
                r.b(obj);
                C2205a c2205a = C2668f.this.f29385g;
                n nVarB = n.b(n.f446b.a());
                this.f29402a = 1;
                if (c2205a.t(nVarB, this) == objF) {
                    return objF;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            C2668f.this.v(n.f446b.a());
            C2668f.this.u(false);
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: m0.f$e */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements k {
        public e() {
            super(1);
        }

        public final void b(androidx.compose.ui.graphics.c cVar) {
            cVar.b(C2668f.this.o());
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((androidx.compose.ui.graphics.c) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: m0.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0640f extends l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f29405a;

        public C0640f(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return C2668f.this.new C0640f(dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((C0640f) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f29405a;
            if (i8 == 0) {
                r.b(obj);
                C2205a c2205a = C2668f.this.f29385g;
                this.f29405a = 1;
                if (c2205a.u(this) == objF) {
                    return objF;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: m0.f$g */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f29407a;

        public g(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return C2668f.this.new g(dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((g) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f29407a;
            if (i8 == 0) {
                r.b(obj);
                C2205a c2205a = C2668f.this.f29386h;
                this.f29407a = 1;
                if (c2205a.u(this) == objF) {
                    return objF;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            return G.f1419a;
        }
    }

    public C2668f(J j8) {
        this.f29379a = j8;
        Boolean bool = Boolean.FALSE;
        this.f29382d = l1.e(bool, null, 2, null);
        this.f29383e = l1.e(bool, null, 2, null);
        long j9 = f29378o;
        this.f29384f = j9;
        n.a aVar = n.f446b;
        String str = null;
        this.f29385g = new C2205a(n.b(aVar.a()), l0.d(aVar), null, str, 12, null);
        this.f29386h = new C2205a(Float.valueOf(1.0f), l0.i(C2635m.f28814a), str, null, 12, null);
        this.f29387i = l1.e(n.b(aVar.a()), null, 2, null);
        this.f29388j = AbstractC3185w0.a(1.0f);
        this.f29389k = new e();
        this.f29390l = j9;
    }

    public final void h() {
        E e8 = this.f29380b;
        if (p() || e8 == null) {
            return;
        }
        r(true);
        y(0.0f);
        AbstractC1789i.d(this.f29379a, null, null, new b(e8, null), 3, null);
    }

    public final void i(long j8) {
        E e8 = this.f29381c;
        if (e8 == null) {
            return;
        }
        long jM = m();
        long jA = o.a(n.j(jM) - n.j(j8), n.k(jM) - n.k(j8));
        v(jA);
        u(true);
        AbstractC1789i.d(this.f29379a, null, null, new c(e8, jA, null), 3, null);
    }

    public final void j() {
        if (q()) {
            AbstractC1789i.d(this.f29379a, null, null, new d(null), 3, null);
        }
    }

    public final k k() {
        return this.f29389k;
    }

    public final long l() {
        return this.f29390l;
    }

    public final long m() {
        return ((n) this.f29387i.getValue()).n();
    }

    public final long n() {
        return this.f29384f;
    }

    public final float o() {
        return this.f29388j.b();
    }

    public final boolean p() {
        return ((Boolean) this.f29383e.getValue()).booleanValue();
    }

    public final boolean q() {
        return ((Boolean) this.f29382d.getValue()).booleanValue();
    }

    public final void r(boolean z8) {
        this.f29383e.setValue(Boolean.valueOf(z8));
    }

    public final void s(E e8) {
        this.f29380b = e8;
    }

    public final void t(long j8) {
        this.f29390l = j8;
    }

    public final void u(boolean z8) {
        this.f29382d.setValue(Boolean.valueOf(z8));
    }

    public final void v(long j8) {
        this.f29387i.setValue(n.b(j8));
    }

    public final void w(E e8) {
        this.f29381c = e8;
    }

    public final void x(long j8) {
        this.f29384f = j8;
    }

    public final void y(float f8) {
        this.f29388j.k(f8);
    }

    public final void z() {
        if (q()) {
            u(false);
            AbstractC1789i.d(this.f29379a, null, null, new C0640f(null), 3, null);
        }
        if (p()) {
            r(false);
            AbstractC1789i.d(this.f29379a, null, null, new g(null), 3, null);
        }
        v(n.f446b.a());
        this.f29384f = f29378o;
        y(1.0f);
    }
}
