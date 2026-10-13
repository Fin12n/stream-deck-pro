package p168t1;

import android.graphics.Typeface;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class K implements J {
    @Override // p168t1.J
    public Typeface a(E e8, C c8, int i8) {
        return c(e8.s(), c8, i8);
    }

    @Override // p168t1.J
    public Typeface b(C c8, int i8) {
        return c(null, c8, i8);
    }

    public final Typeface c(String str, C c8, int i8) {
        y.a aVar = y.f34112b;
        if (y.f(i8, aVar.b()) && t.c(c8, C.f33980b.c()) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), c8.s(), y.f(i8, aVar.a()));
    }
}
