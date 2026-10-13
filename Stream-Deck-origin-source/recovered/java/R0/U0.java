package R0;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class U0 extends AbstractC1582d0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9340c;

    public /* synthetic */ U0(long j8, AbstractC2633k abstractC2633k) {
        this(j8);
    }

    @Override // R0.AbstractC1582d0
    public void a(long j8, F0 f8, float f9) {
        long jO;
        f8.b(1.0f);
        if (f9 == 1.0f) {
            jO = this.f9340c;
        } else {
            long j9 = this.f9340c;
            jO = C1598l0.o(j9, C1598l0.r(j9) * f9, 0.0f, 0.0f, 0.0f, 14, null);
        }
        f8.t(jO);
        if (f8.m() != null) {
            f8.l(null);
        }
    }

    public final long b() {
        return this.f9340c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof U0) && C1598l0.q(this.f9340c, ((U0) obj).f9340c);
    }

    public int hashCode() {
        return C1598l0.w(this.f9340c);
    }

    public String toString() {
        return "SolidColor(value=" + ((Object) C1598l0.x(this.f9340c)) + ')';
    }

    public U0(long j8) {
        super(null);
        this.f9340c = j8;
    }
}
