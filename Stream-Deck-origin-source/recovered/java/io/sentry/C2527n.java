package io.sentry;

/* JADX INFO: renamed from: io.sentry.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2527n implements Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f27232a = new ThreadLocal();

    /* JADX INFO: renamed from: io.sentry.n$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2480b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final X f27233a;

        public a(X x8) {
            this.f27233a = x8;
        }

        @Override // io.sentry.InterfaceC2480b0, java.lang.AutoCloseable
        public void close() {
            C2527n.f27232a.set(this.f27233a);
        }
    }

    @Override // io.sentry.Y
    public InterfaceC2480b0 b(X x8) {
        X x9 = get();
        f27232a.set(x8);
        return new a(x9);
    }

    @Override // io.sentry.Y
    public void close() {
        f27232a.remove();
    }

    @Override // io.sentry.Y
    public X get() {
        return (X) f27232a.get();
    }

    @Override // io.sentry.Y
    public void a() {
    }
}
