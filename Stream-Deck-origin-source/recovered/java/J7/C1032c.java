package J7;

import C6.G;
import com.amazon.device.simplesignin.a.LSJS.cFAYKUlMj;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC2633k;
import p116m7.kKPq.toqHM;

/* JADX INFO: renamed from: J7.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class C1032c extends D {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f4365i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ReentrantLock f4366j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Condition f4367k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f4368l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f4369m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static C1032c f4370n;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4371f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C1032c f4372g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f4373h;

    /* JADX INFO: renamed from: J7.c$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final C1032c c() throws InterruptedException {
            C1032c c1032c = C1032c.f4370n;
            kotlin.jvm.internal.t.d(c1032c);
            C1032c c1032c2 = c1032c.f4372g;
            if (c1032c2 == null) {
                long jNanoTime = System.nanoTime();
                d().await(C1032c.f4368l, TimeUnit.MILLISECONDS);
                C1032c c1032c3 = C1032c.f4370n;
                kotlin.jvm.internal.t.d(c1032c3);
                if (c1032c3.f4372g != null || System.nanoTime() - jNanoTime < C1032c.f4369m) {
                    return null;
                }
                return C1032c.f4370n;
            }
            long jY = c1032c2.y(System.nanoTime());
            if (jY > 0) {
                d().await(jY, TimeUnit.NANOSECONDS);
                return null;
            }
            C1032c c1032c4 = C1032c.f4370n;
            kotlin.jvm.internal.t.d(c1032c4);
            c1032c4.f4372g = c1032c2.f4372g;
            c1032c2.f4372g = null;
            c1032c2.f4371f = 2;
            return c1032c2;
        }

        public final Condition d() {
            return C1032c.f4367k;
        }

        public final ReentrantLock e() {
            return C1032c.f4366j;
        }

        public final void f(C1032c c1032c, long j8, boolean z8) {
            if (C1032c.f4370n == null) {
                C1032c.f4370n = new C1032c();
                new b().start();
            }
            long jNanoTime = System.nanoTime();
            if (j8 != 0 && z8) {
                c1032c.f4373h = Math.min(j8, c1032c.c() - jNanoTime) + jNanoTime;
            } else if (j8 != 0) {
                c1032c.f4373h = j8 + jNanoTime;
            } else {
                if (!z8) {
                    throw new AssertionError();
                }
                c1032c.f4373h = c1032c.c();
            }
            long jY = c1032c.y(jNanoTime);
            C1032c c1032c2 = C1032c.f4370n;
            kotlin.jvm.internal.t.d(c1032c2);
            while (c1032c2.f4372g != null) {
                C1032c c1032c3 = c1032c2.f4372g;
                kotlin.jvm.internal.t.d(c1032c3);
                if (jY < c1032c3.y(jNanoTime)) {
                    break;
                }
                c1032c2 = c1032c2.f4372g;
                kotlin.jvm.internal.t.d(c1032c2);
            }
            c1032c.f4372g = c1032c2.f4372g;
            c1032c2.f4372g = c1032c;
            if (c1032c2 == C1032c.f4370n) {
                d().signal();
            }
        }

        public final void g(C1032c c1032c) {
            for (C1032c c1032c2 = C1032c.f4370n; c1032c2 != null; c1032c2 = c1032c2.f4372g) {
                if (c1032c2.f4372g == c1032c) {
                    c1032c2.f4372g = c1032c.f4372g;
                    c1032c.f4372g = null;
                    return;
                }
            }
            throw new IllegalStateException("node was not found in the queue");
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: J7.c$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    ReentrantLock reentrantLockE = C1032c.f4365i.e();
                    reentrantLockE.lock();
                    try {
                        C1032c c1032cC = C1032c.f4365i.c();
                        if (c1032cC == C1032c.f4370n) {
                            a unused = C1032c.f4365i;
                            C1032c.f4370n = null;
                            reentrantLockE.unlock();
                            return;
                        } else {
                            G g8 = G.f1419a;
                            reentrantLockE.unlock();
                            if (c1032cC != null) {
                                c1032cC.B();
                            }
                        }
                    } catch (Throwable th) {
                        reentrantLockE.unlock();
                        throw th;
                    }
                } catch (InterruptedException unused2) {
                    continue;
                }
            }
        }
    }

    /* JADX INFO: renamed from: J7.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0161c implements A {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ A f4375b;

        public C0161c(A a8) {
            this.f4375b = a8;
        }

        @Override // J7.A
        public void I1(C1034e source, long j8) throws IOException {
            kotlin.jvm.internal.t.g(source, "source");
            AbstractC1031b.b(source.size(), 0L, j8);
            while (true) {
                long j9 = 0;
                if (j8 <= 0) {
                    return;
                }
                x xVar = source.f4378a;
                kotlin.jvm.internal.t.d(xVar);
                while (j9 < 65536) {
                    j9 += (long) (xVar.f4432c - xVar.f4431b);
                    if (j9 >= j8) {
                        j9 = j8;
                        break;
                    } else {
                        xVar = xVar.f4435f;
                        kotlin.jvm.internal.t.d(xVar);
                    }
                }
                C1032c c1032c = C1032c.this;
                A a8 = this.f4375b;
                c1032c.v();
                try {
                    try {
                        a8.I1(source, j9);
                        G g8 = G.f1419a;
                        if (c1032c.w()) {
                            throw c1032c.p(null);
                        }
                        j8 -= j9;
                    } catch (IOException e8) {
                        if (!c1032c.w()) {
                            throw e8;
                        }
                        throw c1032c.p(e8);
                    }
                } catch (Throwable th) {
                    c1032c.w();
                    throw th;
                }
            }
        }

        @Override // J7.A
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1032c r() {
            return C1032c.this;
        }

        @Override // J7.A, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C1032c c1032c = C1032c.this;
            A a8 = this.f4375b;
            c1032c.v();
            try {
                try {
                    a8.close();
                    G g8 = G.f1419a;
                    if (c1032c.w()) {
                        throw c1032c.p(null);
                    }
                } catch (IOException e8) {
                    if (!c1032c.w()) {
                        throw e8;
                    }
                    throw c1032c.p(e8);
                }
            } catch (Throwable th) {
                c1032c.w();
                throw th;
            }
        }

        @Override // J7.A, java.io.Flushable
        public void flush() throws IOException {
            C1032c c1032c = C1032c.this;
            A a8 = this.f4375b;
            c1032c.v();
            try {
                try {
                    a8.flush();
                    G g8 = G.f1419a;
                    if (c1032c.w()) {
                        throw c1032c.p(null);
                    }
                } catch (IOException e8) {
                    if (!c1032c.w()) {
                        throw e8;
                    }
                    throw c1032c.p(e8);
                }
            } catch (Throwable th) {
                c1032c.w();
                throw th;
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f4375b + ')';
        }
    }

    /* JADX INFO: renamed from: J7.c$d */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d implements C {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C f4377b;

        public d(C c8) {
            this.f4377b = c8;
        }

        @Override // J7.C
        public long K0(C1034e sink, long j8) throws IOException {
            kotlin.jvm.internal.t.g(sink, "sink");
            C1032c c1032c = C1032c.this;
            C c8 = this.f4377b;
            c1032c.v();
            try {
                try {
                    long jK0 = c8.K0(sink, j8);
                    if (c1032c.w()) {
                        throw c1032c.p(null);
                    }
                    return jK0;
                } catch (IOException e8) {
                    if (c1032c.w()) {
                        throw c1032c.p(e8);
                    }
                    throw e8;
                }
            } catch (Throwable th) {
                c1032c.w();
                throw th;
            }
        }

        @Override // J7.C
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1032c r() {
            return C1032c.this;
        }

        @Override // J7.C, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C1032c c1032c = C1032c.this;
            C c8 = this.f4377b;
            c1032c.v();
            try {
                try {
                    c8.close();
                    G g8 = G.f1419a;
                    if (c1032c.w()) {
                        throw c1032c.p(null);
                    }
                } catch (IOException e8) {
                    if (!c1032c.w()) {
                        throw e8;
                    }
                    throw c1032c.p(e8);
                }
            } catch (Throwable th) {
                c1032c.w();
                throw th;
            }
        }

        public String toString() {
            return toqHM.xjjIe + this.f4377b + ')';
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f4366j = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.t.f(conditionNewCondition, "newCondition(...)");
        f4367k = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f4368l = millis;
        f4369m = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final C A(C source) {
        kotlin.jvm.internal.t.g(source, "source");
        return new d(source);
    }

    public void B() {
    }

    public final IOException p(IOException iOException) {
        return x(iOException);
    }

    public final void v() {
        long jH = h();
        boolean zE = e();
        if (jH != 0 || zE) {
            ReentrantLock reentrantLock = f4366j;
            reentrantLock.lock();
            try {
                if (this.f4371f != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f4371f = 1;
                f4365i.f(this, jH, zE);
                G g8 = G.f1419a;
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final boolean w() {
        ReentrantLock reentrantLock = f4366j;
        reentrantLock.lock();
        try {
            int i8 = this.f4371f;
            this.f4371f = 0;
            if (i8 != 1) {
                return i8 == 2;
            }
            f4365i.g(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public IOException x(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final long y(long j8) {
        return this.f4373h - j8;
    }

    public final A z(A a8) {
        kotlin.jvm.internal.t.g(a8, cFAYKUlMj.QRAcIyEYl);
        return new C0161c(a8);
    }
}
