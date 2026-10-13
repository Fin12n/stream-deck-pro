package I;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RectF f3673a = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    public static float a(float f8, float f9, float f10, float f11) {
        float f12 = (f8 * f10) + (f9 * f11);
        float f13 = (f8 * f11) - (f9 * f10);
        double dSqrt = Math.sqrt((f8 * f8) + (f9 * f9)) * Math.sqrt((f10 * f10) + (f11 * f11));
        return (float) Math.toDegrees(Math.atan2(((double) f13) / dSqrt, ((double) f12) / dSqrt));
    }

    public static Matrix b(Rect rect) {
        return c(new RectF(rect));
    }

    public static Matrix c(RectF rectF) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(f3673a, rectF, Matrix.ScaleToFit.FILL);
        return matrix;
    }

    public static Matrix d(RectF rectF, RectF rectF2, int i8) {
        return e(rectF, rectF2, i8, false);
    }

    public static Matrix e(RectF rectF, RectF rectF2, int i8, boolean z8) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(rectF, f3673a, Matrix.ScaleToFit.FILL);
        matrix.postRotate(i8);
        if (z8) {
            matrix.postScale(-1.0f, 1.0f);
        }
        matrix.postConcat(c(rectF2));
        return matrix;
    }

    public static Size f(Rect rect, int i8) {
        return o(m(rect), i8);
    }

    public static int g(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return u((int) Math.round(Math.atan2(fArr[3], fArr[0]) * 57.29577951308232d));
    }

    public static boolean h(Rect rect, Size size) {
        return (rect.left == 0 && rect.top == 0 && rect.width() == size.getWidth() && rect.height() == size.getHeight()) ? false : true;
    }

    public static boolean i(int i8) {
        if (i8 == 90 || i8 == 270) {
            return true;
        }
        if (i8 == 0 || i8 == 180) {
            return false;
        }
        throw new IllegalArgumentException("Invalid rotation degrees: " + i8);
    }

    public static boolean j(Size size, Size size2) {
        return k(size, false, size2, false);
    }

    public static boolean k(Size size, boolean z8, Size size2, boolean z9) {
        float width;
        float width2;
        float width3;
        float f8;
        if (z8) {
            width = size.getWidth() / size.getHeight();
            width2 = width;
        } else {
            width = (size.getWidth() + 1.0f) / (size.getHeight() - 1.0f);
            width2 = (size.getWidth() - 1.0f) / (size.getHeight() + 1.0f);
        }
        if (z9) {
            width3 = size2.getWidth() / size2.getHeight();
            f8 = width3;
        } else {
            float width4 = (size2.getWidth() + 1.0f) / (size2.getHeight() - 1.0f);
            width3 = (size2.getWidth() - 1.0f) / (size2.getHeight() + 1.0f);
            f8 = width4;
        }
        return width >= width3 && f8 >= width2;
    }

    public static boolean l(Matrix matrix) {
        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
        matrix.mapVectors(fArr);
        return a(fArr[0], fArr[1], fArr[2], fArr[3]) > 0.0f;
    }

    public static Size m(Rect rect) {
        return new Size(rect.width(), rect.height());
    }

    public static Size n(Size size) {
        return new Size(size.getHeight(), size.getWidth());
    }

    public static Size o(Size size, int i8) {
        T1.f.b(i8 % 90 == 0, "Invalid rotation degrees: " + i8);
        return i(u(i8)) ? n(size) : size;
    }

    public static Rect p(Size size) {
        return q(size, 0, 0);
    }

    public static Rect q(Size size, int i8, int i9) {
        return new Rect(i8, i9, size.getWidth() + i8, size.getHeight() + i9);
    }

    public static RectF r(Size size) {
        return s(size, 0, 0);
    }

    public static RectF s(Size size, int i8, int i9) {
        return new RectF(i8, i9, i8 + size.getWidth(), i9 + size.getHeight());
    }

    public static Matrix t(Matrix matrix, Rect rect) {
        Matrix matrix2 = new Matrix(matrix);
        matrix2.postTranslate(-rect.left, -rect.top);
        return matrix2;
    }

    public static int u(int i8) {
        return ((i8 % 360) + 360) % 360;
    }
}
