package p191w0;

import R0.C1598l0;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f35484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f35485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f35486d;

    public /* synthetic */ L(long j8, long j9, long j10, long j11, AbstractC2633k abstractC2633k) {
        this(j8, j9, j10, j11);
    }

    public static /* synthetic */ L d(L l8, long j8, long j9, long j10, long j11, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            j8 = l8.f35483a;
        }
        long j12 = j8;
        if ((i8 & 2) != 0) {
            j9 = l8.f35484b;
        }
        long j13 = j9;
        if ((i8 & 4) != 0) {
            j10 = l8.f35485c;
        }
        return l8.c(j12, j13, j10, (i8 & 8) != 0 ? l8.f35486d : j11);
    }

    public final long a(boolean z8) {
        return z8 ? this.f35483a : this.f35485c;
    }

    public final long b(boolean z8) {
        return z8 ? this.f35484b : this.f35486d;
    }

    public final L c(long j8, long j9, long j10, long j11) {
        C1598l0.a aVar = C1598l0.f9405b;
        if (j8 == aVar.e()) {
            j8 = this.f35483a;
        }
        return new L(j8, j9 != aVar.e() ? j9 : this.f35484b, j10 != aVar.e() ? j10 : this.f35485c, j11 != aVar.e() ? j11 : this.f35486d, null);
    }

    public final long e() {
        return this.f35484b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof L)) {
            return false;
        }
        L l8 = (L) obj;
        return C1598l0.q(this.f35483a, l8.f35483a) && C1598l0.q(this.f35484b, l8.f35484b) && C1598l0.q(this.f35485c, l8.f35485c) && C1598l0.q(this.f35486d, l8.f35486d);
    }

    public int hashCode() {
        return (((((C1598l0.w(this.f35483a) * 31) + C1598l0.w(this.f35484b)) * 31) + C1598l0.w(this.f35485c)) * 31) + C1598l0.w(this.f35486d);
    }

    public L(long j8, long j9, long j10, long j11) {
        this.f35483a = j8;
        this.f35484b = j9;
        this.f35485c = j10;
        this.f35486d = j11;
    }
}
