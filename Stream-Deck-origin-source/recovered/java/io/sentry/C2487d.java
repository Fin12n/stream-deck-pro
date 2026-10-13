package io.sentry;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2487d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Integer f27066f = 8192;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Integer f27067g = 64;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f27068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f27069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f27070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f27071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ILogger f27072e;

    /* JADX INFO: renamed from: io.sentry.d$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final List f27073a = Arrays.asList("sentry-trace_id", "sentry-public_key", "sentry-release", "sentry-user_id", "sentry-environment", "sentry-transaction", "sentry-sample_rate", "sentry-sample_rand", "sentry-sampled", "sentry-replay_id");
    }

    public C2487d(ILogger iLogger) {
        this(new HashMap(), null, true, false, iLogger);
    }

    public static C2487d c(C2557s2 c2557s2, J2 j8) {
        C2487d c2487d = new C2487d(j8.getLogger());
        d3 d3VarH = c2557s2.C().h();
        c2487d.I(d3VarH != null ? d3VarH.n().toString() : null);
        c2487d.B(j8.retrieveParsedDsn().a());
        c2487d.C(c2557s2.J());
        c2487d.A(c2557s2.F());
        c2487d.J(c2557s2.v0());
        c2487d.G(null);
        c2487d.H(null);
        c2487d.E(null);
        Object objC = c2557s2.C().c("replay_id");
        if (objC != null && !objC.toString().equals(io.sentry.protocol.u.f27472b.toString())) {
            c2487d.D(objC.toString());
            c2557s2.C().l("replay_id");
        }
        c2487d.b();
        return c2487d;
    }

    public static boolean r(io.sentry.protocol.E e8) {
        return (e8 == null || io.sentry.protocol.E.URL.equals(e8)) ? false : true;
    }

    public static Double u(r3 r3Var) {
        if (r3Var == null) {
            return null;
        }
        return r3Var.c();
    }

    public static Double v(r3 r3Var) {
        if (r3Var == null) {
            return null;
        }
        return r3Var.d();
    }

    public static String w(Double d8) {
        if (io.sentry.util.y.g(d8, false)) {
            return new DecimalFormat("#.################", DecimalFormatSymbols.getInstance(Locale.ROOT)).format(d8);
        }
        return null;
    }

    public static Boolean x(r3 r3Var) {
        if (r3Var == null) {
            return null;
        }
        return r3Var.e();
    }

    public void A(String str) {
        y("sentry-environment", str);
    }

    public void B(String str) {
        y("sentry-public_key", str);
    }

    public void C(String str) {
        y("sentry-release", str);
    }

    public void D(String str) {
        y("sentry-replay_id", str);
    }

    public void E(String str) {
        y("sentry-sample_rand", str);
    }

    public void F(Double d8) {
        E(w(d8));
    }

    public void G(String str) {
        y("sentry-sample_rate", str);
    }

    public void H(String str) {
        y("sentry-sampled", str);
    }

    public void I(String str) {
        y("sentry-trace_id", str);
    }

    public void J(String str) {
        y("sentry-transaction", str);
    }

    public void K(r3 r3Var) {
        if (r3Var == null) {
            return;
        }
        H(io.sentry.util.B.g(x(r3Var)));
        if (r3Var.c() != null) {
            E(w(u(r3Var)));
        }
        if (r3Var.d() != null) {
            a(w(v(r3Var)));
        }
    }

    public void L(V v8, J2 j8) {
        C2505h1 c2505h1U = v8.u();
        io.sentry.protocol.u uVarT = v8.t();
        I(c2505h1U.e().toString());
        B(j8.retrieveParsedDsn().a());
        C(j8.getRelease());
        A(j8.getEnvironment());
        if (!io.sentry.protocol.u.f27472b.equals(uVarT)) {
            D(uVarT.toString());
        }
        J(null);
        G(null);
        H(null);
    }

    public void M(io.sentry.protocol.u uVar, io.sentry.protocol.u uVar2, J2 j8, r3 r3Var, String str, io.sentry.protocol.E e8) {
        I(uVar.toString());
        B(j8.retrieveParsedDsn().a());
        C(j8.getRelease());
        A(j8.getEnvironment());
        if (!r(e8)) {
            str = null;
        }
        J(str);
        if (uVar2 != null && !io.sentry.protocol.u.f27472b.equals(uVar2)) {
            D(uVar2.toString());
        }
        G(w(v(r3Var)));
        H(io.sentry.util.B.g(x(r3Var)));
        E(w(u(r3Var)));
    }

    public final Double N(String str) {
        if (str != null) {
            try {
                double d8 = Double.parseDouble(str);
                if (io.sentry.util.y.g(Double.valueOf(d8), false)) {
                    return Double.valueOf(d8);
                }
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public p3 O() {
        String strN = n();
        String strH = h();
        String strF = f();
        if (strN == null || strF == null) {
            return null;
        }
        io.sentry.protocol.u uVar = new io.sentry.protocol.u(strN);
        io.sentry.protocol.u uVar2 = null;
        String strG = g();
        String strE = e();
        String strQ = q();
        String strO = o();
        String strK = k();
        String strM = m();
        if (strH != null) {
            uVar2 = new io.sentry.protocol.u(strH);
        }
        p3 p3Var = new p3(uVar, strF, strG, strE, strQ, strO, strK, strM, uVar2, i());
        p3Var.c(p());
        return p3Var;
    }

    public void a(String str) {
        z("sentry-sample_rate", str, true);
    }

    public void b() {
        this.f27070c = false;
    }

    public String d(String str) {
        if (str == null) {
            return null;
        }
        return (String) this.f27068a.get(str);
    }

    public String e() {
        return d("sentry-environment");
    }

    public String f() {
        return d("sentry-public_key");
    }

    public String g() {
        return d("sentry-release");
    }

    public String h() {
        return d("sentry-replay_id");
    }

    public String i() {
        return d("sentry-sample_rand");
    }

    public Double j() {
        return N(i());
    }

    public String k() {
        return d("sentry-sample_rate");
    }

    public Double l() {
        return N(k());
    }

    public String m() {
        return d("sentry-sampled");
    }

    public String n() {
        return d("sentry-trace_id");
    }

    public String o() {
        return d("sentry-transaction");
    }

    public Map p() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry entry : this.f27068a.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (!a.f27073a.contains(str) && str2 != null) {
                concurrentHashMap.put(str.replaceFirst("sentry-", ""), str2);
            }
        }
        return concurrentHashMap;
    }

    public String q() {
        return d("sentry-user_id");
    }

    public boolean s() {
        return this.f27070c;
    }

    public boolean t() {
        return this.f27071d;
    }

    public void y(String str, String str2) {
        z(str, str2, false);
    }

    public final void z(String str, String str2, boolean z8) {
        if (this.f27070c || z8) {
            this.f27068a.put(str, str2);
        }
    }

    public C2487d(C2487d c2487d) {
        this(c2487d.f27068a, c2487d.f27069b, c2487d.f27070c, c2487d.f27071d, c2487d.f27072e);
    }

    public C2487d(Map<String, String> map, String str, boolean z8, boolean z9, ILogger iLogger) {
        this.f27068a = map;
        this.f27072e = iLogger;
        this.f27069b = str;
        this.f27070c = z8;
        this.f27071d = z9;
    }
}
