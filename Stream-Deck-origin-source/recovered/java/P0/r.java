package P0;

import androidx.compose.ui.focus.FocusTargetNode;
import java.util.Comparator;
import kotlin.jvm.internal.t;
import p056g1.AbstractC2347k;
import p056g1.F;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class r implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f8862a = new r();

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        if (focusTargetNode == null) {
            throw new IllegalArgumentException("compare requires non-null focus targets");
        }
        if (focusTargetNode2 == null) {
            throw new IllegalArgumentException("compare requires non-null focus targets");
        }
        int i8 = 0;
        if (!androidx.compose.ui.focus.k.g(focusTargetNode) || !androidx.compose.ui.focus.k.g(focusTargetNode2)) {
            if (androidx.compose.ui.focus.k.g(focusTargetNode)) {
                return -1;
            }
            return androidx.compose.ui.focus.k.g(focusTargetNode2) ? 1 : 0;
        }
        F fK = AbstractC2347k.k(focusTargetNode);
        F fK2 = AbstractC2347k.k(focusTargetNode2);
        if (t.c(fK, fK2)) {
            return 0;
        }
        B0.d dVarB = b(fK);
        B0.d dVarB2 = b(fK2);
        int iMin = Math.min(dVarB.s() - 1, dVarB2.s() - 1);
        if (iMin >= 0) {
            while (t.c(dVarB.r()[i8], dVarB2.r()[i8])) {
                if (i8 != iMin) {
                    i8++;
                }
            }
            return t.h(((F) dVarB.r()[i8]).n0(), ((F) dVarB2.r()[i8]).n0());
        }
        throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
    }

    public final B0.d b(F f8) {
        B0.d dVar = new B0.d(new F[16], 0);
        while (f8 != null) {
            dVar.c(0, f8);
            f8 = f8.m0();
        }
        return dVar;
    }
}
