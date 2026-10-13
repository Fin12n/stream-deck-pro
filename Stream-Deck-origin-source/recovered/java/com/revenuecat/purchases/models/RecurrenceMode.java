package com.revenuecat.purchases.models;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public enum RecurrenceMode {
    INFINITE_RECURRING(1),
    FINITE_RECURRING(2),
    NON_RECURRING(3),
    UNKNOWN(null);

    private final Integer identifier;

    RecurrenceMode(Integer num) {
        this.identifier = num;
    }

    public final Integer getIdentifier() {
        return this.identifier;
    }
}
