package p082j0;

import L0.c;
import L0.i;
import W6.n;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;

/* JADX INFO: renamed from: j0.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2609m implements InterfaceC2608l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2609m f28036a = new C2609m();

    @Override // p082j0.InterfaceC2608l
    public i a(i iVar, float f8, boolean z8) {
        if (f8 > 0.0d) {
            return iVar.j(new LayoutWeightElement(n.f(f8, Float.MAX_VALUE), z8));
        }
        throw new IllegalArgumentException(("invalid weight " + f8 + "; must be greater than zero").toString());
    }

    @Override // p082j0.InterfaceC2608l
    public i b(i iVar, c.b bVar) {
        return iVar.j(new HorizontalAlignElement(bVar));
    }
}
