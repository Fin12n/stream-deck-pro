package p011b1;

import kotlin.jvm.internal.t;

/* JADX INFO: renamed from: b1.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C1754b implements InterfaceC1772u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15734b;

    public C1754b(int i8) {
        this.f15734b = i8;
    }

    public final int a() {
        return this.f15734b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!t.c(C1754b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        t.e(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.f15734b == ((C1754b) obj).f15734b;
    }

    public int hashCode() {
        return this.f15734b;
    }

    public String toString() {
        return "AndroidPointerIcon(type=" + this.f15734b + ')';
    }
}
