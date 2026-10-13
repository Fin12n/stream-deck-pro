package L;

import H.I;
import H.InterfaceC1017z0;
import H.u1;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rational f4792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f4793d;

    public p(I i8, Rational rational) {
        this.f4790a = i8.d();
        this.f4791b = i8.i();
        this.f4792c = rational;
        boolean z8 = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z8 = false;
        }
        this.f4793d = z8;
    }

    public static Size a(Size size, int i8, int i9, int i10) {
        return (size == null || !e(i8, i9, i10)) ? size : new Size(size.getHeight(), size.getWidth());
    }

    public static Rational b(Size size, List list) {
        if (size == null) {
            return null;
        }
        for (Rational rational : o.k(list)) {
            if (I.a.a(size, rational)) {
                return rational;
            }
        }
        return new Rational(size.getWidth(), size.getHeight());
    }

    public static boolean e(int i8, int i9, int i10) {
        int iA = I.c.a(I.c.b(i8), i10, 1 == i9);
        return iA == 90 || iA == 270;
    }

    public final Rational c(InterfaceC1017z0 interfaceC1017z0, List list) {
        if (interfaceC1017z0.T()) {
            return o.n(interfaceC1017z0.V(), this.f4793d);
        }
        Size sizeD = d(interfaceC1017z0);
        if (sizeD != null) {
            return b(sizeD, list);
        }
        return null;
    }

    public final Size d(InterfaceC1017z0 interfaceC1017z0) {
        return a(interfaceC1017z0.D(null), interfaceC1017z0.d0(0), this.f4791b, this.f4790a);
    }

    public List f(List list, u1 u1Var) {
        if (list.isEmpty()) {
            return list;
        }
        ArrayList<Size> arrayList = new ArrayList(list);
        Collections.sort(arrayList, new I.d(true));
        ArrayList arrayList2 = new ArrayList();
        InterfaceC1017z0 interfaceC1017z0 = (InterfaceC1017z0) u1Var;
        Size sizeI = interfaceC1017z0.i(null);
        Size size = (Size) arrayList.get(0);
        if (sizeI == null || P.d.b(size) < P.d.b(sizeI)) {
            sizeI = size;
        }
        Size sizeD = d(interfaceC1017z0);
        Size size2 = P.d.f8831c;
        int iB = P.d.b(size2);
        if (P.d.b(sizeI) < iB) {
            size2 = P.d.f8829a;
        } else if (sizeD != null && P.d.b(sizeD) < iB) {
            size2 = sizeD;
        }
        for (Size size3 : arrayList) {
            if (P.d.b(size3) <= P.d.b(sizeI) && P.d.b(size3) >= P.d.b(size2) && !arrayList2.contains(size3)) {
                arrayList2.add(size3);
            }
        }
        if (arrayList2.isEmpty()) {
            throw new IllegalArgumentException("All supported output sizes are filtered out according to current resolution selection settings. \nminSize = " + size2 + "\nmaxSize = " + sizeI + "\ninitial size list: " + arrayList);
        }
        Rational rationalC = c(interfaceC1017z0, arrayList2);
        if (sizeD == null) {
            sizeD = interfaceC1017z0.z(null);
        }
        ArrayList arrayList3 = new ArrayList();
        new HashMap();
        if (rationalC == null) {
            arrayList3.addAll(arrayList2);
            if (sizeD != null) {
                o.q(arrayList3, sizeD, true);
                return arrayList3;
            }
        } else {
            Map mapO = o.o(arrayList2);
            if (sizeD != null) {
                Iterator it = mapO.keySet().iterator();
                while (it.hasNext()) {
                    o.q((List) mapO.get((Rational) it.next()), sizeD, true);
                }
            }
            ArrayList arrayList4 = new ArrayList(mapO.keySet());
            Collections.sort(arrayList4, new I.a.C0137a(rationalC, this.f4792c));
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                for (Size size4 : (List) mapO.get((Rational) it2.next())) {
                    if (!arrayList3.contains(size4)) {
                        arrayList3.add(size4);
                    }
                }
            }
        }
        return arrayList3;
    }
}
