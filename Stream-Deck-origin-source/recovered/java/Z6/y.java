package Z6;

import D6.V;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class y extends x {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f12989a = new a();

        public a() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke(CharSequence it) {
            kotlin.jvm.internal.t.g(it, "it");
            return it.toString();
        }
    }

    public static List X0(CharSequence charSequence, int i8) {
        kotlin.jvm.internal.t.g(charSequence, "<this>");
        return e1(charSequence, i8, i8, true);
    }

    public static String Y0(String str, int i8) {
        kotlin.jvm.internal.t.g(str, "<this>");
        if (i8 >= 0) {
            String strSubstring = str.substring(W6.n.g(i8, str.length()));
            kotlin.jvm.internal.t.f(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i8 + " is less than zero.").toString());
    }

    public static String Z0(String str, int i8) {
        kotlin.jvm.internal.t.g(str, "<this>");
        if (i8 >= 0) {
            return d1(str, W6.n.d(str.length() - i8, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i8 + " is less than zero.").toString());
    }

    public static char a1(CharSequence charSequence) {
        kotlin.jvm.internal.t.g(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static char b1(CharSequence charSequence) {
        kotlin.jvm.internal.t.g(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(w.S(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static char c1(CharSequence charSequence) {
        kotlin.jvm.internal.t.g(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (length == 1) {
            return charSequence.charAt(0);
        }
        throw new IllegalArgumentException("Char sequence has more than one element.");
    }

    public static String d1(String str, int i8) {
        kotlin.jvm.internal.t.g(str, "<this>");
        if (i8 >= 0) {
            String strSubstring = str.substring(0, W6.n.g(i8, str.length()));
            kotlin.jvm.internal.t.f(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i8 + " is less than zero.").toString());
    }

    public static final List e1(CharSequence charSequence, int i8, int i9, boolean z8) {
        kotlin.jvm.internal.t.g(charSequence, "<this>");
        return f1(charSequence, i8, i9, z8, a.f12989a);
    }

    public static final List f1(CharSequence charSequence, int i8, int i9, boolean z8, Q6.k transform) {
        kotlin.jvm.internal.t.g(charSequence, "<this>");
        kotlin.jvm.internal.t.g(transform, "transform");
        V.a(i8, i9);
        int length = charSequence.length();
        int i10 = 0;
        ArrayList arrayList = new ArrayList((length / i9) + (length % i9 == 0 ? 0 : 1));
        while (i10 >= 0 && i10 < length) {
            int i11 = i10 + i8;
            if (i11 < 0 || i11 > length) {
                if (!z8) {
                    break;
                }
                i11 = length;
            }
            arrayList.add(transform.invoke(charSequence.subSequence(i10, i11)));
            i10 += i9;
        }
        return arrayList;
    }
}
