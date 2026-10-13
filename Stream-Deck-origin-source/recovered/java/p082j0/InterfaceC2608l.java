package p082j0;

import L0.c;
import L0.i;

/* JADX INFO: renamed from: j0.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2608l {
    static /* synthetic */ i c(InterfaceC2608l interfaceC2608l, i iVar, float f8, boolean z8, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: weight");
        }
        if ((i8 & 2) != 0) {
            z8 = true;
        }
        return interfaceC2608l.a(iVar, f8, z8);
    }

    i a(i iVar, float f8, boolean z8);

    i b(i iVar, c.b bVar);
}
