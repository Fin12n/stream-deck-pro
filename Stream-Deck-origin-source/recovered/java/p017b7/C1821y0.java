package p017b7;

import C6.G;

/* JADX INFO: renamed from: b7.y0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class C1821y0 extends D0 implements InterfaceC1818x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f15993c;

    public C1821y0(InterfaceC1815v0 interfaceC1815v0) {
        super(true);
        k0(interfaceC1815v0);
        this.f15993c = Y0();
    }

    @Override // p017b7.D0
    public boolean W() {
        return this.f15993c;
    }

    @Override // p017b7.D0
    public boolean X() {
        return true;
    }

    public final boolean Y0() {
        D0 d0X;
        r rVarB0 = b0();
        C1808s c1808s = rVarB0 instanceof C1808s ? (C1808s) rVarB0 : null;
        if (c1808s != null && (d0X = c1808s.x()) != null) {
            while (!d0X.W()) {
                r rVarB1 = d0X.b0();
                C1808s c1808s2 = rVarB1 instanceof C1808s ? (C1808s) rVarB1 : null;
                if (c1808s2 == null || (d0X = c1808s2.x()) == null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // p017b7.InterfaceC1818x
    public boolean i1() {
        return q0(G.f1419a);
    }

    @Override // p017b7.InterfaceC1818x
    public boolean v(Throwable th) {
        return q0(new C1822z(th, false, 2, null));
    }
}
