package p038e1;

import A1.t;
import C6.G;
import D6.r;
import D6.w;
import D6.z;
import E4.JFpq.XRlnZWSrAFn;
import J0.AbstractC1028k;
import Q6.k;
import Q6.o;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.u;
import p056g1.F;
import p056g1.J;
import p056g1.K;
import p056g1.P;
import p065h1.e1;
import p201x2.vAk.kDsnNkYbBsI;
import p215z0.AbstractC3169o;
import p215z0.AbstractC3173q;
import p215z0.InterfaceC3159j;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3164l0;
import p215z0.N0;
import p215z0.l1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class A implements InterfaceC3159j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f20364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AbstractC3173q f20365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k0 f20366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20368e;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f20377n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f20378o;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f20369f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f20370g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f20371h = new c();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f20372i = new b();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HashMap f20373j = new HashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final k0.a f20374k = new k0.a(null, 1, null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map f20375l = new LinkedHashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final B0.d f20376m = new B0.d(new Object[16], 0);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f20379p = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class b implements j0, J {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f20386a;

        public b() {
            this.f20386a = A.this.f20371h;
        }

        @Override // p038e1.InterfaceC2244o
        public boolean B0() {
            return this.f20386a.B0();
        }

        @Override // A1.d
        public float E0(float f8) {
            return this.f20386a.E0(f8);
        }

        @Override // A1.l
        public long H(float f8) {
            return this.f20386a.H(f8);
        }

        @Override // A1.d
        public long I(long j8) {
            return this.f20386a.I(j8);
        }

        @Override // p038e1.j0
        public List M(Object obj, o oVar) {
            F f8 = (F) A.this.f20370g.get(obj);
            List listE = f8 != null ? f8.E() : null;
            return listE != null ? listE : A.this.F(obj, oVar);
        }

        @Override // A1.l
        public float T(long j8) {
            return this.f20386a.T(j8);
        }

        @Override // A1.d
        public int V0(float f8) {
            return this.f20386a.V0(f8);
        }

        @Override // p038e1.J
        public I b1(int i8, int i9, Map map, k kVar) {
            return this.f20386a.b1(i8, i9, map, kVar);
        }

        @Override // A1.d
        public float getDensity() {
            return this.f20386a.getDensity();
        }

        @Override // p038e1.InterfaceC2244o
        public t getLayoutDirection() {
            return this.f20386a.getLayoutDirection();
        }

        @Override // A1.d
        public long i0(float f8) {
            return this.f20386a.i0(f8);
        }

        @Override // A1.d
        public long i1(long j8) {
            return this.f20386a.i1(j8);
        }

        @Override // A1.d
        public float l1(long j8) {
            return this.f20386a.l1(j8);
        }

        @Override // A1.d
        public float n0(int i8) {
            return this.f20386a.n0(i8);
        }

        @Override // A1.d
        public float p0(float f8) {
            return this.f20386a.p0(f8);
        }

        @Override // A1.l
        public float x0() {
            return this.f20386a.x0();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class c implements j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public t f20388a = t.Rtl;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f20389b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f20390c;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements I {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f20392a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f20393b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Map f20394c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ c f20395d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ A f20396e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ k f20397f;

            public a(int i8, int i9, Map map, c cVar, A a8, k kVar) {
                this.f20392a = i8;
                this.f20393b = i9;
                this.f20394c = map;
                this.f20395d = cVar;
                this.f20396e = a8;
                this.f20397f = kVar;
            }

            @Override // p038e1.I
            public Map c() {
                return this.f20394c;
            }

            @Override // p038e1.I
            public void d() {
                P pE2;
                if (!this.f20395d.B0() || (pE2 = this.f20396e.f20364a.O().e2()) == null) {
                    this.f20397f.invoke(this.f20396e.f20364a.O().d1());
                } else {
                    this.f20397f.invoke(pE2.d1());
                }
            }

            @Override // p038e1.I
            public int f() {
                return this.f20393b;
            }

            @Override // p038e1.I
            public int g() {
                return this.f20392a;
            }
        }

        public c() {
        }

        @Override // p038e1.InterfaceC2244o
        public boolean B0() {
            return A.this.f20364a.V() == F.e.LookaheadLayingOut || A.this.f20364a.V() == F.e.LookaheadMeasuring;
        }

        @Override // p038e1.j0
        public List M(Object obj, o oVar) {
            return A.this.K(obj, oVar);
        }

        @Override // p038e1.J
        public I b1(int i8, int i9, Map map, k kVar) {
            if ((i8 & (-16777216)) == 0 && ((-16777216) & i9) == 0) {
                return new a(i8, i9, map, this, A.this, kVar);
            }
            throw new IllegalStateException(("Size(" + i8 + " x " + i9 + ") is out of range. Each dimension must be between 0 and 16777215.").toString());
        }

        public void c(float f8) {
            this.f20389b = f8;
        }

        public void e(float f8) {
            this.f20390c = f8;
        }

        public void f(t tVar) {
            this.f20388a = tVar;
        }

        @Override // A1.d
        public float getDensity() {
            return this.f20389b;
        }

        @Override // p038e1.InterfaceC2244o
        public t getLayoutDirection() {
            return this.f20388a;
        }

        @Override // A1.l
        public float x0() {
            return this.f20390c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends F.f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o f20399c;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements I {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ I f20400a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ A f20401b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f20402c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ I f20403d;

            public a(I i8, A a8, int i9, I i10) {
                this.f20401b = a8;
                this.f20402c = i9;
                this.f20403d = i10;
                this.f20400a = i8;
            }

            @Override // p038e1.I
            public Map c() {
                return this.f20400a.c();
            }

            @Override // p038e1.I
            public void d() {
                this.f20401b.f20368e = this.f20402c;
                this.f20403d.d();
                this.f20401b.y();
            }

            @Override // p038e1.I
            public int f() {
                return this.f20400a.f();
            }

            @Override // p038e1.I
            public int g() {
                return this.f20400a.g();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b implements I {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ I f20404a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ A f20405b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f20406c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ I f20407d;

            public b(I i8, A a8, int i9, I i10) {
                this.f20405b = a8;
                this.f20406c = i9;
                this.f20407d = i10;
                this.f20404a = i8;
            }

            @Override // p038e1.I
            public Map c() {
                return this.f20404a.c();
            }

            @Override // p038e1.I
            public void d() {
                this.f20405b.f20367d = this.f20406c;
                this.f20407d.d();
                A a8 = this.f20405b;
                a8.x(a8.f20367d);
            }

            @Override // p038e1.I
            public int f() {
                return this.f20404a.f();
            }

            @Override // p038e1.I
            public int g() {
                return this.f20404a.g();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(o oVar, String str) {
            super(str);
            this.f20399c = oVar;
        }

        @Override // p038e1.H
        public I d(J j8, List list, long j9) {
            A.this.f20371h.f(j8.getLayoutDirection());
            A.this.f20371h.c(j8.getDensity());
            A.this.f20371h.e(j8.x0());
            if (j8.B0() || A.this.f20364a.Z() == null) {
                A.this.f20367d = 0;
                I i8 = (I) this.f20399c.invoke(A.this.f20371h, A1.b.b(j9));
                return new b(i8, A.this, A.this.f20367d, i8);
            }
            A.this.f20368e = 0;
            I i9 = (I) this.f20399c.invoke(A.this.f20372i, A1.b.b(j9));
            return new a(i9, A.this, A.this.f20368e, i9);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements k {
        public e() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Map.Entry entry) {
            boolean z8;
            Object key = entry.getKey();
            i0.a aVar = (i0.a) entry.getValue();
            int iT = A.this.f20376m.t(key);
            if (iT < 0 || iT >= A.this.f20368e) {
                aVar.d();
                z8 = true;
            } else {
                z8 = false;
            }
            return Boolean.valueOf(z8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g implements i0.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f20410b;

        public g(Object obj) {
            this.f20410b = obj;
        }

        @Override // e1.i0.a
        public int a() {
            List listF;
            F f8 = (F) A.this.f20373j.get(this.f20410b);
            if (f8 == null || (listF = f8.F()) == null) {
                return 0;
            }
            return listF.size();
        }

        @Override // e1.i0.a
        public void b(int i8, long j8) {
            F f8 = (F) A.this.f20373j.get(this.f20410b);
            if (f8 == null || !f8.I0()) {
                return;
            }
            int size = f8.F().size();
            if (i8 < 0 || i8 >= size) {
                throw new IndexOutOfBoundsException("Index (" + i8 + ") is out of bound of [0, " + size + ')');
            }
            if (f8.f()) {
                throw new IllegalArgumentException("Pre-measure called on node that is not placed");
            }
            F f9 = A.this.f20364a;
            f9.f23343n = true;
            J.b(f8).h((F) f8.F().get(i8), j8);
            f9.f23343n = false;
        }

        @Override // e1.i0.a
        public void d() {
            A.this.B();
            F f8 = (F) A.this.f20373j.remove(this.f20410b);
            if (f8 != null) {
                if (A.this.f20378o <= 0) {
                    throw new IllegalStateException("No pre-composed items to dispose");
                }
                int iIndexOf = A.this.f20364a.K().indexOf(f8);
                if (iIndexOf < A.this.f20364a.K().size() - A.this.f20378o) {
                    throw new IllegalStateException(XRlnZWSrAFn.rlKMcmqpia);
                }
                A.this.f20377n++;
                A.this.f20378o--;
                int size = (A.this.f20364a.K().size() - A.this.f20378o) - A.this.f20377n;
                A.this.D(iIndexOf, size, 1);
                A.this.x(size);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a f20411a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o f20412b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(a aVar, o oVar) {
            super(2);
            this.f20411a = aVar;
            this.f20412b = oVar;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1750409193, i8, -1, "androidx.compose.ui.layout.LayoutNodeSubcompositionsState.subcompose.<anonymous>.<anonymous>.<anonymous> (SubcomposeLayout.kt:477)");
            }
            boolean zA = this.f20411a.a();
            o oVar = this.f20412b;
            interfaceC3163l.u(207, Boolean.valueOf(zA));
            boolean zC = interfaceC3163l.c(zA);
            if (zA) {
                oVar.invoke(interfaceC3163l, 0);
            } else {
                interfaceC3163l.n(zC);
            }
            interfaceC3163l.d();
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public A(F f8, k0 k0Var) {
        this.f20364a = f8;
        this.f20366c = k0Var;
    }

    public static /* synthetic */ void E(A a8, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 1;
        }
        a8.D(i8, i9, i10);
    }

    public final Object A(int i8) {
        Object obj = this.f20369f.get((F) this.f20364a.K().get(i8));
        kotlin.jvm.internal.t.d(obj);
        return ((a) obj).f();
    }

    public final void B() {
        int size = this.f20364a.K().size();
        if (this.f20369f.size() != size) {
            throw new IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + this.f20369f.size() + ") and the children count on the SubcomposeLayout (" + size + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
        }
        if ((size - this.f20377n) - this.f20378o >= 0) {
            if (this.f20373j.size() == this.f20378o) {
                return;
            }
            throw new IllegalArgumentException(("Incorrect state. Precomposed children " + this.f20378o + ". Map size " + this.f20373j.size()).toString());
        }
        throw new IllegalArgumentException(("Incorrect state. Total children " + size + ". Reusable children " + this.f20377n + ". Precomposed children " + this.f20378o).toString());
    }

    public final void C(boolean z8) {
        this.f20378o = 0;
        this.f20373j.clear();
        int size = this.f20364a.K().size();
        if (this.f20377n != size) {
            this.f20377n = size;
            AbstractC1028k abstractC1028kC = AbstractC1028k.f3974e.c();
            try {
                AbstractC1028k abstractC1028kL = abstractC1028kC.l();
                for (int i8 = 0; i8 < size; i8++) {
                    try {
                        F f8 = (F) this.f20364a.K().get(i8);
                        a aVar = (a) this.f20369f.get(f8);
                        if (aVar != null && aVar.a()) {
                            H(f8);
                            if (z8) {
                                N0 n0B = aVar.b();
                                if (n0B != null) {
                                    n0B.deactivate();
                                }
                                aVar.h(l1.e(Boolean.FALSE, null, 2, null));
                            } else {
                                aVar.g(false);
                            }
                            aVar.m(h0.f20482a);
                        }
                    } catch (Throwable th) {
                        abstractC1028kC.s(abstractC1028kL);
                        throw th;
                    }
                }
                G g8 = G.f1419a;
                abstractC1028kC.s(abstractC1028kL);
                abstractC1028kC.d();
                this.f20370g.clear();
            } catch (Throwable th2) {
                abstractC1028kC.d();
                throw th2;
            }
        }
        B();
    }

    public final void D(int i8, int i9, int i10) {
        F f8 = this.f20364a;
        f8.f23343n = true;
        this.f20364a.U0(i8, i9, i10);
        f8.f23343n = false;
    }

    public final List F(Object obj, o oVar) {
        if (this.f20376m.s() < this.f20368e) {
            throw new IllegalArgumentException("Error: currentPostLookaheadIndex cannot be greater than the size of thepostLookaheadComposedSlotIds list.");
        }
        int iS = this.f20376m.s();
        int i8 = this.f20368e;
        if (iS == i8) {
            this.f20376m.d(obj);
        } else {
            this.f20376m.G(i8, obj);
        }
        this.f20368e++;
        if (!this.f20373j.containsKey(obj)) {
            this.f20375l.put(obj, G(obj, oVar));
            if (this.f20364a.V() == F.e.LayingOut) {
                this.f20364a.f1(true);
            } else {
                F.i1(this.f20364a, true, false, 2, null);
            }
        }
        F f8 = (F) this.f20373j.get(obj);
        if (f8 == null) {
            return r.n();
        }
        List listK1 = f8.b0().k1();
        int size = listK1.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((K.b) listK1.get(i9)).E1();
        }
        return listK1;
    }

    public final i0.a G(Object obj, o oVar) {
        if (!this.f20364a.I0()) {
            return new f();
        }
        B();
        if (!this.f20370g.containsKey(obj)) {
            this.f20375l.remove(obj);
            HashMap map = this.f20373j;
            Object objO = map.get(obj);
            if (objO == null) {
                objO = O(obj);
                if (objO != null) {
                    D(this.f20364a.K().indexOf(objO), this.f20364a.K().size(), 1);
                    this.f20378o++;
                } else {
                    objO = v(this.f20364a.K().size());
                    this.f20378o++;
                }
                map.put(obj, objO);
            }
            M((F) objO, obj, oVar);
        }
        return new g(obj);
    }

    public final void H(F f8) {
        K.b bVarB0 = f8.b0();
        F.g gVar = F.g.NotUsed;
        bVarB0.Q1(gVar);
        K.a aVarY = f8.Y();
        if (aVarY != null) {
            aVarY.K1(gVar);
        }
    }

    public final void I(AbstractC3173q abstractC3173q) {
        this.f20365b = abstractC3173q;
    }

    public final void J(k0 k0Var) {
        if (this.f20366c != k0Var) {
            this.f20366c = k0Var;
            C(false);
            F.m1(this.f20364a, false, false, 3, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007c  */
    public final List K(Object obj, o oVar) {
        A a8;
        B();
        F.e eVarV = this.f20364a.V();
        F.e eVar = F.e.Measuring;
        if (eVarV != eVar && eVarV != F.e.LayingOut && eVarV != F.e.LookaheadMeasuring && eVarV != F.e.LookaheadLayingOut) {
            throw new IllegalStateException("subcompose can only be used inside the measure or layout blocks");
        }
        HashMap map = this.f20370g;
        Object objO = map.get(obj);
        if (objO == null) {
            objO = (F) this.f20373j.remove(obj);
            if (objO != null) {
                int i8 = this.f20378o;
                if (i8 <= 0) {
                    throw new IllegalStateException("Check failed.");
                }
                this.f20378o = i8 - 1;
            } else {
                objO = O(obj);
                if (objO == null) {
                    objO = v(this.f20367d);
                }
            }
            map.put(obj, objO);
        }
        F f8 = (F) objO;
        if (z.l0(this.f20364a.K(), this.f20367d) == f8) {
            a8 = this;
        } else {
            int iIndexOf = this.f20364a.K().indexOf(f8);
            int i9 = this.f20367d;
            if (iIndexOf < i9) {
                throw new IllegalArgumentException(("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.").toString());
            }
            if (i9 != iIndexOf) {
                a8 = this;
                E(a8, iIndexOf, i9, 0, 4, null);
            } else {
                a8 = this;
            }
        }
        a8.f20367d++;
        M(f8, obj, oVar);
        return (eVarV == eVar || eVarV == F.e.LayingOut) ? f8.E() : f8.D();
    }

    public final void M(F f8, Object obj, o oVar) {
        HashMap map = this.f20369f;
        Object obj2 = map.get(f8);
        if (obj2 == null) {
            a aVar = new a(obj, C2234e.f20461a.a(), null, 4, null);
            map.put(f8, aVar);
            obj2 = aVar;
        }
        a aVar2 = (a) obj2;
        N0 n0B = aVar2.b();
        boolean zR = n0B != null ? n0B.r() : true;
        if (aVar2.c() != oVar || zR || aVar2.d()) {
            aVar2.j(oVar);
            L(f8, aVar2);
            aVar2.k(false);
        }
    }

    public final N0 N(N0 n8, F f8, boolean z8, AbstractC3173q abstractC3173q, o oVar) {
        if (n8 == null || n8.g()) {
            n8 = e1.a(f8, abstractC3173q);
        }
        if (z8) {
            n8.k(oVar);
            return n8;
        }
        n8.o(oVar);
        return n8;
    }

    public final F O(Object obj) {
        int i8;
        if (this.f20377n == 0) {
            return null;
        }
        int size = this.f20364a.K().size() - this.f20378o;
        int i9 = size - this.f20377n;
        int i10 = size - 1;
        int i11 = i10;
        while (true) {
            if (i11 < i9) {
                i8 = -1;
                break;
            }
            if (kotlin.jvm.internal.t.c(A(i11), obj)) {
                i8 = i11;
                break;
            }
            i11--;
        }
        if (i8 == -1) {
            while (true) {
                if (i10 < i9) {
                    i11 = i10;
                    break;
                }
                Object obj2 = this.f20369f.get((F) this.f20364a.K().get(i10));
                kotlin.jvm.internal.t.d(obj2);
                a aVar = (a) obj2;
                if (aVar.f() == h0.f20482a || this.f20366c.b(obj, aVar.f())) {
                    aVar.m(obj);
                    i11 = i10;
                    i8 = i11;
                    break;
                }
                i10--;
            }
        }
        if (i8 == -1) {
            return null;
        }
        if (i11 != i9) {
            D(i11, i9, 1);
        }
        this.f20377n--;
        F f8 = (F) this.f20364a.K().get(i9);
        Object obj3 = this.f20369f.get(f8);
        kotlin.jvm.internal.t.d(obj3);
        a aVar2 = (a) obj3;
        aVar2.h(l1.e(Boolean.TRUE, null, 2, null));
        aVar2.l(true);
        aVar2.k(true);
        return f8;
    }

    @Override // p215z0.InterfaceC3159j
    public void d() {
        w();
    }

    @Override // p215z0.InterfaceC3159j
    public void e() {
        C(true);
    }

    @Override // p215z0.InterfaceC3159j
    public void p() {
        C(false);
    }

    public final H u(o oVar) {
        return new d(oVar, this.f20379p);
    }

    public final F v(int i8) {
        F f8 = new F(true, 0, 2, null);
        F f9 = this.f20364a;
        f9.f23343n = true;
        this.f20364a.z0(i8, f8);
        f9.f23343n = false;
        return f8;
    }

    public final void w() {
        F f8 = this.f20364a;
        f8.f23343n = true;
        Iterator it = this.f20369f.values().iterator();
        while (it.hasNext()) {
            N0 n0B = ((a) it.next()).b();
            if (n0B != null) {
                n0B.d();
            }
        }
        this.f20364a.c1();
        f8.f23343n = false;
        this.f20369f.clear();
        this.f20370g.clear();
        this.f20378o = 0;
        this.f20377n = 0;
        this.f20373j.clear();
        B();
    }

    public final void x(int i8) {
        boolean z8 = false;
        this.f20377n = 0;
        int size = (this.f20364a.K().size() - this.f20378o) - 1;
        if (i8 <= size) {
            this.f20374k.clear();
            if (i8 <= size) {
                int i9 = i8;
                while (true) {
                    this.f20374k.add(A(i9));
                    if (i9 == size) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            this.f20366c.a(this.f20374k);
            AbstractC1028k abstractC1028kC = AbstractC1028k.f3974e.c();
            try {
                AbstractC1028k abstractC1028kL = abstractC1028kC.l();
                boolean z9 = false;
                while (size >= i8) {
                    try {
                        F f8 = (F) this.f20364a.K().get(size);
                        Object obj = this.f20369f.get(f8);
                        kotlin.jvm.internal.t.d(obj);
                        a aVar = (a) obj;
                        Object objF = aVar.f();
                        if (this.f20374k.contains(objF)) {
                            this.f20377n++;
                            if (aVar.a()) {
                                H(f8);
                                aVar.g(false);
                                z9 = true;
                            }
                        } else {
                            F f9 = this.f20364a;
                            f9.f23343n = true;
                            this.f20369f.remove(f8);
                            N0 n0B = aVar.b();
                            if (n0B != null) {
                                n0B.d();
                            }
                            this.f20364a.d1(size, 1);
                            f9.f23343n = false;
                        }
                        this.f20370g.remove(objF);
                        size--;
                    } catch (Throwable th) {
                        abstractC1028kC.s(abstractC1028kL);
                        throw th;
                    }
                }
                G g8 = G.f1419a;
                abstractC1028kC.s(abstractC1028kL);
                abstractC1028kC.d();
                z8 = z9;
            } catch (Throwable th2) {
                abstractC1028kC.d();
                throw th2;
            }
        }
        if (z8) {
            AbstractC1028k.f3974e.k();
        }
        B();
    }

    public final void y() {
        w.J(this.f20375l.entrySet(), new e());
    }

    public final void z() {
        if (this.f20377n != this.f20364a.K().size()) {
            Iterator it = this.f20369f.entrySet().iterator();
            while (it.hasNext()) {
                ((a) ((Map.Entry) it.next()).getValue()).k(true);
            }
            if (this.f20364a.c0()) {
                return;
            }
            F.m1(this.f20364a, false, false, 3, null);
        }
    }

    public final void L(F f8, a aVar) {
        AbstractC1028k abstractC1028kC = AbstractC1028k.f3974e.c();
        try {
            AbstractC1028k abstractC1028kL = abstractC1028kC.l();
            try {
                F f9 = this.f20364a;
                f9.f23343n = true;
                o oVarC = aVar.c();
                N0 n0B = aVar.b();
                AbstractC3173q abstractC3173q = this.f20365b;
                if (abstractC3173q == null) {
                    throw new IllegalStateException(kDsnNkYbBsI.sJuMRucmJBsTX);
                }
                aVar.i(N(n0B, f8, aVar.e(), abstractC3173q, H0.c.c(-1750409193, true, new h(aVar, oVarC))));
                aVar.l(false);
                f9.f23343n = false;
                G g8 = G.f1419a;
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

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f20380a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public o f20381b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public N0 f20382c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f20383d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f20384e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public InterfaceC3164l0 f20385f;

        public a(Object obj, o oVar, N0 n8) {
            this.f20380a = obj;
            this.f20381b = oVar;
            this.f20382c = n8;
            this.f20385f = l1.e(Boolean.TRUE, null, 2, null);
        }

        public final boolean a() {
            return ((Boolean) this.f20385f.getValue()).booleanValue();
        }

        public final N0 b() {
            return this.f20382c;
        }

        public final o c() {
            return this.f20381b;
        }

        public final boolean d() {
            return this.f20383d;
        }

        public final boolean e() {
            return this.f20384e;
        }

        public final Object f() {
            return this.f20380a;
        }

        public final void g(boolean z8) {
            this.f20385f.setValue(Boolean.valueOf(z8));
        }

        public final void h(InterfaceC3164l0 interfaceC3164l0) {
            this.f20385f = interfaceC3164l0;
        }

        public final void i(N0 n8) {
            this.f20382c = n8;
        }

        public final void j(o oVar) {
            this.f20381b = oVar;
        }

        public final void k(boolean z8) {
            this.f20383d = z8;
        }

        public final void l(boolean z8) {
            this.f20384e = z8;
        }

        public final void m(Object obj) {
            this.f20380a = obj;
        }

        public /* synthetic */ a(Object obj, o oVar, N0 n8, int i8, AbstractC2633k abstractC2633k) {
            this(obj, oVar, (i8 & 4) != 0 ? null : n8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f implements i0.a {
        @Override // e1.i0.a
        public void d() {
        }
    }
}
