package io.sentry;

import java.util.concurrent.Future;

/* JADX INFO: renamed from: io.sentry.a0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC2447a0 {
    void a(long j8);

    Future b(Runnable runnable, long j8);

    boolean isClosed();

    Future submit(Runnable runnable);
}
