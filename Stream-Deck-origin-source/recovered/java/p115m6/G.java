package p115m6;

import Z6.w;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class G {
    public static final j a(String str) {
        t.g(str, "<this>");
        return new j(str);
    }

    public static final char b(char c8) {
        if ('A' > c8 || c8 >= '[') {
            return (c8 < 0 || c8 >= 128) ? Character.toLowerCase(c8) : c8;
        }
        return (char) (c8 + ' ');
    }

    public static final String c(String str) {
        t.g(str, "<this>");
        int length = str.length();
        int i8 = 0;
        while (true) {
            if (i8 >= length) {
                i8 = -1;
                break;
            }
            char cCharAt = str.charAt(i8);
            if (b(cCharAt) != cCharAt) {
                break;
            }
            i8++;
        }
        if (i8 == -1) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        sb.append((CharSequence) str, 0, i8);
        int iS = w.S(str);
        if (i8 <= iS) {
            while (true) {
                sb.append(b(str.charAt(i8)));
                if (i8 == iS) {
                    break;
                }
                i8++;
            }
        }
        String string = sb.toString();
        t.f(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }
}
