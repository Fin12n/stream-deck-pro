package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class PurchaseHistoryRecord {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONObject f17344c;

    public PurchaseHistoryRecord(String str, String str2) {
        this.f17342a = str;
        this.f17343b = str2;
        this.f17344c = new JSONObject(str);
    }

    public String a() {
        return this.f17342a;
    }

    public List b() {
        return g();
    }

    public long c() {
        return this.f17344c.optLong("purchaseTime");
    }

    public String d() {
        JSONObject jSONObject = this.f17344c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public String e() {
        return this.f17343b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseHistoryRecord)) {
            return false;
        }
        PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) obj;
        return TextUtils.equals(this.f17342a, purchaseHistoryRecord.a()) && TextUtils.equals(this.f17343b, purchaseHistoryRecord.e());
    }

    public ArrayList f() {
        return g();
    }

    public final ArrayList g() {
        ArrayList arrayList = new ArrayList();
        if (this.f17344c.has("productIds")) {
            JSONArray jSONArrayOptJSONArray = this.f17344c.optJSONArray("productIds");
            if (jSONArrayOptJSONArray != null) {
                for (int i8 = 0; i8 < jSONArrayOptJSONArray.length(); i8++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i8));
                }
            }
        } else if (this.f17344c.has("productId")) {
            arrayList.add(this.f17344c.optString("productId"));
        }
        return arrayList;
    }

    public int hashCode() {
        return this.f17342a.hashCode();
    }

    public String toString() {
        return "PurchaseHistoryRecord. Json: ".concat(String.valueOf(this.f17342a));
    }
}
