package androidx.compose.foundation.text.modifiers;

import Q6.k;
import R0.InterfaceC1604o0;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p056g1.U;
import p128o1.C2739d;
import p128o1.I;
import p151r0.g;
import p151r0.h;
import p168t1.AbstractC3009n;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class SelectableTextAnnotatedStringElement extends U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2739d f14530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final I f14531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC3009n.b f14532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f14533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f14534f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f14535g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f14536h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f14537i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f14538j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final k f14539k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h f14540l;

    public /* synthetic */ SelectableTextAnnotatedStringElement(C2739d c2739d, I i8, AbstractC3009n.b bVar, k kVar, int i9, boolean z8, int i10, int i11, List list, k kVar2, h hVar, InterfaceC1604o0 interfaceC1604o0, AbstractC2633k abstractC2633k) {
        this(c2739d, i8, bVar, kVar, i9, z8, i10, i11, list, kVar2, hVar, interfaceC1604o0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectableTextAnnotatedStringElement)) {
            return false;
        }
        SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement = (SelectableTextAnnotatedStringElement) obj;
        return t.c(null, null) && t.c(this.f14530b, selectableTextAnnotatedStringElement.f14530b) && t.c(this.f14531c, selectableTextAnnotatedStringElement.f14531c) && t.c(this.f14538j, selectableTextAnnotatedStringElement.f14538j) && t.c(this.f14532d, selectableTextAnnotatedStringElement.f14532d) && t.c(this.f14533e, selectableTextAnnotatedStringElement.f14533e) && p216z1.t.e(this.f14534f, selectableTextAnnotatedStringElement.f14534f) && this.f14535g == selectableTextAnnotatedStringElement.f14535g && this.f14536h == selectableTextAnnotatedStringElement.f14536h && this.f14537i == selectableTextAnnotatedStringElement.f14537i && t.c(this.f14539k, selectableTextAnnotatedStringElement.f14539k) && t.c(this.f14540l, selectableTextAnnotatedStringElement.f14540l);
    }

    @Override // p056g1.U
    public int hashCode() {
        int iHashCode = ((((this.f14530b.hashCode() * 31) + this.f14531c.hashCode()) * 31) + this.f14532d.hashCode()) * 31;
        k kVar = this.f14533e;
        int iHashCode2 = (((((((((iHashCode + (kVar != null ? kVar.hashCode() : 0)) * 31) + p216z1.t.f(this.f14534f)) * 31) + Boolean.hashCode(this.f14535g)) * 31) + this.f14536h) * 31) + this.f14537i) * 31;
        List list = this.f14538j;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        k kVar2 = this.f14539k;
        int iHashCode4 = (iHashCode3 + (kVar2 != null ? kVar2.hashCode() : 0)) * 31;
        h hVar = this.f14540l;
        return (iHashCode4 + (hVar != null ? hVar.hashCode() : 0)) * 31;
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public g k() {
        return new g(this.f14530b, this.f14531c, this.f14532d, this.f14533e, this.f14534f, this.f14535g, this.f14536h, this.f14537i, this.f14538j, this.f14539k, this.f14540l, null, null);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void p(g gVar) {
        gVar.i2(this.f14530b, this.f14531c, this.f14538j, this.f14537i, this.f14536h, this.f14535g, this.f14532d, this.f14534f, this.f14533e, this.f14539k, this.f14540l, null);
    }

    public String toString() {
        return "SelectableTextAnnotatedStringElement(text=" + ((Object) this.f14530b) + ", style=" + this.f14531c + ", fontFamilyResolver=" + this.f14532d + ", onTextLayout=" + this.f14533e + ", overflow=" + ((Object) p216z1.t.g(this.f14534f)) + ", softWrap=" + this.f14535g + ", maxLines=" + this.f14536h + ", minLines=" + this.f14537i + ", placeholders=" + this.f14538j + ", onPlaceholderLayout=" + this.f14539k + ", selectionController=" + this.f14540l + ", color=" + ((Object) null) + ')';
    }

    public /* synthetic */ SelectableTextAnnotatedStringElement(C2739d c2739d, I i8, AbstractC3009n.b bVar, k kVar, int i9, boolean z8, int i10, int i11, List list, k kVar2, h hVar, InterfaceC1604o0 interfaceC1604o0, int i12, AbstractC2633k abstractC2633k) {
        this(c2739d, i8, bVar, (i12 & 8) != 0 ? null : kVar, (i12 & 16) != 0 ? p216z1.t.f39054a.a() : i9, (i12 & 32) != 0 ? true : z8, (i12 & 64) != 0 ? Integer.MAX_VALUE : i10, (i12 & 128) != 0 ? 1 : i11, (i12 & 256) != 0 ? null : list, (i12 & 512) != 0 ? null : kVar2, (i12 & 1024) != 0 ? null : hVar, (i12 & 2048) != 0 ? null : interfaceC1604o0, null);
    }

    public SelectableTextAnnotatedStringElement(C2739d c2739d, I i8, AbstractC3009n.b bVar, k kVar, int i9, boolean z8, int i10, int i11, List list, k kVar2, h hVar, InterfaceC1604o0 interfaceC1604o0) {
        this.f14530b = c2739d;
        this.f14531c = i8;
        this.f14532d = bVar;
        this.f14533e = kVar;
        this.f14534f = i9;
        this.f14535g = z8;
        this.f14536h = i10;
        this.f14537i = i11;
        this.f14538j = list;
        this.f14539k = kVar2;
        this.f14540l = hVar;
    }
}
