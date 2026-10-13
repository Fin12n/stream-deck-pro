package androidx.compose.foundation.layout;

import Q6.k;
import p056g1.U;
import p082j0.B;
import p082j0.EnumC2621z;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
final class IntrinsicWidthElement extends U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EnumC2621z f14445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f14447d;

    public IntrinsicWidthElement(EnumC2621z enumC2621z, boolean z8, k kVar) {
        this.f14445b = enumC2621z;
        this.f14446c = z8;
        this.f14447d = kVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicWidthElement intrinsicWidthElement = obj instanceof IntrinsicWidthElement ? (IntrinsicWidthElement) obj : null;
        return intrinsicWidthElement != null && this.f14445b == intrinsicWidthElement.f14445b && this.f14446c == intrinsicWidthElement.f14446c;
    }

    @Override // p056g1.U
    public int hashCode() {
        return (this.f14445b.hashCode() * 31) + Boolean.hashCode(this.f14446c);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public B k() {
        return new B(this.f14445b, this.f14446c);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void p(B b8) {
        b8.g2(this.f14445b);
        b8.f2(this.f14446c);
    }
}
