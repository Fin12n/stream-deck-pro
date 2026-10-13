package androidx.compose.foundation.layout;

import p056g1.U;
import p082j0.D;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutWeightElement extends U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f14448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14449c;

    public LayoutWeightElement(float f8, boolean z8) {
        this.f14448b = f8;
        this.f14449c = z8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        LayoutWeightElement layoutWeightElement = obj instanceof LayoutWeightElement ? (LayoutWeightElement) obj : null;
        return layoutWeightElement != null && this.f14448b == layoutWeightElement.f14448b && this.f14449c == layoutWeightElement.f14449c;
    }

    @Override // p056g1.U
    public int hashCode() {
        return (Float.hashCode(this.f14448b) * 31) + Boolean.hashCode(this.f14449c);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public D k() {
        return new D(this.f14448b, this.f14449c);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void p(D d8) {
        d8.f2(this.f14448b);
        d8.e2(this.f14449c);
    }
}
