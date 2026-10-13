package com.revenuecat.purchases.common.offerings;

import C6.G;
import C6.v;
import D6.C0937q;
import D6.C0938s;
import D6.M;
import Q6.k;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.models.StoreProduct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class OfferingsFactory$getStoreProductsById$1$1$1 extends u implements k {
    final /* synthetic */ k $onCompleted;
    final /* synthetic */ Map<String, List<StoreProduct>> $productsById;
    final /* synthetic */ OfferingsFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferingsFactory$getStoreProductsById$1$1$1(OfferingsFactory offeringsFactory, Map<String, List<StoreProduct>> map, k kVar) {
        super(1);
        this.this$0 = offeringsFactory;
        this.$productsById = map;
        this.$onCompleted = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1(Map productsById, List inAppProducts, k onCompleted) {
        t.g(productsById, "$productsById");
        t.g(inAppProducts, "$inAppProducts");
        t.g(onCompleted, "$onCompleted");
        ArrayList arrayList = new ArrayList(C0938s.y(inAppProducts, 10));
        Iterator it = inAppProducts.iterator();
        while (it.hasNext()) {
            StoreProduct storeProduct = (StoreProduct) it.next();
            arrayList.add(v.a(storeProduct.getPurchasingData().getProductId(), C0937q.e(storeProduct)));
        }
        M.p(productsById, arrayList);
        onCompleted.invoke(productsById);
    }

    @Override // Q6.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<? extends StoreProduct>) obj);
        return G.f1419a;
    }

    public final void invoke(final List<? extends StoreProduct> inAppProducts) {
        t.g(inAppProducts, "inAppProducts");
        Dispatcher dispatcher = this.this$0.dispatcher;
        final Map<String, List<StoreProduct>> map = this.$productsById;
        final k kVar = this.$onCompleted;
        Dispatcher.enqueue$default(dispatcher, new Runnable() { // from class: com.revenuecat.purchases.common.offerings.b
            @Override // java.lang.Runnable
            public final void run() {
                OfferingsFactory$getStoreProductsById$1$1$1.invoke$lambda$1(map, inAppProducts, kVar);
            }
        }, null, 2, null);
    }
}
