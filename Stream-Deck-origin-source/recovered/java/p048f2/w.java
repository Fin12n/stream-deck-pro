package p048f2;

import java.io.File;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class w {
    public static final u a(File file) {
        t.g(file, "file");
        String absolutePath = file.getCanonicalFile().getAbsolutePath();
        t.f(absolutePath, "file.canonicalFile.absolutePath");
        return v.a(absolutePath);
    }
}
