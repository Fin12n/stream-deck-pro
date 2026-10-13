package androidx.compose.foundation;

import Q6.k;
import R0.AbstractC1582d0;
import R0.C1598l0;
import R0.T0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p046f0.C2276d;
import p056g1.U;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
final class BackgroundElement extends U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f14287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC1582d0 f14288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f14289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final T0 f14290e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k f14291f;

    public /* synthetic */ BackgroundElement(long j8, AbstractC1582d0 abstractC1582d0, float f8, T0 t8, k kVar, AbstractC2633k abstractC2633k) {
        this(j8, abstractC1582d0, f8, t8, kVar);
    }

    public boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        return backgroundElement != null && C1598l0.q(this.f14287b, backgroundElement.f14287b) && t.c(this.f14288c, backgroundElement.f14288c) && this.f14289d == backgroundElement.f14289d && t.c(this.f14290e, backgroundElement.f14290e);
    }

    @Override // p056g1.U
    public int hashCode() {
        int iW = C1598l0.w(this.f14287b) * 31;
        AbstractC1582d0 abstractC1582d0 = this.f14288c;
        return ((((iW + (abstractC1582d0 != null ? abstractC1582d0.hashCode() : 0)) * 31) + Float.hashCode(this.f14289d)) * 31) + this.f14290e.hashCode();
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public C2276d k() {
        return new C2276d(this.f14287b, this.f14288c, this.f14289d, this.f14290e, null);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void p(C2276d c2276d) {
        c2276d.g2(this.f14287b);
        c2276d.f2(this.f14288c);
        c2276d.b(this.f14289d);
        c2276d.x(this.f14290e);
    }

    public /* synthetic */ BackgroundElement(long j8, AbstractC1582d0 abstractC1582d0, float f8, T0 t8, k kVar, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? C1598l0.f9405b.e() : j8, (i8 & 2) != 0 ? null : abstractC1582d0, f8, t8, kVar, null);
    }

    public BackgroundElement(long j8, AbstractC1582d0 abstractC1582d0, float f8, T0 t8, k kVar) {
        this.f14287b = j8;
        this.f14288c = abstractC1582d0;
        this.f14289d = f8;
        this.f14290e = t8;
        this.f14291f = kVar;
    }
}
