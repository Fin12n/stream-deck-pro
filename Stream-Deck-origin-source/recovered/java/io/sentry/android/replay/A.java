package io.sentry.android.replay;

import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class A {
    public static final Window a(View view) {
        kotlin.jvm.internal.t.g(view, "<this>");
        z zVar = z.f26969a;
        View rootView = view.getRootView();
        kotlin.jvm.internal.t.f(rootView, "rootView");
        return zVar.d(rootView);
    }
}
