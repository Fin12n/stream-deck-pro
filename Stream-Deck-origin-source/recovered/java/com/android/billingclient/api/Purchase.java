package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p135p0.Dyk.GOKsbdzhLhXAMt;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class Purchase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONObject f17341c;

    public Purchase(String str, String str2) {
        this.f17339a = str;
        this.f17340b = str2;
        this.f17341c = new JSONObject(str);
    }

    public String a() {
        String strOptString = this.f17341c.optString("orderId");
        if (TextUtils.isEmpty(strOptString)) {
            return null;
        }
        return strOptString;
    }

    public String b() {
        return this.f17339a;
    }

    public List c() {
        return j();
    }

    public int d() {
        return this.f17341c.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    public long e() {
        return this.f17341c.optLong("purchaseTime");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.f17339a, purchase.b()) && TextUtils.equals(this.f17340b, purchase.g());
    }

    public String g() {
        return this.f17340b;
    }

    public boolean h() {
        return this.f17341c.optBoolean("acknowledged", true);
    }

    public int hashCode() {
        return this.f17339a.hashCode();
    }

    public boolean i() {
        return this.f17341c.optBoolean("autoRenewing");
    }

    public final ArrayList j() {
        ArrayList arrayList = new ArrayList();
        if (this.f17341c.has("productIds")) {
            JSONArray jSONArrayOptJSONArray = this.f17341c.optJSONArray("productIds");
            if (jSONArrayOptJSONArray != null) {
                for (int i8 = 0; i8 < jSONArrayOptJSONArray.length(); i8++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i8));
                }
            }
        } else if (this.f17341c.has("productId")) {
            arrayList.add(this.f17341c.optString("productId"));
        }
        return arrayList;
    }

    public String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f17339a));
    }

    public String f() {
        JSONObject jSONObject = this.f17341c;
        return jSONObject.optString("token", jSONObject.optString(GOKsbdzhLhXAMt.RhcIYIVMOir));
    }
}
