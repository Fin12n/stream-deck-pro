package I;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile Handler f3661a;

    public static Handler a() {
        if (f3661a != null) {
            return f3661a;
        }
        synchronized (m.class) {
            try {
                if (f3661a == null) {
                    f3661a = P1.f.a(Looper.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f3661a;
    }
}
