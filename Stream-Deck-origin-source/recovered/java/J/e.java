package J;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile Executor f3896b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f3897a = Executors.newFixedThreadPool(2, new a());

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicInteger f3898a = new AtomicInteger(0);

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, "CameraX-camerax_io_%d", Integer.valueOf(this.f3898a.getAndIncrement())));
            return thread;
        }
    }

    public static Executor a() {
        if (f3896b != null) {
            return f3896b;
        }
        synchronized (e.class) {
            try {
                if (f3896b == null) {
                    f3896b = new e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f3896b;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f3897a.execute(runnable);
    }
}
