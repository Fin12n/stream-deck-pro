package p120n2;

import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p111m2.ComponentCallbacksC2681f;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class f extends g {
    public /* synthetic */ f(ComponentCallbacksC2681f componentCallbacksC2681f, String str, int i8, AbstractC2633k abstractC2633k) {
        this(componentCallbacksC2681f, (i8 & 2) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ComponentCallbacksC2681f fragment, String str) {
        super(fragment, str);
        t.g(fragment, "fragment");
    }
}
