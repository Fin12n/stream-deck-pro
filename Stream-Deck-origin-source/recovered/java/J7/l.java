package J7;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import p116m7.kKPq.toqHM;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class l extends D {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public D f4398f;

    @Override // J7.D
    public D a() {
        return this.f4398f.a();
    }

    @Override // J7.D
    public D b() {
        return this.f4398f.b();
    }

    @Override // J7.D
    public long c() {
        return this.f4398f.c();
    }

    @Override // J7.D
    public D d(long j8) {
        return this.f4398f.d(j8);
    }

    @Override // J7.D
    public boolean e() {
        return this.f4398f.e();
    }

    @Override // J7.D
    public void f() throws InterruptedIOException {
        this.f4398f.f();
    }

    @Override // J7.D
    public D g(long j8, TimeUnit unit) {
        kotlin.jvm.internal.t.g(unit, "unit");
        return this.f4398f.g(j8, unit);
    }

    @Override // J7.D
    public long h() {
        return this.f4398f.h();
    }

    public final D i() {
        return this.f4398f;
    }

    public final l j(D delegate) {
        kotlin.jvm.internal.t.g(delegate, "delegate");
        this.f4398f = delegate;
        return this;
    }

    public l(D d8) {
        kotlin.jvm.internal.t.g(d8, toqHM.zrWSPqCJGv);
        this.f4398f = d8;
    }
}
