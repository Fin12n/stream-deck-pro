package p215z0;

import java.util.ArrayList;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class V0 {
    public static final int B(int[] iArr, int i8) {
        int i9 = i8 * 5;
        return i9 >= iArr.length ? iArr.length : iArr[i9 + 4] + E(iArr[i9 + 1] >> 29);
    }

    public static final boolean C(int[] iArr, int i8) {
        return (iArr[(i8 * 5) + 1] & 201326592) != 0;
    }

    public static final boolean D(int[] iArr, int i8) {
        return (iArr[(i8 * 5) + 1] & 67108864) != 0;
    }

    public static final int E(int i8) {
        switch (i8) {
            case 0:
                return 0;
            case 1:
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 1;
            case 5:
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static final int F(int[] iArr, int i8) {
        return iArr[(i8 * 5) + 4];
    }

    public static final C3147d G(ArrayList arrayList, int i8, int i9) {
        int iU = U(arrayList, i8, i9);
        if (iU >= 0) {
            return (C3147d) arrayList.get(iU);
        }
        return null;
    }

    public static final int H(int[] iArr, int i8) {
        return iArr[(i8 * 5) + 1];
    }

    public static final int I(int[] iArr, int i8) {
        return iArr[(i8 * 5) + 3];
    }

    public static final boolean J(int[] iArr, int i8) {
        return (iArr[(i8 * 5) + 1] & 268435456) != 0;
    }

    public static final boolean K(int[] iArr, int i8) {
        return (iArr[(i8 * 5) + 1] & 134217728) != 0;
    }

    public static final boolean L(int[] iArr, int i8) {
        return (iArr[(i8 * 5) + 1] & 536870912) != 0;
    }

    public static final void M(int[] iArr, int i8, int i9, boolean z8, boolean z9, boolean z10, int i10, int i11) {
        int i12 = z8 ? 1073741824 : 0;
        int i13 = z9 ? 536870912 : 0;
        int i14 = z10 ? 268435456 : 0;
        int i15 = i8 * 5;
        iArr[i15] = i9;
        iArr[i15 + 1] = i12 | i13 | i14;
        iArr[i15 + 2] = i10;
        iArr[i15 + 3] = 0;
        iArr[i15 + 4] = i11;
    }

    public static final boolean N(int[] iArr, int i8) {
        return (iArr[(i8 * 5) + 1] & 1073741824) != 0;
    }

    public static final int O(int[] iArr, int i8) {
        return iArr[i8 * 5];
    }

    public static final int P(ArrayList arrayList, int i8, int i9) {
        int iU = U(arrayList, i8, i9);
        return iU >= 0 ? iU : -(iU + 1);
    }

    public static final int Q(int[] iArr, int i8) {
        return iArr[(i8 * 5) + 1] & 67108863;
    }

    public static final int R(int[] iArr, int i8) {
        return iArr[(i8 * 5) + 4];
    }

    public static final int S(int[] iArr, int i8) {
        int i9 = i8 * 5;
        return iArr[i9 + 4] + E(iArr[i9 + 1] >> 30);
    }

    public static final int T(int[] iArr, int i8) {
        return iArr[(i8 * 5) + 2];
    }

    public static final int U(ArrayList arrayList, int i8, int i9) {
        int size = arrayList.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            int iA = ((C3147d) arrayList.get(i11)).a();
            if (iA < 0) {
                iA += i9;
            }
            int iH = t.h(iA, i8);
            if (iH < 0) {
                i10 = i11 + 1;
            } else {
                if (iH <= 0) {
                    return i11;
                }
                size = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static final int V(int[] iArr, int i8) {
        int i9 = i8 * 5;
        return iArr[i9 + 4] + E(iArr[i9 + 1] >> 28);
    }

    public static final void W(int[] iArr, int i8, boolean z8) {
        int i9 = (i8 * 5) + 1;
        if (z8) {
            iArr[i9] = iArr[i9] | 67108864;
        } else {
            iArr[i9] = iArr[i9] & (-67108865);
        }
    }

    public static final void X(int[] iArr, int i8, int i9) {
        iArr[(i8 * 5) + 4] = i9;
    }

    public static final void Y(int[] iArr, int i8, int i9) {
        AbstractC3169o.U(i9 >= 0);
        iArr[(i8 * 5) + 3] = i9;
    }

    public static final void Z(int[] iArr, int i8, boolean z8) {
        int i9 = (i8 * 5) + 1;
        if (z8) {
            iArr[i9] = iArr[i9] | 134217728;
        } else {
            iArr[i9] = iArr[i9] & (-134217729);
        }
    }

    public static final void a0(int[] iArr, int i8, int i9) {
        AbstractC3169o.U(i9 >= 0 && i9 < 67108863);
        int i10 = (i8 * 5) + 1;
        iArr[i10] = i9 | (iArr[i10] & (-67108864));
    }

    public static final void b0(int[] iArr, int i8, int i9) {
        iArr[(i8 * 5) + 2] = i9;
    }
}
