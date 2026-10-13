package K5;

import C6.G;
import C6.r;
import D6.T;
import I6.l;
import Q6.o;
import java.net.Proxy;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.C2639q;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.AbstractC1785g;
import p017b7.C1802o0;
import p017b7.InterfaceC1812u;
import p017b7.InterfaceC1815v0;
import p017b7.InterfaceC1818x;
import p017b7.J;
import p017b7.L;
import p115m6.AbstractC2698h;
import u7.B;
import u7.C;
import u7.F;
import u7.p;
import u7.x;
import u7.z;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends J5.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f4651j = new c(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C6.j f4652k = C6.k.b(b.f4660a);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final K5.c f4653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set f4654f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final G6.g f4655g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final G6.g f4656h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map f4657i;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f4658a;

        public a(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return d.this.new a(dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f4658a;
            try {
                if (i8 == 0) {
                    r.b(obj);
                    G6.g.b bVarA = d.this.f4655g.A(InterfaceC1815v0.f15985O);
                    t.d(bVarA);
                    this.f4658a = 1;
                    if (((InterfaceC1815v0) bVarA).i0(this) == objF) {
                        return objF;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                }
                Iterator it = d.this.f4657i.entrySet().iterator();
                while (it.hasNext()) {
                    x xVar = (x) ((Map.Entry) it.next()).getValue();
                    xVar.m().a();
                    xVar.q().b().shutdown();
                }
                return G.f1419a;
            } catch (Throwable th) {
                Iterator it2 = d.this.f4657i.entrySet().iterator();
                while (it2.hasNext()) {
                    x xVar2 = (x) ((Map.Entry) it2.next()).getValue();
                    xVar2.m().a();
                    xVar2.q().b().shutdown();
                }
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f4660a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final x invoke() {
            return new x.a().a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c {
        public /* synthetic */ c(AbstractC2633k abstractC2633k) {
            this();
        }

        public final x a() {
            return (x) d.f4652k.getValue();
        }

        public c() {
        }
    }

    /* JADX INFO: renamed from: K5.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class C0172d extends C2639q implements Q6.k {
        public C0172d(Object obj) {
            super(1, obj, d.class, "createOkHttpClient", "createOkHttpClient(Lio/ktor/client/plugins/HttpTimeout$HttpTimeoutCapabilityConfiguration;)Lokhttp3/OkHttpClient;", 0);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public final x invoke(M5.u.a aVar) {
            return ((d) this.receiver).j0(aVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f4661a = new e();

        public e() {
            super(1);
        }

        public final void b(x it) {
            t.g(it, "it");
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((x) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f4662a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f4663b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f4664c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f4666e;

        public f(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f4664c = obj;
            this.f4666e |= Integer.MIN_VALUE;
            return d.this.A1(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f4667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f4668b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f4669c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f4670d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f4671e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f4673g;

        public g(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f4671e = obj;
            this.f4673g |= Integer.MIN_VALUE;
            return d.this.r0(null, null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C f4674a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(C c8) {
            super(1);
            this.f4674a = c8;
        }

        public final void b(Throwable th) {
            C c8 = this.f4674a;
            if (c8 != null) {
                c8.close();
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class i extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f4675a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f4676b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f4677c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f4678d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f4679e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f4681g;

        public i(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f4679e = obj;
            this.f4681g |= Integer.MIN_VALUE;
            return d.this.A0(null, null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(K5.c config) {
        super("ktor-okhttp");
        t.g(config, "config");
        this.f4653e = config;
        this.f4654f = T.g(M5.u.f5752d, R5.d.f9508a);
        this.f4657i = AbstractC2698h.a(new C0172d(this), e.f4661a, q().d());
        G6.g.b bVarA = super.getCoroutineContext().A(InterfaceC1815v0.f15985O);
        t.d(bVarA);
        G6.g gVarA = p115m6.o.a((InterfaceC1815v0) bVarA);
        this.f4655g = gVarA;
        this.f4656h = super.getCoroutineContext().P1(gVarA);
        AbstractC1785g.c(C1802o0.f15975a, super.getCoroutineContext(), L.ATOMIC, new a(null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object A0(x xVar, z zVar, G6.g gVar, G6.d dVar) {
        i iVar;
        d dVar2;
        p141p6.c cVar;
        K5.f fVar;
        if (dVar instanceof i) {
            iVar = (i) dVar;
            int i8 = iVar.f4681g;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                iVar.f4681g = i8 - Integer.MIN_VALUE;
            } else {
                iVar = new i(dVar);
            }
        } else {
            iVar = new i(dVar);
        }
        Object obj = iVar.f4679e;
        Object objF = H6.c.f();
        int i9 = iVar.f4681g;
        if (i9 == 0) {
            r.b(obj);
            p141p6.c cVarC = p141p6.a.c(null, 1, null);
            F.a aVarG = q().g();
            if (aVarG == null) {
                aVarG = xVar;
            }
            K5.f fVar2 = new K5.f(xVar, aVarG, zVar, gVar);
            fVar2.l();
            InterfaceC1812u interfaceC1812uK = fVar2.k();
            iVar.f4675a = this;
            iVar.f4676b = gVar;
            iVar.f4677c = cVarC;
            iVar.f4678d = fVar2;
            iVar.f4681g = 1;
            Object objQ0 = interfaceC1812uK.Q0(iVar);
            if (objQ0 == objF) {
                return objF;
            }
            dVar2 = this;
            cVar = cVarC;
            obj = objQ0;
            fVar = fVar2;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar = (K5.f) iVar.f4678d;
            cVar = (p141p6.c) iVar.f4677c;
            gVar = (G6.g) iVar.f4676b;
            dVar2 = (d) iVar.f4675a;
            r.b(obj);
        }
        return dVar2.i0((B) obj, cVar, fVar, gVar);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // J5.b
    public Object A1(T5.e eVar, G6.d dVar) {
        f fVar;
        d dVar2;
        if (dVar instanceof f) {
            fVar = (f) dVar;
            int i8 = fVar.f4666e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                fVar.f4666e = i8 - Integer.MIN_VALUE;
            } else {
                fVar = new f(dVar);
            }
        } else {
            fVar = new f(dVar);
        }
        f fVar2 = fVar;
        Object objB = fVar2.f4664c;
        Object objF = H6.c.f();
        int i9 = fVar2.f4666e;
        if (i9 == 0) {
            r.b(objB);
            fVar2.f4662a = this;
            fVar2.f4663b = eVar;
            fVar2.f4666e = 1;
            objB = J5.o.b(fVar2);
            if (objB != objF) {
                dVar2 = this;
            }
            return objF;
        }
        if (i9 != 1) {
            if (i9 == 2) {
                r.b(objB);
                return objB;
            }
            if (i9 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(objB);
            return objB;
        }
        eVar = (T5.e) fVar2.f4663b;
        dVar2 = (d) fVar2.f4662a;
        r.b(objB);
        T5.e eVar2 = eVar;
        G6.g gVar = (G6.g) objB;
        z zVarF = K5.e.f(eVar2, gVar);
        x xVar = (x) dVar2.f4657i.get(eVar2.c(M5.u.f5752d));
        if (xVar == null) {
            throw new IllegalStateException("OkHttpClient can't be constructed because HttpTimeout plugin is not installed");
        }
        if (T5.f.b(eVar2)) {
            fVar2.f4662a = null;
            fVar2.f4663b = null;
            fVar2.f4666e = 2;
            Object objA0 = dVar2.A0(xVar, zVarF, gVar, fVar2);
            if (objA0 != objF) {
                return objA0;
            }
        } else {
            fVar2.f4662a = null;
            fVar2.f4663b = null;
            fVar2.f4666e = 3;
            Object objR0 = dVar2.r0(xVar, zVarF, gVar, eVar2, fVar2);
            if (objR0 != objF) {
                return objR0;
            }
        }
        return objF;
    }

    @Override // J5.b
    /* JADX INFO: renamed from: H0, reason: merged with bridge method [inline-methods] */
    public K5.c q() {
        return this.f4653e;
    }

    @Override // J5.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        G6.g.b bVarA = this.f4655g.A(InterfaceC1815v0.f15985O);
        t.e(bVarA, "null cannot be cast to non-null type kotlinx.coroutines.CompletableJob");
        ((InterfaceC1818x) bVarA).i1();
    }

    @Override // J5.c, p017b7.J
    public G6.g getCoroutineContext() {
        return this.f4656h;
    }

    @Override // J5.c, J5.b
    public Set h0() {
        return this.f4654f;
    }

    public final T5.h i0(B b8, p141p6.c cVar, Object obj, G6.g gVar) {
        return new T5.h(new X5.x(b8.t(), b8.i0()), cVar, K5.h.c(b8.Y()), K5.h.d(b8.A0()), obj, gVar);
    }

    public final x j0(M5.u.a aVar) {
        x xVarF = q().f();
        if (xVarF == null) {
            xVarF = f4651j.a();
        }
        x.a aVarD = xVarF.D();
        aVarD.c(new p());
        q().e().invoke(aVarD);
        Proxy proxyB = q().b();
        if (proxyB != null) {
            aVarD.L(proxyB);
        }
        if (aVar != null) {
            K5.e.h(aVarD, aVar);
        }
        return aVarD.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object r0(x xVar, z zVar, G6.g gVar, T5.e eVar, G6.d dVar) {
        g gVar2;
        p141p6.c cVar;
        d dVar2;
        io.ktor.utils.io.g gVarA;
        J7.g gVarC;
        if (dVar instanceof g) {
            gVar2 = (g) dVar;
            int i8 = gVar2.f4673g;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                gVar2.f4673g = i8 - Integer.MIN_VALUE;
            } else {
                gVar2 = new g(dVar);
            }
        } else {
            gVar2 = new g(dVar);
        }
        Object obj = gVar2.f4671e;
        Object objF = H6.c.f();
        int i9 = gVar2.f4673g;
        if (i9 == 0) {
            r.b(obj);
            p141p6.c cVarC = p141p6.a.c(null, 1, null);
            gVar2.f4667a = this;
            gVar2.f4668b = gVar;
            gVar2.f4669c = eVar;
            gVar2.f4670d = cVarC;
            gVar2.f4673g = 1;
            Object objB = K5.h.b(xVar, zVar, eVar, gVar2);
            if (objB == objF) {
                return objF;
            }
            obj = objB;
            cVar = cVarC;
            dVar2 = this;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar = (p141p6.c) gVar2.f4670d;
            eVar = (T5.e) gVar2.f4669c;
            gVar = (G6.g) gVar2.f4668b;
            dVar2 = (d) gVar2.f4667a;
            r.b(obj);
        }
        B b8 = (B) obj;
        C cB = b8.b();
        G6.g.b bVarA = gVar.A(InterfaceC1815v0.f15985O);
        t.d(bVarA);
        ((InterfaceC1815v0) bVarA).H0(new h(cB));
        if (cB == null || (gVarC = cB.c()) == null || (gVarA = K5.e.i(gVarC, gVar, eVar)) == null) {
            gVarA = io.ktor.utils.io.g.f25425a.a();
        }
        return dVar2.i0(b8, cVar, gVarA, gVar);
    }
}
