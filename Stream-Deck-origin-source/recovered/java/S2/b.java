package S2;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.t;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final Activity b(Context context) {
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
            t.f(context, "getBaseContext(...)");
        }
        return (Activity) context;
    }

    public static final a c(InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(-1990842533);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-1990842533, i8, -1, "cafe.adriel.voyager.core.lifecycle.getConfigurationChecker (ConfigurationChecker.kt:17)");
        }
        Context context = (Context) interfaceC3163l.e(AndroidCompositionLocals_androidKt.g());
        interfaceC3163l.f(1157296644);
        boolean zR = interfaceC3163l.R(context);
        Object objG = interfaceC3163l.g();
        if (zR || objG == InterfaceC3163l.f38803a.a()) {
            objG = new a(b(context));
            interfaceC3163l.H(objG);
        }
        interfaceC3163l.N();
        a aVar = (a) objG;
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return aVar;
    }
}
