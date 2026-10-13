package N4;

/* JADX INFO: renamed from: N4.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1296t {
    public static int a(int i8, int i9, String str) {
        String strA;
        if (i8 >= 0 && i8 < i9) {
            return i8;
        }
        if (i8 < 0) {
            strA = AbstractC1318v.a("%s (%s) must not be negative", "index", Integer.valueOf(i8));
        } else {
            if (i9 < 0) {
                throw new IllegalArgumentException("negative size: " + i9);
            }
            strA = AbstractC1318v.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i8), Integer.valueOf(i9));
        }
        throw new IndexOutOfBoundsException(strA);
    }

    public static int b(int i8, int i9, String str) {
        if (i8 < 0 || i8 > i9) {
            throw new IndexOutOfBoundsException(f(i8, i9, "index"));
        }
        return i8;
    }

    public static void c(boolean z8) {
        if (!z8) {
            throw new IllegalArgumentException();
        }
    }

    public static void d(int i8, int i9, int i10) {
        String strF;
        if (i8 < 0 || i9 < i8 || i9 > i10) {
            if (i8 < 0 || i8 > i10) {
                strF = f(i8, i10, "start index");
            } else {
                strF = (i9 < 0 || i9 > i10) ? f(i9, i10, "end index") : AbstractC1318v.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i9), Integer.valueOf(i8));
            }
            throw new IndexOutOfBoundsException(strF);
        }
    }

    public static void e(boolean z8, Object obj) {
        if (!z8) {
            throw new IllegalStateException((String) obj);
        }
    }

    public static String f(int i8, int i9, String str) {
        if (i8 < 0) {
            return AbstractC1318v.a("%s (%s) must not be negative", str, Integer.valueOf(i8));
        }
        if (i9 >= 0) {
            return AbstractC1318v.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i8), Integer.valueOf(i9));
        }
        throw new IllegalArgumentException("negative size: " + i9);
    }
}
