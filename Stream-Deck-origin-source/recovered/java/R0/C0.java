package R0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class C0 {
    public static final float b(float[] fArr, int i8, float[] fArr2, int i9) {
        int i10 = i8 * 4;
        return (fArr[i10] * fArr2[i9]) + (fArr[i10 + 1] * fArr2[4 + i9]) + (fArr[i10 + 2] * fArr2[8 + i9]) + (fArr[i10 + 3] * fArr2[12 + i9]);
    }

    public static final boolean c(float[] fArr) {
        int i8 = 0;
        while (i8 < 4) {
            int i9 = 0;
            while (i9 < 4) {
                if (fArr[(i8 * 4) + i9] != (i8 == i9 ? 1.0f : 0.0f)) {
                    return false;
                }
                i9++;
            }
            i8++;
        }
        return true;
    }
}
