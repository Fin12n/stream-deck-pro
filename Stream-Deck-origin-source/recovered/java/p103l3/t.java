package p103l3;

import W1.a;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.lang.ref.WeakReference;
import p004a3.AbstractC1699e;
import p004a3.C1705k;
import p010b0.D;
import p112m3.c;
import p121n3.i;
import p121n3.j;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static D f29199b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Interpolator f29198a = new LinearInterpolator();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static c.a f29200c = c.a.a("t", "s", "e", "o", "i", "h", "to", "ti");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static c.a f29201d = c.a.a("x", "y");

    public static WeakReference a(int i8) {
        WeakReference weakReference;
        synchronized (t.class) {
            weakReference = (WeakReference) g().f(i8);
        }
        return weakReference;
    }

    public static Interpolator b(PointF pointF, PointF pointF2) {
        Interpolator interpolatorA;
        pointF.x = i.b(pointF.x, -1.0f, 1.0f);
        pointF.y = i.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = i.b(pointF2.x, -1.0f, 1.0f);
        float fB = i.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fB;
        int i8 = j.i(pointF.x, pointF.y, pointF2.x, fB);
        WeakReference weakReferenceA = AbstractC1699e.e() ? null : a(i8);
        Interpolator interpolator = weakReferenceA != null ? (Interpolator) weakReferenceA.get() : null;
        if (weakReferenceA != null && interpolator != null) {
            return interpolator;
        }
        try {
            interpolatorA = a.a(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e8) {
            interpolatorA = "The Path cannot loop back on itself.".equals(e8.getMessage()) ? a.a(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
        if (!AbstractC1699e.e()) {
            try {
                h(i8, new WeakReference(interpolatorA));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolatorA;
    }

    public static p130o3.a c(c cVar, C1705k c1705k, float f8, N n8, boolean z8, boolean z9) {
        if (z8 && z9) {
            return e(c1705k, cVar, f8, n8);
        }
        return z8 ? d(c1705k, cVar, f8, n8) : f(cVar, f8, n8);
    }

    public static p130o3.a d(C1705k c1705k, c cVar, float f8, N n8) {
        Interpolator interpolatorB;
        Object obj;
        cVar.x();
        PointF pointFE = null;
        Object objA = null;
        Object objA2 = null;
        PointF pointFE2 = null;
        PointF pointFE3 = null;
        float fNextDouble = 0.0f;
        boolean z8 = false;
        PointF pointFE4 = null;
        while (cVar.o()) {
            switch (cVar.A(f29200c)) {
                case 0:
                    fNextDouble = (float) cVar.nextDouble();
                    break;
                case 1:
                    objA2 = n8.a(cVar, f8);
                    break;
                case 2:
                    objA = n8.a(cVar, f8);
                    break;
                case 3:
                    pointFE = s.e(cVar, 1.0f);
                    break;
                case 4:
                    pointFE4 = s.e(cVar, 1.0f);
                    break;
                case 5:
                    z8 = cVar.nextInt() == 1;
                    break;
                case 6:
                    pointFE2 = s.e(cVar, f8);
                    break;
                case 7:
                    pointFE3 = s.e(cVar, f8);
                    break;
                default:
                    cVar.R();
                    break;
            }
        }
        cVar.u();
        if (z8) {
            interpolatorB = f29198a;
            obj = objA2;
        } else {
            interpolatorB = (pointFE == null || pointFE4 == null) ? f29198a : b(pointFE, pointFE4);
            obj = objA;
        }
        p130o3.a aVar = new p130o3.a(c1705k, objA2, obj, interpolatorB, fNextDouble, null);
        aVar.f30885o = pointFE2;
        aVar.f30886p = pointFE3;
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:93:0x01e2  */
    public static p130o3.a e(C1705k c1705k, c cVar, float f8, N n8) {
        Interpolator interpolatorB;
        Interpolator interpolatorB2;
        Interpolator interpolatorB3;
        Object obj;
        Interpolator interpolator;
        PointF pointF;
        p130o3.a aVar;
        PointF pointF2;
        boolean z8;
        float f9;
        cVar.x();
        boolean z9 = false;
        PointF pointFE = null;
        PointF pointFE2 = null;
        PointF pointF3 = null;
        Object objA = null;
        PointF pointF4 = null;
        PointF pointF5 = null;
        PointF pointF6 = null;
        PointF pointFE3 = null;
        PointF pointFE4 = null;
        float fNextDouble = 0.0f;
        Object objA2 = null;
        while (cVar.o()) {
            switch (cVar.A(f29200c)) {
                case 0:
                    fNextDouble = (float) cVar.nextDouble();
                    break;
                case 1:
                    objA = n8.a(cVar, f8);
                    break;
                case 2:
                    objA2 = n8.a(cVar, f8);
                    break;
                case 3:
                    boolean z10 = z9;
                    if (cVar.y() == c.b.BEGIN_OBJECT) {
                        cVar.x();
                        float fNextDouble2 = 0.0f;
                        float fNextDouble3 = 0.0f;
                        float fNextDouble4 = 0.0f;
                        float fNextDouble5 = 0.0f;
                        while (cVar.o()) {
                            int iA = cVar.A(f29201d);
                            if (iA == 0) {
                                pointF2 = pointF5;
                                c.b bVarY = cVar.y();
                                c.b bVar = c.b.NUMBER;
                                if (bVarY == bVar) {
                                    fNextDouble4 = (float) cVar.nextDouble();
                                    fNextDouble2 = fNextDouble4;
                                } else {
                                    cVar.c();
                                    fNextDouble2 = (float) cVar.nextDouble();
                                    fNextDouble4 = cVar.y() == bVar ? (float) cVar.nextDouble() : fNextDouble2;
                                    cVar.j();
                                }
                            } else if (iA != 1) {
                                cVar.R();
                            } else {
                                c.b bVarY2 = cVar.y();
                                c.b bVar2 = c.b.NUMBER;
                                if (bVarY2 == bVar2) {
                                    pointF2 = pointF5;
                                    fNextDouble5 = (float) cVar.nextDouble();
                                    fNextDouble3 = fNextDouble5;
                                } else {
                                    pointF2 = pointF5;
                                    cVar.c();
                                    fNextDouble3 = (float) cVar.nextDouble();
                                    fNextDouble5 = cVar.y() == bVar2 ? (float) cVar.nextDouble() : fNextDouble3;
                                    cVar.j();
                                }
                            }
                            pointF5 = pointF2;
                        }
                        pointF3 = new PointF(fNextDouble2, fNextDouble3);
                        pointF4 = new PointF(fNextDouble4, fNextDouble5);
                        cVar.u();
                    } else {
                        pointFE = s.e(cVar, f8);
                    }
                    z9 = z10;
                    break;
                case 4:
                    if (cVar.y() != c.b.BEGIN_OBJECT) {
                        pointFE2 = s.e(cVar, f8);
                    } else {
                        cVar.x();
                        float f10 = 0.0f;
                        float f11 = 0.0f;
                        float fNextDouble6 = 0.0f;
                        float fNextDouble7 = 0.0f;
                        while (cVar.o()) {
                            int iA2 = cVar.A(f29201d);
                            if (iA2 != 0) {
                                z8 = z9;
                                if (iA2 != 1) {
                                    cVar.R();
                                } else {
                                    c.b bVarY3 = cVar.y();
                                    c.b bVar3 = c.b.NUMBER;
                                    if (bVarY3 == bVar3) {
                                        fNextDouble7 = (float) cVar.nextDouble();
                                        f11 = fNextDouble7;
                                    } else {
                                        cVar.c();
                                        PointF pointF7 = pointFE3;
                                        float fNextDouble8 = (float) cVar.nextDouble();
                                        fNextDouble7 = cVar.y() == bVar3 ? (float) cVar.nextDouble() : fNextDouble8;
                                        cVar.j();
                                        pointFE3 = pointF7;
                                        f11 = fNextDouble8;
                                    }
                                }
                            } else {
                                z8 = z9;
                                PointF pointF8 = pointFE3;
                                c.b bVarY4 = cVar.y();
                                c.b bVar4 = c.b.NUMBER;
                                if (bVarY4 == bVar4) {
                                    pointFE3 = pointF8;
                                    fNextDouble6 = (float) cVar.nextDouble();
                                    f10 = fNextDouble6;
                                } else {
                                    pointFE3 = pointF8;
                                    cVar.c();
                                    float fNextDouble9 = (float) cVar.nextDouble();
                                    if (cVar.y() == bVar4) {
                                        f9 = fNextDouble9;
                                        fNextDouble6 = (float) cVar.nextDouble();
                                    } else {
                                        f9 = fNextDouble9;
                                        fNextDouble6 = f9;
                                    }
                                    cVar.j();
                                    f10 = f9;
                                }
                            }
                            z9 = z8;
                        }
                        PointF pointF9 = new PointF(f10, f11);
                        PointF pointF10 = new PointF(fNextDouble6, fNextDouble7);
                        cVar.u();
                        pointF6 = pointF10;
                        pointF5 = pointF9;
                    }
                    break;
                case 5:
                    z9 = cVar.nextInt() == 1;
                    break;
                case 6:
                    pointFE3 = s.e(cVar, f8);
                    break;
                case 7:
                    pointFE4 = s.e(cVar, f8);
                    break;
                default:
                    cVar.R();
                    break;
            }
        }
        boolean z11 = z9;
        PointF pointF11 = pointF5;
        cVar.u();
        if (z11) {
            interpolator = f29198a;
            obj = objA;
        } else {
            if (pointFE == null || pointFE2 == null) {
                if (pointF3 == null || pointF4 == null || pointF11 == null || pointF6 == null) {
                    interpolatorB = f29198a;
                } else {
                    interpolatorB2 = b(pointF3, pointF11);
                    interpolatorB3 = b(pointF4, pointF6);
                    obj = objA2;
                    interpolator = null;
                }
                if (interpolatorB2 != null || interpolatorB3 == null) {
                    pointF = pointFE4;
                    aVar = new p130o3.a(c1705k, objA, obj, interpolator, fNextDouble, null);
                } else {
                    pointF = pointFE4;
                    aVar = new p130o3.a(c1705k, objA, obj, interpolatorB2, interpolatorB3, fNextDouble, null);
                }
                aVar.f30885o = pointFE3;
                aVar.f30886p = pointF;
                return aVar;
            }
            interpolatorB = b(pointFE, pointFE2);
            interpolator = interpolatorB;
            obj = objA2;
        }
        interpolatorB2 = null;
        interpolatorB3 = null;
        if (interpolatorB2 != null) {
            pointF = pointFE4;
            aVar = new p130o3.a(c1705k, objA, obj, interpolator, fNextDouble, null);
        } else {
            pointF = pointFE4;
            aVar = new p130o3.a(c1705k, objA, obj, interpolator, fNextDouble, null);
        }
        aVar.f30885o = pointFE3;
        aVar.f30886p = pointF;
        return aVar;
    }

    public static p130o3.a f(c cVar, float f8, N n8) {
        return new p130o3.a(n8.a(cVar, f8));
    }

    public static D g() {
        if (f29199b == null) {
            f29199b = new D();
        }
        return f29199b;
    }

    public static void h(int i8, WeakReference weakReference) {
        synchronized (t.class) {
            f29199b.i(i8, weakReference);
        }
    }
}
