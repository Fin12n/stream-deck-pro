package J;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile Executor f3893b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f3894a = Executors.newSingleThreadExecutor(new a());

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements ThreadFactory {
        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(10);
            thread.setName("CameraX-camerax_high_priority");
            return thread;
        }
    }

    public static Executor a() {
        if (f3893b != null) {
            return f3893b;
        }
        synchronized (d.class) {
            try {
                if (f3893b == null) {
                    f3893b = new d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f3893b;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f3894a.execute(runnable);
    }
}
