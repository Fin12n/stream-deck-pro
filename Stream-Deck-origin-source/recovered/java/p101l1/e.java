package p101l1;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final Resources a(InterfaceC3163l interfaceC3163l, int i8) {
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(1554054999, i8, -1, "androidx.compose.ui.res.resources (Resources.android.kt:30)");
        }
        interfaceC3163l.e(AndroidCompositionLocals_androidKt.f());
        Resources resources = ((Context) interfaceC3163l.e(AndroidCompositionLocals_androidKt.g())).getResources();
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        return resources;
    }
}
