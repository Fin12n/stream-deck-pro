package com.revenuecat.purchases.amazon;

import D6.C0937q;
import E4.JFpq.XRlnZWSrAFn;
import com.amazon.device.iap.model.ProductType;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.UserData;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.models.PurchaseState;
import com.revenuecat.purchases.models.PurchaseType;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.List;
import kotlin.jvm.internal.t;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class StoreTransactionConversionsKt {
    public static final StoreTransaction toStoreTransaction(Receipt receipt, String productId, PresentedOfferingContext presentedOfferingContext, PurchaseState purchaseState, UserData userData) {
        t.g(receipt, "<this>");
        t.g(productId, "productId");
        t.g(purchaseState, "purchaseState");
        t.g(userData, "userData");
        ProductType productType = receipt.getProductType();
        t.f(productType, "this.productType");
        com.revenuecat.purchases.ProductType revenueCatProductType = ProductTypeConversionsKt.toRevenueCatProductType(productType);
        List listE = C0937q.e(productId);
        long time = receipt.getPurchaseDate().getTime();
        String receiptId = receipt.getReceiptId();
        t.f(receiptId, "this.receiptId");
        boolean z8 = false;
        if (revenueCatProductType == com.revenuecat.purchases.ProductType.SUBS && !receipt.isCanceled()) {
            z8 = true;
        }
        Boolean boolValueOf = Boolean.valueOf(z8);
        JSONObject json = receipt.toJSON();
        t.f(json, XRlnZWSrAFn.GizwHQtyc);
        return new StoreTransaction((String) null, (List<String>) listE, revenueCatProductType, time, receiptId, purchaseState, boolValueOf, (String) null, json, presentedOfferingContext, userData.getUserId(), PurchaseType.AMAZON_PURCHASE, userData.getMarketplace(), (String) null, (ReplacementMode) null);
    }
}
