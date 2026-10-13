package J0;

import C6.C0920i;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class L extends AbstractC1028k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AbstractC1028k f3941g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f3942h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f3943i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Q6.k f3944j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Q6.k f3945k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AbstractC1028k f3946l;

    public L(AbstractC1028k abstractC1028k, Q6.k kVar, boolean z8, boolean z9) {
        Q6.k kVarH;
        super(0, n.f3987e.a(), null);
        this.f3941g = abstractC1028k;
        this.f3942h = z8;
        this.f3943i = z9;
        this.f3944j = p.K(kVar, (abstractC1028k == null || (kVarH = abstractC1028k.h()) == null) ? ((C1018a) p.f4008j.get()).h() : kVarH, z8);
        this.f3946l = this;
    }

    public final AbstractC1028k A() {
        AbstractC1028k abstractC1028k = this.f3941g;
        return abstractC1028k == null ? (AbstractC1028k) p.f4008j.get() : abstractC1028k;
    }

    @Override // J0.AbstractC1028k
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public Void m(AbstractC1028k abstractC1028k) {
        y.b();
        throw new C0920i();
    }

    @Override // J0.AbstractC1028k
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public Void n(AbstractC1028k abstractC1028k) {
        y.b();
        throw new C0920i();
    }

    @Override // J0.AbstractC1028k
    public void d() {
        AbstractC1028k abstractC1028k;
        t(true);
        if (!this.f3943i || (abstractC1028k = this.f3941g) == null) {
            return;
        }
        abstractC1028k.d();
    }

    @Override // J0.AbstractC1028k
    public int f() {
        return A().f();
    }

    @Override // J0.AbstractC1028k
    public n g() {
        return A().g();
    }

    @Override // J0.AbstractC1028k
    public Q6.k h() {
        return this.f3944j;
    }

    @Override // J0.AbstractC1028k
    public boolean i() {
        return A().i();
    }

    @Override // J0.AbstractC1028k
    public Q6.k k() {
        return this.f3945k;
    }

    @Override // J0.AbstractC1028k
    public void o() {
        A().o();
    }

    @Override // J0.AbstractC1028k
    public void p(G g8) {
        A().p(g8);
    }

    @Override // J0.AbstractC1028k
    public AbstractC1028k x(Q6.k kVar) {
        Q6.k kVarL = p.L(kVar, h(), false, 4, null);
        return !this.f3942h ? p.D(A().x(null), kVarL, true) : A().x(kVarL);
    }
}
