package com.revenuecat.purchases;

import C6.G;
import D6.z;
import Q6.k;
import Z.JTT.ryTuoS;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.ReceiptInfo;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.PurchaseStrings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p179u4.eubL.OjEsfyJYzbPn;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class SyncPurchasesHelper {
    private final BillingAbstract billing;
    private final CustomerInfoHelper customerInfoHelper;
    private final IdentityManager identityManager;
    private final PostReceiptHelper postReceiptHelper;

    /* JADX INFO: renamed from: com.revenuecat.purchases.SyncPurchasesHelper$syncPurchases$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C21521 extends u implements k {
        final /* synthetic */ boolean $appInBackground;
        final /* synthetic */ String $appUserID;
        final /* synthetic */ boolean $isRestore;
        final /* synthetic */ k $onError;
        final /* synthetic */ k $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21521(String str, boolean z8, boolean z9, k kVar, k kVar2) {
            super(1);
            this.$appUserID = str;
            this.$appInBackground = z8;
            this.$isRestore = z9;
            this.$onSuccess = kVar;
            this.$onError = kVar2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$handleLastPurchase(List<PurchasesError> list, SyncPurchasesHelper syncPurchasesHelper, String str, boolean z8, boolean z9, k kVar, k kVar2, StoreTransaction storeTransaction, StoreTransaction storeTransaction2) {
            if (t.c(storeTransaction, storeTransaction2)) {
                if (list.isEmpty()) {
                    LogUtilsKt.debugLog(PurchaseStrings.SYNCED_PURCHASES_SUCCESSFULLY);
                    syncPurchasesHelper.retrieveCustomerInfo(str, z8, z9, kVar, kVar2);
                } else {
                    String str2 = String.format(PurchaseStrings.SYNCING_PURCHASES_ERROR, Arrays.copyOf(new Object[]{list}, 1));
                    t.f(str2, "format(this, *args)");
                    LogUtilsKt.errorLog$default(str2, null, 2, null);
                    kVar2.invoke(z.i0(list));
                }
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<StoreTransaction>) obj);
            return G.f1419a;
        }

        public final void invoke(List<StoreTransaction> allPurchases) {
            t.g(allPurchases, "allPurchases");
            if (allPurchases.isEmpty()) {
                SyncPurchasesHelper.this.retrieveCustomerInfo(this.$appUserID, this.$appInBackground, this.$isRestore, this.$onSuccess, this.$onError);
                return;
            }
            StoreTransaction storeTransaction = (StoreTransaction) z.t0(allPurchases);
            ArrayList arrayList = new ArrayList();
            SyncPurchasesHelper syncPurchasesHelper = SyncPurchasesHelper.this;
            boolean z8 = this.$isRestore;
            String str = this.$appUserID;
            boolean z9 = this.$appInBackground;
            k kVar = this.$onSuccess;
            k kVar2 = this.$onError;
            for (StoreTransaction storeTransaction2 : allPurchases) {
                ReceiptInfo receiptInfo = new ReceiptInfo(storeTransaction2.getProductIds(), null, null, null, null, null, null, 126, null);
                PostReceiptHelper postReceiptHelper = syncPurchasesHelper.postReceiptHelper;
                String purchaseToken = storeTransaction2.getPurchaseToken();
                String storeUserID = storeTransaction2.getStoreUserID();
                String marketplace = storeTransaction2.getMarketplace();
                PostReceiptInitiationSource postReceiptInitiationSource = PostReceiptInitiationSource.RESTORE;
                SyncPurchasesHelper$syncPurchases$1$1$1 syncPurchasesHelper$syncPurchases$1$1$1 = new SyncPurchasesHelper$syncPurchases$1$1$1(storeTransaction2, storeTransaction, arrayList, syncPurchasesHelper, str, z9, z8, kVar, kVar2);
                ArrayList arrayList2 = arrayList;
                StoreTransaction storeTransaction3 = storeTransaction;
                SyncPurchasesHelper$syncPurchases$1$1$2 syncPurchasesHelper$syncPurchases$1$1$2 = new SyncPurchasesHelper$syncPurchases$1$1$2(storeTransaction2, arrayList2, storeTransaction3, syncPurchasesHelper, str, z9, z8, kVar, kVar2);
                arrayList = arrayList2;
                storeTransaction = storeTransaction3;
                String str2 = str;
                k kVar3 = kVar2;
                boolean z10 = z8;
                postReceiptHelper.postTokenWithoutConsuming(purchaseToken, storeUserID, receiptInfo, z10, str2, marketplace, postReceiptInitiationSource, syncPurchasesHelper$syncPurchases$1$1$1, syncPurchasesHelper$syncPurchases$1$1$2);
                z9 = z9;
                kVar = kVar;
                z8 = z10;
                str = str2;
                kVar2 = kVar3;
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.SyncPurchasesHelper$syncPurchases$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class AnonymousClass2 extends u implements k {
        final /* synthetic */ k $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(k kVar) {
            super(1);
            this.$onError = kVar;
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return G.f1419a;
        }

        public final void invoke(PurchasesError it) {
            t.g(it, "it");
            LogIntent logIntent = LogIntent.RC_ERROR;
            String str = String.format(PurchaseStrings.SYNCING_PURCHASES_ERROR, Arrays.copyOf(new Object[]{it}, 1));
            t.f(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
            this.$onError.invoke(it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void retrieveCustomerInfo(String str, boolean z8, boolean z9, final k kVar, final k kVar2) {
        this.customerInfoHelper.retrieveCustomerInfo(str, CacheFetchPolicy.CACHED_OR_FETCHED, z8, z9, new ReceiveCustomerInfoCallback() { // from class: com.revenuecat.purchases.SyncPurchasesHelper.retrieveCustomerInfo.1
            @Override // com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback
            public void onReceived(CustomerInfo customerInfo) {
                t.g(customerInfo, "customerInfo");
                kVar.invoke(customerInfo);
            }

            @Override // com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback
            public void onError(PurchasesError purchasesError) {
                t.g(purchasesError, OjEsfyJYzbPn.WxqGwdeJ);
                kVar2.invoke(purchasesError);
            }
        });
    }

    public final void syncPurchases(boolean z8, boolean z9, k onSuccess, k onError) {
        t.g(onSuccess, "onSuccess");
        t.g(onError, "onError");
        LogWrapperKt.log(LogIntent.DEBUG, PurchaseStrings.SYNCING_PURCHASES);
        String currentAppUserID = this.identityManager.getCurrentAppUserID();
        this.billing.queryAllPurchases(currentAppUserID, new C21521(currentAppUserID, z9, z8, onSuccess, onError), new AnonymousClass2(onError));
    }

    public SyncPurchasesHelper(BillingAbstract billing, IdentityManager identityManager, CustomerInfoHelper customerInfoHelper, PostReceiptHelper postReceiptHelper) {
        t.g(billing, "billing");
        t.g(identityManager, "identityManager");
        t.g(customerInfoHelper, "customerInfoHelper");
        t.g(postReceiptHelper, ryTuoS.qDRyclYSyjux);
        this.billing = billing;
        this.identityManager = identityManager;
        this.customerInfoHelper = customerInfoHelper;
        this.postReceiptHelper = postReceiptHelper;
    }
}
