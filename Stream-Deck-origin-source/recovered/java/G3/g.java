package G3;

import C6.q;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ G6.d f2743a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y4.a f2744b;

        public a(G6.d dVar, Y4.a aVar) {
            this.f2743a = dVar;
            this.f2744b = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            G6.d dVar = this.f2743a;
            q.a aVar = q.f1441b;
            dVar.resumeWith(q.b(this.f2744b.get()));
        }
    }

    public static final Object a(Context context, G6.d dVar) throws Throwable {
        G6.i iVar = new G6.i(H6.b.c(dVar));
        W.k.a aVar = W.k.f10783b;
        Context applicationContext = context.getApplicationContext();
        t.f(applicationContext, "getApplicationContext(...)");
        Y4.a aVarC = aVar.c(applicationContext);
        aVarC.a(new a(iVar, aVarC), I1.a.e(context.getApplicationContext()));
        Object objA = iVar.a();
        if (objA == H6.c.f()) {
            I6.h.c(dVar);
        }
        return objA;
    }

    public static final void b(Activity activity) {
        t.g(activity, "<this>");
        activity.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", activity.getPackageName(), null)));
    }
}
