package com.revenuecat.purchases.google;

import C6.G;
import C6.m;
import C6.o;
import C6.v;
import D6.C0937q;
import D6.C0938s;
import D6.r;
import D6.z;
import Q6.k;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import com.amazon.device.simplesignin.a.LSJS.cFAYKUlMj;
import com.amazon.device.simplesignin.a.a.d.mW.yOZfxp;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.revenuecat.purchases.PostReceiptInitiationSource;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.PurchasesStateProvider;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.PurchaseExtensionsKt;
import com.revenuecat.purchases.common.ReplaceProductInfo;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.google.usecase.AcknowledgePurchaseUseCase;
import com.revenuecat.purchases.google.usecase.AcknowledgePurchaseUseCaseParams;
import com.revenuecat.purchases.google.usecase.BillingClientUseCase;
import com.revenuecat.purchases.google.usecase.ConsumePurchaseUseCase;
import com.revenuecat.purchases.google.usecase.ConsumePurchaseUseCaseParams;
import com.revenuecat.purchases.google.usecase.GetBillingConfigUseCase;
import com.revenuecat.purchases.google.usecase.GetBillingConfigUseCaseParams;
import com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase;
import com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCaseParams;
import com.revenuecat.purchases.google.usecase.QueryPurchaseHistoryUseCase;
import com.revenuecat.purchases.google.usecase.QueryPurchaseHistoryUseCaseParams;
import com.revenuecat.purchases.google.usecase.QueryPurchasesByTypeUseCase;
import com.revenuecat.purchases.google.usecase.QueryPurchasesByTypeUseCaseParams;
import com.revenuecat.purchases.google.usecase.QueryPurchasesUseCase;
import com.revenuecat.purchases.google.usecase.QueryPurchasesUseCaseParams;
import com.revenuecat.purchases.models.GooglePurchasingData;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.InAppMessageType;
import com.revenuecat.purchases.models.PurchaseState;
import com.revenuecat.purchases.models.PurchasingData;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.BillingStrings;
import com.revenuecat.purchases.strings.OfferingStrings;
import com.revenuecat.purchases.strings.PurchaseStrings;
import com.revenuecat.purchases.strings.RestoreStrings;
import com.revenuecat.purchases.utils.Result;
import io.sentry.exception.uXy.SZCvugJaXc;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.C2639q;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p138p3.C2767d;
import p138p3.C2774i;
import p138p3.C2776k;
import p138p3.InterfaceC2765c;
import p138p3.InterfaceC2775j;
import p138p3.InterfaceC2780o;
import p181u6.GfRt.QhsKALGiniuQ;
import p201x2.vAk.hJroAgFztiMK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class BillingWrapper extends BillingAbstract implements InterfaceC2780o, InterfaceC2765c {
    private volatile com.android.billingclient.api.a billingClient;
    private final ClientFactory clientFactory;
    private final DateProvider dateProvider;
    private final DeviceCache deviceCache;
    private final DiagnosticsTracker diagnosticsTrackerIfEnabled;
    private final Handler mainHandler;
    private final Map<String, PurchaseContext> purchaseContext;
    private long reconnectMilliseconds;
    private boolean reconnectionAlreadyScheduled;
    private final ConcurrentLinkedQueue<o> serviceRequests;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class ClientFactory {
        private final Context context;
        private final boolean pendingTransactionsForPrepaidPlansEnabled;

        public ClientFactory(Context context, boolean z8) {
            t.g(context, "context");
            this.context = context;
            this.pendingTransactionsForPrepaidPlansEnabled = z8;
        }

        public final com.android.billingclient.api.a buildClient(InterfaceC2780o listener) {
            t.g(listener, "listener");
            com.android.billingclient.api.e.a aVarB = com.android.billingclient.api.e.c().b();
            if (this.pendingTransactionsForPrepaidPlansEnabled) {
                aVarB.c();
            }
            com.android.billingclient.api.e eVarA = aVarB.a();
            t.f(eVarA, "newBuilder()\n           …\n                .build()");
            com.android.billingclient.api.a aVarA = com.android.billingclient.api.a.h(this.context).c(eVarA).d(listener).a();
            t.f(aVarA, "newBuilder(context).enab…\n                .build()");
            return aVarA;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$consumeAndSave$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class AnonymousClass1 extends C2639q implements k {
        public AnonymousClass1(Object obj) {
            super(1, obj, DeviceCache.class, "addSuccessfullyPostedToken", "addSuccessfullyPostedToken(Ljava/lang/String;)V", 0);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return G.f1419a;
        }

        public final void invoke(String p8) {
            t.g(p8, "p0");
            ((DeviceCache) this.receiver).addSuccessfullyPostedToken(p8);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$consumeAndSave$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class AnonymousClass2 extends C2639q implements k {
        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return G.f1419a;
        }

        public AnonymousClass2(Object obj) {
            super(1, obj, DeviceCache.class, yOZfxp.heHllfJUtdVSKuG, "addSuccessfullyPostedToken(Ljava/lang/String;)V", 0);
        }

        public final void invoke(String p8) {
            t.g(p8, "p0");
            ((DeviceCache) this.receiver).addSuccessfullyPostedToken(p8);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$consumeAndSave$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class AnonymousClass3 extends C2639q implements k {
        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return G.f1419a;
        }

        public AnonymousClass3(Object obj) {
            super(1, obj, DeviceCache.class, "addSuccessfullyPostedToken", cFAYKUlMj.JIlN, 0);
        }

        public final void invoke(String p8) {
            t.g(p8, "p0");
            ((DeviceCache) this.receiver).addSuccessfullyPostedToken(p8);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$getStorefront$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C21751 extends u implements k {
        final /* synthetic */ k $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21751(k kVar) {
            super(1);
            this.$onSuccess = kVar;
        }

        public final void invoke(C2767d billingConfig) {
            t.g(billingConfig, "billingConfig");
            k kVar = this.$onSuccess;
            String strA = billingConfig.a();
            t.f(strA, "billingConfig.countryCode");
            kVar.invoke(strA);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C2767d) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$getStorefront$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class C21762 extends C2639q implements k {
        public C21762(Object obj) {
            super(1, obj, BillingWrapper.class, "withConnectedClient", "withConnectedClient(Lkotlin/jvm/functions/Function1;)V", 0);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((k) obj);
            return G.f1419a;
        }

        public final void invoke(k p8) {
            t.g(p8, "p0");
            ((BillingWrapper) this.receiver).withConnectedClient(p8);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$getStorefront$3, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class C21773 extends C2639q implements Q6.o {
        public C21773(Object obj) {
            super(2, obj, BillingWrapper.class, "executeRequestOnUIThread", "executeRequestOnUIThread(Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)V", 0);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Long) obj, (k) obj2);
            return G.f1419a;
        }

        public final void invoke(Long l8, k p8) {
            t.g(p8, "p1");
            ((BillingWrapper) this.receiver).executeRequestOnUIThread(l8, p8);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$launchBillingFlow$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C21781 extends u implements k {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ com.android.billingclient.api.c $params;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21781(Activity activity, com.android.billingclient.api.c cVar) {
            super(1);
            this.$activity = activity;
            this.$params = cVar;
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.android.billingclient.api.a) obj);
            return G.f1419a;
        }

        public final void invoke(com.android.billingclient.api.a withConnectedClient) {
            t.g(withConnectedClient, "$this$withConnectedClient");
            com.android.billingclient.api.d dVarG = withConnectedClient.g(this.$activity, this.$params);
            if (dVarG.b() == 0) {
                dVarG = null;
            }
            if (dVarG != null) {
                LogIntent logIntent = LogIntent.GOOGLE_ERROR;
                String str = String.format(BillingStrings.BILLING_INTENT_FAILED, Arrays.copyOf(new Object[]{BillingResultExtensionsKt.toHumanReadableDescription(dVarG)}, 1));
                t.f(str, "format(this, *args)");
                LogWrapperKt.log(logIntent, str);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$makePurchaseAsync$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C21792 extends u implements k {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ String $appUserID;
        final /* synthetic */ Boolean $isPersonalizedPrice;
        final /* synthetic */ PurchasingData $purchasingData;
        final /* synthetic */ ReplaceProductInfo $replaceProductInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21792(PurchasingData purchasingData, ReplaceProductInfo replaceProductInfo, String str, Boolean bool, Activity activity) {
            super(1);
            this.$purchasingData = purchasingData;
            this.$replaceProductInfo = replaceProductInfo;
            this.$appUserID = str;
            this.$isPersonalizedPrice = bool;
            this.$activity = activity;
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return G.f1419a;
        }

        public final void invoke(PurchasesError purchasesError) {
            BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener;
            Result resultBuildPurchaseParams = BillingWrapper.this.buildPurchaseParams((GooglePurchasingData) this.$purchasingData, this.$replaceProductInfo, this.$appUserID, this.$isPersonalizedPrice);
            if (resultBuildPurchaseParams instanceof Result.Success) {
                BillingWrapper.this.launchBillingFlow(this.$activity, (com.android.billingclient.api.c) ((Result.Success) resultBuildPurchaseParams).getValue());
            } else {
                if (!(resultBuildPurchaseParams instanceof Result.Error) || (purchasesUpdatedListener = BillingWrapper.this.getPurchasesUpdatedListener()) == null) {
                    return;
                }
                purchasesUpdatedListener.onPurchasesFailedToUpdate((PurchasesError) ((Result.Error) resultBuildPurchaseParams).getValue());
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$queryAllPurchases$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C21801 extends u implements k {
        final /* synthetic */ k $onReceivePurchaseHistory;
        final /* synthetic */ k $onReceivePurchaseHistoryError;

        /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$queryAllPurchases$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C04461 extends u implements k {
            final /* synthetic */ k $onReceivePurchaseHistory;
            final /* synthetic */ List<PurchaseHistoryRecord> $subsPurchasesList;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C04461(k kVar, List<? extends PurchaseHistoryRecord> list) {
                super(1);
                this.$onReceivePurchaseHistory = kVar;
                this.$subsPurchasesList = list;
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List<? extends PurchaseHistoryRecord>) obj);
                return G.f1419a;
            }

            public final void invoke(List<? extends PurchaseHistoryRecord> inAppPurchasesList) {
                t.g(inAppPurchasesList, "inAppPurchasesList");
                k kVar = this.$onReceivePurchaseHistory;
                List<PurchaseHistoryRecord> list = this.$subsPurchasesList;
                ArrayList arrayList = new ArrayList(C0938s.y(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(StoreTransactionConversionsKt.toStoreTransaction((PurchaseHistoryRecord) it.next(), ProductType.SUBS));
                }
                ArrayList arrayList2 = new ArrayList(C0938s.y(inAppPurchasesList, 10));
                Iterator<T> it2 = inAppPurchasesList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(StoreTransactionConversionsKt.toStoreTransaction((PurchaseHistoryRecord) it2.next(), ProductType.INAPP));
                }
                kVar.invoke(z.B0(arrayList, arrayList2));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21801(k kVar, k kVar2) {
            super(1);
            this.$onReceivePurchaseHistoryError = kVar;
            this.$onReceivePurchaseHistory = kVar2;
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<? extends PurchaseHistoryRecord>) obj);
            return G.f1419a;
        }

        public final void invoke(List<? extends PurchaseHistoryRecord> subsPurchasesList) {
            t.g(subsPurchasesList, "subsPurchasesList");
            BillingWrapper.this.queryPurchaseHistoryAsync("inapp", new C04461(this.$onReceivePurchaseHistory, subsPurchasesList), this.$onReceivePurchaseHistoryError);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$queryPurchaseHistoryAsync$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class C21811 extends C2639q implements k {
        public C21811(Object obj) {
            super(1, obj, BillingWrapper.class, "withConnectedClient", "withConnectedClient(Lkotlin/jvm/functions/Function1;)V", 0);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((k) obj);
            return G.f1419a;
        }

        public final void invoke(k p8) {
            t.g(p8, "p0");
            ((BillingWrapper) this.receiver).withConnectedClient(p8);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$queryPurchaseHistoryAsync$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class C21822 extends C2639q implements Q6.o {
        public C21822(Object obj) {
            super(2, obj, BillingWrapper.class, "executeRequestOnUIThread", "executeRequestOnUIThread(Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)V", 0);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Long) obj, (k) obj2);
            return G.f1419a;
        }

        public final void invoke(Long l8, k p8) {
            t.g(p8, "p1");
            ((BillingWrapper) this.receiver).executeRequestOnUIThread(l8, p8);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$queryPurchaseType$3, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class C21853 extends C2639q implements k {
        public C21853(Object obj) {
            super(1, obj, BillingWrapper.class, "withConnectedClient", "withConnectedClient(Lkotlin/jvm/functions/Function1;)V", 0);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((k) obj);
            return G.f1419a;
        }

        public final void invoke(k p8) {
            t.g(p8, "p0");
            ((BillingWrapper) this.receiver).withConnectedClient(p8);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$queryPurchaseType$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class AnonymousClass4 extends C2639q implements Q6.o {
        public AnonymousClass4(Object obj) {
            super(2, obj, BillingWrapper.class, "executeRequestOnUIThread", "executeRequestOnUIThread(Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)V", 0);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Long) obj, (k) obj2);
            return G.f1419a;
        }

        public final void invoke(Long l8, k p8) {
            t.g(p8, "p1");
            ((BillingWrapper) this.receiver).executeRequestOnUIThread(l8, p8);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$queryPurchases$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class C21861 extends C2639q implements k {
        public C21861(Object obj) {
            super(1, obj, BillingWrapper.class, "withConnectedClient", "withConnectedClient(Lkotlin/jvm/functions/Function1;)V", 0);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((k) obj);
            return G.f1419a;
        }

        public final void invoke(k p8) {
            t.g(p8, "p0");
            ((BillingWrapper) this.receiver).withConnectedClient(p8);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$queryPurchases$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class C21872 extends C2639q implements Q6.o {
        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Long) obj, (k) obj2);
            return G.f1419a;
        }

        public C21872(Object obj) {
            super(2, obj, BillingWrapper.class, QhsKALGiniuQ.FtAHx, "executeRequestOnUIThread(Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)V", 0);
        }

        public final void invoke(Long l8, k p8) {
            t.g(p8, "p1");
            ((BillingWrapper) this.receiver).executeRequestOnUIThread(l8, p8);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$showInAppMessagesIfNeeded$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C21881 extends u implements k {
        final /* synthetic */ C2774i $inAppMessageParams;
        final /* synthetic */ Function0 $subscriptionStatusChange;
        final /* synthetic */ WeakReference<Activity> $weakActivity;

        /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$showInAppMessagesIfNeeded$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C04471 extends u implements k {
            final /* synthetic */ C2774i $inAppMessageParams;
            final /* synthetic */ Function0 $subscriptionStatusChange;
            final /* synthetic */ WeakReference<Activity> $weakActivity;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04471(WeakReference<Activity> weakReference, C2774i c2774i, Function0 function0) {
                super(1);
                this.$weakActivity = weakReference;
                this.$inAppMessageParams = c2774i;
                this.$subscriptionStatusChange = function0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void invoke$lambda$1(Function0 subscriptionStatusChange, C2776k inAppMessageResult) {
                t.g(subscriptionStatusChange, "$subscriptionStatusChange");
                t.g(inAppMessageResult, "inAppMessageResult");
                int iA = inAppMessageResult.a();
                if (iA == 0) {
                    LogUtilsKt.verboseLog(BillingStrings.BILLING_INAPP_MESSAGE_NONE);
                    return;
                }
                if (iA == 1) {
                    LogUtilsKt.debugLog(BillingStrings.BILLING_INAPP_MESSAGE_UPDATE);
                    subscriptionStatusChange.invoke();
                } else {
                    String str = String.format(BillingStrings.BILLING_INAPP_MESSAGE_UNEXPECTED_CODE, Arrays.copyOf(new Object[]{Integer.valueOf(iA)}, 1));
                    t.f(str, "format(this, *args)");
                    LogUtilsKt.errorLog$default(str, null, 2, null);
                }
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((com.android.billingclient.api.a) obj);
                return G.f1419a;
            }

            public final void invoke(com.android.billingclient.api.a withConnectedClient) {
                t.g(withConnectedClient, "$this$withConnectedClient");
                Activity activity = this.$weakActivity.get();
                if (activity == null) {
                    LogUtilsKt.debugLog("Activity is null, not showing Google Play in-app message.");
                    return;
                }
                C2774i c2774i = this.$inAppMessageParams;
                final Function0 function0 = this.$subscriptionStatusChange;
                withConnectedClient.l(activity, c2774i, new InterfaceC2775j() { // from class: com.revenuecat.purchases.google.g
                    @Override // p138p3.InterfaceC2775j
                    public final void a(C2776k c2776k) {
                        BillingWrapper.C21881.C04471.invoke$lambda$1(function0, c2776k);
                    }
                });
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21881(WeakReference<Activity> weakReference, C2774i c2774i, Function0 function0) {
            super(1);
            this.$weakActivity = weakReference;
            this.$inAppMessageParams = c2774i;
            this.$subscriptionStatusChange = function0;
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return G.f1419a;
        }

        public final void invoke(PurchasesError purchasesError) {
            if (purchasesError == null) {
                BillingWrapper.this.withConnectedClient(new C04471(this.$weakActivity, this.$inAppMessageParams, this.$subscriptionStatusChange));
                return;
            }
            String str = String.format(BillingStrings.BILLING_CONNECTION_ERROR_INAPP_MESSAGES, Arrays.copyOf(new Object[]{purchasesError}, 1));
            t.f(str, "format(this, *args)");
            LogUtilsKt.errorLog$default(str, null, 2, null);
        }
    }

    public /* synthetic */ BillingWrapper(ClientFactory clientFactory, Handler handler, DeviceCache deviceCache, DiagnosticsTracker diagnosticsTracker, PurchasesStateProvider purchasesStateProvider, DateProvider dateProvider, int i8, AbstractC2633k abstractC2633k) {
        this(clientFactory, handler, deviceCache, diagnosticsTracker, purchasesStateProvider, (i8 & 32) != 0 ? new DefaultDateProvider() : dateProvider);
    }

    private final Result<com.android.billingclient.api.c, PurchasesError> buildOneTimePurchaseParams(GooglePurchasingData.InAppProduct inAppProduct, String str, Boolean bool) {
        com.android.billingclient.api.c.b.a aVarA = com.android.billingclient.api.c.b.a();
        aVarA.c(inAppProduct.getProductDetails());
        com.android.billingclient.api.c.b bVarA = aVarA.a();
        t.f(bVarA, "newBuilder().apply {\n   …etails)\n        }.build()");
        com.android.billingclient.api.c.a aVarC = com.android.billingclient.api.c.a().d(C0937q.e(bVarA)).c(UtilsKt.sha256(str));
        if (bool != null) {
            aVarC.b(bool.booleanValue());
        }
        com.android.billingclient.api.c cVarA = aVarC.a();
        t.f(cVarA, "newBuilder()\n           …\n                .build()");
        return new Result.Success(cVarA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Result<com.android.billingclient.api.c, PurchasesError> buildPurchaseParams(GooglePurchasingData googlePurchasingData, ReplaceProductInfo replaceProductInfo, String str, Boolean bool) {
        if (googlePurchasingData instanceof GooglePurchasingData.InAppProduct) {
            return buildOneTimePurchaseParams((GooglePurchasingData.InAppProduct) googlePurchasingData, str, bool);
        }
        if (googlePurchasingData instanceof GooglePurchasingData.Subscription) {
            return buildSubscriptionPurchaseParams((GooglePurchasingData.Subscription) googlePurchasingData, replaceProductInfo, str, bool);
        }
        throw new m();
    }

    private final Result<com.android.billingclient.api.c, PurchasesError> buildSubscriptionPurchaseParams(GooglePurchasingData.Subscription subscription, ReplaceProductInfo replaceProductInfo, String str, Boolean bool) {
        com.android.billingclient.api.c.b.a aVarA = com.android.billingclient.api.c.b.a();
        aVarA.b(subscription.getToken());
        aVarA.c(subscription.getProductDetails());
        com.android.billingclient.api.c.b bVarA = aVarA.a();
        t.f(bVarA, "newBuilder().apply {\n   …etails)\n        }.build()");
        com.android.billingclient.api.c.a aVarD = com.android.billingclient.api.c.a().d(C0937q.e(bVarA));
        if (replaceProductInfo != null) {
            t.f(aVarD, "buildSubscriptionPurchas…arams$lambda$29$lambda$27");
            BillingFlowParamsExtensionsKt.setUpgradeInfo(aVarD, replaceProductInfo);
            G g8 = G.f1419a;
        } else {
            t.f(aVarD.c(UtilsKt.sha256(str)), "setObfuscatedAccountId(appUserID.sha256())");
        }
        if (bool != null) {
            aVarD.b(bool.booleanValue());
        }
        com.android.billingclient.api.c cVarA = aVarD.a();
        t.f(cVarA, "newBuilder()\n           …\n                .build()");
        return new Result.Success(cVarA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void endConnection$lambda$9(BillingWrapper this$0) {
        t.g(this$0, "this$0");
        synchronized (this$0) {
            try {
                com.android.billingclient.api.a aVar = this$0.billingClient;
                if (aVar != null) {
                    LogIntent logIntent = LogIntent.DEBUG;
                    String str = String.format(BillingStrings.BILLING_CLIENT_ENDING, Arrays.copyOf(new Object[]{aVar}, 1));
                    t.f(str, "format(this, *args)");
                    LogWrapperKt.log(logIntent, str);
                    aVar.c();
                }
                this$0.billingClient = null;
                G g8 = G.f1419a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void executePendingRequests() {
        o oVarPoll;
        synchronized (this) {
            while (true) {
                try {
                    com.android.billingclient.api.a aVar = this.billingClient;
                    if (aVar == null || !aVar.f() || (oVarPoll = this.serviceRequests.poll()) == null) {
                        break;
                    }
                    t.f(oVarPoll, "poll()");
                    final k kVar = (k) oVarPoll.a();
                    Long l8 = (Long) oVarPoll.b();
                    if (l8 != null) {
                        this.mainHandler.postDelayed(new Runnable() { // from class: com.revenuecat.purchases.google.b
                            @Override // java.lang.Runnable
                            public final void run() {
                                BillingWrapper.executePendingRequests$lambda$3$lambda$2$lambda$0(kVar);
                            }
                        }, l8.longValue());
                    } else {
                        this.mainHandler.post(new Runnable() { // from class: com.revenuecat.purchases.google.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                BillingWrapper.executePendingRequests$lambda$3$lambda$2$lambda$1(kVar);
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            G g8 = G.f1419a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executePendingRequests$lambda$3$lambda$2$lambda$0(k request) {
        t.g(request, "$request");
        request.invoke(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executePendingRequests$lambda$3$lambda$2$lambda$1(k request) {
        t.g(request, "$request");
        request.invoke(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void executeRequestOnUIThread(Long l8, k kVar) {
        try {
            if (getPurchasesUpdatedListener() != null) {
                this.serviceRequests.add(v.a(kVar, l8));
                com.android.billingclient.api.a aVar = this.billingClient;
                if (aVar == null || aVar.f()) {
                    executePendingRequests();
                } else {
                    BillingAbstract.startConnectionOnMainThread$default(this, 0L, 1, null);
                }
            } else {
                kVar.invoke(new PurchasesError(PurchasesErrorCode.UnknownError, "BillingWrapper is not attached to a listener"));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static /* synthetic */ void executeRequestOnUIThread$default(BillingWrapper billingWrapper, Long l8, k kVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            l8 = null;
        }
        billingWrapper.executeRequestOnUIThread(l8, kVar);
    }

    private final String getStackTrace() {
        StringWriter stringWriter = new StringWriter();
        new Throwable().printStackTrace(new PrintWriter(stringWriter));
        String string = stringWriter.toString();
        t.f(string, "stringWriter.toString()");
        return string;
    }

    private final void getStoreTransaction(Purchase purchase, k kVar) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(BillingStrings.BILLING_WRAPPER_PURCHASES_UPDATED, Arrays.copyOf(new Object[]{PurchaseExtensionsKt.toHumanReadableDescription(purchase)}, 1));
        t.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        synchronized (this) {
            PurchaseContext purchaseContext = this.purchaseContext.get(PurchaseExtensionsKt.getFirstProductId(purchase));
            if (purchaseContext != null && purchaseContext.getProductType() != null) {
                kVar.invoke(StoreTransactionConversionsKt.toStoreTransaction(purchase, purchaseContext));
                return;
            }
            String strF = purchase.f();
            t.f(strF, "purchase.purchaseToken");
            getPurchaseType$purchases_defaultsRelease(strF, new BillingWrapper$getStoreTransaction$1$2(kVar, purchase));
            G g8 = G.f1419a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchBillingFlow(Activity activity, com.android.billingclient.api.c cVar) {
        if (activity.getIntent() == null) {
            LogWrapperKt.log(LogIntent.WARNING, BillingStrings.NULL_ACTIVITY_INTENT);
        }
        withConnectedClient(new C21781(activity, cVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBillingSetupFinished$lambda$18(com.android.billingclient.api.d billingResult, BillingWrapper this$0) {
        PurchasesError purchasesErrorBillingResponseToPurchasesError;
        t.g(billingResult, "$billingResult");
        t.g(this$0, "this$0");
        int iB = billingResult.b();
        if (iB != 6) {
            if (iB != 7 && iB != 8) {
                if (iB != 12) {
                    switch (iB) {
                        case -2:
                        case 3:
                            String humanReadableDescription = BillingResultExtensionsKt.toHumanReadableDescription(billingResult);
                            if (t.c(billingResult.a(), ErrorsKt.IN_APP_BILLING_LESS_THAN_3_ERROR_MESSAGE)) {
                                String str = String.format(BillingStrings.BILLING_UNAVAILABLE_LESS_THAN_3, Arrays.copyOf(new Object[]{humanReadableDescription}, 1));
                                t.f(str, "format(this, *args)");
                                purchasesErrorBillingResponseToPurchasesError = new PurchasesError(PurchasesErrorCode.StoreProblemError, str);
                                LogUtilsKt.errorLog(purchasesErrorBillingResponseToPurchasesError);
                            } else {
                                String str2 = String.format(BillingStrings.BILLING_UNAVAILABLE, Arrays.copyOf(new Object[]{humanReadableDescription}, 1));
                                t.f(str2, "format(this, *args)");
                                purchasesErrorBillingResponseToPurchasesError = ErrorsKt.billingResponseToPurchasesError(billingResult.b(), str2);
                                LogUtilsKt.errorLog(purchasesErrorBillingResponseToPurchasesError);
                            }
                            this$0.sendErrorsToAllPendingRequests(purchasesErrorBillingResponseToPurchasesError);
                            break;
                        case 0:
                            LogIntent logIntent = LogIntent.DEBUG;
                            com.android.billingclient.api.a aVar = this$0.billingClient;
                            String str3 = String.format(BillingStrings.BILLING_SERVICE_SETUP_FINISHED, Arrays.copyOf(new Object[]{aVar != null ? aVar.toString() : null}, 1));
                            t.f(str3, "format(this, *args)");
                            LogWrapperKt.log(logIntent, str3);
                            BillingAbstract.StateListener stateListener = this$0.getStateListener();
                            if (stateListener != null) {
                                stateListener.onConnected();
                            }
                            this$0.executePendingRequests();
                            this$0.reconnectMilliseconds = 1000L;
                            this$0.trackProductDetailsNotSupportedIfNeeded();
                            break;
                    }
                    return;
                }
            }
            LogIntent logIntent2 = LogIntent.GOOGLE_WARNING;
            String str4 = String.format(BillingStrings.BILLING_CLIENT_ERROR, Arrays.copyOf(new Object[]{BillingResultExtensionsKt.toHumanReadableDescription(billingResult)}, 1));
            t.f(str4, "format(this, *args)");
            LogWrapperKt.log(logIntent2, str4);
            return;
        }
        LogIntent logIntent3 = LogIntent.GOOGLE_WARNING;
        String str5 = String.format(BillingStrings.BILLING_CLIENT_ERROR, Arrays.copyOf(new Object[]{BillingResultExtensionsKt.toHumanReadableDescription(billingResult)}, 1));
        t.f(str5, "format(this, *args)");
        LogWrapperKt.log(logIntent3, str5);
        this$0.retryBillingServiceConnectionWithExponentialBackoff();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void queryPurchaseType(String str, String str2, k kVar, k kVar2) {
        BillingClientUseCase.run$default(new QueryPurchasesByTypeUseCase(new QueryPurchasesByTypeUseCaseParams(this.dateProvider, this.diagnosticsTrackerIfEnabled, getAppInBackground(), str), new C21831(kVar2, str2), new C21842(kVar), new C21853(this), new AnonymousClass4(this)), 0L, 1, null);
    }

    private final void retryBillingServiceConnectionWithExponentialBackoff() {
        if (this.reconnectionAlreadyScheduled) {
            LogWrapperKt.log(LogIntent.WARNING, BillingStrings.BILLING_CLIENT_RETRY_ALREADY_SCHEDULED);
            return;
        }
        LogIntent logIntent = LogIntent.WARNING;
        String str = String.format(BillingStrings.BILLING_CLIENT_RETRY, Arrays.copyOf(new Object[]{Long.valueOf(this.reconnectMilliseconds)}, 1));
        t.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        this.reconnectionAlreadyScheduled = true;
        startConnectionOnMainThread(this.reconnectMilliseconds);
        this.reconnectMilliseconds = Math.min(this.reconnectMilliseconds * ((long) 2), 900000L);
    }

    private final synchronized void sendErrorsToAllPendingRequests(final PurchasesError purchasesError) {
        while (true) {
            o oVarPoll = this.serviceRequests.poll();
            if (oVarPoll != null) {
                final k kVar = (k) oVarPoll.a();
                this.mainHandler.post(new Runnable() { // from class: com.revenuecat.purchases.google.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        BillingWrapper.sendErrorsToAllPendingRequests$lambda$31$lambda$30(kVar, purchasesError);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendErrorsToAllPendingRequests$lambda$31$lambda$30(k serviceRequest, PurchasesError error) {
        t.g(serviceRequest, "$serviceRequest");
        t.g(error, "$error");
        serviceRequest.invoke(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startConnectionOnMainThread$lambda$4(BillingWrapper this$0) {
        t.g(this$0, "this$0");
        this$0.startConnection();
    }

    private final void trackProductDetailsNotSupportedIfNeeded() {
        if (this.diagnosticsTrackerIfEnabled == null) {
            return;
        }
        com.android.billingclient.api.a aVar = this.billingClient;
        com.android.billingclient.api.d dVarE = aVar != null ? aVar.e("fff") : null;
        if (dVarE == null || dVarE.b() != -2) {
            return;
        }
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        int iB = dVarE.b();
        String strA = dVarE.a();
        t.f(strA, "billingResult.debugMessage");
        diagnosticsTracker.trackProductDetailsNotSupported(iB, strA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void withConnectedClient(k kVar) {
        com.android.billingclient.api.a aVar = this.billingClient;
        G g8 = null;
        if (aVar != null) {
            if (!aVar.f()) {
                aVar = null;
            }
            if (aVar != null) {
                kVar.invoke(aVar);
                g8 = G.f1419a;
            }
        }
        if (g8 == null) {
            LogIntent logIntent = LogIntent.GOOGLE_WARNING;
            String str = String.format(BillingStrings.BILLING_CLIENT_DISCONNECTED, Arrays.copyOf(new Object[]{getStackTrace()}, 1));
            t.f(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
        }
    }

    public final void acknowledge$purchases_defaultsRelease(String token, PostReceiptInitiationSource initiationSource, k onAcknowledged) {
        t.g(token, "token");
        t.g(initiationSource, "initiationSource");
        t.g(onAcknowledged, "onAcknowledged");
        LogIntent logIntent = LogIntent.PURCHASE;
        String str = String.format(PurchaseStrings.ACKNOWLEDGING_PURCHASE, Arrays.copyOf(new Object[]{token}, 1));
        t.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        BillingClientUseCase.run$default(new AcknowledgePurchaseUseCase(new AcknowledgePurchaseUseCaseParams(token, initiationSource, getAppInBackground()), onAcknowledged, BillingWrapper$acknowledge$1.INSTANCE, new BillingWrapper$acknowledge$2(this), new BillingWrapper$acknowledge$3(this)), 0L, 1, null);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void consumeAndSave(boolean z8, StoreTransaction purchase, boolean z9, PostReceiptInitiationSource initiationSource) {
        t.g(purchase, "purchase");
        t.g(initiationSource, "initiationSource");
        if (purchase.getType() == ProductType.UNKNOWN || purchase.getPurchaseState() == PurchaseState.PENDING) {
            return;
        }
        Purchase originalGooglePurchase = StoreTransactionConversionsKt.getOriginalGooglePurchase(purchase);
        boolean zH = originalGooglePurchase != null ? originalGooglePurchase.h() : false;
        if (purchase.getType() != ProductType.INAPP) {
            if (!z8 || zH) {
                this.deviceCache.addSuccessfullyPostedToken(purchase.getPurchaseToken());
                return;
            } else {
                acknowledge$purchases_defaultsRelease(purchase.getPurchaseToken(), initiationSource, new AnonymousClass3(this.deviceCache));
                return;
            }
        }
        if (z8 && z9) {
            consumePurchase$purchases_defaultsRelease(purchase.getPurchaseToken(), initiationSource, new AnonymousClass1(this.deviceCache));
        } else if (!z8 || zH) {
            this.deviceCache.addSuccessfullyPostedToken(purchase.getPurchaseToken());
        } else {
            LogWrapperKt.log(LogIntent.PURCHASE, PurchaseStrings.NOT_CONSUMING_IN_APP_PURCHASE_ACCORDING_TO_BACKEND);
            acknowledge$purchases_defaultsRelease(purchase.getPurchaseToken(), initiationSource, new AnonymousClass2(this.deviceCache));
        }
    }

    public final void consumePurchase$purchases_defaultsRelease(String token, PostReceiptInitiationSource initiationSource, k onConsumed) {
        t.g(token, "token");
        t.g(initiationSource, "initiationSource");
        t.g(onConsumed, "onConsumed");
        LogIntent logIntent = LogIntent.PURCHASE;
        String str = String.format(PurchaseStrings.CONSUMING_PURCHASE, Arrays.copyOf(new Object[]{token}, 1));
        t.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        BillingClientUseCase.run$default(new ConsumePurchaseUseCase(new ConsumePurchaseUseCaseParams(token, initiationSource, getAppInBackground()), onConsumed, BillingWrapper$consumePurchase$1.INSTANCE, new BillingWrapper$consumePurchase$2(this), new BillingWrapper$consumePurchase$3(this)), 0L, 1, null);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void endConnection() {
        this.mainHandler.post(new Runnable() { // from class: com.revenuecat.purchases.google.d
            @Override // java.lang.Runnable
            public final void run() {
                BillingWrapper.endConnection$lambda$9(this.f19564a);
            }
        });
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void findPurchaseInPurchaseHistory(String appUserID, ProductType productType, String productId, k onCompletion, k onError) {
        k kVar;
        t.g(appUserID, "appUserID");
        t.g(productType, "productType");
        t.g(productId, "productId");
        t.g(onCompletion, "onCompletion");
        t.g(onError, "onError");
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(RestoreStrings.QUERYING_PURCHASE_WITH_TYPE, Arrays.copyOf(new Object[]{productId, productType.name()}, 2));
        t.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        String googleProductType = ProductTypeConversionsKt.toGoogleProductType(productType);
        G g8 = null;
        if (googleProductType != null) {
            kVar = onError;
            BillingClientUseCase.run$default(new QueryPurchaseHistoryUseCase(new QueryPurchaseHistoryUseCaseParams(this.dateProvider, this.diagnosticsTrackerIfEnabled, googleProductType, getAppInBackground()), new BillingWrapper$findPurchaseInPurchaseHistory$1$1(productType, onCompletion, productId, onError), kVar, new BillingWrapper$findPurchaseInPurchaseHistory$1$2(this), new BillingWrapper$findPurchaseInPurchaseHistory$1$3(this)), 0L, 1, null);
            g8 = G.f1419a;
        } else {
            kVar = onError;
        }
        if (g8 == null) {
            kVar.invoke(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, PurchaseStrings.NOT_RECOGNIZED_PRODUCT_TYPE));
        }
    }

    public final boolean getAppInBackground() {
        return getPurchasesStateProvider().getPurchasesState().getAppInBackground();
    }

    public final synchronized com.android.billingclient.api.a getBillingClient() {
        return this.billingClient;
    }

    public final void getPurchaseType$purchases_defaultsRelease(String purchaseToken, k listener) {
        t.g(purchaseToken, "purchaseToken");
        t.g(listener, "listener");
        queryPurchaseType("subs", purchaseToken, listener, new BillingWrapper$getPurchaseType$1(listener, this, purchaseToken));
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void getStorefront(k onSuccess, k onError) {
        t.g(onSuccess, "onSuccess");
        t.g(onError, "onError");
        LogUtilsKt.verboseLog(BillingStrings.BILLING_INITIATE_GETTING_COUNTRY_CODE);
        BillingClientUseCase.run$default(new GetBillingConfigUseCase(new GetBillingConfigUseCaseParams(getAppInBackground()), this.deviceCache, new C21751(onSuccess), onError, new C21762(this), new C21773(this)), 0L, 1, null);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public boolean isConnected() {
        com.android.billingclient.api.a aVar = this.billingClient;
        if (aVar != null) {
            return aVar.f();
        }
        return false;
    }

    @Override // p138p3.InterfaceC2765c
    public void onBillingServiceDisconnected() {
        LogIntent logIntent = LogIntent.WARNING;
        com.android.billingclient.api.a aVar = this.billingClient;
        String str = String.format(BillingStrings.BILLING_SERVICE_DISCONNECTED_INSTANCE, Arrays.copyOf(new Object[]{aVar != null ? aVar.toString() : null}, 1));
        t.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
    }

    @Override // p138p3.InterfaceC2765c
    public void onBillingSetupFinished(final com.android.billingclient.api.d billingResult) {
        t.g(billingResult, "billingResult");
        this.mainHandler.post(new Runnable() { // from class: com.revenuecat.purchases.google.a
            @Override // java.lang.Runnable
            public final void run() {
                BillingWrapper.onBillingSetupFinished$lambda$18(billingResult, this);
            }
        });
    }

    @Override // p138p3.InterfaceC2780o
    public void onPurchasesUpdated(com.android.billingclient.api.d billingResult, List<? extends Purchase> list) {
        t.g(billingResult, "billingResult");
        List<? extends Purchase> listN = list == null ? r.n() : list;
        if (billingResult.b() == 0 && !listN.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listN.iterator();
            while (it.hasNext()) {
                getStoreTransaction((Purchase) it.next(), new BillingWrapper$onPurchasesUpdated$1$1(arrayList, listN, this));
            }
            return;
        }
        LogIntent logIntent = LogIntent.GOOGLE_ERROR;
        StringBuilder sb = new StringBuilder();
        String str = String.format(BillingStrings.BILLING_WRAPPER_PURCHASES_ERROR, Arrays.copyOf(new Object[]{BillingResultExtensionsKt.toHumanReadableDescription(billingResult)}, 1));
        t.f(str, "format(this, *args)");
        sb.append(str);
        String str2 = null;
        List<? extends Purchase> list2 = !listN.isEmpty() ? listN : null;
        if (list2 != null) {
            str2 = "Purchases:" + z.r0(list2, ", ", null, null, 0, null, BillingWrapper$onPurchasesUpdated$3$1.INSTANCE, 30, null);
        }
        sb.append(str2);
        LogWrapperKt.log(logIntent, sb.toString());
        String str3 = "Error updating purchases. " + BillingResultExtensionsKt.toHumanReadableDescription(billingResult);
        int iB = billingResult.b();
        if (list == null && billingResult.b() == 0) {
            str3 = "Error: onPurchasesUpdated received an OK BillingResult with a Null purchases list.";
            iB = 6;
        }
        PurchasesError purchasesErrorBillingResponseToPurchasesError = ErrorsKt.billingResponseToPurchasesError(iB, str3);
        LogUtilsKt.errorLog(purchasesErrorBillingResponseToPurchasesError);
        BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = getPurchasesUpdatedListener();
        if (purchasesUpdatedListener != null) {
            purchasesUpdatedListener.onPurchasesFailedToUpdate(purchasesErrorBillingResponseToPurchasesError);
        }
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void queryAllPurchases(String appUserID, k onReceivePurchaseHistory, k onReceivePurchaseHistoryError) {
        t.g(appUserID, "appUserID");
        t.g(onReceivePurchaseHistory, "onReceivePurchaseHistory");
        t.g(onReceivePurchaseHistoryError, "onReceivePurchaseHistoryError");
        queryPurchaseHistoryAsync("subs", new C21801(onReceivePurchaseHistoryError, onReceivePurchaseHistory), onReceivePurchaseHistoryError);
    }

    public final void queryPurchaseHistoryAsync(String productType, k onReceivePurchaseHistory, k onReceivePurchaseHistoryError) {
        t.g(productType, "productType");
        t.g(onReceivePurchaseHistory, "onReceivePurchaseHistory");
        t.g(onReceivePurchaseHistoryError, "onReceivePurchaseHistoryError");
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(RestoreStrings.QUERYING_PURCHASE_HISTORY, Arrays.copyOf(new Object[]{productType}, 1));
        t.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        BillingClientUseCase.run$default(new QueryPurchaseHistoryUseCase(new QueryPurchaseHistoryUseCaseParams(this.dateProvider, this.diagnosticsTrackerIfEnabled, productType, getAppInBackground()), onReceivePurchaseHistory, onReceivePurchaseHistoryError, new C21811(this), new C21822(this)), 0L, 1, null);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void queryPurchases(String appUserID, k onSuccess, k onError) {
        t.g(appUserID, "appUserID");
        t.g(onSuccess, "onSuccess");
        t.g(onError, "onError");
        LogWrapperKt.log(LogIntent.DEBUG, RestoreStrings.QUERYING_PURCHASE);
        BillingClientUseCase.run$default(new QueryPurchasesUseCase(new QueryPurchasesUseCaseParams(this.dateProvider, this.diagnosticsTrackerIfEnabled, getAppInBackground()), onSuccess, onError, new C21861(this), new C21872(this)), 0L, 1, null);
    }

    public final synchronized void setBillingClient(com.android.billingclient.api.a aVar) {
        this.billingClient = aVar;
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void showInAppMessagesIfNeeded(Activity activity, List<? extends InAppMessageType> inAppMessageTypes, Function0 subscriptionStatusChange) {
        t.g(activity, "activity");
        t.g(inAppMessageTypes, "inAppMessageTypes");
        t.g(subscriptionStatusChange, "subscriptionStatusChange");
        if (inAppMessageTypes.isEmpty()) {
            LogUtilsKt.errorLog$default(BillingStrings.BILLING_UNSPECIFIED_INAPP_MESSAGE_TYPES, null, 2, null);
            return;
        }
        C2774i.a aVarA = C2774i.a();
        t.f(aVarA, "newBuilder()");
        Iterator<? extends InAppMessageType> it = inAppMessageTypes.iterator();
        while (it.hasNext()) {
            aVarA.a(it.next().getInAppMessageCategoryId$purchases_defaultsRelease());
        }
        C2774i c2774iB = aVarA.b();
        t.f(c2774iB, "inAppMessageParamsBuilder.build()");
        executeRequestOnUIThread$default(this, null, new C21881(new WeakReference(activity), c2774iB, subscriptionStatusChange), 1, null);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void startConnection() {
        synchronized (this) {
            try {
                if (this.billingClient == null) {
                    this.billingClient = this.clientFactory.buildClient(this);
                }
                this.reconnectionAlreadyScheduled = false;
                com.android.billingclient.api.a aVar = this.billingClient;
                if (aVar != null) {
                    if (!aVar.f()) {
                        LogIntent logIntent = LogIntent.DEBUG;
                        String str = String.format(BillingStrings.BILLING_CLIENT_STARTING, Arrays.copyOf(new Object[]{aVar}, 1));
                        t.f(str, "format(this, *args)");
                        LogWrapperKt.log(logIntent, str);
                        try {
                            aVar.m(this);
                        } catch (IllegalStateException e8) {
                            LogIntent logIntent2 = LogIntent.GOOGLE_ERROR;
                            String str2 = String.format(BillingStrings.ILLEGAL_STATE_EXCEPTION_WHEN_CONNECTING, Arrays.copyOf(new Object[]{e8}, 1));
                            t.f(str2, "format(this, *args)");
                            LogWrapperKt.log(logIntent2, str2);
                            sendErrorsToAllPendingRequests(new PurchasesError(PurchasesErrorCode.StoreProblemError, e8.getMessage()));
                        }
                    }
                    G g8 = G.f1419a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void startConnectionOnMainThread(long j8) {
        this.mainHandler.postDelayed(new Runnable() { // from class: com.revenuecat.purchases.google.f
            @Override // java.lang.Runnable
            public final void run() {
                BillingWrapper.startConnectionOnMainThread$lambda$4(this.f19567a);
            }
        }, j8);
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$queryPurchaseType$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C21842 extends u implements k {
        final /* synthetic */ k $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21842(k kVar) {
            super(1);
            this.$listener = kVar;
        }

        public final void invoke(PurchasesError error) {
            t.g(error, "error");
            LogUtilsKt.errorLog(error);
            this.$listener.invoke(ProductType.UNKNOWN);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return G.f1419a;
        }
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void makePurchaseAsync(Activity activity, String appUserID, PurchasingData purchasingData, ReplaceProductInfo replaceProductInfo, PresentedOfferingContext presentedOfferingContext, Boolean bool) {
        String optionId;
        t.g(activity, "activity");
        t.g(appUserID, "appUserID");
        t.g(purchasingData, "purchasingData");
        GooglePurchasingData googlePurchasingData = purchasingData instanceof GooglePurchasingData ? (GooglePurchasingData) purchasingData : null;
        if (googlePurchasingData == null) {
            PurchasesErrorCode purchasesErrorCode = PurchasesErrorCode.UnknownError;
            String str = String.format(PurchaseStrings.INVALID_PURCHASE_TYPE, Arrays.copyOf(new Object[]{"Play", "GooglePurchasingData"}, 2));
            t.f(str, "format(this, *args)");
            PurchasesError purchasesError = new PurchasesError(purchasesErrorCode, str);
            LogUtilsKt.errorLog(purchasesError);
            BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = getPurchasesUpdatedListener();
            if (purchasesUpdatedListener != null) {
                purchasesUpdatedListener.onPurchasesFailedToUpdate(purchasesError);
                return;
            }
            return;
        }
        if (googlePurchasingData instanceof GooglePurchasingData.InAppProduct) {
            optionId = null;
        } else {
            if (!(googlePurchasingData instanceof GooglePurchasingData.Subscription)) {
                throw new m();
            }
            optionId = ((GooglePurchasingData.Subscription) googlePurchasingData).getOptionId();
        }
        if (replaceProductInfo != null) {
            LogIntent logIntent = LogIntent.PURCHASE;
            String str2 = String.format(PurchaseStrings.UPGRADING_SKU, Arrays.copyOf(new Object[]{replaceProductInfo.getOldPurchase().getProductIds().get(0), googlePurchasingData.getProductId()}, 2));
            t.f(str2, SZCvugJaXc.mVjZDaJrtg);
            LogWrapperKt.log(logIntent, str2);
        } else {
            LogIntent logIntent2 = LogIntent.PURCHASE;
            String str3 = String.format(PurchaseStrings.PURCHASING_PRODUCT, Arrays.copyOf(new Object[]{googlePurchasingData.getProductId()}, 1));
            t.f(str3, "format(this, *args)");
            LogWrapperKt.log(logIntent2, str3);
        }
        synchronized (this) {
            try {
                String productId = googlePurchasingData.getProductId();
                Map<String, PurchaseContext> map = this.purchaseContext;
                ProductType productType = googlePurchasingData.getProductType();
                ReplacementMode replacementMode = replaceProductInfo != null ? replaceProductInfo.getReplacementMode() : null;
                map.put(productId, new PurchaseContext(productType, presentedOfferingContext, optionId, replacementMode instanceof GoogleReplacementMode ? (GoogleReplacementMode) replacementMode : null));
                G g8 = G.f1419a;
            } catch (Throwable th) {
                throw th;
            }
        }
        executeRequestOnUIThread$default(this, null, new C21792(purchasingData, replaceProductInfo, appUserID, bool, activity), 1, null);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void queryProductDetailsAsync(ProductType productType, Set<String> productIds, k onReceive, k onError) {
        t.g(productType, "productType");
        t.g(productIds, "productIds");
        t.g(onReceive, "onReceive");
        t.g(onError, "onError");
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(OfferingStrings.FETCHING_PRODUCTS, Arrays.copyOf(new Object[]{z.r0(productIds, null, null, null, 0, null, null, 63, null)}, 1));
        t.f(str, hJroAgFztiMK.bLaqmNIwpQHYFm);
        LogWrapperKt.log(logIntent, str);
        BillingClientUseCase.run$default(new QueryProductDetailsUseCase(new QueryProductDetailsUseCaseParams(this.dateProvider, this.diagnosticsTrackerIfEnabled, productIds, productType, getAppInBackground()), onReceive, onError, new BillingWrapper$queryProductDetailsAsync$useCase$1(this), new BillingWrapper$queryProductDetailsAsync$useCase$2(this)), 0L, 1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingWrapper(ClientFactory clientFactory, Handler mainHandler, DeviceCache deviceCache, DiagnosticsTracker diagnosticsTracker, PurchasesStateProvider purchasesStateProvider, DateProvider dateProvider) {
        super(purchasesStateProvider);
        t.g(clientFactory, "clientFactory");
        t.g(mainHandler, "mainHandler");
        t.g(deviceCache, "deviceCache");
        t.g(purchasesStateProvider, "purchasesStateProvider");
        t.g(dateProvider, "dateProvider");
        this.clientFactory = clientFactory;
        this.mainHandler = mainHandler;
        this.deviceCache = deviceCache;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.dateProvider = dateProvider;
        this.purchaseContext = new LinkedHashMap();
        this.serviceRequests = new ConcurrentLinkedQueue<>();
        this.reconnectMilliseconds = 1000L;
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$queryPurchaseType$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C21831 extends u implements k {
        final /* synthetic */ String $purchaseToken;
        final /* synthetic */ k $resultHandler;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21831(k kVar, String str) {
            super(1);
            this.$resultHandler = kVar;
            this.$purchaseToken = str;
        }

        public final void invoke(Map<String, StoreTransaction> purchases) {
            t.g(purchases, "purchases");
            k kVar = this.$resultHandler;
            Collection<StoreTransaction> collectionValues = purchases.values();
            String str = this.$purchaseToken;
            boolean z8 = false;
            if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                Iterator<T> it = collectionValues.iterator();
                while (it.hasNext()) {
                    if (t.c(((StoreTransaction) it.next()).getPurchaseToken(), str)) {
                        z8 = true;
                        break;
                    }
                }
            }
            kVar.invoke(Boolean.valueOf(z8));
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Map<String, StoreTransaction>) obj);
            return G.f1419a;
        }
    }
}
