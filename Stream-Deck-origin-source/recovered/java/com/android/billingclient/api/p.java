package com.android.billingclient.api;

import I0.mIk.efuWFSeiT;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f17505e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f.c f17506f;

    public p(JSONObject jSONObject) {
        f.c cVar;
        this.f17501a = jSONObject.getString("productId");
        this.f17502b = jSONObject.optString(com.amazon.a.a.o.b.f16718S);
        this.f17503c = jSONObject.optString(efuWFSeiT.uXmmTmQlSq);
        this.f17504d = jSONObject.optString(com.amazon.a.a.o.b.f16728c);
        this.f17505e = jSONObject.optString("basePlanId");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("pricingPhase");
        if (jSONObjectOptJSONObject == null) {
            cVar = null;
        } else {
            cVar = new f.c(jSONObjectOptJSONObject);
        }
        this.f17506f = cVar;
    }
}
