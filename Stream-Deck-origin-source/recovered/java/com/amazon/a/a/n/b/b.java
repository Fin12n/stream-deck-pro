package com.amazon.a.a.n.b;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import com.revenuecat.purchases.subscriberattributes.caching.tU.ajyWhveMDgQ;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f16671a = new com.amazon.a.a.o.c("SimpleTaskPipeline");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f16672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<Runnable> f16673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f16674d;

    private b(HandlerThread handlerThread) {
        this.f16673c = Collections.synchronizedSet(new HashSet());
        this.f16674d = handlerThread.getName();
        handlerThread.start();
        this.f16672b = new Handler(handlerThread.getLooper());
    }

    private Runnable c(final com.amazon.a.a.n.a aVar) {
        Runnable runnable = new Runnable() { // from class: com.amazon.a.a.n.b.b.1
            @Override // java.lang.Runnable
            public void run() {
                b.this.f16673c.remove(this);
                try {
                    if (com.amazon.a.a.o.c.f16782a) {
                        b.f16671a.a(b.this.f16674d + ": Executing Task: " + aVar + ", current time: " + new Date() + ", uptime: " + SystemClock.uptimeMillis());
                    }
                    aVar.a();
                    if (com.amazon.a.a.o.c.f16782a) {
                        b.f16671a.a(b.this.f16674d + ": Task finished executing: " + aVar);
                    }
                } catch (Throwable th) {
                    try {
                        if (com.amazon.a.a.o.c.f16783b) {
                            b.f16671a.b("Task Failed with unhandled exception: " + th, th);
                        }
                    } finally {
                        if (com.amazon.a.a.o.c.f16782a) {
                            b.f16671a.a(b.this.f16674d + ": Task finished executing: " + aVar);
                        }
                    }
                }
            }

            public String toString() {
                return aVar.toString();
            }
        };
        this.f16673c.add(runnable);
        return runnable;
    }

    public static b a(String str) {
        return new b(new HandlerThread("KIWI_" + str));
    }

    public static b b(String str) {
        return new b(str);
    }

    @Override // com.amazon.a.a.n.b.c
    public void a(com.amazon.a.a.n.a aVar) {
        if (com.amazon.a.a.o.c.f16782a) {
            f16671a.a("Scheduling task: " + aVar);
        }
        this.f16672b.post(c(aVar));
    }

    @Override // com.amazon.a.a.n.b.c
    public void b(com.amazon.a.a.n.a aVar) {
        if (com.amazon.a.a.o.c.f16782a) {
            f16671a.a(this.f16674d + ": Scheduling task immediately: " + aVar);
        }
        this.f16672b.postAtFrontOfQueue(c(aVar));
    }

    private b(String str) {
        this.f16673c = Collections.synchronizedSet(new HashSet());
        this.f16674d = str;
        this.f16672b = new Handler();
    }

    @Override // com.amazon.a.a.n.b.c
    public void a(com.amazon.a.a.n.a aVar, Date date) {
        long jA = a(date);
        if (com.amazon.a.a.o.c.f16782a) {
            f16671a.a(this.f16674d + ": Scheduling task: " + aVar + ", at time: " + date + ", System uptimeMillis: " + System.currentTimeMillis() + ", uptimeMillis: " + jA);
        }
        this.f16672b.postAtTime(c(aVar), jA);
    }

    private long a(Date date) {
        return SystemClock.uptimeMillis() + (date.getTime() - System.currentTimeMillis());
    }

    @Override // com.amazon.a.a.n.b.c
    public void a(com.amazon.a.a.n.a aVar, long j8) {
        if (com.amazon.a.a.o.c.f16782a) {
            f16671a.a(this.f16674d + ": Scheduling task: " + aVar + ", with delay: " + j8);
        }
        this.f16672b.postDelayed(c(aVar), j8);
    }

    @Override // com.amazon.a.a.n.b.c
    public void a() {
        for (Runnable runnable : this.f16673c) {
            if (com.amazon.a.a.o.c.f16782a) {
                f16671a.a(this.f16674d + ": Removing callback: " + runnable);
            }
            this.f16672b.removeCallbacks(runnable);
        }
        this.f16673c.clear();
        if (this.f16672b.getLooper() == Looper.getMainLooper() || !this.f16672b.getLooper().getThread().isAlive()) {
            return;
        }
        com.amazon.a.a.o.c cVar = f16671a;
        cVar.a("Interrupting looper thread!");
        this.f16672b.getLooper().getThread().interrupt();
        cVar.a(ajyWhveMDgQ.kSgBHvDrM + this.f16672b.getLooper().getThread() + ", " + this.f16672b.getLooper().getThread().isAlive());
        this.f16672b.getLooper().quit();
    }
}
