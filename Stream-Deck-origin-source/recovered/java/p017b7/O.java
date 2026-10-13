package p017b7;

import C6.G;
import G6.g;
import W6.n;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.t;
import p135p0.Dyk.GOKsbdzhLhXAMt;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class O extends AbstractC1786g0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final O f15912i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f15913j;

    static {
        Long l8;
        O o8 = new O();
        f15912i = o8;
        AbstractC1784f0.a2(o8, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l8 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l8 = 1000L;
        }
        f15913j = timeUnit.toNanos(l8.longValue());
    }

    public final synchronized Thread A2() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setContextClassLoader(O.class.getClassLoader());
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    public final boolean B2() {
        return debugStatus == 4;
    }

    public final boolean C2() {
        int i8 = debugStatus;
        return i8 == 2 || i8 == 3;
    }

    public final synchronized boolean D2() {
        if (C2()) {
            return false;
        }
        debugStatus = 1;
        t.e(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    public final void E2() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // p017b7.AbstractC1788h0
    public Thread g2() {
        Thread thread = _thread;
        return thread == null ? A2() : thread;
    }

    @Override // p017b7.AbstractC1788h0
    public void h2(long j8, AbstractC1786g0.c cVar) {
        E2();
    }

    @Override // p017b7.AbstractC1786g0
    public void m2(Runnable runnable) {
        if (B2()) {
            E2();
        }
        super.m2(runnable);
    }

    @Override // p017b7.AbstractC1786g0, p017b7.T
    public InterfaceC1776b0 o(long j8, Runnable runnable, g gVar) {
        return w2(j8, runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zR2;
        G g8;
        U0.f15919a.d(this);
        AbstractC1775b abstractC1775b = AbstractC1777c.f15940a;
        if (abstractC1775b != null) {
            abstractC1775b.c();
        }
        try {
            if (!D2()) {
                if (zR2) {
                    return;
                } else {
                    return;
                }
            }
            long j8 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jD2 = d2();
                if (jD2 == Long.MAX_VALUE) {
                    AbstractC1775b abstractC1775b2 = AbstractC1777c.f15940a;
                    long jA = abstractC1775b2 != null ? abstractC1775b2.a() : System.nanoTime();
                    if (j8 == Long.MAX_VALUE) {
                        j8 = f15913j + jA;
                    }
                    long j9 = j8 - jA;
                    if (j9 <= 0) {
                        if (zR2) {
                            return;
                        } else {
                            return;
                        }
                    }
                    jD2 = n.h(jD2, j9);
                } else {
                    j8 = Long.MAX_VALUE;
                }
                if (jD2 > 0) {
                    if (C2()) {
                        if (zR2) {
                            return;
                        } else {
                            return;
                        }
                    }
                    AbstractC1775b abstractC1775b3 = AbstractC1777c.f15940a;
                    if (abstractC1775b3 != null) {
                        abstractC1775b3.b(this, jD2);
                        g8 = G.f1419a;
                    } else {
                        g8 = null;
                    }
                    if (g8 == null) {
                        LockSupport.parkNanos(this, jD2);
                    }
                }
            }
        } finally {
            _thread = null;
            z2();
            AbstractC1775b abstractC1775b4 = AbstractC1777c.f15940a;
            if (abstractC1775b4 != null) {
                abstractC1775b4.g();
            }
            if (!r2()) {
                g2();
            }
        }
    }

    @Override // p017b7.AbstractC1786g0, p017b7.AbstractC1784f0
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    public final synchronized void z2() {
        if (C2()) {
            debugStatus = 3;
            t2();
            t.e(this, GOKsbdzhLhXAMt.xCYVCkW);
            notifyAll();
        }
    }
}
