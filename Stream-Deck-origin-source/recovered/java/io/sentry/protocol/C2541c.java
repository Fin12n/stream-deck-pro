package io.sentry.protocol;

import Z.JTT.ryTuoS;
import com.amazon.device.simplesignin.model.request.wwj.WaYxBuDSBD;
import io.sentry.ILogger;
import io.sentry.InterfaceC2480b0;
import io.sentry.InterfaceC2524m0;
import io.sentry.InterfaceC2582w0;
import io.sentry.W0;
import io.sentry.X0;
import io.sentry.d3;
import io.sentry.util.C2569a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class C2541c implements InterfaceC2582w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f27353a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2569a f27354b = new C2569a();

    /* JADX INFO: renamed from: io.sentry.protocol.c$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2524m0 {
        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2541c a(W0 w8, ILogger iLogger) {
            C2541c c2541c = new C2541c();
            w8.x();
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                byte b8 = -1;
                switch (strF0.hashCode()) {
                    case -1335157162:
                        if (strF0.equals("device")) {
                            b8 = 0;
                        }
                        break;
                    case -895679987:
                        if (strF0.equals("spring")) {
                            b8 = 1;
                        }
                        break;
                    case -340323263:
                        if (strF0.equals(WaYxBuDSBD.FNtMoEjmUYlTGJ)) {
                            b8 = 2;
                        }
                        break;
                    case 3556:
                        if (strF0.equals("os")) {
                            b8 = 3;
                        }
                        break;
                    case 96801:
                        if (strF0.equals("app")) {
                            b8 = 4;
                        }
                        break;
                    case 102572:
                        if (strF0.equals("gpu")) {
                            b8 = 5;
                        }
                        break;
                    case 110620997:
                        if (strF0.equals("trace")) {
                            b8 = 6;
                        }
                        break;
                    case 150940456:
                        if (strF0.equals("browser")) {
                            b8 = 7;
                        }
                        break;
                    case 1550962648:
                        if (strF0.equals("runtime")) {
                            b8 = 8;
                        }
                        break;
                }
                switch (b8) {
                    case 0:
                        c2541c.o(new C2543e.a().a(w8, iLogger));
                        break;
                    case 1:
                        c2541c.t(new C.a().a(w8, iLogger));
                        break;
                    case 2:
                        c2541c.r(new m.a().a(w8, iLogger));
                        break;
                    case 3:
                        c2541c.q(new k.a().a(w8, iLogger));
                        break;
                    case 4:
                        c2541c.m(new C2539a.C0602a().a(w8, iLogger));
                        break;
                    case 5:
                        c2541c.p(new C2545g.a().a(w8, iLogger));
                        break;
                    case 6:
                        c2541c.u(new d3.a().a(w8, iLogger));
                        break;
                    case 7:
                        c2541c.n(new C2540b.a().a(w8, iLogger));
                        break;
                    case 8:
                        c2541c.s(new w.a().a(w8, iLogger));
                        break;
                    default:
                        Object objY1 = w8.y1();
                        if (objY1 != null) {
                            c2541c.j(strF0, objY1);
                        }
                        break;
                }
            }
            w8.u();
            return c2541c;
        }
    }

    public C2541c() {
    }

    public boolean a(Object obj) {
        return this.f27353a.containsKey(obj);
    }

    public Set b() {
        return this.f27353a.entrySet();
    }

    public Object c(Object obj) {
        return this.f27353a.get(obj);
    }

    public C2539a d() {
        return (C2539a) v("app", C2539a.class);
    }

    public C2543e e() {
        return (C2543e) v("device", C2543e.class);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C2541c)) {
            return false;
        }
        return this.f27353a.equals(((C2541c) obj).f27353a);
    }

    public k f() {
        return (k) v("os", k.class);
    }

    public w g() {
        return (w) v("runtime", w.class);
    }

    public d3 h() {
        return (d3) v("trace", d3.class);
    }

    public int hashCode() {
        return this.f27353a.hashCode();
    }

    public Enumeration i() {
        return this.f27353a.keys();
    }

    public Object j(String str, Object obj) {
        return this.f27353a.put(str, obj);
    }

    public void k(C2541c c2541c) {
        this.f27353a.putAll(c2541c.f27353a);
    }

    public Object l(Object obj) {
        return this.f27353a.remove(obj);
    }

    public void m(C2539a c2539a) {
        j("app", c2539a);
    }

    public void n(C2540b c2540b) {
        j("browser", c2540b);
    }

    public void o(C2543e c2543e) {
        j("device", c2543e);
    }

    public void p(C2545g c2545g) {
        j("gpu", c2545g);
    }

    public void q(k kVar) {
        j("os", kVar);
    }

    public void r(m mVar) {
        InterfaceC2480b0 interfaceC2480b0A = this.f27354b.a();
        try {
            j("response", mVar);
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
        } catch (Throwable th) {
            if (interfaceC2480b0A != null) {
                try {
                    interfaceC2480b0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void s(w wVar) {
        j("runtime", wVar);
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.x();
        ArrayList<String> list = Collections.list(i());
        Collections.sort(list);
        for (String str : list) {
            Object objC = c(str);
            if (objC != null) {
                x8.k(str).g(iLogger, objC);
            }
        }
        x8.u();
    }

    public void t(C c8) {
        j("spring", c8);
    }

    public void u(d3 d3Var) {
        io.sentry.util.u.c(d3Var, "traceContext is required");
        j("trace", d3Var);
    }

    public final Object v(String str, Class cls) {
        Object objC = c(str);
        if (cls.isInstance(objC)) {
            return cls.cast(objC);
        }
        return null;
    }

    public C2541c(C2541c c2541c) {
        for (Map.Entry entry : c2541c.b()) {
            if (entry != null) {
                Object value = entry.getValue();
                if ("app".equals(entry.getKey()) && (value instanceof C2539a)) {
                    m(new C2539a((C2539a) value));
                } else if (ryTuoS.Hitp.equals(entry.getKey()) && (value instanceof C2540b)) {
                    n(new C2540b((C2540b) value));
                } else if ("device".equals(entry.getKey()) && (value instanceof C2543e)) {
                    o(new C2543e((C2543e) value));
                } else if ("os".equals(entry.getKey()) && (value instanceof k)) {
                    q(new k((k) value));
                } else if ("runtime".equals(entry.getKey()) && (value instanceof w)) {
                    s(new w((w) value));
                } else if ("gpu".equals(entry.getKey()) && (value instanceof C2545g)) {
                    p(new C2545g((C2545g) value));
                } else if ("trace".equals(entry.getKey()) && (value instanceof d3)) {
                    u(new d3((d3) value));
                } else if ("response".equals(entry.getKey()) && (value instanceof m)) {
                    r(new m((m) value));
                } else if ("spring".equals(entry.getKey()) && (value instanceof C)) {
                    t(new C((C) value));
                } else {
                    j((String) entry.getKey(), value);
                }
            }
        }
    }
}
