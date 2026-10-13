package io.sentry;

import io.sentry.util.AbstractC2571c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class d3 implements InterfaceC2582w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.sentry.protocol.u f27078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i3 f27079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i3 f27080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient r3 f27081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f27082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f27083f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public k3 f27084g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Map f27085h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f27086i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Map f27087j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Map f27088k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public EnumC2512j0 f27089l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C2487d f27090m;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2524m0 {
        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d3 a(W0 w8, ILogger iLogger) {
            w8.x();
            String strG = null;
            io.sentry.protocol.u uVarA = null;
            i3 i3VarB = null;
            i3 i3Var = null;
            ConcurrentHashMap concurrentHashMap = null;
            String strG2 = null;
            k3 k3Var = null;
            String strG3 = null;
            Map mapB = null;
            Map map = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                switch (strF0) {
                    case "span_id":
                        i3VarB = new i3.a().a(w8, iLogger);
                        break;
                    case "parent_span_id":
                        i3Var = (i3) w8.m1(iLogger, new i3.a());
                        break;
                    case "description":
                        strG2 = w8.G();
                        break;
                    case "origin":
                        strG3 = w8.G();
                        break;
                    case "status":
                        k3Var = (k3) w8.m1(iLogger, new k3.a());
                        break;
                    case "op":
                        strG = w8.G();
                        break;
                    case "data":
                        map = (Map) w8.y1();
                        break;
                    case "tags":
                        mapB = AbstractC2571c.b((Map) w8.y1());
                        break;
                    case "trace_id":
                        uVarA = new io.sentry.protocol.u.a().a(w8, iLogger);
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        w8.t0(iLogger, concurrentHashMap, strF0);
                        break;
                }
            }
            if (uVarA == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"trace_id\"");
                iLogger.b(EnumC2596z2.ERROR, "Missing required field \"trace_id\"", illegalStateException);
                throw illegalStateException;
            }
            if (i3VarB == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"span_id\"");
                iLogger.b(EnumC2596z2.ERROR, "Missing required field \"span_id\"", illegalStateException2);
                throw illegalStateException2;
            }
            if (strG == null) {
                strG = "";
            }
            d3 d3Var = new d3(uVarA, i3VarB, strG, i3Var, null);
            d3Var.p(strG2);
            d3Var.t(k3Var);
            d3Var.r(strG3);
            if (mapB != null) {
                d3Var.f27085h = mapB;
            }
            if (map != null) {
                d3Var.f27087j = map;
            }
            d3Var.u(concurrentHashMap);
            w8.u();
            return d3Var;
        }
    }

    public d3(String str, r3 r3Var) {
        this(new io.sentry.protocol.u(), new i3(), str, null, r3Var);
    }

    public d3 a(String str, i3 i3Var, i3 i3Var2) {
        io.sentry.protocol.u uVar = this.f27078a;
        if (i3Var2 == null) {
            i3Var2 = new i3();
        }
        return new d3(uVar, i3Var2, i3Var, str, null, this.f27081d, null, "manual");
    }

    public C2487d b() {
        return this.f27090m;
    }

    public String c() {
        return this.f27083f;
    }

    public EnumC2512j0 d() {
        return this.f27089l;
    }

    public String e() {
        return this.f27082e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3)) {
            return false;
        }
        d3 d3Var = (d3) obj;
        return this.f27078a.equals(d3Var.f27078a) && this.f27079b.equals(d3Var.f27079b) && io.sentry.util.u.a(this.f27080c, d3Var.f27080c) && this.f27082e.equals(d3Var.f27082e) && io.sentry.util.u.a(this.f27083f, d3Var.f27083f) && l() == d3Var.l();
    }

    public String f() {
        return this.f27086i;
    }

    public i3 g() {
        return this.f27080c;
    }

    public Boolean h() {
        r3 r3Var = this.f27081d;
        if (r3Var == null) {
            return null;
        }
        return r3Var.b();
    }

    public int hashCode() {
        return io.sentry.util.u.b(this.f27078a, this.f27079b, this.f27080c, this.f27082e, this.f27083f, l());
    }

    public Boolean i() {
        r3 r3Var = this.f27081d;
        if (r3Var == null) {
            return null;
        }
        return r3Var.e();
    }

    public r3 j() {
        return this.f27081d;
    }

    public i3 k() {
        return this.f27079b;
    }

    public k3 l() {
        return this.f27084g;
    }

    public Map m() {
        return this.f27085h;
    }

    public io.sentry.protocol.u n() {
        return this.f27078a;
    }

    public void o(String str, Object obj) {
        this.f27087j.put(str, obj);
    }

    public void p(String str) {
        this.f27083f = str;
    }

    public void q(EnumC2512j0 enumC2512j0) {
        this.f27089l = enumC2512j0;
    }

    public void r(String str) {
        this.f27086i = str;
    }

    public void s(r3 r3Var) {
        this.f27081d = r3Var;
        C2487d c2487d = this.f27090m;
        if (c2487d != null) {
            c2487d.K(r3Var);
        }
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.x();
        x8.k("trace_id");
        this.f27078a.serialize(x8, iLogger);
        x8.k("span_id");
        this.f27079b.serialize(x8, iLogger);
        if (this.f27080c != null) {
            x8.k("parent_span_id");
            this.f27080c.serialize(x8, iLogger);
        }
        x8.k("op").c(this.f27082e);
        if (this.f27083f != null) {
            x8.k(com.amazon.a.a.o.b.f16728c).c(this.f27083f);
        }
        if (l() != null) {
            x8.k("status").g(iLogger, l());
        }
        if (this.f27086i != null) {
            x8.k("origin").g(iLogger, this.f27086i);
        }
        if (!this.f27085h.isEmpty()) {
            x8.k("tags").g(iLogger, this.f27085h);
        }
        if (!this.f27087j.isEmpty()) {
            x8.k("data").g(iLogger, this.f27087j);
        }
        Map map = this.f27088k;
        if (map != null) {
            for (String str : map.keySet()) {
                x8.k(str).g(iLogger, this.f27088k.get(str));
            }
        }
        x8.u();
    }

    public void t(k3 k3Var) {
        this.f27084g = k3Var;
    }

    public void u(Map map) {
        this.f27088k = map;
    }

    public d3(String str) {
        this(new io.sentry.protocol.u(), new i3(), str, null, null);
    }

    public d3(io.sentry.protocol.u uVar, i3 i3Var, String str, i3 i3Var2, r3 r3Var) {
        this(uVar, i3Var, i3Var2, str, null, r3Var, null, "manual");
    }

    public d3(io.sentry.protocol.u uVar, i3 i3Var, i3 i3Var2, String str, String str2, r3 r3Var, k3 k3Var, String str3) {
        this.f27085h = new ConcurrentHashMap();
        this.f27086i = "manual";
        this.f27087j = new ConcurrentHashMap();
        this.f27089l = EnumC2512j0.SENTRY;
        this.f27078a = (io.sentry.protocol.u) io.sentry.util.u.c(uVar, "traceId is required");
        this.f27079b = (i3) io.sentry.util.u.c(i3Var, "spanId is required");
        this.f27082e = (String) io.sentry.util.u.c(str, "operation is required");
        this.f27080c = i3Var2;
        this.f27083f = str2;
        this.f27084g = k3Var;
        this.f27086i = str3;
        s(r3Var);
    }

    public d3(d3 d3Var) {
        this.f27085h = new ConcurrentHashMap();
        this.f27086i = "manual";
        this.f27087j = new ConcurrentHashMap();
        this.f27089l = EnumC2512j0.SENTRY;
        this.f27078a = d3Var.f27078a;
        this.f27079b = d3Var.f27079b;
        this.f27080c = d3Var.f27080c;
        s(d3Var.f27081d);
        this.f27082e = d3Var.f27082e;
        this.f27083f = d3Var.f27083f;
        this.f27084g = d3Var.f27084g;
        Map mapB = AbstractC2571c.b(d3Var.f27085h);
        if (mapB != null) {
            this.f27085h = mapB;
        }
    }
}
