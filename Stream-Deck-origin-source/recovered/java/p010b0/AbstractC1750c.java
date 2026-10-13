package p010b0;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: b0.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1750c {
    public static Object[] a(Object[] objArr, int i8) {
        if (objArr.length < i8) {
            return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i8);
        }
        if (objArr.length > i8) {
            objArr[i8] = null;
        }
        return objArr;
    }
}
