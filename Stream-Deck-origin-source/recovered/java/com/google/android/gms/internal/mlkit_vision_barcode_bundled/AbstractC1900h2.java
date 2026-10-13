package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.h2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1900h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC1954s2 f18578a;

    static {
        U1 u8 = U1.f18028c;
        f18578a = new C1964u2();
    }

    public static void A(int i8, List list, I2 i9, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i9.B(i8, list, z8);
    }

    public static void B(int i8, List list, I2 i9, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i9.l(i8, list, z8);
    }

    public static void C(int i8, List list, I2 i9, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i9.w(i8, list, z8);
    }

    public static void D(int i8, List list, I2 i9, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i9.d(i8, list, z8);
    }

    public static void E(int i8, List list, I2 i9, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i9.k(i8, list, z8);
    }

    public static void a(int i8, List list, I2 i9, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i9.q(i8, list, z8);
    }

    public static void b(int i8, List list, I2 i9, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i9.z(i8, list, z8);
    }

    public static void c(int i8, List list, I2 i9, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i9.i(i8, list, z8);
    }

    public static void d(int i8, List list, I2 i9, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i9.t(i8, list, z8);
    }

    public static boolean e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int f(List list) {
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C1919l1)) {
            int iB = 0;
            while (i8 < size) {
                iB += R0.b(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return iB;
        }
        C1919l1 c1919l1 = (C1919l1) list;
        int iB2 = 0;
        while (i8 < size) {
            iB2 += R0.b(c1919l1.m(i8));
            i8++;
        }
        return iB2;
    }

    public static int g(int i8, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (R0.a(i8 << 3) + 4);
    }

    public static int h(List list) {
        return list.size() * 4;
    }

    public static int i(int i8, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (R0.a(i8 << 3) + 8);
    }

    public static int j(List list) {
        return list.size() * 8;
    }

    public static int k(List list) {
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C1919l1)) {
            int iB = 0;
            while (i8 < size) {
                iB += R0.b(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return iB;
        }
        C1919l1 c1919l1 = (C1919l1) list;
        int iB2 = 0;
        while (i8 < size) {
            iB2 += R0.b(c1919l1.m(i8));
            i8++;
        }
        return iB2;
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iB = 0;
        for (int i8 = 0; i8 < size; i8++) {
            iB += R0.b(((Long) list.get(i8)).longValue());
        }
        return iB;
    }

    public static int m(int i8, Object obj, InterfaceC1890f2 interfaceC1890f2) {
        int i9 = i8 << 3;
        if (!(obj instanceof C1988z1)) {
            return R0.a(i9) + R0.B((M1) obj, interfaceC1890f2);
        }
        int iA = R0.a(i9);
        int iA2 = ((C1988z1) obj).a();
        return iA + R0.a(iA2) + iA2;
    }

    public static int n(List list) {
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C1919l1)) {
            int iA = 0;
            while (i8 < size) {
                int iIntValue = ((Integer) list.get(i8)).intValue();
                iA += R0.a((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i8++;
            }
            return iA;
        }
        C1919l1 c1919l1 = (C1919l1) list;
        int iA2 = 0;
        while (i8 < size) {
            int iM = c1919l1.m(i8);
            iA2 += R0.a((iM >> 31) ^ (iM + iM));
            i8++;
        }
        return iA2;
    }

    public static int o(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iB = 0;
        for (int i8 = 0; i8 < size; i8++) {
            long jLongValue = ((Long) list.get(i8)).longValue();
            iB += R0.b((jLongValue >> 63) ^ (jLongValue + jLongValue));
        }
        return iB;
    }

    public static int p(List list) {
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C1919l1)) {
            int iA = 0;
            while (i8 < size) {
                iA += R0.a(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return iA;
        }
        C1919l1 c1919l1 = (C1919l1) list;
        int iA2 = 0;
        while (i8 < size) {
            iA2 += R0.a(c1919l1.m(i8));
            i8++;
        }
        return iA2;
    }

    public static int q(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iB = 0;
        for (int i8 = 0; i8 < size; i8++) {
            iB += R0.b(((Long) list.get(i8)).longValue());
        }
        return iB;
    }

    public static AbstractC1954s2 r() {
        return f18578a;
    }

    public static Object s(Object obj, int i8, int i9, Object obj2, AbstractC1954s2 abstractC1954s2) {
        AbstractC1914k1 abstractC1914k1;
        C1959t2 c1959t2;
        Object obj3 = obj2;
        if (obj2 == null && (c1959t2 = (abstractC1914k1 = (AbstractC1914k1) obj).zzc) == C1959t2.c()) {
            obj3 = c1959t2;
            C1959t2 c1959t2F = C1959t2.f();
            abstractC1914k1.zzc = c1959t2F;
            obj3 = c1959t2F;
        }
        obj3 = c1959t2;
        ((C1959t2) obj3).j(i8 << 3, Long.valueOf(i9));
        return obj3;
    }

    public static void t(W0 w8, Object obj, Object obj2) {
        C1864a1 c1864a1 = ((AbstractC1899h1) obj2).zzb;
        if (c1864a1.f18053a.isEmpty()) {
            return;
        }
        ((AbstractC1899h1) obj).J().h(c1864a1);
    }

    public static void u(AbstractC1954s2 abstractC1954s2, Object obj, Object obj2) {
        AbstractC1914k1 abstractC1914k1 = (AbstractC1914k1) obj;
        C1959t2 c1959t2E = abstractC1914k1.zzc;
        C1959t2 c1959t2 = ((AbstractC1914k1) obj2).zzc;
        if (!C1959t2.c().equals(c1959t2)) {
            if (C1959t2.c().equals(c1959t2E)) {
                c1959t2E = C1959t2.e(c1959t2E, c1959t2);
            } else {
                c1959t2E.d(c1959t2);
            }
        }
        abstractC1914k1.zzc = c1959t2E;
    }

    public static void v(int i8, List list, I2 i9, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i9.h(i8, list, z8);
    }

    public static void w(int i8, List list, I2 i9, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i9.A(i8, list, z8);
    }

    public static void x(int i8, List list, I2 i9, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i9.o(i8, list, z8);
    }

    public static void y(int i8, List list, I2 i9, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i9.j(i8, list, z8);
    }

    public static void z(int i8, List list, I2 i9, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i9.u(i8, list, z8);
    }
}
