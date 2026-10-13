package androidx.compose.foundation;

import A1.h;
import R0.AbstractC1582d0;
import R0.T0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p046f0.C2279g;
import p056g1.U;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class BorderModifierNodeElement extends U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f14292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC1582d0 f14293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final T0 f14294d;

    public /* synthetic */ BorderModifierNodeElement(float f8, AbstractC1582d0 abstractC1582d0, T0 t8, AbstractC2633k abstractC2633k) {
        this(f8, abstractC1582d0, t8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        return h.t(this.f14292b, borderModifierNodeElement.f14292b) && t.c(this.f14293c, borderModifierNodeElement.f14293c) && t.c(this.f14294d, borderModifierNodeElement.f14294d);
    }

    @Override // p056g1.U
    public int hashCode() {
        return (((h.u(this.f14292b) * 31) + this.f14293c.hashCode()) * 31) + this.f14294d.hashCode();
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public C2279g k() {
        return new C2279g(this.f14292b, this.f14293c, this.f14294d, null);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void p(C2279g c2279g) {
        c2279g.q2(this.f14292b);
        c2279g.p2(this.f14293c);
        c2279g.x(this.f14294d);
    }

    public String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) h.v(this.f14292b)) + ", brush=" + this.f14293c + ", shape=" + this.f14294d + ')';
    }

    public BorderModifierNodeElement(float f8, AbstractC1582d0 abstractC1582d0, T0 t8) {
        this.f14292b = f8;
        this.f14293c = abstractC1582d0;
        this.f14294d = t8;
    }
}
