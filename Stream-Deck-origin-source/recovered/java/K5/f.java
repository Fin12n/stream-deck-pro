package K5;

import C6.r;
import I6.l;
import Q6.o;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.t;
import p017b7.AbstractC1816w;
import p017b7.InterfaceC1812u;
import p035d7.m;
import p035d7.y;
import p135p0.Dyk.GOKsbdzhLhXAMt;
import u7.B;
import u7.F;
import u7.G;
import u7.x;
import u7.z;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends G implements io.ktor.websocket.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f4702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F.a f4703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final G6.g f4704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1812u f4705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC1812u f4706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p035d7.g f4707f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC1812u f4708g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y f4709h;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f4710a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f4711b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f4712c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f4713d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ z f4715f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(z zVar, G6.d dVar) {
            super(2, dVar);
            this.f4715f = zVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            a aVar = f.this.new a(this.f4715f, dVar);
            aVar.f4713d = obj;
            return aVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(p035d7.c cVar, G6.d dVar) {
            return ((a) create(cVar, dVar)).invokeSuspend(C6.G.f1419a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0080, code lost:
        
            if (r10 == r0) goto L23;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0080 -> B:24:0x0083). Please report as a decompilation issue!!! */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            p035d7.c cVar;
            z zVar;
            F.a aVar;
            F fA;
            io.ktor.websocket.a aVar2;
            F f8;
            Throwable th;
            p035d7.i it;
            Object objF = H6.c.f();
            int i8 = this.f4712c;
            try {
                if (i8 == 0) {
                    r.b(obj);
                    cVar = (p035d7.c) this.f4713d;
                    F.a aVar3 = f.this.f4703b;
                    zVar = this.f4715f;
                    InterfaceC1812u interfaceC1812u = f.this.f4705d;
                    this.f4713d = cVar;
                    this.f4710a = aVar3;
                    this.f4711b = zVar;
                    this.f4712c = 1;
                    Object objQ0 = interfaceC1812u.Q0(this);
                    if (objQ0 != objF) {
                        aVar = aVar3;
                        obj = objQ0;
                    }
                    return objF;
                }
                if (i8 == 1) {
                    zVar = (z) this.f4711b;
                    aVar = (F.a) this.f4710a;
                    cVar = (p035d7.c) this.f4713d;
                    r.b(obj);
                } else {
                    if (i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (p035d7.i) this.f4711b;
                    aVar2 = (io.ktor.websocket.a) this.f4710a;
                    f8 = (F) this.f4713d;
                    try {
                        r.b(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            try {
                                f8.d(aVar2.a(), aVar2.c());
                                return C6.G.f1419a;
                            } catch (Throwable th2) {
                                f8.cancel();
                                throw th2;
                            }
                        }
                        io.ktor.websocket.e eVar = (io.ktor.websocket.e) it.next();
                        if (eVar instanceof io.ktor.websocket.e.a) {
                            f8.e(J7.h.f4388d.e(eVar.c(), 0, eVar.c().length));
                        } else {
                            if (!(eVar instanceof io.ktor.websocket.e.f)) {
                                if (!(eVar instanceof io.ktor.websocket.e.b)) {
                                    throw new k(eVar);
                                }
                                io.ktor.websocket.a aVarA = io.ktor.websocket.f.a((io.ktor.websocket.e.b) eVar);
                                t.d(aVarA);
                                if (!g.c(aVarA)) {
                                    aVar2 = aVarA;
                                }
                                C6.G g8 = C6.G.f1419a;
                                try {
                                    f8.d(aVar2.a(), aVar2.c());
                                    return g8;
                                } catch (Throwable th3) {
                                    f8.cancel();
                                    throw th3;
                                }
                            }
                            f8.a(new String(eVar.c(), Z6.c.f12941b));
                        }
                        this.f4713d = f8;
                        this.f4710a = aVar2;
                        this.f4711b = it;
                        this.f4712c = 2;
                        obj = it.a(this);
                    } catch (Throwable th4) {
                        th = th4;
                        try {
                            f8.d(aVar2.a(), aVar2.c());
                            throw th;
                        } catch (Throwable th5) {
                            f8.cancel();
                            throw th5;
                        }
                    }
                }
                it = cVar.e().iterator();
                f8 = fA;
                this.f4713d = f8;
                this.f4710a = aVar2;
                this.f4711b = it;
                this.f4712c = 2;
                obj = it.a(this);
            } catch (Throwable th6) {
                f8 = fA;
                th = th6;
                f8.d(aVar2.a(), aVar2.c());
                throw th;
            }
            fA = aVar.a(zVar, (G) obj);
            aVar2 = g.f4716a;
        }
    }

    public f(x engine, F.a webSocketFactory, z engineRequest, G6.g coroutineContext) {
        t.g(engine, "engine");
        t.g(webSocketFactory, "webSocketFactory");
        t.g(engineRequest, "engineRequest");
        t.g(coroutineContext, "coroutineContext");
        this.f4702a = engine;
        this.f4703b = webSocketFactory;
        this.f4704c = coroutineContext;
        this.f4705d = AbstractC1816w.b(null, 1, null);
        this.f4706e = AbstractC1816w.b(null, 1, null);
        this.f4707f = p035d7.j.b(0, null, null, 7, null);
        this.f4708g = AbstractC1816w.b(null, 1, null);
        this.f4709h = p035d7.b.b(this, null, 0, null, null, new a(engineRequest, null), 15, null);
    }

    @Override // io.ktor.websocket.w
    public y J0() {
        return this.f4709h;
    }

    @Override // io.ktor.websocket.w
    public void M1(long j8) {
        throw new R5.f("Max frame size switch is not supported in OkHttp engine.");
    }

    @Override // io.ktor.websocket.w
    public long X1() {
        return Long.MAX_VALUE;
    }

    @Override // u7.G
    public void b(F webSocket, int i8, String reason) {
        t.g(webSocket, "webSocket");
        t.g(reason, "reason");
        super.b(webSocket, i8, reason);
        short s8 = (short) i8;
        this.f4708g.r1(new io.ktor.websocket.a(s8, reason));
        try {
            m.b(J0(), new io.ktor.websocket.e.b(new io.ktor.websocket.a(s8, reason)));
        } catch (Throwable unused) {
        }
        y.a.a(this.f4707f, null, 1, null);
    }

    @Override // io.ktor.websocket.w
    public p035d7.x c() {
        return this.f4707f;
    }

    @Override // u7.G
    public void d(F webSocket, Throwable t8, B b8) {
        t.g(webSocket, "webSocket");
        t.g(t8, "t");
        super.d(webSocket, t8, b8);
        this.f4708g.v(t8);
        this.f4706e.v(t8);
        this.f4707f.d(t8);
        J0().d(t8);
    }

    @Override // u7.G
    public void f(F webSocket, J7.h bytes) {
        t.g(webSocket, "webSocket");
        t.g(bytes, "bytes");
        super.f(webSocket, bytes);
        m.b(this.f4707f, new io.ktor.websocket.e.a(true, bytes.K()));
    }

    @Override // u7.G
    public void g(F webSocket, String text) {
        t.g(webSocket, "webSocket");
        t.g(text, "text");
        super.g(webSocket, text);
        p035d7.g gVar = this.f4707f;
        byte[] bytes = text.getBytes(Z6.c.f12941b);
        t.f(bytes, "getBytes(...)");
        m.b(gVar, new io.ktor.websocket.e.f(true, bytes));
    }

    @Override // p017b7.J
    public G6.g getCoroutineContext() {
        return this.f4704c;
    }

    @Override // u7.G
    public void h(F webSocket, B response) {
        t.g(webSocket, "webSocket");
        t.g(response, "response");
        super.h(webSocket, response);
        this.f4706e.r1(response);
    }

    public final InterfaceC1812u k() {
        return this.f4706e;
    }

    public final void l() {
        this.f4705d.r1(this);
    }

    @Override // io.ktor.websocket.b
    public void o1(List negotiatedExtensions) {
        t.g(negotiatedExtensions, "negotiatedExtensions");
        if (!negotiatedExtensions.isEmpty()) {
            throw new IllegalArgumentException("Extensions are not supported.");
        }
    }

    @Override // io.ktor.websocket.w
    public Object q1(io.ktor.websocket.e eVar, G6.d dVar) {
        return io.ktor.websocket.b.a.a(this, eVar, dVar);
    }

    @Override // io.ktor.websocket.w
    public Object w0(G6.d dVar) {
        return C6.G.f1419a;
    }

    @Override // u7.G
    public void a(F webSocket, int i8, String reason) {
        Object objValueOf;
        t.g(webSocket, "webSocket");
        t.g(reason, "reason");
        super.a(webSocket, i8, reason);
        short s8 = (short) i8;
        this.f4708g.r1(new io.ktor.websocket.a(s8, reason));
        y.a.a(this.f4707f, null, 1, null);
        y yVarJ0 = J0();
        StringBuilder sb = new StringBuilder();
        sb.append(GOKsbdzhLhXAMt.vWdgPHWLvCZk);
        io.ktor.websocket.a.EnumC0581a enumC0581aA = io.ktor.websocket.a.EnumC0581a.f25580b.a(s8);
        if (enumC0581aA == null || (objValueOf = enumC0581aA.toString()) == null) {
            objValueOf = Integer.valueOf(i8);
        }
        sb.append(objValueOf);
        sb.append(com.amazon.a.a.o.c.a.b.f16789a);
        yVarJ0.d(new CancellationException(sb.toString()));
    }
}
