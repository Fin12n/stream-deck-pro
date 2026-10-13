package p110m1;

import L0.i;
import Q6.k;
import p056g1.p0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class d extends i.c implements p0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f29497n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f29498o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public k f29499p;

    public d(boolean z8, boolean z9, k kVar) {
        this.f29497n = z8;
        this.f29498o = z9;
        this.f29499p = kVar;
    }

    @Override // p056g1.p0
    public void Q(x xVar) {
        this.f29499p.invoke(xVar);
    }

    public final void d2(boolean z8) {
        this.f29497n = z8;
    }

    public final void e2(k kVar) {
        this.f29499p = kVar;
    }

    @Override // p056g1.p0
    public boolean g0() {
        return this.f29498o;
    }

    @Override // p056g1.p0
    public boolean k1() {
        return this.f29497n;
    }
}
