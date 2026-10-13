package p166t;

import A.AbstractC0890p0;
import C6.j;
import C6.k;
import C6.q;
import D6.C0934n;
import D6.C0938s;
import D6.L;
import D6.r;
import D6.z;
import H.AbstractC0977f;
import H.u1;
import P.d;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import android.util.Size;
import androidx.startup.TrZh.ZWZaxQrCHfNe;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p174u.n;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class D1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f33322e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Range f33323f = new Range(120, 120);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f33324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f33325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f33326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f33327d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }

        public final boolean a(Collection collection, Collection newUseCaseConfigs) {
            boolean z8;
            t.g(collection, ZWZaxQrCHfNe.LFZYmLEZz);
            t.g(newUseCaseConfigs, "newUseCaseConfigs");
            Collection collection2 = collection;
            ArrayList arrayList = new ArrayList(C0938s.y(collection2, 10));
            Iterator it = collection2.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((AbstractC0977f) it.next()).f()));
            }
            Collection collection3 = newUseCaseConfigs;
            ArrayList arrayList2 = new ArrayList(C0938s.y(collection3, 10));
            Iterator it2 = collection3.iterator();
            while (true) {
                z8 = false;
                if (!it2.hasNext()) {
                    break;
                }
                arrayList2.add(Integer.valueOf(((u1) it2.next()).t(0)));
            }
            List listB0 = z.B0(arrayList, arrayList2);
            if (listB0 == null || !listB0.isEmpty()) {
                Iterator it3 = listB0.iterator();
                while (it3.hasNext()) {
                    if (((Number) it3.next()).intValue() == 1) {
                        z8 = true;
                        break;
                    }
                }
            }
            if (!z8 || (listB0 != null && listB0.isEmpty())) {
                return z8;
            }
            Iterator it4 = listB0.iterator();
            while (it4.hasNext()) {
                if (((Number) it4.next()).intValue() != 1) {
                    throw new IllegalArgumentException("All sessionTypes should be high-speed when any of them is high-speed");
                }
            }
            return z8;
        }
    }

    public D1(n characteristics) {
        t.g(characteristics, "characteristics");
        this.f33324a = characteristics;
        this.f33325b = k.b(new Function0() { // from class: t.A1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(D1.n(this.f33313a));
            }
        });
        this.f33326c = k.b(new Function0() { // from class: t.B1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return D1.o(this.f33316a);
            }
        });
        this.f33327d = k.b(new Function0() { // from class: t.C1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return D1.p(this.f33319a);
            }
        });
    }

    public static final boolean l(Collection collection, Collection collection2) {
        return f33322e.a(collection, collection2);
    }

    public static final boolean n(D1 d8) {
        int[] iArr = (int[]) d8.f33324a.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i8 : iArr) {
                if (i8 == 9) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final Size o(D1 d8) {
        List listK = d8.k();
        if (listK.isEmpty()) {
            listK = null;
        }
        if (listK == null) {
            return null;
        }
        Iterator it = listK.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            int iB = d.b((Size) next);
            do {
                Object next2 = it.next();
                int iB2 = d.b((Size) next2);
                if (iB < iB2) {
                    next = next2;
                    iB = iB2;
                }
            } while (it.hasNext());
        }
        return (Size) next;
    }

    public static final List p(D1 d8) {
        List listL;
        Size[] sizeArrC = d8.f33324a.e().c();
        return (sizeArrC == null || (listL = C0934n.L(sizeArrC)) == null) ? r.n() : listL;
    }

    public final Map d(Map sizesMap) {
        t.g(sizesMap, "sizesMap");
        List listE = e(z.R0(sizesMap.values()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listE) {
            if (k().contains((Size) obj)) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(L.d(sizesMap.size()));
        for (Map.Entry entry : sizesMap.entrySet()) {
            Object key = entry.getKey();
            List list = (List) entry.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (arrayList.contains((Size) obj2)) {
                    arrayList2.add(obj2);
                }
            }
            linkedHashMap.put(key, arrayList2);
        }
        return linkedHashMap;
    }

    public final List e(List list) {
        if (list.isEmpty()) {
            return r.n();
        }
        List listU0 = z.U0((Collection) z.i0(list));
        Iterator it = z.d0(list, 1).iterator();
        while (it.hasNext()) {
            listU0.retainAll((List) it.next());
        }
        return listU0;
    }

    public final Range[] f(List surfaceSizes) {
        t.g(surfaceSizes, "surfaceSizes");
        int size = surfaceSizes.size();
        if (1 > size || size >= 3 || z.c0(surfaceSizes).size() != 1) {
            return null;
        }
        List listG = g((Size) surfaceSizes.get(0));
        if (listG.isEmpty()) {
            listG = null;
        }
        if (listG == null) {
            return null;
        }
        if (surfaceSizes.size() == 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listG) {
                Range range = (Range) obj;
                if (t.c(range.getLower(), range.getUpper())) {
                    arrayList.add(obj);
                }
            }
            listG = arrayList;
        }
        return (Range[]) listG.toArray(new Range[0]);
    }

    public final List g(Size size) {
        Object objB;
        List listL;
        List listR0;
        try {
            q.a aVar = q.f1441b;
            objB = q.b(this.f33324a.e().b(size));
        } catch (Throwable th) {
            q.a aVar2 = q.f1441b;
            objB = q.b(C6.r.a(th));
        }
        if (q.g(objB)) {
            objB = null;
        }
        Range[] rangeArr = (Range[]) objB;
        return (rangeArr == null || (listL = C0934n.L(rangeArr)) == null || (listR0 = z.R0(listL)) == null) ? r.n() : listR0;
    }

    public final int h(Size size) {
        t.g(size, "size");
        List listG = g(size);
        if (listG.isEmpty()) {
            listG = null;
        }
        if (listG == null) {
            AbstractC0890p0.l("HighSpeedResolver", "No supported high speed  fps for " + size);
            return 0;
        }
        Iterator it = listG.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Integer num = (Integer) ((Range) it.next()).getUpper();
        while (it.hasNext()) {
            Integer num2 = (Integer) ((Range) it.next()).getUpper();
            if (num.compareTo(num2) < 0) {
                num = num2;
            }
        }
        t.f(num, "maxOf(...)");
        return num.intValue();
    }

    public final Size i() {
        return (Size) this.f33326c.getValue();
    }

    public final List j(List sizesList) {
        t.g(sizesList, "sizesList");
        if (sizesList.isEmpty()) {
            return r.n();
        }
        List<Size> listE = e(sizesList);
        ArrayList arrayList = new ArrayList(C0938s.y(listE, 10));
        for (Size size : listE) {
            int size2 = sizesList.size();
            ArrayList arrayList2 = new ArrayList(size2);
            for (int i8 = 0; i8 < size2; i8++) {
                arrayList2.add(size);
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    public final List k() {
        return (List) this.f33327d.getValue();
    }

    public final boolean m() {
        return ((Boolean) this.f33325b.getValue()).booleanValue();
    }
}
