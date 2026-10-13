package androidx.compose.ui.graphics;

import R0.C1598l0;
import R0.O0;
import R0.T0;
import io.sentry.exception.uXy.SZCvugJaXc;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p056g1.U;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
final class GraphicsLayerElement extends U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f14644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f14645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f14646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f14647e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f14648f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f14649g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f14650h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f14651i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f14652j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f14653k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f14654l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final T0 f14655m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f14656n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final O0 f14657o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f14658p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f14659q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f14660r;

    public /* synthetic */ GraphicsLayerElement(float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, long j8, T0 t8, boolean z8, O0 o8, long j9, long j10, int i8, AbstractC2633k abstractC2633k) {
        this(f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, j8, t8, z8, o8, j9, j10, i8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        return Float.compare(this.f14644b, graphicsLayerElement.f14644b) == 0 && Float.compare(this.f14645c, graphicsLayerElement.f14645c) == 0 && Float.compare(this.f14646d, graphicsLayerElement.f14646d) == 0 && Float.compare(this.f14647e, graphicsLayerElement.f14647e) == 0 && Float.compare(this.f14648f, graphicsLayerElement.f14648f) == 0 && Float.compare(this.f14649g, graphicsLayerElement.f14649g) == 0 && Float.compare(this.f14650h, graphicsLayerElement.f14650h) == 0 && Float.compare(this.f14651i, graphicsLayerElement.f14651i) == 0 && Float.compare(this.f14652j, graphicsLayerElement.f14652j) == 0 && Float.compare(this.f14653k, graphicsLayerElement.f14653k) == 0 && f.e(this.f14654l, graphicsLayerElement.f14654l) && t.c(this.f14655m, graphicsLayerElement.f14655m) && this.f14656n == graphicsLayerElement.f14656n && t.c(this.f14657o, graphicsLayerElement.f14657o) && C1598l0.q(this.f14658p, graphicsLayerElement.f14658p) && C1598l0.q(this.f14659q, graphicsLayerElement.f14659q) && a.e(this.f14660r, graphicsLayerElement.f14660r);
    }

    @Override // p056g1.U
    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((Float.hashCode(this.f14644b) * 31) + Float.hashCode(this.f14645c)) * 31) + Float.hashCode(this.f14646d)) * 31) + Float.hashCode(this.f14647e)) * 31) + Float.hashCode(this.f14648f)) * 31) + Float.hashCode(this.f14649g)) * 31) + Float.hashCode(this.f14650h)) * 31) + Float.hashCode(this.f14651i)) * 31) + Float.hashCode(this.f14652j)) * 31) + Float.hashCode(this.f14653k)) * 31) + f.h(this.f14654l)) * 31) + this.f14655m.hashCode()) * 31) + Boolean.hashCode(this.f14656n)) * 31;
        O0 o8 = this.f14657o;
        return ((((((iHashCode + (o8 == null ? 0 : o8.hashCode())) * 31) + C1598l0.w(this.f14658p)) * 31) + C1598l0.w(this.f14659q)) * 31) + a.f(this.f14660r);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public e k() {
        return new e(this.f14644b, this.f14645c, this.f14646d, this.f14647e, this.f14648f, this.f14649g, this.f14650h, this.f14651i, this.f14652j, this.f14653k, this.f14654l, this.f14655m, this.f14656n, this.f14657o, this.f14658p, this.f14659q, this.f14660r, null);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void p(e eVar) {
        eVar.p(this.f14644b);
        eVar.k(this.f14645c);
        eVar.b(this.f14646d);
        eVar.s(this.f14647e);
        eVar.j(this.f14648f);
        eVar.B(this.f14649g);
        eVar.w(this.f14650h);
        eVar.h(this.f14651i);
        eVar.i(this.f14652j);
        eVar.v(this.f14653k);
        eVar.W0(this.f14654l);
        eVar.x(this.f14655m);
        eVar.R0(this.f14656n);
        eVar.r(this.f14657o);
        eVar.H0(this.f14658p);
        eVar.Z0(this.f14659q);
        eVar.l(this.f14660r);
        eVar.m2();
    }

    public GraphicsLayerElement(float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, long j8, T0 t8, boolean z8, O0 o8, long j9, long j10, int i8) {
        this.f14644b = f8;
        this.f14645c = f9;
        this.f14646d = f10;
        this.f14647e = f11;
        this.f14648f = f12;
        this.f14649g = f13;
        this.f14650h = f14;
        this.f14651i = f15;
        this.f14652j = f16;
        this.f14653k = f17;
        this.f14654l = j8;
        this.f14655m = t8;
        this.f14656n = z8;
        this.f14657o = o8;
        this.f14658p = j9;
        this.f14659q = j10;
        this.f14660r = i8;
    }

    public String toString() {
        return "GraphicsLayerElement(scaleX=" + this.f14644b + ", scaleY=" + this.f14645c + ", alpha=" + this.f14646d + ", translationX=" + this.f14647e + ", translationY=" + this.f14648f + ", shadowElevation=" + this.f14649g + ", rotationX=" + this.f14650h + ", rotationY=" + this.f14651i + ", rotationZ=" + this.f14652j + ", cameraDistance=" + this.f14653k + ", transformOrigin=" + ((Object) f.i(this.f14654l)) + ", shape=" + this.f14655m + ", clip=" + this.f14656n + ", renderEffect=" + this.f14657o + SZCvugJaXc.MSj + ((Object) C1598l0.x(this.f14658p)) + ", spotShadowColor=" + ((Object) C1598l0.x(this.f14659q)) + ", compositingStrategy=" + ((Object) a.g(this.f14660r)) + ')';
    }
}
