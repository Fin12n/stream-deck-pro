package androidx.camera.core;

import A.InterfaceC0870f0;
import android.graphics.Rect;
import android.media.Image;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface d extends AutoCloseable {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface a {
        int a();

        int b();

        ByteBuffer l();
    }

    a[] D();

    @Override // java.lang.AutoCloseable
    void close();

    void d1(Rect rect);

    InterfaceC0870f0 e1();

    int f();

    int g();

    int getFormat();

    Image x1();
}
