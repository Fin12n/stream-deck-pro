package com.amazon.a.a.h;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f16435a = "name";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f16436b = "time";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f16437c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, String> f16438d;

    public a(String str) {
        HashMap map = new HashMap();
        this.f16438d = map;
        map.put("name", str);
        map.put(f16436b, String.valueOf(System.currentTimeMillis()));
    }

    public a a(String str, String str2) {
        this.f16438d.put(str, str2);
        return this;
    }

    public String toString() {
        return "Metric: [" + this.f16438d.toString() + "]";
    }

    public Map<String, String> a() {
        return this.f16438d;
    }
}
