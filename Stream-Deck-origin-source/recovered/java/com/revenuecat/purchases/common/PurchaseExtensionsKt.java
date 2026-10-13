package com.revenuecat.purchases.common;

import D6.z;
import com.android.billingclient.api.Purchase;
import java.util.List;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class PurchaseExtensionsKt {
    public static final String getFirstProductId(Purchase purchase) {
        t.g(purchase, "<this>");
        Object obj = purchase.c().get(0);
        String str = (String) obj;
        if (purchase.c().size() > 1) {
            LogWrapperKt.log(LogIntent.GOOGLE_WARNING, "There's more than one sku in the PurchaseHistoryRecord, but only one will be used.");
        }
        t.f(obj, "products[0].also {\n     …_ONE_SKU)\n        }\n    }");
        return str;
    }

    public static final String toHumanReadableDescription(Purchase purchase) {
        t.g(purchase, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append("productIds: ");
        List listC = purchase.c();
        t.f(listC, "this.products");
        sb.append(z.r0(listC, null, "[", "]", 0, null, null, 57, null));
        sb.append(", orderId: ");
        sb.append(purchase.a());
        sb.append(", purchaseToken: ");
        sb.append(purchase.f());
        return sb.toString();
    }
}
