package J7;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class E {
    public static final long a(String str, int i8, int i9) {
        int i10;
        kotlin.jvm.internal.t.g(str, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i8).toString());
        }
        if (i9 < i8) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i9 + " < " + i8).toString());
        }
        if (i9 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i9 + " > " + str.length()).toString());
        }
        long j8 = 0;
        while (i8 < i9) {
            char cCharAt = str.charAt(i8);
            if (cCharAt < 128) {
                j8++;
            } else {
                if (cCharAt < 2048) {
                    i10 = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i10 = 3;
                } else {
                    int i11 = i8 + 1;
                    char cCharAt2 = i11 < i9 ? str.charAt(i11) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j8++;
                        i8 = i11;
                    } else {
                        j8 += (long) 4;
                        i8 += 2;
                    }
                }
                j8 += (long) i10;
            }
            i8++;
        }
        return j8;
    }

    public static /* synthetic */ long b(String str, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = str.length();
        }
        return a(str, i8, i9);
    }
}
