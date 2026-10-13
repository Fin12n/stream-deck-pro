package p038e1;

import Q0.l;
import Q0.m;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class g0 {
    public static final long a(float f8, float f9) {
        return f0.a((((long) Float.floatToRawIntBits(f9)) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32));
    }

    public static final long b(long j8, long j9) {
        return m.a(l.i(j8) * f0.b(j9), l.g(j8) * f0.c(j9));
    }
}
