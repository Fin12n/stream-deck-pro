package U1;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class W {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {
        public static void a(Window window, boolean z8) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z8 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b {
        public static void a(Window window, boolean z8) {
            window.setDecorFitsSystemWindows(z8);
        }
    }

    public static f0 a(Window window, View view) {
        return new f0(window, view);
    }

    public static void b(Window window, boolean z8) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.a(window, z8);
        } else {
            a.a(window, z8);
        }
    }
}
