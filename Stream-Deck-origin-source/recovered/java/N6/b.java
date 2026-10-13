package N6;

import Z6.w;
import java.io.File;
import kotlin.jvm.internal.t;
import p043e6.dT.GIGvBf;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class b {
    public static final int a(String str) {
        int iX;
        char c8 = File.separatorChar;
        int iX2 = w.X(str, c8, 0, false, 4, null);
        if (iX2 == 0) {
            if (str.length() <= 1 || str.charAt(1) != c8 || (iX = w.X(str, c8, 2, false, 4, null)) < 0) {
                return 1;
            }
            int iX3 = w.X(str, c8, iX + 1, false, 4, null);
            return iX3 >= 0 ? iX3 + 1 : str.length();
        }
        if (iX2 > 0 && str.charAt(iX2 - 1) == ':') {
            return iX2 + 1;
        }
        if (iX2 == -1 && w.P(str, ':', false, 2, null)) {
            return str.length();
        }
        return 0;
    }

    public static final boolean b(File file) {
        t.g(file, "<this>");
        String path = file.getPath();
        t.f(path, GIGvBf.BrehZYOlLkQ);
        return a(path) > 0;
    }
}
