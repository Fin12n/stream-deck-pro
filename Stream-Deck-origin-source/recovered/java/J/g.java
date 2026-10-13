package J;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f3902b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Deque f3901a = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f3903c = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f3904d = c.IDLE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f3905e = 0;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f3906a;

        public a(Runnable runnable) {
            this.f3906a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3906a.run();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class b implements Runnable {
        public b() {
        }

        /* JADX WARN: Code duplicated, block: B:41:0x0034 A[SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
        
            if (r1 == false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
        
            r3.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x004b, code lost:
        
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
        
            A.AbstractC0890p0.d("SequentialExecutor", "Exception while executing runnable " + r3, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a() {
            Runnable runnable;
            boolean z8 = false;
            boolean zInterrupted = false;
            while (true) {
                try {
                    synchronized (g.this.f3901a) {
                        if (z8) {
                            runnable = (Runnable) g.this.f3901a.poll();
                            if (runnable == null) {
                                g.this.f3904d = c.IDLE;
                            }
                        } else {
                            g gVar = g.this;
                            c cVar = gVar.f3904d;
                            c cVar2 = c.RUNNING;
                            if (cVar != cVar2) {
                                gVar.f3905e++;
                                gVar.f3904d = cVar2;
                                z8 = true;
                                runnable = (Runnable) g.this.f3901a.poll();
                                if (runnable == null) {
                                    g.this.f3904d = c.IDLE;
                                }
                            }
                        }
                    }
                    if (zInterrupted) {
                        break;
                    } else {
                        return;
                    }
                } catch (Throwable th) {
                    if (zInterrupted) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            Thread.currentThread().interrupt();
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a();
            } catch (Error e8) {
                synchronized (g.this.f3901a) {
                    g.this.f3904d = c.IDLE;
                    throw e8;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    public g(Executor executor) {
        this.f3902b = (Executor) T1.f.g(executor);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0061  */
    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        c cVar;
        boolean z8;
        T1.f.g(runnable);
        synchronized (this.f3901a) {
            c cVar2 = this.f3904d;
            if (cVar2 != c.RUNNING && cVar2 != (cVar = c.QUEUED)) {
                long j8 = this.f3905e;
                a aVar = new a(runnable);
                this.f3901a.add(aVar);
                c cVar3 = c.QUEUING;
                this.f3904d = cVar3;
                try {
                    this.f3902b.execute(this.f3903c);
                    if (this.f3904d != cVar3) {
                        return;
                    }
                    synchronized (this.f3901a) {
                        try {
                            if (this.f3905e == j8 && this.f3904d == cVar3) {
                                this.f3904d = cVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e8) {
                    synchronized (this.f3901a) {
                        try {
                            c cVar4 = this.f3904d;
                            if (cVar4 != c.IDLE && cVar4 != c.QUEUING) {
                                z8 = false;
                            } else if (this.f3901a.removeLastOccurrence(aVar)) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            if (!(e8 instanceof RejectedExecutionException) || z8) {
                                throw e8;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                }
            }
            this.f3901a.add(runnable);
        }
    }
}
