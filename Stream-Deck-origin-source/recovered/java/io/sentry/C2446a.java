package io.sentry;

/* JADX INFO: renamed from: io.sentry.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2446a implements InterfaceC2504h0 {
    @Override // io.sentry.InterfaceC2504h0
    public io.sentry.transport.q a(J2 j8, C2521l1 c2521l1) {
        io.sentry.util.u.c(j8, "options is required");
        io.sentry.util.u.c(c2521l1, "requestDetails is required");
        return new io.sentry.transport.e(j8, new io.sentry.transport.A(j8), j8.getTransportGate(), c2521l1);
    }
}
