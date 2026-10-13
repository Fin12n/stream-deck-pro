package com.revenuecat.purchases.common;

import D6.z;
import com.android.billingclient.api.PurchaseHistoryRecord;
import java.util.ArrayList;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class PurchaseHistoryRecordExtensionsKt {
    public static final String getFirstSku(PurchaseHistoryRecord purchaseHistoryRecord) {
        t.g(purchaseHistoryRecord, "<this>");
        Object obj = purchaseHistoryRecord.f().get(0);
        String str = (String) obj;
        if (purchaseHistoryRecord.f().size() > 1) {
            LogWrapperKt.log(LogIntent.GOOGLE_WARNING, "There's more than one sku in the PurchaseHistoryRecord, but only one will be used.");
        }
        t.f(obj, "skus[0].also {\n        i…_ONE_SKU)\n        }\n    }");
        return str;
    }

    public static final ArrayList<String> getListOfSkus(PurchaseHistoryRecord purchaseHistoryRecord) {
        t.g(purchaseHistoryRecord, "<this>");
        ArrayList<String> arrayListF = purchaseHistoryRecord.f();
        t.f(arrayListF, "this.skus");
        return arrayListF;
    }

    public static final String toHumanReadableDescription(PurchaseHistoryRecord purchaseHistoryRecord) {
        t.g(purchaseHistoryRecord, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append("skus: ");
        ArrayList arrayListF = purchaseHistoryRecord.f();
        t.f(arrayListF, "this.skus");
        sb.append(z.r0(arrayListF, null, "[", "]", 0, null, null, 57, null));
        sb.append(", purchaseTime: ");
        sb.append(purchaseHistoryRecord.c());
        sb.append(", purchaseToken: ");
        sb.append(purchaseHistoryRecord.d());
        return sb.toString();
    }
}
