package O6;

import C6.C0918g;
import p158s.f;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    public static final void a(AutoCloseable autoCloseable, Throwable th) throws Exception {
        if (autoCloseable != null) {
            if (th == null) {
                f.a(autoCloseable);
                return;
            }
            try {
                f.a(autoCloseable);
            } catch (Throwable th2) {
                C0918g.a(th, th2);
            }
        }
    }
}
