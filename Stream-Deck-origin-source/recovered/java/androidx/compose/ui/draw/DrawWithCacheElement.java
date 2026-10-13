package androidx.compose.ui.draw;

import O0.d;
import O0.e;
import Q6.k;
import kotlin.jvm.internal.t;
import p056g1.U;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
final class DrawWithCacheElement extends U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f14561b;

    public DrawWithCacheElement(k kVar) {
        this.f14561b = kVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithCacheElement) && t.c(this.f14561b, ((DrawWithCacheElement) obj).f14561b);
    }

    @Override // p056g1.U
    public int hashCode() {
        return this.f14561b.hashCode();
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public d k() {
        return new d(new e(), this.f14561b);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void p(d dVar) {
        dVar.f2(this.f14561b);
    }

    public String toString() {
        return "DrawWithCacheElement(onBuildDrawCache=" + this.f14561b + ')';
    }
}
