package io.sentry;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class O0 implements InterfaceC2447a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final O0 f25961a = new O0();

    public static /* synthetic */ Object c() {
        return null;
    }

    public static /* synthetic */ Object d() {
        return null;
    }

    public static InterfaceC2447a0 e() {
        return f25961a;
    }

    @Override // io.sentry.InterfaceC2447a0
    public Future b(Runnable runnable, long j8) {
        return new FutureTask(new Callable() { // from class: io.sentry.M0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return O0.d();
            }
        });
    }

    @Override // io.sentry.InterfaceC2447a0
    public boolean isClosed() {
        return false;
    }

    @Override // io.sentry.InterfaceC2447a0
    public Future submit(Runnable runnable) {
        return new FutureTask(new Callable() { // from class: io.sentry.N0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return O0.c();
            }
        });
    }

    @Override // io.sentry.InterfaceC2447a0
    public void a(long j8) {
    }
}
