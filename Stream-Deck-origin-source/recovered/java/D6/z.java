package D6;

import I0.mIk.efuWFSeiT;
import io.sentry.exception.uXy.SZCvugJaXc;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import p143q0.nKy.bGZGhbtQmA;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class z extends y {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements Y6.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterable f1956a;

        public a(Iterable iterable) {
            this.f1956a = iterable;
        }

        @Override // Y6.g
        public Iterator iterator() {
            return this.f1956a.iterator();
        }
    }

    public static List A0(Iterable iterable, Iterable elements) {
        kotlin.jvm.internal.t.g(iterable, "<this>");
        kotlin.jvm.internal.t.g(elements, "elements");
        if (iterable instanceof Collection) {
            return B0((Collection) iterable, elements);
        }
        ArrayList arrayList = new ArrayList();
        w.E(arrayList, iterable);
        w.E(arrayList, elements);
        return arrayList;
    }

    public static List B0(Collection collection, Iterable elements) {
        kotlin.jvm.internal.t.g(collection, "<this>");
        kotlin.jvm.internal.t.g(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            w.E(arrayList, elements);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static List C0(Collection collection, Object obj) {
        kotlin.jvm.internal.t.g(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static List D0(Iterable iterable) {
        kotlin.jvm.internal.t.g(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return R0(iterable);
        }
        List listT0 = T0(iterable);
        y.Y(listT0);
        return listT0;
    }

    public static Object E0(Iterable iterable) {
        kotlin.jvm.internal.t.g(iterable, "<this>");
        if (iterable instanceof List) {
            return F0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static Object G0(List list) {
        kotlin.jvm.internal.t.g(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List H0(Iterable iterable) {
        kotlin.jvm.internal.t.g(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List listT0 = T0(iterable);
            C0941v.B(listT0);
            return listT0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return R0(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        C0933m.B((Comparable[]) array);
        return C0933m.c(array);
    }

    public static List I0(Iterable iterable) {
        kotlin.jvm.internal.t.g(iterable, "<this>");
        return J0(iterable, F6.a.c());
    }

    public static final List K0(Iterable iterable, int i8) {
        kotlin.jvm.internal.t.g(iterable, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return r.n();
        }
        if (iterable instanceof Collection) {
            if (i8 >= ((Collection) iterable).size()) {
                return R0(iterable);
            }
            if (i8 == 1) {
                return C0937q.e(h0(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i8);
        Iterator it = iterable.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i9++;
            if (i9 == i8) {
                break;
            }
        }
        return r.u(arrayList);
    }

    public static boolean[] L0(Collection collection) {
        kotlin.jvm.internal.t.g(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        Iterator it = collection.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            zArr[i8] = ((Boolean) it.next()).booleanValue();
            i8++;
        }
        return zArr;
    }

    public static byte[] M0(Collection collection) {
        kotlin.jvm.internal.t.g(collection, "<this>");
        byte[] bArr = new byte[collection.size()];
        Iterator it = collection.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            bArr[i8] = ((Number) it.next()).byteValue();
            i8++;
        }
        return bArr;
    }

    public static final Collection N0(Iterable iterable, Collection destination) {
        kotlin.jvm.internal.t.g(iterable, "<this>");
        kotlin.jvm.internal.t.g(destination, "destination");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    public static float[] O0(Collection collection) {
        kotlin.jvm.internal.t.g(collection, "<this>");
        float[] fArr = new float[collection.size()];
        Iterator it = collection.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            fArr[i8] = ((Number) it.next()).floatValue();
            i8++;
        }
        return fArr;
    }

    public static HashSet P0(Iterable iterable) {
        kotlin.jvm.internal.t.g(iterable, "<this>");
        return (HashSet) N0(iterable, new HashSet(L.d(C0938s.y(iterable, 12))));
    }

    public static int[] Q0(Collection collection) {
        kotlin.jvm.internal.t.g(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            iArr[i8] = ((Number) it.next()).intValue();
            i8++;
        }
        return iArr;
    }

    public static List R0(Iterable iterable) {
        kotlin.jvm.internal.t.g(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return r.u(T0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return r.n();
        }
        if (size != 1) {
            return U0(collection);
        }
        return C0937q.e(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static long[] S0(Collection collection) {
        kotlin.jvm.internal.t.g(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            jArr[i8] = ((Number) it.next()).longValue();
            i8++;
        }
        return jArr;
    }

    public static final List T0(Iterable iterable) {
        kotlin.jvm.internal.t.g(iterable, "<this>");
        return iterable instanceof Collection ? U0((Collection) iterable) : (List) N0(iterable, new ArrayList());
    }

    public static List U0(Collection collection) {
        kotlin.jvm.internal.t.g(collection, "<this>");
        return new ArrayList(collection);
    }

    public static Set V0(Iterable iterable) {
        kotlin.jvm.internal.t.g(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) N0(iterable, new LinkedHashSet());
    }

    public static Set W0(Iterable iterable) {
        kotlin.jvm.internal.t.g(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return T.f((Set) N0(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return T.d();
        }
        if (size != 1) {
            return (Set) N0(iterable, new LinkedHashSet(L.d(collection.size())));
        }
        return S.c(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static List X0(Iterable iterable, Iterable other) {
        kotlin.jvm.internal.t.g(iterable, "<this>");
        kotlin.jvm.internal.t.g(other, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(C0938s.y(iterable, 10), C0938s.y(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(C6.v.a(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static Y6.g Z(Iterable iterable) {
        kotlin.jvm.internal.t.g(iterable, "<this>");
        return new a(iterable);
    }

    public static double a0(Iterable iterable) {
        kotlin.jvm.internal.t.g(iterable, "<this>");
        Iterator it = iterable.iterator();
        double dLongValue = 0.0d;
        int i8 = 0;
        while (it.hasNext()) {
            dLongValue += ((Number) it.next()).longValue();
            i8++;
            if (i8 < 0) {
                r.w();
            }
        }
        if (i8 == 0) {
            return Double.NaN;
        }
        return dLongValue / ((double) i8);
    }

    public static boolean b0(Iterable iterable, Object obj) {
        kotlin.jvm.internal.t.g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        return m0(iterable, obj) >= 0;
    }

    public static List c0(Iterable iterable) {
        kotlin.jvm.internal.t.g(iterable, "<this>");
        return R0(V0(iterable));
    }

    public static List d0(Iterable iterable, int i8) {
        ArrayList arrayList;
        kotlin.jvm.internal.t.g(iterable, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return R0(iterable);
        }
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size() - i8;
            if (size <= 0) {
                return r.n();
            }
            if (size == 1) {
                return C0937q.e(s0(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    int size2 = collection.size();
                    while (i8 < size2) {
                        arrayList.add(((List) iterable).get(i8));
                        i8++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i8);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i9 = 0;
        for (Object obj : iterable) {
            if (i9 >= i8) {
                arrayList.add(obj);
            } else {
                i9++;
            }
        }
        return r.u(arrayList);
    }

    public static List e0(List list, int i8) {
        kotlin.jvm.internal.t.g(list, "<this>");
        if (i8 >= 0) {
            return K0(list, W6.n.d(list.size() - i8, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    public static List f0(Iterable iterable) {
        kotlin.jvm.internal.t.g(iterable, "<this>");
        return (List) g0(iterable, new ArrayList());
    }

    public static final Collection g0(Iterable iterable, Collection destination) {
        kotlin.jvm.internal.t.g(iterable, "<this>");
        kotlin.jvm.internal.t.g(destination, "destination");
        for (Object obj : iterable) {
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static Object h0(Iterable iterable) {
        kotlin.jvm.internal.t.g(iterable, "<this>");
        if (iterable instanceof List) {
            return i0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object i0(List list) {
        kotlin.jvm.internal.t.g(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object j0(Iterable iterable) {
        kotlin.jvm.internal.t.g(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object k0(List list) {
        kotlin.jvm.internal.t.g(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object l0(List list, int i8) {
        kotlin.jvm.internal.t.g(list, "<this>");
        if (i8 < 0 || i8 >= list.size()) {
            return null;
        }
        return list.get(i8);
    }

    public static final int m0(Iterable iterable, Object obj) {
        kotlin.jvm.internal.t.g(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i8 = 0;
        for (Object obj2 : iterable) {
            if (i8 < 0) {
                r.x();
            }
            if (kotlin.jvm.internal.t.c(obj, obj2)) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public static Set n0(Iterable iterable, Iterable other) {
        kotlin.jvm.internal.t.g(iterable, "<this>");
        kotlin.jvm.internal.t.g(other, "other");
        Set setV0 = V0(iterable);
        w.P(setV0, other);
        return setV0;
    }

    public static final Appendable o0(Iterable iterable, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, Q6.k kVar) throws IOException {
        kotlin.jvm.internal.t.g(iterable, "<this>");
        kotlin.jvm.internal.t.g(buffer, "buffer");
        kotlin.jvm.internal.t.g(separator, "separator");
        kotlin.jvm.internal.t.g(prefix, "prefix");
        kotlin.jvm.internal.t.g(postfix, "postfix");
        kotlin.jvm.internal.t.g(truncated, "truncated");
        buffer.append(prefix);
        int i9 = 0;
        for (Object obj : iterable) {
            i9++;
            if (i9 > 1) {
                buffer.append(separator);
            }
            if (i8 >= 0 && i9 > i8) {
                break;
            }
            Z6.n.a(buffer, obj, kVar);
        }
        if (i8 >= 0 && i9 > i8) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static /* synthetic */ String r0(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, Q6.k kVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i9 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i9 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i9 & 8) != 0) {
            i8 = -1;
        }
        if ((i9 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i9 & 32) != 0) {
            kVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        Q6.k kVar2 = kVar;
        return q0(iterable, charSequence, charSequence2, charSequence3, i8, charSequence5, kVar2);
    }

    public static final Object s0(Iterable iterable) {
        kotlin.jvm.internal.t.g(iterable, "<this>");
        if (iterable instanceof List) {
            return t0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Object t0(List list) {
        kotlin.jvm.internal.t.g(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(r.p(list));
    }

    public static Object u0(List list) {
        kotlin.jvm.internal.t.g(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable v0(Iterable iterable) {
        kotlin.jvm.internal.t.g(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Float w0(Iterable iterable) {
        kotlin.jvm.internal.t.g(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static Comparable x0(Iterable iterable) {
        kotlin.jvm.internal.t.g(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Float y0(Iterable iterable) {
        kotlin.jvm.internal.t.g(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static List z0(Iterable iterable, Object obj) {
        kotlin.jvm.internal.t.g(iterable, "<this>");
        ArrayList arrayList = new ArrayList(C0938s.y(iterable, 10));
        boolean z8 = false;
        for (Object obj2 : iterable) {
            boolean z9 = true;
            if (!z8 && kotlin.jvm.internal.t.c(obj2, obj)) {
                z8 = true;
                z9 = false;
            }
            if (z9) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static final Object F0(List list) {
        kotlin.jvm.internal.t.g(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException(bGZGhbtQmA.SuWKBnCaUFeFYt);
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static List J0(Iterable iterable, Comparator comparator) {
        kotlin.jvm.internal.t.g(iterable, efuWFSeiT.ImSwvcs);
        kotlin.jvm.internal.t.g(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List listT0 = T0(iterable);
            C0941v.C(listT0, comparator);
            return listT0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return R0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        C0933m.C(array, comparator);
        return C0933m.c(array);
    }

    public static final String q0(Iterable iterable, CharSequence separator, CharSequence prefix, CharSequence charSequence, int i8, CharSequence truncated, Q6.k kVar) {
        kotlin.jvm.internal.t.g(iterable, "<this>");
        kotlin.jvm.internal.t.g(separator, "separator");
        kotlin.jvm.internal.t.g(prefix, "prefix");
        kotlin.jvm.internal.t.g(charSequence, SZCvugJaXc.CPWEDwsigcj);
        kotlin.jvm.internal.t.g(truncated, "truncated");
        String string = ((StringBuilder) o0(iterable, new StringBuilder(), separator, prefix, charSequence, i8, truncated, kVar)).toString();
        kotlin.jvm.internal.t.f(string, "toString(...)");
        return string;
    }
}
