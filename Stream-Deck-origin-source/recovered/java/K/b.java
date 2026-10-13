package K;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class b extends d implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public K.a f4444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BlockingQueue f4445d = new LinkedBlockingQueue(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CountDownLatch f4446e = new CountDownLatch(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Y4.a f4447f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile Y4.a f4448g;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Y4.a f4449a;

        public a(Y4.a aVar) {
            this.f4449a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    try {
                        b.this.c(n.m(this.f4449a));
                    } catch (CancellationException unused) {
                        b.this.cancel(false);
                    }
                } catch (ExecutionException e8) {
                    b.this.d(e8.getCause());
                }
            } finally {
                b.this.f4448g = null;
            }
        }
    }

    public b(K.a aVar, Y4.a aVar2) {
        this.f4444c = (K.a) T1.f.g(aVar);
        this.f4447f = (Y4.a) T1.f.g(aVar2);
    }

    @Override // K.d, java.util.concurrent.Future
    public boolean cancel(boolean z8) {
        if (!super.cancel(z8)) {
            return false;
        }
        h(this.f4445d, Boolean.valueOf(z8));
        g(this.f4447f, z8);
        g(this.f4448g, z8);
        return true;
    }

    public final void g(Future future, boolean z8) {
        if (future != null) {
            future.cancel(z8);
        }
    }

    @Override // K.d, java.util.concurrent.Future
    public Object get() throws ExecutionException, InterruptedException {
        if (!isDone()) {
            Y4.a aVar = this.f4447f;
            if (aVar != null) {
                aVar.get();
            }
            this.f4446e.await();
            Y4.a aVar2 = this.f4448g;
            if (aVar2 != null) {
                aVar2.get();
            }
        }
        return super.get();
    }

    public final void h(BlockingQueue blockingQueue, Object obj) {
        boolean z8 = false;
        while (true) {
            try {
                blockingQueue.put(obj);
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
    }

    public final Object i(BlockingQueue blockingQueue) {
        Object objTake;
        boolean z8 = false;
        while (true) {
            try {
                objTake = blockingQueue.take();
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
        return objTake;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [K.a, Y4.a] */
    /* JADX WARN: Type inference failed for: r0v1, types: [K.a, Y4.a] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [K.a, Y4.a] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.concurrent.CountDownLatch] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // java.lang.Runnable
    public void run() {
        ?? r8;
        ?? r9 = 0;
        r9 = 0;
        r9 = 0;
        r9 = 0;
        r9 = 0;
        try {
            try {
                Y4.a aVarApply = this.f4444c.apply(n.m(this.f4447f));
                this.f4448g = aVarApply;
                if (isCancelled()) {
                    aVarApply.cancel(((Boolean) i(this.f4445d)).booleanValue());
                    this.f4448g = null;
                } else {
                    aVarApply.a(new a(aVarApply), J.a.a());
                }
            } catch (UndeclaredThrowableException e8) {
                d(e8.getCause());
                r8 = r9;
            } catch (Exception e9) {
                d(e9);
                r8 = r9;
            } catch (Error e10) {
                d(e10);
                r8 = r9;
            } finally {
                this.f4444c = r9;
                this.f4447f = r9;
                this.f4446e.countDown();
            }
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e11) {
            d(e11.getCause());
        }
    }

    @Override // K.d, java.util.concurrent.Future
    public Object get(long j8, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (!isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j8 = timeUnit2.convert(j8, timeUnit);
                timeUnit = timeUnit2;
            }
            Y4.a aVar = this.f4447f;
            if (aVar != null) {
                long jNanoTime = System.nanoTime();
                aVar.get(j8, timeUnit);
                j8 -= Math.max(0L, System.nanoTime() - jNanoTime);
            }
            long jNanoTime2 = System.nanoTime();
            if (this.f4446e.await(j8, timeUnit)) {
                j8 -= Math.max(0L, System.nanoTime() - jNanoTime2);
                Y4.a aVar2 = this.f4448g;
                if (aVar2 != null) {
                    aVar2.get(j8, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return super.get(j8, timeUnit);
    }
}
