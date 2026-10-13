package p011b1;

import B0.d;
import p010b0.m;
import p038e1.InterfaceC2247s;

/* JADX INFO: renamed from: b1.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class C1764l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f15763b = d.f896d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f15764a = new d(new C1763k[16], 0);

    public boolean a(m mVar, InterfaceC2247s interfaceC2247s, C1760h c1760h, boolean z8) {
        d dVar = this.f15764a;
        int iS = dVar.s();
        if (iS <= 0) {
            return false;
        }
        Object[] objArrR = dVar.r();
        int i8 = 0;
        boolean z9 = false;
        do {
            z9 = ((C1763k) objArrR[i8]).a(mVar, interfaceC2247s, c1760h, z8) || z9;
            i8++;
        } while (i8 < iS);
        return z9;
    }

    public void b(C1760h c1760h) {
        int iS = this.f15764a.s();
        while (true) {
            iS--;
            if (-1 >= iS) {
                return;
            }
            if (((C1763k) this.f15764a.r()[iS]).k().g()) {
                this.f15764a.D(iS);
            }
        }
    }

    public final void c() {
        this.f15764a.m();
    }

    public void d() {
        d dVar = this.f15764a;
        int iS = dVar.s();
        if (iS > 0) {
            Object[] objArrR = dVar.r();
            int i8 = 0;
            do {
                ((C1763k) objArrR[i8]).d();
                i8++;
            } while (i8 < iS);
        }
    }

    public boolean e(C1760h c1760h) {
        d dVar = this.f15764a;
        int iS = dVar.s();
        boolean z8 = false;
        if (iS > 0) {
            Object[] objArrR = dVar.r();
            int i8 = 0;
            boolean z9 = false;
            do {
                z9 = ((C1763k) objArrR[i8]).e(c1760h) || z9;
                i8++;
            } while (i8 < iS);
            z8 = z9;
        }
        b(c1760h);
        return z8;
    }

    public boolean f(m mVar, InterfaceC2247s interfaceC2247s, C1760h c1760h, boolean z8) {
        d dVar = this.f15764a;
        int iS = dVar.s();
        if (iS <= 0) {
            return false;
        }
        Object[] objArrR = dVar.r();
        int i8 = 0;
        boolean z9 = false;
        do {
            z9 = ((C1763k) objArrR[i8]).f(mVar, interfaceC2247s, c1760h, z8) || z9;
            i8++;
        } while (i8 < iS);
        return z9;
    }

    public final d g() {
        return this.f15764a;
    }

    public final void h() {
        int i8 = 0;
        while (i8 < this.f15764a.s()) {
            C1763k c1763k = (C1763k) this.f15764a.r()[i8];
            if (c1763k.j().K1()) {
                i8++;
                c1763k.h();
            } else {
                this.f15764a.D(i8);
                c1763k.d();
            }
        }
    }
}
