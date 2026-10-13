package com.revenuecat.purchases.models;

import Q6.k;
import Z6.y;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class PeriodKt$toPeriod$1$toInt$1 extends u implements k {
    public static final PeriodKt$toPeriod$1$toInt$1 INSTANCE = new PeriodKt$toPeriod$1$toInt$1();

    public PeriodKt$toPeriod$1$toInt$1() {
        super(1);
    }

    @Override // Q6.k
    public final Integer invoke(String part) {
        t.g(part, "part");
        Integer numM = Z6.u.m(y.Z0(part, 1));
        return Integer.valueOf(numM != null ? numM.intValue() : 0);
    }
}
