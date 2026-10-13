package com.revenuecat.purchases.paywalls.events;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public enum PaywallEventType {
    IMPRESSION("paywall_impression"),
    CANCEL("paywall_cancel"),
    CLOSE("paywall_close");

    private final String value;

    PaywallEventType(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
