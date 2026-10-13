package p065h1;

import A1.h;
import A1.i;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface R0 {
    long a();

    long b();

    long c();

    default long d() {
        float f8 = 48;
        return i.b(h.m(f8), h.m(f8));
    }

    default float e() {
        return Float.MAX_VALUE;
    }

    float f();
}
