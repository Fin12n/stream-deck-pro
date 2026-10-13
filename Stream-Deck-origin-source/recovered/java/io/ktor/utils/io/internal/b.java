package io.ktor.utils.io.internal;

import C6.G;
import C6.q;
import C6.r;
import com.amazon.device.simplesignin.model.request.wwj.WaYxBuDSBD;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.t;
import p017b7.InterfaceC1776b0;
import p017b7.InterfaceC1815v0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements G6.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f25450a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "state");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f25451b = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "jobCancellationHandler");
    private volatile /* synthetic */ Object state = null;
    private volatile /* synthetic */ Object jobCancellationHandler = null;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class a implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC1815v0 f25452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public InterfaceC1776b0 f25453b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f25454c;

        public a(b bVar, InterfaceC1815v0 job) {
            t.g(job, "job");
            this.f25454c = bVar;
            this.f25452a = job;
            InterfaceC1776b0 interfaceC1776b0D = InterfaceC1815v0.a.d(job, true, false, this, 2, null);
            if (job.b()) {
                this.f25453b = interfaceC1776b0D;
            }
        }

        public final void b() {
            InterfaceC1776b0 interfaceC1776b0 = this.f25453b;
            if (interfaceC1776b0 != null) {
                this.f25453b = null;
                interfaceC1776b0.d();
            }
        }

        public final InterfaceC1815v0 c() {
            return this.f25452a;
        }

        public void d(Throwable th) {
            this.f25454c.g(this);
            b();
            if (th != null) {
                this.f25454c.i(this.f25452a, th);
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            d((Throwable) obj);
            return G.f1419a;
        }
    }

    public final void c(Object value) {
        t.g(value, "value");
        resumeWith(q.b(value));
        a aVar = (a) f25451b.getAndSet(this, null);
        if (aVar != null) {
            aVar.b();
        }
    }

    public final void d(Throwable cause) {
        t.g(cause, "cause");
        q.a aVar = q.f1441b;
        resumeWith(q.b(r.a(cause)));
        a aVar2 = (a) f25451b.getAndSet(this, null);
        if (aVar2 != null) {
            aVar2.b();
        }
    }

    public final Object e(G6.d actual) {
        t.g(actual, "actual");
        while (true) {
            Object obj = this.state;
            if (obj == null) {
                if (F1.b.a(f25450a, this, null, actual)) {
                    h(actual.getContext());
                    return H6.c.f();
                }
            } else if (F1.b.a(f25450a, this, obj, null)) {
                if (obj instanceof Throwable) {
                    throw ((Throwable) obj);
                }
                t.e(obj, "null cannot be cast to non-null type T of io.ktor.utils.io.internal.CancellableReusableContinuation");
                return obj;
            }
        }
    }

    public final void g(a aVar) {
        F1.b.a(f25451b, this, aVar, null);
    }

    @Override // G6.d
    public G6.g getContext() {
        G6.g context;
        Object obj = this.state;
        G6.d dVar = obj instanceof G6.d ? (G6.d) obj : null;
        return (dVar == null || (context = dVar.getContext()) == null) ? G6.h.f2820a : context;
    }

    public final void h(G6.g gVar) {
        Object obj;
        a aVar;
        InterfaceC1815v0 interfaceC1815v0 = (InterfaceC1815v0) gVar.A(InterfaceC1815v0.f15985O);
        a aVar2 = (a) this.jobCancellationHandler;
        if ((aVar2 != null ? aVar2.c() : null) == interfaceC1815v0) {
            return;
        }
        if (interfaceC1815v0 == null) {
            a aVar3 = (a) f25451b.getAndSet(this, null);
            if (aVar3 != null) {
                aVar3.b();
                return;
            }
            return;
        }
        a aVar4 = new a(this, interfaceC1815v0);
        do {
            obj = this.jobCancellationHandler;
            aVar = (a) obj;
            if (aVar != null && aVar.c() == interfaceC1815v0) {
                aVar4.b();
                return;
            }
        } while (!F1.b.a(f25451b, this, obj, aVar4));
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // G6.d
    public void resumeWith(Object obj) {
        Object obj2;
        Object objE;
        do {
            obj2 = this.state;
            if (obj2 == null) {
                objE = q.e(obj);
                if (objE == null) {
                    r.b(obj);
                    objE = obj;
                }
            } else if (!(obj2 instanceof G6.d)) {
                return;
            } else {
                objE = null;
            }
        } while (!F1.b.a(f25450a, this, obj2, objE));
        if (obj2 instanceof G6.d) {
            ((G6.d) obj2).resumeWith(obj);
        }
    }

    public final void i(InterfaceC1815v0 interfaceC1815v0, Throwable th) {
        Object obj;
        G6.d dVar;
        do {
            obj = this.state;
            if (!(obj instanceof G6.d)) {
                return;
            }
            dVar = (G6.d) obj;
            if (dVar.getContext().A(InterfaceC1815v0.f15985O) != interfaceC1815v0) {
                return;
            }
        } while (!F1.b.a(f25450a, this, obj, null));
        t.e(obj, WaYxBuDSBD.zMGVVmzBjZd);
        q.a aVar = q.f1441b;
        dVar.resumeWith(q.b(r.a(th)));
    }
}
