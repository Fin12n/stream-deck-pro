package X;

import A.AbstractC0890p0;
import A.S0;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import p027d.LrLN.vHKCAgr;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final m.d f11561i = m.d.FILL_CENTER;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Size f11562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Rect f11563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Matrix f11565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11566e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f11567f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f11568g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public m.d f11569h = f11561i;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11570a;

        static {
            int[] iArr = new int[m.d.values().length];
            f11570a = iArr;
            try {
                iArr[m.d.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11570a[m.d.FILL_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11570a[m.d.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11570a[m.d.FILL_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11570a[m.d.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11570a[m.d.FILL_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static RectF b(RectF rectF, float f8) {
        float f9 = f8 + f8;
        return new RectF(f9 - rectF.right, rectF.top, f9 - rectF.left, rectF.bottom);
    }

    public static void p(Matrix matrix, RectF rectF, RectF rectF2, m.d dVar) {
        Matrix.ScaleToFit scaleToFit;
        switch (a.f11570a[dVar.ordinal()]) {
            case 1:
            case 2:
                scaleToFit = Matrix.ScaleToFit.CENTER;
                break;
            case 3:
            case 4:
                scaleToFit = Matrix.ScaleToFit.END;
                break;
            case 5:
            case 6:
                scaleToFit = Matrix.ScaleToFit.START;
                break;
            default:
                AbstractC0890p0.c("PreviewTransform", "Unexpected crop rect: " + dVar);
                scaleToFit = Matrix.ScaleToFit.FILL;
                break;
        }
        if (dVar == m.d.FIT_CENTER || dVar == m.d.FIT_START || dVar == m.d.FIT_END) {
            matrix.setRectToRect(rectF, rectF2, scaleToFit);
        } else {
            matrix.setRectToRect(rectF2, rectF, scaleToFit);
            matrix.invert(matrix);
        }
    }

    public Bitmap a(Bitmap bitmap, Size size, int i8) {
        if (!m()) {
            return bitmap;
        }
        Matrix matrixK = k();
        RectF rectFL = l(size, i8);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(matrixK);
        matrix.postScale(rectFL.width() / this.f11562a.getWidth(), rectFL.height() / this.f11562a.getHeight());
        matrix.postTranslate(rectFL.left, rectFL.top);
        canvas.drawBitmap(bitmap, matrix, new Paint(7));
        return bitmapCreateBitmap;
    }

    public Matrix c(Size size, int i8, Rect rect) {
        if (!m()) {
            return null;
        }
        Matrix matrix = new Matrix();
        h(size, i8).invert(matrix);
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(new RectF(0.0f, 0.0f, rect.width(), rect.height()), new RectF(0.0f, 0.0f, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
        matrix.postConcat(matrix2);
        return matrix;
    }

    public RectF d(Size size, int i8) {
        RectF rectF = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
        Size sizeF = f();
        RectF rectF2 = new RectF(0.0f, 0.0f, sizeF.getWidth(), sizeF.getHeight());
        Matrix matrix = new Matrix();
        p(matrix, rectF2, rectF, this.f11569h);
        matrix.mapRect(rectF2);
        return i8 == 1 ? b(rectF2, size.getWidth() / 2.0f) : rectF2;
    }

    public final int e() {
        return !this.f11568g ? this.f11564c : -I.c.b(this.f11566e);
    }

    public final Size f() {
        return I.x.i(this.f11564c) ? new Size(this.f11563b.height(), this.f11563b.width()) : new Size(this.f11563b.width(), this.f11563b.height());
    }

    public m.d g() {
        return this.f11569h;
    }

    public Matrix h(Size size, int i8) {
        if (!m()) {
            return null;
        }
        Matrix matrix = new Matrix(this.f11565d);
        matrix.postConcat(j(size, i8));
        return matrix;
    }

    public Rect i() {
        return this.f11563b;
    }

    public Matrix j(Size size, int i8) {
        T1.f.i(m());
        Matrix matrixD = I.x.d(new RectF(this.f11563b), n(size) ? new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()) : d(size, i8), this.f11564c);
        if (this.f11567f && this.f11568g) {
            if (I.x.i(this.f11564c)) {
                matrixD.preScale(1.0f, -1.0f, this.f11563b.centerX(), this.f11563b.centerY());
                return matrixD;
            }
            matrixD.preScale(-1.0f, 1.0f, this.f11563b.centerX(), this.f11563b.centerY());
        }
        return matrixD;
    }

    public Matrix k() {
        T1.f.i(m());
        RectF rectF = new RectF(0.0f, 0.0f, this.f11562a.getWidth(), this.f11562a.getHeight());
        return I.x.d(rectF, rectF, e());
    }

    public final RectF l(Size size, int i8) {
        T1.f.i(m());
        Matrix matrixJ = j(size, i8);
        RectF rectF = new RectF(0.0f, 0.0f, this.f11562a.getWidth(), this.f11562a.getHeight());
        matrixJ.mapRect(rectF);
        return rectF;
    }

    public final boolean m() {
        return (this.f11563b == null || this.f11562a == null || !(!this.f11568g || this.f11566e != -1)) ? false : true;
    }

    public boolean n(Size size) {
        return I.x.k(size, true, f(), false);
    }

    public void o(int i8, int i9) {
        if (this.f11568g) {
            this.f11564c = i8;
            this.f11566e = i9;
        }
    }

    public void q(m.d dVar) {
        this.f11569h = dVar;
    }

    public void r(S0.h hVar, Size size, boolean z8) {
        AbstractC0890p0.a("PreviewTransform", "Transformation info set: " + hVar + " " + size + " " + z8);
        this.f11563b = hVar.a();
        this.f11564c = hVar.b();
        this.f11566e = hVar.d();
        this.f11562a = size;
        this.f11567f = z8;
        this.f11568g = hVar.e();
        this.f11565d = hVar.c();
    }

    public void s(Size size, int i8, View view) {
        boolean z8;
        if (size.getHeight() != 0 && size.getWidth() != 0) {
            if (!m()) {
                return;
            }
            if (view instanceof TextureView) {
                ((TextureView) view).setTransform(k());
            } else {
                Display display = view.getDisplay();
                boolean z9 = false;
                if (this.f11568g && display != null && display.getRotation() != this.f11566e) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (!this.f11568g && e() != 0) {
                    z9 = true;
                }
                if (z8 || z9) {
                    AbstractC0890p0.c("PreviewTransform", vHKCAgr.GZUlxr);
                }
            }
            RectF rectFL = l(size, i8);
            view.setPivotX(0.0f);
            view.setPivotY(0.0f);
            view.setScaleX(rectFL.width() / this.f11562a.getWidth());
            view.setScaleY(rectFL.height() / this.f11562a.getHeight());
            view.setTranslationX(rectFL.left - view.getLeft());
            view.setTranslationY(rectFL.top - view.getTop());
            return;
        }
        AbstractC0890p0.l("PreviewTransform", "Transform not applied due to PreviewView size: " + size);
    }
}
