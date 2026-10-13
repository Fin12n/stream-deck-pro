package M3;

import C6.y;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f5149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5150d;

    public /* synthetic */ f(long j8, long j9, long j10, int i8, AbstractC2633k abstractC2633k) {
        this(j8, j9, j10, i8);
    }

    public final int a() {
        return this.f5150d;
    }

    public final long b() {
        return this.f5148b;
    }

    public final long c() {
        return this.f5147a;
    }

    public final long d() {
        return this.f5149c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return p008a7.a.u(this.f5147a, fVar.f5147a) && p008a7.a.u(this.f5148b, fVar.f5148b) && p008a7.a.u(this.f5149c, fVar.f5149c) && this.f5150d == fVar.f5150d;
    }

    public int hashCode() {
        return (((((p008a7.a.H(this.f5147a) * 31) + p008a7.a.H(this.f5148b)) * 31) + p008a7.a.H(this.f5149c)) * 31) + y.d(this.f5150d);
    }

    public String toString() {
        return "ConnectionOptions(discoveryTimeout=" + p008a7.a.S(this.f5147a) + ", connectTimeout=" + p008a7.a.S(this.f5148b) + ", receiveTimeout=" + p008a7.a.S(this.f5149c) + ", connectRetries=" + y.e(this.f5150d) + ")";
    }

    public f(long j8, long j9, long j10, int i8) {
        this.f5147a = j8;
        this.f5148b = j9;
        this.f5149c = j10;
        this.f5150d = i8;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ f(long j8, long j9, long j10, int i8, int i9, AbstractC2633k abstractC2633k) {
        long jS;
        long jS2;
        long jS3;
        if ((i9 & 1) != 0) {
            p008a7.a.C0338a c0338a = p008a7.a.f13446b;
            jS = p008a7.c.s(20, p008a7.d.SECONDS);
        } else {
            jS = j8;
        }
        if ((i9 & 2) != 0) {
            p008a7.a.C0338a c0338a2 = p008a7.a.f13446b;
            jS2 = p008a7.c.s(6, p008a7.d.SECONDS);
        } else {
            jS2 = j9;
        }
        if ((i9 & 4) != 0) {
            p008a7.a.C0338a c0338a3 = p008a7.a.f13446b;
            jS3 = p008a7.c.s(10, p008a7.d.SECONDS);
        } else {
            jS3 = j10;
        }
        this(jS, jS2, jS3, (i9 & 8) != 0 ? 5 : i8, null);
    }
}
