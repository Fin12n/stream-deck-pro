package A2;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f479a = new d();

    public static final File a(Context context) {
        t.g(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        t.f(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
