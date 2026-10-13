package A;

import android.util.Log;

/* JADX INFO: renamed from: A.p0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0890p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f297a = 3;

    public static void a(String str, String str2) {
        String strK = k(str);
        if (g(strK, 3)) {
            Log.d(strK, str2);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        String strK = k(str);
        if (g(strK, 3)) {
            Log.d(strK, str2, th);
        }
    }

    public static void c(String str, String str2) {
        String strK = k(str);
        if (g(strK, 6)) {
            Log.e(strK, str2);
        }
    }

    public static void d(String str, String str2, Throwable th) {
        String strK = k(str);
        if (g(strK, 6)) {
            Log.e(strK, str2, th);
        }
    }

    public static void e(String str, String str2) {
        String strK = k(str);
        if (g(strK, 4)) {
            Log.i(strK, str2);
        }
    }

    public static boolean f(String str) {
        return g(k(str), 3);
    }

    public static boolean g(String str, int i8) {
        return f297a <= i8 || Log.isLoggable(str, i8);
    }

    public static boolean h(String str) {
        return g(k(str), 2);
    }

    public static void i() {
        f297a = 3;
    }

    public static void j(int i8) {
        f297a = i8;
    }

    public static void l(String str, String str2) {
        String strK = k(str);
        if (g(strK, 5)) {
            Log.w(strK, str2);
        }
    }

    public static void m(String str, String str2, Throwable th) {
        String strK = k(str);
        if (g(strK, 5)) {
            Log.w(strK, str2, th);
        }
    }

    public static String k(String str) {
        return str;
    }
}
