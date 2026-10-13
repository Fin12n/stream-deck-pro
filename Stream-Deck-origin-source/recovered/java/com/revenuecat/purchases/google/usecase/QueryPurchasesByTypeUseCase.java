package com.revenuecat.purchases.google.usecase;

import C6.G;
import C6.v;
import D6.C0938s;
import D6.L;
import D6.M;
import M6.eLZq.eGwOBWCdOTaKus;
import Q6.k;
import Q6.o;
import W6.n;
import com.android.billingclient.api.Purchase;
import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.google.BillingClientParamBuildersKt;
import com.revenuecat.purchases.google.ProductTypeConversionsKt;
import com.revenuecat.purchases.google.StoreTransactionConversionsKt;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.OfferingStrings;
import com.revenuecat.purchases.strings.PurchaseStrings;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p138p3.C2782q;
import p138p3.InterfaceC2779n;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class QueryPurchasesByTypeUseCase extends BillingClientUseCase<Map<String, ? extends StoreTransaction>> {
    private final k onError;
    private final k onSuccess;
    private final QueryPurchasesByTypeUseCaseParams useCaseParams;
    private final k withConnectedClient;

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.QueryPurchasesByTypeUseCase$executeAsync$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class AnonymousClass1 extends u implements k {
        public AnonymousClass1() {
            super(1);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.android.billingclient.api.a) obj);
            return G.f1419a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$1$lambda$0(QueryPurchasesByTypeUseCase this$0, com.android.billingclient.api.d result, List list) {
            t.g(this$0, "this$0");
            t.g(result, "result");
            t.g(list, eGwOBWCdOTaKus.PdJtNQvp);
            BillingClientUseCase.processResult$default(this$0, result, this$0.toMapOfGooglePurchaseWrapper(list, this$0.useCaseParams.getProductType()), null, null, 12, null);
        }

        public final void invoke(com.android.billingclient.api.a invoke) {
            G g8;
            t.g(invoke, "$this$invoke");
            C2782q c2782qBuildQueryPurchasesParams = BillingClientParamBuildersKt.buildQueryPurchasesParams(QueryPurchasesByTypeUseCase.this.useCaseParams.getProductType());
            if (c2782qBuildQueryPurchasesParams != null) {
                final QueryPurchasesByTypeUseCase queryPurchasesByTypeUseCase = QueryPurchasesByTypeUseCase.this;
                queryPurchasesByTypeUseCase.queryPurchasesAsyncWithTrackingEnsuringOneResponse(invoke, queryPurchasesByTypeUseCase.useCaseParams.getProductType(), c2782qBuildQueryPurchasesParams, new InterfaceC2779n() { // from class: com.revenuecat.purchases.google.usecase.h
                    @Override // p138p3.InterfaceC2779n
                    public final void a(com.android.billingclient.api.d dVar, List list) {
                        QueryPurchasesByTypeUseCase.AnonymousClass1.invoke$lambda$1$lambda$0(queryPurchasesByTypeUseCase, dVar, list);
                    }
                });
                g8 = G.f1419a;
            } else {
                g8 = null;
            }
            if (g8 == null) {
                QueryPurchasesByTypeUseCase queryPurchasesByTypeUseCase2 = QueryPurchasesByTypeUseCase.this;
                String str = String.format(PurchaseStrings.INVALID_PRODUCT_TYPE, Arrays.copyOf(new Object[]{"queryPurchasesByType"}, 1));
                t.f(str, "format(this, *args)");
                LogUtilsKt.errorLog$default(str, null, 2, null);
                com.android.billingclient.api.d dVarA = com.android.billingclient.api.d.c().c(5).a();
                t.f(dVarA, "newBuilder()\n           …                 .build()");
                BillingClientUseCase.processResult$default(queryPurchasesByTypeUseCase2, dVarA, M.g(), null, null, 12, null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryPurchasesByTypeUseCase(QueryPurchasesByTypeUseCaseParams useCaseParams, k onSuccess, k onError, k withConnectedClient, o executeRequestOnUIThread) {
        super(useCaseParams, onError, executeRequestOnUIThread);
        t.g(useCaseParams, "useCaseParams");
        t.g(onSuccess, "onSuccess");
        t.g(onError, "onError");
        t.g(withConnectedClient, "withConnectedClient");
        t.g(executeRequestOnUIThread, "executeRequestOnUIThread");
        this.useCaseParams = useCaseParams;
        this.onSuccess = onSuccess;
        this.onError = onError;
        this.withConnectedClient = withConnectedClient;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void queryPurchasesAsyncWithTrackingEnsuringOneResponse(com.android.billingclient.api.a aVar, final String str, C2782q c2782q, final InterfaceC2779n interfaceC2779n) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final Date now = this.useCaseParams.getDateProvider().getNow();
        aVar.k(c2782q, new InterfaceC2779n() { // from class: com.revenuecat.purchases.google.usecase.g
            @Override // p138p3.InterfaceC2779n
            public final void a(com.android.billingclient.api.d dVar, List list) {
                QueryPurchasesByTypeUseCase.queryPurchasesAsyncWithTrackingEnsuringOneResponse$lambda$0(atomicBoolean, this, str, now, interfaceC2779n, dVar, list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queryPurchasesAsyncWithTrackingEnsuringOneResponse$lambda$0(AtomicBoolean hasResponded, QueryPurchasesByTypeUseCase this$0, String productType, Date requestStartTime, InterfaceC2779n listener, com.android.billingclient.api.d billingResult, List purchases) {
        t.g(hasResponded, "$hasResponded");
        t.g(this$0, "this$0");
        t.g(productType, "$productType");
        t.g(requestStartTime, "$requestStartTime");
        t.g(listener, "$listener");
        t.g(billingResult, "billingResult");
        t.g(purchases, "purchases");
        if (!hasResponded.getAndSet(true)) {
            this$0.trackGoogleQueryPurchasesRequestIfNeeded(productType, billingResult, requestStartTime);
            listener.a(billingResult, purchases);
        } else {
            LogIntent logIntent = LogIntent.GOOGLE_ERROR;
            String str = String.format(OfferingStrings.EXTRA_QUERY_PURCHASES_RESPONSE, Arrays.copyOf(new Object[]{Integer.valueOf(billingResult.b())}, 1));
            t.f(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, StoreTransaction> toMapOfGooglePurchaseWrapper(List<? extends Purchase> list, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(n.d(L.d(C0938s.y(list, 10)), 16));
        for (Purchase purchase : list) {
            String strF = purchase.f();
            t.f(strF, "purchase.purchaseToken");
            C6.o oVarA = v.a(UtilsKt.sha1(strF), StoreTransactionConversionsKt.toStoreTransaction$default(purchase, ProductTypeConversionsKt.toRevenueCatProductType(str), null, null, null, 14, null));
            linkedHashMap.put(oVarA.c(), oVarA.d());
        }
        return linkedHashMap;
    }

    private final void trackGoogleQueryPurchasesRequestIfNeeded(String str, com.android.billingclient.api.d dVar, Date date) {
        DiagnosticsTracker diagnosticsTrackerIfEnabled = this.useCaseParams.getDiagnosticsTrackerIfEnabled();
        if (diagnosticsTrackerIfEnabled != null) {
            int iB = dVar.b();
            String strA = dVar.a();
            t.f(strA, "billingResult.debugMessage");
            diagnosticsTrackerIfEnabled.m165trackGoogleQueryPurchasesRequestWn2Vu4Y(str, iB, strA, DurationExtensionsKt.between(p008a7.a.f13446b, date, this.useCaseParams.getDateProvider().getNow()));
        }
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public void executeAsync() {
        this.withConnectedClient.invoke(new AnonymousClass1());
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public String getErrorMessage() {
        return "Error when querying purchases of type " + this.useCaseParams.getProductType();
    }

    public final k getOnError() {
        return this.onError;
    }

    public final k getOnSuccess() {
        return this.onSuccess;
    }

    public final k getWithConnectedClient() {
        return this.withConnectedClient;
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public /* bridge */ /* synthetic */ void onOk(Map<String, ? extends StoreTransaction> map) {
        onOk2((Map<String, StoreTransaction>) map);
    }

    /* JADX INFO: renamed from: onOk, reason: avoid collision after fix types in other method */
    public void onOk2(Map<String, StoreTransaction> received) {
        t.g(received, "received");
        this.onSuccess.invoke(received);
    }
}
