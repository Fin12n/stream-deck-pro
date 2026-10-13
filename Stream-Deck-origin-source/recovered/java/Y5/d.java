package Y5;

import C6.G;
import X5.C1693w;
import Z6.w;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d {
    public static final boolean a(CharSequence charSequence) {
        if (Z5.e.b(charSequence, 0, 0, "chunked", 3, null)) {
            return true;
        }
        boolean z8 = false;
        if (Z5.e.b(charSequence, 0, 0, "identity", 3, null)) {
            return false;
        }
        Iterator it = w.A0(charSequence, new String[]{com.amazon.a.a.o.b.f.f16777a}, false, 0, 6, null).iterator();
        while (it.hasNext()) {
            String lowerCase = w.W0((String) it.next()).toString().toLowerCase(Locale.ROOT);
            t.f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (t.c(lowerCase, "chunked")) {
                if (z8) {
                    throw new IllegalArgumentException("Double-chunked TE is not supported: " + ((Object) charSequence));
                }
                z8 = true;
            } else if (!t.c(lowerCase, "identity")) {
                throw new IllegalArgumentException("Unsupported transfer encoding " + lowerCase);
            }
        }
        return z8;
    }

    public static final Object b(C1693w c1693w, long j8, CharSequence charSequence, c cVar, io.ktor.utils.io.g gVar, io.ktor.utils.io.j jVar, G6.d dVar) {
        if (charSequence != null && a(charSequence)) {
            Object objC = b.c(gVar, jVar, dVar);
            return objC == H6.c.f() ? objC : G.f1419a;
        }
        if (j8 != -1) {
            Object objB = io.ktor.utils.io.h.b(gVar, jVar, j8, dVar);
            return objB == H6.c.f() ? objB : G.f1419a;
        }
        if ((cVar == null || !cVar.e()) && !(cVar == null && t.c(c1693w, C1693w.f11972d.b()))) {
            jVar.d(new IllegalStateException("Failed to parse request body: request body length should be specified,\nchunked transfer encoding should be used or\nkeep-alive should be disabled (connection: close)"));
            return G.f1419a;
        }
        Object objB2 = io.ktor.utils.io.h.b(gVar, jVar, Long.MAX_VALUE, dVar);
        return objB2 == H6.c.f() ? objB2 : G.f1419a;
    }
}
