package p082j0;

import A1.d;
import L0.i;
import p056g1.k0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class D extends i.c implements k0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f27833n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f27834o;

    public D(float f8, boolean z8) {
        this.f27833n = f8;
        this.f27834o = z8;
    }

    @Override // p056g1.k0
    /* JADX INFO: renamed from: d2, reason: merged with bridge method [inline-methods] */
    public Q f(d dVar, Object obj) {
        Q q8 = obj instanceof Q ? (Q) obj : null;
        if (q8 == null) {
            q8 = new Q(0.0f, false, null, 7, null);
        }
        q8.f(this.f27833n);
        q8.e(this.f27834o);
        return q8;
    }

    public final void e2(boolean z8) {
        this.f27834o = z8;
    }

    public final void f2(float f8) {
        this.f27833n = f8;
    }
}
