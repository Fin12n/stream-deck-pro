package p215z0;

import C6.C0920i;
import V.ocy.SVzBK;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class S0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T0 f38649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f38650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f38651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object[] f38652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f38653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HashMap f38654f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f38655g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f38656h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f38657i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f38658j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f38659k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f38660l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f38661m;

    public S0(T0 t8) {
        this.f38649a = t8;
        this.f38650b = t8.y();
        int iA = t8.A();
        this.f38651c = iA;
        this.f38652d = t8.D();
        this.f38653e = t8.E();
        this.f38657i = iA;
        this.f38658j = -1;
    }

    public final Object A(int i8) {
        return L(this.f38650b, i8);
    }

    public final int B(int i8) {
        return V0.I(this.f38650b, i8);
    }

    public final boolean C(int i8) {
        return V0.K(this.f38650b, i8);
    }

    public final boolean D(int i8) {
        return V0.L(this.f38650b, i8);
    }

    public final boolean E() {
        return r() || this.f38656h == this.f38657i;
    }

    public final boolean F() {
        return V0.N(this.f38650b, this.f38656h);
    }

    public final boolean G(int i8) {
        return V0.N(this.f38650b, i8);
    }

    public final Object H() {
        int i8;
        if (this.f38659k > 0 || (i8 = this.f38660l) >= this.f38661m) {
            return InterfaceC3163l.f38803a.a();
        }
        Object[] objArr = this.f38652d;
        this.f38660l = i8 + 1;
        return objArr[i8];
    }

    public final Object I(int i8) {
        if (V0.N(this.f38650b, i8)) {
            return J(this.f38650b, i8);
        }
        return null;
    }

    public final Object J(int[] iArr, int i8) {
        return V0.N(iArr, i8) ? this.f38652d[V0.R(iArr, i8)] : InterfaceC3163l.f38803a.a();
    }

    public final int K(int i8) {
        return V0.Q(this.f38650b, i8);
    }

    public final Object L(int[] iArr, int i8) {
        if (V0.L(iArr, i8)) {
            return this.f38652d[V0.S(iArr, i8)];
        }
        return null;
    }

    public final int M(int i8) {
        return V0.T(this.f38650b, i8);
    }

    public final void N(int i8) {
        if (!(this.f38659k == 0)) {
            AbstractC3169o.v("Cannot reposition while in an empty region");
            throw new C0920i();
        }
        this.f38656h = i8;
        int iT = i8 < this.f38651c ? V0.T(this.f38650b, i8) : -1;
        this.f38658j = iT;
        if (iT < 0) {
            this.f38657i = this.f38651c;
        } else {
            this.f38657i = iT + V0.I(this.f38650b, iT);
        }
        this.f38660l = 0;
        this.f38661m = 0;
    }

    public final int P() {
        if (!(this.f38659k == 0)) {
            AbstractC3169o.v("Cannot skip while in an empty region");
            throw new C0920i();
        }
        int iQ = V0.N(this.f38650b, this.f38656h) ? 1 : V0.Q(this.f38650b, this.f38656h);
        int i8 = this.f38656h;
        this.f38656h = i8 + V0.I(this.f38650b, i8);
        return iQ;
    }

    public final void Q() {
        if (this.f38659k == 0) {
            this.f38656h = this.f38657i;
        } else {
            AbstractC3169o.v("Cannot skip the enclosing group while in an empty region");
            throw new C0920i();
        }
    }

    public final void R() {
        P p8;
        if (this.f38659k <= 0) {
            int i8 = this.f38658j;
            int i9 = this.f38656h;
            if (V0.T(this.f38650b, i9) != i8) {
                throw new IllegalArgumentException("Invalid slot table detected");
            }
            HashMap map = this.f38654f;
            if (map != null && (p8 = (P) map.get(a(i8))) != null) {
                p8.h(this.f38649a, i9);
            }
            this.f38658j = i9;
            this.f38657i = V0.I(this.f38650b, i9) + i9;
            int i10 = i9 + 1;
            this.f38656h = i10;
            this.f38660l = V0.V(this.f38650b, i9);
            this.f38661m = i9 >= this.f38651c + (-1) ? this.f38653e : V0.F(this.f38650b, i10);
        }
    }

    public final void S() {
        if (this.f38659k <= 0) {
            if (!V0.N(this.f38650b, this.f38656h)) {
                throw new IllegalArgumentException("Expected a node group");
            }
            R();
        }
    }

    public final C3147d a(int i8) {
        ArrayList arrayListU = this.f38649a.u();
        int iU = V0.U(arrayListU, i8, this.f38651c);
        if (iU >= 0) {
            return (C3147d) arrayListU.get(iU);
        }
        C3147d c3147d = new C3147d(i8);
        arrayListU.add(-(iU + 1), c3147d);
        return c3147d;
    }

    public final Object b(int[] iArr, int i8) {
        return V0.J(iArr, i8) ? this.f38652d[V0.B(iArr, i8)] : InterfaceC3163l.f38803a.a();
    }

    public final void c() {
        this.f38659k++;
    }

    public final void d() {
        this.f38655g = true;
        this.f38649a.o(this, this.f38654f);
    }

    public final boolean e(int i8) {
        return V0.D(this.f38650b, i8);
    }

    public final void f() {
        int i8 = this.f38659k;
        if (i8 <= 0) {
            throw new IllegalArgumentException("Unbalanced begin/end empty");
        }
        this.f38659k = i8 - 1;
    }

    public final void g() {
        if (this.f38659k == 0) {
            if (!(this.f38656h == this.f38657i)) {
                AbstractC3169o.v("endGroup() not called at the end of a group");
                throw new C0920i();
            }
            int iT = V0.T(this.f38650b, this.f38658j);
            this.f38658j = iT;
            this.f38657i = iT < 0 ? this.f38651c : iT + V0.I(this.f38650b, iT);
        }
    }

    public final List h() {
        ArrayList arrayList = new ArrayList();
        if (this.f38659k <= 0) {
            int i8 = 0;
            int I8 = this.f38656h;
            while (true) {
                int i9 = i8;
                if (I8 >= this.f38657i) {
                    break;
                }
                i8 = i9 + 1;
                arrayList.add(new W(V0.O(this.f38650b, I8), L(this.f38650b, I8), I8, V0.N(this.f38650b, I8) ? 1 : V0.Q(this.f38650b, I8), i9));
                I8 += V0.I(this.f38650b, I8);
            }
        }
        return arrayList;
    }

    public final boolean i() {
        return this.f38655g;
    }

    public final int j() {
        return this.f38657i;
    }

    public final int k() {
        return this.f38656h;
    }

    public final Object l() {
        int i8 = this.f38656h;
        if (i8 < this.f38657i) {
            return b(this.f38650b, i8);
        }
        return 0;
    }

    public final int m() {
        return this.f38657i;
    }

    public final int n() {
        int i8 = this.f38656h;
        if (i8 < this.f38657i) {
            return V0.O(this.f38650b, i8);
        }
        return 0;
    }

    public final Object o() {
        int i8 = this.f38656h;
        if (i8 < this.f38657i) {
            return L(this.f38650b, i8);
        }
        return null;
    }

    public final int p() {
        return V0.I(this.f38650b, this.f38656h);
    }

    public final int q() {
        return this.f38660l - V0.V(this.f38650b, this.f38658j);
    }

    public final boolean r() {
        return this.f38659k > 0;
    }

    public final int s() {
        return this.f38658j;
    }

    public final int t() {
        int i8 = this.f38658j;
        if (i8 >= 0) {
            return V0.Q(this.f38650b, i8);
        }
        return 0;
    }

    public String toString() {
        return "SlotReader(current=" + this.f38656h + ", key=" + n() + ", parent=" + this.f38658j + ", end=" + this.f38657i + ')';
    }

    public final int u() {
        return this.f38651c;
    }

    public final T0 v() {
        return this.f38649a;
    }

    public final Object w(int i8) {
        return b(this.f38650b, i8);
    }

    public final Object x(int i8) {
        return y(this.f38656h, i8);
    }

    public final Object y(int i8, int i9) {
        int iV = V0.V(this.f38650b, i8);
        int i10 = i8 + 1;
        int i11 = iV + i9;
        return i11 < (i10 < this.f38651c ? V0.F(this.f38650b, i10) : this.f38653e) ? this.f38652d[i11] : InterfaceC3163l.f38803a.a();
    }

    public final int z(int i8) {
        return V0.O(this.f38650b, i8);
    }

    public final void O(int i8) {
        int I8 = V0.I(this.f38650b, i8) + i8;
        int i9 = this.f38656h;
        if (i9 >= i8 && i9 <= I8) {
            this.f38658j = i8;
            this.f38657i = I8;
            this.f38660l = 0;
            this.f38661m = 0;
            return;
        }
        AbstractC3169o.v((SVzBK.hIOUPacoQ + i8 + " is not a parent of " + i9).toString());
        throw new C0920i();
    }
}
