package io.sentry;

import com.google.mlkit.common.internal.ckI.WqXA;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.jentz.winter.js.HRHLwtyqJWz;
import io.sentry.util.C2569a;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p090k.zI.jULK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class Y2 implements InterfaceC2582w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f26056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Date f26057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicInteger f26058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f26059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f26060e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Boolean f26061f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f26062g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Long f26063h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Double f26064i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f26065j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f26066k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f26067l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f26068m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f26069n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C2569a f26070o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Map f26071p;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2524m0 {
        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Y2 a(W0 w8, ILogger iLogger) throws Exception {
            w8.x();
            Integer numT = null;
            ConcurrentHashMap concurrentHashMap = null;
            b bVarValueOf = null;
            Date dateS0 = null;
            Date dateS1 = null;
            String strK0 = null;
            String str = null;
            Boolean boolZ0 = null;
            Long lA0 = null;
            Double dD0 = null;
            String strK1 = null;
            String strK2 = null;
            String strK3 = null;
            String strK4 = null;
            String strK5 = null;
            while (true) {
                Integer num = numT;
                ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
                b bVar = bVarValueOf;
                Date date = dateS0;
                Date date2 = dateS1;
                if (w8.peek() != io.sentry.vendor.gson.stream.b.NAME) {
                    if (bVar == null) {
                        throw c("status", iLogger);
                    }
                    if (date == null) {
                        throw c("started", iLogger);
                    }
                    if (num == null) {
                        throw c("errors", iLogger);
                    }
                    if (strK4 == null) {
                        throw c("release", iLogger);
                    }
                    Y2 y8 = new Y2(bVar, date, date2, num.intValue(), strK0, str, boolZ0, lA0, dD0, strK1, strK2, strK3, strK4, strK5);
                    y8.o(concurrentHashMap2);
                    w8.u();
                    return y8;
                }
                String strF0 = w8.F0();
                strF0.getClass();
                switch (strF0) {
                    case "duration":
                        dD0 = w8.D0();
                        numT = num;
                        concurrentHashMap = concurrentHashMap2;
                        bVarValueOf = bVar;
                        dateS0 = date;
                        dateS1 = date2;
                        break;
                    case "started":
                        dateS0 = w8.S0(iLogger);
                        numT = num;
                        concurrentHashMap = concurrentHashMap2;
                        bVarValueOf = bVar;
                        dateS1 = date2;
                        break;
                    case "errors":
                        numT = w8.T();
                        concurrentHashMap = concurrentHashMap2;
                        bVarValueOf = bVar;
                        dateS0 = date;
                        dateS1 = date2;
                        break;
                    case "status":
                        String strC = io.sentry.util.B.c(w8.k0());
                        if (strC != null) {
                            bVarValueOf = b.valueOf(strC);
                            numT = num;
                            concurrentHashMap = concurrentHashMap2;
                        } else {
                            numT = num;
                            concurrentHashMap = concurrentHashMap2;
                            bVarValueOf = bVar;
                        }
                        dateS0 = date;
                        dateS1 = date2;
                        break;
                    case "did":
                        strK0 = w8.k0();
                        numT = num;
                        concurrentHashMap = concurrentHashMap2;
                        bVarValueOf = bVar;
                        dateS0 = date;
                        dateS1 = date2;
                        break;
                    case "seq":
                        lA0 = w8.a0();
                        numT = num;
                        concurrentHashMap = concurrentHashMap2;
                        bVarValueOf = bVar;
                        dateS0 = date;
                        dateS1 = date2;
                        break;
                    case "sid":
                        String strK6 = w8.k0();
                        if (strK6 == null || !(strK6.length() == 36 || strK6.length() == 32)) {
                            iLogger.c(EnumC2596z2.ERROR, "%s sid is not valid.", strK6);
                        } else {
                            str = strK6;
                        }
                        numT = num;
                        concurrentHashMap = concurrentHashMap2;
                        bVarValueOf = bVar;
                        dateS0 = date;
                        dateS1 = date2;
                        break;
                    case "init":
                        boolZ0 = w8.Z0();
                        numT = num;
                        concurrentHashMap = concurrentHashMap2;
                        bVarValueOf = bVar;
                        dateS0 = date;
                        dateS1 = date2;
                        break;
                    case "timestamp":
                        dateS1 = w8.S0(iLogger);
                        numT = num;
                        concurrentHashMap = concurrentHashMap2;
                        bVarValueOf = bVar;
                        dateS0 = date;
                        break;
                    case "attrs":
                        w8.x();
                        while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                            String strF1 = w8.F0();
                            strF1.getClass();
                            switch (strF1) {
                                case "environment":
                                    strK3 = w8.k0();
                                    break;
                                case "release":
                                    strK4 = w8.k0();
                                    break;
                                case "ip_address":
                                    strK1 = w8.k0();
                                    break;
                                case "user_agent":
                                    strK2 = w8.k0();
                                    break;
                                default:
                                    w8.R();
                                    break;
                            }
                        }
                        w8.u();
                        numT = num;
                        concurrentHashMap = concurrentHashMap2;
                        bVarValueOf = bVar;
                        dateS0 = date;
                        dateS1 = date2;
                        break;
                    case "abnormal_mechanism":
                        strK5 = w8.k0();
                        numT = num;
                        concurrentHashMap = concurrentHashMap2;
                        bVarValueOf = bVar;
                        dateS0 = date;
                        dateS1 = date2;
                        break;
                    default:
                        concurrentHashMap = concurrentHashMap2 == null ? new ConcurrentHashMap() : concurrentHashMap2;
                        w8.t0(iLogger, concurrentHashMap, strF0);
                        numT = num;
                        bVarValueOf = bVar;
                        dateS0 = date;
                        dateS1 = date2;
                        break;
                }
            }
        }

        private Exception c(String str, ILogger iLogger) {
            String str2 = jULK.SAy + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.b(EnumC2596z2.ERROR, str2, illegalStateException);
            return illegalStateException;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum b {
        Ok,
        Exited,
        Crashed,
        Abnormal
    }

    public Y2(b bVar, Date date, Date date2, int i8, String str, String str2, Boolean bool, Long l8, Double d8, String str3, String str4, String str5, String str6, String str7) {
        this.f26070o = new C2569a();
        this.f26062g = bVar;
        this.f26056a = date;
        this.f26057b = date2;
        this.f26058c = new AtomicInteger(i8);
        this.f26059d = str;
        this.f26060e = str2;
        this.f26061f = bool;
        this.f26063h = l8;
        this.f26064i = d8;
        this.f26065j = str3;
        this.f26066k = str4;
        this.f26067l = str5;
        this.f26068m = str6;
        this.f26069n = str7;
    }

    public final double a(Date date) {
        return Math.abs(date.getTime() - this.f26056a.getTime()) / 1000.0d;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Y2 clone() {
        return new Y2(this.f26062g, this.f26056a, this.f26057b, this.f26058c.get(), this.f26059d, this.f26060e, this.f26061f, this.f26063h, this.f26064i, this.f26065j, this.f26066k, this.f26067l, this.f26068m, this.f26069n);
    }

    public void c() {
        d(AbstractC2519l.c());
    }

    public void d(Date date) {
        InterfaceC2480b0 interfaceC2480b0A = this.f26070o.a();
        try {
            this.f26061f = null;
            if (this.f26062g == b.Ok) {
                this.f26062g = b.Exited;
            }
            if (date != null) {
                this.f26057b = date;
            } else {
                this.f26057b = AbstractC2519l.c();
            }
            Date date2 = this.f26057b;
            if (date2 != null) {
                this.f26064i = Double.valueOf(a(date2));
                this.f26063h = Long.valueOf(i(this.f26057b));
            }
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

    public int e() {
        return this.f26058c.get();
    }

    public String f() {
        return this.f26069n;
    }

    public Boolean g() {
        return this.f26061f;
    }

    public String h() {
        return this.f26068m;
    }

    public final long i(Date date) {
        long time = date.getTime();
        return time < 0 ? Math.abs(time) : time;
    }

    public String j() {
        return this.f26060e;
    }

    public Date k() {
        Date date = this.f26056a;
        if (date == null) {
            return null;
        }
        return (Date) date.clone();
    }

    public b l() {
        return this.f26062g;
    }

    public boolean m() {
        return this.f26062g != b.Ok;
    }

    public void n() {
        this.f26061f = Boolean.TRUE;
    }

    public void o(Map map) {
        this.f26071p = map;
    }

    public boolean p(b bVar, String str, boolean z8) {
        return q(bVar, str, z8, null);
    }

    public boolean q(b bVar, String str, boolean z8, String str2) {
        boolean z9;
        InterfaceC2480b0 interfaceC2480b0A = this.f26070o.a();
        boolean z10 = true;
        if (bVar != null) {
            try {
                this.f26062g = bVar;
                z9 = true;
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
        } else {
            z9 = false;
        }
        if (str != null) {
            this.f26066k = str;
            z9 = true;
        }
        if (z8) {
            this.f26058c.addAndGet(1);
            z9 = true;
        }
        if (str2 != null) {
            this.f26069n = str2;
        } else {
            z10 = z9;
        }
        if (z10) {
            this.f26061f = null;
            Date dateC = AbstractC2519l.c();
            this.f26057b = dateC;
            if (dateC != null) {
                this.f26063h = Long.valueOf(i(dateC));
            }
        }
        if (interfaceC2480b0A != null) {
            interfaceC2480b0A.close();
        }
        return z10;
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.x();
        if (this.f26060e != null) {
            x8.k("sid").c(this.f26060e);
        }
        if (this.f26059d != null) {
            x8.k("did").c(this.f26059d);
        }
        if (this.f26061f != null) {
            x8.k("init").h(this.f26061f);
        }
        x8.k("started").g(iLogger, this.f26056a);
        x8.k(HRHLwtyqJWz.LSxCvOztO).g(iLogger, this.f26062g.name().toLowerCase(Locale.ROOT));
        if (this.f26063h != null) {
            x8.k("seq").f(this.f26063h);
        }
        x8.k("errors").a(this.f26058c.intValue());
        if (this.f26064i != null) {
            x8.k("duration").f(this.f26064i);
        }
        if (this.f26057b != null) {
            x8.k(DiagnosticsEntry.TIMESTAMP_KEY).g(iLogger, this.f26057b);
        }
        if (this.f26069n != null) {
            x8.k("abnormal_mechanism").g(iLogger, this.f26069n);
        }
        x8.k(WqXA.SvabSkUsqAJ);
        x8.x();
        x8.k("release").g(iLogger, this.f26068m);
        if (this.f26067l != null) {
            x8.k("environment").g(iLogger, this.f26067l);
        }
        if (this.f26065j != null) {
            x8.k("ip_address").g(iLogger, this.f26065j);
        }
        if (this.f26066k != null) {
            x8.k("user_agent").g(iLogger, this.f26066k);
        }
        x8.u();
        Map map = this.f26071p;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f26071p.get(str);
                x8.k(str);
                x8.g(iLogger, obj);
            }
        }
        x8.u();
    }

    public Y2(String str, io.sentry.protocol.F f8, String str2, String str3) {
        this(b.Ok, AbstractC2519l.c(), AbstractC2519l.c(), 0, str, W2.a(), Boolean.TRUE, null, null, f8 != null ? f8.j() : null, null, str2, str3, null);
    }
}
