package androidx.compose.animation;

import com.google.mlkit.common.internal.ckI.WqXA;
import p028d0.n;
import p028d0.t;
import p037e0.f0;
import p056g1.U;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
final class EnterExitTransitionElement extends U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f14176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f0.a f14177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f0.a f14178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f0.a f14179e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f f14180f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g f14181g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public t f14182h;

    public EnterExitTransitionElement(f0 f0Var, e0.f0.a aVar, e0.f0.a aVar2, e0.f0.a aVar3, f fVar, g gVar, t tVar) {
        this.f14176b = f0Var;
        this.f14177c = aVar;
        this.f14178d = aVar2;
        this.f14179e = aVar3;
        this.f14180f = fVar;
        this.f14181g = gVar;
        this.f14182h = tVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
        return kotlin.jvm.internal.t.c(this.f14176b, enterExitTransitionElement.f14176b) && kotlin.jvm.internal.t.c(this.f14177c, enterExitTransitionElement.f14177c) && kotlin.jvm.internal.t.c(this.f14178d, enterExitTransitionElement.f14178d) && kotlin.jvm.internal.t.c(this.f14179e, enterExitTransitionElement.f14179e) && kotlin.jvm.internal.t.c(this.f14180f, enterExitTransitionElement.f14180f) && kotlin.jvm.internal.t.c(this.f14181g, enterExitTransitionElement.f14181g) && kotlin.jvm.internal.t.c(this.f14182h, enterExitTransitionElement.f14182h);
    }

    @Override // p056g1.U
    public int hashCode() {
        int iHashCode = this.f14176b.hashCode() * 31;
        f0.a aVar = this.f14177c;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        f0.a aVar2 = this.f14178d;
        int iHashCode3 = (iHashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        f0.a aVar3 = this.f14179e;
        return ((((((iHashCode3 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31) + this.f14180f.hashCode()) * 31) + this.f14181g.hashCode()) * 31) + this.f14182h.hashCode();
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public n k() {
        return new n(this.f14176b, this.f14177c, this.f14178d, this.f14179e, this.f14180f, this.f14181g, this.f14182h);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void p(n nVar) {
        nVar.n2(this.f14176b);
        nVar.l2(this.f14177c);
        nVar.k2(this.f14178d);
        nVar.m2(this.f14179e);
        nVar.g2(this.f14180f);
        nVar.h2(this.f14181g);
        nVar.i2(this.f14182h);
    }

    public String toString() {
        return "EnterExitTransitionElement(transition=" + this.f14176b + ", sizeAnimation=" + this.f14177c + ", offsetAnimation=" + this.f14178d + ", slideAnimation=" + this.f14179e + WqXA.jQjYh + this.f14180f + ", exit=" + this.f14181g + ", graphicsLayerBlock=" + this.f14182h + ')';
    }
}
