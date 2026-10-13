package W6;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class m {
    public static final void a(boolean z8, Number step) {
        t.g(step, "step");
        if (z8) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + step + com.amazon.a.a.o.c.a.b.f16789a);
    }

    public static e b(float f8, float f9) {
        return new d(f8, f9);
    }
}
