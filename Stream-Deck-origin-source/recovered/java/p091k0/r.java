package p091k0;

import A1.d;
import A1.t;
import C6.G;
import D6.C0930j;
import D6.C0934n;
import D6.z;
import Q6.k;
import Q6.p;
import S6.c;
import W6.g;
import W6.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.u;
import p017b7.J;
import p038e1.I;
import p038e1.a0;
import p055g0.B;
import p082j0.C2598b;
import p109m0.L;
import p215z0.InterfaceC3164l0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f28483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t f28484b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f28485c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3164l0 f28486d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List list, t tVar, boolean z8, InterfaceC3164l0 interfaceC3164l0) {
            super(1);
            this.f28483a = list;
            this.f28484b = tVar;
            this.f28485c = z8;
            this.f28486d = interfaceC3164l0;
        }

        public final void b(a0.a aVar) {
            List list = this.f28483a;
            t tVar = this.f28484b;
            boolean z8 = this.f28485c;
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                t tVar2 = (t) list.get(i8);
                if (tVar2 != tVar) {
                    tVar2.m(aVar, z8);
                }
            }
            t tVar3 = this.f28484b;
            if (tVar3 != null) {
                tVar3.m(aVar, this.f28485c);
            }
            L.a(this.f28486d);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((a0.a) obj);
            return G.f1419a;
        }
    }

    public static final List a(List list, List list2, List list3, int i8, int i9, int i10, int i11, int i12, boolean z8, C2598b.l lVar, C2598b.d dVar, boolean z9, d dVar2) {
        int i13 = z8 ? i9 : i8;
        boolean z10 = i10 < Math.min(i13, i11);
        if (z10 && i12 != 0) {
            throw new IllegalStateException("non-zero itemsScrollOffset");
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (!z10) {
            int size = list2.size();
            int iJ = i12;
            for (int i14 = 0; i14 < size; i14++) {
                t tVar = (t) list2.get(i14);
                iJ -= tVar.j();
                tVar.n(iJ, i8, i9);
                arrayList.add(tVar);
            }
            int size2 = list.size();
            int iJ2 = i12;
            for (int i15 = 0; i15 < size2; i15++) {
                t tVar2 = (t) list.get(i15);
                tVar2.n(iJ2, i8, i9);
                arrayList.add(tVar2);
                iJ2 += tVar2.j();
            }
            int size3 = list3.size();
            for (int i16 = 0; i16 < size3; i16++) {
                t tVar3 = (t) list3.get(i16);
                tVar3.n(iJ2, i8, i9);
                arrayList.add(tVar3);
                iJ2 += tVar3.j();
            }
        } else {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                throw new IllegalArgumentException("no extra items");
            }
            int size4 = list.size();
            int[] iArr = new int[size4];
            for (int i17 = 0; i17 < size4; i17++) {
                iArr[i17] = ((t) list.get(b(i17, z9, size4))).k();
            }
            int[] iArr2 = new int[size4];
            for (int i18 = 0; i18 < size4; i18++) {
                iArr2[i18] = 0;
            }
            if (z8) {
                if (lVar == null) {
                    throw new IllegalArgumentException("null verticalArrangement when isVertical == true");
                }
                lVar.b(dVar2, i13, iArr, iArr2);
            } else {
                if (dVar == null) {
                    throw new IllegalArgumentException("null horizontalArrangement when isVertical == false");
                }
                dVar.c(dVar2, i13, iArr, t.Ltr, iArr2);
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
                    int iK = iArr2[iS];
                    t tVar4 = (t) list.get(b(iS, z9, size4));
                    if (z9) {
                        iK = (i13 - iK) - tVar4.k();
                    }
                    tVar4.n(iK, i8, i9);
                    arrayList.add(tVar4);
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

    public static final List c(List list, u uVar, int i8, int i9, List list2, float f8, boolean z8, q qVar) {
        l lVar;
        t tVar;
        Object obj;
        int iJ;
        Object obj2;
        int index;
        int iMin;
        t tVar2;
        Object obj3;
        int i10 = i8 - 1;
        int iMin2 = Math.min(((t) z.t0(list)).getIndex() + i9, i10);
        int index2 = ((t) z.t0(list)).getIndex() + 1;
        ArrayList arrayList = null;
        if (index2 <= iMin2) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(uVar.b(index2));
                if (index2 == iMin2) {
                    break;
                }
                index2++;
            }
        }
        if (z8 && qVar != null && !qVar.b().isEmpty()) {
            List listB = qVar.b();
            int size = listB.size();
            while (true) {
                size--;
                if (-1 >= size) {
                    lVar = null;
                    break;
                }
                if (((l) listB.get(size)).getIndex() > iMin2 && (size == 0 || ((l) listB.get(size - 1)).getIndex() <= iMin2)) {
                    lVar = (l) listB.get(size);
                    break;
                }
            }
            l lVar2 = (l) z.t0(qVar.b());
            if (lVar != null && (index = lVar.getIndex()) <= (iMin = Math.min(lVar2.getIndex(), i10))) {
                while (true) {
                    if (arrayList != null) {
                        int size2 = arrayList.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 >= size2) {
                                obj3 = null;
                                break;
                            }
                            obj3 = arrayList.get(i11);
                            if (((t) obj3).getIndex() == index) {
                                break;
                            }
                            i11++;
                        }
                        tVar2 = (t) obj3;
                    } else {
                        tVar2 = null;
                    }
                    if (tVar2 == null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(uVar.b(index));
                    }
                    if (index == iMin) {
                        break;
                    }
                    index++;
                }
            }
            float fE = ((qVar.e() - lVar2.getOffset()) - lVar2.k()) - f8;
            if (fE > 0.0f) {
                int index3 = lVar2.getIndex() + 1;
                int i12 = 0;
                while (index3 < i8 && i12 < fE) {
                    if (index3 <= iMin2) {
                        int size3 = list.size();
                        int i13 = 0;
                        while (true) {
                            if (i13 >= size3) {
                                obj2 = null;
                                break;
                            }
                            obj2 = list.get(i13);
                            if (((t) obj2).getIndex() == index3) {
                                break;
                            }
                            i13++;
                        }
                        tVar = (t) obj2;
                    } else if (arrayList != null) {
                        int size4 = arrayList.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 >= size4) {
                                obj = null;
                                break;
                            }
                            obj = arrayList.get(i14);
                            if (((t) obj).getIndex() == index3) {
                                break;
                            }
                            i14++;
                        }
                        tVar = (t) obj;
                    } else {
                        tVar = null;
                    }
                    if (tVar != null) {
                        index3++;
                        iJ = tVar.j();
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(uVar.b(index3));
                        index3++;
                        iJ = ((t) z.t0(arrayList)).j();
                    }
                    i12 += iJ;
                }
            }
        }
        if (arrayList != null && ((t) z.t0(arrayList)).getIndex() > iMin2) {
            iMin2 = ((t) z.t0(arrayList)).getIndex();
        }
        int size5 = list2.size();
        for (int i15 = 0; i15 < size5; i15++) {
            int iIntValue = ((Number) list2.get(i15)).intValue();
            if (iIntValue > iMin2) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(uVar.b(iIntValue));
            }
        }
        return arrayList == null ? D6.r.n() : arrayList;
    }

    public static final List d(int i8, u uVar, int i9, List list) {
        int iMax = Math.max(0, i8 - i9);
        int i10 = i8 - 1;
        ArrayList arrayList = null;
        if (iMax <= i10) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(uVar.b(i10));
                if (i10 == iMax) {
                    break;
                }
                i10--;
            }
        }
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i11 = size - 1;
                int iIntValue = ((Number) list.get(size)).intValue();
                if (iIntValue < iMax) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(uVar.b(iIntValue));
                }
                if (i11 < 0) {
                    break;
                }
                size = i11;
            }
        }
        return arrayList == null ? D6.r.n() : arrayList;
    }

    public static final s e(int i8, u uVar, int i9, int i10, int i11, int i12, int i13, int i14, float f8, long j8, boolean z8, List list, C2598b.l lVar, C2598b.d dVar, boolean z9, d dVar2, j jVar, int i15, List list2, boolean z10, boolean z11, q qVar, J j9, InterfaceC3164l0 interfaceC3164l0, p pVar) {
        int i16;
        boolean z12;
        int i17;
        int i18;
        int i19;
        int iJ;
        float f9;
        int i20;
        int i21;
        List list3;
        int i22;
        int iJ2;
        int i23 = i10;
        if (i23 < 0) {
            throw new IllegalArgumentException("invalid beforeContentPadding");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("invalid afterContentPadding");
        }
        if (i8 <= 0) {
            int iP = A1.b.p(j8);
            int iO = A1.b.o(j8);
            jVar.e(0, iP, iO, new ArrayList(), uVar, z8, z11, z10, j9);
            return new s(null, 0, false, 0.0f, (I) pVar.invoke(Integer.valueOf(iP), Integer.valueOf(iO), a.f28482a), 0.0f, false, D6.r.n(), -i23, i9 + i11, 0, z9, z8 ? B.Vertical : B.Horizontal, i11, i12);
        }
        int i24 = 0;
        int i25 = i13;
        if (i25 >= i8) {
            i25 = i8 - 1;
            i16 = 0;
        } else {
            i16 = i14;
        }
        int iD = c.d(f8);
        int i26 = i16 - iD;
        if (i25 == 0 && i26 < 0) {
            iD += i26;
            i26 = 0;
        }
        int i27 = i25;
        C0930j c0930j = new C0930j();
        int i28 = -i23;
        int i29 = (i12 < 0 ? i12 : 0) + i28;
        int iJ3 = i26 + i29;
        int iMax = 0;
        while (iJ3 < 0 && i27 > 0) {
            i27--;
            t tVarB = uVar.b(i27);
            c0930j.add(i24, tVarB);
            iMax = Math.max(iMax, tVarB.b());
            iJ3 += tVarB.j();
            i24 = 0;
        }
        if (iJ3 < i29) {
            iD += iJ3;
            iJ3 = i29;
        }
        int i30 = iJ3 - i29;
        int i31 = i9 + i11;
        int i32 = i27;
        int iD2 = n.d(i31, 0);
        int i33 = i32;
        int i34 = iMax;
        int iJ4 = -i30;
        int i35 = 0;
        boolean z13 = false;
        while (true) {
            z12 = true;
            if (i35 >= c0930j.size()) {
                break;
            }
            if (iJ4 >= iD2) {
                c0930j.remove(i35);
                z13 = true;
            } else {
                i33++;
                iJ4 += ((t) c0930j.get(i35)).j();
                i35++;
            }
        }
        int i36 = i32;
        int i37 = i30;
        int i38 = i33;
        int iMax2 = i34;
        while (i38 < i8 && (iJ4 < iD2 || iJ4 <= 0 || c0930j.isEmpty())) {
            int i39 = iD2;
            t tVarB2 = uVar.b(i38);
            int iJ5 = iJ4 + tVarB2.j();
            if (iJ5 <= i29) {
                i22 = iJ5;
                if (i38 != i8 - 1) {
                    iJ2 = i37 - tVarB2.j();
                    i36 = i38 + 1;
                    z13 = true;
                }
                i38++;
                i37 = iJ2;
                iD2 = i39;
                iJ4 = i22;
            } else {
                i22 = iJ5;
            }
            int iMax3 = Math.max(iMax2, tVarB2.b());
            c0930j.add(tVarB2);
            iJ2 = i37;
            iMax2 = iMax3;
            i38++;
            i37 = iJ2;
            iD2 = i39;
            iJ4 = i22;
        }
        if (iJ4 < i9) {
            int i40 = i9 - iJ4;
            int i41 = iJ4 + i40;
            int i42 = i36;
            iJ = i37 - i40;
            i19 = i42;
            while (iJ < i23 && i19 > 0) {
                i19--;
                int i43 = i41;
                t tVarB3 = uVar.b(i19);
                c0930j.add(0, tVarB3);
                iMax2 = Math.max(iMax2, tVarB3.b());
                iJ += tVarB3.j();
                i23 = i10;
                i41 = i43;
            }
            int i44 = i41;
            i18 = i40 + iD;
            if (iJ < 0) {
                i18 += iJ;
                i17 = i44 + iJ;
                iJ = 0;
            } else {
                i17 = i44;
            }
        } else {
            i17 = iJ4;
            i18 = iD;
            i19 = i36;
            iJ = i37;
        }
        int i45 = iMax2;
        float f10 = (c.a(c.d(f8)) != c.a(i18) || Math.abs(c.d(f8)) < Math.abs(i18)) ? f8 : i18;
        float f11 = f8 - f10;
        float f12 = 0.0f;
        if (z11 && i18 > iD && f11 <= 0.0f) {
            f12 = (i18 - iD) + f11;
        }
        if (iJ < 0) {
            throw new IllegalArgumentException("negative currentFirstItemScrollOffset");
        }
        int i46 = -iJ;
        t tVar = (t) c0930j.first();
        if (i10 > 0 || i12 < 0) {
            int size = c0930j.size();
            f9 = f10;
            int i47 = iJ;
            int i48 = 0;
            while (true) {
                if (i48 >= size) {
                    i20 = i47;
                    i21 = i46;
                    break;
                }
                i21 = i46;
                int iJ6 = ((t) c0930j.get(i48)).j();
                if (i47 == 0 || iJ6 > i47) {
                    i20 = i47;
                    break;
                }
                i20 = i47;
                if (i48 == D6.r.p(c0930j)) {
                    break;
                }
                i47 = i20 - iJ6;
                i48++;
                tVar = (t) c0930j.get(i48);
                i46 = i21;
            }
        } else {
            f9 = f10;
            i21 = i46;
            i20 = iJ;
        }
        List listD = d(i19, uVar, i15, list2);
        int size2 = listD.size();
        int iMax4 = i45;
        for (int i49 = 0; i49 < size2; i49++) {
            iMax4 = Math.max(iMax4, ((t) listD.get(i49)).b());
        }
        int i50 = i17;
        float f13 = f9;
        int i51 = i21;
        t tVar2 = tVar;
        int iMax5 = iMax4;
        List listC = c(c0930j, uVar, i8, i15, list2, f13, z11, qVar);
        int size3 = listC.size();
        for (int i52 = 0; i52 < size3; i52++) {
            iMax5 = Math.max(iMax5, ((t) listC.get(i52)).b());
        }
        boolean z14 = kotlin.jvm.internal.t.c(tVar2, c0930j.first()) && listD.isEmpty() && listC.isEmpty();
        int iG = A1.c.g(j8, z8 ? iMax5 : i50);
        if (z8) {
            iMax5 = i50;
        }
        int iF = A1.c.f(j8, iMax5);
        List listA = a(c0930j, listD, listC, iG, iF, i50, i9, i51, z8, lVar, dVar, z9, dVar2);
        int i53 = iG;
        int i54 = iF;
        jVar.e((int) f13, i53, i54, listA, uVar, z8, z11, z10, j9);
        t tVarA = !list.isEmpty() ? g.a(listA, uVar, list, i10, i53, i54) : null;
        if (i38 >= i8 && i50 <= i9) {
            z12 = false;
        }
        i53 = i53;
        i54 = i54;
        I i55 = (I) pVar.invoke(Integer.valueOf(i53), Integer.valueOf(i54), new b(listA, tVarA, z11, interfaceC3164l0));
        if (z14) {
            list3 = listA;
        } else {
            ArrayList arrayList = new ArrayList(listA.size());
            int size4 = listA.size();
            for (int i56 = 0; i56 < size4; i56++) {
                Object obj = listA.get(i56);
                t tVar3 = (t) obj;
                if ((tVar3.getIndex() >= ((t) c0930j.first()).getIndex() && tVar3.getIndex() <= ((t) c0930j.last()).getIndex()) || tVar3 == tVarA) {
                    arrayList.add(obj);
                }
            }
            list3 = arrayList;
        }
        return new s(tVar2, i20, z12, f13, i55, f12, z13, list3, i28, i31, i8, z9, z8 ? B.Vertical : B.Horizontal, i11, i12);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f28482a = new a();

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
