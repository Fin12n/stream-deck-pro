package io.sentry.android.replay.util;

import C6.G;
import Z.JTT.ryTuoS;
import Z6.v;
import io.sentry.EnumC2596z2;
import io.sentry.InterfaceC2447a0;
import io.sentry.J2;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class g {
    public static final void d(ExecutorService executorService, J2 options) {
        t.g(executorService, "<this>");
        t.g(options, "options");
        synchronized (executorService) {
            if (!executorService.isShutdown()) {
                executorService.shutdown();
            }
            try {
                if (!executorService.awaitTermination(options.getShutdownTimeoutMillis(), TimeUnit.MILLISECONDS)) {
                    executorService.shutdownNow();
                }
            } catch (InterruptedException unused) {
                executorService.shutdownNow();
                Thread.currentThread().interrupt();
            }
            G g8 = G.f1419a;
        }
    }

    public static final ScheduledFuture e(ScheduledExecutorService scheduledExecutorService, final J2 options, final String taskName, long j8, long j9, TimeUnit unit, final Runnable task) {
        t.g(scheduledExecutorService, "<this>");
        t.g(options, "options");
        t.g(taskName, "taskName");
        t.g(unit, "unit");
        t.g(task, "task");
        try {
            return scheduledExecutorService.scheduleAtFixedRate(new Runnable() { // from class: io.sentry.android.replay.util.e
                @Override // java.lang.Runnable
                public final void run() {
                    g.f(task, options, taskName);
                }
            }, j8, j9, unit);
        } catch (Throwable th) {
            options.getLogger().b(EnumC2596z2.ERROR, "Failed to submit task " + taskName + " to executor", th);
            return null;
        }
    }

    public static final void f(Runnable task, J2 options, String taskName) {
        t.g(task, "$task");
        t.g(options, "$options");
        t.g(taskName, "$taskName");
        try {
            task.run();
        } catch (Throwable th) {
            options.getLogger().b(EnumC2596z2.ERROR, "Failed to execute task " + taskName, th);
        }
    }

    public static final Future g(InterfaceC2447a0 interfaceC2447a0, final J2 options, final String taskName, final Runnable task) {
        t.g(interfaceC2447a0, "<this>");
        t.g(options, "options");
        t.g(taskName, "taskName");
        t.g(task, "task");
        try {
            return interfaceC2447a0.submit(new Runnable() { // from class: io.sentry.android.replay.util.f
                @Override // java.lang.Runnable
                public final void run() {
                    g.i(task, options, taskName);
                }
            });
        } catch (Throwable th) {
            options.getLogger().b(EnumC2596z2.ERROR, "Failed to submit task " + taskName + " to executor", th);
            return null;
        }
    }

    public static final void i(Runnable task, J2 options, String taskName) {
        t.g(task, "$task");
        t.g(options, "$options");
        t.g(taskName, "$taskName");
        try {
            task.run();
        } catch (Throwable th) {
            options.getLogger().b(EnumC2596z2.ERROR, "Failed to execute task " + taskName, th);
        }
    }

    public static final void j(Runnable task, J2 options, String taskName) {
        t.g(task, "$task");
        t.g(options, "$options");
        t.g(taskName, "$taskName");
        try {
            task.run();
        } catch (Throwable th) {
            options.getLogger().b(EnumC2596z2.ERROR, "Failed to execute task " + taskName, th);
        }
    }

    public static final Future h(ExecutorService executorService, final J2 options, final String taskName, final Runnable task) {
        t.g(executorService, "<this>");
        t.g(options, "options");
        t.g(taskName, "taskName");
        t.g(task, "task");
        String name = Thread.currentThread().getName();
        t.f(name, ryTuoS.AMPgCMYBjJ);
        if (v.H(name, "SentryReplayIntegration", false, 2, null)) {
            task.run();
            return null;
        }
        try {
            return executorService.submit(new Runnable() { // from class: io.sentry.android.replay.util.d
                @Override // java.lang.Runnable
                public final void run() {
                    g.j(task, options, taskName);
                }
            });
        } catch (Throwable th) {
            options.getLogger().b(EnumC2596z2.ERROR, "Failed to submit task " + taskName + " to executor", th);
            return null;
        }
    }
}
