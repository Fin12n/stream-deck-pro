package io.sentry.android.core;

import P2.Lsk.mHPawN;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.AbstractC2519l;
import io.sentry.C2485c1;
import io.sentry.C2507i;
import io.sentry.EnumC2596z2;
import io.sentry.ILogger;
import io.sentry.InterfaceC2447a0;
import io.sentry.InterfaceC2480b0;
import io.sentry.W2;
import io.sentry.util.C2569a;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class B {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f26135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26136c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f26139f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final io.sentry.android.core.internal.util.u f26140g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InterfaceC2447a0 f26145l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ILogger f26146m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f26134a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Future f26137d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public File f26138e = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayDeque f26141h = new ArrayDeque();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayDeque f26142i = new ArrayDeque();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayDeque f26143j = new ArrayDeque();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Map f26144k = new HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f26147n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C2569a f26148o = new C2569a();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements io.sentry.android.core.internal.util.u.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f26149a = 0.0f;

        public a() {
        }

        @Override // io.sentry.android.core.internal.util.u.c
        public void d(long j8, long j9, long j10, long j11, boolean z8, boolean z9, float f8) {
            long jNanoTime = ((j9 - System.nanoTime()) + SystemClock.elapsedRealtimeNanos()) - B.this.f26134a;
            if (jNanoTime < 0) {
                return;
            }
            if (z9) {
                B.this.f26143j.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(jNanoTime), Long.valueOf(j10)));
            } else if (z8) {
                B.this.f26142i.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(jNanoTime), Long.valueOf(j10)));
            }
            if (f8 != this.f26149a) {
                this.f26149a = f8;
                B.this.f26141h.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(jNanoTime), Float.valueOf(f8)));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f26151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f26152b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final File f26153c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Map f26154d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f26155e;

        public b(long j8, long j9, boolean z8, File file, Map<String, io.sentry.profilemeasurements.a> map) {
            this.f26151a = j8;
            this.f26153c = file;
            this.f26152b = j9;
            this.f26154d = map;
            this.f26155e = z8;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f26156a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f26157b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Date f26158c;

        public c(long j8, long j9, Date date) {
            this.f26156a = j8;
            this.f26157b = j9;
            this.f26158c = date;
        }
    }

    public B(String str, int i8, io.sentry.android.core.internal.util.u uVar, InterfaceC2447a0 interfaceC2447a0, ILogger iLogger) {
        this.f26135b = new File((String) io.sentry.util.u.c(str, "TracesFilesDirPath is required"));
        this.f26136c = i8;
        this.f26146m = (ILogger) io.sentry.util.u.c(iLogger, "Logger is required");
        this.f26145l = (InterfaceC2447a0) io.sentry.util.u.c(interfaceC2447a0, "ExecutorService is required.");
        this.f26140g = (io.sentry.android.core.internal.util.u) io.sentry.util.u.c(uVar, "SentryFrameMetricsCollector is required");
    }

    public void f() {
        InterfaceC2480b0 interfaceC2480b0A = this.f26148o.a();
        try {
            Future future = this.f26137d;
            if (future != null) {
                future.cancel(true);
                this.f26137d = null;
            }
            if (this.f26147n) {
                g(true, null);
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

    public b g(boolean z8, List list) {
        InterfaceC2480b0 interfaceC2480b0A = this.f26148o.a();
        try {
            if (!this.f26147n) {
                this.f26146m.c(EnumC2596z2.WARNING, "Profiler not running", new Object[0]);
                if (interfaceC2480b0A != null) {
                    interfaceC2480b0A.close();
                }
                return null;
            }
            try {
                Debug.stopMethodTracing();
            } catch (Throwable th) {
                try {
                    this.f26146m.b(EnumC2596z2.ERROR, "Error while stopping profiling: ", th);
                } catch (Throwable th2) {
                    this.f26147n = false;
                    throw th2;
                }
            }
            this.f26147n = false;
            this.f26140g.k(this.f26139f);
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long elapsedCpuTime = Process.getElapsedCpuTime();
            if (this.f26138e == null) {
                this.f26146m.c(EnumC2596z2.ERROR, "Trace file does not exists", new Object[0]);
                if (interfaceC2480b0A != null) {
                    interfaceC2480b0A.close();
                }
                return null;
            }
            if (!this.f26142i.isEmpty()) {
                this.f26144k.put("slow_frame_renders", new io.sentry.profilemeasurements.a("nanosecond", this.f26142i));
            }
            if (!this.f26143j.isEmpty()) {
                this.f26144k.put("frozen_frame_renders", new io.sentry.profilemeasurements.a("nanosecond", this.f26143j));
            }
            if (!this.f26141h.isEmpty()) {
                this.f26144k.put("screen_frame_rates", new io.sentry.profilemeasurements.a("hz", this.f26141h));
            }
            h(list);
            Future future = this.f26137d;
            if (future != null) {
                future.cancel(true);
                this.f26137d = null;
            }
            b bVar = new b(jElapsedRealtimeNanos, elapsedCpuTime, z8, this.f26138e, this.f26144k);
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
            return bVar;
        } catch (Throwable th3) {
            if (interfaceC2480b0A == null) {
                throw th3;
            }
            try {
                interfaceC2480b0A.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public final void h(List list) {
        long jElapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() - this.f26134a) - TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        if (list != null) {
            ArrayDeque arrayDeque = new ArrayDeque(list.size());
            ArrayDeque arrayDeque2 = new ArrayDeque(list.size());
            ArrayDeque arrayDeque3 = new ArrayDeque(list.size());
            synchronized (list) {
                try {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C2485c1 c2485c1 = (C2485c1) it.next();
                        C2507i c2507iC = c2485c1.c();
                        io.sentry.A0 a0D = c2485c1.d();
                        if (c2507iC != null) {
                            arrayDeque3.add(new io.sentry.profilemeasurements.b(Long.valueOf(TimeUnit.MILLISECONDS.toNanos(c2507iC.b()) + jElapsedRealtimeNanos), Double.valueOf(c2507iC.a())));
                        }
                        if (a0D != null && a0D.b() > -1) {
                            arrayDeque.add(new io.sentry.profilemeasurements.b(Long.valueOf(TimeUnit.MILLISECONDS.toNanos(a0D.a()) + jElapsedRealtimeNanos), Long.valueOf(a0D.b())));
                        }
                        if (a0D != null && a0D.c() > -1) {
                            arrayDeque2.add(new io.sentry.profilemeasurements.b(Long.valueOf(TimeUnit.MILLISECONDS.toNanos(a0D.a()) + jElapsedRealtimeNanos), Long.valueOf(a0D.c())));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!arrayDeque3.isEmpty()) {
                this.f26144k.put("cpu_usage", new io.sentry.profilemeasurements.a("percent", arrayDeque3));
            }
            if (!arrayDeque.isEmpty()) {
                this.f26144k.put("memory_footprint", new io.sentry.profilemeasurements.a("byte", arrayDeque));
            }
            if (arrayDeque2.isEmpty()) {
                return;
            }
            this.f26144k.put("memory_native_footprint", new io.sentry.profilemeasurements.a("byte", arrayDeque2));
        }
    }

    public c i() {
        InterfaceC2480b0 interfaceC2480b0A = this.f26148o.a();
        try {
            int i8 = this.f26136c;
            if (i8 == 0) {
                this.f26146m.c(EnumC2596z2.WARNING, "Disabling profiling because intervaUs is set to %d", Integer.valueOf(i8));
                if (interfaceC2480b0A != null) {
                    interfaceC2480b0A.close();
                }
                return null;
            }
            if (this.f26147n) {
                this.f26146m.c(EnumC2596z2.WARNING, "Profiling has already started...", new Object[0]);
                if (interfaceC2480b0A != null) {
                    interfaceC2480b0A.close();
                }
                return null;
            }
            this.f26138e = new File(this.f26135b, W2.a() + ".trace");
            this.f26144k.clear();
            this.f26141h.clear();
            this.f26142i.clear();
            this.f26143j.clear();
            this.f26139f = this.f26140g.j(new a());
            try {
                this.f26137d = this.f26145l.b(new Runnable() { // from class: io.sentry.android.core.A
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f26079a.g(true, null);
                    }
                }, 30000L);
            } catch (RejectedExecutionException e8) {
                this.f26146m.b(EnumC2596z2.ERROR, "Failed to call the executor. Profiling will not be automatically finished. Did you call Sentry.close()?", e8);
            }
            this.f26134a = SystemClock.elapsedRealtimeNanos();
            Date dateC = AbstractC2519l.c();
            long elapsedCpuTime = Process.getElapsedCpuTime();
            try {
                Debug.startMethodTracingSampling(this.f26138e.getPath(), 3000000, this.f26136c);
                this.f26147n = true;
                c cVar = new c(this.f26134a, elapsedCpuTime, dateC);
                if (interfaceC2480b0A != null) {
                    interfaceC2480b0A.close();
                }
                return cVar;
            } catch (Throwable th) {
                g(false, null);
                this.f26146m.b(EnumC2596z2.ERROR, mHPawN.KSaEXolXbslU, th);
                this.f26147n = false;
                if (interfaceC2480b0A != null) {
                    interfaceC2480b0A.close();
                }
                return null;
            }
        } catch (Throwable th2) {
            if (interfaceC2480b0A == null) {
                throw th2;
            }
            try {
                interfaceC2480b0A.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }
}
