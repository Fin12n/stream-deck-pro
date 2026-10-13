package androidx.compose.foundation.text.modifiers;

import R0.InterfaceC1604o0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p056g1.U;
import p128o1.I;
import p151r0.l;
import p168t1.AbstractC3009n;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class TextStringSimpleElement extends U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final I f14553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC3009n.b f14554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f14556f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f14557g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f14558h;

    public /* synthetic */ TextStringSimpleElement(String str, I i8, AbstractC3009n.b bVar, int i9, boolean z8, int i10, int i11, InterfaceC1604o0 interfaceC1604o0, AbstractC2633k abstractC2633k) {
        this(str, i8, bVar, i9, z8, i10, i11, interfaceC1604o0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        return t.c(null, null) && t.c(this.f14552b, textStringSimpleElement.f14552b) && t.c(this.f14553c, textStringSimpleElement.f14553c) && t.c(this.f14554d, textStringSimpleElement.f14554d) && p216z1.t.e(this.f14555e, textStringSimpleElement.f14555e) && this.f14556f == textStringSimpleElement.f14556f && this.f14557g == textStringSimpleElement.f14557g && this.f14558h == textStringSimpleElement.f14558h;
    }

    @Override // p056g1.U
    public int hashCode() {
        return ((((((((((((this.f14552b.hashCode() * 31) + this.f14553c.hashCode()) * 31) + this.f14554d.hashCode()) * 31) + p216z1.t.f(this.f14555e)) * 31) + Boolean.hashCode(this.f14556f)) * 31) + this.f14557g) * 31) + this.f14558h) * 31;
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public l k() {
        return new l(this.f14552b, this.f14553c, this.f14554d, this.f14555e, this.f14556f, this.f14557g, this.f14558h, null, null);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void p(l lVar) {
        lVar.k2(lVar.q2(null, this.f14553c), lVar.s2(this.f14552b), lVar.r2(this.f14553c, this.f14558h, this.f14557g, this.f14556f, this.f14554d, this.f14555e));
    }

    public /* synthetic */ TextStringSimpleElement(String str, I i8, AbstractC3009n.b bVar, int i9, boolean z8, int i10, int i11, InterfaceC1604o0 interfaceC1604o0, int i12, AbstractC2633k abstractC2633k) {
        this(str, i8, bVar, (i12 & 8) != 0 ? p216z1.t.f39054a.a() : i9, (i12 & 16) != 0 ? true : z8, (i12 & 32) != 0 ? Integer.MAX_VALUE : i10, (i12 & 64) != 0 ? 1 : i11, (i12 & 128) != 0 ? null : interfaceC1604o0, null);
    }

    public TextStringSimpleElement(String str, I i8, AbstractC3009n.b bVar, int i9, boolean z8, int i10, int i11, InterfaceC1604o0 interfaceC1604o0) {
        this.f14552b = str;
        this.f14553c = i8;
        this.f14554d = bVar;
        this.f14555e = i9;
        this.f14556f = z8;
        this.f14557g = i10;
        this.f14558h = i11;
    }
}
