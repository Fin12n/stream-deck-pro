package M;

import I.m;
import android.media.Image;
import android.media.ImageWriter;
import android.view.Surface;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static void c(ImageWriter imageWriter) {
        imageWriter.close();
    }

    public static Image d(ImageWriter imageWriter) {
        return imageWriter.dequeueInputImage();
    }

    public static ImageWriter e(Surface surface, int i8) {
        return ImageWriter.newInstance(surface, i8);
    }

    public static void f(ImageWriter imageWriter, Image image) {
        imageWriter.queueInputImage(image);
    }

    public static void g(ImageWriter imageWriter, final ImageWriter.OnImageReleasedListener onImageReleasedListener, final Executor executor) {
        imageWriter.setOnImageReleasedListener(new ImageWriter.OnImageReleasedListener() { // from class: M.c
            @Override // android.media.ImageWriter.OnImageReleasedListener
            public final void onImageReleased(ImageWriter imageWriter2) {
                executor.execute(new Runnable() { // from class: M.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        onImageReleasedListener.onImageReleased(imageWriter2);
                    }
                });
            }
        }, m.a());
    }
}
