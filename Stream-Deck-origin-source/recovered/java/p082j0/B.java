package p082j0;

import A1.b;
import p038e1.G;
import p038e1.InterfaceC2243n;
import p038e1.InterfaceC2244o;
import p038e1.J;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class B extends A {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public EnumC2621z f27828n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f27829o;

    public B(EnumC2621z enumC2621z, boolean z8) {
        this.f27828n = enumC2621z;
        this.f27829o = z8;
    }

    @Override // p082j0.A
    public long d2(J j8, G g8, long j9) {
        int iF = this.f27828n == EnumC2621z.Min ? g8.F(b.m(j9)) : g8.G(b.m(j9));
        if (iF < 0) {
            iF = 0;
        }
        return b.f422b.e(iF);
    }

    @Override // p082j0.A
    public boolean e2() {
        return this.f27829o;
    }

    public void f2(boolean z8) {
        this.f27829o = z8;
    }

    @Override // p082j0.A, p056g1.A
    public int g(InterfaceC2244o interfaceC2244o, InterfaceC2243n interfaceC2243n, int i8) {
        return this.f27828n == EnumC2621z.Min ? interfaceC2243n.F(i8) : interfaceC2243n.G(i8);
    }

    public final void g2(EnumC2621z enumC2621z) {
        this.f27828n = enumC2621z;
    }

    @Override // p082j0.A, p056g1.A
    public int o(InterfaceC2244o interfaceC2244o, InterfaceC2243n interfaceC2243n, int i8) {
        return this.f27828n == EnumC2621z.Min ? interfaceC2243n.F(i8) : interfaceC2243n.G(i8);
    }
}
