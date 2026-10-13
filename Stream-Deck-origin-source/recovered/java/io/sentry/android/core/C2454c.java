package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.SystemClock;
import io.sentry.EnumC2596z2;
import io.sentry.ILogger;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: io.sentry.android.core.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2454c extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f26291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f26292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l0 f26293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final io.sentry.transport.p f26294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f26295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f26296f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ILogger f26297g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile long f26298h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f26299i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Context f26300j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Runnable f26301k;

    /* JADX INFO: renamed from: io.sentry.android.core.c$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface a {
        void a(ApplicationNotResponding applicationNotResponding);
    }

    public C2454c(long j8, boolean z8, a aVar, ILogger iLogger, Context context) {
        this(new io.sentry.transport.p() { // from class: io.sentry.android.core.a
            @Override // io.sentry.transport.p
            public final long getCurrentTimeMillis() {
                return SystemClock.uptimeMillis();
            }
        }, j8, 500L, z8, aVar, iLogger, new l0(), context);
    }

    public static /* synthetic */ void a(C2454c c2454c, io.sentry.transport.p pVar) {
        c2454c.getClass();
        c2454c.f26298h = pVar.getCurrentTimeMillis();
        c2454c.f26299i.set(false);
    }

    public final boolean c() {
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState;
        ActivityManager activityManager = (ActivityManager) this.f26300j.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        try {
            processesInErrorState = activityManager.getProcessesInErrorState();
        } catch (Throwable th) {
            this.f26297g.b(EnumC2596z2.ERROR, "Error getting ActivityManager#getProcessesInErrorState.", th);
            processesInErrorState = null;
        }
        if (processesInErrorState == null) {
            return false;
        }
        Iterator<ActivityManager.ProcessErrorStateInfo> it = processesInErrorState.iterator();
        while (it.hasNext()) {
            if (it.next().condition == 2) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        this.f26301k.run();
        while (!isInterrupted()) {
            this.f26293c.b(this.f26301k);
            try {
                Thread.sleep(this.f26295e);
                if (this.f26294d.getCurrentTimeMillis() - this.f26298h > this.f26296f) {
                    if (!this.f26291a && (Debug.isDebuggerConnected() || Debug.waitingForDebugger())) {
                        this.f26297g.c(EnumC2596z2.DEBUG, "An ANR was detected but ignored because the debugger is connected.", new Object[0]);
                        this.f26299i.set(true);
                    } else if (c() && this.f26299i.compareAndSet(false, true)) {
                        this.f26292b.a(new ApplicationNotResponding("Application Not Responding for at least " + this.f26296f + " ms.", this.f26293c.a()));
                    }
                }
            } catch (InterruptedException e8) {
                try {
                    Thread.currentThread().interrupt();
                    this.f26297g.c(EnumC2596z2.WARNING, "Interrupted: %s", e8.getMessage());
                    return;
                } catch (SecurityException unused) {
                    this.f26297g.c(EnumC2596z2.WARNING, "Failed to interrupt due to SecurityException: %s", e8.getMessage());
                    return;
                }
            }
        }
    }

    public C2454c(final io.sentry.transport.p pVar, long j8, long j9, boolean z8, a aVar, ILogger iLogger, l0 l0Var, Context context) {
        super("|ANR-WatchDog|");
        this.f26298h = 0L;
        this.f26299i = new AtomicBoolean(false);
        this.f26294d = pVar;
        this.f26296f = j8;
        this.f26295e = j9;
        this.f26291a = z8;
        this.f26292b = aVar;
        this.f26297g = iLogger;
        this.f26293c = l0Var;
        this.f26300j = context;
        this.f26301k = new Runnable() { // from class: io.sentry.android.core.b
            @Override // java.lang.Runnable
            public final void run() {
                C2454c.a(this.f26287a, pVar);
            }
        };
        if (j8 < this.f26295e * 2) {
            throw new IllegalArgumentException(String.format("ANRWatchDog: timeoutIntervalMillis has to be at least %d ms", Long.valueOf(this.f26295e * 2)));
        }
    }
}
