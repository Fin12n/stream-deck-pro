package p109m0;

import C6.G;
import C6.r;
import G6.h;
import I6.l;
import Q6.k;
import Q6.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.AbstractC1789i;
import p017b7.J;
import p055g0.B;
import p110m1.i;
import p110m1.n;
import p110m1.x;
import p215z0.AbstractC3169o;
import p215z0.C3190z;
import p215z0.InterfaceC3163l;
import p215z0.K;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class F {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f29312a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f29313b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i f29314c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ o f29315d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ k f29316e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ p110m1.b f29317f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar, boolean z8, i iVar, o oVar, k kVar2, p110m1.b bVar) {
            super(1);
            this.f29312a = kVar;
            this.f29313b = z8;
            this.f29314c = iVar;
            this.f29315d = oVar;
            this.f29316e = kVar2;
            this.f29317f = bVar;
        }

        public final void b(x xVar) {
            p110m1.u.f0(xVar, true);
            p110m1.u.r(xVar, this.f29312a);
            if (this.f29313b) {
                p110m1.u.g0(xVar, this.f29314c);
            } else {
                p110m1.u.P(xVar, this.f29314c);
            }
            o oVar = this.f29315d;
            if (oVar != null) {
                p110m1.u.H(xVar, null, oVar, 1, null);
            }
            k kVar = this.f29316e;
            if (kVar != null) {
                p110m1.u.J(xVar, null, kVar, 1, null);
            }
            p110m1.u.K(xVar, this.f29317f);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((x) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ E f29318a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(E e8) {
            super(0);
            this.f29318a = e8;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(this.f29318a.b());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ E f29319a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(E e8) {
            super(0);
            this.f29319a = e8;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(this.f29319a.g());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function0 f29320a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0 function0) {
            super(1);
            this.f29320a = function0;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(Object obj) {
            q qVar = (q) this.f29320a.invoke();
            int iD = qVar.d();
            int i8 = 0;
            while (i8 < iD) {
                if (t.c(qVar.a(i8), obj)) {
                    return Integer.valueOf(i8);
                }
                i8++;
            }
            i8 = -1;
            return Integer.valueOf(i8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f29321a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ J f29322b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ E f29323c;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends l implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f29324a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ E f29325b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ float f29326c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(E e8, float f8, G6.d dVar) {
                super(2, dVar);
                this.f29325b = e8;
                this.f29326c = f8;
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                return new a(this.f29325b, this.f29326c, dVar);
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(J j8, G6.d dVar) {
                return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                Object objF = H6.c.f();
                int i8 = this.f29324a;
                if (i8 == 0) {
                    r.b(obj);
                    E e8 = this.f29325b;
                    float f8 = this.f29326c;
                    this.f29324a = 1;
                    if (e8.c(f8, this) == objF) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z8, J j8, E e8) {
            super(2);
            this.f29321a = z8;
            this.f29322b = j8;
            this.f29323c = e8;
        }

        public final Boolean b(float f8, float f9) {
            if (this.f29321a) {
                f8 = f9;
            }
            AbstractC1789i.d(this.f29322b, null, null, new a(this.f29323c, f8, null), 3, null);
            return Boolean.TRUE;
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b(((Number) obj).floatValue(), ((Number) obj2).floatValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function0 f29327a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ J f29328b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ E f29329c;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends l implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f29330a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ E f29331b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f29332c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(E e8, int i8, G6.d dVar) {
                super(2, dVar);
                this.f29331b = e8;
                this.f29332c = i8;
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                return new a(this.f29331b, this.f29332c, dVar);
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(J j8, G6.d dVar) {
                return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                Object objF = H6.c.f();
                int i8 = this.f29330a;
                if (i8 == 0) {
                    r.b(obj);
                    E e8 = this.f29331b;
                    int i9 = this.f29332c;
                    this.f29330a = 1;
                    if (e8.d(i9, this) == objF) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0 function0, J j8, E e8) {
            super(1);
            this.f29327a = function0;
            this.f29328b = j8;
            this.f29329c = e8;
        }

        public final Boolean b(int i8) {
            q qVar = (q) this.f29327a.invoke();
            if (i8 >= 0 && i8 < qVar.d()) {
                AbstractC1789i.d(this.f29328b, null, null, new a(this.f29329c, i8, null), 3, null);
                return Boolean.TRUE;
            }
            throw new IllegalArgumentException(("Can't scroll to index " + i8 + ", it is out of bounds [0, " + qVar.d() + ')').toString());
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((Number) obj).intValue());
        }
    }

    public static final L0.i a(L0.i iVar, Function0 function0, E e8, B b8, boolean z8, boolean z9, InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(1070136913);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(1070136913, i8, -1, "androidx.compose.foundation.lazy.layout.lazyLayoutSemantics (LazyLayoutSemantics.kt:46)");
        }
        interfaceC3163l.f(773894976);
        interfaceC3163l.f(-492369756);
        Object objG = interfaceC3163l.g();
        if (objG == InterfaceC3163l.f38803a.a()) {
            C3190z c3190z = new C3190z(K.i(h.f2820a, interfaceC3163l));
            interfaceC3163l.H(c3190z);
            objG = c3190z;
        }
        interfaceC3163l.N();
        J jA = ((C3190z) objG).a();
        interfaceC3163l.N();
        Object[] objArr = {function0, e8, b8, Boolean.valueOf(z8)};
        interfaceC3163l.f(-568225417);
        boolean zR = false;
        for (int i9 = 0; i9 < 4; i9++) {
            zR |= interfaceC3163l.R(objArr[i9]);
        }
        Object objG2 = interfaceC3163l.g();
        if (zR || objG2 == InterfaceC3163l.f38803a.a()) {
            boolean z10 = b8 == B.Vertical;
            objG2 = n.d(L0.i.f4836a, false, new a(new d(function0), z10, new i(new b(e8), new c(e8), z9), z8 ? new e(z10, jA, e8) : null, z8 ? new f(function0, jA, e8) : null, e8.f()), 1, null);
            interfaceC3163l.H(objG2);
        }
        interfaceC3163l.N();
        L0.i iVarJ = iVar.j((L0.i) objG2);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return iVarJ;
    }
}
