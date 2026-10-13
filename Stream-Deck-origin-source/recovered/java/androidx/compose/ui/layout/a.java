package androidx.compose.ui.layout;

import L0.i;
import p038e1.G;
import p038e1.InterfaceC2250v;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final Object a(G g8) {
        Object objE = g8.e();
        InterfaceC2250v interfaceC2250v = objE instanceof InterfaceC2250v ? (InterfaceC2250v) objE : null;
        if (interfaceC2250v != null) {
            return interfaceC2250v.K();
        }
        return null;
    }

    public static final i b(i iVar, Object obj) {
        return iVar.j(new LayoutIdElement(obj));
    }
}
