package com.revenuecat.purchases.subscriberattributes;

import C6.G;
import C6.v;
import D6.L;
import D6.r;
import Q6.k;
import Q6.p;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.BackendHelper;
import com.revenuecat.purchases.common.Delay;
import com.revenuecat.purchases.common.SubscriberAttributeError;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class SubscriberAttributesPoster {
    private final BackendHelper backendHelper;

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesPoster$postSubscriberAttributes$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class AnonymousClass1 extends u implements k {
        final /* synthetic */ p $onErrorHandler;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(p pVar) {
            super(1);
            this.$onErrorHandler = pVar;
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return G.f1419a;
        }

        public final void invoke(PurchasesError error) {
            t.g(error, "error");
            this.$onErrorHandler.invoke(error, Boolean.FALSE, r.n());
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesPoster$postSubscriberAttributes$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class AnonymousClass2 extends u implements p {
        final /* synthetic */ p $onErrorHandler;
        final /* synthetic */ Function0 $onSuccessHandler;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0 function0, p pVar) {
            super(3);
            this.$onSuccessHandler = function0;
            this.$onErrorHandler = pVar;
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) throws JSONException {
            invoke((PurchasesError) obj, ((Number) obj2).intValue(), (JSONObject) obj3);
            return G.f1419a;
        }

        public final void invoke(PurchasesError purchasesError, int i8, JSONObject body) throws JSONException {
            G g8;
            t.g(body, "body");
            if (purchasesError != null) {
                p pVar = this.$onErrorHandler;
                boolean zIsServerError = RCHTTPStatusCodes.INSTANCE.isServerError(i8);
                boolean z8 = false;
                boolean z9 = i8 == 404;
                if (!zIsServerError && !z9) {
                    z8 = true;
                }
                List<SubscriberAttributeError> listN = r.n();
                if (purchasesError.getCode() == PurchasesErrorCode.InvalidSubscriberAttributesError) {
                    listN = BackendHelpersKt.getAttributeErrors(body);
                }
                pVar.invoke(purchasesError, Boolean.valueOf(z8), listN);
                g8 = G.f1419a;
            } else {
                g8 = null;
            }
            if (g8 == null) {
                this.$onSuccessHandler.invoke();
            }
        }
    }

    public SubscriberAttributesPoster(BackendHelper backendHelper) {
        t.g(backendHelper, "backendHelper");
        this.backendHelper = backendHelper;
    }

    public final void postSubscriberAttributes(Map<String, ? extends Map<String, ? extends Object>> attributes, String appUserID, Function0 onSuccessHandler, p onErrorHandler) {
        t.g(attributes, "attributes");
        t.g(appUserID, "appUserID");
        t.g(onSuccessHandler, "onSuccessHandler");
        t.g(onErrorHandler, "onErrorHandler");
        this.backendHelper.performRequest(new Endpoint.PostAttributes(appUserID), L.e(v.a("attributes", attributes)), null, Delay.DEFAULT, new AnonymousClass1(onErrorHandler), new AnonymousClass2(onSuccessHandler, onErrorHandler));
    }
}
