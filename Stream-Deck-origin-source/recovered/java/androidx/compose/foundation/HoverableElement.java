package androidx.compose.foundation;

import kotlin.jvm.internal.t;
import p046f0.C;
import p056g1.U;
import p073i0.m;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
final class HoverableElement extends U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f14305b;

    public HoverableElement(m mVar) {
        this.f14305b = mVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HoverableElement) && t.c(((HoverableElement) obj).f14305b, this.f14305b);
    }

    @Override // p056g1.U
    public int hashCode() {
        return this.f14305b.hashCode() * 31;
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public C k() {
        return new C(this.f14305b);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void p(C c8) {
        c8.g2(this.f14305b);
    }
}
