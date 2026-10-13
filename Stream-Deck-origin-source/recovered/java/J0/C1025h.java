package J0;

import C6.C0920i;

/* JADX INFO: renamed from: J0.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C1025h extends AbstractC1028k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Q6.k f3970g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3971h;

    public C1025h(int i8, n nVar, Q6.k kVar) {
        super(i8, nVar, null);
        this.f3970g = kVar;
        this.f3971h = 1;
    }

    @Override // J0.AbstractC1028k
    public void d() {
        if (e()) {
            return;
        }
        n(this);
        super.d();
    }

    @Override // J0.AbstractC1028k
    public Q6.k h() {
        return this.f3970g;
    }

    @Override // J0.AbstractC1028k
    public boolean i() {
        return true;
    }

    @Override // J0.AbstractC1028k
    public Q6.k k() {
        return null;
    }

    @Override // J0.AbstractC1028k
    public void m(AbstractC1028k abstractC1028k) {
        this.f3971h++;
    }

    @Override // J0.AbstractC1028k
    public void n(AbstractC1028k abstractC1028k) {
        int i8 = this.f3971h - 1;
        this.f3971h = i8;
        if (i8 == 0) {
            b();
        }
    }

    @Override // J0.AbstractC1028k
    public void p(G g8) {
        p.Z();
        throw new C0920i();
    }

    @Override // J0.AbstractC1028k
    public AbstractC1028k x(Q6.k kVar) {
        p.g0(this);
        return new C1022e(f(), g(), kVar, this);
    }

    @Override // J0.AbstractC1028k
    public void o() {
    }
}
