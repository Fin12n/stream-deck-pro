package io.sentry;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.util.AbstractC2571c;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.s2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2557s2 extends P1 implements InterfaceC2582w0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Date f27620p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public io.sentry.protocol.j f27621q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f27622r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public X2 f27623s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public X2 f27624t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public EnumC2596z2 f27625u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f27626v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f27627w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Map f27628x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Map f27629y;

    /* JADX INFO: renamed from: io.sentry.s2$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2524m0 {
        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2557s2 a(W0 w8, ILogger iLogger) {
            w8.x();
            C2557s2 c2557s2 = new C2557s2();
            P1.a aVar = new P1.a();
            ConcurrentHashMap concurrentHashMap = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                switch (strF0) {
                    case "fingerprint":
                        List list = (List) w8.y1();
                        if (list == null) {
                            break;
                        } else {
                            c2557s2.f27627w = list;
                            break;
                        }
                        break;
                    case "threads":
                        w8.x();
                        w8.F0();
                        c2557s2.f27623s = new X2(w8.O1(iLogger, new io.sentry.protocol.A.a()));
                        w8.u();
                        break;
                    case "logger":
                        c2557s2.f27622r = w8.k0();
                        break;
                    case "timestamp":
                        Date dateS0 = w8.S0(iLogger);
                        if (dateS0 == null) {
                            break;
                        } else {
                            c2557s2.f27620p = dateS0;
                            break;
                        }
                        break;
                    case "level":
                        c2557s2.f27625u = (EnumC2596z2) w8.m1(iLogger, new EnumC2596z2.a());
                        break;
                    case "message":
                        c2557s2.f27621q = (io.sentry.protocol.j) w8.m1(iLogger, new io.sentry.protocol.j.a());
                        break;
                    case "modules":
                        c2557s2.f27629y = AbstractC2571c.b((Map) w8.y1());
                        break;
                    case "exception":
                        w8.x();
                        w8.F0();
                        c2557s2.f27624t = new X2(w8.O1(iLogger, new io.sentry.protocol.p.a()));
                        w8.u();
                        break;
                    case "transaction":
                        c2557s2.f27626v = w8.k0();
                        break;
                    default:
                        if (!aVar.a(c2557s2, strF0, w8, iLogger)) {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            w8.t0(iLogger, concurrentHashMap, strF0);
                            break;
                        } else {
                            break;
                        }
                        break;
                }
            }
            c2557s2.H0(concurrentHashMap);
            w8.u();
            return c2557s2;
        }
    }

    public C2557s2(io.sentry.protocol.u uVar, Date date) {
        super(uVar);
        this.f27620p = date;
    }

    public void A0(List list) {
        this.f27627w = list != null ? new ArrayList(list) : null;
    }

    public void B0(EnumC2596z2 enumC2596z2) {
        this.f27625u = enumC2596z2;
    }

    public void C0(io.sentry.protocol.j jVar) {
        this.f27621q = jVar;
    }

    public void D0(Map map) {
        this.f27629y = AbstractC2571c.c(map);
    }

    public void E0(List list) {
        this.f27623s = new X2(list);
    }

    public void F0(Date date) {
        this.f27620p = date;
    }

    public void G0(String str) {
        this.f27626v = str;
    }

    public void H0(Map map) {
        this.f27628x = map;
    }

    public List o0() {
        X2 x8 = this.f27624t;
        if (x8 == null) {
            return null;
        }
        return x8.a();
    }

    public List p0() {
        return this.f27627w;
    }

    public EnumC2596z2 q0() {
        return this.f27625u;
    }

    public io.sentry.protocol.j r0() {
        return this.f27621q;
    }

    public Map s0() {
        return this.f27629y;
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.x();
        x8.k(DiagnosticsEntry.TIMESTAMP_KEY).g(iLogger, this.f27620p);
        if (this.f27621q != null) {
            x8.k("message").g(iLogger, this.f27621q);
        }
        if (this.f27622r != null) {
            x8.k("logger").c(this.f27622r);
        }
        X2 x9 = this.f27623s;
        if (x9 != null && !x9.a().isEmpty()) {
            x8.k("threads");
            x8.x();
            x8.k("values").g(iLogger, this.f27623s.a());
            x8.u();
        }
        X2 x10 = this.f27624t;
        if (x10 != null && !x10.a().isEmpty()) {
            x8.k("exception");
            x8.x();
            x8.k("values").g(iLogger, this.f27624t.a());
            x8.u();
        }
        if (this.f27625u != null) {
            x8.k("level").g(iLogger, this.f27625u);
        }
        if (this.f27626v != null) {
            x8.k("transaction").c(this.f27626v);
        }
        if (this.f27627w != null) {
            x8.k("fingerprint").g(iLogger, this.f27627w);
        }
        if (this.f27629y != null) {
            x8.k("modules").g(iLogger, this.f27629y);
        }
        new P1.b().a(this, x8, iLogger);
        Map map = this.f27628x;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f27628x.get(str);
                x8.k(str);
                x8.g(iLogger, obj);
            }
        }
        x8.u();
    }

    public List t0() {
        X2 x8 = this.f27623s;
        if (x8 != null) {
            return x8.a();
        }
        return null;
    }

    public Date u0() {
        return (Date) this.f27620p.clone();
    }

    public String v0() {
        return this.f27626v;
    }

    public io.sentry.protocol.p w0() {
        X2 x8 = this.f27624t;
        if (x8 == null) {
            return null;
        }
        for (io.sentry.protocol.p pVar : x8.a()) {
            if (pVar.g() != null && pVar.g().l() != null && !pVar.g().l().booleanValue()) {
                return pVar;
            }
        }
        return null;
    }

    public boolean x0() {
        return w0() != null;
    }

    public boolean y0() {
        X2 x8 = this.f27624t;
        return (x8 == null || x8.a().isEmpty()) ? false : true;
    }

    public void z0(List list) {
        this.f27624t = new X2(list);
    }

    public C2557s2(Throwable th) {
        this();
        this.f25975j = th;
    }

    public C2557s2() {
        this(new io.sentry.protocol.u(), AbstractC2519l.c());
    }

    public C2557s2(Date date) {
        this(new io.sentry.protocol.u(), date);
    }
}
