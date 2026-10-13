package p211y4;

import S4.l;
import p195w4.d;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class Z extends X {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC3107h f38338c;

    public Z(AbstractC3107h abstractC3107h, l lVar) {
        super(4, lVar);
        this.f38338c = abstractC3107h;
    }

    @Override // p211y4.J
    public final boolean f(B b8) {
        P p8 = (P) b8.y().get(this.f38338c);
        return p8 != null && p8.f38319a.d();
    }

    @Override // p211y4.J
    public final d[] g(B b8) {
        P p8 = (P) b8.y().get(this.f38338c);
        if (p8 == null) {
            return null;
        }
        return p8.f38319a.b();
    }

    @Override // p211y4.X
    public final void h(B b8) {
        P p8 = (P) b8.y().remove(this.f38338c);
        if (p8 == null) {
            this.f38334b.e(Boolean.FALSE);
            return;
        }
        p8.f38320b.a(b8.w(), this.f38334b);
        p8.f38319a.a();
    }

    @Override // p211y4.X, p211y4.a0
    public final /* bridge */ /* synthetic */ void d(r rVar, boolean z8) {
    }
}
