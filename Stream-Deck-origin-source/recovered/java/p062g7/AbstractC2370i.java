package p062g7;

import C6.C0918g;
import G6.g;
import java.util.Iterator;
import p017b7.G;
import p017b7.H;

/* JADX INFO: renamed from: g7.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2370i {
    public static final void a(g gVar, Throwable th) {
        Iterator it = AbstractC2369h.a().iterator();
        while (it.hasNext()) {
            try {
                ((G) it.next()).R1(gVar, th);
            } catch (Throwable th2) {
                AbstractC2369h.b(H.b(th, th2));
            }
        }
        try {
            C0918g.a(th, new C2371j(gVar));
        } catch (Throwable unused) {
        }
        AbstractC2369h.b(th);
    }
}
