package p216z1;

import R0.AbstractC1582d0;
import R0.C1598l0;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class d implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f38966b;

    public /* synthetic */ d(long j8, AbstractC2633k abstractC2633k) {
        this(j8);
    }

    @Override // p216z1.n
    public float c() {
        return C1598l0.r(d());
    }

    @Override // p216z1.n
    public long d() {
        return this.f38966b;
    }

    @Override // p216z1.n
    public AbstractC1582d0 e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && C1598l0.q(this.f38966b, ((d) obj).f38966b);
    }

    public int hashCode() {
        return C1598l0.w(this.f38966b);
    }

    public String toString() {
        return "ColorStyle(value=" + ((Object) C1598l0.x(this.f38966b)) + ')';
    }

    public d(long j8) {
        this.f38966b = j8;
        if (j8 == C1598l0.f9405b.e()) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
        }
    }
}
