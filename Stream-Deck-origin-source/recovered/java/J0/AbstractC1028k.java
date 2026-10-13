package J0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: renamed from: J0.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1028k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f3974e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f3975f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f3976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3979d;

    /* JADX INFO: renamed from: J0.k$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public static final void h(Q6.o oVar) {
            synchronized (p.I()) {
                p.f4006h = D6.z.z0(p.f4006h, oVar);
                C6.G g8 = C6.G.f1419a;
            }
        }

        public static final void j(Q6.k kVar) {
            synchronized (p.I()) {
                p.f4007i = D6.z.z0(p.f4007i, kVar);
                C6.G g8 = C6.G.f1419a;
            }
            p.B();
        }

        public final AbstractC1028k c() {
            return p.E((AbstractC1028k) p.f4000b.a(), null, false, 6, null);
        }

        public final AbstractC1028k d() {
            return p.H();
        }

        public final void e() {
            p.H().o();
        }

        public final Object f(Q6.k kVar, Q6.k kVar2, Function0 function0) {
            AbstractC1028k k8;
            if (kVar == null && kVar2 == null) {
                return function0.invoke();
            }
            AbstractC1028k abstractC1028k = (AbstractC1028k) p.f4000b.a();
            if (abstractC1028k == null || (abstractC1028k instanceof C1020c)) {
                k8 = new K(abstractC1028k instanceof C1020c ? (C1020c) abstractC1028k : null, kVar, kVar2, true, false);
            } else {
                if (kVar == null) {
                    return function0.invoke();
                }
                k8 = abstractC1028k.x(kVar);
            }
            try {
                AbstractC1028k abstractC1028kL = k8.l();
                try {
                    Object objInvoke = function0.invoke();
                    k8.s(abstractC1028kL);
                    k8.d();
                    return objInvoke;
                } catch (Throwable th) {
                    k8.s(abstractC1028kL);
                    throw th;
                }
            } catch (Throwable th2) {
                k8.d();
                throw th2;
            }
        }

        public final InterfaceC1023f g(final Q6.o oVar) {
            p.A(p.f3999a);
            synchronized (p.I()) {
                p.f4006h = D6.z.C0(p.f4006h, oVar);
                C6.G g8 = C6.G.f1419a;
            }
            return new InterfaceC1023f() { // from class: J0.i
                @Override // J0.InterfaceC1023f
                public final void d() {
                    AbstractC1028k.a.h(oVar);
                }
            };
        }

        public final InterfaceC1023f i(final Q6.k kVar) {
            synchronized (p.I()) {
                p.f4007i = D6.z.C0(p.f4007i, kVar);
                C6.G g8 = C6.G.f1419a;
            }
            p.B();
            return new InterfaceC1023f() { // from class: J0.j
                @Override // J0.InterfaceC1023f
                public final void d() {
                    AbstractC1028k.a.j(kVar);
                }
            };
        }

        public final void k() {
            boolean z8;
            synchronized (p.I()) {
                B0.b bVarE = ((C1018a) p.f4008j.get()).E();
                z8 = false;
                if (bVarE != null && bVarE.u()) {
                    z8 = true;
                }
            }
            if (z8) {
                p.B();
            }
        }

        public final C1020c l(Q6.k kVar, Q6.k kVar2) {
            C1020c c1020cP;
            AbstractC1028k abstractC1028kH = p.H();
            C1020c c1020c = abstractC1028kH instanceof C1020c ? (C1020c) abstractC1028kH : null;
            if (c1020c == null || (c1020cP = c1020c.P(kVar, kVar2)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            return c1020cP;
        }

        public final AbstractC1028k m(Q6.k kVar) {
            return p.H().x(kVar);
        }

        public a() {
        }
    }

    public /* synthetic */ AbstractC1028k(int i8, n nVar, AbstractC2633k abstractC2633k) {
        this(i8, nVar);
    }

    public final void b() {
        synchronized (p.I()) {
            c();
            r();
            C6.G g8 = C6.G.f1419a;
        }
    }

    public void c() {
        p.f4002d = p.f4002d.y(f());
    }

    public void d() {
        this.f3978c = true;
        synchronized (p.I()) {
            q();
            C6.G g8 = C6.G.f1419a;
        }
    }

    public final boolean e() {
        return this.f3978c;
    }

    public int f() {
        return this.f3977b;
    }

    public n g() {
        return this.f3976a;
    }

    public abstract Q6.k h();

    public abstract boolean i();

    public int j() {
        return 0;
    }

    public abstract Q6.k k();

    public AbstractC1028k l() {
        AbstractC1028k abstractC1028k = (AbstractC1028k) p.f4000b.a();
        p.f4000b.b(this);
        return abstractC1028k;
    }

    public abstract void m(AbstractC1028k abstractC1028k);

    public abstract void n(AbstractC1028k abstractC1028k);

    public abstract void o();

    public abstract void p(G g8);

    public final void q() {
        int i8 = this.f3979d;
        if (i8 >= 0) {
            p.Y(i8);
            this.f3979d = -1;
        }
    }

    public void r() {
        q();
    }

    public void s(AbstractC1028k abstractC1028k) {
        p.f4000b.b(abstractC1028k);
    }

    public final void t(boolean z8) {
        this.f3978c = z8;
    }

    public void u(int i8) {
        this.f3977b = i8;
    }

    public void v(n nVar) {
        this.f3976a = nVar;
    }

    public void w(int i8) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract AbstractC1028k x(Q6.k kVar);

    public final int y() {
        int i8 = this.f3979d;
        this.f3979d = -1;
        return i8;
    }

    public final void z() {
        if (this.f3978c) {
            throw new IllegalArgumentException("Cannot use a disposed snapshot");
        }
    }

    public AbstractC1028k(int i8, n nVar) {
        this.f3976a = nVar;
        this.f3977b = i8;
        this.f3979d = i8 != 0 ? p.c0(i8, g()) : -1;
    }
}
