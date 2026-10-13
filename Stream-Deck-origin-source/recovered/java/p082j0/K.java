package p082j0;

import A1.h;
import A1.t;
import io.sentry.exception.uXy.SZCvugJaXc;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class K implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f27856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f27857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f27858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f27859d;

    public /* synthetic */ K(float f8, float f9, float f10, float f11, AbstractC2633k abstractC2633k) {
        this(f8, f9, f10, f11);
    }

    @Override // p082j0.J
    public float a() {
        return this.f27859d;
    }

    @Override // p082j0.J
    public float b(t tVar) {
        return tVar == t.Ltr ? this.f27858c : this.f27856a;
    }

    @Override // p082j0.J
    public float c(t tVar) {
        return tVar == t.Ltr ? this.f27856a : this.f27858c;
    }

    @Override // p082j0.J
    public float d() {
        return this.f27857b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof K)) {
            return false;
        }
        K k8 = (K) obj;
        return h.t(this.f27856a, k8.f27856a) && h.t(this.f27857b, k8.f27857b) && h.t(this.f27858c, k8.f27858c) && h.t(this.f27859d, k8.f27859d);
    }

    public int hashCode() {
        return (((((h.u(this.f27856a) * 31) + h.u(this.f27857b)) * 31) + h.u(this.f27858c)) * 31) + h.u(this.f27859d);
    }

    public K(float f8, float f9, float f10, float f11) {
        this.f27856a = f8;
        this.f27857b = f9;
        this.f27858c = f10;
        this.f27859d = f11;
    }

    public String toString() {
        return "PaddingValues(start=" + ((Object) h.v(this.f27856a)) + ", top=" + ((Object) h.v(this.f27857b)) + ", end=" + ((Object) h.v(this.f27858c)) + SZCvugJaXc.ZhB + ((Object) h.v(this.f27859d)) + ')';
    }

    public /* synthetic */ K(float f8, float f9, float f10, float f11, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? h.m(0) : f8, (i8 & 2) != 0 ? h.m(0) : f9, (i8 & 4) != 0 ? h.m(0) : f10, (i8 & 8) != 0 ? h.m(0) : f11, null);
    }
}
