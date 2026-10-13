package io.ktor.client.engine.cio;

import C6.G;
import C6.r;
import D6.T;
import X5.O;
import X5.P;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.AbstractC1785g;
import p017b7.AbstractC1823z0;
import p017b7.C1802o0;
import p017b7.InterfaceC1815v0;
import p017b7.InterfaceC1818x;
import p017b7.J;
import p017b7.L;
import p035d7.q;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends J5.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final io.ktor.client.engine.cio.c f24801e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set f24802f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p133o6.b f24803g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p034d6.i f24804h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final io.ktor.client.engine.cio.d f24805i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final G6.g f24806j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final G6.g f24807k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Proxy f24808l;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f24809a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f24810b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1815v0 f24811c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p034d6.i f24812d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC1815v0 interfaceC1815v0, p034d6.i iVar, G6.d dVar) {
            super(2, dVar);
            this.f24811c = interfaceC1815v0;
            this.f24812d = iVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return new a(this.f24811c, this.f24812d, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
        
            if (((p017b7.InterfaceC1815v0) r6).i0(r5) == r0) goto L26;
         */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = H6.c.f();
            int i8 = this.f24810b;
            try {
                if (i8 == 0) {
                    r.b(obj);
                    InterfaceC1815v0 interfaceC1815v0 = this.f24811c;
                    this.f24810b = 1;
                    if (interfaceC1815v0.i0(this) != objF) {
                    }
                    return objF;
                }
                if (i8 == 1) {
                    r.b(obj);
                } else {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Throwable th = (Throwable) this.f24809a;
                        r.b(obj);
                        throw th;
                    }
                    r.b(obj);
                }
                return G.f1419a;
                this.f24812d.close();
                G6.g.b bVarA = this.f24812d.getCoroutineContext().A(InterfaceC1815v0.f15985O);
                t.d(bVarA);
                this.f24810b = 2;
            } catch (Throwable th2) {
                this.f24812d.close();
                G6.g.b bVarA2 = this.f24812d.getCoroutineContext().A(InterfaceC1815v0.f15985O);
                t.d(bVarA2);
                this.f24809a = th2;
                this.f24810b = 3;
                if (((InterfaceC1815v0) bVarA2).i0(this) != objF) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.engine.cio.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class C0570b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24813a;

        static {
            int[] iArr = new int[J5.l.values().length];
            try {
                iArr[J5.l.SOCKS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[J5.l.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f24813a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f24814a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f24815b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f24816c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f24817d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f24818e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f24820g;

        public c(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f24818e = obj;
            this.f24820g |= Integer.MIN_VALUE;
            return b.this.A1(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ O f24821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f24822b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f24823c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Proxy f24824d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ b f24825e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f24826f;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b f24827a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f24828b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, String str) {
                super(0);
                this.f24827a = bVar;
                this.f24828b = str;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m218invoke();
                return G.f1419a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m218invoke() {
                this.f24827a.f24803g.remove(this.f24828b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(O o8, String str, int i8, Proxy proxy, b bVar, String str2) {
            super(0);
            this.f24821a = o8;
            this.f24822b = str;
            this.f24823c = i8;
            this.f24824d = proxy;
            this.f24825e = bVar;
            this.f24826f = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final h invoke() {
            return new h(this.f24822b, this.f24823c, this.f24824d, P.a(this.f24821a), this.f24825e.q(), this.f24825e.f24805i, this.f24825e.getCoroutineContext(), new a(this.f24825e, this.f24826f));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(io.ktor.client.engine.cio.c config) {
        Proxy proxyB;
        super("ktor-cio");
        t.g(config, "config");
        this.f24801e = config;
        this.f24802f = T.g(M5.u.f5752d, R5.d.f9508a, R5.g.f9511a);
        this.f24803g = new p133o6.b(0, 1, null);
        p034d6.i iVarA = p034d6.j.a(j());
        this.f24804h = iVarA;
        this.f24805i = new io.ktor.client.engine.cio.d(iVarA, q().e(), q().c().e());
        Proxy proxyB2 = q().b();
        J5.l lVarA = proxyB2 != null ? J5.k.a(proxyB2) : null;
        int i8 = lVarA == null ? -1 : C0570b.f24813a[lVarA.ordinal()];
        if (i8 == -1 || i8 == 1) {
            proxyB = null;
        } else {
            if (i8 != 2) {
                throw new IllegalStateException("CIO engine does not currently support " + lVarA + " proxies.");
            }
            proxyB = q().b();
        }
        this.f24808l = proxyB;
        G6.g coroutineContext = super.getCoroutineContext();
        InterfaceC1815v0.b bVar = InterfaceC1815v0.f15985O;
        G6.g.b bVarA = coroutineContext.A(bVar);
        t.d(bVarA);
        G6.g gVarA = p115m6.o.a((InterfaceC1815v0) bVarA);
        this.f24806j = gVarA;
        this.f24807k = coroutineContext.P1(gVarA);
        G6.g.b bVarA2 = gVarA.A(bVar);
        t.d(bVarA2);
        AbstractC1785g.c(C1802o0.f15975a, coroutineContext, L.ATOMIC, new a((InterfaceC1815v0) bVarA2, iVarA, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008a, code lost:
    
        if (r9 == r1) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [G6.d, io.ktor.client.engine.cio.b$c] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [G6.d, io.ktor.client.engine.cio.b$c] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2, types: [G6.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r5v1, types: [T5.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [T5.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [io.ktor.client.engine.cio.h] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v2, types: [io.ktor.client.engine.cio.h] */
    /* JADX WARN: Type inference failed for: r8v7, types: [io.ktor.client.engine.cio.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8, types: [io.ktor.client.engine.cio.h] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008a -> B:31:0x008d). Please report as a decompilation issue!!! */
    @Override // J5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object A1(T5.e eVar, G6.d dVar) {
        ?? Q7;
        b bVar;
        ?? r8;
        ?? r9;
        ?? r10;
        ?? r11;
        b bVar2;
        ?? r12;
        if (dVar instanceof c) {
            c cVar = (c) dVar;
            int i8 = cVar.f24820g;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                cVar.f24820g = i8 - Integer.MIN_VALUE;
                Q7 = cVar;
            } else {
                Q7 = new c(dVar);
            }
        } else {
            Q7 = new c(dVar);
        }
        Object objH0 = Q7.f24818e;
        Object objF = H6.c.f();
        ?? r13 = Q7.f24820g;
        try {
            if (r13 == 0) {
                r.b(objH0);
                Q7.f24814a = this;
                Q7.f24815b = eVar;
                Q7.f24820g = 1;
                objH0 = J5.o.b(Q7);
                if (objH0 != objF) {
                    bVar2 = this;
                    r12 = eVar;
                }
                return objF;
            }
            if (r13 == 1) {
                T5.e eVar2 = (T5.e) Q7.f24815b;
                bVar2 = (b) Q7.f24814a;
                r.b(objH0);
                r12 = eVar2;
            } else {
                if (r13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h hVar = (h) Q7.f24817d;
                G6.g gVar = (G6.g) Q7.f24816c;
                T5.e eVar3 = (T5.e) Q7.f24815b;
                bVar = (b) Q7.f24814a;
                r.b(objH0);
                r13 = gVar;
                r11 = eVar3;
                eVar = hVar;
            }
            Q7 = AbstractC1823z0.q(bVar.getCoroutineContext());
            if (Q7 == 0) {
                eVar.close();
            }
            return objH0;
            r8 = r12;
            bVar = bVar2;
            r9 = (G6.g) objH0;
            r10 = Q7;
        } catch (q unused) {
            r10 = Q7;
            r9 = r13;
            r8 = r11;
            if (!AbstractC1823z0.q(bVar.getCoroutineContext())) {
                eVar.close();
                r10 = Q7;
                r9 = r13;
                r8 = r11;
            }
        } catch (Throwable th) {
            if (!AbstractC1823z0.q(bVar.getCoroutineContext())) {
                eVar.close();
            }
            throw th;
        }
        if (!AbstractC1823z0.q(bVar.getCoroutineContext())) {
            throw new J5.a(null, 1, null);
        }
        ?? Z7 = bVar.z(r8.h(), bVar.f24808l);
        r10.f24814a = bVar;
        r10.f24815b = r8;
        r10.f24816c = r9;
        r10.f24817d = Z7;
        r10.f24820g = 2;
        objH0 = Z7.H0(r8, r9, r10);
        r13 = r9;
        r11 = r8;
        eVar = Z7;
    }

    @Override // J5.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        Iterator it = this.f24803g.entrySet().iterator();
        while (it.hasNext()) {
            ((h) ((Map.Entry) it.next()).getValue()).close();
        }
        G6.g.b bVarA = this.f24806j.A(InterfaceC1815v0.f15985O);
        t.e(bVarA, "null cannot be cast to non-null type kotlinx.coroutines.CompletableJob");
        ((InterfaceC1818x) bVarA).i1();
    }

    @Override // J5.c, p017b7.J
    public G6.g getCoroutineContext() {
        return this.f24807k;
    }

    @Override // J5.c, J5.b
    public Set h0() {
        return this.f24802f;
    }

    @Override // J5.b
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public io.ktor.client.engine.cio.c q() {
        return this.f24801e;
    }

    public final h z(X5.T t8, Proxy proxy) {
        String strG;
        int iK;
        O oL = t8.l();
        if (proxy != null) {
            SocketAddress socketAddressB = J5.k.b(proxy);
            strG = p165s6.a.a(socketAddressB);
            iK = p165s6.a.b(socketAddressB);
        } else {
            strG = t8.g();
            iK = t8.k();
        }
        int i8 = iK;
        String str = strG;
        String str2 = str + ':' + i8 + ':' + oL;
        return (h) this.f24803g.b(str2, new d(oL, str, i8, proxy, this, str2));
    }
}
