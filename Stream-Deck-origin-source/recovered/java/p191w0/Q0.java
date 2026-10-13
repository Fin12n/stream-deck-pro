package p191w0;

import R0.AbstractC1602n0;
import R0.C1598l0;
import kotlin.jvm.internal.AbstractC2633k;
import p037e0.D;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class Q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f35666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f35667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f35668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f35669e;

    public /* synthetic */ Q0(long j8, long j9, long j10, long j11, long j12, AbstractC2633k abstractC2633k) {
        this(j8, j9, j10, j11, j12);
    }

    public static /* synthetic */ Q0 c(Q0 q8, long j8, long j9, long j10, long j11, long j12, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            j8 = q8.f35665a;
        }
        long j13 = j8;
        if ((i8 & 2) != 0) {
            j9 = q8.f35666b;
        }
        return q8.b(j13, j9, (i8 & 4) != 0 ? q8.f35667c : j10, (i8 & 8) != 0 ? q8.f35668d : j11, (i8 & 16) != 0 ? q8.f35669e : j12);
    }

    public final long a(float f8) {
        return AbstractC1602n0.g(this.f35665a, this.f35666b, D.c().a(f8));
    }

    public final Q0 b(long j8, long j9, long j10, long j11, long j12) {
        C1598l0.a aVar = C1598l0.f9405b;
        return new Q0(j8 != aVar.e() ? j8 : this.f35665a, j9 != aVar.e() ? j9 : this.f35666b, j10 != aVar.e() ? j10 : this.f35667c, j11 != aVar.e() ? j11 : this.f35668d, j12 != aVar.e() ? j12 : this.f35669e, null);
    }

    public final long d() {
        return this.f35669e;
    }

    public final long e() {
        return this.f35667c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Q0)) {
            return false;
        }
        Q0 q8 = (Q0) obj;
        return C1598l0.q(this.f35665a, q8.f35665a) && C1598l0.q(this.f35666b, q8.f35666b) && C1598l0.q(this.f35667c, q8.f35667c) && C1598l0.q(this.f35668d, q8.f35668d) && C1598l0.q(this.f35669e, q8.f35669e);
    }

    public final long f() {
        return this.f35668d;
    }

    public int hashCode() {
        return (((((((C1598l0.w(this.f35665a) * 31) + C1598l0.w(this.f35666b)) * 31) + C1598l0.w(this.f35667c)) * 31) + C1598l0.w(this.f35668d)) * 31) + C1598l0.w(this.f35669e);
    }

    public Q0(long j8, long j9, long j10, long j11, long j12) {
        this.f35665a = j8;
        this.f35666b = j9;
        this.f35667c = j10;
        this.f35668d = j11;
        this.f35669e = j12;
    }
}
