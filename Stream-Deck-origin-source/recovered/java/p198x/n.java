package p198x;

import H.Z0;
import androidx.camera.camera2.internal.compat.quirk.AutoFlashUnderExposedQuirk;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f37155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f37156b = false;

    public n(Z0 z8) {
        this.f37155a = z8.b(AutoFlashUnderExposedQuirk.class) != null;
    }

    public void a() {
        this.f37156b = false;
    }

    public void b() {
        this.f37156b = true;
    }

    public boolean c(int i8) {
        return this.f37156b && i8 == 0 && this.f37155a;
    }
}
