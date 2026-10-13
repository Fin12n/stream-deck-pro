package io.sentry;

import java.time.Instant;

/* JADX INFO: renamed from: io.sentry.v2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2580v2 extends U1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f27752a;

    public C2580v2() {
        this(Instant.now());
    }

    @Override // io.sentry.U1
    public long j() {
        return AbstractC2519l.m(this.f27752a.getEpochSecond()) + ((long) this.f27752a.getNano());
    }

    public C2580v2(Instant instant) {
        this.f27752a = instant;
    }
}
