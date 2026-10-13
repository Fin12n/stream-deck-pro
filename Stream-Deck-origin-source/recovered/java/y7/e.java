package y7;

import C6.G;
import V.ocy.SVzBK;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f38467h = new b(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e f38468i = new e(new c(v7.d.M(v7.d.f35187i + " TaskRunner", true)));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Logger f38469j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f38470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f38472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f38473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f38474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f38475f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Runnable f38476g;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface a {
        void a(e eVar, long j8);

        long b();

        void c(e eVar);

        void execute(Runnable runnable);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {
        public /* synthetic */ b(AbstractC2633k abstractC2633k) {
            this();
        }

        public final Logger a() {
            return e.f38469j;
        }

        public b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ThreadPoolExecutor f38477a;

        public c(ThreadFactory threadFactory) {
            t.g(threadFactory, "threadFactory");
            this.f38477a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // y7.e.a
        public void a(e taskRunner, long j8) throws InterruptedException {
            t.g(taskRunner, "taskRunner");
            long j9 = j8 / 1000000;
            long j10 = j8 - (1000000 * j9);
            if (j9 > 0 || j8 > 0) {
                taskRunner.wait(j9, (int) j10);
            }
        }

        @Override // y7.e.a
        public long b() {
            return System.nanoTime();
        }

        @Override // y7.e.a
        public void c(e taskRunner) {
            t.g(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        @Override // y7.e.a
        public void execute(Runnable runnable) {
            t.g(runnable, "runnable");
            this.f38477a.execute(runnable);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            y7.a aVarD;
            long jB;
            while (true) {
                e eVar = e.this;
                synchronized (eVar) {
                    aVarD = eVar.d();
                }
                if (aVarD == null) {
                    return;
                }
                y7.d dVarD = aVarD.d();
                t.d(dVarD);
                e eVar2 = e.this;
                boolean zIsLoggable = e.f38467h.a().isLoggable(Level.FINE);
                if (zIsLoggable) {
                    jB = dVarD.h().g().b();
                    y7.b.c(aVarD, dVarD, "starting");
                } else {
                    jB = -1;
                }
                try {
                    eVar2.j(aVarD);
                    try {
                        G g8 = G.f1419a;
                        if (zIsLoggable) {
                            y7.b.c(aVarD, dVarD, "finished run in " + y7.b.b(dVarD.h().g().b() - jB));
                        }
                    } catch (Throwable th) {
                        if (zIsLoggable) {
                            y7.b.c(aVarD, dVarD, "failed a run in " + y7.b.b(dVarD.h().g().b() - jB));
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    eVar2.g().execute(this);
                    throw th2;
                }
            }
        }
    }

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        t.f(logger, "getLogger(TaskRunner::class.java.name)");
        f38469j = logger;
    }

    public e(a backend) {
        t.g(backend, "backend");
        this.f38470a = backend;
        this.f38471b = ModuleDescriptor.MODULE_VERSION;
        this.f38474e = new ArrayList();
        this.f38475f = new ArrayList();
        this.f38476g = new d();
    }

    public final void c(y7.a aVar, long j8) {
        if (v7.d.f35186h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        y7.d dVarD = aVar.d();
        t.d(dVarD);
        if (dVarD.c() != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean zD = dVarD.d();
        dVarD.m(false);
        dVarD.l(null);
        this.f38474e.remove(dVarD);
        if (j8 != -1 && !zD && !dVarD.g()) {
            dVarD.k(aVar, j8, true);
        }
        if (dVarD.e().isEmpty()) {
            return;
        }
        this.f38475f.add(dVarD);
    }

    public final y7.a d() {
        boolean z8;
        if (v7.d.f35186h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        while (!this.f38475f.isEmpty()) {
            long jB = this.f38470a.b();
            Iterator it = this.f38475f.iterator();
            long jMin = Long.MAX_VALUE;
            y7.a aVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z8 = false;
                    break;
                }
                y7.a aVar2 = (y7.a) ((y7.d) it.next()).e().get(0);
                long jMax = Math.max(0L, aVar2.c() - jB);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (aVar != null) {
                        z8 = true;
                        break;
                    }
                    aVar = aVar2;
                }
            }
            if (aVar != null) {
                e(aVar);
                if (z8 || (!this.f38472c && !this.f38475f.isEmpty())) {
                    this.f38470a.execute(this.f38476g);
                }
                return aVar;
            }
            if (this.f38472c) {
                if (jMin < this.f38473d - jB) {
                    this.f38470a.c(this);
                }
                return null;
            }
            this.f38472c = true;
            this.f38473d = jB + jMin;
            try {
                try {
                    this.f38470a.a(this, jMin);
                } catch (InterruptedException unused) {
                    f();
                }
                this.f38472c = false;
            } catch (Throwable th) {
                this.f38472c = false;
                throw th;
            }
        }
        return null;
    }

    public final void e(y7.a aVar) {
        if (v7.d.f35186h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        aVar.g(-1L);
        y7.d dVarD = aVar.d();
        t.d(dVarD);
        dVarD.e().remove(aVar);
        this.f38475f.remove(dVarD);
        dVarD.l(aVar);
        this.f38474e.add(dVarD);
    }

    public final void f() {
        int size = this.f38474e.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            } else {
                ((y7.d) this.f38474e.get(size)).b();
            }
        }
        for (int size2 = this.f38475f.size() - 1; -1 < size2; size2--) {
            y7.d dVar = (y7.d) this.f38475f.get(size2);
            dVar.b();
            if (dVar.e().isEmpty()) {
                this.f38475f.remove(size2);
            }
        }
    }

    public final a g() {
        return this.f38470a;
    }

    public final y7.d i() {
        int i8;
        synchronized (this) {
            i8 = this.f38471b;
            this.f38471b = i8 + 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('Q');
        sb.append(i8);
        return new y7.d(this, sb.toString());
    }

    public final void j(y7.a aVar) {
        if (v7.d.f35186h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(aVar.b());
        try {
            long jF = aVar.f();
            synchronized (this) {
                c(aVar, jF);
                G g8 = G.f1419a;
            }
        } finally {
            synchronized (this) {
                c(aVar, -1L);
                G g9 = G.f1419a;
                threadCurrentThread.setName(name);
            }
        }
    }

    public final void h(y7.d taskQueue) {
        t.g(taskQueue, "taskQueue");
        if (v7.d.f35186h && !Thread.holdsLock(this)) {
            throw new AssertionError(SVzBK.BTaXnNiJbnldQfz + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (taskQueue.c() == null) {
            if (taskQueue.e().isEmpty()) {
                this.f38475f.remove(taskQueue);
            } else {
                v7.d.c(this.f38475f, taskQueue);
            }
        }
        if (this.f38472c) {
            this.f38470a.c(this);
        } else {
            this.f38470a.execute(this.f38476g);
        }
    }
}
