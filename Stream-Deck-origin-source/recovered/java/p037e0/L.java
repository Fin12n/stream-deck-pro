package p037e0;

import B0.d;
import C6.r;
import I6.l;
import Q6.k;
import Q6.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.u;
import p017b7.J;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3164l0;
import p215z0.K;
import p215z0.P0;
import p215z0.l1;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class L {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f20014f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f20016b = new d(new a[16], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC3164l0 f20017c = l1.e(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f20018d = Long.MIN_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC3164l0 f20019e = l1.e(Boolean.TRUE, null, 2, null);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class a implements q1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f20020a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f20021b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final j0 f20022c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f20023d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final InterfaceC3164l0 f20024e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public InterfaceC2213i f20025f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public e0 f20026g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f20027h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f20028i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f20029j;

        public a(Object obj, Object obj2, j0 j0Var, InterfaceC2213i interfaceC2213i, String str) {
            this.f20020a = obj;
            this.f20021b = obj2;
            this.f20022c = j0Var;
            this.f20023d = str;
            this.f20024e = l1.e(obj, null, 2, null);
            this.f20025f = interfaceC2213i;
            this.f20026g = new e0(this.f20025f, j0Var, this.f20020a, this.f20021b, (AbstractC2221q) null, 16, (AbstractC2633k) null);
        }

        public void A(Object obj) {
            this.f20024e.setValue(obj);
        }

        public final void B() {
            A(this.f20026g.g());
            this.f20028i = true;
        }

        public final void C(Object obj, Object obj2, InterfaceC2213i interfaceC2213i) {
            this.f20020a = obj;
            this.f20021b = obj2;
            this.f20025f = interfaceC2213i;
            this.f20026g = new e0(interfaceC2213i, this.f20022c, obj, obj2, (AbstractC2221q) null, 16, (AbstractC2633k) null);
            L.this.l(true);
            this.f20027h = false;
            this.f20028i = true;
        }

        public final Object c() {
            return this.f20020a;
        }

        public final Object e() {
            return this.f20021b;
        }

        @Override // p215z0.q1
        public Object getValue() {
            return this.f20024e.getValue();
        }

        public final boolean o() {
            return this.f20027h;
        }

        public final void q(long j8) {
            L.this.l(false);
            if (this.f20028i) {
                this.f20028i = false;
                this.f20029j = j8;
            }
            long j9 = j8 - this.f20029j;
            A(this.f20026g.f(j9));
            this.f20027h = this.f20026g.e(j9);
        }

        public final void s() {
            this.f20028i = true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f20031a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f20032b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f20033c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3164l0 f20034d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ L f20035e;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC3164l0 f20036a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ L f20037b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ G f20038c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ J f20039d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC3164l0 interfaceC3164l0, L l8, G g8, J j8) {
                super(1);
                this.f20036a = interfaceC3164l0;
                this.f20037b = l8;
                this.f20038c = g8;
                this.f20039d = j8;
            }

            public final void b(long j8) {
                q1 q1Var = (q1) this.f20036a.getValue();
                long jLongValue = q1Var != null ? ((Number) q1Var.getValue()).longValue() : j8;
                int i8 = 0;
                if (this.f20037b.f20018d == Long.MIN_VALUE || this.f20038c.f28776a != d0.n(this.f20039d.getCoroutineContext())) {
                    this.f20037b.f20018d = j8;
                    d dVar = this.f20037b.f20016b;
                    int iS = dVar.s();
                    if (iS > 0) {
                        Object[] objArrR = dVar.r();
                        int i9 = 0;
                        do {
                            ((a) objArrR[i9]).s();
                            i9++;
                        } while (i9 < iS);
                    }
                    this.f20038c.f28776a = d0.n(this.f20039d.getCoroutineContext());
                }
                if (this.f20038c.f28776a != 0.0f) {
                    this.f20037b.i((long) ((jLongValue - this.f20037b.f20018d) / this.f20038c.f28776a));
                    return;
                }
                d dVar2 = this.f20037b.f20016b;
                int iS2 = dVar2.s();
                if (iS2 > 0) {
                    Object[] objArrR2 = dVar2.r();
                    do {
                        ((a) objArrR2[i8]).B();
                        i8++;
                    } while (i8 < iS2);
                }
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b(((Number) obj).longValue());
                return C6.G.f1419a;
            }
        }

        /* JADX INFO: renamed from: e0.L$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0465b extends u implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ J f20040a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0465b(J j8) {
                super(0);
                this.f20040a = j8;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                return Float.valueOf(d0.n(this.f20040a.getCoroutineContext()));
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class c extends l implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f20041a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ float f20042b;

            public c(G6.d dVar) {
                super(2, dVar);
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                c cVar = new c(dVar);
                cVar.f20042b = ((Number) obj).floatValue();
                return cVar;
            }

            public final Object g(float f8, G6.d dVar) {
                return ((c) create(Float.valueOf(f8), dVar)).invokeSuspend(C6.G.f1419a);
            }

            @Override // Q6.o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return g(((Number) obj).floatValue(), (G6.d) obj2);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                H6.c.f();
                if (this.f20041a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                return I6.b.a(this.f20042b > 0.0f);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC3164l0 interfaceC3164l0, L l8, G6.d dVar) {
            super(2, dVar);
            this.f20034d = interfaceC3164l0;
            this.f20035e = l8;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            b bVar = new b(this.f20034d, this.f20035e, dVar);
            bVar.f20033c = obj;
            return bVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((b) create(j8, dVar)).invokeSuspend(C6.G.f1419a);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0040 A[PHI: r1 r8
          0x0040: PHI (r1v3 kotlin.jvm.internal.G) = (r1v1 kotlin.jvm.internal.G), (r1v2 kotlin.jvm.internal.G), (r1v2 kotlin.jvm.internal.G), (r1v7 kotlin.jvm.internal.G) binds: [B:10:0x0030, B:15:0x005b, B:17:0x0076, B:6:0x000e] A[DONT_GENERATE, DONT_INLINE]
          0x0040: PHI (r8v4 b7.J) = (r8v2 b7.J), (r8v3 b7.J), (r8v3 b7.J), (r8v7 b7.J) binds: [B:10:0x0030, B:15:0x005b, B:17:0x0076, B:6:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:14:0x0056 A[PHI: r1 r8
          0x0056: PHI (r1v2 kotlin.jvm.internal.G) = (r1v3 kotlin.jvm.internal.G), (r1v5 kotlin.jvm.internal.G) binds: [B:12:0x0053, B:9:0x0023] A[DONT_GENERATE, DONT_INLINE]
          0x0056: PHI (r8v3 b7.J) = (r8v4 b7.J), (r8v5 b7.J) binds: [B:12:0x0053, B:9:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:16:0x005d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005b -> B:11:0x0040). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0076 -> B:11:0x0040). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // I6.a
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = H6.c.f()
                int r1 = r7.f20032b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L30
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r7.f20031a
                kotlin.jvm.internal.G r1 = (kotlin.jvm.internal.G) r1
                java.lang.Object r4 = r7.f20033c
                b7.J r4 = (p017b7.J) r4
                C6.r.b(r8)
                r8 = r4
                goto L40
            L1b:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L23:
                java.lang.Object r1 = r7.f20031a
                kotlin.jvm.internal.G r1 = (kotlin.jvm.internal.G) r1
                java.lang.Object r4 = r7.f20033c
                b7.J r4 = (p017b7.J) r4
                C6.r.b(r8)
                r8 = r4
                goto L56
            L30:
                C6.r.b(r8)
                java.lang.Object r8 = r7.f20033c
                b7.J r8 = (p017b7.J) r8
                kotlin.jvm.internal.G r1 = new kotlin.jvm.internal.G
                r1.<init>()
                r4 = 1065353216(0x3f800000, float:1.0)
                r1.f28776a = r4
            L40:
                e0.L$b$a r4 = new e0.L$b$a
                z0.l0 r5 = r7.f20034d
                e0.L r6 = r7.f20035e
                r4.<init>(r5, r6, r1, r8)
                r7.f20033c = r8
                r7.f20031a = r1
                r7.f20032b = r3
                java.lang.Object r4 = p037e0.J.a(r4, r7)
                if (r4 != r0) goto L56
                goto L78
            L56:
                float r4 = r1.f28776a
                r5 = 0
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 != 0) goto L40
                e0.L$b$b r4 = new e0.L$b$b
                r4.<init>(r8)
                e7.f r4 = p215z0.g1.q(r4)
                e0.L$b$c r5 = new e0.L$b$c
                r6 = 0
                r5.<init>(r6)
                r7.f20033c = r8
                r7.f20031a = r1
                r7.f20032b = r2
                java.lang.Object r4 = p044e7.AbstractC2262h.y(r4, r5, r7)
                if (r4 != r0) goto L40
            L78:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: e0.L.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f20044b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i8) {
            super(2);
            this.f20044b = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            L.this.k(interfaceC3163l, F0.a(this.f20044b | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return C6.G.f1419a;
        }
    }

    public L(String str) {
        this.f20015a = str;
    }

    public final void f(a aVar) {
        this.f20016b.d(aVar);
        l(true);
    }

    public final boolean g() {
        return ((Boolean) this.f20017c.getValue()).booleanValue();
    }

    public final boolean h() {
        return ((Boolean) this.f20019e.getValue()).booleanValue();
    }

    public final void i(long j8) {
        boolean z8;
        d dVar = this.f20016b;
        int iS = dVar.s();
        if (iS > 0) {
            Object[] objArrR = dVar.r();
            z8 = true;
            int i8 = 0;
            do {
                a aVar = (a) objArrR[i8];
                if (!aVar.o()) {
                    aVar.q(j8);
                }
                if (!aVar.o()) {
                    z8 = false;
                }
                i8++;
            } while (i8 < iS);
        } else {
            z8 = true;
        }
        m(!z8);
    }

    public final void j(a aVar) {
        this.f20016b.z(aVar);
    }

    public final void k(InterfaceC3163l interfaceC3163l, int i8) {
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-318043801);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-318043801, i8, -1, "androidx.compose.animation.core.InfiniteTransition.run (InfiniteTransition.kt:171)");
        }
        interfaceC3163lP.f(-492369756);
        Object objG = interfaceC3163lP.g();
        if (objG == InterfaceC3163l.f38803a.a()) {
            objG = l1.e(null, null, 2, null);
            interfaceC3163lP.H(objG);
        }
        interfaceC3163lP.N();
        InterfaceC3164l0 interfaceC3164l0 = (InterfaceC3164l0) objG;
        if (h() || g()) {
            K.d(this, new b(interfaceC3164l0, this, null), interfaceC3163lP, 72);
        }
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new c(i8));
        }
    }

    public final void l(boolean z8) {
        this.f20017c.setValue(Boolean.valueOf(z8));
    }

    public final void m(boolean z8) {
        this.f20019e.setValue(Boolean.valueOf(z8));
    }
}
