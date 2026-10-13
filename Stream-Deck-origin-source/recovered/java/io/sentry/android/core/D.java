package io.sentry.android.core;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.A1;
import io.sentry.AbstractC2519l;
import io.sentry.C2497f1;
import io.sentry.C2501g1;
import io.sentry.EnumC2596z2;
import io.sentry.ILogger;
import io.sentry.InterfaceC2447a0;
import io.sentry.InterfaceC2480b0;
import io.sentry.InterfaceC2496f0;
import io.sentry.InterfaceC2500g0;
import io.sentry.J2;
import io.sentry.util.C2569a;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class D implements InterfaceC2500g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f26170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ILogger f26171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f26172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f26173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f26174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC2447a0 f26175f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Q f26176g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f26177h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f26178i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final io.sentry.android.core.internal.util.u f26179j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C2501g1 f26180k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public B f26181l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f26182m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f26183n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Date f26184o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C2569a f26185p;

    public D(Context context, SentryAndroidOptions sentryAndroidOptions, Q q8, io.sentry.android.core.internal.util.u uVar) {
        this(context, q8, uVar, sentryAndroidOptions.getLogger(), sentryAndroidOptions.getProfilingTracesDirPath(), sentryAndroidOptions.isProfilingEnabled(), sentryAndroidOptions.getProfilingTracesHz(), sentryAndroidOptions.getExecutorService());
    }

    @Override // io.sentry.InterfaceC2500g0
    public C2497f1 a(InterfaceC2496f0 interfaceC2496f0, List list, J2 j8) {
        InterfaceC2480b0 interfaceC2480b0A = this.f26185p.a();
        try {
            C2497f1 c2497f1F = f(interfaceC2496f0.getName(), interfaceC2496f0.n().toString(), interfaceC2496f0.p().n().toString(), false, list, j8);
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
            return c2497f1F;
        } catch (Throwable th) {
            if (interfaceC2480b0A == null) {
                throw th;
            }
            try {
                interfaceC2480b0A.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // io.sentry.InterfaceC2500g0
    public void b(InterfaceC2496f0 interfaceC2496f0) {
        InterfaceC2480b0 interfaceC2480b0A = this.f26185p.a();
        try {
            if (this.f26178i > 0 && this.f26180k == null) {
                this.f26180k = new C2501g1(interfaceC2496f0, Long.valueOf(this.f26182m), Long.valueOf(this.f26183n));
            }
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
        } catch (Throwable th) {
            if (interfaceC2480b0A != null) {
                try {
                    interfaceC2480b0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // io.sentry.InterfaceC2500g0
    public void close() {
        D d8;
        C2501g1 c2501g1 = this.f26180k;
        if (c2501g1 != null) {
            d8 = this;
            d8.f(c2501g1.i(), this.f26180k.h(), this.f26180k.j(), true, null, A1.d().b());
        } else {
            d8 = this;
            int i8 = d8.f26178i;
            if (i8 != 0) {
                d8.f26178i = i8 - 1;
            }
        }
        B b8 = d8.f26181l;
        if (b8 != null) {
            b8.f();
        }
    }

    public final void d() {
        if (this.f26177h) {
            return;
        }
        this.f26177h = true;
        if (!this.f26173d) {
            this.f26171b.c(EnumC2596z2.INFO, "Profiling is disabled in options.", new Object[0]);
            return;
        }
        String str = this.f26172c;
        if (str == null) {
            this.f26171b.c(EnumC2596z2.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
            return;
        }
        int i8 = this.f26174e;
        if (i8 <= 0) {
            this.f26171b.c(EnumC2596z2.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(i8));
        } else {
            this.f26181l = new B(str, ((int) TimeUnit.SECONDS.toMicros(1L)) / this.f26174e, this.f26179j, this.f26175f, this.f26171b);
        }
    }

    public final boolean e() {
        B.c cVarI;
        B b8 = this.f26181l;
        if (b8 == null || (cVarI = b8.i()) == null) {
            return false;
        }
        this.f26182m = cVarI.f26156a;
        this.f26183n = cVarI.f26157b;
        this.f26184o = cVarI.f26158c;
        return true;
    }

    public final C2497f1 f(String str, String str2, String str3, boolean z8, List list, J2 j8) {
        InterfaceC2480b0 interfaceC2480b0A = this.f26185p.a();
        try {
            if (this.f26181l == null) {
                if (interfaceC2480b0A != null) {
                    interfaceC2480b0A.close();
                }
                return null;
            }
            if (this.f26176g.d() < 22) {
                if (interfaceC2480b0A != null) {
                    interfaceC2480b0A.close();
                }
                return null;
            }
            C2501g1 c2501g1 = this.f26180k;
            if (c2501g1 != null && c2501g1.h().equals(str2)) {
                int i8 = this.f26178i;
                if (i8 > 0) {
                    this.f26178i = i8 - 1;
                }
                this.f26171b.c(EnumC2596z2.DEBUG, "Transaction %s (%s) finished.", str, str3);
                if (this.f26178i != 0) {
                    C2501g1 c2501g2 = this.f26180k;
                    if (c2501g2 != null) {
                        c2501g2.k(Long.valueOf(SystemClock.elapsedRealtimeNanos()), Long.valueOf(this.f26182m), Long.valueOf(Process.getElapsedCpuTime()), Long.valueOf(this.f26183n));
                    }
                    if (interfaceC2480b0A != null) {
                        interfaceC2480b0A.close();
                    }
                    return null;
                }
                boolean z9 = false;
                B.b bVarG = this.f26181l.g(false, list);
                if (bVarG == null) {
                    if (interfaceC2480b0A != null) {
                        interfaceC2480b0A.close();
                    }
                    return null;
                }
                long j9 = bVarG.f26151a - this.f26182m;
                ArrayList arrayList = new ArrayList(1);
                C2501g1 c2501g3 = this.f26180k;
                if (c2501g3 != null) {
                    arrayList.add(c2501g3);
                }
                this.f26180k = null;
                this.f26178i = 0;
                Long lQ = j8 instanceof SentryAndroidOptions ? d0.i(this.f26170a, (SentryAndroidOptions) j8).q() : null;
                String string = lQ != null ? Long.toString(lQ.longValue()) : "0";
                String[] strArr = Build.SUPPORTED_ABIS;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C2501g1) it.next()).k(Long.valueOf(bVarG.f26151a), Long.valueOf(this.f26182m), Long.valueOf(bVarG.f26152b), Long.valueOf(this.f26183n));
                    z9 = z9;
                }
                C2497f1 c2497f1 = new C2497f1(bVarG.f26153c, this.f26184o, arrayList, str, str2, str3, Long.toString(j9), this.f26176g.d(), (strArr == null || strArr.length <= 0) ? "" : strArr[z9 ? 1 : 0], new Callable() { // from class: io.sentry.android.core.C
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return io.sentry.android.core.internal.util.g.a().c();
                    }
                }, this.f26176g.b(), this.f26176g.c(), this.f26176g.e(), this.f26176g.f(), string, j8.getProguardUuid(), j8.getRelease(), j8.getEnvironment(), (bVarG.f26155e || z8) ? "timeout" : "normal", bVarG.f26154d);
                if (interfaceC2480b0A != null) {
                    interfaceC2480b0A.close();
                }
                return c2497f1;
            }
            this.f26171b.c(EnumC2596z2.INFO, "Transaction %s (%s) finished, but was not currently being profiled. Skipping", str, str3);
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
            return null;
        } catch (Throwable th) {
            if (interfaceC2480b0A == null) {
                throw th;
            }
            try {
                interfaceC2480b0A.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // io.sentry.InterfaceC2500g0
    public boolean isRunning() {
        return this.f26178i != 0;
    }

    @Override // io.sentry.InterfaceC2500g0
    public void start() {
        InterfaceC2480b0 interfaceC2480b0A = this.f26185p.a();
        try {
            if (this.f26176g.d() < 22) {
                if (interfaceC2480b0A != null) {
                    interfaceC2480b0A.close();
                    return;
                }
                return;
            }
            d();
            int i8 = this.f26178i + 1;
            this.f26178i = i8;
            if (i8 == 1 && e()) {
                this.f26171b.c(EnumC2596z2.DEBUG, "Profiler started.", new Object[0]);
            } else {
                this.f26178i--;
                this.f26171b.c(EnumC2596z2.WARNING, "A profile is already running. This profile will be ignored.", new Object[0]);
            }
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
        } catch (Throwable th) {
            if (interfaceC2480b0A != null) {
                try {
                    interfaceC2480b0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public D(Context context, Q q8, io.sentry.android.core.internal.util.u uVar, ILogger iLogger, String str, boolean z8, int i8, InterfaceC2447a0 interfaceC2447a0) {
        this.f26177h = false;
        this.f26178i = 0;
        this.f26181l = null;
        this.f26185p = new C2569a();
        this.f26170a = (Context) io.sentry.util.u.c(Z.h(context), "The application context is required");
        this.f26171b = (ILogger) io.sentry.util.u.c(iLogger, "ILogger is required");
        this.f26179j = (io.sentry.android.core.internal.util.u) io.sentry.util.u.c(uVar, "SentryFrameMetricsCollector is required");
        this.f26176g = (Q) io.sentry.util.u.c(q8, "The BuildInfoProvider is required.");
        this.f26172c = str;
        this.f26173d = z8;
        this.f26174e = i8;
        this.f26175f = (InterfaceC2447a0) io.sentry.util.u.c(interfaceC2447a0, "The ISentryExecutorService is required.");
        this.f26184o = AbstractC2519l.c();
    }
}
