package E2;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import com.elgato.streamdeck.vsd2.connection.Cjvi.LYdqVGvOGMNr;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f2160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f2161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f2162c;

    public static void a(String str) {
        b.a(h(str));
    }

    public static void b() {
        b.b();
    }

    public static boolean d() {
        return Build.VERSION.SDK_INT >= 29 ? c.a() : e();
    }

    public static boolean e() {
        try {
            if (f2161b == null) {
                f2160a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f2161b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f2161b.invoke(null, Long.valueOf(f2160a))).booleanValue();
        } catch (Exception e8) {
            c("isTagEnabled", e8);
            return false;
        }
    }

    public static void f(String str, int i8) {
        if (Build.VERSION.SDK_INT >= 29) {
            c.b(h(str), i8);
        } else {
            g(h(str), i8);
        }
    }

    public static void g(String str, int i8) {
        try {
            if (f2162c == null) {
                f2162c = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            f2162c.invoke(null, Long.valueOf(f2160a), str, Integer.valueOf(i8));
        } catch (Exception e8) {
            c("traceCounter", e8);
        }
    }

    public static String h(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    public static void c(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v(LYdqVGvOGMNr.glRKWG, "Unable to call " + str + " via reflection", exc);
    }
}
