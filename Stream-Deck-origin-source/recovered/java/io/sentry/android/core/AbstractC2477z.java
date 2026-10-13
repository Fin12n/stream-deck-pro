package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import io.sentry.C2523m;
import io.sentry.C2547q;
import io.sentry.D1;
import io.sentry.E2;
import io.sentry.EnumC2556s1;
import io.sentry.EnumC2596z2;
import io.sentry.G1;
import io.sentry.H1;
import io.sentry.ILogger;
import io.sentry.InterfaceC2480b0;
import io.sentry.InterfaceC2500g0;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.replay.C2478a;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.compose.gestures.ComposeGestureTargetLocator;
import io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: renamed from: io.sentry.android.core.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2477z {
    public static File d(Context context) {
        return new File(context.getCacheDir(), "sentry");
    }

    public static String e(PackageInfo packageInfo, String str) {
        return packageInfo.packageName + "@" + packageInfo.versionName + "+" + str;
    }

    public static void f(SentryAndroidOptions sentryAndroidOptions, Context context, Q q8, io.sentry.util.r rVar, C2460h c2460h) {
        if (sentryAndroidOptions.getCacheDirPath() != null && (sentryAndroidOptions.getEnvelopeDiskCache() instanceof io.sentry.transport.s)) {
            sentryAndroidOptions.setEnvelopeDiskCache(new io.sentry.android.core.cache.b(sentryAndroidOptions));
        }
        if (sentryAndroidOptions.getConnectionStatusProvider() instanceof io.sentry.B0) {
            sentryAndroidOptions.setConnectionStatusProvider(new io.sentry.android.core.internal.util.a(context, sentryAndroidOptions.getLogger(), q8));
        }
        sentryAndroidOptions.addEventProcessor(new C2523m(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new C2455c0(context, q8, sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new q0(sentryAndroidOptions, c2460h));
        sentryAndroidOptions.addEventProcessor(new ScreenshotEventProcessor(sentryAndroidOptions, q8));
        sentryAndroidOptions.addEventProcessor(new ViewHierarchyEventProcessor(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new I(context, sentryAndroidOptions, q8));
        sentryAndroidOptions.setTransportGate(new E(sentryAndroidOptions));
        InterfaceC2480b0 interfaceC2480b0A = io.sentry.android.core.performance.f.f26515p.a();
        try {
            InterfaceC2500g0 interfaceC2500g0F = io.sentry.android.core.performance.f.m().f();
            if (interfaceC2500g0F != null) {
                sentryAndroidOptions.setTransactionProfiler(interfaceC2500g0F);
                io.sentry.android.core.performance.f.m().s(null);
            } else {
                sentryAndroidOptions.setTransactionProfiler(new D(context, sentryAndroidOptions, q8, (io.sentry.android.core.internal.util.u) io.sentry.util.u.c(sentryAndroidOptions.getFrameMetricsCollector(), "options.getFrameMetricsCollector is required")));
            }
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
            sentryAndroidOptions.setModulesLoader(new io.sentry.android.core.internal.modules.a(context, sentryAndroidOptions.getLogger()));
            sentryAndroidOptions.setDebugMetaLoader(new io.sentry.android.core.internal.debugmeta.a(context, sentryAndroidOptions.getLogger()));
            boolean zB = rVar.b("androidx.core.view.ScrollingView", sentryAndroidOptions);
            boolean zB2 = rVar.b("androidx.compose.ui.node.Owner", sentryAndroidOptions);
            if (sentryAndroidOptions.getGestureTargetLocators().isEmpty()) {
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(new io.sentry.android.core.internal.gestures.a(zB));
                if (zB2 && rVar.b("io.sentry.compose.gestures.ComposeGestureTargetLocator", sentryAndroidOptions)) {
                    arrayList.add(new ComposeGestureTargetLocator(sentryAndroidOptions.getLogger()));
                }
                sentryAndroidOptions.setGestureTargetLocators(arrayList);
            }
            if (sentryAndroidOptions.getViewHierarchyExporters().isEmpty() && zB2 && rVar.b("io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter", sentryAndroidOptions)) {
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add(new ComposeViewHierarchyExporter(sentryAndroidOptions.getLogger()));
                sentryAndroidOptions.setViewHierarchyExporters(arrayList2);
            }
            sentryAndroidOptions.setThreadChecker(io.sentry.android.core.internal.util.d.d());
            if (sentryAndroidOptions.getPerformanceCollectors().isEmpty()) {
                sentryAndroidOptions.addPerformanceCollector(new C2473v());
                sentryAndroidOptions.addPerformanceCollector(new C2470s(sentryAndroidOptions.getLogger()));
                if (sentryAndroidOptions.isEnablePerformanceV2()) {
                    sentryAndroidOptions.addPerformanceCollector(new z0(sentryAndroidOptions, (io.sentry.android.core.internal.util.u) io.sentry.util.u.c(sentryAndroidOptions.getFrameMetricsCollector(), "options.getFrameMetricsCollector is required")));
                }
            }
            sentryAndroidOptions.setTransactionPerformanceCollector(new C2547q(sentryAndroidOptions));
            if (sentryAndroidOptions.getCacheDirPath() != null) {
                if (sentryAndroidOptions.isEnableScopePersistence()) {
                    sentryAndroidOptions.addScopeObserver(new io.sentry.cache.s(sentryAndroidOptions));
                }
                sentryAndroidOptions.addOptionsObserver(new io.sentry.cache.h(sentryAndroidOptions));
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

    public static void g(Context context, final SentryAndroidOptions sentryAndroidOptions, Q q8, io.sentry.util.r rVar, C2460h c2460h, boolean z8, boolean z9, boolean z10) {
        io.sentry.util.q qVar = new io.sentry.util.q(new io.sentry.util.q.a() { // from class: io.sentry.android.core.w
            @Override // io.sentry.util.q.a
            public final Object a() {
                return Boolean.valueOf(io.sentry.android.core.cache.b.W(sentryAndroidOptions));
            }
        });
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new G1(new D1() { // from class: io.sentry.android.core.x
            @Override // io.sentry.D1
            public final String a() {
                return sentryAndroidOptions.getCacheDirPath();
            }
        }), qVar));
        sentryAndroidOptions.addIntegration(new NdkIntegration(rVar.c("io.sentry.android.ndk.SentryNdk", sentryAndroidOptions.getLogger())));
        sentryAndroidOptions.addIntegration(EnvelopeFileObserverIntegration.c());
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new H1(new D1() { // from class: io.sentry.android.core.y
            @Override // io.sentry.D1
            public final String a() {
                return sentryAndroidOptions.getOutboxPath();
            }
        }), qVar));
        sentryAndroidOptions.addIntegration(new AppLifecycleIntegration());
        sentryAndroidOptions.addIntegration(H.a(context, q8));
        if (context instanceof Application) {
            Application application = (Application) context;
            sentryAndroidOptions.addIntegration(new ActivityLifecycleIntegration(application, q8, c2460h));
            sentryAndroidOptions.addIntegration(new ActivityBreadcrumbsIntegration(application));
            sentryAndroidOptions.addIntegration(new CurrentActivityIntegration(application));
            sentryAndroidOptions.addIntegration(new UserInteractionIntegration(application, rVar));
            if (z8) {
                sentryAndroidOptions.addIntegration(new FragmentLifecycleIntegration(application, true, true));
            }
        } else {
            sentryAndroidOptions.getLogger().c(EnumC2596z2.WARNING, "ActivityLifecycle, FragmentLifecycle and UserInteraction Integrations need an Application class to be installed.", new Object[0]);
        }
        if (z9) {
            sentryAndroidOptions.addIntegration(new SentryTimberIntegration());
        }
        sentryAndroidOptions.addIntegration(new AppComponentsBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new SystemEventsBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new NetworkBreadcrumbsIntegration(context, q8, sentryAndroidOptions.getLogger()));
        if (z10) {
            ReplayIntegration replayIntegration = new ReplayIntegration(context, io.sentry.transport.n.a());
            replayIntegration.k1(new C2478a());
            sentryAndroidOptions.addIntegration(replayIntegration);
            sentryAndroidOptions.setReplayController(replayIntegration);
        }
    }

    public static void h(SentryAndroidOptions sentryAndroidOptions, Context context, ILogger iLogger, Q q8) {
        io.sentry.util.u.c(context, "The context is required.");
        Context contextH = Z.h(context);
        io.sentry.util.u.c(sentryAndroidOptions, "The options object is required.");
        io.sentry.util.u.c(iLogger, "The ILogger object is required.");
        sentryAndroidOptions.setLogger(iLogger);
        sentryAndroidOptions.setDefaultScopeType(EnumC2556s1.CURRENT);
        sentryAndroidOptions.setOpenTelemetryMode(E2.OFF);
        sentryAndroidOptions.setDateProvider(new w0());
        sentryAndroidOptions.setFlushTimeoutMillis(4000L);
        sentryAndroidOptions.setFrameMetricsCollector(new io.sentry.android.core.internal.util.u(contextH, iLogger, q8));
        m0.a(contextH, sentryAndroidOptions, q8);
        sentryAndroidOptions.setCacheDirPath(d(contextH).getAbsolutePath());
        i(sentryAndroidOptions, contextH, q8);
    }

    public static void i(SentryAndroidOptions sentryAndroidOptions, Context context, Q q8) {
        PackageInfo packageInfoR = Z.r(context, q8);
        if (packageInfoR != null) {
            if (sentryAndroidOptions.getRelease() == null) {
                sentryAndroidOptions.setRelease(e(packageInfoR, Z.s(packageInfoR, q8)));
            }
            String str = packageInfoR.packageName;
            if (str != null && !str.startsWith("android.")) {
                sentryAndroidOptions.addInAppInclude(str);
            }
        }
        if (sentryAndroidOptions.getDistinctId() == null) {
            try {
                sentryAndroidOptions.setDistinctId(i0.a(context));
            } catch (RuntimeException e8) {
                sentryAndroidOptions.getLogger().b(EnumC2596z2.ERROR, "Could not generate distinct Id.", e8);
            }
        }
    }
}
