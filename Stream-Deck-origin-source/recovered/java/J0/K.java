package J0;

import C6.C0920i;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class K extends C1020c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C1020c f3938s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f3939t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f3940u;

    public K(C1020c c1020c, Q6.k kVar, Q6.k kVar2, boolean z8, boolean z9) {
        Q6.k kVarK;
        Q6.k kVarH;
        super(0, n.f3987e.a(), p.K(kVar, (c1020c == null || (kVarH = c1020c.h()) == null) ? ((C1018a) p.f4008j.get()).h() : kVarH, z8), p.M(kVar2, (c1020c == null || (kVarK = c1020c.k()) == null) ? ((C1018a) p.f4008j.get()).k() : kVarK));
        this.f3938s = c1020c;
        this.f3939t = z8;
        this.f3940u = z9;
    }

    @Override // J0.C1020c
    public AbstractC1029l C() {
        return S().C();
    }

    @Override // J0.C1020c
    public B0.b E() {
        return S().E();
    }

    @Override // J0.C1020c
    public void O(B0.b bVar) {
        y.b();
        throw new C0920i();
    }

    @Override // J0.C1020c
    public C1020c P(Q6.k kVar, Q6.k kVar2) {
        Q6.k kVarL = p.L(kVar, h(), false, 4, null);
        Q6.k kVarM = p.M(kVar2, k());
        return !this.f3939t ? new K(S().P(null, kVarM), kVarL, kVarM, false, true) : S().P(kVarL, kVarM);
    }

    public final C1020c S() {
        C1020c c1020c = this.f3938s;
        return c1020c == null ? (C1020c) p.f4008j.get() : c1020c;
    }

    @Override // J0.C1020c, J0.AbstractC1028k
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public Void m(AbstractC1028k abstractC1028k) {
        y.b();
        throw new C0920i();
    }

    @Override // J0.C1020c, J0.AbstractC1028k
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public Void n(AbstractC1028k abstractC1028k) {
        y.b();
        throw new C0920i();
    }

    @Override // J0.C1020c, J0.AbstractC1028k
    public void d() {
        C1020c c1020c;
        t(true);
        if (!this.f3940u || (c1020c = this.f3938s) == null) {
            return;
        }
        c1020c.d();
    }

    @Override // J0.AbstractC1028k
    public int f() {
        return S().f();
    }

    @Override // J0.AbstractC1028k
    public n g() {
        return S().g();
    }

    @Override // J0.C1020c, J0.AbstractC1028k
    public boolean i() {
        return S().i();
    }

    @Override // J0.C1020c, J0.AbstractC1028k
    public int j() {
        return S().j();
    }

    @Override // J0.C1020c, J0.AbstractC1028k
    public void o() {
        S().o();
    }

    @Override // J0.C1020c, J0.AbstractC1028k
    public void p(G g8) {
        S().p(g8);
    }

    @Override // J0.AbstractC1028k
    public void u(int i8) {
        y.b();
        throw new C0920i();
    }

    @Override // J0.AbstractC1028k
    public void v(n nVar) {
        y.b();
        throw new C0920i();
    }

    @Override // J0.C1020c, J0.AbstractC1028k
    public void w(int i8) {
        S().w(i8);
    }

    @Override // J0.C1020c, J0.AbstractC1028k
    public AbstractC1028k x(Q6.k kVar) {
        Q6.k kVarL = p.L(kVar, h(), false, 4, null);
        return !this.f3939t ? p.D(S().x(null), kVarL, true) : S().x(kVarL);
    }
}
