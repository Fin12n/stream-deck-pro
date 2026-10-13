package K7;

import J7.z;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c {
    public static final int a(int[] iArr, int i8, int i9, int i10) {
        t.g(iArr, "<this>");
        int i11 = i10 - 1;
        while (i9 <= i11) {
            int i12 = (i9 + i11) >>> 1;
            int i13 = iArr[i12];
            if (i13 < i8) {
                i9 = i12 + 1;
            } else {
                if (i13 <= i8) {
                    return i12;
                }
                i11 = i12 - 1;
            }
        }
        return (-i9) - 1;
    }

    public static final int b(z zVar, int i8) {
        t.g(zVar, "<this>");
        int iA = a(zVar.N(), i8 + 1, 0, zVar.O().length);
        return iA >= 0 ? iA : ~iA;
    }
}
