package com.revenuecat.purchases.google;

import D6.C0938s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.t;
import p138p3.C2781p;
import p138p3.C2782q;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class BillingClientParamBuildersKt {
    public static final com.android.billingclient.api.g buildQueryProductDetailsParams(String str, Set<String> productIds) {
        t.g(str, "<this>");
        t.g(productIds, "productIds");
        Set<String> set = productIds;
        ArrayList arrayList = new ArrayList(C0938s.y(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(com.android.billingclient.api.g.b.a().b((String) it.next()).c(str).a());
        }
        com.android.billingclient.api.g gVarA = com.android.billingclient.api.g.a().b(arrayList).a();
        t.f(gVarA, "newBuilder()\n        .se…List(productList).build()");
        return gVarA;
    }

    public static final C2781p buildQueryPurchaseHistoryParams(String str) {
        t.g(str, "<this>");
        if (t.c(str, "inapp") ? true : t.c(str, "subs")) {
            return C2781p.a().b(str).a();
        }
        return null;
    }

    public static final C2782q buildQueryPurchasesParams(String str) {
        t.g(str, "<this>");
        if (t.c(str, "inapp") ? true : t.c(str, "subs")) {
            return C2782q.a().b(str).a();
        }
        return null;
    }
}
