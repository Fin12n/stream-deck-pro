package com.revenuecat.purchases;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class Offering$sixMonth$2 extends u implements Function0 {
    final /* synthetic */ Offering this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Offering$sixMonth$2(Offering offering) {
        super(0);
        this.this$0 = offering;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Package invoke() {
        return this.this$0.findPackage(PackageType.SIX_MONTH);
    }
}
