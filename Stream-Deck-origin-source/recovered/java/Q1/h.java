package Q1;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f9146a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f9147b;

        /* JADX INFO: renamed from: Q1.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static class C0256a extends Thread {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f9148a;

            public C0256a(Runnable runnable, String str, int i8) {
                super(runnable, str);
                this.f9148a = i8;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f9148a);
                super.run();
            }
        }

        public a(String str, int i8) {
            this.f9146a = str;
            this.f9147b = i8;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0256a(runnable, this.f9146a, this.f9147b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Callable f9149a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public T1.a f9150b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Handler f9151c;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ T1.a f9152a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Object f9153b;

            public a(T1.a aVar, Object obj) {
                this.f9152a = aVar;
                this.f9153b = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f9152a.accept(this.f9153b);
            }
        }

        public b(Handler handler, Callable callable, T1.a aVar) {
            this.f9149a = callable;
            this.f9150b = aVar;
            this.f9151c = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object objCall;
            try {
                objCall = this.f9149a.call();
            } catch (Exception unused) {
                objCall = null;
            }
            this.f9151c.post(new a(this.f9150b, objCall));
        }
    }

    public static ThreadPoolExecutor a(String str, int i8, int i9) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i9, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i8));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static void b(Executor executor, Callable callable, T1.a aVar) {
        executor.execute(new b(Q1.b.a(), callable, aVar));
    }

    public static Object c(ExecutorService executorService, Callable callable, int i8) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i8, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e8) {
            throw e8;
        } catch (ExecutionException e9) {
            throw new RuntimeException(e9);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
