package io.sentry.android.core.performance;

import android.view.Window;
import io.sentry.android.core.internal.gestures.j;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class h extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f26533b;

    public h(Window.Callback callback, Runnable runnable) {
        super(callback);
        this.f26533b = runnable;
    }

    @Override // io.sentry.android.core.internal.gestures.j, android.view.Window.Callback
    public void onContentChanged() {
        super.onContentChanged();
        this.f26533b.run();
    }
}
