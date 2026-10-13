package p191w0;

import C6.G;
import Q0.l;
import Q0.m;
import Q6.k;
import Q6.o;
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

/* JADX INFO: renamed from: w0.n0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C3075n0 implements H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f36261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f36262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f36263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final J f36264d;

    /* JADX INFO: renamed from: w0.n0$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f36265a = new a();

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

    /* JADX INFO: renamed from: w0.n0$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f36266a = new b();

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

    /* JADX INFO: renamed from: w0.n0$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f36267a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f36268b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a0 f36269c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a0 f36270d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ a0 f36271e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ a0 f36272f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ a0 f36273g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ a0 f36274h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ a0 f36275i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ a0 f36276j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ a0 f36277k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C3075n0 f36278l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ p038e1.J f36279m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i8, int i9, a0 a0Var, a0 a0Var2, a0 a0Var3, a0 a0Var4, a0 a0Var5, a0 a0Var6, a0 a0Var7, a0 a0Var8, a0 a0Var9, C3075n0 c3075n0, p038e1.J j8) {
            super(1);
            this.f36267a = i8;
            this.f36268b = i9;
            this.f36269c = a0Var;
            this.f36270d = a0Var2;
            this.f36271e = a0Var3;
            this.f36272f = a0Var4;
            this.f36273g = a0Var5;
            this.f36274h = a0Var6;
            this.f36275i = a0Var7;
            this.f36276j = a0Var8;
            this.f36277k = a0Var9;
            this.f36278l = c3075n0;
            this.f36279m = j8;
        }

        public final void b(a0.a aVar) {
            AbstractC3073m0.j(aVar, this.f36267a, this.f36268b, this.f36269c, this.f36270d, this.f36271e, this.f36272f, this.f36273g, this.f36274h, this.f36275i, this.f36276j, this.f36277k, this.f36278l.f36263c, this.f36278l.f36262b, this.f36279m.getDensity(), this.f36279m.getLayoutDirection(), this.f36278l.f36264d);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((a0.a) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: w0.n0$d */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f36280a = new d();

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

    /* JADX INFO: renamed from: w0.n0$e */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f36281a = new e();

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

    public C3075n0(k kVar, boolean z8, float f8, J j8) {
        this.f36261a = kVar;
        this.f36262b = z8;
        this.f36263c = f8;
        this.f36264d = j8;
    }

    @Override // p038e1.H
    public int a(InterfaceC2244o interfaceC2244o, List list, int i8) {
        return j(interfaceC2244o, list, i8, b.f36266a);
    }

    @Override // p038e1.H
    public int b(InterfaceC2244o interfaceC2244o, List list, int i8) {
        return j(interfaceC2244o, list, i8, e.f36281a);
    }

    @Override // p038e1.H
    public int c(InterfaceC2244o interfaceC2244o, List list, int i8) {
        return i(interfaceC2244o, list, i8, a.f36265a);
    }

    @Override // p038e1.H
    public I d(p038e1.J j8, List list, long j9) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        a0 a0Var;
        Object obj5;
        Object obj6;
        Object obj7;
        C3075n0 c3075n0 = this;
        p038e1.J j10 = j8;
        int iV0 = j10.V0(c3075n0.f36264d.a());
        long jE = A1.b.e(j9, 0, 0, 0, 0, 10, null);
        int size = list.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i8);
            if (t.c(androidx.compose.ui.layout.a.a((p038e1.G) obj), "Leading")) {
                break;
            }
            i8++;
        }
        p038e1.G g8 = (p038e1.G) obj;
        a0 a0VarJ = g8 != null ? g8.J(jE) : null;
        int iO = K0.o(a0VarJ);
        int iMax = Math.max(0, K0.n(a0VarJ));
        int size2 = list.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i9);
            if (t.c(androidx.compose.ui.layout.a.a((p038e1.G) obj2), "Trailing")) {
                break;
            }
            i9++;
        }
        p038e1.G g9 = (p038e1.G) obj2;
        a0 a0VarJ2 = g9 != null ? g9.J(A1.c.j(jE, -iO, 0, 2, null)) : null;
        int iO2 = iO + K0.o(a0VarJ2);
        int iMax2 = Math.max(iMax, K0.n(a0VarJ2));
        int size3 = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i10);
            if (t.c(androidx.compose.ui.layout.a.a((p038e1.G) obj3), "Prefix")) {
                break;
            }
            i10++;
        }
        p038e1.G g10 = (p038e1.G) obj3;
        a0 a0VarJ3 = g10 != null ? g10.J(A1.c.j(jE, -iO2, 0, 2, null)) : null;
        int iO3 = iO2 + K0.o(a0VarJ3);
        int iMax3 = Math.max(iMax2, K0.n(a0VarJ3));
        int size4 = list.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i11);
            if (t.c(androidx.compose.ui.layout.a.a((p038e1.G) obj4), "Suffix")) {
                break;
            }
            i11++;
        }
        p038e1.G g11 = (p038e1.G) obj4;
        a0 a0VarJ4 = g11 != null ? g11.J(A1.c.j(jE, -iO3, 0, 2, null)) : null;
        int iO4 = iO3 + K0.o(a0VarJ4);
        int iMax4 = Math.max(iMax3, K0.n(a0VarJ4));
        int iV1 = j10.V0(c3075n0.f36264d.c(j10.getLayoutDirection())) + j10.V0(c3075n0.f36264d.b(j10.getLayoutDirection()));
        int i12 = -iO4;
        int i13 = -iV0;
        long jI = A1.c.i(jE, C1.b.b(i12 - iV1, -iV1, c3075n0.f36263c), i13);
        int size5 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size5) {
                a0Var = a0VarJ;
                obj5 = null;
                break;
            }
            obj5 = list.get(i14);
            int i15 = i14;
            a0Var = a0VarJ;
            if (t.c(androidx.compose.ui.layout.a.a((p038e1.G) obj5), "Label")) {
                break;
            }
            i14 = i15 + 1;
            a0VarJ = a0Var;
        }
        p038e1.G g12 = (p038e1.G) obj5;
        a0 a0VarJ5 = g12 != null ? g12.J(jI) : null;
        if (a0VarJ5 != null) {
            c3075n0.f36261a.invoke(l.c(m.a(a0VarJ5.y0(), a0VarJ5.h0())));
        }
        int size6 = list.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size6) {
                obj6 = null;
                break;
            }
            obj6 = list.get(i16);
            int i17 = size6;
            if (t.c(androidx.compose.ui.layout.a.a((p038e1.G) obj6), "Supporting")) {
                break;
            }
            i16++;
            size6 = i17;
        }
        p038e1.G g13 = (p038e1.G) obj6;
        int iW = g13 != null ? g13.W(A1.b.p(j9)) : 0;
        int iMax5 = Math.max(K0.n(a0VarJ5) / 2, j10.V0(c3075n0.f36264d.d()));
        long jE2 = A1.b.e(A1.c.i(j9, i12, (i13 - iMax5) - iW), 0, 0, 0, 0, 11, null);
        int size7 = list.size();
        a0 a0Var2 = a0VarJ3;
        int i18 = 0;
        while (i18 < size7) {
            int i19 = size7;
            p038e1.G g14 = (p038e1.G) list.get(i18);
            a0 a0Var3 = a0VarJ4;
            a0 a0Var4 = a0VarJ2;
            if (t.c(androidx.compose.ui.layout.a.a(g14), "TextField")) {
                a0 a0VarJ6 = g14.J(jE2);
                long jE3 = A1.b.e(jE2, 0, 0, 0, 0, 14, null);
                int size8 = list.size();
                int i20 = 0;
                while (true) {
                    if (i20 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i20);
                    int i21 = size8;
                    int i22 = i20;
                    if (t.c(androidx.compose.ui.layout.a.a((p038e1.G) obj7), "Hint")) {
                        break;
                    }
                    i20 = i22 + 1;
                    size8 = i21;
                }
                p038e1.G g15 = (p038e1.G) obj7;
                a0 a0VarJ7 = g15 != null ? g15.J(jE3) : null;
                int iMax6 = Math.max(iMax4, Math.max(K0.n(a0VarJ6), K0.n(a0VarJ7)) + iMax5 + iV0);
                int iH = AbstractC3073m0.h(K0.o(a0Var), K0.o(a0Var4), K0.o(a0Var2), K0.o(a0Var3), a0VarJ6.y0(), K0.o(a0VarJ5), K0.o(a0VarJ7), c3075n0.f36263c, j9, j10.getDensity(), c3075n0.f36264d);
                int i23 = iH;
                a0 a0VarJ8 = g13 != null ? g13.J(A1.b.e(A1.c.j(jE, 0, -iMax6, 1, null), 0, iH, 0, 0, 9, null)) : null;
                int iN = K0.n(a0VarJ8);
                int iG = AbstractC3073m0.g(K0.n(a0Var), K0.n(a0Var4), K0.n(a0Var2), K0.n(a0Var3), a0VarJ6.h0(), K0.n(a0VarJ5), K0.n(a0VarJ7), K0.n(a0VarJ8), c3075n0.f36263c, j9, j10.getDensity(), c3075n0.f36264d);
                int i24 = iG - iN;
                int size9 = list.size();
                int i25 = 0;
                while (i25 < size9) {
                    p038e1.G g16 = (p038e1.G) list.get(i25);
                    if (t.c(androidx.compose.ui.layout.a.a(g16), "Container")) {
                        int i26 = i23;
                        return p038e1.J.X0(j8, i26, iG, null, new c(iG, i26, a0Var, a0Var4, a0Var2, a0Var3, a0VarJ6, a0VarJ5, a0VarJ7, g16.J(A1.c.a(i23 != Integer.MAX_VALUE ? i23 : 0, i23, i24 != Integer.MAX_VALUE ? i24 : 0, i24)), a0VarJ8, c3075n0, j10), 4, null);
                    }
                    i25++;
                    c3075n0 = this;
                    j10 = j8;
                    i23 = i23;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i18++;
            c3075n0 = this;
            j10 = j8;
            a0VarJ2 = a0Var4;
            size7 = i19;
            a0VarJ4 = a0Var3;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // p038e1.H
    public int e(InterfaceC2244o interfaceC2244o, List list, int i8) {
        return i(interfaceC2244o, list, i8, d.f36280a);
    }

    public final int i(InterfaceC2244o interfaceC2244o, List list, int i8, o oVar) {
        Object obj;
        int iL;
        int iIntValue;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int iIntValue3;
        Object obj5;
        int i9;
        Object obj6;
        Object obj7;
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i10);
            if (t.c(K0.f((InterfaceC2243n) obj), "Leading")) {
                break;
            }
            i10++;
        }
        InterfaceC2243n interfaceC2243n = (InterfaceC2243n) obj;
        if (interfaceC2243n != null) {
            iL = AbstractC3073m0.l(i8, interfaceC2243n.G(Integer.MAX_VALUE));
            iIntValue = ((Number) oVar.invoke(interfaceC2243n, Integer.valueOf(i8))).intValue();
        } else {
            iL = i8;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i11);
            if (t.c(K0.f((InterfaceC2243n) obj2), "Trailing")) {
                break;
            }
            i11++;
        }
        InterfaceC2243n interfaceC2243n2 = (InterfaceC2243n) obj2;
        if (interfaceC2243n2 != null) {
            iL = AbstractC3073m0.l(iL, interfaceC2243n2.G(Integer.MAX_VALUE));
            iIntValue2 = ((Number) oVar.invoke(interfaceC2243n2, Integer.valueOf(i8))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i12);
            if (t.c(K0.f((InterfaceC2243n) obj3), "Label")) {
                break;
            }
            i12++;
        }
        Object obj8 = (InterfaceC2243n) obj3;
        int iIntValue4 = obj8 != null ? ((Number) oVar.invoke(obj8, Integer.valueOf(C1.b.b(iL, i8, this.f36263c)))).intValue() : 0;
        int size4 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i13);
            if (t.c(K0.f((InterfaceC2243n) obj4), "Prefix")) {
                break;
            }
            i13++;
        }
        InterfaceC2243n interfaceC2243n3 = (InterfaceC2243n) obj4;
        if (interfaceC2243n3 != null) {
            iIntValue3 = ((Number) oVar.invoke(interfaceC2243n3, Integer.valueOf(iL))).intValue();
            iL = AbstractC3073m0.l(iL, interfaceC2243n3.G(Integer.MAX_VALUE));
        } else {
            iIntValue3 = 0;
        }
        int size5 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i14);
            if (t.c(K0.f((InterfaceC2243n) obj5), "Suffix")) {
                break;
            }
            i14++;
        }
        InterfaceC2243n interfaceC2243n4 = (InterfaceC2243n) obj5;
        if (interfaceC2243n4 != null) {
            int iIntValue5 = ((Number) oVar.invoke(interfaceC2243n4, Integer.valueOf(iL))).intValue();
            iL = AbstractC3073m0.l(iL, interfaceC2243n4.G(Integer.MAX_VALUE));
            i9 = iIntValue5;
        } else {
            i9 = 0;
        }
        int size6 = list.size();
        for (int i15 = 0; i15 < size6; i15++) {
            Object obj9 = list.get(i15);
            if (t.c(K0.f((InterfaceC2243n) obj9), "TextField")) {
                int iIntValue6 = ((Number) oVar.invoke(obj9, Integer.valueOf(iL))).intValue();
                int size7 = list.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i16);
                    if (t.c(K0.f((InterfaceC2243n) obj6), "Hint")) {
                        break;
                    }
                    i16++;
                }
                Object obj10 = (InterfaceC2243n) obj6;
                int iIntValue7 = obj10 != null ? ((Number) oVar.invoke(obj10, Integer.valueOf(iL))).intValue() : 0;
                int size8 = list.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size8) {
                        obj7 = null;
                        break;
                    }
                    Object obj11 = list.get(i17);
                    if (t.c(K0.f((InterfaceC2243n) obj11), "Supporting")) {
                        obj7 = obj11;
                        break;
                    }
                    i17++;
                }
                Object obj12 = (InterfaceC2243n) obj7;
                return AbstractC3073m0.g(iIntValue, iIntValue2, iIntValue3, i9, iIntValue6, iIntValue4, iIntValue7, obj12 != null ? ((Number) oVar.invoke(obj12, Integer.valueOf(i8))).intValue() : 0, this.f36263c, K0.m(), interfaceC2244o.getDensity(), this.f36264d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final int j(InterfaceC2244o interfaceC2244o, List list, int i8, o oVar) {
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
                    if (t.c(K0.f((InterfaceC2243n) obj4), "Leading")) {
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
                    if (t.c(K0.f((InterfaceC2243n) obj5), "Prefix")) {
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
                    if (t.c(K0.f((InterfaceC2243n) obj6), "Suffix")) {
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
                return AbstractC3073m0.h(iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue, iIntValue2, interfaceC2243n6 != null ? ((Number) oVar.invoke(interfaceC2243n6, Integer.valueOf(i8))).intValue() : 0, this.f36263c, K0.m(), interfaceC2244o.getDensity(), this.f36264d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
