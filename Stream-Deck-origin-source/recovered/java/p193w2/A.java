package p193w2;

import C6.G;
import H.FL.dCqzKmEghGTQ;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class A implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f36756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f36757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Runnable f36758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f36759d;

    public A(Executor executor) {
        t.g(executor, "executor");
        this.f36756a = executor;
        this.f36757b = new ArrayDeque();
        this.f36759d = new Object();
    }

    public final void d() {
        synchronized (this.f36759d) {
            try {
                Object objPoll = this.f36757b.poll();
                Runnable runnable = (Runnable) objPoll;
                this.f36758c = runnable;
                if (objPoll != null) {
                    this.f36756a.execute(runnable);
                }
                G g8 = G.f1419a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable command) {
        t.g(command, "command");
        synchronized (this.f36759d) {
            try {
                this.f36757b.offer(new Runnable() { // from class: w2.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        A.b(command, this);
                    }
                });
                if (this.f36758c == null) {
                    d();
                }
                G g8 = G.f1419a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void b(Runnable command, A a8) {
        t.g(command, "$command");
        t.g(a8, dCqzKmEghGTQ.yOhOUMWsRALTf);
        try {
            command.run();
        } finally {
            a8.d();
        }
    }
}
