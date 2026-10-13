package p017b7;

import G6.d;
import G6.g;
import Q6.o;

/* JADX INFO: renamed from: b7.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1773a extends D0 implements InterfaceC1815v0, d, J {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f15937c;

    public AbstractC1773a(g gVar, boolean z8, boolean z9) {
        super(z9);
        if (z8) {
            k0((InterfaceC1815v0) gVar.A(InterfaceC1815v0.f15985O));
        }
        this.f15937c = gVar.P1(this);
    }

    @Override // p017b7.D0
    public final void B0(Object obj) {
        if (!(obj instanceof C1822z)) {
            b1(obj);
        } else {
            C1822z c1822z = (C1822z) obj;
            Z0(c1822z.f15995a, c1822z.a());
        }
    }

    @Override // p017b7.D0
    public String M() {
        return N.a(this) + " was cancelled";
    }

    public void Y0(Object obj) {
        w(obj);
    }

    @Override // p017b7.D0, p017b7.InterfaceC1815v0
    public boolean b() {
        return super.b();
    }

    public final void c1(L l8, Object obj, o oVar) {
        l8.b(oVar, obj, this);
    }

    @Override // p017b7.D0
    public final void g0(Throwable th) {
        H.a(this.f15937c, th);
    }

    @Override // G6.d
    public final g getContext() {
        return this.f15937c;
    }

    @Override // p017b7.J
    public g getCoroutineContext() {
        return this.f15937c;
    }

    @Override // G6.d
    public final void resumeWith(Object obj) {
        Object objS0 = s0(C.d(obj, null, 1, null));
        if (objS0 == E0.f15888b) {
            return;
        }
        Y0(objS0);
    }

    @Override // p017b7.D0
    public String u0() {
        String strB = E.b(this.f15937c);
        if (strB == null) {
            return super.u0();
        }
        return '\"' + strB + "\":" + super.u0();
    }

    public void b1(Object obj) {
    }

    public void Z0(Throwable th, boolean z8) {
    }
}
