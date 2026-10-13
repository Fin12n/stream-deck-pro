package M5;

import C6.G;
import D6.I;
import X5.AbstractC1691u;
import X5.InterfaceC1690t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.J;
import p017b7.K;
import p115m6.C2691a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f5732c = new d(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2691a f5733d = new C2691a("HttpSend");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f5735b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5736a = 20;

        public final int a() {
            return this.f5736a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements A {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5737a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final G5.a f5738b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f5739c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public H5.b f5740d;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends I6.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Object f5741a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f5742b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f5744d;

            public a(G6.d dVar) {
                super(dVar);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                this.f5742b = obj;
                this.f5744d |= Integer.MIN_VALUE;
                return b.this.a(null, this);
            }
        }

        public b(int i8, G5.a client) {
            kotlin.jvm.internal.t.g(client, "client");
            this.f5737a = i8;
            this.f5738b = client;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // M5.A
        public Object a(T5.d dVar, G6.d dVar2) {
            a aVar;
            b bVar;
            if (dVar2 instanceof a) {
                aVar = (a) dVar2;
                int i8 = aVar.f5744d;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    aVar.f5744d = i8 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(dVar2);
                }
            } else {
                aVar = new a(dVar2);
            }
            Object objD = aVar.f5742b;
            Object objF = H6.c.f();
            int i9 = aVar.f5744d;
            if (i9 == 0) {
                C6.r.b(objD);
                H5.b bVar2 = this.f5740d;
                if (bVar2 != null) {
                    K.e(bVar2, null, 1, null);
                }
                int i10 = this.f5739c;
                if (i10 >= this.f5737a) {
                    throw new z("Max send count " + this.f5737a + " exceeded. Consider increasing the property maxSendCount if more is required.");
                }
                this.f5739c = i10 + 1;
                T5.i iVarI0 = this.f5738b.i0();
                Object objD2 = dVar.d();
                aVar.f5741a = this;
                aVar.f5744d = 1;
                objD = iVarI0.d(dVar, objD2, aVar);
                if (objD == objF) {
                    return objF;
                }
                bVar = this;
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (b) aVar.f5741a;
                C6.r.b(objD);
            }
            H5.b bVar3 = objD instanceof H5.b ? (H5.b) objD : null;
            if (bVar3 != null) {
                bVar.f5740d = bVar3;
                return bVar3;
            }
            throw new IllegalStateException(("Failed to execute send pipeline. Expected [HttpClientCall], but received " + objD).toString());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c implements A {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Q6.p f5745a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final A f5746b;

        public c(Q6.p interceptor, A nextSender) {
            kotlin.jvm.internal.t.g(interceptor, "interceptor");
            kotlin.jvm.internal.t.g(nextSender, "nextSender");
            this.f5745a = interceptor;
            this.f5746b = nextSender;
        }

        @Override // M5.A
        public Object a(T5.d dVar, G6.d dVar2) {
            return this.f5745a.invoke(this.f5746b, dVar, dVar2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d implements k {

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends I6.l implements Q6.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f5747a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f5748b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f5749c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ t f5750d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ G5.a f5751e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(t tVar, G5.a aVar, G6.d dVar) {
                super(3, dVar);
                this.f5750d = tVar;
                this.f5751e = aVar;
            }

            @Override // Q6.p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(p173t6.e eVar, Object obj, G6.d dVar) {
                a aVar = new a(this.f5750d, this.f5751e, dVar);
                aVar.f5748b = eVar;
                aVar.f5749c = obj;
                return aVar.invokeSuspend(G.f1419a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x00aa, code lost:
            
                if (r1.h((H5.b) r11, r10) == r0) goto L21;
             */
            @Override // I6.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                p173t6.e eVar;
                Object objF = H6.c.f();
                int i8 = this.f5747a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        eVar = (p173t6.e) this.f5748b;
                        C6.r.b(obj);
                    } else {
                        if (i8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C6.r.b(obj);
                    }
                    return G.f1419a;
                }
                C6.r.b(obj);
                eVar = (p173t6.e) this.f5748b;
                Object obj2 = this.f5749c;
                if (!(obj2 instanceof p007a6.c)) {
                    throw new IllegalStateException(Z6.o.h("\n|Fail to prepare request body for sending. \n|The body type is: " + kotlin.jvm.internal.K.b(obj2.getClass()) + ", with Content-Type: " + AbstractC1691u.e((InterfaceC1690t) eVar.d()) + ".\n|\n|If you expect serialized body, please check that you have installed the corresponding plugin(like `ContentNegotiation`) and set `Content-Type` header.", null, 1, null).toString());
                }
                T5.d dVar = (T5.d) eVar.d();
                dVar.j(obj2);
                dVar.k(null);
                b bVar = new b(this.f5750d.f5734a, this.f5751e);
                J j8 = new J();
                j8.f28779a = bVar;
                W6.g gVarP = W6.n.p(D6.r.p(this.f5750d.f5735b), 0);
                t tVar = this.f5750d;
                Iterator it = gVarP.iterator();
                while (it.hasNext()) {
                    j8.f28779a = new c((Q6.p) tVar.f5735b.get(((I) it).nextInt()), (A) j8.f28779a);
                }
                A a8 = (A) j8.f28779a;
                T5.d dVar2 = (T5.d) eVar.d();
                this.f5748b = eVar;
                this.f5747a = 1;
                obj = a8.a(dVar2, this);
                if (obj != objF) {
                }
                return objF;
                this.f5748b = null;
                this.f5747a = 2;
            }
        }

        public /* synthetic */ d(AbstractC2633k abstractC2633k) {
            this();
        }

        @Override // M5.k
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(t plugin, G5.a scope) {
            kotlin.jvm.internal.t.g(plugin, "plugin");
            kotlin.jvm.internal.t.g(scope, "scope");
            scope.A().l(T5.g.f9911h.c(), new a(plugin, scope, null));
        }

        @Override // M5.k
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public t b(Q6.k block) {
            kotlin.jvm.internal.t.g(block, "block");
            a aVar = new a();
            block.invoke(aVar);
            return new t(aVar.a(), null);
        }

        @Override // M5.k
        public C2691a getKey() {
            return t.f5733d;
        }

        public d() {
        }
    }

    public /* synthetic */ t(int i8, AbstractC2633k abstractC2633k) {
        this(i8);
    }

    public final void d(Q6.p block) {
        kotlin.jvm.internal.t.g(block, "block");
        this.f5735b.add(block);
    }

    public t(int i8) {
        this.f5734a = i8;
        this.f5735b = new ArrayList();
    }
}
