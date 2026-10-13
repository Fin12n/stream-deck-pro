package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class SkuDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f17346b;

    public SkuDetails(String str) {
        this.f17345a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f17346b = jSONObject;
        if (TextUtils.isEmpty(jSONObject.optString("productId"))) {
            throw new IllegalArgumentException("SKU cannot be empty.");
        }
        if (TextUtils.isEmpty(jSONObject.optString("type"))) {
            throw new IllegalArgumentException("SkuType cannot be empty.");
        }
    }

    public String a() {
        return this.f17346b.optString("productId");
    }

    public String b() {
        return this.f17346b.optString("type");
    }

    public int c() {
        return this.f17346b.optInt("offer_type");
    }

    public String d() {
        return this.f17346b.optString("offer_id");
    }

    public String e() {
        String strOptString = this.f17346b.optString("offerIdToken");
        return strOptString.isEmpty() ? this.f17346b.optString("offer_id_token") : strOptString;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SkuDetails) {
            return TextUtils.equals(this.f17345a, ((SkuDetails) obj).f17345a);
        }
        return false;
    }

    public final String f() {
        return this.f17346b.optString("packageName");
    }

    public String g() {
        return this.f17346b.optString("serializedDocid");
    }

    public final String h() {
        return this.f17346b.optString("skuDetailsToken");
    }

    public int hashCode() {
        return this.f17345a.hashCode();
    }

    public String toString() {
        return "SkuDetails: ".concat(String.valueOf(this.f17345a));
    }
}
