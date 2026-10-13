package io.sentry;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class O1 implements V1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V1 f25962a;

    public O1() {
        if (b()) {
            this.f25962a = new C2584w2();
        } else {
            this.f25962a = new D2();
        }
    }

    public static boolean b() {
        return io.sentry.util.w.c() && io.sentry.util.w.b();
    }

    @Override // io.sentry.V1
    public U1 a() {
        return this.f25962a.a();
    }
}
