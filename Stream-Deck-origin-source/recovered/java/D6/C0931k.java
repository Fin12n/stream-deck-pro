package D6;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: D6.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class C0931k {
    public static final Object[] a(Object[] reference, int i8) {
        kotlin.jvm.internal.t.g(reference, "reference");
        Object objNewInstance = Array.newInstance(reference.getClass().getComponentType(), i8);
        kotlin.jvm.internal.t.e(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (Object[]) objNewInstance;
    }

    public static final void b(int i8, int i9) {
        if (i8 <= i9) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i8 + ") is greater than size (" + i9 + ").");
    }
}
