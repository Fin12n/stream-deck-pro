package io.sentry.rrweb;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.EnumC2596z2;
import io.sentry.ILogger;
import io.sentry.InterfaceC2524m0;
import io.sentry.InterfaceC2582w0;
import io.sentry.W0;
import io.sentry.X0;
import io.sentry.util.AbstractC2571c;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends b implements InterfaceC2582w0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f27554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f27555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f27556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f27557f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f27558g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public EnumC2596z2 f27559h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Map f27560i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Map f27561j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Map f27562k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Map f27563l;

    /* JADX INFO: renamed from: io.sentry.rrweb.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0603a implements InterfaceC2524m0 {
        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(W0 w8, ILogger iLogger) {
            w8.x();
            a aVar = new a();
            b.a aVar2 = new b.a();
            HashMap map = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                if (strF0.equals("data")) {
                    c(aVar, w8, iLogger);
                } else if (!aVar2.a(aVar, strF0, w8, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    w8.t0(iLogger, map, strF0);
                }
            }
            aVar.z(map);
            w8.u();
            return aVar;
        }

        public final void c(a aVar, W0 w8, ILogger iLogger) {
            w8.x();
            ConcurrentHashMap concurrentHashMap = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                if (strF0.equals("payload")) {
                    d(aVar, w8, iLogger);
                } else if (strF0.equals("tag")) {
                    String strK0 = w8.k0();
                    if (strK0 == null) {
                        strK0 = "";
                    }
                    aVar.f27554c = strK0;
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    w8.t0(iLogger, concurrentHashMap, strF0);
                }
            }
            aVar.v(concurrentHashMap);
            w8.u();
        }

        public final void d(a aVar, W0 w8, ILogger iLogger) {
            w8.x();
            ConcurrentHashMap concurrentHashMap = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                switch (strF0) {
                    case "data":
                        Map mapB = AbstractC2571c.b((Map) w8.y1());
                        if (mapB == null) {
                            break;
                        } else {
                            aVar.f27560i = mapB;
                            break;
                        }
                        break;
                    case "type":
                        aVar.f27556e = w8.k0();
                        break;
                    case "category":
                        aVar.f27557f = w8.k0();
                        break;
                    case "timestamp":
                        aVar.f27555d = w8.nextDouble();
                        break;
                    case "level":
                        try {
                            aVar.f27559h = new EnumC2596z2.a().a(w8, iLogger);
                            break;
                        } catch (Exception e8) {
                            iLogger.a(EnumC2596z2.DEBUG, e8, "Error when deserializing SentryLevel", new Object[0]);
                            break;
                        }
                        break;
                    case "message":
                        aVar.f27558g = w8.k0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        w8.t0(iLogger, concurrentHashMap, strF0);
                        break;
                }
            }
            aVar.y(concurrentHashMap);
            w8.u();
        }
    }

    public a() {
        super(c.Custom);
        this.f27554c = "breadcrumb";
    }

    public String n() {
        return this.f27557f;
    }

    public Map o() {
        return this.f27560i;
    }

    public final void p(X0 x8, ILogger iLogger) {
        x8.x();
        x8.k("tag").c(this.f27554c);
        x8.k("payload");
        q(x8, iLogger);
        Map map = this.f27563l;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f27563l.get(str);
                x8.k(str);
                x8.g(iLogger, obj);
            }
        }
        x8.u();
    }

    public final void q(X0 x8, ILogger iLogger) {
        x8.x();
        if (this.f27556e != null) {
            x8.k("type").c(this.f27556e);
        }
        x8.k(DiagnosticsEntry.TIMESTAMP_KEY).g(iLogger, BigDecimal.valueOf(this.f27555d));
        if (this.f27557f != null) {
            x8.k("category").c(this.f27557f);
        }
        if (this.f27558g != null) {
            x8.k("message").c(this.f27558g);
        }
        if (this.f27559h != null) {
            x8.k("level").g(iLogger, this.f27559h);
        }
        if (this.f27560i != null) {
            x8.k("data").g(iLogger, this.f27560i);
        }
        Map map = this.f27562k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f27562k.get(str);
                x8.k(str);
                x8.g(iLogger, obj);
            }
        }
        x8.u();
    }

    public void r(double d8) {
        this.f27555d = d8;
    }

    public void s(String str) {
        this.f27556e = str;
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.x();
        new b.C0604b().a(this, x8, iLogger);
        x8.k("data");
        p(x8, iLogger);
        Map map = this.f27561j;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f27561j.get(str);
                x8.k(str);
                x8.g(iLogger, obj);
            }
        }
        x8.u();
    }

    public void t(String str) {
        this.f27557f = str;
    }

    public void u(Map map) {
        this.f27560i = map == null ? null : new ConcurrentHashMap(map);
    }

    public void v(Map map) {
        this.f27563l = map;
    }

    public void w(EnumC2596z2 enumC2596z2) {
        this.f27559h = enumC2596z2;
    }

    public void x(String str) {
        this.f27558g = str;
    }

    public void y(Map map) {
        this.f27562k = map;
    }

    public void z(Map map) {
        this.f27561j = map;
    }
}
