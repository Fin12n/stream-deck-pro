package G4;

import F4.g;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f2760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f2761b;

    public static synchronized boolean a(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f2760a;
        if (context2 != null && (bool = f2761b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f2761b = null;
        if (g.f()) {
            f2761b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f2761b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f2761b = Boolean.FALSE;
            }
        }
        f2760a = applicationContext;
        return f2761b.booleanValue();
    }
}
