package R0;

import android.graphics.Matrix;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class K {
    public static final void a(Matrix matrix, float[] fArr) {
        float f8 = fArr[2];
        if (f8 == 0.0f) {
            float f9 = fArr[6];
            if (f9 == 0.0f && fArr[10] == 1.0f && fArr[14] == 0.0f) {
                float f10 = fArr[8];
                if (f10 == 0.0f && fArr[9] == 0.0f && fArr[11] == 0.0f) {
                    float f11 = fArr[0];
                    float f12 = fArr[1];
                    float f13 = fArr[3];
                    float f14 = fArr[4];
                    float f15 = fArr[5];
                    float f16 = fArr[7];
                    float f17 = fArr[12];
                    float f18 = fArr[13];
                    float f19 = fArr[15];
                    fArr[0] = f11;
                    fArr[1] = f14;
                    fArr[2] = f17;
                    fArr[3] = f12;
                    fArr[4] = f15;
                    fArr[5] = f18;
                    fArr[6] = f13;
                    fArr[7] = f16;
                    fArr[8] = f19;
                    matrix.setValues(fArr);
                    fArr[0] = f11;
                    fArr[1] = f12;
                    fArr[2] = f8;
                    fArr[3] = f13;
                    fArr[4] = f14;
                    fArr[5] = f15;
                    fArr[6] = f9;
                    fArr[7] = f16;
                    fArr[8] = f10;
                    return;
                }
            }
        }
        throw new IllegalArgumentException("Android does not support arbitrary transforms");
    }

    public static final void b(float[] fArr, Matrix matrix) {
        matrix.getValues(fArr);
        float f8 = fArr[0];
        float f9 = fArr[1];
        float f10 = fArr[2];
        float f11 = fArr[3];
        float f12 = fArr[4];
        float f13 = fArr[5];
        float f14 = fArr[6];
        float f15 = fArr[7];
        float f16 = fArr[8];
        fArr[0] = f8;
        fArr[1] = f11;
        fArr[2] = 0.0f;
        fArr[3] = f14;
        fArr[4] = f9;
        fArr[5] = f12;
        fArr[6] = 0.0f;
        fArr[7] = f15;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f10;
        fArr[13] = f13;
        fArr[14] = 0.0f;
        fArr[15] = f16;
    }
}
