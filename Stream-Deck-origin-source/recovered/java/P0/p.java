package P0;

import androidx.compose.ui.focus.FocusTargetNode;
import p056g1.AbstractC2347k;
import p056g1.F;
import p056g1.X;
import p056g1.h0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    public static final q b(FocusTargetNode focusTargetNode) {
        F fH1;
        h0 h0VarL0;
        g focusOwner;
        X xC1 = focusTargetNode.I0().C1();
        if (xC1 == null || (fH1 = xC1.h1()) == null || (h0VarL0 = fH1.l0()) == null || (focusOwner = h0VarL0.getFocusOwner()) == null) {
            return null;
        }
        return focusOwner.g();
    }

    public static final void c(FocusTargetNode focusTargetNode) {
        AbstractC2347k.l(focusTargetNode).getFocusOwner().b(focusTargetNode);
    }

    public static final q d(FocusTargetNode focusTargetNode) {
        return AbstractC2347k.l(focusTargetNode).getFocusOwner().g();
    }
}
