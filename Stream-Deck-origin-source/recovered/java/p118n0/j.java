package p118n0;

import C6.G;
import G6.d;
import Q0.h;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function0;
import p038e1.AbstractC2248t;
import p038e1.InterfaceC2247s;
import p056g1.AbstractC2345i;
import p056g1.InterfaceC2344h;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2344h f30512a;

        public a(InterfaceC2344h interfaceC2344h) {
            this.f30512a = interfaceC2344h;
        }

        @Override // p118n0.c
        public final Object o1(InterfaceC2247s interfaceC2247s, Function0 function0, d dVar) {
            View view = (View) AbstractC2345i.a(this.f30512a, AndroidCompositionLocals_androidKt.j());
            long jE = AbstractC2248t.e(interfaceC2247s);
            h hVar = (h) function0.invoke();
            h hVarT = hVar != null ? hVar.t(jE) : null;
            if (hVarT != null) {
                view.requestRectangleOnScreen(j.c(hVarT), false);
            }
            return G.f1419a;
        }
    }

    public static final c b(InterfaceC2344h interfaceC2344h) {
        return new a(interfaceC2344h);
    }

    public static final Rect c(h hVar) {
        return new Rect((int) hVar.i(), (int) hVar.l(), (int) hVar.j(), (int) hVar.e());
    }
}
