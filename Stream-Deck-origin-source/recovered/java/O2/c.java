package O2;

import K2.k;
import U1.c0;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.mlkit.common.internal.ckI.WqXA;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f7554a = new c();

    public final Rect a(Context context) {
        t.g(context, "context");
        Rect bounds = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        t.f(bounds, "wm.currentWindowMetrics.bounds");
        return bounds;
    }

    public final k c(Context context) {
        t.g(context, "context");
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        c0 c0VarW = c0.w(windowManager.getCurrentWindowMetrics().getWindowInsets());
        t.f(c0VarW, "toWindowInsetsCompat(wm.…ndowMetrics.windowInsets)");
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        t.f(bounds, "wm.currentWindowMetrics.bounds");
        return new k(bounds, c0VarW);
    }

    public final c0 b(Context context) {
        t.g(context, "context");
        WindowInsets windowInsets = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getWindowInsets();
        t.f(windowInsets, "context.getSystemService…indowMetrics.windowInsets");
        c0 c0VarW = c0.w(windowInsets);
        t.f(c0VarW, WqXA.UkiYmXjnlOONXX);
        return c0VarW;
    }
}
