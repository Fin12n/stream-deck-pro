package androidx.compose.foundation.layout;

import A1.h;
import Q6.k;
import kotlin.jvm.internal.AbstractC2633k;
import p056g1.U;
import p082j0.I;
import p090k.zI.jULK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
final class PaddingElement extends U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f14457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f14458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f14459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f14460e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f14461f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f14462g;

    public /* synthetic */ PaddingElement(float f8, float f9, float f10, float f11, boolean z8, k kVar, AbstractC2633k abstractC2633k) {
        this(f8, f9, f10, f11, z8, kVar);
    }

    public boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && h.t(this.f14457b, paddingElement.f14457b) && h.t(this.f14458c, paddingElement.f14458c) && h.t(this.f14459d, paddingElement.f14459d) && h.t(this.f14460e, paddingElement.f14460e) && this.f14461f == paddingElement.f14461f;
    }

    @Override // p056g1.U
    public int hashCode() {
        return (((((((h.u(this.f14457b) * 31) + h.u(this.f14458c)) * 31) + h.u(this.f14459d)) * 31) + h.u(this.f14460e)) * 31) + Boolean.hashCode(this.f14461f);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public I k() {
        return new I(this.f14457b, this.f14458c, this.f14459d, this.f14460e, this.f14461f, null);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void p(I i8) {
        i8.j2(this.f14457b);
        i8.k2(this.f14458c);
        i8.h2(this.f14459d);
        i8.g2(this.f14460e);
        i8.i2(this.f14461f);
    }

    public PaddingElement(float f8, float f9, float f10, float f11, boolean z8, k kVar) {
        this.f14457b = f8;
        this.f14458c = f9;
        this.f14459d = f10;
        this.f14460e = f11;
        this.f14461f = z8;
        this.f14462g = kVar;
        if (f8 >= 0.0f || h.t(f8, h.f432b.c())) {
            float f12 = this.f14458c;
            if (f12 >= 0.0f || h.t(f12, h.f432b.c())) {
                float f13 = this.f14459d;
                if (f13 >= 0.0f || h.t(f13, h.f432b.c())) {
                    float f14 = this.f14460e;
                    if (f14 >= 0.0f || h.t(f14, h.f432b.c())) {
                        return;
                    }
                }
            }
        }
        throw new IllegalArgumentException(jULK.ldli);
    }

    public /* synthetic */ PaddingElement(float f8, float f9, float f10, float f11, boolean z8, k kVar, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? h.m(0) : f8, (i8 & 2) != 0 ? h.m(0) : f9, (i8 & 4) != 0 ? h.m(0) : f10, (i8 & 8) != 0 ? h.m(0) : f11, z8, kVar, null);
    }
}
