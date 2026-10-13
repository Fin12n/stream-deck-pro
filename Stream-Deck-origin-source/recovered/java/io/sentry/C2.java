package io.sentry;

import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2 extends U1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f25822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f25823b;

    public C2() {
        this(AbstractC2519l.c(), System.nanoTime());
    }

    @Override // io.sentry.U1, java.lang.Comparable
    /* JADX INFO: renamed from: a */
    public int compareTo(U1 u8) {
        if (!(u8 instanceof C2)) {
            return super.compareTo(u8);
        }
        C2 c8 = (C2) u8;
        long time = this.f25822a.getTime();
        long time2 = c8.f25822a.getTime();
        return time == time2 ? Long.valueOf(this.f25823b).compareTo(Long.valueOf(c8.f25823b)) : Long.valueOf(time).compareTo(Long.valueOf(time2));
    }

    @Override // io.sentry.U1
    public long b(U1 u8) {
        return u8 instanceof C2 ? this.f25823b - ((C2) u8).f25823b : super.b(u8);
    }

    @Override // io.sentry.U1
    public long e(U1 u8) {
        if (u8 == null || !(u8 instanceof C2)) {
            return super.e(u8);
        }
        C2 c8 = (C2) u8;
        return compareTo(u8) < 0 ? m(this, c8) : m(c8, this);
    }

    @Override // io.sentry.U1
    public long j() {
        return AbstractC2519l.a(this.f25822a);
    }

    public final long m(C2 c8, C2 c9) {
        return c8.j() + (c9.f25823b - c8.f25823b);
    }

    public C2(Date date, long j8) {
        this.f25822a = date;
        this.f25823b = j8;
    }
}
