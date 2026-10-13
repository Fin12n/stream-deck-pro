package p059g4;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class i implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f23758a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f23759a;

        public a(Runnable runnable) {
            this.f23759a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f23759a.run();
            } catch (Exception e8) {
                p095k4.a.c("Executor", "Background execution failure.", e8);
            }
        }
    }

    public i(Executor executor) {
        this.f23758a = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f23758a.execute(new a(runnable));
    }
}
