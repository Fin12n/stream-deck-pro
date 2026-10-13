package io.sentry.vendor.gson.stream;

import V.ocy.SVzBK;
import com.amazon.device.simplesignin.a.LSJS.cFAYKUlMj;
import com.revenuecat.purchases.common.Constants;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class c implements Closeable, Flushable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f27780j = new String[128];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String[] f27781k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Writer f27782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f27783b = new int[32];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27784c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f27785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f27786e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f27787f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f27788g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f27789h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f27790i;

    public c(Writer writer) {
        w0(6);
        this.f27786e = Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR;
        this.f27790i = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.f27782a = writer;
    }

    public c A(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f27789h != null) {
            throw new IllegalStateException();
        }
        if (this.f27784c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f27789h = str;
        return this;
    }

    public final void A0(int i8) {
        this.f27783b[this.f27784c - 1] = i8;
    }

    public final void H0(String str) {
        if (str.length() == 0) {
            this.f27785d = null;
            this.f27786e = Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR;
        } else {
            this.f27785d = str;
            this.f27786e = ": ";
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    public final void J0(String str) throws IOException {
        String str2;
        String[] strArr = this.f27788g ? f27781k : f27780j;
        this.f27782a.write(34);
        int length = str.length();
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            char cCharAt = str.charAt(i9);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i8 < i9) {
                        this.f27782a.write(str, i8, i9 - i8);
                    }
                    this.f27782a.write(str2);
                    i8 = i9 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i8 < i9) {
                    this.f27782a.write(str, i8, i9 - i8);
                }
                this.f27782a.write(str2);
                i8 = i9 + 1;
            }
        }
        if (i8 < length) {
            this.f27782a.write(str, i8, length - i8);
        }
        this.f27782a.write(34);
    }

    public c L0(double d8) throws IOException {
        g1();
        if (this.f27787f || !(Double.isNaN(d8) || Double.isInfinite(d8))) {
            c();
            this.f27782a.append((CharSequence) Double.toString(d8));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d8);
    }

    public c O0(long j8) throws IOException {
        g1();
        c();
        this.f27782a.write(Long.toString(j8));
        return this;
    }

    public c Q0(Boolean bool) throws IOException {
        if (bool == null) {
            return i0();
        }
        g1();
        c();
        this.f27782a.write(bool.booleanValue() ? com.amazon.a.a.o.b.af : com.amazon.a.a.o.b.ag);
        return this;
    }

    public c T0(Number number) throws IOException {
        if (number == null) {
            return i0();
        }
        g1();
        String string = number.toString();
        if (this.f27787f || !(string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            c();
            this.f27782a.append((CharSequence) string);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    public c V0(String str) throws IOException {
        if (str == null) {
            return i0();
        }
        g1();
        c();
        J0(str);
        return this;
    }

    public final void Y() throws IOException {
        if (this.f27785d == null) {
            return;
        }
        this.f27782a.write(10);
        int i8 = this.f27784c;
        for (int i9 = 1; i9 < i8; i9++) {
            this.f27782a.write(this.f27785d);
        }
    }

    public c a1(boolean z8) throws IOException {
        g1();
        c();
        this.f27782a.write(z8 ? com.amazon.a.a.o.b.af : com.amazon.a.a.o.b.ag);
        return this;
    }

    public final void b() throws IOException {
        int iR0 = r0();
        if (iR0 == 5) {
            this.f27782a.write(44);
        } else if (iR0 != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        Y();
        A0(4);
    }

    public final void c() throws IOException {
        int iR0 = r0();
        if (iR0 == 1) {
            A0(2);
            Y();
            return;
        }
        if (iR0 == 2) {
            this.f27782a.append(',');
            Y();
        } else {
            if (iR0 == 4) {
                this.f27782a.append((CharSequence) this.f27786e);
                A0(5);
                return;
            }
            if (iR0 != 6) {
                if (iR0 != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f27787f) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            A0(7);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f27782a.close();
        int i8 = this.f27784c;
        if (i8 > 1 || (i8 == 1 && this.f27783b[i8 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f27784c = 0;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f27784c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f27782a.flush();
    }

    public final void g1() throws IOException {
        if (this.f27789h != null) {
            b();
            J0(this.f27789h);
            this.f27789h = null;
        }
    }

    public c i0() throws IOException {
        if (this.f27789h != null) {
            if (!this.f27790i) {
                this.f27789h = null;
                return this;
            }
            g1();
        }
        c();
        this.f27782a.write("null");
        return this;
    }

    public c j() throws IOException {
        g1();
        return j0(1, '[');
    }

    public final c j0(int i8, char c8) throws IOException {
        c();
        w0(i8);
        this.f27782a.write(c8);
        return this;
    }

    public c o() throws IOException {
        g1();
        return j0(3, '{');
    }

    public final int r0() {
        int i8 = this.f27784c;
        if (i8 != 0) {
            return this.f27783b[i8 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void s(boolean z8) {
        this.f27787f = z8;
    }

    public final c t(int i8, int i9, char c8) throws IOException {
        int iR0 = r0();
        if (iR0 != i9 && iR0 != i8) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f27789h != null) {
            throw new IllegalStateException("Dangling name: " + this.f27789h);
        }
        this.f27784c--;
        if (iR0 == i9) {
            Y();
        }
        this.f27782a.write(c8);
        return this;
    }

    public c v() {
        return t(1, 2, ']');
    }

    public final void w0(int i8) {
        int i9 = this.f27784c;
        int[] iArr = this.f27783b;
        if (i9 == iArr.length) {
            this.f27783b = Arrays.copyOf(iArr, i9 * 2);
        }
        int[] iArr2 = this.f27783b;
        int i10 = this.f27784c;
        this.f27784c = i10 + 1;
        iArr2[i10] = i8;
    }

    public c y() {
        return t(3, 5, '}');
    }

    public c z(String str) throws IOException {
        if (str == null) {
            return i0();
        }
        g1();
        c();
        this.f27782a.append((CharSequence) str);
        return this;
    }

    static {
        for (int i8 = 0; i8 <= 31; i8++) {
            f27780j[i8] = String.format(SVzBK.HrYVYGLzpFoRBH, Integer.valueOf(i8));
        }
        String[] strArr = f27780j;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f27781k = strArr2;
        strArr2[60] = cFAYKUlMj.AwCkjFFdUis;
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }
}
