package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.InterfaceC2524m0;
import io.sentry.InterfaceC2582w0;
import io.sentry.W0;
import io.sentry.X0;
import java.util.HashMap;
import java.util.Map;
import p116m7.kKPq.toqHM;
import p179u4.eubL.OjEsfyJYzbPn;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class p implements InterfaceC2582w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f27460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f27461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f27462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f27463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z f27464e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i f27465f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Map f27466g;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2524m0 {
        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public p a(W0 w8, ILogger iLogger) {
            p pVar = new p();
            w8.x();
            HashMap map = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                byte b8 = -1;
                switch (strF0.hashCode()) {
                    case -1562235024:
                        if (strF0.equals("thread_id")) {
                            b8 = 0;
                        }
                        break;
                    case -1068784020:
                        if (strF0.equals("module")) {
                            b8 = 1;
                        }
                        break;
                    case 3575610:
                        if (strF0.equals("type")) {
                            b8 = 2;
                        }
                        break;
                    case 111972721:
                        if (strF0.equals("value")) {
                            b8 = 3;
                        }
                        break;
                    case 1225089881:
                        if (strF0.equals("mechanism")) {
                            b8 = 4;
                        }
                        break;
                    case 2055832509:
                        if (strF0.equals(toqHM.OGQCRNg)) {
                            b8 = 5;
                        }
                        break;
                }
                switch (b8) {
                    case 0:
                        pVar.f27463d = w8.a0();
                        break;
                    case 1:
                        pVar.f27462c = w8.k0();
                        break;
                    case 2:
                        pVar.f27460a = w8.k0();
                        break;
                    case 3:
                        pVar.f27461b = w8.k0();
                        break;
                    case 4:
                        pVar.f27465f = (i) w8.m1(iLogger, new i.a());
                        break;
                    case 5:
                        pVar.f27464e = (z) w8.m1(iLogger, new z.a());
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
            pVar.q(map);
            return pVar;
        }
    }

    public i g() {
        return this.f27465f;
    }

    public String h() {
        return this.f27462c;
    }

    public z i() {
        return this.f27464e;
    }

    public Long j() {
        return this.f27463d;
    }

    public String k() {
        return this.f27460a;
    }

    public void l(i iVar) {
        this.f27465f = iVar;
    }

    public void m(String str) {
        this.f27462c = str;
    }

    public void n(z zVar) {
        this.f27464e = zVar;
    }

    public void o(Long l8) {
        this.f27463d = l8;
    }

    public void p(String str) {
        this.f27460a = str;
    }

    public void q(Map map) {
        this.f27466g = map;
    }

    public void r(String str) {
        this.f27461b = str;
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.x();
        if (this.f27460a != null) {
            x8.k("type").c(this.f27460a);
        }
        if (this.f27461b != null) {
            x8.k(OjEsfyJYzbPn.domaUjkxbNlTBSG).c(this.f27461b);
        }
        if (this.f27462c != null) {
            x8.k("module").c(this.f27462c);
        }
        if (this.f27463d != null) {
            x8.k("thread_id").f(this.f27463d);
        }
        if (this.f27464e != null) {
            x8.k("stacktrace").g(iLogger, this.f27464e);
        }
        if (this.f27465f != null) {
            x8.k("mechanism").g(iLogger, this.f27465f);
        }
        Map map = this.f27466g;
        if (map != null) {
            for (String str : map.keySet()) {
                x8.k(str).g(iLogger, this.f27466g.get(str));
            }
        }
        x8.u();
    }
}
