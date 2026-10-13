package R0;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class M {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f9323b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f9324c;

        static {
            int[] iArr = new int[Paint.Style.values().length];
            try {
                iArr[Paint.Style.STROKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f9322a = iArr;
            int[] iArr2 = new int[Paint.Cap.values().length];
            try {
                iArr2[Paint.Cap.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[Paint.Cap.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Paint.Cap.SQUARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            f9323b = iArr2;
            int[] iArr3 = new int[Paint.Join.values().length];
            try {
                iArr3[Paint.Join.MITER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[Paint.Join.BEVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[Paint.Join.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f9324c = iArr3;
        }
    }

    public static final F0 a() {
        return new L();
    }

    public static final F0 b(Paint paint) {
        return new L(paint);
    }

    public static final float c(Paint paint) {
        return paint.getAlpha() / 255.0f;
    }

    public static final long d(Paint paint) {
        return AbstractC1602n0.b(paint.getColor());
    }

    public static final int e(Paint paint) {
        return !paint.isFilterBitmap() ? AbstractC1615u0.f9427a.b() : AbstractC1615u0.f9427a.a();
    }

    public static final int f(Paint paint) {
        Paint.Cap strokeCap = paint.getStrokeCap();
        int i8 = strokeCap == null ? -1 : a.f9323b[strokeCap.ordinal()];
        if (i8 == 1) {
            return V0.f9341a.a();
        }
        if (i8 != 2) {
            return i8 != 3 ? V0.f9341a.a() : V0.f9341a.c();
        }
        return V0.f9341a.b();
    }

    public static final int g(Paint paint) {
        Paint.Join strokeJoin = paint.getStrokeJoin();
        int i8 = strokeJoin == null ? -1 : a.f9324c[strokeJoin.ordinal()];
        if (i8 == 1) {
            return W0.f9346a.b();
        }
        if (i8 != 2) {
            return i8 != 3 ? W0.f9346a.b() : W0.f9346a.c();
        }
        return W0.f9346a.a();
    }

    public static final float h(Paint paint) {
        return paint.getStrokeMiter();
    }

    public static final float i(Paint paint) {
        return paint.getStrokeWidth();
    }

    public static final Paint j() {
        return new Paint(7);
    }

    public static final void k(Paint paint, float f8) {
        paint.setAlpha((int) Math.rint(f8 * 255.0f));
    }

    public static final void l(Paint paint, int i8) {
        if (Build.VERSION.SDK_INT >= 29) {
            b1.f9389a.a(paint, i8);
        } else {
            paint.setXfermode(new PorterDuffXfermode(D.c(i8)));
        }
    }

    public static final void m(Paint paint, long j8) {
        paint.setColor(AbstractC1602n0.j(j8));
    }

    public static final void n(Paint paint, C1600m0 c1600m0) {
        paint.setColorFilter(c1600m0 != null ? G.b(c1600m0) : null);
    }

    public static final void o(Paint paint, int i8) {
        paint.setFilterBitmap(!AbstractC1615u0.d(i8, AbstractC1615u0.f9427a.b()));
    }

    public static final void p(Paint paint, I0 i8) {
        O o8 = (O) i8;
        paint.setPathEffect(o8 != null ? o8.a() : null);
    }

    public static final void q(Paint paint, Shader shader) {
        paint.setShader(shader);
    }

    public static final void r(Paint paint, int i8) {
        Paint.Cap cap;
        V0.a aVar = V0.f9341a;
        if (V0.e(i8, aVar.c())) {
            cap = Paint.Cap.SQUARE;
        } else if (V0.e(i8, aVar.b())) {
            cap = Paint.Cap.ROUND;
        } else {
            cap = V0.e(i8, aVar.a()) ? Paint.Cap.BUTT : Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    public static final void s(Paint paint, int i8) {
        Paint.Join join;
        W0.a aVar = W0.f9346a;
        if (W0.e(i8, aVar.b())) {
            join = Paint.Join.MITER;
        } else if (W0.e(i8, aVar.a())) {
            join = Paint.Join.BEVEL;
        } else {
            join = W0.e(i8, aVar.c()) ? Paint.Join.ROUND : Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
    }

    public static final void t(Paint paint, float f8) {
        paint.setStrokeMiter(f8);
    }

    public static final void u(Paint paint, float f8) {
        paint.setStrokeWidth(f8);
    }

    public static final void v(Paint paint, int i8) {
        paint.setStyle(G0.d(i8, G0.f9302a.b()) ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
