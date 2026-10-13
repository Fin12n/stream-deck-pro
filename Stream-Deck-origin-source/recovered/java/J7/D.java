package J7;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class D {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f4356d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final D f4357e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f4358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f4359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f4360c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {
        public /* synthetic */ b(AbstractC2633k abstractC2633k) {
            this();
        }

        public b() {
        }
    }

    public D a() {
        this.f4358a = false;
        return this;
    }

    public D b() {
        this.f4360c = 0L;
        return this;
    }

    public long c() {
        if (this.f4358a) {
            return this.f4359b;
        }
        throw new IllegalStateException("No deadline");
    }

    public D d(long j8) {
        this.f4358a = true;
        this.f4359b = j8;
        return this;
    }

    public boolean e() {
        return this.f4358a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f4358a && this.f4359b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public D g(long j8, TimeUnit unit) {
        kotlin.jvm.internal.t.g(unit, "unit");
        if (j8 >= 0) {
            this.f4360c = unit.toNanos(j8);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j8).toString());
    }

    public long h() {
        return this.f4360c;
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends D {
        @Override // J7.D
        public D g(long j8, TimeUnit unit) {
            kotlin.jvm.internal.t.g(unit, "unit");
            return this;
        }

        @Override // J7.D
        public void f() {
        }

        @Override // J7.D
        public D d(long j8) {
            return this;
        }
    }
}
