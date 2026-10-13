package p100l0;

import A1.n;
import A1.o;
import D6.C0941v;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import p010b0.B;
import p010b0.u;
import p010b0.v;
import p010b0.z;
import p017b7.J;
import p109m0.C2668f;
import p109m0.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f29008c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f29006a = z.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t f29007b = t.f29452a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f29009d = B.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f29010e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f29011f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f29012g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f29013h = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t f29014a;

        public a(t tVar) {
            this.f29014a = tVar;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return F6.a.a(Integer.valueOf(this.f29014a.c(((w) obj).g())), Integer.valueOf(this.f29014a.c(((w) obj2).g())));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements Comparator {
        public b() {
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return F6.a.a(Integer.valueOf(l.this.f29007b.c(((w) obj).g())), Integer.valueOf(l.this.f29007b.c(((w) obj2).g())));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t f29016a;

        public c(t tVar) {
            this.f29016a = tVar;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return F6.a.a(Integer.valueOf(this.f29016a.c(((w) obj2).g())), Integer.valueOf(this.f29016a.c(((w) obj).g())));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d implements Comparator {
        public d() {
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return F6.a.a(Integer.valueOf(l.this.f29007b.c(((w) obj2).g())), Integer.valueOf(l.this.f29007b.c(((w) obj).g())));
        }
    }

    public static /* synthetic */ void e(l lVar, w wVar, int i8, C2643d c2643d, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            Object objB = lVar.f29006a.b(wVar.g());
            kotlin.jvm.internal.t.d(objB);
            c2643d = (C2643d) objB;
        }
        lVar.d(wVar, i8, c2643d);
    }

    public final C2668f b(Object obj, int i8) {
        C2643d c2643d;
        C2668f[] c2668fArrA;
        if (this.f29006a.e() || (c2643d = (C2643d) this.f29006a.b(obj)) == null || (c2668fArrA = c2643d.a()) == null) {
            return null;
        }
        return c2668fArrA[i8];
    }

    public final boolean c(w wVar) {
        int iN = wVar.n();
        for (int i8 = 0; i8 < iN; i8++) {
            if (m.c(wVar.m(i8)) != null) {
                return true;
            }
        }
        return false;
    }

    public final void d(w wVar, int i8, C2643d c2643d) {
        long jB = wVar.b();
        long jG = wVar.o() ? n.g(jB, 0, i8, 1, null) : n.g(jB, i8, 0, 2, null);
        for (C2668f c2668f : c2643d.a()) {
            if (c2668f != null) {
                long jB2 = wVar.b();
                long jA = o.a(n.j(jB2) - n.j(jB), n.k(jB2) - n.k(jB));
                c2668f.x(o.a(n.j(jG) + n.j(jA), n.k(jG) + n.k(jA)));
            }
        }
    }

    public final void f(int i8, int i9, int i10, List list, x xVar, F f8, boolean z8, J j8) {
        long j9;
        t tVar;
        long j10;
        long j11;
        int i11;
        long[] jArr;
        Object[] objArr;
        long[] jArr2;
        Object[] objArr2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        C2668f[] c2668fArr;
        long[] jArr3;
        int size = list.size();
        int i18 = 0;
        while (true) {
            if (i18 >= size) {
                if (!this.f29006a.e()) {
                    break;
                }
                g();
                return;
            } else if (c((w) list.get(i18))) {
                break;
            } else {
                i18++;
            }
        }
        int i19 = this.f29008c;
        w wVar = (w) D6.z.k0(list);
        this.f29008c = wVar != null ? wVar.getIndex() : 0;
        t tVar2 = this.f29007b;
        this.f29007b = xVar.d();
        int i20 = z8 ? i10 : i9;
        long jA = z8 ? o.a(0, i8) : o.a(i8, 0);
        u uVar = this.f29006a;
        Object[] objArr3 = uVar.f15647b;
        long[] jArr4 = uVar.f15646a;
        int length = jArr4.length - 2;
        if (length >= 0) {
            int i21 = 0;
            j10 = 128;
            j11 = 255;
            while (true) {
                long j12 = jArr4[i21];
                tVar = tVar2;
                if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i22 = 8 - ((~(i21 - length)) >>> 31);
                    int i23 = 0;
                    while (i23 < i22) {
                        if ((j12 & 255) < 128) {
                            this.f29009d.g(objArr3[(i21 << 3) + i23]);
                        }
                        j12 >>= 8;
                        i23++;
                        jArr4 = jArr4;
                        jA = jA;
                    }
                    jArr3 = jArr4;
                    j9 = jA;
                    if (i22 != 8) {
                        break;
                    }
                } else {
                    jArr3 = jArr4;
                    j9 = jA;
                }
                if (i21 == length) {
                    break;
                }
                i21++;
                tVar2 = tVar;
                jArr4 = jArr3;
                jA = j9;
            }
        } else {
            j9 = jA;
            tVar = tVar2;
            j10 = 128;
            j11 = 255;
        }
        int size2 = list.size();
        int i24 = 0;
        while (true) {
            i11 = -1;
            if (i24 >= size2) {
                break;
            }
            w wVar2 = (w) list.get(i24);
            this.f29009d.p(wVar2.g());
            if (c(wVar2)) {
                C2643d c2643d = (C2643d) this.f29006a.b(wVar2.g());
                if (c2643d == null) {
                    C2643d c2643d2 = new C2643d(wVar2.f(), wVar2.e());
                    c2643d2.f(wVar2, j8);
                    this.f29006a.q(wVar2.g(), c2643d2);
                    int iC = tVar.c(wVar2.g());
                    if (iC == -1 || wVar2.getIndex() == iC) {
                        long jB = wVar2.b();
                        d(wVar2, wVar2.o() ? n.k(jB) : n.j(jB), c2643d2);
                    } else if (iC < i19) {
                        this.f29010e.add(wVar2);
                    } else {
                        this.f29011f.add(wVar2);
                    }
                    i16 = size2;
                    i17 = i19;
                } else {
                    C2668f[] c2668fArrA = c2643d.a();
                    int length2 = c2668fArrA.length;
                    int i25 = 0;
                    while (i25 < length2) {
                        C2668f c2668f = c2668fArrA[i25];
                        int i26 = size2;
                        int i27 = i19;
                        if (c2668f != null) {
                            c2668fArr = c2668fArrA;
                            if (!n.i(c2668f.n(), C2668f.f29376m.a())) {
                                long jN = c2668f.n();
                                c2668f.x(o.a(n.j(jN) + n.j(j9), n.k(jN) + n.k(j9)));
                            }
                        } else {
                            c2668fArr = c2668fArrA;
                        }
                        i25++;
                        i19 = i27;
                        size2 = i26;
                        c2668fArrA = c2668fArr;
                    }
                    i16 = size2;
                    i17 = i19;
                    c2643d.e(wVar2.f());
                    c2643d.d(wVar2.e());
                    h(wVar2);
                }
            } else {
                i16 = size2;
                i17 = i19;
                this.f29006a.n(wVar2.g());
            }
            i24++;
            i19 = i17;
            size2 = i16;
        }
        List list2 = this.f29010e;
        if (list2.size() > 1) {
            C0941v.C(list2, new c(tVar));
        }
        List list3 = this.f29010e;
        int size3 = list3.size();
        int i28 = -1;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        while (i31 < size3) {
            w wVar3 = (w) list3.get(i31);
            int iA = z8 ? wVar3.a() : wVar3.c();
            if (iA == -1 || iA != i28) {
                i30 += i29;
                i14 = wVar3.i();
                i15 = iA;
            } else {
                i15 = i28;
                i14 = Math.max(i29, wVar3.i());
            }
            int i32 = i30;
            e(this, wVar3, (0 - i32) - wVar3.i(), null, 4, null);
            h(wVar3);
            i31++;
            i28 = i15;
            i29 = i14;
            i30 = i32;
        }
        List list4 = this.f29011f;
        if (list4.size() > 1) {
            C0941v.C(list4, new a(tVar));
        }
        List list5 = this.f29011f;
        int size4 = list5.size();
        int i33 = -1;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        while (i36 < size4) {
            w wVar4 = (w) list5.get(i36);
            int iA2 = z8 ? wVar4.a() : wVar4.c();
            if (iA2 == -1 || iA2 != i33) {
                i35 += i34;
                i12 = wVar4.i();
                i13 = iA2;
            } else {
                i13 = i33;
                i12 = Math.max(i34, wVar4.i());
            }
            int i37 = i35;
            e(this, wVar4, i20 + i37, null, 4, null);
            h(wVar4);
            i36++;
            i33 = i13;
            i34 = i12;
            i35 = i37;
        }
        v vVar = this.f29009d;
        Object[] objArr4 = vVar.f15564b;
        long[] jArr5 = vVar.f15563a;
        int length3 = jArr5.length - 2;
        if (length3 >= 0) {
            int i38 = 0;
            while (true) {
                long j13 = jArr5[i38];
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i39 = 8 - ((~(i38 - length3)) >>> 31);
                    int i40 = 0;
                    while (i40 < i39) {
                        if ((j13 & j11) < j10) {
                            Object obj = objArr4[(i38 << 3) + i40];
                            Object objB = this.f29006a.b(obj);
                            kotlin.jvm.internal.t.d(objB);
                            C2643d c2643d3 = (C2643d) objB;
                            jArr2 = jArr5;
                            int iC2 = this.f29007b.c(obj);
                            if (iC2 == i11) {
                                this.f29006a.n(obj);
                            } else {
                                w wVarC = x.c(xVar, iC2, 0, z8 ? A1.b.f422b.e(c2643d3.c()) : A1.b.f422b.d(c2643d3.c()), 2, null);
                                objArr2 = objArr4;
                                wVarC.s(true);
                                C2668f[] c2668fArrA2 = c2643d3.a();
                                int length4 = c2668fArrA2.length;
                                int i41 = 0;
                                while (true) {
                                    if (i41 < length4) {
                                        C2668f c2668f2 = c2668fArrA2[i41];
                                        int i42 = length4;
                                        if (c2668f2 != null && c2668f2.q()) {
                                        }
                                        i41++;
                                        length4 = i42;
                                    } else if (iC2 == tVar.c(obj)) {
                                        this.f29006a.n(obj);
                                    }
                                    if (iC2 < this.f29008c) {
                                        this.f29012g.add(wVarC);
                                    } else {
                                        this.f29013h.add(wVarC);
                                    }
                                }
                            }
                            j13 >>= 8;
                            i40++;
                            jArr5 = jArr2;
                            objArr4 = objArr2;
                            i11 = -1;
                        } else {
                            jArr2 = jArr5;
                        }
                        objArr2 = objArr4;
                        j13 >>= 8;
                        i40++;
                        jArr5 = jArr2;
                        objArr4 = objArr2;
                        i11 = -1;
                    }
                    jArr = jArr5;
                    objArr = objArr4;
                    if (i39 != 8) {
                        break;
                    }
                } else {
                    jArr = jArr5;
                    objArr = objArr4;
                }
                if (i38 == length3) {
                    break;
                }
                i38++;
                jArr5 = jArr;
                objArr4 = objArr;
                i11 = -1;
            }
        }
        List list6 = this.f29012g;
        if (list6.size() > 1) {
            C0941v.C(list6, new d());
        }
        List list7 = this.f29012g;
        int size5 = list7.size();
        int i43 = -1;
        int i44 = 0;
        int i45 = 0;
        for (int i46 = 0; i46 < size5; i46++) {
            w wVar5 = (w) list7.get(i46);
            int iD = f8.d(wVar5.getIndex());
            if (iD == -1 || iD != i43) {
                i45 += i44;
                i44 = wVar5.i();
                i43 = iD;
            } else {
                i44 = Math.max(i44, wVar5.i());
            }
            int i47 = (0 - i45) - wVar5.i();
            Object objB2 = this.f29006a.b(wVar5.g());
            kotlin.jvm.internal.t.d(objB2);
            w.r(wVar5, i47, ((C2643d) objB2).b(), i9, i10, 0, 0, 48, null);
            list.add(wVar5);
            h(wVar5);
        }
        List list8 = this.f29013h;
        if (list8.size() > 1) {
            C0941v.C(list8, new b());
        }
        List list9 = this.f29013h;
        int size6 = list9.size();
        int i48 = 0;
        int i49 = -1;
        int i50 = 0;
        for (int i51 = 0; i51 < size6; i51++) {
            w wVar6 = (w) list9.get(i51);
            int iD2 = f8.d(wVar6.getIndex());
            if (iD2 == -1 || iD2 != i49) {
                i50 += i48;
                i48 = wVar6.i();
                i49 = iD2;
            } else {
                i48 = Math.max(i48, wVar6.i());
            }
            Object objB3 = this.f29006a.b(wVar6.g());
            kotlin.jvm.internal.t.d(objB3);
            w.r(wVar6, i20 + i50, ((C2643d) objB3).b(), i9, i10, 0, 0, 48, null);
            list.add(wVar6);
            h(wVar6);
        }
        this.f29010e.clear();
        this.f29011f.clear();
        this.f29012g.clear();
        this.f29013h.clear();
        this.f29009d.i();
    }

    public final void g() {
        this.f29006a.h();
        this.f29007b = t.f29452a;
        this.f29008c = -1;
    }

    public final void h(w wVar) {
        Object objB = this.f29006a.b(wVar.g());
        kotlin.jvm.internal.t.d(objB);
        for (C2668f c2668f : ((C2643d) objB).a()) {
            if (c2668f != null) {
                long jB = wVar.b();
                long jN = c2668f.n();
                if (!n.i(jN, C2668f.f29376m.a()) && !n.i(jN, jB)) {
                    c2668f.i(o.a(n.j(jB) - n.j(jN), n.k(jB) - n.k(jN)));
                }
                c2668f.x(jB);
            }
        }
    }
}
