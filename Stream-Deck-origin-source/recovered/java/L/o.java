package L;

import A.AbstractC0890p0;
import H.I;
import H.InterfaceC1017z0;
import H.u1;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I f4785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rational f4788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p f4789e;

    public o(I i8, Size size) {
        this.f4785a = i8;
        this.f4786b = i8.d();
        this.f4787c = i8.i();
        Rational rationalH = size != null ? h(size) : i(i8);
        this.f4788d = rationalH;
        this.f4789e = new p(i8, rationalH);
    }

    public static LinkedHashMap a(List list, T.a aVar, Rational rational) {
        return b(o(list), aVar, rational);
    }

    public static LinkedHashMap b(Map map, T.a aVar, Rational rational) {
        boolean z8 = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z8 = false;
        }
        Rational rationalN = n(aVar.b(), z8);
        if (aVar.a() == 0) {
            Rational rationalN2 = n(aVar.b(), z8);
            for (Rational rational2 : new ArrayList(map.keySet())) {
                if (!rational2.equals(rationalN2)) {
                    map.remove(rational2);
                }
            }
        }
        ArrayList<Rational> arrayList = new ArrayList(map.keySet());
        Collections.sort(arrayList, new I.a.C0137a(rationalN, rational));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Rational rational3 : arrayList) {
            linkedHashMap.put(rational3, (List) map.get(rational3));
        }
        return linkedHashMap;
    }

    public static void d(LinkedHashMap linkedHashMap, Size size) {
        int iB = P.d.b(size);
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            List<Size> list = (List) linkedHashMap.get((Rational) it.next());
            ArrayList arrayList = new ArrayList();
            for (Size size2 : list) {
                if (P.d.b(size2) <= iB) {
                    arrayList.add(size2);
                }
            }
            list.clear();
            list.addAll(arrayList);
        }
    }

    public static List e(List list, T.b bVar, int i8, int i9, int i10) {
        if (bVar == null) {
            return list;
        }
        List listA = bVar.a(new ArrayList(list), I.c.a(I.c.b(i8), i9, i10 == 1));
        if (list.containsAll(listA)) {
            return listA;
        }
        throw new IllegalArgumentException("The returned sizes list of the resolution filter must be a subset of the provided sizes list.");
    }

    public static void f(LinkedHashMap linkedHashMap, T.d dVar) {
        if (dVar == null) {
            return;
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            g((List) linkedHashMap.get((Rational) it.next()), dVar);
        }
    }

    public static void g(List list, T.d dVar) {
        if (list.isEmpty()) {
            return;
        }
        int iB = dVar.b();
        if (dVar.equals(T.d.f9793c)) {
            return;
        }
        Size sizeA = dVar.a();
        if (iB == 0) {
            s(list, sizeA);
            return;
        }
        if (iB == 1) {
            q(list, sizeA, true);
            return;
        }
        if (iB == 2) {
            q(list, sizeA, false);
        } else if (iB == 3) {
            r(list, sizeA, true);
        } else {
            if (iB != 4) {
                return;
            }
            r(list, sizeA, false);
        }
    }

    public static List k(List list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(I.a.f3595a);
        arrayList.add(I.a.f3597c);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational = new Rational(size.getWidth(), size.getHeight());
            if (!arrayList.contains(rational)) {
                Iterator it2 = arrayList.iterator();
                do {
                    if (!it2.hasNext()) {
                        arrayList.add(rational);
                        break;
                    }
                } while (!I.a.a(size, (Rational) it2.next()));
            }
        }
        return arrayList;
    }

    public static Rational n(int i8, boolean z8) {
        if (i8 == -1) {
            return null;
        }
        if (i8 == 0) {
            return z8 ? I.a.f3595a : I.a.f3596b;
        }
        if (i8 == 1) {
            return z8 ? I.a.f3597c : I.a.f3598d;
        }
        AbstractC0890p0.c("SupportedOutputSizesCollector", "Undefined target aspect ratio: " + i8);
        return null;
    }

    public static Map o(List list) {
        HashMap map = new HashMap();
        Iterator it = k(list).iterator();
        while (it.hasNext()) {
            map.put((Rational) it.next(), new ArrayList());
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Size size = (Size) it2.next();
            for (Rational rational : map.keySet()) {
                if (I.a.a(size, rational)) {
                    ((List) map.get(rational)).add(size);
                }
            }
        }
        return map;
    }

    public static List p(T.c cVar, List list, Size size, int i8, Rational rational, int i9, int i10) {
        LinkedHashMap linkedHashMapA = a(list, cVar.b(), rational);
        if (size != null) {
            d(linkedHashMapA, size);
        }
        f(linkedHashMapA, cVar.d());
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashMapA.values().iterator();
        while (it.hasNext()) {
            for (Size size2 : (List) it.next()) {
                if (!arrayList.contains(size2)) {
                    arrayList.add(size2);
                }
            }
        }
        return e(arrayList, cVar.c(), i8, i9, i10);
    }

    public static void q(List list, Size size, boolean z8) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = (Size) list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z8) {
            list.addAll(arrayList);
        }
    }

    public static void r(List list, Size size, boolean z8) {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < list.size(); i8++) {
            Size size2 = (Size) list.get(i8);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z8) {
            list.addAll(arrayList);
        }
    }

    public static void s(List list, Size size) {
        boolean zContains = list.contains(size);
        list.clear();
        if (zContains) {
            list.add(size);
        }
    }

    public final List c(List list, T.c cVar, int i8) {
        if (cVar.a() != 1) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        arrayList.addAll(this.f4785a.k(i8));
        Collections.sort(arrayList, new I.d(true));
        return arrayList;
    }

    public final Rational h(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    public final Rational i(I i8) {
        List listP = i8.p(256);
        if (listP.isEmpty()) {
            return null;
        }
        Size size = (Size) Collections.max(listP, new I.d());
        return new Rational(size.getWidth(), size.getHeight());
    }

    public final List j(List list, int i8) {
        List listL = l(list, i8);
        if (listL == null) {
            listL = this.f4785a.p(i8);
        }
        ArrayList arrayList = new ArrayList(listL);
        Collections.sort(arrayList, new I.d(true));
        if (arrayList.isEmpty()) {
            AbstractC0890p0.l("SupportedOutputSizesCollector", "The retrieved supported resolutions from camera info internal is empty. Format is " + i8 + ".");
        }
        return arrayList;
    }

    public final List l(List list, int i8) {
        Size[] sizeArr;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                if (((Integer) pair.first).intValue() == i8) {
                    sizeArr = (Size[]) pair.second;
                }
            }
            sizeArr = null;
        } else {
            sizeArr = null;
        }
        if (sizeArr == null) {
            return null;
        }
        return Arrays.asList(sizeArr);
    }

    public List m(u1 u1Var) {
        InterfaceC1017z0 interfaceC1017z0 = (InterfaceC1017z0) u1Var;
        List listS = interfaceC1017z0.s(null);
        if (listS != null) {
            return listS;
        }
        T.c cVarW = interfaceC1017z0.w(null);
        List listJ = j(interfaceC1017z0.o(null), u1Var.u());
        if (cVarW == null) {
            return this.f4789e.f(listJ, u1Var);
        }
        Size sizeI = ((InterfaceC1017z0) u1Var).i(null);
        int iD0 = interfaceC1017z0.d0(0);
        if (!u1Var.a0(false)) {
            listJ = c(listJ, cVarW, u1Var.u());
        }
        List list = listJ;
        AbstractC0890p0.a("SupportedOutputSizesCollector", "useCaseConfig = " + u1Var + ", candidateSizes = " + list);
        return p(interfaceC1017z0.r(), list, sizeI, iD0, this.f4788d, this.f4786b, this.f4787c);
    }
}
