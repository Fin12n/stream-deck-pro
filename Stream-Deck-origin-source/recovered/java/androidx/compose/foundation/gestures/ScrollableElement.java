package androidx.compose.foundation.gestures;

import kotlin.jvm.internal.t;
import p046f0.S;
import p055g0.B;
import p055g0.InterfaceC2329j;
import p055g0.M;
import p055g0.w;
import p056g1.U;
import p073i0.m;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
final class ScrollableElement extends U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f14390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B f14391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final S f14392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f14393e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f14394f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w f14395g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m f14396h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final InterfaceC2329j f14397i;

    public ScrollableElement(M m8, B b8, S s8, boolean z8, boolean z9, w wVar, m mVar, InterfaceC2329j interfaceC2329j) {
        this.f14390b = m8;
        this.f14391c = b8;
        this.f14392d = s8;
        this.f14393e = z8;
        this.f14394f = z9;
        this.f14395g = wVar;
        this.f14396h = mVar;
        this.f14397i = interfaceC2329j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) obj;
        return t.c(this.f14390b, scrollableElement.f14390b) && this.f14391c == scrollableElement.f14391c && t.c(this.f14392d, scrollableElement.f14392d) && this.f14393e == scrollableElement.f14393e && this.f14394f == scrollableElement.f14394f && t.c(this.f14395g, scrollableElement.f14395g) && t.c(this.f14396h, scrollableElement.f14396h) && t.c(this.f14397i, scrollableElement.f14397i);
    }

    @Override // p056g1.U
    public int hashCode() {
        int iHashCode = ((this.f14390b.hashCode() * 31) + this.f14391c.hashCode()) * 31;
        S s8 = this.f14392d;
        int iHashCode2 = (((((iHashCode + (s8 != null ? s8.hashCode() : 0)) * 31) + Boolean.hashCode(this.f14393e)) * 31) + Boolean.hashCode(this.f14394f)) * 31;
        w wVar = this.f14395g;
        int iHashCode3 = (iHashCode2 + (wVar != null ? wVar.hashCode() : 0)) * 31;
        m mVar = this.f14396h;
        return ((iHashCode3 + (mVar != null ? mVar.hashCode() : 0)) * 31) + this.f14397i.hashCode();
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public b k() {
        return new b(this.f14390b, this.f14391c, this.f14392d, this.f14393e, this.f14394f, this.f14395g, this.f14396h, this.f14397i);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void p(b bVar) {
        bVar.j2(this.f14390b, this.f14391c, this.f14392d, this.f14393e, this.f14394f, this.f14395g, this.f14396h, this.f14397i);
    }
}
