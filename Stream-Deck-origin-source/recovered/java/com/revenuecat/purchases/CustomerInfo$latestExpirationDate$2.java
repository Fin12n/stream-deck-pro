package com.revenuecat.purchases;

import D6.z;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class CustomerInfo$latestExpirationDate$2 extends u implements Function0 {
    final /* synthetic */ CustomerInfo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerInfo$latestExpirationDate$2(CustomerInfo customerInfo) {
        super(0);
        this.this$0 = customerInfo;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Date invoke() {
        List listJ0 = z.J0(this.this$0.getAllExpirationDatesByProduct().values(), new Comparator() { // from class: com.revenuecat.purchases.CustomerInfo$latestExpirationDate$2$invoke$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t8, T t9) {
                return F6.a.a((Date) t8, (Date) t9);
            }
        });
        if (listJ0.isEmpty()) {
            listJ0 = null;
        }
        if (listJ0 != null) {
            return (Date) z.t0(listJ0);
        }
        return null;
    }
}
