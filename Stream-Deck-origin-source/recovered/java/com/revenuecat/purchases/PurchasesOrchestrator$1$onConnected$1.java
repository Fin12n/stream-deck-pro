package com.revenuecat.purchases;

import C6.G;
import Q6.k;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.strings.BillingStrings;
import java.util.Arrays;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class PurchasesOrchestrator$1$onConnected$1 extends u implements k {
    public static final PurchasesOrchestrator$1$onConnected$1 INSTANCE = new PurchasesOrchestrator$1$onConnected$1();

    public PurchasesOrchestrator$1$onConnected$1() {
        super(1);
    }

    @Override // Q6.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return G.f1419a;
    }

    public final void invoke(String countryCode) {
        t.g(countryCode, "countryCode");
        String str = String.format(BillingStrings.BILLING_COUNTRY_CODE, Arrays.copyOf(new Object[]{countryCode}, 1));
        t.f(str, "format(this, *args)");
        LogUtilsKt.debugLog(str);
    }
}
