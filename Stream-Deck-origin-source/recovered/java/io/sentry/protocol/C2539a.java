package io.sentry.protocol;

import E4.JFpq.XRlnZWSrAFn;
import io.sentry.ILogger;
import io.sentry.InterfaceC2524m0;
import io.sentry.InterfaceC2582w0;
import io.sentry.W0;
import io.sentry.X0;
import io.sentry.util.AbstractC2571c;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2539a implements InterfaceC2582w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f27336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Date f27337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f27338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f27339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f27340e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f27341f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f27342g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Map f27343h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f27344i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f27345j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Boolean f27346k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Boolean f27347l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List f27348m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Map f27349n;

    public C2539a() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2539a.class == obj.getClass()) {
            C2539a c2539a = (C2539a) obj;
            if (io.sentry.util.u.a(this.f27336a, c2539a.f27336a) && io.sentry.util.u.a(this.f27337b, c2539a.f27337b) && io.sentry.util.u.a(this.f27338c, c2539a.f27338c) && io.sentry.util.u.a(this.f27339d, c2539a.f27339d) && io.sentry.util.u.a(this.f27340e, c2539a.f27340e) && io.sentry.util.u.a(this.f27341f, c2539a.f27341f) && io.sentry.util.u.a(this.f27342g, c2539a.f27342g) && io.sentry.util.u.a(this.f27343h, c2539a.f27343h) && io.sentry.util.u.a(this.f27346k, c2539a.f27346k) && io.sentry.util.u.a(this.f27344i, c2539a.f27344i) && io.sentry.util.u.a(this.f27345j, c2539a.f27345j) && io.sentry.util.u.a(this.f27347l, c2539a.f27347l) && io.sentry.util.u.a(this.f27348m, c2539a.f27348m)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return io.sentry.util.u.b(this.f27336a, this.f27337b, this.f27338c, this.f27339d, this.f27340e, this.f27341f, this.f27342g, this.f27343h, this.f27346k, this.f27344i, this.f27345j, this.f27347l, this.f27348m);
    }

    public Boolean l() {
        return this.f27346k;
    }

    public void m(String str) {
        this.f27342g = str;
    }

    public void n(String str) {
        this.f27336a = str;
    }

    public void o(String str) {
        this.f27340e = str;
    }

    public void p(Date date) {
        this.f27337b = date;
    }

    public void q(String str) {
        this.f27341f = str;
    }

    public void r(Boolean bool) {
        this.f27346k = bool;
    }

    public void s(Map map) {
        this.f27343h = map;
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.x();
        if (this.f27336a != null) {
            x8.k("app_identifier").c(this.f27336a);
        }
        if (this.f27337b != null) {
            x8.k("app_start_time").g(iLogger, this.f27337b);
        }
        if (this.f27338c != null) {
            x8.k("device_app_hash").c(this.f27338c);
        }
        if (this.f27339d != null) {
            x8.k("build_type").c(this.f27339d);
        }
        if (this.f27340e != null) {
            x8.k("app_name").c(this.f27340e);
        }
        if (this.f27341f != null) {
            x8.k("app_version").c(this.f27341f);
        }
        if (this.f27342g != null) {
            x8.k("app_build").c(this.f27342g);
        }
        Map map = this.f27343h;
        if (map != null && !map.isEmpty()) {
            x8.k("permissions").g(iLogger, this.f27343h);
        }
        if (this.f27346k != null) {
            x8.k("in_foreground").h(this.f27346k);
        }
        if (this.f27344i != null) {
            x8.k("view_names").g(iLogger, this.f27344i);
        }
        if (this.f27345j != null) {
            x8.k("start_type").c(this.f27345j);
        }
        if (this.f27347l != null) {
            x8.k("is_split_apks").h(this.f27347l);
        }
        List list = this.f27348m;
        if (list != null && !list.isEmpty()) {
            x8.k("split_names").g(iLogger, this.f27348m);
        }
        Map map2 = this.f27349n;
        if (map2 != null) {
            for (String str : map2.keySet()) {
                x8.k(str).g(iLogger, this.f27349n.get(str));
            }
        }
        x8.u();
    }

    public void t(Boolean bool) {
        this.f27347l = bool;
    }

    public void u(List list) {
        this.f27348m = list;
    }

    public void v(String str) {
        this.f27345j = str;
    }

    public void w(Map map) {
        this.f27349n = map;
    }

    public void x(List list) {
        this.f27344i = list;
    }

    /* JADX INFO: renamed from: io.sentry.protocol.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0602a implements InterfaceC2524m0 {
        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2539a a(W0 w8, ILogger iLogger) {
            w8.x();
            C2539a c2539a = new C2539a();
            ConcurrentHashMap concurrentHashMap = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                byte b8 = -1;
                switch (strF0.hashCode()) {
                    case -1950148125:
                        if (strF0.equals("split_names")) {
                            b8 = 0;
                        }
                        break;
                    case -1898053579:
                        if (strF0.equals("device_app_hash")) {
                            b8 = 1;
                        }
                        break;
                    case -1573129993:
                        if (strF0.equals("start_type")) {
                            b8 = 2;
                        }
                        break;
                    case -1524619986:
                        if (strF0.equals("view_names")) {
                            b8 = 3;
                        }
                        break;
                    case -901870406:
                        if (strF0.equals(XRlnZWSrAFn.PtAWbfcQiBltX)) {
                            b8 = 4;
                        }
                        break;
                    case -650544995:
                        if (strF0.equals("in_foreground")) {
                            b8 = 5;
                        }
                        break;
                    case -470395285:
                        if (strF0.equals("build_type")) {
                            b8 = 6;
                        }
                        break;
                    case 746297735:
                        if (strF0.equals("app_identifier")) {
                            b8 = 7;
                        }
                        break;
                    case 791585128:
                        if (strF0.equals("app_start_time")) {
                            b8 = 8;
                        }
                        break;
                    case 1133704324:
                        if (strF0.equals("permissions")) {
                            b8 = 9;
                        }
                        break;
                    case 1167648233:
                        if (strF0.equals("app_name")) {
                            b8 = 10;
                        }
                        break;
                    case 1826866896:
                        if (strF0.equals("app_build")) {
                            b8 = 11;
                        }
                        break;
                    case 1965003281:
                        if (strF0.equals("is_split_apks")) {
                            b8 = 12;
                        }
                        break;
                }
                switch (b8) {
                    case 0:
                        List list = (List) w8.y1();
                        if (list != null) {
                            c2539a.u(list);
                        }
                        break;
                    case 1:
                        c2539a.f27338c = w8.k0();
                        break;
                    case 2:
                        c2539a.f27345j = w8.k0();
                        break;
                    case 3:
                        List list2 = (List) w8.y1();
                        if (list2 != null) {
                            c2539a.x(list2);
                        }
                        break;
                    case 4:
                        c2539a.f27341f = w8.k0();
                        break;
                    case 5:
                        c2539a.f27346k = w8.Z0();
                        break;
                    case 6:
                        c2539a.f27339d = w8.k0();
                        break;
                    case 7:
                        c2539a.f27336a = w8.k0();
                        break;
                    case 8:
                        c2539a.f27337b = w8.S0(iLogger);
                        break;
                    case 9:
                        c2539a.f27343h = AbstractC2571c.b((Map) w8.y1());
                        break;
                    case 10:
                        c2539a.f27340e = w8.k0();
                        break;
                    case 11:
                        c2539a.f27342g = w8.k0();
                        break;
                    case 12:
                        c2539a.f27347l = w8.Z0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        w8.t0(iLogger, concurrentHashMap, strF0);
                        break;
                }
            }
            c2539a.w(concurrentHashMap);
            w8.u();
            return c2539a;
        }
    }

    public C2539a(C2539a c2539a) {
        this.f27342g = c2539a.f27342g;
        this.f27336a = c2539a.f27336a;
        this.f27340e = c2539a.f27340e;
        this.f27337b = c2539a.f27337b;
        this.f27341f = c2539a.f27341f;
        this.f27339d = c2539a.f27339d;
        this.f27338c = c2539a.f27338c;
        this.f27343h = AbstractC2571c.b(c2539a.f27343h);
        this.f27346k = c2539a.f27346k;
        this.f27344i = AbstractC2571c.a(c2539a.f27344i);
        this.f27345j = c2539a.f27345j;
        this.f27347l = c2539a.f27347l;
        this.f27348m = c2539a.f27348m;
        this.f27349n = AbstractC2571c.b(c2539a.f27349n);
    }
}
