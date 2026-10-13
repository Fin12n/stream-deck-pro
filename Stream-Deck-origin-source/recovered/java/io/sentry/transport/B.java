package io.sentry.transport;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f27655a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends AbstractQueuedSynchronizer {
        public a(int i8) {
            setState(i8);
        }

        public final void d() {
            releaseShared(1);
        }

        public final int e() {
            return getState();
        }

        public final void f() {
            int state;
            do {
                state = getState();
            } while (!compareAndSetState(state, state + 1));
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        public int tryAcquireShared(int i8) {
            return getState() == 0 ? 1 : -1;
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        public boolean tryReleaseShared(int i8) {
            int state;
            int i9;
            do {
                state = getState();
                if (state == 0) {
                    return false;
                }
                i9 = state - 1;
            } while (!compareAndSetState(state, i9));
            return i9 == 0;
        }
    }

    public B(int i8) {
        if (i8 >= 0) {
            this.f27655a = new a(i8);
            return;
        }
        throw new IllegalArgumentException("negative initial count '" + i8 + "' is not allowed");
    }

    public void a() {
        this.f27655a.d();
    }

    public int b() {
        return this.f27655a.e();
    }

    public void c() {
        this.f27655a.f();
    }

    public boolean d(long j8, TimeUnit timeUnit) {
        return this.f27655a.tryAcquireSharedNanos(1, timeUnit.toNanos(j8));
    }

    public B() {
        this(0);
    }
}
