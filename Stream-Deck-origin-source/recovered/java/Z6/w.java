package Z6;

import D6.C0933m;
import D6.C0934n;
import D6.C0937q;
import D6.C0938s;
import com.amazon.device.simplesignin.a.LSJS.cFAYKUlMj;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p179u4.eubL.OjEsfyJYzbPn;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class w extends v {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends kotlin.jvm.internal.u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ char[] f12984a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f12985b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(char[] cArr, boolean z8) {
            super(2);
            this.f12984a = cArr;
            this.f12985b = z8;
        }

        public final C6.o b(CharSequence $receiver, int i8) {
            kotlin.jvm.internal.t.g($receiver, "$this$$receiver");
            int iZ = w.Z($receiver, this.f12984a, i8, this.f12985b);
            if (iZ < 0) {
                return null;
            }
            return C6.v.a(Integer.valueOf(iZ), 1);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends kotlin.jvm.internal.u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f12986a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f12987b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List list, boolean z8) {
            super(2);
            this.f12986a = list;
            this.f12987b = z8;
        }

        public final C6.o b(CharSequence $receiver, int i8) {
            kotlin.jvm.internal.t.g($receiver, "$this$$receiver");
            C6.o oVarR = w.R($receiver, this.f12986a, i8, this.f12987b, false);
            if (oVarR != null) {
                return C6.v.a(oVarR.c(), Integer.valueOf(((String) oVarR.d()).length()));
            }
            return null;
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CharSequence f12988a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CharSequence charSequence) {
            super(1);
            this.f12988a = charSequence;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke(W6.i it) {
            kotlin.jvm.internal.t.g(it, "it");
            return w.H0(this.f12988a, it);
        }
    }

    public static /* synthetic */ List A0(CharSequence charSequence, String[] strArr, boolean z8, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z8 = false;
        }
        if ((i9 & 4) != 0) {
            i8 = 0;
        }
        return x0(charSequence, strArr, z8, i8);
    }

    public static final Y6.g B0(CharSequence charSequence, String[] delimiters, boolean z8, int i8) {
        kotlin.jvm.internal.t.g(charSequence, "<this>");
        kotlin.jvm.internal.t.g(delimiters, "delimiters");
        return Y6.n.s(o0(charSequence, delimiters, 0, z8, i8, 2, null), new c(charSequence));
    }

    public static /* synthetic */ Y6.g C0(CharSequence charSequence, String[] strArr, boolean z8, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z8 = false;
        }
        if ((i9 & 4) != 0) {
            i8 = 0;
        }
        return B0(charSequence, strArr, z8, i8);
    }

    public static final boolean D0(CharSequence charSequence, char c8, boolean z8) {
        kotlin.jvm.internal.t.g(charSequence, "<this>");
        return charSequence.length() > 0 && Z6.b.d(charSequence.charAt(0), c8, z8);
    }

    public static /* synthetic */ boolean F0(CharSequence charSequence, char c8, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return D0(charSequence, c8, z8);
    }

    public static /* synthetic */ boolean G0(CharSequence charSequence, CharSequence charSequence2, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return E0(charSequence, charSequence2, z8);
    }

    public static final String H0(CharSequence charSequence, W6.i range) {
        kotlin.jvm.internal.t.g(charSequence, "<this>");
        kotlin.jvm.internal.t.g(range, "range");
        return charSequence.subSequence(range.c().intValue(), range.o().intValue() + 1).toString();
    }

    public static String I0(String str, W6.i range) {
        kotlin.jvm.internal.t.g(str, "<this>");
        kotlin.jvm.internal.t.g(range, "range");
        String strSubstring = str.substring(range.c().intValue(), range.o().intValue() + 1);
        kotlin.jvm.internal.t.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final boolean J(CharSequence charSequence, char c8, boolean z8) {
        kotlin.jvm.internal.t.g(charSequence, "<this>");
        return X(charSequence, c8, 0, z8, 2, null) >= 0;
    }

    public static String J0(String str, char c8, String missingDelimiterValue) {
        kotlin.jvm.internal.t.g(str, "<this>");
        kotlin.jvm.internal.t.g(missingDelimiterValue, "missingDelimiterValue");
        int iX = X(str, c8, 0, false, 6, null);
        if (iX == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iX + 1, str.length());
        kotlin.jvm.internal.t.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static boolean K(CharSequence charSequence, CharSequence other, boolean z8) {
        kotlin.jvm.internal.t.g(charSequence, "<this>");
        kotlin.jvm.internal.t.g(other, "other");
        if (other instanceof String) {
            return Y(charSequence, (String) other, 0, z8, 2, null) >= 0;
        }
        return W(charSequence, other, 0, charSequence.length(), z8, false, 16, null) >= 0;
    }

    public static final String K0(String str, String delimiter, String missingDelimiterValue) {
        kotlin.jvm.internal.t.g(str, "<this>");
        kotlin.jvm.internal.t.g(delimiter, "delimiter");
        kotlin.jvm.internal.t.g(missingDelimiterValue, "missingDelimiterValue");
        int iY = Y(str, delimiter, 0, false, 6, null);
        if (iY == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iY + delimiter.length(), str.length());
        kotlin.jvm.internal.t.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ boolean L(CharSequence charSequence, char c8, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return J(charSequence, c8, z8);
    }

    public static /* synthetic */ String L0(String str, char c8, String str2, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str2 = str;
        }
        return J0(str, c8, str2);
    }

    public static /* synthetic */ boolean M(CharSequence charSequence, CharSequence charSequence2, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return K(charSequence, charSequence2, z8);
    }

    public static /* synthetic */ String M0(String str, String str2, String str3, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str3 = str;
        }
        return K0(str, str2, str3);
    }

    public static final boolean N(CharSequence charSequence, char c8, boolean z8) {
        kotlin.jvm.internal.t.g(charSequence, "<this>");
        return charSequence.length() > 0 && Z6.b.d(charSequence.charAt(S(charSequence)), c8, z8);
    }

    public static final String N0(String str, char c8, String missingDelimiterValue) {
        kotlin.jvm.internal.t.g(str, "<this>");
        kotlin.jvm.internal.t.g(missingDelimiterValue, "missingDelimiterValue");
        int iE0 = e0(str, c8, 0, false, 6, null);
        if (iE0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iE0 + 1, str.length());
        kotlin.jvm.internal.t.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final boolean O(CharSequence charSequence, CharSequence suffix, boolean z8) {
        kotlin.jvm.internal.t.g(charSequence, "<this>");
        kotlin.jvm.internal.t.g(suffix, "suffix");
        return (!z8 && (charSequence instanceof String) && (suffix instanceof String)) ? v.u((String) charSequence, (String) suffix, false, 2, null) : p0(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), z8);
    }

    public static /* synthetic */ String O0(String str, char c8, String str2, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str2 = str;
        }
        return N0(str, c8, str2);
    }

    public static /* synthetic */ boolean P(CharSequence charSequence, char c8, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return N(charSequence, c8, z8);
    }

    public static final String P0(String str, char c8, String missingDelimiterValue) {
        kotlin.jvm.internal.t.g(str, "<this>");
        kotlin.jvm.internal.t.g(missingDelimiterValue, "missingDelimiterValue");
        int iX = X(str, c8, 0, false, 6, null);
        if (iX == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iX);
        kotlin.jvm.internal.t.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ boolean Q(CharSequence charSequence, CharSequence charSequence2, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return O(charSequence, charSequence2, z8);
    }

    public static final String Q0(String str, String delimiter, String missingDelimiterValue) {
        kotlin.jvm.internal.t.g(str, "<this>");
        kotlin.jvm.internal.t.g(delimiter, "delimiter");
        kotlin.jvm.internal.t.g(missingDelimiterValue, "missingDelimiterValue");
        int iY = Y(str, delimiter, 0, false, 6, null);
        if (iY == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iY);
        kotlin.jvm.internal.t.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final C6.o R(CharSequence charSequence, Collection collection, int i8, boolean z8, boolean z9) {
        CharSequence charSequence2;
        Object next;
        boolean z10;
        Object next2;
        if (!z8 && collection.size() == 1) {
            String str = (String) D6.z.E0(collection);
            int iY = !z9 ? Y(charSequence, str, i8, false, 4, null) : f0(charSequence, str, i8, false, 4, null);
            if (iY < 0) {
                return null;
            }
            return C6.v.a(Integer.valueOf(iY), str);
        }
        CharSequence charSequence3 = charSequence;
        W6.g iVar = !z9 ? new W6.i(W6.n.d(i8, 0), charSequence3.length()) : W6.n.p(W6.n.g(i8, S(charSequence3)), 0);
        if (charSequence3 instanceof String) {
            int iS = iVar.s();
            int iT = iVar.t();
            int iU = iVar.u();
            if ((iU > 0 && iS <= iT) || (iU < 0 && iT <= iS)) {
                int i9 = iS;
                while (true) {
                    Iterator it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z10 = z8;
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        String str2 = (String) next2;
                        z10 = z8;
                        if (v.x(str2, 0, (String) charSequence3, i9, str2.length(), z10)) {
                            break;
                        }
                        z8 = z10;
                    }
                    String str3 = (String) next2;
                    if (str3 != null) {
                        return C6.v.a(Integer.valueOf(i9), str3);
                    }
                    if (i9 != iT) {
                        i9 += iU;
                        z8 = z10;
                    }
                }
            }
        } else {
            boolean z11 = z8;
            int iS2 = iVar.s();
            int iT2 = iVar.t();
            int iU2 = iVar.u();
            if ((iU2 > 0 && iS2 <= iT2) || (iU2 < 0 && iT2 <= iS2)) {
                int i10 = iS2;
                while (true) {
                    Iterator it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            charSequence2 = charSequence3;
                            next = null;
                            break;
                        }
                        next = it2.next();
                        String str4 = (String) next;
                        boolean z12 = z11;
                        charSequence2 = charSequence3;
                        z11 = z12;
                        if (p0(str4, 0, charSequence2, i10, str4.length(), z12)) {
                            break;
                        }
                        charSequence3 = charSequence2;
                    }
                    String str5 = (String) next;
                    if (str5 != null) {
                        return C6.v.a(Integer.valueOf(i10), str5);
                    }
                    if (i10 != iT2) {
                        i10 += iU2;
                        charSequence3 = charSequence2;
                    }
                }
            }
        }
        return null;
    }

    public static /* synthetic */ String R0(String str, char c8, String str2, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str2 = str;
        }
        return P0(str, c8, str2);
    }

    public static int S(CharSequence charSequence) {
        kotlin.jvm.internal.t.g(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static /* synthetic */ String S0(String str, String str2, String str3, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str3 = str;
        }
        return Q0(str, str2, str3);
    }

    public static final int T(CharSequence charSequence, char c8, int i8, boolean z8) {
        kotlin.jvm.internal.t.g(charSequence, "<this>");
        return (z8 || !(charSequence instanceof String)) ? Z(charSequence, new char[]{c8}, i8, z8) : ((String) charSequence).indexOf(c8, i8);
    }

    public static final String T0(String str, String delimiter, String missingDelimiterValue) {
        kotlin.jvm.internal.t.g(str, "<this>");
        kotlin.jvm.internal.t.g(delimiter, "delimiter");
        kotlin.jvm.internal.t.g(missingDelimiterValue, "missingDelimiterValue");
        int iF0 = f0(str, delimiter, 0, false, 6, null);
        if (iF0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iF0);
        kotlin.jvm.internal.t.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final int U(CharSequence charSequence, String string, int i8, boolean z8) {
        kotlin.jvm.internal.t.g(charSequence, "<this>");
        kotlin.jvm.internal.t.g(string, "string");
        return (z8 || !(charSequence instanceof String)) ? W(charSequence, string, i8, charSequence.length(), z8, false, 16, null) : ((String) charSequence).indexOf(string, i8);
    }

    public static /* synthetic */ String U0(String str, String str2, String str3, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str3 = str;
        }
        return T0(str, str2, str3);
    }

    public static final int V(CharSequence charSequence, CharSequence charSequence2, int i8, int i9, boolean z8, boolean z9) {
        W6.g iVar = !z9 ? new W6.i(W6.n.d(i8, 0), W6.n.g(i9, charSequence.length())) : W6.n.p(W6.n.g(i8, S(charSequence)), W6.n.d(i9, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int iS = iVar.s();
            int iT = iVar.t();
            int iU = iVar.u();
            if ((iU <= 0 || iS > iT) && (iU >= 0 || iT > iS)) {
                return -1;
            }
            int i10 = iS;
            while (true) {
                boolean z10 = z8;
                if (v.x((String) charSequence2, 0, (String) charSequence, i10, charSequence2.length(), z10)) {
                    return i10;
                }
                if (i10 == iT) {
                    return -1;
                }
                i10 += iU;
                z8 = z10;
            }
        } else {
            boolean z11 = z8;
            int iS2 = iVar.s();
            int iT2 = iVar.t();
            int iU2 = iVar.u();
            if ((iU2 <= 0 || iS2 > iT2) && (iU2 >= 0 || iT2 > iS2)) {
                return -1;
            }
            int i11 = iS2;
            while (true) {
                boolean z12 = z11;
                CharSequence charSequence3 = charSequence;
                CharSequence charSequence4 = charSequence2;
                z11 = z12;
                if (p0(charSequence4, 0, charSequence3, i11, charSequence2.length(), z12)) {
                    return i11;
                }
                if (i11 == iT2) {
                    return -1;
                }
                i11 += iU2;
                charSequence2 = charSequence4;
                charSequence = charSequence3;
            }
        }
    }

    public static Boolean V0(String str) {
        kotlin.jvm.internal.t.g(str, "<this>");
        if (kotlin.jvm.internal.t.c(str, com.amazon.a.a.o.b.af)) {
            return Boolean.TRUE;
        }
        if (kotlin.jvm.internal.t.c(str, com.amazon.a.a.o.b.ag)) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static /* synthetic */ int W(CharSequence charSequence, CharSequence charSequence2, int i8, int i9, boolean z8, boolean z9, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            z9 = false;
        }
        return V(charSequence, charSequence2, i8, i9, z8, z9);
    }

    public static CharSequence W0(CharSequence charSequence) {
        kotlin.jvm.internal.t.g(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i8 = 0;
        boolean z8 = false;
        while (i8 <= length) {
            boolean zC = C1694a.c(charSequence.charAt(!z8 ? i8 : length));
            if (z8) {
                if (!zC) {
                    break;
                }
                length--;
            } else if (zC) {
                i8++;
            } else {
                z8 = true;
            }
        }
        return charSequence.subSequence(i8, length + 1);
    }

    public static /* synthetic */ int X(CharSequence charSequence, char c8, int i8, boolean z8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        if ((i9 & 4) != 0) {
            z8 = false;
        }
        return T(charSequence, c8, i8, z8);
    }

    public static /* synthetic */ int Y(CharSequence charSequence, String str, int i8, boolean z8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        if ((i9 & 4) != 0) {
            z8 = false;
        }
        return U(charSequence, str, i8, z8);
    }

    public static final int Z(CharSequence charSequence, char[] chars, int i8, boolean z8) {
        kotlin.jvm.internal.t.g(charSequence, "<this>");
        kotlin.jvm.internal.t.g(chars, "chars");
        if (!z8 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(C0934n.k0(chars), i8);
        }
        int iD = W6.n.d(i8, 0);
        int iS = S(charSequence);
        if (iD > iS) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(iD);
            for (char c8 : chars) {
                if (Z6.b.d(c8, cCharAt, z8)) {
                    return iD;
                }
            }
            if (iD == iS) {
                return -1;
            }
            iD++;
        }
    }

    public static /* synthetic */ int a0(CharSequence charSequence, char[] cArr, int i8, boolean z8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        if ((i9 & 4) != 0) {
            z8 = false;
        }
        return Z(charSequence, cArr, i8, z8);
    }

    public static boolean b0(CharSequence charSequence) {
        kotlin.jvm.internal.t.g(charSequence, "<this>");
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            if (!C1694a.c(charSequence.charAt(i8))) {
                return false;
            }
        }
        return true;
    }

    public static final int c0(CharSequence charSequence, char c8, int i8, boolean z8) {
        kotlin.jvm.internal.t.g(charSequence, "<this>");
        return (z8 || !(charSequence instanceof String)) ? g0(charSequence, new char[]{c8}, i8, z8) : ((String) charSequence).lastIndexOf(c8, i8);
    }

    public static final int d0(CharSequence charSequence, String string, int i8, boolean z8) {
        kotlin.jvm.internal.t.g(charSequence, "<this>");
        kotlin.jvm.internal.t.g(string, "string");
        return (z8 || !(charSequence instanceof String)) ? V(charSequence, string, i8, 0, z8, true) : ((String) charSequence).lastIndexOf(string, i8);
    }

    public static /* synthetic */ int e0(CharSequence charSequence, char c8, int i8, boolean z8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = S(charSequence);
        }
        if ((i9 & 4) != 0) {
            z8 = false;
        }
        return c0(charSequence, c8, i8, z8);
    }

    public static /* synthetic */ int f0(CharSequence charSequence, String str, int i8, boolean z8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = S(charSequence);
        }
        if ((i9 & 4) != 0) {
            z8 = false;
        }
        return d0(charSequence, str, i8, z8);
    }

    public static final int g0(CharSequence charSequence, char[] chars, int i8, boolean z8) {
        kotlin.jvm.internal.t.g(charSequence, "<this>");
        kotlin.jvm.internal.t.g(chars, "chars");
        if (!z8 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(C0934n.k0(chars), i8);
        }
        for (int iG = W6.n.g(i8, S(charSequence)); -1 < iG; iG--) {
            char cCharAt = charSequence.charAt(iG);
            for (char c8 : chars) {
                if (Z6.b.d(c8, cCharAt, z8)) {
                    return iG;
                }
            }
        }
        return -1;
    }

    public static final Y6.g h0(CharSequence charSequence) {
        kotlin.jvm.internal.t.g(charSequence, "<this>");
        return C0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, null);
    }

    public static final List i0(CharSequence charSequence) {
        kotlin.jvm.internal.t.g(charSequence, "<this>");
        return Y6.n.u(h0(charSequence));
    }

    public static final CharSequence j0(CharSequence charSequence, int i8, char c8) {
        kotlin.jvm.internal.t.g(charSequence, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException("Desired length " + i8 + " is less than zero.");
        }
        if (i8 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(i8);
        int length = i8 - charSequence.length();
        int i9 = 1;
        if (1 <= length) {
            while (true) {
                sb.append(c8);
                if (i9 == length) {
                    break;
                }
                i9++;
            }
        }
        sb.append(charSequence);
        return sb;
    }

    public static String k0(String str, int i8, char c8) {
        kotlin.jvm.internal.t.g(str, "<this>");
        return j0(str, i8, c8).toString();
    }

    public static final Y6.g l0(CharSequence charSequence, char[] cArr, int i8, boolean z8, int i9) {
        v0(i9);
        return new d(charSequence, i8, i9, new a(cArr, z8));
    }

    public static final Y6.g m0(CharSequence charSequence, String[] strArr, int i8, boolean z8, int i9) {
        v0(i9);
        return new d(charSequence, i8, i9, new b(C0933m.c(strArr), z8));
    }

    public static /* synthetic */ Y6.g n0(CharSequence charSequence, char[] cArr, int i8, boolean z8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            z8 = false;
        }
        if ((i10 & 8) != 0) {
            i9 = 0;
        }
        return l0(charSequence, cArr, i8, z8, i9);
    }

    public static /* synthetic */ Y6.g o0(CharSequence charSequence, String[] strArr, int i8, boolean z8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            z8 = false;
        }
        if ((i10 & 8) != 0) {
            i9 = 0;
        }
        return m0(charSequence, strArr, i8, z8, i9);
    }

    public static final boolean p0(CharSequence charSequence, int i8, CharSequence other, int i9, int i10, boolean z8) {
        kotlin.jvm.internal.t.g(charSequence, "<this>");
        kotlin.jvm.internal.t.g(other, "other");
        if (i9 < 0 || i8 < 0 || i8 > charSequence.length() - i10 || i9 > other.length() - i10) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (!Z6.b.d(charSequence.charAt(i8 + i11), other.charAt(i9 + i11), z8)) {
                return false;
            }
        }
        return true;
    }

    public static String q0(String str, CharSequence prefix) {
        kotlin.jvm.internal.t.g(str, "<this>");
        kotlin.jvm.internal.t.g(prefix, "prefix");
        if (!G0(str, prefix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length());
        kotlin.jvm.internal.t.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String r0(String str, CharSequence suffix) {
        kotlin.jvm.internal.t.g(str, "<this>");
        kotlin.jvm.internal.t.g(suffix, "suffix");
        if (!Q(str, suffix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - suffix.length());
        kotlin.jvm.internal.t.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String s0(String str, CharSequence delimiter) {
        kotlin.jvm.internal.t.g(str, "<this>");
        kotlin.jvm.internal.t.g(delimiter, "delimiter");
        return t0(str, delimiter, delimiter);
    }

    public static CharSequence u0(CharSequence charSequence, int i8, int i9, CharSequence replacement) {
        kotlin.jvm.internal.t.g(charSequence, "<this>");
        kotlin.jvm.internal.t.g(replacement, "replacement");
        if (i9 >= i8) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence, 0, i8);
            kotlin.jvm.internal.t.f(sb, "append(...)");
            sb.append(replacement);
            sb.append(charSequence, i9, charSequence.length());
            kotlin.jvm.internal.t.f(sb, "append(...)");
            return sb;
        }
        throw new IndexOutOfBoundsException("End index (" + i9 + ") is less than start index (" + i8 + ").");
    }

    public static final void v0(int i8) {
        if (i8 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i8).toString());
    }

    public static final List w0(CharSequence charSequence, char[] delimiters, boolean z8, int i8) {
        kotlin.jvm.internal.t.g(charSequence, "<this>");
        kotlin.jvm.internal.t.g(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return y0(charSequence, String.valueOf(delimiters[0]), z8, i8);
        }
        Iterable iterableH = Y6.n.h(n0(charSequence, delimiters, 0, z8, i8, 2, null));
        ArrayList arrayList = new ArrayList(C0938s.y(iterableH, 10));
        Iterator it = iterableH.iterator();
        while (it.hasNext()) {
            arrayList.add(H0(charSequence, (W6.i) it.next()));
        }
        return arrayList;
    }

    public static final List x0(CharSequence charSequence, String[] delimiters, boolean z8, int i8) {
        kotlin.jvm.internal.t.g(charSequence, "<this>");
        kotlin.jvm.internal.t.g(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (str.length() != 0) {
                return y0(charSequence, str, z8, i8);
            }
        }
        Iterable iterableH = Y6.n.h(o0(charSequence, delimiters, 0, z8, i8, 2, null));
        ArrayList arrayList = new ArrayList(C0938s.y(iterableH, 10));
        Iterator it = iterableH.iterator();
        while (it.hasNext()) {
            arrayList.add(H0(charSequence, (W6.i) it.next()));
        }
        return arrayList;
    }

    public static final List y0(CharSequence charSequence, String str, boolean z8, int i8) {
        v0(i8);
        int length = 0;
        int iU = U(charSequence, str, 0, z8);
        if (iU == -1 || i8 == 1) {
            return C0937q.e(charSequence.toString());
        }
        boolean z9 = i8 > 0;
        ArrayList arrayList = new ArrayList(z9 ? W6.n.g(i8, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(length, iU).toString());
            length = str.length() + iU;
            if (z9 && arrayList.size() == i8 - 1) {
                break;
            }
            iU = U(charSequence, str, length, z8);
        } while (iU != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ List z0(CharSequence charSequence, char[] cArr, boolean z8, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z8 = false;
        }
        if ((i9 & 4) != 0) {
            i8 = 0;
        }
        return w0(charSequence, cArr, z8, i8);
    }

    public static final boolean E0(CharSequence charSequence, CharSequence prefix, boolean z8) {
        kotlin.jvm.internal.t.g(charSequence, OjEsfyJYzbPn.erHhRuORTiQ);
        kotlin.jvm.internal.t.g(prefix, "prefix");
        return (!z8 && (charSequence instanceof String) && (prefix instanceof String)) ? v.H((String) charSequence, (String) prefix, false, 2, null) : p0(charSequence, 0, prefix, 0, prefix.length(), z8);
    }

    public static final String t0(String str, CharSequence prefix, CharSequence suffix) {
        kotlin.jvm.internal.t.g(str, "<this>");
        kotlin.jvm.internal.t.g(prefix, "prefix");
        kotlin.jvm.internal.t.g(suffix, "suffix");
        if (str.length() < prefix.length() + suffix.length() || !G0(str, prefix, false, 2, null) || !Q(str, suffix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length(), str.length() - suffix.length());
        kotlin.jvm.internal.t.f(strSubstring, cFAYKUlMj.zDodpZTbpwM);
        return strSubstring;
    }
}
