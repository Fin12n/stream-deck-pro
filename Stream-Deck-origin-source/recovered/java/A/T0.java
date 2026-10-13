package A;

import H.AbstractC0994n0;
import H.InterfaceC0984i0;
import H.InterfaceC1015y0;
import H.InterfaceC1017z0;
import H.c1;
import H.g1;
import H.u1;
import H.v1;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class T0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u1 f177e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public u1 f178f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Set f179g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public u1 f180h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g1 f181i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public u1 f182j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Rect f183k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public H.J f185m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public H.J f186n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f187o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f173a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f174b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f175c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f176d = b.INACTIVE;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Matrix f184l = new Matrix();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public c1 f188p = c1.b();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public c1 f189q = c1.b();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f190a;

        static {
            int[] iArr = new int[E.e.b.values().length];
            f190a = iArr;
            try {
                iArr[E.e.b.OFF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f190a[E.e.b.ON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f190a[E.e.b.PREVIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum b {
        ACTIVE,
        INACTIVE
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface c {
        void d(T0 t8);

        void f(T0 t8);

        void i(T0 t8);

        void j(T0 t8);
    }

    public T0(u1 u1Var) {
        this.f178f = u1Var;
        this.f180h = u1Var;
    }

    public Set A(H.I i8) {
        return null;
    }

    public Set B() {
        return Collections.EMPTY_SET;
    }

    public int C() {
        return ((InterfaceC1017z0) this.f180h).d0(0);
    }

    public abstract u1.b D(InterfaceC0984i0 interfaceC0984i0);

    public Rect E() {
        return this.f183k;
    }

    public boolean F(int i8) {
        Iterator it = B().iterator();
        while (it.hasNext()) {
            if (Q.X.b(i8, ((Integer) it.next()).intValue())) {
                return true;
            }
        }
        return false;
    }

    public boolean G(H.J j8) {
        int iQ = q();
        if (iQ == -1 || iQ == 0) {
            return false;
        }
        if (iQ == 1) {
            return true;
        }
        if (iQ == 2) {
            return j8.e();
        }
        throw new AssertionError("Unknown mirrorMode: " + iQ);
    }

    public u1 H(H.I i8, u1 u1Var, u1 u1Var2) {
        H.O0 o0I0;
        if (u1Var2 != null) {
            o0I0 = H.O0.j0(u1Var2);
            o0I0.k0(L.q.f4794M);
        } else {
            o0I0 = H.O0.i0();
        }
        if (this.f178f.e(InterfaceC1017z0.f3286m) || this.f178f.e(InterfaceC1017z0.f3290q)) {
            InterfaceC0984i0.a aVar = InterfaceC1017z0.f3294u;
            if (o0I0.e(aVar)) {
                o0I0.k0(aVar);
            }
        }
        u1 u1Var3 = this.f178f;
        InterfaceC0984i0.a aVar2 = InterfaceC1017z0.f3294u;
        if (u1Var3.e(aVar2)) {
            InterfaceC0984i0.a aVar3 = InterfaceC1017z0.f3292s;
            if (o0I0.e(aVar3) && ((T.c) this.f178f.h(aVar2)).d() != null) {
                o0I0.k0(aVar3);
            }
        }
        Iterator it = this.f178f.c().iterator();
        while (it.hasNext()) {
            InterfaceC0984i0.v(o0I0, o0I0, this.f178f, (InterfaceC0984i0.a) it.next());
        }
        if (u1Var != null) {
            for (InterfaceC0984i0.a aVar4 : u1Var.c()) {
                if (!aVar4.c().equals(L.q.f4794M.c())) {
                    InterfaceC0984i0.v(o0I0, o0I0, u1Var, aVar4);
                }
            }
        }
        if (o0I0.e(InterfaceC1017z0.f3290q)) {
            InterfaceC0984i0.a aVar5 = InterfaceC1017z0.f3286m;
            if (o0I0.e(aVar5)) {
                o0I0.k0(aVar5);
            }
        }
        InterfaceC0984i0.a aVar6 = InterfaceC1017z0.f3294u;
        if (o0I0.e(aVar6) && ((T.c) o0I0.h(aVar6)).a() != 0) {
            o0I0.L(u1.f3220E, Boolean.TRUE);
        }
        c(o0I0);
        return O(i8, D(o0I0));
    }

    public final void I() {
        this.f176d = b.ACTIVE;
        L();
    }

    public final void J() {
        this.f176d = b.INACTIVE;
        L();
    }

    public final void K() {
        Iterator it = this.f174b.iterator();
        while (it.hasNext()) {
            ((c) it.next()).f(this);
        }
    }

    public final void L() {
        int iOrdinal = this.f176d.ordinal();
        if (iOrdinal == 0) {
            Iterator it = this.f174b.iterator();
            while (it.hasNext()) {
                ((c) it.next()).j(this);
            }
        } else {
            if (iOrdinal != 1) {
                return;
            }
            Iterator it2 = this.f174b.iterator();
            while (it2.hasNext()) {
                ((c) it2.next()).d(this);
            }
        }
    }

    public abstract u1 O(H.I i8, u1.b bVar);

    public void P() {
        this.f173a = true;
    }

    public void Q() {
        this.f173a = false;
    }

    public abstract g1 R(InterfaceC0984i0 interfaceC0984i0);

    public abstract g1 S(g1 g1Var, g1 g1Var2);

    public final void U(c cVar) {
        this.f174b.remove(cVar);
    }

    public void V(AbstractC0885n abstractC0885n) {
        T1.f.a(true);
    }

    public void W(Set set) {
        this.f179g = set != null ? new HashSet(set) : null;
    }

    public void X(Matrix matrix) {
        this.f184l = new Matrix(matrix);
    }

    public void Y(Rect rect) {
        this.f183k = rect;
    }

    public final void Z(H.J j8) {
        T();
        synchronized (this.f175c) {
            try {
                H.J j9 = this.f185m;
                if (j8 == j9) {
                    U(j9);
                    this.f185m = null;
                }
                H.J j10 = this.f186n;
                if (j8 == j10) {
                    U(j10);
                    this.f186n = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f181i = null;
        this.f183k = null;
        this.f180h = this.f178f;
        this.f177e = null;
        this.f182j = null;
    }

    public final void a(c cVar) {
        this.f174b.add(cVar);
    }

    public void a0(List list) {
        if (list.isEmpty()) {
            return;
        }
        this.f188p = (c1) list.get(0);
        if (list.size() > 1) {
            this.f189q = (c1) list.get(1);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (AbstractC0994n0 abstractC0994n0 : ((c1) it.next()).o()) {
                if (abstractC0994n0.g() == null) {
                    abstractC0994n0.p(getClass());
                }
            }
        }
    }

    public void b(c1.b bVar, g1 g1Var) {
        if (!g1.f3033a.equals(g1Var.c())) {
            bVar.s(g1Var.c());
            return;
        }
        synchronized (this.f175c) {
            try {
                List listC = ((H.J) T1.f.g(this.f185m)).r().o().c(AeFpsRangeQuirk.class);
                boolean z8 = true;
                if (listC.size() > 1) {
                    z8 = false;
                }
                T1.f.b(z8, "There should not have more than one AeFpsRangeQuirk.");
                if (!listC.isEmpty()) {
                    bVar.s(((AeFpsRangeQuirk) listC.get(0)).a());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b0(g1 g1Var, g1 g1Var2) {
        this.f181i = S(g1Var, g1Var2);
    }

    public final void c(H.O0 o8) {
        AbstractC0890p0.a("UseCase", "applyFeaturesToConfig: mFeatureGroup = " + this.f179g + ", this = " + this);
        Set<C.b> set = this.f179g;
        if (set == null) {
            return;
        }
        J jF = E.a.f1961j;
        Range range = g1.f3033a;
        E.e.b bVarF = E.e.f1979j;
        for (C.b bVar : set) {
            if (bVar instanceof E.a) {
                jF = ((E.a) bVar).f();
            } else if (bVar instanceof E.c) {
                E.c cVar = (E.c) bVar;
                range = new Range(Integer.valueOf(cVar.g()), Integer.valueOf(cVar.f()));
            } else if (bVar instanceof E.e) {
                bVarF = ((E.e) bVar).f();
            }
        }
        if ((this instanceof C0903w0) || L.f.d0(this)) {
            o8.L(InterfaceC1015y0.f3285l, jF);
        }
        o8.L(u1.f3218C, range);
        int i8 = a.f190a[bVarF.ordinal()];
        if (i8 == 1) {
            o8.L(u1.f3223H, 1);
            o8.L(u1.f3224I, 1);
        } else if (i8 == 2) {
            o8.L(u1.f3223H, 0);
            o8.L(u1.f3224I, 2);
        } else {
            if (i8 != 3) {
                return;
            }
            o8.L(u1.f3223H, 2);
            o8.L(u1.f3224I, 0);
        }
    }

    public void c0(InterfaceC0984i0 interfaceC0984i0) {
        this.f181i = R(interfaceC0984i0);
    }

    public final void d(H.J j8, H.J j9, u1 u1Var, u1 u1Var2) {
        synchronized (this.f175c) {
            try {
                this.f185m = j8;
                this.f186n = j9;
                a(j8);
                if (j9 != null) {
                    a(j9);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f177e = u1Var;
        this.f182j = u1Var2;
        this.f180h = H(j8.r(), this.f177e, this.f182j);
        M();
    }

    public u1 e() {
        return this.f178f;
    }

    public int f() {
        return ((InterfaceC1017z0) this.f180h).E(-1);
    }

    public g1 g() {
        return this.f181i;
    }

    public Size h() {
        g1 g1Var = this.f181i;
        if (g1Var != null) {
            return g1Var.f();
        }
        return null;
    }

    public H.J i() {
        H.J j8;
        synchronized (this.f175c) {
            j8 = this.f185m;
        }
        return j8;
    }

    public H.F j() {
        synchronized (this.f175c) {
            try {
                H.J j8 = this.f185m;
                if (j8 == null) {
                    return H.F.f2841a;
                }
                return j8.g();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String k() {
        return ((H.J) T1.f.h(i(), "No camera attached to use case: " + this)).r().e();
    }

    public u1 l() {
        return this.f180h;
    }

    public abstract u1 m(boolean z8, v1 v1Var);

    public AbstractC0885n n() {
        return null;
    }

    public Set o() {
        return this.f179g;
    }

    public int p() {
        return this.f180h.u();
    }

    public int q() {
        return ((InterfaceC1017z0) this.f180h).e0(-1);
    }

    public String r() {
        String strF = this.f180h.F("<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(strF);
        return strF;
    }

    public String s() {
        return this.f187o;
    }

    public int t(H.J j8) {
        return u(j8, false);
    }

    public int u(H.J j8, boolean z8) {
        int iL = j8.r().l(C());
        return (j8.p() || !z8) ? iL : I.x.u(-iL);
    }

    public H.J v() {
        H.J j8;
        synchronized (this.f175c) {
            j8 = this.f186n;
        }
        return j8;
    }

    public String w() {
        if (v() == null) {
            return null;
        }
        return v().r().e();
    }

    public c1 x() {
        return this.f189q;
    }

    public Matrix y() {
        return this.f184l;
    }

    public c1 z() {
        return this.f188p;
    }

    public void M() {
    }

    public void N() {
    }

    public void T() {
    }
}
