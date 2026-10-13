package kotlin.jvm.internal;

import com.elgato.streamdeck.vsd2.connection.Cjvi.LYdqVGvOGMNr;
import com.google.mlkit.common.internal.ckI.WqXA;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: kotlin.jvm.internal.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2632j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object[] f28812a = new Object[0];

    public static final Object[] b(Collection collection, Object[] objArr) {
        Object[] objArrCopyOf;
        t.g(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i8 = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArrCopyOf = objArr;
                } else {
                    Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    t.e(objNewInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArrCopyOf = (Object[]) objNewInstance;
                }
                while (true) {
                    int i9 = i8 + 1;
                    objArrCopyOf[i8] = it.next();
                    if (i9 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i10 = ((i9 * 3) + 1) >>> 1;
                        if (i10 <= i9) {
                            i10 = 2147483645;
                            if (i9 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i10);
                        t.f(objArrCopyOf, "copyOf(...)");
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf == objArr) {
                            objArr[i9] = null;
                            return objArr;
                        }
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i9);
                        t.f(objArrCopyOf2, "copyOf(...)");
                        return objArrCopyOf2;
                    }
                    i8 = i9;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    public static final Object[] a(Collection collection) {
        t.g(collection, LYdqVGvOGMNr.Xge);
        int size = collection.size();
        if (size == 0) {
            return f28812a;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return f28812a;
        }
        Object[] objArrCopyOf = new Object[size];
        int i8 = 0;
        while (true) {
            int i9 = i8 + 1;
            objArrCopyOf[i8] = it.next();
            int length = objArrCopyOf.length;
            String str = WqXA.mpqRfkBLsjADC;
            if (i9 >= length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i10 = ((i9 * 3) + 1) >>> 1;
                if (i10 <= i9) {
                    i10 = 2147483645;
                    if (i9 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i10);
                t.f(objArrCopyOf, str);
            } else if (!it.hasNext()) {
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i9);
                t.f(objArrCopyOf2, str);
                return objArrCopyOf2;
            }
            i8 = i9;
        }
    }
}
