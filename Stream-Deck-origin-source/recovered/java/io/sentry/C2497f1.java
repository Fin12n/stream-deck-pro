package io.sentry;

import com.elgato.streamdeck.vsd2.KnownHost;
import com.elgato.vsd2.Messages;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.subscriberattributes.caching.tU.ajyWhveMDgQ;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import p143q0.nKy.bGZGhbtQmA;
import p181u6.GfRt.QhsKALGiniuQ;

/* JADX INFO: renamed from: io.sentry.f1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2497f1 implements InterfaceC2582w0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Map f27116A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f27117B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Map f27118C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f27119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Callable f27120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f27122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f27123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f27124f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f27125g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f27126h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f27127i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f27128j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f27129k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List f27130l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f27131m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f27132n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f27133o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List f27134p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f27135q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f27136r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f27137s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f27138t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f27139u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f27140v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f27141w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f27142x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f27143y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Date f27144z;

    public static /* synthetic */ List a() {
        return new ArrayList();
    }

    public String B() {
        return this.f27141w;
    }

    public File C() {
        return this.f27119a;
    }

    public final boolean D() {
        return this.f27143y.equals("normal") || this.f27143y.equals("timeout") || this.f27143y.equals("backgrounded");
    }

    public void E() {
        try {
            this.f27130l = (List) this.f27120b.call();
        } catch (Throwable unused) {
        }
    }

    public void F(String str) {
        this.f27117B = str;
    }

    public void G(Map map) {
        this.f27118C = map;
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.x();
        x8.k("android_api_level").g(iLogger, Integer.valueOf(this.f27121c));
        x8.k("device_locale").g(iLogger, this.f27122d);
        x8.k("device_manufacturer").c(this.f27123e);
        x8.k("device_model").c(this.f27124f);
        x8.k("device_os_build_number").c(this.f27125g);
        x8.k("device_os_name").c(this.f27126h);
        x8.k("device_os_version").c(this.f27127i);
        x8.k("device_is_emulator").d(this.f27128j);
        x8.k("architecture").g(iLogger, this.f27129k);
        x8.k("device_cpu_frequencies").g(iLogger, this.f27130l);
        x8.k("device_physical_memory_bytes").c(this.f27131m);
        x8.k("platform").c(this.f27132n);
        x8.k("build_id").c(this.f27133o);
        x8.k("transaction_name").c(this.f27135q);
        x8.k("duration_ns").c(this.f27136r);
        x8.k("version_name").c(this.f27138t);
        x8.k("version_code").c(this.f27137s);
        if (!this.f27134p.isEmpty()) {
            x8.k("transactions").g(iLogger, this.f27134p);
        }
        x8.k("transaction_id").c(this.f27139u);
        x8.k("trace_id").c(this.f27140v);
        x8.k("profile_id").c(this.f27141w);
        x8.k("environment").c(this.f27142x);
        x8.k("truncation_reason").c(this.f27143y);
        if (this.f27117B != null) {
            x8.k("sampled_profile").c(this.f27117B);
        }
        x8.k("measurements").g(iLogger, this.f27116A);
        x8.k(DiagnosticsEntry.TIMESTAMP_KEY).g(iLogger, this.f27144z);
        Map map = this.f27118C;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f27118C.get(str);
                x8.k(str);
                x8.g(iLogger, obj);
            }
        }
        x8.u();
    }

    /* JADX INFO: renamed from: io.sentry.f1$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements InterfaceC2524m0 {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2497f1 a(W0 w8, ILogger iLogger) {
            w8.x();
            ConcurrentHashMap concurrentHashMap = null;
            C2497f1 c2497f1 = new C2497f1();
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                byte b8 = -1;
                switch (strF0.hashCode()) {
                    case -2133529830:
                        if (strF0.equals(bGZGhbtQmA.vZjqQezBshaM)) {
                            b8 = 0;
                        }
                        break;
                    case -1981468849:
                        if (strF0.equals("android_api_level")) {
                            b8 = 1;
                        }
                        break;
                    case -1430655860:
                        if (strF0.equals("build_id")) {
                            b8 = 2;
                        }
                        break;
                    case -1172160413:
                        if (strF0.equals("device_locale")) {
                            b8 = 3;
                        }
                        break;
                    case -1102636175:
                        if (strF0.equals("profile_id")) {
                            b8 = 4;
                        }
                        break;
                    case -716656436:
                        if (strF0.equals("device_os_build_number")) {
                            b8 = 5;
                        }
                        break;
                    case -591076352:
                        if (strF0.equals("device_model")) {
                            b8 = 6;
                        }
                        break;
                    case -512511455:
                        if (strF0.equals("device_is_emulator")) {
                            b8 = 7;
                        }
                        break;
                    case -478065584:
                        if (strF0.equals("duration_ns")) {
                            b8 = 8;
                        }
                        break;
                    case -362243017:
                        if (strF0.equals("measurements")) {
                            b8 = 9;
                        }
                        break;
                    case -332426004:
                        if (strF0.equals("device_physical_memory_bytes")) {
                            b8 = 10;
                        }
                        break;
                    case -212264198:
                        if (strF0.equals("device_cpu_frequencies")) {
                            b8 = 11;
                        }
                        break;
                    case -102985484:
                        if (strF0.equals("version_code")) {
                            b8 = 12;
                        }
                        break;
                    case -102670958:
                        if (strF0.equals(QhsKALGiniuQ.GktzPNmdUSDyiv)) {
                            b8 = 13;
                        }
                        break;
                    case -85904877:
                        if (strF0.equals("environment")) {
                            b8 = 14;
                        }
                        break;
                    case 55126294:
                        if (strF0.equals(DiagnosticsEntry.TIMESTAMP_KEY)) {
                            b8 = 15;
                        }
                        break;
                    case 508853068:
                        if (strF0.equals("transaction_name")) {
                            b8 = 16;
                        }
                        break;
                    case 796476189:
                        if (strF0.equals("device_os_name")) {
                            b8 = 17;
                        }
                        break;
                    case 839674195:
                        if (strF0.equals("architecture")) {
                            b8 = 18;
                        }
                        break;
                    case 1010584092:
                        if (strF0.equals("transaction_id")) {
                            b8 = 19;
                        }
                        break;
                    case 1052553990:
                        if (strF0.equals("device_os_version")) {
                            b8 = 20;
                        }
                        break;
                    case 1163928186:
                        if (strF0.equals("truncation_reason")) {
                            b8 = 21;
                        }
                        break;
                    case 1270300245:
                        if (strF0.equals("trace_id")) {
                            b8 = 22;
                        }
                        break;
                    case 1874684019:
                        if (strF0.equals("platform")) {
                            b8 = 23;
                        }
                        break;
                    case 1953158756:
                        if (strF0.equals("sampled_profile")) {
                            b8 = 24;
                        }
                        break;
                    case 1954122069:
                        if (strF0.equals("transactions")) {
                            b8 = 25;
                        }
                        break;
                }
                switch (b8) {
                    case 0:
                        String strK0 = w8.k0();
                        if (strK0 != null) {
                            c2497f1.f27123e = strK0;
                        }
                        break;
                    case 1:
                        Integer numT = w8.T();
                        if (numT != null) {
                            c2497f1.f27121c = numT.intValue();
                        }
                        break;
                    case 2:
                        String strK1 = w8.k0();
                        if (strK1 != null) {
                            c2497f1.f27133o = strK1;
                        }
                        break;
                    case 3:
                        String strK2 = w8.k0();
                        if (strK2 != null) {
                            c2497f1.f27122d = strK2;
                        }
                        break;
                    case 4:
                        String strK3 = w8.k0();
                        if (strK3 != null) {
                            c2497f1.f27141w = strK3;
                        }
                        break;
                    case 5:
                        String strK4 = w8.k0();
                        if (strK4 != null) {
                            c2497f1.f27125g = strK4;
                        }
                        break;
                    case 6:
                        String strK5 = w8.k0();
                        if (strK5 != null) {
                            c2497f1.f27124f = strK5;
                        }
                        break;
                    case 7:
                        Boolean boolZ0 = w8.Z0();
                        if (boolZ0 != null) {
                            c2497f1.f27128j = boolZ0.booleanValue();
                        }
                        break;
                    case 8:
                        String strK6 = w8.k0();
                        if (strK6 != null) {
                            c2497f1.f27136r = strK6;
                        }
                        break;
                    case 9:
                        Map mapQ0 = w8.q0(iLogger, new io.sentry.profilemeasurements.a.C0601a());
                        if (mapQ0 != null) {
                            c2497f1.f27116A.putAll(mapQ0);
                        }
                        break;
                    case 10:
                        String strK7 = w8.k0();
                        if (strK7 != null) {
                            c2497f1.f27131m = strK7;
                        }
                        break;
                    case 11:
                        List list = (List) w8.y1();
                        if (list != null) {
                            c2497f1.f27130l = list;
                        }
                        break;
                    case 12:
                        String strK8 = w8.k0();
                        if (strK8 != null) {
                            c2497f1.f27137s = strK8;
                        }
                        break;
                    case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
                        String strK9 = w8.k0();
                        if (strK9 != null) {
                            c2497f1.f27138t = strK9;
                        }
                        break;
                    case KnownHost.Device.KEYPADROTATION_FIELD_NUMBER /* 14 */:
                        String strK10 = w8.k0();
                        if (strK10 != null) {
                            c2497f1.f27142x = strK10;
                        }
                        break;
                    case KnownHost.Device.APPEARANCE_FIELD_NUMBER /* 15 */:
                        Date dateS0 = w8.S0(iLogger);
                        if (dateS0 != null) {
                            c2497f1.f27144z = dateS0;
                        }
                        break;
                    case 16:
                        String strK11 = w8.k0();
                        if (strK11 != null) {
                            c2497f1.f27135q = strK11;
                        }
                        break;
                    case KnownHost.Device.CUSTOMFACEPLATE_FIELD_NUMBER /* 17 */:
                        String strK12 = w8.k0();
                        if (strK12 != null) {
                            c2497f1.f27126h = strK12;
                        }
                        break;
                    case 18:
                        String strK13 = w8.k0();
                        if (strK13 != null) {
                            c2497f1.f27129k = strK13;
                        }
                        break;
                    case 19:
                        String strK14 = w8.k0();
                        if (strK14 != null) {
                            c2497f1.f27139u = strK14;
                        }
                        break;
                    case 20:
                        String strK15 = w8.k0();
                        if (strK15 != null) {
                            c2497f1.f27127i = strK15;
                        }
                        break;
                    case 21:
                        String strK16 = w8.k0();
                        if (strK16 != null) {
                            c2497f1.f27143y = strK16;
                        }
                        break;
                    case Messages.ClientMessage.PREVIOUSPAGE_FIELD_NUMBER /* 22 */:
                        String strK17 = w8.k0();
                        if (strK17 != null) {
                            c2497f1.f27140v = strK17;
                        }
                        break;
                    case Messages.ClientMessage.PAGEBYINDEX_FIELD_NUMBER /* 23 */:
                        String strK18 = w8.k0();
                        if (strK18 != null) {
                            c2497f1.f27132n = strK18;
                        }
                        break;
                    case 24:
                        String strK19 = w8.k0();
                        if (strK19 != null) {
                            c2497f1.f27117B = strK19;
                        }
                        break;
                    case 25:
                        List listO1 = w8.O1(iLogger, new C2501g1.a());
                        if (listO1 != null) {
                            c2497f1.f27134p.addAll(listO1);
                        }
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        w8.t0(iLogger, concurrentHashMap, strF0);
                        break;
                }
            }
            c2497f1.G(concurrentHashMap);
            w8.u();
            return c2497f1;
        }
    }

    public C2497f1() {
        this(new File("dummy"), S0.v());
    }

    public C2497f1(File file, InterfaceC2496f0 interfaceC2496f0) {
        this(file, AbstractC2519l.c(), new ArrayList(), interfaceC2496f0.getName(), interfaceC2496f0.n().toString(), interfaceC2496f0.p().n().toString(), "0", 0, "", new Callable() { // from class: io.sentry.e1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C2497f1.a();
            }
        }, null, null, null, null, null, null, null, null, "normal", new HashMap());
    }

    public C2497f1(File file, Date date, List<C2501g1> list, String str, String str2, String str3, String str4, int i8, String str5, Callable<List<Integer>> callable, String str6, String str7, String str8, Boolean bool, String str9, String str10, String str11, String str12, String str13, Map<String, io.sentry.profilemeasurements.a> map) {
        this.f27130l = new ArrayList();
        this.f27117B = null;
        this.f27119a = file;
        this.f27144z = date;
        this.f27129k = str5;
        this.f27120b = callable;
        this.f27121c = i8;
        this.f27122d = Locale.getDefault().toString();
        this.f27123e = str6 == null ? "" : str6;
        this.f27124f = str7 == null ? "" : str7;
        this.f27127i = str8 == null ? "" : str8;
        this.f27128j = bool != null ? bool.booleanValue() : false;
        this.f27131m = str9 != null ? str9 : "0";
        this.f27125g = "";
        this.f27126h = "android";
        this.f27132n = "android";
        this.f27133o = str10 != null ? str10 : "";
        this.f27134p = list;
        this.f27135q = str.isEmpty() ? ajyWhveMDgQ.SCXkeenKx : str;
        this.f27136r = str4;
        this.f27137s = "";
        this.f27138t = str11 != null ? str11 : "";
        this.f27139u = str2;
        this.f27140v = str3;
        this.f27141w = W2.a();
        this.f27142x = str12 != null ? str12 : "production";
        this.f27143y = str13;
        if (!D()) {
            this.f27143y = "normal";
        }
        this.f27116A = map;
    }
}
