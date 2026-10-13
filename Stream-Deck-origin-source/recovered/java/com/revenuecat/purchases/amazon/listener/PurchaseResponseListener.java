package com.revenuecat.purchases.amazon.listener;

import Q6.k;
import Q6.o;
import android.app.Activity;
import android.os.Handler;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.UserDataResponse;
import com.revenuecat.purchases.models.StoreProduct;
import kotlin.jvm.internal.t;
import p116m7.kKPq.toqHM;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public interface PurchaseResponseListener extends PurchasingListener {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class DefaultImpls {
        public static void onProductDataResponse(PurchaseResponseListener purchaseResponseListener, ProductDataResponse response) {
            t.g(response, "response");
        }

        public static void onPurchaseUpdatesResponse(PurchaseResponseListener purchaseResponseListener, PurchaseUpdatesResponse response) {
            t.g(response, "response");
        }

        public static void onUserDataResponse(PurchaseResponseListener purchaseResponseListener, UserDataResponse userDataResponse) {
            t.g(userDataResponse, toqHM.faZrUVwap);
        }
    }

    void onProductDataResponse(ProductDataResponse productDataResponse);

    void onPurchaseUpdatesResponse(PurchaseUpdatesResponse purchaseUpdatesResponse);

    void onUserDataResponse(UserDataResponse userDataResponse);

    void purchase(Handler handler, Activity activity, String str, StoreProduct storeProduct, o oVar, k kVar);
}
