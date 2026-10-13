package androidx.compose.ui.draw;

import O0.g;
import Q6.k;
import kotlin.jvm.internal.t;
import p056g1.U;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
final class DrawBehindElement extends U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f14560b;

    public DrawBehindElement(k kVar) {
        this.f14560b = kVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawBehindElement) && t.c(this.f14560b, ((DrawBehindElement) obj).f14560b);
    }

    @Override // p056g1.U
    public int hashCode() {
        return this.f14560b.hashCode();
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public g k() {
        return new g(this.f14560b);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void p(g gVar) {
        gVar.d2(this.f14560b);
    }

    public String toString() {
        return "DrawBehindElement(onDraw=" + this.f14560b + ')';
    }
}
