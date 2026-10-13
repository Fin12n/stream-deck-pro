package p198x;

import H.c1;
import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk;
import p158s.a;
import p190w.e;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Rational f37157a = new Rational(16, 9);

    public static boolean a(Size size, Rational rational) {
        return rational.equals(new Rational(size.getWidth(), size.getHeight()));
    }

    public static void b(Size size, c1.b bVar) {
        if (((PreviewPixelHDRnetQuirk) e.b(PreviewPixelHDRnetQuirk.class)) == null || a(size, f37157a)) {
            return;
        }
        a.C0723a c0723a = new a.C0723a();
        c0723a.f(CaptureRequest.TONEMAP_MODE, 2);
        bVar.g(c0723a.c());
    }
}
