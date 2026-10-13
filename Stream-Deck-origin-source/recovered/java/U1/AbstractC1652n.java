package U1;

import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: U1.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1652n {

    /* JADX INFO: renamed from: U1.n$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface a {
        boolean o(KeyEvent keyEvent);
    }

    public static boolean a(View view, KeyEvent keyEvent) {
        return I.f(view, keyEvent);
    }

    public static boolean b(a aVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (aVar == null) {
            return false;
        }
        return aVar.o(keyEvent);
    }
}
