package com.revenuecat.purchases.subscriberattributes;

import C6.G;
import D6.r;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.strings.AttributionStrings;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$1$1 extends u implements Function0 {
    final /* synthetic */ Function0 $completion;
    final /* synthetic */ String $currentAppUserID;
    final /* synthetic */ H $currentSyncedAttributeCount;
    final /* synthetic */ String $syncingAppUserID;
    final /* synthetic */ Map<String, SubscriberAttribute> $unsyncedAttributesForUser;
    final /* synthetic */ int $unsyncedStoredAttributesCount;
    final /* synthetic */ SubscriberAttributesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$1$1(SubscriberAttributesManager subscriberAttributesManager, String str, Map<String, SubscriberAttribute> map, String str2, H h8, Function0 function0, int i8) {
        super(0);
        this.this$0 = subscriberAttributesManager;
        this.$syncingAppUserID = str;
        this.$unsyncedAttributesForUser = map;
        this.$currentAppUserID = str2;
        this.$currentSyncedAttributeCount = h8;
        this.$completion = function0;
        this.$unsyncedStoredAttributesCount = i8;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m183invoke();
        return G.f1419a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m183invoke() {
        this.this$0.markAsSynced(this.$syncingAppUserID, this.$unsyncedAttributesForUser, r.n());
        LogIntent logIntent = LogIntent.RC_SUCCESS;
        String str = String.format(AttributionStrings.ATTRIBUTES_SYNC_SUCCESS, Arrays.copyOf(new Object[]{this.$syncingAppUserID}, 1));
        t.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        if (!t.c(this.$currentAppUserID, this.$syncingAppUserID)) {
            this.this$0.getDeviceCache().clearSubscriberAttributesIfSyncedForSubscriber(this.$syncingAppUserID);
        }
        H h8 = this.$currentSyncedAttributeCount;
        int i8 = h8.f28777a + 1;
        h8.f28777a = i8;
        Function0 function0 = this.$completion;
        if (function0 == null || i8 != this.$unsyncedStoredAttributesCount) {
            return;
        }
        function0.invoke();
    }
}
