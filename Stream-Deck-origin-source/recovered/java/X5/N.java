package X5;

import D6.C0937q;
import Z6.C1694a;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f11757a = C0937q.e("");

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends kotlin.jvm.internal.u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ I f11758a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(I i8) {
            super(2);
            this.f11758a = i8;
        }

        public final void b(String key, List values) {
            kotlin.jvm.internal.t.g(key, "key");
            kotlin.jvm.internal.t.g(values, "values");
            this.f11758a.e().e(key, values);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((String) obj, (List) obj2);
            return C6.G.f1419a;
        }
    }

    public static final int a(String str, int i8, int i9, char c8) {
        int i10 = 0;
        while (true) {
            int i11 = i8 + i10;
            if (i11 >= i9 || str.charAt(i11) != c8) {
                break;
            }
            i10++;
        }
        return i10;
    }

    public static final void b(I i8, String str, int i9, int i10) {
        Integer numValueOf = Integer.valueOf(e(str, i9, i10));
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : i10;
        String strSubstring = str.substring(i9, iIntValue);
        kotlin.jvm.internal.t.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        i8.w(strSubstring);
        int i11 = iIntValue + 1;
        if (i11 >= i10) {
            i8.x(0);
            return;
        }
        String strSubstring2 = str.substring(i11, i10);
        kotlin.jvm.internal.t.f(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
        i8.x(Integer.parseInt(strSubstring2));
    }

    public static final int c(String str, int i8, int i9) {
        int i10;
        int i11;
        char cCharAt = str.charAt(i8);
        if (('a' > cCharAt || cCharAt >= '{') && ('A' > cCharAt || cCharAt >= '[')) {
            i10 = i8;
            i11 = i10;
        } else {
            i10 = i8;
            i11 = -1;
        }
        while (i10 < i9) {
            char cCharAt2 = str.charAt(i10);
            if (cCharAt2 == ':') {
                if (i11 == -1) {
                    return i10 - i8;
                }
                throw new IllegalArgumentException("Illegal character in scheme at position " + i11);
            }
            if (cCharAt2 == '/' || cCharAt2 == '?' || cCharAt2 == '#') {
                break;
            }
            if (i11 == -1 && (('a' > cCharAt2 || cCharAt2 >= '{') && (('A' > cCharAt2 || cCharAt2 >= '[') && (('0' > cCharAt2 || cCharAt2 >= ':') && cCharAt2 != '.' && cCharAt2 != '+' && cCharAt2 != '-')))) {
                i11 = i10;
            }
            i10++;
        }
        return -1;
    }

    public static final List d() {
        return f11757a;
    }

    public static final int e(String str, int i8, int i9) {
        boolean z8 = false;
        while (i8 < i9) {
            char cCharAt = str.charAt(i8);
            if (cCharAt == '[') {
                z8 = true;
            } else if (cCharAt == ']') {
                z8 = false;
            } else if (cCharAt == ':' && !z8) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public static final void f(I i8, String str, int i9, int i10, int i11) {
        if (i11 != 2) {
            if (i11 != 3) {
                throw new IllegalArgumentException("Invalid file url: " + str);
            }
            i8.w("");
            StringBuilder sb = new StringBuilder();
            sb.append('/');
            String strSubstring = str.substring(i9, i10);
            kotlin.jvm.internal.t.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb.append(strSubstring);
            K.j(i8, sb.toString());
            return;
        }
        int iX = Z6.w.X(str, '/', i9, false, 4, null);
        if (iX == -1 || iX == i10) {
            String strSubstring2 = str.substring(i9, i10);
            kotlin.jvm.internal.t.f(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            i8.w(strSubstring2);
        } else {
            String strSubstring3 = str.substring(i9, iX);
            kotlin.jvm.internal.t.f(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
            i8.w(strSubstring3);
            String strSubstring4 = str.substring(iX, i10);
            kotlin.jvm.internal.t.f(strSubstring4, "this as java.lang.String…ing(startIndex, endIndex)");
            K.j(i8, strSubstring4);
        }
    }

    public static final void g(I i8, String str, int i9, int i10) {
        if (i9 >= i10 || str.charAt(i9) != '#') {
            return;
        }
        String strSubstring = str.substring(i9 + 1, i10);
        kotlin.jvm.internal.t.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        i8.r(strSubstring);
    }

    public static final void h(I i8, String str, int i9, int i10) {
        int iY = Z6.w.Y(str, "@", i9, false, 4, null);
        if (iY == -1) {
            throw new IllegalArgumentException("Invalid mailto url: " + str + ", it should contain '@'.");
        }
        String strSubstring = str.substring(i9, iY);
        kotlin.jvm.internal.t.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        i8.A(AbstractC1673b.i(strSubstring, 0, 0, null, 7, null));
        String strSubstring2 = str.substring(iY + 1, i10);
        kotlin.jvm.internal.t.f(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
        i8.w(strSubstring2);
    }

    public static final int i(I i8, String str, int i9, int i10) {
        int i11 = i9 + 1;
        if (i11 == i10) {
            i8.z(true);
            return i10;
        }
        Integer numValueOf = Integer.valueOf(Z6.w.X(str, '#', i11, false, 4, null));
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            i10 = numValueOf.intValue();
        }
        String strSubstring = str.substring(i11, i10);
        kotlin.jvm.internal.t.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        H.d(strSubstring, 0, 0, false, 6, null).e(new a(i8));
        return i10;
    }

    public static final I j(I i8, String urlString) {
        kotlin.jvm.internal.t.g(i8, "<this>");
        kotlin.jvm.internal.t.g(urlString, "urlString");
        if (Z6.w.b0(urlString)) {
            return i8;
        }
        try {
            return k(i8, urlString);
        } catch (Throwable th) {
            throw new M(urlString, th);
        }
    }

    public static final I k(I i8, String urlString) {
        int i9;
        int iIntValue;
        kotlin.jvm.internal.t.g(i8, "<this>");
        kotlin.jvm.internal.t.g(urlString, "urlString");
        int length = urlString.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            if (!C1694a.c(urlString.charAt(i10))) {
                break;
            }
            i10++;
        }
        int length2 = urlString.length() - 1;
        if (length2 < 0) {
            i9 = -1;
            break;
        }
        while (true) {
            int i11 = length2 - 1;
            if (!C1694a.c(urlString.charAt(length2))) {
                i9 = length2;
                break;
            }
            if (i11 < 0) {
                i9 = -1;
                break;
            }
            length2 = i11;
        }
        int i12 = i9 + 1;
        int iC = c(urlString, i10, i12);
        if (iC > 0) {
            String strSubstring = urlString.substring(i10, i10 + iC);
            kotlin.jvm.internal.t.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            i8.y(O.f11759c.a(strSubstring));
            i10 += iC + 1;
        }
        int iA = a(urlString, i10, i12, '/');
        int i13 = i10 + iA;
        if (kotlin.jvm.internal.t.c(i8.o().e(), "file")) {
            f(i8, urlString, i13, i12, iA);
            return i8;
        }
        if (kotlin.jvm.internal.t.c(i8.o().e(), "mailto")) {
            if (iA != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            h(i8, urlString, i13, i12);
            return i8;
        }
        if (iA >= 2) {
            while (true) {
                Integer numValueOf = Integer.valueOf(Z6.w.a0(urlString, p115m6.k.b("@/\\?#"), i13, false, 4, null));
                if (numValueOf.intValue() <= 0) {
                    numValueOf = null;
                }
                iIntValue = numValueOf != null ? numValueOf.intValue() : i12;
                if (iIntValue >= i12 || urlString.charAt(iIntValue) != '@') {
                    break;
                }
                int iE = e(urlString, i13, iIntValue);
                if (iE != -1) {
                    String strSubstring2 = urlString.substring(i13, iE);
                    kotlin.jvm.internal.t.f(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    i8.v(strSubstring2);
                    String strSubstring3 = urlString.substring(iE + 1, iIntValue);
                    kotlin.jvm.internal.t.f(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    i8.t(strSubstring3);
                } else {
                    String strSubstring4 = urlString.substring(i13, iIntValue);
                    kotlin.jvm.internal.t.f(strSubstring4, "this as java.lang.String…ing(startIndex, endIndex)");
                    i8.v(strSubstring4);
                }
                i13 = iIntValue + 1;
            }
            b(i8, urlString, i13, iIntValue);
            i13 = iIntValue;
        }
        if (i13 >= i12) {
            i8.u(urlString.charAt(i9) == '/' ? f11757a : D6.r.n());
            return i8;
        }
        i8.u(iA == 0 ? D6.z.e0(i8.g(), 1) : D6.r.n());
        Integer numValueOf2 = Integer.valueOf(Z6.w.a0(urlString, p115m6.k.b("?#"), i13, false, 4, null));
        Integer num = numValueOf2.intValue() > 0 ? numValueOf2 : null;
        int iIntValue2 = num != null ? num.intValue() : i12;
        if (iIntValue2 > i13) {
            String strSubstring5 = urlString.substring(i13, iIntValue2);
            kotlin.jvm.internal.t.f(strSubstring5, "this as java.lang.String…ing(startIndex, endIndex)");
            i8.u(D6.z.B0((i8.g().size() == 1 && ((CharSequence) D6.z.i0(i8.g())).length() == 0) ? D6.r.n() : i8.g(), D6.z.B0(iA == 1 ? f11757a : D6.r.n(), kotlin.jvm.internal.t.c(strSubstring5, "/") ? f11757a : Z6.w.z0(strSubstring5, new char[]{'/'}, false, 0, 6, null))));
            i13 = iIntValue2;
        }
        if (i13 < i12 && urlString.charAt(i13) == '?') {
            i13 = i(i8, urlString, i13, i12);
        }
        g(i8, urlString, i13, i12);
        return i8;
    }
}
