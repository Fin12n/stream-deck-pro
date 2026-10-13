package androidx.compose.foundation;

import C6.r;
import L0.i;
import Q6.k;
import Q6.o;
import Q6.p;
import com.revenuecat.purchases.subscriberattributes.caching.tU.ajyWhveMDgQ;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import p017b7.AbstractC1789i;
import p017b7.AbstractC1823z0;
import p017b7.InterfaceC1815v0;
import p017b7.J;
import p017b7.K;
import p017b7.U;
import p046f0.AbstractC2285m;
import p046f0.E;
import p046f0.G;
import p055g0.D;
import p065h1.AbstractC2401l0;
import p065h1.C2403m0;
import p073i0.j;
import p073i0.l;
import p073i0.m;
import p073i0.q;
import p110m1.h;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f14346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f14347b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h f14348c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Function0 f14349d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z8, String str, h hVar, Function0 function0) {
            super(3);
            this.f14346a = z8;
            this.f14347b = str;
            this.f14348c = hVar;
            this.f14349d = function0;
        }

        public final i b(i iVar, InterfaceC3163l interfaceC3163l, int i8) {
            interfaceC3163l.f(-756081143);
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-756081143, i8, -1, "androidx.compose.foundation.clickable.<anonymous> (Clickable.kt:98)");
            }
            i.a aVar = i.f4836a;
            E e8 = (E) interfaceC3163l.e(G.a());
            interfaceC3163l.f(-492369756);
            Object objG = interfaceC3163l.g();
            if (objG == InterfaceC3163l.f38803a.a()) {
                objG = l.a();
                interfaceC3163l.H(objG);
            }
            interfaceC3163l.N();
            i iVarB = d.b(aVar, (m) objG, e8, this.f14346a, this.f14347b, this.f14348c, this.f14349d);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            interfaceC3163l.N();
            return iVarB;
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return b((i) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m f14350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ E f14351b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f14352c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f14353d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ h f14354e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Function0 f14355f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(m mVar, E e8, boolean z8, String str, h hVar, Function0 function0) {
            super(1);
            this.f14350a = mVar;
            this.f14351b = e8;
            this.f14352c = z8;
            this.f14353d = str;
            this.f14354e = hVar;
            this.f14355f = function0;
        }

        public final void b(C2403m0 c2403m0) {
            c2403m0.b("clickable");
            c2403m0.a().b("interactionSource", this.f14350a);
            c2403m0.a().b("indication", this.f14351b);
            c2403m0.a().b("enabled", Boolean.valueOf(this.f14352c));
            c2403m0.a().b("onClickLabel", this.f14353d);
            c2403m0.a().b("role", this.f14354e);
            c2403m0.a().b("onClick", this.f14355f);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((C2403m0) obj);
            return C6.G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f14356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f14357b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h f14358c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Function0 f14359d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z8, String str, h hVar, Function0 function0) {
            super(1);
            this.f14356a = z8;
            this.f14357b = str;
            this.f14358c = hVar;
            this.f14359d = function0;
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((C2403m0) obj);
            return C6.G.f1419a;
        }

        public final void b(C2403m0 c2403m0) {
            c2403m0.b("clickable");
            c2403m0.a().b("enabled", Boolean.valueOf(this.f14356a));
            c2403m0.a().b("onClickLabel", this.f14357b);
            c2403m0.a().b("role", this.f14358c);
            c2403m0.a().b(ajyWhveMDgQ.nJlrH, this.f14359d);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0356d extends I6.l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f14360a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14361b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f14362c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ D f14363d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ long f14364e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ m f14365f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.foundation.a.C0354a f14366g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Function0 f14367h;

        /* JADX INFO: renamed from: androidx.compose.foundation.d$d$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends I6.l implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Object f14368a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f14369b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Function0 f14370c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ long f14371d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ m f14372e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ androidx.compose.foundation.a.C0354a f14373f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Function0 function0, long j8, m mVar, androidx.compose.foundation.a.C0354a c0354a, G6.d dVar) {
                super(2, dVar);
                this.f14370c = function0;
                this.f14371d = j8;
                this.f14372e = mVar;
                this.f14373f = c0354a;
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                return new a(this.f14370c, this.f14371d, this.f14372e, this.f14373f, dVar);
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(J j8, G6.d dVar) {
                return ((a) create(j8, dVar)).invokeSuspend(C6.G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                p073i0.p pVar;
                Object objF = H6.c.f();
                int i8 = this.f14369b;
                if (i8 == 0) {
                    r.b(obj);
                    if (((Boolean) this.f14370c.invoke()).booleanValue()) {
                        long jA = AbstractC2285m.a();
                        this.f14369b = 1;
                        if (U.a(jA, this) != objF) {
                        }
                    }
                    return objF;
                }
                if (i8 == 1) {
                    r.b(obj);
                } else {
                    if (i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar = (p073i0.p) this.f14368a;
                    r.b(obj);
                }
                this.f14373f.e(pVar);
                return C6.G.f1419a;
                p073i0.p pVar2 = new p073i0.p(this.f14371d, null);
                m mVar = this.f14372e;
                this.f14368a = pVar2;
                this.f14369b = 2;
                if (mVar.b(pVar2, this) != objF) {
                    pVar = pVar2;
                    this.f14373f.e(pVar);
                    return C6.G.f1419a;
                }
                return objF;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0356d(D d8, long j8, m mVar, androidx.compose.foundation.a.C0354a c0354a, Function0 function0, G6.d dVar) {
            super(2, dVar);
            this.f14363d = d8;
            this.f14364e = j8;
            this.f14365f = mVar;
            this.f14366g = c0354a;
            this.f14367h = function0;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            C0356d c0356d = new C0356d(this.f14363d, this.f14364e, this.f14365f, this.f14366g, this.f14367h, dVar);
            c0356d.f14362c = obj;
            return c0356d;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((C0356d) create(j8, dVar)).invokeSuspend(C6.G.f1419a);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x008a  */
        /* JADX WARN: Code duplicated, block: B:29:0x00a3  */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00ae, code lost:
        
            if (r3.b(r2, r17) == r1) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00d0, code lost:
        
            if (r4.b(r5, r17) == r1) goto L41;
         */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC1815v0 interfaceC1815v0D;
            Object objS1;
            boolean z8;
            p073i0.p pVar;
            q qVar;
            m mVar;
            q qVar2;
            Object objF = H6.c.f();
            int i8 = this.f14361b;
            if (i8 == 0) {
                r.b(obj);
                interfaceC1815v0D = AbstractC1789i.d((J) this.f14362c, null, null, new a(this.f14367h, this.f14364e, this.f14365f, this.f14366g, null), 3, null);
                D d8 = this.f14363d;
                this.f14362c = interfaceC1815v0D;
                this.f14361b = 1;
                objS1 = d8.s1(this);
                if (objS1 != objF) {
                }
                return objF;
            }
            if (i8 == 1) {
                interfaceC1815v0D = (InterfaceC1815v0) this.f14362c;
                r.b(obj);
                objS1 = obj;
            } else if (i8 == 2) {
                z8 = this.f14360a;
                r.b(obj);
                if (z8) {
                    pVar = new p073i0.p(this.f14364e, null);
                    qVar = new q(pVar);
                    mVar = this.f14365f;
                    this.f14362c = qVar;
                    this.f14361b = 3;
                    if (mVar.b(pVar, this) != objF) {
                        qVar2 = qVar;
                        m mVar2 = this.f14365f;
                        this.f14362c = null;
                        this.f14361b = 4;
                    }
                    return objF;
                }
            } else if (i8 == 3) {
                qVar2 = (q) this.f14362c;
                r.b(obj);
                m mVar3 = this.f14365f;
                this.f14362c = null;
                this.f14361b = 4;
            } else {
                if (i8 != 4 && i8 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            this.f14366g.e(null);
            return C6.G.f1419a;
            boolean zBooleanValue = ((Boolean) objS1).booleanValue();
            if (!interfaceC1815v0D.b()) {
                p073i0.p pVarC = this.f14366g.c();
                if (pVarC != null) {
                    m mVar4 = this.f14365f;
                    j qVar3 = zBooleanValue ? new q(pVarC) : new p073i0.o(pVarC);
                    this.f14362c = null;
                    this.f14361b = 5;
                }
                this.f14366g.e(null);
                return C6.G.f1419a;
            }
            this.f14362c = null;
            this.f14360a = zBooleanValue;
            this.f14361b = 2;
            if (AbstractC1823z0.g(interfaceC1815v0D, this) != objF) {
                z8 = zBooleanValue;
                if (z8) {
                    pVar = new p073i0.p(this.f14364e, null);
                    qVar = new q(pVar);
                    mVar = this.f14365f;
                    this.f14362c = qVar;
                    this.f14361b = 3;
                    if (mVar.b(pVar, this) != objF) {
                        qVar2 = qVar;
                        m mVar5 = this.f14365f;
                        this.f14362c = null;
                        this.f14361b = 4;
                    }
                }
                this.f14366g.e(null);
                return C6.G.f1419a;
            }
            return objF;
        }
    }

    public static final i b(i iVar, m mVar, E e8, boolean z8, String str, h hVar, Function0 function0) {
        m mVar2;
        E e9;
        boolean z9;
        String str2;
        h hVar2;
        Function0 function1;
        k kVarA;
        if (AbstractC2401l0.c()) {
            mVar2 = mVar;
            e9 = e8;
            z9 = z8;
            str2 = str;
            hVar2 = hVar;
            function1 = function0;
            kVarA = new b(mVar2, e9, z9, str2, hVar2, function1);
        } else {
            mVar2 = mVar;
            e9 = e8;
            z9 = z8;
            str2 = str;
            hVar2 = hVar;
            function1 = function0;
            kVarA = AbstractC2401l0.a();
        }
        return AbstractC2401l0.b(iVar, kVarA, FocusableKt.c(g.a(G.b(i.f4836a, mVar2, e9), mVar2, z9), z9, mVar2).j(new ClickableElement(mVar2, z9, str2, hVar2, function1, null)));
    }

    public static /* synthetic */ i c(i iVar, m mVar, E e8, boolean z8, String str, h hVar, Function0 function0, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            z8 = true;
        }
        return b(iVar, mVar, e8, z8, (i8 & 8) != 0 ? null : str, (i8 & 16) != 0 ? null : hVar, function0);
    }

    public static final i d(i iVar, boolean z8, String str, h hVar, Function0 function0) {
        return L0.h.a(iVar, AbstractC2401l0.c() ? new c(z8, str, hVar, function0) : AbstractC2401l0.a(), new a(z8, str, hVar, function0));
    }

    public static /* synthetic */ i e(i iVar, boolean z8, String str, h hVar, Function0 function0, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = true;
        }
        if ((i8 & 2) != 0) {
            str = null;
        }
        if ((i8 & 4) != 0) {
            hVar = null;
        }
        return d(iVar, z8, str, hVar, function0);
    }

    public static final Object f(D d8, long j8, m mVar, androidx.compose.foundation.a.C0354a c0354a, Function0 function0, G6.d dVar) {
        Object objF = K.f(new C0356d(d8, j8, mVar, c0354a, function0, null), dVar);
        return objF == H6.c.f() ? objF : C6.G.f1419a;
    }
}
