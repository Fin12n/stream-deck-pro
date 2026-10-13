package p091k0;

import A1.n;
import A1.o;
import C6.G;
import D6.C0941v;
import D6.M;
import D6.y;
import D6.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import p017b7.J;
import p109m0.C2668f;
import p109m0.C2670h;
import p109m0.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t f28414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28415c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f28413a = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f28416d = new LinkedHashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f28417e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f28418f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f28419g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f28420h = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public C2668f[] f28421a = k.f28426a;

        public final C2668f[] a() {
            return this.f28421a;
        }

        public final void b(t tVar, J j8) {
            int length = this.f28421a.length;
            for (int i8 = tVar.i(); i8 < length; i8++) {
                C2668f c2668f = this.f28421a[i8];
                if (c2668f != null) {
                    c2668f.z();
                }
            }
            if (this.f28421a.length != tVar.i()) {
                Object[] objArrCopyOf = Arrays.copyOf(this.f28421a, tVar.i());
                kotlin.jvm.internal.t.f(objArrCopyOf, "copyOf(this, newSize)");
                this.f28421a = (C2668f[]) objArrCopyOf;
            }
            int i9 = tVar.i();
            for (int i10 = 0; i10 < i9; i10++) {
                C2670h c2670hC = k.c(tVar.h(i10));
                if (c2670hC == null) {
                    C2668f c2668f2 = this.f28421a[i10];
                    if (c2668f2 != null) {
                        c2668f2.z();
                    }
                    this.f28421a[i10] = null;
                } else {
                    C2668f c2668f3 = this.f28421a[i10];
                    if (c2668f3 == null) {
                        c2668f3 = new C2668f(j8);
                        this.f28421a[i10] = c2668f3;
                    }
                    c2668f3.s(c2670hC.d2());
                    c2668f3.w(c2670hC.e2());
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t f28422a;

        public b(t tVar) {
            this.f28422a = tVar;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return F6.a.a(Integer.valueOf(this.f28422a.c(((t) obj).c())), Integer.valueOf(this.f28422a.c(((t) obj2).c())));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t f28423a;

        public c(t tVar) {
            this.f28423a = tVar;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return F6.a.a(Integer.valueOf(this.f28423a.c(((t) obj).c())), Integer.valueOf(this.f28423a.c(((t) obj2).c())));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t f28424a;

        public d(t tVar) {
            this.f28424a = tVar;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return F6.a.a(Integer.valueOf(this.f28424a.c(((t) obj2).c())), Integer.valueOf(this.f28424a.c(((t) obj).c())));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t f28425a;

        public e(t tVar) {
            this.f28425a = tVar;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return F6.a.a(Integer.valueOf(this.f28425a.c(((t) obj2).c())), Integer.valueOf(this.f28425a.c(((t) obj).c())));
        }
    }

    public static /* synthetic */ void d(j jVar, t tVar, int i8, a aVar, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            aVar = (a) M.h(jVar.f28413a, tVar.c());
        }
        jVar.c(tVar, i8, aVar);
    }

    public final C2668f a(Object obj, int i8) {
        C2668f[] c2668fArrA;
        a aVar = (a) this.f28413a.get(obj);
        if (aVar == null || (c2668fArrA = aVar.a()) == null) {
            return null;
        }
        return c2668fArrA[i8];
    }

    public final boolean b(t tVar) {
        int i8 = tVar.i();
        for (int i9 = 0; i9 < i8; i9++) {
            if (k.c(tVar.h(i9)) != null) {
                return true;
            }
        }
        return false;
    }

    public final void c(t tVar, int i8, a aVar) {
        int i9 = 0;
        long jG = tVar.g(0);
        long jG2 = tVar.l() ? n.g(jG, 0, i8, 1, null) : n.g(jG, i8, 0, 2, null);
        C2668f[] c2668fArrA = aVar.a();
        int length = c2668fArrA.length;
        int i10 = 0;
        while (i9 < length) {
            C2668f c2668f = c2668fArrA[i9];
            int i11 = i10 + 1;
            if (c2668f != null) {
                long jG3 = tVar.g(i10);
                long jA = o.a(n.j(jG3) - n.j(jG), n.k(jG3) - n.k(jG));
                c2668f.x(o.a(n.j(jG2) + n.j(jA), n.k(jG2) + n.k(jA)));
            }
            i9++;
            i10 = i11;
        }
    }

    public final void e(int i8, int i9, int i10, List list, u uVar, boolean z8, boolean z9, boolean z10, J j8) {
        int offset;
        Iterator it;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        t tVar = this.f28414b;
        t tVarD = uVar.d();
        this.f28414b = tVarD;
        int size = list.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size) {
                if (!this.f28413a.isEmpty()) {
                    break;
                }
                f();
                return;
            } else if (b((t) list.get(i16))) {
                break;
            } else {
                i16++;
            }
        }
        int i17 = this.f28415c;
        t tVar2 = (t) z.k0(list);
        this.f28415c = tVar2 != null ? tVar2.getIndex() : 0;
        int i18 = z8 ? i10 : i9;
        long jA = z8 ? o.a(0, i8) : o.a(i8, 0);
        boolean z11 = z9 || !z10;
        this.f28416d.addAll(this.f28413a.keySet());
        int size2 = list.size();
        long j9 = jA;
        int i19 = 0;
        while (i19 < size2) {
            t tVar3 = (t) list.get(i19);
            this.f28416d.remove(tVar3.c());
            if (b(tVar3)) {
                a aVar = (a) this.f28413a.get(tVar3.c());
                if (aVar == null) {
                    a aVar2 = new a();
                    aVar2.b(tVar3, j8);
                    this.f28413a.put(tVar3.c(), aVar2);
                    int iC = tVar != null ? tVar.c(tVar3.c()) : -1;
                    if (tVar3.getIndex() == iC || iC == -1) {
                        long jG = tVar3.g(0);
                        c(tVar3, tVar3.l() ? n.k(jG) : n.j(jG), aVar2);
                        if (iC == -1 && tVar != null) {
                            for (C2668f c2668f : aVar2.a()) {
                                if (c2668f != null) {
                                    c2668f.h();
                                }
                            }
                        }
                    } else if (iC < i17) {
                        this.f28417e.add(tVar3);
                    } else {
                        this.f28418f.add(tVar3);
                    }
                } else if (z11) {
                    aVar.b(tVar3, j8);
                    C2668f[] c2668fArrA = aVar.a();
                    int length = c2668fArrA.length;
                    int i20 = 0;
                    while (i20 < length) {
                        int i21 = size2;
                        C2668f c2668f2 = c2668fArrA[i20];
                        int i22 = i17;
                        if (c2668f2 != null) {
                            i14 = length;
                            i15 = i18;
                            if (!n.i(c2668f2.n(), C2668f.f29376m.a())) {
                                long jN = c2668f2.n();
                                c2668f2.x(o.a(n.j(jN) + n.j(j9), n.k(jN) + n.k(j9)));
                            }
                        } else {
                            i14 = length;
                            i15 = i18;
                        }
                        i20++;
                        size2 = i21;
                        length = i14;
                        i17 = i22;
                        i18 = i15;
                    }
                    i11 = size2;
                    i12 = i17;
                    i13 = i18;
                    g(tVar3);
                }
                i11 = size2;
                i12 = i17;
                i13 = i18;
            } else {
                i11 = size2;
                i12 = i17;
                i13 = i18;
                this.f28413a.remove(tVar3.c());
            }
            i19++;
            size2 = i11;
            i17 = i12;
            i18 = i13;
        }
        int i23 = i18;
        int i24 = -1;
        if (z11 && tVar != null) {
            List list2 = this.f28417e;
            if (list2.size() > 1) {
                C0941v.C(list2, new d(tVar));
            }
            List list3 = this.f28417e;
            int size3 = list3.size();
            int i25 = 0;
            int i26 = 0;
            while (i26 < size3) {
                t tVar4 = (t) list3.get(i26);
                int iJ = i25 + tVar4.j();
                d(this, tVar4, 0 - iJ, null, 4, null);
                g(tVar4);
                i26++;
                i25 = iJ;
            }
            List list4 = this.f28418f;
            if (list4.size() > 1) {
                C0941v.C(list4, new b(tVar));
            }
            List list5 = this.f28418f;
            int size4 = list5.size();
            int i27 = 0;
            int i28 = 0;
            while (i28 < size4) {
                t tVar5 = (t) list5.get(i28);
                int i29 = i27;
                int iJ2 = i29 + tVar5.j();
                d(this, tVar5, i23 + i29, null, 4, null);
                g(tVar5);
                i28++;
                i27 = iJ2;
            }
        }
        Iterator it2 = this.f28416d.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            int iC2 = tVarD.c(next);
            if (iC2 == i24) {
                this.f28413a.remove(next);
                it = it2;
            } else {
                t tVarB = uVar.b(iC2);
                boolean z12 = true;
                tVarB.o(true);
                C2668f[] c2668fArrA2 = ((a) M.h(this.f28413a, next)).a();
                int length2 = c2668fArrA2.length;
                int i30 = 0;
                while (true) {
                    if (i30 < length2) {
                        C2668f c2668f3 = c2668fArrA2[i30];
                        it = it2;
                        if (c2668f3 == null || c2668f3.q() != z12) {
                            i30++;
                            it2 = it;
                            z12 = true;
                        }
                    } else {
                        it = it2;
                        if (tVar != null && iC2 == tVar.c(next)) {
                            this.f28413a.remove(next);
                        }
                    }
                    if (iC2 < this.f28415c) {
                        this.f28419g.add(tVarB);
                    } else {
                        this.f28420h.add(tVarB);
                    }
                }
            }
            it2 = it;
            i24 = -1;
        }
        List list6 = this.f28419g;
        if (list6.size() > 1) {
            C0941v.C(list6, new e(tVarD));
        }
        List list7 = this.f28419g;
        int size5 = list7.size();
        int iJ3 = 0;
        for (int i31 = 0; i31 < size5; i31++) {
            t tVar6 = (t) list7.get(i31);
            iJ3 += tVar6.j();
            tVar6.n(z9 ? ((t) z.i0(list)).getOffset() - iJ3 : 0 - iJ3, i9, i10);
            if (z11) {
                g(tVar6);
            }
        }
        List list8 = this.f28420h;
        if (list8.size() > 1) {
            C0941v.C(list8, new c(tVarD));
        }
        List list9 = this.f28420h;
        int size6 = list9.size();
        int iJ4 = 0;
        for (int i32 = 0; i32 < size6; i32++) {
            t tVar7 = (t) list9.get(i32);
            if (z9) {
                t tVar8 = (t) z.t0(list);
                offset = tVar8.getOffset() + tVar8.j() + iJ4;
            } else {
                offset = i23 + iJ4;
            }
            iJ4 += tVar7.j();
            tVar7.n(offset, i9, i10);
            if (z11) {
                g(tVar7);
            }
        }
        List list10 = this.f28419g;
        y.Y(list10);
        G g8 = G.f1419a;
        list.addAll(0, list10);
        list.addAll(this.f28420h);
        this.f28417e.clear();
        this.f28418f.clear();
        this.f28419g.clear();
        this.f28420h.clear();
        this.f28416d.clear();
    }

    public final void f() {
        this.f28413a.clear();
        this.f28414b = t.f29452a;
        this.f28415c = -1;
    }

    public final void g(t tVar) {
        C2668f[] c2668fArrA = ((a) M.h(this.f28413a, tVar.c())).a();
        int length = c2668fArrA.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            C2668f c2668f = c2668fArrA[i8];
            int i10 = i9 + 1;
            if (c2668f != null) {
                long jG = tVar.g(i9);
                long jN = c2668f.n();
                if (!n.i(jN, C2668f.f29376m.a()) && !n.i(jN, jG)) {
                    c2668f.i(o.a(n.j(jG) - n.j(jN), n.k(jG) - n.k(jN)));
                }
                c2668f.x(jG);
            }
            i8++;
            i9 = i10;
        }
    }
}
