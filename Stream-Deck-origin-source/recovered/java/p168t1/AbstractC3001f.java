package p168t1;

/* JADX INFO: renamed from: t1.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3001f {
    public static final C a(C.a aVar) {
        return aVar.f();
    }

    public static final int b(boolean z8, boolean z9) {
        if (z9 && z8) {
            return 3;
        }
        if (z8) {
            return 1;
        }
        return z9 ? 2 : 0;
    }

    public static final int c(C c8, int i8) {
        return b(c8.compareTo(a(C.f33980b)) >= 0, y.f(i8, y.f34112b.a()));
    }
}
