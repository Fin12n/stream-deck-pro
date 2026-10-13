package androidx.compose.foundation;

import A1.h;
import Q6.k;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p046f0.I;
import p046f0.V;
import p056g1.U;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class MagnifierElement extends U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f14306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f14307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f14308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f14309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f14310f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f14311g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f14312h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f14313i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f14314j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final V f14315k;

    public /* synthetic */ MagnifierElement(k kVar, k kVar2, k kVar3, float f8, boolean z8, long j8, float f9, float f10, boolean z9, V v8, AbstractC2633k abstractC2633k) {
        this(kVar, kVar2, kVar3, f8, z8, j8, f9, f10, z9, v8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MagnifierElement)) {
            return false;
        }
        MagnifierElement magnifierElement = (MagnifierElement) obj;
        return t.c(this.f14306b, magnifierElement.f14306b) && t.c(this.f14307c, magnifierElement.f14307c) && this.f14309e == magnifierElement.f14309e && this.f14310f == magnifierElement.f14310f && A1.k.f(this.f14311g, magnifierElement.f14311g) && h.t(this.f14312h, magnifierElement.f14312h) && h.t(this.f14313i, magnifierElement.f14313i) && this.f14314j == magnifierElement.f14314j && t.c(this.f14308d, magnifierElement.f14308d) && t.c(this.f14315k, magnifierElement.f14315k);
    }

    @Override // p056g1.U
    public int hashCode() {
        int iHashCode = this.f14306b.hashCode() * 31;
        k kVar = this.f14307c;
        int iHashCode2 = (((((((((((((iHashCode + (kVar != null ? kVar.hashCode() : 0)) * 31) + Float.hashCode(this.f14309e)) * 31) + Boolean.hashCode(this.f14310f)) * 31) + A1.k.i(this.f14311g)) * 31) + h.u(this.f14312h)) * 31) + h.u(this.f14313i)) * 31) + Boolean.hashCode(this.f14314j)) * 31;
        k kVar2 = this.f14308d;
        return ((iHashCode2 + (kVar2 != null ? kVar2.hashCode() : 0)) * 31) + this.f14315k.hashCode();
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public I k() {
        return new I(this.f14306b, this.f14307c, this.f14308d, this.f14309e, this.f14310f, this.f14311g, this.f14312h, this.f14313i, this.f14314j, this.f14315k, null);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void p(I i8) {
        i8.o2(this.f14306b, this.f14307c, this.f14309e, this.f14310f, this.f14311g, this.f14312h, this.f14313i, this.f14314j, this.f14308d, this.f14315k);
    }

    public /* synthetic */ MagnifierElement(k kVar, k kVar2, k kVar3, float f8, boolean z8, long j8, float f9, float f10, boolean z9, V v8, int i8, AbstractC2633k abstractC2633k) {
        this(kVar, (i8 & 2) != 0 ? null : kVar2, (i8 & 4) != 0 ? null : kVar3, (i8 & 8) != 0 ? Float.NaN : f8, (i8 & 16) != 0 ? false : z8, (i8 & 32) != 0 ? A1.k.f441b.a() : j8, (i8 & 64) != 0 ? h.f432b.c() : f9, (i8 & 128) != 0 ? h.f432b.c() : f10, (i8 & 256) != 0 ? true : z9, v8, null);
    }

    public MagnifierElement(k kVar, k kVar2, k kVar3, float f8, boolean z8, long j8, float f9, float f10, boolean z9, V v8) {
        this.f14306b = kVar;
        this.f14307c = kVar2;
        this.f14308d = kVar3;
        this.f14309e = f8;
        this.f14310f = z8;
        this.f14311g = j8;
        this.f14312h = f9;
        this.f14313i = f10;
        this.f14314j = z9;
        this.f14315k = v8;
    }
}
