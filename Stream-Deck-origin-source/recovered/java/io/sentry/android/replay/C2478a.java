package io.sentry.android.replay;

import R0.pkXL.Oitvkwcwn;
import io.sentry.C2491e;
import io.sentry.EnumC2596z2;
import io.sentry.InterfaceC2509i1;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: renamed from: io.sentry.android.replay.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class C2478a implements InterfaceC2509i1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f26636b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f26637c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C6.j f26638d = C6.k.a(C6.l.NONE, C0588a.f26641a);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashSet f26639e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f26640a;

    /* JADX INFO: renamed from: io.sentry.android.replay.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0588a extends kotlin.jvm.internal.u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0588a f26641a = new C0588a();

        public C0588a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Z6.j invoke() {
            return new Z6.j("_[a-z]");
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.a$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {
        public /* synthetic */ b(AbstractC2633k abstractC2633k) {
            this();
        }

        public final Z6.j b() {
            return (Z6.j) C2478a.f26638d.getValue();
        }

        public b() {
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.a$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f26642a = new c();

        public c() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Z6.h it) {
            kotlin.jvm.internal.t.g(it, "it");
            String upperCase = String.valueOf(Z6.y.b1(it.getValue())).toUpperCase(Locale.ROOT);
            kotlin.jvm.internal.t.f(upperCase, "toUpperCase(...)");
            return upperCase;
        }
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("status_code");
        hashSet.add("method");
        hashSet.add("response_content_length");
        hashSet.add("request_content_length");
        hashSet.add("http.response_content_length");
        hashSet.add("http.request_content_length");
        f26639e = hashSet;
    }

    public final boolean c(C2491e c2491e) {
        Object obj = c2491e.t().get("url");
        String str = obj instanceof String ? (String) obj : null;
        if (str == null || str.length() == 0) {
            return false;
        }
        Map data = c2491e.t();
        kotlin.jvm.internal.t.f(data, "data");
        if (!data.containsKey("http.start_timestamp")) {
            return false;
        }
        Map data2 = c2491e.t();
        kotlin.jvm.internal.t.f(data2, "data");
        return data2.containsKey("http.end_timestamp");
    }

    public final String d(String str) {
        return f26636b.b().e(str, c.f26642a);
    }

    public final io.sentry.rrweb.i e(C2491e c2491e) {
        double dLongValue;
        double dLongValue2;
        Object obj = c2491e.t().get("http.start_timestamp");
        Object obj2 = c2491e.t().get("http.end_timestamp");
        io.sentry.rrweb.i iVar = new io.sentry.rrweb.i();
        iVar.f(c2491e.w().getTime());
        iVar.s("resource.http");
        Object obj3 = c2491e.t().get("url");
        kotlin.jvm.internal.t.e(obj3, "null cannot be cast to non-null type kotlin.String");
        iVar.q((String) obj3);
        if (obj instanceof Double) {
            dLongValue = ((Number) obj).doubleValue();
        } else {
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.Long");
            dLongValue = ((Long) obj).longValue();
        }
        iVar.u(dLongValue / 1000.0d);
        if (obj2 instanceof Double) {
            dLongValue2 = ((Number) obj2).doubleValue();
        } else {
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type kotlin.Long");
            dLongValue2 = ((Long) obj2).longValue();
        }
        iVar.r(dLongValue2 / 1000.0d);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map mapT = c2491e.t();
        kotlin.jvm.internal.t.f(mapT, "breadcrumb.data");
        for (Map.Entry entry : mapT.entrySet()) {
            String key = (String) entry.getKey();
            Object value = entry.getValue();
            if (f26639e.contains(key)) {
                kotlin.jvm.internal.t.f(key, "key");
                linkedHashMap.put(d(Z6.w.M0(Z6.v.D(key, "content_length", "body_size", false, 4, null), ".", null, 2, null)), value);
            }
        }
        iVar.o(linkedHashMap);
        return iVar;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00d2  */
    @Override // io.sentry.InterfaceC2509i1
    public io.sentry.rrweb.b a(C2491e breadcrumb) {
        String strV;
        EnumC2596z2 enumC2596z2U;
        Object obj;
        String strO0;
        kotlin.jvm.internal.t.g(breadcrumb, "breadcrumb");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (kotlin.jvm.internal.t.c(breadcrumb.s(), "http")) {
            if (c(breadcrumb)) {
                return e(breadcrumb);
            }
            return null;
        }
        String strS = "navigation";
        if (kotlin.jvm.internal.t.c(breadcrumb.x(), "navigation") && kotlin.jvm.internal.t.c(breadcrumb.s(), "app.lifecycle")) {
            strS = "app." + breadcrumb.t().get("state");
        } else if (kotlin.jvm.internal.t.c(breadcrumb.x(), "navigation") && kotlin.jvm.internal.t.c(breadcrumb.s(), "device.orientation")) {
            strS = breadcrumb.s();
            kotlin.jvm.internal.t.d(strS);
            Object obj2 = breadcrumb.t().get("position");
            if (!kotlin.jvm.internal.t.c(obj2, "landscape") && !kotlin.jvm.internal.t.c(obj2, Oitvkwcwn.XnWucvWVY)) {
                return null;
            }
            linkedHashMap.put("position", obj2);
        } else {
            if (!kotlin.jvm.internal.t.c(breadcrumb.x(), "navigation")) {
                if (kotlin.jvm.internal.t.c(breadcrumb.s(), "ui.click")) {
                    Object obj3 = breadcrumb.t().get("view.id");
                    if (obj3 == null && (obj3 = breadcrumb.t().get("view.tag")) == null) {
                        obj3 = breadcrumb.t().get("view.class");
                    }
                    strV = obj3 instanceof String ? (String) obj3 : null;
                    if (strV == null) {
                        return null;
                    }
                    Map mapT = breadcrumb.t();
                    kotlin.jvm.internal.t.f(mapT, "breadcrumb.data");
                    linkedHashMap.putAll(mapT);
                    strS = "ui.tap";
                    enumC2596z2U = null;
                } else if (kotlin.jvm.internal.t.c(breadcrumb.x(), "system") && kotlin.jvm.internal.t.c(breadcrumb.s(), "network.event")) {
                    if (!kotlin.jvm.internal.t.c(breadcrumb.t().get("action"), "NETWORK_LOST")) {
                        Map mapT2 = breadcrumb.t();
                        kotlin.jvm.internal.t.f(mapT2, "breadcrumb.data");
                        if (mapT2.containsKey("network_type")) {
                            Object obj4 = breadcrumb.t().get("network_type");
                            String str = obj4 instanceof String ? (String) obj4 : null;
                            obj = (str == null || str.length() == 0) ? "offline" : breadcrumb.t().get("network_type");
                        }
                        return null;
                    }
                    linkedHashMap.put("state", obj);
                    if (kotlin.jvm.internal.t.c(this.f26640a, linkedHashMap.get("state"))) {
                        return null;
                    }
                    Object obj5 = linkedHashMap.get("state");
                    this.f26640a = obj5 instanceof String ? (String) obj5 : null;
                    strS = "device.connectivity";
                } else if (kotlin.jvm.internal.t.c(breadcrumb.t().get("action"), "BATTERY_CHANGED")) {
                    Map mapT3 = breadcrumb.t();
                    kotlin.jvm.internal.t.f(mapT3, "breadcrumb.data");
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry entry : mapT3.entrySet()) {
                        String str2 = (String) entry.getKey();
                        if (kotlin.jvm.internal.t.c(str2, "level") || kotlin.jvm.internal.t.c(str2, "charging")) {
                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                        }
                    }
                    linkedHashMap.putAll(linkedHashMap2);
                    strS = "device.battery";
                } else {
                    strS = breadcrumb.s();
                    strV = breadcrumb.v();
                    enumC2596z2U = breadcrumb.u();
                    Map mapT4 = breadcrumb.t();
                    kotlin.jvm.internal.t.f(mapT4, "breadcrumb.data");
                    linkedHashMap.putAll(mapT4);
                }
                if (strS == null && strS.length() != 0) {
                    io.sentry.rrweb.a aVar = new io.sentry.rrweb.a();
                    aVar.f(breadcrumb.w().getTime());
                    aVar.r(breadcrumb.w().getTime() / 1000.0d);
                    aVar.s("default");
                    aVar.t(strS);
                    aVar.x(strV);
                    aVar.w(enumC2596z2U);
                    aVar.u(linkedHashMap);
                    return aVar;
                }
            }
            if (kotlin.jvm.internal.t.c(breadcrumb.t().get("state"), "resumed")) {
                Object obj6 = breadcrumb.t().get("screen");
                String str3 = obj6 instanceof String ? (String) obj6 : null;
                if (str3 != null) {
                    strO0 = Z6.w.O0(str3, com.amazon.a.a.o.c.a.b.f16789a, null, 2, null);
                } else {
                    strO0 = null;
                }
            } else {
                Map mapT5 = breadcrumb.t();
                kotlin.jvm.internal.t.f(mapT5, "breadcrumb.data");
                if (mapT5.containsKey("to")) {
                    Object obj7 = breadcrumb.t().get("to");
                    if (obj7 instanceof String) {
                        strO0 = (String) obj7;
                    } else {
                        strO0 = null;
                    }
                } else {
                    strO0 = null;
                }
            }
            if (strO0 == null) {
                return null;
            }
            linkedHashMap.put("to", strO0);
        }
        strV = null;
        enumC2596z2U = null;
        return strS == null ? null : null;
    }
}
