package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.InterfaceC2524m0;
import io.sentry.InterfaceC2582w0;
import io.sentry.W0;
import io.sentry.X0;
import io.sentry.util.AbstractC2571c;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class z implements InterfaceC2582w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f27512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map f27513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f27514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map f27515d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2524m0 {
        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public z a(W0 w8, ILogger iLogger) {
            z zVar = new z();
            w8.x();
            ConcurrentHashMap concurrentHashMap = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                switch (strF0) {
                    case "frames":
                        zVar.f27512a = w8.O1(iLogger, new y.a());
                        break;
                    case "registers":
                        zVar.f27513b = AbstractC2571c.b((Map) w8.y1());
                        break;
                    case "snapshot":
                        zVar.f27514c = w8.Z0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        w8.t0(iLogger, concurrentHashMap, strF0);
                        break;
                }
            }
            zVar.f(concurrentHashMap);
            w8.u();
            return zVar;
        }
    }

    public z() {
    }

    public List d() {
        return this.f27512a;
    }

    public void e(Boolean bool) {
        this.f27514c = bool;
    }

    public void f(Map map) {
        this.f27515d = map;
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.x();
        if (this.f27512a != null) {
            x8.k("frames").g(iLogger, this.f27512a);
        }
        if (this.f27513b != null) {
            x8.k("registers").g(iLogger, this.f27513b);
        }
        if (this.f27514c != null) {
            x8.k("snapshot").h(this.f27514c);
        }
        Map map = this.f27515d;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f27515d.get(str);
                x8.k(str);
                x8.g(iLogger, obj);
            }
        }
        x8.u();
    }

    public z(List<y> list) {
        this.f27512a = list;
    }
}
