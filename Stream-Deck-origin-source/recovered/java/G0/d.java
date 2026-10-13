package G0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f2603a = new d();

    public static final void a(int i8, int i9) {
        if (i8 < 0 || i8 >= i9) {
            throw new IndexOutOfBoundsException("index: " + i8 + ", size: " + i9);
        }
    }

    public static final void b(int i8, int i9) {
        if (i8 < 0 || i8 > i9) {
            throw new IndexOutOfBoundsException("index: " + i8 + ", size: " + i9);
        }
    }

    public static final void c(int i8, int i9, int i10) {
        if (i8 < 0 || i9 > i10) {
            throw new IndexOutOfBoundsException("fromIndex: " + i8 + ", toIndex: " + i9 + ", size: " + i10);
        }
        if (i8 <= i9) {
            return;
        }
        throw new IllegalArgumentException("fromIndex: " + i8 + " > toIndex: " + i9);
    }
}
