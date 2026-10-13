package p204x5;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class b {
    public static int a(int i8) {
        if (i8 == 0) {
            return 0;
        }
        if (i8 == 90) {
            return 1;
        }
        if (i8 == 180) {
            return 2;
        }
        if (i8 == 270) {
            return 3;
        }
        throw new IllegalArgumentException("Invalid rotation: " + i8);
    }

    public static void b(Point[] pointArr, Matrix matrix) {
        int length = pointArr.length;
        float[] fArr = new float[length + length];
        for (int i8 = 0; i8 < pointArr.length; i8++) {
            Point point = pointArr[i8];
            int i9 = i8 + i8;
            fArr[i9] = point.x;
            fArr[i9 + 1] = point.y;
        }
        matrix.mapPoints(fArr);
        for (int i10 = 0; i10 < pointArr.length; i10++) {
            int i11 = i10 + i10;
            pointArr[i10].set((int) fArr[i11], (int) fArr[i11 + 1]);
        }
    }

    public static void c(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }
}
