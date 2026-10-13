package p216z1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static final int e(int i8, int i9, int i10) {
        return i8 | (i9 << 8) | (i10 << 16);
    }

    public static final int f(int i8) {
        return i8 & 255;
    }

    public static final int g(int i8) {
        return (i8 >> 8) & 255;
    }

    public static final int h(int i8) {
        return (i8 >> 16) & 255;
    }
}
