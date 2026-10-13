package io.sentry.android.core;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
final class ApplicationNotResponding extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Thread f26133a;

    public ApplicationNotResponding(String str, Thread thread) {
        super(str);
        Thread thread2 = (Thread) io.sentry.util.u.c(thread, "Thread must be provided.");
        this.f26133a = thread2;
        setStackTrace(thread2.getStackTrace());
    }

    public Thread a() {
        return this.f26133a;
    }
}
