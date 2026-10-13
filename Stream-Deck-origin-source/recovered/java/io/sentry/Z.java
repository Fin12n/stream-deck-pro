package io.sentry;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public interface Z {
    void a(boolean z8);

    void b(Y2 y8, H h8);

    io.sentry.protocol.u c(K2 k8, V v8, H h8);

    io.sentry.protocol.u d(io.sentry.protocol.B b8, p3 p3Var, V v8, H h8, C2497f1 c2497f1);

    io.sentry.protocol.u e(C2557s2 c2557s2, V v8, H h8);

    boolean isEnabled();

    io.sentry.transport.A m();

    default boolean n() {
        return true;
    }

    void p(long j8);

    io.sentry.protocol.u r(W1 w8, H h8);
}
