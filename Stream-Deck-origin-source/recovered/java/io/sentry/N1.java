package io.sentry;

import H.FL.dCqzKmEghGTQ;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class N1 implements InterfaceC2582w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f25952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Double f25953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Double f25955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f25956e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f25957f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f25958g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Map f25959h;

    public N1() {
        this.f25954c = false;
        this.f25955d = null;
        this.f25952a = false;
        this.f25953b = null;
        this.f25956e = null;
        this.f25957f = false;
        this.f25958g = 0;
    }

    public Double a() {
        return this.f25953b;
    }

    public String b() {
        return this.f25956e;
    }

    public int c() {
        return this.f25958g;
    }

    public Double d() {
        return this.f25955d;
    }

    public boolean e() {
        return this.f25952a;
    }

    public boolean f() {
        return this.f25957f;
    }

    public boolean g() {
        return this.f25954c;
    }

    public void h(Map map) {
        this.f25959h = map;
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.x();
        x8.k("profile_sampled").g(iLogger, Boolean.valueOf(this.f25952a));
        x8.k("profile_sample_rate").g(iLogger, this.f25953b);
        x8.k("trace_sampled").g(iLogger, Boolean.valueOf(this.f25954c));
        x8.k("trace_sample_rate").g(iLogger, this.f25955d);
        x8.k("profiling_traces_dir_path").g(iLogger, this.f25956e);
        x8.k("is_profiling_enabled").g(iLogger, Boolean.valueOf(this.f25957f));
        x8.k("profiling_traces_hz").g(iLogger, Integer.valueOf(this.f25958g));
        Map map = this.f25959h;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f25959h.get(str);
                x8.k(str);
                x8.g(iLogger, obj);
            }
        }
        x8.u();
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2524m0 {
        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public N1 a(W0 w8, ILogger iLogger) {
            w8.x();
            N1 n8 = new N1();
            ConcurrentHashMap concurrentHashMap = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                byte b8 = -1;
                switch (strF0.hashCode()) {
                    case -566246656:
                        if (strF0.equals("trace_sampled")) {
                            b8 = 0;
                        }
                        break;
                    case -450071601:
                        if (strF0.equals("profiling_traces_dir_path")) {
                            b8 = 1;
                        }
                        break;
                    case -116896685:
                        if (strF0.equals(dCqzKmEghGTQ.RdVrcmZOynR)) {
                            b8 = 2;
                        }
                        break;
                    case -69617820:
                        if (strF0.equals("profile_sampled")) {
                            b8 = 3;
                        }
                        break;
                    case 1583866442:
                        if (strF0.equals("profiling_traces_hz")) {
                            b8 = 4;
                        }
                        break;
                    case 1653938779:
                        if (strF0.equals("trace_sample_rate")) {
                            b8 = 5;
                        }
                        break;
                    case 2140552383:
                        if (strF0.equals("profile_sample_rate")) {
                            b8 = 6;
                        }
                        break;
                }
                switch (b8) {
                    case 0:
                        Boolean boolZ0 = w8.Z0();
                        if (boolZ0 != null) {
                            n8.f25954c = boolZ0.booleanValue();
                        }
                        break;
                    case 1:
                        String strK0 = w8.k0();
                        if (strK0 != null) {
                            n8.f25956e = strK0;
                        }
                        break;
                    case 2:
                        Boolean boolZ1 = w8.Z0();
                        if (boolZ1 != null) {
                            n8.f25957f = boolZ1.booleanValue();
                        }
                        break;
                    case 3:
                        Boolean boolZ2 = w8.Z0();
                        if (boolZ2 != null) {
                            n8.f25952a = boolZ2.booleanValue();
                        }
                        break;
                    case 4:
                        Integer numT = w8.T();
                        if (numT != null) {
                            n8.f25958g = numT.intValue();
                        }
                        break;
                    case 5:
                        Double dD0 = w8.D0();
                        if (dD0 != null) {
                            n8.f25955d = dD0;
                        }
                        break;
                    case 6:
                        Double dD1 = w8.D0();
                        if (dD1 != null) {
                            n8.f25953b = dD1;
                        }
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        w8.t0(iLogger, concurrentHashMap, strF0);
                        break;
                }
            }
            n8.h(concurrentHashMap);
            w8.u();
            return n8;
        }
    }

    public N1(J2 j8, r3 r3Var) {
        this.f25954c = r3Var.e().booleanValue();
        this.f25955d = r3Var.d();
        this.f25952a = r3Var.b().booleanValue();
        this.f25953b = r3Var.a();
        this.f25956e = j8.getProfilingTracesDirPath();
        this.f25957f = j8.isProfilingEnabled();
        this.f25958g = j8.getProfilingTracesHz();
    }
}
