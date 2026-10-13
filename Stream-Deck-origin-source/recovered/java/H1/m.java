package H1;

import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f3468c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Set f3469d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f3470e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NotificationManager f3472b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {
        public static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        public static int b(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    public m(Context context) {
        this.f3471a = context;
        this.f3472b = (NotificationManager) context.getSystemService("notification");
    }

    public static m b(Context context) {
        return new m(context);
    }

    public boolean a() {
        return a.a(this.f3472b);
    }
}
