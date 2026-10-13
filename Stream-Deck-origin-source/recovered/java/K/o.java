package K;

import A.AbstractC0890p0;
import R0.pkXL.Oitvkwcwn;
import com.amazon.device.simplesignin.a.LSJS.cFAYKUlMj;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class o implements Y4.a {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a extends o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f4481a;

        public a(Throwable th) {
            this.f4481a = th;
        }

        @Override // K.o, java.util.concurrent.Future
        public Object get() throws ExecutionException {
            throw new ExecutionException(this.f4481a);
        }

        public String toString() {
            return super.toString() + "[status=FAILURE, cause=[" + this.f4481a + "]]";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends a implements ScheduledFuture {
        public b(Throwable th) {
            super(th);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(Delayed delayed) {
            return -1;
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            return 0L;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final o f4482b = new c(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f4483a;

        public c(Object obj) {
            this.f4483a = obj;
        }

        @Override // K.o, java.util.concurrent.Future
        public Object get() {
            return this.f4483a;
        }

        public String toString() {
            return super.toString() + cFAYKUlMj.ZRMfPBzcL + this.f4483a + "]]";
        }
    }

    public static Y4.a b() {
        return c.f4482b;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z8) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public abstract Object get();

    @Override // java.util.concurrent.Future
    public Object get(long j8, TimeUnit timeUnit) {
        T1.f.g(timeUnit);
        return get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }

    @Override // Y4.a
    public void a(Runnable runnable, Executor executor) {
        T1.f.g(runnable);
        T1.f.g(executor);
        try {
            executor.execute(runnable);
        } catch (RuntimeException e8) {
            AbstractC0890p0.d("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + Oitvkwcwn.iPOvLaITITSqYHr + executor, e8);
        }
    }
}
