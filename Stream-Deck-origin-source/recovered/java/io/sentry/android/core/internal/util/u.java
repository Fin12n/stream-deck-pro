package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Choreographer;
import android.view.FrameMetrics;
import android.view.Window;
import io.sentry.EnumC2596z2;
import io.sentry.ILogger;
import io.sentry.J2;
import io.sentry.W2;
import io.sentry.android.core.Q;
import io.sentry.android.core.Z;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class u implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f26455n = TimeUnit.SECONDS.toNanos(1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f26456o = TimeUnit.MILLISECONDS.toNanos(700);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q f26457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f26458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ILogger f26459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Handler f26460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WeakReference f26461e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f26462f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f26463g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f26464h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Window.OnFrameMetricsAvailableListener f26465i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Choreographer f26466j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Field f26467k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f26468l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f26469m;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements d {
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class b implements d {
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface c {
        void d(long j8, long j9, long j10, long j11, boolean z8, boolean z9, float f8);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface d {
        default void a(Window window, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener, Handler handler) {
            window.addOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener, handler);
        }

        default void b(Window window, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener) {
            window.removeOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener);
        }
    }

    public u(Context context, J2 j8, Q q8) {
        this(context, j8, q8, new a());
    }

    public static /* synthetic */ void a(u uVar, ILogger iLogger) {
        uVar.getClass();
        try {
            uVar.f26466j = Choreographer.getInstance();
        } catch (Throwable th) {
            iLogger.b(EnumC2596z2.ERROR, "Error retrieving Choreographer instance. Slow and frozen frames will not be reported.", th);
        }
    }

    public static /* synthetic */ void c(u uVar, Q q8, Window window, FrameMetrics frameMetrics, int i8) {
        uVar.getClass();
        long jNanoTime = System.nanoTime();
        float refreshRate = q8.d() >= 30 ? window.getContext().getDisplay().getRefreshRate() : window.getWindowManager().getDefaultDisplay().getRefreshRate();
        float f8 = f26455n;
        long jD = uVar.d(frameMetrics);
        long jMax = Math.max(0L, jD - ((long) (f8 / refreshRate)));
        long jE = uVar.e(frameMetrics);
        if (jE < 0) {
            jE = jNanoTime - jD;
        }
        long jMax2 = Math.max(jE, uVar.f26469m);
        if (jMax2 == uVar.f26468l) {
            return;
        }
        uVar.f26468l = jMax2;
        uVar.f26469m = jMax2 + jD;
        boolean zH = h(jD, (long) (f8 / (refreshRate - 1.0f)));
        boolean z8 = zH && g(jD);
        Iterator it = uVar.f26462f.values().iterator();
        while (it.hasNext()) {
            ((c) it.next()).d(jMax2, uVar.f26469m, jD, jMax, zH, z8, refreshRate);
        }
    }

    public static boolean g(long j8) {
        return j8 > f26456o;
    }

    public static boolean h(long j8, long j9) {
        return j8 > j9;
    }

    public final long d(FrameMetrics frameMetrics) {
        return frameMetrics.getMetric(0) + frameMetrics.getMetric(1) + frameMetrics.getMetric(2) + frameMetrics.getMetric(3) + frameMetrics.getMetric(4) + frameMetrics.getMetric(5);
    }

    public final long e(FrameMetrics frameMetrics) {
        return this.f26457a.d() >= 26 ? frameMetrics.getMetric(10) : f();
    }

    public long f() {
        Field field;
        Choreographer choreographer = this.f26466j;
        if (choreographer == null || (field = this.f26467k) == null) {
            return -1L;
        }
        try {
            Long l8 = (Long) field.get(choreographer);
            if (l8 != null) {
                return l8.longValue();
            }
            return -1L;
        } catch (IllegalAccessException unused) {
            return -1L;
        }
    }

    public final void i(Window window) {
        WeakReference weakReference = this.f26461e;
        if (weakReference == null || weakReference.get() != window) {
            this.f26461e = new WeakReference(window);
            m();
        }
    }

    public String j(c cVar) {
        if (!this.f26463g) {
            return null;
        }
        String strA = W2.a();
        this.f26462f.put(strA, cVar);
        m();
        return strA;
    }

    public void k(String str) {
        if (this.f26463g) {
            if (str != null) {
                this.f26462f.remove(str);
            }
            WeakReference weakReference = this.f26461e;
            Window window = weakReference != null ? (Window) weakReference.get() : null;
            if (window == null || !this.f26462f.isEmpty()) {
                return;
            }
            l(window);
        }
    }

    public final void l(Window window) {
        if (this.f26458b.contains(window)) {
            if (this.f26457a.d() >= 24) {
                try {
                    this.f26464h.b(window, this.f26465i);
                } catch (Exception e8) {
                    this.f26459c.b(EnumC2596z2.ERROR, "Failed to remove frameMetricsAvailableListener", e8);
                }
            }
            this.f26458b.remove(window);
        }
    }

    public final void m() {
        WeakReference weakReference = this.f26461e;
        Window window = weakReference != null ? (Window) weakReference.get() : null;
        if (window == null || !this.f26463g || this.f26458b.contains(window) || this.f26462f.isEmpty() || this.f26457a.d() < 24 || this.f26460d == null) {
            return;
        }
        this.f26458b.add(window);
        this.f26464h.a(window, this.f26465i, this.f26460d);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        i(activity.getWindow());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        l(activity.getWindow());
        WeakReference weakReference = this.f26461e;
        if (weakReference == null || weakReference.get() != activity.getWindow()) {
            return;
        }
        this.f26461e = null;
    }

    public u(Context context, ILogger iLogger, Q q8) {
        this(context, iLogger, q8, new b());
    }

    public u(Context context, J2 j8, Q q8, d dVar) {
        this(context, j8.getLogger(), q8, dVar);
    }

    public u(Context context, final ILogger iLogger, final Q q8, d dVar) {
        this.f26458b = new CopyOnWriteArraySet();
        this.f26462f = new ConcurrentHashMap();
        this.f26463g = false;
        this.f26468l = 0L;
        this.f26469m = 0L;
        Context context2 = (Context) io.sentry.util.u.c(Z.h(context), "The context is required");
        this.f26459c = (ILogger) io.sentry.util.u.c(iLogger, "Logger is required");
        this.f26457a = (Q) io.sentry.util.u.c(q8, "BuildInfoProvider is required");
        this.f26464h = (d) io.sentry.util.u.c(dVar, "WindowFrameMetricsManager is required");
        if ((context2 instanceof Application) && q8.d() >= 24) {
            this.f26463g = true;
            HandlerThread handlerThread = new HandlerThread("io.sentry.android.core.internal.util.SentryFrameMetricsCollector");
            handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: io.sentry.android.core.internal.util.r
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th) {
                    iLogger.b(EnumC2596z2.ERROR, "Error during frames measurements.", th);
                }
            });
            handlerThread.start();
            this.f26460d = new Handler(handlerThread.getLooper());
            ((Application) context2).registerActivityLifecycleCallbacks(this);
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.internal.util.s
                @Override // java.lang.Runnable
                public final void run() {
                    u.a(this.f26451a, iLogger);
                }
            });
            try {
                Field declaredField = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
                this.f26467k = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e8) {
                iLogger.b(EnumC2596z2.ERROR, "Unable to get the frame timestamp from the choreographer: ", e8);
            }
            this.f26465i = new Window.OnFrameMetricsAvailableListener() { // from class: io.sentry.android.core.internal.util.t
                @Override // android.view.Window.OnFrameMetricsAvailableListener
                public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i8) {
                    u.c(this.f26453a, q8, window, frameMetrics, i8);
                }
            };
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
