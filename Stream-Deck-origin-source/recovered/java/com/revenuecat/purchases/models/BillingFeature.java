package com.revenuecat.purchases.models;

import com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public enum BillingFeature {
    SUBSCRIPTIONS(CustomerInfoResponseJsonKeys.SUBSCRIPTIONS),
    SUBSCRIPTIONS_UPDATE("subscriptionsUpdate"),
    PRICE_CHANGE_CONFIRMATION("priceChangeConfirmation");

    private final String playBillingClientName;

    BillingFeature(String str) {
        this.playBillingClientName = str;
    }

    public final String getPlayBillingClientName() {
        return this.playBillingClientName;
    }
}
