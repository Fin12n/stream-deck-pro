package io.sentry.protocol;

import io.sentry.A2;
import io.sentry.ILogger;
import io.sentry.InterfaceC2524m0;
import io.sentry.InterfaceC2582w0;
import io.sentry.W0;
import io.sentry.X0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p027d.LrLN.vHKCAgr;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class A implements InterfaceC2582w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f27290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f27291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f27292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f27293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f27294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Boolean f27295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Boolean f27296g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Boolean f27297h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public z f27298i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Map f27299j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Map f27300k;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2524m0 {
        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public A a(W0 w8, ILogger iLogger) {
            A a8 = new A();
            w8.x();
            ConcurrentHashMap concurrentHashMap = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                switch (strF0) {
                    case "daemon":
                        a8.f27296g = w8.Z0();
                        break;
                    case "priority":
                        a8.f27291b = w8.T();
                        break;
                    case "held_locks":
                        Map mapQ0 = w8.q0(iLogger, new A2.a());
                        if (mapQ0 == null) {
                            break;
                        } else {
                            a8.f27299j = new HashMap(mapQ0);
                            break;
                        }
                        break;
                    case "id":
                        a8.f27290a = w8.a0();
                        break;
                    case "main":
                        a8.f27297h = w8.Z0();
                        break;
                    case "name":
                        a8.f27292c = w8.k0();
                        break;
                    case "state":
                        a8.f27293d = w8.k0();
                        break;
                    case "crashed":
                        a8.f27294e = w8.Z0();
                        break;
                    case "current":
                        a8.f27295f = w8.Z0();
                        break;
                    case "stacktrace":
                        a8.f27298i = (z) w8.m1(iLogger, new z.a());
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        w8.t0(iLogger, concurrentHashMap, strF0);
                        break;
                }
            }
            a8.A(concurrentHashMap);
            w8.u();
            return a8;
        }
    }

    public void A(Map map) {
        this.f27300k = map;
    }

    public Map k() {
        return this.f27299j;
    }

    public Long l() {
        return this.f27290a;
    }

    public String m() {
        return this.f27292c;
    }

    public z n() {
        return this.f27298i;
    }

    public Boolean o() {
        return this.f27295f;
    }

    public Boolean p() {
        return this.f27297h;
    }

    public void q(Boolean bool) {
        this.f27294e = bool;
    }

    public void r(Boolean bool) {
        this.f27295f = bool;
    }

    public void s(Boolean bool) {
        this.f27296g = bool;
    }

    public void t(Map map) {
        this.f27299j = map;
    }

    public void u(Long l8) {
        this.f27290a = l8;
    }

    public void v(Boolean bool) {
        this.f27297h = bool;
    }

    public void w(String str) {
        this.f27292c = str;
    }

    public void x(Integer num) {
        this.f27291b = num;
    }

    public void y(z zVar) {
        this.f27298i = zVar;
    }

    public void z(String str) {
        this.f27293d = str;
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.x();
        if (this.f27290a != null) {
            x8.k("id").f(this.f27290a);
        }
        if (this.f27291b != null) {
            x8.k("priority").f(this.f27291b);
        }
        if (this.f27292c != null) {
            x8.k("name").c(this.f27292c);
        }
        if (this.f27293d != null) {
            x8.k(vHKCAgr.zrvSf).c(this.f27293d);
        }
        if (this.f27294e != null) {
            x8.k("crashed").h(this.f27294e);
        }
        if (this.f27295f != null) {
            x8.k("current").h(this.f27295f);
        }
        if (this.f27296g != null) {
            x8.k("daemon").h(this.f27296g);
        }
        if (this.f27297h != null) {
            x8.k("main").h(this.f27297h);
        }
        if (this.f27298i != null) {
            x8.k("stacktrace").g(iLogger, this.f27298i);
        }
        if (this.f27299j != null) {
            x8.k("held_locks").g(iLogger, this.f27299j);
        }
        Map map = this.f27300k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f27300k.get(str);
                x8.k(str);
                x8.g(iLogger, obj);
            }
        }
        x8.u();
    }
}
