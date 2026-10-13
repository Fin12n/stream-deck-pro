package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.InterfaceC2524m0;
import io.sentry.InterfaceC2582w0;
import io.sentry.W0;
import io.sentry.X0;
import io.sentry.util.AbstractC2571c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p201x2.vAk.hJroAgFztiMK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class F implements InterfaceC2582w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f27313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f27314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f27315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f27316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f27317e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C2544f f27318f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Map f27319g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Map f27320h;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2524m0 {
        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public F a(W0 w8, ILogger iLogger) {
            w8.x();
            F f8 = new F();
            ConcurrentHashMap concurrentHashMap = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                switch (strF0) {
                    case "username":
                        f8.f27315c = w8.k0();
                        break;
                    case "id":
                        f8.f27314b = w8.k0();
                        break;
                    case "geo":
                        f8.f27318f = new C2544f.a().a(w8, iLogger);
                        break;
                    case "data":
                        f8.f27319g = AbstractC2571c.b((Map) w8.y1());
                        break;
                    case "name":
                        f8.f27317e = w8.k0();
                        break;
                    case "email":
                        f8.f27313a = w8.k0();
                        break;
                    case "ip_address":
                        f8.f27316d = w8.k0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        w8.t0(iLogger, concurrentHashMap, strF0);
                        break;
                }
            }
            f8.n(concurrentHashMap);
            w8.u();
            return f8;
        }
    }

    public F() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && F.class == obj.getClass()) {
            F f8 = (F) obj;
            if (io.sentry.util.u.a(this.f27313a, f8.f27313a) && io.sentry.util.u.a(this.f27314b, f8.f27314b) && io.sentry.util.u.a(this.f27315c, f8.f27315c) && io.sentry.util.u.a(this.f27316d, f8.f27316d)) {
                return true;
            }
        }
        return false;
    }

    public String h() {
        return this.f27313a;
    }

    public int hashCode() {
        return io.sentry.util.u.b(this.f27313a, this.f27314b, this.f27315c, this.f27316d);
    }

    public String i() {
        return this.f27314b;
    }

    public String j() {
        return this.f27316d;
    }

    public String k() {
        return this.f27315c;
    }

    public void l(String str) {
        this.f27314b = str;
    }

    public void m(String str) {
        this.f27316d = str;
    }

    public void n(Map map) {
        this.f27320h = map;
    }

    public F(F f8) {
        this.f27313a = f8.f27313a;
        this.f27315c = f8.f27315c;
        this.f27314b = f8.f27314b;
        this.f27316d = f8.f27316d;
        this.f27317e = f8.f27317e;
        this.f27318f = f8.f27318f;
        this.f27319g = AbstractC2571c.b(f8.f27319g);
        this.f27320h = AbstractC2571c.b(f8.f27320h);
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.x();
        if (this.f27313a != null) {
            x8.k(hJroAgFztiMK.ptniPjHP).c(this.f27313a);
        }
        if (this.f27314b != null) {
            x8.k("id").c(this.f27314b);
        }
        if (this.f27315c != null) {
            x8.k("username").c(this.f27315c);
        }
        if (this.f27316d != null) {
            x8.k("ip_address").c(this.f27316d);
        }
        if (this.f27317e != null) {
            x8.k("name").c(this.f27317e);
        }
        if (this.f27318f != null) {
            x8.k("geo");
            this.f27318f.serialize(x8, iLogger);
        }
        if (this.f27319g != null) {
            x8.k("data").g(iLogger, this.f27319g);
        }
        Map map = this.f27320h;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f27320h.get(str);
                x8.k(str);
                x8.g(iLogger, obj);
            }
        }
        x8.u();
    }
}
