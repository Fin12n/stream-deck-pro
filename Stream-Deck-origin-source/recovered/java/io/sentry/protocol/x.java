package io.sentry.protocol;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.AbstractC2519l;
import io.sentry.EnumC2596z2;
import io.sentry.ILogger;
import io.sentry.InterfaceC2524m0;
import io.sentry.InterfaceC2582w0;
import io.sentry.W0;
import io.sentry.X0;
import io.sentry.c3;
import io.sentry.i3;
import io.sentry.k3;
import io.sentry.util.AbstractC2571c;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class x implements InterfaceC2582w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f27481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f27482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f27483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i3 f27484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i3 f27485e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f27486f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f27487g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k3 f27488h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f27489i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map f27490j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Map f27491k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map f27492l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Map f27493m;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2524m0 {
        private Exception c(String str, ILogger iLogger) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.b(EnumC2596z2.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public x a(W0 w8, ILogger iLogger) throws Exception {
            w8.x();
            ConcurrentHashMap concurrentHashMap = null;
            Double dValueOf = null;
            Map map = null;
            u uVarA = null;
            i3 i3VarA = null;
            Map map2 = null;
            String strK0 = null;
            Double dValueOf2 = null;
            i3 i3Var = null;
            String strK1 = null;
            k3 k3Var = null;
            String strK2 = null;
            Map map3 = null;
            while (true) {
                ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
                Double d8 = dValueOf;
                Map map4 = map;
                u uVar = uVarA;
                i3 i3Var2 = i3VarA;
                if (w8.peek() != io.sentry.vendor.gson.stream.b.NAME) {
                    if (d8 == null) {
                        throw c("start_timestamp", iLogger);
                    }
                    if (uVar == null) {
                        throw c("trace_id", iLogger);
                    }
                    if (i3Var2 == null) {
                        throw c("span_id", iLogger);
                    }
                    if (strK0 == null) {
                        throw c("op", iLogger);
                    }
                    Map map5 = map4 == null ? new HashMap() : map4;
                    if (map2 == null) {
                        map2 = new HashMap();
                    }
                    x xVar = new x(d8, dValueOf2, uVar, i3Var2, i3Var, strK0, strK1, k3Var, strK2, map5, map2, map3);
                    xVar.i(concurrentHashMap2);
                    w8.u();
                    return xVar;
                }
                String strF0 = w8.F0();
                strF0.getClass();
                switch (strF0) {
                    case "span_id":
                        i3VarA = new i3.a().a(w8, iLogger);
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d8;
                        map = map4;
                        uVarA = uVar;
                        break;
                    case "parent_span_id":
                        i3Var = (i3) w8.m1(iLogger, new i3.a());
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d8;
                        map = map4;
                        uVarA = uVar;
                        i3VarA = i3Var2;
                        break;
                    case "description":
                        strK1 = w8.k0();
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d8;
                        map = map4;
                        uVarA = uVar;
                        i3VarA = i3Var2;
                        break;
                    case "start_timestamp":
                        try {
                            dValueOf = w8.D0();
                            break;
                        } catch (NumberFormatException unused) {
                            Date dateS0 = w8.S0(iLogger);
                            dValueOf = dateS0 != null ? Double.valueOf(AbstractC2519l.b(dateS0)) : null;
                        }
                        concurrentHashMap = concurrentHashMap2;
                        map = map4;
                        uVarA = uVar;
                        i3VarA = i3Var2;
                        break;
                    case "origin":
                        strK2 = w8.k0();
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d8;
                        map = map4;
                        uVarA = uVar;
                        i3VarA = i3Var2;
                        break;
                    case "status":
                        k3Var = (k3) w8.m1(iLogger, new k3.a());
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d8;
                        map = map4;
                        uVarA = uVar;
                        i3VarA = i3Var2;
                        break;
                    case "measurements":
                        map2 = w8.q0(iLogger, new C2546h.a());
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d8;
                        map = map4;
                        uVarA = uVar;
                        i3VarA = i3Var2;
                        break;
                    case "op":
                        strK0 = w8.k0();
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d8;
                        map = map4;
                        uVarA = uVar;
                        i3VarA = i3Var2;
                        break;
                    case "data":
                        map3 = (Map) w8.y1();
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d8;
                        map = map4;
                        uVarA = uVar;
                        i3VarA = i3Var2;
                        break;
                    case "tags":
                        map = (Map) w8.y1();
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d8;
                        uVarA = uVar;
                        i3VarA = i3Var2;
                        break;
                    case "timestamp":
                        try {
                            dValueOf2 = w8.D0();
                            break;
                        } catch (NumberFormatException unused2) {
                            Date dateS1 = w8.S0(iLogger);
                            dValueOf2 = dateS1 != null ? Double.valueOf(AbstractC2519l.b(dateS1)) : null;
                        }
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d8;
                        map = map4;
                        uVarA = uVar;
                        i3VarA = i3Var2;
                        break;
                    case "trace_id":
                        uVarA = new u.a().a(w8, iLogger);
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d8;
                        map = map4;
                        i3VarA = i3Var2;
                        break;
                    default:
                        concurrentHashMap = concurrentHashMap2 == null ? new ConcurrentHashMap() : concurrentHashMap2;
                        w8.t0(iLogger, concurrentHashMap, strF0);
                        dValueOf = d8;
                        map = map4;
                        uVarA = uVar;
                        i3VarA = i3Var2;
                        break;
                }
            }
        }
    }

    public x(c3 c3Var) {
        this(c3Var, c3Var.v());
    }

    public final BigDecimal a(Double d8) {
        return BigDecimal.valueOf(d8.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    public Map b() {
        return this.f27491k;
    }

    public Map c() {
        return this.f27492l;
    }

    public String d() {
        return this.f27486f;
    }

    public i3 e() {
        return this.f27484d;
    }

    public Double f() {
        return this.f27481a;
    }

    public Double g() {
        return this.f27482b;
    }

    public void h(Map map) {
        this.f27491k = map;
    }

    public void i(Map map) {
        this.f27493m = map;
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.x();
        x8.k("start_timestamp").g(iLogger, a(this.f27481a));
        if (this.f27482b != null) {
            x8.k(DiagnosticsEntry.TIMESTAMP_KEY).g(iLogger, a(this.f27482b));
        }
        x8.k("trace_id").g(iLogger, this.f27483c);
        x8.k("span_id").g(iLogger, this.f27484d);
        if (this.f27485e != null) {
            x8.k("parent_span_id").g(iLogger, this.f27485e);
        }
        x8.k("op").c(this.f27486f);
        if (this.f27487g != null) {
            x8.k(com.amazon.a.a.o.b.f16728c).c(this.f27487g);
        }
        if (this.f27488h != null) {
            x8.k("status").g(iLogger, this.f27488h);
        }
        if (this.f27489i != null) {
            x8.k("origin").g(iLogger, this.f27489i);
        }
        if (!this.f27490j.isEmpty()) {
            x8.k("tags").g(iLogger, this.f27490j);
        }
        if (this.f27491k != null) {
            x8.k("data").g(iLogger, this.f27491k);
        }
        if (!this.f27492l.isEmpty()) {
            x8.k("measurements").g(iLogger, this.f27492l);
        }
        Map map = this.f27493m;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f27493m.get(str);
                x8.k(str);
                x8.g(iLogger, obj);
            }
        }
        x8.u();
    }

    public x(c3 c3Var, Map<String, Object> map) {
        io.sentry.util.u.c(c3Var, "span is required");
        this.f27487g = c3Var.getDescription();
        this.f27486f = c3Var.y();
        this.f27484d = c3Var.D();
        this.f27485e = c3Var.A();
        this.f27483c = c3Var.F();
        this.f27488h = c3Var.a();
        this.f27489i = c3Var.p().f();
        Map mapB = AbstractC2571c.b(c3Var.E());
        this.f27490j = mapB == null ? new ConcurrentHashMap() : mapB;
        Map mapB2 = AbstractC2571c.b(c3Var.x());
        this.f27492l = mapB2 == null ? new ConcurrentHashMap() : mapB2;
        this.f27482b = c3Var.r() == null ? null : Double.valueOf(AbstractC2519l.l(c3Var.u().e(c3Var.r())));
        this.f27481a = Double.valueOf(AbstractC2519l.l(c3Var.u().j()));
        this.f27491k = map;
    }

    public x(Double d8, Double d9, u uVar, i3 i3Var, i3 i3Var2, String str, String str2, k3 k3Var, String str3, Map<String, String> map, Map<String, C2546h> map2, Map<String, Object> map3) {
        this.f27481a = d8;
        this.f27482b = d9;
        this.f27483c = uVar;
        this.f27484d = i3Var;
        this.f27485e = i3Var2;
        this.f27486f = str;
        this.f27487g = str2;
        this.f27488h = k3Var;
        this.f27489i = str3;
        this.f27490j = map;
        this.f27492l = map2;
        this.f27491k = map3;
    }
}
