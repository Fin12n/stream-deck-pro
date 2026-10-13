package p109m0;

import C6.G;
import J0.AbstractC1028k;
import p038e1.Y;
import p215z0.InterfaceC3160j0;
import p215z0.InterfaceC3164l0;
import p215z0.X0;
import p215z0.l1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class y implements Y, Y.a, A.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f29476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A f29477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC3160j0 f29478c = X0.a(-1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC3160j0 f29479d = X0.a(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC3164l0 f29480e = l1.e(null, null, 2, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC3164l0 f29481f = l1.e(null, null, 2, null);

    public y(Object obj, A a8) {
        this.f29476a = obj;
        this.f29477b = a8;
    }

    @Override // e1.Y.a
    public void a() {
        if (e() <= 0) {
            throw new IllegalStateException("Release should only be called once");
        }
        k(e() - 1);
        if (e() == 0) {
            this.f29477b.y(this);
            Y.a aVarC = c();
            if (aVarC != null) {
                aVarC.a();
            }
            i(null);
        }
    }

    @Override // p038e1.Y
    public Y.a b() {
        if (e() == 0) {
            this.f29477b.u(this);
            Y yD = d();
            i(yD != null ? yD.b() : null);
        }
        k(e() + 1);
        return this;
    }

    public final Y.a c() {
        return (Y.a) this.f29480e.getValue();
    }

    public final Y d() {
        return f();
    }

    public final int e() {
        return this.f29479d.f();
    }

    public final Y f() {
        return (Y) this.f29481f.getValue();
    }

    public final void g() {
        int iE = e();
        for (int i8 = 0; i8 < iE; i8++) {
            a();
        }
    }

    @Override // m0.A.a
    public int getIndex() {
        return this.f29478c.f();
    }

    @Override // m0.A.a
    public Object getKey() {
        return this.f29476a;
    }

    public void h(int i8) {
        this.f29478c.p(i8);
    }

    public final void i(Y.a aVar) {
        this.f29480e.setValue(aVar);
    }

    public final void j(Y y8) {
        AbstractC1028k abstractC1028kC = AbstractC1028k.f3974e.c();
        try {
            AbstractC1028k abstractC1028kL = abstractC1028kC.l();
            try {
                if (y8 != f()) {
                    l(y8);
                    if (e() > 0) {
                        Y.a aVarC = c();
                        if (aVarC != null) {
                            aVarC.a();
                        }
                        i(y8 != null ? y8.b() : null);
                    }
                }
                G g8 = G.f1419a;
                abstractC1028kC.s(abstractC1028kL);
                abstractC1028kC.d();
            } catch (Throwable th) {
                abstractC1028kC.s(abstractC1028kL);
                throw th;
            }
        } catch (Throwable th2) {
            abstractC1028kC.d();
            throw th2;
        }
    }

    public final void k(int i8) {
        this.f29479d.p(i8);
    }

    public final void l(Y y8) {
        this.f29481f.setValue(y8);
    }
}
