package io.sentry.util;

import io.sentry.InterfaceC2480b0;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: io.sentry.util.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2569a extends ReentrantLock {

    /* JADX INFO: renamed from: io.sentry.util.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0605a implements InterfaceC2480b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ReentrantLock f27724a;

        public C0605a(ReentrantLock reentrantLock) {
            this.f27724a = reentrantLock;
        }

        @Override // io.sentry.InterfaceC2480b0, java.lang.AutoCloseable
        public void close() {
            this.f27724a.unlock();
        }
    }

    public InterfaceC2480b0 a() {
        lock();
        return new C0605a(this);
    }
}
