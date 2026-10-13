package C6;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: C6.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class C0918g {
    public static void a(Throwable th, Throwable exception) throws IllegalAccessException, InvocationTargetException {
        kotlin.jvm.internal.t.g(th, "<this>");
        kotlin.jvm.internal.t.g(exception, "exception");
        if (th != exception) {
            K6.b.f4727a.a(th, exception);
        }
    }

    public static String b(Throwable th) {
        kotlin.jvm.internal.t.g(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        kotlin.jvm.internal.t.f(string, "toString(...)");
        return string;
    }
}
