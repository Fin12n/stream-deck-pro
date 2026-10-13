package io.sentry.android.core.internal.util;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements io.sentry.transport.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final io.sentry.transport.p f26415a = new b();

    public static io.sentry.transport.p a() {
        return f26415a;
    }

    @Override // io.sentry.transport.p
    public long getCurrentTimeMillis() {
        return SystemClock.uptimeMillis();
    }
}
