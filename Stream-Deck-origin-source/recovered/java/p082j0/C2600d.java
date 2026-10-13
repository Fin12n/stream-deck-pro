package p082j0;

import A1.d;
import L0.c;
import L0.i;
import p056g1.k0;

/* JADX INFO: renamed from: j0.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2600d extends i.c implements k0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c f27938n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f27939o;

    public C2600d(c cVar, boolean z8) {
        this.f27938n = cVar;
        this.f27939o = z8;
    }

    public final c d2() {
        return this.f27938n;
    }

    public final boolean e2() {
        return this.f27939o;
    }

    public final void g2(c cVar) {
        this.f27938n = cVar;
    }

    public final void h2(boolean z8) {
        this.f27939o = z8;
    }

    @Override // p056g1.k0
    /* JADX INFO: renamed from: f2, reason: merged with bridge method [inline-methods] */
    public C2600d f(d dVar, Object obj) {
        return this;
    }
}
