package K;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p142q.a f4474a = new b();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements K.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p142q.a f4475a;

        public a(p142q.a aVar) {
            this.f4475a = aVar;
        }

        @Override // K.a
        public Y4.a apply(Object obj) {
            return n.p(this.f4475a.apply(obj));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class c implements K.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ F1.c.a f4476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p142q.a f4477b;

        public c(F1.c.a aVar, p142q.a aVar2) {
            this.f4476a = aVar;
            this.f4477b = aVar2;
        }

        @Override // K.c
        public void a(Object obj) {
            try {
                this.f4476a.c(this.f4477b.apply(obj));
            } catch (Throwable th) {
                this.f4476a.f(th);
            }
        }

        @Override // K.c
        public void b(Throwable th) {
            this.f4476a.f(th);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Y4.a f4478a;

        public d(Y4.a aVar) {
            this.f4478a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4478a.cancel(true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Future f4479a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final K.c f4480b;

        public e(Future future, K.c cVar) {
            this.f4479a = future;
            this.f4480b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f4480b.a(n.l(this.f4479a));
            } catch (Error e8) {
                e = e8;
                this.f4480b.b(e);
            } catch (RuntimeException e9) {
                e = e9;
                this.f4480b.b(e);
            } catch (ExecutionException e10) {
                Throwable cause = e10.getCause();
                if (cause == null) {
                    this.f4480b.b(e10);
                } else {
                    this.f4480b.b(cause);
                }
            }
        }

        public String toString() {
            return e.class.getSimpleName() + com.amazon.a.a.o.b.f.f16777a + this.f4480b;
        }
    }

    public static /* synthetic */ Object a(final Y4.a aVar, ScheduledExecutorService scheduledExecutorService, final Object obj, final boolean z8, long j8, final F1.c.a aVar2) {
        t(aVar, aVar2);
        if (!aVar.isDone()) {
            final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new Runnable() { // from class: K.e
                @Override // java.lang.Runnable
                public final void run() {
                    n.h(aVar2, obj, z8, aVar);
                }
            }, j8, TimeUnit.MILLISECONDS);
            aVar.a(new Runnable() { // from class: K.f
                @Override // java.lang.Runnable
                public final void run() {
                    scheduledFutureSchedule.cancel(true);
                }
            }, J.a.a());
        }
        return "TimeoutFuture[" + aVar + "]";
    }

    public static /* synthetic */ Object c(Y4.a aVar, F1.c.a aVar2) {
        v(false, aVar, f4474a, aVar2, J.a.a());
        return "nonCancellationPropagating[" + aVar + "]";
    }

    public static /* synthetic */ Object d(final Y4.a aVar, ScheduledExecutorService scheduledExecutorService, final long j8, final F1.c.a aVar2) {
        t(aVar, aVar2);
        if (!aVar.isDone()) {
            final ScheduledFuture scheduledFutureSchedule = scheduledExecutorService.schedule(new Callable() { // from class: K.k
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(aVar2.f(new TimeoutException("Future[" + aVar + "] is not done within " + j8 + " ms.")));
                }
            }, j8, TimeUnit.MILLISECONDS);
            aVar.a(new Runnable() { // from class: K.l
                @Override // java.lang.Runnable
                public final void run() {
                    scheduledFutureSchedule.cancel(true);
                }
            }, J.a.a());
        }
        return "TimeoutFuture[" + aVar + "]";
    }

    public static /* synthetic */ Object f(Y4.a aVar, final F1.c.a aVar2) {
        aVar.a(new Runnable() { // from class: K.i
            @Override // java.lang.Runnable
            public final void run() {
                aVar2.c(null);
            }
        }, J.a.a());
        return "transformVoidFuture [" + aVar + "]";
    }

    public static /* synthetic */ void h(F1.c.a aVar, Object obj, boolean z8, Y4.a aVar2) {
        aVar.c(obj);
        if (z8) {
            aVar2.cancel(true);
        }
    }

    public static void j(Y4.a aVar, K.c cVar, Executor executor) {
        T1.f.g(cVar);
        aVar.a(new e(aVar, cVar), executor);
    }

    public static Y4.a k(Collection collection) {
        return new p(new ArrayList(collection), true, J.a.a());
    }

    public static Object l(Future future) {
        T1.f.j(future.isDone(), "Future was expected to be done, " + future);
        return m(future);
    }

    public static Object m(Future future) {
        Object obj;
        boolean z8 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z8 = true;
            } catch (Throwable th) {
                if (z8) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z8) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static Y4.a n(Throwable th) {
        return new o.a(th);
    }

    public static ScheduledFuture o(Throwable th) {
        return new o.b(th);
    }

    public static Y4.a p(Object obj) {
        return obj == null ? o.b() : new o.c(obj);
    }

    public static Y4.a q(final long j8, final ScheduledExecutorService scheduledExecutorService, final Y4.a aVar) {
        return F1.c.a(new F1.c.InterfaceC0112c() { // from class: K.j
            @Override // F1.c.InterfaceC0112c
            public final Object a(F1.c.a aVar2) {
                return n.d(aVar, scheduledExecutorService, j8, aVar2);
            }
        });
    }

    public static Y4.a r(final long j8, final ScheduledExecutorService scheduledExecutorService, final Object obj, final boolean z8, final Y4.a aVar) {
        return F1.c.a(new F1.c.InterfaceC0112c() { // from class: K.m
            @Override // F1.c.InterfaceC0112c
            public final Object a(F1.c.a aVar2) {
                return n.a(aVar, scheduledExecutorService, obj, z8, j8, aVar2);
            }
        });
    }

    public static Y4.a s(final Y4.a aVar) {
        T1.f.g(aVar);
        return aVar.isDone() ? aVar : F1.c.a(new F1.c.InterfaceC0112c() { // from class: K.g
            @Override // F1.c.InterfaceC0112c
            public final Object a(F1.c.a aVar2) {
                return n.c(aVar, aVar2);
            }
        });
    }

    public static void t(Y4.a aVar, F1.c.a aVar2) {
        u(aVar, f4474a, aVar2, J.a.a());
    }

    public static void u(Y4.a aVar, p142q.a aVar2, F1.c.a aVar3, Executor executor) {
        v(true, aVar, aVar2, aVar3, executor);
    }

    public static void v(boolean z8, Y4.a aVar, p142q.a aVar2, F1.c.a aVar3, Executor executor) {
        T1.f.g(aVar);
        T1.f.g(aVar2);
        T1.f.g(aVar3);
        T1.f.g(executor);
        j(aVar, new c(aVar3, aVar2), executor);
        if (z8) {
            aVar3.a(new d(aVar), J.a.a());
        }
    }

    public static Y4.a w(Collection collection) {
        return new p(new ArrayList(collection), false, J.a.a());
    }

    public static Y4.a x(Y4.a aVar, p142q.a aVar2, Executor executor) {
        T1.f.g(aVar2);
        return y(aVar, new a(aVar2), executor);
    }

    public static Y4.a y(Y4.a aVar, K.a aVar2, Executor executor) {
        K.b bVar = new K.b(aVar2, aVar);
        aVar.a(bVar, executor);
        return bVar;
    }

    public static Y4.a z(final Y4.a aVar) {
        return F1.c.a(new F1.c.InterfaceC0112c() { // from class: K.h
            @Override // F1.c.InterfaceC0112c
            public final Object a(F1.c.a aVar2) {
                return n.f(aVar, aVar2);
            }
        });
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class b implements p142q.a {
        @Override // p142q.a
        public Object apply(Object obj) {
            return obj;
        }
    }
}
