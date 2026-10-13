package J;

import K.n;
import Z.JTT.ryTuoS;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p201x2.vAk.kDsnNkYbBsI;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractExecutorService implements ScheduledExecutorService {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ThreadLocal f3881b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f3882a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ScheduledExecutorService initialValue() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return J.a.d();
            }
            if (Looper.myLooper() != null) {
                return new c(new Handler(Looper.myLooper()));
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class b implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f3883a;

        public b(Runnable runnable) {
            this.f3883a = runnable;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            this.f3883a.run();
            return null;
        }
    }

    /* JADX INFO: renamed from: J.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class RunnableScheduledFutureC0144c implements RunnableScheduledFuture {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReference f3885a = new AtomicReference(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f3886b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Callable f3887c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Y4.a f3888d;

        /* JADX INFO: renamed from: J.c$c$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public class a implements F1.c.InterfaceC0112c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Handler f3889a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Callable f3890b;

            /* JADX INFO: renamed from: J.c$c$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public class RunnableC0145a implements Runnable {
                public RunnableC0145a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (RunnableScheduledFutureC0144c.this.f3885a.getAndSet(null) != null) {
                        a aVar = a.this;
                        aVar.f3889a.removeCallbacks(RunnableScheduledFutureC0144c.this);
                    }
                }
            }

            public a(Handler handler, Callable callable) {
                this.f3889a = handler;
                this.f3890b = callable;
            }

            @Override // F1.c.InterfaceC0112c
            public Object a(F1.c.a aVar) {
                aVar.a(new RunnableC0145a(), J.a.a());
                RunnableScheduledFutureC0144c.this.f3885a.set(aVar);
                return "HandlerScheduledFuture-" + this.f3890b.toString();
            }
        }

        public RunnableScheduledFutureC0144c(Handler handler, long j8, Callable callable) {
            this.f3886b = j8;
            this.f3887c = callable;
            this.f3888d = F1.c.a(new a(handler, callable));
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(Delayed delayed) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z8) {
            return this.f3888d.cancel(z8);
        }

        @Override // java.util.concurrent.Future
        public Object get() {
            return this.f3888d.get();
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            return timeUnit.convert(this.f3886b - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f3888d.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f3888d.isDone();
        }

        @Override // java.util.concurrent.RunnableScheduledFuture
        public boolean isPeriodic() {
            return false;
        }

        @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
            F1.c.a aVar = (F1.c.a) this.f3885a.getAndSet(null);
            if (aVar != null) {
                try {
                    aVar.c(this.f3887c.call());
                } catch (Exception e8) {
                    aVar.f(e8);
                }
            }
        }

        @Override // java.util.concurrent.Future
        public Object get(long j8, TimeUnit timeUnit) {
            return this.f3888d.get(j8, timeUnit);
        }
    }

    public c(Handler handler) {
        this.f3882a = handler;
    }

    public final RejectedExecutionException a() {
        return new RejectedExecutionException(this.f3882a + " is shutting down");
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j8, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (!this.f3882a.post(runnable)) {
            throw a();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(Runnable runnable, long j8, TimeUnit timeUnit) {
        return schedule(new b(runnable), j8, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j8, long j9, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " does not yet support fixed-delay scheduling.");
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j8, long j9, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(c.class.getSimpleName() + kDsnNkYbBsI.FLFKUnDMenXR);
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        throw new UnsupportedOperationException(c.class.getSimpleName() + ryTuoS.NMkqLKqhfuoLPn);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(Callable callable, long j8, TimeUnit timeUnit) {
        long jUptimeMillis = SystemClock.uptimeMillis() + TimeUnit.MILLISECONDS.convert(j8, timeUnit);
        RunnableScheduledFutureC0144c runnableScheduledFutureC0144c = new RunnableScheduledFutureC0144c(this.f3882a, jUptimeMillis, callable);
        return this.f3882a.postAtTime(runnableScheduledFutureC0144c, jUptimeMillis) ? runnableScheduledFutureC0144c : n.o(a());
    }
}
