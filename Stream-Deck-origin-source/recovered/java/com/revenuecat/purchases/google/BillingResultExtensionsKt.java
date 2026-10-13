package com.revenuecat.purchases.google;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class BillingResultExtensionsKt {
    public static final boolean isSuccessful(com.android.billingclient.api.d dVar) {
        t.g(dVar, "<this>");
        return dVar.b() == 0;
    }

    public static final String toHumanReadableDescription(com.android.billingclient.api.d dVar) {
        t.g(dVar, "<this>");
        return "DebugMessage: " + dVar.a() + ". ErrorCode: " + ErrorsKt.getBillingResponseCodeName(dVar.b()) + com.amazon.a.a.o.c.a.b.f16789a;
    }
}
