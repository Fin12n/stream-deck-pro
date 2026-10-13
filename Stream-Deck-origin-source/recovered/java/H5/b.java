package H5;

import C6.r;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p017b7.J;
import p017b7.K;
import p115m6.C2691a;
import p115m6.InterfaceC2692b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class b implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G5.a f3553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T5.c f3554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public U5.c f3555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f3556d;
    private volatile /* synthetic */ int received;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f3550e = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C2691a f3552g = new C2691a("CustomResponse");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3551f = AtomicIntegerFieldUpdater.newUpdater(b.class, "received");

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: H5.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0134b extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f3557a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f3558b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f3559c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f3561e;

        public C0134b(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f3559c = obj;
            this.f3561e |= Integer.MIN_VALUE;
            return b.this.a(null, this);
        }
    }

    public b(G5.a client) {
        t.g(client, "client");
        this.f3553a = client;
        this.received = 0;
    }

    public static /* synthetic */ Object i(b bVar, G6.d dVar) {
        return bVar.g().b();
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009d, code lost:
    
        if (r7 == r1) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(p181u6.a aVar, G6.d dVar) {
        C0134b c0134b;
        b bVar;
        b bVar2;
        Object objC;
        if (dVar instanceof C0134b) {
            c0134b = (C0134b) dVar;
            int i8 = c0134b.f3561e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0134b.f3561e = i8 - Integer.MIN_VALUE;
            } else {
                c0134b = new C0134b(dVar);
            }
        } else {
            c0134b = new C0134b(dVar);
        }
        Object objE = c0134b.f3559c;
        Object objF = H6.c.f();
        int i9 = c0134b.f3561e;
        if (i9 == 0) {
            r.b(objE);
            try {
                if (p181u6.b.b(g(), aVar.b())) {
                    U5.c cVarG = g();
                    U5.e.c(g());
                    return cVarG;
                }
                if (!b() && !f3551f.compareAndSet(this, 0, 1)) {
                    throw new H5.a(this);
                }
                objE = getAttributes().e(f3552g);
                if (objE == null) {
                    c0134b.f3557a = this;
                    c0134b.f3558b = aVar;
                    c0134b.f3561e = 1;
                    objE = h(c0134b);
                }
                bVar2 = this;
            } catch (Throwable th) {
                th = th;
                bVar = this;
                K.c(bVar.g(), "Receive failed", th);
                throw th;
            }
        } else {
            if (i9 != 1) {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (p181u6.a) c0134b.f3558b;
                bVar = (b) c0134b.f3557a;
                try {
                    r.b(objE);
                    objC = ((U5.d) objE).c();
                    if (!t.c(objC, p007a6.b.f13441a)) {
                        objC = null;
                    }
                    if (objC != null && !p181u6.b.b(objC, aVar.b())) {
                        throw new c(bVar.g(), kotlin.jvm.internal.K.b(objC.getClass()), aVar.b());
                    }
                    U5.e.c(bVar.g());
                    return objC;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        K.c(bVar.g(), "Receive failed", th);
                        throw th;
                    } catch (Throwable th3) {
                        U5.e.c(bVar.g());
                        throw th3;
                    }
                }
            }
            aVar = (p181u6.a) c0134b.f3558b;
            bVar2 = (b) c0134b.f3557a;
            try {
                r.b(objE);
            } catch (Throwable th4) {
                th = th4;
                bVar = bVar2;
                K.c(bVar.g(), "Receive failed", th);
                throw th;
            }
        }
        U5.d dVar2 = new U5.d(aVar, objE);
        U5.f fVarY = bVar2.f3553a.Y();
        c0134b.f3557a = bVar2;
        c0134b.f3558b = aVar;
        c0134b.f3561e = 2;
        objE = fVarY.d(bVar2, dVar2, c0134b);
        if (objE != objF) {
            bVar = bVar2;
            objC = ((U5.d) objE).c();
            if (!t.c(objC, p007a6.b.f13441a)) {
                objC = null;
            }
            if (objC != null) {
                throw new c(bVar.g(), kotlin.jvm.internal.K.b(objC.getClass()), aVar.b());
            }
            U5.e.c(bVar.g());
            return objC;
        }
        return objF;
    }

    public boolean b() {
        return this.f3556d;
    }

    public final G5.a d() {
        return this.f3553a;
    }

    public final T5.c f() {
        T5.c cVar = this.f3554b;
        if (cVar != null) {
            return cVar;
        }
        t.t("request");
        return null;
    }

    public final U5.c g() {
        U5.c cVar = this.f3555c;
        if (cVar != null) {
            return cVar;
        }
        t.t("response");
        return null;
    }

    public final InterfaceC2692b getAttributes() {
        return f().getAttributes();
    }

    @Override // p017b7.J
    public G6.g getCoroutineContext() {
        return g().getCoroutineContext();
    }

    public Object h(G6.d dVar) {
        return i(this, dVar);
    }

    public final void j(T5.c cVar) {
        t.g(cVar, "<set-?>");
        this.f3554b = cVar;
    }

    public final void k(U5.c cVar) {
        t.g(cVar, "<set-?>");
        this.f3555c = cVar;
    }

    public final void l(U5.c response) {
        t.g(response, "response");
        k(response);
    }

    public String toString() {
        return "HttpClientCall[" + f().o() + ", " + g().g() + ']';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(G5.a client, T5.e requestData, T5.h responseData) {
        this(client);
        t.g(client, "client");
        t.g(requestData, "requestData");
        t.g(responseData, "responseData");
        j(new T5.b(this, requestData));
        k(new U5.a(this, responseData));
        if (responseData.a() instanceof io.ktor.utils.io.g) {
            return;
        }
        getAttributes().d(f3552g, responseData.a());
    }
}
