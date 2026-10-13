package androidx.compose.ui.focus;

import kotlin.jvm.internal.t;
import p056g1.U;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
final class FocusRequesterElement extends U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f14589b;

    public FocusRequesterElement(g gVar) {
        this.f14589b = gVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && t.c(this.f14589b, ((FocusRequesterElement) obj).f14589b);
    }

    @Override // p056g1.U
    public int hashCode() {
        return this.f14589b.hashCode();
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public P0.k k() {
        return new P0.k(this.f14589b);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void p(P0.k kVar) {
        kVar.d2().d().z(kVar);
        kVar.e2(this.f14589b);
        kVar.d2().d().d(kVar);
    }

    public String toString() {
        return "FocusRequesterElement(focusRequester=" + this.f14589b + ')';
    }
}
