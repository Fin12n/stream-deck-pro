package p120n2;

import kotlin.jvm.internal.t;
import p043e6.dT.GIGvBf;
import p111m2.ComponentCallbacksC2681f;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f30517b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ComponentCallbacksC2681f fragment, String previousFragmentId) {
        super(fragment, "Attempting to reuse fragment " + fragment + GIGvBf.mnn + previousFragmentId);
        t.g(fragment, "fragment");
        t.g(previousFragmentId, "previousFragmentId");
        this.f30517b = previousFragmentId;
    }
}
