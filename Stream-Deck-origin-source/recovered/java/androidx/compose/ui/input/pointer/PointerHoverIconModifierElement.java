package androidx.compose.ui.input.pointer;

import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p011b1.C1771t;
import p011b1.InterfaceC1772u;
import p056g1.U;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class PointerHoverIconModifierElement extends U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1772u f14729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14730c;

    public /* synthetic */ PointerHoverIconModifierElement(InterfaceC1772u interfaceC1772u, boolean z8, int i8, AbstractC2633k abstractC2633k) {
        this(interfaceC1772u, (i8 & 2) != 0 ? false : z8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointerHoverIconModifierElement)) {
            return false;
        }
        PointerHoverIconModifierElement pointerHoverIconModifierElement = (PointerHoverIconModifierElement) obj;
        return t.c(this.f14729b, pointerHoverIconModifierElement.f14729b) && this.f14730c == pointerHoverIconModifierElement.f14730c;
    }

    @Override // p056g1.U
    public int hashCode() {
        return (this.f14729b.hashCode() * 31) + Boolean.hashCode(this.f14730c);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public C1771t k() {
        return new C1771t(this.f14729b, this.f14730c);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void p(C1771t c1771t) {
        c1771t.o2(this.f14729b);
        c1771t.p2(this.f14730c);
    }

    public String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.f14729b + ", overrideDescendants=" + this.f14730c + ')';
    }

    public PointerHoverIconModifierElement(InterfaceC1772u interfaceC1772u, boolean z8) {
        this.f14729b = interfaceC1772u;
        this.f14730c = z8;
    }
}
