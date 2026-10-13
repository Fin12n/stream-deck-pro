package W1;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: W1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class C0293a {
        public static Interpolator a(float f8, float f9) {
            return new PathInterpolator(f8, f9);
        }

        public static Interpolator b(float f8, float f9, float f10, float f11) {
            return new PathInterpolator(f8, f9, f10, f11);
        }

        public static Interpolator c(Path path) {
            return new PathInterpolator(path);
        }
    }

    public static Interpolator a(float f8, float f9, float f10, float f11) {
        return C0293a.b(f8, f9, f10, f11);
    }
}
