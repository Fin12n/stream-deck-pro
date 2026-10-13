package S;

import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static f h(int i8, int i9, Rect rect, Size size, int i10, boolean z8) {
        return i(i8, i9, rect, size, i10, z8, false);
    }

    public static f i(int i8, int i9, Rect rect, Size size, int i10, boolean z8, boolean z9) {
        return new b(UUID.randomUUID(), i8, i9, rect, size, i10, z8, z9);
    }

    public abstract Rect a();

    public abstract int b();

    public abstract int c();

    public abstract Size d();

    public abstract int e();

    public abstract UUID f();

    public abstract boolean g();

    public abstract boolean j();
}
