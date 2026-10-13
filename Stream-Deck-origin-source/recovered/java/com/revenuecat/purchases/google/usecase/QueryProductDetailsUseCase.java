package com.revenuecat.purchases.google.usecase;

import C6.G;
import D6.r;
import D6.z;
import Q6.k;
import Q6.o;
import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.google.BillingClientParamBuildersKt;
import com.revenuecat.purchases.google.ProductTypeConversionsKt;
import com.revenuecat.purchases.google.StoreProductConversionsKt;
import com.revenuecat.purchases.strings.OfferingStrings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p138p3.InterfaceC2777l;
import p201x2.vAk.hJroAgFztiMK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class QueryProductDetailsUseCase extends BillingClientUseCase<List<? extends com.android.billingclient.api.f>> {
    private final k onError;
    private final k onReceive;
    private final QueryProductDetailsUseCaseParams useCaseParams;
    private final k withConnectedClient;

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase$executeAsync$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class AnonymousClass1 extends u implements k {
        final /* synthetic */ Set<String> $nonEmptyProductIds;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Set<String> set) {
            super(1);
            this.$nonEmptyProductIds = set;
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
            invoke((com.android.billingclient.api.a) obj);
            return G.f1419a;
        }

        public final void invoke(com.android.billingclient.api.a invoke) throws Throwable {
            t.g(invoke, "$this$invoke");
            String googleProductType = ProductTypeConversionsKt.toGoogleProductType(QueryProductDetailsUseCase.this.useCaseParams.getProductType());
            if (googleProductType == null) {
                googleProductType = "inapp";
            }
            com.android.billingclient.api.g gVarBuildQueryProductDetailsParams = BillingClientParamBuildersKt.buildQueryProductDetailsParams(googleProductType, this.$nonEmptyProductIds);
            final QueryProductDetailsUseCase queryProductDetailsUseCase = QueryProductDetailsUseCase.this;
            queryProductDetailsUseCase.queryProductDetailsAsyncEnsuringOneResponse(invoke, googleProductType, gVarBuildQueryProductDetailsParams, new InterfaceC2777l() { // from class: com.revenuecat.purchases.google.usecase.e
                @Override // p138p3.InterfaceC2777l
                public final void a(com.android.billingclient.api.d dVar, List list) {
                    BillingClientUseCase.processResult$default(queryProductDetailsUseCase, dVar, list, null, null, 12, null);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase$onOk$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C21901 extends u implements k {
        public static final C21901 INSTANCE = new C21901();

        public C21901() {
            super(1);
        }

        @Override // Q6.k
        public final CharSequence invoke(com.android.billingclient.api.f it) {
            t.g(it, "it");
            String string = it.toString();
            t.f(string, "it.toString()");
            return string;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryProductDetailsUseCase(QueryProductDetailsUseCaseParams useCaseParams, k onReceive, k onError, k withConnectedClient, o executeRequestOnUIThread) {
        super(useCaseParams, onError, executeRequestOnUIThread);
        t.g(useCaseParams, "useCaseParams");
        t.g(onReceive, "onReceive");
        t.g(onError, "onError");
        t.g(withConnectedClient, "withConnectedClient");
        t.g(executeRequestOnUIThread, "executeRequestOnUIThread");
        this.useCaseParams = useCaseParams;
        this.onReceive = onReceive;
        this.onError = onError;
        this.withConnectedClient = withConnectedClient;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void queryProductDetailsAsyncEnsuringOneResponse(com.android.billingclient.api.a aVar, final String str, com.android.billingclient.api.g gVar, final InterfaceC2777l interfaceC2777l) throws Throwable {
        try {
            try {
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                final Date now = this.useCaseParams.getDateProvider().getNow();
                aVar.i(gVar, new InterfaceC2777l() { // from class: com.revenuecat.purchases.google.usecase.d
                    @Override // p138p3.InterfaceC2777l
                    public final void a(com.android.billingclient.api.d dVar, List list) {
                        QueryProductDetailsUseCase.queryProductDetailsAsyncEnsuringOneResponse$lambda$3(atomicBoolean, this, str, now, interfaceC2777l, dVar, list);
                    }
                });
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queryProductDetailsAsyncEnsuringOneResponse$lambda$3(AtomicBoolean hasResponded, QueryProductDetailsUseCase this$0, String productType, Date requestStartTime, InterfaceC2777l listener, com.android.billingclient.api.d billingResult, List productDetailsList) {
        t.g(hasResponded, "$hasResponded");
        t.g(this$0, "this$0");
        t.g(productType, "$productType");
        t.g(requestStartTime, "$requestStartTime");
        t.g(listener, "$listener");
        t.g(billingResult, "billingResult");
        t.g(productDetailsList, "productDetailsList");
        if (!hasResponded.getAndSet(true)) {
            this$0.trackGoogleQueryProductDetailsRequestIfNeeded(productType, billingResult, requestStartTime);
            listener.a(billingResult, productDetailsList);
        } else {
            LogIntent logIntent = LogIntent.GOOGLE_ERROR;
            String str = String.format(OfferingStrings.EXTRA_QUERY_PRODUCT_DETAILS_RESPONSE, Arrays.copyOf(new Object[]{Integer.valueOf(billingResult.b())}, 1));
            t.f(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
        }
    }

    private final void trackGoogleQueryProductDetailsRequestIfNeeded(String str, com.android.billingclient.api.d dVar, Date date) {
        DiagnosticsTracker diagnosticsTrackerIfEnabled = this.useCaseParams.getDiagnosticsTrackerIfEnabled();
        if (diagnosticsTrackerIfEnabled != null) {
            int iB = dVar.b();
            String strA = dVar.a();
            t.f(strA, "billingResult.debugMessage");
            diagnosticsTrackerIfEnabled.m163trackGoogleQueryProductDetailsRequestWn2Vu4Y(str, iB, strA, DurationExtensionsKt.between(p008a7.a.f13446b, date, this.useCaseParams.getDateProvider().getNow()));
        }
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public String getErrorMessage() {
        return "Error when fetching products";
    }

    public final k getOnError() {
        return this.onError;
    }

    public final k getOnReceive() {
        return this.onReceive;
    }

    public final k getWithConnectedClient() {
        return this.withConnectedClient;
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public /* bridge */ /* synthetic */ void onOk(List<? extends com.android.billingclient.api.f> list) {
        onOk2((List<com.android.billingclient.api.f>) list);
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public void executeAsync() {
        Set<String> productIds = this.useCaseParams.getProductIds();
        ArrayList arrayList = new ArrayList();
        for (Object obj : productIds) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        Set setW0 = z.W0(arrayList);
        if (!setW0.isEmpty()) {
            this.withConnectedClient.invoke(new AnonymousClass1(setW0));
        } else {
            LogWrapperKt.log(LogIntent.DEBUG, hJroAgFztiMK.YsCHo);
            this.onReceive.invoke(r.n());
        }
    }

    /* JADX INFO: renamed from: onOk, reason: avoid collision after fix types in other method */
    public void onOk2(List<com.android.billingclient.api.f> received) {
        List<com.android.billingclient.api.f> list;
        t.g(received, "received");
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(OfferingStrings.FETCHING_PRODUCTS_FINISHED, Arrays.copyOf(new Object[]{z.r0(this.useCaseParams.getProductIds(), null, null, null, 0, null, null, 63, null)}, 1));
        t.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        LogIntent logIntent2 = LogIntent.PURCHASE;
        String str2 = String.format(OfferingStrings.RETRIEVED_PRODUCTS, Arrays.copyOf(new Object[]{z.r0(received, null, null, null, 0, null, C21901.INSTANCE, 31, null)}, 1));
        t.f(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent2, str2);
        if (received.isEmpty()) {
            list = null;
        }
        if (list != null) {
            list = received;
            for (com.android.billingclient.api.f fVar : list) {
                LogIntent logIntent3 = LogIntent.PURCHASE;
                String str3 = String.format(OfferingStrings.LIST_PRODUCTS, Arrays.copyOf(new Object[]{fVar.d(), fVar}, 2));
                t.f(str3, "format(this, *args)");
                LogWrapperKt.log(logIntent3, str3);
            }
        }
        list = received;
        this.onReceive.invoke(StoreProductConversionsKt.toStoreProducts(received));
    }
}
