package androidx.compose.ui.graphics;

import Q6.k;
import R0.C1580c0;
import kotlin.jvm.internal.t;
import p056g1.U;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
final class BlockGraphicsLayerElement extends U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f14643b;

    public BlockGraphicsLayerElement(k kVar) {
        this.f14643b = kVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BlockGraphicsLayerElement) && t.c(this.f14643b, ((BlockGraphicsLayerElement) obj).f14643b);
    }

    @Override // p056g1.U
    public int hashCode() {
        return this.f14643b.hashCode();
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public C1580c0 k() {
        return new C1580c0(this.f14643b);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void p(C1580c0 c1580c0) {
        c1580c0.f2(this.f14643b);
        c1580c0.e2();
    }

    public String toString() {
        return "BlockGraphicsLayerElement(block=" + this.f14643b + ')';
    }
}
