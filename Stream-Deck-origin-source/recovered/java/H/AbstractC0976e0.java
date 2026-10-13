package H;

import A.AbstractC0890p0;
import A.C0900v;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* JADX INFO: renamed from: H.e0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0976e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0900v f2989a = new C0900v.a().b(2).a();

    /* JADX INFO: renamed from: H.e0$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {
        public static int a(Context context) {
            return context.getDeviceId();
        }
    }

    /* JADX INFO: renamed from: H.e0$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f2990a;

        public b(String str, int i8, Throwable th) {
            super(str, th);
            this.f2990a = i8;
        }

        public int a() {
            return this.f2990a;
        }
    }

    public static void a(Context context, Y y8, C0900v c0900v) throws b {
        Integer numD;
        if (Build.VERSION.SDK_INT >= 34 && a.a(context) != 0) {
            AbstractC0890p0.a("CameraValidator", "Virtual device with ID: " + a.a(context) + " has " + y8.m().size() + " cameras. Skipping validation.");
            return;
        }
        IllegalArgumentException e8 = null;
        if (c0900v != null) {
            try {
                numD = c0900v.d();
                if (numD == null) {
                    AbstractC0890p0.l("CameraValidator", "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing.");
                    return;
                }
            } catch (IllegalStateException e9) {
                AbstractC0890p0.d("CameraValidator", "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e9);
                return;
            }
        } else {
            numD = null;
        }
        AbstractC0890p0.a("CameraValidator", "Verifying camera lens facing on " + Build.DEVICE + ", lensFacingInteger: " + numD);
        PackageManager packageManager = context.getPackageManager();
        int i8 = 0;
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera") && (c0900v == null || numD.intValue() == 1)) {
                C0900v.f314d.g(y8.m());
                i8 = 1;
            }
        } catch (IllegalArgumentException e10) {
            e8 = e10;
            AbstractC0890p0.m("CameraValidator", "Camera LENS_FACING_BACK verification failed", e8);
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera.front") && (c0900v == null || numD.intValue() == 0)) {
                C0900v.f313c.g(y8.m());
                i8++;
            }
        } catch (IllegalArgumentException e11) {
            e8 = e11;
            AbstractC0890p0.m("CameraValidator", "Camera LENS_FACING_FRONT verification failed", e8);
        }
        try {
            f2989a.g(y8.m());
            AbstractC0890p0.a("CameraValidator", "Found a LENS_FACING_EXTERNAL camera");
            i8++;
        } catch (IllegalArgumentException unused) {
        }
        if (e8 == null) {
            return;
        }
        AbstractC0890p0.c("CameraValidator", "Camera LensFacing verification failed, existing cameras: " + y8.m());
        throw new b("Expected camera missing from device.", i8, e8);
    }
}
