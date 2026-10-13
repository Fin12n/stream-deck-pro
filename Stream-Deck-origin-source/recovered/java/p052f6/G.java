package p052f6;

import C6.r;
import G6.g;
import I6.l;
import Q6.o;
import io.ktor.utils.io.B;
import io.ktor.utils.io.C;
import io.ktor.utils.io.InterfaceC2442c;
import io.ktor.utils.io.j;
import io.ktor.utils.io.k;
import io.ktor.utils.io.z;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.t;
import p017b7.I;
import p017b7.J;
import p035d7.i;
import p035d7.m;
import p035d7.q;
import p035d7.x;
import p035d7.y;
import p043e6.n;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class G implements J, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f21997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f21998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f21999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f22000d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22001a;

        static {
            int[] iArr = new int[E.values().length];
            try {
                iArr[E.ApplicationData.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f22001a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f22002a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f22003b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f22004c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f22005d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f22007f;

        public b(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f22005d = obj;
            this.f22007f |= Integer.MIN_VALUE;
            return G.this.z(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f22008a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f22009b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f22010c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f22011d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f22012e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f22013f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f22015h;

        public c(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f22013f = obj;
            this.f22015h |= Integer.MIN_VALUE;
            return G.this.A(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f22016a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f22017b;

        public d(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            d dVar2 = G.this.new d(dVar);
            dVar2.f22017b = obj;
            return dVar2;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C c8, G6.d dVar) {
            return ((d) create(c8, dVar)).invokeSuspend(C6.G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f22016a;
            if (i8 == 0) {
                r.b(obj);
                C c8 = (C) this.f22017b;
                G g8 = G.this;
                j jVarMo220e = c8.mo220e();
                this.f22016a = 1;
                if (g8.z(jVarMo220e, this) == objF) {
                    return objF;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            return C6.G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f22019a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f22020b;

        public e(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            e eVar = G.this.new e(dVar);
            eVar.f22020b = obj;
            return eVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(z zVar, G6.d dVar) {
            return ((e) create(zVar, dVar)).invokeSuspend(C6.G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f22019a;
            if (i8 == 0) {
                r.b(obj);
                z zVar = (z) this.f22020b;
                G g8 = G.this;
                io.ktor.utils.io.g gVarMo220e = zVar.mo220e();
                this.f22019a = 1;
                if (g8.A(gVarMo220e, this) == objF) {
                    return objF;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            return C6.G.f1419a;
        }
    }

    public G(x input, y output, n socket, g coroutineContext) {
        t.g(input, "input");
        t.g(output, "output");
        t.g(socket, "socket");
        t.g(coroutineContext, "coroutineContext");
        this.f21997a = input;
        this.f21998b = output;
        this.f21999c = socket;
        this.f22000d = coroutineContext;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0093  */
    /* JADX WARN: Code duplicated, block: B:28:0x0094  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a7 A[Catch: all -> 0x0049, q -> 0x00ec, TRY_LEAVE, TryCatch #5 {q -> 0x00ec, all -> 0x0049, blocks: (B:13:0x0041, B:25:0x007e, B:29:0x009e, B:31:0x00a7, B:33:0x00ba, B:37:0x00d8, B:38:0x00db, B:20:0x0066), top: B:53:0x0029, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00dc A[Catch: all -> 0x00e3, TRY_ENTER, TryCatch #1 {all -> 0x00e3, blocks: (B:39:0x00dc, B:40:0x00de, B:43:0x00e6, B:44:0x00eb, B:45:0x00ec, B:13:0x0041, B:25:0x007e, B:29:0x009e, B:31:0x00a7, B:33:0x00ba, B:37:0x00d8, B:38:0x00db, B:20:0x0066), top: B:53:0x0029, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d4, code lost:
    
        if (r0.i(r12, r1) == r3) goto L35;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00d4 -> B:14:0x0044). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object A(io.ktor.utils.io.g gVar, G6.d dVar) throws Throwable {
        c cVar;
        G g8;
        y yVar;
        p221z6.g gVarA;
        Object objB0;
        G g9;
        p221z6.g gVar2;
        c cVar2;
        ByteBuffer byteBuffer;
        io.ktor.utils.io.g gVar3;
        io.ktor.utils.io.g gVar4;
        ByteBuffer byteBuffer2;
        p205x6.j jVar;
        Object objT;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i8 = cVar.f22015h;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                cVar.f22015h = i8 - Integer.MIN_VALUE;
                g8 = this;
            } else {
                g8 = this;
                cVar = g8.new c(dVar);
            }
        } else {
            g8 = this;
            cVar = g8.new c(dVar);
        }
        Object obj = cVar.f22013f;
        Object objF = H6.c.f();
        int i9 = cVar.f22015h;
        try {
            try {
                if (i9 == 0) {
                    r.b(obj);
                    gVarA = io.ktor.network.util.a.a();
                    objB0 = gVarA.b0();
                    try {
                        g9 = g8;
                        gVar2 = gVarA;
                        cVar2 = cVar;
                        byteBuffer = (ByteBuffer) objB0;
                        gVar3 = gVar;
                        byteBuffer.clear();
                        cVar2.f22008a = g9;
                        cVar2.f22009b = gVar3;
                        cVar2.f22010c = gVar2;
                        cVar2.f22011d = objB0;
                        cVar2.f22012e = byteBuffer;
                        cVar2.f22015h = 1;
                        objT = gVar3.t(byteBuffer, cVar2);
                        if (objT == objF) {
                            gVar4 = gVar3;
                            obj = objT;
                            c cVar3 = cVar2;
                            byteBuffer2 = byteBuffer;
                            cVar = cVar3;
                            if (((Number) obj).intValue() == -1) {
                                yVar = g9.f21998b;
                                y.a.a(yVar, null, 1, null);
                                gVarA = gVar2;
                                C6.G g10 = C6.G.f1419a;
                                gVarA.H1(objB0);
                                return C6.G.f1419a;
                            }
                            byteBuffer2.flip();
                            y yVar2 = g9.f21998b;
                            E e8 = E.ApplicationData;
                            jVar = new p205x6.j(null, 1, null);
                            p205x6.t.a(jVar, byteBuffer2);
                            D d8 = new D(e8, null, jVar.M1(), 2, null);
                            cVar.f22008a = g9;
                            cVar.f22009b = gVar4;
                            cVar.f22010c = gVar2;
                            cVar.f22011d = objB0;
                            cVar.f22012e = byteBuffer2;
                            cVar.f22015h = 2;
                        }
                        return objF;
                    } catch (Throwable th) {
                        th = th;
                        gVarA.H1(objB0);
                        throw th;
                    }
                }
                if (i9 == 1) {
                    byteBuffer2 = (ByteBuffer) cVar.f22012e;
                    objB0 = cVar.f22011d;
                    gVar2 = (p221z6.g) cVar.f22010c;
                    gVar4 = (io.ktor.utils.io.g) cVar.f22009b;
                    g9 = (G) cVar.f22008a;
                    r.b(obj);
                    if (((Number) obj).intValue() == -1) {
                        yVar = g9.f21998b;
                        y.a.a(yVar, null, 1, null);
                        gVarA = gVar2;
                        C6.G g11 = C6.G.f1419a;
                        gVarA.H1(objB0);
                        return C6.G.f1419a;
                    }
                    try {
                        byteBuffer2.flip();
                        y yVar3 = g9.f21998b;
                        E e9 = E.ApplicationData;
                        jVar = new p205x6.j(null, 1, null);
                        p205x6.t.a(jVar, byteBuffer2);
                        D d9 = new D(e9, null, jVar.M1(), 2, null);
                        cVar.f22008a = g9;
                        cVar.f22009b = gVar4;
                        cVar.f22010c = gVar2;
                        cVar.f22011d = objB0;
                        cVar.f22012e = byteBuffer2;
                        cVar.f22015h = 2;
                    } catch (Throwable th2) {
                        jVar.T0();
                        throw th2;
                    }
                } else {
                    if (i9 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    byteBuffer2 = (ByteBuffer) cVar.f22012e;
                    objB0 = cVar.f22011d;
                    gVar2 = (p221z6.g) cVar.f22010c;
                    gVar4 = (io.ktor.utils.io.g) cVar.f22009b;
                    g9 = (G) cVar.f22008a;
                    r.b(obj);
                }
                ByteBuffer byteBuffer3 = byteBuffer2;
                cVar2 = cVar;
                byteBuffer = byteBuffer3;
                gVar3 = gVar4;
                byteBuffer.clear();
                cVar2.f22008a = g9;
                cVar2.f22009b = gVar3;
                cVar2.f22010c = gVar2;
                cVar2.f22011d = objB0;
                cVar2.f22012e = byteBuffer;
                cVar2.f22015h = 1;
                objT = gVar3.t(byteBuffer, cVar2);
                if (objT == objF) {
                    gVar4 = gVar3;
                    obj = objT;
                    c cVar4 = cVar2;
                    byteBuffer2 = byteBuffer;
                    cVar = cVar4;
                    if (((Number) obj).intValue() == -1) {
                        yVar = g9.f21998b;
                        y.a.a(yVar, null, 1, null);
                        gVarA = gVar2;
                        C6.G g12 = C6.G.f1419a;
                        gVarA.H1(objB0);
                        return C6.G.f1419a;
                    }
                    byteBuffer2.flip();
                    y yVar4 = g9.f21998b;
                    E e10 = E.ApplicationData;
                    jVar = new p205x6.j(null, 1, null);
                    p205x6.t.a(jVar, byteBuffer2);
                    D d10 = new D(e10, null, jVar.M1(), 2, null);
                    cVar.f22008a = g9;
                    cVar.f22009b = gVar4;
                    cVar.f22010c = gVar2;
                    cVar.f22011d = objB0;
                    cVar.f22012e = byteBuffer2;
                    cVar.f22015h = 2;
                }
                return objF;
            } catch (Throwable th3) {
                th = th3;
                gVarA = gVar2;
                gVarA.H1(objB0);
                throw th;
            }
        } catch (q unused) {
            yVar = g9.f21998b;
        } catch (Throwable th4) {
            y.a.a(g9.f21998b, null, 1, null);
            throw th4;
        }
    }

    @Override // p043e6.a
    public B b(InterfaceC2442c channel) {
        t.g(channel, "channel");
        return io.ktor.utils.io.q.d(this, getCoroutineContext().P1(new I("cio-tls-input-loop")), channel, new d(null));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f21999c.close();
    }

    @Override // p043e6.b, p017b7.InterfaceC1776b0
    public void d() {
        this.f21999c.d();
    }

    @Override // p017b7.J
    public g getCoroutineContext() {
        return this.f22000d;
    }

    @Override // p043e6.c
    public io.ktor.utils.io.y t(InterfaceC2442c channel) {
        t.g(channel, "channel");
        return io.ktor.utils.io.q.b(this, getCoroutineContext().P1(new I("cio-tls-output-loop")), channel, new e(null));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006e  */
    /* JADX WARN: Code duplicated, block: B:31:0x007b A[Catch: all -> 0x003b, TryCatch #3 {all -> 0x003b, blocks: (B:13:0x0034, B:29:0x0072, B:31:0x007b, B:33:0x0097, B:40:0x00b2, B:41:0x00d9, B:42:0x00da, B:20:0x0052), top: B:54:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0097 A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #3 {all -> 0x003b, blocks: (B:13:0x0034, B:29:0x0072, B:31:0x007b, B:33:0x0097, B:40:0x00b2, B:41:0x00d9, B:42:0x00da, B:20:0x0052), top: B:54:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b2 A[Catch: all -> 0x003b, TRY_ENTER, TryCatch #3 {all -> 0x003b, blocks: (B:13:0x0034, B:29:0x0072, B:31:0x007b, B:33:0x0097, B:40:0x00b2, B:41:0x00d9, B:42:0x00da, B:20:0x0052), top: B:54:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00da A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #3 {all -> 0x003b, blocks: (B:13:0x0034, B:29:0x0072, B:31:0x007b, B:33:0x0097, B:40:0x00b2, B:41:0x00d9, B:42:0x00da, B:20:0x0052), top: B:54:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a7, code lost:
    
        if (r5.K(r14, r0) == r1) goto L35;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:40:0x00b2, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [d7.x] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2, types: [d7.x] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [d7.x, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a7 -> B:14:0x0037). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object z(j jVar, G6.d dVar) {
        b bVar;
        i it;
        j jVar2;
        i iVar;
        j jVar3;
        ?? r8;
        D d8;
        long jO1;
        ?? r9;
        Object objA;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i8 = bVar.f22007f;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                bVar.f22007f = i8 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f22005d;
        Object objF = H6.c.f();
        ?? r10 = bVar.f22007f;
        try {
            try {
                if (r10 != 0) {
                    if (r10 == 1) {
                        iVar = (i) bVar.f22004c;
                        x xVar = (x) bVar.f22003b;
                        jVar3 = (j) bVar.f22002a;
                        r.b(obj);
                        r8 = xVar;
                        if (!((Boolean) obj).booleanValue()) {
                            C6.G g8 = C6.G.f1419a;
                            m.a(r8, null);
                            k.a(jVar3);
                            return C6.G.f1419a;
                        }
                        d8 = (D) iVar.next();
                        jO1 = d8.a().o1();
                        if (a.f22001a[d8.b().ordinal()] != 1) {
                            throw new A("Unexpected record " + d8.b() + " (" + jO1 + " bytes)", null, 2, null);
                        }
                        p205x6.k kVarA = d8.a();
                        bVar.f22002a = jVar3;
                        bVar.f22003b = r8;
                        bVar.f22004c = iVar;
                        bVar.f22007f = 2;
                    } else {
                        if (r10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        iVar = (i) bVar.f22004c;
                        x xVar2 = (x) bVar.f22003b;
                        jVar3 = (j) bVar.f22002a;
                        r.b(obj);
                        r10 = xVar2;
                    }
                    r10 = r8;
                    it = iVar;
                    jVar = jVar3;
                    jVar.flush();
                    r9 = r10;
                    bVar.f22002a = jVar;
                    bVar.f22003b = r9;
                    bVar.f22004c = it;
                    bVar.f22007f = 1;
                    objA = it.a(bVar);
                    if (objA != objF) {
                        jVar3 = jVar;
                        iVar = it;
                        obj = objA;
                        r8 = r9;
                        if (!((Boolean) obj).booleanValue()) {
                            C6.G g9 = C6.G.f1419a;
                            m.a(r8, null);
                            k.a(jVar3);
                            return C6.G.f1419a;
                        }
                        d8 = (D) iVar.next();
                        jO1 = d8.a().o1();
                        if (a.f22001a[d8.b().ordinal()] != 1) {
                            throw new A("Unexpected record " + d8.b() + " (" + jO1 + " bytes)", null, 2, null);
                        }
                        p205x6.k kVarA2 = d8.a();
                        bVar.f22002a = jVar3;
                        bVar.f22003b = r8;
                        bVar.f22004c = iVar;
                        bVar.f22007f = 2;
                    }
                    r10 = r8;
                    return objF;
                }
                r.b(obj);
                try {
                    r10 = this.f21997a;
                    try {
                        it = r10.iterator();
                        r9 = r10;
                        bVar.f22002a = jVar;
                        bVar.f22003b = r9;
                        bVar.f22004c = it;
                        bVar.f22007f = 1;
                        objA = it.a(bVar);
                        if (objA != objF) {
                            jVar3 = jVar;
                            iVar = it;
                            obj = objA;
                            r8 = r9;
                            if (!((Boolean) obj).booleanValue()) {
                                C6.G g10 = C6.G.f1419a;
                                m.a(r8, null);
                                k.a(jVar3);
                                return C6.G.f1419a;
                            }
                            d8 = (D) iVar.next();
                            jO1 = d8.a().o1();
                            if (a.f22001a[d8.b().ordinal()] != 1) {
                                throw new A("Unexpected record " + d8.b() + " (" + jO1 + " bytes)", null, 2, null);
                            }
                            p205x6.k kVarA3 = d8.a();
                            bVar.f22002a = jVar3;
                            bVar.f22003b = r8;
                            bVar.f22004c = iVar;
                            bVar.f22007f = 2;
                        }
                        r10 = r8;
                        return objF;
                    } catch (Throwable th) {
                        jVar2 = jVar;
                        th = th;
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            m.a(r10, th);
                            throw th2;
                        }
                    }
                } catch (Throwable unused) {
                    k.a(jVar);
                }
            } catch (Throwable unused2) {
                jVar = jVar2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
