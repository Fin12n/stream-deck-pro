package com.android.billingclient.api;

import android.text.TextUtils;
import com.elgato.streamdeck.vsd2.connection.Cjvi.LYdqVGvOGMNr;
import com.google.android.gms.internal.play_billing.AbstractC2027j;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f17413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f17416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f17417f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f17418g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f17419h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f17420i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f17421j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f17422k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f17423l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f17424m;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f17425a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f17426b;

        public a(JSONObject jSONObject) {
            this.f17425a = jSONObject.getInt("commitmentPaymentsCount");
            this.f17426b = jSONObject.optInt("subsequentCommitmentPaymentsCount");
        }

        public int a() {
            return this.f17425a;
        }

        public int b() {
            return this.f17426b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f17427a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f17428b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f17429c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f17430d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f17431e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f17432f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final AbstractC2027j f17433g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Long f17434h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final k f17435i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final o f17436j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final l f17437k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final m f17438l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final n f17439m;

        public b(JSONObject jSONObject) {
            this.f17427a = jSONObject.optString("formattedPrice");
            this.f17428b = jSONObject.optLong("priceAmountMicros");
            this.f17429c = jSONObject.optString("priceCurrencyCode");
            String strOptString = jSONObject.optString("offerIdToken");
            this.f17430d = true == strOptString.isEmpty() ? null : strOptString;
            String strOptString2 = jSONObject.optString("offerId");
            this.f17431e = true == strOptString2.isEmpty() ? null : strOptString2;
            String strOptString3 = jSONObject.optString("purchaseOptionId");
            this.f17432f = true == strOptString3.isEmpty() ? null : strOptString3;
            jSONObject.optInt("offerType");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                for (int i8 = 0; i8 < jSONArrayOptJSONArray.length(); i8++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i8));
                }
            }
            this.f17433g = AbstractC2027j.F(arrayList);
            this.f17434h = jSONObject.has("fullPriceMicros") ? Long.valueOf(jSONObject.optLong("fullPriceMicros")) : null;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
            this.f17435i = jSONObjectOptJSONObject == null ? null : new k(jSONObjectOptJSONObject);
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
            this.f17436j = jSONObjectOptJSONObject2 == null ? null : new o(jSONObjectOptJSONObject2);
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
            this.f17437k = jSONObjectOptJSONObject3 == null ? null : new l(jSONObjectOptJSONObject3);
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("preorderDetails");
            this.f17438l = jSONObjectOptJSONObject4 == null ? null : new m(jSONObjectOptJSONObject4);
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("rentalDetails");
            this.f17439m = jSONObjectOptJSONObject5 != null ? new n(jSONObjectOptJSONObject5) : null;
        }

        public String a() {
            return this.f17427a;
        }

        public long b() {
            return this.f17428b;
        }

        public String c() {
            return this.f17429c;
        }

        public final String d() {
            return this.f17430d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f17440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f17441b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f17442c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f17443d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f17444e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f17445f;

        public c(JSONObject jSONObject) {
            this.f17443d = jSONObject.optString("billingPeriod");
            this.f17442c = jSONObject.optString("priceCurrencyCode");
            this.f17440a = jSONObject.optString("formattedPrice");
            this.f17441b = jSONObject.optLong("priceAmountMicros");
            this.f17445f = jSONObject.optInt("recurrenceMode");
            this.f17444e = jSONObject.optInt("billingCycleCount");
        }

        public int a() {
            return this.f17444e;
        }

        public String b() {
            return this.f17443d;
        }

        public String c() {
            return this.f17440a;
        }

        public long d() {
            return this.f17441b;
        }

        public String e() {
            return this.f17442c;
        }

        public int f() {
            return this.f17445f;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f17446a;

        public d(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i8);
                    if (jSONObjectOptJSONObject != null) {
                        arrayList.add(new c(jSONObjectOptJSONObject));
                    }
                }
            }
            this.f17446a = arrayList;
        }

        public List a() {
            return this.f17446a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f17447a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f17448b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f17449c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final d f17450d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List f17451e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final a f17452f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final p f17453g;

        public e(JSONObject jSONObject) {
            this.f17447a = jSONObject.optString("basePlanId");
            String strOptString = jSONObject.optString("offerId");
            this.f17448b = true == strOptString.isEmpty() ? null : strOptString;
            this.f17449c = jSONObject.getString("offerIdToken");
            this.f17450d = new d(jSONObject.getJSONArray("pricingPhases"));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
            this.f17452f = jSONObjectOptJSONObject == null ? null : new a(jSONObjectOptJSONObject);
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
            this.f17453g = jSONObjectOptJSONObject2 != null ? new p(jSONObjectOptJSONObject2) : null;
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            if (jSONArrayOptJSONArray != null) {
                for (int i8 = 0; i8 < jSONArrayOptJSONArray.length(); i8++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i8));
                }
            }
            this.f17451e = arrayList;
        }

        public String a() {
            return this.f17447a;
        }

        public a b() {
            return this.f17452f;
        }

        public String c() {
            return this.f17448b;
        }

        public List d() {
            return this.f17451e;
        }

        public String e() {
            return this.f17449c;
        }

        public d f() {
            return this.f17450d;
        }
    }

    public String a() {
        return this.f17418g;
    }

    public String b() {
        return this.f17417f;
    }

    public b c() {
        List list = this.f17424m;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (b) this.f17424m.get(0);
    }

    public String d() {
        return this.f17414c;
    }

    public String e() {
        return this.f17415d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            return TextUtils.equals(this.f17412a, ((f) obj).f17412a);
        }
        return false;
    }

    public List f() {
        return this.f17423l;
    }

    public String g() {
        return this.f17416e;
    }

    public final String h() {
        return this.f17413b.optString("packageName");
    }

    public int hashCode() {
        return this.f17412a.hashCode();
    }

    public final String i() {
        return this.f17419h;
    }

    public String j() {
        return this.f17422k;
    }

    public String toString() {
        List list = this.f17423l;
        return "ProductDetails{jsonString='" + this.f17412a + "', parsedJson=" + this.f17413b.toString() + ", productId='" + this.f17414c + "', productType='" + this.f17415d + "', title='" + this.f17416e + "', productDetailsToken='" + this.f17419h + "', subscriptionOfferDetails=" + String.valueOf(list) + "}";
    }

    public f(String str) {
        ArrayList arrayList;
        this.f17412a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f17413b = jSONObject;
        String strOptString = jSONObject.optString("productId");
        this.f17414c = strOptString;
        String strOptString2 = jSONObject.optString("type");
        this.f17415d = strOptString2;
        if (!TextUtils.isEmpty(strOptString)) {
            if (!TextUtils.isEmpty(strOptString2)) {
                this.f17416e = jSONObject.optString(com.amazon.a.a.o.b.f16718S);
                this.f17417f = jSONObject.optString("name");
                this.f17418g = jSONObject.optString(com.amazon.a.a.o.b.f16728c);
                this.f17420i = jSONObject.optString("packageDisplayName");
                this.f17421j = jSONObject.optString(com.amazon.a.a.o.b.f16735j);
                this.f17419h = jSONObject.optString("skuDetailsToken");
                this.f17422k = jSONObject.optString("serializedDocid");
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
                if (jSONArrayOptJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i8 = 0; i8 < jSONArrayOptJSONArray.length(); i8++) {
                        arrayList2.add(new e(jSONArrayOptJSONArray.getJSONObject(i8)));
                    }
                    this.f17423l = arrayList2;
                } else {
                    if (!strOptString2.equals("subs") && !strOptString2.equals("play_pass_subs")) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList();
                    }
                    this.f17423l = arrayList;
                }
                JSONObject jSONObjectOptJSONObject = this.f17413b.optJSONObject("oneTimePurchaseOfferDetails");
                JSONArray jSONArrayOptJSONArray2 = this.f17413b.optJSONArray("oneTimePurchaseOfferDetailsList");
                ArrayList arrayList3 = new ArrayList();
                if (jSONArrayOptJSONArray2 != null) {
                    for (int i9 = 0; i9 < jSONArrayOptJSONArray2.length(); i9++) {
                        arrayList3.add(new b(jSONArrayOptJSONArray2.getJSONObject(i9)));
                    }
                    this.f17424m = arrayList3;
                    return;
                }
                if (jSONObjectOptJSONObject != null) {
                    arrayList3.add(new b(jSONObjectOptJSONObject));
                    this.f17424m = arrayList3;
                    return;
                } else {
                    this.f17424m = null;
                    return;
                }
            }
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        throw new IllegalArgumentException(LYdqVGvOGMNr.gDgVV);
    }
}
