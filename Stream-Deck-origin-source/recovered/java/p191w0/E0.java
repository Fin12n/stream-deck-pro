package p191w0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class E0 {
    public static final String a(int i8, InterfaceC3163l interfaceC3163l, int i9) {
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-176762646, i9, -1, "androidx.compose.material3.getString (Strings.android.kt:30)");
        }
        interfaceC3163l.e(AndroidCompositionLocals_androidKt.f());
        String string = ((Context) interfaceC3163l.e(AndroidCompositionLocals_androidKt.g())).getResources().getString(i8);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        return string;
    }
}
