package androidx.compose.foundation.layout;

import kotlin.jvm.internal.t;
import p056g1.U;
import p082j0.c0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class VerticalAlignElement extends U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L0.c.InterfaceC0174c f14473b;

    public VerticalAlignElement(L0.c.InterfaceC0174c interfaceC0174c) {
        this.f14473b = interfaceC0174c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        VerticalAlignElement verticalAlignElement = obj instanceof VerticalAlignElement ? (VerticalAlignElement) obj : null;
        if (verticalAlignElement == null) {
            return false;
        }
        return t.c(this.f14473b, verticalAlignElement.f14473b);
    }

    @Override // p056g1.U
    public int hashCode() {
        return this.f14473b.hashCode();
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public c0 k() {
        return new c0(this.f14473b);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void p(c0 c0Var) {
        c0Var.e2(this.f14473b);
    }
}
