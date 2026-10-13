package com.revenuecat.purchases;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class PurchasesTransactionException extends PurchasesException {
    private final boolean userCancelled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesTransactionException(PurchasesError purchasesError, boolean z8) {
        super(purchasesError);
        t.g(purchasesError, "purchasesError");
        this.userCancelled = z8;
    }

    public final boolean getUserCancelled() {
        return this.userCancelled;
    }
}
