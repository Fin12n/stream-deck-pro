package p055g0;

import A1.y;
import C6.G;
import C6.r;
import I6.l;
import Q0.f;
import Q0.g;
import Q6.k;
import Q6.o;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.u;
import p046f0.S;
import p215z0.InterfaceC3164l0;
import p215z0.l1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public M f22845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public B f22846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public S f22847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f22848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w f22849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p002a1.b f22850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC3164l0 f22851g = l1.e(Boolean.FALSE, null, 2, null);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f22853b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ I f22854c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i8, I i9) {
            super(1);
            this.f22853b = i8;
            this.f22854c = i9;
        }

        public final long b(long j8) {
            long jD = O.this.f22850f.d(j8, this.f22853b);
            long jS = f.s(j8, jD);
            O o8 = O.this;
            float fP = o8.p(o8.k(o8.m(jS)));
            O o9 = O.this;
            long jK = o9.k(o9.q(this.f22854c.a(fP)));
            return f.t(f.t(jD, jK), O.this.f22850f.b(jK, f.s(jS, jK), this.f22853b));
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return f.d(b(((f) obj).x()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f22855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f22856b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f22858d;

        public b(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f22856b = obj;
            this.f22858d |= Integer.MIN_VALUE;
            return O.this.d(0L, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f22859a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f22860b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f22861c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f22862d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f22863e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ I f22865g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ long f22866h;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ O f22867a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f22868b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(O o8, I i8) {
                super(1);
                this.f22867a = o8;
                this.f22868b = i8;
            }

            public final long b(long j8) {
                O o8 = this.f22867a;
                return o8.k(o8.c(this.f22868b, o8.k(j8), p002a1.e.f13022a.b()));
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return f.d(b(((f) obj).x()));
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b implements I {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ O f22869a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f22870b;

            public b(O o8, k kVar) {
                this.f22869a = o8;
                this.f22870b = kVar;
            }

            @Override // p055g0.I
            public float a(float f8) {
                O o8 = this.f22869a;
                return o8.p(((f) this.f22870b.invoke(f.d(o8.q(f8)))).x());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(I i8, long j8, G6.d dVar) {
            super(2, dVar);
            this.f22865g = i8;
            this.f22866h = j8;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            c cVar = O.this.new c(this.f22865g, this.f22866h, dVar);
            cVar.f22863e = obj;
            return cVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(I i8, G6.d dVar) {
            return ((c) create(i8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            O o8;
            I i8;
            O o9;
            long j8;
            Object objF = H6.c.f();
            int i9 = this.f22862d;
            if (i9 == 0) {
                r.b(obj);
                b bVar = new b(O.this, new a(O.this, (I) this.f22863e));
                o8 = O.this;
                I i10 = this.f22865g;
                long j9 = this.f22866h;
                w wVar = o8.f22849e;
                long j10 = i10.f28778a;
                float fJ = o8.j(o8.o(j9));
                this.f22863e = o8;
                this.f22859a = o8;
                this.f22860b = i10;
                this.f22861c = j10;
                this.f22862d = 1;
                obj = wVar.a(bVar, fJ, this);
                if (obj == objF) {
                    return objF;
                }
                i8 = i10;
                o9 = o8;
                j8 = j10;
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j8 = this.f22861c;
                i8 = (I) this.f22860b;
                o8 = (O) this.f22859a;
                o9 = (O) this.f22863e;
                r.b(obj);
            }
            i8.f28778a = o8.s(j8, o9.j(((Number) obj).floatValue()));
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f22871a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f22872b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f22874d;

        public d(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f22872b = obj;
            this.f22874d |= Integer.MIN_VALUE;
            return O.this.g(0L, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f22875a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f22876b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ long f22877c;

        public e(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            e eVar = O.this.new e(dVar);
            eVar.f22877c = ((y) obj).o();
            return eVar;
        }

        public final Object g(long j8, G6.d dVar) {
            return ((e) create(y.b(j8), dVar)).invokeSuspend(G.f1419a);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return g(((y) obj).o(), (G6.d) obj2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
        
            if (r0 == r6) goto L22;
         */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objC;
            long j8;
            Object objD;
            long j9;
            long j10;
            long j11;
            Object objA;
            Object objF = H6.c.f();
            int i8 = this.f22876b;
            if (i8 == 0) {
                r.b(obj);
                long j12 = this.f22877c;
                p002a1.b bVar = O.this.f22850f;
                this.f22877c = j12;
                this.f22876b = 1;
                objC = bVar.c(j12, this);
                if (objC != objF) {
                    j8 = j12;
                }
                return objF;
            }
            if (i8 == 1) {
                j8 = this.f22877c;
                r.b(obj);
                objC = obj;
            } else if (i8 == 2) {
                j10 = this.f22875a;
                j9 = this.f22877c;
                r.b(obj);
                objD = obj;
                long jO = ((y) objD).o();
                p002a1.b bVar2 = O.this.f22850f;
                long jK = y.k(j10, jO);
                this.f22877c = j9;
                this.f22875a = jO;
                this.f22876b = 3;
                j11 = jO;
                objA = bVar2.a(jK, j11, this);
            } else {
                if (i8 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j13 = this.f22875a;
                long j14 = this.f22877c;
                r.b(obj);
                j9 = j14;
                j11 = j13;
                objA = obj;
            }
            return y.b(y.k(j9, y.k(j11, ((y) objA).o())));
            long jK2 = y.k(j8, ((y) objC).o());
            O o8 = O.this;
            this.f22877c = j8;
            this.f22875a = jK2;
            this.f22876b = 2;
            objD = o8.d(jK2, this);
            if (objD != objF) {
                j9 = j8;
                j10 = jK2;
                long jO2 = ((y) objD).o();
                p002a1.b bVar3 = O.this.f22850f;
                long jK3 = y.k(j10, jO2);
                this.f22877c = j9;
                this.f22875a = jO2;
                this.f22876b = 3;
                j11 = jO2;
                objA = bVar3.a(jK3, j11, this);
            }
            return objF;
        }
    }

    public O(M m8, B b8, S s8, boolean z8, w wVar, p002a1.b bVar) {
        this.f22845a = m8;
        this.f22846b = b8;
        this.f22847c = s8;
        this.f22848d = z8;
        this.f22849e = wVar;
        this.f22850f = bVar;
    }

    public final long c(I i8, long j8, int i9) {
        a aVar = new a(i9, i8);
        S s8 = this.f22847c;
        if (p002a1.e.e(i9, p002a1.e.f13022a.c())) {
            return ((f) aVar.invoke(f.d(j8))).x();
        }
        return (s8 == null || !f()) ? ((f) aVar.invoke(f.d(j8))).x() : s8.c(j8, i9, aVar);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object d(long j8, G6.d dVar) {
        b bVar;
        I i8;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i9 = bVar.f22858d;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                bVar.f22858d = i9 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        b bVar2 = bVar;
        Object obj = bVar2.f22856b;
        Object objF = H6.c.f();
        int i10 = bVar2.f22858d;
        if (i10 == 0) {
            r.b(obj);
            I i11 = new I();
            i11.f28778a = j8;
            M m8 = this.f22845a;
            c cVar = new c(i11, j8, null);
            bVar2.f22855a = i11;
            bVar2.f22858d = 1;
            if (M.c(m8, null, cVar, bVar2, 1, null) == objF) {
                return objF;
            }
            i8 = i11;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i8 = (I) bVar2.f22855a;
            r.b(obj);
        }
        return y.b(i8.f28778a);
    }

    public final M e() {
        return this.f22845a;
    }

    public final boolean f() {
        return this.f22845a.a() || this.f22845a.d();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        if (r2.d(r7, r9, r0) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
    
        r7 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
    
        if (r9.invoke(r7, r0) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(long j8, G6.d dVar) {
        d dVar2;
        O o8;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i8 = dVar2.f22874d;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                dVar2.f22874d = i8 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object obj = dVar2.f22872b;
        Object objF = H6.c.f();
        int i9 = dVar2.f22874d;
        if (i9 == 0) {
            r.b(obj);
            i(true);
            long jN = n(j8);
            e eVar = new e(null);
            S s8 = this.f22847c;
            if (s8 == null || !f()) {
                y yVarB = y.b(jN);
                dVar2.f22871a = this;
                dVar2.f22874d = 2;
            } else {
                dVar2.f22871a = this;
                dVar2.f22874d = 1;
            }
        } else {
            if (i9 != 1 && i9 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o8 = (O) dVar2.f22871a;
            r.b(obj);
        }
        o8.i(false);
        return G.f1419a;
    }

    public final long h(long j8) {
        return this.f22845a.b() ? f.f9082b.c() : q(j(this.f22845a.e(j(p(j8)))));
    }

    public final void i(boolean z8) {
        this.f22851g.setValue(Boolean.valueOf(z8));
    }

    public final float j(float f8) {
        return this.f22848d ? f8 * (-1) : f8;
    }

    public final long k(long j8) {
        return this.f22848d ? f.u(j8, -1.0f) : j8;
    }

    public final boolean l() {
        if (this.f22845a.b() || ((Boolean) this.f22851g.getValue()).booleanValue()) {
            return true;
        }
        S s8 = this.f22847c;
        return s8 != null ? s8.b() : false;
    }

    public final long m(long j8) {
        return this.f22846b == B.Horizontal ? f.i(j8, 0.0f, 0.0f, 1, null) : f.i(j8, 0.0f, 0.0f, 2, null);
    }

    public final long n(long j8) {
        return this.f22846b == B.Horizontal ? y.e(j8, 0.0f, 0.0f, 1, null) : y.e(j8, 0.0f, 0.0f, 2, null);
    }

    public final float o(long j8) {
        return this.f22846b == B.Horizontal ? y.h(j8) : y.i(j8);
    }

    public final float p(long j8) {
        return this.f22846b == B.Horizontal ? f.o(j8) : f.p(j8);
    }

    public final long q(float f8) {
        if (f8 == 0.0f) {
            return f.f9082b.c();
        }
        return this.f22846b == B.Horizontal ? g.a(f8, 0.0f) : g.a(0.0f, f8);
    }

    public final void r(M m8, B b8, S s8, boolean z8, w wVar, p002a1.b bVar) {
        this.f22845a = m8;
        this.f22846b = b8;
        this.f22847c = s8;
        this.f22848d = z8;
        this.f22849e = wVar;
        this.f22850f = bVar;
    }

    public final long s(long j8, float f8) {
        return this.f22846b == B.Horizontal ? y.e(j8, f8, 0.0f, 2, null) : y.e(j8, 0.0f, f8, 1, null);
    }
}
