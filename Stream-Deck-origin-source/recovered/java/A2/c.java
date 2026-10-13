package A2;

import android.app.ActivityManager;
import android.database.Cursor;
import android.net.Uri;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f478a = new c();

    public static final Uri a(Cursor cursor) {
        t.g(cursor, "cursor");
        Uri notificationUri = cursor.getNotificationUri();
        t.f(notificationUri, "cursor.notificationUri");
        return notificationUri;
    }

    public static final boolean b(ActivityManager activityManager) {
        t.g(activityManager, "activityManager");
        return activityManager.isLowRamDevice();
    }
}
