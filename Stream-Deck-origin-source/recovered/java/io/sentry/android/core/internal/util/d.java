package io.sentry.android.core.internal.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import io.sentry.protocol.A;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements io.sentry.util.thread.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f26416a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile long f26417b = Process.myTid();

    public d() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.internal.util.c
            @Override // java.lang.Runnable
            public final void run() {
                d.f26417b = Process.myTid();
            }
        });
    }

    public static d d() {
        return f26416a;
    }

    @Override // io.sentry.util.thread.a
    public long a() {
        return Process.myTid();
    }

    @Override // io.sentry.util.thread.a
    public boolean b() {
        return g(Thread.currentThread());
    }

    public boolean e(long j8) {
        return Looper.getMainLooper().getThread().getId() == j8;
    }

    public boolean f(A a8) {
        Long l8 = a8.l();
        return l8 != null && e(l8.longValue());
    }

    public boolean g(Thread thread) {
        return e(thread.getId());
    }
}
