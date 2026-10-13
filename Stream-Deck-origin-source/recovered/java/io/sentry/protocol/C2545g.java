package io.sentry.protocol;

import V.ocy.SVzBK;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.ILogger;
import io.sentry.InterfaceC2524m0;
import io.sentry.InterfaceC2582w0;
import io.sentry.W0;
import io.sentry.X0;
import io.sentry.util.AbstractC2571c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2545g implements InterfaceC2582w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f27396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f27397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f27398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f27399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Integer f27400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f27401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Boolean f27402g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f27403h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f27404i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Map f27405j;

    /* JADX INFO: renamed from: io.sentry.protocol.g$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2524m0 {
        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2545g a(W0 w8, ILogger iLogger) {
            w8.x();
            C2545g c2545g = new C2545g();
            ConcurrentHashMap concurrentHashMap = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                switch (strF0) {
                    case "npot_support":
                        c2545g.f27404i = w8.k0();
                        break;
                    case "vendor_id":
                        c2545g.f27398c = w8.k0();
                        break;
                    case "multi_threaded_rendering":
                        c2545g.f27402g = w8.Z0();
                        break;
                    case "id":
                        c2545g.f27397b = w8.T();
                        break;
                    case "name":
                        c2545g.f27396a = w8.k0();
                        break;
                    case "vendor_name":
                        c2545g.f27399d = w8.k0();
                        break;
                    case "version":
                        c2545g.f27403h = w8.k0();
                        break;
                    case "api_type":
                        c2545g.f27401f = w8.k0();
                        break;
                    case "memory_size":
                        c2545g.f27400e = w8.T();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        w8.t0(iLogger, concurrentHashMap, strF0);
                        break;
                }
            }
            c2545g.j(concurrentHashMap);
            w8.u();
            return c2545g;
        }
    }

    public C2545g() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2545g.class == obj.getClass()) {
            C2545g c2545g = (C2545g) obj;
            if (io.sentry.util.u.a(this.f27396a, c2545g.f27396a) && io.sentry.util.u.a(this.f27397b, c2545g.f27397b) && io.sentry.util.u.a(this.f27398c, c2545g.f27398c) && io.sentry.util.u.a(this.f27399d, c2545g.f27399d) && io.sentry.util.u.a(this.f27400e, c2545g.f27400e) && io.sentry.util.u.a(this.f27401f, c2545g.f27401f) && io.sentry.util.u.a(this.f27402g, c2545g.f27402g) && io.sentry.util.u.a(this.f27403h, c2545g.f27403h) && io.sentry.util.u.a(this.f27404i, c2545g.f27404i)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return io.sentry.util.u.b(this.f27396a, this.f27397b, this.f27398c, this.f27399d, this.f27400e, this.f27401f, this.f27402g, this.f27403h, this.f27404i);
    }

    public void j(Map map) {
        this.f27405j = map;
    }

    public C2545g(C2545g c2545g) {
        this.f27396a = c2545g.f27396a;
        this.f27397b = c2545g.f27397b;
        this.f27398c = c2545g.f27398c;
        this.f27399d = c2545g.f27399d;
        this.f27400e = c2545g.f27400e;
        this.f27401f = c2545g.f27401f;
        this.f27402g = c2545g.f27402g;
        this.f27403h = c2545g.f27403h;
        this.f27404i = c2545g.f27404i;
        this.f27405j = AbstractC2571c.b(c2545g.f27405j);
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.x();
        if (this.f27396a != null) {
            x8.k("name").c(this.f27396a);
        }
        if (this.f27397b != null) {
            x8.k("id").f(this.f27397b);
        }
        if (this.f27398c != null) {
            x8.k("vendor_id").c(this.f27398c);
        }
        if (this.f27399d != null) {
            x8.k("vendor_name").c(this.f27399d);
        }
        if (this.f27400e != null) {
            x8.k(SVzBK.AFaFoHm).f(this.f27400e);
        }
        if (this.f27401f != null) {
            x8.k("api_type").c(this.f27401f);
        }
        if (this.f27402g != null) {
            x8.k("multi_threaded_rendering").h(this.f27402g);
        }
        if (this.f27403h != null) {
            x8.k(DiagnosticsEntry.VERSION_KEY).c(this.f27403h);
        }
        if (this.f27404i != null) {
            x8.k("npot_support").c(this.f27404i);
        }
        Map map = this.f27405j;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f27405j.get(str);
                x8.k(str);
                x8.g(iLogger, obj);
            }
        }
        x8.u();
    }
}
