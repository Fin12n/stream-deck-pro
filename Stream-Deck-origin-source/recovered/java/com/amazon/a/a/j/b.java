package com.amazon.a.a.j;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f16517a = "RESPONSE";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f16518b = "RESET_OFFSET";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f16519d = "RECEIPT_STRING";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f16520e = "KIWI_EXECUTION_RESULT_CODE";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f16521f = "RECEIPT_DELIVERED";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f16522g = "PURCHASE_REQUEST_ID";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f16523h = "userId";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final /* synthetic */ boolean f16524i = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, Object> f16525c = new HashMap();

    public Object a(String str) {
        return this.f16525c.get(str);
    }

    public boolean b(String str) {
        return this.f16525c.containsKey(str);
    }

    public Object c(String str) {
        return this.f16525c.remove(str);
    }

    public void a(String str, Object obj) {
        this.f16525c.put(str, obj);
    }

    public Object b() {
        return this.f16525c.get(f16517a);
    }

    public void c() {
        this.f16525c.remove(f16517a);
    }

    public boolean a(Class cls) {
        return b(f16517a) && a(f16517a).getClass().equals(cls);
    }

    public void a() {
        this.f16525c.clear();
    }

    public void a(Object obj) {
        if (!f16524i && obj == null) {
            throw new AssertionError();
        }
        this.f16525c.put(f16517a, obj);
    }
}
