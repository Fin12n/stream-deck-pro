package J0;

import java.util.Map;

/* JADX INFO: renamed from: J0.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C1021d extends C1020c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C1020c f3963s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f3964t;

    public C1021d(int i8, n nVar, Q6.k kVar, Q6.k kVar2, C1020c c1020c) {
        super(i8, nVar, kVar, kVar2);
        this.f3963s = c1020c;
        c1020c.m(this);
    }

    @Override // J0.C1020c
    public AbstractC1029l C() {
        Map mapR;
        if (this.f3963s.D() || this.f3963s.e()) {
            return new AbstractC1029l.a(this);
        }
        B0.b bVarE = E();
        int iF = f();
        if (bVarE != null) {
            C1020c c1020c = this.f3963s;
            mapR = p.R(c1020c, this, c1020c.g());
        } else {
            mapR = null;
        }
        synchronized (p.I()) {
            try {
                p.g0(this);
                if (bVarE == null || bVarE.size() == 0) {
                    b();
                } else {
                    AbstractC1029l abstractC1029lH = H(this.f3963s.f(), mapR, this.f3963s.g());
                    if (!kotlin.jvm.internal.t.c(abstractC1029lH, AbstractC1029l.b.f3981a)) {
                        return abstractC1029lH;
                    }
                    B0.b bVarE2 = this.f3963s.E();
                    if (bVarE2 != null) {
                        bVarE2.c(bVarE);
                    } else {
                        this.f3963s.O(bVarE);
                        O(null);
                    }
                }
                if (this.f3963s.f() < iF) {
                    this.f3963s.B();
                }
                C1020c c1020c2 = this.f3963s;
                c1020c2.v(c1020c2.g().y(iF).u(F()));
                this.f3963s.I(iF);
                this.f3963s.K(y());
                this.f3963s.J(F());
                this.f3963s.L(G());
                C6.G g8 = C6.G.f1419a;
                N(true);
                S();
                return AbstractC1029l.b.f3981a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void S() {
        if (this.f3964t) {
            return;
        }
        this.f3964t = true;
        this.f3963s.n(this);
    }

    @Override // J0.C1020c, J0.AbstractC1028k
    public void d() {
        if (e()) {
            return;
        }
        super.d();
        S();
    }
}
