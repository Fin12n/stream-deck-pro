package s7;

import C6.C0920i;
import com.amazon.device.simplesignin.a.LSJS.cFAYKUlMj;
import java.util.ArrayList;

/* JADX INFO: renamed from: s7.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2894a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f33249a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f33251c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H f33250b = new H();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public StringBuilder f33252d = new StringBuilder();

    public static /* synthetic */ boolean Q(AbstractC2894a abstractC2894a, boolean z8, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryConsumeNull");
        }
        if ((i8 & 1) != 0) {
            z8 = true;
        }
        return abstractC2894a.P(z8);
    }

    public static final double n(long j8, boolean z8) {
        if (!z8) {
            return Math.pow(10.0d, -j8);
        }
        if (z8) {
            return Math.pow(10.0d, j8);
        }
        throw new C6.m();
    }

    public static /* synthetic */ Void x(AbstractC2894a abstractC2894a, String str, int i8, String str2, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((i9 & 2) != 0) {
            i8 = abstractC2894a.f33249a;
        }
        if ((i9 & 4) != 0) {
            str2 = "";
        }
        return abstractC2894a.w(str, i8, str2);
    }

    public static /* synthetic */ Void z(AbstractC2894a abstractC2894a, byte b8, boolean z8, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((i8 & 2) != 0) {
            z8 = true;
        }
        return abstractC2894a.y(b8, z8);
    }

    public final void A(String key) {
        kotlin.jvm.internal.t.g(key, "key");
        w("Encountered an unknown key '" + key + '\'', Z6.w.f0(M(0, this.f33249a), key, 0, false, 6, null), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
        throw new C0920i();
    }

    public final int B(CharSequence charSequence, int i8) {
        char cCharAt = charSequence.charAt(i8);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        x(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6, null);
        throw new C0920i();
    }

    public final StringBuilder C() {
        return this.f33252d;
    }

    public abstract CharSequence D();

    public final boolean E() {
        return H() != 10;
    }

    public final boolean F(char c8) {
        return !(c8 == '}' || c8 == ']' || c8 == ':' || c8 == ',');
    }

    public abstract String G(String str, boolean z8);

    public final byte H() {
        CharSequence charSequenceD = D();
        int i8 = this.f33249a;
        while (true) {
            int iJ = J(i8);
            if (iJ == -1) {
                this.f33249a = iJ;
                return (byte) 10;
            }
            char cCharAt = charSequenceD.charAt(iJ);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f33249a = iJ;
                return AbstractC2895b.a(cCharAt);
            }
            i8 = iJ + 1;
        }
    }

    public final String I(boolean z8) {
        String strO;
        byte bH = H();
        if (z8) {
            if (bH != 1 && bH != 0) {
                return null;
            }
            strO = q();
        } else {
            if (bH != 1) {
                return null;
            }
            strO = o();
        }
        this.f33251c = strO;
        return strO;
    }

    public abstract int J(int i8);

    public final void K(boolean z8) {
        ArrayList arrayList = new ArrayList();
        byte bH = H();
        if (bH != 8 && bH != 6) {
            q();
            return;
        }
        while (true) {
            byte bH2 = H();
            if (bH2 != 1) {
                if (bH2 == 8 || bH2 == 6) {
                    arrayList.add(Byte.valueOf(bH2));
                } else if (bH2 == 9) {
                    if (((Number) D6.z.t0(arrayList)).byteValue() != 8) {
                        throw C.f(this.f33249a, "found ] instead of } at path: " + this.f33250b, D());
                    }
                    D6.w.O(arrayList);
                } else if (bH2 == 7) {
                    if (((Number) D6.z.t0(arrayList)).byteValue() != 6) {
                        throw C.f(this.f33249a, "found } instead of ] at path: " + this.f33250b, D());
                    }
                    D6.w.O(arrayList);
                } else if (bH2 == 10) {
                    x(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6, null);
                    throw new C0920i();
                }
                j();
                if (arrayList.size() == 0) {
                    return;
                }
            } else if (z8) {
                q();
            } else {
                i();
            }
        }
    }

    public int L() {
        int iJ;
        char cCharAt;
        int i8 = this.f33249a;
        while (true) {
            iJ = J(i8);
            if (iJ == -1 || !((cCharAt = D().charAt(iJ)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                break;
            }
            i8 = iJ + 1;
        }
        this.f33249a = iJ;
        return iJ;
    }

    public String M(int i8, int i9) {
        return D().subSequence(i8, i9).toString();
    }

    public final String N() {
        String str = this.f33251c;
        kotlin.jvm.internal.t.d(str);
        this.f33251c = null;
        return str;
    }

    public abstract boolean O();

    public final boolean P(boolean z8) {
        int iJ = J(L());
        int length = D().length() - iJ;
        if (length < 4 || iJ == -1) {
            return false;
        }
        for (int i8 = 0; i8 < 4; i8++) {
            if ("null".charAt(i8) != D().charAt(iJ + i8)) {
                return false;
            }
        }
        if (length > 4 && AbstractC2895b.a(D().charAt(iJ + 4)) == 0) {
            return false;
        }
        if (!z8) {
            return true;
        }
        this.f33249a = iJ + 4;
        return true;
    }

    public final void R(char c8) {
        int i8 = this.f33249a;
        if (i8 > 0 && c8 == '\"') {
            try {
                this.f33249a = i8 - 1;
                String strQ = q();
                this.f33249a = i8;
                if (kotlin.jvm.internal.t.c(strQ, "null")) {
                    w("Expected string literal but 'null' literal was found", this.f33249a - 1, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw new C0920i();
                }
            } catch (Throwable th) {
                this.f33249a = i8;
                throw th;
            }
        }
        z(this, AbstractC2895b.a(c8), false, 2, null);
        throw new C0920i();
    }

    public final boolean S() {
        return D().charAt(this.f33249a - 1) != '\"';
    }

    public final int a(int i8) {
        int iJ = J(i8);
        if (iJ == -1) {
            x(this, "Expected escape sequence to continue, got EOF", 0, null, 6, null);
            throw new C0920i();
        }
        int i9 = iJ + 1;
        char cCharAt = D().charAt(iJ);
        if (cCharAt == 'u') {
            return c(D(), i9);
        }
        char cB = AbstractC2895b.b(cCharAt);
        if (cB != 0) {
            this.f33252d.append(cB);
            return i9;
        }
        x(this, "Invalid escaped char '" + cCharAt + '\'', 0, null, 6, null);
        throw new C0920i();
    }

    public final int b(int i8, int i9) {
        d(i8, i9);
        return a(i9 + 1);
    }

    public final int c(CharSequence charSequence, int i8) {
        int i9 = i8 + 4;
        if (i9 < charSequence.length()) {
            this.f33252d.append((char) ((B(charSequence, i8) << 12) + (B(charSequence, i8 + 1) << 8) + (B(charSequence, i8 + 2) << 4) + B(charSequence, i8 + 3)));
            return i9;
        }
        this.f33249a = i8;
        u();
        if (this.f33249a + 4 < charSequence.length()) {
            return c(charSequence, this.f33249a);
        }
        x(this, "Unexpected EOF during unicode escape", 0, null, 6, null);
        throw new C0920i();
    }

    public void d(int i8, int i9) {
        this.f33252d.append(D(), i8, i9);
    }

    public abstract boolean e();

    public final boolean f(int i8) {
        int iJ = J(i8);
        if (iJ >= D().length() || iJ == -1) {
            x(this, "EOF", 0, null, 6, null);
            throw new C0920i();
        }
        int i9 = iJ + 1;
        int iCharAt = D().charAt(iJ) | ' ';
        if (iCharAt == 102) {
            h("alse", i9);
            return false;
        }
        if (iCharAt == 116) {
            h("rue", i9);
            return true;
        }
        x(this, "Expected valid boolean literal prefix, but had '" + q() + '\'', 0, null, 6, null);
        throw new C0920i();
    }

    public final boolean g() {
        boolean z8;
        int iL = L();
        if (iL == D().length()) {
            x(this, "EOF", 0, null, 6, null);
            throw new C0920i();
        }
        if (D().charAt(iL) == '\"') {
            iL++;
            z8 = true;
        } else {
            z8 = false;
        }
        boolean zF = f(iL);
        if (!z8) {
            return zF;
        }
        if (this.f33249a == D().length()) {
            x(this, "EOF", 0, null, 6, null);
            throw new C0920i();
        }
        if (D().charAt(this.f33249a) == '\"') {
            this.f33249a++;
            return zF;
        }
        x(this, "Expected closing quotation mark", 0, null, 6, null);
        throw new C0920i();
    }

    public final void h(String str, int i8) {
        if (D().length() - i8 < str.length()) {
            x(this, "Unexpected end of boolean literal", 0, null, 6, null);
            throw new C0920i();
        }
        int length = str.length();
        for (int i9 = 0; i9 < length; i9++) {
            if (str.charAt(i9) != (D().charAt(i8 + i9) | ' ')) {
                x(this, "Expected valid boolean literal prefix, but had '" + q() + '\'', 0, null, 6, null);
                throw new C0920i();
            }
        }
        this.f33249a = i8 + str.length();
    }

    public abstract String i();

    public abstract byte j();

    public final byte k(byte b8) {
        byte bJ = j();
        if (bJ == b8) {
            return bJ;
        }
        z(this, b8, false, 2, null);
        throw new C0920i();
    }

    public void l(char c8) {
        u();
        CharSequence charSequenceD = D();
        int i8 = this.f33249a;
        while (true) {
            int iJ = J(i8);
            if (iJ == -1) {
                this.f33249a = iJ;
                R(c8);
                return;
            }
            int i9 = iJ + 1;
            char cCharAt = charSequenceD.charAt(iJ);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f33249a = i9;
                if (cCharAt == c8) {
                    return;
                } else {
                    R(c8);
                }
            }
            i8 = i9;
        }
    }

    public final long m() {
        boolean z8;
        boolean z9;
        int iJ = J(L());
        if (iJ >= D().length() || iJ == -1) {
            x(this, "EOF", 0, null, 6, null);
            throw new C0920i();
        }
        if (D().charAt(iJ) == '\"') {
            iJ++;
            if (iJ == D().length()) {
                x(this, "EOF", 0, null, 6, null);
                throw new C0920i();
            }
            z8 = true;
        } else {
            z8 = false;
        }
        int i8 = iJ;
        boolean z10 = false;
        boolean z11 = false;
        long j8 = 0;
        long j9 = 0;
        loop0: while (true) {
            z9 = false;
            while (true) {
                if (i8 == D().length()) {
                    break loop0;
                }
                char cCharAt = D().charAt(i8);
                if ((cCharAt == 'e' || cCharAt == 'E') && !z10) {
                    if (i8 == iJ) {
                        x(this, "Unexpected symbol " + cCharAt + " in numeric literal", 0, null, 6, null);
                        throw new C0920i();
                    }
                    i8++;
                    z10 = true;
                } else if (cCharAt != '-' || !z10) {
                    if (cCharAt != '+' || !z10) {
                        if (cCharAt != '-') {
                            if (AbstractC2895b.a(cCharAt) != 0) {
                                break loop0;
                            }
                            i8++;
                            int i9 = cCharAt - '0';
                            if (i9 < 0 || i9 >= 10) {
                                x(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", 0, null, 6, null);
                                throw new C0920i();
                            }
                            if (z10) {
                                j9 = (j9 * ((long) 10)) + ((long) i9);
                            } else {
                                j8 = (j8 * ((long) 10)) - ((long) i9);
                                if (j8 > 0) {
                                    x(this, "Numeric value overflow", 0, null, 6, null);
                                    throw new C0920i();
                                }
                            }
                        } else {
                            if (i8 != iJ) {
                                x(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
                                throw new C0920i();
                            }
                            i8++;
                            z11 = true;
                        }
                    } else {
                        if (i8 == iJ) {
                            x(this, "Unexpected symbol '+' in numeric literal", 0, null, 6, null);
                            throw new C0920i();
                        }
                        i8++;
                    }
                }
                z9 = true;
            }
            if (i8 == iJ) {
                x(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
                throw new C0920i();
            }
            i8++;
        }
        boolean z12 = i8 != iJ;
        if (iJ == i8 || (z11 && iJ == i8 - 1)) {
            x(this, "Expected numeric literal", 0, null, 6, null);
            throw new C0920i();
        }
        if (z8) {
            if (!z12) {
                x(this, "EOF", 0, null, 6, null);
                throw new C0920i();
            }
            if (D().charAt(i8) != '\"') {
                x(this, "Expected closing quotation mark", 0, null, 6, null);
                throw new C0920i();
            }
            i8++;
        }
        this.f33249a = i8;
        if (z10) {
            double dN = j8 * n(j9, z9);
            if (dN > 9.223372036854776E18d || dN < -9.223372036854776E18d) {
                x(this, "Numeric value overflow", 0, null, 6, null);
                throw new C0920i();
            }
            if (Math.floor(dN) != dN) {
                x(this, "Can't convert " + dN + " to Long", 0, null, 6, null);
                throw new C0920i();
            }
            j8 = (long) dN;
        }
        if (z11) {
            return j8;
        }
        if (j8 != Long.MIN_VALUE) {
            return -j8;
        }
        x(this, "Numeric value overflow", 0, null, 6, null);
        throw new C0920i();
    }

    public final String o() {
        return this.f33251c != null ? N() : i();
    }

    public final String p(CharSequence source, int i8, int i9) {
        kotlin.jvm.internal.t.g(source, "source");
        char cCharAt = source.charAt(i9);
        boolean z8 = false;
        while (cCharAt != '\"') {
            if (cCharAt == '\\') {
                int iJ = J(b(i8, i9));
                if (iJ == -1) {
                    x(this, "Unexpected EOF", iJ, null, 4, null);
                    throw new C0920i();
                }
                z8 = true;
                i8 = iJ;
                i9 = i8;
            } else {
                i9++;
                if (i9 >= source.length()) {
                    d(i8, i9);
                    int iJ2 = J(i9);
                    if (iJ2 == -1) {
                        x(this, "Unexpected EOF", iJ2, null, 4, null);
                        throw new C0920i();
                    }
                    i8 = iJ2;
                    i9 = i8;
                    z8 = true;
                } else {
                    continue;
                }
            }
            cCharAt = source.charAt(i9);
        }
        String strM = !z8 ? M(i8, i9) : s(i8, i9);
        this.f33249a = i9 + 1;
        return strM;
    }

    public final String q() {
        if (this.f33251c != null) {
            return N();
        }
        int iL = L();
        if (iL >= D().length() || iL == -1) {
            x(this, "EOF", iL, null, 4, null);
            throw new C0920i();
        }
        byte bA = AbstractC2895b.a(D().charAt(iL));
        if (bA == 1) {
            return o();
        }
        if (bA != 0) {
            x(this, "Expected beginning of the string, but got " + D().charAt(iL), 0, null, 6, null);
            throw new C0920i();
        }
        boolean z8 = false;
        while (AbstractC2895b.a(D().charAt(iL)) == 0) {
            iL++;
            if (iL >= D().length()) {
                d(this.f33249a, iL);
                int iJ = J(iL);
                if (iJ == -1) {
                    this.f33249a = iL;
                    return s(0, 0);
                }
                iL = iJ;
                z8 = true;
            }
        }
        String strM = !z8 ? M(this.f33249a, iL) : s(this.f33249a, iL);
        this.f33249a = iL;
        return strM;
    }

    public final String s(int i8, int i9) {
        d(i8, i9);
        String string = this.f33252d.toString();
        kotlin.jvm.internal.t.f(string, "toString(...)");
        this.f33252d.setLength(0);
        return string;
    }

    public final void t() {
        this.f33251c = null;
    }

    public String toString() {
        return "JsonReader(source='" + ((Object) D()) + "', currentPosition=" + this.f33249a + ')';
    }

    public void u() {
    }

    public final void v() {
        if (j() == 10) {
            return;
        }
        x(this, "Expected EOF after parsing, but had " + D().charAt(this.f33249a - 1) + " instead", 0, null, 6, null);
        throw new C0920i();
    }

    public final Void w(String message, int i8, String hint) {
        String str;
        kotlin.jvm.internal.t.g(message, "message");
        kotlin.jvm.internal.t.g(hint, "hint");
        if (hint.length() == 0) {
            str = "";
        } else {
            str = '\n' + hint;
        }
        throw C.f(i8, message + " at path: " + this.f33250b.a() + str, D());
    }

    public final Void y(byte b8, boolean z8) {
        String strC = AbstractC2895b.c(b8);
        int i8 = z8 ? this.f33249a - 1 : this.f33249a;
        x(this, "Expected " + strC + ", but had '" + ((this.f33249a == D().length() || i8 < 0) ? "EOF" : String.valueOf(D().charAt(i8))) + "' instead", i8, null, 4, null);
        throw new C0920i();
    }

    public final String r() {
        String strQ = q();
        if (kotlin.jvm.internal.t.c(strQ, "null") && S()) {
            x(this, cFAYKUlMj.edgqYS, 0, null, 6, null);
            throw new C0920i();
        }
        return strQ;
    }
}
