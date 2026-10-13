package io.sentry.protocol;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
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
public final class k implements InterfaceC2582w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f27425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f27426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f27427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f27428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f27429e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Boolean f27430f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Map f27431g;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2524m0 {
        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public k a(W0 w8, ILogger iLogger) {
            w8.x();
            k kVar = new k();
            ConcurrentHashMap concurrentHashMap = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                switch (strF0) {
                    case "rooted":
                        kVar.f27430f = w8.Z0();
                        break;
                    case "raw_description":
                        kVar.f27427c = w8.k0();
                        break;
                    case "name":
                        kVar.f27425a = w8.k0();
                        break;
                    case "build":
                        kVar.f27428d = w8.k0();
                        break;
                    case "version":
                        kVar.f27426b = w8.k0();
                        break;
                    case "kernel_version":
                        kVar.f27429e = w8.k0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        w8.t0(iLogger, concurrentHashMap, strF0);
                        break;
                }
            }
            kVar.l(concurrentHashMap);
            w8.u();
            return kVar;
        }
    }

    public k() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (io.sentry.util.u.a(this.f27425a, kVar.f27425a) && io.sentry.util.u.a(this.f27426b, kVar.f27426b) && io.sentry.util.u.a(this.f27427c, kVar.f27427c) && io.sentry.util.u.a(this.f27428d, kVar.f27428d) && io.sentry.util.u.a(this.f27429e, kVar.f27429e) && io.sentry.util.u.a(this.f27430f, kVar.f27430f)) {
                return true;
            }
        }
        return false;
    }

    public String g() {
        return this.f27425a;
    }

    public void h(String str) {
        this.f27428d = str;
    }

    public int hashCode() {
        return io.sentry.util.u.b(this.f27425a, this.f27426b, this.f27427c, this.f27428d, this.f27429e, this.f27430f);
    }

    public void i(String str) {
        this.f27429e = str;
    }

    public void j(String str) {
        this.f27425a = str;
    }

    public void k(Boolean bool) {
        this.f27430f = bool;
    }

    public void l(Map map) {
        this.f27431g = map;
    }

    public void m(String str) {
        this.f27426b = str;
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.x();
        if (this.f27425a != null) {
            x8.k("name").c(this.f27425a);
        }
        if (this.f27426b != null) {
            x8.k(DiagnosticsEntry.VERSION_KEY).c(this.f27426b);
        }
        if (this.f27427c != null) {
            x8.k("raw_description").c(this.f27427c);
        }
        if (this.f27428d != null) {
            x8.k("build").c(this.f27428d);
        }
        if (this.f27429e != null) {
            x8.k("kernel_version").c(this.f27429e);
        }
        if (this.f27430f != null) {
            x8.k("rooted").h(this.f27430f);
        }
        Map map = this.f27431g;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f27431g.get(str);
                x8.k(str);
                x8.g(iLogger, obj);
            }
        }
        x8.u();
    }

    public k(k kVar) {
        this.f27425a = kVar.f27425a;
        this.f27426b = kVar.f27426b;
        this.f27427c = kVar.f27427c;
        this.f27428d = kVar.f27428d;
        this.f27429e = kVar.f27429e;
        this.f27430f = kVar.f27430f;
        this.f27431g = AbstractC2571c.b(kVar.f27431g);
    }
}
