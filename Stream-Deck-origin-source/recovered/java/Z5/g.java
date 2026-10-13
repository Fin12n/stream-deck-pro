package Z5;

import Z6.C1694a;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class g {
    public static final int a(CharSequence text, f range) {
        t.g(text, "text");
        t.g(range, "range");
        int iB = range.b();
        int iA = range.a();
        if (iB < iA && !C1694a.c(text.charAt(iB))) {
            do {
                iB++;
                if (iB >= iA) {
                    break;
                }
            } while (!C1694a.c(text.charAt(iB)));
        }
        return iB;
    }

    public static final CharSequence b(CharSequence text, f range) {
        t.g(text, "text");
        t.g(range, "range");
        int iA = a(text, range);
        CharSequence charSequenceSubSequence = text.subSequence(range.b(), iA);
        range.d(iA);
        return charSequenceSubSequence;
    }

    public static final void c(CharSequence text, f range) {
        t.g(text, "text");
        t.g(range, "range");
        int iB = range.b();
        int iA = range.a();
        if (iB >= iA || !C1694a.c(text.charAt(iB))) {
            return;
        }
        do {
            iB++;
            if (iB >= iA) {
                break;
            }
        } while (C1694a.c(text.charAt(iB)));
        range.d(iB);
    }

    public static final int d(b text, int i8, int i9) {
        t.g(text, "text");
        while (i8 < i9) {
            char cCharAt = text.charAt(i8);
            if (!C1694a.c(cCharAt) && cCharAt != '\t') {
                break;
            }
            i8++;
        }
        return i8;
    }
}
