package M2;

import D6.r;
import K2.j;
import R0.pkXL.Oitvkwcwn;
import android.content.Context;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c implements L2.a {
    public static final void d(T1.a callback) {
        t.g(callback, "$callback");
        callback.accept(new j(r.n()));
    }

    @Override // L2.a
    public void a(T1.a callback) {
        t.g(callback, "callback");
    }

    @Override // L2.a
    public void b(Context context, Executor executor, final T1.a callback) {
        t.g(context, Oitvkwcwn.VpAUb);
        t.g(executor, "executor");
        t.g(callback, "callback");
        executor.execute(new Runnable() { // from class: M2.b
            @Override // java.lang.Runnable
            public final void run() {
                c.d(callback);
            }
        });
    }
}
