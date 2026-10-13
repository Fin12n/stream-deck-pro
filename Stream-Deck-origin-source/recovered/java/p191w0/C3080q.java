package p191w0;

import R0.C1598l0;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: renamed from: w0.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C3080q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f36353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f36354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f36355d;

    public /* synthetic */ C3080q(long j8, long j9, long j10, long j11, AbstractC2633k abstractC2633k) {
        this(j8, j9, j10, j11);
    }

    public static /* synthetic */ C3080q d(C3080q c3080q, long j8, long j9, long j10, long j11, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            j8 = c3080q.f36352a;
        }
        long j12 = j8;
        if ((i8 & 2) != 0) {
            j9 = c3080q.f36353b;
        }
        long j13 = j9;
        if ((i8 & 4) != 0) {
            j10 = c3080q.f36354c;
        }
        return c3080q.c(j12, j13, j10, (i8 & 8) != 0 ? c3080q.f36355d : j11);
    }

    public final long a(boolean z8) {
        return z8 ? this.f36352a : this.f36354c;
    }

    public final long b(boolean z8) {
        return z8 ? this.f36353b : this.f36355d;
    }

    public final C3080q c(long j8, long j9, long j10, long j11) {
        C1598l0.a aVar = C1598l0.f9405b;
        if (j8 == aVar.e()) {
            j8 = this.f36352a;
        }
        return new C3080q(j8, j9 != aVar.e() ? j9 : this.f36353b, j10 != aVar.e() ? j10 : this.f36354c, j11 != aVar.e() ? j11 : this.f36355d, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C3080q)) {
            return false;
        }
        C3080q c3080q = (C3080q) obj;
        return C1598l0.q(this.f36352a, c3080q.f36352a) && C1598l0.q(this.f36353b, c3080q.f36353b) && C1598l0.q(this.f36354c, c3080q.f36354c) && C1598l0.q(this.f36355d, c3080q.f36355d);
    }

    public int hashCode() {
        return (((((C1598l0.w(this.f36352a) * 31) + C1598l0.w(this.f36353b)) * 31) + C1598l0.w(this.f36354c)) * 31) + C1598l0.w(this.f36355d);
    }

    public C3080q(long j8, long j9, long j10, long j11) {
        this.f36352a = j8;
        this.f36353b = j9;
        this.f36354c = j10;
        this.f36355d = j11;
    }
}
