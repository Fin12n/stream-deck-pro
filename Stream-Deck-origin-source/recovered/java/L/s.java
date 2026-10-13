package L;

import A.T0;
import H.g1;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Rational;
import java.util.HashMap;
import java.util.Map;
import p143q0.nKy.bGZGhbtQmA;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {
    public static Map a(Rect rect, boolean z8, Rational rational, int i8, int i9, int i10, Map map) {
        T1.f.b(rect.width() > 0 && rect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        HashMap map2 = new HashMap();
        RectF rectF2 = new RectF(rect);
        for (Map.Entry entry : map.entrySet()) {
            Matrix matrix = new Matrix();
            RectF rectF3 = new RectF(0.0f, 0.0f, ((g1) entry.getValue()).f().getWidth(), ((g1) entry.getValue()).f().getHeight());
            matrix.setRectToRect(rectF3, rectF, Matrix.ScaleToFit.CENTER);
            map2.put((T0) entry.getKey(), matrix);
            RectF rectF4 = new RectF();
            matrix.mapRect(rectF4, rectF3);
            rectF2.intersect(rectF4);
        }
        RectF rectFG = g(rectF2, P.b.e(i8, rational), i9, z8, i10, i8);
        HashMap map3 = new HashMap();
        RectF rectF5 = new RectF();
        Matrix matrix2 = new Matrix();
        for (Map.Entry entry2 : map2.entrySet()) {
            ((Matrix) entry2.getValue()).invert(matrix2);
            matrix2.mapRect(rectF5, rectFG);
            Rect rect2 = new Rect();
            rectF5.round(rect2);
            map3.put((T0) entry2.getKey(), rect2);
        }
        return map3;
    }

    public static RectF b(boolean z8, int i8, RectF rectF, RectF rectF2) {
        boolean z9 = false;
        boolean z10 = i8 == 0 && !z8;
        boolean z11 = i8 == 90 && z8;
        if (z10 || z11) {
            return rectF2;
        }
        boolean z12 = i8 == 0 && z8;
        boolean z13 = i8 == 270 && !z8;
        if (z12 || z13) {
            return c(rectF2, rectF.centerX());
        }
        boolean z14 = i8 == 90 && !z8;
        boolean z15 = i8 == 180 && z8;
        if (z14 || z15) {
            return d(rectF2, rectF.centerY());
        }
        boolean z16 = i8 == 180 && !z8;
        if (i8 == 270 && z8) {
            z9 = true;
        }
        if (z16 || z9) {
            return c(d(rectF2, rectF.centerY()), rectF.centerX());
        }
        throw new IllegalArgumentException(bGZGhbtQmA.OfdHZkNDAoXG + z8 + " rotation " + i8);
    }

    public static RectF c(RectF rectF, float f8) {
        return new RectF(e(rectF.right, f8), rectF.top, e(rectF.left, f8), rectF.bottom);
    }

    public static RectF d(RectF rectF, float f8) {
        return new RectF(rectF.left, f(rectF.bottom, f8), rectF.right, f(rectF.top, f8));
    }

    public static float e(float f8, float f9) {
        return (f9 + f9) - f8;
    }

    public static float f(float f8, float f9) {
        return (f9 + f9) - f8;
    }

    public static RectF g(RectF rectF, Rational rational, int i8, boolean z8, int i9, int i10) {
        if (i8 == 3) {
            return rectF;
        }
        Matrix matrix = new Matrix();
        RectF rectF2 = new RectF(0.0f, 0.0f, rational.getNumerator(), rational.getDenominator());
        if (i8 == 0) {
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.START);
        } else if (i8 == 1) {
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.CENTER);
        } else {
            if (i8 != 2) {
                throw new IllegalStateException("Unexpected scale type: " + i8);
            }
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.END);
        }
        RectF rectF3 = new RectF();
        matrix.mapRect(rectF3, rectF2);
        return b(h(z8, i9), i10, rectF, rectF3);
    }

    public static boolean h(boolean z8, int i8) {
        return z8 ^ (i8 == 1);
    }
}
