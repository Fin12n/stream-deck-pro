package p215z0;

import B0.d;
import C6.G;
import J0.AbstractC1028k;
import J0.H;
import J0.I;
import J0.p;
import Q6.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p010b0.w;
import p010b0.x;
import p179u4.eubL.OjEsfyJYzbPn;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class D extends H implements E {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f38514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f1 f38515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f38516d = new a();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends I implements E.a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final C0849a f38517h = new C0849a(null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f38518i = 8;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final Object f38519j = new Object();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f38520c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f38521d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public w f38522e = x.a();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f38523f = f38519j;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f38524g;

        /* JADX INFO: renamed from: z0.D$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0849a {
            public /* synthetic */ C0849a(AbstractC2633k abstractC2633k) {
                this();
            }

            public final Object a() {
                return a.f38519j;
            }

            public C0849a() {
            }
        }

        @Override // z0.E.a
        public Object a() {
            return this.f38523f;
        }

        @Override // z0.E.a
        public w b() {
            return this.f38522e;
        }

        @Override // J0.I
        public void c(I i8) {
            t.e(i8, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
            a aVar = (a) i8;
            m(aVar.b());
            this.f38523f = aVar.f38523f;
            this.f38524g = aVar.f38524g;
        }

        @Override // J0.I
        public I d() {
            return new a();
        }

        public final Object j() {
            return this.f38523f;
        }

        public final boolean k(E e8, AbstractC1028k abstractC1028k) {
            boolean z8;
            boolean z9;
            synchronized (p.I()) {
                z8 = true;
                z9 = (this.f38520c == abstractC1028k.f() && this.f38521d == abstractC1028k.j()) ? false : true;
            }
            if (this.f38523f == f38519j || (z9 && this.f38524g != l(e8, abstractC1028k))) {
                z8 = false;
            }
            if (!z8 || !z9) {
                return z8;
            }
            synchronized (p.I()) {
                this.f38520c = abstractC1028k.f();
                this.f38521d = abstractC1028k.j();
                G g8 = G.f1419a;
            }
            return z8;
        }

        /* JADX WARN: Code duplicated, block: B:46:0x00bc  */
        public final int l(E e8, AbstractC1028k abstractC1028k) {
            w wVarB;
            int iC;
            int iS;
            Object[] objArrR;
            int i8;
            int i9;
            synchronized (p.I()) {
                wVarB = b();
            }
            int i10 = 7;
            if (!wVarB.g()) {
                return 7;
            }
            d dVarC = g1.c();
            int iS2 = dVarC.s();
            if (iS2 > 0) {
                Object[] objArrR2 = dVarC.r();
                int i11 = 0;
                do {
                    ((F) objArrR2[i11]).b(e8);
                    i11++;
                } while (i11 < iS2);
            }
            try {
                Object[] objArr = wVarB.f15641b;
                int[] iArr = wVarB.f15642c;
                long[] jArr = wVarB.f15640a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    iC = 7;
                    int i12 = 0;
                    while (true) {
                        long j8 = jArr[i12];
                        if ((((~j8) << i10) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i13 = 8;
                            int i14 = 8 - ((~(i12 - length)) >>> 31);
                            int i15 = 0;
                            while (i15 < i14) {
                                if ((j8 & 255) < 128) {
                                    int i16 = (i12 << 3) + i15;
                                    Object obj = objArr[i16];
                                    int i17 = iArr[i16];
                                    i9 = i13;
                                    J0.G g8 = (J0.G) obj;
                                    if (i17 == 1) {
                                        I iA = g8 instanceof D ? ((D) g8).A(abstractC1028k) : p.G(g8.c(), abstractC1028k);
                                        iC = (((iC * 31) + AbstractC3145c.c(iA)) * 31) + iA.f();
                                    }
                                } else {
                                    i9 = i13;
                                }
                                j8 >>= i9;
                                i15++;
                                i13 = i9;
                            }
                            if (i14 != i13) {
                                break;
                            }
                        }
                        if (i12 != length) {
                            i12++;
                            i10 = i10;
                        } else {
                            i10 = iC;
                        }
                    }
                    G g9 = G.f1419a;
                    iS = dVarC.s();
                    if (iS > 0) {
                        objArrR = dVarC.r();
                        i8 = 0;
                        do {
                            ((F) objArrR[i8]).a(e8);
                            i8++;
                        } while (i8 < iS);
                    }
                    return iC;
                }
                iC = i10;
                G g10 = G.f1419a;
                iS = dVarC.s();
                if (iS > 0) {
                    objArrR = dVarC.r();
                    i8 = 0;
                    do {
                        ((F) objArrR[i8]).a(e8);
                        i8++;
                    } while (i8 < iS);
                }
                return iC;
            } catch (Throwable th) {
                int iS3 = dVarC.s();
                if (iS3 > 0) {
                    Object[] objArrR3 = dVarC.r();
                    int i18 = 0;
                    do {
                        ((F) objArrR3[i18]).a(e8);
                        i18++;
                    } while (i18 < iS3);
                }
                throw th;
            }
        }

        public void m(w wVar) {
            this.f38522e = wVar;
        }

        public final void n(Object obj) {
            this.f38523f = obj;
        }

        public final void o(int i8) {
            this.f38524g = i8;
        }

        public final void p(int i8) {
            this.f38520c = i8;
        }

        public final void q(int i8) {
            this.f38521d = i8;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ H0.d f38526b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p010b0.t f38527c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f38528d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(H0.d dVar, p010b0.t tVar, int i8) {
            super(1);
            this.f38526b = dVar;
            this.f38527c = tVar;
            this.f38528d = i8;
        }

        public final void b(Object obj) {
            if (obj == D.this) {
                throw new IllegalStateException("A derived state calculation cannot read itself");
            }
            if (obj instanceof J0.G) {
                int iA = this.f38526b.a();
                p010b0.t tVar = this.f38527c;
                tVar.q(obj, Math.min(iA - this.f38528d, tVar.d(obj, Integer.MAX_VALUE)));
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b(obj);
            return G.f1419a;
        }
    }

    public D(Function0 function0, f1 f1Var) {
        this.f38514b = function0;
        this.f38515c = f1Var;
    }

    public final I A(AbstractC1028k abstractC1028k) {
        return B((a) p.G(this.f38516d, abstractC1028k), abstractC1028k, false, this.f38514b);
    }

    public final a B(a aVar, AbstractC1028k abstractC1028k, boolean z8, Function0 function0) throws Throwable {
        AbstractC1028k.a aVar2;
        f1 f1VarD;
        int i8;
        a aVar3 = aVar;
        boolean z9 = true;
        if (!aVar3.k(this, abstractC1028k)) {
            int i9 = 0;
            p010b0.t tVar = new p010b0.t(0, 1, null);
            H0.d dVar = (H0.d) h1.f38768a.a();
            if (dVar == null) {
                dVar = new H0.d(0);
                h1.f38768a.b(dVar);
            }
            int iA = dVar.a();
            d dVarC = g1.c();
            int iS = dVarC.s();
            if (iS > 0) {
                Object[] objArrR = dVarC.r();
                int i10 = 0;
                do {
                    ((F) objArrR[i10]).b(this);
                    i10++;
                } while (i10 < iS);
            }
            try {
                dVar.b(iA + 1);
                Object objF = AbstractC1028k.f3974e.f(new b(dVar, tVar, iA), null, function0);
                dVar.b(iA);
                int iS2 = dVarC.s();
                if (iS2 > 0) {
                    Object[] objArrR2 = dVarC.r();
                    do {
                        ((F) objArrR2[i9]).a(this);
                        i9++;
                    } while (i9 < iS2);
                }
                synchronized (p.I()) {
                    try {
                        aVar2 = AbstractC1028k.f3974e;
                        AbstractC1028k abstractC1028kD = aVar2.d();
                        if (aVar3.j() == a.f38517h.a() || (f1VarD = d()) == null || !f1VarD.a(objF, aVar3.j())) {
                            aVar3 = (a) p.O(this.f38516d, this, abstractC1028kD);
                            aVar3.m(tVar);
                            aVar3.o(aVar3.l(this, abstractC1028kD));
                            aVar3.p(abstractC1028k.f());
                            aVar3.q(abstractC1028k.j());
                            aVar3.n(objF);
                        } else {
                            aVar3.m(tVar);
                            aVar3.o(aVar3.l(this, abstractC1028kD));
                            aVar3.p(abstractC1028k.f());
                            aVar3.q(abstractC1028k.j());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                H0.d dVar2 = (H0.d) h1.f38768a.a();
                if (dVar2 != null && dVar2.a() == 0) {
                    aVar2.e();
                }
                return aVar3;
            } catch (Throwable th2) {
                int iS3 = dVarC.s();
                if (iS3 > 0) {
                    Object[] objArrR3 = dVarC.r();
                    int i11 = 0;
                    do {
                        ((F) objArrR3[i11]).a(this);
                        i11++;
                    } while (i11 < iS3);
                }
                throw th2;
            }
        }
        if (z8) {
            d dVarC2 = g1.c();
            int iS4 = dVarC2.s();
            if (iS4 > 0) {
                Object[] objArrR4 = dVarC2.r();
                int i12 = 0;
                do {
                    ((F) objArrR4[i12]).b(this);
                    i12++;
                } while (i12 < iS4);
            }
            try {
                w wVarB = aVar3.b();
                H0.d dVar3 = (H0.d) h1.f38768a.a();
                if (dVar3 == null) {
                    dVar3 = new H0.d(0);
                    h1.f38768a.b(dVar3);
                }
                int iA2 = dVar3.a();
                Object[] objArr = wVarB.f15641b;
                int[] iArr = wVarB.f15642c;
                long[] jArr = wVarB.f15640a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i13 = 0;
                    while (true) {
                        long j8 = jArr[i13];
                        boolean z10 = z9;
                        if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i14 = 8;
                            int i15 = 8 - ((~(i13 - length)) >>> 31);
                            int i16 = 0;
                            while (i16 < i15) {
                                if ((j8 & 255) < 128) {
                                    int i17 = (i13 << 3) + i16;
                                    try {
                                        i8 = i14;
                                        J0.G g8 = (J0.G) objArr[i17];
                                        dVar3.b(iA2 + iArr[i17]);
                                        k kVarH = abstractC1028k.h();
                                        if (kVarH != null) {
                                            kVarH.invoke(g8);
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        int iS5 = dVarC2.s();
                                        if (iS5 > 0) {
                                            Object[] objArrR5 = dVarC2.r();
                                            int i18 = 0;
                                            do {
                                                ((F) objArrR5[i18]).a(this);
                                                i18++;
                                            } while (i18 < iS5);
                                        }
                                        throw th;
                                    }
                                } else {
                                    i8 = i14;
                                }
                                j8 >>= i8;
                                i16++;
                                i14 = i8;
                            }
                            if (i15 != i14) {
                                break;
                            }
                        }
                        if (i13 == length) {
                            break;
                        }
                        i13++;
                        z9 = z10;
                    }
                }
                dVar3.b(iA2);
                G g9 = G.f1419a;
                int iS6 = dVarC2.s();
                if (iS6 > 0) {
                    Object[] objArrR6 = dVarC2.r();
                    int i19 = 0;
                    do {
                        ((F) objArrR6[i19]).a(this);
                        i19++;
                    } while (i19 < iS6);
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        return aVar3;
    }

    public final String C() {
        a aVar = (a) p.F(this.f38516d);
        return aVar.k(this, AbstractC1028k.f3974e.d()) ? String.valueOf(aVar.j()) : "<Not calculated>";
    }

    @Override // J0.G
    public I c() {
        return this.f38516d;
    }

    @Override // p215z0.E
    public f1 d() {
        return this.f38515c;
    }

    @Override // p215z0.q1
    public Object getValue() {
        AbstractC1028k.a aVar = AbstractC1028k.f3974e;
        k kVarH = aVar.d().h();
        if (kVarH != null) {
            kVarH.invoke(this);
        }
        return B((a) p.F(this.f38516d), aVar.d(), true, this.f38514b).j();
    }

    @Override // J0.G
    public void o(I i8) {
        t.e(i8, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.f38516d = (a) i8;
    }

    @Override // p215z0.E
    public E.a z() {
        return B((a) p.F(this.f38516d), AbstractC1028k.f3974e.d(), false, this.f38514b);
    }

    public String toString() {
        return "DerivedState(value=" + C() + OjEsfyJYzbPn.bxRQlnNWOCyWSS + hashCode();
    }
}
