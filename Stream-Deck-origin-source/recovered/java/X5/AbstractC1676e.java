package X5;

import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: renamed from: X5.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1676e {
    public static final Charset a(AbstractC1682k abstractC1682k) {
        kotlin.jvm.internal.t.g(abstractC1682k, "<this>");
        String strC = abstractC1682k.c("charset");
        if (strC == null) {
            return null;
        }
        try {
            return Charset.forName(strC);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static final C1674c b(C1674c c1674c, Charset charset) {
        kotlin.jvm.internal.t.g(c1674c, "<this>");
        kotlin.jvm.internal.t.g(charset, "charset");
        return c1674c.h("charset", p197w6.a.i(charset));
    }

    public static final C1674c c(C1674c c1674c, Charset charset) {
        kotlin.jvm.internal.t.g(c1674c, "<this>");
        kotlin.jvm.internal.t.g(charset, "charset");
        String lowerCase = c1674c.e().toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.t.f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return !kotlin.jvm.internal.t.c(lowerCase, "text") ? c1674c : c1674c.h("charset", p197w6.a.i(charset));
    }
}
