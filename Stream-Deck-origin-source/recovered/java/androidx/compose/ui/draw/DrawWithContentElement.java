package androidx.compose.ui.draw;

import O0.j;
import Q6.k;
import kotlin.jvm.internal.t;
import p056g1.U;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
final class DrawWithContentElement extends U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f14562b;

    public DrawWithContentElement(k kVar) {
        this.f14562b = kVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithContentElement) && t.c(this.f14562b, ((DrawWithContentElement) obj).f14562b);
    }

    @Override // p056g1.U
    public int hashCode() {
        return this.f14562b.hashCode();
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public j k() {
        return new j(this.f14562b);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void p(j jVar) {
        jVar.d2(this.f14562b);
    }

    public String toString() {
        return "DrawWithContentElement(onDraw=" + this.f14562b + ')';
    }
}
