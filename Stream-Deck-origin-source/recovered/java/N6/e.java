package N6;

import Z6.w;
import java.io.File;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class e extends d {
    public static String j(File file) {
        t.g(file, "<this>");
        String name = file.getName();
        t.f(name, "getName(...)");
        return w.U0(name, ".", null, 2, null);
    }

    public static final File k(File file, File relative) {
        t.g(file, "<this>");
        t.g(relative, "relative");
        if (b.b(relative)) {
            return relative;
        }
        String string = file.toString();
        t.f(string, "toString(...)");
        if (string.length() != 0) {
            char c8 = File.separatorChar;
            if (!w.P(string, c8, false, 2, null)) {
                return new File(string + c8 + relative);
            }
        }
        return new File(string + relative);
    }

    public static File l(File file, String relative) {
        t.g(file, "<this>");
        t.g(relative, "relative");
        return k(file, new File(relative));
    }
}
