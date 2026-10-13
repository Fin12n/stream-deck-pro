package H;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: H.c0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0972c0 {
    public static AbstractC0972c0 a(Executor executor, Handler handler) {
        return new C0981h(executor, handler);
    }

    public abstract Executor b();

    public abstract Handler c();
}
