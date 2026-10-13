package com.revenuecat.purchases.amazon;

import C6.G;
import C6.o;
import C6.v;
import D6.r;
import Q6.k;
import com.revenuecat.purchases.common.BackendHelper;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class AmazonBackend {
    private final BackendHelper backendHelper;
    private volatile Map<List<String>, List<o>> postAmazonReceiptCallbacks;

    public AmazonBackend(BackendHelper backendHelper) {
        t.g(backendHelper, "backendHelper");
        this.backendHelper = backendHelper;
        this.postAmazonReceiptCallbacks = new LinkedHashMap();
    }

    public final void getAmazonReceiptData(String receiptId, String storeUserID, k onSuccess, k onError) {
        t.g(receiptId, "receiptId");
        t.g(storeUserID, "storeUserID");
        t.g(onSuccess, "onSuccess");
        t.g(onError, "onError");
        List<String> listS = r.s(receiptId, storeUserID);
        AmazonBackend$getAmazonReceiptData$call$1 amazonBackend$getAmazonReceiptData$call$1 = new AmazonBackend$getAmazonReceiptData$call$1(this, storeUserID, receiptId, listS);
        o oVarA = v.a(onSuccess, onError);
        synchronized (this) {
            try {
                if (this.postAmazonReceiptCallbacks.containsKey(listS)) {
                    List<o> list = this.postAmazonReceiptCallbacks.get(listS);
                    t.d(list);
                    list.add(oVarA);
                } else {
                    this.postAmazonReceiptCallbacks.put(listS, r.t(oVarA));
                    amazonBackend$getAmazonReceiptData$call$1.invoke();
                    G g8 = G.f1419a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized Map<List<String>, List<o>> getPostAmazonReceiptCallbacks() {
        return this.postAmazonReceiptCallbacks;
    }

    public final synchronized void setPostAmazonReceiptCallbacks(Map<List<String>, List<o>> map) {
        t.g(map, "<set-?>");
        this.postAmazonReceiptCallbacks = map;
    }
}
