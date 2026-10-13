package androidx.compose.foundation.layout;

import Q6.k;
import kotlin.jvm.internal.t;
import p056g1.U;
import p082j0.G;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
final class OffsetPxElement extends U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f14454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f14456d;

    public OffsetPxElement(k kVar, boolean z8, k kVar2) {
        this.f14454b = kVar;
        this.f14455c = z8;
        this.f14456d = kVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetPxElement offsetPxElement = obj instanceof OffsetPxElement ? (OffsetPxElement) obj : null;
        return offsetPxElement != null && t.c(this.f14454b, offsetPxElement.f14454b) && this.f14455c == offsetPxElement.f14455c;
    }

    @Override // p056g1.U
    public int hashCode() {
        return (this.f14454b.hashCode() * 31) + Boolean.hashCode(this.f14455c);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public G k() {
        return new G(this.f14454b, this.f14455c);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void p(G g8) {
        g8.f2(this.f14454b);
        g8.g2(this.f14455c);
    }

    public String toString() {
        return "OffsetPxModifier(offset=" + this.f14454b + ", rtlAware=" + this.f14455c + ')';
    }
}
