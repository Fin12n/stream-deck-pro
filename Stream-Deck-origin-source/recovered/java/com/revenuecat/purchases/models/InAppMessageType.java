package com.revenuecat.purchases.models;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public enum InAppMessageType {
    BILLING_ISSUES(2);

    private final int inAppMessageCategoryId;

    InAppMessageType(int i8) {
        this.inAppMessageCategoryId = i8;
    }

    public final int getInAppMessageCategoryId$purchases_defaultsRelease() {
        return this.inAppMessageCategoryId;
    }
}
