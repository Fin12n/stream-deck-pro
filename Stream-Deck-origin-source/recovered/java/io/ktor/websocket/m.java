package io.ktor.websocket;

import C6.G;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.K;
import p017b7.AbstractC1789i;
import p017b7.AbstractC1823z0;
import p017b7.I;
import p017b7.InterfaceC1815v0;
import p017b7.InterfaceC1818x;
import p017b7.J;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class m implements w {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ X6.l[] f25714h = {K.d(new kotlin.jvm.internal.x(m.class, "maxFrameSize", "getMaxFrameSize()J", 0)), K.d(new kotlin.jvm.internal.x(m.class, "masking", "getMasking()Z", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1818x f25715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p035d7.g f25716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final G6.g f25717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final T6.c f25718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final T6.c f25719e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y f25720f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v f25721g;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25722a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f25723b;

        public a(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return m.this.new a(dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code duplicated, block: B:36:0x0068  */
        /* JADX WARN: Code duplicated, block: B:37:0x006a  */
        /* JADX WARN: Code duplicated, block: B:40:0x0075 A[Catch: all -> 0x003b, CancellationException -> 0x003d, l -> 0x003f, h -> 0x0042, TRY_LEAVE, TryCatch #5 {l -> 0x003f, CancellationException -> 0x003d, blocks: (B:19:0x0036, B:34:0x005e, B:38:0x006d, B:40:0x0075, B:30:0x0049, B:33:0x0050), top: B:61:0x000b, outer: #3 }] */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0089, code lost:
        
            if (r7.i(r11, r10) == r0) goto L53;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0089 -> B:20:0x0039). Please report as a decompilation issue!!! */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            h hVar;
            l lVar;
            p035d7.i it;
            p035d7.i iVar;
            Object objA;
            Object objF = H6.c.f();
            int i8 = this.f25723b;
            try {
                try {
                    try {
                        if (i8 == 0) {
                            C6.r.b(obj);
                            it = m.this.b().c().iterator();
                            this.f25722a = it;
                            this.f25723b = 1;
                            objA = it.a(this);
                            if (objA == objF) {
                                iVar = it;
                                obj = objA;
                                if (((Boolean) obj).booleanValue()) {
                                    e eVar = (e) iVar.next();
                                    p035d7.g gVar = m.this.f25716b;
                                    this.f25722a = iVar;
                                    this.f25723b = 2;
                                }
                                d7.y.a.a(m.this.f25716b, null, 1, null);
                                return G.f1419a;
                            }
                            return objF;
                        }
                        if (i8 == 1) {
                            iVar = (p035d7.i) this.f25722a;
                            C6.r.b(obj);
                            if (((Boolean) obj).booleanValue()) {
                                e eVar2 = (e) iVar.next();
                                p035d7.g gVar2 = m.this.f25716b;
                                this.f25722a = iVar;
                                this.f25723b = 2;
                            }
                            d7.y.a.a(m.this.f25716b, null, 1, null);
                            return G.f1419a;
                        }
                        if (i8 != 2) {
                            if (i8 == 3) {
                                hVar = (h) this.f25722a;
                                C6.r.b(obj);
                                m.this.f25716b.d(hVar);
                                d7.y.a.a(m.this.f25716b, null, 1, null);
                                return G.f1419a;
                            }
                            if (i8 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            lVar = (l) this.f25722a;
                            C6.r.b(obj);
                            m.this.f25716b.d(lVar);
                            d7.y.a.a(m.this.f25716b, null, 1, null);
                            return G.f1419a;
                        }
                        iVar = (p035d7.i) this.f25722a;
                        C6.r.b(obj);
                        it = iVar;
                        this.f25722a = it;
                        this.f25723b = 1;
                        objA = it.a(this);
                        if (objA == objF) {
                            iVar = it;
                            obj = objA;
                            if (((Boolean) obj).booleanValue()) {
                                e eVar3 = (e) iVar.next();
                                p035d7.g gVar3 = m.this.f25716b;
                                this.f25722a = iVar;
                                this.f25723b = 2;
                            }
                            d7.y.a.a(m.this.f25716b, null, 1, null);
                            return G.f1419a;
                        }
                    } catch (l e8) {
                        p035d7.y yVarJ0 = m.this.J0();
                        e.b bVar = new e.b(new io.ktor.websocket.a(io.ktor.websocket.a.EnumC0581a.PROTOCOL_ERROR, e8.getMessage()));
                        this.f25722a = e8;
                        this.f25723b = 4;
                        if (yVarJ0.i(bVar, this) == objF) {
                            return objF;
                        }
                        lVar = e8;
                    } catch (CancellationException e9) {
                        m.this.b().c().z(e9);
                    }
                } catch (h e10) {
                    p035d7.y yVarJ1 = m.this.J0();
                    e.b bVar2 = new e.b(new io.ktor.websocket.a(io.ktor.websocket.a.EnumC0581a.TOO_BIG, e10.getMessage()));
                    this.f25722a = e10;
                    this.f25723b = 3;
                    if (yVarJ1.i(bVar2, this) != objF) {
                        hVar = e10;
                    }
                    return objF;
                } catch (Throwable th) {
                    m.this.f25716b.d(th);
                }
                return objF;
            } catch (Throwable th2) {
                d7.y.a.a(m.this.f25716b, null, 1, null);
                throw th2;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends T6.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m f25725b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj, m mVar) {
            super(obj);
            this.f25725b = mVar;
        }

        @Override // T6.b
        public void c(X6.l property, Object obj, Object obj2) {
            kotlin.jvm.internal.t.g(property, "property");
            long jLongValue = ((Number) obj2).longValue();
            ((Number) obj).longValue();
            this.f25725b.b().M1(jLongValue);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends T6.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m f25726b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Object obj, m mVar) {
            super(obj);
            this.f25726b = mVar;
        }

        @Override // T6.b
        public void c(X6.l property, Object obj, Object obj2) {
            kotlin.jvm.internal.t.g(property, "property");
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            ((Boolean) obj).getClass();
            this.f25726b.d().h(zBooleanValue);
        }
    }

    public m(io.ktor.utils.io.g input, io.ktor.utils.io.j output, long j8, boolean z8, G6.g coroutineContext, p221z6.g pool) {
        kotlin.jvm.internal.t.g(input, "input");
        kotlin.jvm.internal.t.g(output, "output");
        kotlin.jvm.internal.t.g(coroutineContext, "coroutineContext");
        kotlin.jvm.internal.t.g(pool, "pool");
        InterfaceC1818x interfaceC1818xA = AbstractC1823z0.a((InterfaceC1815v0) coroutineContext.A(InterfaceC1815v0.f15985O));
        this.f25715a = interfaceC1818xA;
        this.f25716b = p035d7.j.b(0, null, null, 6, null);
        this.f25717c = coroutineContext.P1(interfaceC1818xA).P1(new I("raw-ws"));
        T6.a aVar = T6.a.f9933a;
        this.f25718d = new b(Long.valueOf(j8), this);
        this.f25719e = new c(Boolean.valueOf(z8), this);
        this.f25720f = new y(output, getCoroutineContext(), z8, pool);
        this.f25721g = new v(input, getCoroutineContext(), j8, pool);
        AbstractC1789i.d(this, null, null, new a(null), 3, null);
        interfaceC1818xA.i1();
    }

    @Override // io.ktor.websocket.w
    public p035d7.y J0() {
        return this.f25720f.J0();
    }

    @Override // io.ktor.websocket.w
    public void M1(long j8) {
        this.f25718d.b(this, f25714h[0], Long.valueOf(j8));
    }

    @Override // io.ktor.websocket.w
    public long X1() {
        return ((Number) this.f25718d.a(this, f25714h[0])).longValue();
    }

    public final v b() {
        return this.f25721g;
    }

    @Override // io.ktor.websocket.w
    public p035d7.x c() {
        return this.f25716b;
    }

    public final y d() {
        return this.f25720f;
    }

    @Override // p017b7.J
    public G6.g getCoroutineContext() {
        return this.f25717c;
    }

    @Override // io.ktor.websocket.w
    public Object q1(e eVar, G6.d dVar) {
        return w.a.a(this, eVar, dVar);
    }

    @Override // io.ktor.websocket.w
    public Object w0(G6.d dVar) {
        Object objW0 = this.f25720f.w0(dVar);
        return objW0 == H6.c.f() ? objW0 : G.f1419a;
    }

    public /* synthetic */ m(io.ktor.utils.io.g gVar, io.ktor.utils.io.j jVar, long j8, boolean z8, G6.g gVar2, p221z6.g gVar3, int i8, AbstractC2633k abstractC2633k) {
        this(gVar, jVar, (i8 & 4) != 0 ? 2147483647L : j8, (i8 & 8) != 0 ? false : z8, gVar2, (i8 & 32) != 0 ? p124n6.a.a() : gVar3);
    }
}
