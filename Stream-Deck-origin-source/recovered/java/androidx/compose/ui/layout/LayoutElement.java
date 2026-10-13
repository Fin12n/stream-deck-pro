package androidx.compose.ui.layout;

import Q6.p;
import kotlin.jvm.internal.t;
import p038e1.C2254z;
import p056g1.U;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
final class LayoutElement extends U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f14737b;

    public LayoutElement(p pVar) {
        this.f14737b = pVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutElement) && t.c(this.f14737b, ((LayoutElement) obj).f14737b);
    }

    @Override // p056g1.U
    public int hashCode() {
        return this.f14737b.hashCode();
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public C2254z k() {
        return new C2254z(this.f14737b);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void p(C2254z c2254z) {
        c2254z.d2(this.f14737b);
    }

    public String toString() {
        return "LayoutElement(measure=" + this.f14737b + ')';
    }
}
