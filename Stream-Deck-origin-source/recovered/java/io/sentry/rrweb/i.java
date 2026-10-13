package io.sentry.rrweb;

import D6.iIQ.BmWxZhjGfw;
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
public final class i extends b implements InterfaceC2582w0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f27593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f27594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f27595e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f27596f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f27597g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Map f27598h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Map f27599i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Map f27600j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Map f27601k;

    public i() {
        super(c.Custom);
        this.f27593c = "performanceSpan";
    }

    private void m(X0 x8, ILogger iLogger) {
        x8.x();
        x8.k("tag").c(this.f27593c);
        x8.k("payload");
        n(x8, iLogger);
        Map map = this.f27601k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f27601k.get(str);
                x8.k(str);
                x8.g(iLogger, obj);
            }
        }
        x8.u();
    }

    private void n(X0 x8, ILogger iLogger) {
        x8.x();
        if (this.f27594d != null) {
            x8.k("op").c(this.f27594d);
        }
        if (this.f27595e != null) {
            x8.k(com.amazon.a.a.o.b.f16728c).c(this.f27595e);
        }
        x8.k("startTimestamp").g(iLogger, BigDecimal.valueOf(this.f27596f));
        x8.k("endTimestamp").g(iLogger, BigDecimal.valueOf(this.f27597g));
        if (this.f27598h != null) {
            x8.k("data").g(iLogger, this.f27598h);
        }
        Map map = this.f27600j;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f27600j.get(str);
                x8.k(str);
                x8.g(iLogger, obj);
            }
        }
        x8.u();
    }

    public void o(Map map) {
        this.f27598h = map == null ? null : new ConcurrentHashMap(map);
    }

    public void p(Map map) {
        this.f27601k = map;
    }

    public void q(String str) {
        this.f27595e = str;
    }

    public void r(double d8) {
        this.f27597g = d8;
    }

    public void s(String str) {
        this.f27594d = str;
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.x();
        new b.C0604b().a(this, x8, iLogger);
        x8.k("data");
        m(x8, iLogger);
        Map map = this.f27599i;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f27599i.get(str);
                x8.k(str);
                x8.g(iLogger, obj);
            }
        }
        x8.u();
    }

    public void t(Map map) {
        this.f27600j = map;
    }

    public void u(double d8) {
        this.f27596f = d8;
    }

    public void v(Map map) {
        this.f27599i = map;
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2524m0 {
        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(W0 w8, ILogger iLogger) {
            w8.x();
            i iVar = new i();
            b.a aVar = new b.a();
            HashMap map = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                if (strF0.equals("data")) {
                    c(iVar, w8, iLogger);
                } else if (!aVar.a(iVar, strF0, w8, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    w8.t0(iLogger, map, strF0);
                }
            }
            iVar.v(map);
            w8.u();
            return iVar;
        }

        public final void d(i iVar, W0 w8, ILogger iLogger) {
            w8.x();
            ConcurrentHashMap concurrentHashMap = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                switch (strF0) {
                    case "description":
                        iVar.f27595e = w8.k0();
                        break;
                    case "endTimestamp":
                        iVar.f27597g = w8.nextDouble();
                        break;
                    case "startTimestamp":
                        iVar.f27596f = w8.nextDouble();
                        break;
                    case "op":
                        iVar.f27594d = w8.k0();
                        break;
                    case "data":
                        Map mapB = AbstractC2571c.b((Map) w8.y1());
                        if (mapB == null) {
                            break;
                        } else {
                            iVar.f27598h = mapB;
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
            iVar.t(concurrentHashMap);
            w8.u();
        }

        public final void c(i iVar, W0 w8, ILogger iLogger) {
            w8.x();
            ConcurrentHashMap concurrentHashMap = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                if (!strF0.equals("payload")) {
                    if (!strF0.equals(BmWxZhjGfw.ykyYuHPujnlcW)) {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        w8.t0(iLogger, concurrentHashMap, strF0);
                    } else {
                        String strK0 = w8.k0();
                        if (strK0 == null) {
                            strK0 = "";
                        }
                        iVar.f27593c = strK0;
                    }
                } else {
                    d(iVar, w8, iLogger);
                }
            }
            iVar.p(concurrentHashMap);
            w8.u();
        }
    }
}
