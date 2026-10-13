package io.ktor.websocket;

import C6.G;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import kotlin.jvm.internal.AbstractC2633k;
import p017b7.AbstractC1789i;
import p017b7.B0;
import p017b7.I;
import p017b7.InterfaceC1776b0;
import p017b7.InterfaceC1815v0;
import p017b7.InterfaceC1818x;
import p017b7.J;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final I f25690a = new I("ws-ponger");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final I f25691b = new I("ws-pinger");

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f25693b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f25694c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f25695d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ long f25696e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Q6.o f25697f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ p035d7.g f25698g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ p035d7.y f25699h;

        /* JADX INFO: renamed from: io.ktor.websocket.k$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0585a extends I6.l implements Q6.o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f25700a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p035d7.g f25701b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0585a(p035d7.g gVar, G6.d dVar) {
                super(2, dVar);
                this.f25701b = gVar;
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                return new C0585a(this.f25701b, dVar);
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(J j8, G6.d dVar) {
                return ((C0585a) create(j8, dVar)).invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                p035d7.g gVar;
                Object objF = H6.c.f();
                int i8 = this.f25700a;
                if (i8 != 0 && i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
                do {
                    gVar = this.f25701b;
                    this.f25700a = 1;
                } while (gVar.l(this) != objF);
                return objF;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends I6.l implements Q6.o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f25702a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p035d7.y f25703b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f25704c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ p035d7.g f25705d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(p035d7.y yVar, String str, p035d7.g gVar, G6.d dVar) {
                super(2, dVar);
                this.f25703b = yVar;
                this.f25704c = str;
                this.f25705d = gVar;
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                return new b(this.f25703b, this.f25704c, this.f25705d, dVar);
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(J j8, G6.d dVar) {
                return ((b) create(j8, dVar)).invokeSuspend(G.f1419a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
            
                if (r9 == r0) goto L19;
             */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0065 -> B:20:0x0068). Please report as a decompilation issue!!! */
            @Override // I6.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                byte[] bArrG;
                Object objF = H6.c.f();
                int i8 = this.f25702a;
                if (i8 == 0) {
                    C6.r.b(obj);
                    d.e().b("WebSocket Pinger: sending ping frame");
                    p035d7.y yVar = this.f25703b;
                    String str = this.f25704c;
                    Charset charset = Z6.c.f12946g;
                    if (kotlin.jvm.internal.t.c(charset, Z6.c.f12941b)) {
                        bArrG = Z6.v.s(str);
                    } else {
                        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
                        kotlin.jvm.internal.t.f(charsetEncoderNewEncoder, "charset.newEncoder()");
                        bArrG = p197w6.a.g(charsetEncoderNewEncoder, str, 0, str.length());
                    }
                    e.d dVar = new e.d(bArrG);
                    this.f25702a = 1;
                    if (yVar.i(dVar, this) != objF) {
                    }
                    return objF;
                }
                if (i8 == 1) {
                    C6.r.b(obj);
                } else {
                    if (i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C6.r.b(obj);
                }
                e.C0584e c0584e = (e.C0584e) obj;
                byte[] bArrC = c0584e.c();
                if (kotlin.jvm.internal.t.c(new String(bArrC, 0, bArrC.length, Z6.c.f12946g), this.f25704c)) {
                    d.e().b("WebSocket Pinger: received valid pong frame " + c0584e);
                    return G.f1419a;
                }
                d.e().b("WebSocket Pinger: received invalid pong frame " + c0584e + ", continue waiting");
                p035d7.g gVar = this.f25705d;
                this.f25702a = 2;
                obj = gVar.l(this);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j8, long j9, Q6.o oVar, p035d7.g gVar, p035d7.y yVar, G6.d dVar) {
            super(2, dVar);
            this.f25695d = j8;
            this.f25696e = j9;
            this.f25697f = oVar;
            this.f25698g = gVar;
            this.f25699h = yVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return new a(this.f25695d, this.f25696e, this.f25697f, this.f25698g, this.f25699h, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0085  */
        /* JADX WARN: Code duplicated, block: B:21:0x0086  */
        /* JADX WARN: Code duplicated, block: B:24:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:25:0x00bc A[Catch: p | q | CancellationException -> 0x00e3, p | q | CancellationException -> 0x00e3, p | q | CancellationException -> 0x00e3, PHI: r1 r6 r13
          0x00bc: PHI (r1v7 byte[]) = (r1v5 byte[]), (r1v13 byte[]) binds: [B:23:0x00b9, B:12:0x0027] A[DONT_GENERATE, DONT_INLINE]
          0x00bc: PHI (r6v10 U6.c) = (r6v6 U6.c), (r6v14 U6.c) binds: [B:23:0x00b9, B:12:0x0027] A[DONT_GENERATE, DONT_INLINE]
          0x00bc: PHI (r13v8 java.lang.Object) = (r13v6 java.lang.Object), (r13v0 java.lang.Object) binds: [B:23:0x00b9, B:12:0x0027] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {p | q | CancellationException -> 0x00e3, blocks: (B:7:0x0012, B:12:0x0027, B:12:0x0027, B:12:0x0027, B:25:0x00bc, B:25:0x00bc, B:25:0x00bc, B:27:0x00c0, B:27:0x00c0, B:27:0x00c0, B:18:0x0070, B:18:0x0070, B:18:0x0070, B:22:0x0087, B:22:0x0087, B:22:0x0087, B:15:0x0034, B:15:0x0034, B:15:0x0034), top: B:34:0x000a }] */
        /* JADX WARN: Code duplicated, block: B:27:0x00c0 A[Catch: p | q | CancellationException -> 0x00e3, p | q | CancellationException -> 0x00e3, p | q | CancellationException -> 0x00e3, TRY_LEAVE, TryCatch #0 {p | q | CancellationException -> 0x00e3, blocks: (B:7:0x0012, B:12:0x0027, B:12:0x0027, B:12:0x0027, B:25:0x00bc, B:25:0x00bc, B:25:0x00bc, B:27:0x00c0, B:27:0x00c0, B:27:0x00c0, B:18:0x0070, B:18:0x0070, B:18:0x0070, B:22:0x0087, B:22:0x0087, B:22:0x0087, B:15:0x0034, B:15:0x0034, B:15:0x0034), top: B:34:0x000a }] */
        /* JADX WARN: Code duplicated, block: B:30:0x00e1  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00b9 -> B:25:0x00bc). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // I6.a
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 230
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.k.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1818x f25706a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC1818x interfaceC1818x) {
            super(1);
            this.f25706a = interfaceC1818x;
        }

        public final void b(Throwable th) {
            InterfaceC1815v0.a.a(this.f25706a, null, 1, null);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25707a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f25708b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f25709c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f25710d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p035d7.g f25711e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ p035d7.y f25712f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(p035d7.g gVar, p035d7.y yVar, G6.d dVar) {
            super(2, dVar);
            this.f25711e = gVar;
            this.f25712f = yVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return new c(this.f25711e, this.f25712f, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((c) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0052  */
        /* JADX WARN: Code duplicated, block: B:22:0x0053  */
        /* JADX WARN: Code duplicated, block: B:25:0x005f A[Catch: all -> 0x001f, TryCatch #2 {all -> 0x001f, blocks: (B:7:0x001a, B:19:0x0044, B:23:0x0056, B:25:0x005f, B:28:0x0086, B:14:0x0035, B:18:0x0040), top: B:38:0x0008, outer: #0 }] */
        /* JADX WARN: Code duplicated, block: B:28:0x0086 A[Catch: all -> 0x001f, TRY_LEAVE, TryCatch #2 {all -> 0x001f, blocks: (B:7:0x001a, B:19:0x0044, B:23:0x0056, B:25:0x005f, B:28:0x0086, B:14:0x0035, B:18:0x0040), top: B:38:0x0008, outer: #0 }] */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0083, code lost:
        
            if (r5.i(r7, r10) == r0) goto L27;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0083 -> B:8:0x001d). Please report as a decompilation issue!!! */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            p035d7.x xVar;
            p035d7.y yVar;
            p035d7.i it;
            p035d7.y yVar2;
            Object objA;
            Object objF = H6.c.f();
            int i8 = this.f25710d;
            try {
                try {
                    if (i8 == 0) {
                        C6.r.b(obj);
                        xVar = this.f25711e;
                        yVar = this.f25712f;
                        it = xVar.iterator();
                        this.f25707a = yVar;
                        this.f25708b = xVar;
                        this.f25709c = it;
                        this.f25710d = 1;
                        objA = it.a(this);
                        if (objA == objF) {
                            yVar2 = yVar;
                            obj = objA;
                            if (((Boolean) obj).booleanValue()) {
                                G g8 = G.f1419a;
                                p035d7.m.a(xVar, null);
                                return G.f1419a;
                            }
                            e.d dVar = (e.d) it.next();
                            d.e().b("Received ping message, sending pong message");
                            e.C0584e c0584e = new e.C0584e(dVar.c(), (InterfaceC1776b0) null, 2, (AbstractC2633k) null);
                            this.f25707a = yVar2;
                            this.f25708b = xVar;
                            this.f25709c = it;
                            this.f25710d = 2;
                        }
                        return objF;
                    }
                    if (i8 == 1) {
                        it = (p035d7.i) this.f25709c;
                        xVar = (p035d7.x) this.f25708b;
                        yVar2 = (p035d7.y) this.f25707a;
                        C6.r.b(obj);
                        if (((Boolean) obj).booleanValue()) {
                            G g9 = G.f1419a;
                            p035d7.m.a(xVar, null);
                            return G.f1419a;
                        }
                        e.d dVar2 = (e.d) it.next();
                        d.e().b("Received ping message, sending pong message");
                        e.C0584e c0584e2 = new e.C0584e(dVar2.c(), (InterfaceC1776b0) null, 2, (AbstractC2633k) null);
                        this.f25707a = yVar2;
                        this.f25708b = xVar;
                        this.f25709c = it;
                        this.f25710d = 2;
                    } else {
                        if (i8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = (p035d7.i) this.f25709c;
                        xVar = (p035d7.x) this.f25708b;
                        yVar2 = (p035d7.y) this.f25707a;
                        C6.r.b(obj);
                    }
                    yVar = yVar2;
                    this.f25707a = yVar;
                    this.f25708b = xVar;
                    this.f25709c = it;
                    this.f25710d = 1;
                    objA = it.a(this);
                    if (objA == objF) {
                        yVar2 = yVar;
                        obj = objA;
                        if (((Boolean) obj).booleanValue()) {
                            e.d dVar3 = (e.d) it.next();
                            d.e().b("Received ping message, sending pong message");
                            e.C0584e c0584e3 = new e.C0584e(dVar3.c(), (InterfaceC1776b0) null, 2, (AbstractC2633k) null);
                            this.f25707a = yVar2;
                            this.f25708b = xVar;
                            this.f25709c = it;
                            this.f25710d = 2;
                        } else {
                            G g10 = G.f1419a;
                            p035d7.m.a(xVar, null);
                        }
                        return G.f1419a;
                    }
                    return objF;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        p035d7.m.a(xVar, th);
                        throw th2;
                    }
                }
            } catch (p035d7.q unused) {
            }
        }
    }

    public static final p035d7.y a(J j8, p035d7.y outgoing, long j9, long j10, Q6.o onTimeout) {
        kotlin.jvm.internal.t.g(j8, "<this>");
        kotlin.jvm.internal.t.g(outgoing, "outgoing");
        kotlin.jvm.internal.t.g(onTimeout, "onTimeout");
        InterfaceC1818x interfaceC1818xB = B0.b(null, 1, null);
        p035d7.g gVarB = p035d7.j.b(Integer.MAX_VALUE, null, null, 6, null);
        AbstractC1789i.d(j8, interfaceC1818xB.P1(f25691b), null, new a(j9, j10, onTimeout, gVarB, outgoing, null), 2, null);
        G6.g.b bVarA = j8.getCoroutineContext().A(InterfaceC1815v0.f15985O);
        kotlin.jvm.internal.t.d(bVarA);
        ((InterfaceC1815v0) bVarA).H0(new b(interfaceC1818xB));
        return gVarB;
    }

    public static final p035d7.y b(J j8, p035d7.y outgoing) {
        kotlin.jvm.internal.t.g(j8, "<this>");
        kotlin.jvm.internal.t.g(outgoing, "outgoing");
        p035d7.g gVarB = p035d7.j.b(5, null, null, 6, null);
        AbstractC1789i.d(j8, f25690a, null, new c(gVarB, outgoing, null), 2, null);
        return gVarB;
    }
}
