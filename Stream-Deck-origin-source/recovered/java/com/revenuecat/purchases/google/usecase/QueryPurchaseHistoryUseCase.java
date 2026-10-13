package com.revenuecat.purchases.google.usecase;

import C6.G;
import D6.r;
import Q6.k;
import Q6.o;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.PurchaseHistoryRecordExtensionsKt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.google.BillingClientParamBuildersKt;
import com.revenuecat.purchases.strings.PurchaseStrings;
import com.revenuecat.purchases.strings.RestoreStrings;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p138p3.C2781p;
import p138p3.InterfaceC2778m;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class QueryPurchaseHistoryUseCase extends BillingClientUseCase<List<? extends PurchaseHistoryRecord>> {
    private final k onError;
    private final k onReceive;
    private final QueryPurchaseHistoryUseCaseParams useCaseParams;
    private final k withConnectedClient;

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.QueryPurchaseHistoryUseCase$executeAsync$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class AnonymousClass1 extends u implements k {
        public AnonymousClass1() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$1$lambda$0(AtomicBoolean hasResponded, QueryPurchaseHistoryUseCase this$0, Date requestStartTime, com.android.billingclient.api.d billingResult, List list) {
            t.g(hasResponded, "$hasResponded");
            t.g(this$0, "this$0");
            t.g(requestStartTime, "$requestStartTime");
            t.g(billingResult, "billingResult");
            if (!hasResponded.getAndSet(true)) {
                this$0.trackGoogleQueryPurchaseHistoryRequestIfNeeded(this$0.useCaseParams.getProductType(), billingResult, requestStartTime);
                BillingClientUseCase.processResult$default(this$0, billingResult, list, null, null, 12, null);
            } else {
                LogIntent logIntent = LogIntent.GOOGLE_ERROR;
                String str = String.format(RestoreStrings.EXTRA_QUERY_PURCHASE_HISTORY_RESPONSE, Arrays.copyOf(new Object[]{Integer.valueOf(billingResult.b())}, 1));
                t.f(str, "format(this, *args)");
                LogWrapperKt.log(logIntent, str);
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.android.billingclient.api.a) obj);
            return G.f1419a;
        }

        public final void invoke(com.android.billingclient.api.a invoke) {
            G g8;
            t.g(invoke, "$this$invoke");
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final Date now = QueryPurchaseHistoryUseCase.this.useCaseParams.getDateProvider().getNow();
            C2781p c2781pBuildQueryPurchaseHistoryParams = BillingClientParamBuildersKt.buildQueryPurchaseHistoryParams(QueryPurchaseHistoryUseCase.this.useCaseParams.getProductType());
            if (c2781pBuildQueryPurchaseHistoryParams != null) {
                final QueryPurchaseHistoryUseCase queryPurchaseHistoryUseCase = QueryPurchaseHistoryUseCase.this;
                invoke.j(c2781pBuildQueryPurchaseHistoryParams, new InterfaceC2778m() { // from class: com.revenuecat.purchases.google.usecase.f
                    @Override // p138p3.InterfaceC2778m
                    public final void a(com.android.billingclient.api.d dVar, List list) {
                        QueryPurchaseHistoryUseCase.AnonymousClass1.invoke$lambda$1$lambda$0(atomicBoolean, queryPurchaseHistoryUseCase, now, dVar, list);
                    }
                });
                g8 = G.f1419a;
            } else {
                g8 = null;
            }
            if (g8 == null) {
                QueryPurchaseHistoryUseCase queryPurchaseHistoryUseCase2 = QueryPurchaseHistoryUseCase.this;
                String str = String.format(PurchaseStrings.INVALID_PRODUCT_TYPE, Arrays.copyOf(new Object[]{"queryPurchaseHistory"}, 1));
                t.f(str, "format(this, *args)");
                LogUtilsKt.errorLog$default(str, null, 2, null);
                com.android.billingclient.api.d dVarA = com.android.billingclient.api.d.c().c(5).a();
                t.f(dVarA, "newBuilder()\n           …                 .build()");
                BillingClientUseCase.processResult$default(queryPurchaseHistoryUseCase2, dVarA, null, null, null, 12, null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryPurchaseHistoryUseCase(QueryPurchaseHistoryUseCaseParams useCaseParams, k onReceive, k onError, k withConnectedClient, o executeRequestOnUIThread) {
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
    public final void trackGoogleQueryPurchaseHistoryRequestIfNeeded(String str, com.android.billingclient.api.d dVar, Date date) {
        DiagnosticsTracker diagnosticsTrackerIfEnabled = this.useCaseParams.getDiagnosticsTrackerIfEnabled();
        if (diagnosticsTrackerIfEnabled != null) {
            int iB = dVar.b();
            String strA = dVar.a();
            t.f(strA, "billingResult.debugMessage");
            diagnosticsTrackerIfEnabled.m164trackGoogleQueryPurchaseHistoryRequestWn2Vu4Y(str, iB, strA, DurationExtensionsKt.between(p008a7.a.f13446b, date, this.useCaseParams.getDateProvider().getNow()));
        }
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public void executeAsync() {
        this.withConnectedClient.invoke(new AnonymousClass1());
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public String getErrorMessage() {
        return "Error receiving purchase history";
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
    public void onOk(List<? extends PurchaseHistoryRecord> list) {
        G g8 = null;
        List<? extends PurchaseHistoryRecord> list2 = (list == null || list.isEmpty()) ? null : list;
        if (list2 != null) {
            for (PurchaseHistoryRecord purchaseHistoryRecord : list2) {
                LogIntent logIntent = LogIntent.RC_PURCHASE_SUCCESS;
                String str = String.format(RestoreStrings.PURCHASE_HISTORY_RETRIEVED, Arrays.copyOf(new Object[]{PurchaseHistoryRecordExtensionsKt.toHumanReadableDescription(purchaseHistoryRecord)}, 1));
                t.f(str, "format(this, *args)");
                LogWrapperKt.log(logIntent, str);
            }
            g8 = G.f1419a;
        }
        if (g8 == null) {
            LogWrapperKt.log(LogIntent.DEBUG, RestoreStrings.PURCHASE_HISTORY_EMPTY);
        }
        k kVar = this.onReceive;
        if (list == null) {
            list = r.n();
        }
        kVar.invoke(list);
    }
}
