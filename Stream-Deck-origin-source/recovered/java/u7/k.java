package u7;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z7.g f34761a;

    public k(z7.g delegate) {
        kotlin.jvm.internal.t.g(delegate, "delegate");
        this.f34761a = delegate;
    }

    public final void a() {
        this.f34761a.d();
    }

    public final z7.g b() {
        return this.f34761a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(int i8, long j8, TimeUnit timeUnit) {
        this(new z7.g(y7.e.f38468i, i8, j8, timeUnit));
        kotlin.jvm.internal.t.g(timeUnit, "timeUnit");
    }

    public k() {
        this(5, 5L, TimeUnit.MINUTES);
    }
}
