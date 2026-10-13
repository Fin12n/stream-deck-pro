package com.revenuecat.purchases;

import C6.G;
import D6.z;
import Q6.o;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.models.PurchaseState;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.List;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class PostTransactionWithProductDetailsHelper {
    private final BillingAbstract billing;
    private final PostReceiptHelper postReceiptHelper;

    public PostTransactionWithProductDetailsHelper(BillingAbstract billing, PostReceiptHelper postReceiptHelper) {
        t.g(billing, "billing");
        t.g(postReceiptHelper, "postReceiptHelper");
        this.billing = billing;
        this.postReceiptHelper = postReceiptHelper;
    }

    public static /* synthetic */ void postTransactions$default(PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper, List list, boolean z8, String str, PostReceiptInitiationSource postReceiptInitiationSource, o oVar, o oVar2, int i8, Object obj) {
        if ((i8 & 16) != 0) {
            oVar = null;
        }
        if ((i8 & 32) != 0) {
            oVar2 = null;
        }
        postTransactionWithProductDetailsHelper.postTransactions(list, z8, str, postReceiptInitiationSource, oVar, oVar2);
    }

    public final void postTransactions(List<StoreTransaction> transactions, boolean z8, String appUserID, PostReceiptInitiationSource postReceiptInitiationSource, o oVar, o oVar2) {
        t.g(transactions, "transactions");
        t.g(appUserID, "appUserID");
        PostReceiptInitiationSource initiationSource = postReceiptInitiationSource;
        t.g(initiationSource, "initiationSource");
        for (StoreTransaction storeTransaction : transactions) {
            if (storeTransaction.getPurchaseState() != PurchaseState.PENDING) {
                this.billing.queryProductDetailsAsync(storeTransaction.getType(), z.W0(storeTransaction.getProductIds()), new PostTransactionWithProductDetailsHelper$postTransactions$1$1(storeTransaction, this, z8, appUserID, initiationSource, oVar, oVar2), new PostTransactionWithProductDetailsHelper$postTransactions$1$2(this, storeTransaction, z8, appUserID, postReceiptInitiationSource, oVar, oVar2));
            } else if (oVar2 != null) {
                PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.PaymentPendingError, null, 2, null);
                LogUtilsKt.errorLog(purchasesError);
                G g8 = G.f1419a;
                oVar2.invoke(storeTransaction, purchasesError);
            }
            initiationSource = postReceiptInitiationSource;
        }
    }
}
