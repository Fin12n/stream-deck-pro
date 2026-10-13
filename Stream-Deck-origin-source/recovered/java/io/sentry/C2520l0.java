package io.sentry;

/* JADX INFO: renamed from: io.sentry.l0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2520l0 implements U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runtime f27217a = Runtime.getRuntime();

    @Override // io.sentry.U
    public void c(C2485c1 c2485c1) {
        c2485c1.b(new A0(System.currentTimeMillis(), this.f27217a.totalMemory() - this.f27217a.freeMemory()));
    }

    @Override // io.sentry.U
    public void e() {
    }
}
