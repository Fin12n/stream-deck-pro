package p143q0;

import p128o1.H;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class B {
    public static final int a(CharSequence charSequence, int i8) {
        int length = charSequence.length();
        while (i8 < length) {
            if (charSequence.charAt(i8) == '\n') {
                return i8;
            }
            i8++;
        }
        return charSequence.length();
    }

    public static final int b(CharSequence charSequence, int i8) {
        while (i8 > 0) {
            if (charSequence.charAt(i8 - 1) == '\n') {
                return i8;
            }
            i8--;
        }
        return 0;
    }

    public static final long c(CharSequence charSequence, int i8) {
        return H.b(b(charSequence, i8), a(charSequence, i8));
    }
}
