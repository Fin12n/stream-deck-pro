package p140p5;

import M4.AbstractExecutorServiceC1066u;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p219z4.AbstractC3207p;

/* JADX INFO: renamed from: p5.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class C2800j extends AbstractExecutorServiceC1066u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f31260b = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadPoolExecutor f31261a;

    public C2800j() {
        final ThreadFactory threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: p5.v
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(final Runnable runnable) {
                return threadFactoryDefaultThreadFactory.newThread(new Runnable() { // from class: p5.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2800j.e(runnable);
                    }
                });
            }
        });
        this.f31261a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static /* synthetic */ void e(Runnable runnable) {
        f31260b.set(new ArrayDeque());
        runnable.run();
    }

    public static void f(Deque deque, Runnable runnable) {
        AbstractC3207p.k(deque);
        deque.add(runnable);
        if (deque.size() <= 1) {
            do {
                runnable.run();
                deque.removeFirst();
                runnable = (Runnable) deque.peekFirst();
            } while (runnable != null);
        }
    }

    @Override // M4.Y
    public final /* synthetic */ Object a() {
        return this.f31261a;
    }

    @Override // M4.AbstractExecutorServiceC1066u
    public final ExecutorService b() {
        return this.f31261a;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        Deque deque = (Deque) f31260b.get();
        if (deque == null || deque.size() > 1) {
            this.f31261a.execute(new Runnable() { // from class: p5.u
                @Override // java.lang.Runnable
                public final void run() {
                    C2800j.f((Deque) C2800j.f31260b.get(), runnable);
                }
            });
        } else {
            f(deque, runnable);
        }
    }
}
