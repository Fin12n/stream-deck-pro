package X5;

import java.util.Set;

/* JADX INFO: renamed from: X5.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1683l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f11855a = D6.T.g('(', ')', '<', '>', '@', ',', ';', ':', '\\', '\"', '/', '[', ']', '?', '=', '{', '}', ' ', '\t', '\n', '\r');

    public static final boolean b(String str) {
        if (str.length() < 2 || Z6.y.a1(str) != '\"' || Z6.y.b1(str) != '\"') {
            return false;
        }
        int i8 = 1;
        while (true) {
            String str2 = str;
            int iX = Z6.w.X(str2, '\"', i8, false, 4, null);
            if (iX != Z6.w.S(str2)) {
                int i9 = 0;
                for (int i10 = iX - 1; str2.charAt(i10) == '\\'; i10--) {
                    i9++;
                }
                if (i9 % 2 == 0) {
                    return false;
                }
                i8 = iX + 1;
                if (i8 < str2.length()) {
                    str = str2;
                }
            }
            return true;
        }
    }

    public static final boolean c(String str) {
        if (str.length() == 0) {
            return true;
        }
        if (b(str)) {
            return false;
        }
        int length = str.length();
        for (int i8 = 0; i8 < length; i8++) {
            if (f11855a.contains(Character.valueOf(str.charAt(i8)))) {
                return true;
            }
        }
        return false;
    }

    public static final String d(String str) {
        kotlin.jvm.internal.t.g(str, "<this>");
        StringBuilder sb = new StringBuilder();
        e(str, sb);
        String string = sb.toString();
        kotlin.jvm.internal.t.f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static final void e(String str, StringBuilder sb) {
        sb.append("\"");
        int length = str.length();
        for (int i8 = 0; i8 < length; i8++) {
            char cCharAt = str.charAt(i8);
            if (cCharAt == '\\') {
                sb.append("\\\\");
            } else if (cCharAt == '\n') {
                sb.append("\\n");
            } else if (cCharAt == '\r') {
                sb.append("\\r");
            } else if (cCharAt == '\t') {
                sb.append("\\t");
            } else if (cCharAt == '\"') {
                sb.append("\\\"");
            } else {
                sb.append(cCharAt);
            }
        }
        sb.append("\"");
    }
}
