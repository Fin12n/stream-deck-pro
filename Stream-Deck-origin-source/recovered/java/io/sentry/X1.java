package io.sentry;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import p090k.zI.jULK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class X1 implements InterfaceC2582w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.sentry.protocol.u f26043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io.sentry.protocol.o f26044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p3 f26045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Date f26046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map f26047e;

    public X1(io.sentry.protocol.u uVar, io.sentry.protocol.o oVar) {
        this(uVar, oVar, null);
    }

    public io.sentry.protocol.u a() {
        return this.f26043a;
    }

    public io.sentry.protocol.o b() {
        return this.f26044b;
    }

    public p3 c() {
        return this.f26045c;
    }

    public void d(Date date) {
        this.f26046d = date;
    }

    public void e(Map map) {
        this.f26047e = map;
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.x();
        if (this.f26043a != null) {
            x8.k("event_id").g(iLogger, this.f26043a);
        }
        if (this.f26044b != null) {
            x8.k("sdk").g(iLogger, this.f26044b);
        }
        if (this.f26045c != null) {
            x8.k("trace").g(iLogger, this.f26045c);
        }
        if (this.f26046d != null) {
            x8.k("sent_at").g(iLogger, AbstractC2519l.g(this.f26046d));
        }
        Map map = this.f26047e;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f26047e.get(str);
                x8.k(str);
                x8.g(iLogger, obj);
            }
        }
        x8.u();
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2524m0 {
        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public X1 a(W0 w8, ILogger iLogger) {
            w8.x();
            io.sentry.protocol.u uVar = null;
            io.sentry.protocol.o oVar = null;
            p3 p3Var = null;
            Date dateS0 = null;
            HashMap map = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                byte b8 = -1;
                switch (strF0.hashCode()) {
                    case 113722:
                        if (strF0.equals("sdk")) {
                            b8 = 0;
                        }
                        break;
                    case 110620997:
                        if (strF0.equals("trace")) {
                            b8 = 1;
                        }
                        break;
                    case 278118624:
                        if (strF0.equals(jULK.NaQZ)) {
                            b8 = 2;
                        }
                        break;
                    case 1980389946:
                        if (strF0.equals("sent_at")) {
                            b8 = 3;
                        }
                        break;
                }
                switch (b8) {
                    case 0:
                        oVar = (io.sentry.protocol.o) w8.m1(iLogger, new io.sentry.protocol.o.a());
                        break;
                    case 1:
                        p3Var = (p3) w8.m1(iLogger, new p3.a());
                        break;
                    case 2:
                        uVar = (io.sentry.protocol.u) w8.m1(iLogger, new io.sentry.protocol.u.a());
                        break;
                    case 3:
                        dateS0 = w8.S0(iLogger);
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        w8.t0(iLogger, map, strF0);
                        break;
                }
            }
            X1 x8 = new X1(uVar, oVar, p3Var);
            x8.d(dateS0);
            x8.e(map);
            w8.u();
            return x8;
        }
    }

    public X1(io.sentry.protocol.u uVar, io.sentry.protocol.o oVar, p3 p3Var) {
        this.f26043a = uVar;
        this.f26044b = oVar;
        this.f26045c = p3Var;
    }

    public X1(io.sentry.protocol.u uVar) {
        this(uVar, null);
    }

    public X1() {
        this(new io.sentry.protocol.u());
    }
}
