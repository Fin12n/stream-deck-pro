package p159s0;

import A1.h;
import Q0.f;
import Q0.g;
import p110m1.w;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f32858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f32859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w f32860c = new w("SelectionHandleInfo", null, 2, null);

    static {
        float f8 = 25;
        f32858a = h.m(f8);
        f32859b = h.m(f8);
    }

    public static final long a(long j8) {
        return g.a(f.o(j8), f.p(j8) - 1.0f);
    }

    public static final float b() {
        return f32859b;
    }

    public static final float c() {
        return f32858a;
    }

    public static final w d() {
        return f32860c;
    }
}
