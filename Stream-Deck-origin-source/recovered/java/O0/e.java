package O0;

import A1.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e implements A1.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f7543a = k.f7548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f7544b;

    public final i c() {
        return this.f7544b;
    }

    public final long d() {
        return this.f7543a.d();
    }

    public final i e(Q6.k kVar) {
        i iVar = new i(kVar);
        this.f7544b = iVar;
        return iVar;
    }

    public final void f(b bVar) {
        this.f7543a = bVar;
    }

    public final void g(i iVar) {
        this.f7544b = iVar;
    }

    @Override // A1.d
    public float getDensity() {
        return this.f7543a.getDensity().getDensity();
    }

    public final t getLayoutDirection() {
        return this.f7543a.getLayoutDirection();
    }

    @Override // A1.l
    public float x0() {
        return this.f7543a.getDensity().x0();
    }
}
