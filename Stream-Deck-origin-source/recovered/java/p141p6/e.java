package p141p6;

import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f31339b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31340a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    public e(String pattern) {
        t.g(pattern, "pattern");
        this.f31340a = pattern;
        if (pattern.length() <= 0) {
            throw new IllegalStateException("Date parser pattern shouldn't be empty.");
        }
    }

    public final void a(d dVar, char c8, String str) {
        if (c8 == 's') {
            dVar.g(Integer.valueOf(Integer.parseInt(str)));
            return;
        }
        if (c8 == 'm') {
            dVar.e(Integer.valueOf(Integer.parseInt(str)));
            return;
        }
        if (c8 == 'h') {
            dVar.d(Integer.valueOf(Integer.parseInt(str)));
            return;
        }
        if (c8 == 'd') {
            dVar.c(Integer.valueOf(Integer.parseInt(str)));
            return;
        }
        if (c8 == 'M') {
            dVar.f(g.f31341b.b(str));
            return;
        }
        if (c8 == 'Y') {
            dVar.h(Integer.valueOf(Integer.parseInt(str)));
            return;
        }
        if (c8 == 'z') {
            if (!t.c(str, "GMT")) {
                throw new IllegalStateException("Check failed.");
            }
        } else if (c8 != '*') {
            for (int i8 = 0; i8 < str.length(); i8++) {
                if (str.charAt(i8) != c8) {
                    throw new IllegalStateException("Check failed.");
                }
            }
        }
    }

    public final c b(String dateString) {
        t.g(dateString, "dateString");
        d dVar = new d();
        char cCharAt = this.f31340a.charAt(0);
        int i8 = 0;
        int i9 = 1;
        int i10 = 0;
        while (i9 < this.f31340a.length()) {
            try {
                if (this.f31340a.charAt(i9) == cCharAt) {
                    i9++;
                } else {
                    int i11 = (i10 + i9) - i8;
                    String strSubstring = dateString.substring(i10, i11);
                    t.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    a(dVar, cCharAt, strSubstring);
                    try {
                        cCharAt = this.f31340a.charAt(i9);
                        i8 = i9;
                        i9++;
                        i10 = i11;
                    } catch (Throwable unused) {
                        i10 = i11;
                        throw new f(dateString, i10, this.f31340a);
                    }
                }
            } catch (Throwable unused2) {
            }
        }
        if (i10 < dateString.length()) {
            String strSubstring2 = dateString.substring(i10);
            t.f(strSubstring2, "this as java.lang.String).substring(startIndex)");
            a(dVar, cCharAt, strSubstring2);
        }
        return dVar.a();
    }
}
