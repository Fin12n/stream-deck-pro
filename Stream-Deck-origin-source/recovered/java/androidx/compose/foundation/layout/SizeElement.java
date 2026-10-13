package androidx.compose.foundation.layout;

import A1.h;
import Q6.k;
import kotlin.jvm.internal.AbstractC2633k;
import p056g1.U;
import p082j0.W;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
final class SizeElement extends U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f14465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f14466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f14467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f14468e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f14469f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f14470g;

    public /* synthetic */ SizeElement(float f8, float f9, float f10, float f11, boolean z8, k kVar, AbstractC2633k abstractC2633k) {
        this(f8, f9, f10, f11, z8, kVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return h.t(this.f14465b, sizeElement.f14465b) && h.t(this.f14466c, sizeElement.f14466c) && h.t(this.f14467d, sizeElement.f14467d) && h.t(this.f14468e, sizeElement.f14468e) && this.f14469f == sizeElement.f14469f;
    }

    @Override // p056g1.U
    public int hashCode() {
        return (((((((h.u(this.f14465b) * 31) + h.u(this.f14466c)) * 31) + h.u(this.f14467d)) * 31) + h.u(this.f14468e)) * 31) + Boolean.hashCode(this.f14469f);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public W k() {
        return new W(this.f14465b, this.f14466c, this.f14467d, this.f14468e, this.f14469f, null);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void p(W w8) {
        w8.i2(this.f14465b);
        w8.h2(this.f14466c);
        w8.g2(this.f14467d);
        w8.f2(this.f14468e);
        w8.e2(this.f14469f);
    }

    public /* synthetic */ SizeElement(float f8, float f9, float f10, float f11, boolean z8, k kVar, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? h.f432b.c() : f8, (i8 & 2) != 0 ? h.f432b.c() : f9, (i8 & 4) != 0 ? h.f432b.c() : f10, (i8 & 8) != 0 ? h.f432b.c() : f11, z8, kVar, null);
    }

    public SizeElement(float f8, float f9, float f10, float f11, boolean z8, k kVar) {
        this.f14465b = f8;
        this.f14466c = f9;
        this.f14467d = f10;
        this.f14468e = f11;
        this.f14469f = z8;
        this.f14470g = kVar;
    }
}
