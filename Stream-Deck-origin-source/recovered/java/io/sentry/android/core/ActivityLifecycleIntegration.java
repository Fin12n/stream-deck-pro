package io.sentry.android.core;

import T0.Vl.PCRzgdeK;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import io.jentz.winter.js.HRHLwtyqJWz;
import io.sentry.C2;
import io.sentry.C2533o1;
import io.sentry.EnumC2512j0;
import io.sentry.EnumC2596z2;
import io.sentry.InterfaceC2480b0;
import io.sentry.InterfaceC2488d0;
import io.sentry.InterfaceC2496f0;
import io.sentry.InterfaceC2516k0;
import io.sentry.InterfaceC2549q1;
import io.sentry.InterfaceC2594z0;
import io.sentry.J2;
import io.sentry.S0;
import io.sentry.U1;
import io.sentry.j3;
import io.sentry.k3;
import io.sentry.r3;
import io.sentry.s3;
import io.sentry.t3;
import io.sentry.u3;
import io.sentry.util.C2569a;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class ActivityLifecycleIntegration implements InterfaceC2516k0, Closeable, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f26087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q f26088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public io.sentry.X f26089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SentryAndroidOptions f26090d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f26093g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public InterfaceC2488d0 f26096j;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C2460h f26104r;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f26091e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f26092f = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f26094h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public io.sentry.G f26095i = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final WeakHashMap f26097k = new WeakHashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final WeakHashMap f26098l = new WeakHashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final WeakHashMap f26099m = new WeakHashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public U1 f26100n = new C2(new Date(0), 0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f26101o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Future f26102p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final WeakHashMap f26103q = new WeakHashMap();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C2569a f26105s = new C2569a();

    public ActivityLifecycleIntegration(Application application, Q q8, C2460h c2460h) {
        this.f26087a = (Application) io.sentry.util.u.c(application, "Application is required");
        this.f26088b = (Q) io.sentry.util.u.c(q8, "BuildInfoProvider is required");
        this.f26104r = (C2460h) io.sentry.util.u.c(c2460h, "ActivityFramesTracker is required");
        if (q8.d() >= 29) {
            this.f26093g = true;
        }
    }

    public static /* synthetic */ void A(InterfaceC2496f0 interfaceC2496f0, io.sentry.V v8, InterfaceC2496f0 interfaceC2496f1) {
        if (interfaceC2496f1 == interfaceC2496f0) {
            v8.n();
        }
    }

    private String V0(Activity activity) {
        return activity.getClass().getSimpleName();
    }

    public static /* synthetic */ void t(ActivityLifecycleIntegration activityLifecycleIntegration, io.sentry.V v8, InterfaceC2496f0 interfaceC2496f0, InterfaceC2496f0 interfaceC2496f1) {
        if (interfaceC2496f1 == null) {
            activityLifecycleIntegration.getClass();
            v8.G(interfaceC2496f0);
        } else {
            SentryAndroidOptions sentryAndroidOptions = activityLifecycleIntegration.f26090d;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().c(EnumC2596z2.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", interfaceC2496f0.getName());
            }
        }
    }

    public static /* synthetic */ void z(ActivityLifecycleIntegration activityLifecycleIntegration, WeakReference weakReference, String str, InterfaceC2496f0 interfaceC2496f0) {
        activityLifecycleIntegration.getClass();
        Activity activity = (Activity) weakReference.get();
        if (activity != null) {
            activityLifecycleIntegration.f26104r.j(activity, interfaceC2496f0.n());
            return;
        }
        SentryAndroidOptions sentryAndroidOptions = activityLifecycleIntegration.f26090d;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(EnumC2596z2.WARNING, "Unable to track activity frames as the Activity %s has been destroyed.", str);
        }
    }

    public final void A0() {
        U1 u1D = io.sentry.android.core.performance.f.m().i(this.f26090d).d();
        if (!this.f26091e || u1D == null) {
            return;
        }
        L0(this.f26096j, u1D);
    }

    public final void B1(Bundle bundle) {
        if (this.f26094h) {
            return;
        }
        io.sentry.android.core.performance.g gVarH = io.sentry.android.core.performance.f.m().h();
        if (!(gVarH.x() && gVarH.y()) && io.sentry.android.core.performance.f.m().o()) {
            io.sentry.android.core.performance.f.m().u(bundle == null ? io.sentry.android.core.performance.f.a.COLD : io.sentry.android.core.performance.f.a.WARM);
        } else {
            io.sentry.android.core.performance.f.m().r(this.f26101o);
            io.sentry.android.core.performance.f.m().u(io.sentry.android.core.performance.f.a.WARM);
        }
    }

    public final void C1(j3 j3Var) {
        j3Var.g("auto.ui.activity");
    }

    public final void D1(Activity activity) {
        Boolean boolValueOf;
        U1 u8;
        U1 u9;
        final InterfaceC2496f0 interfaceC2496f0;
        final WeakReference weakReference = new WeakReference(activity);
        if (this.f26089c == null || q1(activity)) {
            return;
        }
        if (!this.f26091e) {
            this.f26103q.put(activity, S0.v());
            if (this.f26090d.isEnableAutoTraceIdGeneration()) {
                io.sentry.util.F.h(this.f26089c);
                return;
            }
            return;
        }
        K1();
        final String strV0 = V0(activity);
        io.sentry.android.core.performance.g gVarI = io.sentry.android.core.performance.f.m().i(this.f26090d);
        r3 r3Var = null;
        if (Z.u() && gVarI.x()) {
            U1 u1M = gVarI.m();
            boolValueOf = Boolean.valueOf(io.sentry.android.core.performance.f.m().j() == io.sentry.android.core.performance.f.a.COLD);
            u8 = u1M;
        } else {
            boolValueOf = null;
            u8 = null;
        }
        u3 u3Var = new u3();
        u3Var.s(30000L);
        if (this.f26090d.isEnableActivityLifecycleTracingAutoFinish()) {
            u3Var.t(this.f26090d.getIdleTimeout());
            u3Var.i(true);
        }
        u3Var.v(true);
        u3Var.u(new t3() { // from class: io.sentry.android.core.o
            @Override // io.sentry.t3
            public final void a(InterfaceC2496f0 interfaceC2496f1) {
                ActivityLifecycleIntegration.z(this.f26494a, weakReference, strV0, interfaceC2496f1);
            }
        });
        if (this.f26094h || u8 == null || boolValueOf == null) {
            u9 = this.f26100n;
        } else {
            r3 r3VarG = io.sentry.android.core.performance.f.m().g();
            io.sentry.android.core.performance.f.m().t(null);
            r3Var = r3VarG;
            u9 = u8;
        }
        u3Var.h(u9);
        u3Var.r(r3Var != null);
        C1(u3Var);
        InterfaceC2496f0 interfaceC2496f0S = this.f26089c.s(new s3(strV0, io.sentry.protocol.E.COMPONENT, "ui.load", r3Var), u3Var);
        j3 j3Var = new j3();
        C1(j3Var);
        if (this.f26094h || u8 == null || boolValueOf == null) {
            interfaceC2496f0 = interfaceC2496f0S;
        } else {
            interfaceC2496f0 = interfaceC2496f0S;
            this.f26096j = interfaceC2496f0.l(g1(boolValueOf.booleanValue()), a1(boolValueOf.booleanValue()), u8, EnumC2512j0.SENTRY, j3Var);
            A0();
        }
        String strO1 = o1(strV0);
        EnumC2512j0 enumC2512j0 = EnumC2512j0.SENTRY;
        U1 u10 = u9;
        final InterfaceC2488d0 interfaceC2488d0L = interfaceC2496f0.l("ui.load.initial_display", strO1, u10, enumC2512j0, j3Var);
        this.f26097k.put(activity, interfaceC2488d0L);
        if (this.f26092f && this.f26095i != null && this.f26090d != null) {
            final InterfaceC2488d0 interfaceC2488d0L2 = interfaceC2496f0.l("ui.load.full_display", k1(strV0), u10, enumC2512j0, j3Var);
            try {
                this.f26098l.put(activity, interfaceC2488d0L2);
                this.f26102p = this.f26090d.getExecutorService().b(new Runnable() { // from class: io.sentry.android.core.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f26498a.H0(interfaceC2488d0L2, interfaceC2488d0L);
                    }
                }, 25000L);
            } catch (RejectedExecutionException e8) {
                this.f26090d.getLogger().b(EnumC2596z2.ERROR, "Failed to call the executor. Time to full display span will not be finished automatically. Did you call Sentry.close()?", e8);
            }
        }
        this.f26089c.u(new InterfaceC2549q1() { // from class: io.sentry.android.core.q
            @Override // io.sentry.InterfaceC2549q1
            public final void a(io.sentry.V v8) {
                this.f26534a.i0(v8, interfaceC2496f0);
            }
        });
        this.f26103q.put(activity, interfaceC2496f0);
    }

    public final void H0(InterfaceC2488d0 interfaceC2488d0, InterfaceC2488d0 interfaceC2488d1) {
        if (interfaceC2488d0 == null || interfaceC2488d0.d()) {
            return;
        }
        interfaceC2488d0.m(i1(interfaceC2488d0));
        U1 u1R = interfaceC2488d1 != null ? interfaceC2488d1.r() : null;
        if (u1R == null) {
            u1R = interfaceC2488d0.u();
        }
        O0(interfaceC2488d0, u1R, k3.DEADLINE_EXCEEDED);
    }

    public final void J0(InterfaceC2488d0 interfaceC2488d0) {
        if (interfaceC2488d0 == null || interfaceC2488d0.d()) {
            return;
        }
        interfaceC2488d0.i();
    }

    public final void K1() {
        for (Map.Entry entry : this.f26103q.entrySet()) {
            T0((InterfaceC2496f0) entry.getValue(), (InterfaceC2488d0) this.f26097k.get(entry.getKey()), (InterfaceC2488d0) this.f26098l.get(entry.getKey()));
        }
    }

    public final void L0(InterfaceC2488d0 interfaceC2488d0, U1 u8) {
        O0(interfaceC2488d0, u8, null);
    }

    public final void M1(Activity activity, boolean z8) {
        if (this.f26091e && z8) {
            T0((InterfaceC2496f0) this.f26103q.get(activity), null, null);
        }
    }

    public final void O0(InterfaceC2488d0 interfaceC2488d0, U1 u8, k3 k3Var) {
        if (interfaceC2488d0 == null || interfaceC2488d0.d()) {
            return;
        }
        if (k3Var == null) {
            k3Var = interfaceC2488d0.a() != null ? interfaceC2488d0.a() : k3.OK;
        }
        interfaceC2488d0.t(k3Var, u8);
    }

    public final void Q0(InterfaceC2488d0 interfaceC2488d0, k3 k3Var) {
        if (interfaceC2488d0 == null || interfaceC2488d0.d()) {
            return;
        }
        interfaceC2488d0.g(k3Var);
    }

    public final void T0(final InterfaceC2496f0 interfaceC2496f0, InterfaceC2488d0 interfaceC2488d0, InterfaceC2488d0 interfaceC2488d1) {
        if (interfaceC2496f0 == null || interfaceC2496f0.d()) {
            return;
        }
        Q0(interfaceC2488d0, k3.DEADLINE_EXCEEDED);
        H0(interfaceC2488d1, interfaceC2488d0);
        j0();
        k3 k3VarA = interfaceC2496f0.a();
        if (k3VarA == null) {
            k3VarA = k3.OK;
        }
        interfaceC2496f0.g(k3VarA);
        io.sentry.X x8 = this.f26089c;
        if (x8 != null) {
            x8.u(new InterfaceC2549q1() { // from class: io.sentry.android.core.m
                @Override // io.sentry.InterfaceC2549q1
                public final void a(io.sentry.V v8) {
                    this.f26490a.w0(v8, interfaceC2496f0);
                }
            });
        }
    }

    public final String a1(boolean z8) {
        return z8 ? "Cold Start" : "Warm Start";
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f26087a.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.f26090d;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(EnumC2596z2.DEBUG, "ActivityLifecycleIntegration removed.", new Object[0]);
        }
        this.f26104r.l();
    }

    public void i0(final io.sentry.V v8, final InterfaceC2496f0 interfaceC2496f0) {
        v8.E(new C2533o1.c() { // from class: io.sentry.android.core.r
            @Override // io.sentry.C2533o1.c
            public final void a(InterfaceC2496f0 interfaceC2496f1) {
                ActivityLifecycleIntegration.t(this.f26540a, v8, interfaceC2496f0, interfaceC2496f1);
            }
        });
    }

    public final String i1(InterfaceC2488d0 interfaceC2488d0) {
        String description = interfaceC2488d0.getDescription();
        if (description != null && description.endsWith(" - Deadline Exceeded")) {
            return description;
        }
        return interfaceC2488d0.getDescription() + " - Deadline Exceeded";
    }

    public final void j0() {
        Future future = this.f26102p;
        if (future != null) {
            future.cancel(false);
            this.f26102p = null;
        }
    }

    public final String k1(String str) {
        return str + " full display";
    }

    @Override // io.sentry.InterfaceC2516k0
    public void o(io.sentry.X x8, J2 j8) {
        this.f26090d = (SentryAndroidOptions) io.sentry.util.u.c(j8 instanceof SentryAndroidOptions ? (SentryAndroidOptions) j8 : null, "SentryAndroidOptions is required");
        this.f26089c = (io.sentry.X) io.sentry.util.u.c(x8, "Scopes are required");
        this.f26091e = p1(this.f26090d);
        this.f26095i = this.f26090d.getFullyDisplayedReporter();
        this.f26092f = this.f26090d.isEnableTimeToFullDisplayTracing();
        this.f26087a.registerActivityLifecycleCallbacks(this);
        this.f26090d.getLogger().c(EnumC2596z2.DEBUG, "ActivityLifecycleIntegration installed.", new Object[0]);
        io.sentry.util.o.a("ActivityLifecycle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        io.sentry.G g8;
        SentryAndroidOptions sentryAndroidOptions;
        if (!this.f26093g) {
            onActivityPreCreated(activity, bundle);
        }
        InterfaceC2480b0 interfaceC2480b0A = this.f26105s.a();
        try {
            B1(bundle);
            if (this.f26089c != null && (sentryAndroidOptions = this.f26090d) != null && sentryAndroidOptions.isEnableScreenTracking()) {
                final String strA = io.sentry.android.core.internal.util.e.a(activity);
                this.f26089c.u(new InterfaceC2549q1() { // from class: io.sentry.android.core.i
                    @Override // io.sentry.InterfaceC2549q1
                    public final void a(io.sentry.V v8) {
                        v8.w(strA);
                    }
                });
            }
            D1(activity);
            final InterfaceC2488d0 interfaceC2488d0 = (InterfaceC2488d0) this.f26098l.get(activity);
            this.f26094h = true;
            if (this.f26091e && interfaceC2488d0 != null && (g8 = this.f26095i) != null) {
                g8.b(new io.sentry.G.a() { // from class: io.sentry.android.core.j
                });
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        InterfaceC2480b0 interfaceC2480b0A = this.f26105s.a();
        try {
            io.sentry.android.core.performance.b bVar = (io.sentry.android.core.performance.b) this.f26099m.remove(activity);
            if (bVar != null) {
                bVar.a();
            }
            if (this.f26091e) {
                Q0(this.f26096j, k3.CANCELLED);
                InterfaceC2488d0 interfaceC2488d0 = (InterfaceC2488d0) this.f26097k.get(activity);
                InterfaceC2488d0 interfaceC2488d1 = (InterfaceC2488d0) this.f26098l.get(activity);
                Q0(interfaceC2488d0, k3.DEADLINE_EXCEEDED);
                H0(interfaceC2488d1, interfaceC2488d0);
                j0();
                M1(activity, true);
                this.f26096j = null;
                this.f26097k.remove(activity);
                this.f26098l.remove(activity);
            }
            this.f26103q.remove(activity);
            if (this.f26103q.isEmpty()) {
                r0();
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        InterfaceC2480b0 interfaceC2480b0A = this.f26105s.a();
        try {
            if (!this.f26093g) {
                onActivityPrePaused(activity);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        io.sentry.android.core.performance.b bVar = (io.sentry.android.core.performance.b) this.f26099m.get(activity);
        if (bVar != null) {
            InterfaceC2488d0 interfaceC2488d0 = this.f26096j;
            if (interfaceC2488d0 == null) {
                interfaceC2488d0 = (InterfaceC2488d0) this.f26103q.get(activity);
            }
            bVar.b(interfaceC2488d0);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        io.sentry.android.core.performance.b bVar = (io.sentry.android.core.performance.b) this.f26099m.get(activity);
        if (bVar != null) {
            InterfaceC2488d0 interfaceC2488d0 = this.f26096j;
            if (interfaceC2488d0 == null) {
                interfaceC2488d0 = (InterfaceC2488d0) this.f26103q.get(activity);
            }
            bVar.c(interfaceC2488d0);
            bVar.e();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        io.sentry.android.core.performance.b bVar = new io.sentry.android.core.performance.b(activity.getClass().getName());
        this.f26099m.put(activity, bVar);
        if (this.f26094h) {
            return;
        }
        io.sentry.X x8 = this.f26089c;
        this.f26100n = x8 != null ? x8.b().getDateProvider().a() : C2471t.a();
        this.f26101o = SystemClock.uptimeMillis();
        bVar.g(this.f26100n);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(Activity activity) {
        this.f26094h = true;
        io.sentry.X x8 = this.f26089c;
        this.f26100n = x8 != null ? x8.b().getDateProvider().a() : C2471t.a();
        this.f26101o = SystemClock.uptimeMillis();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStarted(Activity activity) {
        io.sentry.android.core.performance.b bVar = (io.sentry.android.core.performance.b) this.f26099m.get(activity);
        if (bVar != null) {
            SentryAndroidOptions sentryAndroidOptions = this.f26090d;
            bVar.h(sentryAndroidOptions != null ? sentryAndroidOptions.getDateProvider().a() : C2471t.a());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        InterfaceC2480b0 interfaceC2480b0A = this.f26105s.a();
        try {
            if (!this.f26093g) {
                onActivityPostStarted(activity);
            }
            if (this.f26091e) {
                final InterfaceC2488d0 interfaceC2488d0 = (InterfaceC2488d0) this.f26097k.get(activity);
                final InterfaceC2488d0 interfaceC2488d1 = (InterfaceC2488d0) this.f26098l.get(activity);
                if (activity.getWindow() != null) {
                    io.sentry.android.core.internal.util.l.d(activity, new Runnable() { // from class: io.sentry.android.core.k
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f26473a.r1(interfaceC2488d1, interfaceC2488d0);
                        }
                    }, this.f26088b);
                } else {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f26486a.r1(interfaceC2488d1, interfaceC2488d0);
                        }
                    });
                }
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        InterfaceC2480b0 interfaceC2480b0A = this.f26105s.a();
        try {
            if (!this.f26093g) {
                onActivityPostCreated(activity, null);
                onActivityPreStarted(activity);
            }
            if (this.f26091e) {
                this.f26104r.e(activity);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    public final boolean p1(SentryAndroidOptions sentryAndroidOptions) {
        return sentryAndroidOptions.isTracingEnabled() && sentryAndroidOptions.isEnableAutoActivityLifecycleTracing();
    }

    public final boolean q1(Activity activity) {
        return this.f26103q.containsKey(activity);
    }

    public final void r0() {
        this.f26094h = false;
        this.f26100n = new C2(new Date(0L), 0L);
        this.f26101o = 0L;
        this.f26099m.clear();
    }

    public final void r1(InterfaceC2488d0 interfaceC2488d0, InterfaceC2488d0 interfaceC2488d1) {
        io.sentry.android.core.performance.f fVarM = io.sentry.android.core.performance.f.m();
        io.sentry.android.core.performance.g gVarH = fVarM.h();
        io.sentry.android.core.performance.g gVarN = fVarM.n();
        if (gVarH.x() && gVarH.w()) {
            gVarH.D();
        }
        if (gVarN.x() && gVarN.w()) {
            gVarN.D();
        }
        A0();
        SentryAndroidOptions sentryAndroidOptions = this.f26090d;
        if (sentryAndroidOptions == null || interfaceC2488d1 == null) {
            J0(interfaceC2488d1);
            return;
        }
        U1 u1A = sentryAndroidOptions.getDateProvider().a();
        long millis = TimeUnit.NANOSECONDS.toMillis(u1A.b(interfaceC2488d1.u()));
        Long lValueOf = Long.valueOf(millis);
        InterfaceC2594z0.a aVar = InterfaceC2594z0.a.MILLISECOND;
        interfaceC2488d1.j("time_to_initial_display", lValueOf, aVar);
        if (interfaceC2488d0 != null && interfaceC2488d0.d()) {
            interfaceC2488d0.f(u1A);
            interfaceC2488d1.j("time_to_full_display", Long.valueOf(millis), aVar);
        }
        L0(interfaceC2488d1, u1A);
    }

    public void w0(final io.sentry.V v8, final InterfaceC2496f0 interfaceC2496f0) {
        v8.E(new C2533o1.c() { // from class: io.sentry.android.core.n
            @Override // io.sentry.C2533o1.c
            public final void a(InterfaceC2496f0 interfaceC2496f1) {
                ActivityLifecycleIntegration.A(interfaceC2496f0, v8, interfaceC2496f1);
            }
        });
    }

    public final String g1(boolean z8) {
        return z8 ? "app.start.cold" : HRHLwtyqJWz.bWSDgUaPOtYG;
    }

    public final String o1(String str) {
        return str + PCRzgdeK.ittibQjHGE;
    }
}
