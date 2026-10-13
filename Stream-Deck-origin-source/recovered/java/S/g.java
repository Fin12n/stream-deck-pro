package S;

import android.opengl.EGLSurface;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static g d(EGLSurface eGLSurface, int i8, int i9) {
        return new c(eGLSurface, i8, i9);
    }

    public abstract EGLSurface a();

    public abstract int b();

    public abstract int c();
}
