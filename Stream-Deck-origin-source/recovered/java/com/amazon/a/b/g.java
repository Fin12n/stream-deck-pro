package com.amazon.a.b;

import java.util.Map;
import p090k.zI.jULK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f16856a = "license";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f16857b = "customerId";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f16858c = "deviceId";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f16859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f16860e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f16861f;

    private String a(String str, Map<String, String> map) throws com.amazon.a.a.n.a.a.g {
        String str2 = map.get(str);
        if (a(str2)) {
            throw com.amazon.a.a.n.a.a.g.a(str);
        }
        return str2;
    }

    public String b() {
        return this.f16861f;
    }

    public String c() {
        return this.f16859d;
    }

    public g(Map<String, String> map) throws com.amazon.a.a.n.a.a.g {
        if (map != null) {
            this.f16859d = a(f16856a, map);
            this.f16860e = a(jULK.otu, map);
            this.f16861f = a(f16858c, map);
            return;
        }
        throw com.amazon.a.a.n.a.a.g.d();
    }

    private boolean a(String str) {
        return str == null || str.length() == 0;
    }

    public String a() {
        return this.f16860e;
    }
}
