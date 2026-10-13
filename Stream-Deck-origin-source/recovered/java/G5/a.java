package G5;

import C6.G;
import C6.r;
import D6.iIQ.BmWxZhjGfw;
import G6.g;
import I6.l;
import M5.C1072a;
import M5.m;
import M5.o;
import M5.q;
import Q6.k;
import Q6.p;
import T5.i;
import U5.f;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.AbstractC1823z0;
import p017b7.InterfaceC1815v0;
import p017b7.InterfaceC1818x;
import p017b7.J;
import p017b7.K;
import p115m6.AbstractC2694d;
import p115m6.C2691a;
import p115m6.InterfaceC2692b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements J, Closeable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2765n = AtomicIntegerFieldUpdater.newUpdater(a.class, "closed");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J5.b f2766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G5.b f2767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2768c;
    private volatile /* synthetic */ int closed;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1818x f2769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f2770e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final T5.g f2771f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f2772g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f2773h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final U5.b f2774i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final InterfaceC2692b f2775j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final J5.g f2776k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final W5.b f2777l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final G5.b f2778m;

    /* JADX INFO: renamed from: G5.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0120a extends u implements k {
        public C0120a() {
            super(1);
        }

        public final void b(Throwable th) {
            if (th != null) {
                K.e(a.this.v(), null, 1, null);
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f2781b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f2782c;

        public b(G6.d dVar) {
            super(3, dVar);
        }

        @Override // Q6.p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(p173t6.e eVar, Object obj, G6.d dVar) {
            b bVar = a.this.new b(dVar);
            bVar.f2781b = eVar;
            bVar.f2782c = obj;
            return bVar.invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
        
            if (r3.h(r1, r8) == r0) goto L18;
         */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            p173t6.e eVar;
            Object objF = H6.c.f();
            int i8 = this.f2780a;
            if (i8 != 0) {
                if (i8 == 1) {
                    obj2 = this.f2782c;
                    eVar = (p173t6.e) this.f2781b;
                    r.b(obj);
                } else {
                    if (i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                }
                return G.f1419a;
            }
            r.b(obj);
            p173t6.e eVar2 = (p173t6.e) this.f2781b;
            obj2 = this.f2782c;
            if (!(obj2 instanceof H5.b)) {
                throw new IllegalStateException(("Error: HttpClientCall expected, but found " + obj2 + '(' + kotlin.jvm.internal.K.b(obj2.getClass()) + ").").toString());
            }
            U5.b bVarZ = a.this.z();
            G g8 = G.f1419a;
            U5.c cVarG = ((H5.b) obj2).g();
            this.f2781b = eVar2;
            this.f2782c = obj2;
            this.f2780a = 1;
            Object objD = bVarZ.d(g8, cVarG, this);
            if (objD != objF) {
                eVar = eVar2;
                obj = objD;
            }
            return objF;
            ((H5.b) obj2).l((U5.c) obj);
            this.f2781b = null;
            this.f2782c = null;
            this.f2780a = 2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f2784a = new c();

        public c() {
            super(1);
        }

        public final void b(a install) {
            t.g(install, "$this$install");
            M5.e.b(install);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((a) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f2786b;

        public d(G6.d dVar) {
            super(3, dVar);
        }

        @Override // Q6.p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(p173t6.e eVar, U5.d dVar, G6.d dVar2) {
            d dVar3 = a.this.new d(dVar2);
            dVar3.f2786b = eVar;
            return dVar3.invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            p173t6.e eVar;
            Throwable th;
            Object objF = H6.c.f();
            int i8 = this.f2785a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                eVar = (p173t6.e) this.f2786b;
                try {
                    r.b(obj);
                    return G.f1419a;
                } catch (Throwable th2) {
                    th = th2;
                    a.this.y().a(V5.c.d(), new V5.g(((H5.b) eVar.d()).g(), th));
                    throw th;
                }
            }
            r.b(obj);
            p173t6.e eVar2 = (p173t6.e) this.f2786b;
            try {
                this.f2786b = eVar2;
                this.f2785a = 1;
                if (eVar2.g(this) == objF) {
                    return objF;
                }
                return G.f1419a;
            } catch (Throwable th3) {
                eVar = eVar2;
                th = th3;
                a.this.y().a(V5.c.d(), new V5.g(((H5.b) eVar.d()).g(), th));
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f2788a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2790c;

        public e(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f2788a = obj;
            this.f2790c |= Integer.MIN_VALUE;
            return a.this.j(null, this);
        }
    }

    public a(J5.b engine, G5.b userConfig) {
        t.g(engine, "engine");
        t.g(userConfig, "userConfig");
        this.f2766a = engine;
        this.f2767b = userConfig;
        this.closed = 0;
        InterfaceC1818x interfaceC1818xA = AbstractC1823z0.a((InterfaceC1815v0) engine.getCoroutineContext().A(InterfaceC1815v0.f15985O));
        this.f2769d = interfaceC1818xA;
        this.f2770e = engine.getCoroutineContext().P1(interfaceC1818xA);
        this.f2771f = new T5.g(userConfig.c());
        f fVar = new f(userConfig.c());
        this.f2772g = fVar;
        i iVar = new i(userConfig.c());
        this.f2773h = iVar;
        this.f2774i = new U5.b(userConfig.c());
        this.f2775j = AbstractC2694d.a(true);
        this.f2776k = engine.q();
        this.f2777l = new W5.b();
        G5.b bVar = new G5.b();
        this.f2778m = bVar;
        if (this.f2768c) {
            interfaceC1818xA.H0(new C0120a());
        }
        engine.f1(this);
        iVar.l(i.f9925h.b(), new b(null));
        G5.b.k(bVar, q.f5724a, null, 2, null);
        G5.b.k(bVar, C1072a.f5592a, null, 2, null);
        if (userConfig.g()) {
            bVar.j(BmWxZhjGfw.ryoyind, c.f2784a);
        }
        G5.b.k(bVar, M5.t.f5732c, null, 2, null);
        G5.b.k(bVar, M5.i.f5639d, null, 2, null);
        if (userConfig.f()) {
            G5.b.k(bVar, o.f5697c, null, 2, null);
        }
        bVar.l(userConfig);
        if (userConfig.g()) {
            G5.b.k(bVar, m.f5679d, null, 2, null);
        }
        M5.d.c(bVar);
        bVar.h(this);
        fVar.l(f.f10219h.b(), new d(null));
    }

    public final T5.g A() {
        return this.f2771f;
    }

    public final f Y() {
        return this.f2772g;
    }

    public final a b(k block) {
        t.g(block, "block");
        J5.b bVar = this.f2766a;
        G5.b bVar2 = new G5.b();
        bVar2.l(this.f2767b);
        block.invoke(bVar2);
        return new a(bVar, bVar2, this.f2768c);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (f2765n.compareAndSet(this, 0, 1)) {
            InterfaceC2692b interfaceC2692b = (InterfaceC2692b) this.f2775j.b(M5.l.a());
            for (C2691a c2691a : interfaceC2692b.f()) {
                t.e(c2691a, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
                Object objB = interfaceC2692b.b(c2691a);
                if (objB instanceof Closeable) {
                    ((Closeable) objB).close();
                }
            }
            this.f2769d.i1();
            if (this.f2768c) {
                this.f2766a.close();
            }
        }
    }

    public final InterfaceC2692b getAttributes() {
        return this.f2775j;
    }

    @Override // p017b7.J
    public g getCoroutineContext() {
        return this.f2770e;
    }

    public final i i0() {
        return this.f2773h;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(T5.d dVar, G6.d dVar2) {
        e eVar;
        if (dVar2 instanceof e) {
            eVar = (e) dVar2;
            int i8 = eVar.f2790c;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                eVar.f2790c = i8 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar2);
            }
        } else {
            eVar = new e(dVar2);
        }
        Object objD = eVar.f2788a;
        Object objF = H6.c.f();
        int i9 = eVar.f2790c;
        if (i9 == 0) {
            r.b(objD);
            this.f2777l.a(V5.c.a(), dVar);
            T5.g gVar = this.f2771f;
            Object objD2 = dVar.d();
            eVar.f2790c = 1;
            objD = gVar.d(dVar, objD2, eVar);
            if (objD == objF) {
                return objF;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(objD);
        }
        t.e(objD, "null cannot be cast to non-null type io.ktor.client.call.HttpClientCall");
        return (H5.b) objD;
    }

    public final G5.b t() {
        return this.f2778m;
    }

    public String toString() {
        return "HttpClient[" + this.f2766a + ']';
    }

    public final J5.b v() {
        return this.f2766a;
    }

    public final W5.b y() {
        return this.f2777l;
    }

    public final U5.b z() {
        return this.f2774i;
    }

    public /* synthetic */ a(J5.b bVar, G5.b bVar2, int i8, AbstractC2633k abstractC2633k) {
        this(bVar, (i8 & 2) != 0 ? new G5.b() : bVar2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(J5.b engine, G5.b userConfig, boolean z8) {
        this(engine, userConfig);
        t.g(engine, "engine");
        t.g(userConfig, "userConfig");
        this.f2768c = z8;
    }
}
