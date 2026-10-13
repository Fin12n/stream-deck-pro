package Z6;

import D6.AbstractC0922b;
import io.sentry.exception.uXy.SZCvugJaXc;
import java.util.Comparator;
import kotlin.jvm.internal.O;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class v extends u {
    public static final String A(String str, char c8, char c9, boolean z8) {
        kotlin.jvm.internal.t.g(str, "<this>");
        if (!z8) {
            String strReplace = str.replace(c8, c9);
            kotlin.jvm.internal.t.f(strReplace, "replace(...)");
            return strReplace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i8 = 0; i8 < str.length(); i8++) {
            char cCharAt = str.charAt(i8);
            if (b.d(cCharAt, c8, z8)) {
                cCharAt = c9;
            }
            sb.append(cCharAt);
        }
        String string = sb.toString();
        kotlin.jvm.internal.t.f(string, "toString(...)");
        return string;
    }

    public static final String B(String str, String oldValue, String newValue, boolean z8) {
        kotlin.jvm.internal.t.g(str, "<this>");
        kotlin.jvm.internal.t.g(oldValue, "oldValue");
        kotlin.jvm.internal.t.g(newValue, "newValue");
        int i8 = 0;
        int iU = w.U(str, oldValue, 0, z8);
        if (iU < 0) {
            return str;
        }
        int length = oldValue.length();
        int iD = W6.n.d(length, 1);
        int length2 = (str.length() - length) + newValue.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i8, iU);
            sb.append(newValue);
            i8 = iU + length;
            if (iU >= str.length()) {
                break;
            }
            iU = w.U(str, oldValue, iU + iD, z8);
        } while (iU > 0);
        sb.append((CharSequence) str, i8, str.length());
        String string = sb.toString();
        kotlin.jvm.internal.t.f(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String C(String str, char c8, char c9, boolean z8, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            z8 = false;
        }
        return A(str, c8, c9, z8);
    }

    public static /* synthetic */ String D(String str, String str2, String str3, boolean z8, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            z8 = false;
        }
        return B(str, str2, str3, z8);
    }

    public static boolean F(String str, String prefix, boolean z8) {
        kotlin.jvm.internal.t.g(str, "<this>");
        kotlin.jvm.internal.t.g(prefix, "prefix");
        return !z8 ? str.startsWith(prefix) : x(str, 0, prefix, 0, prefix.length(), z8);
    }

    public static /* synthetic */ boolean G(String str, String str2, int i8, boolean z8, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            z8 = false;
        }
        return E(str, str2, i8, z8);
    }

    public static /* synthetic */ boolean H(String str, String str2, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return F(str, str2, z8);
    }

    public static String q(char[] cArr) {
        kotlin.jvm.internal.t.g(cArr, "<this>");
        return new String(cArr);
    }

    public static String r(char[] cArr, int i8, int i9) {
        kotlin.jvm.internal.t.g(cArr, "<this>");
        AbstractC0922b.f1937a.a(i8, i9, cArr.length);
        return new String(cArr, i8, i9 - i8);
    }

    public static byte[] s(String str) {
        kotlin.jvm.internal.t.g(str, "<this>");
        byte[] bytes = str.getBytes(c.f12941b);
        kotlin.jvm.internal.t.f(bytes, "getBytes(...)");
        return bytes;
    }

    public static final boolean t(String str, String suffix, boolean z8) {
        kotlin.jvm.internal.t.g(str, "<this>");
        kotlin.jvm.internal.t.g(suffix, "suffix");
        return !z8 ? str.endsWith(suffix) : x(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    public static /* synthetic */ boolean u(String str, String str2, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return t(str, str2, z8);
    }

    public static boolean v(String str, String str2, boolean z8) {
        if (str == null) {
            return str2 == null;
        }
        return !z8 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static Comparator w(O o8) {
        kotlin.jvm.internal.t.g(o8, "<this>");
        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        kotlin.jvm.internal.t.f(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        return CASE_INSENSITIVE_ORDER;
    }

    public static boolean x(String str, int i8, String other, int i9, int i10, boolean z8) {
        kotlin.jvm.internal.t.g(str, "<this>");
        kotlin.jvm.internal.t.g(other, "other");
        return !z8 ? str.regionMatches(i8, other, i9, i10) : str.regionMatches(z8, i8, other, i9, i10);
    }

    public static /* synthetic */ boolean y(String str, int i8, String str2, int i9, int i10, boolean z8, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            z8 = false;
        }
        return x(str, i8, str2, i9, i10, z8);
    }

    public static String z(CharSequence charSequence, int i8) {
        kotlin.jvm.internal.t.g(charSequence, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i8 + com.amazon.a.a.o.c.a.b.f16789a).toString());
        }
        if (i8 == 0) {
            return "";
        }
        int i9 = 1;
        if (i8 == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = charSequence.charAt(0);
            char[] cArr = new char[i8];
            for (int i10 = 0; i10 < i8; i10++) {
                cArr[i10] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(charSequence.length() * i8);
        if (1 <= i8) {
            while (true) {
                sb.append(charSequence);
                if (i9 == i8) {
                    break;
                }
                i9++;
            }
        }
        String string = sb.toString();
        kotlin.jvm.internal.t.d(string);
        return string;
    }

    public static boolean E(String str, String str2, int i8, boolean z8) {
        kotlin.jvm.internal.t.g(str, "<this>");
        kotlin.jvm.internal.t.g(str2, SZCvugJaXc.DBTRwVY);
        return !z8 ? str.startsWith(str2, i8) : x(str, i8, str2, 0, str2.length(), z8);
    }
}
