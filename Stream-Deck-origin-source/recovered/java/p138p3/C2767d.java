package p138p3;

import org.json.JSONObject;

/* JADX INFO: renamed from: p3.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2767d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f31190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f31191c;

    public C2767d(String str) {
        this.f31189a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f31190b = jSONObject;
        this.f31191c = jSONObject.optString("countryCode");
    }

    public String a() {
        return this.f31191c;
    }
}
