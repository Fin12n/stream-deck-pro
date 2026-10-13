package com.revenuecat.purchases.common.offerings;

import C6.G;
import D6.M;
import D6.U;
import D6.z;
import Q6.k;
import R0.pkXL.Oitvkwcwn;
import Z6.w;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.OfferingParser;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.strings.OfferingStrings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p116m7.j;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class OfferingsFactory {
    private final BillingAbstract billing;
    private final Dispatcher dispatcher;
    private final OfferingParser offeringParser;

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsFactory$createOfferings$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class AnonymousClass1 extends u implements k {
        final /* synthetic */ Set<String> $allRequestedProductIdentifiers;
        final /* synthetic */ JSONObject $offeringsJSON;
        final /* synthetic */ k $onError;
        final /* synthetic */ k $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Set<String> set, JSONObject jSONObject, k kVar, k kVar2) {
            super(1);
            this.$allRequestedProductIdentifiers = set;
            this.$offeringsJSON = jSONObject;
            this.$onError = kVar;
            this.$onSuccess = kVar2;
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Exception {
            invoke((Map<String, ? extends List<? extends StoreProduct>>) obj);
            return G.f1419a;
        }

        public final void invoke(Map<String, ? extends List<? extends StoreProduct>> productsById) throws Exception {
            t.g(productsById, "productsById");
            try {
                OfferingsFactory.this.logMissingProducts(this.$allRequestedProductIdentifiers, productsById);
                Offerings offeringsCreateOfferings = OfferingsFactory.this.offeringParser.createOfferings(this.$offeringsJSON, productsById);
                if (offeringsCreateOfferings.getAll().isEmpty()) {
                    this.$onError.invoke(new PurchasesError(PurchasesErrorCode.ConfigurationError, OfferingStrings.CONFIGURATION_ERROR_PRODUCTS_NOT_FOUND));
                    return;
                }
                String str = String.format(OfferingStrings.CREATED_OFFERINGS, Arrays.copyOf(new Object[]{offeringsCreateOfferings}, 1));
                t.f(str, "format(this, *args)");
                LogUtilsKt.verboseLog(str);
                this.$onSuccess.invoke(offeringsCreateOfferings);
            } catch (Exception e8) {
                if (!(e8 instanceof JSONException ? true : e8 instanceof j)) {
                    throw e8;
                }
                LogIntent logIntent = LogIntent.RC_ERROR;
                String str2 = String.format(OfferingStrings.JSON_EXCEPTION_ERROR, Arrays.copyOf(new Object[]{e8.getLocalizedMessage()}, 1));
                t.f(str2, "format(this, *args)");
                LogWrapperKt.log(logIntent, str2);
                this.$onError.invoke(new PurchasesError(PurchasesErrorCode.UnexpectedBackendResponseError, e8.getLocalizedMessage()));
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsFactory$createOfferings$2, reason: invalid class name */
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

        public final void invoke(PurchasesError error) {
            t.g(error, "error");
            this.$onError.invoke(error);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsFactory$getStoreProductsById$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C21681 extends u implements k {
        final /* synthetic */ k $onCompleted;
        final /* synthetic */ k $onError;
        final /* synthetic */ Set<String> $productIds;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21681(Set<String> set, k kVar, k kVar2) {
            super(1);
            this.$productIds = set;
            this.$onCompleted = kVar;
            this.$onError = kVar2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$1(List subscriptionProducts, Set productIds, OfferingsFactory this$0, k onCompleted, k onError) {
            t.g(subscriptionProducts, "$subscriptionProducts");
            t.g(productIds, "$productIds");
            t.g(this$0, "this$0");
            t.g(onCompleted, "$onCompleted");
            t.g(onError, "$onError");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : subscriptionProducts) {
                String productId = ((StoreProduct) obj).getPurchasingData().getProductId();
                Object arrayList = linkedHashMap.get(productId);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(productId, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            Map mapY = M.y(linkedHashMap);
            Set<String> setH = U.h(productIds, mapY.keySet());
            if (setH.isEmpty()) {
                onCompleted.invoke(mapY);
            } else {
                this$0.billing.queryProductDetailsAsync(ProductType.INAPP, setH, new OfferingsFactory$getStoreProductsById$1$1$1(this$0, mapY, onCompleted), new OfferingsFactory$getStoreProductsById$1$1$2(onError));
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<? extends StoreProduct>) obj);
            return G.f1419a;
        }

        public final void invoke(final List<? extends StoreProduct> subscriptionProducts) {
            t.g(subscriptionProducts, "subscriptionProducts");
            Dispatcher dispatcher = OfferingsFactory.this.dispatcher;
            final Set<String> set = this.$productIds;
            final OfferingsFactory offeringsFactory = OfferingsFactory.this;
            final k kVar = this.$onCompleted;
            final k kVar2 = this.$onError;
            Dispatcher.enqueue$default(dispatcher, new Runnable() { // from class: com.revenuecat.purchases.common.offerings.a
                @Override // java.lang.Runnable
                public final void run() {
                    OfferingsFactory.C21681.invoke$lambda$1(subscriptionProducts, set, offeringsFactory, kVar, kVar2);
                }
            }, null, 2, null);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsFactory$getStoreProductsById$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C21692 extends u implements k {
        final /* synthetic */ k $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21692(k kVar) {
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
            this.$onError.invoke(it);
        }
    }

    public OfferingsFactory(BillingAbstract billing, OfferingParser offeringParser, Dispatcher dispatcher) {
        t.g(billing, "billing");
        t.g(offeringParser, "offeringParser");
        t.g(dispatcher, "dispatcher");
        this.billing = billing;
        this.offeringParser = offeringParser;
        this.dispatcher = dispatcher;
    }

    private final Set<String> extractProductIdentifiers(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray("offerings");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jSONArray.length();
        for (int i8 = 0; i8 < length; i8++) {
            JSONArray jSONArray2 = jSONArray.getJSONObject(i8).getJSONArray("packages");
            int length2 = jSONArray2.length();
            for (int i9 = 0; i9 < length2; i9++) {
                String it = jSONArray2.getJSONObject(i9).optString("platform_product_identifier");
                t.f(it, "it");
                if (w.b0(it)) {
                    it = null;
                }
                if (it != null) {
                    linkedHashSet.add(it);
                }
            }
        }
        return linkedHashSet;
    }

    private final void getStoreProductsById(Set<String> set, k kVar, k kVar2) {
        this.billing.queryProductDetailsAsync(ProductType.SUBS, set, new C21681(set, kVar, kVar2), new C21692(kVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final G logMissingProducts(Set<String> set, Map<String, ? extends List<? extends StoreProduct>> map) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (!map.containsKey((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = !arrayList.isEmpty() ? arrayList : null;
        if (arrayList2 == null) {
            return null;
        }
        LogIntent logIntent = LogIntent.GOOGLE_WARNING;
        String str = String.format(OfferingStrings.CANNOT_FIND_PRODUCT_CONFIGURATION_ERROR, Arrays.copyOf(new Object[]{z.r0(arrayList2, ", ", null, null, 0, null, null, 62, null)}, 1));
        t.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        return G.f1419a;
    }

    public final void createOfferings(JSONObject offeringsJSON, k kVar, k onSuccess) {
        k kVar2;
        JSONException jSONException;
        t.g(offeringsJSON, "offeringsJSON");
        t.g(kVar, Oitvkwcwn.XDnQWeoXnctDR);
        t.g(onSuccess, "onSuccess");
        try {
            Set<String> setExtractProductIdentifiers = extractProductIdentifiers(offeringsJSON);
            if (setExtractProductIdentifiers.isEmpty()) {
                try {
                    kVar.invoke(new PurchasesError(PurchasesErrorCode.ConfigurationError, OfferingStrings.CONFIGURATION_ERROR_NO_PRODUCTS_FOR_OFFERINGS));
                    return;
                } catch (JSONException e8) {
                    jSONException = e8;
                    kVar2 = kVar;
                }
            } else {
                kVar2 = kVar;
                try {
                    getStoreProductsById(setExtractProductIdentifiers, new AnonymousClass1(setExtractProductIdentifiers, offeringsJSON, kVar2, onSuccess), new AnonymousClass2(kVar2));
                    return;
                } catch (JSONException e9) {
                    e = e9;
                }
            }
        } catch (JSONException e10) {
            e = e10;
            kVar2 = kVar;
        }
        jSONException = e;
        LogIntent logIntent = LogIntent.RC_ERROR;
        String str = String.format(OfferingStrings.JSON_EXCEPTION_ERROR, Arrays.copyOf(new Object[]{jSONException.getLocalizedMessage()}, 1));
        t.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        kVar2.invoke(new PurchasesError(PurchasesErrorCode.UnexpectedBackendResponseError, jSONException.getLocalizedMessage()));
    }
}
