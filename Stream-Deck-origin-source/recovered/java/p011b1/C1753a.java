package p011b1;

import android.view.PointerIcon;
import kotlin.jvm.internal.t;

/* JADX INFO: renamed from: b1.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C1753a implements InterfaceC1772u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PointerIcon f15733b;

    public C1753a(PointerIcon pointerIcon) {
        this.f15733b = pointerIcon;
    }

    public final PointerIcon a() {
        return this.f15733b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!t.c(C1753a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        t.e(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIcon");
        return t.c(this.f15733b, ((C1753a) obj).f15733b);
    }

    public int hashCode() {
        return this.f15733b.hashCode();
    }

    public String toString() {
        return "AndroidPointerIcon(pointerIcon=" + this.f15733b + ')';
    }
}
