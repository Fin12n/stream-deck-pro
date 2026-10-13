package F4;

import p219z4.AbstractC3206o;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    public static boolean a(int[] iArr, int i8) {
        if (iArr != null) {
            for (int i9 : iArr) {
                if (i9 == i8) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean b(Object[] objArr, Object obj) {
        int length = objArr != null ? objArr.length : 0;
        for (int i8 = 0; i8 < length; i8++) {
            if (AbstractC3206o.a(objArr[i8], obj)) {
                if (i8 >= 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
