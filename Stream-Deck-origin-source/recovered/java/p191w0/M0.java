package p191w0;

import C6.G;
import Q6.k;
import Q6.o;
import V.ocy.SVzBK;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p038e1.H;
import p038e1.I;
import p038e1.InterfaceC2243n;
import p038e1.InterfaceC2244o;
import p038e1.a0;
import p082j0.J;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class M0 implements H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f35571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f35572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J f35573c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f35574a = new a();

        public a() {
            super(2);
        }

        public final Integer b(InterfaceC2243n interfaceC2243n, int i8) {
            return Integer.valueOf(interfaceC2243n.g(i8));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b((InterfaceC2243n) obj, ((Number) obj2).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f35575a = new b();

        public b() {
            super(2);
        }

        public final Integer b(InterfaceC2243n interfaceC2243n, int i8) {
            return Integer.valueOf(interfaceC2243n.G(i8));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b((InterfaceC2243n) obj, ((Number) obj2).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a0 f35576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f35577b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f35578c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a0 f35579d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ a0 f35580e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ a0 f35581f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ a0 f35582g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ a0 f35583h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ a0 f35584i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ a0 f35585j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ a0 f35586k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ M0 f35587l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f35588m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ p038e1.J f35589n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a0 a0Var, int i8, int i9, a0 a0Var2, a0 a0Var3, a0 a0Var4, a0 a0Var5, a0 a0Var6, a0 a0Var7, a0 a0Var8, a0 a0Var9, M0 m8, int i10, p038e1.J j8) {
            super(1);
            this.f35576a = a0Var;
            this.f35577b = i8;
            this.f35578c = i9;
            this.f35579d = a0Var2;
            this.f35580e = a0Var3;
            this.f35581f = a0Var4;
            this.f35582g = a0Var5;
            this.f35583h = a0Var6;
            this.f35584i = a0Var7;
            this.f35585j = a0Var8;
            this.f35586k = a0Var9;
            this.f35587l = m8;
            this.f35588m = i10;
            this.f35589n = j8;
        }

        public final void b(a0.a aVar) {
            a0 a0Var = this.f35576a;
            if (a0Var == null) {
                L0.m(aVar, this.f35577b, this.f35578c, this.f35579d, this.f35580e, this.f35581f, this.f35582g, this.f35583h, this.f35584i, this.f35585j, this.f35586k, this.f35587l.f35571a, this.f35589n.getDensity(), this.f35587l.f35573c);
                return;
            }
            int i8 = this.f35577b;
            int i9 = this.f35578c;
            a0 a0Var2 = this.f35579d;
            a0 a0Var3 = this.f35580e;
            a0 a0Var4 = this.f35581f;
            a0 a0Var5 = this.f35582g;
            a0 a0Var6 = this.f35583h;
            a0 a0Var7 = this.f35584i;
            a0 a0Var8 = this.f35585j;
            a0 a0Var9 = this.f35586k;
            boolean z8 = this.f35587l.f35571a;
            int i10 = this.f35588m;
            L0.l(aVar, i8, i9, a0Var2, a0Var, a0Var3, a0Var4, a0Var5, a0Var6, a0Var7, a0Var8, a0Var9, z8, i10, i10 + this.f35576a.h0(), this.f35587l.f35572b, this.f35589n.getDensity());
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((a0.a) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f35590a = new d();

        public d() {
            super(2);
        }

        public final Integer b(InterfaceC2243n interfaceC2243n, int i8) {
            return Integer.valueOf(interfaceC2243n.W(i8));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b((InterfaceC2243n) obj, ((Number) obj2).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f35591a = new e();

        public e() {
            super(2);
        }

        public final Integer b(InterfaceC2243n interfaceC2243n, int i8) {
            return Integer.valueOf(interfaceC2243n.F(i8));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b((InterfaceC2243n) obj, ((Number) obj2).intValue());
        }
    }

    public M0(boolean z8, float f8, J j8) {
        this.f35571a = z8;
        this.f35572b = f8;
        this.f35573c = j8;
    }

    @Override // p038e1.H
    public int a(InterfaceC2244o interfaceC2244o, List list, int i8) {
        return j(list, i8, b.f35575a);
    }

    @Override // p038e1.H
    public int b(InterfaceC2244o interfaceC2244o, List list, int i8) {
        return j(list, i8, e.f35591a);
    }

    @Override // p038e1.H
    public int c(InterfaceC2244o interfaceC2244o, List list, int i8) {
        return i(interfaceC2244o, list, i8, a.f35574a);
    }

    @Override // p038e1.H
    public I d(p038e1.J j8, List list, long j9) {
        Object obj;
        Object obj2;
        long j10;
        a0 a0VarJ;
        Object obj3;
        Object obj4;
        int i8;
        a0 a0VarJ2;
        a0 a0Var;
        Object obj5;
        a0 a0Var2;
        Object obj6;
        a0 a0Var3;
        Object obj7;
        M0 m8 = this;
        p038e1.J j11 = j8;
        List list2 = list;
        int iV0 = j11.V0(m8.f35573c.d());
        int iV1 = j11.V0(m8.f35573c.a());
        long jE = A1.b.e(j9, 0, 0, 0, 0, 10, null);
        int size = list2.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                obj = null;
                break;
            }
            obj = list2.get(i9);
            if (t.c(androidx.compose.ui.layout.a.a((p038e1.G) obj), "Leading")) {
                break;
            }
            i9++;
        }
        p038e1.G g8 = (p038e1.G) obj;
        a0 a0VarJ3 = g8 != null ? g8.J(jE) : null;
        int iO = K0.o(a0VarJ3);
        int iMax = Math.max(0, K0.n(a0VarJ3));
        int size2 = list2.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list2.get(i10);
            if (t.c(androidx.compose.ui.layout.a.a((p038e1.G) obj2), "Trailing")) {
                break;
            }
            i10++;
        }
        p038e1.G g9 = (p038e1.G) obj2;
        if (g9 != null) {
            j10 = jE;
            a0VarJ = g9.J(A1.c.j(j10, -iO, 0, 2, null));
        } else {
            j10 = jE;
            a0VarJ = null;
        }
        int iO2 = iO + K0.o(a0VarJ);
        int iMax2 = Math.max(iMax, K0.n(a0VarJ));
        int size3 = list2.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list2.get(i11);
            if (t.c(androidx.compose.ui.layout.a.a((p038e1.G) obj3), "Prefix")) {
                break;
            }
            i11++;
        }
        p038e1.G g10 = (p038e1.G) obj3;
        a0 a0VarJ4 = g10 != null ? g10.J(A1.c.j(j10, -iO2, 0, 2, null)) : null;
        int iO3 = iO2 + K0.o(a0VarJ4);
        int iMax3 = Math.max(iMax2, K0.n(a0VarJ4));
        int size4 = list2.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list2.get(i12);
            if (t.c(androidx.compose.ui.layout.a.a((p038e1.G) obj4), "Suffix")) {
                break;
            }
            i12++;
        }
        p038e1.G g11 = (p038e1.G) obj4;
        if (g11 != null) {
            i8 = iO3;
            a0VarJ2 = g11.J(A1.c.j(j10, -iO3, 0, 2, null));
        } else {
            i8 = iO3;
            a0VarJ2 = null;
        }
        int iO4 = K0.o(a0VarJ2) + i8;
        int iMax4 = Math.max(iMax3, K0.n(a0VarJ2));
        int i13 = -iO4;
        long jI = A1.c.i(j10, i13, -iV1);
        int size5 = list2.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size5) {
                a0Var = a0VarJ2;
                obj5 = null;
                break;
            }
            obj5 = list2.get(i14);
            int i15 = i14;
            a0Var = a0VarJ2;
            if (t.c(androidx.compose.ui.layout.a.a((p038e1.G) obj5), "Label")) {
                break;
            }
            i14 = i15 + 1;
            a0VarJ2 = a0Var;
        }
        p038e1.G g12 = (p038e1.G) obj5;
        a0 a0VarJ5 = g12 != null ? g12.J(jI) : null;
        int size6 = list2.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size6) {
                a0Var2 = a0VarJ5;
                obj6 = null;
                break;
            }
            obj6 = list2.get(i16);
            a0Var2 = a0VarJ5;
            if (t.c(androidx.compose.ui.layout.a.a((p038e1.G) obj6), "Supporting")) {
                break;
            }
            i16++;
            a0VarJ5 = a0Var2;
        }
        p038e1.G g13 = (p038e1.G) obj6;
        int iW = g13 != null ? g13.W(A1.b.p(j9)) : 0;
        int iN = K0.n(a0Var2) + iV0;
        long j12 = j10;
        long jI2 = A1.c.i(A1.b.e(j9, 0, 0, 0, 0, 11, null), i13, ((-iN) - iV1) - iW);
        int size7 = list2.size();
        int i17 = 0;
        while (i17 < size7) {
            p038e1.G g14 = (p038e1.G) list2.get(i17);
            int i18 = size7;
            int i19 = iN;
            if (t.c(androidx.compose.ui.layout.a.a(g14), "TextField")) {
                a0 a0VarJ6 = g14.J(jI2);
                long jE2 = A1.b.e(jI2, 0, 0, 0, 0, 14, null);
                int size8 = list2.size();
                int i20 = 0;
                while (true) {
                    if (i20 >= size8) {
                        a0Var3 = a0VarJ6;
                        obj7 = null;
                        break;
                    }
                    obj7 = list2.get(i20);
                    a0Var3 = a0VarJ6;
                    int i21 = size8;
                    if (t.c(androidx.compose.ui.layout.a.a((p038e1.G) obj7), "Hint")) {
                        break;
                    }
                    i20++;
                    size8 = i21;
                    a0VarJ6 = a0Var3;
                }
                p038e1.G g15 = (p038e1.G) obj7;
                a0 a0VarJ7 = g15 != null ? g15.J(jE2) : null;
                int iMax5 = Math.max(iMax4, Math.max(K0.n(a0Var3), K0.n(a0VarJ7)) + i19 + iV1);
                int i22 = L0.i(K0.o(a0VarJ3), K0.o(a0VarJ), K0.o(a0VarJ4), K0.o(a0Var), a0Var3.y0(), K0.o(a0Var2), K0.o(a0VarJ7), j9);
                int i23 = i22;
                a0 a0VarJ8 = g13 != null ? g13.J(A1.b.e(A1.c.j(j12, 0, -iMax5, 1, null), 0, i22, 0, 0, 9, null)) : null;
                int iN2 = K0.n(a0VarJ8);
                int iH = L0.h(a0Var3.h0(), K0.n(a0Var2), K0.n(a0VarJ3), K0.n(a0VarJ), K0.n(a0VarJ4), K0.n(a0Var), K0.n(a0VarJ7), K0.n(a0VarJ8), m8.f35572b, j9, j11.getDensity(), m8.f35573c);
                int i24 = iH - iN2;
                int size9 = list2.size();
                int i25 = 0;
                while (i25 < size9) {
                    p038e1.G g16 = (p038e1.G) list2.get(i25);
                    int i26 = iH;
                    if (t.c(androidx.compose.ui.layout.a.a(g16), "Container")) {
                        int i27 = i23;
                        return p038e1.J.X0(j8, i27, i26, null, new c(a0Var2, i27, i26, a0Var3, a0VarJ7, a0VarJ3, a0VarJ, a0VarJ4, a0Var, g16.J(A1.c.a(i23 != Integer.MAX_VALUE ? i23 : 0, i23, i24 != Integer.MAX_VALUE ? i24 : 0, i24)), a0VarJ8, m8, iV0, j11), 4, null);
                    }
                    i25++;
                    i23 = i23;
                    iH = i26;
                    m8 = this;
                    j11 = j8;
                    list2 = list;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i17++;
            m8 = this;
            j11 = j8;
            iN = i19;
            jI2 = jI2;
            size7 = i18;
            list2 = list;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // p038e1.H
    public int e(InterfaceC2244o interfaceC2244o, List list, int i8) {
        return i(interfaceC2244o, list, i8, d.f35590a);
    }

    public final int j(List list, int i8, o oVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            Object obj7 = list.get(i9);
            if (t.c(K0.f((InterfaceC2243n) obj7), "TextField")) {
                int iIntValue = ((Number) oVar.invoke(obj7, Integer.valueOf(i8))).intValue();
                int size2 = list.size();
                int i10 = 0;
                while (true) {
                    obj = null;
                    if (i10 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i10);
                    if (t.c(K0.f((InterfaceC2243n) obj2), "Label")) {
                        break;
                    }
                    i10++;
                }
                InterfaceC2243n interfaceC2243n = (InterfaceC2243n) obj2;
                int iIntValue2 = interfaceC2243n != null ? ((Number) oVar.invoke(interfaceC2243n, Integer.valueOf(i8))).intValue() : 0;
                int size3 = list.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i11);
                    if (t.c(K0.f((InterfaceC2243n) obj3), "Trailing")) {
                        break;
                    }
                    i11++;
                }
                InterfaceC2243n interfaceC2243n2 = (InterfaceC2243n) obj3;
                int iIntValue3 = interfaceC2243n2 != null ? ((Number) oVar.invoke(interfaceC2243n2, Integer.valueOf(i8))).intValue() : 0;
                int size4 = list.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i12);
                    if (t.c(K0.f((InterfaceC2243n) obj4), "Prefix")) {
                        break;
                    }
                    i12++;
                }
                InterfaceC2243n interfaceC2243n3 = (InterfaceC2243n) obj4;
                int iIntValue4 = interfaceC2243n3 != null ? ((Number) oVar.invoke(interfaceC2243n3, Integer.valueOf(i8))).intValue() : 0;
                int size5 = list.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i13);
                    if (t.c(K0.f((InterfaceC2243n) obj5), "Suffix")) {
                        break;
                    }
                    i13++;
                }
                InterfaceC2243n interfaceC2243n4 = (InterfaceC2243n) obj5;
                int iIntValue5 = interfaceC2243n4 != null ? ((Number) oVar.invoke(interfaceC2243n4, Integer.valueOf(i8))).intValue() : 0;
                int size6 = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i14);
                    if (t.c(K0.f((InterfaceC2243n) obj6), "Leading")) {
                        break;
                    }
                    i14++;
                }
                InterfaceC2243n interfaceC2243n5 = (InterfaceC2243n) obj6;
                int iIntValue6 = interfaceC2243n5 != null ? ((Number) oVar.invoke(interfaceC2243n5, Integer.valueOf(i8))).intValue() : 0;
                int size7 = list.size();
                for (int i15 = 0; i15 < size7; i15++) {
                    Object obj8 = list.get(i15);
                    if (t.c(K0.f((InterfaceC2243n) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                }
                InterfaceC2243n interfaceC2243n6 = (InterfaceC2243n) obj;
                return L0.i(iIntValue6, iIntValue3, iIntValue4, iIntValue5, iIntValue, iIntValue2, interfaceC2243n6 != null ? ((Number) oVar.invoke(interfaceC2243n6, Integer.valueOf(i8))).intValue() : 0, K0.m());
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int i(InterfaceC2244o interfaceC2244o, List list, int i8, o oVar) {
        Object obj;
        int i9;
        int iO;
        int iIntValue;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int iIntValue3;
        Object obj5;
        int i10;
        Object obj6;
        Object obj7;
        int size = list.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i11);
            if (t.c(K0.f((InterfaceC2243n) obj), "Leading")) {
                break;
            }
            i11++;
        }
        InterfaceC2243n interfaceC2243n = (InterfaceC2243n) obj;
        if (interfaceC2243n != null) {
            i9 = i8;
            iO = L0.o(i9, interfaceC2243n.G(Integer.MAX_VALUE));
            iIntValue = ((Number) oVar.invoke(interfaceC2243n, Integer.valueOf(i9))).intValue();
        } else {
            i9 = i8;
            iO = i9;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i12);
            if (t.c(K0.f((InterfaceC2243n) obj2), "Trailing")) {
                break;
            }
            i12++;
        }
        InterfaceC2243n interfaceC2243n2 = (InterfaceC2243n) obj2;
        if (interfaceC2243n2 != null) {
            iO = L0.o(iO, interfaceC2243n2.G(Integer.MAX_VALUE));
            iIntValue2 = ((Number) oVar.invoke(interfaceC2243n2, Integer.valueOf(i9))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i13);
            if (t.c(K0.f((InterfaceC2243n) obj3), "Label")) {
                break;
            }
            i13++;
        }
        Object obj8 = (InterfaceC2243n) obj3;
        int iIntValue4 = obj8 != null ? ((Number) oVar.invoke(obj8, Integer.valueOf(iO))).intValue() : 0;
        int size4 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i14);
            if (t.c(K0.f((InterfaceC2243n) obj4), "Prefix")) {
                break;
            }
            i14++;
        }
        InterfaceC2243n interfaceC2243n3 = (InterfaceC2243n) obj4;
        if (interfaceC2243n3 != null) {
            iIntValue3 = ((Number) oVar.invoke(interfaceC2243n3, Integer.valueOf(iO))).intValue();
            iO = L0.o(iO, interfaceC2243n3.G(Integer.MAX_VALUE));
        } else {
            iIntValue3 = 0;
        }
        int size5 = list.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i15);
            if (t.c(K0.f((InterfaceC2243n) obj5), "Suffix")) {
                break;
            }
            i15++;
        }
        InterfaceC2243n interfaceC2243n4 = (InterfaceC2243n) obj5;
        if (interfaceC2243n4 != null) {
            int iIntValue5 = ((Number) oVar.invoke(interfaceC2243n4, Integer.valueOf(iO))).intValue();
            iO = L0.o(iO, interfaceC2243n4.G(Integer.MAX_VALUE));
            i10 = iIntValue5;
        } else {
            i10 = 0;
        }
        int size6 = list.size();
        for (int i16 = 0; i16 < size6; i16++) {
            Object obj9 = list.get(i16);
            if (t.c(K0.f((InterfaceC2243n) obj9), "TextField")) {
                int iIntValue6 = ((Number) oVar.invoke(obj9, Integer.valueOf(iO))).intValue();
                int size7 = list.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i17);
                    if (t.c(K0.f((InterfaceC2243n) obj6), "Hint")) {
                        break;
                    }
                    i17++;
                }
                Object obj10 = (InterfaceC2243n) obj6;
                int iIntValue7 = obj10 != null ? ((Number) oVar.invoke(obj10, Integer.valueOf(iO))).intValue() : 0;
                int size8 = list.size();
                int i18 = 0;
                while (true) {
                    if (i18 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i18);
                    if (t.c(K0.f((InterfaceC2243n) obj7), SVzBK.zihocSAeUve)) {
                        break;
                    }
                    i18++;
                }
                Object obj11 = (InterfaceC2243n) obj7;
                return L0.h(iIntValue6, iIntValue4, iIntValue, iIntValue2, iIntValue3, i10, iIntValue7, obj11 != null ? ((Number) oVar.invoke(obj11, Integer.valueOf(i9))).intValue() : 0, this.f35572b, K0.m(), interfaceC2244o.getDensity(), this.f35573c);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
