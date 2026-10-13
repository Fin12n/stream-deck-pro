package P0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface f {
    static /* synthetic */ void f(f fVar, boolean z8, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clearFocus");
        }
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        fVar.n(z8);
    }

    boolean i(int i8);

    void n(boolean z8);
}
