package com.revenuecat.purchases;

import C6.G;
import D6.r;
import Q6.k;
import Q6.o;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.PurchaseStrings;
import com.revenuecat.purchases.utils.Result;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class PostPendingTransactionsHelper {
    private final AppConfig appConfig;
    private final BillingAbstract billing;
    private final DeviceCache deviceCache;
    private final Dispatcher dispatcher;
    private final IdentityManager identityManager;
    private final PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper;

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostPendingTransactionsHelper$postTransactionsWithCompletion$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class AnonymousClass1 extends u implements o {
        final /* synthetic */ k $onError;
        final /* synthetic */ k $onSuccess;
        final /* synthetic */ List<Result<CustomerInfo, PurchasesError>> $results;
        final /* synthetic */ List<StoreTransaction> $transactionsToSync;
        final /* synthetic */ PostPendingTransactionsHelper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<Result<CustomerInfo, PurchasesError>> list, PostPendingTransactionsHelper postPendingTransactionsHelper, List<StoreTransaction> list2, k kVar, k kVar2) {
            super(2);
            this.$results = list;
            this.this$0 = postPendingTransactionsHelper;
            this.$transactionsToSync = list2;
            this.$onError = kVar;
            this.$onSuccess = kVar2;
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((StoreTransaction) obj, (CustomerInfo) obj2);
            return G.f1419a;
        }

        public final void invoke(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
            t.g(storeTransaction, "<anonymous parameter 0>");
            t.g(customerInfo, "customerInfo");
            this.$results.add(new Result.Success(customerInfo));
            this.this$0.callCompletionFromResults(this.$transactionsToSync, this.$results, this.$onError, this.$onSuccess);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostPendingTransactionsHelper$postTransactionsWithCompletion$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class AnonymousClass2 extends u implements o {
        final /* synthetic */ k $onError;
        final /* synthetic */ k $onSuccess;
        final /* synthetic */ List<Result<CustomerInfo, PurchasesError>> $results;
        final /* synthetic */ List<StoreTransaction> $transactionsToSync;
        final /* synthetic */ PostPendingTransactionsHelper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(List<Result<CustomerInfo, PurchasesError>> list, PostPendingTransactionsHelper postPendingTransactionsHelper, List<StoreTransaction> list2, k kVar, k kVar2) {
            super(2);
            this.$results = list;
            this.this$0 = postPendingTransactionsHelper;
            this.$transactionsToSync = list2;
            this.$onError = kVar;
            this.$onSuccess = kVar2;
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((StoreTransaction) obj, (PurchasesError) obj2);
            return G.f1419a;
        }

        public final void invoke(StoreTransaction storeTransaction, PurchasesError purchasesError) {
            t.g(storeTransaction, "<anonymous parameter 0>");
            t.g(purchasesError, "purchasesError");
            this.$results.add(new Result.Error(purchasesError));
            this.this$0.callCompletionFromResults(this.$transactionsToSync, this.$results, this.$onError, this.$onSuccess);
        }
    }

    public PostPendingTransactionsHelper(AppConfig appConfig, DeviceCache deviceCache, BillingAbstract billing, Dispatcher dispatcher, IdentityManager identityManager, PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper) {
        t.g(appConfig, "appConfig");
        t.g(deviceCache, "deviceCache");
        t.g(billing, "billing");
        t.g(dispatcher, "dispatcher");
        t.g(identityManager, "identityManager");
        t.g(postTransactionWithProductDetailsHelper, "postTransactionWithProductDetailsHelper");
        this.appConfig = appConfig;
        this.deviceCache = deviceCache;
        this.billing = billing;
        this.dispatcher = dispatcher;
        this.identityManager = identityManager;
        this.postTransactionWithProductDetailsHelper = postTransactionWithProductDetailsHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void callCompletionFromResults(List<StoreTransaction> list, List<? extends Result<CustomerInfo, PurchasesError>> list2, k kVar, k kVar2) {
        if (list.size() == list2.size()) {
            int i8 = 0;
            for (Object obj : list2) {
                int i9 = i8 + 1;
                if (i8 < 0) {
                    r.x();
                }
                Result result = (Result) obj;
                if (result instanceof Result.Error) {
                    if (kVar != null) {
                        kVar.invoke(((Result.Error) result).getValue());
                        return;
                    }
                    return;
                } else {
                    if (i8 == list2.size() - 1 && kVar2 != null) {
                        t.e(result, "null cannot be cast to non-null type com.revenuecat.purchases.utils.Result.Success<com.revenuecat.purchases.CustomerInfo>");
                        kVar2.invoke(((Result.Success) result).getValue());
                    }
                    i8 = i9;
                }
            }
        }
    }

    public static /* synthetic */ void callCompletionFromResults$default(PostPendingTransactionsHelper postPendingTransactionsHelper, List list, List list2, k kVar, k kVar2, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            kVar = null;
        }
        if ((i8 & 8) != 0) {
            kVar2 = null;
        }
        postPendingTransactionsHelper.callCompletionFromResults(list, list2, kVar, kVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void postTransactionsWithCompletion(List<StoreTransaction> list, boolean z8, String str, k kVar, k kVar2) {
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            this.postTransactionWithProductDetailsHelper.postTransactions(list, z8, str, PostReceiptInitiationSource.UNSYNCED_ACTIVE_PURCHASES, new AnonymousClass1(arrayList, this, list, kVar, kVar2), new AnonymousClass2(arrayList, this, list, kVar, kVar2));
        } else {
            LogWrapperKt.log(LogIntent.DEBUG, PurchaseStrings.NO_PENDING_PURCHASES_TO_SYNC);
            if (kVar2 != null) {
                kVar2.invoke(null);
            }
        }
    }

    public static /* synthetic */ void postTransactionsWithCompletion$default(PostPendingTransactionsHelper postPendingTransactionsHelper, List list, boolean z8, String str, k kVar, k kVar2, int i8, Object obj) {
        if ((i8 & 8) != 0) {
            kVar = null;
        }
        if ((i8 & 16) != 0) {
            kVar2 = null;
        }
        postPendingTransactionsHelper.postTransactionsWithCompletion(list, z8, str, kVar, kVar2);
    }

    public static /* synthetic */ void syncPendingPurchaseQueue$default(PostPendingTransactionsHelper postPendingTransactionsHelper, boolean z8, k kVar, k kVar2, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            kVar = null;
        }
        if ((i8 & 4) != 0) {
            kVar2 = null;
        }
        postPendingTransactionsHelper.syncPendingPurchaseQueue(z8, kVar, kVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void syncPendingPurchaseQueue$lambda$0(PostPendingTransactionsHelper this$0, String appUserID, boolean z8, k kVar, k kVar2) {
        t.g(this$0, "this$0");
        t.g(appUserID, "$appUserID");
        this$0.billing.queryPurchases(appUserID, new PostPendingTransactionsHelper$syncPendingPurchaseQueue$1$1(this$0, z8, appUserID, kVar, kVar2), new PostPendingTransactionsHelper$syncPendingPurchaseQueue$1$2(kVar));
    }

    public final void syncPendingPurchaseQueue(final boolean z8, final k kVar, final k kVar2) {
        if (this.appConfig.getDangerousSettings().getAutoSyncPurchases()) {
            LogWrapperKt.log(LogIntent.DEBUG, PurchaseStrings.UPDATING_PENDING_PURCHASE_QUEUE);
            final String currentAppUserID = this.identityManager.getCurrentAppUserID();
            Dispatcher.enqueue$default(this.dispatcher, new Runnable() { // from class: com.revenuecat.purchases.c
                @Override // java.lang.Runnable
                public final void run() {
                    PostPendingTransactionsHelper.syncPendingPurchaseQueue$lambda$0(this.f19535a, currentAppUserID, z8, kVar, kVar2);
                }
            }, null, 2, null);
        } else {
            LogWrapperKt.log(LogIntent.DEBUG, PurchaseStrings.SKIPPING_AUTOMATIC_SYNC);
            if (kVar2 != null) {
                kVar2.invoke(null);
            }
        }
    }
}
