package com.google.android.gms.internal.play_billing;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.i1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2025i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f18912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC2076w1 f18913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AbstractC2076w1 f18914c;

    static {
        Class<?> cls;
        Class<?> cls2;
        AbstractC2076w1 abstractC2076w1 = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f18912a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                abstractC2076w1 = (AbstractC2076w1) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        f18913b = abstractC2076w1;
        f18914c = new C2082y1();
    }

    public static void A(int i8, List list, O1 o8, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o8.A(i8, list, z8);
    }

    public static void B(int i8, List list, O1 o8, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o8.o(i8, list, z8);
    }

    public static void C(int i8, List list, O1 o8, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o8.j(i8, list, z8);
    }

    public static void D(int i8, List list, O1 o8, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o8.u(i8, list, z8);
    }

    public static void E(int i8, List list, O1 o8, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o8.B(i8, list, z8);
    }

    public static void F(int i8, List list, O1 o8, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o8.l(i8, list, z8);
    }

    public static void G(int i8, List list, O1 o8, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o8.w(i8, list, z8);
    }

    public static void a(int i8, List list, O1 o8, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o8.d(i8, list, z8);
    }

    public static void b(int i8, List list, O1 o8, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o8.k(i8, list, z8);
    }

    public static void c(int i8, List list, O1 o8, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o8.q(i8, list, z8);
    }

    public static void d(int i8, List list, O1 o8, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o8.z(i8, list, z8);
    }

    public static void e(int i8, List list, O1 o8, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o8.i(i8, list, z8);
    }

    public static void f(int i8, List list, O1 o8, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o8.t(i8, list, z8);
    }

    public static boolean g(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int h(List list) {
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C2059r0)) {
            int iX = 0;
            while (i8 < size) {
                iX += AbstractC1992a0.x(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return iX;
        }
        C2059r0 c2059r0 = (C2059r0) list;
        int iX2 = 0;
        while (i8 < size) {
            iX2 += AbstractC1992a0.x(c2059r0.m(i8));
            i8++;
        }
        return iX2;
    }

    public static int i(int i8, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC1992a0.w(i8 << 3) + 4);
    }

    public static int j(List list) {
        return list.size() * 4;
    }

    public static int k(int i8, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC1992a0.w(i8 << 3) + 8);
    }

    public static int l(List list) {
        return list.size() * 8;
    }

    public static int m(List list) {
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C2059r0)) {
            int iX = 0;
            while (i8 < size) {
                iX += AbstractC1992a0.x(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return iX;
        }
        C2059r0 c2059r0 = (C2059r0) list;
        int iX2 = 0;
        while (i8 < size) {
            iX2 += AbstractC1992a0.x(c2059r0.m(i8));
            i8++;
        }
        return iX2;
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iX = 0;
        for (int i8 = 0; i8 < size; i8++) {
            iX += AbstractC1992a0.x(((Long) list.get(i8)).longValue());
        }
        return iX;
    }

    public static int o(int i8, Object obj, InterfaceC2017g1 interfaceC2017g1) {
        int i9 = i8 << 3;
        if (!(obj instanceof D0)) {
            return AbstractC1992a0.w(i9) + AbstractC1992a0.u((V0) obj, interfaceC2017g1);
        }
        int iW = AbstractC1992a0.w(i9);
        int iA = ((D0) obj).a();
        return iW + AbstractC1992a0.w(iA) + iA;
    }

    public static int p(List list) {
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C2059r0)) {
            int iW = 0;
            while (i8 < size) {
                int iIntValue = ((Integer) list.get(i8)).intValue();
                iW += AbstractC1992a0.w((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i8++;
            }
            return iW;
        }
        C2059r0 c2059r0 = (C2059r0) list;
        int iW2 = 0;
        while (i8 < size) {
            int iM = c2059r0.m(i8);
            iW2 += AbstractC1992a0.w((iM >> 31) ^ (iM + iM));
            i8++;
        }
        return iW2;
    }

    public static int q(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iX = 0;
        for (int i8 = 0; i8 < size; i8++) {
            long jLongValue = ((Long) list.get(i8)).longValue();
            iX += AbstractC1992a0.x((jLongValue >> 63) ^ (jLongValue + jLongValue));
        }
        return iX;
    }

    public static int r(List list) {
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C2059r0)) {
            int iW = 0;
            while (i8 < size) {
                iW += AbstractC1992a0.w(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return iW;
        }
        C2059r0 c2059r0 = (C2059r0) list;
        int iW2 = 0;
        while (i8 < size) {
            iW2 += AbstractC1992a0.w(c2059r0.m(i8));
            i8++;
        }
        return iW2;
    }

    public static int s(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iX = 0;
        for (int i8 = 0; i8 < size; i8++) {
            iX += AbstractC1992a0.x(((Long) list.get(i8)).longValue());
        }
        return iX;
    }

    public static AbstractC2076w1 t() {
        return f18913b;
    }

    public static AbstractC2076w1 u() {
        return f18914c;
    }

    public static Object v(Object obj, int i8, int i9, Object obj2, AbstractC2076w1 abstractC2076w1) {
        if (obj2 == null) {
            obj2 = abstractC2076w1.c(obj);
        }
        abstractC2076w1.f(obj2, i8, i9);
        return obj2;
    }

    public static void w(AbstractC2012f0 abstractC2012f0, Object obj, Object obj2) {
        C2028j0 c2028j0B = abstractC2012f0.b(obj2);
        if (c2028j0B.f18917a.isEmpty()) {
            return;
        }
        abstractC2012f0.c(obj).g(c2028j0B);
    }

    public static void x(AbstractC2076w1 abstractC2076w1, Object obj, Object obj2) {
        abstractC2076w1.h(obj, abstractC2076w1.e(abstractC2076w1.d(obj), abstractC2076w1.d(obj2)));
    }

    public static void y(Class cls) {
        Class cls2;
        if (!AbstractC2056q0.class.isAssignableFrom(cls) && (cls2 = f18912a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void z(int i8, List list, O1 o8, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o8.h(i8, list, z8);
    }
}
