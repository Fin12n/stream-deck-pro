package Z6;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class b extends C1694a {
    public static final boolean d(char c8, char c9, boolean z8) {
        if (c8 == c9) {
            return true;
        }
        if (!z8) {
            return false;
        }
        char upperCase = Character.toUpperCase(c8);
        char upperCase2 = Character.toUpperCase(c9);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static boolean e(char c8) {
        return 55296 <= c8 && c8 < 57344;
    }

    public static String f(char c8) {
        return A.a(c8);
    }
}
