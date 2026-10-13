package io.ktor.websocket;

import C6.G;
import E4.JFpq.XRlnZWSrAFn;
import java.nio.ByteBuffer;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC2633k;
import p017b7.AbstractC1785g;
import p017b7.AbstractC1823z0;
import p017b7.I;
import p017b7.InterfaceC1815v0;
import p017b7.InterfaceC1818x;
import p017b7.J;
import p017b7.L;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class y implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.ktor.utils.io.j f25773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G6.g f25774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p221z6.g f25776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p035d7.g f25777e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o f25778f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC1815v0 f25779g;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC1818x f25780a;

        public a(InterfaceC1815v0 interfaceC1815v0) {
            this.f25780a = AbstractC1823z0.a(interfaceC1815v0);
        }

        public final Object a(G6.d dVar) {
            Object objI0 = this.f25780a.i0(dVar);
            return objI0 == H6.c.f() ? objI0 : G.f1419a;
        }

        public final boolean b() {
            return this.f25780a.i1();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25781a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f25782b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f25783c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f25784d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f25785e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f25787g;

        public b(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25785e = obj;
            this.f25787g |= Integer.MIN_VALUE;
            return y.this.f(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25788a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f25789b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f25790c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f25791d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f25793f;

        public c(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25791d = obj;
            this.f25793f |= Integer.MIN_VALUE;
            return y.this.w0(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f25795b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f25796c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f25797d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f25799f;

        public d(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25797d = obj;
            this.f25799f |= Integer.MIN_VALUE;
            return y.this.i(null, this);
        }
    }

    public y(io.ktor.utils.io.j writeChannel, G6.g coroutineContext, boolean z8, p221z6.g pool) {
        kotlin.jvm.internal.t.g(writeChannel, "writeChannel");
        kotlin.jvm.internal.t.g(coroutineContext, "coroutineContext");
        kotlin.jvm.internal.t.g(pool, "pool");
        this.f25773a = writeChannel;
        this.f25774b = coroutineContext;
        this.f25775c = z8;
        this.f25776d = pool;
        this.f25777e = p035d7.j.b(8, null, null, 6, null);
        this.f25778f = new o();
        this.f25779g = AbstractC1785g.c(this, new I("ws-writer"), L.ATOMIC, new e(null));
    }

    public final p035d7.y J0() {
        return this.f25777e;
    }

    public final void d() {
        d7.y.a.a(this.f25777e, null, 1, null);
        while (true) {
            try {
                Object objF = p035d7.k.f(this.f25777e.g());
                if (objF == null) {
                    return;
                }
                if (!(objF instanceof io.ktor.websocket.e.b)) {
                    if (objF instanceof io.ktor.websocket.e.d ? true : objF instanceof io.ktor.websocket.e.C0584e) {
                        continue;
                    } else if (objF instanceof a) {
                        ((a) objF).b();
                    } else {
                        if (!(objF instanceof io.ktor.websocket.e.f ? true : objF instanceof io.ktor.websocket.e.a)) {
                            throw new IllegalArgumentException("unknown message " + objF);
                        }
                    }
                }
            } catch (CancellationException unused) {
                return;
            }
        }
    }

    public final p221z6.g g() {
        return this.f25776d;
    }

    @Override // p017b7.J
    public G6.g getCoroutineContext() {
        return this.f25774b;
    }

    public final void h(boolean z8) {
        this.f25775c = z8;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007d  */
    /* JADX WARN: Code duplicated, block: B:31:0x007e  */
    /* JADX WARN: Code duplicated, block: B:34:0x008a A[Catch: all -> 0x0040, c -> 0x0043, TryCatch #4 {c -> 0x0043, all -> 0x0040, blocks: (B:13:0x0037, B:39:0x00a3, B:28:0x006f, B:32:0x0082, B:34:0x008a, B:36:0x0092, B:43:0x00af, B:45:0x00b3, B:46:0x00b9, B:47:0x00cf, B:22:0x005a), top: B:63:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00af A[Catch: all -> 0x0040, c -> 0x0043, TryCatch #4 {c -> 0x0043, all -> 0x0040, blocks: (B:13:0x0037, B:39:0x00a3, B:28:0x006f, B:32:0x0082, B:34:0x008a, B:36:0x0092, B:43:0x00af, B:45:0x00b3, B:46:0x00b9, B:47:0x00cf, B:22:0x005a), top: B:63:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b3 A[Catch: all -> 0x0040, c -> 0x0043, TryCatch #4 {c -> 0x0043, all -> 0x0040, blocks: (B:13:0x0037, B:39:0x00a3, B:28:0x006f, B:32:0x0082, B:34:0x008a, B:36:0x0092, B:43:0x00af, B:45:0x00b3, B:46:0x00b9, B:47:0x00cf, B:22:0x005a), top: B:63:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00a0 -> B:39:0x00a3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00b3 -> B:42:0x00ac). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object i(java.nio.ByteBuffer r11, G6.d r12) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.y.i(java.nio.ByteBuffer, G6.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0093  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        if (r9.i(r2, r0) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a1, code lost:
    
        if (r5.a(r0) == r1) goto L36;
     */
    /* JADX WARN: Type inference failed for: r2v0, types: [int, io.ktor.websocket.y$a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w0(G6.d dVar) {
        c cVar;
        a aVar;
        y yVar;
        a aVar2;
        InterfaceC1815v0 interfaceC1815v0;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i8 = cVar.f25793f;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                cVar.f25793f = i8 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object obj = cVar.f25791d;
        Object objF = H6.c.f();
        ?? r8 = cVar.f25793f;
        try {
            if (r8 != 0) {
                if (r8 == 1) {
                    aVar = (a) cVar.f25790c;
                    aVar2 = (a) cVar.f25789b;
                    yVar = (y) cVar.f25788a;
                    try {
                        C6.r.b(obj);
                    } catch (p035d7.q unused) {
                        aVar.b();
                        interfaceC1815v0 = yVar.f25779g;
                        cVar.f25788a = aVar2;
                        cVar.f25789b = null;
                        cVar.f25790c = null;
                        cVar.f25793f = 2;
                        if (interfaceC1815v0.i0(cVar) != objF) {
                            aVar = aVar2;
                            aVar2 = aVar;
                        }
                        return objF;
                    }
                    cVar.f25788a = null;
                    cVar.f25789b = null;
                    cVar.f25790c = null;
                    cVar.f25793f = 3;
                } else if (r8 == 2) {
                    aVar = (a) cVar.f25788a;
                    C6.r.b(obj);
                    aVar2 = aVar;
                    cVar.f25788a = null;
                    cVar.f25789b = null;
                    cVar.f25790c = null;
                    cVar.f25793f = 3;
                } else {
                    if (r8 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C6.r.b(obj);
                }
                return G.f1419a;
            }
            C6.r.b(obj);
            aVar = new a((InterfaceC1815v0) getCoroutineContext().A(InterfaceC1815v0.f15985O));
            try {
                p035d7.g gVar = this.f25777e;
                cVar.f25788a = this;
                cVar.f25789b = aVar;
                cVar.f25790c = aVar;
                cVar.f25793f = 1;
            } catch (p035d7.q unused2) {
                yVar = this;
                aVar2 = aVar;
                aVar.b();
                interfaceC1815v0 = yVar.f25779g;
                cVar.f25788a = aVar2;
                cVar.f25789b = null;
                cVar.f25790c = null;
                cVar.f25793f = 2;
                if (interfaceC1815v0.i0(cVar) != objF) {
                    aVar = aVar2;
                }
                return objF;
            }
        } catch (Throwable th) {
            r8.b();
            throw th;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25800a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f25801b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f25802c;

        public e(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return y.this.new e(dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((e) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            p221z6.g gVarG;
            Object obj2;
            Object objF = H6.c.f();
            int i8 = this.f25802c;
            if (i8 != 0) {
                if (i8 == 1) {
                    obj2 = this.f25801b;
                    gVarG = (p221z6.g) this.f25800a;
                    try {
                        C6.r.b(obj);
                    } catch (Throwable th) {
                        th = th;
                        gVarG.H1(obj2);
                        throw th;
                    }
                } else {
                    throw new IllegalStateException(XRlnZWSrAFn.FsDbbcXKm);
                }
            } else {
                C6.r.b(obj);
                gVarG = y.this.g();
                y yVar = y.this;
                Object objB0 = gVarG.b0();
                try {
                    this.f25800a = gVarG;
                    this.f25801b = objB0;
                    this.f25802c = 1;
                    if (yVar.i((ByteBuffer) objB0, this) == objF) {
                        return objF;
                    }
                    obj2 = objB0;
                } catch (Throwable th2) {
                    th = th2;
                    obj2 = objB0;
                    gVarG.H1(obj2);
                    throw th;
                }
            }
            G g8 = G.f1419a;
            gVarG.H1(obj2);
            return G.f1419a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v2, types: [int] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00f7 -> B:53:0x00fa). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:16:0x0055
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final java.lang.Object f(io.ktor.websocket.e r8, java.nio.ByteBuffer r9, G6.d r10) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.y.f(io.ktor.websocket.e, java.nio.ByteBuffer, G6.d):java.lang.Object");
    }

    public /* synthetic */ y(io.ktor.utils.io.j jVar, G6.g gVar, boolean z8, p221z6.g gVar2, int i8, AbstractC2633k abstractC2633k) {
        this(jVar, gVar, (i8 & 4) != 0 ? false : z8, (i8 & 8) != 0 ? p124n6.a.a() : gVar2);
    }
}
