package p011b1;

import L0.i;
import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {
    public static final i a(i iVar, InterfaceC1772u interfaceC1772u, boolean z8) {
        return iVar.j(new PointerHoverIconModifierElement(interfaceC1772u, z8));
    }

    public static /* synthetic */ i b(i iVar, InterfaceC1772u interfaceC1772u, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return a(iVar, interfaceC1772u, z8);
    }
}
