package p034d6;

import C6.G;
import C6.r;
import G6.g;
import I6.h;
import I6.l;
import Q6.o;
import X.i;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.ClosedSelectorException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.spi.AbstractSelector;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.t;
import p017b7.AbstractC1789i;
import p017b7.I;
import p017b7.J;
import p017b7.d1;
import p035d7.q;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends k implements Closeable, J {
    private volatile boolean closed;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicLong f19820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f19821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p034d6.d f19822f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g f19823g;
    private volatile boolean inSelect;
    private volatile Selector selectorRef;

    /* JADX INFO: renamed from: d6.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0460a extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f19824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f19825b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f19826c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f19827d;

        public C0460a(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return a.this.new C0460a(dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((C0460a) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v12, types: [java.nio.channels.spi.AbstractSelector] */
        /* JADX WARN: Type inference failed for: r0v13 */
        /* JADX WARN: Type inference failed for: r0v14 */
        /* JADX WARN: Type inference failed for: r0v15 */
        /* JADX WARN: Type inference failed for: r0v16 */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v6, types: [java.nio.channels.Selector] */
        /* JADX WARN: Type inference failed for: r0v7, types: [java.nio.channels.Selector] */
        /* JADX WARN: Type inference failed for: r0v9 */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v2, types: [d6.a, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v3, types: [d6.a, d6.k] */
        /* JADX WARN: Type inference failed for: r1v4, types: [d6.a, d6.k] */
        /* JADX WARN: Type inference failed for: r1v5, types: [d6.a] */
        /* JADX WARN: Type inference failed for: r1v7, types: [d6.a] */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r1v9 */
        @Override // I6.a
        public final Object invokeSuspend(Object obj) throws IllegalAccessException, IOException, InvocationTargetException {
            ?? r8;
            Closeable closeable;
            Throwable th;
            ?? r9;
            Closeable closeable2;
            Closeable closeable3;
            ?? r10;
            ?? r11;
            ?? r12;
            ?? r13;
            Object objF = H6.c.f();
            int i8 = this.f19827d;
            try {
                if (i8 == 0) {
                    r.b(obj);
                    AbstractSelector abstractSelectorOpenSelector = a.this.Z().openSelector();
                    if (abstractSelectorOpenSelector == null) {
                        throw new IllegalStateException("openSelector() = null");
                    }
                    a.this.selectorRef = abstractSelectorOpenSelector;
                    r8 = a.this;
                    try {
                        p034d6.d dVar = r8.f19822f;
                        this.f19824a = abstractSelectorOpenSelector;
                        this.f19825b = r8;
                        this.f19826c = abstractSelectorOpenSelector;
                        this.f19827d = 1;
                        if (r8.i1(dVar, abstractSelectorOpenSelector, this) == objF) {
                            return objF;
                        }
                        AbstractSelector abstractSelector = abstractSelectorOpenSelector;
                        closeable2 = abstractSelector;
                        r13 = abstractSelector;
                        r12 = r8;
                        ((a) r12).closed = true;
                        r12.f19822f.b();
                        r11 = r13;
                        r10 = r12;
                        closeable3 = closeable2;
                    } catch (Throwable th2) {
                        closeable = abstractSelectorOpenSelector;
                        th = th2;
                        r9 = closeable;
                        ((a) r8).closed = true;
                        r8.f19822f.b();
                        r8.t(r9, th);
                        ((a) r8).closed = true;
                        r8.f19822f.b();
                        r11 = r9;
                        r10 = r8;
                        closeable3 = closeable;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r9 = (AbstractSelector) this.f19826c;
                    r8 = (a) this.f19825b;
                    closeable = (Closeable) this.f19824a;
                    try {
                        r.b(obj);
                        r13 = r9;
                        r12 = r8;
                        closeable2 = closeable;
                        ((a) r12).closed = true;
                        r12.f19822f.b();
                        r11 = r13;
                        r10 = r12;
                        closeable3 = closeable2;
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            ((a) r8).closed = true;
                            r8.f19822f.b();
                            r8.t(r9, th);
                            ((a) r8).closed = true;
                            r8.f19822f.b();
                            r11 = r9;
                            r10 = r8;
                            closeable3 = closeable;
                        } catch (Throwable th4) {
                            ((a) r8).closed = true;
                            r8.f19822f.b();
                            ((a) r8).selectorRef = null;
                            r8.t(r9, null);
                            throw th4;
                        }
                    }
                }
                ((a) r10).selectorRef = null;
                r10.t(r11, null);
                while (true) {
                    g gVar = (g) r10.f19822f.d();
                    if (gVar == null) {
                        G g8 = G.f1419a;
                        N6.a.a(closeable3, null);
                        return G.f1419a;
                    }
                    r10.j(gVar, new q("Failed to apply interest: selector closed"));
                }
            } catch (Throwable th5) {
                try {
                    throw th5;
                } catch (Throwable th6) {
                    N6.a.a(closeable, th5);
                    throw th6;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReference f19829a = new AtomicReference(null);

        public final boolean b(Object obj) {
            G6.d dVar = (G6.d) this.f19829a.getAndSet(null);
            if (dVar == null) {
                return false;
            }
            dVar.resumeWith(C6.q.b(obj));
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f19830a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f19831b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f19832c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f19833d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f19835f;

        public c(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f19833d = obj;
            this.f19835f |= Integer.MIN_VALUE;
            return a.this.i1(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f19836a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f19837b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f19838c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f19840e;

        public d(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f19838c = obj;
            this.f19840e |= Integer.MIN_VALUE;
            return a.this.B1(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f19841a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f19842b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f19843c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f19845e;

        public e(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f19843c = obj;
            this.f19845e |= Integer.MIN_VALUE;
            return a.this.C1(null, this);
        }
    }

    public a(g context) {
        t.g(context, "context");
        this.f19820d = new AtomicLong();
        this.f19821e = new b();
        this.f19822f = new p034d6.d();
        this.f19823g = context.P1(new I("selector"));
        AbstractC1789i.d(this, null, null, new C0460a(null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object B1(p034d6.d dVar, G6.d dVar2) {
        d dVar3;
        a aVar;
        Object objF;
        if (dVar2 instanceof d) {
            dVar3 = (d) dVar2;
            int i8 = dVar3.f19840e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                dVar3.f19840e = i8 - Integer.MIN_VALUE;
            } else {
                dVar3 = new d(dVar2);
            }
        } else {
            dVar3 = new d(dVar2);
        }
        Object obj = dVar3.f19838c;
        Object objF2 = H6.c.f();
        int i9 = dVar3.f19840e;
        if (i9 == 0) {
            r.b(obj);
            aVar = this;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar = (p034d6.d) dVar3.f19837b;
            aVar = (a) dVar3.f19836a;
            r.b(obj);
        }
        do {
            g gVar = (g) dVar.d();
            if (gVar != null) {
                return gVar;
            }
            objF = null;
            if (aVar.closed) {
                return null;
            }
            dVar3.f19836a = aVar;
            dVar3.f19837b = dVar;
            dVar3.f19840e = 1;
            b bVar = aVar.f19821e;
            if (dVar.c() && !aVar.closed) {
                if (!i.a(bVar.f19829a, null, dVar3)) {
                    throw new IllegalStateException("Continuation is already set");
                }
                if ((dVar.c() && !aVar.closed) || !i.a(bVar.f19829a, dVar3, null)) {
                    objF = H6.c.f();
                }
            }
            if (objF == null) {
                objF = G.f1419a;
            }
            if (objF == H6.c.f()) {
                h.c(dVar3);
            }
        } while (objF != objF2);
        return objF2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object C1(Selector selector, G6.d dVar) throws IOException {
        e eVar;
        a aVar;
        int iSelectNow;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i8 = eVar.f19845e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                eVar.f19845e = i8 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object obj = eVar.f19843c;
        Object objF = H6.c.f();
        int i9 = eVar.f19845e;
        if (i9 == 0) {
            r.b(obj);
            this.inSelect = true;
            eVar.f19841a = this;
            eVar.f19842b = selector;
            eVar.f19845e = 1;
            if (d1.a(eVar) == objF) {
                return objF;
            }
            aVar = this;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            selector = (Selector) eVar.f19842b;
            aVar = (a) eVar.f19841a;
            r.b(obj);
        }
        if (aVar.f19820d.get() == 0) {
            iSelectNow = selector.select(500L);
            aVar.inSelect = false;
        } else {
            aVar.inSelect = false;
            aVar.f19820d.set(0L);
            iSelectNow = selector.selectNow();
        }
        return I6.b.d(iSelectNow);
    }

    public final void K1() {
        Selector selector;
        if (this.f19820d.incrementAndGet() == 1 && this.inSelect && (selector = this.selectorRef) != null) {
            selector.wakeup();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.closed = true;
        this.f19822f.b();
        if (this.f19821e.b(G.f1419a)) {
            return;
        }
        K1();
    }

    @Override // p017b7.J
    public g getCoroutineContext() {
        return this.f19823g;
    }

    @Override // p034d6.k
    public void i0(g selectable) {
        t.g(selectable, "selectable");
        try {
            if (this.f19822f.a(selectable)) {
                this.f19821e.b(G.f1419a);
                K1();
            } else {
                if (!selectable.e().isOpen()) {
                    throw new ClosedChannelException();
                }
                throw new ClosedSelectorException();
            }
        } catch (Throwable th) {
            j(selectable, th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0079  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0099 -> B:19:0x0075). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00b3 -> B:19:0x0075). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00c3 -> B:19:0x0075). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00f8 -> B:44:0x00fb). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object i1(p034d6.d r11, java.nio.channels.Selector r12, G6.d r13) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p034d6.a.i1(d6.d, java.nio.channels.Selector, G6.d):java.lang.Object");
    }

    public final void p1(p034d6.d dVar, Selector selector) {
        while (true) {
            g gVar = (g) dVar.d();
            if (gVar == null) {
                return;
            } else {
                b(selector, gVar);
            }
        }
    }

    public final Object r1(p034d6.d dVar, G6.d dVar2) {
        g gVar = (g) dVar.d();
        return gVar == null ? B1(dVar, dVar2) : gVar;
    }

    @Override // p034d6.i
    public void t1(g selectable) {
        SelectionKey selectionKeyKeyFor;
        t.g(selectable, "selectable");
        j(selectable, new ClosedChannelException());
        Selector selector = this.selectorRef;
        if (selector == null || (selectionKeyKeyFor = selectable.e().keyFor(selector)) == null) {
            return;
        }
        t.f(selectionKeyKeyFor, "keyFor(selector)");
        selectionKeyKeyFor.cancel();
        K1();
    }
}
