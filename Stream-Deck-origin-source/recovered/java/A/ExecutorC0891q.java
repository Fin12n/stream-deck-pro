package A;

import android.os.Process;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: A.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class ExecutorC0891q implements Executor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ThreadFactory f298c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f299a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ThreadPoolExecutor f300b = b();

    /* JADX INFO: renamed from: A.q$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicInteger f301a = new AtomicInteger(0);

        public static /* synthetic */ void a(Runnable runnable) {
            Process.setThreadPriority(-3);
            runnable.run();
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(final Runnable runnable) {
            Thread thread = new Thread(new Runnable() { // from class: A.p
                @Override // java.lang.Runnable
                public final void run() {
                    ExecutorC0891q.a.a(runnable);
                }
            });
            thread.setPriority(7);
            thread.setName(String.format(Locale.US, "CameraX-core_camera_%d", Integer.valueOf(this.f301a.getAndIncrement())));
            return thread;
        }
    }

    public static ThreadPoolExecutor b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f298c);
        threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandler() { // from class: A.o
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                AbstractC0890p0.c("CameraExecutor", "A rejected execution occurred in CameraExecutor!");
            }
        });
        return threadPoolExecutor;
    }

    public void d() {
        synchronized (this.f299a) {
            try {
                if (!this.f300b.isShutdown()) {
                    this.f300b.shutdown();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(H.H h8) {
        ThreadPoolExecutor threadPoolExecutor;
        T1.f.g(h8);
        synchronized (this.f299a) {
            try {
                if (this.f300b.isShutdown()) {
                    this.f300b = b();
                }
                threadPoolExecutor = this.f300b;
            } catch (Throwable th) {
                throw th;
            }
        }
        int iMax = Math.max(1, h8.c().size());
        threadPoolExecutor.setMaximumPoolSize(iMax);
        threadPoolExecutor.setCorePoolSize(iMax);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        T1.f.g(runnable);
        synchronized (this.f299a) {
            this.f300b.execute(runnable);
        }
    }
}
