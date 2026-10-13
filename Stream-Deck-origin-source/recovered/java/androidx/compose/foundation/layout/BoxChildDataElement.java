package androidx.compose.foundation.layout;

import Q6.k;
import kotlin.jvm.internal.t;
import p056g1.U;
import p082j0.C2600d;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
final class BoxChildDataElement extends U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L0.c f14437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f14439d;

    public BoxChildDataElement(L0.c cVar, boolean z8, k kVar) {
        this.f14437b = cVar;
        this.f14438c = z8;
        this.f14439d = kVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        BoxChildDataElement boxChildDataElement = obj instanceof BoxChildDataElement ? (BoxChildDataElement) obj : null;
        return boxChildDataElement != null && t.c(this.f14437b, boxChildDataElement.f14437b) && this.f14438c == boxChildDataElement.f14438c;
    }

    @Override // p056g1.U
    public int hashCode() {
        return (this.f14437b.hashCode() * 31) + Boolean.hashCode(this.f14438c);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public C2600d k() {
        return new C2600d(this.f14437b, this.f14438c);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void p(C2600d c2600d) {
        c2600d.g2(this.f14437b);
        c2600d.h2(this.f14438c);
    }
}
