package E2;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static boolean a() {
        return Trace.isEnabled();
    }

    public static void b(String str, int i8) {
        Trace.setCounter(str, i8);
    }
}
