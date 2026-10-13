package com.revenuecat.purchases.amazon;

import C6.G;
import Q6.k;
import Q6.o;
import com.amazon.device.iap.model.Receipt;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class AmazonBilling$getMissingSkusForReceipts$1$2 extends u implements k {
    final /* synthetic */ Map<String, PurchasesError> $errorMap;
    final /* synthetic */ o $onCompletion;
    final /* synthetic */ Receipt $receipt;
    final /* synthetic */ H $receiptsLeft;
    final /* synthetic */ Map<String, String> $successMap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmazonBilling$getMissingSkusForReceipts$1$2(Map<String, PurchasesError> map, Receipt receipt, H h8, o oVar, Map<String, String> map2) {
        super(1);
        this.$errorMap = map;
        this.$receipt = receipt;
        this.$receiptsLeft = h8;
        this.$onCompletion = oVar;
        this.$successMap = map2;
    }

    @Override // Q6.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return G.f1419a;
    }

    public final void invoke(PurchasesError error) {
        t.g(error, "error");
        LogIntent logIntent = LogIntent.AMAZON_ERROR;
        String str = String.format(AmazonStrings.ERROR_FETCHING_RECEIPT_INFO, Arrays.copyOf(new Object[]{error}, 1));
        t.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        Map<String, PurchasesError> map = this.$errorMap;
        String receiptId = this.$receipt.getReceiptId();
        t.f(receiptId, "receipt.receiptId");
        map.put(receiptId, error);
        H h8 = this.$receiptsLeft;
        int i8 = h8.f28777a - 1;
        h8.f28777a = i8;
        if (i8 == 0) {
            this.$onCompletion.invoke(this.$successMap, this.$errorMap);
        }
    }
}
