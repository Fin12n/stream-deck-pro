package p103l3;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import p112m3.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.a f29196a = c.a.a("x", "y");

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29197a;

        static {
            int[] iArr = new int[c.b.values().length];
            f29197a = iArr;
            try {
                iArr[c.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29197a[c.b.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29197a[c.b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static PointF a(c cVar, float f8) {
        cVar.c();
        float fNextDouble = (float) cVar.nextDouble();
        float fNextDouble2 = (float) cVar.nextDouble();
        while (cVar.y() != c.b.END_ARRAY) {
            cVar.R();
        }
        cVar.j();
        return new PointF(fNextDouble * f8, fNextDouble2 * f8);
    }

    public static PointF b(c cVar, float f8) {
        float fNextDouble = (float) cVar.nextDouble();
        float fNextDouble2 = (float) cVar.nextDouble();
        while (cVar.o()) {
            cVar.R();
        }
        return new PointF(fNextDouble * f8, fNextDouble2 * f8);
    }

    public static PointF c(c cVar, float f8) {
        cVar.x();
        float fG = 0.0f;
        float fG2 = 0.0f;
        while (cVar.o()) {
            int iA = cVar.A(f29196a);
            if (iA == 0) {
                fG = g(cVar);
            } else if (iA != 1) {
                cVar.Y();
                cVar.R();
            } else {
                fG2 = g(cVar);
            }
        }
        cVar.u();
        return new PointF(fG * f8, fG2 * f8);
    }

    public static int d(c cVar) {
        cVar.c();
        int iNextDouble = (int) (cVar.nextDouble() * 255.0d);
        int iNextDouble2 = (int) (cVar.nextDouble() * 255.0d);
        int iNextDouble3 = (int) (cVar.nextDouble() * 255.0d);
        while (cVar.o()) {
            cVar.R();
        }
        cVar.j();
        return Color.argb(255, iNextDouble, iNextDouble2, iNextDouble3);
    }

    public static PointF e(c cVar, float f8) {
        int i8 = a.f29197a[cVar.y().ordinal()];
        if (i8 == 1) {
            return b(cVar, f8);
        }
        if (i8 == 2) {
            return a(cVar, f8);
        }
        if (i8 == 3) {
            return c(cVar, f8);
        }
        throw new IllegalArgumentException("Unknown point starts with " + cVar.y());
    }

    public static List f(c cVar, float f8) {
        ArrayList arrayList = new ArrayList();
        cVar.c();
        while (cVar.y() == c.b.BEGIN_ARRAY) {
            cVar.c();
            arrayList.add(e(cVar, f8));
            cVar.j();
        }
        cVar.j();
        return arrayList;
    }

    public static float g(c cVar) {
        c.b bVarY = cVar.y();
        int i8 = a.f29197a[bVarY.ordinal()];
        if (i8 == 1) {
            return (float) cVar.nextDouble();
        }
        if (i8 != 2) {
            throw new IllegalArgumentException("Unknown value for token of type " + bVarY);
        }
        cVar.c();
        float fNextDouble = (float) cVar.nextDouble();
        while (cVar.o()) {
            cVar.R();
        }
        cVar.j();
        return fNextDouble;
    }
}
