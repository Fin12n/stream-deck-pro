package p120n2;

import android.view.ViewGroup;
import kotlin.jvm.internal.t;
import p111m2.ComponentCallbacksC2681f;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class h extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f30537b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ComponentCallbacksC2681f fragment, ViewGroup container) {
        super(fragment, "Attempting to add fragment " + fragment + " to container " + container + " which is not a FragmentContainerView");
        t.g(fragment, "fragment");
        t.g(container, "container");
        this.f30537b = container;
    }
}
