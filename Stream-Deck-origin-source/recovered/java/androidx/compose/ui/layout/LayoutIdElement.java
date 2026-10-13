package androidx.compose.ui.layout;

import kotlin.jvm.internal.t;
import p038e1.C2249u;
import p056g1.U;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
final class LayoutIdElement extends U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14738b;

    public LayoutIdElement(Object obj) {
        this.f14738b = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutIdElement) && t.c(this.f14738b, ((LayoutIdElement) obj).f14738b);
    }

    @Override // p056g1.U
    public int hashCode() {
        return this.f14738b.hashCode();
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public C2249u k() {
        return new C2249u(this.f14738b);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void p(C2249u c2249u) {
        c2249u.d2(this.f14738b);
    }

    public String toString() {
        return "LayoutIdElement(layoutId=" + this.f14738b + ')';
    }
}
