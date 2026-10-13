package com.revenuecat.purchases.subscriberattributes;

import C6.G;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class SubscriberAttributesManager$ObtainDeviceIdentifiersObservable$waitUntilIdle$1 extends u implements Function0 {
    final /* synthetic */ Function0 $completion;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriberAttributesManager$ObtainDeviceIdentifiersObservable$waitUntilIdle$1(Function0 function0) {
        super(0);
        this.$completion = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m180invoke();
        return G.f1419a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m180invoke() {
        this.$completion.invoke();
    }
}
