package androidx.compose.foundation.layout;

import A1.h;
import kotlin.jvm.internal.AbstractC2633k;
import p056g1.U;
import p082j0.a0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
final class UnspecifiedConstraintsElement extends U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f14471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f14472c;

    public /* synthetic */ UnspecifiedConstraintsElement(float f8, float f9, AbstractC2633k abstractC2633k) {
        this(f8, f9);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        return h.t(this.f14471b, unspecifiedConstraintsElement.f14471b) && h.t(this.f14472c, unspecifiedConstraintsElement.f14472c);
    }

    @Override // p056g1.U
    public int hashCode() {
        return (h.u(this.f14471b) * 31) + h.u(this.f14472c);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public a0 k() {
        return new a0(this.f14471b, this.f14472c, null);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void p(a0 a0Var) {
        a0Var.e2(this.f14471b);
        a0Var.d2(this.f14472c);
    }

    public /* synthetic */ UnspecifiedConstraintsElement(float f8, float f9, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? h.f432b.c() : f8, (i8 & 2) != 0 ? h.f432b.c() : f9, null);
    }

    public UnspecifiedConstraintsElement(float f8, float f9) {
        this.f14471b = f8;
        this.f14472c = f9;
    }
}
