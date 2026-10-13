package M3;

import C6.G;
import com.elgato.vsd2.Messages;
import kotlin.jvm.internal.AbstractC2633k;
import p017b7.AbstractC1789i;
import p017b7.InterfaceC1776b0;
import p017b7.J;
import p017b7.K;
import p017b7.V0;
import p017b7.X0;
import p035d7.x;
import p143q0.nKy.bGZGhbtQmA;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class t implements k, J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f5511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.elgato.streamdeck.vsd2.connection.a f5512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final R5.a f5513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p035d7.g f5514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x f5515e;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5516a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f5517b;

        /* JADX INFO: renamed from: M3.t$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0200a extends I6.l implements Q6.o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f5519a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f5520b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0200a(t tVar, G6.d dVar) {
                super(2, dVar);
                this.f5520b = tVar;
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                return new C0200a(this.f5520b, dVar);
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(J j8, G6.d dVar) {
                return ((C0200a) create(j8, dVar)).invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                Object objF = H6.c.f();
                int i8 = this.f5519a;
                if (i8 != 0) {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C6.r.b(obj);
                    return obj;
                }
                C6.r.b(obj);
                x xVarC = this.f5520b.f5513c.c();
                this.f5519a = 1;
                Object objL = xVarC.l(this);
                return objL == objF ? objF : objL;
            }
        }

        public a(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            a aVar = t.this.new a(dVar);
            aVar.f5517b = obj;
            return aVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x004b A[Catch: all -> 0x0034, V0 -> 0x009c, TRY_ENTER, TryCatch #2 {V0 -> 0x009c, all -> 0x0034, blocks: (B:13:0x002f, B:23:0x004b, B:27:0x006a, B:18:0x003a), top: B:47:0x000b }] */
        /* JADX WARN: Code duplicated, block: B:25:0x0066  */
        /* JADX WARN: Code duplicated, block: B:26:0x0067  */
        /* JADX WARN: Code duplicated, block: B:45:0x00c1  */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
        
            if (r7.g((io.ktor.websocket.e) r12, r11) == r0) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00ad, code lost:
        
            if (r12.D1("receive timeout", r1, r11) == r0) goto L42;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0076 -> B:14:0x0032). Please report as a decompilation issue!!! */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Throwable th;
            J j8;
            J j9;
            Object objD;
            Object objF = H6.c.f();
            int i8 = this.f5516a;
            try {
                if (i8 == 0) {
                    C6.r.b(obj);
                    j8 = (J) this.f5517b;
                    if (K.h(j8)) {
                        return G.f1419a;
                    }
                    long jD = t.this.f().d();
                    C0200a c0200a = new C0200a(t.this, null);
                    this.f5517b = j8;
                    this.f5516a = 1;
                    objD = X0.d(jD, c0200a, this);
                    if (objD == objF) {
                        j9 = j8;
                        obj = objD;
                        t tVar = t.this;
                        this.f5517b = j9;
                        this.f5516a = 2;
                    }
                    return objF;
                    t.this.f5514d.d(new d.f());
                    return G.f1419a;
                }
                if (i8 == 1) {
                    j9 = (J) this.f5517b;
                    C6.r.b(obj);
                    t tVar2 = t.this;
                    this.f5517b = j9;
                    this.f5516a = 2;
                } else {
                    if (i8 != 2) {
                        if (i8 == 3) {
                            C6.r.b(obj);
                            t.this.f5514d.d(new d.f());
                            return G.f1419a;
                        }
                        if (i8 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th = (Throwable) this.f5517b;
                        C6.r.b(obj);
                        t.this.f5514d.d(th);
                        return G.f1419a;
                    }
                    j9 = (J) this.f5517b;
                    C6.r.b(obj);
                }
                j8 = j9;
                if (K.h(j8)) {
                    return G.f1419a;
                }
                long jD2 = t.this.f().d();
                C0200a c0200a2 = new C0200a(t.this, null);
                this.f5517b = j8;
                this.f5516a = 1;
                objD = X0.d(jD2, c0200a2, this);
                if (objD == objF) {
                    j9 = j8;
                    obj = objD;
                    t tVar3 = t.this;
                    this.f5517b = j9;
                    this.f5516a = 2;
                }
                return objF;
            } catch (V0 unused) {
                t tVar4 = t.this;
                d.f fVar = new d.f();
                this.f5517b = null;
                this.f5516a = 3;
            } catch (Throwable th2) {
                t tVar5 = t.this;
                d dVar = th2 instanceof d ? th2 : null;
                this.f5517b = th2;
                this.f5516a = 4;
                if (tVar5.D1(null, dVar, this) != objF) {
                    th = th2;
                }
                return objF;
            }
            t.this.f5514d.d(new d.f());
            return G.f1419a;
        }
    }

    @Override // M3.k
    public Object D1(String str, d dVar, G6.d dVar2) {
        io.ktor.websocket.a.EnumC0581a enumC0581a = dVar instanceof d.c ? true : dVar instanceof d.e ? io.ktor.websocket.a.EnumC0581a.VIOLATED_POLICY : io.ktor.websocket.a.EnumC0581a.GOING_AWAY;
        R5.a aVar = this.f5513c;
        if (str == null) {
            str = "";
        }
        Object objA = io.ktor.websocket.x.a(aVar, new io.ktor.websocket.a(enumC0581a, str), dVar2);
        return objA == H6.c.f() ? objA : G.f1419a;
    }

    @Override // M3.k
    public x c() {
        return this.f5515e;
    }

    public final f f() {
        return this.f5511a;
    }

    public final Object g(io.ktor.websocket.e eVar, G6.d dVar) throws d.c, d.a {
        c cVar;
        if (eVar instanceof io.ktor.websocket.e.f ? true : eVar instanceof io.ktor.websocket.e.C0584e) {
            throw new d.c();
        }
        if (eVar instanceof io.ktor.websocket.e.a) {
            Object objI = this.f5514d.i(this.f5512b.b(eVar.c()), dVar);
            return objI == H6.c.f() ? objI : G.f1419a;
        }
        if (eVar instanceof io.ktor.websocket.e.d) {
            Object objQ1 = this.f5513c.q1(new io.ktor.websocket.e.C0584e(new byte[0], (InterfaceC1776b0) null, 2, (AbstractC2633k) null), dVar);
            return objQ1 == H6.c.f() ? objQ1 : G.f1419a;
        }
        if (!(eVar instanceof io.ktor.websocket.e.b)) {
            return G.f1419a;
        }
        io.ktor.websocket.a aVarA = io.ktor.websocket.f.a((io.ktor.websocket.e.b) eVar);
        if (aVarA != null && aVarA.a() == io.ktor.websocket.a.EnumC0581a.VIOLATED_POLICY.c()) {
            cVar = new c(aVarA.c(), new d.e(aVarA.c()));
        } else {
            cVar = new c(aVarA != null ? aVarA.c() : null, null, 2, null);
        }
        throw new d.a(cVar);
    }

    @Override // p017b7.J
    public G6.g getCoroutineContext() {
        return this.f5513c.getCoroutineContext();
    }

    @Override // M3.k
    public Object k1(Messages.ClientMessage clientMessage, G6.d dVar) {
        Object objD = io.ktor.websocket.x.d(this.f5513c, this.f5512b.a(clientMessage), dVar);
        return objD == H6.c.f() ? objD : G.f1419a;
    }

    public t(f options, com.elgato.streamdeck.vsd2.connection.a aVar, R5.a session) {
        kotlin.jvm.internal.t.g(options, "options");
        kotlin.jvm.internal.t.g(aVar, bGZGhbtQmA.tEVIA);
        kotlin.jvm.internal.t.g(session, "session");
        this.f5511a = options;
        this.f5512b = aVar;
        this.f5513c = session;
        p035d7.g gVarB = p035d7.j.b(0, null, null, 7, null);
        this.f5514d = gVarB;
        this.f5515e = gVarB;
        AbstractC1789i.d(this, null, null, new a(null), 3, null);
    }
}
