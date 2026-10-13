package io.sentry.protocol;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.AbstractC2519l;
import io.sentry.ILogger;
import io.sentry.InterfaceC2524m0;
import io.sentry.InterfaceC2582w0;
import io.sentry.P1;
import io.sentry.V2;
import io.sentry.W0;
import io.sentry.X0;
import io.sentry.c3;
import io.sentry.d3;
import io.sentry.r3;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class B extends P1 implements InterfaceC2582w0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f27301p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Double f27302q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Double f27303r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List f27304s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f27305t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Map f27306u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public D f27307v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Map f27308w;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2524m0 {
        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public B a(W0 w8, ILogger iLogger) {
            w8.x();
            B b8 = new B("", Double.valueOf(0.0d), null, new ArrayList(), new HashMap(), new D(E.CUSTOM.apiName()));
            P1.a aVar = new P1.a();
            ConcurrentHashMap concurrentHashMap = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                switch (strF0) {
                    case "start_timestamp":
                        try {
                            Double dD0 = w8.D0();
                            if (dD0 != null) {
                                b8.f27302q = dD0;
                            }
                            break;
                        } catch (NumberFormatException unused) {
                            Date dateS0 = w8.S0(iLogger);
                            if (dateS0 != null) {
                                b8.f27302q = Double.valueOf(AbstractC2519l.b(dateS0));
                            }
                            break;
                        }
                        break;
                    case "measurements":
                        Map mapQ0 = w8.q0(iLogger, new C2546h.a());
                        if (mapQ0 != null) {
                            b8.f27306u.putAll(mapQ0);
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "type":
                        w8.G();
                        break;
                    case "timestamp":
                        try {
                            Double dD1 = w8.D0();
                            if (dD1 != null) {
                                b8.f27303r = dD1;
                            }
                            break;
                        } catch (NumberFormatException unused2) {
                            Date dateS1 = w8.S0(iLogger);
                            if (dateS1 != null) {
                                b8.f27303r = Double.valueOf(AbstractC2519l.b(dateS1));
                            }
                            break;
                        }
                        break;
                    case "spans":
                        List listO1 = w8.O1(iLogger, new x.a());
                        if (listO1 != null) {
                            b8.f27304s.addAll(listO1);
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "transaction_info":
                        b8.f27307v = new D.a().a(w8, iLogger);
                        break;
                    case "transaction":
                        b8.f27301p = w8.k0();
                        break;
                    default:
                        if (aVar.a(b8, strF0, w8, iLogger)) {
                            break;
                        } else {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            w8.t0(iLogger, concurrentHashMap, strF0);
                            break;
                        }
                        break;
                }
            }
            b8.s0(concurrentHashMap);
            w8.u();
            return b8;
        }
    }

    public B(V2 v8) {
        super(v8.n());
        this.f27304s = new ArrayList();
        this.f27305t = "transaction";
        this.f27306u = new HashMap();
        io.sentry.util.u.c(v8, "sentryTracer is required");
        this.f27302q = Double.valueOf(AbstractC2519l.l(v8.u().j()));
        this.f27303r = Double.valueOf(AbstractC2519l.l(v8.u().e(v8.r())));
        this.f27301p = v8.getName();
        for (c3 c3Var : v8.I()) {
            if (Boolean.TRUE.equals(c3Var.H())) {
                this.f27304s.add(new x(c3Var));
            }
        }
        C2541c c2541cC = C();
        c2541cC.k(v8.J());
        d3 d3VarP = v8.p();
        Map mapK = v8.K();
        d3 d3Var = new d3(d3VarP.n(), d3VarP.k(), d3VarP.g(), d3VarP.e(), d3VarP.c(), d3VarP.j(), d3VarP.l(), d3VarP.f());
        for (Map.Entry entry : d3VarP.m().entrySet()) {
            c0((String) entry.getKey(), (String) entry.getValue());
        }
        if (mapK != null) {
            for (Map.Entry entry2 : mapK.entrySet()) {
                d3Var.o((String) entry2.getKey(), entry2.getValue());
            }
        }
        c2541cC.u(d3Var);
        this.f27307v = new D(v8.O().apiName());
    }

    private BigDecimal l0(Double d8) {
        return BigDecimal.valueOf(d8.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    public Map m0() {
        return this.f27306u;
    }

    public r3 n0() {
        d3 d3VarH = C().h();
        if (d3VarH == null) {
            return null;
        }
        return d3VarH.j();
    }

    public List o0() {
        return this.f27304s;
    }

    public String p0() {
        return this.f27301p;
    }

    public boolean q0() {
        return this.f27303r != null;
    }

    public boolean r0() {
        r3 r3VarN0 = n0();
        if (r3VarN0 == null) {
            return false;
        }
        return r3VarN0.e().booleanValue();
    }

    public void s0(Map map) {
        this.f27308w = map;
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.x();
        if (this.f27301p != null) {
            x8.k("transaction").c(this.f27301p);
        }
        x8.k("start_timestamp").g(iLogger, l0(this.f27302q));
        if (this.f27303r != null) {
            x8.k(DiagnosticsEntry.TIMESTAMP_KEY).g(iLogger, l0(this.f27303r));
        }
        if (!this.f27304s.isEmpty()) {
            x8.k("spans").g(iLogger, this.f27304s);
        }
        x8.k("type").c("transaction");
        if (!this.f27306u.isEmpty()) {
            x8.k("measurements").g(iLogger, this.f27306u);
        }
        x8.k("transaction_info").g(iLogger, this.f27307v);
        new P1.b().a(this, x8, iLogger);
        Map map = this.f27308w;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f27308w.get(str);
                x8.k(str);
                x8.g(iLogger, obj);
            }
        }
        x8.u();
    }

    public B(String str, Double d8, Double d9, List<x> list, Map<String, C2546h> map, D d10) {
        ArrayList arrayList = new ArrayList();
        this.f27304s = arrayList;
        this.f27305t = "transaction";
        HashMap map2 = new HashMap();
        this.f27306u = map2;
        this.f27301p = str;
        this.f27302q = d8;
        this.f27303r = d9;
        arrayList.addAll(list);
        map2.putAll(map);
        Iterator<x> it = list.iterator();
        while (it.hasNext()) {
            this.f27306u.putAll(it.next().c());
        }
        this.f27307v = d10;
    }
}
