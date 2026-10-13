package J0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f4026a = new Object();

    public static final Void e() {
        throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
    }

    public static final Void f() {
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }

    public static final void g(int i8, int i9) {
        if (i8 < 0 || i8 >= i9) {
            throw new IndexOutOfBoundsException("index (" + i8 + ") is out of bound of [0, " + i9 + ')');
        }
    }
}
