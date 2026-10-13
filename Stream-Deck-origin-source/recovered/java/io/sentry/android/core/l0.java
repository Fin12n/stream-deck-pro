package io.sentry.android.core;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f26489a;

    public l0() {
        this(Looper.getMainLooper());
    }

    public Thread a() {
        return this.f26489a.getLooper().getThread();
    }

    public void b(Runnable runnable) {
        this.f26489a.post(runnable);
    }

    public l0(Looper looper) {
        this.f26489a = new Handler(looper);
    }
}
