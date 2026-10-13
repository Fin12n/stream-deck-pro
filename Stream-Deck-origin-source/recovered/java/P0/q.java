package P0;

import androidx.compose.ui.focus.FocusTargetNode;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f8859a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B0.d f8860b = new B0.d(new Function0[16], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8861c;

    public final void f() {
        this.f8861c = true;
    }

    public final void g() {
        B0.d dVar = this.f8860b;
        int iS = dVar.s();
        if (iS > 0) {
            Object[] objArrR = dVar.r();
            int i8 = 0;
            do {
                ((Function0) objArrR[i8]).invoke();
                i8++;
            } while (i8 < iS);
        }
        this.f8860b.m();
        this.f8859a.clear();
        this.f8861c = false;
    }

    public final void h() {
        Iterator it = this.f8859a.keySet().iterator();
        while (it.hasNext()) {
            ((FocusTargetNode) it.next()).h2();
        }
        this.f8859a.clear();
        this.f8861c = false;
    }

    public final m i(FocusTargetNode focusTargetNode) {
        return (m) this.f8859a.get(focusTargetNode);
    }

    public final void j(FocusTargetNode focusTargetNode, m mVar) {
        Map map = this.f8859a;
        if (mVar == null) {
            throw new IllegalStateException("requires a non-null focus state");
        }
        map.put(focusTargetNode, mVar);
    }
}
