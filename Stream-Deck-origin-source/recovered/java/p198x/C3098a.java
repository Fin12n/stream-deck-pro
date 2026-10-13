package p198x;

import H.Z0;
import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import p190w.e;

/* JADX INFO: renamed from: x.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class C3098a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f37141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f37142b;

    public C3098a(Z0 z8) {
        this.f37141a = z8.a(ImageCaptureFailWithAutoFlashQuirk.class);
        this.f37142b = e.b(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) != null;
    }

    public int a(int i8) {
        if ((this.f37141a || this.f37142b) && i8 == 2) {
            return 1;
        }
        return i8;
    }
}
