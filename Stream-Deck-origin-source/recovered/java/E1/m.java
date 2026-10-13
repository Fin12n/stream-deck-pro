package E1;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class m implements k {
    @Override // E1.k
    public void a(WindowManager windowManager, View view, ViewGroup.LayoutParams layoutParams) {
        windowManager.updateViewLayout(view, layoutParams);
    }

    @Override // E1.k
    public void c(View view, Rect rect) {
        view.getWindowVisibleDisplayFrame(rect);
    }

    @Override // E1.k
    public void b(View view, int i8, int i9) {
    }
}
