package androidx.compose.foundation.layout;

import Q6.k;
import p056g1.U;
import p082j0.C2599c;
import p201x2.vAk.kDsnNkYbBsI;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
final class AspectRatioElement extends U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f14434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f14436d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AspectRatioElement aspectRatioElement = obj instanceof AspectRatioElement ? (AspectRatioElement) obj : null;
        return aspectRatioElement != null && this.f14434b == aspectRatioElement.f14434b && this.f14435c == ((AspectRatioElement) obj).f14435c;
    }

    @Override // p056g1.U
    public int hashCode() {
        return (Float.hashCode(this.f14434b) * 31) + Boolean.hashCode(this.f14435c);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public C2599c k() {
        return new C2599c(this.f14434b, this.f14435c);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void p(C2599c c2599c) {
        c2599c.e2(this.f14434b);
        c2599c.f2(this.f14435c);
    }

    public AspectRatioElement(float f8, boolean z8, k kVar) {
        this.f14434b = f8;
        this.f14435c = z8;
        this.f14436d = kVar;
        if (f8 > 0.0f) {
            return;
        }
        throw new IllegalArgumentException((kDsnNkYbBsI.wdbpMGzvx + f8 + " must be > 0").toString());
    }
}
