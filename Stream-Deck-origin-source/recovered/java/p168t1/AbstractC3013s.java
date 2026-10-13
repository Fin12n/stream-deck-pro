package p168t1;

/* JADX INFO: renamed from: t1.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3013s {
    public static final InterfaceC3008m a(int i8, C c8, int i9, int i10) {
        return new M(i8, c8, i9, new B.d(new B.a[0]), i10, null);
    }

    public static /* synthetic */ InterfaceC3008m b(int i8, C c8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            c8 = C.f33980b.c();
        }
        if ((i11 & 4) != 0) {
            i9 = y.f34112b.b();
        }
        if ((i11 & 8) != 0) {
            i10 = w.f34108a.b();
        }
        return a(i8, c8, i9, i10);
    }
}
