package com.revenuecat.purchases;

import C6.G;
import com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class CustomerInfoUpdateHandler$notifyListeners$2$2 extends u implements Function0 {
    final /* synthetic */ CustomerInfo $customerInfo;
    final /* synthetic */ UpdatedCustomerInfoListener $listener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerInfoUpdateHandler$notifyListeners$2$2(UpdatedCustomerInfoListener updatedCustomerInfoListener, CustomerInfo customerInfo) {
        super(0);
        this.$listener = updatedCustomerInfoListener;
        this.$customerInfo = customerInfo;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m133invoke();
        return G.f1419a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m133invoke() {
        this.$listener.onReceived(this.$customerInfo);
    }
}
