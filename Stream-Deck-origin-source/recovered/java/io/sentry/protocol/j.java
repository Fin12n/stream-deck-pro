package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.InterfaceC2524m0;
import io.sentry.InterfaceC2582w0;
import io.sentry.W0;
import io.sentry.X0;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class j implements InterfaceC2582w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f27421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f27422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f27423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map f27424d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2524m0 {
        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public j a(W0 w8, ILogger iLogger) {
            w8.x();
            j jVar = new j();
            ConcurrentHashMap concurrentHashMap = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                switch (strF0) {
                    case "params":
                        List list = (List) w8.y1();
                        if (list == null) {
                            break;
                        } else {
                            jVar.f27423c = list;
                            break;
                        }
                        break;
                    case "message":
                        jVar.f27422b = w8.k0();
                        break;
                    case "formatted":
                        jVar.f27421a = w8.k0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        w8.t0(iLogger, concurrentHashMap, strF0);
                        break;
                }
            }
            jVar.g(concurrentHashMap);
            w8.u();
            return jVar;
        }
    }

    public String d() {
        return this.f27421a;
    }

    public String e() {
        return this.f27422b;
    }

    public void f(String str) {
        this.f27421a = str;
    }

    public void g(Map map) {
        this.f27424d = map;
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.x();
        if (this.f27421a != null) {
            x8.k("formatted").c(this.f27421a);
        }
        if (this.f27422b != null) {
            x8.k("message").c(this.f27422b);
        }
        List list = this.f27423c;
        if (list != null && !list.isEmpty()) {
            x8.k("params").g(iLogger, this.f27423c);
        }
        Map map = this.f27424d;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f27424d.get(str);
                x8.k(str);
                x8.g(iLogger, obj);
            }
        }
        x8.u();
    }
}
