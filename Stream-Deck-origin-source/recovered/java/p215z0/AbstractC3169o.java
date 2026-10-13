package p215z0;

import B0.b;
import C6.C0920i;
import C6.G;
import D6.z;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.t;
import p116m7.kKPq.toqHM;

/* JADX INFO: renamed from: z0.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3169o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f38881a = new C3170o0("provider");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f38882b = new C3170o0("provider");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f38883c = new C3170o0("compositionLocalMap");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f38884d = new C3170o0("providerValues");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f38885e = new C3170o0("providers");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f38886f = new C3170o0("reference");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Comparator f38887g = new Comparator() { // from class: z0.n
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC3169o.b((T) obj, (T) obj2);
        }
    };

    public static final int A(List list, int i8) {
        int size = list.size() - 1;
        int i9 = 0;
        while (i9 <= size) {
            int i10 = (i9 + size) >>> 1;
            int iH = t.h(((T) list.get(i10)).b(), i8);
            if (iH < 0) {
                i9 = i10 + 1;
            } else {
                if (iH <= 0) {
                    return i10;
                }
                size = i10 - 1;
            }
        }
        return -(i9 + 1);
    }

    public static final T B(List list, int i8, int i9) {
        int iZ = z(list, i8);
        if (iZ >= list.size()) {
            return null;
        }
        T t8 = (T) list.get(iZ);
        if (t8.b() < i9) {
            return t8;
        }
        return null;
    }

    public static final Object C() {
        return f38883c;
    }

    public static final Object D() {
        return f38881a;
    }

    public static final Object E(W w8) {
        return w8.d() != null ? new V(Integer.valueOf(w8.a()), w8.d()) : Integer.valueOf(w8.a());
    }

    public static final Object F(Object obj, Object obj2, Object obj3) {
        V v8 = obj instanceof V ? (V) obj : null;
        if (v8 == null) {
            return null;
        }
        if (t.c(v8.a(), obj2) && t.c(v8.b(), obj3)) {
            return obj;
        }
        Object objF = F(v8.a(), obj2, obj3);
        return objF == null ? F(v8.b(), obj2, obj3) : objF;
    }

    public static final Object G() {
        return f38882b;
    }

    public static final Object H() {
        return f38885e;
    }

    public static final Object I() {
        return f38886f;
    }

    public static final void J(List list, int i8, E0 e8, Object obj) {
        int iA = A(list, i8);
        b bVar = null;
        if (iA < 0) {
            int i9 = -(iA + 1);
            if (obj != null) {
                bVar = new b();
                bVar.add(obj);
            }
            list.add(i9, new T(e8, i8, bVar));
            return;
        }
        if (obj == null) {
            ((T) list.get(iA)).e(null);
            return;
        }
        b bVarA = ((T) list.get(iA)).a();
        if (bVarA != null) {
            bVarA.add(obj);
        }
    }

    public static final boolean K() {
        return false;
    }

    public static final HashMap L() {
        return new HashMap();
    }

    public static final int M(S0 s8, int i8, int i9, int i10) {
        if (i8 != i9) {
            if (i8 == i10 || i9 == i10) {
                return i10;
            }
            if (s8.M(i8) == i9) {
                return i9;
            }
            if (s8.M(i9) != i8) {
                if (s8.M(i8) == s8.M(i9)) {
                    return s8.M(i8);
                }
                int iX = x(s8, i8, i10);
                int iX2 = x(s8, i9, i10);
                int i11 = iX - iX2;
                for (int i12 = 0; i12 < i11; i12++) {
                    i8 = s8.M(i8);
                }
                int i13 = iX2 - iX;
                for (int i14 = 0; i14 < i13; i14++) {
                    i9 = s8.M(i9);
                }
                while (i8 != i9) {
                    i8 = s8.M(i8);
                    i9 = s8.M(i9);
                }
                return i8;
            }
        }
        return i8;
    }

    public static final Object N(HashMap map, Object obj) {
        Object objJ0;
        LinkedHashSet linkedHashSet = (LinkedHashSet) map.get(obj);
        if (linkedHashSet == null || (objJ0 = z.j0(linkedHashSet)) == null) {
            return null;
        }
        P(map, obj, objJ0);
        return objJ0;
    }

    public static final boolean O(HashMap map, Object obj, Object obj2) {
        Object linkedHashSet = map.get(obj);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet();
            map.put(obj, linkedHashSet);
        }
        return ((LinkedHashSet) linkedHashSet).add(obj2);
    }

    public static final G P(HashMap map, Object obj, Object obj2) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) map.get(obj);
        if (linkedHashSet == null) {
            return null;
        }
        linkedHashSet.remove(obj2);
        if (linkedHashSet.isEmpty()) {
            map.remove(obj);
        }
        return G.f1419a;
    }

    public static final void Q(W0 w8, K0 k8) {
        Iterator itK0 = w8.k0();
        while (itK0.hasNext()) {
            Object next = itK0.next();
            if (next instanceof InterfaceC3159j) {
                k8.c((InterfaceC3159j) next);
            }
            if (next instanceof M0) {
                k8.d(((M0) next).a());
            }
            if (next instanceof E0) {
                ((E0) next).x();
            }
        }
        w8.L0();
    }

    public static final void R(W0 w8, int i8, int i9, Object obj) {
        if (obj == w8.R0(i8, i9, InterfaceC3163l.f38803a.a())) {
            return;
        }
        v("Slot table is out of sync");
        throw new C0920i();
    }

    public static final T S(List list, int i8) {
        int iA = A(list, i8);
        if (iA >= 0) {
            return (T) list.remove(iA);
        }
        return null;
    }

    public static final void T(List list, int i8, int i9) {
        int iZ = z(list, i8);
        while (iZ < list.size() && ((T) list.get(iZ)).b() < i9) {
            list.remove(iZ);
        }
    }

    public static final void V() {
    }

    public static final void W(int i8, int i9, int i10, String str) {
    }

    public static final int b(T t8, T t9) {
        return t.h(t8.b(), t9.b());
    }

    public static final boolean r(int i8) {
        return i8 != 0;
    }

    public static final int s(boolean z8) {
        return z8 ? 1 : 0;
    }

    public static final List t(T0 t8, C3147d c3147d) {
        ArrayList arrayList = new ArrayList();
        S0 s0J = t8.J();
        try {
            u(s0J, arrayList, t8.m(c3147d));
            G g8 = G.f1419a;
            return arrayList;
        } finally {
            s0J.d();
        }
    }

    public static final void u(S0 s8, List list, int i8) {
        if (s8.G(i8)) {
            list.add(s8.I(i8));
            return;
        }
        int iB = i8 + 1;
        int iB2 = i8 + s8.B(i8);
        while (iB < iB2) {
            u(s8, list, iB);
            iB += s8.B(iB);
        }
    }

    public static final Void v(String str) {
        throw new C3161k("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final void w(W0 w8, K0 k8) {
        int iA0 = w8.a0();
        int iB0 = w8.b0();
        while (iA0 < iB0) {
            Object objB0 = w8.B0(iA0);
            if (objB0 instanceof InterfaceC3159j) {
                k8.b((InterfaceC3159j) objB0);
            }
            int iZ0 = w8.Z0(w8.f38692b, w8.g0(iA0));
            int i8 = iA0 + 1;
            int iQ = w8.Q(w8.f38692b, w8.g0(i8));
            for (int i9 = iZ0; i9 < iQ; i9++) {
                int i10 = i9 - iZ0;
                Object obj = w8.f38693c[w8.R(i9)];
                if (obj instanceof M0) {
                    L0 l0A = ((M0) obj).a();
                    if (!(l0A instanceof O0)) {
                        R(w8, iA0, i10, obj);
                        k8.d(l0A);
                    }
                } else if (obj instanceof E0) {
                    R(w8, iA0, i10, obj);
                    ((E0) obj).x();
                }
            }
            iA0 = i8;
        }
    }

    public static final int x(S0 s8, int i8, int i9) {
        int i10 = 0;
        while (i8 > 0 && i8 != i9) {
            i8 = s8.M(i8);
            i10++;
        }
        return i10;
    }

    public static final List y(List list, int i8, int i9) {
        ArrayList arrayList = new ArrayList();
        for (int iZ = z(list, i8); iZ < list.size(); iZ++) {
            T t8 = (T) list.get(iZ);
            if (t8.b() >= i9) {
                break;
            }
            arrayList.add(t8);
        }
        return arrayList;
    }

    public static final int z(List list, int i8) {
        int iA = A(list, i8);
        return iA < 0 ? -(iA + 1) : iA;
    }

    public static final void U(boolean z8) {
        if (z8) {
            return;
        }
        v(toqHM.HqxGGXOCVpEWy);
        throw new C0920i();
    }
}
