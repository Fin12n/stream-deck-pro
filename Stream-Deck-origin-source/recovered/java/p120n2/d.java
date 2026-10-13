package p120n2;

import android.view.ViewGroup;
import kotlin.jvm.internal.t;
import p111m2.ComponentCallbacksC2681f;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class d extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f30535b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ComponentCallbacksC2681f fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup);
        t.g(fragment, "fragment");
        this.f30535b = viewGroup;
    }
}
