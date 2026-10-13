package androidx.camera.core.impl.utils;

import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class SurfaceUtil {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f14166a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14167b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f14168c = 0;
    }

    static {
        System.loadLibrary("surface_util_jni");
    }

    public static a a(Surface surface) {
        int[] iArrNativeGetSurfaceInfo = nativeGetSurfaceInfo(surface);
        a aVar = new a();
        aVar.f14166a = iArrNativeGetSurfaceInfo[0];
        aVar.f14167b = iArrNativeGetSurfaceInfo[1];
        aVar.f14168c = iArrNativeGetSurfaceInfo[2];
        return aVar;
    }

    private static native int[] nativeGetSurfaceInfo(Surface surface);
}
