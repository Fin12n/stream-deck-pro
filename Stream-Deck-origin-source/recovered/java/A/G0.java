package A;

import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import java.io.Closeable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface G0 extends Closeable {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class a {
        public static a f(Size size, Rect rect, H.J j8, int i8, boolean z8) {
            return new C0873h(size, rect, j8, i8, z8);
        }

        public abstract H.J a();

        public abstract Rect b();

        public abstract Size c();

        public abstract boolean d();

        public abstract int e();
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class b {
        public static b c(int i8, G0 g8) {
            return new C0875i(i8, g8);
        }

        public abstract int a();

        public abstract G0 b();
    }

    Surface J(Executor executor, T1.a aVar);

    void O(float[] fArr, float[] fArr2, boolean z8);

    void P(float[] fArr, float[] fArr2);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    int getFormat();

    Size k();
}
