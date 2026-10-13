package com.revenuecat.purchases;

import C6.G;
import D6.z;
import Q6.k;
import Q6.o;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class PostTransactionWithProductDetailsHelper$postTransactions$1$1 extends u implements k {
    final /* synthetic */ boolean $allowSharingPlayStoreAccount;
    final /* synthetic */ String $appUserID;
    final /* synthetic */ PostReceiptInitiationSource $initiationSource;
    final /* synthetic */ StoreTransaction $transaction;
    final /* synthetic */ o $transactionPostError;
    final /* synthetic */ o $transactionPostSuccess;
    final /* synthetic */ PostTransactionWithProductDetailsHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostTransactionWithProductDetailsHelper$postTransactions$1$1(StoreTransaction storeTransaction, PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper, boolean z8, String str, PostReceiptInitiationSource postReceiptInitiationSource, o oVar, o oVar2) {
        super(1);
        this.$transaction = storeTransaction;
        this.this$0 = postTransactionWithProductDetailsHelper;
        this.$allowSharingPlayStoreAccount = z8;
        this.$appUserID = str;
        this.$initiationSource = postReceiptInitiationSource;
        this.$transactionPostSuccess = oVar;
        this.$transactionPostError = oVar2;
    }

    @Override // Q6.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<? extends StoreProduct>) obj);
        return G.f1419a;
    }

    public final void invoke(List<? extends StoreProduct> storeProducts) {
        StoreProduct storeProduct;
        t.g(storeProducts, "storeProducts");
        Object obj = null;
        if (this.$transaction.getType() == ProductType.SUBS && this.$transaction.getMarketplace() == null) {
            StoreTransaction storeTransaction = this.$transaction;
            loop0: for (Object obj2 : storeProducts) {
                SubscriptionOptions subscriptionOptions = ((StoreProduct) obj2).getSubscriptionOptions();
                if (subscriptionOptions != null && !subscriptionOptions.isEmpty()) {
                    Iterator<SubscriptionOption> it = subscriptionOptions.iterator();
                    while (it.hasNext()) {
                        if (t.c(it.next().getId(), storeTransaction.getSubscriptionOptionId())) {
                            obj = obj2;
                            break loop0;
                        }
                    }
                }
            }
            storeProduct = (StoreProduct) obj;
        } else {
            StoreTransaction storeTransaction2 = this.$transaction;
            for (Object obj3 : storeProducts) {
                if (t.c(((StoreProduct) obj3).getId(), z.k0(storeTransaction2.getProductIds()))) {
                    obj = obj3;
                    break;
                }
            }
            storeProduct = (StoreProduct) obj;
        }
        StoreProduct storeProduct2 = storeProduct;
        LogUtilsKt.debugLog("Store product found for transaction: " + storeProduct2);
        this.this$0.postReceiptHelper.postTransactionAndConsumeIfNeeded(this.$transaction, storeProduct2, this.$allowSharingPlayStoreAccount, this.$appUserID, this.$initiationSource, this.$transactionPostSuccess, this.$transactionPostError);
    }
}
