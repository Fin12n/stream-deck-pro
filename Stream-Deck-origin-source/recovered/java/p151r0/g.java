package p151r0;

import Q6.k;
import R0.InterfaceC1604o0;
import T0.c;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import p038e1.G;
import p038e1.InterfaceC2243n;
import p038e1.InterfaceC2244o;
import p038e1.InterfaceC2247s;
import p038e1.J;
import p056g1.A;
import p056g1.AbstractC2348l;
import p056g1.D;
import p056g1.InterfaceC2353q;
import p056g1.InterfaceC2354s;
import p128o1.C2739d;
import p128o1.I;
import p168t1.AbstractC3009n;
import p216z1.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC2348l implements A, InterfaceC2353q, InterfaceC2354s {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public h f32229p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k f32230q;

    public /* synthetic */ g(C2739d c2739d, I i8, AbstractC3009n.b bVar, k kVar, int i9, boolean z8, int i10, int i11, List list, k kVar2, h hVar, InterfaceC1604o0 interfaceC1604o0, AbstractC2633k abstractC2633k) {
        this(c2739d, i8, bVar, kVar, i9, z8, i10, i11, list, kVar2, hVar, interfaceC1604o0);
    }

    @Override // p056g1.A
    public p038e1.I c(J j8, G g8, long j9) {
        return this.f32230q.r2(j8, g8, j9);
    }

    @Override // p056g1.A
    public int g(InterfaceC2244o interfaceC2244o, InterfaceC2243n interfaceC2243n, int i8) {
        return this.f32230q.q2(interfaceC2244o, interfaceC2243n, i8);
    }

    public final void i2(C2739d c2739d, I i8, List list, int i9, int i10, boolean z8, AbstractC3009n.b bVar, int i11, k kVar, k kVar2, h hVar, InterfaceC1604o0 interfaceC1604o0) {
        k kVar3 = this.f32230q;
        kVar3.k2(kVar3.x2(interfaceC1604o0, i8), this.f32230q.z2(c2739d), this.f32230q.y2(i8, list, i9, i10, z8, bVar, i11), this.f32230q.w2(kVar, kVar2, hVar));
        this.f32229p = hVar;
        D.b(this);
    }

    @Override // p056g1.InterfaceC2354s
    public void m(InterfaceC2247s interfaceC2247s) {
        h hVar = this.f32229p;
        if (hVar != null) {
            hVar.g(interfaceC2247s);
        }
    }

    @Override // p056g1.A
    public int n(InterfaceC2244o interfaceC2244o, InterfaceC2243n interfaceC2243n, int i8) {
        return this.f32230q.s2(interfaceC2244o, interfaceC2243n, i8);
    }

    @Override // p056g1.A
    public int o(InterfaceC2244o interfaceC2244o, InterfaceC2243n interfaceC2243n, int i8) {
        return this.f32230q.t2(interfaceC2244o, interfaceC2243n, i8);
    }

    @Override // p056g1.InterfaceC2353q
    public void q(c cVar) {
        this.f32230q.l2(cVar);
    }

    @Override // p056g1.A
    public int t(InterfaceC2244o interfaceC2244o, InterfaceC2243n interfaceC2243n, int i8) {
        return this.f32230q.p2(interfaceC2244o, interfaceC2243n, i8);
    }

    public /* synthetic */ g(C2739d c2739d, I i8, AbstractC3009n.b bVar, k kVar, int i9, boolean z8, int i10, int i11, List list, k kVar2, h hVar, InterfaceC1604o0 interfaceC1604o0, int i12, AbstractC2633k abstractC2633k) {
        this(c2739d, i8, bVar, (i12 & 8) != 0 ? null : kVar, (i12 & 16) != 0 ? t.f39054a.a() : i9, (i12 & 32) != 0 ? true : z8, (i12 & 64) != 0 ? Integer.MAX_VALUE : i10, (i12 & 128) != 0 ? 1 : i11, (i12 & 256) != 0 ? null : list, (i12 & 512) != 0 ? null : kVar2, (i12 & 1024) != 0 ? null : hVar, (i12 & 2048) != 0 ? null : interfaceC1604o0, null);
    }

    public g(C2739d c2739d, I i8, AbstractC3009n.b bVar, k kVar, int i9, boolean z8, int i10, int i11, List list, k kVar2, h hVar, InterfaceC1604o0 interfaceC1604o0) {
        this.f32229p = hVar;
        this.f32230q = (k) d2(new k(c2739d, i8, bVar, kVar, i9, z8, i10, i11, list, kVar2, this.f32229p, interfaceC1604o0, null));
        if (this.f32229p == null) {
            throw new IllegalArgumentException("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        }
    }
}
