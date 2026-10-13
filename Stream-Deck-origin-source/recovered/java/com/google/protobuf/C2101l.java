package com.google.protobuf;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2101l implements D0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC2100k f19358a;

    /* JADX INFO: renamed from: com.google.protobuf.l$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19359a;

        static {
            int[] iArr = new int[C0.b.values().length];
            f19359a = iArr;
            try {
                iArr[C0.b.f19074j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19359a[C0.b.f19073i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19359a[C0.b.f19071g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19359a[C0.b.f19081q.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19359a[C0.b.f19083s.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19359a[C0.b.f19079o.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19359a[C0.b.f19072h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19359a[C0.b.f19069e.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f19359a[C0.b.f19082r.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f19359a[C0.b.f19084t.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f19359a[C0.b.f19070f.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f19359a[C0.b.f19075k.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public C2101l(AbstractC2100k abstractC2100k) {
        AbstractC2100k abstractC2100k2 = (AbstractC2100k) A.b(abstractC2100k, "output");
        this.f19358a = abstractC2100k2;
        abstractC2100k2.f19344a = this;
    }

    public static C2101l P(AbstractC2100k abstractC2100k) {
        C2101l c2101l = abstractC2100k.f19344a;
        return c2101l != null ? c2101l : new C2101l(abstractC2100k);
    }

    @Override // com.google.protobuf.D0
    public void A(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!z8) {
            while (i9 < list.size()) {
                this.f19358a.u0(i8, ((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        this.f19358a.W0(i8, 2);
        int iO = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iO += AbstractC2100k.o(((Integer) list.get(i10)).intValue());
        }
        this.f19358a.Y0(iO);
        while (i9 < list.size()) {
            this.f19358a.v0(((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    @Override // com.google.protobuf.D0
    public void B(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!z8) {
            while (i9 < list.size()) {
                this.f19358a.k0(i8, ((Boolean) list.get(i9)).booleanValue());
                i9++;
            }
            return;
        }
        this.f19358a.W0(i8, 2);
        int iF = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iF += AbstractC2100k.f(((Boolean) list.get(i10)).booleanValue());
        }
        this.f19358a.Y0(iF);
        while (i9 < list.size()) {
            this.f19358a.l0(((Boolean) list.get(i9)).booleanValue());
            i9++;
        }
    }

    @Override // com.google.protobuf.D0
    public void C(int i8, L.a aVar, Map map) {
        if (this.f19358a.e0()) {
            T(i8, aVar, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f19358a.W0(i8, 2);
            this.f19358a.Y0(L.b(aVar, entry.getKey(), entry.getValue()));
            L.e(this.f19358a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.protobuf.D0
    public void D(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!z8) {
            while (i9 < list.size()) {
                this.f19358a.X0(i8, ((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        this.f19358a.W0(i8, 2);
        int iX = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iX += AbstractC2100k.X(((Integer) list.get(i10)).intValue());
        }
        this.f19358a.Y0(iX);
        while (i9 < list.size()) {
            this.f19358a.Y0(((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    @Override // com.google.protobuf.D0
    public void E(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!z8) {
            while (i9 < list.size()) {
                this.f19358a.S0(i8, ((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        this.f19358a.W0(i8, 2);
        int iS = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iS += AbstractC2100k.S(((Long) list.get(i10)).longValue());
        }
        this.f19358a.Y0(iS);
        while (i9 < list.size()) {
            this.f19358a.T0(((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    @Override // com.google.protobuf.D0
    public void F(int i8, long j8) {
        this.f19358a.S0(i8, j8);
    }

    @Override // com.google.protobuf.D0
    public void G(int i8, float f8) {
        this.f19358a.y0(i8, f8);
    }

    @Override // com.google.protobuf.D0
    public void H(int i8) {
        this.f19358a.W0(i8, 4);
    }

    @Override // com.google.protobuf.D0
    public void I(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!z8) {
            while (i9 < list.size()) {
                this.f19358a.Q0(i8, ((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        this.f19358a.W0(i8, 2);
        int iQ = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iQ += AbstractC2100k.Q(((Integer) list.get(i10)).intValue());
        }
        this.f19358a.Y0(iQ);
        while (i9 < list.size()) {
            this.f19358a.R0(((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    @Override // com.google.protobuf.D0
    public void J(int i8, int i9) {
        this.f19358a.s0(i8, i9);
    }

    @Override // com.google.protobuf.D0
    public void K(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!z8) {
            while (i9 < list.size()) {
                this.f19358a.G0(i8, ((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        this.f19358a.W0(i8, 2);
        int iZ = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iZ += AbstractC2100k.z(((Long) list.get(i10)).longValue());
        }
        this.f19358a.Y0(iZ);
        while (i9 < list.size()) {
            this.f19358a.H0(((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    @Override // com.google.protobuf.D0
    public void L(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!z8) {
            while (i9 < list.size()) {
                this.f19358a.s0(i8, ((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        this.f19358a.W0(i8, 2);
        int iM = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iM += AbstractC2100k.m(((Integer) list.get(i10)).intValue());
        }
        this.f19358a.Y0(iM);
        while (i9 < list.size()) {
            this.f19358a.t0(((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    @Override // com.google.protobuf.D0
    public void M(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!z8) {
            while (i9 < list.size()) {
                this.f19358a.q0(i8, ((Double) list.get(i9)).doubleValue());
                i9++;
            }
            return;
        }
        this.f19358a.W0(i8, 2);
        int iK = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iK += AbstractC2100k.k(((Double) list.get(i10)).doubleValue());
        }
        this.f19358a.Y0(iK);
        while (i9 < list.size()) {
            this.f19358a.r0(((Double) list.get(i9)).doubleValue());
            i9++;
        }
    }

    @Override // com.google.protobuf.D0
    public void N(int i8, int i9) {
        this.f19358a.Q0(i8, i9);
    }

    @Override // com.google.protobuf.D0
    public void O(int i8, List list) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            this.f19358a.o0(i8, (AbstractC2097h) list.get(i9));
        }
    }

    public final void Q(int i8, boolean z8, Object obj, L.a aVar) {
        this.f19358a.W0(i8, 2);
        this.f19358a.Y0(L.b(aVar, Boolean.valueOf(z8), obj));
        L.e(this.f19358a, aVar, Boolean.valueOf(z8), obj);
    }

    public final void R(int i8, L.a aVar, Map map) {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i9 = 0;
        while (it.hasNext()) {
            iArr[i9] = ((Integer) it.next()).intValue();
            i9++;
        }
        Arrays.sort(iArr);
        for (int i10 = 0; i10 < size; i10++) {
            int i11 = iArr[i10];
            Object obj = map.get(Integer.valueOf(i11));
            this.f19358a.W0(i8, 2);
            this.f19358a.Y0(L.b(aVar, Integer.valueOf(i11), obj));
            L.e(this.f19358a, aVar, Integer.valueOf(i11), obj);
        }
    }

    public final void S(int i8, L.a aVar, Map map) {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator it = map.keySet().iterator();
        int i9 = 0;
        while (it.hasNext()) {
            jArr[i9] = ((Long) it.next()).longValue();
            i9++;
        }
        Arrays.sort(jArr);
        for (int i10 = 0; i10 < size; i10++) {
            long j8 = jArr[i10];
            Object obj = map.get(Long.valueOf(j8));
            this.f19358a.W0(i8, 2);
            this.f19358a.Y0(L.b(aVar, Long.valueOf(j8), obj));
            L.e(this.f19358a, aVar, Long.valueOf(j8), obj);
        }
    }

    public final void T(int i8, L.a aVar, Map map) {
        switch (a.f19359a[aVar.f19208a.ordinal()]) {
            case 1:
                Object obj = map.get(Boolean.FALSE);
                if (obj != null) {
                    Q(i8, false, obj, aVar);
                }
                Object obj2 = map.get(Boolean.TRUE);
                if (obj2 != null) {
                    Q(i8, true, obj2, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                R(i8, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                S(i8, aVar, map);
                return;
            case 12:
                U(i8, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f19208a);
        }
    }

    public final void U(int i8, L.a aVar, Map map) {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator it = map.keySet().iterator();
        int i9 = 0;
        while (it.hasNext()) {
            strArr[i9] = (String) it.next();
            i9++;
        }
        Arrays.sort(strArr);
        for (int i10 = 0; i10 < size; i10++) {
            String str = strArr[i10];
            Object obj = map.get(str);
            this.f19358a.W0(i8, 2);
            this.f19358a.Y0(L.b(aVar, str, obj));
            L.e(this.f19358a, aVar, str, obj);
        }
    }

    public final void V(int i8, Object obj) {
        if (obj instanceof String) {
            this.f19358a.U0(i8, (String) obj);
        } else {
            this.f19358a.o0(i8, (AbstractC2097h) obj);
        }
    }

    @Override // com.google.protobuf.D0
    public void a(int i8, List list, n0 n0Var) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            j(i8, list.get(i9), n0Var);
        }
    }

    @Override // com.google.protobuf.D0
    public void b(int i8, List list, n0 n0Var) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            s(i8, list.get(i9), n0Var);
        }
    }

    @Override // com.google.protobuf.D0
    public void c(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!z8) {
            while (i9 < list.size()) {
                this.f19358a.y0(i8, ((Float) list.get(i9)).floatValue());
                i9++;
            }
            return;
        }
        this.f19358a.W0(i8, 2);
        int iS = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iS += AbstractC2100k.s(((Float) list.get(i10)).floatValue());
        }
        this.f19358a.Y0(iS);
        while (i9 < list.size()) {
            this.f19358a.z0(((Float) list.get(i9)).floatValue());
            i9++;
        }
    }

    @Override // com.google.protobuf.D0
    public void d(int i8, int i9) {
        this.f19358a.X0(i8, i9);
    }

    @Override // com.google.protobuf.D0
    public final void e(int i8, Object obj) {
        if (obj instanceof AbstractC2097h) {
            this.f19358a.L0(i8, (AbstractC2097h) obj);
        } else {
            this.f19358a.K0(i8, (T) obj);
        }
    }

    @Override // com.google.protobuf.D0
    public void f(int i8, int i9) {
        this.f19358a.u0(i8, i9);
    }

    @Override // com.google.protobuf.D0
    public void g(int i8, double d8) {
        this.f19358a.q0(i8, d8);
    }

    @Override // com.google.protobuf.D0
    public void h(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!z8) {
            while (i9 < list.size()) {
                this.f19358a.O0(i8, ((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        this.f19358a.W0(i8, 2);
        int iO = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iO += AbstractC2100k.O(((Long) list.get(i10)).longValue());
        }
        this.f19358a.Y0(iO);
        while (i9 < list.size()) {
            this.f19358a.P0(((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    @Override // com.google.protobuf.D0
    public void i(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!z8) {
            while (i9 < list.size()) {
                this.f19358a.Z0(i8, ((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        this.f19358a.W0(i8, 2);
        int iZ = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iZ += AbstractC2100k.Z(((Long) list.get(i10)).longValue());
        }
        this.f19358a.Y0(iZ);
        while (i9 < list.size()) {
            this.f19358a.a1(((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    @Override // com.google.protobuf.D0
    public void j(int i8, Object obj, n0 n0Var) {
        this.f19358a.I0(i8, (T) obj, n0Var);
    }

    @Override // com.google.protobuf.D0
    public void k(int i8, long j8) {
        this.f19358a.w0(i8, j8);
    }

    @Override // com.google.protobuf.D0
    public D0.a l() {
        return D0.a.ASCENDING;
    }

    @Override // com.google.protobuf.D0
    public void m(int i8, List list) {
        int i9 = 0;
        if (!(list instanceof H)) {
            while (i9 < list.size()) {
                this.f19358a.U0(i8, (String) list.get(i9));
                i9++;
            }
        } else {
            H h8 = (H) list;
            while (i9 < list.size()) {
                V(i8, h8.x(i9));
                i9++;
            }
        }
    }

    @Override // com.google.protobuf.D0
    public void n(int i8, String str) {
        this.f19358a.U0(i8, str);
    }

    @Override // com.google.protobuf.D0
    public void o(int i8, long j8) {
        this.f19358a.Z0(i8, j8);
    }

    @Override // com.google.protobuf.D0
    public void p(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!z8) {
            while (i9 < list.size()) {
                this.f19358a.E0(i8, ((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        this.f19358a.W0(i8, 2);
        int iX = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iX += AbstractC2100k.x(((Integer) list.get(i10)).intValue());
        }
        this.f19358a.Y0(iX);
        while (i9 < list.size()) {
            this.f19358a.F0(((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    @Override // com.google.protobuf.D0
    public void q(int i8, long j8) {
        this.f19358a.G0(i8, j8);
    }

    @Override // com.google.protobuf.D0
    public void r(int i8, boolean z8) {
        this.f19358a.k0(i8, z8);
    }

    @Override // com.google.protobuf.D0
    public void s(int i8, Object obj, n0 n0Var) {
        this.f19358a.B0(i8, (T) obj, n0Var);
    }

    @Override // com.google.protobuf.D0
    public void t(int i8, int i9) {
        this.f19358a.M0(i8, i9);
    }

    @Override // com.google.protobuf.D0
    public void u(int i8) {
        this.f19358a.W0(i8, 3);
    }

    @Override // com.google.protobuf.D0
    public void v(int i8, AbstractC2097h abstractC2097h) {
        this.f19358a.o0(i8, abstractC2097h);
    }

    @Override // com.google.protobuf.D0
    public void w(int i8, int i9) {
        this.f19358a.E0(i8, i9);
    }

    @Override // com.google.protobuf.D0
    public void x(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!z8) {
            while (i9 < list.size()) {
                this.f19358a.w0(i8, ((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        this.f19358a.W0(i8, 2);
        int iQ = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iQ += AbstractC2100k.q(((Long) list.get(i10)).longValue());
        }
        this.f19358a.Y0(iQ);
        while (i9 < list.size()) {
            this.f19358a.x0(((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    @Override // com.google.protobuf.D0
    public void y(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!z8) {
            while (i9 < list.size()) {
                this.f19358a.M0(i8, ((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        this.f19358a.W0(i8, 2);
        int iM = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iM += AbstractC2100k.M(((Integer) list.get(i10)).intValue());
        }
        this.f19358a.Y0(iM);
        while (i9 < list.size()) {
            this.f19358a.N0(((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    @Override // com.google.protobuf.D0
    public void z(int i8, long j8) {
        this.f19358a.O0(i8, j8);
    }
}
