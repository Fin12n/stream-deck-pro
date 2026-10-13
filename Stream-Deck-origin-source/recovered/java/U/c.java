package U;

import A.AbstractC0890p0;
import H.I;
import H.InterfaceC1017z0;
import H.J;
import H.N0;
import H.u1;
import I.x;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final double f9938h = Math.sqrt(2.3703703703703702d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Size f9939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rational f9940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rational f9941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f9942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final L.o f9943e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final I f9944f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f9945g;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Rational f9946a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f9947b;

        public a(Rational rational, boolean z8) {
            this.f9946a = rational;
            this.f9947b = z8;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Rational rational, Rational rational2) {
            float fC = c.c(rational, this.f9946a);
            float fC2 = c.c(rational2, this.f9946a);
            return this.f9947b ? Float.compare(fC2, fC) : Float.compare(fC, fC2);
        }
    }

    public c(J j8, Set set) {
        this(x.m(j8.r().h()), j8.r(), set);
    }

    public static boolean A(Collection collection, Size size) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!y((Size) it.next(), size)) {
                return true;
            }
        }
        return false;
    }

    public static List E(List list) {
        return list.isEmpty() ? list : new ArrayList(new LinkedHashSet(list));
    }

    public static Rect F(Rect rect) {
        return new Rect(rect.top, rect.left, rect.bottom, rect.right);
    }

    public static void M(List list) {
        Collections.sort(list, new I.d(true));
    }

    public static Rational N(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    public static Rational O(Size size) {
        Rational rational = I.a.f3595a;
        if (I.a.a(size, rational)) {
            return rational;
        }
        Rational rational2 = I.a.f3597c;
        return I.a.a(size, rational2) ? rational2 : N(size);
    }

    public static float c(Rational rational, Rational rational2) {
        float fFloatValue = rational.floatValue();
        float fFloatValue2 = rational2.floatValue();
        return fFloatValue > fFloatValue2 ? fFloatValue2 / fFloatValue : fFloatValue / fFloatValue2;
    }

    public static List e(List list) {
        Rational rationalN;
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Iterator it2 = map.keySet().iterator();
            do {
                if (!it2.hasNext()) {
                    rationalN = null;
                    break;
                }
                rationalN = (Rational) it2.next();
            } while (!I.a.a(size, rationalN));
            if (rationalN != null) {
                Size size2 = (Size) map.get(rationalN);
                Objects.requireNonNull(size2);
                if (size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth() || (size.getWidth() == size2.getWidth() && size.getHeight() == size2.getHeight())) {
                }
            } else {
                rationalN = N(size);
            }
            arrayList.add(size);
            map.put(rationalN, size);
        }
        return arrayList;
    }

    public static List f(Collection collection, List list) {
        if (collection.isEmpty() || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (A(collection, size)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    public static List g(Rational rational, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (I.a.a(size, rational)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    public static Rational h(Size size) {
        return ((double) size.getWidth()) / ((double) size.getHeight()) > f9938h ? I.a.f3597c : I.a.f3595a;
    }

    public static Rect k(Rational rational, Size size) {
        RectF rectF;
        RectF rectF2;
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rationalN = N(size);
        if (rational.floatValue() == rationalN.floatValue()) {
            rectF2 = new RectF(0.0f, 0.0f, width, height);
        } else {
            if (rational.floatValue() > rationalN.floatValue()) {
                float f8 = width;
                float fFloatValue = f8 / rational.floatValue();
                float f9 = (height - fFloatValue) / 2.0f;
                rectF = new RectF(0.0f, f9, f8, fFloatValue + f9);
            } else {
                float f10 = height;
                float fFloatValue2 = rational.floatValue() * f10;
                float f11 = (width - fFloatValue2) / 2.0f;
                rectF = new RectF(f11, 0.0f, fFloatValue2 + f11, f10);
            }
            rectF2 = rectF;
        }
        Rect rect = new Rect();
        rectF2.round(rect);
        return rect;
    }

    public static Rect m(Size size, Size size2) {
        return k(N(size2), size);
    }

    public static Rational n(Rational rational) {
        Rational rational2 = I.a.f3595a;
        if (rational.equals(rational2)) {
            return I.a.f3597c;
        }
        if (rational.equals(I.a.f3597c)) {
            return rational2;
        }
        throw new IllegalArgumentException("Invalid sensor aspect-ratio: " + rational);
    }

    public static List p(Collection collection, List list) {
        if (collection.isEmpty() || list.isEmpty()) {
            return new ArrayList();
        }
        List<Size> listE = E(list);
        ArrayList arrayList = new ArrayList();
        for (Size size : listE) {
            if (z(collection, size)) {
                arrayList.add(size);
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.remove(arrayList.size() - 1);
        }
        return arrayList;
    }

    public static Rational u(Size size) {
        Rational rationalH = h(size);
        AbstractC0890p0.a("ResolutionsMerger", "The closer aspect ratio to the sensor size (" + size + ") is " + rationalH + ".");
        return rationalH;
    }

    public static List w(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            if (((Integer) pair.first).equals(34)) {
                return Arrays.asList((Size[]) pair.second);
            }
        }
        return new ArrayList();
    }

    public static boolean y(Size size, Size size2) {
        return size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth();
    }

    public static boolean z(Collection collection, Size size) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (y((Size) it.next(), size)) {
                return false;
            }
        }
        return true;
    }

    public final boolean B(Rational rational, Size size) {
        if (this.f9940b.equals(rational) || I.a.a(size, rational)) {
            return false;
        }
        return b(this.f9940b.floatValue(), rational.floatValue(), O(size).floatValue());
    }

    public final boolean C(Size size, Size size2) {
        return B(O(size), size2);
    }

    public final boolean D() {
        Iterator it = l().iterator();
        while (it.hasNext()) {
            if (!I.a.a((Size) it.next(), this.f9941c)) {
                return true;
            }
        }
        return false;
    }

    public final List G(List list, boolean z8) {
        Map mapX = x(list);
        ArrayList<Rational> arrayList = new ArrayList(mapX.keySet());
        L(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Rational rational : arrayList) {
            if (!rational.equals(I.a.f3597c) && !rational.equals(I.a.f3595a)) {
                List list2 = (List) mapX.get(rational);
                Objects.requireNonNull(list2);
                arrayList2.addAll(I(rational, list2, z8));
            }
        }
        return arrayList2;
    }

    public final List H(List list) {
        ArrayList arrayList = new ArrayList();
        if (D()) {
            arrayList.addAll(I(this.f9940b, list, false));
        }
        int size = arrayList.size();
        if (K()) {
            size = 0;
        }
        arrayList.addAll(size, I(this.f9941c, list, false));
        arrayList.addAll(G(list, false));
        if (arrayList.isEmpty()) {
            AbstractC0890p0.l("ResolutionsMerger", "Failed to find a parent resolution that does not result in double-cropping, this might due to camera not supporting 4:3 and 16:9resolutions or a strict ResolutionSelector settings. Starting resolution selection process with resolutions that might have a smaller FOV.");
            arrayList.addAll(G(list, true));
        }
        AbstractC0890p0.a("ResolutionsMerger", "Parent resolutions: " + arrayList);
        return arrayList;
    }

    public final List I(Rational rational, List list, boolean z8) {
        List<Size> listG = g(rational, list);
        M(listG);
        HashSet hashSet = new HashSet(listG);
        Iterator it = this.f9942d.iterator();
        while (it.hasNext()) {
            List listV = v((u1) it.next());
            if (!z8) {
                listV = d(rational, listV);
            }
            if (listV.isEmpty()) {
                return new ArrayList();
            }
            listG = f(listV, listG);
            hashSet.retainAll(p(listV, listG));
        }
        ArrayList arrayList = new ArrayList();
        for (Size size : listG) {
            if (!hashSet.contains(size)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    public final boolean J() {
        boolean z8;
        T.c cVarW;
        Iterator it = this.f9942d.iterator();
        while (true) {
            z8 = false;
            if (!it.hasNext()) {
                break;
            }
            u1 u1Var = (u1) it.next();
            if (!u1Var.a0(false) && (u1Var instanceof InterfaceC1017z0) && (cVarW = ((InterfaceC1017z0) u1Var).w(null)) != null) {
                z8 = true;
                if (cVarW.a() == 1) {
                    break;
                }
            }
        }
        return z8;
    }

    public final boolean K() {
        if (this.f9942d.isEmpty()) {
            return false;
        }
        Iterator it = this.f9942d.iterator();
        while (it.hasNext()) {
            Iterator it2 = v((u1) it.next()).iterator();
            boolean z8 = false;
            boolean z9 = false;
            while (it2.hasNext()) {
                boolean zA = I.a.a((Size) it2.next(), this.f9941c);
                if (zA) {
                    z8 = true;
                }
                if (z9 && zA) {
                    return false;
                }
                if (!zA) {
                    z9 = true;
                }
            }
            if (!z8) {
                return false;
            }
        }
        return true;
    }

    public final void L(List list) {
        Collections.sort(list, new a(N(this.f9939a), true));
    }

    public final boolean b(float f8, float f9, float f10) {
        if (f8 != f9 && f9 != f10) {
            if (f8 > f9) {
                return f9 < f10;
            }
            if (f9 > f10) {
                return true;
            }
        }
        return false;
    }

    public final List d(Rational rational, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (!B(rational, size)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    public final List i() {
        return this.f9944f.k(34);
    }

    public final List j() {
        return this.f9944f.p(34);
    }

    public final Set l() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f9942d.iterator();
        while (it.hasNext()) {
            hashSet.addAll(v((u1) it.next()));
        }
        return hashSet;
    }

    public List o(N0 n8) {
        List listJ = j();
        if (J()) {
            ArrayList arrayList = new ArrayList(listJ);
            arrayList.addAll(i());
            listJ = arrayList;
        }
        List list = (List) n8.f(InterfaceC1017z0.f3293t, null);
        if (list != null) {
            listJ = w(list);
        }
        return H(listJ);
    }

    public b q(u1 u1Var, Rect rect, int i8, boolean z8) {
        boolean z9;
        if (x.i(i8)) {
            rect = F(rect);
            z9 = true;
        } else {
            z9 = false;
        }
        b bVarT = t(rect, u1Var, z8);
        return z9 ? new b(F(bVarT.b()), x.n(bVarT.a()), bVarT.c()) : bVarT;
    }

    public Size r(Size size, u1 u1Var) {
        List<Size> listV = v(u1Var);
        for (Size size2 : listV) {
            if (!C(size, size2) && !y(size2, size)) {
                return size2;
            }
        }
        for (Size size3 : listV) {
            if (!y(size3, size)) {
                return size3;
            }
        }
        return size;
    }

    public Pair s(Size size, u1 u1Var) {
        for (Size size2 : v(u1Var)) {
            Size sizeM = x.m(m(size2, size));
            if (!y(sizeM, size)) {
                return Pair.create(size2, sizeM);
            }
        }
        return Pair.create(size, size);
    }

    public final b t(Rect rect, u1 u1Var, boolean z8) {
        Size sizeR;
        Size size;
        if (z8) {
            Pair pairS = s(x.m(rect), u1Var);
            sizeR = (Size) pairS.first;
            size = (Size) pairS.second;
        } else {
            Size sizeM = x.m(rect);
            sizeR = r(sizeM, u1Var);
            rect = m(sizeM, sizeR);
            size = sizeR;
        }
        return new b(rect, size, sizeR);
    }

    public final List v(u1 u1Var) {
        if (!this.f9942d.contains(u1Var)) {
            throw new IllegalArgumentException("Invalid child config: " + u1Var);
        }
        if (this.f9945g.containsKey(u1Var)) {
            List list = (List) this.f9945g.get(u1Var);
            Objects.requireNonNull(list);
            return list;
        }
        List listE = e(this.f9943e.m(u1Var));
        this.f9945g.put(u1Var, listE);
        return listE;
    }

    public final Map x(List list) {
        List arrayList;
        HashMap map = new HashMap();
        Rational rational = I.a.f3595a;
        map.put(rational, new ArrayList());
        Rational rational2 = I.a.f3597c;
        map.put(rational2, new ArrayList());
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(rational);
        arrayList2.add(rational2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (size.getHeight() > 0) {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        arrayList = null;
                        break;
                    }
                    Rational rational3 = (Rational) it2.next();
                    if (I.a.a(size, rational3)) {
                        arrayList = (List) map.get(rational3);
                        break;
                    }
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    Rational rationalN = N(size);
                    arrayList2.add(rationalN);
                    map.put(rationalN, arrayList);
                }
                arrayList.add(size);
            }
        }
        return map;
    }

    public c(Size size, I i8, Set set) {
        this(size, i8, set, new L.o(i8, size));
    }

    public c(Size size, I i8, Set set, L.o oVar) {
        this.f9945g = new HashMap();
        this.f9939a = size;
        Rational rationalU = u(size);
        this.f9940b = rationalU;
        this.f9941c = n(rationalU);
        this.f9944f = i8;
        this.f9942d = set;
        this.f9943e = oVar;
    }
}
