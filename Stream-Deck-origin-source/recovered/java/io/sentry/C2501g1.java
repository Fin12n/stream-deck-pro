package io.sentry;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.g1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2501g1 implements InterfaceC2582w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f27151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f27152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f27153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f27154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f27155e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f27156f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Long f27157g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Map f27158h;

    /* JADX INFO: renamed from: io.sentry.g1$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2524m0 {
        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2501g1 a(W0 w8, ILogger iLogger) {
            w8.x();
            C2501g1 c2501g1 = new C2501g1();
            ConcurrentHashMap concurrentHashMap = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                switch (strF0) {
                    case "relative_start_ns":
                        Long lA0 = w8.a0();
                        if (lA0 == null) {
                            break;
                        } else {
                            c2501g1.f27154d = lA0;
                            break;
                        }
                        break;
                    case "relative_end_ns":
                        Long lA1 = w8.a0();
                        if (lA1 == null) {
                            break;
                        } else {
                            c2501g1.f27155e = lA1;
                            break;
                        }
                        break;
                    case "id":
                        String strK0 = w8.k0();
                        if (strK0 == null) {
                            break;
                        } else {
                            c2501g1.f27151a = strK0;
                            break;
                        }
                        break;
                    case "name":
                        String strK1 = w8.k0();
                        if (strK1 == null) {
                            break;
                        } else {
                            c2501g1.f27153c = strK1;
                            break;
                        }
                        break;
                    case "trace_id":
                        String strK2 = w8.k0();
                        if (strK2 == null) {
                            break;
                        } else {
                            c2501g1.f27152b = strK2;
                            break;
                        }
                        break;
                    case "relative_cpu_end_ms":
                        Long lA2 = w8.a0();
                        if (lA2 == null) {
                            break;
                        } else {
                            c2501g1.f27157g = lA2;
                            break;
                        }
                        break;
                    case "relative_cpu_start_ms":
                        Long lA3 = w8.a0();
                        if (lA3 == null) {
                            break;
                        } else {
                            c2501g1.f27156f = lA3;
                            break;
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
            c2501g1.l(concurrentHashMap);
            w8.u();
            return c2501g1;
        }
    }

    public C2501g1() {
        this(S0.v(), 0L, 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2501g1.class == obj.getClass()) {
            C2501g1 c2501g1 = (C2501g1) obj;
            if (this.f27151a.equals(c2501g1.f27151a) && this.f27152b.equals(c2501g1.f27152b) && this.f27153c.equals(c2501g1.f27153c) && this.f27154d.equals(c2501g1.f27154d) && this.f27156f.equals(c2501g1.f27156f) && io.sentry.util.u.a(this.f27157g, c2501g1.f27157g) && io.sentry.util.u.a(this.f27155e, c2501g1.f27155e) && io.sentry.util.u.a(this.f27158h, c2501g1.f27158h)) {
                return true;
            }
        }
        return false;
    }

    public String h() {
        return this.f27151a;
    }

    public int hashCode() {
        return io.sentry.util.u.b(this.f27151a, this.f27152b, this.f27153c, this.f27154d, this.f27155e, this.f27156f, this.f27157g, this.f27158h);
    }

    public String i() {
        return this.f27153c;
    }

    public String j() {
        return this.f27152b;
    }

    public void k(Long l8, Long l9, Long l10, Long l11) {
        if (this.f27155e == null) {
            this.f27155e = Long.valueOf(l8.longValue() - l9.longValue());
            this.f27154d = Long.valueOf(this.f27154d.longValue() - l9.longValue());
            this.f27157g = Long.valueOf(l10.longValue() - l11.longValue());
            this.f27156f = Long.valueOf(this.f27156f.longValue() - l11.longValue());
        }
    }

    public void l(Map map) {
        this.f27158h = map;
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.x();
        x8.k("id").g(iLogger, this.f27151a);
        x8.k("trace_id").g(iLogger, this.f27152b);
        x8.k("name").g(iLogger, this.f27153c);
        x8.k("relative_start_ns").g(iLogger, this.f27154d);
        x8.k("relative_end_ns").g(iLogger, this.f27155e);
        x8.k("relative_cpu_start_ms").g(iLogger, this.f27156f);
        x8.k("relative_cpu_end_ms").g(iLogger, this.f27157g);
        Map map = this.f27158h;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f27158h.get(str);
                x8.k(str);
                x8.g(iLogger, obj);
            }
        }
        x8.u();
    }

    public C2501g1(InterfaceC2496f0 interfaceC2496f0, Long l8, Long l9) {
        this.f27151a = interfaceC2496f0.n().toString();
        this.f27152b = interfaceC2496f0.p().n().toString();
        this.f27153c = interfaceC2496f0.getName().isEmpty() ? "unknown" : interfaceC2496f0.getName();
        this.f27154d = l8;
        this.f27156f = l9;
    }
}
