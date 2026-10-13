package X;

import A.AbstractC0895s0;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Rational;
import android.util.Size;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class o extends AbstractC0895s0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final PointF f11617e = new PointF(2.0f, 2.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f11618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Rect f11619c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Matrix f11620d;

    public o(f fVar) {
        this.f11618b = fVar;
    }

    public void b(Size size, int i8) {
        Rect rect;
        I.w.b();
        synchronized (this) {
            try {
                if (size.getWidth() != 0 && size.getHeight() != 0 && (rect = this.f11619c) != null) {
                    this.f11620d = this.f11618b.c(size, i8, rect);
                    return;
                }
                this.f11620d = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(Rect rect) {
        a(new Rational(rect.width(), rect.height()));
        synchronized (this) {
            this.f11619c = rect;
        }
    }
}
