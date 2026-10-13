package p135p0;

import A1.h;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f31037a = a(50);

    public static final f a(int i8) {
        return b(c.a(i8));
    }

    public static final f b(b bVar) {
        return new f(bVar, bVar, bVar, bVar);
    }

    public static final f c(float f8) {
        return b(c.b(f8));
    }

    public static final f d(float f8, float f9, float f10, float f11) {
        return new f(c.b(f8), c.b(f9), c.b(f10), c.b(f11));
    }

    public static /* synthetic */ f e(float f8, float f9, float f10, float f11, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = h.m(0);
        }
        if ((i8 & 2) != 0) {
            f9 = h.m(0);
        }
        if ((i8 & 4) != 0) {
            f10 = h.m(0);
        }
        if ((i8 & 8) != 0) {
            f11 = h.m(0);
        }
        return d(f8, f9, f10, f11);
    }

    public static final f f() {
        return f31037a;
    }
}
