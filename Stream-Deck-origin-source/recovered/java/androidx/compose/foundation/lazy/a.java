package androidx.compose.foundation.lazy;

import L0.i;
import p091k0.b;
import p215z0.InterfaceC3160j0;
import p215z0.X0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC3160j0 f14525a = X0.a(Integer.MAX_VALUE);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC3160j0 f14526b = X0.a(Integer.MAX_VALUE);

    @Override // p091k0.b
    public i a(i iVar, float f8) {
        return iVar.j(new ParentSizeElement(f8, this.f14525a, null, "fillParentMaxWidth", 4, null));
    }

    public final void c(int i8, int i9) {
        this.f14525a.p(i8);
        this.f14526b.p(i9);
    }
}
