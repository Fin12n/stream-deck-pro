package androidx.compose.foundation.layout;

import A1.h;
import Q6.k;
import kotlin.jvm.internal.AbstractC2633k;
import p056g1.U;
import p082j0.F;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
final class OffsetElement extends U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f14450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f14451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f14452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f14453e;

    public /* synthetic */ OffsetElement(float f8, float f9, boolean z8, k kVar, AbstractC2633k abstractC2633k) {
        this(f8, f9, z8, kVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetElement offsetElement = obj instanceof OffsetElement ? (OffsetElement) obj : null;
        return offsetElement != null && h.t(this.f14450b, offsetElement.f14450b) && h.t(this.f14451c, offsetElement.f14451c) && this.f14452d == offsetElement.f14452d;
    }

    @Override // p056g1.U
    public int hashCode() {
        return (((h.u(this.f14450b) * 31) + h.u(this.f14451c)) * 31) + Boolean.hashCode(this.f14452d);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public F k() {
        return new F(this.f14450b, this.f14451c, this.f14452d, null);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void p(F f8) {
        f8.h2(this.f14450b);
        f8.i2(this.f14451c);
        f8.g2(this.f14452d);
    }

    public String toString() {
        return "OffsetModifierElement(x=" + ((Object) h.v(this.f14450b)) + ", y=" + ((Object) h.v(this.f14451c)) + ", rtlAware=" + this.f14452d + ')';
    }

    public OffsetElement(float f8, float f9, boolean z8, k kVar) {
        this.f14450b = f8;
        this.f14451c = f9;
        this.f14452d = z8;
        this.f14453e = kVar;
    }
}
