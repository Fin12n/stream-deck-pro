package p100l0;

import A1.d;
import A1.t;
import C6.G;
import D6.C0930j;
import D6.C0934n;
import D6.r;
import D6.w;
import Q6.k;
import Q6.p;
import S6.c;
import W6.g;
import W6.n;
import java.util.ArrayList;
import java.util.List;
import p017b7.J;
import p038e1.I;
import p038e1.a0;
import p055g0.B;
import p082j0.C2598b;
import p109m0.L;
import p215z0.InterfaceC3164l0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends kotlin.jvm.internal.u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f29070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3164l0 f29071b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List list, InterfaceC3164l0 interfaceC3164l0) {
            super(1);
            this.f29070a = list;
            this.f29071b = interfaceC3164l0;
        }

        public final void b(a0.a aVar) {
            List list = this.f29070a;
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                ((w) list.get(i8)).p(aVar);
            }
            L.a(this.f29071b);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((a0.a) obj);
            return G.f1419a;
        }
    }

    public static final List a(List list, List list2, List list3, int i8, int i9, int i10, int i11, int i12, boolean z8, C2598b.l lVar, C2598b.d dVar, boolean z9, d dVar2) {
        int i13 = i9;
        int i14 = z8 ? i13 : i8;
        int i15 = 0;
        boolean z10 = i10 < Math.min(i14, i11);
        if (z10 && i12 != 0) {
            throw new IllegalStateException("non-zero firstLineScrollOffset");
        }
        int size = list.size();
        int length = 0;
        for (int i16 = 0; i16 < size; i16++) {
            length += ((y) list.get(i16)).b().length;
        }
        ArrayList arrayList = new ArrayList(length);
        if (!z10) {
            int size2 = list2.size() - 1;
            if (size2 >= 0) {
                int iK = i12;
                while (true) {
                    int i17 = size2 - 1;
                    w wVar = (w) list2.get(size2);
                    iK -= wVar.k();
                    w.r(wVar, iK, 0, i8, i13, 0, 0, 48, null);
                    arrayList.add(wVar);
                    if (i17 < 0) {
                        break;
                    }
                    size2 = i17;
                }
            }
            int size3 = list.size();
            int iD = i12;
            for (int i18 = 0; i18 < size3; i18++) {
                y yVar = (y) list.get(i18);
                w.F(arrayList, yVar.f(iD, i8, i13));
                iD += yVar.d();
            }
            int size4 = list3.size();
            int iK2 = iD;
            while (i15 < size4) {
                w wVar2 = (w) list3.get(i15);
                w.r(wVar2, iK2, 0, i8, i13, 0, 0, 48, null);
                arrayList.add(wVar2);
                iK2 += wVar2.k();
                i15++;
                i13 = i9;
            }
        } else {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                throw new IllegalArgumentException("no items");
            }
            int size5 = list.size();
            int[] iArr = new int[size5];
            for (int i19 = 0; i19 < size5; i19++) {
                iArr[i19] = ((y) list.get(b(i19, z9, size5))).c();
            }
            int[] iArr2 = new int[size5];
            for (int i20 = 0; i20 < size5; i20++) {
                iArr2[i20] = 0;
            }
            if (z8) {
                if (lVar == null) {
                    throw new IllegalArgumentException("null verticalArrangement");
                }
                lVar.b(dVar2, i14, iArr, iArr2);
            } else {
                if (dVar == null) {
                    throw new IllegalArgumentException("null horizontalArrangement");
                }
                dVar.c(dVar2, i14, iArr, t.Ltr, iArr2);
            }
            g gVarP = C0934n.P(iArr2);
            if (z9) {
                gVarP = n.s(gVarP);
            }
            int iS = gVarP.s();
            int iT = gVarP.t();
            int iU = gVarP.u();
            if ((iU > 0 && iS <= iT) || (iU < 0 && iT <= iS)) {
                while (true) {
                    int iC = iArr2[iS];
                    y yVar2 = (y) list.get(b(iS, z9, size5));
                    if (z9) {
                        iC = (i14 - iC) - yVar2.c();
                    }
                    w.F(arrayList, yVar2.f(iC, i8, i13));
                    if (iS == iT) {
                        break;
                    }
                    iS += iU;
                }
            }
        }
        return arrayList;
    }

    public static final int b(int i8, boolean z8, int i9) {
        return !z8 ? i8 : (i9 - i8) - 1;
    }

    public static final v c(int i8, z zVar, x xVar, int i9, int i10, int i11, int i12, int i13, int i14, float f8, long j8, boolean z8, C2598b.l lVar, C2598b.d dVar, boolean z9, d dVar2, l lVar2, F f9, List list, J j9, InterfaceC3164l0 interfaceC3164l0, p pVar) {
        boolean z10;
        int i15;
        int i16;
        y yVar;
        List list2;
        B b8;
        w[] wVarArrB;
        w wVar;
        int i17;
        int i18;
        List list3 = list;
        if (i10 < 0) {
            throw new IllegalArgumentException("negative beforeContentPadding");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("negative afterContentPadding");
        }
        if (i8 <= 0) {
            return new v(null, 0, false, 0.0f, (I) pVar.invoke(Integer.valueOf(A1.b.p(j8)), Integer.valueOf(A1.b.o(j8)), a.f29069a), false, r.n(), -i10, i9 + i11, 0, z9, z8 ? B.Vertical : B.Horizontal, i11, i12);
        }
        int iD = c.d(f8);
        int i19 = i14 - iD;
        if (i13 == 0 && i19 < 0) {
            iD += i19;
            i19 = 0;
        }
        C0930j c0930j = new C0930j();
        int i20 = i19;
        int i21 = -i10;
        int i22 = (i12 < 0 ? i12 : 0) + i21;
        int iD2 = i20 + i22;
        int i23 = i13;
        while (iD2 < 0 && i23 > 0) {
            i23--;
            y yVarC = zVar.c(i23);
            c0930j.add(0, yVarC);
            iD2 += yVarC.d();
        }
        if (iD2 < i22) {
            iD += iD2;
            iD2 = i22;
        }
        int iD3 = iD2 - i22;
        int i24 = i9 + i11;
        int i25 = iD;
        int iD4 = n.d(i24, 0);
        int iD5 = -iD3;
        int i26 = i23;
        int i27 = 0;
        boolean z11 = false;
        while (true) {
            z10 = true;
            if (i27 >= c0930j.size()) {
                break;
            }
            if (iD5 >= iD4) {
                c0930j.remove(i27);
                z11 = true;
            } else {
                i26++;
                iD5 += ((y) c0930j.get(i27)).d();
                i27++;
            }
        }
        int i28 = i26;
        boolean z12 = z11;
        int i29 = i26;
        while (i28 < i8 && (iD5 < iD4 || iD5 <= 0 || c0930j.isEmpty())) {
            int i30 = iD4;
            y yVarC2 = zVar.c(i28);
            if (yVarC2.e()) {
                break;
            }
            int iD6 = iD5 + yVarC2.d();
            if (iD6 <= i22) {
                i17 = i28;
                i18 = iD6;
                if (((w) C0934n.h0(yVarC2.b())).getIndex() != i8 - 1) {
                    iD3 -= yVarC2.d();
                    i29 = i17 + 1;
                    z12 = true;
                }
                i28 = i17 + 1;
                iD4 = i30;
                iD5 = i18;
            } else {
                i17 = i28;
                i18 = iD6;
            }
            c0930j.add(yVarC2);
            i28 = i17 + 1;
            iD4 = i30;
            iD5 = i18;
        }
        if (iD5 < i9) {
            int i31 = i9 - iD5;
            iD3 -= i31;
            iD5 += i31;
            while (iD3 < i10 && i29 > 0) {
                i29--;
                y yVarC3 = zVar.c(i29);
                c0930j.add(0, yVarC3);
                iD3 += yVarC3.d();
            }
            i15 = 0;
            i16 = i25 + i31;
            if (iD3 < 0) {
                i16 += iD3;
                iD5 += iD3;
                iD3 = 0;
            }
        } else {
            i15 = 0;
            i16 = i25;
        }
        float f10 = (c.a(c.d(f8)) != c.a(i16) || Math.abs(c.d(f8)) < Math.abs(i16)) ? f8 : i16;
        if (iD3 < 0) {
            throw new IllegalArgumentException("negative initial offset");
        }
        int i32 = -iD3;
        y yVar2 = (y) c0930j.first();
        w wVar2 = (w) C0934n.O(yVar2.b());
        int index = wVar2 != null ? wVar2.getIndex() : i15;
        y yVar3 = (y) c0930j.F();
        int index2 = (yVar3 == null || (wVarArrB = yVar3.b()) == null || (wVar = (w) C0934n.j0(wVarArrB)) == null) ? i15 : wVar.getIndex();
        int size = list3.size();
        List listN = null;
        List listN2 = null;
        int i33 = 0;
        while (i33 < size) {
            int i34 = i33;
            int iIntValue = ((Number) list3.get(i33)).intValue();
            if (iIntValue >= 0 && iIntValue < index) {
                w wVarC = x.c(xVar, iIntValue, 0, zVar.d(iIntValue), 2, null);
                if (listN2 == null) {
                    listN2 = new ArrayList();
                }
                List list4 = listN2;
                list4.add(wVarC);
                listN2 = list4;
            }
            i33 = i34 + 1;
            yVar2 = yVar2;
        }
        y yVar4 = yVar2;
        if (listN2 == null) {
            listN2 = r.n();
        }
        List list5 = listN2;
        int size2 = list3.size();
        int i35 = 0;
        while (i35 < size2) {
            int iIntValue2 = ((Number) list3.get(i35)).intValue();
            int i36 = size2;
            if (index2 + 1 <= iIntValue2 && iIntValue2 < i8) {
                w wVarC2 = x.c(xVar, iIntValue2, 0, zVar.d(iIntValue2), 2, null);
                if (listN == null) {
                    listN = new ArrayList();
                }
                List list6 = listN;
                list6.add(wVarC2);
                listN = list6;
            }
            i35++;
            size2 = i36;
            list3 = list;
        }
        if (listN == null) {
            listN = r.n();
        }
        List list7 = listN;
        if (i10 > 0 || i12 < 0) {
            int size3 = c0930j.size();
            yVar = yVar4;
            int i37 = 0;
            while (i37 < size3) {
                int i38 = size3;
                int iD7 = ((y) c0930j.get(i37)).d();
                if (iD3 == 0 || iD7 > iD3 || i37 == r.p(c0930j)) {
                    break;
                }
                iD3 -= iD7;
                i37++;
                yVar = (y) c0930j.get(i37);
                size3 = i38;
            }
        } else {
            yVar = yVar4;
        }
        int i39 = iD3;
        int iN = z8 ? A1.b.n(j8) : A1.c.g(j8, iD5);
        int i40 = iD5;
        int iF = z8 ? A1.c.f(j8, iD5) : A1.b.m(j8);
        List listA = a(c0930j, list5, list7, iN, iF, i40, i9, i32, z8, lVar, dVar, z9, dVar2);
        lVar2.f((int) f10, iN, iF, listA, xVar, f9, z8, j9);
        if (index2 == i8 - 1 && i40 <= i9) {
            z10 = false;
        }
        I i41 = (I) pVar.invoke(Integer.valueOf(iN), Integer.valueOf(iF), new b(listA, interfaceC3164l0));
        if (!list5.isEmpty() || !list7.isEmpty()) {
            ArrayList arrayList = new ArrayList(listA.size());
            int size4 = listA.size();
            for (int i42 = 0; i42 < size4; i42++) {
                Object obj = listA.get(i42);
                int index3 = ((w) obj).getIndex();
                if (index <= index3 && index3 <= index2) {
                    arrayList.add(obj);
                }
            }
            list2 = arrayList;
        }
        if (z8) {
            list2 = listA;
            b8 = B.Vertical;
        } else {
            list2 = listA;
            b8 = B.Horizontal;
        }
        return new v(yVar, i39, z10, f10, i41, z12, list2, i21, i24, i8, z9, b8, i11, i12);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends kotlin.jvm.internal.u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f29069a = new a();

        public a() {
            super(1);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((a0.a) obj);
            return G.f1419a;
        }

        public final void b(a0.a aVar) {
        }
    }
}
