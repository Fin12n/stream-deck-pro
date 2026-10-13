package s7;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f33254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f33255b;

    static {
        String[] strArr = new String[93];
        for (int i8 = 0; i8 < 32; i8++) {
            strArr[i8] = "\\u" + e(i8 >> 12) + e(i8 >> 8) + e(i8 >> 4) + e(i8);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f33254a = strArr;
        byte[] bArr = new byte[93];
        for (int i9 = 0; i9 < 32; i9++) {
            bArr[i9] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f33255b = bArr;
    }

    public static final byte[] a() {
        return f33255b;
    }

    public static final String[] b() {
        return f33254a;
    }

    public static final void c(StringBuilder sb, String value) {
        kotlin.jvm.internal.t.g(sb, "<this>");
        kotlin.jvm.internal.t.g(value, "value");
        sb.append('\"');
        int length = value.length();
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            char cCharAt = value.charAt(i9);
            String[] strArr = f33254a;
            if (cCharAt < strArr.length && strArr[cCharAt] != null) {
                sb.append((CharSequence) value, i8, i9);
                sb.append(strArr[cCharAt]);
                i8 = i9 + 1;
            }
        }
        if (i8 != 0) {
            sb.append((CharSequence) value, i8, value.length());
        } else {
            sb.append(value);
        }
        sb.append('\"');
    }

    public static final Boolean d(String str) {
        kotlin.jvm.internal.t.g(str, "<this>");
        if (Z6.v.v(str, com.amazon.a.a.o.b.af, true)) {
            return Boolean.TRUE;
        }
        if (Z6.v.v(str, com.amazon.a.a.o.b.ag, true)) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final char e(int i8) {
        int i9 = i8 & 15;
        return (char) (i9 < 10 ? i9 + 48 : i9 + 87);
    }
}
