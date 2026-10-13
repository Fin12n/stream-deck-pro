package R0;

import android.graphics.Shader;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class V {
    public static final Shader.TileMode a(int i8) {
        X0.a aVar = X0.f9380a;
        if (X0.f(i8, aVar.a())) {
            return Shader.TileMode.CLAMP;
        }
        if (X0.f(i8, aVar.d())) {
            return Shader.TileMode.REPEAT;
        }
        if (X0.f(i8, aVar.c())) {
            return Shader.TileMode.MIRROR;
        }
        if (X0.f(i8, aVar.b())) {
            return Build.VERSION.SDK_INT >= 31 ? Z0.f9387a.b() : Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.CLAMP;
    }
}
