package p046f0;

import R0.AbstractC1602n0;
import R0.C1598l0;
import androidx.compose.foundation.layout.e;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p082j0.J;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J f21338b;

    public /* synthetic */ P(long j8, J j9, AbstractC2633k abstractC2633k) {
        this(j8, j9);
    }

    public final J a() {
        return this.f21338b;
    }

    public final long b() {
        return this.f21337a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!t.c(P.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        t.e(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        P p8 = (P) obj;
        return C1598l0.q(this.f21337a, p8.f21337a) && t.c(this.f21338b, p8.f21338b);
    }

    public int hashCode() {
        return (C1598l0.w(this.f21337a) * 31) + this.f21338b.hashCode();
    }

    public String toString() {
        return "OverscrollConfiguration(glowColor=" + ((Object) C1598l0.x(this.f21337a)) + ", drawPadding=" + this.f21338b + ')';
    }

    public P(long j8, J j9) {
        this.f21337a = j8;
        this.f21338b = j9;
    }

    public /* synthetic */ P(long j8, J j9, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? AbstractC1602n0.d(4284900966L) : j8, (i8 & 2) != 0 ? e.c(0.0f, 0.0f, 3, null) : j9, null);
    }
}
