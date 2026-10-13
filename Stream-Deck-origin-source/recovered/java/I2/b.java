package I2;

import android.graphics.Rect;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3733d;

    public b(int i8, int i9, int i10, int i11) {
        this.f3730a = i8;
        this.f3731b = i9;
        this.f3732c = i10;
        this.f3733d = i11;
        if (i8 > i10) {
            throw new IllegalArgumentException(("Left must be less than or equal to right, left: " + i8 + ", right: " + i10).toString());
        }
        if (i9 <= i11) {
            return;
        }
        throw new IllegalArgumentException(("top must be less than or equal to bottom, top: " + i9 + ", bottom: " + i11).toString());
    }

    public final int a() {
        return this.f3733d - this.f3731b;
    }

    public final int b() {
        return this.f3730a;
    }

    public final int c() {
        return this.f3731b;
    }

    public final int d() {
        return this.f3732c - this.f3730a;
    }

    public final boolean e() {
        return a() == 0 && d() == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!t.c(b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        t.e(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        b bVar = (b) obj;
        return this.f3730a == bVar.f3730a && this.f3731b == bVar.f3731b && this.f3732c == bVar.f3732c && this.f3733d == bVar.f3733d;
    }

    public final Rect f() {
        return new Rect(this.f3730a, this.f3731b, this.f3732c, this.f3733d);
    }

    public int hashCode() {
        return (((((this.f3730a * 31) + this.f3731b) * 31) + this.f3732c) * 31) + this.f3733d;
    }

    public String toString() {
        return b.class.getSimpleName() + " { [" + this.f3730a + ',' + this.f3731b + ',' + this.f3732c + ',' + this.f3733d + "] }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        t.g(rect, "rect");
    }
}
