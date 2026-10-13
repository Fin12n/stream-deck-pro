package A2;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.t;
import p201x2.vAk.kDsnNkYbBsI;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f481a = new f();

    public static final List a(Cursor cursor) {
        t.g(cursor, "cursor");
        List<Uri> notificationUris = cursor.getNotificationUris();
        t.d(notificationUris);
        return notificationUris;
    }

    public static final void b(Cursor cursor, ContentResolver contentResolver, List uris) {
        t.g(cursor, "cursor");
        t.g(contentResolver, kDsnNkYbBsI.nBHHuCBysWGtm);
        t.g(uris, "uris");
        cursor.setNotificationUris(contentResolver, uris);
    }
}
