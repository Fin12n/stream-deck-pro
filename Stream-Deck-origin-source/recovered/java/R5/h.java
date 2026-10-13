package R5;

import C6.G;
import C6.r;
import D6.z;
import I6.l;
import M5.k;
import Q6.p;
import T0.Vl.PCRzgdeK;
import X5.C1688q;
import X5.P;
import X5.x;
import io.ktor.websocket.u;
import io.ktor.websocket.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.t;
import p063h.s;
import p115m6.C2691a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f9512d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C2691a f9513e = new C2691a("Websocket");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f9516c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u f9517a = new u();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f9518b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f9519c = 2147483647L;

        public final p088j6.f a() {
            return null;
        }

        public final u b() {
            return this.f9517a;
        }

        public final long c() {
            return this.f9519c;
        }

        public final long d() {
            return this.f9518b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements k {

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends l implements p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f9520a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f9521b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ boolean f9522c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ h f9523d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean z8, h hVar, G6.d dVar) {
                super(3, dVar);
                this.f9522c = z8;
                this.f9523d = hVar;
            }

            @Override // Q6.p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(p173t6.e eVar, Object obj, G6.d dVar) {
                a aVar = new a(this.f9522c, this.f9523d, dVar);
                aVar.f9521b = eVar;
                return aVar.invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                Object objF = H6.c.f();
                int i8 = this.f9520a;
                if (i8 == 0) {
                    r.b(obj);
                    p173t6.e eVar = (p173t6.e) this.f9521b;
                    if (!P.b(((T5.d) eVar.d()).i().o())) {
                        i.b().b("Skipping WebSocket plugin for non-websocket request: " + ((T5.d) eVar.d()).i());
                        return G.f1419a;
                    }
                    i.b().b("Sending WebSocket request " + ((T5.d) eVar.d()).i());
                    ((T5.d) eVar.d()).l(d.f9508a, G.f1419a);
                    if (this.f9522c) {
                        this.f9523d.g((T5.d) eVar.d());
                    }
                    e eVar2 = new e();
                    this.f9520a = 1;
                    if (eVar.h(eVar2, this) == objF) {
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

        public /* synthetic */ b(AbstractC2633k abstractC2633k) {
            this();
        }

        @Override // M5.k
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(h plugin, G5.a scope) {
            t.g(plugin, "plugin");
            t.g(scope, "scope");
            boolean zContains = scope.v().h0().contains(g.f9511a);
            scope.A().l(T5.g.f9911h.b(), new a(zContains, plugin, null));
            scope.Y().l(U5.f.f10219h.c(), new C0263b(plugin, zContains, null));
        }

        @Override // M5.k
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public h b(Q6.k block) {
            t.g(block, "block");
            a aVar = new a();
            block.invoke(aVar);
            long jD = aVar.d();
            long jC = aVar.c();
            u uVarB = aVar.b();
            aVar.a();
            return new h(jD, jC, uVarB, (p088j6.f) null);
        }

        @Override // M5.k
        public C2691a getKey() {
            return h.f9513e;
        }

        /* JADX INFO: renamed from: R5.h$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0263b extends l implements p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f9524a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f9525b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f9526c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ h f9527d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ boolean f9528e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0263b(h hVar, boolean z8, G6.d dVar) {
                super(3, dVar);
                this.f9527d = hVar;
                this.f9528e = z8;
            }

            @Override // Q6.p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(p173t6.e eVar, U5.d dVar, G6.d dVar2) {
                C0263b c0263b = new C0263b(this.f9527d, this.f9528e, dVar2);
                c0263b.f9525b = eVar;
                c0263b.f9526c = dVar;
                return c0263b.invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                Object cVar;
                List listN;
                Object objF = H6.c.f();
                int i8 = this.f9524a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        r.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    r.b(obj);
                    p173t6.e eVar = (p173t6.e) this.f9525b;
                    U5.d dVar = (U5.d) this.f9526c;
                    p181u6.a aVarA = dVar.a();
                    Object objB = dVar.b();
                    U5.c cVarG = ((H5.b) eVar.d()).g();
                    x xVarG = cVarG.g();
                    boolean z8 = U5.e.d(cVarG).T0() instanceof e;
                    String str = PCRzgdeK.sOYNsddTE;
                    if (!z8) {
                        i.b().b("Skipping non-websocket response from " + ((H5.b) eVar.d()).f().o() + str + objB);
                        return G.f1419a;
                    }
                    x.a aVar = x.f11997c;
                    if (t.c(xVarG, aVar.Q())) {
                        if (objB instanceof w) {
                            i.b().b("Receive websocket session from " + ((H5.b) eVar.d()).f().o() + str + objB);
                            if (t.c(aVarA.b(), K.b(R5.b.class))) {
                                R5.b bVar = new R5.b((H5.b) eVar.d(), this.f9527d.f((w) objB));
                                if (this.f9528e) {
                                    listN = this.f9527d.e((H5.b) eVar.d());
                                } else {
                                    listN = D6.r.n();
                                }
                                bVar.o1(listN);
                                cVar = bVar;
                            } else {
                                cVar = new c((H5.b) eVar.d(), (w) objB);
                            }
                            U5.d dVar2 = new U5.d(aVarA, cVar);
                            this.f9525b = null;
                            this.f9524a = 1;
                            if (eVar.h(dVar2, this) == objF) {
                                return objF;
                            }
                        } else {
                            throw new f("Handshake exception, expected `WebSocketSession` content but was " + objB);
                        }
                    } else {
                        throw new f("Handshake exception, expected status code " + aVar.Q().o0() + " but was " + xVarG.o0());
                    }
                }
                return G.f1419a;
            }
        }

        public b() {
        }
    }

    public h(long j8, long j9, u extensionsConfig, p088j6.f fVar) {
        t.g(extensionsConfig, "extensionsConfig");
        this.f9514a = j8;
        this.f9515b = j9;
        this.f9516c = extensionsConfig;
    }

    public final void d(T5.d dVar, List list) {
        if (list.isEmpty()) {
            return;
        }
        T5.k.b(dVar, C1688q.f11910a.x(), z.r0(list, ";", null, null, 0, null, null, 62, null));
    }

    public final List e(H5.b bVar) {
        String strD = bVar.g().a().d(C1688q.f11910a.x());
        if (strD == null || io.ktor.websocket.t.a(strD) == null) {
            D6.r.n();
        }
        List list = (List) bVar.getAttributes().b(i.f9529a);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        s.a(it.next());
        throw null;
    }

    public final io.ktor.websocket.b f(w session) {
        t.g(session, "session");
        if (session instanceof io.ktor.websocket.b) {
            return (io.ktor.websocket.b) session;
        }
        long j8 = this.f9514a;
        io.ktor.websocket.b bVarA = io.ktor.websocket.d.a(session, j8, ((long) 2) * j8);
        bVarA.M1(this.f9515b);
        return bVarA;
    }

    public final void g(T5.d dVar) {
        List listA = this.f9516c.a();
        dVar.c().d(i.f9529a, listA);
        ArrayList arrayList = new ArrayList();
        Iterator it = listA.iterator();
        if (it.hasNext()) {
            s.a(it.next());
            throw null;
        }
        d(dVar, arrayList);
    }

    public /* synthetic */ h(long j8, long j9, u uVar, p088j6.f fVar, int i8, AbstractC2633k abstractC2633k) {
        this(j8, j9, uVar, (i8 & 8) != 0 ? null : fVar);
    }

    public /* synthetic */ h(long j8, long j9, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? -1L : j8, (i8 & 2) != 0 ? 2147483647L : j9);
    }

    public h(long j8, long j9) {
        this(j8, j9, new u(), null, 8, null);
    }

    public h() {
        this(-1L, 2147483647L, new u(), null, 8, null);
    }
}
