package io.sentry.protocol;

import androidx.startup.TrZh.ZWZaxQrCHfNe;
import io.sentry.ILogger;
import io.sentry.InterfaceC2524m0;
import io.sentry.InterfaceC2582w0;
import io.sentry.W0;
import io.sentry.X0;
import io.sentry.util.AbstractC2571c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class l implements InterfaceC2582w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f27432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f27433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f27434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f27435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f27436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f27437f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Map f27438g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Long f27439h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Map f27440i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f27441j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f27442k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Map f27443l;

    public l() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (io.sentry.util.u.a(this.f27432a, lVar.f27432a) && io.sentry.util.u.a(this.f27433b, lVar.f27433b) && io.sentry.util.u.a(this.f27434c, lVar.f27434c) && io.sentry.util.u.a(this.f27436e, lVar.f27436e) && io.sentry.util.u.a(this.f27437f, lVar.f27437f) && io.sentry.util.u.a(this.f27438g, lVar.f27438g) && io.sentry.util.u.a(this.f27439h, lVar.f27439h) && io.sentry.util.u.a(this.f27441j, lVar.f27441j) && io.sentry.util.u.a(this.f27442k, lVar.f27442k)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return io.sentry.util.u.b(this.f27432a, this.f27433b, this.f27434c, this.f27436e, this.f27437f, this.f27438g, this.f27439h, this.f27441j, this.f27442k);
    }

    public Map l() {
        return this.f27437f;
    }

    public void m(Map map) {
        this.f27443l = map;
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.x();
        if (this.f27432a != null) {
            x8.k("url").c(this.f27432a);
        }
        if (this.f27433b != null) {
            x8.k("method").c(this.f27433b);
        }
        if (this.f27434c != null) {
            x8.k("query_string").c(this.f27434c);
        }
        if (this.f27435d != null) {
            x8.k("data").g(iLogger, this.f27435d);
        }
        if (this.f27436e != null) {
            x8.k("cookies").c(this.f27436e);
        }
        if (this.f27437f != null) {
            x8.k("headers").g(iLogger, this.f27437f);
        }
        if (this.f27438g != null) {
            x8.k("env").g(iLogger, this.f27438g);
        }
        if (this.f27440i != null) {
            x8.k("other").g(iLogger, this.f27440i);
        }
        if (this.f27441j != null) {
            x8.k("fragment").g(iLogger, this.f27441j);
        }
        if (this.f27439h != null) {
            x8.k("body_size").g(iLogger, this.f27439h);
        }
        if (this.f27442k != null) {
            x8.k("api_target").g(iLogger, this.f27442k);
        }
        Map map = this.f27443l;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f27443l.get(str);
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
        public l a(W0 w8, ILogger iLogger) {
            w8.x();
            l lVar = new l();
            ConcurrentHashMap concurrentHashMap = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                byte b8 = -1;
                switch (strF0.hashCode()) {
                    case -1650269616:
                        if (strF0.equals("fragment")) {
                            b8 = 0;
                        }
                        break;
                    case -1077554975:
                        if (strF0.equals("method")) {
                            b8 = 1;
                        }
                        break;
                    case 100589:
                        if (strF0.equals("env")) {
                            b8 = 2;
                        }
                        break;
                    case 116079:
                        if (strF0.equals("url")) {
                            b8 = 3;
                        }
                        break;
                    case 3076010:
                        if (strF0.equals("data")) {
                            b8 = 4;
                        }
                        break;
                    case 106069776:
                        if (strF0.equals("other")) {
                            b8 = 5;
                        }
                        break;
                    case 795307910:
                        if (strF0.equals(ZWZaxQrCHfNe.dkhSNos)) {
                            b8 = 6;
                        }
                        break;
                    case 952189583:
                        if (strF0.equals("cookies")) {
                            b8 = 7;
                        }
                        break;
                    case 1252988030:
                        if (strF0.equals("body_size")) {
                            b8 = 8;
                        }
                        break;
                    case 1595298664:
                        if (strF0.equals("query_string")) {
                            b8 = 9;
                        }
                        break;
                    case 1980646230:
                        if (strF0.equals("api_target")) {
                            b8 = 10;
                        }
                        break;
                }
                switch (b8) {
                    case 0:
                        lVar.f27441j = w8.k0();
                        break;
                    case 1:
                        lVar.f27433b = w8.k0();
                        break;
                    case 2:
                        Map map = (Map) w8.y1();
                        if (map != null) {
                            lVar.f27438g = AbstractC2571c.b(map);
                        }
                        break;
                    case 3:
                        lVar.f27432a = w8.k0();
                        break;
                    case 4:
                        lVar.f27435d = w8.y1();
                        break;
                    case 5:
                        Map map2 = (Map) w8.y1();
                        if (map2 != null) {
                            lVar.f27440i = AbstractC2571c.b(map2);
                        }
                        break;
                    case 6:
                        Map map3 = (Map) w8.y1();
                        if (map3 != null) {
                            lVar.f27437f = AbstractC2571c.b(map3);
                        }
                        break;
                    case 7:
                        lVar.f27436e = w8.k0();
                        break;
                    case 8:
                        lVar.f27439h = w8.a0();
                        break;
                    case 9:
                        lVar.f27434c = w8.k0();
                        break;
                    case 10:
                        lVar.f27442k = w8.k0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        w8.t0(iLogger, concurrentHashMap, strF0);
                        break;
                }
            }
            lVar.m(concurrentHashMap);
            w8.u();
            return lVar;
        }
    }

    public l(l lVar) {
        this.f27432a = lVar.f27432a;
        this.f27436e = lVar.f27436e;
        this.f27433b = lVar.f27433b;
        this.f27434c = lVar.f27434c;
        this.f27437f = AbstractC2571c.b(lVar.f27437f);
        this.f27438g = AbstractC2571c.b(lVar.f27438g);
        this.f27440i = AbstractC2571c.b(lVar.f27440i);
        this.f27443l = AbstractC2571c.b(lVar.f27443l);
        this.f27435d = lVar.f27435d;
        this.f27441j = lVar.f27441j;
        this.f27439h = lVar.f27439h;
        this.f27442k = lVar.f27442k;
    }
}
