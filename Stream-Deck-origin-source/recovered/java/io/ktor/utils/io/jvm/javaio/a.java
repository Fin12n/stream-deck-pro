package io.ktor.utils.io.jvm.javaio;

import C6.G;
import C6.m;
import C6.q;
import C6.r;
import I6.l;
import Q6.k;
import com.revenuecat.purchases.subscriberattributes.caching.tU.ajyWhveMDgQ;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.AbstractC1790i0;
import p017b7.InterfaceC1776b0;
import p017b7.InterfaceC1815v0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f25508f = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "state");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1815v0 f25509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G6.d f25510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1776b0 f25511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f25513e;
    volatile /* synthetic */ int result;
    volatile /* synthetic */ Object state;

    /* JADX INFO: renamed from: io.ktor.utils.io.jvm.javaio.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0579a extends l implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f25514a;

        public C0579a(G6.d dVar) {
            super(1, dVar);
        }

        @Override // I6.a
        public final G6.d create(G6.d dVar) {
            return a.this.new C0579a(dVar);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(G6.d dVar) {
            return ((C0579a) create(dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f25514a;
            if (i8 == 0) {
                r.b(obj);
                a aVar = a.this;
                this.f25514a = 1;
                if (aVar.h(this) == objF) {
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

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {
        public b() {
            super(1);
        }

        public final void b(Throwable th) {
            if (th != null) {
                G6.d dVar = a.this.f25510b;
                q.a aVar = q.f1441b;
                dVar.resumeWith(q.b(r.a(th)));
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c implements G6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final G6.g f25517a;

        public c() {
            this.f25517a = a.this.g() != null ? i.f25541c.P1(a.this.g()) : i.f25541c;
        }

        @Override // G6.d
        public G6.g getContext() {
            return this.f25517a;
        }

        @Override // G6.d
        public void resumeWith(Object obj) {
            Object obj2;
            boolean z8;
            Throwable thE;
            InterfaceC1815v0 interfaceC1815v0G;
            Object objE = q.e(obj);
            if (objE == null) {
                objE = G.f1419a;
            }
            a aVar = a.this;
            do {
                obj2 = aVar.state;
                z8 = obj2 instanceof Thread;
                if (!(z8 ? true : obj2 instanceof G6.d ? true : t.c(obj2, this))) {
                    return;
                }
            } while (!F1.b.a(a.f25508f, aVar, obj2, objE));
            if (z8) {
                f.a().b(obj2);
            } else if ((obj2 instanceof G6.d) && (thE = q.e(obj)) != null) {
                ((G6.d) obj2).resumeWith(q.b(r.a(thE)));
            }
            if (q.g(obj) && !(q.e(obj) instanceof CancellationException) && (interfaceC1815v0G = a.this.g()) != null) {
                InterfaceC1815v0.a.a(interfaceC1815v0G, null, 1, null);
            }
            InterfaceC1776b0 interfaceC1776b0 = a.this.f25511c;
            if (interfaceC1776b0 != null) {
                interfaceC1776b0.d();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final void d(int i8) {
        this.result = i8;
    }

    public final int e() {
        return this.f25513e;
    }

    public final int f() {
        return this.f25512d;
    }

    public final InterfaceC1815v0 g() {
        return this.f25509a;
    }

    public abstract Object h(G6.d dVar);

    public final void i(Thread thread) {
        if (this.state != thread) {
            return;
        }
        if (!f.b()) {
            io.ktor.utils.io.jvm.javaio.b.b().a("Blocking network thread detected. \nIt can possible lead to a performance decline or even a deadlock.\nPlease make sure you're using blocking IO primitives like InputStream and OutputStream only in \nthe context of Dispatchers.IO:\n```\nwithContext(Dispatchers.IO) {\n    myInputStream.read()\n}\n```");
        }
        while (true) {
            long jB = AbstractC1790i0.b();
            if (this.state != thread) {
                return;
            }
            if (jB > 0) {
                f.a().a(jB);
            }
        }
    }

    public final Object j(G6.d dVar) {
        Object obj;
        G6.d dVarC;
        Object obj2 = null;
        while (true) {
            Object obj3 = this.state;
            if (obj3 instanceof Thread) {
                dVarC = H6.b.c(dVar);
                obj = obj3;
            } else {
                if (!t.c(obj3, this)) {
                    throw new IllegalStateException("Already suspended or in finished state");
                }
                obj = obj2;
                dVarC = H6.b.c(dVar);
            }
            if (F1.b.a(f25508f, this, obj3, dVarC)) {
                if (obj != null) {
                    f.a().b(obj);
                }
                return H6.c.f();
            }
            obj2 = obj;
        }
    }

    public final int l(Object jobToken) throws Throwable {
        Object obj;
        Object mVar;
        t.g(jobToken, "jobToken");
        Thread thread = Thread.currentThread();
        G6.d dVar = null;
        do {
            obj = this.state;
            if (obj instanceof G6.d) {
                t.e(obj, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any>");
                dVar = (G6.d) obj;
                mVar = thread;
            } else {
                if (obj instanceof G) {
                    return this.result;
                }
                if (obj instanceof Throwable) {
                    throw ((Throwable) obj);
                }
                if (obj instanceof Thread) {
                    throw new IllegalStateException("There is already thread owning adapter");
                }
                if (t.c(obj, this)) {
                    throw new IllegalStateException("Not yet started");
                }
                mVar = new m();
            }
            t.f(mVar, "when (value) {\n         …Exception()\n            }");
        } while (!F1.b.a(f25508f, this, obj, mVar));
        t.d(dVar);
        dVar.resumeWith(q.b(jobToken));
        t.f(thread, "thread");
        i(thread);
        Object obj2 = this.state;
        if (obj2 instanceof Throwable) {
            throw ((Throwable) obj2);
        }
        return this.result;
    }

    public final int m(byte[] buffer, int i8, int i9) {
        t.g(buffer, "buffer");
        this.f25512d = i8;
        this.f25513e = i9;
        return l(buffer);
    }

    public a(InterfaceC1815v0 interfaceC1815v0) {
        this.f25509a = interfaceC1815v0;
        c cVar = new c();
        this.f25510b = cVar;
        this.state = this;
        this.result = 0;
        this.f25511c = interfaceC1815v0 != null ? interfaceC1815v0.H0(new b()) : null;
        ((k) P.e(new C0579a(null), 1)).invoke(cVar);
        if (this.state == this) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public final void k() {
        InterfaceC1776b0 interfaceC1776b0 = this.f25511c;
        if (interfaceC1776b0 != null) {
            interfaceC1776b0.d();
        }
        G6.d dVar = this.f25510b;
        q.a aVar = q.f1441b;
        dVar.resumeWith(q.b(r.a(new CancellationException(ajyWhveMDgQ.ouOP))));
    }

    public /* synthetic */ a(InterfaceC1815v0 interfaceC1815v0, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? null : interfaceC1815v0);
    }
}
