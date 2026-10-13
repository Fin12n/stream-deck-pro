package io.sentry.vendor.gson.stream;

import com.elgato.streamdeck.vsd2.KnownHost;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class a implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Reader f27765a;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f27773i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f27774j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f27775k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f27776l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String[] f27778n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int[] f27779o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f27766b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final char[] f27767c = new char[1024];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27768d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27769e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f27770f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f27771g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f27772h = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f27777m = 1;

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f27776l = iArr;
        iArr[0] = 6;
        this.f27778n = new String[32];
        this.f27779o = new int[32];
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.f27765a = reader;
    }

    public String A() {
        return " at line " + (this.f27770f + 1) + " column " + ((this.f27768d - this.f27771g) + 1) + " path " + w();
    }

    public final int A0() {
        String str;
        String str2;
        int i8;
        char c8 = this.f27767c[this.f27768d];
        if (c8 == 't' || c8 == 'T') {
            str = com.amazon.a.a.o.b.af;
            str2 = "TRUE";
            i8 = 5;
        } else if (c8 == 'f' || c8 == 'F') {
            str = com.amazon.a.a.o.b.ag;
            str2 = "FALSE";
            i8 = 6;
        } else {
            if (c8 != 'n' && c8 != 'N') {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i8 = 7;
        }
        int length = str.length();
        for (int i9 = 1; i9 < length; i9++) {
            if (this.f27768d + i9 >= this.f27769e && !v(i9 + 1)) {
                return 0;
            }
            char c9 = this.f27767c[this.f27768d + i9];
            if (c9 != str.charAt(i9) && c9 != str2.charAt(i9)) {
                return 0;
            }
        }
        if ((this.f27768d + length < this.f27769e || v(length + 1)) && z(this.f27767c[this.f27768d + length])) {
            return 0;
        }
        this.f27768d += length;
        this.f27772h = i8;
        return i8;
    }

    public String F0() throws IOException {
        String strR0;
        int iO = this.f27772h;
        if (iO == 0) {
            iO = o();
        }
        if (iO == 14) {
            strR0 = w0();
        } else if (iO == 12) {
            strR0 = r0('\'');
        } else {
            if (iO != 13) {
                throw new IllegalStateException("Expected a name but was " + peek() + A());
            }
            strR0 = r0('\"');
        }
        this.f27772h = 0;
        this.f27778n[this.f27777m - 1] = strR0;
        return strR0;
    }

    public String G() throws IOException {
        String str;
        int iO = this.f27772h;
        if (iO == 0) {
            iO = o();
        }
        if (iO == 10) {
            str = w0();
        } else if (iO == 8) {
            str = r0('\'');
        } else if (iO == 9) {
            str = r0('\"');
        } else if (iO == 11) {
            str = this.f27775k;
            this.f27775k = null;
        } else if (iO == 15) {
            str = Long.toString(this.f27773i);
        } else {
            if (iO != 16) {
                throw new IllegalStateException("Expected a string but was " + peek() + A());
            }
            str = new String(this.f27767c, this.f27768d, this.f27774j);
            this.f27768d += this.f27774j;
        }
        this.f27772h = 0;
        int[] iArr = this.f27779o;
        int i8 = this.f27777m - 1;
        iArr[i8] = iArr[i8] + 1;
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX WARN: Code duplicated, block: B:85:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x00da  */
    /* JADX WARN: Code duplicated, block: B:91:0x00e1  */
    public final int H0() {
        char c8;
        int i8;
        char[] cArr = this.f27767c;
        int i9 = this.f27768d;
        int i10 = this.f27769e;
        int i11 = 0;
        int i12 = 0;
        char c9 = 0;
        boolean z8 = false;
        int i13 = 1;
        long j8 = 0;
        while (true) {
            char c10 = 2;
            if (i9 + i12 != i10) {
                c8 = cArr[i9 + i12];
                i8 = i11;
                if (c8 != '+') {
                    if (c8 != 'E' || c8 == 'e') {
                        if (c9 == 2 && c9 != 4) {
                            return i8;
                        }
                        c9 = 5;
                    } else if (c8 == '-') {
                        c10 = 6;
                        if (c9 == 0) {
                            c9 = 1;
                            z8 = true;
                        } else if (c9 != 5) {
                            return i8;
                        }
                    } else if (c8 != '.') {
                        if (c8 < '0' || c8 > '9') {
                            if (!z(c8)) {
                                break;
                            }
                            return i8;
                        }
                        if (c9 == 1 || c9 == 0) {
                            j8 = -(c8 - '0');
                        } else if (c9 == 2) {
                            if (j8 == 0) {
                                return i8;
                            }
                            long j9 = (10 * j8) - ((long) (c8 - '0'));
                            i13 &= (j8 > -922337203685477580L || (j8 == -922337203685477580L && j9 < j8)) ? 1 : i8;
                            j8 = j9;
                        } else if (c9 == 3) {
                            c9 = 4;
                        } else if (c9 == 5 || c9 == 6) {
                            c9 = 7;
                        }
                    } else {
                        if (c9 != 2) {
                            return i8;
                        }
                        c9 = 3;
                    }
                    i12++;
                    i11 = i8;
                } else {
                    c10 = 6;
                    if (c9 != 5) {
                        return i8;
                    }
                }
                c9 = c10;
                i12++;
                i11 = i8;
            } else {
                if (i12 == cArr.length) {
                    return i11;
                }
                if (!v(i12 + 1)) {
                    i8 = i11;
                    break;
                }
                i9 = this.f27768d;
                i10 = this.f27769e;
                c8 = cArr[i9 + i12];
                i8 = i11;
                if (c8 != '+') {
                    if (c8 != 'E') {
                        if (c9 == 2) {
                        }
                        c9 = 5;
                    } else {
                        if (c9 == 2) {
                        }
                        c9 = 5;
                    }
                    i12++;
                    i11 = i8;
                } else {
                    c10 = 6;
                    if (c9 != 5) {
                        return i8;
                    }
                }
                c9 = c10;
                i12++;
                i11 = i8;
            }
        }
        if (c9 == 2 && i13 != 0 && ((j8 != Long.MIN_VALUE || z8) && (j8 != 0 || !z8))) {
            if (!z8) {
                j8 = -j8;
            }
            this.f27773i = j8;
            this.f27768d += i12;
            this.f27772h = 15;
            return 15;
        }
        if (c9 != 2 && c9 != 4 && c9 != 7) {
            return i8;
        }
        this.f27774j = i12;
        this.f27772h = 16;
        return 16;
    }

    public final void J0(int i8) {
        int i9 = this.f27777m;
        int[] iArr = this.f27776l;
        if (i9 == iArr.length) {
            int i10 = i9 * 2;
            this.f27776l = Arrays.copyOf(iArr, i10);
            this.f27779o = Arrays.copyOf(this.f27779o, i10);
            this.f27778n = (String[]) Arrays.copyOf(this.f27778n, i10);
        }
        int[] iArr2 = this.f27776l;
        int i11 = this.f27777m;
        this.f27777m = i11 + 1;
        iArr2[i11] = i8;
    }

    public final char L0() throws IOException {
        int i8;
        if (this.f27768d == this.f27769e && !v(1)) {
            throw a1("Unterminated escape sequence");
        }
        char[] cArr = this.f27767c;
        int i9 = this.f27768d;
        int i10 = i9 + 1;
        this.f27768d = i10;
        char c8 = cArr[i9];
        if (c8 == '\n') {
            this.f27770f++;
            this.f27771g = i10;
            return c8;
        }
        if (c8 == '\"' || c8 == '\'' || c8 == '/' || c8 == '\\') {
            return c8;
        }
        if (c8 == 'b') {
            return '\b';
        }
        if (c8 == 'f') {
            return '\f';
        }
        if (c8 == 'n') {
            return '\n';
        }
        if (c8 == 'r') {
            return '\r';
        }
        if (c8 == 't') {
            return '\t';
        }
        if (c8 != 'u') {
            throw a1("Invalid escape sequence");
        }
        if (i9 + 5 > this.f27769e && !v(4)) {
            throw a1("Unterminated escape sequence");
        }
        int i11 = this.f27768d;
        int i12 = i11 + 4;
        char c9 = 0;
        while (i11 < i12) {
            char c10 = this.f27767c[i11];
            char c11 = (char) (c9 << 4);
            if (c10 >= '0' && c10 <= '9') {
                i8 = c10 - '0';
            } else if (c10 >= 'a' && c10 <= 'f') {
                i8 = c10 - 'W';
            } else {
                if (c10 < 'A' || c10 > 'F') {
                    throw new NumberFormatException("\\u" + new String(this.f27767c, this.f27768d, 4));
                }
                i8 = c10 - '7';
            }
            c9 = (char) (c11 + i8);
            i11++;
        }
        this.f27768d += 4;
        return c9;
    }

    public final void O0(char c8) throws IOException {
        char[] cArr = this.f27767c;
        do {
            int i8 = this.f27768d;
            int i9 = this.f27769e;
            while (i8 < i9) {
                int i10 = i8 + 1;
                char c9 = cArr[i8];
                if (c9 == c8) {
                    this.f27768d = i10;
                    return;
                }
                if (c9 == '\\') {
                    this.f27768d = i10;
                    L0();
                    i8 = this.f27768d;
                    i9 = this.f27769e;
                } else {
                    if (c9 == '\n') {
                        this.f27770f++;
                        this.f27771g = i10;
                    }
                    i8 = i10;
                }
            }
            this.f27768d = i8;
        } while (v(1));
        throw a1("Unterminated string");
    }

    public final boolean Q0(String str) {
        int length = str.length();
        while (true) {
            if (this.f27768d + length > this.f27769e && !v(length)) {
                return false;
            }
            char[] cArr = this.f27767c;
            int i8 = this.f27768d;
            if (cArr[i8] != '\n') {
                for (int i9 = 0; i9 < length; i9++) {
                    if (this.f27767c[this.f27768d + i9] == str.charAt(i9)) {
                    }
                }
                return true;
            }
            this.f27770f++;
            this.f27771g = i8 + 1;
            this.f27768d++;
        }
    }

    public void R() throws IOException {
        int i8 = 0;
        do {
            int iO = this.f27772h;
            if (iO == 0) {
                iO = o();
            }
            if (iO == 3) {
                J0(1);
            } else {
                if (iO == 1) {
                    J0(3);
                } else if (iO == 4 || iO == 2) {
                    this.f27777m--;
                    i8--;
                } else if (iO == 14 || iO == 10) {
                    V0();
                } else if (iO == 8 || iO == 12) {
                    O0('\'');
                } else if (iO == 9 || iO == 13) {
                    O0('\"');
                } else if (iO == 16) {
                    this.f27768d += this.f27774j;
                }
                this.f27772h = 0;
            }
            i8++;
            this.f27772h = 0;
        } while (i8 != 0);
        int[] iArr = this.f27779o;
        int i9 = this.f27777m;
        int i10 = i9 - 1;
        iArr[i10] = iArr[i10] + 1;
        this.f27778n[i9 - 1] = "null";
    }

    public final void T0() {
        char c8;
        do {
            if (this.f27768d >= this.f27769e && !v(1)) {
                return;
            }
            char[] cArr = this.f27767c;
            int i8 = this.f27768d;
            int i9 = i8 + 1;
            this.f27768d = i9;
            c8 = cArr[i8];
            if (c8 == '\n') {
                this.f27770f++;
                this.f27771g = i9;
                return;
            }
        } while (c8 != '\r');
    }

    public final void V0() throws IOException {
        do {
            int i8 = 0;
            while (true) {
                int i9 = this.f27768d;
                if (i9 + i8 < this.f27769e) {
                    char c8 = this.f27767c[i9 + i8];
                    if (c8 != '\t' && c8 != '\n' && c8 != '\f' && c8 != '\r' && c8 != ' ') {
                        if (c8 != '#') {
                            if (c8 != ',') {
                                if (c8 != '/' && c8 != '=') {
                                    if (c8 != '{' && c8 != '}' && c8 != ':') {
                                        if (c8 != ';') {
                                            switch (c8) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i8++;
                                                    break;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                        c();
                    }
                    this.f27768d += i8;
                    return;
                }
                this.f27768d = i9 + i8;
            }
        } while (v(1));
    }

    public boolean Y() throws IOException {
        int iO = this.f27772h;
        if (iO == 0) {
            iO = o();
        }
        if (iO == 5) {
            this.f27772h = 0;
            int[] iArr = this.f27779o;
            int i8 = this.f27777m - 1;
            iArr[i8] = iArr[i8] + 1;
            return true;
        }
        if (iO == 6) {
            this.f27772h = 0;
            int[] iArr2 = this.f27779o;
            int i9 = this.f27777m - 1;
            iArr2[i9] = iArr2[i9] + 1;
            return false;
        }
        throw new IllegalStateException("Expected a boolean but was " + peek() + A());
    }

    public final IOException a1(String str) throws d {
        throw new d(str + A());
    }

    public void b() throws IOException {
        int iO = this.f27772h;
        if (iO == 0) {
            iO = o();
        }
        if (iO == 3) {
            J0(1);
            this.f27779o[this.f27777m - 1] = 0;
            this.f27772h = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + peek() + A());
        }
    }

    public final void c() throws IOException {
        if (!this.f27766b) {
            throw a1("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f27772h = 0;
        this.f27776l[0] = 8;
        this.f27777m = 1;
        this.f27765a.close();
    }

    public final int i0(boolean z8) throws IOException {
        char[] cArr = this.f27767c;
        int i8 = this.f27768d;
        int i9 = this.f27769e;
        while (true) {
            if (i8 == i9) {
                this.f27768d = i8;
                if (!v(1)) {
                    if (!z8) {
                        return -1;
                    }
                    throw new EOFException("End of input" + A());
                }
                i8 = this.f27768d;
                i9 = this.f27769e;
            }
            int i10 = i8 + 1;
            char c8 = cArr[i8];
            if (c8 == '\n') {
                this.f27770f++;
                this.f27771g = i10;
            } else if (c8 != ' ' && c8 != '\r' && c8 != '\t') {
                if (c8 == '/') {
                    this.f27768d = i10;
                    if (i10 == i9) {
                        this.f27768d = i8;
                        boolean zV = v(2);
                        this.f27768d++;
                        if (!zV) {
                        }
                        return c8;
                    }
                    c();
                    int i11 = this.f27768d;
                    char c9 = cArr[i11];
                    if (c9 == '*') {
                        this.f27768d = i11 + 1;
                        if (!Q0("*/")) {
                            throw a1("Unterminated comment");
                        }
                        i8 = this.f27768d + 2;
                        i9 = this.f27769e;
                    } else {
                        if (c9 != '/') {
                            return c8;
                        }
                        this.f27768d = i11 + 1;
                        T0();
                        i8 = this.f27768d;
                        i9 = this.f27769e;
                    }
                } else {
                    if (c8 != '#') {
                        this.f27768d = i10;
                        return c8;
                    }
                    this.f27768d = i10;
                    c();
                    T0();
                    i8 = this.f27768d;
                    i9 = this.f27769e;
                }
            }
            i8 = i10;
        }
    }

    public final void j() throws IOException {
        i0(true);
        int i8 = this.f27768d;
        int i9 = i8 - 1;
        this.f27768d = i9;
        if (i8 + 4 <= this.f27769e || v(5)) {
            char[] cArr = this.f27767c;
            if (cArr[i9] == ')' && cArr[i8] == ']' && cArr[i8 + 1] == '}' && cArr[i8 + 2] == '\'' && cArr[i8 + 3] == '\n') {
                this.f27768d += 5;
            }
        }
    }

    public void j0() throws IOException {
        int iO = this.f27772h;
        if (iO == 0) {
            iO = o();
        }
        if (iO == 7) {
            this.f27772h = 0;
            int[] iArr = this.f27779o;
            int i8 = this.f27777m - 1;
            iArr[i8] = iArr[i8] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + peek() + A());
    }

    public double nextDouble() throws IOException {
        int iO = this.f27772h;
        if (iO == 0) {
            iO = o();
        }
        if (iO == 15) {
            this.f27772h = 0;
            int[] iArr = this.f27779o;
            int i8 = this.f27777m - 1;
            iArr[i8] = iArr[i8] + 1;
            return this.f27773i;
        }
        if (iO == 16) {
            this.f27775k = new String(this.f27767c, this.f27768d, this.f27774j);
            this.f27768d += this.f27774j;
        } else if (iO == 8 || iO == 9) {
            this.f27775k = r0(iO == 8 ? '\'' : '\"');
        } else if (iO == 10) {
            this.f27775k = w0();
        } else if (iO != 11) {
            throw new IllegalStateException("Expected a double but was " + peek() + A());
        }
        this.f27772h = 11;
        double d8 = Double.parseDouble(this.f27775k);
        if (!this.f27766b && (Double.isNaN(d8) || Double.isInfinite(d8))) {
            throw new d("JSON forbids NaN and infinities: " + d8 + A());
        }
        this.f27775k = null;
        this.f27772h = 0;
        int[] iArr2 = this.f27779o;
        int i9 = this.f27777m - 1;
        iArr2[i9] = iArr2[i9] + 1;
        return d8;
    }

    public int nextInt() throws IOException {
        int iO = this.f27772h;
        if (iO == 0) {
            iO = o();
        }
        if (iO == 15) {
            long j8 = this.f27773i;
            int i8 = (int) j8;
            if (j8 == i8) {
                this.f27772h = 0;
                int[] iArr = this.f27779o;
                int i9 = this.f27777m - 1;
                iArr[i9] = iArr[i9] + 1;
                return i8;
            }
            throw new NumberFormatException("Expected an int but was " + this.f27773i + A());
        }
        if (iO == 16) {
            this.f27775k = new String(this.f27767c, this.f27768d, this.f27774j);
            this.f27768d += this.f27774j;
        } else {
            if (iO != 8 && iO != 9 && iO != 10) {
                throw new IllegalStateException("Expected an int but was " + peek() + A());
            }
            if (iO == 10) {
                this.f27775k = w0();
            } else {
                this.f27775k = r0(iO == 8 ? '\'' : '\"');
            }
            try {
                int i10 = Integer.parseInt(this.f27775k);
                this.f27772h = 0;
                int[] iArr2 = this.f27779o;
                int i11 = this.f27777m - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return i10;
            } catch (NumberFormatException unused) {
            }
        }
        this.f27772h = 11;
        double d8 = Double.parseDouble(this.f27775k);
        int i12 = (int) d8;
        if (i12 != d8) {
            throw new NumberFormatException("Expected an int but was " + this.f27775k + A());
        }
        this.f27775k = null;
        this.f27772h = 0;
        int[] iArr3 = this.f27779o;
        int i13 = this.f27777m - 1;
        iArr3[i13] = iArr3[i13] + 1;
        return i12;
    }

    public long nextLong() throws IOException {
        int iO = this.f27772h;
        if (iO == 0) {
            iO = o();
        }
        if (iO == 15) {
            this.f27772h = 0;
            int[] iArr = this.f27779o;
            int i8 = this.f27777m - 1;
            iArr[i8] = iArr[i8] + 1;
            return this.f27773i;
        }
        if (iO == 16) {
            this.f27775k = new String(this.f27767c, this.f27768d, this.f27774j);
            this.f27768d += this.f27774j;
        } else {
            if (iO != 8 && iO != 9 && iO != 10) {
                throw new IllegalStateException("Expected a long but was " + peek() + A());
            }
            if (iO == 10) {
                this.f27775k = w0();
            } else {
                this.f27775k = r0(iO == 8 ? '\'' : '\"');
            }
            try {
                long j8 = Long.parseLong(this.f27775k);
                this.f27772h = 0;
                int[] iArr2 = this.f27779o;
                int i9 = this.f27777m - 1;
                iArr2[i9] = iArr2[i9] + 1;
                return j8;
            } catch (NumberFormatException unused) {
            }
        }
        this.f27772h = 11;
        double d8 = Double.parseDouble(this.f27775k);
        long j9 = (long) d8;
        if (j9 != d8) {
            throw new NumberFormatException("Expected a long but was " + this.f27775k + A());
        }
        this.f27775k = null;
        this.f27772h = 0;
        int[] iArr3 = this.f27779o;
        int i10 = this.f27777m - 1;
        iArr3[i10] = iArr3[i10] + 1;
        return j9;
    }

    public int o() throws IOException {
        int iI0;
        int[] iArr = this.f27776l;
        int i8 = this.f27777m;
        int i9 = iArr[i8 - 1];
        if (i9 == 1) {
            iArr[i8 - 1] = 2;
        } else if (i9 == 2) {
            int iI1 = i0(true);
            if (iI1 != 44) {
                if (iI1 != 59) {
                    if (iI1 != 93) {
                        throw a1("Unterminated array");
                    }
                    this.f27772h = 4;
                    return 4;
                }
                c();
            }
        } else {
            if (i9 == 3 || i9 == 5) {
                iArr[i8 - 1] = 4;
                if (i9 == 5 && (iI0 = i0(true)) != 44) {
                    if (iI0 != 59) {
                        if (iI0 != 125) {
                            throw a1("Unterminated object");
                        }
                        this.f27772h = 2;
                        return 2;
                    }
                    c();
                }
                int iI2 = i0(true);
                if (iI2 == 34) {
                    this.f27772h = 13;
                    return 13;
                }
                if (iI2 == 39) {
                    c();
                    this.f27772h = 12;
                    return 12;
                }
                if (iI2 == 125) {
                    if (i9 == 5) {
                        throw a1("Expected name");
                    }
                    this.f27772h = 2;
                    return 2;
                }
                c();
                this.f27768d--;
                if (!z((char) iI2)) {
                    throw a1("Expected name");
                }
                this.f27772h = 14;
                return 14;
            }
            if (i9 == 4) {
                iArr[i8 - 1] = 5;
                int iI3 = i0(true);
                if (iI3 != 58) {
                    if (iI3 != 61) {
                        throw a1("Expected ':'");
                    }
                    c();
                    if (this.f27768d < this.f27769e || v(1)) {
                        char[] cArr = this.f27767c;
                        int i10 = this.f27768d;
                        if (cArr[i10] == '>') {
                            this.f27768d = i10 + 1;
                        }
                    }
                }
            } else if (i9 == 6) {
                if (this.f27766b) {
                    j();
                }
                this.f27776l[this.f27777m - 1] = 7;
            } else if (i9 == 7) {
                if (i0(false) == -1) {
                    this.f27772h = 17;
                    return 17;
                }
                c();
                this.f27768d--;
            } else if (i9 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iI4 = i0(true);
        if (iI4 == 34) {
            this.f27772h = 9;
            return 9;
        }
        if (iI4 == 39) {
            c();
            this.f27772h = 8;
            return 8;
        }
        if (iI4 != 44 && iI4 != 59) {
            if (iI4 == 91) {
                this.f27772h = 3;
                return 3;
            }
            if (iI4 != 93) {
                if (iI4 == 123) {
                    this.f27772h = 1;
                    return 1;
                }
                this.f27768d--;
                int iA0 = A0();
                if (iA0 != 0) {
                    return iA0;
                }
                int iH0 = H0();
                if (iH0 != 0) {
                    return iH0;
                }
                if (!z(this.f27767c[this.f27768d])) {
                    throw a1("Expected value");
                }
                c();
                this.f27772h = 10;
                return 10;
            }
            if (i9 == 1) {
                this.f27772h = 4;
                return 4;
            }
        }
        if (i9 != 1 && i9 != 2) {
            throw a1("Unexpected value");
        }
        c();
        this.f27768d--;
        this.f27772h = 7;
        return 7;
    }

    public b peek() throws IOException {
        int iO = this.f27772h;
        if (iO == 0) {
            iO = o();
        }
        switch (iO) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
            case KnownHost.Device.KEYPADROTATION_FIELD_NUMBER /* 14 */:
                return b.NAME;
            case KnownHost.Device.APPEARANCE_FIELD_NUMBER /* 15 */:
            case 16:
                return b.NUMBER;
            case KnownHost.Device.CUSTOMFACEPLATE_FIELD_NUMBER /* 17 */:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final String r0(char c8) throws IOException {
        int i8;
        char[] cArr = this.f27767c;
        StringBuilder sb = null;
        do {
            int i9 = this.f27768d;
            int i10 = this.f27769e;
            while (true) {
                int i11 = i10;
                i8 = i9;
                while (true) {
                    if (i9 < i11) {
                        int i12 = i9 + 1;
                        char c9 = cArr[i9];
                        if (c9 == c8) {
                            this.f27768d = i12;
                            int i13 = (i12 - i8) - 1;
                            if (sb == null) {
                                return new String(cArr, i8, i13);
                            }
                            sb.append(cArr, i8, i13);
                            return sb.toString();
                        }
                        if (c9 == '\\') {
                            this.f27768d = i12;
                            int i14 = i12 - i8;
                            int i15 = i14 - 1;
                            if (sb == null) {
                                sb = new StringBuilder(Math.max(i14 * 2, 16));
                            }
                            sb.append(cArr, i8, i15);
                            sb.append(L0());
                            i9 = this.f27768d;
                            i10 = this.f27769e;
                        } else {
                            if (c9 == '\n') {
                                this.f27770f++;
                                this.f27771g = i12;
                            }
                            i9 = i12;
                        }
                    }
                }
            }
            if (sb == null) {
                sb = new StringBuilder(Math.max((i9 - i8) * 2, 16));
            }
            sb.append(cArr, i8, i9 - i8);
            this.f27768d = i9;
        } while (v(1));
        throw a1("Unterminated string");
    }

    public final void s(boolean z8) {
        this.f27766b = z8;
    }

    public void t() throws IOException {
        int iO = this.f27772h;
        if (iO == 0) {
            iO = o();
        }
        if (iO != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + peek() + A());
        }
        int i8 = this.f27777m;
        this.f27777m = i8 - 1;
        int[] iArr = this.f27779o;
        int i9 = i8 - 2;
        iArr[i9] = iArr[i9] + 1;
        this.f27772h = 0;
    }

    public String toString() {
        return getClass().getSimpleName() + A();
    }

    public void u() throws IOException {
        int iO = this.f27772h;
        if (iO == 0) {
            iO = o();
        }
        if (iO != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + peek() + A());
        }
        int i8 = this.f27777m;
        int i9 = i8 - 1;
        this.f27777m = i9;
        this.f27778n[i9] = null;
        int[] iArr = this.f27779o;
        int i10 = i8 - 2;
        iArr[i10] = iArr[i10] + 1;
        this.f27772h = 0;
    }

    public final boolean v(int i8) throws IOException {
        int i9;
        int i10;
        char[] cArr = this.f27767c;
        int i11 = this.f27771g;
        int i12 = this.f27768d;
        this.f27771g = i11 - i12;
        int i13 = this.f27769e;
        if (i13 != i12) {
            int i14 = i13 - i12;
            this.f27769e = i14;
            System.arraycopy(cArr, i12, cArr, 0, i14);
        } else {
            this.f27769e = 0;
        }
        this.f27768d = 0;
        do {
            Reader reader = this.f27765a;
            int i15 = this.f27769e;
            int i16 = reader.read(cArr, i15, cArr.length - i15);
            if (i16 == -1) {
                return false;
            }
            i9 = this.f27769e + i16;
            this.f27769e = i9;
            if (this.f27770f == 0 && (i10 = this.f27771g) == 0 && i9 > 0 && cArr[0] == 65279) {
                this.f27768d++;
                this.f27771g = i10 + 1;
                i8++;
            }
        } while (i9 < i8);
        return true;
    }

    public String w() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i8 = this.f27777m;
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = this.f27776l[i9];
            if (i10 == 1 || i10 == 2) {
                sb.append('[');
                sb.append(this.f27779o[i9]);
                sb.append(']');
            } else if (i10 == 3 || i10 == 4 || i10 == 5) {
                sb.append(com.amazon.a.a.o.c.a.b.f16789a);
                String str = this.f27778n[i9];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    public final String w0() throws IOException {
        String string;
        StringBuilder sb = null;
        int i8 = 0;
        while (true) {
            int i9 = 0;
            while (true) {
                int i10 = this.f27768d;
                if (i10 + i9 < this.f27769e) {
                    char c8 = this.f27767c[i10 + i9];
                    if (c8 != '\t' && c8 != '\n' && c8 != '\f' && c8 != '\r' && c8 != ' ') {
                        if (c8 != '#') {
                            if (c8 != ',') {
                                if (c8 != '/' && c8 != '=') {
                                    if (c8 != '{' && c8 != '}' && c8 != ':') {
                                        if (c8 != ';') {
                                            switch (c8) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i9++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        c();
                    }
                    i8 = i9;
                } else if (i9 >= this.f27767c.length) {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i9, 16));
                    }
                    sb.append(this.f27767c, this.f27768d, i9);
                    this.f27768d += i9;
                    if (!v(1)) {
                    }
                } else if (!v(i9 + 1)) {
                    i8 = i9;
                }
                if (sb == null) {
                    string = new String(this.f27767c, this.f27768d, i8);
                } else {
                    sb.append(this.f27767c, this.f27768d, i8);
                    string = sb.toString();
                }
                this.f27768d += i8;
                return string;
            }
        }
    }

    public void x() throws IOException {
        int iO = this.f27772h;
        if (iO == 0) {
            iO = o();
        }
        if (iO == 1) {
            J0(3);
            this.f27772h = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + peek() + A());
        }
    }

    public boolean y() throws IOException {
        int iO = this.f27772h;
        if (iO == 0) {
            iO = o();
        }
        return (iO == 2 || iO == 4) ? false : true;
    }

    public final boolean z(char c8) throws IOException {
        if (c8 == '\t' || c8 == '\n' || c8 == '\f' || c8 == '\r' || c8 == ' ') {
            return false;
        }
        if (c8 != '#') {
            if (c8 == ',') {
                return false;
            }
            if (c8 != '/' && c8 != '=') {
                if (c8 == '{' || c8 == '}' || c8 == ':') {
                    return false;
                }
                if (c8 != ';') {
                    switch (c8) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        c();
        return false;
    }
}
