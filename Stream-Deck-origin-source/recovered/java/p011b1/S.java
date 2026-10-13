package p011b1;

import D6.r;
import L0.i;
import Q6.o;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1766n f15705a = new C1766n(r.n());

    public static final T a(o oVar) {
        return new U(oVar);
    }

    public static final i c(i iVar, Object obj, o oVar) {
        return iVar.j(new SuspendPointerInputElement(obj, null, null, oVar, 6, null));
    }

    public static final i d(i iVar, Object obj, Object obj2, o oVar) {
        return iVar.j(new SuspendPointerInputElement(obj, obj2, null, oVar, 4, null));
    }
}
