package S5;

import C6.G;
import C6.r;
import I6.l;
import Q6.k;
import Q6.o;
import T5.f;
import U5.g;
import V5.e;
import X5.C1692v;
import X5.O;
import X6.m;
import io.ktor.websocket.x;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.AbstractC1789i;
import p017b7.AbstractC1816w;
import p017b7.InterfaceC1812u;
import p017b7.J;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: S5.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0271a extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f9768a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f9769b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f9770c;

        public C0271a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f9769b = obj;
            this.f9770c |= Integer.MIN_VALUE;
            return a.a(null, null, null, null, null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f9771a = new b();

        public b() {
            super(1);
        }

        public final void b(T5.d dVar) {
            t.g(dVar, "$this$null");
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((T5.d) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Integer f9772a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f9773b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Integer num, k kVar) {
            super(1);
            this.f9772a = num;
            this.f9773b = kVar;
        }

        public final void b(T5.d webSocketRawSession) {
            t.g(webSocketRawSession, "$this$webSocketRawSession");
            webSocketRawSession.i().y(O.f11759c.d());
            if (this.f9772a != null) {
                webSocketRawSession.i().x(this.f9772a.intValue());
            }
            this.f9773b.invoke(webSocketRawSession);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((T5.d) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f9774a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f9775b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f9776c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f9777d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ g f9778e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1812u f9779f;

        /* JADX INFO: renamed from: S5.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0272a extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC1812u f9780a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0272a(InterfaceC1812u interfaceC1812u) {
                super(1);
                this.f9780a = interfaceC1812u;
            }

            public final void b(Throwable th) {
                if (th != null) {
                    this.f9780a.v(th);
                } else {
                    this.f9780a.r1(G.f1419a);
                }
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Throwable) obj);
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(g gVar, InterfaceC1812u interfaceC1812u, G6.d dVar) {
            super(2, dVar);
            this.f9778e = gVar;
            this.f9779f = interfaceC1812u;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return new d(this.f9778e, this.f9779f, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((d) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code duplicated, block: B:46:0x00b9 A[Catch: all -> 0x005e, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x005e, blocks: (B:27:0x0059, B:46:0x00b9, B:54:0x00ed, B:55:0x00f4), top: B:71:0x0059 }] */
        /* JADX WARN: Code duplicated, block: B:49:0x00dd  */
        /* JADX WARN: Code duplicated, block: B:54:0x00ed A[Catch: all -> 0x005e, TRY_ENTER, TryCatch #4 {all -> 0x005e, blocks: (B:27:0x0059, B:46:0x00b9, B:54:0x00ed, B:55:0x00f4), top: B:71:0x0059 }] */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00ea, code lost:
        
            if (r2.b(r0, r14) == r1) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x0102, code lost:
        
            if (r2.b(r15, r14) == r1) goto L59;
         */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            g gVar;
            InterfaceC1812u interfaceC1812u;
            U5.c cVar;
            U5.c cVar2;
            g gVar2;
            InterfaceC1812u interfaceC1812u2;
            InterfaceC1812u interfaceC1812uB;
            Object objF = H6.c.f();
            int i8 = this.f9777d;
            try {
                try {
                    try {
                        if (i8 == 0) {
                            r.b(obj);
                            g gVar3 = this.f9778e;
                            InterfaceC1812u interfaceC1812u3 = this.f9779f;
                            this.f9774a = gVar3;
                            this.f9775b = interfaceC1812u3;
                            this.f9777d = 1;
                            Object objE = gVar3.e(this);
                            if (objE != objF) {
                                gVar = gVar3;
                                obj = objE;
                                interfaceC1812u = interfaceC1812u3;
                            }
                            return objF;
                        }
                        if (i8 == 1) {
                            InterfaceC1812u interfaceC1812u4 = (InterfaceC1812u) this.f9775b;
                            g gVar4 = (g) this.f9774a;
                            r.b(obj);
                            interfaceC1812u = interfaceC1812u4;
                            gVar = gVar4;
                        } else {
                            if (i8 != 2) {
                                if (i8 == 3) {
                                    cVar2 = (U5.c) this.f9775b;
                                    gVar = (g) this.f9774a;
                                    try {
                                        r.b(obj);
                                        this.f9774a = G.f1419a;
                                        this.f9775b = null;
                                        this.f9777d = 4;
                                    } catch (Throwable th) {
                                        U5.c cVar3 = cVar2;
                                        th = th;
                                        cVar = cVar3;
                                        this.f9774a = th;
                                        this.f9775b = null;
                                        this.f9776c = null;
                                        this.f9777d = 5;
                                    }
                                } else {
                                    if (i8 != 4) {
                                        if (i8 != 5) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        th = (Throwable) this.f9774a;
                                        r.b(obj);
                                        throw th;
                                    }
                                    r.b(obj);
                                }
                                return G.f1419a;
                            }
                            cVar2 = (U5.c) this.f9776c;
                            interfaceC1812u2 = (InterfaceC1812u) this.f9775b;
                            gVar2 = (g) this.f9774a;
                            try {
                                r.b(obj);
                                if (obj != null) {
                                    throw new NullPointerException("null cannot be cast to non-null type io.ktor.client.plugins.websocket.ClientWebSocketSession");
                                }
                                R5.a aVar = (R5.a) obj;
                                interfaceC1812uB = AbstractC1816w.b(null, 1, null);
                                interfaceC1812u2.r1(aVar);
                                aVar.J0().k(new C0272a(interfaceC1812uB));
                                this.f9774a = gVar2;
                                this.f9775b = cVar2;
                                this.f9776c = null;
                                this.f9777d = 3;
                                if (interfaceC1812uB.Q0(this) != objF) {
                                    gVar = gVar2;
                                    this.f9774a = G.f1419a;
                                    this.f9775b = null;
                                    this.f9777d = 4;
                                }
                                return objF;
                            } catch (Throwable th2) {
                                th = th2;
                                cVar = cVar2;
                                gVar = gVar2;
                                this.f9774a = th;
                                this.f9775b = null;
                                this.f9776c = null;
                                this.f9777d = 5;
                            }
                        }
                        H5.b bVarG1 = cVar.g1();
                        m mVarI = K.i(R5.a.class);
                        p181u6.a aVarC = p181u6.b.c(X6.r.e(mVarI), K.b(R5.a.class), mVarI);
                        this.f9774a = gVar;
                        this.f9775b = interfaceC1812u;
                        this.f9776c = cVar;
                        this.f9777d = 2;
                        Object objA = bVarG1.a(aVarC, this);
                        if (objA != objF) {
                            cVar2 = cVar;
                            obj = objA;
                            gVar2 = gVar;
                            interfaceC1812u2 = interfaceC1812u;
                            if (obj != null) {
                                throw new NullPointerException("null cannot be cast to non-null type io.ktor.client.plugins.websocket.ClientWebSocketSession");
                            }
                            R5.a aVar2 = (R5.a) obj;
                            interfaceC1812uB = AbstractC1816w.b(null, 1, null);
                            interfaceC1812u2.r1(aVar2);
                            aVar2.J0().k(new C0272a(interfaceC1812uB));
                            this.f9774a = gVar2;
                            this.f9775b = cVar2;
                            this.f9776c = null;
                            this.f9777d = 3;
                            if (interfaceC1812uB.Q0(this) != objF) {
                                gVar = gVar2;
                                this.f9774a = G.f1419a;
                                this.f9775b = null;
                                this.f9777d = 4;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        this.f9774a = th;
                        this.f9775b = null;
                        this.f9776c = null;
                        this.f9777d = 5;
                    }
                    cVar = (U5.c) obj;
                    return objF;
                } catch (CancellationException e8) {
                    throw e.a(e8);
                }
            } catch (Throwable th4) {
                this.f9779f.v(th4);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0091  */
    /* JADX WARN: Code duplicated, block: B:43:0x00af A[PHI: r12
      0x00af: PHI (r12v18 R5.a) = (r12v12 R5.a), (r12v21 R5.a) binds: [B:41:0x00ac, B:15:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009b, code lost:
    
        if (io.ktor.websocket.x.b(r12, null, r8, 1, null) == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b8, code lost:
    
        if (r12 == r1) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [G5.a] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v2, types: [io.ktor.websocket.w] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(G5.a aVar, C1692v c1692v, String str, Integer num, String str2, k kVar, o oVar, G6.d dVar) throws Throwable {
        C0271a c0271a;
        o oVar2;
        R5.a aVar2;
        Throwable th;
        R5.a aVar3;
        if (dVar instanceof C0271a) {
            c0271a = (C0271a) dVar;
            int i8 = c0271a.f9770c;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0271a.f9770c = i8 - Integer.MIN_VALUE;
            } else {
                c0271a = new C0271a(dVar);
            }
        } else {
            c0271a = new C0271a(dVar);
        }
        C0271a c0271a2 = c0271a;
        Object obj = c0271a2.f9769b;
        Object objF = H6.c.f();
        try {
            switch (c0271a2.f9770c) {
                case 0:
                    r.b(obj);
                    c cVar = new c(num, kVar);
                    c0271a2.f9768a = oVar;
                    c0271a2.f9770c = 1;
                    Object objC = c(aVar, c1692v, str, num, str2, cVar, c0271a2);
                    if (objC != objF) {
                        obj = objC;
                        oVar2 = oVar;
                        aVar2 = (R5.a) obj;
                        try {
                            c0271a2.f9768a = aVar2;
                            c0271a2.f9770c = 2;
                            if (oVar2.invoke(aVar2, c0271a2) != objF) {
                                aVar3 = aVar2;
                                c0271a2.f9768a = null;
                                c0271a2.f9770c = 3;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            aVar3 = aVar2;
                            c0271a2.f9768a = aVar3;
                            c0271a2.f9770c = 4;
                            if (x.c(aVar3, th, c0271a2) != objF) {
                                c0271a2.f9768a = null;
                                c0271a2.f9770c = 5;
                                aVar = x.b(aVar3, null, c0271a2, 1, null);
                            }
                        }
                        break;
                    }
                    return objF;
                case 1:
                    oVar2 = (o) c0271a2.f9768a;
                    r.b(obj);
                    aVar2 = (R5.a) obj;
                    c0271a2.f9768a = aVar2;
                    c0271a2.f9770c = 2;
                    if (oVar2.invoke(aVar2, c0271a2) != objF) {
                        aVar3 = aVar2;
                        c0271a2.f9768a = null;
                        c0271a2.f9770c = 3;
                        break;
                    }
                    return objF;
                case 2:
                    aVar3 = (R5.a) c0271a2.f9768a;
                    try {
                        r.b(obj);
                        c0271a2.f9768a = null;
                        c0271a2.f9770c = 3;
                    } catch (Throwable th3) {
                        th = th3;
                        c0271a2.f9768a = aVar3;
                        c0271a2.f9770c = 4;
                        if (x.c(aVar3, th, c0271a2) != objF) {
                            c0271a2.f9768a = null;
                            c0271a2.f9770c = 5;
                            aVar = x.b(aVar3, null, c0271a2, 1, null);
                        }
                    }
                    break;
                case 3:
                case 5:
                    r.b(obj);
                    return G.f1419a;
                case 4:
                    aVar3 = (R5.a) c0271a2.f9768a;
                    r.b(obj);
                    c0271a2.f9768a = null;
                    c0271a2.f9770c = 5;
                    aVar = x.b(aVar3, null, c0271a2, 1, null);
                    break;
                case 6:
                    Throwable th4 = (Throwable) c0271a2.f9768a;
                    r.b(obj);
                    throw th4;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Throwable th5) {
            ?? r13 = aVar;
            c0271a2.f9768a = th5;
            c0271a2.f9770c = 6;
            if (x.b(r13, null, c0271a2, 1, null) != objF) {
                throw th5;
            }
        }
    }

    public static /* synthetic */ Object b(G5.a aVar, C1692v c1692v, String str, Integer num, String str2, k kVar, o oVar, G6.d dVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            c1692v = C1692v.f11962b.b();
        }
        if ((i8 & 2) != 0) {
            str = null;
        }
        if ((i8 & 4) != 0) {
            num = null;
        }
        if ((i8 & 8) != 0) {
            str2 = null;
        }
        if ((i8 & 16) != 0) {
            kVar = b.f9771a;
        }
        k kVar2 = kVar;
        return a(aVar, c1692v, str, num, str2, kVar2, oVar, dVar);
    }

    public static final Object c(G5.a aVar, C1692v c1692v, String str, Integer num, String str2, k kVar, G6.d dVar) {
        T5.d dVar2 = new T5.d();
        dVar2.n(c1692v);
        f.f(dVar2, "ws", str, num, str2, null, 16, null);
        kVar.invoke(dVar2);
        g gVar = new g(dVar2, aVar);
        InterfaceC1812u interfaceC1812uB = AbstractC1816w.b(null, 1, null);
        AbstractC1789i.d(aVar, null, null, new d(gVar, interfaceC1812uB, null), 3, null);
        return interfaceC1812uB.Q0(dVar);
    }
}
