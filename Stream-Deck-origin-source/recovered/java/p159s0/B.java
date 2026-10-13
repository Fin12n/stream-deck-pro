package p159s0;

import C6.G;
import C6.r;
import I6.l;
import L0.h;
import L0.i;
import Q0.f;
import Q0.g;
import Q6.k;
import Q6.o;
import Q6.p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import p017b7.AbstractC1789i;
import p017b7.J;
import p037e0.C2205a;
import p037e0.C2218n;
import p037e0.a0;
import p037e0.j0;
import p037e0.l0;
import p044e7.InterfaceC2260f;
import p044e7.InterfaceC2261g;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;
import p215z0.K;
import p215z0.g1;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2218n f32630a = new C2218n(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j0 f32631b = l0.a(a.f32634a, b.f32635a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f32632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a0 f32633d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f32634a = new a();

        public a() {
            super(1);
        }

        public final C2218n b(long j8) {
            return g.c(j8) ? new C2218n(f.o(j8), f.p(j8)) : B.f32630a;
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((f) obj).x());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f32635a = new b();

        public b() {
            super(1);
        }

        public final long b(C2218n c2218n) {
            return g.a(c2218n.f(), c2218n.g());
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return f.d(b((C2218n) obj));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function0 f32636a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f32637b;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ q1 f32638a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(q1 q1Var) {
                super(0);
                this.f32638a = q1Var;
            }

            public final long b() {
                return c.d(this.f32638a);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                return f.d(b());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function0 function0, k kVar) {
            super(3);
            this.f32636a = function0;
            this.f32637b = kVar;
        }

        public static final long d(q1 q1Var) {
            return ((f) q1Var.getValue()).x();
        }

        public final i c(i iVar, InterfaceC3163l interfaceC3163l, int i8) {
            interfaceC3163l.f(759876635);
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(759876635, i8, -1, "androidx.compose.foundation.text.selection.animatedSelectionMagnifier.<anonymous> (SelectionMagnifier.kt:65)");
            }
            q1 q1VarH = B.h(this.f32636a, interfaceC3163l, 0);
            k kVar = this.f32637b;
            interfaceC3163l.f(1714568984);
            boolean zR = interfaceC3163l.R(q1VarH);
            Object objG = interfaceC3163l.g();
            if (zR || objG == InterfaceC3163l.f38803a.a()) {
                objG = new a(q1VarH);
                interfaceC3163l.H(objG);
            }
            interfaceC3163l.N();
            i iVar2 = (i) kVar.invoke((Function0) objG);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            interfaceC3163l.N();
            return iVar2;
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return c((i) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f32639a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f32640b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ q1 f32641c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ C2205a f32642d;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ q1 f32643a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(q1 q1Var) {
                super(0);
                this.f32643a = q1Var;
            }

            public final long b() {
                return B.i(this.f32643a);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                return f.d(b());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b implements InterfaceC2261g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C2205a f32644a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ J f32645b;

            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class a extends l implements o {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f32646a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C2205a f32647b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ long f32648c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(C2205a c2205a, long j8, G6.d dVar) {
                    super(2, dVar);
                    this.f32647b = c2205a;
                    this.f32648c = j8;
                }

                @Override // I6.a
                public final G6.d create(Object obj, G6.d dVar) {
                    return new a(this.f32647b, this.f32648c, dVar);
                }

                @Override // Q6.o
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public final Object invoke(J j8, G6.d dVar) {
                    return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    Object objF = H6.c.f();
                    int i8 = this.f32646a;
                    if (i8 == 0) {
                        r.b(obj);
                        C2205a c2205a = this.f32647b;
                        f fVarD = f.d(this.f32648c);
                        a0 a0VarE = B.e();
                        this.f32646a = 1;
                        if (C2205a.f(c2205a, fVarD, a0VarE, null, null, this, 12, null) == objF) {
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

            public b(C2205a c2205a, J j8) {
                this.f32644a = c2205a;
                this.f32645b = j8;
            }

            public final Object a(long j8, G6.d dVar) {
                if (g.c(((f) this.f32644a.m()).x()) && g.c(j8) && f.p(((f) this.f32644a.m()).x()) != f.p(j8)) {
                    AbstractC1789i.d(this.f32645b, null, null, new a(this.f32644a, j8, null), 3, null);
                    return G.f1419a;
                }
                Object objT = this.f32644a.t(f.d(j8), dVar);
                return objT == H6.c.f() ? objT : G.f1419a;
            }

            @Override // p044e7.InterfaceC2261g
            public /* bridge */ /* synthetic */ Object emit(Object obj, G6.d dVar) {
                return a(((f) obj).x(), dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(q1 q1Var, C2205a c2205a, G6.d dVar) {
            super(2, dVar);
            this.f32641c = q1Var;
            this.f32642d = c2205a;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            d dVar2 = new d(this.f32641c, this.f32642d, dVar);
            dVar2.f32640b = obj;
            return dVar2;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((d) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f32639a;
            if (i8 == 0) {
                r.b(obj);
                J j8 = (J) this.f32640b;
                InterfaceC2260f interfaceC2260fQ = g1.q(new a(this.f32641c));
                b bVar = new b(this.f32642d, j8);
                this.f32639a = 1;
                if (interfaceC2260fQ.collect(bVar, this) == objF) {
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

    static {
        long jA = g.a(0.01f, 0.01f);
        f32632c = jA;
        f32633d = new a0(0.0f, 0.0f, f.d(jA), 3, null);
    }

    public static final i d(i iVar, Function0 function0, k kVar) {
        return h.b(iVar, null, new c(function0, kVar), 1, null);
    }

    public static final a0 e() {
        return f32633d;
    }

    public static final long f() {
        return f32632c;
    }

    public static final j0 g() {
        return f32631b;
    }

    public static final q1 h(Function0 function0, InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(-1589795249);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-1589795249, i8, -1, "androidx.compose.foundation.text.selection.rememberAnimatedMagnifierPosition (SelectionMagnifier.kt:76)");
        }
        interfaceC3163l.f(-492369756);
        Object objG = interfaceC3163l.g();
        InterfaceC3163l.a aVar = InterfaceC3163l.f38803a;
        if (objG == aVar.a()) {
            objG = g1.d(function0);
            interfaceC3163l.H(objG);
        }
        interfaceC3163l.N();
        q1 q1Var = (q1) objG;
        interfaceC3163l.f(-492369756);
        Object objG2 = interfaceC3163l.g();
        if (objG2 == aVar.a()) {
            C2205a c2205a = new C2205a(f.d(i(q1Var)), g(), f.d(f()), null, 8, null);
            interfaceC3163l.H(c2205a);
            objG2 = c2205a;
        }
        interfaceC3163l.N();
        C2205a c2205a2 = (C2205a) objG2;
        K.d(G.f1419a, new d(q1Var, c2205a2, null), interfaceC3163l, 70);
        q1 q1VarG = c2205a2.g();
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return q1VarG;
    }

    public static final long i(q1 q1Var) {
        return ((f) q1Var.getValue()).x();
    }
}
