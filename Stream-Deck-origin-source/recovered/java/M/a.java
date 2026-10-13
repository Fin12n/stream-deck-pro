package M;

import android.media.Image;
import android.media.ImageWriter;
import android.view.Surface;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static void a(ImageWriter imageWriter) {
        d.c(imageWriter);
    }

    public static Image b(ImageWriter imageWriter) {
        return d.d(imageWriter);
    }

    public static ImageWriter c(Surface surface, int i8) {
        return d.e(surface, i8);
    }

    public static void d(ImageWriter imageWriter, Image image) {
        d.f(imageWriter, image);
    }

    public static void e(ImageWriter imageWriter, ImageWriter.OnImageReleasedListener onImageReleasedListener, Executor executor) {
        d.g(imageWriter, onImageReleasedListener, executor);
    }
}
