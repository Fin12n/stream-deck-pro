package p017b7;

import G6.g;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p062g7.AbstractC2364c;

/* JADX INFO: renamed from: b7.m0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1798m0 extends AbstractC1796l0 implements T {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f15973d;

    public C1798m0(Executor executor) {
        this.f15973d = executor;
        AbstractC2364c.a(q1());
    }

    public final ScheduledFuture D1(ScheduledExecutorService scheduledExecutorService, Runnable runnable, g gVar, long j8) {
        try {
            return scheduledExecutorService.schedule(runnable, j8, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e8) {
            o1(gVar, e8);
            return null;
        }
    }

    @Override // p017b7.F
    public void L0(g gVar, Runnable runnable) {
        Runnable runnableH;
        try {
            Executor executorQ1 = q1();
            AbstractC1775b abstractC1775b = AbstractC1777c.f15940a;
            if (abstractC1775b == null || (runnableH = abstractC1775b.h(runnable)) == null) {
                runnableH = runnable;
            }
            executorQ1.execute(runnableH);
        } catch (RejectedExecutionException e8) {
            AbstractC1775b abstractC1775b2 = AbstractC1777c.f15940a;
            if (abstractC1775b2 != null) {
                abstractC1775b2.e();
            }
            o1(gVar, e8);
            Z.b().L0(gVar, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor executorQ1 = q1();
        ExecutorService executorService = executorQ1 instanceof ExecutorService ? (ExecutorService) executorQ1 : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1798m0) && ((C1798m0) obj).q1() == q1();
    }

    public int hashCode() {
        return System.identityHashCode(q1());
    }

    @Override // p017b7.T
    public InterfaceC1776b0 o(long j8, Runnable runnable, g gVar) {
        long j9;
        Runnable runnable2;
        g gVar2;
        Executor executorQ1 = q1();
        ScheduledFuture scheduledFutureD1 = null;
        ScheduledExecutorService scheduledExecutorService = executorQ1 instanceof ScheduledExecutorService ? (ScheduledExecutorService) executorQ1 : null;
        if (scheduledExecutorService != null) {
            j9 = j8;
            runnable2 = runnable;
            gVar2 = gVar;
            scheduledFutureD1 = D1(scheduledExecutorService, runnable2, gVar2, j9);
        } else {
            j9 = j8;
            runnable2 = runnable;
            gVar2 = gVar;
        }
        return scheduledFutureD1 != null ? new C1774a0(scheduledFutureD1) : O.f15912i.o(j9, runnable2, gVar2);
    }

    public final void o1(g gVar, RejectedExecutionException rejectedExecutionException) {
        AbstractC1823z0.c(gVar, AbstractC1794k0.a("The task was rejected", rejectedExecutionException));
    }

    public Executor q1() {
        return this.f15973d;
    }

    @Override // p017b7.F
    public String toString() {
        return q1().toString();
    }

    @Override // p017b7.T
    public void w0(long j8, InterfaceC1795l interfaceC1795l) {
        long j9;
        Executor executorQ1 = q1();
        ScheduledFuture scheduledFutureD1 = null;
        ScheduledExecutorService scheduledExecutorService = executorQ1 instanceof ScheduledExecutorService ? (ScheduledExecutorService) executorQ1 : null;
        if (scheduledExecutorService != null) {
            j9 = j8;
            scheduledFutureD1 = D1(scheduledExecutorService, new P0(this, interfaceC1795l), interfaceC1795l.getContext(), j9);
        } else {
            j9 = j8;
        }
        if (scheduledFutureD1 != null) {
            AbstractC1823z0.j(interfaceC1795l, scheduledFutureD1);
        } else {
            O.f15912i.w0(j9, interfaceC1795l);
        }
    }
}
