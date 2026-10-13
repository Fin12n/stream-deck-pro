package androidx.compose.foundation.layout;

import kotlin.jvm.internal.t;
import p056g1.U;
import p082j0.C2615t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class HorizontalAlignElement extends U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L0.c.b f14444b;

    public HorizontalAlignElement(L0.c.b bVar) {
        this.f14444b = bVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        HorizontalAlignElement horizontalAlignElement = obj instanceof HorizontalAlignElement ? (HorizontalAlignElement) obj : null;
        if (horizontalAlignElement == null) {
            return false;
        }
        return t.c(this.f14444b, horizontalAlignElement.f14444b);
    }

    @Override // p056g1.U
    public int hashCode() {
        return this.f14444b.hashCode();
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public C2615t k() {
        return new C2615t(this.f14444b);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void p(C2615t c2615t) {
        c2615t.e2(this.f14444b);
    }
}
