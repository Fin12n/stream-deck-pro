package p011b1;

import A1.r;
import C6.G;
import C6.q;
import E4.JFpq.XRlnZWSrAFn;
import G6.f;
import G6.g;
import G6.h;
import I6.l;
import L0.i;
import Q0.m;
import Q6.k;
import Q6.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.u;
import p017b7.AbstractC1789i;
import p017b7.C1797m;
import p017b7.InterfaceC1795l;
import p017b7.InterfaceC1815v0;
import p017b7.J;
import p017b7.L;
import p056g1.AbstractC2347k;
import p065h1.R0;
import p201x2.vAk.kDsnNkYbBsI;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class U extends i.c implements T, I, A1.d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public o f15706n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public InterfaceC1815v0 f15707o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C1766n f15711s;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C1766n f15708p = S.f15705a;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final B0.d f15709q = new B0.d(new a[16], 0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final B0.d f15710r = new B0.d(new a[16], 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f15712t = r.f455b.a();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class a implements InterfaceC1755c, A1.d, G6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final G6.d f15713a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ U f15714b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public InterfaceC1795l f15715c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public EnumC1768p f15716d = EnumC1768p.Main;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final g f15717e = h.f2820a;

        /* JADX INFO: renamed from: b1.U$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0393a extends I6.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Object f15719a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f15720b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f15722d;

            public C0393a(G6.d dVar) {
                super(dVar);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                this.f15720b = obj;
                this.f15722d |= Integer.MIN_VALUE;
                return a.this.l0(0L, null, this);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class c extends I6.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f15726a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f15728c;

            public c(G6.d dVar) {
                super(dVar);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                this.f15726a = obj;
                this.f15728c |= Integer.MIN_VALUE;
                return a.this.x1(0L, null, this);
            }
        }

        public a(G6.d<Object> dVar) {
            this.f15713a = dVar;
            this.f15714b = U.this;
        }

        @Override // p011b1.InterfaceC1755c
        public C1766n E() {
            return U.this.f15708p;
        }

        @Override // A1.d
        public float E0(float f8) {
            return this.f15714b.E0(f8);
        }

        @Override // A1.l
        public long H(float f8) {
            return this.f15714b.H(f8);
        }

        @Override // A1.d
        public long I(long j8) {
            return this.f15714b.I(j8);
        }

        @Override // p011b1.InterfaceC1755c
        public long M0() {
            return U.this.M0();
        }

        @Override // A1.l
        public float T(long j8) {
            return this.f15714b.T(j8);
        }

        @Override // A1.d
        public int V0(float f8) {
            return this.f15714b.V0(f8);
        }

        @Override // p011b1.InterfaceC1755c
        public long a() {
            return U.this.f15712t;
        }

        @Override // p011b1.InterfaceC1755c
        public Object e1(EnumC1768p enumC1768p, G6.d dVar) {
            C1797m c1797m = new C1797m(H6.b.c(dVar), 1);
            c1797m.z();
            this.f15716d = enumC1768p;
            this.f15715c = c1797m;
            Object objS = c1797m.s();
            if (objS == H6.c.f()) {
                I6.h.c(dVar);
            }
            return objS;
        }

        @Override // G6.d
        public g getContext() {
            return this.f15717e;
        }

        @Override // A1.d
        public float getDensity() {
            return this.f15714b.getDensity();
        }

        @Override // p011b1.InterfaceC1755c
        public R0 getViewConfiguration() {
            return U.this.getViewConfiguration();
        }

        @Override // A1.d
        public long i0(float f8) {
            return this.f15714b.i0(f8);
        }

        @Override // A1.d
        public long i1(long j8) {
            return this.f15714b.i1(j8);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0, types: [long] */
        /* JADX WARN: Type inference failed for: r11v1, types: [b7.v0] */
        /* JADX WARN: Type inference failed for: r11v3, types: [b7.v0] */
        /* JADX WARN: Type inference failed for: r11v7 */
        /* JADX WARN: Type inference failed for: r11v8 */
        /* JADX WARN: Type inference failed for: r13v0, types: [Q6.o] */
        @Override // p011b1.InterfaceC1755c
        public Object l0(long j8, o oVar, G6.d dVar) {
            C0393a c0393a;
            InterfaceC1795l interfaceC1795l;
            if (dVar instanceof C0393a) {
                c0393a = (C0393a) dVar;
                int i8 = c0393a.f15722d;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    c0393a.f15722d = i8 - Integer.MIN_VALUE;
                } else {
                    c0393a = new C0393a(dVar);
                }
            } else {
                c0393a = new C0393a(dVar);
            }
            Object objInvoke = c0393a.f15720b;
            Object objF = H6.c.f();
            int i9 = c0393a.f15722d;
            try {
                if (i9 == 0) {
                    C6.r.b(objInvoke);
                    if (j8 <= 0 && (interfaceC1795l = this.f15715c) != null) {
                        q.a aVar = q.f1441b;
                        interfaceC1795l.resumeWith(q.b(C6.r.a(new C1769q(j8))));
                    }
                    InterfaceC1815v0 interfaceC1815v0D = AbstractC1789i.d(U.this.D1(), null, null, new b(j8, this, null), 3, null);
                    c0393a.f15719a = interfaceC1815v0D;
                    c0393a.f15722d = 1;
                    objInvoke = oVar.invoke(this, c0393a);
                    j8 = interfaceC1815v0D;
                    if (objInvoke == objF) {
                        return objF;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    InterfaceC1815v0 interfaceC1815v0 = (InterfaceC1815v0) c0393a.f15719a;
                    C6.r.b(objInvoke);
                    j8 = interfaceC1815v0;
                }
                j8.z(C1756d.f15735a);
                return objInvoke;
            } catch (Throwable th) {
                j8.z(C1756d.f15735a);
                throw th;
            }
        }

        @Override // A1.d
        public float l1(long j8) {
            return this.f15714b.l1(j8);
        }

        public final void m(Throwable th) {
            InterfaceC1795l interfaceC1795l = this.f15715c;
            if (interfaceC1795l != null) {
                interfaceC1795l.f(th);
            }
            this.f15715c = null;
        }

        public final void n(C1766n c1766n, EnumC1768p enumC1768p) {
            InterfaceC1795l interfaceC1795l;
            if (enumC1768p != this.f15716d || (interfaceC1795l = this.f15715c) == null) {
                return;
            }
            this.f15715c = null;
            interfaceC1795l.resumeWith(q.b(c1766n));
        }

        @Override // A1.d
        public float n0(int i8) {
            return this.f15714b.n0(i8);
        }

        @Override // A1.d
        public float p0(float f8) {
            return this.f15714b.p0(f8);
        }

        @Override // G6.d
        public void resumeWith(Object obj) {
            B0.d dVar = U.this.f15709q;
            U u8 = U.this;
            synchronized (dVar) {
                u8.f15709q.z(this);
                G g8 = G.f1419a;
            }
            this.f15713a.resumeWith(obj);
        }

        @Override // A1.l
        public float x0() {
            return this.f15714b.x0();
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends l implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f15723a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f15724b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a f15725c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(long j8, a aVar, G6.d dVar) {
                super(2, dVar);
                this.f15724b = j8;
                this.f15725c = aVar;
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                return new b(this.f15724b, this.f15725c, dVar);
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(J j8, G6.d dVar) {
                return ((b) create(j8, dVar)).invokeSuspend(G.f1419a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
            
                if (p017b7.U.a(1, r8) == r0) goto L15;
             */
            @Override // I6.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object objF = H6.c.f();
                int i8 = this.f15723a;
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 == 2) {
                            C6.r.b(obj);
                        } else {
                            throw new IllegalStateException(XRlnZWSrAFn.YJp);
                        }
                    } else {
                        C6.r.b(obj);
                    }
                    InterfaceC1795l interfaceC1795l = this.f15725c.f15715c;
                    if (interfaceC1795l != null) {
                        q.a aVar = q.f1441b;
                        interfaceC1795l.resumeWith(q.b(C6.r.a(new C1769q(this.f15724b))));
                    }
                    return G.f1419a;
                }
                C6.r.b(obj);
                long j8 = this.f15724b - 1;
                this.f15723a = 1;
                if (p017b7.U.a(j8, this) != objF) {
                }
                return objF;
                this.f15723a = 2;
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // p011b1.InterfaceC1755c
        public Object x1(long j8, o oVar, G6.d dVar) {
            c cVar;
            if (dVar instanceof c) {
                cVar = (c) dVar;
                int i8 = cVar.f15728c;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    cVar.f15728c = i8 - Integer.MIN_VALUE;
                } else {
                    cVar = new c(dVar);
                }
            } else {
                cVar = new c(dVar);
            }
            Object obj = cVar.f15726a;
            Object objF = H6.c.f();
            int i9 = cVar.f15728c;
            try {
                if (i9 != 0) {
                    if (i9 != 1) {
                        throw new IllegalStateException(kDsnNkYbBsI.bnYWdsoqcaTxkEe);
                    }
                    C6.r.b(obj);
                    return obj;
                }
                C6.r.b(obj);
                cVar.f15728c = 1;
                Object objL0 = l0(j8, oVar, cVar);
                return objL0 == objF ? objF : objL0;
            } catch (C1769q unused) {
                return null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15729a;

        static {
            int[] iArr = new int[EnumC1768p.values().length];
            try {
                iArr[EnumC1768p.Initial.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1768p.Final.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC1768p.Main.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f15729a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a f15730a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a aVar) {
            super(1);
            this.f15730a = aVar;
        }

        public final void b(Throwable th) {
            this.f15730a.m(th);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f15731a;

        public d(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return U.this.new d(dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((d) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f15731a;
            if (i8 == 0) {
                C6.r.b(obj);
                o oVarH2 = U.this.h2();
                U u8 = U.this;
                this.f15731a = 1;
                if (oVarH2.invoke(u8, this) == objF) {
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

    public U(o oVar) {
        this.f15706n = oVar;
    }

    public long M0() {
        long jI1 = i1(getViewConfiguration().d());
        long jA = a();
        return m.a(Math.max(0.0f, Q0.l.i(jI1) - r.g(jA)) / 2.0f, Math.max(0.0f, Q0.l.g(jI1) - r.f(jA)) / 2.0f);
    }

    @Override // L0.i.c
    public void O1() {
        t1();
        super.O1();
    }

    @Override // p011b1.I
    public long a() {
        return this.f15712t;
    }

    @Override // p011b1.I
    public Object a1(o oVar, G6.d dVar) {
        C1797m c1797m = new C1797m(H6.b.c(dVar), 1);
        c1797m.z();
        a aVar = new a(c1797m);
        synchronized (this.f15709q) {
            this.f15709q.d(aVar);
            G6.d dVarA = f.a(oVar, aVar, aVar);
            q.a aVar2 = q.f1441b;
            dVarA.resumeWith(q.b(G.f1419a));
        }
        c1797m.J(new c(aVar));
        Object objS = c1797m.s();
        if (objS == H6.c.f()) {
            I6.h.c(dVar);
        }
        return objS;
    }

    @Override // p056g1.m0
    public void f0() {
        C1766n c1766n = this.f15711s;
        if (c1766n == null) {
            return;
        }
        List listC = c1766n.c();
        int size = listC.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (((z) listC.get(i8)).j()) {
                List listC2 = c1766n.c();
                ArrayList arrayList = new ArrayList(listC2.size());
                int size2 = listC2.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    z zVar = (z) listC2.get(i9);
                    arrayList.add(new z(zVar.g(), zVar.p(), zVar.i(), false, zVar.k(), zVar.p(), zVar.i(), zVar.j(), zVar.j(), 0, 0L, 1536, (AbstractC2633k) null));
                }
                C1766n c1766n2 = new C1766n(arrayList);
                this.f15708p = c1766n2;
                g2(c1766n2, EnumC1768p.Initial);
                g2(c1766n2, EnumC1768p.Main);
                g2(c1766n2, EnumC1768p.Final);
                this.f15711s = null;
                return;
            }
        }
    }

    @Override // p056g1.m0
    public void g1() {
        t1();
    }

    public final void g2(C1766n c1766n, EnumC1768p enumC1768p) {
        B0.d dVar;
        int iS;
        synchronized (this.f15709q) {
            B0.d dVar2 = this.f15710r;
            dVar2.e(dVar2.s(), this.f15709q);
        }
        try {
            int i8 = b.f15729a[enumC1768p.ordinal()];
            if (i8 == 1 || i8 == 2) {
                B0.d dVar3 = this.f15710r;
                int iS2 = dVar3.s();
                if (iS2 > 0) {
                    Object[] objArrR = dVar3.r();
                    int i9 = 0;
                    do {
                        ((a) objArrR[i9]).n(c1766n, enumC1768p);
                        i9++;
                    } while (i9 < iS2);
                }
            } else if (i8 == 3 && (iS = (dVar = this.f15710r).s()) > 0) {
                int i10 = iS - 1;
                Object[] objArrR2 = dVar.r();
                do {
                    ((a) objArrR2[i10]).n(c1766n, enumC1768p);
                    i10--;
                } while (i10 >= 0);
            }
        } finally {
            this.f15710r.m();
        }
    }

    @Override // A1.d
    public float getDensity() {
        return AbstractC2347k.k(this).I().getDensity();
    }

    @Override // p011b1.I
    public R0 getViewConfiguration() {
        return AbstractC2347k.k(this).q0();
    }

    public o h2() {
        return this.f15706n;
    }

    public void i2(o oVar) {
        t1();
        this.f15706n = oVar;
    }

    @Override // p011b1.T
    public void t1() {
        InterfaceC1815v0 interfaceC1815v0 = this.f15707o;
        if (interfaceC1815v0 != null) {
            interfaceC1815v0.z(new H());
            this.f15707o = null;
        }
    }

    @Override // p056g1.m0
    public void v0() {
        t1();
    }

    @Override // A1.l
    public float x0() {
        return AbstractC2347k.k(this).I().x0();
    }

    @Override // p056g1.m0
    public void y0(C1766n c1766n, EnumC1768p enumC1768p, long j8) {
        this.f15712t = j8;
        if (enumC1768p == EnumC1768p.Initial) {
            this.f15708p = c1766n;
        }
        if (this.f15707o == null) {
            this.f15707o = AbstractC1789i.d(D1(), null, L.UNDISPATCHED, new d(null), 1, null);
        }
        g2(c1766n, enumC1768p);
        List listC = c1766n.c();
        int size = listC.size();
        boolean z8 = false;
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                z8 = true;
                break;
            } else if (!AbstractC1767o.d((z) listC.get(i8))) {
                break;
            } else {
                i8++;
            }
        }
        if (z8) {
            c1766n = null;
        }
        this.f15711s = c1766n;
    }
}
