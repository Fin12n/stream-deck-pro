package p191w0;

import A1.h;
import C6.G;
import C6.r;
import I6.l;
import L0.i;
import O0.f;
import Q6.k;
import Q6.o;
import Q6.p;
import R0.C1598l0;
import R0.N0;
import R0.T0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p011b1.I;
import p011b1.S;
import p038e1.AbstractC2252x;
import p038e1.H;
import p046f0.AbstractC2278f;
import p046f0.C2280h;
import p056g1.InterfaceC2343g;
import p065h1.X;
import p073i0.m;
import p082j0.AbstractC2601e;
import p110m1.n;
import p110m1.x;
import p215z0.AbstractC3157i;
import p215z0.AbstractC3169o;
import p215z0.AbstractC3182v;
import p215z0.B0;
import p215z0.C0;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3184w;
import p215z0.R0;
import p215z0.v1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class F0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B0 f35245a = AbstractC3182v.d(null, a.f35246a, 1, null);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f35246a = new a();

        public a() {
            super(0);
        }

        public final float b() {
            return h.m(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            return h.d(b());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f35247a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ T0 f35248b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f35249c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f35250d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ C2280h f35251e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ float f35252f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ o f35253g;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f35254a = new a();

            public a() {
                super(1);
            }

            public final void b(x xVar) {
                p110m1.u.L(xVar, true);
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((x) obj);
                return G.f1419a;
            }
        }

        /* JADX INFO: renamed from: w0.F0$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0794b extends l implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f35255a;

            public C0794b(G6.d dVar) {
                super(2, dVar);
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                return new C0794b(dVar);
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(I i8, G6.d dVar) {
                return ((C0794b) create(i8, dVar)).invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                H6.c.f();
                if (this.f35255a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i iVar, T0 t8, long j8, float f8, C2280h c2280h, float f9, o oVar) {
            super(2);
            this.f35247a = iVar;
            this.f35248b = t8;
            this.f35249c = j8;
            this.f35250d = f8;
            this.f35251e = c2280h;
            this.f35252f = f9;
            this.f35253g = oVar;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 3) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-70914509, i8, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:115)");
            }
            i iVarC = S.c(n.c(F0.g(this.f35247a, this.f35248b, F0.h(this.f35249c, this.f35250d, interfaceC3163l, 0), this.f35251e, ((A1.d) interfaceC3163l.e(X.d())).E0(this.f35252f)), false, a.f35254a), G.f1419a, new C0794b(null));
            o oVar = this.f35253g;
            interfaceC3163l.f(733328855);
            H hG = AbstractC2601e.g(L0.c.f4806a.m(), true, interfaceC3163l, 48);
            interfaceC3163l.f(-1323940314);
            int iA = AbstractC3157i.a(interfaceC3163l, 0);
            InterfaceC3184w interfaceC3184wE = interfaceC3163l.E();
            InterfaceC2343g.a aVar = InterfaceC2343g.f23596Q;
            Function0 function0A = aVar.a();
            p pVarB = AbstractC2252x.b(iVarC);
            if (interfaceC3163l.t() == null) {
                AbstractC3157i.c();
            }
            interfaceC3163l.r();
            if (interfaceC3163l.m()) {
                interfaceC3163l.w(function0A);
            } else {
                interfaceC3163l.G();
            }
            InterfaceC3163l interfaceC3163lA = v1.a(interfaceC3163l);
            v1.b(interfaceC3163lA, hG, aVar.c());
            v1.b(interfaceC3163lA, interfaceC3184wE, aVar.e());
            o oVarB = aVar.b();
            if (interfaceC3163lA.m() || !t.c(interfaceC3163lA.g(), Integer.valueOf(iA))) {
                interfaceC3163lA.H(Integer.valueOf(iA));
                interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
            }
            pVarB.invoke(R0.a(R0.b(interfaceC3163l)), interfaceC3163l, 0);
            interfaceC3163l.f(2058660585);
            androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f14485a;
            oVar.invoke(interfaceC3163l, 0);
            interfaceC3163l.N();
            interfaceC3163l.O();
            interfaceC3163l.N();
            interfaceC3163l.N();
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

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f35256a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ T0 f35257b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f35258c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f35259d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ C2280h f35260e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ m f35261f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f35262g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Function0 f35263h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ float f35264i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ o f35265j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(i iVar, T0 t8, long j8, float f8, C2280h c2280h, m mVar, boolean z8, Function0 function0, float f9, o oVar) {
            super(2);
            this.f35256a = iVar;
            this.f35257b = t8;
            this.f35258c = j8;
            this.f35259d = f8;
            this.f35260e = c2280h;
            this.f35261f = mVar;
            this.f35262g = z8;
            this.f35263h = function0;
            this.f35264i = f9;
            this.f35265j = oVar;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 3) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1279702876, i8, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:221)");
            }
            i iVarC = androidx.compose.foundation.d.c(F0.g(Q.c(this.f35256a), this.f35257b, F0.h(this.f35258c, this.f35259d, interfaceC3163l, 0), this.f35260e, ((A1.d) interfaceC3163l.e(X.d())).E0(this.f35264i)), this.f35261f, p183v0.n.e(false, 0.0f, 0L, interfaceC3163l, 0, 7), this.f35262g, null, null, this.f35263h, 24, null);
            o oVar = this.f35265j;
            interfaceC3163l.f(733328855);
            H hG = AbstractC2601e.g(L0.c.f4806a.m(), true, interfaceC3163l, 48);
            interfaceC3163l.f(-1323940314);
            int iA = AbstractC3157i.a(interfaceC3163l, 0);
            InterfaceC3184w interfaceC3184wE = interfaceC3163l.E();
            InterfaceC2343g.a aVar = InterfaceC2343g.f23596Q;
            Function0 function0A = aVar.a();
            p pVarB = AbstractC2252x.b(iVarC);
            if (interfaceC3163l.t() == null) {
                AbstractC3157i.c();
            }
            interfaceC3163l.r();
            if (interfaceC3163l.m()) {
                interfaceC3163l.w(function0A);
            } else {
                interfaceC3163l.G();
            }
            InterfaceC3163l interfaceC3163lA = v1.a(interfaceC3163l);
            v1.b(interfaceC3163lA, hG, aVar.c());
            v1.b(interfaceC3163lA, interfaceC3184wE, aVar.e());
            o oVarB = aVar.b();
            if (interfaceC3163lA.m() || !t.c(interfaceC3163lA.g(), Integer.valueOf(iA))) {
                interfaceC3163lA.H(Integer.valueOf(iA));
                interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
            }
            pVarB.invoke(R0.a(R0.b(interfaceC3163l)), interfaceC3163l, 0);
            interfaceC3163l.f(2058660585);
            androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f14485a;
            oVar.invoke(interfaceC3163l, 0);
            interfaceC3163l.N();
            interfaceC3163l.O();
            interfaceC3163l.N();
            interfaceC3163l.N();
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

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f35266a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ T0 f35267b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f35268c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f35269d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ C2280h f35270e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f35271f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ m f35272g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ boolean f35273h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function0 f35274i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ float f35275j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ o f35276k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(i iVar, T0 t8, long j8, float f8, C2280h c2280h, boolean z8, m mVar, boolean z9, Function0 function0, float f9, o oVar) {
            super(2);
            this.f35266a = iVar;
            this.f35267b = t8;
            this.f35268c = j8;
            this.f35269d = f8;
            this.f35270e = c2280h;
            this.f35271f = z8;
            this.f35272g = mVar;
            this.f35273h = z9;
            this.f35274i = function0;
            this.f35275j = f9;
            this.f35276k = oVar;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 3) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1164547968, i8, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:331)");
            }
            i iVarB = p127o0.a.b(F0.g(Q.c(this.f35266a), this.f35267b, F0.h(this.f35268c, this.f35269d, interfaceC3163l, 0), this.f35270e, ((A1.d) interfaceC3163l.e(X.d())).E0(this.f35275j)), this.f35271f, this.f35272g, p183v0.n.e(false, 0.0f, 0L, interfaceC3163l, 0, 7), this.f35273h, null, this.f35274i, 16, null);
            o oVar = this.f35276k;
            interfaceC3163l.f(733328855);
            H hG = AbstractC2601e.g(L0.c.f4806a.m(), true, interfaceC3163l, 48);
            interfaceC3163l.f(-1323940314);
            int iA = AbstractC3157i.a(interfaceC3163l, 0);
            InterfaceC3184w interfaceC3184wE = interfaceC3163l.E();
            InterfaceC2343g.a aVar = InterfaceC2343g.f23596Q;
            Function0 function0A = aVar.a();
            p pVarB = AbstractC2252x.b(iVarB);
            if (interfaceC3163l.t() == null) {
                AbstractC3157i.c();
            }
            interfaceC3163l.r();
            if (interfaceC3163l.m()) {
                interfaceC3163l.w(function0A);
            } else {
                interfaceC3163l.G();
            }
            InterfaceC3163l interfaceC3163lA = v1.a(interfaceC3163l);
            v1.b(interfaceC3163lA, hG, aVar.c());
            v1.b(interfaceC3163lA, interfaceC3184wE, aVar.e());
            o oVarB = aVar.b();
            if (interfaceC3163lA.m() || !t.c(interfaceC3163lA.g(), Integer.valueOf(iA))) {
                interfaceC3163lA.H(Integer.valueOf(iA));
                interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
            }
            pVarB.invoke(R0.a(R0.b(interfaceC3163l)), interfaceC3163l, 0);
            interfaceC3163l.f(2058660585);
            androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f14485a;
            oVar.invoke(interfaceC3163l, 0);
            interfaceC3163l.N();
            interfaceC3163l.O();
            interfaceC3163l.N();
            interfaceC3163l.N();
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

    public static final void a(i iVar, T0 t8, long j8, long j9, float f8, float f9, C2280h c2280h, o oVar, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        interfaceC3163l.f(-513881741);
        if ((i9 & 1) != 0) {
            iVar = i.f4836a;
        }
        if ((i9 & 2) != 0) {
            t8 = N0.a();
        }
        if ((i9 & 4) != 0) {
            j8 = Z.f35786a.a(interfaceC3163l, 6).G();
        }
        if ((i9 & 8) != 0) {
            j9 = AbstractC3091w.c(j8, interfaceC3163l, (i8 >> 6) & 14);
        }
        if ((i9 & 16) != 0) {
            f8 = h.m(0);
        }
        if ((i9 & 32) != 0) {
            f9 = h.m(0);
        }
        if ((i9 & 64) != 0) {
            c2280h = null;
        }
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-513881741, i8, -1, "androidx.compose.material3.Surface (Surface.kt:109)");
        }
        B0 b8 = f35245a;
        float fM = h.m(((h) interfaceC3163l.e(b8)).w() + f8);
        AbstractC3182v.b(new C0[]{B.a().c(C1598l0.g(j9)), b8.c(h.d(fM))}, H0.c.b(interfaceC3163l, -70914509, true, new b(iVar, t8, j8, fM, c2280h, f9, oVar)), interfaceC3163l, 48);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
    }

    public static final void b(boolean z8, Function0 function0, i iVar, boolean z9, T0 t8, long j8, long j9, float f8, float f9, C2280h c2280h, m mVar, o oVar, InterfaceC3163l interfaceC3163l, int i8, int i9, int i10) {
        m mVar2;
        interfaceC3163l.f(540296512);
        i iVar2 = (i10 & 4) != 0 ? i.f4836a : iVar;
        boolean z10 = (i10 & 8) != 0 ? true : z9;
        T0 t0A = (i10 & 16) != 0 ? N0.a() : t8;
        long jG = (i10 & 32) != 0 ? Z.f35786a.a(interfaceC3163l, 6).G() : j8;
        long jC = (i10 & 64) != 0 ? AbstractC3091w.c(jG, interfaceC3163l, (i8 >> 15) & 14) : j9;
        float fM = (i10 & 128) != 0 ? h.m(0) : f8;
        float fM2 = (i10 & 256) != 0 ? h.m(0) : f9;
        C2280h c2280h2 = (i10 & 512) != 0 ? null : c2280h;
        if ((i10 & 1024) != 0) {
            interfaceC3163l.f(-746935250);
            Object objG = interfaceC3163l.g();
            if (objG == InterfaceC3163l.f38803a.a()) {
                objG = p073i0.l.a();
                interfaceC3163l.H(objG);
            }
            interfaceC3163l.N();
            mVar2 = (m) objG;
        } else {
            mVar2 = mVar;
        }
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(540296512, i8, i9, "androidx.compose.material3.Surface (Surface.kt:325)");
        }
        B0 b8 = f35245a;
        float fM3 = h.m(((h) interfaceC3163l.e(b8)).w() + fM);
        AbstractC3182v.b(new C0[]{B.a().c(C1598l0.g(jC)), b8.c(h.d(fM3))}, H0.c.b(interfaceC3163l, -1164547968, true, new d(iVar2, t0A, jG, fM3, c2280h2, z8, mVar2, z10, function0, fM2, oVar)), interfaceC3163l, 48);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
    }

    public static final void c(Function0 function0, i iVar, boolean z8, T0 t8, long j8, long j9, float f8, float f9, C2280h c2280h, m mVar, o oVar, InterfaceC3163l interfaceC3163l, int i8, int i9, int i10) {
        m mVar2;
        interfaceC3163l.f(-789752804);
        i iVar2 = (i10 & 2) != 0 ? i.f4836a : iVar;
        boolean z9 = (i10 & 4) != 0 ? true : z8;
        T0 t0A = (i10 & 8) != 0 ? N0.a() : t8;
        long jG = (i10 & 16) != 0 ? Z.f35786a.a(interfaceC3163l, 6).G() : j8;
        long jC = (i10 & 32) != 0 ? AbstractC3091w.c(jG, interfaceC3163l, (i8 >> 12) & 14) : j9;
        float fM = (i10 & 64) != 0 ? h.m(0) : f8;
        float fM2 = (i10 & 128) != 0 ? h.m(0) : f9;
        C2280h c2280h2 = (i10 & 256) != 0 ? null : c2280h;
        if ((i10 & 512) != 0) {
            interfaceC3163l.f(-746940902);
            Object objG = interfaceC3163l.g();
            if (objG == InterfaceC3163l.f38803a.a()) {
                objG = p073i0.l.a();
                interfaceC3163l.H(objG);
            }
            mVar2 = (m) objG;
            interfaceC3163l.N();
        } else {
            mVar2 = mVar;
        }
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-789752804, i8, i9, "androidx.compose.material3.Surface (Surface.kt:215)");
        }
        B0 b8 = f35245a;
        float fM3 = h.m(((h) interfaceC3163l.e(b8)).w() + fM);
        AbstractC3182v.b(new C0[]{B.a().c(C1598l0.g(jC)), b8.c(h.d(fM3))}, H0.c.b(interfaceC3163l, 1279702876, true, new c(iVar2, t0A, jG, fM3, c2280h2, mVar2, z9, function0, fM2, oVar)), interfaceC3163l, 48);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
    }

    public static final B0 f() {
        return f35245a;
    }

    public static final i g(i iVar, T0 t8, long j8, C2280h c2280h, float f8) {
        return f.a(androidx.compose.foundation.c.a(androidx.compose.ui.graphics.b.c(iVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f8, 0.0f, 0.0f, 0.0f, 0.0f, 0L, t8, false, null, 0L, 0L, 0, 124895, null).j(c2280h != null ? AbstractC2278f.e(i.f4836a, c2280h, t8) : i.f4836a), j8, t8), t8);
    }

    public static final long h(long j8, float f8, InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(-2079918090);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-2079918090, i8, -1, "androidx.compose.material3.surfaceColorAtElevation (Surface.kt:483)");
        }
        long jA = AbstractC3091w.a(Z.f35786a.a(interfaceC3163l, 6), j8, f8, interfaceC3163l, (i8 << 3) & 1008);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return jA;
    }
}
