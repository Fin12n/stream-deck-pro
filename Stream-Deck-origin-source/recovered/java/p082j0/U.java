package p082j0;

import L0.c;
import L0.i;
import W6.n;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class U implements T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final U f27892a = new U();

    @Override // p082j0.T
    public i a(i iVar, float f8, boolean z8) {
        if (f8 > 0.0d) {
            return iVar.j(new LayoutWeightElement(n.f(f8, Float.MAX_VALUE), z8));
        }
        throw new IllegalArgumentException(("invalid weight " + f8 + "; must be greater than zero").toString());
    }

    @Override // p082j0.T
    public i c(i iVar, c.InterfaceC0174c interfaceC0174c) {
        return iVar.j(new VerticalAlignElement(interfaceC0174c));
    }
}
