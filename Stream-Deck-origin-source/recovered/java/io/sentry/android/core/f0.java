package io.sentry.android.core;

import android.os.FileObserver;
import io.sentry.EnumC2596z2;
import io.sentry.ILogger;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class f0 extends FileObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io.sentry.O f26328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ILogger f26329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f26330d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements io.sentry.hints.e, io.sentry.hints.k, io.sentry.hints.p, io.sentry.hints.i, io.sentry.hints.b, io.sentry.hints.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f26331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f26332b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CountDownLatch f26333c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f26334d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ILogger f26335e;

        public a(long j8, ILogger iLogger) {
            reset();
            this.f26334d = j8;
            this.f26335e = (ILogger) io.sentry.util.u.c(iLogger, "ILogger is required.");
        }

        @Override // io.sentry.hints.k
        public boolean a() {
            return this.f26331a;
        }

        @Override // io.sentry.hints.p
        public void b(boolean z8) {
            this.f26332b = z8;
            this.f26333c.countDown();
        }

        @Override // io.sentry.hints.k
        public void c(boolean z8) {
            this.f26331a = z8;
        }

        @Override // io.sentry.hints.i
        public boolean e() {
            try {
                return this.f26333c.await(this.f26334d, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e8) {
                Thread.currentThread().interrupt();
                this.f26335e.b(EnumC2596z2.ERROR, "Exception while awaiting on lock.", e8);
                return false;
            }
        }

        @Override // io.sentry.hints.p
        public boolean f() {
            return this.f26332b;
        }

        @Override // io.sentry.hints.j
        public void reset() {
            this.f26333c = new CountDownLatch(1);
            this.f26331a = false;
            this.f26332b = false;
        }
    }

    public f0(String str, io.sentry.O o8, ILogger iLogger, long j8) {
        super(str);
        this.f26327a = str;
        this.f26328b = (io.sentry.O) io.sentry.util.u.c(o8, "Envelope sender is required.");
        this.f26329c = (ILogger) io.sentry.util.u.c(iLogger, "Logger is required.");
        this.f26330d = j8;
    }

    @Override // android.os.FileObserver
    public void onEvent(int i8, String str) {
        if (str == null || i8 != 8) {
            return;
        }
        this.f26329c.c(EnumC2596z2.DEBUG, "onEvent fired for EnvelopeFileObserver with event type %d on path: %s for file %s.", Integer.valueOf(i8), this.f26327a, str);
        io.sentry.H hE = io.sentry.util.m.e(new a(this.f26330d, this.f26329c));
        this.f26328b.a(this.f26327a + File.separator + str, hE);
    }
}
