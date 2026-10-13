package B0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final void c(List list, int i8) {
        int size = list.size();
        if (i8 < 0 || i8 >= size) {
            throw new IndexOutOfBoundsException("Index " + i8 + " is out of bounds. The list has " + size + " elements.");
        }
    }

    public static final void d(List list, int i8, int i9) {
        int size = list.size();
        if (i8 > i9) {
            throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i8 + ") is greater than toIndex (" + i9 + ").");
        }
        if (i8 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i8 + ") is less than 0.");
        }
        if (i9 <= size) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i9 + ") is more than than the list size (" + size + ')');
    }
}
