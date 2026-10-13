package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.InterfaceC2524m0;
import io.sentry.InterfaceC2582w0;
import io.sentry.W0;
import io.sentry.X0;
import io.sentry.util.u;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends b implements InterfaceC2582w0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f27584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f27587f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Map f27588g;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2524m0 {
        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g a(W0 w8, ILogger iLogger) {
            w8.x();
            g gVar = new g();
            b.a aVar = new b.a();
            HashMap map = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                if (strF0.equals("data")) {
                    c(gVar, w8, iLogger);
                } else if (!aVar.a(gVar, strF0, w8, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    w8.t0(iLogger, map, strF0);
                }
            }
            gVar.m(map);
            w8.u();
            return gVar;
        }

        public final void c(g gVar, W0 w8, ILogger iLogger) {
            w8.x();
            ConcurrentHashMap concurrentHashMap = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                switch (strF0) {
                    case "height":
                        Integer numT = w8.T();
                        gVar.f27585d = numT != null ? numT.intValue() : 0;
                        break;
                    case "href":
                        String strK0 = w8.k0();
                        if (strK0 == null) {
                            strK0 = "";
                        }
                        gVar.f27584c = strK0;
                        break;
                    case "width":
                        Integer numT2 = w8.T();
                        gVar.f27586e = numT2 != null ? numT2.intValue() : 0;
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        w8.t0(iLogger, concurrentHashMap, strF0);
                        break;
                }
            }
            gVar.k(concurrentHashMap);
            w8.u();
        }
    }

    public g() {
        super(c.Meta);
        this.f27584c = "";
    }

    private void j(X0 x8, ILogger iLogger) {
        x8.x();
        x8.k("href").c(this.f27584c);
        x8.k("height").a(this.f27585d);
        x8.k("width").a(this.f27586e);
        Map map = this.f27587f;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f27587f.get(str);
                x8.k(str);
                x8.g(iLogger, obj);
            }
        }
        x8.u();
    }

    @Override // io.sentry.rrweb.b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f27585d == gVar.f27585d && this.f27586e == gVar.f27586e && u.a(this.f27584c, gVar.f27584c);
    }

    @Override // io.sentry.rrweb.b
    public int hashCode() {
        return u.b(Integer.valueOf(super.hashCode()), this.f27584c, Integer.valueOf(this.f27585d), Integer.valueOf(this.f27586e));
    }

    public void k(Map map) {
        this.f27588g = map;
    }

    public void l(int i8) {
        this.f27585d = i8;
    }

    public void m(Map map) {
        this.f27587f = map;
    }

    public void n(int i8) {
        this.f27586e = i8;
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.x();
        new b.C0604b().a(this, x8, iLogger);
        x8.k("data");
        j(x8, iLogger);
        x8.u();
    }
}
