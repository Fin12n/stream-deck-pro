package N4;

/* JADX INFO: renamed from: N4.a0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1075a0 {
    public static int a(int i8) {
        return (i8 < 32 ? 4 : 2) * (i8 + 1);
    }

    public static int b(Object obj, Object obj2, int i8, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iA = AbstractC1087b0.a(obj);
        int i9 = iA & i8;
        int iC = c(obj3, i9);
        if (iC != 0) {
            int i10 = ~i8;
            int i11 = iA & i10;
            int i12 = -1;
            while (true) {
                int i13 = iC - 1;
                int i14 = iArr[i13];
                int i15 = i14 & i8;
                if ((i14 & i10) != i11 || !r.a(obj, objArr[i13]) || (objArr2 != null && !r.a(obj2, objArr2[i13]))) {
                    if (i15 == 0) {
                        break;
                    }
                    i12 = i13;
                    iC = i15;
                } else {
                    if (i12 == -1) {
                        e(obj3, i9, i15);
                        return i13;
                    }
                    iArr[i12] = (iArr[i12] & i10) | (i15 & i8);
                    return i13;
                }
            }
        }
        return -1;
    }

    public static int c(Object obj, int i8) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i8] & 255;
        }
        return obj instanceof short[] ? (char) ((short[]) obj)[i8] : ((int[]) obj)[i8];
    }

    public static Object d(int i8) {
        if (i8 >= 2 && i8 <= 1073741824 && Integer.highestOneBit(i8) == i8) {
            if (i8 <= 256) {
                return new byte[i8];
            }
            return i8 <= 65536 ? new short[i8] : new int[i8];
        }
        throw new IllegalArgumentException("must be power of 2 between 2^1 and 2^30: " + i8);
    }

    public static void e(Object obj, int i8, int i9) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i8] = (byte) i9;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i8] = (short) i9;
        } else {
            ((int[]) obj)[i8] = i9;
        }
    }
}
