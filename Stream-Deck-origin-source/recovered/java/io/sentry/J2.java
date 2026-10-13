package io.sentry;

import com.google.mlkit.common.internal.ckI.WqXA;
import io.sentry.util.C2569a;
import java.io.File;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class J2 {
    static final EnumC2596z2 DEFAULT_DIAGNOSTIC_LEVEL = EnumC2596z2.DEBUG;
    private static final String DEFAULT_ENVIRONMENT = "production";
    public static final String DEFAULT_PROPAGATION_TARGETS = ".*";
    private boolean attachServerName;
    private boolean attachStacktrace;
    private boolean attachThreads;
    private io.sentry.backpressure.b backpressureMonitor;
    private a beforeBreadcrumb;
    private b beforeEnvelopeCallback;
    private c beforeSend;
    private d beforeSendReplay;
    private e beforeSendTransaction;
    private final Set<String> bundleIds;
    private String cacheDirPath;
    io.sentry.clientreport.h clientReportRecorder;
    private M connectionStatusProvider;
    private int connectionTimeoutMillis;
    private final List<String> contextTags;
    private f cron;
    private final io.sentry.util.q dateProvider;
    private boolean debug;
    private io.sentry.internal.debugmeta.a debugMetaLoader;
    private EnumC2556s1 defaultScopeType;
    private final List<String> defaultTracePropagationTargets;
    private EnumC2596z2 diagnosticLevel;
    private String dist;
    private String distinctId;
    private String dsn;
    private String dsnHash;
    private boolean enableAppStartProfiling;
    private boolean enableAutoSessionTracking;
    private boolean enableBackpressureHandling;
    private boolean enableDeduplication;
    private boolean enableExternalConfiguration;
    private boolean enablePrettySerializationOutput;
    private boolean enableScopePersistence;
    private boolean enableScreenTracking;
    private boolean enableShutdownHook;
    private boolean enableSpotlight;
    private boolean enableTimeToFullDisplayTracing;
    private boolean enableUncaughtExceptionHandler;
    private boolean enableUserInteractionBreadcrumbs;
    private boolean enableUserInteractionTracing;
    private boolean enabled;
    private io.sentry.cache.g envelopeDiskCache;
    private final io.sentry.util.q envelopeReader;
    private String environment;
    private final List<C> eventProcessors;
    private InterfaceC2447a0 executorService;
    private final D experimental;
    private long flushTimeoutMillis;
    private boolean forceInit;
    private G fullyDisplayedReporter;
    private final List<io.sentry.internal.gestures.a> gestureTargetLocators;
    private Boolean globalHubMode;
    private Long idleTimeout;
    private List<F> ignoredCheckIns;
    private List<F> ignoredErrors;
    private final Set<Class<? extends Throwable>> ignoredExceptionsForType;
    private List<F> ignoredSpanOrigins;
    private List<F> ignoredTransactions;
    private final List<String> inAppExcludes;
    private final List<String> inAppIncludes;
    private EnumC2508i0 initPriority;
    private EnumC2512j0 instrumenter;
    private final List<InterfaceC2516k0> integrations;
    private volatile q3 internalTracesSampler;
    protected final C2569a lock;
    private ILogger logger;
    private long maxAttachmentSize;
    private int maxBreadcrumbs;
    private int maxCacheItems;
    private int maxDepth;
    private int maxQueueSize;
    private i maxRequestBodySize;
    private int maxSpans;
    private long maxTraceFileSize;
    private io.sentry.internal.modules.b modulesLoader;
    private final List<W> observers;
    private E2 openTelemetryMode;
    private final List<Q> optionsObservers;
    private final io.sentry.util.q parsedDsn;
    private final List<S> performanceCollectors;
    private boolean printUncaughtStackTrace;
    private Double profilesSampleRate;
    private g profilesSampler;
    private int profilingTracesHz;
    private String proguardUuid;
    private h proxy;
    private int readTimeoutMillis;
    private String release;
    private InterfaceC2513j1 replayController;
    private Double sampleRate;
    private io.sentry.protocol.o sdkVersion;
    private boolean sendClientReports;
    private boolean sendDefaultPii;
    private boolean sendModules;
    private String sentryClientName;
    private final io.sentry.util.q serializer;
    private String serverName;
    private long sessionFlushTimeoutMillis;
    private L2 sessionReplay;
    private long sessionTrackingIntervalMillis;
    private long shutdownTimeoutMillis;
    private InterfaceC2492e0 spanFactory;
    private String spotlightConnectionUrl;
    private SSLSocketFactory sslSocketFactory;
    private final Map<String, String> tags;
    private io.sentry.util.thread.a threadChecker;
    private boolean traceOptionsRequests;
    private List<String> tracePropagationTargets;
    private boolean traceSampling;
    private Double tracesSampleRate;
    private j tracesSampler;
    private v3 transactionPerformanceCollector;
    private InterfaceC2500g0 transactionProfiler;
    private InterfaceC2504h0 transportFactory;
    private io.sentry.transport.r transportGate;
    private final List<Object> viewHierarchyExporters;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface a {
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface b {
        void b(W1 w8, H h8);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface c {
        C2557s2 a(C2557s2 c2557s2, H h8);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface d {
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface e {
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f25894a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Long f25895b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f25896c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Long f25897d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Long f25898e;

        public Long a() {
            return this.f25894a;
        }

        public Long b() {
            return this.f25897d;
        }

        public Long c() {
            return this.f25895b;
        }

        public Long d() {
            return this.f25898e;
        }

        public String e() {
            return this.f25896c;
        }

        public void f(Long l8) {
            this.f25894a = l8;
        }

        public void g(Long l8) {
            this.f25897d = l8;
        }

        public void h(Long l8) {
            this.f25895b = l8;
        }

        public void i(Long l8) {
            this.f25898e = l8;
        }

        public void j(String str) {
            this.f25896c = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface g {
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f25899a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f25900b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f25901c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f25902d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Proxy.Type f25903e;

        public h() {
            this(null, null, null, null, null);
        }

        public String a() {
            return this.f25899a;
        }

        public String b() {
            return this.f25902d;
        }

        public String c() {
            return this.f25900b;
        }

        public Proxy.Type d() {
            return this.f25903e;
        }

        public String e() {
            return this.f25901c;
        }

        public h(String str, String str2) {
            this(str, str2, null, null, null);
        }

        public h(String str, String str2, Proxy.Type type) {
            this(str, str2, type, null, null);
        }

        public h(String str, String str2, String str3, String str4) {
            this(str, str2, null, str3, str4);
        }

        public h(String str, String str2, Proxy.Type type, String str3, String str4) {
            this.f25899a = str;
            this.f25900b = str2;
            this.f25903e = type;
            this.f25901c = str3;
            this.f25902d = str4;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum i {
        NONE,
        SMALL,
        MEDIUM,
        ALWAYS
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface j {
    }

    public J2() {
        this(false);
    }

    public static /* synthetic */ V1 a() {
        return new O1();
    }

    public static /* synthetic */ C2577v b(J2 j8) {
        return new C2577v(j8.dsn);
    }

    public static /* synthetic */ N c(J2 j8) {
        j8.getClass();
        return new C2585x((InterfaceC2484c0) j8.serializer.a());
    }

    public static /* synthetic */ InterfaceC2484c0 d(J2 j8) {
        j8.getClass();
        return new C2586x0(j8);
    }

    public static J2 empty() {
        return new J2(true);
    }

    public void addBundleId(String str) {
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            this.bundleIds.add(strTrim);
        }
    }

    public void addContextTag(String str) {
        this.contextTags.add(str);
    }

    public void addEventProcessor(C c8) {
        this.eventProcessors.add(c8);
    }

    public void addIgnoredCheckIn(String str) {
        if (this.ignoredCheckIns == null) {
            this.ignoredCheckIns = new ArrayList();
        }
        this.ignoredCheckIns.add(new F(str));
    }

    public void addIgnoredError(String str) {
        if (this.ignoredErrors == null) {
            this.ignoredErrors = new ArrayList();
        }
        this.ignoredErrors.add(new F(str));
    }

    public void addIgnoredExceptionForType(Class<? extends Throwable> cls) {
        this.ignoredExceptionsForType.add(cls);
    }

    public void addIgnoredSpanOrigin(String str) {
        if (this.ignoredSpanOrigins == null) {
            this.ignoredSpanOrigins = new ArrayList();
        }
        this.ignoredSpanOrigins.add(new F(str));
    }

    public void addIgnoredTransaction(String str) {
        if (this.ignoredTransactions == null) {
            this.ignoredTransactions = new ArrayList();
        }
        this.ignoredTransactions.add(new F(str));
    }

    public void addInAppExclude(String str) {
        this.inAppExcludes.add(str);
    }

    public void addInAppInclude(String str) {
        this.inAppIncludes.add(str);
    }

    public void addIntegration(InterfaceC2516k0 interfaceC2516k0) {
        this.integrations.add(interfaceC2516k0);
    }

    public void addOptionsObserver(Q q8) {
        this.optionsObservers.add(q8);
    }

    public void addPerformanceCollector(S s8) {
        this.performanceCollectors.add(s8);
    }

    public void addScopeObserver(W w8) {
        this.observers.add(w8);
    }

    public boolean containsIgnoredExceptionForType(Throwable th) {
        return this.ignoredExceptionsForType.contains(th.getClass());
    }

    public final io.sentry.protocol.o createSdkVersion() {
        io.sentry.protocol.o oVar = new io.sentry.protocol.o("sentry.java", "8.3.0");
        oVar.j("8.3.0");
        return oVar;
    }

    public final void e() {
        C2588x2.c().b("maven:io.sentry:sentry", "8.3.0");
    }

    public io.sentry.backpressure.b getBackpressureMonitor() {
        return this.backpressureMonitor;
    }

    public a getBeforeBreadcrumb() {
        return null;
    }

    public b getBeforeEnvelopeCallback() {
        return this.beforeEnvelopeCallback;
    }

    public c getBeforeSend() {
        return this.beforeSend;
    }

    public d getBeforeSendReplay() {
        return null;
    }

    public e getBeforeSendTransaction() {
        return null;
    }

    public Set<String> getBundleIds() {
        return this.bundleIds;
    }

    public String getCacheDirPath() {
        String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.dsnHash != null ? new File(this.cacheDirPath, this.dsnHash).getAbsolutePath() : this.cacheDirPath;
    }

    public String getCacheDirPathWithoutDsn() {
        String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.cacheDirPath;
    }

    public io.sentry.clientreport.h getClientReportRecorder() {
        return this.clientReportRecorder;
    }

    public M getConnectionStatusProvider() {
        return this.connectionStatusProvider;
    }

    public int getConnectionTimeoutMillis() {
        return this.connectionTimeoutMillis;
    }

    public List<String> getContextTags() {
        return this.contextTags;
    }

    public f getCron() {
        return this.cron;
    }

    public V1 getDateProvider() {
        return (V1) this.dateProvider.a();
    }

    public io.sentry.internal.debugmeta.a getDebugMetaLoader() {
        return this.debugMetaLoader;
    }

    public EnumC2556s1 getDefaultScopeType() {
        return this.defaultScopeType;
    }

    public EnumC2596z2 getDiagnosticLevel() {
        return this.diagnosticLevel;
    }

    public String getDist() {
        return this.dist;
    }

    public String getDistinctId() {
        return this.distinctId;
    }

    public String getDsn() {
        return this.dsn;
    }

    public io.sentry.cache.g getEnvelopeDiskCache() {
        return this.envelopeDiskCache;
    }

    public N getEnvelopeReader() {
        return (N) this.envelopeReader.a();
    }

    public String getEnvironment() {
        String str = this.environment;
        return str != null ? str : DEFAULT_ENVIRONMENT;
    }

    public List<C> getEventProcessors() {
        return this.eventProcessors;
    }

    public InterfaceC2447a0 getExecutorService() {
        return this.executorService;
    }

    public D getExperimental() {
        return this.experimental;
    }

    public long getFlushTimeoutMillis() {
        return this.flushTimeoutMillis;
    }

    public G getFullyDisplayedReporter() {
        return this.fullyDisplayedReporter;
    }

    public List<io.sentry.internal.gestures.a> getGestureTargetLocators() {
        return this.gestureTargetLocators;
    }

    public Long getIdleTimeout() {
        return this.idleTimeout;
    }

    public List<F> getIgnoredCheckIns() {
        return this.ignoredCheckIns;
    }

    public List<F> getIgnoredErrors() {
        return this.ignoredErrors;
    }

    public Set<Class<? extends Throwable>> getIgnoredExceptionsForType() {
        return this.ignoredExceptionsForType;
    }

    public List<F> getIgnoredSpanOrigins() {
        return this.ignoredSpanOrigins;
    }

    public List<F> getIgnoredTransactions() {
        return this.ignoredTransactions;
    }

    public List<String> getInAppExcludes() {
        return this.inAppExcludes;
    }

    public List<String> getInAppIncludes() {
        return this.inAppIncludes;
    }

    public EnumC2508i0 getInitPriority() {
        return this.initPriority;
    }

    public EnumC2512j0 getInstrumenter() {
        return this.instrumenter;
    }

    public List<InterfaceC2516k0> getIntegrations() {
        return this.integrations;
    }

    public q3 getInternalTracesSampler() {
        if (this.internalTracesSampler == null) {
            InterfaceC2480b0 interfaceC2480b0A = this.lock.a();
            try {
                if (this.internalTracesSampler == null) {
                    this.internalTracesSampler = new q3(this);
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
        return this.internalTracesSampler;
    }

    public ILogger getLogger() {
        return this.logger;
    }

    public long getMaxAttachmentSize() {
        return this.maxAttachmentSize;
    }

    public int getMaxBreadcrumbs() {
        return this.maxBreadcrumbs;
    }

    public int getMaxCacheItems() {
        return this.maxCacheItems;
    }

    public int getMaxDepth() {
        return this.maxDepth;
    }

    public int getMaxQueueSize() {
        return this.maxQueueSize;
    }

    public i getMaxRequestBodySize() {
        return this.maxRequestBodySize;
    }

    public int getMaxSpans() {
        return this.maxSpans;
    }

    public long getMaxTraceFileSize() {
        return this.maxTraceFileSize;
    }

    public io.sentry.internal.modules.b getModulesLoader() {
        return this.modulesLoader;
    }

    public E2 getOpenTelemetryMode() {
        return this.openTelemetryMode;
    }

    public List<Q> getOptionsObservers() {
        return this.optionsObservers;
    }

    public String getOutboxPath() {
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "outbox").getAbsolutePath();
    }

    public List<S> getPerformanceCollectors() {
        return this.performanceCollectors;
    }

    public Double getProfilesSampleRate() {
        return this.profilesSampleRate;
    }

    public g getProfilesSampler() {
        return null;
    }

    public String getProfilingTracesDirPath() {
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "profiling_traces").getAbsolutePath();
    }

    public int getProfilingTracesHz() {
        return this.profilingTracesHz;
    }

    public String getProguardUuid() {
        return this.proguardUuid;
    }

    public h getProxy() {
        return this.proxy;
    }

    public int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    public String getRelease() {
        return this.release;
    }

    public InterfaceC2513j1 getReplayController() {
        return this.replayController;
    }

    public Double getSampleRate() {
        return this.sampleRate;
    }

    public List<W> getScopeObservers() {
        return this.observers;
    }

    public io.sentry.protocol.o getSdkVersion() {
        return this.sdkVersion;
    }

    public String getSentryClientName() {
        return this.sentryClientName;
    }

    public InterfaceC2484c0 getSerializer() {
        return (InterfaceC2484c0) this.serializer.a();
    }

    public String getServerName() {
        return this.serverName;
    }

    public long getSessionFlushTimeoutMillis() {
        return this.sessionFlushTimeoutMillis;
    }

    public L2 getSessionReplay() {
        return this.sessionReplay;
    }

    public long getSessionTrackingIntervalMillis() {
        return this.sessionTrackingIntervalMillis;
    }

    public long getShutdownTimeoutMillis() {
        return this.shutdownTimeoutMillis;
    }

    public InterfaceC2492e0 getSpanFactory() {
        return this.spanFactory;
    }

    public String getSpotlightConnectionUrl() {
        return this.spotlightConnectionUrl;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    public Map<String, String> getTags() {
        return this.tags;
    }

    public io.sentry.util.thread.a getThreadChecker() {
        return this.threadChecker;
    }

    public List<String> getTracePropagationTargets() {
        List<String> list = this.tracePropagationTargets;
        return list == null ? this.defaultTracePropagationTargets : list;
    }

    public Double getTracesSampleRate() {
        return this.tracesSampleRate;
    }

    public j getTracesSampler() {
        return null;
    }

    public v3 getTransactionPerformanceCollector() {
        return this.transactionPerformanceCollector;
    }

    public InterfaceC2500g0 getTransactionProfiler() {
        return this.transactionProfiler;
    }

    public InterfaceC2504h0 getTransportFactory() {
        return this.transportFactory;
    }

    public io.sentry.transport.r getTransportGate() {
        return this.transportGate;
    }

    public final List<Object> getViewHierarchyExporters() {
        return this.viewHierarchyExporters;
    }

    public boolean isAttachServerName() {
        return this.attachServerName;
    }

    public boolean isAttachStacktrace() {
        return this.attachStacktrace;
    }

    public boolean isAttachThreads() {
        return this.attachThreads;
    }

    public boolean isDebug() {
        return this.debug;
    }

    public boolean isEnableAppStartProfiling() {
        return isProfilingEnabled() && this.enableAppStartProfiling;
    }

    public boolean isEnableAutoSessionTracking() {
        return this.enableAutoSessionTracking;
    }

    public boolean isEnableBackpressureHandling() {
        return this.enableBackpressureHandling;
    }

    public boolean isEnableDeduplication() {
        return this.enableDeduplication;
    }

    public boolean isEnableExternalConfiguration() {
        return this.enableExternalConfiguration;
    }

    public boolean isEnablePrettySerializationOutput() {
        return this.enablePrettySerializationOutput;
    }

    public boolean isEnableScopePersistence() {
        return this.enableScopePersistence;
    }

    public boolean isEnableScreenTracking() {
        return this.enableScreenTracking;
    }

    public boolean isEnableShutdownHook() {
        return this.enableShutdownHook;
    }

    public boolean isEnableSpotlight() {
        return this.enableSpotlight;
    }

    public boolean isEnableTimeToFullDisplayTracing() {
        return this.enableTimeToFullDisplayTracing;
    }

    public boolean isEnableUncaughtExceptionHandler() {
        return this.enableUncaughtExceptionHandler;
    }

    public boolean isEnableUserInteractionBreadcrumbs() {
        return this.enableUserInteractionBreadcrumbs;
    }

    public boolean isEnableUserInteractionTracing() {
        return this.enableUserInteractionTracing;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public boolean isForceInit() {
        return this.forceInit;
    }

    public Boolean isGlobalHubMode() {
        return this.globalHubMode;
    }

    public boolean isPrintUncaughtStackTrace() {
        return this.printUncaughtStackTrace;
    }

    public boolean isProfilingEnabled() {
        if (getProfilesSampleRate() != null && getProfilesSampleRate().doubleValue() > 0.0d) {
            return true;
        }
        getProfilesSampler();
        return false;
    }

    public boolean isSendClientReports() {
        return this.sendClientReports;
    }

    public boolean isSendDefaultPii() {
        return this.sendDefaultPii;
    }

    public boolean isSendModules() {
        return this.sendModules;
    }

    public boolean isTraceOptionsRequests() {
        return this.traceOptionsRequests;
    }

    public boolean isTraceSampling() {
        return this.traceSampling;
    }

    public boolean isTracingEnabled() {
        if (getTracesSampleRate() != null) {
            return true;
        }
        getTracesSampler();
        return false;
    }

    public void loadLazyFields() {
        getSerializer();
        retrieveParsedDsn();
        getEnvelopeReader();
        getDateProvider();
    }

    public void merge(E e8) {
        if (e8.m() != null) {
            setDsn(e8.m());
        }
        if (e8.p() != null) {
            setEnvironment(e8.p());
        }
        if (e8.C() != null) {
            setRelease(e8.C());
        }
        if (e8.l() != null) {
            setDist(e8.l());
        }
        if (e8.E() != null) {
            setServerName(e8.E());
        }
        if (e8.B() != null) {
            setProxy(e8.B());
        }
        if (e8.o() != null) {
            setEnableUncaughtExceptionHandler(e8.o().booleanValue());
        }
        if (e8.y() != null) {
            setPrintUncaughtStackTrace(e8.y().booleanValue());
        }
        if (e8.I() != null) {
            setTracesSampleRate(e8.I());
        }
        if (e8.z() != null) {
            setProfilesSampleRate(e8.z());
        }
        if (e8.k() != null) {
            setDebug(e8.k().booleanValue());
        }
        if (e8.n() != null) {
            setEnableDeduplication(e8.n().booleanValue());
        }
        if (e8.D() != null) {
            setSendClientReports(e8.D().booleanValue());
        }
        if (e8.N() != null) {
            setForceInit(e8.N().booleanValue());
        }
        for (Map.Entry entry : new HashMap(e8.G()).entrySet()) {
            this.tags.put((String) entry.getKey(), (String) entry.getValue());
        }
        Iterator it = new ArrayList(e8.w()).iterator();
        while (it.hasNext()) {
            addInAppInclude((String) it.next());
        }
        Iterator it2 = new ArrayList(e8.v()).iterator();
        while (it2.hasNext()) {
            addInAppExclude((String) it2.next());
        }
        Iterator it3 = new HashSet(e8.t()).iterator();
        while (it3.hasNext()) {
            addIgnoredExceptionForType((Class) it3.next());
        }
        if (e8.H() != null) {
            setTracePropagationTargets(new ArrayList(e8.H()));
        }
        Iterator it4 = new ArrayList(e8.i()).iterator();
        while (it4.hasNext()) {
            addContextTag((String) it4.next());
        }
        if (e8.A() != null) {
            setProguardUuid(e8.A());
        }
        if (e8.q() != null) {
            setIdleTimeout(e8.q());
        }
        Iterator it5 = e8.h().iterator();
        while (it5.hasNext()) {
            addBundleId((String) it5.next());
        }
        if (e8.M() != null) {
            setEnabled(e8.M().booleanValue());
        }
        if (e8.K() != null) {
            setEnablePrettySerializationOutput(e8.K().booleanValue());
        }
        if (e8.Q() != null) {
            setSendModules(e8.Q().booleanValue());
        }
        if (e8.r() != null) {
            setIgnoredCheckIns(new ArrayList(e8.r()));
        }
        if (e8.u() != null) {
            setIgnoredTransactions(new ArrayList(e8.u()));
        }
        if (e8.s() != null) {
            setIgnoredErrors(new ArrayList(e8.s()));
        }
        if (e8.J() != null) {
            setEnableBackpressureHandling(e8.J().booleanValue());
        }
        if (e8.x() != null) {
            setMaxRequestBodySize(e8.x());
        }
        if (e8.P() != null) {
            setSendDefaultPii(e8.P().booleanValue());
        }
        if (e8.L() != null) {
            setEnableSpotlight(e8.L().booleanValue());
        }
        if (e8.F() != null) {
            setSpotlightConnectionUrl(e8.F());
        }
        if (e8.O() != null) {
            setGlobalHubMode(e8.O());
        }
        if (e8.j() != null) {
            if (getCron() == null) {
                setCron(e8.j());
                return;
            }
            if (e8.j().a() != null) {
                getCron().f(e8.j().a());
            }
            if (e8.j().c() != null) {
                getCron().h(e8.j().c());
            }
            if (e8.j().e() != null) {
                getCron().j(e8.j().e());
            }
            if (e8.j().b() != null) {
                getCron().g(e8.j().b());
            }
            if (e8.j().d() != null) {
                getCron().i(e8.j().d());
            }
        }
    }

    public C2577v retrieveParsedDsn() {
        return (C2577v) this.parsedDsn.a();
    }

    public void setAttachServerName(boolean z8) {
        this.attachServerName = z8;
    }

    public void setAttachStacktrace(boolean z8) {
        this.attachStacktrace = z8;
    }

    public void setAttachThreads(boolean z8) {
        this.attachThreads = z8;
    }

    public void setBackpressureMonitor(io.sentry.backpressure.b bVar) {
        this.backpressureMonitor = bVar;
    }

    public void setBeforeBreadcrumb(a aVar) {
    }

    public void setBeforeEnvelopeCallback(b bVar) {
        this.beforeEnvelopeCallback = bVar;
    }

    public void setBeforeSend(c cVar) {
        this.beforeSend = cVar;
    }

    public void setBeforeSendReplay(d dVar) {
    }

    public void setBeforeSendTransaction(e eVar) {
    }

    public void setCacheDirPath(String str) {
        this.cacheDirPath = str;
    }

    public void setConnectionStatusProvider(M m8) {
        this.connectionStatusProvider = m8;
    }

    public void setConnectionTimeoutMillis(int i8) {
        this.connectionTimeoutMillis = i8;
    }

    public void setCron(f fVar) {
        this.cron = fVar;
    }

    public void setDateProvider(V1 v8) {
        this.dateProvider.c(v8);
    }

    public void setDebug(boolean z8) {
        this.debug = z8;
    }

    public void setDebugMetaLoader(io.sentry.internal.debugmeta.a aVar) {
        if (aVar == null) {
            aVar = io.sentry.internal.debugmeta.b.b();
        }
        this.debugMetaLoader = aVar;
    }

    public void setDefaultScopeType(EnumC2556s1 enumC2556s1) {
        this.defaultScopeType = enumC2556s1;
    }

    public void setDiagnosticLevel(EnumC2596z2 enumC2596z2) {
        if (enumC2596z2 == null) {
            enumC2596z2 = DEFAULT_DIAGNOSTIC_LEVEL;
        }
        this.diagnosticLevel = enumC2596z2;
    }

    public void setDist(String str) {
        this.dist = str;
    }

    public void setDistinctId(String str) {
        this.distinctId = str;
    }

    public void setDsn(String str) {
        this.dsn = str;
        this.parsedDsn.b();
        this.dsnHash = io.sentry.util.B.a(this.dsn, this.logger);
    }

    public void setEnableAppStartProfiling(boolean z8) {
        this.enableAppStartProfiling = z8;
    }

    public void setEnableAutoSessionTracking(boolean z8) {
        this.enableAutoSessionTracking = z8;
    }

    public void setEnableBackpressureHandling(boolean z8) {
        this.enableBackpressureHandling = z8;
    }

    public void setEnableDeduplication(boolean z8) {
        this.enableDeduplication = z8;
    }

    public void setEnableExternalConfiguration(boolean z8) {
        this.enableExternalConfiguration = z8;
    }

    public void setEnablePrettySerializationOutput(boolean z8) {
        this.enablePrettySerializationOutput = z8;
    }

    public void setEnableScopePersistence(boolean z8) {
        this.enableScopePersistence = z8;
    }

    public void setEnableScreenTracking(boolean z8) {
        this.enableScreenTracking = z8;
    }

    public void setEnableShutdownHook(boolean z8) {
        this.enableShutdownHook = z8;
    }

    public void setEnableSpotlight(boolean z8) {
        this.enableSpotlight = z8;
    }

    public void setEnableTimeToFullDisplayTracing(boolean z8) {
        this.enableTimeToFullDisplayTracing = z8;
    }

    public void setEnableUncaughtExceptionHandler(boolean z8) {
        this.enableUncaughtExceptionHandler = z8;
    }

    public void setEnableUserInteractionBreadcrumbs(boolean z8) {
        this.enableUserInteractionBreadcrumbs = z8;
    }

    public void setEnableUserInteractionTracing(boolean z8) {
        this.enableUserInteractionTracing = z8;
    }

    public void setEnabled(boolean z8) {
        this.enabled = z8;
    }

    public void setEnvelopeDiskCache(io.sentry.cache.g gVar) {
        if (gVar == null) {
            gVar = io.sentry.transport.s.c();
        }
        this.envelopeDiskCache = gVar;
    }

    public void setEnvelopeReader(N n8) {
        io.sentry.util.q qVar = this.envelopeReader;
        if (n8 == null) {
            n8 = C0.b();
        }
        qVar.c(n8);
    }

    public void setEnvironment(String str) {
        this.environment = str;
    }

    public void setExecutorService(InterfaceC2447a0 interfaceC2447a0) {
        if (interfaceC2447a0 != null) {
            this.executorService = interfaceC2447a0;
        }
    }

    public void setFlushTimeoutMillis(long j8) {
        this.flushTimeoutMillis = j8;
    }

    public void setForceInit(boolean z8) {
        this.forceInit = z8;
    }

    public void setFullyDisplayedReporter(G g8) {
        this.fullyDisplayedReporter = g8;
    }

    public void setGestureTargetLocators(List<io.sentry.internal.gestures.a> list) {
        this.gestureTargetLocators.clear();
        this.gestureTargetLocators.addAll(list);
    }

    public void setGlobalHubMode(Boolean bool) {
        this.globalHubMode = bool;
    }

    public void setIdleTimeout(Long l8) {
        this.idleTimeout = l8;
    }

    public void setIgnoredCheckIns(List<String> list) {
        if (list == null) {
            this.ignoredCheckIns = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(new F(str));
            }
        }
        this.ignoredCheckIns = arrayList;
    }

    public void setIgnoredErrors(List<String> list) {
        if (list == null) {
            this.ignoredErrors = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new F(str));
            }
        }
        this.ignoredErrors = arrayList;
    }

    public void setIgnoredSpanOrigins(List<String> list) {
        if (list == null) {
            this.ignoredSpanOrigins = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new F(str));
            }
        }
        this.ignoredSpanOrigins = arrayList;
    }

    public void setIgnoredTransactions(List<String> list) {
        if (list == null) {
            this.ignoredTransactions = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new F(str));
            }
        }
        this.ignoredTransactions = arrayList;
    }

    public void setInitPriority(EnumC2508i0 enumC2508i0) {
        this.initPriority = enumC2508i0;
    }

    @Deprecated
    public void setInstrumenter(EnumC2512j0 enumC2512j0) {
        this.instrumenter = enumC2512j0;
    }

    public void setLogger(ILogger iLogger) {
        this.logger = iLogger == null ? E0.e() : new r(this, iLogger);
    }

    public void setMaxAttachmentSize(long j8) {
        this.maxAttachmentSize = j8;
    }

    public void setMaxBreadcrumbs(int i8) {
        this.maxBreadcrumbs = i8;
    }

    public void setMaxCacheItems(int i8) {
        this.maxCacheItems = i8;
    }

    public void setMaxDepth(int i8) {
        this.maxDepth = i8;
    }

    public void setMaxQueueSize(int i8) {
        if (i8 > 0) {
            this.maxQueueSize = i8;
        }
    }

    public void setMaxRequestBodySize(i iVar) {
        this.maxRequestBodySize = iVar;
    }

    public void setMaxSpans(int i8) {
        this.maxSpans = i8;
    }

    public void setMaxTraceFileSize(long j8) {
        this.maxTraceFileSize = j8;
    }

    public void setModulesLoader(io.sentry.internal.modules.b bVar) {
        if (bVar == null) {
            bVar = io.sentry.internal.modules.e.b();
        }
        this.modulesLoader = bVar;
    }

    public void setOpenTelemetryMode(E2 e8) {
        this.openTelemetryMode = e8;
    }

    public void setPrintUncaughtStackTrace(boolean z8) {
        this.printUncaughtStackTrace = z8;
    }

    public void setProfilesSampleRate(Double d8) {
        if (io.sentry.util.y.c(d8)) {
            this.profilesSampleRate = d8;
            return;
        }
        throw new IllegalArgumentException("The value " + d8 + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setProfilesSampler(g gVar) {
    }

    public void setProfilingTracesHz(int i8) {
        this.profilingTracesHz = i8;
    }

    public void setProguardUuid(String str) {
        this.proguardUuid = str;
    }

    public void setProxy(h hVar) {
        this.proxy = hVar;
    }

    public void setReadTimeoutMillis(int i8) {
        this.readTimeoutMillis = i8;
    }

    public void setRelease(String str) {
        this.release = str;
    }

    public void setReplayController(InterfaceC2513j1 interfaceC2513j1) {
        if (interfaceC2513j1 == null) {
            interfaceC2513j1 = G0.a();
        }
        this.replayController = interfaceC2513j1;
    }

    public void setSampleRate(Double d8) {
        if (io.sentry.util.y.e(d8)) {
            this.sampleRate = d8;
            return;
        }
        throw new IllegalArgumentException("The value " + d8 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    public void setSdkVersion(io.sentry.protocol.o oVar) {
        io.sentry.protocol.o oVarI = getSessionReplay().i();
        io.sentry.protocol.o oVar2 = this.sdkVersion;
        if (oVar2 != null && oVarI != null && oVar2.equals(oVarI)) {
            getSessionReplay().u(oVar);
        }
        this.sdkVersion = oVar;
    }

    public void setSendClientReports(boolean z8) {
        this.sendClientReports = z8;
        if (z8) {
            this.clientReportRecorder = new io.sentry.clientreport.e(this);
        } else {
            this.clientReportRecorder = new io.sentry.clientreport.j();
        }
    }

    public void setSendDefaultPii(boolean z8) {
        this.sendDefaultPii = z8;
    }

    public void setSendModules(boolean z8) {
        this.sendModules = z8;
    }

    public void setSentryClientName(String str) {
        this.sentryClientName = str;
    }

    public void setSerializer(InterfaceC2484c0 interfaceC2484c0) {
        io.sentry.util.q qVar = this.serializer;
        if (interfaceC2484c0 == null) {
            interfaceC2484c0 = P0.g();
        }
        qVar.c(interfaceC2484c0);
    }

    public void setServerName(String str) {
        this.serverName = str;
    }

    public void setSessionFlushTimeoutMillis(long j8) {
        this.sessionFlushTimeoutMillis = j8;
    }

    public void setSessionReplay(L2 l8) {
        this.sessionReplay = l8;
    }

    public void setSessionTrackingIntervalMillis(long j8) {
        this.sessionTrackingIntervalMillis = j8;
    }

    public void setShutdownTimeoutMillis(long j8) {
        this.shutdownTimeoutMillis = j8;
    }

    public void setSpanFactory(InterfaceC2492e0 interfaceC2492e0) {
        this.spanFactory = interfaceC2492e0;
    }

    public void setSpotlightConnectionUrl(String str) {
        this.spotlightConnectionUrl = str;
    }

    public void setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.sslSocketFactory = sSLSocketFactory;
    }

    public void setTag(String str, String str2) {
        this.tags.put(str, str2);
    }

    public void setThreadChecker(io.sentry.util.thread.a aVar) {
        this.threadChecker = aVar;
    }

    public void setTraceOptionsRequests(boolean z8) {
        this.traceOptionsRequests = z8;
    }

    public void setTracePropagationTargets(List<String> list) {
        if (list == null) {
            this.tracePropagationTargets = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(str);
            }
        }
        this.tracePropagationTargets = arrayList;
    }

    @Deprecated
    public void setTraceSampling(boolean z8) {
        this.traceSampling = z8;
    }

    public void setTracesSampler(j jVar) {
    }

    public void setTransactionPerformanceCollector(v3 v3Var) {
        this.transactionPerformanceCollector = v3Var;
    }

    public void setTransactionProfiler(InterfaceC2500g0 interfaceC2500g0) {
        if (this.transactionProfiler != U0.c() || interfaceC2500g0 == null) {
            return;
        }
        this.transactionProfiler = interfaceC2500g0;
    }

    public void setTransportFactory(InterfaceC2504h0 interfaceC2504h0) {
        if (interfaceC2504h0 == null) {
            interfaceC2504h0 = V0.b();
        }
        this.transportFactory = interfaceC2504h0;
    }

    public void setTransportGate(io.sentry.transport.r rVar) {
        if (rVar == null) {
            rVar = io.sentry.transport.u.b();
        }
        this.transportGate = rVar;
    }

    public void setViewHierarchyExporters(List<Object> list) {
        this.viewHierarchyExporters.clear();
        this.viewHierarchyExporters.addAll(list);
    }

    public J2(boolean z8) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.eventProcessors = copyOnWriteArrayList;
        this.ignoredExceptionsForType = new CopyOnWriteArraySet();
        this.ignoredErrors = null;
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        this.integrations = copyOnWriteArrayList2;
        this.bundleIds = new CopyOnWriteArraySet();
        this.parsedDsn = new io.sentry.util.q(new io.sentry.util.q.a() { // from class: io.sentry.F2
            @Override // io.sentry.util.q.a
            public final Object a() {
                return J2.b(this.f25870a);
            }
        });
        this.shutdownTimeoutMillis = 2000L;
        this.flushTimeoutMillis = 15000L;
        this.sessionFlushTimeoutMillis = 15000L;
        this.logger = E0.e();
        this.diagnosticLevel = DEFAULT_DIAGNOSTIC_LEVEL;
        this.serializer = new io.sentry.util.q(new io.sentry.util.q.a() { // from class: io.sentry.G2
            @Override // io.sentry.util.q.a
            public final Object a() {
                return J2.d(this.f25875a);
            }
        });
        this.envelopeReader = new io.sentry.util.q(new io.sentry.util.q.a() { // from class: io.sentry.H2
            @Override // io.sentry.util.q.a
            public final Object a() {
                return J2.c(this.f25887a);
            }
        });
        this.maxDepth = 100;
        this.maxCacheItems = 30;
        this.maxQueueSize = 30;
        this.maxBreadcrumbs = 100;
        this.inAppExcludes = new CopyOnWriteArrayList();
        this.inAppIncludes = new CopyOnWriteArrayList();
        this.transportFactory = V0.b();
        this.transportGate = io.sentry.transport.u.b();
        this.attachStacktrace = true;
        this.enableAutoSessionTracking = true;
        this.sessionTrackingIntervalMillis = 30000L;
        this.attachServerName = true;
        this.enableUncaughtExceptionHandler = true;
        this.printUncaughtStackTrace = false;
        this.executorService = O0.e();
        this.connectionTimeoutMillis = 5000;
        this.readTimeoutMillis = 5000;
        this.envelopeDiskCache = io.sentry.transport.s.c();
        this.sendDefaultPii = false;
        this.observers = new CopyOnWriteArrayList();
        this.optionsObservers = new CopyOnWriteArrayList();
        this.tags = new ConcurrentHashMap();
        this.maxAttachmentSize = 20971520L;
        this.enableDeduplication = true;
        this.maxSpans = 1000;
        this.enableShutdownHook = true;
        this.maxRequestBodySize = i.NONE;
        this.traceSampling = true;
        this.maxTraceFileSize = 5242880L;
        this.transactionProfiler = U0.c();
        this.tracePropagationTargets = null;
        this.defaultTracePropagationTargets = Collections.singletonList(DEFAULT_PROPAGATION_TARGETS);
        this.idleTimeout = 3000L;
        this.contextTags = new CopyOnWriteArrayList();
        this.sendClientReports = true;
        this.clientReportRecorder = new io.sentry.clientreport.e(this);
        this.modulesLoader = io.sentry.internal.modules.e.b();
        this.debugMetaLoader = io.sentry.internal.debugmeta.b.b();
        this.enableUserInteractionTracing = false;
        this.enableUserInteractionBreadcrumbs = true;
        this.instrumenter = EnumC2512j0.SENTRY;
        this.gestureTargetLocators = new ArrayList();
        this.viewHierarchyExporters = new ArrayList();
        this.threadChecker = io.sentry.util.thread.b.c();
        this.traceOptionsRequests = true;
        this.dateProvider = new io.sentry.util.q(new io.sentry.util.q.a() { // from class: io.sentry.I2
            @Override // io.sentry.util.q.a
            public final Object a() {
                return J2.a();
            }
        });
        this.performanceCollectors = new ArrayList();
        this.transactionPerformanceCollector = T0.e();
        this.enableTimeToFullDisplayTracing = false;
        this.fullyDisplayedReporter = G.a();
        this.connectionStatusProvider = new B0();
        this.enabled = true;
        this.enablePrettySerializationOutput = true;
        this.sendModules = true;
        this.enableSpotlight = false;
        this.enableScopePersistence = true;
        this.ignoredCheckIns = null;
        this.ignoredSpanOrigins = null;
        this.ignoredTransactions = null;
        this.backpressureMonitor = io.sentry.backpressure.c.b();
        this.enableBackpressureHandling = true;
        this.enableAppStartProfiling = false;
        this.spanFactory = R0.b();
        this.profilingTracesHz = 101;
        this.cron = null;
        this.replayController = G0.a();
        this.enableScreenTracking = true;
        this.defaultScopeType = EnumC2556s1.ISOLATION;
        this.initPriority = EnumC2508i0.MEDIUM;
        this.forceInit = false;
        this.globalHubMode = null;
        this.lock = new C2569a();
        this.openTelemetryMode = E2.AUTO;
        io.sentry.protocol.o oVarCreateSdkVersion = createSdkVersion();
        this.experimental = new D(z8, oVarCreateSdkVersion);
        this.sessionReplay = new L2(z8, oVarCreateSdkVersion);
        if (z8) {
            return;
        }
        setSpanFactory(e3.a(new io.sentry.util.r(), E0.e()));
        this.executorService = new C2568u2();
        copyOnWriteArrayList2.add(new UncaughtExceptionHandlerIntegration());
        copyOnWriteArrayList2.add(new ShutdownHookIntegration());
        copyOnWriteArrayList2.add(new SpotlightIntegration());
        copyOnWriteArrayList.add(new C2590y0(this));
        copyOnWriteArrayList.add(new C2581w(this));
        if (io.sentry.util.w.c()) {
            copyOnWriteArrayList.add(new M2());
        }
        setSentryClientName("sentry.java/8.3.0");
        setSdkVersion(oVarCreateSdkVersion);
        e();
    }

    public void setTracesSampleRate(Double d8) {
        if (io.sentry.util.y.f(d8)) {
            this.tracesSampleRate = d8;
            return;
        }
        throw new IllegalArgumentException(WqXA.khKUfZ + d8 + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }
}
