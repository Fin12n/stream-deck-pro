package p040e3;

import C6.G;
import C6.m;
import C6.r;
import G6.h;
import I6.l;
import Q6.k;
import Q6.o;
import W6.n;
import com.revenuecat.purchases.common.UtilsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import p004a3.C1705k;
import p017b7.AbstractC1785g;
import p017b7.AbstractC1823z0;
import p017b7.InterfaceC1815v0;
import p017b7.J;
import p017b7.J0;
import p046f0.M;
import p215z0.AbstractC3150e0;
import p215z0.InterfaceC3164l0;
import p215z0.g1;
import p215z0.l1;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c implements p040e3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3164l0 f20557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3164l0 f20558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC3164l0 f20559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC3164l0 f20560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC3164l0 f20561e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC3164l0 f20562f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC3164l0 f20563g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q1 f20564h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final InterfaceC3164l0 f20565i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final InterfaceC3164l0 f20566j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final InterfaceC3164l0 f20567k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InterfaceC3164l0 f20568l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final q1 f20569m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final q1 f20570n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final M f20571o;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends l implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f20572a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f20574c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f20575d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f20576e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ float f20577f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ j f20578g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ C1705k f20579h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ float f20580i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ boolean f20581j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ boolean f20582k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ i f20583l;

        /* JADX INFO: renamed from: e3.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0475a extends l implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f20584a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f20585b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ InterfaceC1815v0 f20586c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ int f20587d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ int f20588e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ c f20589f;

            /* JADX INFO: renamed from: e3.c$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public /* synthetic */ class C0476a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f20590a;

                static {
                    int[] iArr = new int[i.values().length];
                    try {
                        iArr[i.OnIterationFinish.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    f20590a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0475a(i iVar, InterfaceC1815v0 interfaceC1815v0, int i8, int i9, c cVar, G6.d dVar) {
                super(2, dVar);
                this.f20585b = iVar;
                this.f20586c = interfaceC1815v0;
                this.f20587d = i8;
                this.f20588e = i9;
                this.f20589f = cVar;
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                return new C0475a(this.f20585b, this.f20586c, this.f20587d, this.f20588e, this.f20589f, dVar);
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(J j8, G6.d dVar) {
                return ((C0475a) create(j8, dVar)).invokeSuspend(G.f1419a);
            }

            /* JADX WARN: Code duplicated, block: B:11:0x0026  */
            /* JADX WARN: Code duplicated, block: B:15:0x0034 A[ADDED_TO_REGION, REMOVE] */
            /* JADX WARN: Code duplicated, block: B:18:0x0040 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:21:0x0049  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x003e -> B:19:0x0041). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:21:0x0049
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // I6.a
            public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                /*
                    r3 = this;
                    java.lang.Object r0 = H6.c.f()
                    int r1 = r3.f20584a
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    C6.r.b(r4)
                    goto L41
                Lf:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r0)
                    throw r4
                L17:
                    C6.r.b(r4)
                L1a:
                    e3.i r4 = r3.f20585b
                    int[] r1 = e3.c.a.C0475a.C0476a.f20590a
                    int r4 = r4.ordinal()
                    r4 = r1[r4]
                    if (r4 != r2) goto L34
                    b7.v0 r4 = r3.f20586c
                    boolean r4 = r4.b()
                    if (r4 == 0) goto L31
                    int r4 = r3.f20587d
                    goto L36
                L31:
                    int r4 = r3.f20588e
                    goto L36
                L34:
                    int r4 = r3.f20587d
                L36:
                    e3.c r1 = r3.f20589f
                    r3.f20584a = r2
                    java.lang.Object r4 = p040e3.c.c(r1, r4, r3)
                    if (r4 != r0) goto L41
                    return r0
                L41:
                    java.lang.Boolean r4 = (java.lang.Boolean) r4
                    boolean r4 = r4.booleanValue()
                    if (r4 != 0) goto L1a
                    C6.G r4 = C6.G.f1419a
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: e3.c.a.C0475a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public /* synthetic */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f20591a;

            static {
                int[] iArr = new int[i.values().length];
                try {
                    iArr[i.OnIterationFinish.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[i.Immediately.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f20591a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i8, int i9, boolean z8, float f8, j jVar, C1705k c1705k, float f9, boolean z9, boolean z10, i iVar, G6.d dVar) {
            super(1, dVar);
            this.f20574c = i8;
            this.f20575d = i9;
            this.f20576e = z8;
            this.f20577f = f8;
            this.f20578g = jVar;
            this.f20579h = c1705k;
            this.f20580i = f9;
            this.f20581j = z9;
            this.f20582k = z10;
            this.f20583l = iVar;
        }

        @Override // I6.a
        public final G6.d create(G6.d dVar) {
            return c.this.new a(this.f20574c, this.f20575d, this.f20576e, this.f20577f, this.f20578g, this.f20579h, this.f20580i, this.f20581j, this.f20582k, this.f20583l, dVar);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(G6.d dVar) {
            return ((a) create(dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            G6.g gVar;
            Object objF = H6.c.f();
            int i8 = this.f20572a;
            try {
                if (i8 == 0) {
                    r.b(obj);
                    c.this.S(this.f20574c);
                    c.this.T(this.f20575d);
                    c.this.Y(this.f20576e);
                    c.this.Z(this.f20577f);
                    c.this.Q(this.f20578g);
                    c.this.R(this.f20579h);
                    c.this.b0(this.f20580i);
                    c.this.a0(this.f20581j);
                    if (!this.f20582k) {
                        c.this.U(Long.MIN_VALUE);
                    }
                    if (this.f20579h == null) {
                        c.this.V(false);
                        return G.f1419a;
                    }
                    if (Float.isInfinite(this.f20577f)) {
                        c cVar = c.this;
                        cVar.b0(cVar.J());
                        c.this.V(false);
                        c.this.S(this.f20575d);
                        return G.f1419a;
                    }
                    c.this.V(true);
                    int i9 = b.f20591a[this.f20583l.ordinal()];
                    if (i9 == 1) {
                        gVar = J0.f15902b;
                    } else {
                        if (i9 != 2) {
                            throw new m();
                        }
                        gVar = h.f2820a;
                    }
                    C0475a c0475a = new C0475a(this.f20583l, AbstractC1823z0.n(getContext()), this.f20575d, this.f20574c, c.this, null);
                    this.f20572a = 1;
                    if (AbstractC1785g.g(gVar, c0475a, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                }
                AbstractC1823z0.l(getContext());
                c.this.V(false);
                return G.f1419a;
            } catch (Throwable th) {
                c.this.V(false);
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f20593b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i8) {
            super(1);
            this.f20593b = i8;
        }

        public final Boolean b(long j8) {
            return Boolean.valueOf(c.this.O(this.f20593b, j8));
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((Number) obj).longValue());
        }
    }

    /* JADX INFO: renamed from: e3.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0477c extends u implements k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f20595b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0477c(int i8) {
            super(1);
            this.f20595b = i8;
        }

        public final Boolean b(long j8) {
            return Boolean.valueOf(c.this.O(this.f20595b, j8));
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((Number) obj).longValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            C1705k c1705kT = c.this.t();
            float fA = 0.0f;
            if (c1705kT != null) {
                if (c.this.j() < 0.0f) {
                    j jVarU = c.this.u();
                    if (jVarU != null) {
                        fA = jVarU.b(c1705kT);
                    }
                } else {
                    j jVarU2 = c.this.u();
                    fA = jVarU2 != null ? jVarU2.a(c1705kT) : 1.0f;
                }
            }
            return Float.valueOf(fA);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements Function0 {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf((c.this.g() && c.this.n() % 2 == 0) ? -c.this.j() : c.this.j());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends u implements Function0 {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(c.this.n() == c.this.i() && c.this.l() == c.this.J());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends l implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f20599a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C1705k f20601c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f20602d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f20603e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f20604f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C1705k c1705k, float f8, int i8, boolean z8, G6.d dVar) {
            super(1, dVar);
            this.f20601c = c1705k;
            this.f20602d = f8;
            this.f20603e = i8;
            this.f20604f = z8;
        }

        @Override // I6.a
        public final G6.d create(G6.d dVar) {
            return c.this.new g(this.f20601c, this.f20602d, this.f20603e, this.f20604f, dVar);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(G6.d dVar) {
            return ((g) create(dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            H6.c.f();
            if (this.f20599a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            c.this.R(this.f20601c);
            c.this.b0(this.f20602d);
            c.this.S(this.f20603e);
            c.this.V(false);
            if (this.f20604f) {
                c.this.U(Long.MIN_VALUE);
            }
            return G.f1419a;
        }
    }

    public c() {
        Boolean bool = Boolean.FALSE;
        this.f20557a = l1.e(bool, null, 2, null);
        this.f20558b = l1.e(1, null, 2, null);
        this.f20559c = l1.e(1, null, 2, null);
        this.f20560d = l1.e(bool, null, 2, null);
        this.f20561e = l1.e(null, null, 2, null);
        this.f20562f = l1.e(Float.valueOf(1.0f), null, 2, null);
        this.f20563g = l1.e(bool, null, 2, null);
        this.f20564h = g1.d(new e());
        this.f20565i = l1.e(null, null, 2, null);
        Float fValueOf = Float.valueOf(0.0f);
        this.f20566j = l1.e(fValueOf, null, 2, null);
        this.f20567k = l1.e(fValueOf, null, 2, null);
        this.f20568l = l1.e(Long.MIN_VALUE, null, 2, null);
        this.f20569m = g1.d(new d());
        this.f20570n = g1.d(new f());
        this.f20571o = new M();
    }

    public final Object I(int i8, G6.d dVar) {
        return i8 == Integer.MAX_VALUE ? p037e0.J.a(new b(i8), dVar) : AbstractC3150e0.c(new C0477c(i8), dVar);
    }

    public final float J() {
        return ((Number) this.f20569m.getValue()).floatValue();
    }

    public final float K() {
        return ((Number) this.f20564h.getValue()).floatValue();
    }

    public long L() {
        return ((Number) this.f20568l.getValue()).longValue();
    }

    public final float M() {
        return ((Number) this.f20566j.getValue()).floatValue();
    }

    public boolean N() {
        return ((Boolean) this.f20563g.getValue()).booleanValue();
    }

    public final boolean O(int i8, long j8) {
        C1705k c1705kT = t();
        if (c1705kT == null) {
            return true;
        }
        long jL = L() == Long.MIN_VALUE ? 0L : j8 - L();
        U(j8);
        j jVarU = u();
        float fB = jVarU != null ? jVarU.b(c1705kT) : 0.0f;
        j jVarU2 = u();
        float fA = jVarU2 != null ? jVarU2.a(c1705kT) : 1.0f;
        float fD = ((jL / ((long) UtilsKt.MICROS_MULTIPLIER)) / c1705kT.d()) * K();
        float fM = K() < 0.0f ? fB - (M() + fD) : (M() + fD) - fA;
        if (fM < 0.0f) {
            b0(n.j(M(), fB, fA) + fD);
        } else {
            float f8 = fA - fB;
            int i9 = (int) (fM / f8);
            int i10 = i9 + 1;
            if (n() + i10 > i8) {
                b0(J());
                S(i8);
                return false;
            }
            S(n() + i10);
            float f9 = fM - (i9 * f8);
            b0(K() < 0.0f ? fA - f9 : fB + f9);
        }
        return true;
    }

    public final float P(float f8, C1705k c1705k) {
        if (c1705k == null) {
            return f8;
        }
        return f8 - (f8 % (1 / c1705k.i()));
    }

    public final void Q(j jVar) {
        this.f20561e.setValue(jVar);
    }

    public final void R(C1705k c1705k) {
        this.f20565i.setValue(c1705k);
    }

    public final void S(int i8) {
        this.f20558b.setValue(Integer.valueOf(i8));
    }

    public final void T(int i8) {
        this.f20559c.setValue(Integer.valueOf(i8));
    }

    public final void U(long j8) {
        this.f20568l.setValue(Long.valueOf(j8));
    }

    public final void V(boolean z8) {
        this.f20557a.setValue(Boolean.valueOf(z8));
    }

    public final void W(float f8) {
        this.f20567k.setValue(Float.valueOf(f8));
    }

    public final void X(float f8) {
        this.f20566j.setValue(Float.valueOf(f8));
    }

    public final void Y(boolean z8) {
        this.f20560d.setValue(Boolean.valueOf(z8));
    }

    public final void Z(float f8) {
        this.f20562f.setValue(Float.valueOf(f8));
    }

    public final void a0(boolean z8) {
        this.f20563g.setValue(Boolean.valueOf(z8));
    }

    public final void b0(float f8) {
        X(f8);
        if (N()) {
            f8 = P(f8, t());
        }
        W(f8);
    }

    @Override // p040e3.h
    public boolean g() {
        return ((Boolean) this.f20560d.getValue()).booleanValue();
    }

    @Override // p040e3.h
    public int i() {
        return ((Number) this.f20559c.getValue()).intValue();
    }

    @Override // p040e3.h
    public float j() {
        return ((Number) this.f20562f.getValue()).floatValue();
    }

    @Override // p040e3.h
    public float l() {
        return ((Number) this.f20567k.getValue()).floatValue();
    }

    @Override // p040e3.b
    public Object m(C1705k c1705k, int i8, int i9, boolean z8, float f8, j jVar, float f9, boolean z9, i iVar, boolean z10, boolean z11, G6.d dVar) {
        Object objE = M.e(this.f20571o, null, new a(i8, i9, z8, f8, jVar, c1705k, f9, z11, z9, iVar, null), dVar, 1, null);
        return objE == H6.c.f() ? objE : G.f1419a;
    }

    @Override // p040e3.h
    public int n() {
        return ((Number) this.f20558b.getValue()).intValue();
    }

    @Override // p040e3.b
    public Object r(C1705k c1705k, float f8, int i8, boolean z8, G6.d dVar) {
        Object objE = M.e(this.f20571o, null, new g(c1705k, f8, i8, z8, null), dVar, 1, null);
        return objE == H6.c.f() ? objE : G.f1419a;
    }

    @Override // p040e3.h
    public C1705k t() {
        return (C1705k) this.f20565i.getValue();
    }

    @Override // p040e3.h
    public j u() {
        return (j) this.f20561e.getValue();
    }

    @Override // p215z0.q1
    public Float getValue() {
        return Float.valueOf(l());
    }
}
