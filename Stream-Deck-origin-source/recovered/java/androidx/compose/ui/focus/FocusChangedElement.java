package androidx.compose.ui.focus;

import kotlin.jvm.internal.t;
import p056g1.U;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
final class FocusChangedElement extends U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q6.k f14574b;

    public FocusChangedElement(Q6.k kVar) {
        this.f14574b = kVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusChangedElement) && t.c(this.f14574b, ((FocusChangedElement) obj).f14574b);
    }

    @Override // p056g1.U
    public int hashCode() {
        return this.f14574b.hashCode();
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public P0.b k() {
        return new P0.b(this.f14574b);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void p(P0.b bVar) {
        bVar.d2(this.f14574b);
    }

    public String toString() {
        return "FocusChangedElement(onFocusChanged=" + this.f14574b + ')';
    }
}
