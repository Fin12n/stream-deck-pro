package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.EnumC2596z2;
import io.sentry.ILogger;
import io.sentry.InterfaceC2480b0;
import io.sentry.InterfaceC2516k0;
import io.sentry.InterfaceC2549q1;
import io.sentry.J2;
import io.sentry.M1;
import io.sentry.Y0;
import io.sentry.Y2;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.util.C2569a;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f26565a = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2569a f26566b = new C2569a();

    public static /* synthetic */ void b(AtomicBoolean atomicBoolean, io.sentry.V v8) {
        Y2 y2Q = v8.q();
        if (y2Q == null || y2Q.k() == null) {
            return;
        }
        atomicBoolean.set(true);
    }

    public static /* synthetic */ void c(ILogger iLogger, Context context, M1.a aVar, SentryAndroidOptions sentryAndroidOptions) {
        io.sentry.util.r rVar = new io.sentry.util.r();
        boolean zB = rVar.b("timber.log.Timber", sentryAndroidOptions);
        boolean z8 = false;
        if (rVar.b("androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks", sentryAndroidOptions) && rVar.b("io.sentry.android.fragment.FragmentLifecycleIntegration", sentryAndroidOptions)) {
            z8 = true;
        }
        boolean z9 = zB && rVar.b("io.sentry.android.timber.SentryTimberIntegration", sentryAndroidOptions);
        boolean zB2 = rVar.b("io.sentry.android.replay.ReplayIntegration", sentryAndroidOptions);
        Q q8 = new Q(iLogger);
        io.sentry.util.r rVar2 = new io.sentry.util.r();
        C2460h c2460h = new C2460h(rVar2, sentryAndroidOptions);
        AbstractC2477z.h(sentryAndroidOptions, context, iLogger, q8);
        AbstractC2477z.g(context, sentryAndroidOptions, q8, rVar2, c2460h, z8, z9, zB2);
        try {
            aVar.a(sentryAndroidOptions);
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().b(EnumC2596z2.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th);
        }
        io.sentry.android.core.performance.f fVarM = io.sentry.android.core.performance.f.m();
        if (sentryAndroidOptions.isEnablePerformanceV2() && q8.d() >= 24) {
            io.sentry.android.core.performance.g gVarH = fVarM.h();
            if (gVarH.v()) {
                gVarH.A(Process.getStartUptimeMillis());
            }
        }
        if (context.getApplicationContext() instanceof Application) {
            fVarM.q((Application) context.getApplicationContext());
        }
        io.sentry.android.core.performance.g gVarN = fVarM.n();
        if (gVarN.v()) {
            gVarN.A(f26565a);
        }
        AbstractC2477z.f(sentryAndroidOptions, context, q8, rVar2, c2460h);
        d(sentryAndroidOptions, z8, z9);
    }

    public static void d(J2 j8, boolean z8, boolean z9) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (InterfaceC2516k0 interfaceC2516k0 : j8.getIntegrations()) {
            if (z8 && (interfaceC2516k0 instanceof FragmentLifecycleIntegration)) {
                arrayList2.add(interfaceC2516k0);
            }
            if (z9 && (interfaceC2516k0 instanceof SentryTimberIntegration)) {
                arrayList.add(interfaceC2516k0);
            }
        }
        if (arrayList2.size() > 1) {
            for (int i8 = 0; i8 < arrayList2.size() - 1; i8++) {
                j8.getIntegrations().remove((InterfaceC2516k0) arrayList2.get(i8));
            }
        }
        if (arrayList.size() > 1) {
            for (int i9 = 0; i9 < arrayList.size() - 1; i9++) {
                j8.getIntegrations().remove((InterfaceC2516k0) arrayList.get(i9));
            }
        }
    }

    public static void e(Context context, ILogger iLogger) {
        f(context, iLogger, new M1.a() { // from class: io.sentry.android.core.s0
            @Override // io.sentry.M1.a
            public final void a(J2 j8) {
                v0.a((SentryAndroidOptions) j8);
            }
        });
    }

    public static void f(final Context context, final ILogger iLogger, final M1.a aVar) {
        try {
            InterfaceC2480b0 interfaceC2480b0A = f26566b.a();
            try {
                M1.t(Y0.a(SentryAndroidOptions.class), new M1.a() { // from class: io.sentry.android.core.t0
                    @Override // io.sentry.M1.a
                    public final void a(J2 j8) {
                        v0.c(iLogger, context, aVar, (SentryAndroidOptions) j8);
                    }
                }, true);
                io.sentry.X xQ = M1.q();
                if (Z.u()) {
                    if (xQ.b().isEnableAutoSessionTracking()) {
                        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                        xQ.u(new InterfaceC2549q1() { // from class: io.sentry.android.core.u0
                            @Override // io.sentry.InterfaceC2549q1
                            public final void a(io.sentry.V v8) {
                                v0.b(atomicBoolean, v8);
                            }
                        });
                        if (!atomicBoolean.get()) {
                            xQ.k();
                        }
                    }
                    xQ.b().getReplayController().start();
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
        } catch (IllegalAccessException e8) {
            iLogger.b(EnumC2596z2.FATAL, "Fatal error during SentryAndroid.init(...)", e8);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e8);
        } catch (InstantiationException e9) {
            iLogger.b(EnumC2596z2.FATAL, "Fatal error during SentryAndroid.init(...)", e9);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e9);
        } catch (NoSuchMethodException e10) {
            iLogger.b(EnumC2596z2.FATAL, "Fatal error during SentryAndroid.init(...)", e10);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e10);
        } catch (InvocationTargetException e11) {
            iLogger.b(EnumC2596z2.FATAL, "Fatal error during SentryAndroid.init(...)", e11);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e11);
        }
    }

    public static void g(Context context, M1.a aVar) {
        f(context, new C2472u(), aVar);
    }

    public static /* synthetic */ void a(SentryAndroidOptions sentryAndroidOptions) {
    }
}
