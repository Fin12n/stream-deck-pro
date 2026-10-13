package io.sentry.transport;

import io.sentry.AbstractC2519l;
import io.sentry.EnumC2596z2;
import io.sentry.ILogger;
import io.sentry.U1;
import io.sentry.V1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class w extends ThreadPoolExecutor {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f27695f = AbstractC2519l.h(2000);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public U1 f27697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ILogger f27698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final V1 f27699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final B f27700e;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements Future {
        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z8) {
            return true;
        }

        @Override // java.util.concurrent.Future
        public Object get() {
            throw new CancellationException();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return true;
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return true;
        }

        @Override // java.util.concurrent.Future
        public Object get(long j8, TimeUnit timeUnit) {
            throw new CancellationException();
        }
    }

    public w(int i8, int i9, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler, ILogger iLogger, V1 v8) {
        super(i8, i8, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler);
        this.f27697b = null;
        this.f27700e = new B();
        this.f27696a = i9;
        this.f27698c = iLogger;
        this.f27699d = v8;
    }

    public boolean a() {
        U1 u8 = this.f27697b;
        return u8 != null && this.f27699d.a().b(u8) < f27695f;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th) {
        try {
            super.afterExecute(runnable, th);
        } finally {
            this.f27700e.a();
        }
    }

    public boolean b() {
        return this.f27700e.b() < this.f27696a;
    }

    public void d(long j8) {
        try {
            this.f27700e.d(j8, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e8) {
            this.f27698c.b(EnumC2596z2.ERROR, "Failed to wait till idle", e8);
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        if (b()) {
            this.f27700e.c();
            return super.submit(runnable);
        }
        this.f27697b = this.f27699d.a();
        this.f27698c.c(EnumC2596z2.WARNING, "Submit cancelled", new Object[0]);
        return new a();
    }
}
