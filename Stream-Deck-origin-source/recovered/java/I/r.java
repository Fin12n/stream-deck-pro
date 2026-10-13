package I;

import android.opengl.Matrix;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[] f3669a = new float[16];

    public static void a(float[] fArr, float f8, float f9) {
        Matrix.translateM(fArr, 0, -f8, -f9, 0.0f);
    }

    public static void b(float[] fArr, float f8, float f9) {
        Matrix.translateM(fArr, 0, f8, f9, 0.0f);
    }

    public static void c(float[] fArr, float f8, float f9, float f10) {
        b(fArr, f9, f10);
        Matrix.rotateM(fArr, 0, f8, 0.0f, 0.0f, 1.0f);
        a(fArr, f9, f10);
    }

    public static void d(float[] fArr, float f8) {
        b(fArr, 0.0f, f8);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        a(fArr, 0.0f, f8);
    }
}
