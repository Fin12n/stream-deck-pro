package io.sentry;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Queue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.sentry.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2558t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X f27635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ILogger f27636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f27637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Queue f27638d;

    /* JADX INFO: renamed from: io.sentry.t$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements io.sentry.hints.e, io.sentry.hints.k, io.sentry.hints.p, io.sentry.hints.i, io.sentry.hints.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f27639a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f27640b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CountDownLatch f27641c = new CountDownLatch(1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f27642d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ILogger f27643e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f27644f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Queue f27645g;

        public a(long j8, ILogger iLogger, String str, Queue<String> queue) {
            this.f27642d = j8;
            this.f27644f = str;
            this.f27645g = queue;
            this.f27643e = iLogger;
        }

        @Override // io.sentry.hints.k
        public boolean a() {
            return this.f27639a;
        }

        @Override // io.sentry.hints.p
        public void b(boolean z8) {
            this.f27640b = z8;
            this.f27641c.countDown();
        }

        @Override // io.sentry.hints.k
        public void c(boolean z8) {
            this.f27639a = z8;
        }

        @Override // io.sentry.hints.g
        public void d() {
            this.f27645g.add(this.f27644f);
        }

        @Override // io.sentry.hints.i
        public boolean e() {
            try {
                return this.f27641c.await(this.f27642d, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e8) {
                Thread.currentThread().interrupt();
                this.f27643e.b(EnumC2596z2.ERROR, "Exception while awaiting on lock.", e8);
                return false;
            }
        }

        @Override // io.sentry.hints.p
        public boolean f() {
            return this.f27640b;
        }
    }

    public AbstractC2558t(X x8, ILogger iLogger, long j8, int i8) {
        this.f27635a = x8;
        this.f27636b = iLogger;
        this.f27637c = j8;
        this.f27638d = n3.t(new C2495f(i8));
    }

    public abstract boolean c(String str);

    public void d(File file) {
        try {
            ILogger iLogger = this.f27636b;
            EnumC2596z2 enumC2596z2 = EnumC2596z2.DEBUG;
            iLogger.c(enumC2596z2, "Processing dir. %s", file.getAbsolutePath());
            if (!file.exists()) {
                this.f27636b.c(EnumC2596z2.WARNING, "Directory '%s' doesn't exist. No cached events to send.", file.getAbsolutePath());
                return;
            }
            if (!file.isDirectory()) {
                this.f27636b.c(EnumC2596z2.ERROR, "Cache dir %s is not a directory.", file.getAbsolutePath());
                return;
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                this.f27636b.c(EnumC2596z2.ERROR, "Cache dir %s is null.", file.getAbsolutePath());
                return;
            }
            File[] fileArrListFiles2 = file.listFiles(new FilenameFilter() { // from class: io.sentry.s
                @Override // java.io.FilenameFilter
                public final boolean accept(File file2, String str) {
                    return this.f27618a.c(str);
                }
            });
            this.f27636b.c(enumC2596z2, "Processing %d items from cache dir %s", Integer.valueOf(fileArrListFiles2 != null ? fileArrListFiles2.length : 0), file.getAbsolutePath());
            for (File file2 : fileArrListFiles) {
                if (file2.isFile()) {
                    String absolutePath = file2.getAbsolutePath();
                    if (this.f27638d.contains(absolutePath)) {
                        this.f27636b.c(EnumC2596z2.DEBUG, "File '%s' has already been processed so it will not be processed again.", absolutePath);
                    } else {
                        io.sentry.transport.A aM = this.f27635a.m();
                        if (aM != null && aM.A(EnumC2515k.All)) {
                            this.f27636b.c(EnumC2596z2.INFO, "DirectoryProcessor, rate limiting active.", new Object[0]);
                            return;
                        } else {
                            this.f27636b.c(EnumC2596z2.DEBUG, "Processing file: %s", absolutePath);
                            e(file2, io.sentry.util.m.e(new a(this.f27637c, this.f27636b, absolutePath, this.f27638d)));
                            Thread.sleep(100L);
                        }
                    }
                } else {
                    this.f27636b.c(EnumC2596z2.DEBUG, "File %s is not a File.", file2.getAbsolutePath());
                }
            }
        } catch (Throwable th) {
            this.f27636b.a(EnumC2596z2.ERROR, th, "Failed processing '%s'", file.getAbsolutePath());
        }
    }

    public abstract void e(File file, H h8);
}
