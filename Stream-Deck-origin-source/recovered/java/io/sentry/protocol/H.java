package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.InterfaceC2524m0;
import io.sentry.InterfaceC2582w0;
import io.sentry.W0;
import io.sentry.X0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p181u6.GfRt.QhsKALGiniuQ;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class H implements InterfaceC2582w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f27324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f27325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f27326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f27327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Double f27328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Double f27329f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Double f27330g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Double f27331h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f27332i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Double f27333j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f27334k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Map f27335l;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2524m0 {
        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public H a(W0 w8, ILogger iLogger) {
            H h8 = new H();
            w8.x();
            HashMap map = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                byte b8 = -1;
                switch (strF0.hashCode()) {
                    case -1784982718:
                        if (strF0.equals("rendering_system")) {
                            b8 = 0;
                        }
                        break;
                    case -1618432855:
                        if (strF0.equals("identifier")) {
                            b8 = 1;
                        }
                        break;
                    case -1221029593:
                        if (strF0.equals("height")) {
                            b8 = 2;
                        }
                        break;
                    case 120:
                        if (strF0.equals("x")) {
                            b8 = 3;
                        }
                        break;
                    case 121:
                        if (strF0.equals("y")) {
                            b8 = 4;
                        }
                        break;
                    case 114586:
                        if (strF0.equals("tag")) {
                            b8 = 5;
                        }
                        break;
                    case 3575610:
                        if (strF0.equals("type")) {
                            b8 = 6;
                        }
                        break;
                    case 92909918:
                        if (strF0.equals(QhsKALGiniuQ.UVqBpcJgQXQf)) {
                            b8 = 7;
                        }
                        break;
                    case 113126854:
                        if (strF0.equals("width")) {
                            b8 = 8;
                        }
                        break;
                    case 1659526655:
                        if (strF0.equals("children")) {
                            b8 = 9;
                        }
                        break;
                    case 1941332754:
                        if (strF0.equals("visibility")) {
                            b8 = 10;
                        }
                        break;
                }
                switch (b8) {
                    case 0:
                        h8.f27324a = w8.k0();
                        break;
                    case 1:
                        h8.f27326c = w8.k0();
                        break;
                    case 2:
                        h8.f27329f = w8.D0();
                        break;
                    case 3:
                        h8.f27330g = w8.D0();
                        break;
                    case 4:
                        h8.f27331h = w8.D0();
                        break;
                    case 5:
                        h8.f27327d = w8.k0();
                        break;
                    case 6:
                        h8.f27325b = w8.k0();
                        break;
                    case 7:
                        h8.f27333j = w8.D0();
                        break;
                    case 8:
                        h8.f27328e = w8.D0();
                        break;
                    case 9:
                        h8.f27334k = w8.O1(iLogger, this);
                        break;
                    case 10:
                        h8.f27332i = w8.k0();
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        w8.t0(iLogger, map, strF0);
                        break;
                }
            }
            w8.u();
            h8.q(map);
            return h8;
        }
    }

    public void l(Double d8) {
        this.f27333j = d8;
    }

    public void m(List list) {
        this.f27334k = list;
    }

    public void n(Double d8) {
        this.f27329f = d8;
    }

    public void o(String str) {
        this.f27326c = str;
    }

    public void p(String str) {
        this.f27325b = str;
    }

    public void q(Map map) {
        this.f27335l = map;
    }

    public void r(String str) {
        this.f27332i = str;
    }

    public void s(Double d8) {
        this.f27328e = d8;
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.x();
        if (this.f27324a != null) {
            x8.k("rendering_system").c(this.f27324a);
        }
        if (this.f27325b != null) {
            x8.k("type").c(this.f27325b);
        }
        if (this.f27326c != null) {
            x8.k("identifier").c(this.f27326c);
        }
        if (this.f27327d != null) {
            x8.k("tag").c(this.f27327d);
        }
        if (this.f27328e != null) {
            x8.k("width").f(this.f27328e);
        }
        if (this.f27329f != null) {
            x8.k("height").f(this.f27329f);
        }
        if (this.f27330g != null) {
            x8.k("x").f(this.f27330g);
        }
        if (this.f27331h != null) {
            x8.k("y").f(this.f27331h);
        }
        if (this.f27332i != null) {
            x8.k("visibility").c(this.f27332i);
        }
        if (this.f27333j != null) {
            x8.k("alpha").f(this.f27333j);
        }
        List list = this.f27334k;
        if (list != null && !list.isEmpty()) {
            x8.k("children").g(iLogger, this.f27334k);
        }
        Map map = this.f27335l;
        if (map != null) {
            for (String str : map.keySet()) {
                x8.k(str).g(iLogger, this.f27335l.get(str));
            }
        }
        x8.u();
    }

    public void t(Double d8) {
        this.f27330g = d8;
    }

    public void u(Double d8) {
        this.f27331h = d8;
    }
}
