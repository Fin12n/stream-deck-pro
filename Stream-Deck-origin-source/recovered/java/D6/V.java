package D6;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class V {
    public static final void a(int i8, int i9) {
        String str;
        if (i8 <= 0 || i9 <= 0) {
            if (i8 != i9) {
                str = "Both size " + i8 + " and step " + i9 + " must be greater than zero.";
            } else {
                str = "size " + i8 + " must be greater than zero.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }
}
