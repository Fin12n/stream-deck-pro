package p009b;

import android.view.Window;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class v extends u {
    @Override // p009b.t, p009b.w, p009b.x
    public void b(Window window) {
        t.g(window, "window");
        window.getAttributes().layoutInDisplayCutoutMode = 3;
    }
}
