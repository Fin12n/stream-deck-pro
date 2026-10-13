package io.sentry;

import R0.pkXL.Oitvkwcwn;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.util.AbstractC2571c;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p043e6.dT.GIGvBf;

/* JADX INFO: renamed from: io.sentry.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2491e implements InterfaceC2582w0, Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f27091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Date f27092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f27093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f27094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f27095e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f27096f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f27097g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f27098h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public EnumC2596z2 f27099i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Map f27100j;

    /* JADX INFO: renamed from: io.sentry.e$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2524m0 {
        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2491e a(W0 w8, ILogger iLogger) {
            w8.x();
            Date dateC = AbstractC2519l.c();
            Map concurrentHashMap = new ConcurrentHashMap();
            String strK0 = null;
            String strK1 = null;
            String strK2 = null;
            String strK3 = null;
            EnumC2596z2 enumC2596z2A = null;
            ConcurrentHashMap concurrentHashMap2 = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                switch (strF0) {
                    case "origin":
                        strK3 = w8.k0();
                        break;
                    case "data":
                        Map mapB = AbstractC2571c.b((Map) w8.y1());
                        if (mapB == null) {
                            break;
                        } else {
                            concurrentHashMap = mapB;
                            break;
                        }
                        break;
                    case "type":
                        strK1 = w8.k0();
                        break;
                    case "category":
                        strK2 = w8.k0();
                        break;
                    case "timestamp":
                        Date dateS0 = w8.S0(iLogger);
                        if (dateS0 == null) {
                            break;
                        } else {
                            dateC = dateS0;
                            break;
                        }
                        break;
                    case "level":
                        try {
                            enumC2596z2A = new EnumC2596z2.a().a(w8, iLogger);
                            break;
                        } catch (Exception e8) {
                            iLogger.a(EnumC2596z2.ERROR, e8, "Error when deserializing SentryLevel", new Object[0]);
                            break;
                        }
                        break;
                    case "message":
                        strK0 = w8.k0();
                        break;
                    default:
                        if (concurrentHashMap2 == null) {
                            concurrentHashMap2 = new ConcurrentHashMap();
                        }
                        w8.t0(iLogger, concurrentHashMap2, strF0);
                        break;
                }
            }
            C2491e c2491e = new C2491e(dateC);
            c2491e.f27094d = strK0;
            c2491e.f27095e = strK1;
            c2491e.f27096f = concurrentHashMap;
            c2491e.f27097g = strK2;
            c2491e.f27098h = strK3;
            c2491e.f27099i = enumC2596z2A;
            c2491e.D(concurrentHashMap2);
            w8.u();
            return c2491e;
        }
    }

    public C2491e(Date date) {
        this.f27096f = new ConcurrentHashMap();
        this.f27093c = Long.valueOf(System.nanoTime());
        this.f27092b = date;
        this.f27091a = null;
    }

    public void A(EnumC2596z2 enumC2596z2) {
        this.f27099i = enumC2596z2;
    }

    public void B(String str) {
        this.f27094d = str;
    }

    public void C(String str) {
        this.f27095e = str;
    }

    public void D(Map map) {
        this.f27100j = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2491e.class == obj.getClass()) {
            C2491e c2491e = (C2491e) obj;
            if (w().getTime() == c2491e.w().getTime() && io.sentry.util.u.a(this.f27094d, c2491e.f27094d) && io.sentry.util.u.a(this.f27095e, c2491e.f27095e) && io.sentry.util.u.a(this.f27097g, c2491e.f27097g) && io.sentry.util.u.a(this.f27098h, c2491e.f27098h) && this.f27099i == c2491e.f27099i) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return io.sentry.util.u.b(this.f27092b, this.f27094d, this.f27095e, this.f27097g, this.f27098h, this.f27099i);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public int compareTo(C2491e c2491e) {
        return this.f27093c.compareTo(c2491e.f27093c);
    }

    public String s() {
        return this.f27097g;
    }

    public Map t() {
        return this.f27096f;
    }

    public EnumC2596z2 u() {
        return this.f27099i;
    }

    public String v() {
        return this.f27094d;
    }

    public Date w() {
        Date date = this.f27092b;
        if (date != null) {
            return (Date) date.clone();
        }
        Long l8 = this.f27091a;
        if (l8 == null) {
            throw new IllegalStateException("No timestamp set for breadcrumb");
        }
        Date dateD = AbstractC2519l.d(l8.longValue());
        this.f27092b = dateD;
        return dateD;
    }

    public String x() {
        return this.f27095e;
    }

    public void y(String str) {
        this.f27097g = str;
    }

    public void z(String str, Object obj) {
        this.f27096f.put(str, obj);
    }

    public static C2491e E(String str, String str2, String str3, String str4, Map map) {
        C2491e c2491e = new C2491e();
        c2491e.C("user");
        c2491e.y(Oitvkwcwn.pqZIpaYnsyhzfXR + str);
        if (str2 != null) {
            c2491e.z("view.id", str2);
        }
        if (str3 != null) {
            c2491e.z(Oitvkwcwn.PvfNhoJZkbWZHJ, str3);
        }
        if (str4 != null) {
            c2491e.z("view.tag", str4);
        }
        for (Map.Entry entry : map.entrySet()) {
            c2491e.t().put((String) entry.getKey(), entry.getValue());
        }
        c2491e.A(EnumC2596z2.INFO);
        return c2491e;
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.x();
        x8.k(DiagnosticsEntry.TIMESTAMP_KEY).g(iLogger, w());
        if (this.f27094d != null) {
            x8.k("message").c(this.f27094d);
        }
        if (this.f27095e != null) {
            x8.k("type").c(this.f27095e);
        }
        x8.k("data").g(iLogger, this.f27096f);
        if (this.f27097g != null) {
            x8.k(GIGvBf.amaqPxCSzUVdK).c(this.f27097g);
        }
        if (this.f27098h != null) {
            x8.k("origin").c(this.f27098h);
        }
        if (this.f27099i != null) {
            x8.k("level").g(iLogger, this.f27099i);
        }
        Map map = this.f27100j;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f27100j.get(str);
                x8.k(str);
                x8.g(iLogger, obj);
            }
        }
        x8.u();
    }

    public C2491e(long j8) {
        this.f27096f = new ConcurrentHashMap();
        this.f27093c = Long.valueOf(System.nanoTime());
        this.f27091a = Long.valueOf(j8);
        this.f27092b = null;
    }

    public C2491e(C2491e c2491e) {
        this.f27096f = new ConcurrentHashMap();
        this.f27093c = Long.valueOf(System.nanoTime());
        this.f27092b = c2491e.f27092b;
        this.f27091a = c2491e.f27091a;
        this.f27094d = c2491e.f27094d;
        this.f27095e = c2491e.f27095e;
        this.f27097g = c2491e.f27097g;
        this.f27098h = c2491e.f27098h;
        Map mapB = AbstractC2571c.b(c2491e.f27096f);
        if (mapB != null) {
            this.f27096f = mapB;
        }
        this.f27100j = AbstractC2571c.b(c2491e.f27100j);
        this.f27099i = c2491e.f27099i;
    }

    public C2491e() {
        this(System.currentTimeMillis());
    }

    public C2491e(String str) {
        this();
        this.f27094d = str;
    }
}
