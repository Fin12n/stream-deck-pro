package q7;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class B0 {
    public static /* synthetic */ void c(B0 b8, int i8, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ensureCapacity");
        }
        if ((i9 & 1) != 0) {
            i8 = b8.d() + 1;
        }
        b8.b(i8);
    }

    public abstract Object a();

    public abstract void b(int i8);

    public abstract int d();
}
