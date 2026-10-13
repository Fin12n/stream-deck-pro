package androidx.compose.foundation.text.modifiers;

import Q6.k;
import R0.InterfaceC1604o0;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p056g1.U;
import p128o1.C2739d;
import p128o1.I;
import p151r0.h;
import p168t1.AbstractC3009n;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class TextAnnotatedStringElement extends U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2739d f14541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final I f14542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC3009n.b f14543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f14544e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f14545f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f14546g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f14547h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f14548i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f14549j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final k f14550k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h f14551l;

    public /* synthetic */ TextAnnotatedStringElement(C2739d c2739d, I i8, AbstractC3009n.b bVar, k kVar, int i9, boolean z8, int i10, int i11, List list, k kVar2, h hVar, InterfaceC1604o0 interfaceC1604o0, AbstractC2633k abstractC2633k) {
        this(c2739d, i8, bVar, kVar, i9, z8, i10, i11, list, kVar2, hVar, interfaceC1604o0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        return t.c(null, null) && t.c(this.f14541b, textAnnotatedStringElement.f14541b) && t.c(this.f14542c, textAnnotatedStringElement.f14542c) && t.c(this.f14549j, textAnnotatedStringElement.f14549j) && t.c(this.f14543d, textAnnotatedStringElement.f14543d) && t.c(this.f14544e, textAnnotatedStringElement.f14544e) && p216z1.t.e(this.f14545f, textAnnotatedStringElement.f14545f) && this.f14546g == textAnnotatedStringElement.f14546g && this.f14547h == textAnnotatedStringElement.f14547h && this.f14548i == textAnnotatedStringElement.f14548i && t.c(this.f14550k, textAnnotatedStringElement.f14550k) && t.c(this.f14551l, textAnnotatedStringElement.f14551l);
    }

    @Override // p056g1.U
    public int hashCode() {
        int iHashCode = ((((this.f14541b.hashCode() * 31) + this.f14542c.hashCode()) * 31) + this.f14543d.hashCode()) * 31;
        k kVar = this.f14544e;
        int iHashCode2 = (((((((((iHashCode + (kVar != null ? kVar.hashCode() : 0)) * 31) + p216z1.t.f(this.f14545f)) * 31) + Boolean.hashCode(this.f14546g)) * 31) + this.f14547h) * 31) + this.f14548i) * 31;
        List list = this.f14549j;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        k kVar2 = this.f14550k;
        int iHashCode4 = (iHashCode3 + (kVar2 != null ? kVar2.hashCode() : 0)) * 31;
        h hVar = this.f14551l;
        return (iHashCode4 + (hVar != null ? hVar.hashCode() : 0)) * 31;
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public p151r0.k k() {
        return new p151r0.k(this.f14541b, this.f14542c, this.f14543d, this.f14544e, this.f14545f, this.f14546g, this.f14547h, this.f14548i, this.f14549j, this.f14550k, this.f14551l, null, null);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void p(p151r0.k kVar) {
        kVar.k2(kVar.x2(null, this.f14542c), kVar.z2(this.f14541b), kVar.y2(this.f14542c, this.f14549j, this.f14548i, this.f14547h, this.f14546g, this.f14543d, this.f14545f), kVar.w2(this.f14544e, this.f14550k, this.f14551l));
    }

    public /* synthetic */ TextAnnotatedStringElement(C2739d c2739d, I i8, AbstractC3009n.b bVar, k kVar, int i9, boolean z8, int i10, int i11, List list, k kVar2, h hVar, InterfaceC1604o0 interfaceC1604o0, int i12, AbstractC2633k abstractC2633k) {
        this(c2739d, i8, bVar, (i12 & 8) != 0 ? null : kVar, (i12 & 16) != 0 ? p216z1.t.f39054a.a() : i9, (i12 & 32) != 0 ? true : z8, (i12 & 64) != 0 ? Integer.MAX_VALUE : i10, (i12 & 128) != 0 ? 1 : i11, (i12 & 256) != 0 ? null : list, (i12 & 512) != 0 ? null : kVar2, (i12 & 1024) != 0 ? null : hVar, (i12 & 2048) != 0 ? null : interfaceC1604o0, null);
    }

    public TextAnnotatedStringElement(C2739d c2739d, I i8, AbstractC3009n.b bVar, k kVar, int i9, boolean z8, int i10, int i11, List list, k kVar2, h hVar, InterfaceC1604o0 interfaceC1604o0) {
        this.f14541b = c2739d;
        this.f14542c = i8;
        this.f14543d = bVar;
        this.f14544e = kVar;
        this.f14545f = i9;
        this.f14546g = z8;
        this.f14547h = i10;
        this.f14548i = i11;
        this.f14549j = list;
        this.f14550k = kVar2;
        this.f14551l = hVar;
    }
}
