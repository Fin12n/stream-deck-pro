package com.revenuecat.purchases.common;

import C6.G;
import C6.o;
import C6.v;
import D6.C0937q;
import D6.C0938s;
import D6.L;
import D6.M;
import D6.r;
import D6.z;
import E4.JFpq.XRlnZWSrAFn;
import H.FL.dCqzKmEghGTQ;
import M6.eLZq.eGwOBWCdOTaKus;
import Q6.k;
import Q6.p;
import androidx.startup.TrZh.ZWZaxQrCHfNe;
import com.revenuecat.purchases.PostReceiptInitiationSource;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.common.networking.PostReceiptResponseKt;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping;
import com.revenuecat.purchases.common.verification.SignatureVerificationMode;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.paywalls.events.PaywallEventRequest;
import com.revenuecat.purchases.paywalls.events.PaywallPostReceiptData;
import com.revenuecat.purchases.strings.NetworkStrings;
import com.revenuecat.purchases.utils.JsonElementExtensionsKt;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class Backend {

    @Deprecated
    public static final String APP_USER_ID = "app_user_id";
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String FETCH_TOKEN = "fetch_token";

    @Deprecated
    public static final String NEW_APP_USER_ID = "new_app_user_id";
    private final AppConfig appConfig;
    private final BackendHelper backendHelper;
    private volatile Map<BackgroundAwareCallbackCacheKey, List<o>> callbacks;
    private volatile Map<List<String>, List<o>> diagnosticsCallbacks;
    private final Dispatcher dispatcher;
    private final Dispatcher eventsDispatcher;
    private final HTTPClient httpClient;
    private volatile Map<List<String>, List<o>> identifyCallbacks;
    private volatile Map<BackgroundAwareCallbackCacheKey, List<o>> offeringsCallbacks;
    private volatile Map<List<String>, List<o>> paywallEventsCallbacks;
    private volatile Map<List<String>, List<o>> postReceiptCallbacks;
    private volatile Map<String, List<o>> productEntitlementCallbacks;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC2633k abstractC2633k) {
            this();
        }

        private Companion() {
        }
    }

    private final synchronized <S, E> void addBackgroundAwareCallback(Map<BackgroundAwareCallbackCacheKey, List<o>> map, Dispatcher.AsyncCall asyncCall, Dispatcher dispatcher, BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey, o oVar, Delay delay) {
        BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey2;
        try {
            BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKeyCopy$default = BackgroundAwareCallbackCacheKey.copy$default(backgroundAwareCallbackCacheKey, null, false, 1, null);
            boolean zContainsKey = map.containsKey(backgroundAwareCallbackCacheKeyCopy$default);
            if (backgroundAwareCallbackCacheKey.getAppInBackground() && zContainsKey) {
                String str = String.format(NetworkStrings.SAME_CALL_SCHEDULED_WITHOUT_JITTER, Arrays.copyOf(new Object[]{backgroundAwareCallbackCacheKeyCopy$default}, 1));
                t.f(str, "format(this, *args)");
                LogUtilsKt.debugLog(str);
                backgroundAwareCallbackCacheKey2 = backgroundAwareCallbackCacheKeyCopy$default;
            } else {
                backgroundAwareCallbackCacheKey2 = backgroundAwareCallbackCacheKey;
            }
            addCallback(map, asyncCall, dispatcher, backgroundAwareCallbackCacheKey2, oVar, delay);
            BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKeyCopy$default2 = BackgroundAwareCallbackCacheKey.copy$default(backgroundAwareCallbackCacheKey, null, true, 1, null);
            boolean zContainsKey2 = map.containsKey(backgroundAwareCallbackCacheKeyCopy$default);
            if (!backgroundAwareCallbackCacheKey.getAppInBackground() && zContainsKey2) {
                String str2 = String.format(NetworkStrings.SAME_CALL_SCHEDULED_WITH_JITTER, Arrays.copyOf(new Object[]{backgroundAwareCallbackCacheKeyCopy$default}, 1));
                t.f(str2, "format(this, *args)");
                LogUtilsKt.debugLog(str2);
                List<o> listRemove = map.remove(backgroundAwareCallbackCacheKeyCopy$default2);
                if (listRemove != null) {
                    List<o> list = listRemove.isEmpty() ? null : listRemove;
                    if (list != null) {
                        if (map.containsKey(backgroundAwareCallbackCacheKey)) {
                            List<o> list2 = map.get(backgroundAwareCallbackCacheKey);
                            if (list2 != null) {
                                list2.addAll(list);
                            }
                        } else {
                            map.put(backgroundAwareCallbackCacheKey, list);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static /* synthetic */ void addBackgroundAwareCallback$default(Backend backend, Map map, Dispatcher.AsyncCall asyncCall, Dispatcher dispatcher, BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey, o oVar, Delay delay, int i8, Object obj) {
        if ((i8 & 16) != 0) {
            delay = Delay.NONE;
        }
        backend.addBackgroundAwareCallback(map, asyncCall, dispatcher, backgroundAwareCallbackCacheKey, oVar, delay);
    }

    public static /* synthetic */ void addCallback$default(Backend backend, Map map, Dispatcher.AsyncCall asyncCall, Dispatcher dispatcher, Object obj, o oVar, Delay delay, int i8, Object obj2) {
        if ((i8 & 16) != 0) {
            delay = Delay.NONE;
        }
        backend.addCallback(map, asyncCall, dispatcher, obj, oVar, delay);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PostReceiptErrorHandlingBehavior determinePostReceiptErrorHandlingBehavior(int i8, PurchasesError purchasesError) {
        if (RCHTTPStatusCodes.INSTANCE.isServerError(i8)) {
            return PostReceiptErrorHandlingBehavior.SHOULD_USE_OFFLINE_ENTITLEMENTS_AND_NOT_CONSUME;
        }
        return purchasesError.getCode() == PurchasesErrorCode.UnsupportedError ? PostReceiptErrorHandlingBehavior.SHOULD_NOT_CONSUME : PostReceiptErrorHandlingBehavior.SHOULD_BE_MARKED_SYNCED;
    }

    public final void clearCaches() {
        this.httpClient.clearCaches();
    }

    public final void close() {
        this.dispatcher.close();
    }

    public final synchronized Map<BackgroundAwareCallbackCacheKey, List<o>> getCallbacks() {
        return this.callbacks;
    }

    public final synchronized Map<List<String>, List<o>> getDiagnosticsCallbacks() {
        return this.diagnosticsCallbacks;
    }

    public final synchronized Map<List<String>, List<o>> getIdentifyCallbacks() {
        return this.identifyCallbacks;
    }

    public final void getOfferings(String appUserID, boolean z8, k onSuccess, Q6.o onError) throws Throwable {
        Throwable th;
        Delay delay;
        t.g(appUserID, "appUserID");
        t.g(onSuccess, "onSuccess");
        t.g(onError, "onError");
        final Endpoint.GetOfferings getOfferings = new Endpoint.GetOfferings(appUserID);
        final BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey = new BackgroundAwareCallbackCacheKey(C0937q.e(getOfferings.getPath()), z8);
        Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() { // from class: com.revenuecat.purchases.common.Backend$getOfferings$call$1
            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public HTTPResult call() {
                return HTTPClient.performRequest$default(this.this$0.httpClient, this.this$0.appConfig.getBaseURL(), getOfferings, null, null, this.this$0.backendHelper.getAuthenticationHeaders$purchases_defaultsRelease(), false, 32, null);
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onCompletion(HTTPResult result) throws JSONException {
                List<o> listRemove;
                t.g(result, "result");
                Backend backend = this.this$0;
                BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey2 = backgroundAwareCallbackCacheKey;
                synchronized (backend) {
                    listRemove = backend.getOfferingsCallbacks().remove(backgroundAwareCallbackCacheKey2);
                }
                if (listRemove != null) {
                    for (o oVar : listRemove) {
                        k kVar = (k) oVar.a();
                        Q6.o oVar2 = (Q6.o) oVar.b();
                        if (BackendHelperKt.isSuccessful(result)) {
                            try {
                                kVar.invoke(result.getBody());
                            } catch (JSONException e8) {
                                PurchasesError purchasesError = ErrorsKt.toPurchasesError(e8);
                                LogUtilsKt.errorLog(purchasesError);
                                oVar2.invoke(purchasesError, Boolean.FALSE);
                            }
                        } else {
                            PurchasesError purchasesError2 = ErrorsKt.toPurchasesError(result);
                            LogUtilsKt.errorLog(purchasesError2);
                            oVar2.invoke(purchasesError2, Boolean.valueOf(RCHTTPStatusCodes.INSTANCE.isServerError(result.getResponseCode())));
                        }
                    }
                }
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onError(PurchasesError error) {
                List<o> listRemove;
                t.g(error, "error");
                Backend backend = this.this$0;
                BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey2 = backgroundAwareCallbackCacheKey;
                synchronized (backend) {
                    listRemove = backend.getOfferingsCallbacks().remove(backgroundAwareCallbackCacheKey2);
                }
                if (listRemove != null) {
                    Iterator<T> it = listRemove.iterator();
                    while (it.hasNext()) {
                        ((Q6.o) ((o) it.next()).b()).invoke(error, Boolean.FALSE);
                    }
                }
            }
        };
        synchronized (this) {
            if (z8) {
                try {
                    delay = Delay.DEFAULT;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } else {
                try {
                    delay = Delay.NONE;
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            }
            try {
                addBackgroundAwareCallback(this.offeringsCallbacks, asyncCall, this.dispatcher, backgroundAwareCallbackCacheKey, v.a(onSuccess, onError), delay);
                G g8 = G.f1419a;
            } catch (Throwable th4) {
                th = th4;
                th = th;
                throw th;
            }
        }
    }

    public final synchronized Map<BackgroundAwareCallbackCacheKey, List<o>> getOfferingsCallbacks() {
        return this.offeringsCallbacks;
    }

    public final synchronized Map<List<String>, List<o>> getPaywallEventsCallbacks() {
        return this.paywallEventsCallbacks;
    }

    public final synchronized Map<List<String>, List<o>> getPostReceiptCallbacks() {
        return this.postReceiptCallbacks;
    }

    public final synchronized Map<String, List<o>> getProductEntitlementCallbacks() {
        return this.productEntitlementCallbacks;
    }

    public final void getProductEntitlementMapping(k onSuccessHandler, k onErrorHandler) throws Throwable {
        t.g(onSuccessHandler, "onSuccessHandler");
        t.g(onErrorHandler, "onErrorHandler");
        final Endpoint.GetProductEntitlementMapping getProductEntitlementMapping = Endpoint.GetProductEntitlementMapping.INSTANCE;
        final String path = getProductEntitlementMapping.getPath();
        Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() { // from class: com.revenuecat.purchases.common.Backend$getProductEntitlementMapping$call$1
            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public HTTPResult call() {
                return HTTPClient.performRequest$default(this.this$0.httpClient, this.this$0.appConfig.getBaseURL(), getProductEntitlementMapping, null, null, this.this$0.backendHelper.getAuthenticationHeaders$purchases_defaultsRelease(), false, 32, null);
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onCompletion(HTTPResult result) throws JSONException {
                List<o> listRemove;
                t.g(result, "result");
                Backend backend = this.this$0;
                String str = path;
                synchronized (backend) {
                    listRemove = backend.getProductEntitlementCallbacks().remove(str);
                }
                if (listRemove != null) {
                    for (o oVar : listRemove) {
                        k kVar = (k) oVar.a();
                        k kVar2 = (k) oVar.b();
                        if (BackendHelperKt.isSuccessful(result)) {
                            try {
                                kVar.invoke(ProductEntitlementMapping.Companion.fromJson(result.getBody()));
                            } catch (JSONException e8) {
                                PurchasesError purchasesError = ErrorsKt.toPurchasesError(e8);
                                LogUtilsKt.errorLog(purchasesError);
                                kVar2.invoke(purchasesError);
                            }
                        } else {
                            PurchasesError purchasesError2 = ErrorsKt.toPurchasesError(result);
                            LogUtilsKt.errorLog(purchasesError2);
                            kVar2.invoke(purchasesError2);
                        }
                    }
                }
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onError(PurchasesError error) {
                List<o> listRemove;
                t.g(error, "error");
                Backend backend = this.this$0;
                String str = path;
                synchronized (backend) {
                    listRemove = backend.getProductEntitlementCallbacks().remove(str);
                }
                if (listRemove != null) {
                    Iterator<T> it = listRemove.iterator();
                    while (it.hasNext()) {
                        ((k) ((o) it.next()).b()).invoke(error);
                    }
                }
            }
        };
        synchronized (this) {
            try {
                try {
                    addCallback(this.productEntitlementCallbacks, asyncCall, this.dispatcher, path, v.a(onSuccessHandler, onErrorHandler), Delay.LONG);
                    G g8 = G.f1419a;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final SignatureVerificationMode getVerificationMode() {
        return this.httpClient.getSigningManager().getSignatureVerificationMode();
    }

    public final void logIn(final String appUserID, final String newAppUserID, Q6.o onSuccessHandler, k onErrorHandler) {
        t.g(appUserID, "appUserID");
        t.g(newAppUserID, "newAppUserID");
        t.g(onSuccessHandler, "onSuccessHandler");
        t.g(onErrorHandler, "onErrorHandler");
        final List listS = r.s(appUserID, newAppUserID);
        Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() { // from class: com.revenuecat.purchases.common.Backend$logIn$call$1
            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public HTTPResult call() {
                return HTTPClient.performRequest$default(this.httpClient, this.appConfig.getBaseURL(), Endpoint.LogIn.INSTANCE, M.j(v.a(Backend.APP_USER_ID, appUserID), v.a(Backend.NEW_APP_USER_ID, newAppUserID)), r.q(v.a(Backend.APP_USER_ID, appUserID), v.a(Backend.NEW_APP_USER_ID, newAppUserID)), this.backendHelper.getAuthenticationHeaders$purchases_defaultsRelease(), false, 32, null);
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onCompletion(HTTPResult result) throws JSONException {
                List<o> listRemove;
                t.g(result, "result");
                if (!BackendHelperKt.isSuccessful(result)) {
                    PurchasesError purchasesError = ErrorsKt.toPurchasesError(result);
                    LogUtilsKt.errorLog(purchasesError);
                    onError(purchasesError);
                    return;
                }
                Backend backend = this;
                List<String> list = listS;
                synchronized (backend) {
                    listRemove = backend.getIdentifyCallbacks().remove(list);
                }
                if (listRemove != null) {
                    for (o oVar : listRemove) {
                        Q6.o oVar2 = (Q6.o) oVar.a();
                        k kVar = (k) oVar.b();
                        boolean z8 = result.getResponseCode() == 201;
                        if (result.getBody().length() > 0) {
                            oVar2.invoke(CustomerInfoFactory.INSTANCE.buildCustomerInfo(result), Boolean.valueOf(z8));
                        } else {
                            PurchasesError purchasesError2 = new PurchasesError(PurchasesErrorCode.UnknownError, null, 2, null);
                            LogUtilsKt.errorLog(purchasesError2);
                            kVar.invoke(purchasesError2);
                        }
                    }
                }
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onError(PurchasesError error) {
                List<o> listRemove;
                t.g(error, "error");
                Backend backend = this;
                List<String> list = listS;
                synchronized (backend) {
                    listRemove = backend.getIdentifyCallbacks().remove(list);
                }
                if (listRemove != null) {
                    Iterator<T> it = listRemove.iterator();
                    while (it.hasNext()) {
                        ((k) ((o) it.next()).b()).invoke(error);
                    }
                }
            }
        };
        synchronized (this) {
            try {
                try {
                    addCallback$default(this, this.identifyCallbacks, asyncCall, this.dispatcher, listS, v.a(onSuccessHandler, onErrorHandler), null, 16, null);
                    G g8 = G.f1419a;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final void postDiagnostics(List<? extends JSONObject> diagnosticsList, k onSuccessHandler, Q6.o onErrorHandler) throws Throwable {
        t.g(diagnosticsList, "diagnosticsList");
        t.g(onSuccessHandler, "onSuccessHandler");
        t.g(onErrorHandler, "onErrorHandler");
        final ArrayList arrayList = new ArrayList(C0938s.y(diagnosticsList, 10));
        Iterator<T> it = diagnosticsList.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((JSONObject) it.next()).hashCode()));
        }
        final Map mapE = L.e(v.a("entries", new JSONArray((Collection) diagnosticsList)));
        Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() { // from class: com.revenuecat.purchases.common.Backend$postDiagnostics$call$1
            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public HTTPResult call() {
                return HTTPClient.performRequest$default(this.this$0.httpClient, AppConfig.Companion.getDiagnosticsURL(), Endpoint.PostDiagnostics.INSTANCE, mapE, null, this.this$0.backendHelper.getAuthenticationHeaders$purchases_defaultsRelease(), false, 32, null);
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onCompletion(HTTPResult result) throws JSONException {
                List<o> listRemove;
                t.g(result, "result");
                Backend backend = this.this$0;
                List<String> list = arrayList;
                synchronized (backend) {
                    listRemove = backend.getDiagnosticsCallbacks().remove(list);
                }
                if (listRemove != null) {
                    for (o oVar : listRemove) {
                        k kVar = (k) oVar.a();
                        Q6.o oVar2 = (Q6.o) oVar.b();
                        if (BackendHelperKt.isSuccessful(result)) {
                            kVar.invoke(result.getBody());
                        } else {
                            PurchasesError purchasesError = ErrorsKt.toPurchasesError(result);
                            oVar2.invoke(purchasesError, Boolean.valueOf(RCHTTPStatusCodes.INSTANCE.isServerError(result.getResponseCode()) || purchasesError.getCode() == PurchasesErrorCode.NetworkError));
                        }
                    }
                }
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onError(PurchasesError error) {
                List<o> listRemove;
                t.g(error, "error");
                Backend backend = this.this$0;
                List<String> list = arrayList;
                synchronized (backend) {
                    listRemove = backend.getDiagnosticsCallbacks().remove(list);
                }
                if (listRemove != null) {
                    Iterator<T> it2 = listRemove.iterator();
                    while (it2.hasNext()) {
                        ((Q6.o) ((o) it2.next()).b()).invoke(error, Boolean.valueOf(error.getCode() == PurchasesErrorCode.NetworkError));
                    }
                }
            }
        };
        synchronized (this) {
            try {
                try {
                    addCallback(this.diagnosticsCallbacks, asyncCall, this.eventsDispatcher, arrayList, v.a(onSuccessHandler, onErrorHandler), Delay.LONG);
                    G g8 = G.f1419a;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final void postPaywallEvents(final PaywallEventRequest paywallEventRequest, Function0 onSuccessHandler, Q6.o onErrorHandler) throws Throwable {
        t.g(paywallEventRequest, "paywallEventRequest");
        t.g(onSuccessHandler, "onSuccessHandler");
        t.g(onErrorHandler, "onErrorHandler");
        PaywallEventRequest.Companion companion = PaywallEventRequest.Companion;
        r7.c json = companion.getJson();
        json.a();
        final Map<String, Object> mapAsMap = JsonElementExtensionsKt.asMap(json.d(companion.serializer(), paywallEventRequest));
        if (mapAsMap == null) {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.UnknownError, "Error encoding paywall event request");
            LogUtilsKt.errorLog(purchasesError);
            onErrorHandler.invoke(purchasesError, Boolean.TRUE);
            return;
        }
        Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() { // from class: com.revenuecat.purchases.common.Backend$postPaywallEvents$call$1
            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public HTTPResult call() {
                return HTTPClient.performRequest$default(this.this$0.httpClient, AppConfig.Companion.getPaywallEventsURL(), Endpoint.PostPaywallEvents.INSTANCE, mapAsMap, null, this.this$0.backendHelper.getAuthenticationHeaders$purchases_defaultsRelease(), false, 32, null);
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onCompletion(HTTPResult result) {
                List<o> listRemove;
                t.g(result, "result");
                Backend backend = this.this$0;
                PaywallEventRequest paywallEventRequest2 = paywallEventRequest;
                synchronized (backend) {
                    listRemove = backend.getPaywallEventsCallbacks().remove(paywallEventRequest2.getCacheKey());
                }
                if (listRemove != null) {
                    for (o oVar : listRemove) {
                        Function0 function0 = (Function0) oVar.a();
                        Q6.o oVar2 = (Q6.o) oVar.b();
                        if (BackendHelperKt.isSuccessful(result)) {
                            function0.invoke();
                        } else {
                            oVar2.invoke(ErrorsKt.toPurchasesError(result), Boolean.valueOf(RCHTTPStatusCodes.INSTANCE.isSynced(result.getResponseCode())));
                        }
                    }
                }
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onError(PurchasesError error) {
                List<o> listRemove;
                t.g(error, "error");
                Backend backend = this.this$0;
                PaywallEventRequest paywallEventRequest2 = paywallEventRequest;
                synchronized (backend) {
                    listRemove = backend.getPaywallEventsCallbacks().remove(paywallEventRequest2.getCacheKey());
                }
                if (listRemove != null) {
                    Iterator<T> it = listRemove.iterator();
                    while (it.hasNext()) {
                        ((Q6.o) ((o) it.next()).b()).invoke(error, Boolean.TRUE);
                    }
                }
            }
        };
        synchronized (this) {
            try {
                try {
                    addCallback(this.paywallEventsCallbacks, asyncCall, this.eventsDispatcher, paywallEventRequest.getCacheKey(), v.a(onSuccessHandler, onErrorHandler), Delay.LONG);
                    G g8 = G.f1419a;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final void postReceiptData(String purchaseToken, String appUserID, boolean z8, boolean z9, Map<String, ? extends Map<String, ? extends Object>> map, ReceiptInfo receiptInfo, String str, String str2, PostReceiptInitiationSource initiationSource, PaywallPostReceiptData paywallPostReceiptData, k onSuccess, p pVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Price price;
        LegacyProrationMode asLegacyProrationMode;
        PresentedOfferingContext.TargetingContext targetingContext;
        t.g(purchaseToken, "purchaseToken");
        t.g(appUserID, "appUserID");
        Map<String, ? extends Map<String, ? extends Object>> subscriberAttributes = map;
        t.g(subscriberAttributes, "subscriberAttributes");
        t.g(receiptInfo, "receiptInfo");
        t.g(initiationSource, "initiationSource");
        t.g(onSuccess, "onSuccess");
        t.g(pVar, XRlnZWSrAFn.QzTkIZOPG);
        final List listS = r.s(purchaseToken, appUserID, String.valueOf(z8), String.valueOf(z9), subscriberAttributes.toString(), receiptInfo.toString(), str);
        o oVarA = v.a(FETCH_TOKEN, purchaseToken);
        o oVarA2 = v.a("product_ids", receiptInfo.getProductIDs());
        List<PlatformProductId> platformProductIds$purchases_defaultsRelease = receiptInfo.getPlatformProductIds$purchases_defaultsRelease();
        if (platformProductIds$purchases_defaultsRelease != null) {
            arrayList = new ArrayList(C0938s.y(platformProductIds$purchases_defaultsRelease, 10));
            Iterator<T> it = platformProductIds$purchases_defaultsRelease.iterator();
            while (it.hasNext()) {
                arrayList.add(((PlatformProductId) it.next()).getAsMap());
            }
        } else {
            arrayList = null;
        }
        o oVarA3 = v.a("platform_product_ids", arrayList);
        o oVarA4 = v.a(APP_USER_ID, appUserID);
        o oVarA5 = v.a("is_restore", Boolean.valueOf(z8));
        PresentedOfferingContext presentedOfferingContext = receiptInfo.getPresentedOfferingContext();
        o oVarA6 = v.a("presented_offering_identifier", presentedOfferingContext != null ? presentedOfferingContext.getOfferingIdentifier() : null);
        PresentedOfferingContext presentedOfferingContext2 = receiptInfo.getPresentedOfferingContext();
        o oVarA7 = v.a("presented_placement_identifier", presentedOfferingContext2 != null ? presentedOfferingContext2.getPlacementIdentifier() : null);
        PresentedOfferingContext presentedOfferingContext3 = receiptInfo.getPresentedOfferingContext();
        o oVarA8 = v.a("applied_targeting_rule", (presentedOfferingContext3 == null || (targetingContext = presentedOfferingContext3.getTargetingContext()) == null) ? null : M.j(v.a("revision", Integer.valueOf(targetingContext.getRevision())), v.a("rule_id", targetingContext.getRuleId())));
        o oVarA9 = v.a("observer_mode", Boolean.valueOf(!z9));
        o oVarA10 = v.a(com.amazon.a.a.o.b.f16749x, receiptInfo.getPrice());
        o oVarA11 = v.a(com.amazon.a.a.o.b.f16726a, receiptInfo.getCurrency());
        if (subscriberAttributes.isEmpty() || this.appConfig.getCustomEntitlementComputation()) {
            subscriberAttributes = null;
        }
        o oVarA12 = v.a("attributes", subscriberAttributes);
        o oVarA13 = v.a("normal_duration", receiptInfo.getDuration());
        o oVarA14 = v.a("store_user_id", str);
        List<PricingPhase> pricingPhases = receiptInfo.getPricingPhases();
        if (pricingPhases != null) {
            arrayList2 = new ArrayList(C0938s.y(pricingPhases, 10));
            Iterator<T> it2 = pricingPhases.iterator();
            while (it2.hasNext()) {
                arrayList2.add(BackendKt.toMap((PricingPhase) it2.next()));
            }
        } else {
            arrayList2 = null;
        }
        o oVarA15 = v.a("pricing_phases", arrayList2);
        ReplacementMode replacementMode = receiptInfo.getReplacementMode();
        GoogleReplacementMode googleReplacementMode = replacementMode instanceof GoogleReplacementMode ? (GoogleReplacementMode) replacementMode : null;
        final Map mapFilterNotNullValues = MapExtensionsKt.filterNotNullValues(M.j(oVarA, oVarA2, oVarA3, oVarA4, oVarA5, oVarA6, oVarA7, oVarA8, oVarA9, oVarA10, oVarA11, oVarA12, oVarA13, oVarA14, oVarA15, v.a("proration_mode", (googleReplacementMode == null || (asLegacyProrationMode = BackendKt.getAsLegacyProrationMode(googleReplacementMode)) == null) ? null : asLegacyProrationMode.name()), v.a("initiation_source", initiationSource.getPostReceiptFieldValue()), v.a("paywall", paywallPostReceiptData != null ? paywallPostReceiptData.toMap() : null)));
        final List listQ = r.q(v.a(APP_USER_ID, appUserID), v.a(FETCH_TOKEN, purchaseToken));
        StoreProduct storeProduct = receiptInfo.getStoreProduct();
        final Map mapFilterNotNullValues2 = MapExtensionsKt.filterNotNullValues(M.j(v.a("price_string", (storeProduct == null || (price = storeProduct.getPrice()) == null) ? null : price.getFormatted()), v.a(com.amazon.a.a.o.b.f16738m, str2)));
        Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() { // from class: com.revenuecat.purchases.common.Backend$postReceiptData$call$1
            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public HTTPResult call() {
                return HTTPClient.performRequest$default(this.this$0.httpClient, this.this$0.appConfig.getBaseURL(), Endpoint.PostReceipt.INSTANCE, mapFilterNotNullValues, listQ, M.n(this.this$0.backendHelper.getAuthenticationHeaders$purchases_defaultsRelease(), mapFilterNotNullValues2), false, 32, null);
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onCompletion(HTTPResult result) {
                List<o> listRemove;
                t.g(result, "result");
                Backend backend = this.this$0;
                List<String> list = listS;
                synchronized (backend) {
                    listRemove = backend.getPostReceiptCallbacks().remove(list);
                }
                if (listRemove != null) {
                    Backend backend2 = this.this$0;
                    for (o oVar : listRemove) {
                        k kVar = (k) oVar.a();
                        p pVar2 = (p) oVar.b();
                        try {
                            if (BackendHelperKt.isSuccessful(result)) {
                                kVar.invoke(PostReceiptResponseKt.buildPostReceiptResponse(result));
                            } else {
                                PurchasesError purchasesError = ErrorsKt.toPurchasesError(result);
                                LogUtilsKt.errorLog(purchasesError);
                                pVar2.invoke(purchasesError, backend2.determinePostReceiptErrorHandlingBehavior(result.getResponseCode(), purchasesError), result.getBody());
                            }
                        } catch (JSONException e8) {
                            PurchasesError purchasesError2 = ErrorsKt.toPurchasesError(e8);
                            LogUtilsKt.errorLog(purchasesError2);
                            pVar2.invoke(purchasesError2, PostReceiptErrorHandlingBehavior.SHOULD_NOT_CONSUME, null);
                        }
                    }
                }
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onError(PurchasesError error) {
                List<o> listRemove;
                t.g(error, "error");
                Backend backend = this.this$0;
                List<String> list = listS;
                synchronized (backend) {
                    listRemove = backend.getPostReceiptCallbacks().remove(list);
                }
                if (listRemove != null) {
                    Iterator<T> it3 = listRemove.iterator();
                    while (it3.hasNext()) {
                        ((p) ((o) it3.next()).b()).invoke(error, PostReceiptErrorHandlingBehavior.SHOULD_NOT_CONSUME, null);
                    }
                }
            }
        };
        synchronized (this) {
            addCallback$default(this, this.postReceiptCallbacks, asyncCall, this.dispatcher, listS, v.a(onSuccess, pVar), null, 16, null);
            G g8 = G.f1419a;
        }
    }

    public final synchronized void setCallbacks(Map<BackgroundAwareCallbackCacheKey, List<o>> map) {
        t.g(map, "<set-?>");
        this.callbacks = map;
    }

    public final synchronized void setDiagnosticsCallbacks(Map<List<String>, List<o>> map) {
        t.g(map, "<set-?>");
        this.diagnosticsCallbacks = map;
    }

    public final synchronized void setIdentifyCallbacks(Map<List<String>, List<o>> map) {
        t.g(map, "<set-?>");
        this.identifyCallbacks = map;
    }

    public final synchronized void setOfferingsCallbacks(Map<BackgroundAwareCallbackCacheKey, List<o>> map) {
        t.g(map, "<set-?>");
        this.offeringsCallbacks = map;
    }

    public final synchronized void setPaywallEventsCallbacks(Map<List<String>, List<o>> map) {
        t.g(map, "<set-?>");
        this.paywallEventsCallbacks = map;
    }

    public final synchronized void setPostReceiptCallbacks(Map<List<String>, List<o>> map) {
        t.g(map, "<set-?>");
        this.postReceiptCallbacks = map;
    }

    public final synchronized void setProductEntitlementCallbacks(Map<String, List<o>> map) {
        t.g(map, "<set-?>");
        this.productEntitlementCallbacks = map;
    }

    public Backend(AppConfig appConfig, Dispatcher dispatcher, Dispatcher eventsDispatcher, HTTPClient httpClient, BackendHelper backendHelper) {
        t.g(appConfig, "appConfig");
        t.g(dispatcher, ZWZaxQrCHfNe.wNHpAOIRtKCUGK);
        t.g(eventsDispatcher, "eventsDispatcher");
        t.g(httpClient, "httpClient");
        t.g(backendHelper, "backendHelper");
        this.appConfig = appConfig;
        this.dispatcher = dispatcher;
        this.eventsDispatcher = eventsDispatcher;
        this.httpClient = httpClient;
        this.backendHelper = backendHelper;
        this.callbacks = new LinkedHashMap();
        this.postReceiptCallbacks = new LinkedHashMap();
        this.offeringsCallbacks = new LinkedHashMap();
        this.identifyCallbacks = new LinkedHashMap();
        this.diagnosticsCallbacks = new LinkedHashMap();
        this.paywallEventsCallbacks = new LinkedHashMap();
        this.productEntitlementCallbacks = new LinkedHashMap();
    }

    public final void getCustomerInfo(String str, boolean z8, k onSuccess, Q6.o onError) {
        Throwable th;
        BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey;
        Throwable th2;
        Delay delay;
        t.g(str, eGwOBWCdOTaKus.QyTiHlbjONO);
        t.g(onSuccess, "onSuccess");
        t.g(onError, "onError");
        final Endpoint.GetCustomerInfo getCustomerInfo = new Endpoint.GetCustomerInfo(str);
        String path = getCustomerInfo.getPath();
        synchronized (this) {
            try {
                if (this.postReceiptCallbacks.isEmpty()) {
                    try {
                        backgroundAwareCallbackCacheKey = new BackgroundAwareCallbackCacheKey(C0937q.e(path), z8);
                    } catch (Throwable th3) {
                        th = th3;
                        throw th;
                    }
                } else {
                    backgroundAwareCallbackCacheKey = new BackgroundAwareCallbackCacheKey(z.C0(C0937q.e(path), String.valueOf(this.callbacks.size())), z8);
                }
                final BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey2 = backgroundAwareCallbackCacheKey;
                Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() { // from class: com.revenuecat.purchases.common.Backend$getCustomerInfo$call$1
                    @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
                    public HTTPResult call() {
                        return HTTPClient.performRequest$default(this.this$0.httpClient, this.this$0.appConfig.getBaseURL(), getCustomerInfo, null, null, this.this$0.backendHelper.getAuthenticationHeaders$purchases_defaultsRelease(), false, 32, null);
                    }

                    @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
                    public void onCompletion(HTTPResult result) {
                        List<o> listRemove;
                        t.g(result, "result");
                        Backend backend = this.this$0;
                        BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey3 = backgroundAwareCallbackCacheKey2;
                        synchronized (backend) {
                            listRemove = backend.getCallbacks().remove(backgroundAwareCallbackCacheKey3);
                        }
                        if (listRemove != null) {
                            for (o oVar : listRemove) {
                                k kVar = (k) oVar.a();
                                Q6.o oVar2 = (Q6.o) oVar.b();
                                try {
                                    if (BackendHelperKt.isSuccessful(result)) {
                                        kVar.invoke(CustomerInfoFactory.INSTANCE.buildCustomerInfo(result));
                                    } else {
                                        PurchasesError purchasesError = ErrorsKt.toPurchasesError(result);
                                        LogUtilsKt.errorLog(purchasesError);
                                        oVar2.invoke(purchasesError, Boolean.valueOf(RCHTTPStatusCodes.INSTANCE.isServerError(result.getResponseCode())));
                                    }
                                } catch (JSONException e8) {
                                    PurchasesError purchasesError2 = ErrorsKt.toPurchasesError(e8);
                                    LogUtilsKt.errorLog(purchasesError2);
                                    oVar2.invoke(purchasesError2, Boolean.FALSE);
                                }
                            }
                        }
                    }

                    @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
                    public void onError(PurchasesError error) {
                        List<o> listRemove;
                        t.g(error, "error");
                        Backend backend = this.this$0;
                        BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey3 = backgroundAwareCallbackCacheKey2;
                        synchronized (backend) {
                            listRemove = backend.getCallbacks().remove(backgroundAwareCallbackCacheKey3);
                        }
                        if (listRemove != null) {
                            Iterator<T> it = listRemove.iterator();
                            while (it.hasNext()) {
                                ((Q6.o) ((o) it.next()).b()).invoke(error, Boolean.FALSE);
                            }
                        }
                    }
                };
                synchronized (this) {
                    if (z8) {
                        try {
                            delay = Delay.DEFAULT;
                        } catch (Throwable th4) {
                            th2 = th4;
                            throw th2;
                        }
                    } else {
                        try {
                            delay = Delay.NONE;
                        } catch (Throwable th5) {
                            th = th5;
                            th2 = th;
                            throw th2;
                        }
                    }
                    try {
                        addBackgroundAwareCallback(this.callbacks, asyncCall, this.dispatcher, backgroundAwareCallbackCacheKey2, v.a(onSuccess, onError), delay);
                        G g8 = G.f1419a;
                    } catch (Throwable th6) {
                        th = th6;
                        th2 = th;
                        throw th2;
                    }
                }
            } catch (Throwable th7) {
                th = th7;
            }
        }
    }

    private final <K, S, E> void addCallback(Map<K, List<o>> map, Dispatcher.AsyncCall asyncCall, Dispatcher dispatcher, K k8, o oVar, Delay delay) {
        if (!map.containsKey(k8)) {
            map.put(k8, r.t(oVar));
            this.backendHelper.enqueue(asyncCall, dispatcher, delay);
            return;
        }
        O o8 = O.f28784a;
        String str = String.format(NetworkStrings.SAME_CALL_ALREADY_IN_PROGRESS, Arrays.copyOf(new Object[]{k8}, 1));
        t.f(str, dCqzKmEghGTQ.iTgjYHsNAAjon);
        LogUtilsKt.debugLog(str);
        List<o> list = map.get(k8);
        t.d(list);
        list.add(oVar);
    }
}
