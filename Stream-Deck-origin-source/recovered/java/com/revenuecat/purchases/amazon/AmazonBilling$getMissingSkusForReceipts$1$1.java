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
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class AmazonBilling$getMissingSkusForReceipts$1$1 extends u implements k {
    final /* synthetic */ Map<String, PurchasesError> $errorMap;
    final /* synthetic */ o $onCompletion;
    final /* synthetic */ Receipt $receipt;
    final /* synthetic */ H $receiptsLeft;
    final /* synthetic */ Map<String, String> $successMap;
    final /* synthetic */ AmazonBilling this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmazonBilling$getMissingSkusForReceipts$1$1(Map<String, String> map, Receipt receipt, H h8, AmazonBilling amazonBilling, o oVar, Map<String, PurchasesError> map2) {
        super(1);
        this.$successMap = map;
        this.$receipt = receipt;
        this.$receiptsLeft = h8;
        this.this$0 = amazonBilling;
        this.$onCompletion = oVar;
        this.$errorMap = map2;
    }

    @Override // Q6.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) throws JSONException {
        invoke((JSONObject) obj);
        return G.f1419a;
    }

    public final void invoke(JSONObject response) throws JSONException {
        t.g(response, "response");
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(AmazonStrings.RECEIPT_DATA_RECEIVED, Arrays.copyOf(new Object[]{response.toString()}, 1));
        t.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        Map<String, String> map = this.$successMap;
        String receiptId = this.$receipt.getReceiptId();
        t.f(receiptId, "receipt.receiptId");
        Object obj = response.get(com.amazon.a.a.o.b.f16711L);
        t.e(obj, "null cannot be cast to non-null type kotlin.String");
        map.put(receiptId, (String) obj);
        H h8 = this.$receiptsLeft;
        int i8 = h8.f28777a - 1;
        h8.f28777a = i8;
        if (i8 == 0) {
            this.this$0.cache.cacheSkusByToken(this.$successMap);
            this.$onCompletion.invoke(this.$successMap, this.$errorMap);
        }
    }
}
