package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.InterfaceC2524m0;
import io.sentry.InterfaceC2582w0;
import io.sentry.W0;
import io.sentry.X0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2544f implements InterfaceC2582w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f27392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f27393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f27394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map f27395d;

    /* JADX INFO: renamed from: io.sentry.protocol.f$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2524m0 {
        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2544f a(W0 w8, ILogger iLogger) {
            w8.x();
            C2544f c2544f = new C2544f();
            ConcurrentHashMap concurrentHashMap = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                switch (strF0) {
                    case "region":
                        c2544f.f27394c = w8.k0();
                        break;
                    case "city":
                        c2544f.f27392a = w8.k0();
                        break;
                    case "country_code":
                        c2544f.f27393b = w8.k0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        w8.t0(iLogger, concurrentHashMap, strF0);
                        break;
                }
            }
            c2544f.d(concurrentHashMap);
            w8.u();
            return c2544f;
        }
    }

    public C2544f() {
    }

    public void d(Map map) {
        this.f27395d = map;
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.x();
        if (this.f27392a != null) {
            x8.k("city").c(this.f27392a);
        }
        if (this.f27393b != null) {
            x8.k("country_code").c(this.f27393b);
        }
        if (this.f27394c != null) {
            x8.k("region").c(this.f27394c);
        }
        Map map = this.f27395d;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f27395d.get(str);
                x8.k(str);
                x8.g(iLogger, obj);
            }
        }
        x8.u();
    }

    public C2544f(C2544f c2544f) {
        this.f27392a = c2544f.f27392a;
        this.f27393b = c2544f.f27393b;
        this.f27394c = c2544f.f27394c;
    }
}
