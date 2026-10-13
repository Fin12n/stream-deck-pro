package D6;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class w extends C0941v {
    public static boolean D(Collection collection, Y6.g elements) {
        kotlin.jvm.internal.t.g(collection, "<this>");
        kotlin.jvm.internal.t.g(elements, "elements");
        Iterator it = elements.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z8 = true;
            }
        }
        return z8;
    }

    public static boolean E(Collection collection, Iterable elements) {
        kotlin.jvm.internal.t.g(collection, "<this>");
        kotlin.jvm.internal.t.g(elements, "elements");
        if (elements instanceof Collection) {
            return collection.addAll((Collection) elements);
        }
        Iterator it = elements.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z8 = true;
            }
        }
        return z8;
    }

    public static boolean F(Collection collection, Object[] elements) {
        kotlin.jvm.internal.t.g(collection, "<this>");
        kotlin.jvm.internal.t.g(elements, "elements");
        return collection.addAll(C0933m.c(elements));
    }

    public static final Collection G(Iterable iterable) {
        kotlin.jvm.internal.t.g(iterable, "<this>");
        return iterable instanceof Collection ? (Collection) iterable : z.R0(iterable);
    }

    public static final boolean H(Iterable iterable, Q6.k kVar, boolean z8) {
        Iterator it = iterable.iterator();
        boolean z9 = false;
        while (it.hasNext()) {
            if (((Boolean) kVar.invoke(it.next())).booleanValue() == z8) {
                it.remove();
                z9 = true;
            }
        }
        return z9;
    }

    public static final boolean I(List list, Q6.k kVar, boolean z8) {
        int i8;
        if (!(list instanceof RandomAccess)) {
            kotlin.jvm.internal.t.e(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return H(kotlin.jvm.internal.P.b(list), kVar, z8);
        }
        int iP = r.p(list);
        if (iP >= 0) {
            int i9 = 0;
            i8 = 0;
            while (true) {
                Object obj = list.get(i9);
                if (((Boolean) kVar.invoke(obj)).booleanValue() != z8) {
                    if (i8 != i9) {
                        list.set(i8, obj);
                    }
                    i8++;
                }
                if (i9 == iP) {
                    break;
                }
                i9++;
            }
        } else {
            i8 = 0;
        }
        if (i8 >= list.size()) {
            return false;
        }
        int iP2 = r.p(list);
        if (i8 > iP2) {
            return true;
        }
        while (true) {
            list.remove(iP2);
            if (iP2 == i8) {
                return true;
            }
            iP2--;
        }
    }

    public static boolean J(Iterable iterable, Q6.k predicate) {
        kotlin.jvm.internal.t.g(iterable, "<this>");
        kotlin.jvm.internal.t.g(predicate, "predicate");
        return H(iterable, predicate, true);
    }

    public static final boolean K(Collection collection, Iterable elements) {
        kotlin.jvm.internal.t.g(collection, "<this>");
        kotlin.jvm.internal.t.g(elements, "elements");
        return collection.removeAll(G(elements));
    }

    public static boolean L(List list, Q6.k predicate) {
        kotlin.jvm.internal.t.g(list, "<this>");
        kotlin.jvm.internal.t.g(predicate, "predicate");
        return I(list, predicate, true);
    }

    public static Object M(List list) {
        kotlin.jvm.internal.t.g(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    public static Object N(List list) {
        kotlin.jvm.internal.t.g(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    public static Object O(List list) {
        kotlin.jvm.internal.t.g(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(r.p(list));
    }

    public static final boolean P(Collection collection, Iterable elements) {
        kotlin.jvm.internal.t.g(collection, "<this>");
        kotlin.jvm.internal.t.g(elements, "elements");
        return collection.retainAll(G(elements));
    }
}
