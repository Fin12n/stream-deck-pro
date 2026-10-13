package K5;

import C6.C0918g;
import C6.G;
import C6.r;
import I6.l;
import M5.v;
import Q6.o;
import X5.C1688q;
import io.ktor.utils.io.C;
import io.ktor.utils.io.q;
import java.io.Closeable;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.AbstractC1823z0;
import p017b7.C1802o0;
import p135p0.Dyk.GOKsbdzhLhXAMt;
import u7.A;
import u7.w;
import u7.x;
import u7.z;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p007a6.c f4682a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p007a6.c cVar) {
            super(0);
            this.f4682a = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final io.ktor.utils.io.g invoke() {
            return ((a6.c.d) this.f4682a).d();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ G6.g f4683a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p007a6.c f4684b;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends l implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f4685a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f4686b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ p007a6.c f4687c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(p007a6.c cVar, G6.d dVar) {
                super(2, dVar);
                this.f4687c = cVar;
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                a aVar = new a(this.f4687c, dVar);
                aVar.f4686b = obj;
                return aVar;
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C c8, G6.d dVar) {
                return ((a) create(c8, dVar)).invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                Object objF = H6.c.f();
                int i8 = this.f4685a;
                if (i8 == 0) {
                    r.b(obj);
                    C c8 = (C) this.f4686b;
                    a6.c.e eVar = (a6.c.e) this.f4687c;
                    io.ktor.utils.io.j jVarMo220e = c8.mo220e();
                    this.f4685a = 1;
                    if (eVar.d(jVarMo220e, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                }
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(G6.g gVar, p007a6.c cVar) {
            super(0);
            this.f4683a = gVar;
            this.f4684b = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final io.ktor.utils.io.g invoke() {
            return q.g(C1802o0.f15975a, this.f4683a, false, new a(this.f4684b, null), 2, null).mo219e();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ z.a f4688a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(z.a aVar) {
            super(2);
            this.f4688a = aVar;
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((String) obj, (String) obj2);
            return G.f1419a;
        }

        public final void b(String key, String str) {
            t.g(key, "key");
            t.g(str, GOKsbdzhLhXAMt.unv);
            if (t.c(key, C1688q.f11910a.i())) {
                return;
            }
            this.f4688a.a(key, str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f4689a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f4690b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f4691c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f4692d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f4693e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f4694f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f4695g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ J7.g f4696h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ G6.g f4697i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ T5.e f4698j;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ H f4699a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ J7.g f4700b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ T5.e f4701c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(H h8, J7.g gVar, T5.e eVar) {
                super(1);
                this.f4699a = h8;
                this.f4700b = gVar;
                this.f4701c = eVar;
            }

            public final void b(ByteBuffer buffer) throws Throwable {
                t.g(buffer, "buffer");
                try {
                    this.f4699a.f28777a = this.f4700b.read(buffer);
                } catch (Throwable th) {
                    throw e.g(th, this.f4701c);
                }
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
                b((ByteBuffer) obj);
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(J7.g gVar, G6.g gVar2, T5.e eVar, G6.d dVar) {
            super(2, dVar);
            this.f4696h = gVar;
            this.f4697i = gVar2;
            this.f4698j = eVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            d dVar2 = new d(this.f4696h, this.f4697i, this.f4698j, dVar);
            dVar2.f4695g = obj;
            return dVar2;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C c8, G6.d dVar) {
            return ((d) create(c8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code duplicated, block: B:40:0x00ad  */
        /* JADX WARN: Code duplicated, block: B:42:0x00b3  */
        /* JADX WARN: Code duplicated, block: B:46:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0082 -> B:48:0x0085). Please report as a decompilation issue!!! */
        @Override // I6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Throwable th;
            G g8;
            C c8;
            G6.g gVar;
            T5.e eVar;
            H h8;
            J7.g gVar2;
            Closeable closeable;
            d dVar = this;
            Object objF = H6.c.f();
            int i8 = dVar.f4694f;
            Throwable th2 = null;
            try {
                try {
                    if (i8 == 0) {
                        r.b(obj);
                        C c9 = (C) dVar.f4695g;
                        J7.g gVar3 = dVar.f4696h;
                        c8 = c9;
                        gVar = dVar.f4697i;
                        eVar = dVar.f4698j;
                        h8 = new H();
                        gVar2 = gVar3;
                        closeable = gVar2;
                        if (gVar2.isOpen() || !AbstractC1823z0.q(gVar) || h8.f28777a < 0) {
                            g8 = G.f1419a;
                            if (closeable != null) {
                                try {
                                    closeable.close();
                                } catch (Throwable th3) {
                                    th2 = th3;
                                }
                            }
                        } else {
                            io.ktor.utils.io.j jVarMo220e = c8.mo220e();
                            a aVar = new a(h8, gVar2, eVar);
                            dVar.f4695g = c8;
                            dVar.f4689a = closeable;
                            dVar.f4690b = gVar;
                            dVar.f4691c = eVar;
                            dVar.f4692d = gVar2;
                            dVar.f4693e = h8;
                            dVar.f4694f = 1;
                            if (io.ktor.utils.io.j.a.a(jVarMo220e, 0, aVar, dVar, 1, null) == objF) {
                                return objF;
                            }
                        }
                        if (th2 == null) {
                            throw th2;
                        }
                        t.d(g8);
                        return G.f1419a;
                    }
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    H h9 = (H) dVar.f4693e;
                    J7.g gVar4 = (J7.g) dVar.f4692d;
                    T5.e eVar2 = (T5.e) dVar.f4691c;
                    G6.g gVar5 = (G6.g) dVar.f4690b;
                    Closeable closeable2 = (Closeable) dVar.f4689a;
                    C c10 = (C) dVar.f4695g;
                    r.b(obj);
                    gVar2 = gVar4;
                    eVar = eVar2;
                    gVar = gVar5;
                    closeable = closeable2;
                    c8 = c10;
                    h8 = h9;
                    c8.mo220e().flush();
                    dVar = this;
                    if (gVar2.isOpen()) {
                    }
                    g8 = G.f1419a;
                    if (closeable != null) {
                        closeable.close();
                    }
                } catch (Throwable th4) {
                    th = th4;
                    Closeable closeable3 = closeable;
                    if (closeable3 != null) {
                        try {
                            closeable3.close();
                        } catch (Throwable th5) {
                            C0918g.a(th, th5);
                        }
                    }
                    th2 = th;
                    g8 = null;
                }
            } catch (Throwable th6) {
                th = th6;
            }
            if (th2 == null) {
                throw th2;
            }
            t.d(g8);
            return G.f1419a;
        }
    }

    public static final A e(p007a6.c cVar, G6.g callContext) {
        t.g(cVar, "<this>");
        t.g(callContext, "callContext");
        if (cVar instanceof a6.c.a) {
            byte[] bArrD = ((a6.c.a) cVar).d();
            return A.f34507a.a(bArrD, w.f34839e.b(String.valueOf(cVar.b())), 0, bArrD.length);
        }
        if (cVar instanceof a6.c.d) {
            return new j(cVar.a(), new a(cVar));
        }
        if (cVar instanceof a6.c.e) {
            return new j(cVar.a(), new b(callContext, cVar));
        }
        if (cVar instanceof a6.c.b) {
            return A.f34507a.a(new byte[0], null, 0, 0);
        }
        throw new H5.h(cVar);
    }

    public static final z f(T5.e eVar, G6.g gVar) {
        z.a aVar = new z.a();
        aVar.g(eVar.h().toString());
        J5.o.d(eVar.e(), eVar.b(), new c(aVar));
        aVar.e(eVar.f().e(), A7.f.b(eVar.f().e()) ? e(eVar.b(), gVar) : null);
        return aVar.b();
    }

    public static final Throwable g(Throwable th, T5.e eVar) {
        return th instanceof SocketTimeoutException ? v.c(eVar, th) : th;
    }

    public static final x.a h(x.a aVar, M5.u.a aVar2) {
        Long lC = aVar2.c();
        if (lC != null) {
            aVar.b(v.e(lC.longValue()), TimeUnit.MILLISECONDS);
        }
        Long lE = aVar2.e();
        if (lE != null) {
            long jLongValue = lE.longValue();
            long jE = v.e(jLongValue);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            aVar.M(jE, timeUnit);
            aVar.O(v.e(jLongValue), timeUnit);
        }
        return aVar;
    }

    public static final io.ktor.utils.io.g i(J7.g gVar, G6.g gVar2, T5.e eVar) {
        return q.g(C1802o0.f15975a, gVar2, false, new d(gVar, gVar2, eVar, null), 2, null).mo219e();
    }
}
