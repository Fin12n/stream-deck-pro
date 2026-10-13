package io.sentry;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class U1 implements Comparable {
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(U1 u8) {
        return Long.valueOf(j()).compareTo(Long.valueOf(u8.j()));
    }

    public long b(U1 u8) {
        return j() - u8.j();
    }

    public final boolean c(U1 u8) {
        return b(u8) > 0;
    }

    public final boolean d(U1 u8) {
        return b(u8) < 0;
    }

    public long e(U1 u8) {
        return (u8 == null || compareTo(u8) >= 0) ? j() : u8.j();
    }

    public abstract long j();
}
