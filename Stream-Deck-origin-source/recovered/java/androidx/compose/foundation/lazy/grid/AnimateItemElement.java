package androidx.compose.foundation.lazy.grid;

import kotlin.jvm.internal.t;
import p037e0.E;
import p056g1.U;
import p109m0.C2670h;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
final class AnimateItemElement extends U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E f14527b;

    public AnimateItemElement(E e8) {
        this.f14527b = e8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AnimateItemElement) && t.c(this.f14527b, ((AnimateItemElement) obj).f14527b);
    }

    @Override // p056g1.U
    public int hashCode() {
        return this.f14527b.hashCode();
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public C2670h k() {
        return new C2670h(null, this.f14527b);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void p(C2670h c2670h) {
        c2670h.f2(this.f14527b);
    }

    public String toString() {
        return "AnimateItemElement(placementSpec=" + this.f14527b + ')';
    }
}
