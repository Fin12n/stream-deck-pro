package D6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* JADX INFO: renamed from: D6.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class C0937q {
    public static List a(List builder) {
        kotlin.jvm.internal.t.g(builder, "builder");
        return ((E6.b) builder).L();
    }

    public static final Object[] b(Object[] objArr, boolean z8) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        if (z8 && kotlin.jvm.internal.t.c(objArr.getClass(), Object[].class)) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        kotlin.jvm.internal.t.f(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    public static List c() {
        return new E6.b(0, 1, null);
    }

    public static List d(int i8) {
        return new E6.b(i8);
    }

    public static List e(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        kotlin.jvm.internal.t.f(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static List f(Iterable iterable, Random random) {
        kotlin.jvm.internal.t.g(iterable, "<this>");
        kotlin.jvm.internal.t.g(random, "random");
        List listT0 = z.T0(iterable);
        Collections.shuffle(listT0, random);
        return listT0;
    }

    public static Object[] g(int i8, Object[] array) {
        kotlin.jvm.internal.t.g(array, "array");
        if (i8 < array.length) {
            array[i8] = null;
        }
        return array;
    }
}
