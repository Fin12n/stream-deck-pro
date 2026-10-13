package io.sentry;

import io.sentry.util.C2569a;
import io.sentry.util.C2572d;
import io.sentry.util.C2576h;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class M1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile Y f25943a = K0.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile X f25944b = I0.d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final V f25945c = new C2533o1(J2.empty());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile boolean f25946d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f25947e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f25948f = System.currentTimeMillis();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C2569a f25949g = new C2569a();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface a {
        void a(J2 j8);
    }

    public static boolean A() {
        return q().n();
    }

    public static void B(final J2 j8) {
        try {
            j8.getExecutorService().submit(new Runnable() { // from class: io.sentry.L1
                @Override // java.lang.Runnable
                public final void run() {
                    M1.c(j8);
                }
            });
        } catch (Throwable th) {
            j8.getLogger().b(EnumC2596z2.DEBUG, "Failed to notify options observers.", th);
        }
    }

    public static boolean C(J2 j8) {
        if (j8.isEnableExternalConfiguration()) {
            j8.merge(E.g(io.sentry.config.g.a(), j8.getLogger()));
        }
        String dsn = j8.getDsn();
        if (!j8.isEnabled() || (dsn != null && dsn.isEmpty())) {
            k();
            return false;
        }
        if (dsn == null) {
            throw new IllegalArgumentException("DSN is required. Use empty string or set enabled to false in SentryOptions to disable SDK.");
        }
        j8.retrieveParsedDsn();
        return true;
    }

    public static r3 D(J2 j8) {
        s3 s3Var = new s3("app.launch", "profile");
        s3Var.z(true);
        return j8.getInternalTracesSampler().a(new C2529n1(s3Var, null, Double.valueOf(io.sentry.util.z.a().d())));
    }

    public static InterfaceC2480b0 E(X x8) {
        return r().b(x8);
    }

    public static void F(io.sentry.protocol.F f8) {
        q().c(f8);
    }

    public static void G() {
        q().k();
    }

    public static InterfaceC2496f0 H(s3 s3Var, u3 u3Var) {
        return q().s(s3Var, u3Var);
    }

    public static void I(InterfaceC2549q1 interfaceC2549q1) {
        q().z(interfaceC2549q1);
    }

    public static /* synthetic */ void a(J2 j8) {
        String cacheDirPathWithoutDsn = j8.getCacheDirPathWithoutDsn();
        if (cacheDirPathWithoutDsn != null) {
            File file = new File(cacheDirPathWithoutDsn, "app_start_profiling_config");
            try {
                C2576h.a(file);
                if (j8.isEnableAppStartProfiling()) {
                    if (!j8.isTracingEnabled()) {
                        j8.getLogger().c(EnumC2596z2.INFO, "Tracing is disabled and app start profiling will not start.", new Object[0]);
                        return;
                    }
                    if (file.createNewFile()) {
                        N1 n8 = new N1(j8, D(j8));
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, f25947e));
                            try {
                                j8.getSerializer().a(n8, bufferedWriter);
                                bufferedWriter.close();
                                fileOutputStream.close();
                            } catch (Throwable th) {
                                try {
                                    bufferedWriter.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    }
                }
            } catch (Throwable th5) {
                j8.getLogger().b(EnumC2596z2.ERROR, "Unable to create app start profiling config file. ", th5);
            }
        }
    }

    public static /* synthetic */ void c(J2 j8) {
        for (Q q8 : j8.getOptionsObservers()) {
            q8.h(j8.getRelease());
            q8.g(j8.getProguardUuid());
            q8.c(j8.getSdkVersion());
            q8.d(j8.getDist());
            q8.f(j8.getEnvironment());
            q8.b(j8.getTags());
            q8.e(j8.getSessionReplay().g());
        }
    }

    public static /* synthetic */ void d(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.lastModified() < f25948f - TimeUnit.MINUTES.toMillis(5L)) {
                C2576h.a(file2);
            }
        }
    }

    public static void e(C2491e c2491e) {
        q().i(c2491e);
    }

    public static void f(C2491e c2491e, H h8) {
        q().e(c2491e, h8);
    }

    public static void g(a aVar, J2 j8) {
        try {
            aVar.a(j8);
        } catch (Throwable th) {
            j8.getLogger().b(EnumC2596z2.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th);
        }
    }

    public static io.sentry.protocol.u h(C2557s2 c2557s2, H h8) {
        return q().F(c2557s2, h8);
    }

    public static io.sentry.protocol.u i(Throwable th) {
        return q().A(th);
    }

    public static io.sentry.protocol.u j(Throwable th, H h8) {
        return q().B(th, h8);
    }

    public static void k() {
        InterfaceC2480b0 interfaceC2480b0A = f25949g.a();
        try {
            X xQ = q();
            f25944b = I0.d();
            r().close();
            xQ.a(false);
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

    public static void l(EnumC2556s1 enumC2556s1, InterfaceC2549q1 interfaceC2549q1) {
        q().w(enumC2556s1, interfaceC2549q1);
    }

    public static void m() {
        q().j();
    }

    public static void n(J2 j8, X x8) {
        try {
            j8.getExecutorService().submit(new RunnableC2489d1(j8, x8));
        } catch (Throwable th) {
            j8.getLogger().b(EnumC2596z2.DEBUG, "Failed to finalize previous session.", th);
        }
    }

    public static void o(long j8) {
        q().p(j8);
    }

    public static X p(String str) {
        return q().E(str);
    }

    public static X q() {
        if (f25946d) {
            return f25944b;
        }
        X x8 = r().get();
        if (x8 != null && !x8.v()) {
            return x8;
        }
        X xE = f25944b.E("getCurrentScopes");
        r().b(xE);
        return xE;
    }

    public static Y r() {
        return f25943a;
    }

    public static void s(final J2 j8, InterfaceC2447a0 interfaceC2447a0) {
        try {
            interfaceC2447a0.submit(new Runnable() { // from class: io.sentry.J1
                @Override // java.lang.Runnable
                public final void run() {
                    M1.a(j8);
                }
            });
        } catch (Throwable th) {
            j8.getLogger().b(EnumC2596z2.ERROR, "Failed to call the executor. App start profiling config will not be changed. Did you call Sentry.close()?", th);
        }
    }

    public static void t(Y0 y8, a aVar, boolean z8) {
        J2 j8 = (J2) y8.b();
        g(aVar, j8);
        u(j8, z8);
    }

    public static void u(final J2 j8, boolean z8) {
        InterfaceC2480b0 interfaceC2480b0A = f25949g.a();
        try {
            if (!j8.getClass().getName().equals("io.sentry.android.core.SentryAndroidOptions") && io.sentry.util.w.a()) {
                throw new IllegalArgumentException("You are running Android. Please, use SentryAndroid.init. " + j8.getClass().getName());
            }
            if (!C(j8)) {
                if (interfaceC2480b0A != null) {
                    interfaceC2480b0A.close();
                    return;
                }
                return;
            }
            Boolean boolIsGlobalHubMode = j8.isGlobalHubMode();
            if (boolIsGlobalHubMode != null) {
                z8 = boolIsGlobalHubMode.booleanValue();
            }
            j8.getLogger().c(EnumC2596z2.INFO, "GlobalHubMode: '%s'", String.valueOf(z8));
            f25946d = z8;
            if (io.sentry.util.n.a(f25945c.b(), j8, z())) {
                if (z()) {
                    j8.getLogger().c(EnumC2596z2.WARNING, "Sentry has been already initialized. Previous configuration will be overwritten.", new Object[0]);
                }
                try {
                    j8.getExecutorService().submit(new Runnable() { // from class: io.sentry.I1
                        @Override // java.lang.Runnable
                        public final void run() {
                            j8.loadLazyFields();
                        }
                    });
                } catch (RejectedExecutionException e8) {
                    j8.getLogger().b(EnumC2596z2.DEBUG, "Failed to call the executor. Lazy fields will not be loaded. Did you call Sentry.close()?", e8);
                }
                q().a(true);
                V v8 = f25945c;
                v8.m(j8);
                f25944b = new C2595z1(new C2533o1(j8), new C2533o1(j8), v8, "Sentry.init");
                x(j8);
                w(j8);
                r().b(f25944b);
                v(j8);
                v8.o(new S1(j8));
                if (j8.getExecutorService().isClosed()) {
                    j8.setExecutorService(new C2568u2());
                }
                Iterator<InterfaceC2516k0> it = j8.getIntegrations().iterator();
                while (it.hasNext()) {
                    it.next().o(A1.d(), j8);
                }
                B(j8);
                n(j8, A1.d());
                s(j8, j8.getExecutorService());
                ILogger logger = j8.getLogger();
                EnumC2596z2 enumC2596z2 = EnumC2596z2.DEBUG;
                logger.c(enumC2596z2, "Using openTelemetryMode %s", j8.getOpenTelemetryMode());
                j8.getLogger().c(enumC2596z2, "Using span factory %s", j8.getSpanFactory().getClass().getName());
                j8.getLogger().c(enumC2596z2, "Using scopes storage %s", f25943a.getClass().getName());
            } else {
                j8.getLogger().c(EnumC2596z2.WARNING, "This init call has been ignored due to priority being too low.", new Object[0]);
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

    public static void v(J2 j8) {
        ILogger logger = j8.getLogger();
        EnumC2596z2 enumC2596z2 = EnumC2596z2.INFO;
        logger.c(enumC2596z2, "Initializing SDK with DSN: '%s'", j8.getDsn());
        String outboxPath = j8.getOutboxPath();
        if (outboxPath != null) {
            new File(outboxPath).mkdirs();
        } else {
            logger.c(enumC2596z2, "No outbox dir path is defined in options.", new Object[0]);
        }
        String cacheDirPath = j8.getCacheDirPath();
        if (cacheDirPath != null) {
            new File(cacheDirPath).mkdirs();
            if (j8.getEnvelopeDiskCache() instanceof io.sentry.transport.s) {
                j8.setEnvelopeDiskCache(io.sentry.cache.f.K(j8));
            }
        }
        String profilingTracesDirPath = j8.getProfilingTracesDirPath();
        if (j8.isProfilingEnabled() && profilingTracesDirPath != null) {
            final File file = new File(profilingTracesDirPath);
            file.mkdirs();
            try {
                j8.getExecutorService().submit(new Runnable() { // from class: io.sentry.K1
                    @Override // java.lang.Runnable
                    public final void run() {
                        M1.d(file);
                    }
                });
            } catch (RejectedExecutionException e8) {
                j8.getLogger().b(EnumC2596z2.ERROR, "Failed to call the executor. Old profiles will not be deleted. Did you call Sentry.close()?", e8);
            }
        }
        io.sentry.internal.modules.b modulesLoader = j8.getModulesLoader();
        if (!j8.isSendModules()) {
            j8.setModulesLoader(io.sentry.internal.modules.e.b());
        } else if (modulesLoader instanceof io.sentry.internal.modules.e) {
            j8.setModulesLoader(new io.sentry.internal.modules.a(Arrays.asList(new io.sentry.internal.modules.c(j8.getLogger()), new io.sentry.internal.modules.f(j8.getLogger())), j8.getLogger()));
        }
        if (j8.getDebugMetaLoader() instanceof io.sentry.internal.debugmeta.b) {
            j8.setDebugMetaLoader(new io.sentry.internal.debugmeta.c(j8.getLogger()));
        }
        C2572d.c(j8, j8.getDebugMetaLoader().a());
        if (j8.getThreadChecker() instanceof io.sentry.util.thread.b) {
            j8.setThreadChecker(io.sentry.util.thread.c.c());
        }
        if (j8.getPerformanceCollectors().isEmpty()) {
            j8.addPerformanceCollector(new C2520l0());
        }
        if (j8.isEnableBackpressureHandling() && io.sentry.util.w.c()) {
            if (j8.getBackpressureMonitor() instanceof io.sentry.backpressure.c) {
                j8.setBackpressureMonitor(new io.sentry.backpressure.a(j8, A1.d()));
            }
            j8.getBackpressureMonitor().start();
        }
    }

    public static void w(J2 j8) {
        io.sentry.opentelemetry.a.c(j8, new io.sentry.util.r());
        if (E2.OFF == j8.getOpenTelemetryMode()) {
            j8.setSpanFactory(new C2531o());
        }
        y(j8);
        io.sentry.opentelemetry.a.a(j8);
    }

    public static void x(J2 j8) {
        if (j8.isDebug() && (j8.getLogger() instanceof E0)) {
            j8.setLogger(new o3());
        }
    }

    public static void y(J2 j8) {
        r().close();
        if (E2.OFF == j8.getOpenTelemetryMode()) {
            f25943a = new C2527n();
        } else {
            f25943a = B1.a(new io.sentry.util.r(), E0.e());
        }
    }

    public static boolean z() {
        return q().isEnabled();
    }
}
