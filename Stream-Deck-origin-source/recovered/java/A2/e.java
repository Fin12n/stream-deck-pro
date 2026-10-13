package A2;

import android.database.Cursor;
import android.os.Bundle;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f480a = new e();

    public static final void a(Cursor cursor, Bundle extras) {
        t.g(cursor, "cursor");
        t.g(extras, "extras");
        cursor.setExtras(extras);
    }
}
