package p046f0;

import A1.d;
import A1.h;
import A1.r;
import A1.s;
import C6.G;
import I6.l;
import L0.i;
import Q0.f;
import Q0.g;
import Q6.k;
import Q6.o;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.AbstractC1789i;
import p017b7.J;
import p038e1.AbstractC2248t;
import p038e1.InterfaceC2247s;
import p056g1.AbstractC2345i;
import p056g1.InterfaceC2344h;
import p056g1.InterfaceC2353q;
import p056g1.InterfaceC2354s;
import p056g1.c0;
import p056g1.d0;
import p056g1.p0;
import p065h1.X;
import p110m1.x;
import p215z0.AbstractC3150e0;
import p215z0.InterfaceC3164l0;
import p215z0.l1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class I extends i.c implements InterfaceC2344h, InterfaceC2354s, InterfaceC2353q, p0, c0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final InterfaceC3164l0 f21279A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f21280B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public r f21281C;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public k f21282n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public k f21283o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public k f21284p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f21285q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f21286r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f21287s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f21288t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f21289u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f21290v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public V f21291w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public View f21292x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public d f21293y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public U f21294z;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {
        public a() {
            super(0);
        }

        public final long b() {
            return I.this.f21280B;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            return f.d(b());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m194invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m194invoke() {
            View view = I.this.f21292x;
            View view2 = (View) AbstractC2345i.a(I.this, AndroidCompositionLocals_androidKt.j());
            I.this.f21292x = view2;
            d dVar = I.this.f21293y;
            d dVar2 = (d) AbstractC2345i.a(I.this, X.d());
            I.this.f21293y = dVar2;
            if (I.this.f21294z == null || !t.c(view2, view) || !t.c(dVar2, dVar)) {
                I.this.m2();
            }
            I.this.p2();
        }
    }

    public /* synthetic */ I(k kVar, k kVar2, k kVar3, float f8, boolean z8, long j8, float f9, float f10, boolean z9, V v8, AbstractC2633k abstractC2633k) {
        this(kVar, kVar2, kVar3, f8, z8, j8, f9, f10, z9, v8);
    }

    @Override // L0.i.c
    public void N1() {
        O0();
    }

    @Override // p056g1.c0
    public void O0() {
        d0.a(this, new c());
    }

    @Override // L0.i.c
    public void O1() {
        U u8 = this.f21294z;
        if (u8 != null) {
            u8.dismiss();
        }
        this.f21294z = null;
    }

    @Override // p056g1.p0
    public void Q(x xVar) {
        xVar.c(J.a(), new a());
    }

    public final long l2() {
        return ((f) this.f21279A.getValue()).x();
    }

    @Override // p056g1.InterfaceC2354s
    public void m(InterfaceC2247s interfaceC2247s) {
        n2(AbstractC2248t.e(interfaceC2247s));
    }

    public final void m2() {
        d dVar;
        U u8 = this.f21294z;
        if (u8 != null) {
            u8.dismiss();
        }
        View view = this.f21292x;
        if (view == null || (dVar = this.f21293y) == null) {
            return;
        }
        this.f21294z = this.f21291w.b(view, this.f21286r, this.f21287s, this.f21288t, this.f21289u, this.f21290v, dVar, this.f21285q);
        q2();
    }

    public final void n2(long j8) {
        this.f21279A.setValue(f.d(j8));
    }

    public final void o2(k kVar, k kVar2, float f8, boolean z8, long j8, float f9, float f10, boolean z9, k kVar3, V v8) {
        float f11 = this.f21285q;
        long j9 = this.f21287s;
        float f12 = this.f21288t;
        float f13 = this.f21289u;
        boolean z10 = this.f21290v;
        V v9 = this.f21291w;
        this.f21282n = kVar;
        this.f21283o = kVar2;
        this.f21285q = f8;
        this.f21286r = z8;
        this.f21287s = j8;
        this.f21288t = f9;
        this.f21289u = f10;
        this.f21290v = z9;
        this.f21284p = kVar3;
        this.f21291w = v8;
        if (this.f21294z == null || ((f8 != f11 && !v8.a()) || !A1.k.f(j8, j9) || !h.t(f9, f12) || !h.t(f10, f13) || z9 != z10 || !t.c(v8, v9))) {
            m2();
        }
        p2();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006b  */
    public final void p2() {
        d dVar;
        long jB;
        U u8 = this.f21294z;
        if (u8 == null || (dVar = this.f21293y) == null) {
            return;
        }
        long jX = ((f) this.f21282n.invoke(dVar)).x();
        long jT = (g.c(l2()) && g.c(jX)) ? f.t(l2(), jX) : f.f9082b.b();
        this.f21280B = jT;
        if (!g.c(jT)) {
            u8.dismiss();
            return;
        }
        k kVar = this.f21283o;
        if (kVar != null) {
            f fVarD = f.d(((f) kVar.invoke(dVar)).x());
            if (!g.c(fVarD.x())) {
                fVarD = null;
            }
            if (fVarD != null) {
                jB = f.t(l2(), fVarD.x());
            } else {
                jB = f.f9082b.b();
            }
        } else {
            jB = f.f9082b.b();
        }
        u8.b(this.f21280B, jB, this.f21285q);
        q2();
    }

    @Override // p056g1.InterfaceC2353q
    public void q(T0.c cVar) {
        cVar.v1();
        AbstractC1789i.d(D1(), null, null, new b(null), 3, null);
    }

    public final void q2() {
        d dVar;
        U u8 = this.f21294z;
        if (u8 == null || (dVar = this.f21293y) == null || r.d(u8.a(), this.f21281C)) {
            return;
        }
        k kVar = this.f21284p;
        if (kVar != null) {
            kVar.invoke(A1.k.c(dVar.I(s.c(u8.a()))));
        }
        this.f21281C = r.b(u8.a());
    }

    public /* synthetic */ I(k kVar, k kVar2, k kVar3, float f8, boolean z8, long j8, float f9, float f10, boolean z9, V v8, int i8, AbstractC2633k abstractC2633k) {
        this(kVar, (i8 & 2) != 0 ? null : kVar2, (i8 & 4) != 0 ? null : kVar3, (i8 & 8) != 0 ? Float.NaN : f8, (i8 & 16) != 0 ? false : z8, (i8 & 32) != 0 ? A1.k.f441b.a() : j8, (i8 & 64) != 0 ? h.f432b.c() : f9, (i8 & 128) != 0 ? h.f432b.c() : f10, (i8 & 256) != 0 ? true : z9, (i8 & 512) != 0 ? V.f21341a.a() : v8, null);
    }

    public I(k kVar, k kVar2, k kVar3, float f8, boolean z8, long j8, float f9, float f10, boolean z9, V v8) {
        this.f21282n = kVar;
        this.f21283o = kVar2;
        this.f21284p = kVar3;
        this.f21285q = f8;
        this.f21286r = z8;
        this.f21287s = j8;
        this.f21288t = f9;
        this.f21289u = f10;
        this.f21290v = z9;
        this.f21291w = v8;
        f.a aVar = f.f9082b;
        this.f21279A = l1.e(f.d(aVar.b()), null, 2, null);
        this.f21280B = aVar.b();
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f21296a;

        public b(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return I.this.new b(dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((b) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f21296a;
            if (i8 == 0) {
                C6.r.b(obj);
                a aVar = a.f21298a;
                this.f21296a = 1;
                if (AbstractC3150e0.b(aVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
            }
            U u8 = I.this.f21294z;
            if (u8 != null) {
                u8.c();
            }
            return G.f1419a;
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f21298a = new a();

            public a() {
                super(1);
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b(((Number) obj).longValue());
                return G.f1419a;
            }

            public final void b(long j8) {
            }
        }
    }
}
