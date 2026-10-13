package com.revenuecat.purchases;

import Q6.k;
import Q6.o;
import com.revenuecat.purchases.interfaces.GetStoreProductsCallback;
import com.revenuecat.purchases.interfaces.PurchaseCallback;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.List;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class ListenerConversionsCommonKt {
    private static final k ON_ERROR_STUB = ListenerConversionsCommonKt$ON_ERROR_STUB$1.INSTANCE;
    private static final o ON_PURCHASE_ERROR_STUB = ListenerConversionsCommonKt$ON_PURCHASE_ERROR_STUB$1.INSTANCE;

    public static final k getON_ERROR_STUB() {
        return ON_ERROR_STUB;
    }

    public static final o getON_PURCHASE_ERROR_STUB() {
        return ON_PURCHASE_ERROR_STUB;
    }

    public static final void getOfferingsWith(Purchases purchases, k onError, k onSuccess) {
        t.g(purchases, "<this>");
        t.g(onError, "onError");
        t.g(onSuccess, "onSuccess");
        purchases.getOfferings(receiveOfferingsCallback(onSuccess, onError));
    }

    public static /* synthetic */ void getOfferingsWith$default(Purchases purchases, k kVar, k kVar2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            kVar = ON_ERROR_STUB;
        }
        getOfferingsWith(purchases, kVar, kVar2);
    }

    public static final void getProductsWith(Purchases purchases, List<String> productIds, k onError, k onGetStoreProducts) {
        t.g(purchases, "<this>");
        t.g(productIds, "productIds");
        t.g(onError, "onError");
        t.g(onGetStoreProducts, "onGetStoreProducts");
        purchases.getProducts(productIds, getStoreProductsCallback(onGetStoreProducts, onError));
    }

    public static /* synthetic */ void getProductsWith$default(Purchases purchases, List list, k kVar, k kVar2, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            kVar = ON_ERROR_STUB;
        }
        getProductsWith(purchases, list, kVar, kVar2);
    }

    public static final GetStoreProductsCallback getStoreProductsCallback(final k onReceived, final k onError) {
        t.g(onReceived, "onReceived");
        t.g(onError, "onError");
        return new GetStoreProductsCallback() { // from class: com.revenuecat.purchases.ListenerConversionsCommonKt.getStoreProductsCallback.1
            @Override // com.revenuecat.purchases.interfaces.GetStoreProductsCallback
            public void onError(PurchasesError error) {
                t.g(error, "error");
                onError.invoke(error);
            }

            @Override // com.revenuecat.purchases.interfaces.GetStoreProductsCallback
            public void onReceived(List<? extends StoreProduct> storeProducts) {
                t.g(storeProducts, "storeProducts");
                onReceived.invoke(storeProducts);
            }
        };
    }

    public static final PurchaseCallback purchaseCompletedCallback(final o onSuccess, final o onError) {
        t.g(onSuccess, "onSuccess");
        t.g(onError, "onError");
        return new PurchaseCallback() { // from class: com.revenuecat.purchases.ListenerConversionsCommonKt.purchaseCompletedCallback.1
            @Override // com.revenuecat.purchases.interfaces.PurchaseCallback
            public void onCompleted(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
                t.g(storeTransaction, "storeTransaction");
                t.g(customerInfo, "customerInfo");
                onSuccess.invoke(storeTransaction, customerInfo);
            }

            @Override // com.revenuecat.purchases.interfaces.PurchaseErrorCallback
            public void onError(PurchasesError error, boolean z8) {
                t.g(error, "error");
                onError.invoke(error, Boolean.valueOf(z8));
            }
        };
    }

    public static final void purchaseWith(Purchases purchases, PurchaseParams purchaseParams, o onError, o onSuccess) {
        t.g(purchases, "<this>");
        t.g(purchaseParams, "purchaseParams");
        t.g(onError, "onError");
        t.g(onSuccess, "onSuccess");
        purchases.purchase(purchaseParams, purchaseCompletedCallback(onSuccess, onError));
    }

    public static /* synthetic */ void purchaseWith$default(Purchases purchases, PurchaseParams purchaseParams, o oVar, o oVar2, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            oVar = ON_PURCHASE_ERROR_STUB;
        }
        purchaseWith(purchases, purchaseParams, oVar, oVar2);
    }

    public static final ReceiveCustomerInfoCallback receiveCustomerInfoCallback(final k onSuccess, final k onError) {
        t.g(onSuccess, "onSuccess");
        t.g(onError, "onError");
        return new ReceiveCustomerInfoCallback() { // from class: com.revenuecat.purchases.ListenerConversionsCommonKt.receiveCustomerInfoCallback.1
            @Override // com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback
            public void onError(PurchasesError error) {
                t.g(error, "error");
                k kVar = onError;
                if (kVar != null) {
                }
            }

            @Override // com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback
            public void onReceived(CustomerInfo customerInfo) {
                t.g(customerInfo, "customerInfo");
                k kVar = onSuccess;
                if (kVar != null) {
                }
            }
        };
    }

    public static final ReceiveOfferingsCallback receiveOfferingsCallback(final k onSuccess, final k onError) {
        t.g(onSuccess, "onSuccess");
        t.g(onError, "onError");
        return new ReceiveOfferingsCallback() { // from class: com.revenuecat.purchases.ListenerConversionsCommonKt.receiveOfferingsCallback.1
            @Override // com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback
            public void onError(PurchasesError error) {
                t.g(error, "error");
                onError.invoke(error);
            }

            @Override // com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback
            public void onReceived(Offerings offerings) {
                t.g(offerings, "offerings");
                onSuccess.invoke(offerings);
            }
        };
    }

    public static final void restorePurchasesWith(Purchases purchases, k onError, k onSuccess) {
        t.g(purchases, "<this>");
        t.g(onError, "onError");
        t.g(onSuccess, "onSuccess");
        purchases.restorePurchases(receiveCustomerInfoCallback(onSuccess, onError));
    }

    public static /* synthetic */ void restorePurchasesWith$default(Purchases purchases, k kVar, k kVar2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            kVar = ON_ERROR_STUB;
        }
        restorePurchasesWith(purchases, kVar, kVar2);
    }

    public static final void getProductsWith(Purchases purchases, List<String> productIds, ProductType productType, k onError, k onGetStoreProducts) {
        t.g(purchases, "<this>");
        t.g(productIds, "productIds");
        t.g(onError, "onError");
        t.g(onGetStoreProducts, "onGetStoreProducts");
        purchases.getProducts(productIds, productType, getStoreProductsCallback(onGetStoreProducts, onError));
    }

    public static /* synthetic */ void getProductsWith$default(Purchases purchases, List list, ProductType productType, k kVar, k kVar2, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            kVar = ON_ERROR_STUB;
        }
        getProductsWith(purchases, list, productType, kVar, kVar2);
    }
}
