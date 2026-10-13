package p183v0;

import C6.G;
import C6.r;
import I6.d;
import I6.l;
import Q0.f;
import Q6.o;
import R0.AbstractC1596k0;
import R0.C1598l0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p017b7.AbstractC1789i;
import p017b7.AbstractC1816w;
import p017b7.InterfaceC1812u;
import p017b7.J;
import p017b7.K;
import p037e0.AbstractC2206b;
import p037e0.AbstractC2214j;
import p037e0.C2205a;
import p037e0.D;
import p037e0.i0;
import p215z0.InterfaceC3164l0;
import p215z0.l1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f34980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f34981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f34982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Float f34983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Float f34984e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f f34985f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C2205a f34986g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C2205a f34987h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C2205a f34988i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final InterfaceC1812u f34989j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final InterfaceC3164l0 f34990k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InterfaceC3164l0 f34991l;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f34992a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f34993b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f34995d;

        public a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f34993b = obj;
            this.f34995d |= Integer.MIN_VALUE;
            return g.this.d(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f34996a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f34997b;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends l implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f34999a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f35000b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(g gVar, G6.d dVar) {
                super(2, dVar);
                this.f35000b = gVar;
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                return new a(this.f35000b, dVar);
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(J j8, G6.d dVar) {
                return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                Object objF = H6.c.f();
                int i8 = this.f34999a;
                if (i8 == 0) {
                    r.b(obj);
                    C2205a c2205a = this.f35000b.f34986g;
                    Float fC = I6.b.c(1.0f);
                    i0 i0VarI = AbstractC2214j.i(75, 0, D.e(), 2, null);
                    this.f34999a = 1;
                    if (C2205a.f(c2205a, fC, i0VarI, null, null, this, 12, null) == objF) {
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

        /* JADX INFO: renamed from: v0.g$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0792b extends l implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f35001a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f35002b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0792b(g gVar, G6.d dVar) {
                super(2, dVar);
                this.f35002b = gVar;
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                return new C0792b(this.f35002b, dVar);
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(J j8, G6.d dVar) {
                return ((C0792b) create(j8, dVar)).invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                Object objF = H6.c.f();
                int i8 = this.f35001a;
                if (i8 == 0) {
                    r.b(obj);
                    C2205a c2205a = this.f35002b.f34987h;
                    Float fC = I6.b.c(1.0f);
                    i0 i0VarI = AbstractC2214j.i(225, 0, D.d(), 2, null);
                    this.f35001a = 1;
                    if (C2205a.f(c2205a, fC, i0VarI, null, null, this, 12, null) == objF) {
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

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class c extends l implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f35003a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f35004b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(g gVar, G6.d dVar) {
                super(2, dVar);
                this.f35004b = gVar;
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                return new c(this.f35004b, dVar);
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(J j8, G6.d dVar) {
                return ((c) create(j8, dVar)).invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                Object objF = H6.c.f();
                int i8 = this.f35003a;
                if (i8 == 0) {
                    r.b(obj);
                    C2205a c2205a = this.f35004b.f34988i;
                    Float fC = I6.b.c(1.0f);
                    i0 i0VarI = AbstractC2214j.i(225, 0, D.e(), 2, null);
                    this.f35003a = 1;
                    if (C2205a.f(c2205a, fC, i0VarI, null, null, this, 12, null) == objF) {
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

        public b(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            b bVar = g.this.new b(dVar);
            bVar.f34997b = obj;
            return bVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((b) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            H6.c.f();
            if (this.f34996a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            J j8 = (J) this.f34997b;
            AbstractC1789i.d(j8, null, null, new a(g.this, null), 3, null);
            AbstractC1789i.d(j8, null, null, new C0792b(g.this, null), 3, null);
            return AbstractC1789i.d(j8, null, null, new c(g.this, null), 3, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f35005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f35006b;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends l implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f35008a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f35009b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(g gVar, G6.d dVar) {
                super(2, dVar);
                this.f35009b = gVar;
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                return new a(this.f35009b, dVar);
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(J j8, G6.d dVar) {
                return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                Object objF = H6.c.f();
                int i8 = this.f35008a;
                if (i8 == 0) {
                    r.b(obj);
                    C2205a c2205a = this.f35009b.f34986g;
                    Float fC = I6.b.c(0.0f);
                    i0 i0VarI = AbstractC2214j.i(150, 0, D.e(), 2, null);
                    this.f35008a = 1;
                    if (C2205a.f(c2205a, fC, i0VarI, null, null, this, 12, null) == objF) {
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

        public c(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            c cVar = g.this.new c(dVar);
            cVar.f35006b = obj;
            return cVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((c) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            H6.c.f();
            if (this.f35005a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            return AbstractC1789i.d((J) this.f35006b, null, null, new a(g.this, null), 3, null);
        }
    }

    public /* synthetic */ g(f fVar, float f8, boolean z8, AbstractC2633k abstractC2633k) {
        this(fVar, f8, z8);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
    
        if (r2.g(r0) == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(G6.d dVar) {
        a aVar;
        g gVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i8 = aVar.f34995d;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                aVar.f34995d = i8 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f34993b;
        Object objF = H6.c.f();
        int i9 = aVar.f34995d;
        if (i9 == 0) {
            r.b(obj);
            aVar.f34992a = this;
            aVar.f34995d = 1;
            if (f(aVar) != objF) {
                gVar = this;
            }
            return objF;
        }
        if (i9 == 1) {
            gVar = (g) aVar.f34992a;
            r.b(obj);
        } else if (i9 == 2) {
            gVar = (g) aVar.f34992a;
            r.b(obj);
            aVar.f34992a = null;
            aVar.f34995d = 3;
        } else {
            if (i9 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
        }
        return G.f1419a;
        gVar.l(true);
        InterfaceC1812u interfaceC1812u = gVar.f34989j;
        aVar.f34992a = gVar;
        aVar.f34995d = 2;
        if (interfaceC1812u.Q0(aVar) != objF) {
            aVar.f34992a = null;
            aVar.f34995d = 3;
        }
        return objF;
    }

    public final void e(T0.f fVar, long j8) {
        if (this.f34983d == null) {
            this.f34983d = Float.valueOf(h.b(fVar.d()));
        }
        if (this.f34984e == null) {
            this.f34984e = Float.isNaN(this.f34981b) ? Float.valueOf(h.a(fVar, this.f34982c, fVar.d())) : Float.valueOf(fVar.E0(this.f34981b));
        }
        if (this.f34980a == null) {
            this.f34980a = f.d(fVar.c1());
        }
        if (this.f34985f == null) {
            this.f34985f = f.d(Q0.g.a(Q0.l.i(fVar.d()) / 2.0f, Q0.l.g(fVar.d()) / 2.0f));
        }
        float fFloatValue = (!i() || j()) ? ((Number) this.f34986g.m()).floatValue() : 1.0f;
        Float f8 = this.f34983d;
        t.d(f8);
        float fFloatValue2 = f8.floatValue();
        Float f9 = this.f34984e;
        t.d(f9);
        float fA = C1.b.a(fFloatValue2, f9.floatValue(), ((Number) this.f34987h.m()).floatValue());
        f fVar2 = this.f34980a;
        t.d(fVar2);
        float fO = f.o(fVar2.x());
        f fVar3 = this.f34985f;
        t.d(fVar3);
        float fA2 = C1.b.a(fO, f.o(fVar3.x()), ((Number) this.f34988i.m()).floatValue());
        f fVar4 = this.f34980a;
        t.d(fVar4);
        float fP = f.p(fVar4.x());
        f fVar5 = this.f34985f;
        t.d(fVar5);
        long jA = Q0.g.a(fA2, C1.b.a(fP, f.p(fVar5.x()), ((Number) this.f34988i.m()).floatValue()));
        long jO = C1598l0.o(j8, C1598l0.r(j8) * fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
        if (!this.f34982c) {
            T0.f.m0(fVar, jO, fA, jA, 0.0f, null, null, 0, 120, null);
            return;
        }
        float fI = Q0.l.i(fVar.d());
        float fG = Q0.l.g(fVar.d());
        int iB = AbstractC1596k0.f9402a.b();
        T0.d dVarK0 = fVar.K0();
        long jD = dVarK0.d();
        dVarK0.c().k();
        dVarK0.a().c(0.0f, 0.0f, fI, fG, iB);
        T0.f.m0(fVar, jO, fA, jA, 0.0f, null, null, 0, 120, null);
        dVarK0.c().x();
        dVarK0.b(jD);
    }

    public final Object f(G6.d dVar) {
        Object objF = K.f(new b(null), dVar);
        return objF == H6.c.f() ? objF : G.f1419a;
    }

    public final Object g(G6.d dVar) {
        Object objF = K.f(new c(null), dVar);
        return objF == H6.c.f() ? objF : G.f1419a;
    }

    public final void h() {
        k(true);
        this.f34989j.r1(G.f1419a);
    }

    public final boolean i() {
        return ((Boolean) this.f34991l.getValue()).booleanValue();
    }

    public final boolean j() {
        return ((Boolean) this.f34990k.getValue()).booleanValue();
    }

    public final void k(boolean z8) {
        this.f34991l.setValue(Boolean.valueOf(z8));
    }

    public final void l(boolean z8) {
        this.f34990k.setValue(Boolean.valueOf(z8));
    }

    public g(f fVar, float f8, boolean z8) {
        this.f34980a = fVar;
        this.f34981b = f8;
        this.f34982c = z8;
        this.f34986g = AbstractC2206b.b(0.0f, 0.0f, 2, null);
        this.f34987h = AbstractC2206b.b(0.0f, 0.0f, 2, null);
        this.f34988i = AbstractC2206b.b(0.0f, 0.0f, 2, null);
        this.f34989j = AbstractC1816w.a(null);
        Boolean bool = Boolean.FALSE;
        this.f34990k = l1.e(bool, null, 2, null);
        this.f34991l = l1.e(bool, null, 2, null);
    }
}
