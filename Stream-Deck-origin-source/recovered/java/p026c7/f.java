package p026c7;

import C6.q;
import C6.r;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f16293a;
    private static volatile Choreographer choreographer;

    static {
        Object objB;
        try {
            q.a aVar = q.f1441b;
            objB = q.b(new d(a(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            q.a aVar2 = q.f1441b;
            objB = q.b(r.a(th));
        }
        f16293a = (e) (q.g(objB) ? null : objB);
    }

    public static final Handler a(Looper looper, boolean z8) throws IllegalAccessException, InvocationTargetException {
        if (!z8) {
            return new Handler(looper);
        }
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        t.e(objInvoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) objInvoke;
    }

    public static final e b(Handler handler, String str) {
        return new d(handler, str);
    }
}
