package io.ktor.client.engine.cio;

import C6.G;
import M5.v;
import X5.C1688q;
import X5.x;
import java.io.Closeable;
import java.net.Proxy;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.AbstractC1785g;
import p017b7.AbstractC1789i;
import p017b7.AbstractC1816w;
import p017b7.I;
import p017b7.InterfaceC1812u;
import p017b7.InterfaceC1815v0;
import p017b7.J;
import p017b7.U;
import p017b7.X0;
import p043e6.r;
import p052f6.y;
import p052f6.z;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class h implements J, Closeable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f24881l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f24882m = AtomicIntegerFieldUpdater.newUpdater(h.class, "connections");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Proxy f24885c;
    private volatile /* synthetic */ int connections;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f24886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final io.ktor.client.engine.cio.c f24887e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final io.ktor.client.engine.cio.d f24888f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final G6.g f24889g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Function0 f24890h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p035d7.g f24891i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f24892j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final InterfaceC1815v0 f24893k;
    volatile /* synthetic */ long lastActivity;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f24894a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f24895b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f24896c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f24897d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f24898e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f24899f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f24900g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f24901h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f24902i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f24903j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f24905l;

        public b(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f24903j = obj;
            this.f24905l |= Integer.MIN_VALUE;
            return h.this.r0(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f24906a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p043e6.j f24908c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f24909d;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ long f24910a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j8) {
                super(1);
                this.f24910a = j8;
            }

            public final void b(r.d connect) {
                t.g(connect, "$this$connect");
                connect.r(this.f24910a);
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((r.d) obj);
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(p043e6.j jVar, long j8, G6.d dVar) {
            super(2, dVar);
            this.f24908c = jVar;
            this.f24909d = j8;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return h.this.new c(this.f24908c, this.f24909d, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((c) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = H6.c.f();
            int i8 = this.f24906a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
                return obj;
            }
            C6.r.b(obj);
            io.ktor.client.engine.cio.d dVar = h.this.f24888f;
            p043e6.j jVar = this.f24908c;
            a aVar = new a(this.f24909d);
            this.f24906a = 1;
            Object objB = dVar.b(jVar, aVar, this);
            return objB == objF ? objF : objB;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements Q6.k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p043e6.j f24912b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(p043e6.j jVar) {
            super(1);
            this.f24912b = jVar;
        }

        public final void b(y tls) {
            t.g(tls, "$this$tls");
            z.c(tls, h.this.f24887e.d());
            String strE = tls.e();
            if (strE == null) {
                strE = this.f24912b.c();
            }
            tls.i(strE);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((y) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f24913a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f24914b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f24916d;

        public e(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f24914b = obj;
            this.f24916d |= Integer.MIN_VALUE;
            return h.this.A0(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends u implements Q6.k {
        public f() {
            super(1);
        }

        public final void b(Throwable th) {
            h.this.i1();
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f24918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f24919b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f24920c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f24922e;

        public g(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f24920c = obj;
            this.f24922e |= Integer.MIN_VALUE;
            return h.this.H0(null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.engine.cio.h$h, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0573h extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f24923a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f24924b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f24925c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f24926d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f24927e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f24928f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f24930h;

        public C0573h(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f24928f = obj;
            this.f24930h |= Integer.MIN_VALUE;
            return h.this.Q0(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class i extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.g f24931a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.j f24932b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p043e6.i f24933c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ h f24934d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(io.ktor.utils.io.g gVar, io.ktor.utils.io.j jVar, p043e6.i iVar, h hVar) {
            super(1);
            this.f24931a = gVar;
            this.f24932b = jVar;
            this.f24933c = iVar;
            this.f24934d = hVar;
        }

        public final void b(Throwable th) {
            Throwable thA = th != null ? V5.e.a(th) : null;
            try {
                this.f24931a.f(thA);
                this.f24932b.d(thA);
                this.f24933c.c().close();
                this.f24934d.i1();
            } catch (Throwable unused) {
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class j extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f24935a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f24936b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f24937c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f24939e;

        public j(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f24937c = obj;
            this.f24939e |= Integer.MIN_VALUE;
            return h.this.V0(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class k extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f24940a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ T5.e f24941b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.j f24942c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f24943d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p141p6.c f24944e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.g f24945f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.j f24946g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ G6.g f24947h;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends I6.l implements Q6.o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f24948a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ io.ktor.utils.io.g f24949b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(io.ktor.utils.io.g gVar, G6.d dVar) {
                super(2, dVar);
                this.f24949b = gVar;
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                return new a(this.f24949b, dVar);
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(J j8, G6.d dVar) {
                return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                Object objF = H6.c.f();
                int i8 = this.f24948a;
                if (i8 == 0) {
                    C6.r.b(obj);
                    io.ktor.utils.io.g gVar = this.f24949b;
                    this.f24948a = 1;
                    if (gVar.o(this) == objF) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(T5.e eVar, io.ktor.utils.io.j jVar, boolean z8, p141p6.c cVar, io.ktor.utils.io.g gVar, io.ktor.utils.io.j jVar2, G6.g gVar2, G6.d dVar) {
            super(2, dVar);
            this.f24941b = eVar;
            this.f24942c = jVar;
            this.f24943d = z8;
            this.f24944e = cVar;
            this.f24945f = gVar;
            this.f24946g = jVar2;
            this.f24947h = gVar2;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return new k(this.f24941b, this.f24942c, this.f24943d, this.f24944e, this.f24945f, this.f24946g, this.f24947h, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((k) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0058 A[PHI: r5 r10
          0x0058: PHI (r5v3 io.ktor.client.engine.cio.h$k) = (r5v1 io.ktor.client.engine.cio.h$k), (r5v6 io.ktor.client.engine.cio.h$k) binds: [B:16:0x0054, B:10:0x0020] A[DONT_GENERATE, DONT_INLINE]
          0x0058: PHI (r10v5 java.lang.Object) = (r10v4 java.lang.Object), (r10v0 java.lang.Object) binds: [B:16:0x0054, B:10:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:20:0x005c  */
        /* JADX WARN: Code duplicated, block: B:23:0x0073 A[PHI: r5 r10
          0x0073: PHI (r5v7 io.ktor.client.engine.cio.h$k) = (r5v5 io.ktor.client.engine.cio.h$k), (r5v10 io.ktor.client.engine.cio.h$k) binds: [B:21:0x006f, B:9:0x001b] A[DONT_GENERATE, DONT_INLINE]
          0x0073: PHI (r10v11 java.lang.Object) = (r10v10 java.lang.Object), (r10v0 java.lang.Object) binds: [B:21:0x006f, B:9:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:25:0x0085  */
        /* JADX WARN: Code duplicated, block: B:28:0x00b6  */
        /* JADX WARN: Code duplicated, block: B:30:0x00c0  */
        /* JADX WARN: Code duplicated, block: B:33:0x00d4  */
        /* JADX WARN: Code duplicated, block: B:35:0x00da  */
        /* JADX WARN: Code duplicated, block: B:38:0x00ee A[PHI: r5
          0x00ee: PHI (r5v11 io.ktor.client.engine.cio.h$k) = 
          (r5v3 io.ktor.client.engine.cio.h$k)
          (r5v7 io.ktor.client.engine.cio.h$k)
          (r5v9 io.ktor.client.engine.cio.h$k)
          (r5v13 io.ktor.client.engine.cio.h$k)
         binds: [B:36:0x00eb, B:31:0x00d1, B:26:0x00b3, B:8:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:41:0x0103 A[RETURN] */
        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            k kVar;
            T5.e eVar;
            io.ktor.utils.io.j jVar;
            G6.g gVar;
            T5.h hVar;
            x xVarF;
            x.a aVar;
            T5.e eVar2;
            io.ktor.utils.io.j jVar2;
            G6.g gVar2;
            T5.e eVarB;
            io.ktor.utils.io.j jVar3;
            G6.g gVar3;
            boolean z8;
            Object objE;
            Object objF = H6.c.f();
            switch (this.f24940a) {
                case 0:
                    C6.r.b(obj);
                    T5.e eVar3 = this.f24941b;
                    io.ktor.utils.io.j jVar4 = this.f24942c;
                    boolean z9 = this.f24943d;
                    this.f24940a = 1;
                    kVar = this;
                    if (p.m(eVar3, jVar4, z9, false, kVar, 8, null) != objF) {
                        a aVar2 = new a(kVar.f24945f, null);
                        kVar.f24940a = 2;
                        obj = X0.e(1000L, aVar2, this);
                        if (obj != objF) {
                            if (((G) obj) != null) {
                                p141p6.c cVar = kVar.f24944e;
                                T5.e eVar4 = kVar.f24941b;
                                io.ktor.utils.io.g gVar4 = kVar.f24945f;
                                io.ktor.utils.io.j jVar5 = kVar.f24946g;
                                k kVar2 = kVar;
                                G6.g gVar5 = kVar2.f24947h;
                                kVar2.f24940a = 3;
                                obj = p.e(cVar, eVar4, gVar4, jVar5, gVar5, kVar2);
                                kVar = kVar2;
                                if (obj != objF) {
                                    hVar = (T5.h) obj;
                                    xVarF = hVar.f();
                                    aVar = x.f11997c;
                                    if (t.c(xVarF, aVar.g())) {
                                        T5.d dVar = new T5.d();
                                        T5.f.c(dVar, kVar.f24941b);
                                        dVar.a().k(C1688q.f11910a.n());
                                        eVarB = dVar.b();
                                        jVar3 = kVar.f24942c;
                                        gVar3 = kVar.f24947h;
                                        z8 = kVar.f24943d;
                                        kVar.f24940a = 4;
                                        kVar = this;
                                        if (p.o(eVarB, jVar3, gVar3, z8, false, this, 16, null) != objF) {
                                            p141p6.c cVar2 = kVar.f24944e;
                                            T5.e eVar5 = kVar.f24941b;
                                            io.ktor.utils.io.g gVar6 = kVar.f24945f;
                                            io.ktor.utils.io.j jVar6 = kVar.f24946g;
                                            k kVar3 = kVar;
                                            G6.g gVar7 = kVar3.f24947h;
                                            kVar3.f24940a = 7;
                                            objE = p.e(cVar2, eVar5, gVar6, jVar6, gVar7, kVar3);
                                            if (objE != objF) {
                                                return objE;
                                            }
                                        }
                                    } else {
                                        if (t.c(xVarF, aVar.e())) {
                                            io.ktor.utils.io.k.a(kVar.f24942c);
                                            return hVar;
                                        }
                                        eVar2 = kVar.f24941b;
                                        jVar2 = kVar.f24942c;
                                        gVar2 = kVar.f24947h;
                                        kVar.f24940a = 5;
                                        if (p.k(eVar2, jVar2, gVar2, false, kVar, 8, null) != objF) {
                                            p141p6.c cVar3 = kVar.f24944e;
                                            T5.e eVar6 = kVar.f24941b;
                                            io.ktor.utils.io.g gVar8 = kVar.f24945f;
                                            io.ktor.utils.io.j jVar7 = kVar.f24946g;
                                            k kVar4 = kVar;
                                            G6.g gVar9 = kVar4.f24947h;
                                            kVar4.f24940a = 7;
                                            objE = p.e(cVar3, eVar6, gVar8, jVar7, gVar9, kVar4);
                                            if (objE != objF) {
                                                return objE;
                                            }
                                        }
                                    }
                                }
                            } else {
                                eVar = kVar.f24941b;
                                jVar = kVar.f24942c;
                                gVar = kVar.f24947h;
                                kVar.f24940a = 6;
                                if (p.k(eVar, jVar, gVar, false, kVar, 8, null) != objF) {
                                    p141p6.c cVar4 = kVar.f24944e;
                                    T5.e eVar7 = kVar.f24941b;
                                    io.ktor.utils.io.g gVar10 = kVar.f24945f;
                                    io.ktor.utils.io.j jVar8 = kVar.f24946g;
                                    k kVar5 = kVar;
                                    G6.g gVar11 = kVar5.f24947h;
                                    kVar5.f24940a = 7;
                                    objE = p.e(cVar4, eVar7, gVar10, jVar8, gVar11, kVar5);
                                    if (objE != objF) {
                                        return objE;
                                    }
                                }
                            }
                        }
                    }
                    return objF;
                case 1:
                    C6.r.b(obj);
                    kVar = this;
                    a aVar3 = new a(kVar.f24945f, null);
                    kVar.f24940a = 2;
                    obj = X0.e(1000L, aVar3, this);
                    if (obj != objF) {
                        if (((G) obj) != null) {
                            p141p6.c cVar5 = kVar.f24944e;
                            T5.e eVar8 = kVar.f24941b;
                            io.ktor.utils.io.g gVar12 = kVar.f24945f;
                            io.ktor.utils.io.j jVar9 = kVar.f24946g;
                            k kVar6 = kVar;
                            G6.g gVar13 = kVar6.f24947h;
                            kVar6.f24940a = 3;
                            obj = p.e(cVar5, eVar8, gVar12, jVar9, gVar13, kVar6);
                            kVar = kVar6;
                            if (obj != objF) {
                                hVar = (T5.h) obj;
                                xVarF = hVar.f();
                                aVar = x.f11997c;
                                if (t.c(xVarF, aVar.g())) {
                                    T5.d dVar2 = new T5.d();
                                    T5.f.c(dVar2, kVar.f24941b);
                                    dVar2.a().k(C1688q.f11910a.n());
                                    eVarB = dVar2.b();
                                    jVar3 = kVar.f24942c;
                                    gVar3 = kVar.f24947h;
                                    z8 = kVar.f24943d;
                                    kVar.f24940a = 4;
                                    kVar = this;
                                    if (p.o(eVarB, jVar3, gVar3, z8, false, this, 16, null) != objF) {
                                        p141p6.c cVar6 = kVar.f24944e;
                                        T5.e eVar9 = kVar.f24941b;
                                        io.ktor.utils.io.g gVar14 = kVar.f24945f;
                                        io.ktor.utils.io.j jVar10 = kVar.f24946g;
                                        k kVar7 = kVar;
                                        G6.g gVar15 = kVar7.f24947h;
                                        kVar7.f24940a = 7;
                                        objE = p.e(cVar6, eVar9, gVar14, jVar10, gVar15, kVar7);
                                        if (objE != objF) {
                                            return objE;
                                        }
                                    }
                                } else {
                                    if (t.c(xVarF, aVar.e())) {
                                        io.ktor.utils.io.k.a(kVar.f24942c);
                                        return hVar;
                                    }
                                    eVar2 = kVar.f24941b;
                                    jVar2 = kVar.f24942c;
                                    gVar2 = kVar.f24947h;
                                    kVar.f24940a = 5;
                                    if (p.k(eVar2, jVar2, gVar2, false, kVar, 8, null) != objF) {
                                        p141p6.c cVar7 = kVar.f24944e;
                                        T5.e eVar10 = kVar.f24941b;
                                        io.ktor.utils.io.g gVar16 = kVar.f24945f;
                                        io.ktor.utils.io.j jVar11 = kVar.f24946g;
                                        k kVar8 = kVar;
                                        G6.g gVar17 = kVar8.f24947h;
                                        kVar8.f24940a = 7;
                                        objE = p.e(cVar7, eVar10, gVar16, jVar11, gVar17, kVar8);
                                        if (objE != objF) {
                                            return objE;
                                        }
                                    }
                                }
                            }
                        } else {
                            eVar = kVar.f24941b;
                            jVar = kVar.f24942c;
                            gVar = kVar.f24947h;
                            kVar.f24940a = 6;
                            if (p.k(eVar, jVar, gVar, false, kVar, 8, null) != objF) {
                                p141p6.c cVar8 = kVar.f24944e;
                                T5.e eVar11 = kVar.f24941b;
                                io.ktor.utils.io.g gVar18 = kVar.f24945f;
                                io.ktor.utils.io.j jVar12 = kVar.f24946g;
                                k kVar9 = kVar;
                                G6.g gVar19 = kVar9.f24947h;
                                kVar9.f24940a = 7;
                                objE = p.e(cVar8, eVar11, gVar18, jVar12, gVar19, kVar9);
                                if (objE != objF) {
                                    return objE;
                                }
                            }
                        }
                    }
                    return objF;
                case 2:
                    C6.r.b(obj);
                    kVar = this;
                    if (((G) obj) != null) {
                        p141p6.c cVar9 = kVar.f24944e;
                        T5.e eVar12 = kVar.f24941b;
                        io.ktor.utils.io.g gVar110 = kVar.f24945f;
                        io.ktor.utils.io.j jVar13 = kVar.f24946g;
                        k kVar10 = kVar;
                        G6.g gVar111 = kVar10.f24947h;
                        kVar10.f24940a = 3;
                        obj = p.e(cVar9, eVar12, gVar110, jVar13, gVar111, kVar10);
                        kVar = kVar10;
                        if (obj != objF) {
                            hVar = (T5.h) obj;
                            xVarF = hVar.f();
                            aVar = x.f11997c;
                            if (t.c(xVarF, aVar.g())) {
                                T5.d dVar3 = new T5.d();
                                T5.f.c(dVar3, kVar.f24941b);
                                dVar3.a().k(C1688q.f11910a.n());
                                eVarB = dVar3.b();
                                jVar3 = kVar.f24942c;
                                gVar3 = kVar.f24947h;
                                z8 = kVar.f24943d;
                                kVar.f24940a = 4;
                                kVar = this;
                                if (p.o(eVarB, jVar3, gVar3, z8, false, this, 16, null) != objF) {
                                    p141p6.c cVar10 = kVar.f24944e;
                                    T5.e eVar13 = kVar.f24941b;
                                    io.ktor.utils.io.g gVar112 = kVar.f24945f;
                                    io.ktor.utils.io.j jVar14 = kVar.f24946g;
                                    k kVar11 = kVar;
                                    G6.g gVar113 = kVar11.f24947h;
                                    kVar11.f24940a = 7;
                                    objE = p.e(cVar10, eVar13, gVar112, jVar14, gVar113, kVar11);
                                    if (objE != objF) {
                                        return objE;
                                    }
                                }
                            } else {
                                if (t.c(xVarF, aVar.e())) {
                                    io.ktor.utils.io.k.a(kVar.f24942c);
                                    return hVar;
                                }
                                eVar2 = kVar.f24941b;
                                jVar2 = kVar.f24942c;
                                gVar2 = kVar.f24947h;
                                kVar.f24940a = 5;
                                if (p.k(eVar2, jVar2, gVar2, false, kVar, 8, null) != objF) {
                                    p141p6.c cVar11 = kVar.f24944e;
                                    T5.e eVar14 = kVar.f24941b;
                                    io.ktor.utils.io.g gVar114 = kVar.f24945f;
                                    io.ktor.utils.io.j jVar15 = kVar.f24946g;
                                    k kVar12 = kVar;
                                    G6.g gVar115 = kVar12.f24947h;
                                    kVar12.f24940a = 7;
                                    objE = p.e(cVar11, eVar14, gVar114, jVar15, gVar115, kVar12);
                                    if (objE != objF) {
                                        return objE;
                                    }
                                }
                            }
                        }
                    } else {
                        eVar = kVar.f24941b;
                        jVar = kVar.f24942c;
                        gVar = kVar.f24947h;
                        kVar.f24940a = 6;
                        if (p.k(eVar, jVar, gVar, false, kVar, 8, null) != objF) {
                            p141p6.c cVar12 = kVar.f24944e;
                            T5.e eVar15 = kVar.f24941b;
                            io.ktor.utils.io.g gVar116 = kVar.f24945f;
                            io.ktor.utils.io.j jVar16 = kVar.f24946g;
                            k kVar13 = kVar;
                            G6.g gVar117 = kVar13.f24947h;
                            kVar13.f24940a = 7;
                            objE = p.e(cVar12, eVar15, gVar116, jVar16, gVar117, kVar13);
                            if (objE != objF) {
                                return objE;
                            }
                        }
                    }
                    return objF;
                case 3:
                    C6.r.b(obj);
                    kVar = this;
                    hVar = (T5.h) obj;
                    xVarF = hVar.f();
                    aVar = x.f11997c;
                    if (t.c(xVarF, aVar.g())) {
                        T5.d dVar4 = new T5.d();
                        T5.f.c(dVar4, kVar.f24941b);
                        dVar4.a().k(C1688q.f11910a.n());
                        eVarB = dVar4.b();
                        jVar3 = kVar.f24942c;
                        gVar3 = kVar.f24947h;
                        z8 = kVar.f24943d;
                        kVar.f24940a = 4;
                        kVar = this;
                        if (p.o(eVarB, jVar3, gVar3, z8, false, this, 16, null) != objF) {
                            p141p6.c cVar13 = kVar.f24944e;
                            T5.e eVar16 = kVar.f24941b;
                            io.ktor.utils.io.g gVar118 = kVar.f24945f;
                            io.ktor.utils.io.j jVar17 = kVar.f24946g;
                            k kVar14 = kVar;
                            G6.g gVar119 = kVar14.f24947h;
                            kVar14.f24940a = 7;
                            objE = p.e(cVar13, eVar16, gVar118, jVar17, gVar119, kVar14);
                            if (objE != objF) {
                                return objE;
                            }
                        }
                    } else {
                        if (t.c(xVarF, aVar.e())) {
                            io.ktor.utils.io.k.a(kVar.f24942c);
                            return hVar;
                        }
                        eVar2 = kVar.f24941b;
                        jVar2 = kVar.f24942c;
                        gVar2 = kVar.f24947h;
                        kVar.f24940a = 5;
                        if (p.k(eVar2, jVar2, gVar2, false, kVar, 8, null) != objF) {
                            p141p6.c cVar14 = kVar.f24944e;
                            T5.e eVar17 = kVar.f24941b;
                            io.ktor.utils.io.g gVar1110 = kVar.f24945f;
                            io.ktor.utils.io.j jVar18 = kVar.f24946g;
                            k kVar15 = kVar;
                            G6.g gVar1111 = kVar15.f24947h;
                            kVar15.f24940a = 7;
                            objE = p.e(cVar14, eVar17, gVar1110, jVar18, gVar1111, kVar15);
                            if (objE != objF) {
                                return objE;
                            }
                        }
                    }
                    return objF;
                case 4:
                case 5:
                case 6:
                    C6.r.b(obj);
                    kVar = this;
                    p141p6.c cVar15 = kVar.f24944e;
                    T5.e eVar18 = kVar.f24941b;
                    io.ktor.utils.io.g gVar1112 = kVar.f24945f;
                    io.ktor.utils.io.j jVar19 = kVar.f24946g;
                    k kVar16 = kVar;
                    G6.g gVar1113 = kVar16.f24947h;
                    kVar16.f24940a = 7;
                    objE = p.e(cVar15, eVar18, gVar1112, jVar19, gVar1113, kVar16);
                    if (objE != objF) {
                        return objF;
                    }
                    return objE;
                case 7:
                    C6.r.b(obj);
                    return obj;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class l extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f24950a;

        public l(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return h.this.new l(dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((l) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            long jD;
            Object objF = H6.c.f();
            int i8 = this.f24950a;
            if (i8 == 0) {
                C6.r.b(obj);
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    C6.r.b(obj);
                } catch (Throwable unused) {
                }
            }
            do {
                jD = (h.this.lastActivity + h.this.f24892j) - p141p6.a.d();
                if (jD <= 0) {
                    d7.y.a.a(h.this.f24891i, null, 1, null);
                    h.this.f24890h.invoke();
                    return G.f1419a;
                }
                this.f24950a = 1;
            } while (U.a(jD, this) != objF);
            return objF;
        }
    }

    public h(String host, int i8, Proxy proxy, boolean z8, io.ktor.client.engine.cio.c config, io.ktor.client.engine.cio.d connectionFactory, G6.g coroutineContext, Function0 onDone) {
        t.g(host, "host");
        t.g(config, "config");
        t.g(connectionFactory, "connectionFactory");
        t.g(coroutineContext, "coroutineContext");
        t.g(onDone, "onDone");
        this.f24883a = host;
        this.f24884b = i8;
        this.f24885c = proxy;
        this.f24886d = z8;
        this.f24887e = config;
        this.f24888f = connectionFactory;
        this.f24889g = coroutineContext;
        this.f24890h = onDone;
        this.lastActivity = p141p6.a.d();
        this.connections = 0;
        this.f24891i = p035d7.j.b(0, null, null, 7, null);
        this.f24892j = ((long) 2) * config.c().c();
        this.f24893k = AbstractC1789i.d(this, getCoroutineContext().P1(new I("Endpoint timeout(" + host + ':' + i8 + ')')), null, new l(null), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object A0(T5.e eVar, G6.d dVar) throws Exception {
        e eVar2;
        h hVar;
        if (dVar instanceof e) {
            eVar2 = (e) dVar;
            int i8 = eVar2.f24916d;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                eVar2.f24916d = i8 - Integer.MIN_VALUE;
            } else {
                eVar2 = new e(dVar);
            }
        } else {
            eVar2 = new e(dVar);
        }
        Object objR0 = eVar2.f24914b;
        Object objF = H6.c.f();
        int i9 = eVar2.f24916d;
        if (i9 == 0) {
            C6.r.b(objR0);
            eVar2.f24913a = this;
            eVar2.f24916d = 1;
            objR0 = r0(eVar, eVar2);
            if (objR0 == objF) {
                return objF;
            }
            hVar = this;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = (h) eVar2.f24913a;
            C6.r.b(objR0);
        }
        new io.ktor.client.engine.cio.e(hVar.f24887e.c().d(), hVar.f24887e.c().f(), (p043e6.i) objR0, hVar.f24885c != null, hVar.f24891i, hVar.getCoroutineContext()).g().H0(hVar.new f());
        return G.f1419a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    public final Object H0(T5.e eVar, G6.g gVar, G6.d dVar) throws Throwable {
        g gVar2;
        InterfaceC1812u interfaceC1812u;
        o oVar;
        if (dVar instanceof g) {
            gVar2 = (g) dVar;
            int i8 = gVar2.f24922e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                gVar2.f24922e = i8 - Integer.MIN_VALUE;
            } else {
                gVar2 = new g(dVar);
            }
        } else {
            gVar2 = new g(dVar);
        }
        Object obj = gVar2.f24920c;
        Object objF = H6.c.f();
        int i9 = gVar2.f24922e;
        try {
            if (i9 == 0) {
                C6.r.b(obj);
                this.lastActivity = p141p6.a.d();
                if (!this.f24887e.a() || io.ktor.client.engine.cio.k.b(eVar)) {
                    gVar2.f24922e = 1;
                    Object objQ0 = Q0(eVar, gVar, gVar2);
                    if (objQ0 != objF) {
                        return objQ0;
                    }
                } else {
                    InterfaceC1812u interfaceC1812uB = AbstractC1816w.b(null, 1, null);
                    o oVar2 = new o(eVar, interfaceC1812uB, gVar);
                    try {
                        gVar2.f24918a = interfaceC1812uB;
                        gVar2.f24919b = oVar2;
                        gVar2.f24922e = 2;
                        if (V0(oVar2, gVar2) != objF) {
                            interfaceC1812u = interfaceC1812uB;
                            oVar = oVar2;
                        }
                    } catch (Throwable th) {
                        th = th;
                        eVar = oVar2;
                        eVar.c().v(th);
                        throw th;
                    }
                }
            }
            if (i9 == 1) {
                C6.r.b(obj);
                return obj;
            }
            if (i9 != 2) {
                if (i9 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
                return obj;
            }
            oVar = (o) gVar2.f24919b;
            interfaceC1812u = (InterfaceC1812u) gVar2.f24918a;
            C6.r.b(obj);
            gVar2.f24918a = oVar;
            gVar2.f24919b = null;
            gVar2.f24922e = 3;
            Object objQ1 = interfaceC1812u.Q0(gVar2);
            return objQ1 == objF ? objF : objQ1;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final Exception O0(int i8, int i9, T5.e eVar) {
        return i9 == i8 ? v.b(eVar, null, 2, null) : new m();
    }

    /* JADX WARN: Code duplicated, block: B:66:0x015d  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11, types: [T5.e] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [T5.e] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [T5.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [io.ktor.client.engine.cio.h] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [T5.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [T5.e] */
    public final Object Q0(T5.e eVar, G6.g gVar, G6.d dVar) throws Throwable {
        C0573h c0573h;
        ?? r8;
        G6.g gVar2;
        ?? r9;
        Object obj;
        h hVar;
        p141p6.c cVar;
        io.ktor.utils.io.j jVar;
        ?? r10;
        G6.g gVar3;
        io.ktor.utils.io.g gVar4;
        if (dVar instanceof C0573h) {
            c0573h = (C0573h) dVar;
            int i8 = c0573h.f24930h;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0573h.f24930h = i8 - Integer.MIN_VALUE;
            } else {
                c0573h = new C0573h(dVar);
            }
        } else {
            c0573h = new C0573h(dVar);
        }
        C0573h c0573h2 = c0573h;
        Object objA1 = c0573h2.f24928f;
        Object objF = H6.c.f();
        int i9 = c0573h2.f24930h;
        ?? r11 = 3;
        boolean z8 = true;
        try {
            try {
                if (i9 == 0) {
                    C6.r.b(objA1);
                    c0573h2.f24923a = this;
                    c0573h2.f24924b = eVar;
                    gVar2 = gVar;
                    c0573h2.f24925c = gVar2;
                    c0573h2.f24930h = 1;
                    Object objR0 = r0(eVar, c0573h2);
                    if (objR0 != objF) {
                        r9 = eVar;
                        obj = objR0;
                        hVar = this;
                    }
                    return objF;
                }
                if (i9 != 1) {
                    if (i9 == 2) {
                        C6.r.b(objA1);
                        return (T5.h) objA1;
                    }
                    if (i9 == 3) {
                        cVar = (p141p6.c) c0573h2.f24927e;
                        io.ktor.utils.io.j jVar2 = (io.ktor.utils.io.j) c0573h2.f24926d;
                        io.ktor.utils.io.g gVar5 = (io.ktor.utils.io.g) c0573h2.f24925c;
                        G6.g gVar6 = (G6.g) c0573h2.f24924b;
                        T5.e eVar2 = (T5.e) c0573h2.f24923a;
                        try {
                            C6.r.b(objA1);
                            gVar3 = gVar6;
                            gVar4 = gVar5;
                            r10 = eVar2;
                            jVar = jVar2;
                            p141p6.c cVar2 = cVar;
                            c0573h2.f24923a = r10;
                            c0573h2.f24924b = null;
                            c0573h2.f24925c = null;
                            c0573h2.f24926d = null;
                            c0573h2.f24927e = null;
                            c0573h2.f24930h = 4;
                            objA1 = p.e(cVar2, r10, gVar4, jVar, gVar3, c0573h2);
                            r11 = r10;
                            if (objA1 != objF) {
                            }
                            return objF;
                        } catch (Throwable th) {
                            th = th;
                            r8 = eVar2;
                        }
                    } else {
                        if (i9 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C6.r.b(objA1);
                    }
                    return (T5.h) objA1;
                }
                G6.g gVar7 = (G6.g) c0573h2.f24925c;
                r8 = (T5.e) c0573h2.f24924b;
                hVar = (h) c0573h2.f24923a;
                try {
                    C6.r.b(objA1);
                    obj = objA1;
                    gVar2 = gVar7;
                    r9 = r8;
                } catch (Throwable th2) {
                    th = th2;
                }
                throw io.ktor.client.engine.cio.l.a(th, r8);
                p043e6.i iVar = (p043e6.i) obj;
                io.ktor.utils.io.g gVarA = L5.c.a(hVar, iVar.a(), r9);
                io.ktor.utils.io.j jVarB = L5.c.b(hVar, iVar.b(), r9);
                io.ktor.utils.io.j jVarB2 = p.b(jVarB, gVar2, hVar.f24887e.c().a());
                G6.g.b bVarA = gVar2.A(InterfaceC1815v0.f15985O);
                t.d(bVarA);
                ((InterfaceC1815v0) bVarA).H0(new i(gVarA, jVarB, iVar, hVar));
                io.ktor.client.engine.cio.j.c(gVar2, r9, io.ktor.client.engine.cio.j.b(r9, hVar.f24887e));
                p141p6.c cVarC = p141p6.a.c(null, 1, null);
                if (hVar.f24885c == null) {
                    z8 = false;
                }
                if (p.a(r9.e().d(C1688q.f11910a.n()), r9.b())) {
                    c0573h2.f24923a = r9;
                    c0573h2.f24924b = null;
                    c0573h2.f24925c = null;
                    c0573h2.f24930h = 2;
                    ?? r12 = r9;
                    objA1 = hVar.a1(r12, gVarA, jVarB2, jVarB, gVar2, cVarC, z8, c0573h2);
                    r11 = r12;
                    if (objA1 != objF) {
                        return (T5.h) objA1;
                    }
                } else {
                    cVar = cVarC;
                    G6.g gVar8 = gVar2;
                    c0573h2.f24923a = r9;
                    c0573h2.f24924b = gVar8;
                    c0573h2.f24925c = gVarA;
                    c0573h2.f24926d = jVarB;
                    c0573h2.f24927e = cVar;
                    c0573h2.f24930h = 3;
                    if (p.o(r9, jVarB2, gVar8, z8, false, c0573h2, 16, null) != objF) {
                        jVar = jVarB;
                        r10 = r9;
                        gVar3 = gVar8;
                        gVar4 = gVarA;
                        p141p6.c cVar3 = cVar;
                        c0573h2.f24923a = r10;
                        c0573h2.f24924b = null;
                        c0573h2.f24925c = null;
                        c0573h2.f24926d = null;
                        c0573h2.f24927e = null;
                        c0573h2.f24930h = 4;
                        objA1 = p.e(cVar3, r10, gVar4, jVar, gVar3, c0573h2);
                        r11 = r10;
                        if (objA1 != objF) {
                            return (T5.h) objA1;
                        }
                    }
                }
                return objF;
            } catch (Throwable th3) {
                th = th3;
                r8 = eVar;
            }
        } catch (Throwable th4) {
            th = th4;
            r8 = r11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0070, code lost:
    
        if (A0(r7, r0) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0089, code lost:
    
        if (r7.i(r6, r0) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008b, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object V0(o oVar, G6.d dVar) {
        j jVar;
        h hVar;
        if (dVar instanceof j) {
            jVar = (j) dVar;
            int i8 = jVar.f24939e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                jVar.f24939e = i8 - Integer.MIN_VALUE;
            } else {
                jVar = new j(dVar);
            }
        } else {
            jVar = new j(dVar);
        }
        Object obj = jVar.f24937c;
        Object objF = H6.c.f();
        int i9 = jVar.f24939e;
        try {
            if (i9 != 0) {
                if (i9 == 1) {
                    oVar = (o) jVar.f24936b;
                    hVar = (h) jVar.f24935a;
                    C6.r.b(obj);
                } else {
                    if (i9 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C6.r.b(obj);
                }
                return G.f1419a;
            }
            C6.r.b(obj);
            if (p035d7.k.i(this.f24891i.m(oVar))) {
                return G.f1419a;
            }
            if (this.connections < this.f24887e.c().e()) {
                T5.e eVarB = oVar.b();
                jVar.f24935a = this;
                jVar.f24936b = oVar;
                jVar.f24939e = 1;
            }
            hVar = this;
            p035d7.g gVar = hVar.f24891i;
            jVar.f24935a = null;
            jVar.f24936b = null;
            jVar.f24939e = 2;
        } catch (Throwable th) {
            oVar.c().v(th);
            throw th;
        }
    }

    public final Object a1(T5.e eVar, io.ktor.utils.io.g gVar, io.ktor.utils.io.j jVar, io.ktor.utils.io.j jVar2, G6.g gVar2, p141p6.c cVar, boolean z8, G6.d dVar) {
        return AbstractC1785g.g(gVar2, new k(eVar, jVar, z8, cVar, gVar, jVar2, gVar2, null), dVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InterfaceC1815v0.a.a(this.f24893k, null, 1, null);
    }

    @Override // p017b7.J
    public G6.g getCoroutineContext() {
        return this.f24889g;
    }

    public final void i1() {
        this.f24888f.c(new p043e6.j(this.f24883a, this.f24884b));
        f24882m.decrementAndGet(this);
    }

    public final C6.o p1(T5.e eVar) {
        C6.o oVarA = C6.v.a(Long.valueOf(this.f24887e.c().c()), Long.valueOf(this.f24887e.c().g()));
        M5.u.a aVar = (M5.u.a) eVar.c(M5.u.f5752d);
        if (aVar == null) {
            return oVarA;
        }
        Long lE = aVar.e();
        long jLongValue = lE != null ? lE.longValue() : this.f24887e.c().g();
        Long lC = aVar.c();
        return C6.v.a(Long.valueOf(lC != null ? lC.longValue() : this.f24887e.c().c()), Long.valueOf(jLongValue));
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00e1 A[Catch: all -> 0x011a, TRY_ENTER, TryCatch #5 {all -> 0x011a, blocks: (B:50:0x0143, B:52:0x0147, B:36:0x00e1, B:38:0x00fa, B:46:0x011e), top: B:101:0x0143 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00fa A[Catch: all -> 0x011a, TRY_LEAVE, TryCatch #5 {all -> 0x011a, blocks: (B:50:0x0143, B:52:0x0147, B:36:0x00e1, B:38:0x00fa, B:46:0x011e), top: B:101:0x0143 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x010d  */
    /* JADX WARN: Code duplicated, block: B:46:0x011e A[Catch: all -> 0x011a, TRY_ENTER, TryCatch #5 {all -> 0x011a, blocks: (B:50:0x0143, B:52:0x0147, B:36:0x00e1, B:38:0x00fa, B:46:0x011e), top: B:101:0x0143 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0137  */
    /* JADX WARN: Code duplicated, block: B:49:0x0139  */
    /* JADX WARN: Code duplicated, block: B:52:0x0147 A[Catch: all -> 0x011a, TRY_LEAVE, TryCatch #5 {all -> 0x011a, blocks: (B:50:0x0143, B:52:0x0147, B:36:0x00e1, B:38:0x00fa, B:46:0x011e), top: B:101:0x0143 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [io.ktor.client.engine.cio.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [io.ktor.client.engine.cio.h] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v21, types: [io.ktor.client.engine.cio.h] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v4, types: [io.ktor.client.engine.cio.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0139 -> B:101:0x0143). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object r0(T5.e r22, G6.d r23) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.cio.h.r0(T5.e, G6.d):java.lang.Object");
    }
}
