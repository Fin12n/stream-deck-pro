package com.revenuecat.purchases;

import C6.InterfaceC0916e;
import E4.JFpq.XRlnZWSrAFn;
import Q6.k;
import Q6.o;
import T0.Vl.PCRzgdeK;
import android.app.Activity;
import com.revenuecat.purchases.interfaces.GetAmazonLWAConsentStatusCallback;
import com.revenuecat.purchases.interfaces.LogInCallback;
import com.revenuecat.purchases.interfaces.ProductChangeCallback;
import com.revenuecat.purchases.interfaces.SyncAttributesAndOfferingsCallback;
import com.revenuecat.purchases.interfaces.SyncPurchasesCallback;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.List;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class ListenerConversionsKt {
    public static final GetAmazonLWAConsentStatusCallback getAmazonLWAConsentStatusListener(final k onSuccess, final k onError) {
        t.g(onSuccess, "onSuccess");
        t.g(onError, "onError");
        return new GetAmazonLWAConsentStatusCallback() { // from class: com.revenuecat.purchases.ListenerConversionsKt.getAmazonLWAConsentStatusListener.1
            @Override // com.revenuecat.purchases.interfaces.GetAmazonLWAConsentStatusCallback
            public void onError(PurchasesError error) {
                t.g(error, "error");
                onError.invoke(error);
            }

            @Override // com.revenuecat.purchases.interfaces.GetAmazonLWAConsentStatusCallback
            public void onSuccess(AmazonLWAConsentStatus consentStatus) {
                t.g(consentStatus, "consentStatus");
                onSuccess.invoke(consentStatus);
            }
        };
    }

    public static final void getAmazonLWAConsentStatusWith(Purchases purchases, k onError, k onSuccess) {
        t.g(purchases, "<this>");
        t.g(onError, "onError");
        t.g(onSuccess, "onSuccess");
        purchases.getAmazonLWAConsentStatus(getAmazonLWAConsentStatusListener(onSuccess, onError));
    }

    public static /* synthetic */ void getAmazonLWAConsentStatusWith$default(Purchases purchases, k kVar, k kVar2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            kVar = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        getAmazonLWAConsentStatusWith(purchases, kVar, kVar2);
    }

    public static final void getCustomerInfoWith(Purchases purchases, k onError, k onSuccess) {
        t.g(purchases, "<this>");
        t.g(onError, "onError");
        t.g(onSuccess, "onSuccess");
        purchases.getCustomerInfo(ListenerConversionsCommonKt.receiveCustomerInfoCallback(onSuccess, onError));
    }

    public static /* synthetic */ void getCustomerInfoWith$default(Purchases purchases, k kVar, k kVar2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            kVar = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        getCustomerInfoWith(purchases, kVar, kVar2);
    }

    @InterfaceC0916e
    public static final void getNonSubscriptionSkusWith(Purchases purchases, List<String> skus, k onError, k onReceiveSkus) {
        t.g(purchases, "<this>");
        t.g(skus, "skus");
        t.g(onError, "onError");
        t.g(onReceiveSkus, "onReceiveSkus");
        purchases.getProducts(skus, ProductType.INAPP, ListenerConversionsCommonKt.getStoreProductsCallback(onReceiveSkus, onError));
    }

    @InterfaceC0916e
    public static final void getSubscriptionSkusWith(Purchases purchases, List<String> skus, k onError, k onReceiveSkus) {
        t.g(purchases, "<this>");
        t.g(skus, "skus");
        t.g(onError, "onError");
        t.g(onReceiveSkus, "onReceiveSkus");
        purchases.getProducts(skus, ProductType.SUBS, ListenerConversionsCommonKt.getStoreProductsCallback(onReceiveSkus, onError));
    }

    public static /* synthetic */ void getSubscriptionSkusWith$default(Purchases purchases, List list, k kVar, k kVar2, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            kVar = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        getSubscriptionSkusWith(purchases, list, kVar, kVar2);
    }

    public static final LogInCallback logInSuccessListener(final o onSuccess, final k onError) {
        t.g(onSuccess, "onSuccess");
        t.g(onError, "onError");
        return new LogInCallback() { // from class: com.revenuecat.purchases.ListenerConversionsKt.logInSuccessListener.1
            @Override // com.revenuecat.purchases.interfaces.LogInCallback
            public void onError(PurchasesError error) {
                t.g(error, "error");
                k kVar = onError;
                if (kVar != null) {
                }
            }

            @Override // com.revenuecat.purchases.interfaces.LogInCallback
            public void onReceived(CustomerInfo customerInfo, boolean z8) {
                t.g(customerInfo, "customerInfo");
                o oVar = onSuccess;
                if (oVar != null) {
                }
            }
        };
    }

    public static final void logInWith(Purchases purchases, String appUserID, k onError, o onSuccess) {
        t.g(purchases, "<this>");
        t.g(appUserID, "appUserID");
        t.g(onError, "onError");
        t.g(onSuccess, "onSuccess");
        purchases.logIn(appUserID, logInSuccessListener(onSuccess, onError));
    }

    public static /* synthetic */ void logInWith$default(Purchases purchases, String str, k kVar, o oVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            kVar = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        logInWith(purchases, str, kVar, oVar);
    }

    public static /* synthetic */ void logOutWith$default(Purchases purchases, k kVar, k kVar2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            kVar = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        logOutWith(purchases, kVar, kVar2);
    }

    public static final ProductChangeCallback productChangeCompletedListener(final o onSuccess, final o onError) {
        t.g(onSuccess, "onSuccess");
        t.g(onError, "onError");
        return new ProductChangeCallback() { // from class: com.revenuecat.purchases.ListenerConversionsKt.productChangeCompletedListener.1
            @Override // com.revenuecat.purchases.interfaces.ProductChangeCallback
            public void onCompleted(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
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

    public static /* synthetic */ void purchasePackageWith$default(Purchases purchases, Activity activity, Package r8, o oVar, o oVar2, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            oVar = ListenerConversionsCommonKt.getON_PURCHASE_ERROR_STUB();
        }
        purchasePackageWith(purchases, activity, r8, oVar, oVar2);
    }

    @InterfaceC0916e
    public static final void purchaseProductWith(Purchases purchases, Activity activity, StoreProduct storeProduct, o onError, o onSuccess) {
        t.g(purchases, "<this>");
        t.g(activity, "activity");
        t.g(storeProduct, "storeProduct");
        t.g(onError, "onError");
        t.g(onSuccess, "onSuccess");
        purchases.purchaseProduct(activity, storeProduct, ListenerConversionsCommonKt.purchaseCompletedCallback(onSuccess, onError));
    }

    public static /* synthetic */ void purchaseProductWith$default(Purchases purchases, Activity activity, StoreProduct storeProduct, o oVar, o oVar2, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            oVar = ListenerConversionsCommonKt.getON_PURCHASE_ERROR_STUB();
        }
        purchaseProductWith(purchases, activity, storeProduct, oVar, oVar2);
    }

    public static final void syncAttributesAndOfferingsIfNeededWith(Purchases purchases, k onError, k onSuccess) throws Throwable {
        t.g(purchases, "<this>");
        t.g(onError, "onError");
        t.g(onSuccess, "onSuccess");
        purchases.syncAttributesAndOfferingsIfNeeded(syncAttributesAndOfferingsListener(onSuccess, onError));
    }

    public static /* synthetic */ void syncAttributesAndOfferingsIfNeededWith$default(Purchases purchases, k kVar, k kVar2, int i8, Object obj) throws Throwable {
        if ((i8 & 1) != 0) {
            kVar = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        syncAttributesAndOfferingsIfNeededWith(purchases, kVar, kVar2);
    }

    public static final SyncAttributesAndOfferingsCallback syncAttributesAndOfferingsListener(final k onSuccess, final k onError) {
        t.g(onSuccess, "onSuccess");
        t.g(onError, "onError");
        return new SyncAttributesAndOfferingsCallback() { // from class: com.revenuecat.purchases.ListenerConversionsKt.syncAttributesAndOfferingsListener.1
            @Override // com.revenuecat.purchases.interfaces.SyncAttributesAndOfferingsCallback
            public void onError(PurchasesError error) {
                t.g(error, "error");
                onError.invoke(error);
            }

            @Override // com.revenuecat.purchases.interfaces.SyncAttributesAndOfferingsCallback
            public void onSuccess(Offerings offerings) {
                t.g(offerings, "offerings");
                onSuccess.invoke(offerings);
            }
        };
    }

    public static final SyncPurchasesCallback syncPurchasesListener(final k onSuccess, final k onError) {
        t.g(onSuccess, "onSuccess");
        t.g(onError, "onError");
        return new SyncPurchasesCallback() { // from class: com.revenuecat.purchases.ListenerConversionsKt.syncPurchasesListener.1
            @Override // com.revenuecat.purchases.interfaces.SyncPurchasesCallback
            public void onError(PurchasesError error) {
                t.g(error, "error");
                onError.invoke(error);
            }

            @Override // com.revenuecat.purchases.interfaces.SyncPurchasesCallback
            public void onSuccess(CustomerInfo customerInfo) {
                t.g(customerInfo, "customerInfo");
                onSuccess.invoke(customerInfo);
            }
        };
    }

    public static final void syncPurchasesWith(Purchases purchases, k onError, k onSuccess) {
        t.g(purchases, "<this>");
        t.g(onError, "onError");
        t.g(onSuccess, "onSuccess");
        purchases.syncPurchases(syncPurchasesListener(onSuccess, onError));
    }

    public static /* synthetic */ void syncPurchasesWith$default(Purchases purchases, k kVar, k kVar2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            kVar = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        syncPurchasesWith(purchases, kVar, kVar2);
    }

    public static final void getCustomerInfoWith(Purchases purchases, CacheFetchPolicy fetchPolicy, k onError, k onSuccess) {
        t.g(purchases, "<this>");
        t.g(fetchPolicy, "fetchPolicy");
        t.g(onError, "onError");
        t.g(onSuccess, "onSuccess");
        purchases.getCustomerInfo(fetchPolicy, ListenerConversionsCommonKt.receiveCustomerInfoCallback(onSuccess, onError));
    }

    public static final void logOutWith(Purchases purchases, k kVar, k onSuccess) {
        t.g(purchases, "<this>");
        t.g(kVar, PCRzgdeK.ZAuBQNyKOgA);
        t.g(onSuccess, "onSuccess");
        purchases.logOut(ListenerConversionsCommonKt.receiveCustomerInfoCallback(onSuccess, kVar));
    }

    @InterfaceC0916e
    public static final void purchasePackageWith(Purchases purchases, Activity activity, Package packageToPurchase, o onError, o onSuccess) {
        t.g(purchases, XRlnZWSrAFn.nQoLMfYXSN);
        t.g(activity, "activity");
        t.g(packageToPurchase, "packageToPurchase");
        t.g(onError, "onError");
        t.g(onSuccess, "onSuccess");
        purchases.purchasePackage(activity, packageToPurchase, ListenerConversionsCommonKt.purchaseCompletedCallback(onSuccess, onError));
    }

    public static /* synthetic */ void getCustomerInfoWith$default(Purchases purchases, CacheFetchPolicy cacheFetchPolicy, k kVar, k kVar2, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            kVar = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        getCustomerInfoWith(purchases, cacheFetchPolicy, kVar, kVar2);
    }
}
