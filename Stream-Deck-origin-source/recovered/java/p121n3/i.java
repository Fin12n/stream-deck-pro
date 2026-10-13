package p121n3;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;
import p022c3.k;
import p058g3.a;
import p058g3.e;
import p076i3.o;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PointF f30564a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f8, float f9, float f10) {
        return Math.max(f9, Math.min(f10, f8));
    }

    public static int c(int i8, int i9, int i10) {
        return Math.max(i9, Math.min(i10, i8));
    }

    public static boolean d(float f8, float f9, float f10) {
        return f8 >= f9 && f8 <= f10;
    }

    public static int e(int i8, int i9) {
        int i10 = i8 / i9;
        return (((i8 ^ i9) >= 0) || i8 % i9 == 0) ? i10 : i10 - 1;
    }

    public static int f(float f8, float f9) {
        return g((int) f8, (int) f9);
    }

    public static int g(int i8, int i9) {
        return i8 - (i9 * e(i8, i9));
    }

    public static void h(o oVar, Path path) {
        Path path2;
        path.reset();
        PointF pointFB = oVar.b();
        path.moveTo(pointFB.x, pointFB.y);
        f30564a.set(pointFB.x, pointFB.y);
        int i8 = 0;
        while (i8 < oVar.a().size()) {
            a aVar = (a) oVar.a().get(i8);
            PointF pointFA = aVar.a();
            PointF pointFB2 = aVar.b();
            PointF pointFC = aVar.c();
            PointF pointF = f30564a;
            if (pointFA.equals(pointF) && pointFB2.equals(pointFC)) {
                path.lineTo(pointFC.x, pointFC.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(pointFA.x, pointFA.y, pointFB2.x, pointFB2.y, pointFC.x, pointFC.y);
            }
            pointF.set(pointFC.x, pointFC.y);
            i8++;
            path = path2;
        }
        Path path3 = path;
        if (oVar.d()) {
            path3.close();
        }
    }

    public static float i(float f8, float f9, float f10) {
        return f8 + (f10 * (f9 - f8));
    }

    public static int j(int i8, int i9, float f8) {
        return (int) (i8 + (f8 * (i9 - i8)));
    }

    public static void k(e eVar, int i8, List list, e eVar2, k kVar) {
        if (eVar.c(kVar.getName(), i8)) {
            list.add(eVar2.a(kVar.getName()).i(kVar));
        }
    }
}
