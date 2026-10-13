package com.amazon.device.iap.internal.b;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f17129a = "KEY_TIMESTAMP";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f17130b = "KEY_REQUEST_ID";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f17131c = "KEY_USER_ID";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f17132d = "KEY_RECEIPT_STRING";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f17133e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f17134f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f17135g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f17136h;

    public c(String str, String str2, String str3, long j8) {
        this.f17133e = str;
        this.f17134f = str2;
        this.f17136h = str3;
        this.f17135g = j8;
    }

    public String a() {
        return this.f17133e;
    }

    public String b() {
        return this.f17136h;
    }

    public String c() {
        return this.f17134f;
    }

    public long d() {
        return this.f17135g;
    }

    public String e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f17131c, this.f17133e);
        jSONObject.put(f17132d, this.f17134f);
        jSONObject.put(f17130b, this.f17136h);
        jSONObject.put(f17129a, this.f17135g);
        return jSONObject.toString();
    }

    public static c a(String str) throws b {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new c(jSONObject.getString(f17131c), jSONObject.getString(f17132d), jSONObject.getString(f17130b), jSONObject.getLong(f17129a));
        } catch (Throwable th) {
            throw new b("Input invalid for PendingReceipt Object:" + str, th);
        }
    }
}
