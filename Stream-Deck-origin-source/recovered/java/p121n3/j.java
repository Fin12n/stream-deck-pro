package p121n3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.provider.Settings;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;
import p004a3.AbstractC1699e;
import p022c3.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f30565a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f30566b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ThreadLocal f30567c = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f30568d = new d();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f30569e = (float) (Math.sqrt(2.0d) / 2.0d);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PathMeasure initialValue() {
            return new PathMeasure();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class b extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class c extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class d extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public float[] initialValue() {
            return new float[4];
        }
    }

    public static void a(Path path, float f8, float f9, float f10) {
        AbstractC1699e.b("applyTrimPathIfNeeded");
        PathMeasure pathMeasure = (PathMeasure) f30565a.get();
        Path path2 = (Path) f30566b.get();
        Path path3 = (Path) f30567c.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f8 == 1.0f && f9 == 0.0f) {
            AbstractC1699e.c("applyTrimPathIfNeeded");
            return;
        }
        if (length < 1.0f || Math.abs((f9 - f8) - 1.0f) < 0.01d) {
            AbstractC1699e.c("applyTrimPathIfNeeded");
            return;
        }
        float f11 = f8 * length;
        float f12 = f9 * length;
        float f13 = f10 * length;
        float fMin = Math.min(f11, f12) + f13;
        float fMax = Math.max(f11, f12) + f13;
        if (fMin >= length && fMax >= length) {
            fMin = i.f(fMin, length);
            fMax = i.f(fMax, length);
        }
        if (fMin < 0.0f) {
            fMin = i.f(fMin, length);
        }
        if (fMax < 0.0f) {
            fMax = i.f(fMax, length);
        }
        if (fMin == fMax) {
            path.reset();
            AbstractC1699e.c("applyTrimPathIfNeeded");
            return;
        }
        if (fMin >= fMax) {
            fMin -= length;
        }
        path2.reset();
        pathMeasure.getSegment(fMin, fMax, path2, true);
        if (fMax > length) {
            path3.reset();
            pathMeasure.getSegment(0.0f, fMax % length, path3, true);
            path2.addPath(path3);
        } else if (fMin < 0.0f) {
            path3.reset();
            pathMeasure.getSegment(fMin + length, length, path3, true);
            path2.addPath(path3);
        }
        path.set(path2);
        AbstractC1699e.c("applyTrimPathIfNeeded");
    }

    public static void b(Path path, u uVar) {
        if (uVar == null || uVar.k()) {
            return;
        }
        a(path, ((p031d3.d) uVar.i()).q() / 100.0f, ((p031d3.d) uVar.e()).q() / 100.0f, ((p031d3.d) uVar.g()).q() / 360.0f);
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e8) {
                throw e8;
            } catch (Exception unused) {
            }
        }
    }

    public static Path d(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
            return path;
        }
        float f8 = pointF.x + pointF3.x;
        float f9 = pointF.y + pointF3.y;
        float f10 = pointF2.x;
        float f11 = f10 + pointF4.x;
        float f12 = pointF2.y;
        path.cubicTo(f8, f9, f11, f12 + pointF4.y, f10, f12);
        return path;
    }

    public static float e() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static float f(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static float g(Matrix matrix) {
        float[] fArr = (float[]) f30568d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f8 = f30569e;
        fArr[2] = f8;
        fArr[3] = f8;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static boolean h(Matrix matrix) {
        float[] fArr = (float[]) f30568d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        return fArr[0] == fArr[2] || fArr[1] == fArr[3];
    }

    public static int i(float f8, float f9, float f10, float f11) {
        int i8 = f8 != 0.0f ? (int) (527 * f8) : 17;
        if (f9 != 0.0f) {
            i8 = (int) (i8 * 31 * f9);
        }
        if (f10 != 0.0f) {
            i8 = (int) (i8 * 31 * f10);
        }
        return f11 != 0.0f ? (int) (i8 * 31 * f11) : i8;
    }

    public static boolean j(int i8, int i9, int i10, int i11, int i12, int i13) {
        if (i8 < i11) {
            return false;
        }
        if (i8 > i11) {
            return true;
        }
        if (i9 < i12) {
            return false;
        }
        return i9 > i12 || i10 >= i13;
    }

    public static boolean k(Throwable th) {
        return (th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException);
    }

    public static Bitmap l(Bitmap bitmap, int i8, int i9) {
        if (bitmap.getWidth() == i8 && bitmap.getHeight() == i9) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i8, i9, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }

    public static void m(Canvas canvas, RectF rectF, Paint paint) {
        n(canvas, rectF, paint, 31);
    }

    public static void n(Canvas canvas, RectF rectF, Paint paint, int i8) {
        AbstractC1699e.b("Utils#saveLayer");
        canvas.saveLayer(rectF, paint);
        AbstractC1699e.c("Utils#saveLayer");
    }
}
