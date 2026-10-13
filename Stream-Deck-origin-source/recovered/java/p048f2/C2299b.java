package p048f2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import kotlin.jvm.internal.t;

/* JADX INFO: renamed from: f2.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2299b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2299b f21577a = new C2299b();

    public final boolean a(File srcFile, File dstFile) {
        t.g(srcFile, "srcFile");
        t.g(dstFile, "dstFile");
        try {
            Files.move(srcFile.toPath(), dstFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
