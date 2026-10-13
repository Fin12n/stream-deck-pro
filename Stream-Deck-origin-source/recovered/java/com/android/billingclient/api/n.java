package com.android.billingclient.api;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17500b;

    public n(JSONObject jSONObject) {
        this.f17499a = jSONObject.getString("rentalPeriod");
        String strOptString = jSONObject.optString("rentalExpirationPeriod");
        this.f17500b = true == strOptString.isEmpty() ? null : strOptString;
    }
}
