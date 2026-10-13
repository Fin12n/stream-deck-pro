package androidx.compose.ui.draw;

import L0.c;
import L0.i;
import R0.C1600m0;
import p038e1.InterfaceC2235f;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final i a(i iVar, U0.b bVar, boolean z8, c cVar, InterfaceC2235f interfaceC2235f, float f8, C1600m0 c1600m0) {
        return iVar.j(new PainterElement(bVar, z8, cVar, interfaceC2235f, f8, c1600m0));
    }

    public static /* synthetic */ i b(i iVar, U0.b bVar, boolean z8, c cVar, InterfaceC2235f interfaceC2235f, float f8, C1600m0 c1600m0, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = true;
        }
        boolean z9 = z8;
        if ((i8 & 4) != 0) {
            cVar = c.f4806a.e();
        }
        c cVar2 = cVar;
        if ((i8 & 8) != 0) {
            interfaceC2235f = InterfaceC2235f.f20468a.d();
        }
        InterfaceC2235f interfaceC2235f2 = interfaceC2235f;
        if ((i8 & 16) != 0) {
            f8 = 1.0f;
        }
        float f9 = f8;
        if ((i8 & 32) != 0) {
            c1600m0 = null;
        }
        return a(iVar, bVar, z9, cVar2, interfaceC2235f2, f9, c1600m0);
    }
}
