package p219z4;

import android.os.Bundle;
import p195w4.b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class Z extends M {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AbstractC3194c f39121g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(AbstractC3194c abstractC3194c, int i8, Bundle bundle) {
        super(abstractC3194c, i8, null);
        this.f39121g = abstractC3194c;
    }

    @Override // p219z4.M
    public final void f(b bVar) {
        if (this.f39121g.s() && AbstractC3194c.f0(this.f39121g)) {
            AbstractC3194c.b0(this.f39121g, 16);
        } else {
            this.f39121g.f39146p.b(bVar);
            this.f39121g.K(bVar);
        }
    }

    @Override // p219z4.M
    public final boolean g() {
        this.f39121g.f39146p.b(b.f37082e);
        return true;
    }
}
