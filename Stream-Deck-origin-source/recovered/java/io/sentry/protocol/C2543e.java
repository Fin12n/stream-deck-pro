package io.sentry.protocol;

import T0.Vl.PCRzgdeK;
import com.elgato.streamdeck.vsd2.KnownHost;
import com.elgato.vsd2.Messages;
import io.sentry.ILogger;
import io.sentry.InterfaceC2524m0;
import io.sentry.InterfaceC2582w0;
import io.sentry.W0;
import io.sentry.X0;
import io.sentry.util.AbstractC2571c;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2543e implements InterfaceC2582w0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f27358A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f27359B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public String f27360C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Float f27361D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Integer f27362E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public Double f27363F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public String f27364G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public Map f27365H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f27366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f27367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f27368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f27369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f27370e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f27371f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String[] f27372g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Float f27373h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Boolean f27374i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Boolean f27375j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f27376k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Boolean f27377l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Long f27378m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Long f27379n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Long f27380o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Boolean f27381p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Long f27382q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Long f27383r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Long f27384s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Long f27385t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Integer f27386u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Integer f27387v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Float f27388w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Integer f27389x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Date f27390y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public TimeZone f27391z;

    /* JADX INFO: renamed from: io.sentry.protocol.e$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum b implements InterfaceC2582w0 {
        PORTRAIT,
        LANDSCAPE;

        /* JADX INFO: renamed from: io.sentry.protocol.e$b$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements InterfaceC2524m0 {
            @Override // io.sentry.InterfaceC2524m0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b a(W0 w8, ILogger iLogger) {
                return b.valueOf(w8.G().toUpperCase(Locale.ROOT));
            }
        }

        @Override // io.sentry.InterfaceC2582w0
        public void serialize(X0 x8, ILogger iLogger) {
            x8.c(toString().toLowerCase(Locale.ROOT));
        }
    }

    public C2543e() {
    }

    public String H() {
        return this.f27360C;
    }

    public String I() {
        return this.f27358A;
    }

    public String J() {
        return this.f27359B;
    }

    public void K(String[] strArr) {
        this.f27372g = strArr;
    }

    public void L(Float f8) {
        this.f27373h = f8;
    }

    public void M(Float f8) {
        this.f27361D = f8;
    }

    public void N(Date date) {
        this.f27390y = date;
    }

    public void O(String str) {
        this.f27368c = str;
    }

    public void P(Boolean bool) {
        this.f27374i = bool;
    }

    public void Q(String str) {
        this.f27360C = str;
    }

    public void R(Long l8) {
        this.f27385t = l8;
    }

    public void S(Long l8) {
        this.f27384s = l8;
    }

    public void T(String str) {
        this.f27369d = str;
    }

    public void U(Long l8) {
        this.f27379n = l8;
    }

    public void V(Long l8) {
        this.f27383r = l8;
    }

    public void W(String str) {
        this.f27358A = str;
    }

    public void X(String str) {
        this.f27359B = str;
    }

    public void Y(Boolean bool) {
        this.f27381p = bool;
    }

    public void Z(String str) {
        this.f27367b = str;
    }

    public void a0(Long l8) {
        this.f27378m = l8;
    }

    public void b0(String str) {
        this.f27370e = str;
    }

    public void c0(String str) {
        this.f27371f = str;
    }

    public void d0(String str) {
        this.f27366a = str;
    }

    public void e0(Boolean bool) {
        this.f27375j = bool;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2543e.class == obj.getClass()) {
            C2543e c2543e = (C2543e) obj;
            if (io.sentry.util.u.a(this.f27366a, c2543e.f27366a) && io.sentry.util.u.a(this.f27367b, c2543e.f27367b) && io.sentry.util.u.a(this.f27368c, c2543e.f27368c) && io.sentry.util.u.a(this.f27369d, c2543e.f27369d) && io.sentry.util.u.a(this.f27370e, c2543e.f27370e) && io.sentry.util.u.a(this.f27371f, c2543e.f27371f) && Arrays.equals(this.f27372g, c2543e.f27372g) && io.sentry.util.u.a(this.f27373h, c2543e.f27373h) && io.sentry.util.u.a(this.f27374i, c2543e.f27374i) && io.sentry.util.u.a(this.f27375j, c2543e.f27375j) && this.f27376k == c2543e.f27376k && io.sentry.util.u.a(this.f27377l, c2543e.f27377l) && io.sentry.util.u.a(this.f27378m, c2543e.f27378m) && io.sentry.util.u.a(this.f27379n, c2543e.f27379n) && io.sentry.util.u.a(this.f27380o, c2543e.f27380o) && io.sentry.util.u.a(this.f27381p, c2543e.f27381p) && io.sentry.util.u.a(this.f27382q, c2543e.f27382q) && io.sentry.util.u.a(this.f27383r, c2543e.f27383r) && io.sentry.util.u.a(this.f27384s, c2543e.f27384s) && io.sentry.util.u.a(this.f27385t, c2543e.f27385t) && io.sentry.util.u.a(this.f27386u, c2543e.f27386u) && io.sentry.util.u.a(this.f27387v, c2543e.f27387v) && io.sentry.util.u.a(this.f27388w, c2543e.f27388w) && io.sentry.util.u.a(this.f27389x, c2543e.f27389x) && io.sentry.util.u.a(this.f27390y, c2543e.f27390y) && io.sentry.util.u.a(this.f27358A, c2543e.f27358A) && io.sentry.util.u.a(this.f27359B, c2543e.f27359B) && io.sentry.util.u.a(this.f27360C, c2543e.f27360C) && io.sentry.util.u.a(this.f27361D, c2543e.f27361D) && io.sentry.util.u.a(this.f27362E, c2543e.f27362E) && io.sentry.util.u.a(this.f27363F, c2543e.f27363F) && io.sentry.util.u.a(this.f27364G, c2543e.f27364G)) {
                return true;
            }
        }
        return false;
    }

    public void f0(b bVar) {
        this.f27376k = bVar;
    }

    public void g0(Integer num) {
        this.f27362E = num;
    }

    public void h0(Double d8) {
        this.f27363F = d8;
    }

    public int hashCode() {
        return (io.sentry.util.u.b(this.f27366a, this.f27367b, this.f27368c, this.f27369d, this.f27370e, this.f27371f, this.f27373h, this.f27374i, this.f27375j, this.f27376k, this.f27377l, this.f27378m, this.f27379n, this.f27380o, this.f27381p, this.f27382q, this.f27383r, this.f27384s, this.f27385t, this.f27386u, this.f27387v, this.f27388w, this.f27389x, this.f27390y, this.f27391z, this.f27358A, this.f27359B, this.f27360C, this.f27361D, this.f27362E, this.f27363F, this.f27364G) * 31) + Arrays.hashCode(this.f27372g);
    }

    public void i0(Float f8) {
        this.f27388w = f8;
    }

    public void j0(Integer num) {
        this.f27389x = num;
    }

    public void k0(Integer num) {
        this.f27387v = num;
    }

    public void l0(Integer num) {
        this.f27386u = num;
    }

    public void m0(Boolean bool) {
        this.f27377l = bool;
    }

    public void n0(Long l8) {
        this.f27382q = l8;
    }

    public void o0(TimeZone timeZone) {
        this.f27391z = timeZone;
    }

    public void p0(Map map) {
        this.f27365H = map;
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.x();
        if (this.f27366a != null) {
            x8.k("name").c(this.f27366a);
        }
        if (this.f27367b != null) {
            x8.k("manufacturer").c(this.f27367b);
        }
        if (this.f27368c != null) {
            x8.k("brand").c(this.f27368c);
        }
        if (this.f27369d != null) {
            x8.k("family").c(this.f27369d);
        }
        if (this.f27370e != null) {
            x8.k("model").c(this.f27370e);
        }
        if (this.f27371f != null) {
            x8.k("model_id").c(this.f27371f);
        }
        if (this.f27372g != null) {
            x8.k("archs").g(iLogger, this.f27372g);
        }
        if (this.f27373h != null) {
            x8.k("battery_level").f(this.f27373h);
        }
        if (this.f27374i != null) {
            x8.k("charging").h(this.f27374i);
        }
        if (this.f27375j != null) {
            x8.k("online").h(this.f27375j);
        }
        if (this.f27376k != null) {
            x8.k("orientation").g(iLogger, this.f27376k);
        }
        if (this.f27377l != null) {
            x8.k("simulator").h(this.f27377l);
        }
        if (this.f27378m != null) {
            x8.k("memory_size").f(this.f27378m);
        }
        if (this.f27379n != null) {
            x8.k("free_memory").f(this.f27379n);
        }
        if (this.f27380o != null) {
            x8.k("usable_memory").f(this.f27380o);
        }
        if (this.f27381p != null) {
            x8.k("low_memory").h(this.f27381p);
        }
        if (this.f27382q != null) {
            x8.k("storage_size").f(this.f27382q);
        }
        if (this.f27383r != null) {
            x8.k("free_storage").f(this.f27383r);
        }
        if (this.f27384s != null) {
            x8.k("external_storage_size").f(this.f27384s);
        }
        if (this.f27385t != null) {
            x8.k("external_free_storage").f(this.f27385t);
        }
        if (this.f27386u != null) {
            x8.k("screen_width_pixels").f(this.f27386u);
        }
        if (this.f27387v != null) {
            x8.k("screen_height_pixels").f(this.f27387v);
        }
        if (this.f27388w != null) {
            x8.k("screen_density").f(this.f27388w);
        }
        if (this.f27389x != null) {
            x8.k("screen_dpi").f(this.f27389x);
        }
        if (this.f27390y != null) {
            x8.k("boot_time").g(iLogger, this.f27390y);
        }
        if (this.f27391z != null) {
            x8.k("timezone").g(iLogger, this.f27391z);
        }
        if (this.f27358A != null) {
            x8.k("id").c(this.f27358A);
        }
        if (this.f27360C != null) {
            x8.k("connection_type").c(this.f27360C);
        }
        if (this.f27361D != null) {
            x8.k("battery_temperature").f(this.f27361D);
        }
        if (this.f27359B != null) {
            x8.k("locale").c(this.f27359B);
        }
        if (this.f27362E != null) {
            x8.k("processor_count").f(this.f27362E);
        }
        if (this.f27363F != null) {
            x8.k("processor_frequency").f(this.f27363F);
        }
        if (this.f27364G != null) {
            x8.k("cpu_description").c(this.f27364G);
        }
        Map map = this.f27365H;
        if (map != null) {
            for (String str : map.keySet()) {
                x8.k(str).g(iLogger, this.f27365H.get(str));
            }
        }
        x8.u();
    }

    /* JADX INFO: renamed from: io.sentry.protocol.e$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2524m0 {
        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2543e a(W0 w8, ILogger iLogger) {
            w8.x();
            C2543e c2543e = new C2543e();
            ConcurrentHashMap concurrentHashMap = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                byte b8 = -1;
                switch (strF0.hashCode()) {
                    case -2076227591:
                        if (strF0.equals("timezone")) {
                            b8 = 0;
                        }
                        break;
                    case -2012489734:
                        if (strF0.equals("boot_time")) {
                            b8 = 1;
                        }
                        break;
                    case -1981332476:
                        if (strF0.equals("simulator")) {
                            b8 = 2;
                        }
                        break;
                    case -1969347631:
                        if (strF0.equals("manufacturer")) {
                            b8 = 3;
                        }
                        break;
                    case -1608004830:
                        if (strF0.equals("processor_count")) {
                            b8 = 4;
                        }
                        break;
                    case -1439500848:
                        if (strF0.equals("orientation")) {
                            b8 = 5;
                        }
                        break;
                    case -1410521534:
                        if (strF0.equals(PCRzgdeK.EuSdEcWofR)) {
                            b8 = 6;
                        }
                        break;
                    case -1281860764:
                        if (strF0.equals("family")) {
                            b8 = 7;
                        }
                        break;
                    case -1097462182:
                        if (strF0.equals("locale")) {
                            b8 = 8;
                        }
                        break;
                    case -1012222381:
                        if (strF0.equals("online")) {
                            b8 = 9;
                        }
                        break;
                    case -877252910:
                        if (strF0.equals("battery_level")) {
                            b8 = 10;
                        }
                        break;
                    case -619038223:
                        if (strF0.equals("model_id")) {
                            b8 = 11;
                        }
                        break;
                    case -568274923:
                        if (strF0.equals("screen_density")) {
                            b8 = 12;
                        }
                        break;
                    case -417046774:
                        if (strF0.equals("screen_dpi")) {
                            b8 = 13;
                        }
                        break;
                    case -136523212:
                        if (strF0.equals("free_memory")) {
                            b8 = 14;
                        }
                        break;
                    case 3355:
                        if (strF0.equals("id")) {
                            b8 = 15;
                        }
                        break;
                    case 3373707:
                        if (strF0.equals("name")) {
                            b8 = 16;
                        }
                        break;
                    case 59142220:
                        if (strF0.equals("low_memory")) {
                            b8 = 17;
                        }
                        break;
                    case 93076189:
                        if (strF0.equals("archs")) {
                            b8 = 18;
                        }
                        break;
                    case 93997959:
                        if (strF0.equals("brand")) {
                            b8 = 19;
                        }
                        break;
                    case 104069929:
                        if (strF0.equals("model")) {
                            b8 = 20;
                        }
                        break;
                    case 115746789:
                        if (strF0.equals("cpu_description")) {
                            b8 = 21;
                        }
                        break;
                    case 244497903:
                        if (strF0.equals("processor_frequency")) {
                            b8 = 22;
                        }
                        break;
                    case 731866107:
                        if (strF0.equals("connection_type")) {
                            b8 = 23;
                        }
                        break;
                    case 817830969:
                        if (strF0.equals("screen_width_pixels")) {
                            b8 = 24;
                        }
                        break;
                    case 823882553:
                        if (strF0.equals("external_storage_size")) {
                            b8 = 25;
                        }
                        break;
                    case 897428293:
                        if (strF0.equals("storage_size")) {
                            b8 = 26;
                        }
                        break;
                    case 1331465768:
                        if (strF0.equals("usable_memory")) {
                            b8 = 27;
                        }
                        break;
                    case 1418777727:
                        if (strF0.equals("memory_size")) {
                            b8 = 28;
                        }
                        break;
                    case 1436115569:
                        if (strF0.equals("charging")) {
                            b8 = 29;
                        }
                        break;
                    case 1450613660:
                        if (strF0.equals("external_free_storage")) {
                            b8 = 30;
                        }
                        break;
                    case 1524159400:
                        if (strF0.equals("free_storage")) {
                            b8 = 31;
                        }
                        break;
                    case 1556284978:
                        if (strF0.equals("screen_height_pixels")) {
                            b8 = 32;
                        }
                        break;
                }
                switch (b8) {
                    case 0:
                        c2543e.f27391z = w8.g0(iLogger);
                        break;
                    case 1:
                        if (w8.peek() == io.sentry.vendor.gson.stream.b.STRING) {
                            c2543e.f27390y = w8.S0(iLogger);
                        }
                        break;
                    case 2:
                        c2543e.f27377l = w8.Z0();
                        break;
                    case 3:
                        c2543e.f27367b = w8.k0();
                        break;
                    case 4:
                        c2543e.f27362E = w8.T();
                        break;
                    case 5:
                        c2543e.f27376k = (b) w8.m1(iLogger, new b.a());
                        break;
                    case 6:
                        c2543e.f27361D = w8.j1();
                        break;
                    case 7:
                        c2543e.f27369d = w8.k0();
                        break;
                    case 8:
                        c2543e.f27359B = w8.k0();
                        break;
                    case 9:
                        c2543e.f27375j = w8.Z0();
                        break;
                    case 10:
                        c2543e.f27373h = w8.j1();
                        break;
                    case 11:
                        c2543e.f27371f = w8.k0();
                        break;
                    case 12:
                        c2543e.f27388w = w8.j1();
                        break;
                    case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
                        c2543e.f27389x = w8.T();
                        break;
                    case KnownHost.Device.KEYPADROTATION_FIELD_NUMBER /* 14 */:
                        c2543e.f27379n = w8.a0();
                        break;
                    case KnownHost.Device.APPEARANCE_FIELD_NUMBER /* 15 */:
                        c2543e.f27358A = w8.k0();
                        break;
                    case 16:
                        c2543e.f27366a = w8.k0();
                        break;
                    case KnownHost.Device.CUSTOMFACEPLATE_FIELD_NUMBER /* 17 */:
                        c2543e.f27381p = w8.Z0();
                        break;
                    case 18:
                        List list = (List) w8.y1();
                        if (list != null) {
                            String[] strArr = new String[list.size()];
                            list.toArray(strArr);
                            c2543e.f27372g = strArr;
                        }
                        break;
                    case 19:
                        c2543e.f27368c = w8.k0();
                        break;
                    case 20:
                        c2543e.f27370e = w8.k0();
                        break;
                    case 21:
                        c2543e.f27364G = w8.k0();
                        break;
                    case Messages.ClientMessage.PREVIOUSPAGE_FIELD_NUMBER /* 22 */:
                        c2543e.f27363F = w8.D0();
                        break;
                    case Messages.ClientMessage.PAGEBYINDEX_FIELD_NUMBER /* 23 */:
                        c2543e.f27360C = w8.k0();
                        break;
                    case 24:
                        c2543e.f27386u = w8.T();
                        break;
                    case 25:
                        c2543e.f27384s = w8.a0();
                        break;
                    case 26:
                        c2543e.f27382q = w8.a0();
                        break;
                    case 27:
                        c2543e.f27380o = w8.a0();
                        break;
                    case 28:
                        c2543e.f27378m = w8.a0();
                        break;
                    case 29:
                        c2543e.f27374i = w8.Z0();
                        break;
                    case 30:
                        c2543e.f27385t = w8.a0();
                        break;
                    case 31:
                        c2543e.f27383r = w8.a0();
                        break;
                    case 32:
                        c2543e.f27387v = w8.T();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        w8.t0(iLogger, concurrentHashMap, strF0);
                        break;
                }
            }
            c2543e.p0(concurrentHashMap);
            w8.u();
            return c2543e;
        }
    }

    public C2543e(C2543e c2543e) {
        this.f27366a = c2543e.f27366a;
        this.f27367b = c2543e.f27367b;
        this.f27368c = c2543e.f27368c;
        this.f27369d = c2543e.f27369d;
        this.f27370e = c2543e.f27370e;
        this.f27371f = c2543e.f27371f;
        this.f27374i = c2543e.f27374i;
        this.f27375j = c2543e.f27375j;
        this.f27376k = c2543e.f27376k;
        this.f27377l = c2543e.f27377l;
        this.f27378m = c2543e.f27378m;
        this.f27379n = c2543e.f27379n;
        this.f27380o = c2543e.f27380o;
        this.f27381p = c2543e.f27381p;
        this.f27382q = c2543e.f27382q;
        this.f27383r = c2543e.f27383r;
        this.f27384s = c2543e.f27384s;
        this.f27385t = c2543e.f27385t;
        this.f27386u = c2543e.f27386u;
        this.f27387v = c2543e.f27387v;
        this.f27388w = c2543e.f27388w;
        this.f27389x = c2543e.f27389x;
        this.f27390y = c2543e.f27390y;
        this.f27358A = c2543e.f27358A;
        this.f27360C = c2543e.f27360C;
        this.f27361D = c2543e.f27361D;
        this.f27373h = c2543e.f27373h;
        String[] strArr = c2543e.f27372g;
        this.f27372g = strArr != null ? (String[]) strArr.clone() : null;
        this.f27359B = c2543e.f27359B;
        TimeZone timeZone = c2543e.f27391z;
        this.f27391z = timeZone != null ? (TimeZone) timeZone.clone() : null;
        this.f27362E = c2543e.f27362E;
        this.f27363F = c2543e.f27363F;
        this.f27364G = c2543e.f27364G;
        this.f27365H = AbstractC2571c.b(c2543e.f27365H);
    }
}
