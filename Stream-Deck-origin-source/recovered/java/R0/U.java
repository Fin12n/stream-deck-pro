package R0;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class U {
    public static final Shader a(long j8, long j9, List list, List list2, int i8) {
        e(list, list2);
        int iB = b(list);
        return new LinearGradient(Q0.f.o(j8), Q0.f.p(j8), Q0.f.o(j9), Q0.f.p(j9), c(list, iB), d(list2, list, iB), V.a(i8));
    }

    public static final int b(List list) {
        return 0;
    }

    public static final int[] c(List list, int i8) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i9 = 0; i9 < size; i9++) {
            iArr[i9] = AbstractC1602n0.j(((C1598l0) list.get(i9)).y());
        }
        return iArr;
    }

    public static final float[] d(List list, List list2, int i8) {
        if (i8 == 0) {
            if (list != null) {
                return D6.z.O0(list);
            }
            return null;
        }
        float[] fArr = new float[list2.size() + i8];
        fArr[0] = list != null ? ((Number) list.get(0)).floatValue() : 0.0f;
        int iP = D6.r.p(list2);
        int i9 = 1;
        for (int i10 = 1; i10 < iP; i10++) {
            long jY = ((C1598l0) list2.get(i10)).y();
            float fFloatValue = list != null ? ((Number) list.get(i10)).floatValue() : i10 / D6.r.p(list2);
            int i11 = i9 + 1;
            fArr[i9] = fFloatValue;
            if (C1598l0.r(jY) == 0.0f) {
                i9 += 2;
                fArr[i11] = fFloatValue;
            } else {
                i9 = i11;
            }
        }
        fArr[i9] = list != null ? ((Number) list.get(D6.r.p(list2))).floatValue() : 1.0f;
        return fArr;
    }

    public static final void e(List list, List list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }
}
