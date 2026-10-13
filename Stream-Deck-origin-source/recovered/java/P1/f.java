package P1;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }

        public static boolean b(Handler handler, Runnable runnable, Object obj, long j8) {
            return handler.postDelayed(runnable, obj, j8);
        }
    }

    public static Handler a(Looper looper) {
        return a.a(looper);
    }

    public static boolean b(Handler handler, Runnable runnable, Object obj, long j8) {
        return a.b(handler, runnable, obj, j8);
    }
}
