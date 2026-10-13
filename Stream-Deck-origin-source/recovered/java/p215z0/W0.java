package p215z0;

import C6.C0920i;
import D6.C0933m;
import D6.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p135p0.Dyk.GOKsbdzhLhXAMt;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class W0 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f38689w = new a(null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f38690x = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T0 f38691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f38692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f38693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f38694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HashMap f38695e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f38696f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f38697g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f38698h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f38699i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f38700j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f38701k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f38702l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f38703m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f38704n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f38708r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f38709s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f38711u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C3189y0 f38712v;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Q f38705o = new Q();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Q f38706p = new Q();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Q f38707q = new Q();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f38710t = -1;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public static /* synthetic */ List c(a aVar, W0 w8, int i8, W0 w9, boolean z8, boolean z9, boolean z10, int i9, Object obj) {
            if ((i9 & 32) != 0) {
                z10 = true;
            }
            return aVar.b(w8, i8, w9, z8, z9, z10);
        }

        public final List b(W0 w8, int i8, W0 w9, boolean z8, boolean z9, boolean z10) {
            boolean zM0;
            List listN;
            HashMap map;
            int iJ0 = w8.j0(i8);
            int i9 = i8 + iJ0;
            int iP = w8.P(i8);
            int iP2 = w8.P(i9);
            int i10 = iP2 - iP;
            boolean zM = w8.M(i8);
            w9.o0(iJ0);
            w9.p0(i10, w9.a0());
            if (w8.f38696f < i9) {
                w8.x0(i9);
            }
            if (w8.f38700j < iP2) {
                w8.z0(iP2, i9);
            }
            int[] iArr = w9.f38692b;
            int iA0 = w9.a0();
            C0933m.g(w8.f38692b, iArr, iA0 * 5, i8 * 5, i9 * 5);
            Object[] objArr = w9.f38693c;
            int i11 = w9.f38698h;
            C0933m.i(w8.f38693c, objArr, i11, iP, iP2);
            int iC0 = w9.c0();
            V0.b0(iArr, iA0, iC0);
            int i12 = iA0 - i8;
            int i13 = iA0 + iJ0;
            int iQ = i11 - w9.Q(iArr, iA0);
            int i14 = w9.f38702l;
            int i15 = w9.f38701k;
            int length = objArr.length;
            int i16 = i14;
            int i17 = iA0;
            while (true) {
                zM0 = false;
                if (i17 >= i13) {
                    break;
                }
                if (i17 != iA0) {
                    V0.b0(iArr, i17, V0.T(iArr, i17) + i12);
                }
                int i18 = i13;
                V0.X(iArr, i17, w9.S(w9.Q(iArr, i17) + iQ, i16 >= i17 ? w9.f38700j : 0, i15, length));
                if (i17 == i16) {
                    i16++;
                }
                i17++;
                i13 = i18;
                iQ = iQ;
            }
            int i19 = i13;
            w9.f38702l = i16;
            int iP3 = V0.P(w8.f38694d, i8, w8.d0());
            int iP4 = V0.P(w8.f38694d, i9, w8.d0());
            if (iP3 < iP4) {
                ArrayList arrayList = w8.f38694d;
                ArrayList arrayList2 = new ArrayList(iP4 - iP3);
                for (int i20 = iP3; i20 < iP4; i20++) {
                    C3147d c3147d = (C3147d) arrayList.get(i20);
                    c3147d.c(c3147d.a() + i12);
                    arrayList2.add(c3147d);
                }
                w9.f38694d.addAll(V0.P(w9.f38694d, w9.a0(), w9.d0()), arrayList2);
                arrayList.subList(iP3, iP4).clear();
                listN = arrayList2;
            } else {
                listN = r.n();
            }
            if (!listN.isEmpty() && (map = w8.f38695e) != null) {
                HashMap map2 = w9.f38695e;
                int size = listN.size();
                for (int i21 = 0; i21 < size; i21++) {
                    C3147d c3147d2 = (C3147d) listN.get(i21);
                    P p8 = (P) map.get(c3147d2);
                    if (p8 != null) {
                        map.remove(c3147d2);
                        if (map2 == null) {
                            a aVar = W0.f38689w;
                            map2 = new HashMap();
                            w9.f38695e = map2;
                        }
                        map2.put(c3147d2, p8);
                    }
                }
                if (map.isEmpty()) {
                    w8.f38695e = null;
                }
            }
            int iC1 = w9.c0();
            P pA1 = w9.a1(iC0);
            if (pA1 != null) {
                int I8 = iC1 + 1;
                int iA1 = w9.a0();
                int i22 = -1;
                while (I8 < iA1) {
                    i22 = I8;
                    I8 = V0.I(w9.f38692b, I8) + I8;
                }
                pA1.b(w9, i22, iA1);
            }
            int iF0 = w8.F0(i8);
            if (z10) {
                if (z8) {
                    boolean z11 = iF0 >= 0;
                    if (z11) {
                        w8.c1();
                        w8.E(iF0 - w8.a0());
                        w8.c1();
                    }
                    w8.E(i8 - w8.a0());
                    boolean zL0 = w8.L0();
                    if (z11) {
                        w8.W0();
                        w8.T();
                        w8.W0();
                        w8.T();
                    }
                    zM0 = zL0;
                } else {
                    zM0 = w8.M0(i8, iJ0);
                    w8.N0(iP, i10, i8 - 1);
                }
            }
            if (zM0) {
                AbstractC3169o.v("Unexpectedly removed anchors");
                throw new C0920i();
            }
            w9.f38704n += V0.N(iArr, iA0) ? 1 : V0.Q(iArr, iA0);
            if (z9) {
                w9.f38708r = i19;
                w9.f38698h = i11 + i10;
            }
            if (zM) {
                w9.k1(iC0);
            }
            return listN;
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements Iterator, R6.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f38713a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f38714b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ W0 f38715c;

        public b(int i8, int i9, W0 w8) {
            this.f38714b = i9;
            this.f38715c = w8;
            this.f38713a = i8;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f38713a < this.f38714b;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                return null;
            }
            Object[] objArr = this.f38715c.f38693c;
            W0 w8 = this.f38715c;
            int i8 = this.f38713a;
            this.f38713a = i8 + 1;
            return objArr[w8.R(i8)];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public W0(T0 t8) {
        this.f38691a = t8;
        this.f38692b = t8.y();
        this.f38693c = t8.D();
        this.f38694d = t8.u();
        this.f38695e = t8.F();
        this.f38696f = t8.A();
        this.f38697g = (this.f38692b.length / 5) - t8.A();
        this.f38700j = t8.E();
        this.f38701k = this.f38693c.length - t8.E();
        this.f38702l = t8.A();
        this.f38709s = t8.A();
    }

    public static /* synthetic */ void t0(W0 w8, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = w8.f38710t;
        }
        w8.s0(i8);
    }

    public final List A0(C3147d c3147d, int i8, W0 w8) {
        AbstractC3169o.U(w8.f38703m > 0);
        AbstractC3169o.U(this.f38703m == 0);
        AbstractC3169o.U(c3147d.b());
        int iG = G(c3147d) + i8;
        int i9 = this.f38708r;
        AbstractC3169o.U(i9 <= iG && iG < this.f38709s);
        int iF0 = F0(iG);
        int iJ0 = j0(iG);
        int iD0 = r0(iG) ? 1 : D0(iG);
        List listC = a.c(f38689w, this, iG, w8, false, false, false, 32, null);
        k1(iF0);
        boolean z8 = iD0 > 0;
        while (iF0 >= i9) {
            int iG0 = g0(iF0);
            int[] iArr = this.f38692b;
            V0.Y(iArr, iG0, V0.I(iArr, iG0) - iJ0);
            if (z8) {
                if (V0.N(this.f38692b, iG0)) {
                    z8 = false;
                } else {
                    int[] iArr2 = this.f38692b;
                    V0.a0(iArr2, iG0, V0.Q(iArr2, iG0) - iD0);
                }
            }
            iF0 = F0(iF0);
        }
        if (z8) {
            AbstractC3169o.U(this.f38704n >= iD0);
            this.f38704n -= iD0;
        }
        return listC;
    }

    public final Object B0(int i8) {
        int iG0 = g0(i8);
        if (V0.N(this.f38692b, iG0)) {
            return this.f38693c[R(E0(this.f38692b, iG0))];
        }
        return null;
    }

    public final Object C0(C3147d c3147d) {
        return B0(c3147d.e(this));
    }

    public final int D0(int i8) {
        return V0.Q(this.f38692b, g0(i8));
    }

    public final void E(int i8) {
        boolean z8 = false;
        if (!(i8 >= 0)) {
            AbstractC3169o.v("Cannot seek backwards");
            throw new C0920i();
        }
        if (this.f38703m > 0) {
            throw new IllegalStateException("Cannot call seek() while inserting");
        }
        if (i8 == 0) {
            return;
        }
        int i9 = this.f38708r + i8;
        if (i9 >= this.f38710t && i9 <= this.f38709s) {
            z8 = true;
        }
        if (z8) {
            this.f38708r = i9;
            int iQ = Q(this.f38692b, g0(i9));
            this.f38698h = iQ;
            this.f38699i = iQ;
            return;
        }
        AbstractC3169o.v(("Cannot seek outside the current group (" + this.f38710t + '-' + this.f38709s + ')').toString());
        throw new C0920i();
    }

    public final int E0(int[] iArr, int i8) {
        return Q(iArr, i8);
    }

    public final C3147d F(int i8) {
        ArrayList arrayList = this.f38694d;
        int iU = V0.U(arrayList, i8, d0());
        if (iU >= 0) {
            return (C3147d) arrayList.get(iU);
        }
        if (i8 > this.f38696f) {
            i8 = -(d0() - i8);
        }
        C3147d c3147d = new C3147d(i8);
        arrayList.add(-(iU + 1), c3147d);
        return c3147d;
    }

    public final int F0(int i8) {
        return G0(this.f38692b, i8);
    }

    public final int G(C3147d c3147d) {
        int iA = c3147d.a();
        return iA < 0 ? d0() + iA : iA;
    }

    public final int G0(int[] iArr, int i8) {
        return H0(V0.T(iArr, g0(i8)));
    }

    public final int H(int[] iArr, int i8) {
        return Q(iArr, i8) + V0.E(V0.H(iArr, i8) >> 29);
    }

    public final int H0(int i8) {
        return i8 > -2 ? i8 : (d0() + i8) - (-2);
    }

    public final void I() {
        int i8 = this.f38703m;
        this.f38703m = i8 + 1;
        if (i8 == 0) {
            Q0();
        }
    }

    public final int I0(int i8, int i9) {
        return i8 < i9 ? i8 : -((d0() - i8) + 2);
    }

    public final boolean J(int i8) {
        int iJ0 = i8 + 1;
        int iJ1 = i8 + j0(i8);
        while (iJ0 < iJ1) {
            if (V0.C(this.f38692b, g0(iJ0))) {
                return true;
            }
            iJ0 += j0(iJ0);
        }
        return false;
    }

    public final void J0() {
        C3189y0 c3189y0 = this.f38712v;
        if (c3189y0 != null) {
            while (c3189y0.b()) {
                l1(c3189y0.d(), c3189y0);
            }
        }
    }

    public final void K() {
        int i8 = this.f38700j;
        C0933m.s(this.f38693c, null, i8, this.f38701k + i8);
    }

    public final boolean K0(int i8, int i9, HashMap map) {
        int i10 = i9 + i8;
        int iP = V0.P(this.f38694d, i10, Y() - this.f38697g);
        if (iP >= this.f38694d.size()) {
            iP--;
        }
        int i11 = iP + 1;
        int i12 = 0;
        while (iP >= 0) {
            C3147d c3147d = (C3147d) this.f38694d.get(iP);
            int iG = G(c3147d);
            if (iG < i8) {
                break;
            }
            if (iG < i10) {
                c3147d.c(Integer.MIN_VALUE);
                if (map != null) {
                }
                if (i12 == 0) {
                    i12 = iP + 1;
                }
                i11 = iP;
            }
            iP--;
        }
        boolean z8 = i11 < i12;
        if (z8) {
            this.f38694d.subList(i11, i12).clear();
        }
        return z8;
    }

    public final void L() {
        this.f38711u = true;
        if (this.f38705o.d()) {
            x0(d0());
            z0(this.f38693c.length - this.f38701k, this.f38696f);
            K();
            J0();
        }
        this.f38691a.s(this, this.f38692b, this.f38696f, this.f38693c, this.f38700j, this.f38694d, this.f38695e);
    }

    public final boolean L0() {
        C3147d c3147dG1;
        if (!(this.f38703m == 0)) {
            AbstractC3169o.v("Cannot remove group while inserting");
            throw new C0920i();
        }
        int i8 = this.f38708r;
        int i9 = this.f38698h;
        int iV0 = V0();
        P pA1 = a1(this.f38710t);
        if (pA1 != null && (c3147dG1 = g1(i8)) != null) {
            pA1.g(c3147dG1);
        }
        C3189y0 c3189y0 = this.f38712v;
        if (c3189y0 != null) {
            while (c3189y0.b() && c3189y0.c() >= i8) {
                c3189y0.d();
            }
        }
        boolean zM0 = M0(i8, this.f38708r - i8);
        N0(i9, this.f38698h - i9, i8 - 1);
        this.f38708r = i8;
        this.f38698h = i9;
        this.f38704n -= iV0;
        return zM0;
    }

    public final boolean M(int i8) {
        return i8 >= 0 && V0.C(this.f38692b, g0(i8));
    }

    public final boolean M0(int i8, int i9) {
        boolean zK0 = false;
        if (i9 > 0) {
            ArrayList arrayList = this.f38694d;
            x0(i8);
            zK0 = arrayList.isEmpty() ? false : K0(i8, i9, this.f38695e);
            this.f38696f = i8;
            this.f38697g += i9;
            int i10 = this.f38702l;
            if (i10 > i8) {
                this.f38702l = Math.max(i8, i10 - i9);
            }
            int i11 = this.f38709s;
            if (i11 >= this.f38696f) {
                this.f38709s = i11 - i9;
            }
            int i12 = this.f38710t;
            if (N(i12)) {
                k1(i12);
            }
        }
        return zK0;
    }

    public final boolean N(int i8) {
        return i8 >= 0 && V0.D(this.f38692b, g0(i8));
    }

    public final void N0(int i8, int i9, int i10) {
        if (i9 > 0) {
            int i11 = this.f38701k;
            int i12 = i8 + i9;
            z0(i12, i10);
            this.f38700j = i8;
            this.f38701k = i11 + i9;
            C0933m.s(this.f38693c, null, i8, i12);
            int i13 = this.f38699i;
            if (i13 >= i8) {
                this.f38699i = i13 - i9;
            }
        }
    }

    public final int O(int i8, int i9, int i10) {
        return i8 < 0 ? (i10 - i9) + i8 + 1 : i8;
    }

    public final void O0() {
        if (!(this.f38703m == 0)) {
            AbstractC3169o.v("Cannot reset when inserting");
            throw new C0920i();
        }
        J0();
        this.f38708r = 0;
        this.f38709s = Y() - this.f38697g;
        this.f38698h = 0;
        this.f38699i = 0;
        this.f38704n = 0;
    }

    public final int P(int i8) {
        return Q(this.f38692b, g0(i8));
    }

    public final int P0() {
        int iY = (Y() - this.f38697g) - this.f38706p.h();
        this.f38709s = iY;
        return iY;
    }

    public final int Q(int[] iArr, int i8) {
        return i8 >= Y() ? this.f38693c.length - this.f38701k : O(V0.F(iArr, i8), this.f38701k, this.f38693c.length);
    }

    public final void Q0() {
        this.f38706p.i((Y() - this.f38697g) - this.f38709s);
    }

    public final int R(int i8) {
        return i8 < this.f38700j ? i8 : i8 + this.f38701k;
    }

    public final Object R0(int i8, int i9, Object obj) {
        int iZ0 = Z0(this.f38692b, g0(i8));
        int i10 = iZ0 + i9;
        if (i10 >= iZ0 && i10 < Q(this.f38692b, g0(i8 + 1))) {
            int iR = R(i10);
            Object[] objArr = this.f38693c;
            Object obj2 = objArr[iR];
            objArr[iR] = obj;
            return obj2;
        }
        AbstractC3169o.v(("Write to an invalid slot index " + i9 + " for group " + i8).toString());
        throw new C0920i();
    }

    public final int S(int i8, int i9, int i10, int i11) {
        return i8 > i9 ? -(((i11 - i10) - i8) + 1) : i8;
    }

    public final Object S0(int i8, Object obj) {
        return R0(this.f38708r, i8, obj);
    }

    public final int T() {
        boolean z8 = this.f38703m > 0;
        int i8 = this.f38708r;
        int i9 = this.f38709s;
        int i10 = this.f38710t;
        int iG0 = g0(i10);
        int i11 = this.f38704n;
        int i12 = i8 - i10;
        boolean zN = V0.N(this.f38692b, iG0);
        if (z8) {
            V0.Y(this.f38692b, iG0, i12);
            V0.a0(this.f38692b, iG0, i11);
            this.f38704n = this.f38707q.h() + (zN ? 1 : i11);
            this.f38710t = G0(this.f38692b, i10);
            return i11;
        }
        if ((i8 != i9 ? 0 : 1) == 0) {
            AbstractC3169o.v("Expected to be at the end of a group");
            throw new C0920i();
        }
        int I8 = V0.I(this.f38692b, iG0);
        int iQ = V0.Q(this.f38692b, iG0);
        V0.Y(this.f38692b, iG0, i12);
        V0.a0(this.f38692b, iG0, i11);
        int iH = this.f38705o.h();
        P0();
        this.f38710t = iH;
        int iG1 = G0(this.f38692b, i10);
        int iH2 = this.f38707q.h();
        this.f38704n = iH2;
        if (iG1 == iH) {
            this.f38704n = iH2 + (zN ? 0 : i11 - iQ);
            return i11;
        }
        int i13 = i12 - I8;
        int i14 = zN ? 0 : i11 - iQ;
        if (i13 != 0 || i14 != 0) {
            while (iG1 != 0 && iG1 != iH && (i14 != 0 || i13 != 0)) {
                int iG2 = g0(iG1);
                if (i13 != 0) {
                    V0.Y(this.f38692b, iG2, V0.I(this.f38692b, iG2) + i13);
                }
                if (i14 != 0) {
                    int[] iArr = this.f38692b;
                    V0.a0(iArr, iG2, V0.Q(iArr, iG2) + i14);
                }
                if (V0.N(this.f38692b, iG2)) {
                    i14 = 0;
                }
                iG1 = G0(this.f38692b, iG1);
            }
        }
        this.f38704n += i14;
        return i11;
    }

    public final void T0(Object obj) {
        int i8 = this.f38698h;
        if (i8 <= this.f38699i) {
            this.f38693c[R(i8 - 1)] = obj;
        } else {
            AbstractC3169o.v("Writing to an invalid slot");
            throw new C0920i();
        }
    }

    public final void U() {
        int i8 = this.f38703m;
        if (i8 <= 0) {
            throw new IllegalStateException("Unbalanced begin/end insert");
        }
        int i9 = i8 - 1;
        this.f38703m = i9;
        if (i9 == 0) {
            if (this.f38707q.b() == this.f38705o.b()) {
                P0();
            } else {
                AbstractC3169o.v("startGroup/endGroup mismatch while inserting");
                throw new C0920i();
            }
        }
    }

    public final Object U0() {
        if (this.f38703m > 0) {
            p0(1, this.f38710t);
        }
        Object[] objArr = this.f38693c;
        int i8 = this.f38698h;
        this.f38698h = i8 + 1;
        return objArr[R(i8)];
    }

    public final void V(int i8) {
        boolean z8 = false;
        if (!(this.f38703m <= 0)) {
            AbstractC3169o.v("Cannot call ensureStarted() while inserting");
            throw new C0920i();
        }
        int i9 = this.f38710t;
        if (i9 != i8) {
            if (i8 >= i9 && i8 < this.f38709s) {
                z8 = true;
            }
            if (!z8) {
                AbstractC3169o.v(("Started group at " + i8 + " must be a subgroup of the group at " + i9).toString());
                throw new C0920i();
            }
            int i10 = this.f38708r;
            int i11 = this.f38698h;
            int i12 = this.f38699i;
            this.f38708r = i8;
            c1();
            this.f38708r = i10;
            this.f38698h = i11;
            this.f38699i = i12;
        }
    }

    public final int V0() {
        int iG0 = g0(this.f38708r);
        int I8 = this.f38708r + V0.I(this.f38692b, iG0);
        this.f38708r = I8;
        this.f38698h = Q(this.f38692b, g0(I8));
        if (V0.N(this.f38692b, iG0)) {
            return 1;
        }
        return V0.Q(this.f38692b, iG0);
    }

    public final void W(C3147d c3147d) {
        V(c3147d.e(this));
    }

    public final void W0() {
        int i8 = this.f38709s;
        this.f38708r = i8;
        this.f38698h = Q(this.f38692b, g0(i8));
    }

    public final void X(int i8, int i9, int i10) {
        int iI0 = I0(i8, this.f38696f);
        while (i10 < i9) {
            V0.b0(this.f38692b, g0(i10), iI0);
            int I8 = V0.I(this.f38692b, g0(i10)) + i10;
            X(i10, I8, i10 + 1);
            i10 = I8;
        }
    }

    public final Object X0(int i8, int i9) {
        int iZ0 = Z0(this.f38692b, g0(i8));
        int iQ = Q(this.f38692b, g0(i8 + 1));
        int i10 = i9 + iZ0;
        if (iZ0 > i10 || i10 >= iQ) {
            return InterfaceC3163l.f38803a.a();
        }
        return this.f38693c[R(i10)];
    }

    public final int Y() {
        return this.f38692b.length / 5;
    }

    public final Object Y0(C3147d c3147d, int i8) {
        return X0(G(c3147d), i8);
    }

    public final boolean Z() {
        return this.f38711u;
    }

    public final int Z0(int[] iArr, int i8) {
        return i8 >= Y() ? this.f38693c.length - this.f38701k : O(V0.V(iArr, i8), this.f38701k, this.f38693c.length);
    }

    public final int a0() {
        return this.f38708r;
    }

    public final P a1(int i8) {
        C3147d c3147dG1;
        HashMap map = this.f38695e;
        if (map == null || (c3147dG1 = g1(i8)) == null) {
            return null;
        }
        return (P) map.get(c3147dG1);
    }

    public final int b0() {
        return this.f38709s;
    }

    public final void b1(int i8, Object obj, Object obj2) {
        e1(i8, obj, false, obj2);
    }

    public final int c0() {
        return this.f38710t;
    }

    public final void c1() {
        if (!(this.f38703m == 0)) {
            AbstractC3169o.v("Key must be supplied when inserting");
            throw new C0920i();
        }
        InterfaceC3163l.a aVar = InterfaceC3163l.f38803a;
        e1(0, aVar.a(), false, aVar.a());
    }

    public final int d0() {
        return Y() - this.f38697g;
    }

    public final void d1(int i8, Object obj) {
        e1(i8, obj, false, InterfaceC3163l.f38803a.a());
    }

    public final T0 e0() {
        return this.f38691a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v2 */
    public final void e1(int i8, Object obj, boolean z8, Object obj2) {
        int I8;
        P pA1;
        int i9 = this.f38710t;
        Object[] objArr = this.f38703m > 0;
        this.f38707q.i(this.f38704n);
        if (objArr == true) {
            o0(1);
            int i10 = this.f38708r;
            int iG0 = g0(i10);
            InterfaceC3163l.a aVar = InterfaceC3163l.f38803a;
            ?? r10 = obj != aVar.a() ? 1 : 0;
            ?? r11 = (z8 || obj2 == aVar.a()) ? 0 : 1;
            V0.M(this.f38692b, iG0, i8, z8, r10, r11, this.f38710t, this.f38698h);
            this.f38699i = this.f38698h;
            int i11 = (z8 ? 1 : 0) + r10 + r11;
            if (i11 > 0) {
                p0(i11, i10);
                Object[] objArr2 = this.f38693c;
                int i12 = this.f38698h;
                if (z8) {
                    objArr2[i12] = obj2;
                    i12++;
                }
                if (r10 != 0) {
                    objArr2[i12] = obj;
                    i12++;
                }
                if (r11 != 0) {
                    objArr2[i12] = obj2;
                    i12++;
                }
                this.f38698h = i12;
            }
            this.f38704n = 0;
            I8 = i10 + 1;
            this.f38710t = i10;
            this.f38708r = I8;
            if (i9 >= 0 && (pA1 = a1(i9)) != null) {
                pA1.i(this, i10);
            }
        } else {
            this.f38705o.i(i9);
            Q0();
            int i13 = this.f38708r;
            int iG1 = g0(i13);
            if (!t.c(obj2, InterfaceC3163l.f38803a.a())) {
                if (z8) {
                    n1(obj2);
                } else {
                    j1(obj2);
                }
            }
            this.f38698h = Z0(this.f38692b, iG1);
            this.f38699i = Q(this.f38692b, g0(this.f38708r + 1));
            this.f38704n = V0.Q(this.f38692b, iG1);
            this.f38710t = i13;
            this.f38708r = i13 + 1;
            I8 = i13 + V0.I(this.f38692b, iG1);
        }
        this.f38709s = I8;
    }

    public final Object f0(int i8) {
        int iG0 = g0(i8);
        return V0.J(this.f38692b, iG0) ? this.f38693c[H(this.f38692b, iG0)] : InterfaceC3163l.f38803a.a();
    }

    public final void f1(int i8, Object obj) {
        e1(i8, obj, true, InterfaceC3163l.f38803a.a());
    }

    public final int g0(int i8) {
        return i8 < this.f38696f ? i8 : i8 + this.f38697g;
    }

    public final C3147d g1(int i8) {
        if (i8 < 0 || i8 >= d0()) {
            return null;
        }
        return V0.G(this.f38694d, i8, d0());
    }

    public final int h0(int i8) {
        return V0.O(this.f38692b, g0(i8));
    }

    public final Object h1(Object obj) {
        Object objU0 = U0();
        T0(obj);
        return objU0;
    }

    public final Object i0(int i8) {
        int iG0 = g0(i8);
        if (V0.L(this.f38692b, iG0)) {
            return this.f38693c[V0.S(this.f38692b, iG0)];
        }
        return null;
    }

    public final void i1(int i8, int i9) {
        C3147d c3147d;
        int iA;
        C3147d c3147d2;
        int iA2;
        int i10;
        int iY = Y() - this.f38697g;
        if (i8 >= i9) {
            for (int iP = V0.P(this.f38694d, i9, iY); iP < this.f38694d.size() && (iA = (c3147d = (C3147d) this.f38694d.get(iP)).a()) >= 0; iP++) {
                c3147d.c(-(iY - iA));
            }
            return;
        }
        for (int iP2 = V0.P(this.f38694d, i8, iY); iP2 < this.f38694d.size() && (iA2 = (c3147d2 = (C3147d) this.f38694d.get(iP2)).a()) < 0 && (i10 = iA2 + iY) < i9; iP2++) {
            c3147d2.c(i10);
        }
    }

    public final int j0(int i8) {
        return V0.I(this.f38692b, g0(i8));
    }

    public final void j1(Object obj) {
        int iG0 = g0(this.f38708r);
        if (V0.J(this.f38692b, iG0)) {
            this.f38693c[R(H(this.f38692b, iG0))] = obj;
        } else {
            AbstractC3169o.v("Updating the data of a group that was not created with a data slot");
            throw new C0920i();
        }
    }

    public final Iterator k0() {
        int iQ = Q(this.f38692b, g0(this.f38708r));
        int[] iArr = this.f38692b;
        int i8 = this.f38708r;
        return new b(iQ, Q(iArr, g0(i8 + j0(i8))), this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k1(int i8) {
        if (i8 >= 0) {
            C3189y0 c3189y0 = this.f38712v;
            if (c3189y0 == null) {
                c3189y0 = new C3189y0(null, 1, 0 == true ? 1 : 0);
                this.f38712v = c3189y0;
            }
            c3189y0.a(i8);
        }
    }

    public final boolean l0(int i8) {
        return m0(i8, this.f38708r);
    }

    public final void l1(int i8, C3189y0 c3189y0) {
        int iG0 = g0(i8);
        boolean zJ = J(i8);
        if (V0.D(this.f38692b, iG0) != zJ) {
            V0.W(this.f38692b, iG0, zJ);
            int iF0 = F0(i8);
            if (iF0 >= 0) {
                c3189y0.a(iF0);
            }
        }
    }

    public final boolean m0(int i8, int i9) {
        int iC;
        int iY;
        if (i9 == this.f38710t) {
            iY = this.f38709s;
        } else if (i9 <= this.f38705o.g(0) && (iC = this.f38705o.c(i9)) >= 0) {
            iY = (Y() - this.f38697g) - this.f38706p.f(iC);
        } else {
            int iJ0 = j0(i9);
            iY = iJ0 + i9;
        }
        return i8 > i9 && i8 < iY;
    }

    public final void m1(int[] iArr, int i8, int i9) {
        V0.X(iArr, i8, S(i9, this.f38700j, this.f38701k, this.f38693c.length));
    }

    public final boolean n0(int i8) {
        int i9 = this.f38710t;
        if (i8 <= i9 || i8 >= this.f38709s) {
            return i9 == 0 && i8 == 0;
        }
        return true;
    }

    public final void n1(Object obj) {
        p1(this.f38708r, obj);
    }

    public final void o0(int i8) {
        if (i8 > 0) {
            int i9 = this.f38708r;
            x0(i9);
            int i10 = this.f38696f;
            int i11 = this.f38697g;
            int[] iArr = this.f38692b;
            int length = iArr.length / 5;
            int i12 = length - i11;
            if (i11 < i8) {
                int iMax = Math.max(Math.max(length * 2, i12 + i8), 32);
                int[] iArr2 = new int[iMax * 5];
                int i13 = iMax - i12;
                C0933m.g(iArr, iArr2, 0, 0, i10 * 5);
                C0933m.g(iArr, iArr2, (i10 + i13) * 5, (i11 + i10) * 5, length * 5);
                this.f38692b = iArr2;
                i11 = i13;
            }
            int i14 = this.f38709s;
            if (i14 >= i10) {
                this.f38709s = i14 + i8;
            }
            int i15 = i10 + i8;
            this.f38696f = i15;
            this.f38697g = i11 - i8;
            int iS = S(i12 > 0 ? P(i9 + i8) : 0, this.f38702l >= i10 ? this.f38700j : 0, this.f38701k, this.f38693c.length);
            for (int i16 = i10; i16 < i15; i16++) {
                V0.X(this.f38692b, i16, iS);
            }
            int i17 = this.f38702l;
            if (i17 >= i10) {
                this.f38702l = i17 + i8;
            }
        }
    }

    public final void o1(C3147d c3147d, Object obj) {
        p1(c3147d.e(this), obj);
    }

    public final void p0(int i8, int i9) {
        if (i8 > 0) {
            z0(this.f38698h, i9);
            int i10 = this.f38700j;
            int i11 = this.f38701k;
            if (i11 < i8) {
                Object[] objArr = this.f38693c;
                int length = objArr.length;
                int i12 = length - i11;
                int iMax = Math.max(Math.max(length * 2, i12 + i8), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i13 = 0; i13 < iMax; i13++) {
                    objArr2[i13] = null;
                }
                int i14 = iMax - i12;
                C0933m.i(objArr, objArr2, 0, 0, i10);
                C0933m.i(objArr, objArr2, i10 + i14, i11 + i10, length);
                this.f38693c = objArr2;
                i11 = i14;
            }
            int i15 = this.f38699i;
            if (i15 >= i10) {
                this.f38699i = i15 + i8;
            }
            this.f38700j = i10 + i8;
            this.f38701k = i11 - i8;
        }
    }

    public final void p1(int i8, Object obj) {
        int iG0 = g0(i8);
        int[] iArr = this.f38692b;
        if (iG0 < iArr.length && V0.N(iArr, iG0)) {
            this.f38693c[R(E0(this.f38692b, iG0))] = obj;
            return;
        }
        AbstractC3169o.v(("Updating the node of a group at " + i8 + " that was not created with as a node group").toString());
        throw new C0920i();
    }

    public final boolean q0() {
        int i8 = this.f38708r;
        return i8 < this.f38709s && V0.N(this.f38692b, g0(i8));
    }

    public final boolean r0(int i8) {
        return V0.N(this.f38692b, g0(i8));
    }

    public final void s0(int i8) {
        int iG0 = g0(i8);
        if (V0.K(this.f38692b, iG0)) {
            return;
        }
        V0.Z(this.f38692b, iG0, true);
        if (V0.D(this.f38692b, iG0)) {
            return;
        }
        k1(F0(i8));
    }

    public final void u0(int i8, int i9, int i10) {
        C3147d c3147d;
        int iG;
        int i11 = i10 + i8;
        int iD0 = d0();
        int iP = V0.P(this.f38694d, i8, iD0);
        ArrayList arrayList = new ArrayList();
        if (iP >= 0) {
            while (iP < this.f38694d.size() && (iG = G((c3147d = (C3147d) this.f38694d.get(iP)))) >= i8 && iG < i11) {
                arrayList.add(c3147d);
                this.f38694d.remove(iP);
            }
        }
        int i12 = i9 - i8;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            C3147d c3147d2 = (C3147d) arrayList.get(i13);
            int iG2 = G(c3147d2) + i12;
            if (iG2 >= this.f38696f) {
                c3147d2.c(-(iD0 - iG2));
            } else {
                c3147d2.c(iG2);
            }
            this.f38694d.add(V0.P(this.f38694d, iG2, iD0), c3147d2);
        }
    }

    public final List v0(T0 t8, int i8, boolean z8) {
        AbstractC3169o.U(this.f38703m > 0);
        if (i8 != 0 || this.f38708r != 0 || this.f38691a.A() != 0 || V0.I(t8.y(), i8) != t8.A()) {
            W0 w0K = t8.K();
            try {
                return f38689w.b(w0K, i8, this, true, true, z8);
            } finally {
                w0K.L();
            }
        }
        int[] iArr = this.f38692b;
        Object[] objArr = this.f38693c;
        ArrayList arrayList = this.f38694d;
        HashMap map = this.f38695e;
        int[] iArrY = t8.y();
        int iA = t8.A();
        Object[] objArrD = t8.D();
        int iE = t8.E();
        HashMap mapF = t8.F();
        this.f38692b = iArrY;
        this.f38693c = objArrD;
        this.f38694d = t8.u();
        this.f38696f = iA;
        this.f38697g = (iArrY.length / 5) - iA;
        this.f38700j = iE;
        this.f38701k = objArrD.length - iE;
        this.f38702l = iA;
        this.f38695e = mapF;
        t8.M(iArr, 0, objArr, 0, arrayList, map);
        return this.f38694d;
    }

    public final void w0(int i8) {
        boolean z8 = true;
        if (!(this.f38703m == 0)) {
            AbstractC3169o.v("Cannot move a group while inserting");
            throw new C0920i();
        }
        if (!(i8 >= 0)) {
            AbstractC3169o.v("Parameter offset is out of bounds");
            throw new C0920i();
        }
        if (i8 == 0) {
            return;
        }
        int i9 = this.f38708r;
        int i10 = this.f38710t;
        int i11 = this.f38709s;
        int I8 = i9;
        for (int i12 = i8; i12 > 0; i12--) {
            I8 += V0.I(this.f38692b, g0(I8));
            if (!(I8 <= i11)) {
                AbstractC3169o.v("Parameter offset is out of bounds");
                throw new C0920i();
            }
        }
        int I9 = V0.I(this.f38692b, g0(I8));
        int i13 = this.f38698h;
        int iQ = Q(this.f38692b, g0(I8));
        int i14 = I8 + I9;
        int iQ2 = Q(this.f38692b, g0(i14));
        int i15 = iQ2 - iQ;
        p0(i15, Math.max(this.f38708r - 1, 0));
        o0(I9);
        int[] iArr = this.f38692b;
        int iG0 = g0(i14) * 5;
        C0933m.g(iArr, iArr, g0(i9) * 5, iG0, (I9 * 5) + iG0);
        if (i15 > 0) {
            Object[] objArr = this.f38693c;
            C0933m.i(objArr, objArr, i13, R(iQ + i15), R(iQ2 + i15));
        }
        int i16 = iQ + i15;
        int i17 = i16 - i13;
        int i18 = this.f38700j;
        int i19 = this.f38701k;
        int length = this.f38693c.length;
        int i20 = this.f38702l;
        int i21 = i9 + I9;
        int i22 = i9;
        while (i22 < i21) {
            boolean z9 = z8;
            int iG1 = g0(i22);
            int i23 = i22;
            int i24 = i17;
            m1(iArr, iG1, S(Q(iArr, iG1) - i17, i20 < iG1 ? 0 : i18, i19, length));
            i22 = i23 + 1;
            z8 = z9;
            i17 = i24;
        }
        u0(i14, i9, I9);
        if (M0(i14, I9)) {
            AbstractC3169o.v("Unexpectedly removed anchors");
            throw new C0920i();
        }
        X(i10, this.f38709s, i9);
        if (i15 > 0) {
            N0(i16, i15, i14 - 1);
        }
    }

    public final void x0(int i8) {
        int i9 = this.f38697g;
        int i10 = this.f38696f;
        if (i10 != i8) {
            if (!this.f38694d.isEmpty()) {
                i1(i10, i8);
            }
            if (i9 > 0) {
                int[] iArr = this.f38692b;
                int i11 = i8 * 5;
                int i12 = i9 * 5;
                int i13 = i10 * 5;
                if (i8 < i10) {
                    C0933m.g(iArr, iArr, i12 + i11, i11, i13);
                } else {
                    C0933m.g(iArr, iArr, i13, i13 + i12, i11 + i12);
                }
            }
            if (i8 < i10) {
                i10 = i8 + i9;
            }
            int iY = Y();
            AbstractC3169o.U(i10 < iY);
            while (i10 < iY) {
                int iT = V0.T(this.f38692b, i10);
                int iI0 = I0(H0(iT), i8);
                if (iI0 != iT) {
                    V0.b0(this.f38692b, i10, iI0);
                }
                i10++;
                if (i10 == i8) {
                    i10 += i9;
                }
            }
        }
        this.f38696f = i8;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000f  */
    public final List y0(int i8, T0 t8, int i9) throws Throwable {
        boolean z8;
        if (this.f38703m <= 0) {
            z8 = j0(this.f38708r + i8) == 1;
        }
        AbstractC3169o.U(z8);
        int i10 = this.f38708r;
        int i11 = this.f38698h;
        int i12 = this.f38699i;
        E(i8);
        c1();
        I();
        W0 w0K = t8.K();
        try {
            try {
                List listC = a.c(f38689w, w0K, i9, this, false, true, false, 32, null);
                w0K.L();
                U();
                T();
                this.f38708r = i10;
                this.f38698h = i11;
                this.f38699i = i12;
                return listC;
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                w0K.L();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void z0(int i8, int i9) {
        int i10 = this.f38701k;
        int i11 = this.f38700j;
        int i12 = this.f38702l;
        if (i11 != i8) {
            Object[] objArr = this.f38693c;
            if (i8 < i11) {
                C0933m.i(objArr, objArr, i8 + i10, i8, i11);
            } else {
                C0933m.i(objArr, objArr, i11, i11 + i10, i8 + i10);
            }
        }
        int iMin = Math.min(i9 + 1, d0());
        if (i12 != iMin) {
            int length = this.f38693c.length - i10;
            if (iMin < i12) {
                int iG0 = g0(iMin);
                int iG1 = g0(i12);
                int i13 = this.f38696f;
                while (iG0 < iG1) {
                    int iF = V0.F(this.f38692b, iG0);
                    if (!(iF >= 0)) {
                        AbstractC3169o.v("Unexpected anchor value, expected a positive anchor");
                        throw new C0920i();
                    }
                    V0.X(this.f38692b, iG0, -((length - iF) + 1));
                    iG0++;
                    if (iG0 == i13) {
                        iG0 += this.f38697g;
                    }
                }
            } else {
                int iG2 = g0(i12);
                int iG3 = g0(iMin);
                while (iG2 < iG3) {
                    int iF2 = V0.F(this.f38692b, iG2);
                    if (!(iF2 < 0)) {
                        AbstractC3169o.v("Unexpected anchor value, expected a negative anchor");
                        throw new C0920i();
                    }
                    V0.X(this.f38692b, iG2, iF2 + length + 1);
                    iG2++;
                    if (iG2 == this.f38696f) {
                        iG2 += this.f38697g;
                    }
                }
            }
            this.f38702l = iMin;
        }
        this.f38700j = i8;
    }

    public String toString() {
        return GOKsbdzhLhXAMt.SmNKVbkNSAms + this.f38708r + " end=" + this.f38709s + " size = " + d0() + " gap=" + this.f38696f + '-' + (this.f38696f + this.f38697g) + ')';
    }
}
