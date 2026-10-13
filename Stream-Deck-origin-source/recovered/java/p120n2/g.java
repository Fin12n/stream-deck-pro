package p120n2;

import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p111m2.ComponentCallbacksC2681f;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class g extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComponentCallbacksC2681f f30536a;

    public /* synthetic */ g(ComponentCallbacksC2681f componentCallbacksC2681f, String str, int i8, AbstractC2633k abstractC2633k) {
        this(componentCallbacksC2681f, (i8 & 2) != 0 ? null : str);
    }

    public final ComponentCallbacksC2681f a() {
        return this.f30536a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ComponentCallbacksC2681f fragment, String str) {
        super(str);
        t.g(fragment, "fragment");
        this.f30536a = fragment;
    }
}
