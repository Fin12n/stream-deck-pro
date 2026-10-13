package p009b;

import U1.W;
import U1.f0;
import android.view.View;
import android.view.Window;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class s extends w {
    @Override // p009b.w, p009b.x
    public void a(H statusBarStyle, H navigationBarStyle, Window window, View view, boolean z8, boolean z9) {
        t.g(statusBarStyle, "statusBarStyle");
        t.g(navigationBarStyle, "navigationBarStyle");
        t.g(window, "window");
        t.g(view, "view");
        W.b(window, false);
        window.setStatusBarColor(statusBarStyle.c(z8));
        window.setNavigationBarColor(navigationBarStyle.c(z9));
        f0 f0Var = new f0(window, view);
        f0Var.c(!z8);
        f0Var.b(!z9);
    }
}
