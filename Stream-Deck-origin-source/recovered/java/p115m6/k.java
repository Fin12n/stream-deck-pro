package p115m6;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class k {
    public static final boolean a(char c8) {
        return Character.toLowerCase(c8) == c8;
    }

    public static final char[] b(String str) {
        t.g(str, "<this>");
        int length = str.length();
        char[] cArr = new char[length];
        for (int i8 = 0; i8 < length; i8++) {
            cArr[i8] = str.charAt(i8);
        }
        return cArr;
    }
}
