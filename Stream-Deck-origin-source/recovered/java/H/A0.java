package H;

import android.view.Surface;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface A0 {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface a {
        void a(A0 a8);
    }

    void close();

    int f();

    int g();

    Surface getSurface();

    androidx.camera.core.d h();

    void i(a aVar, Executor executor);

    int j();

    void k();

    int l();

    androidx.camera.core.d m();
}
