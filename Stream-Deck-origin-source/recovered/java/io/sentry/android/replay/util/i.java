package io.sentry.android.replay.util;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f26894a;

    /* JADX WARN: Multi-variable type inference failed */
    public i() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Handler a() {
        return this.f26894a;
    }

    public final void b(Runnable runnable) {
        t.g(runnable, "runnable");
        this.f26894a.post(runnable);
    }

    public i(Looper looper) {
        t.g(looper, "looper");
        this.f26894a = new Handler(looper);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ i(Looper looper, int i8, AbstractC2633k abstractC2633k) {
        if ((i8 & 1) != 0) {
            looper = Looper.getMainLooper();
            t.f(looper, "getMainLooper()");
        }
        this(looper);
    }
}
