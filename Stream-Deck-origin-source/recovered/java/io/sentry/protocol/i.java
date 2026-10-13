package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.InterfaceC2524m0;
import io.sentry.InterfaceC2582w0;
import io.sentry.W0;
import io.sentry.X0;
import io.sentry.util.AbstractC2571c;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements InterfaceC2582w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient Thread f27409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f27410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f27411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f27412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f27413e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f27414f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Map f27415g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Boolean f27416h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Integer f27417i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Integer f27418j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Boolean f27419k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Map f27420l;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2524m0 {
        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(W0 w8, ILogger iLogger) {
            i iVar = new i();
            w8.x();
            HashMap map = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                switch (strF0) {
                    case "description":
                        iVar.f27411c = w8.k0();
                        break;
                    case "exception_id":
                        iVar.f27417i = w8.T();
                        break;
                    case "data":
                        iVar.f27415g = AbstractC2571c.b((Map) w8.y1());
                        break;
                    case "meta":
                        iVar.f27414f = AbstractC2571c.b((Map) w8.y1());
                        break;
                    case "type":
                        iVar.f27410b = w8.k0();
                        break;
                    case "handled":
                        iVar.f27413e = w8.Z0();
                        break;
                    case "synthetic":
                        iVar.f27416h = w8.Z0();
                        break;
                    case "is_exception_group":
                        iVar.f27419k = w8.Z0();
                        break;
                    case "help_link":
                        iVar.f27412d = w8.k0();
                        break;
                    case "parent_id":
                        iVar.f27418j = w8.T();
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
            iVar.q(map);
            return iVar;
        }
    }

    public i() {
        this(null);
    }

    public String k() {
        return this.f27410b;
    }

    public Boolean l() {
        return this.f27413e;
    }

    public void m(Integer num) {
        this.f27417i = num;
    }

    public void n(Boolean bool) {
        this.f27413e = bool;
    }

    public void o(Integer num) {
        this.f27418j = num;
    }

    public void p(String str) {
        this.f27410b = str;
    }

    public void q(Map map) {
        this.f27420l = map;
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.x();
        if (this.f27410b != null) {
            x8.k("type").c(this.f27410b);
        }
        if (this.f27411c != null) {
            x8.k(com.amazon.a.a.o.b.f16728c).c(this.f27411c);
        }
        if (this.f27412d != null) {
            x8.k("help_link").c(this.f27412d);
        }
        if (this.f27413e != null) {
            x8.k("handled").h(this.f27413e);
        }
        if (this.f27414f != null) {
            x8.k("meta").g(iLogger, this.f27414f);
        }
        if (this.f27415g != null) {
            x8.k("data").g(iLogger, this.f27415g);
        }
        if (this.f27416h != null) {
            x8.k("synthetic").h(this.f27416h);
        }
        if (this.f27417i != null) {
            x8.k("exception_id").g(iLogger, this.f27417i);
        }
        if (this.f27418j != null) {
            x8.k("parent_id").g(iLogger, this.f27418j);
        }
        if (this.f27419k != null) {
            x8.k("is_exception_group").h(this.f27419k);
        }
        Map map = this.f27420l;
        if (map != null) {
            for (String str : map.keySet()) {
                x8.k(str).g(iLogger, this.f27420l.get(str));
            }
        }
        x8.u();
    }

    public i(Thread thread) {
        this.f27409a = thread;
    }
}
