package X5;

import Z6.C1694a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class H {
    public static final void a(D d8, String str, int i8, int i9, int i10, boolean z8) {
        String strSubstring;
        String strSubstring2;
        String strSubstring3;
        if (i9 == -1) {
            int iF = f(i8, i10, str);
            int iE = e(iF, i10, str);
            if (iE > iF) {
                if (z8) {
                    strSubstring3 = AbstractC1673b.k(str, iF, iE, false, null, 12, null);
                } else {
                    strSubstring3 = str.substring(iF, iE);
                    kotlin.jvm.internal.t.f(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                d8.e(strSubstring3, D6.r.n());
                return;
            }
            return;
        }
        int iF2 = f(i8, i9, str);
        int iE2 = e(iF2, i9, str);
        if (iE2 > iF2) {
            if (z8) {
                strSubstring = AbstractC1673b.k(str, iF2, iE2, false, null, 12, null);
            } else {
                strSubstring = str.substring(iF2, iE2);
                kotlin.jvm.internal.t.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            int iF3 = f(i9 + 1, i10, str);
            int iE3 = e(iF3, i10, str);
            if (z8) {
                strSubstring2 = AbstractC1673b.k(str, iF3, iE3, true, null, 8, null);
            } else {
                strSubstring2 = str.substring(iF3, iE3);
                kotlin.jvm.internal.t.f(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            d8.f(strSubstring, strSubstring2);
        }
    }

    public static final void b(D d8, String str, int i8, int i9, boolean z8) {
        int i10;
        int i11;
        int iS = Z6.w.S(str);
        int i12 = 0;
        if (i8 <= iS) {
            int i13 = -1;
            int i14 = i8;
            int i15 = i14;
            while (i12 != i9) {
                char cCharAt = str.charAt(i15);
                if (cCharAt == '&') {
                    a(d8, str, i14, i13, i15, z8);
                    i12++;
                    i13 = -1;
                    i14 = i15 + 1;
                } else if (cCharAt == '=' && i13 == -1) {
                    i13 = i15;
                }
                if (i15 != iS) {
                    i15++;
                } else {
                    i11 = i14;
                    i10 = i13;
                }
            }
            return;
        }
        i10 = -1;
        i11 = i8;
        if (i12 == i9) {
            return;
        }
        a(d8, str, i11, i10, str.length(), z8);
    }

    public static final C c(String query, int i8, int i9, boolean z8) {
        kotlin.jvm.internal.t.g(query, "query");
        if (i8 > Z6.w.S(query)) {
            return C.f11742b.a();
        }
        C.a aVar = C.f11742b;
        D dB = G.b(0, 1, null);
        b(dB, query, i8, i9, z8);
        return dB.build();
    }

    public static /* synthetic */ C d(String str, int i8, int i9, boolean z8, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = 1000;
        }
        if ((i10 & 8) != 0) {
            z8 = true;
        }
        return c(str, i8, i9, z8);
    }

    public static final int e(int i8, int i9, CharSequence charSequence) {
        while (i9 > i8 && C1694a.c(charSequence.charAt(i9 - 1))) {
            i9--;
        }
        return i9;
    }

    public static final int f(int i8, int i9, CharSequence charSequence) {
        while (i8 < i9 && C1694a.c(charSequence.charAt(i8))) {
            i8++;
        }
        return i8;
    }
}
