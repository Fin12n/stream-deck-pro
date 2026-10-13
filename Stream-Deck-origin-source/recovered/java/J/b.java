package J;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile b f3880a;

    public static Executor a() {
        if (f3880a != null) {
            return f3880a;
        }
        synchronized (b.class) {
            try {
                if (f3880a == null) {
                    f3880a = new b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f3880a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
