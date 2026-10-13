package K2;

import U1.c0;
import android.graphics.Rect;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I2.b f4598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f4599b;

    public k(I2.b _bounds, c0 _windowInsetsCompat) {
        t.g(_bounds, "_bounds");
        t.g(_windowInsetsCompat, "_windowInsetsCompat");
        this.f4598a = _bounds;
        this.f4599b = _windowInsetsCompat;
    }

    public final Rect a() {
        return this.f4598a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!t.c(k.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        t.e(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        k kVar = (k) obj;
        return t.c(this.f4598a, kVar.f4598a) && t.c(this.f4599b, kVar.f4599b);
    }

    public int hashCode() {
        return (this.f4598a.hashCode() * 31) + this.f4599b.hashCode();
    }

    public String toString() {
        return "WindowMetrics( bounds=" + this.f4598a + ", windowInsetsCompat=" + this.f4599b + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ k(Rect rect, c0 c0Var, int i8, AbstractC2633k abstractC2633k) {
        if ((i8 & 2) != 0) {
            c0Var = new c0.b().a();
            t.f(c0Var, "Builder().build()");
        }
        this(rect, c0Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(Rect bounds, c0 insets) {
        this(new I2.b(bounds), insets);
        t.g(bounds, "bounds");
        t.g(insets, "insets");
    }
}
