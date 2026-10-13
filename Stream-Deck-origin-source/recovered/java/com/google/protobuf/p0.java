package com.google.protobuf;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f19368a = B();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v0 f19369b = C();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v0 f19370c = new x0();

    public static Object A(Object obj, int i8, List list, A.e eVar, Object obj2, v0 v0Var) {
        if (eVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!eVar.isInRange(iIntValue)) {
                    obj2 = J(obj, i8, iIntValue, obj2, v0Var);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Integer num = (Integer) list.get(i10);
            int iIntValue2 = num.intValue();
            if (eVar.isInRange(iIntValue2)) {
                if (i10 != i9) {
                    list.set(i9, num);
                }
                i9++;
            } else {
                obj2 = J(obj, i8, iIntValue2, obj2, v0Var);
            }
        }
        if (i9 != size) {
            list.subList(i9, size).clear();
        }
        return obj2;
    }

    public static Class B() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static v0 C() {
        try {
            Class clsD = D();
            if (clsD == null) {
                return null;
            }
            return (v0) clsD.getConstructor(null).newInstance(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class D() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void E(r rVar, Object obj, Object obj2) {
        C2110v c2110vC = rVar.c(obj2);
        if (c2110vC.q()) {
            return;
        }
        rVar.d(obj).y(c2110vC);
    }

    public static void F(N n8, Object obj, Object obj2, long j8) {
        z0.V(obj, j8, n8.a(z0.G(obj, j8), z0.G(obj2, j8)));
    }

    public static void G(v0 v0Var, Object obj, Object obj2) {
        v0Var.p(obj, v0Var.k(v0Var.g(obj), v0Var.g(obj2)));
    }

    public static void H(Class cls) {
        Class cls2;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = f19368a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    public static boolean I(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static Object J(Object obj, int i8, int i9, Object obj2, v0 v0Var) {
        if (obj2 == null) {
            obj2 = v0Var.f(obj);
        }
        v0Var.e(obj2, i8, i9);
        return obj2;
    }

    public static v0 K() {
        return f19369b;
    }

    public static v0 L() {
        return f19370c;
    }

    public static void M(int i8, List list, D0 d8, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        d8.B(i8, list, z8);
    }

    public static void N(int i8, List list, D0 d8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        d8.O(i8, list);
    }

    public static void O(int i8, List list, D0 d8, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        d8.M(i8, list, z8);
    }

    public static void P(int i8, List list, D0 d8, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        d8.L(i8, list, z8);
    }

    public static void Q(int i8, List list, D0 d8, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        d8.A(i8, list, z8);
    }

    public static void R(int i8, List list, D0 d8, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        d8.x(i8, list, z8);
    }

    public static void S(int i8, List list, D0 d8, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        d8.c(i8, list, z8);
    }

    public static void T(int i8, List list, D0 d8, n0 n0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        d8.b(i8, list, n0Var);
    }

    public static void U(int i8, List list, D0 d8, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        d8.p(i8, list, z8);
    }

    public static void V(int i8, List list, D0 d8, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        d8.K(i8, list, z8);
    }

    public static void W(int i8, List list, D0 d8, n0 n0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        d8.a(i8, list, n0Var);
    }

    public static void X(int i8, List list, D0 d8, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        d8.y(i8, list, z8);
    }

    public static void Y(int i8, List list, D0 d8, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        d8.h(i8, list, z8);
    }

    public static void Z(int i8, List list, D0 d8, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        d8.I(i8, list, z8);
    }

    public static int a(int i8, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z8 ? AbstractC2100k.V(i8) + AbstractC2100k.D(size) : size * AbstractC2100k.e(i8, true);
    }

    public static void a0(int i8, List list, D0 d8, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        d8.E(i8, list, z8);
    }

    public static int b(List list) {
        return list.size();
    }

    public static void b0(int i8, List list, D0 d8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        d8.m(i8, list);
    }

    public static int c(int i8, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iV = size * AbstractC2100k.V(i8);
        for (int i9 = 0; i9 < list.size(); i9++) {
            iV += AbstractC2100k.i((AbstractC2097h) list.get(i9));
        }
        return iV;
    }

    public static void c0(int i8, List list, D0 d8, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        d8.D(i8, list, z8);
    }

    public static int d(int i8, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE = e(list);
        return z8 ? AbstractC2100k.V(i8) + AbstractC2100k.D(iE) : iE + (size * AbstractC2100k.V(i8));
    }

    public static void d0(int i8, List list, D0 d8, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        d8.i(i8, list, z8);
    }

    public static int e(List list) {
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C2114z)) {
            int iM = 0;
            while (i8 < size) {
                iM += AbstractC2100k.m(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return iM;
        }
        C2114z c2114z = (C2114z) list;
        int iM2 = 0;
        while (i8 < size) {
            iM2 += AbstractC2100k.m(c2114z.getInt(i8));
            i8++;
        }
        return iM2;
    }

    public static int f(int i8, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z8 ? AbstractC2100k.V(i8) + AbstractC2100k.D(size * 4) : size * AbstractC2100k.n(i8, 0);
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i8, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z8 ? AbstractC2100k.V(i8) + AbstractC2100k.D(size * 8) : size * AbstractC2100k.p(i8, 0L);
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i8, List list, n0 n0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = 0;
        for (int i9 = 0; i9 < size; i9++) {
            iT += AbstractC2100k.t(i8, (T) list.get(i9), n0Var);
        }
        return iT;
    }

    public static int k(int i8, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iL = l(list);
        return z8 ? AbstractC2100k.V(i8) + AbstractC2100k.D(iL) : iL + (size * AbstractC2100k.V(i8));
    }

    public static int l(List list) {
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C2114z)) {
            int iX = 0;
            while (i8 < size) {
                iX += AbstractC2100k.x(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return iX;
        }
        C2114z c2114z = (C2114z) list;
        int iX2 = 0;
        while (i8 < size) {
            iX2 += AbstractC2100k.x(c2114z.getInt(i8));
            i8++;
        }
        return iX2;
    }

    public static int m(int i8, List list, boolean z8) {
        if (list.size() == 0) {
            return 0;
        }
        int iN = n(list);
        return z8 ? AbstractC2100k.V(i8) + AbstractC2100k.D(iN) : iN + (list.size() * AbstractC2100k.V(i8));
    }

    public static int n(List list) {
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof J)) {
            int iZ = 0;
            while (i8 < size) {
                iZ += AbstractC2100k.z(((Long) list.get(i8)).longValue());
                i8++;
            }
            return iZ;
        }
        J j8 = (J) list;
        int iZ2 = 0;
        while (i8 < size) {
            iZ2 += AbstractC2100k.z(j8.A(i8));
            i8++;
        }
        return iZ2;
    }

    public static int o(int i8, Object obj, n0 n0Var) {
        return obj instanceof F ? AbstractC2100k.B(i8, (F) obj) : AbstractC2100k.G(i8, (T) obj, n0Var);
    }

    public static int p(int i8, List list, n0 n0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iV = AbstractC2100k.V(i8) * size;
        for (int i9 = 0; i9 < size; i9++) {
            Object obj = list.get(i9);
            iV += obj instanceof F ? AbstractC2100k.C((F) obj) : AbstractC2100k.I((T) obj, n0Var);
        }
        return iV;
    }

    public static int q(int i8, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = r(list);
        return z8 ? AbstractC2100k.V(i8) + AbstractC2100k.D(iR) : iR + (size * AbstractC2100k.V(i8));
    }

    public static int r(List list) {
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C2114z)) {
            int iQ = 0;
            while (i8 < size) {
                iQ += AbstractC2100k.Q(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return iQ;
        }
        C2114z c2114z = (C2114z) list;
        int iQ2 = 0;
        while (i8 < size) {
            iQ2 += AbstractC2100k.Q(c2114z.getInt(i8));
            i8++;
        }
        return iQ2;
    }

    public static int s(int i8, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = t(list);
        return z8 ? AbstractC2100k.V(i8) + AbstractC2100k.D(iT) : iT + (size * AbstractC2100k.V(i8));
    }

    public static int t(List list) {
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof J)) {
            int iS = 0;
            while (i8 < size) {
                iS += AbstractC2100k.S(((Long) list.get(i8)).longValue());
                i8++;
            }
            return iS;
        }
        J j8 = (J) list;
        int iS2 = 0;
        while (i8 < size) {
            iS2 += AbstractC2100k.S(j8.A(i8));
            i8++;
        }
        return iS2;
    }

    public static int u(int i8, List list) {
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        int iV = AbstractC2100k.V(i8) * size;
        if (!(list instanceof H)) {
            while (i9 < size) {
                Object obj = list.get(i9);
                iV += obj instanceof AbstractC2097h ? AbstractC2100k.i((AbstractC2097h) obj) : AbstractC2100k.U((String) obj);
                i9++;
            }
            return iV;
        }
        H h8 = (H) list;
        while (i9 < size) {
            Object objX = h8.x(i9);
            iV += objX instanceof AbstractC2097h ? AbstractC2100k.i((AbstractC2097h) objX) : AbstractC2100k.U((String) objX);
            i9++;
        }
        return iV;
    }

    public static int v(int i8, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = w(list);
        return z8 ? AbstractC2100k.V(i8) + AbstractC2100k.D(iW) : iW + (size * AbstractC2100k.V(i8));
    }

    public static int w(List list) {
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C2114z)) {
            int iX = 0;
            while (i8 < size) {
                iX += AbstractC2100k.X(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return iX;
        }
        C2114z c2114z = (C2114z) list;
        int iX2 = 0;
        while (i8 < size) {
            iX2 += AbstractC2100k.X(c2114z.getInt(i8));
            i8++;
        }
        return iX2;
    }

    public static int x(int i8, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = y(list);
        return z8 ? AbstractC2100k.V(i8) + AbstractC2100k.D(iY) : iY + (size * AbstractC2100k.V(i8));
    }

    public static int y(List list) {
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof J)) {
            int iZ = 0;
            while (i8 < size) {
                iZ += AbstractC2100k.Z(((Long) list.get(i8)).longValue());
                i8++;
            }
            return iZ;
        }
        J j8 = (J) list;
        int iZ2 = 0;
        while (i8 < size) {
            iZ2 += AbstractC2100k.Z(j8.A(i8));
            i8++;
        }
        return iZ2;
    }

    public static Object z(Object obj, int i8, List list, A.d dVar, Object obj2, v0 v0Var) {
        if (dVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (dVar.findValueByNumber(iIntValue) == null) {
                    obj2 = J(obj, i8, iIntValue, obj2, v0Var);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Integer num = (Integer) list.get(i10);
            int iIntValue2 = num.intValue();
            if (dVar.findValueByNumber(iIntValue2) != null) {
                if (i10 != i9) {
                    list.set(i9, num);
                }
                i9++;
            } else {
                obj2 = J(obj, i8, iIntValue2, obj2, v0Var);
            }
        }
        if (i9 != size) {
            list.subList(i9, size).clear();
        }
        return obj2;
    }
}
