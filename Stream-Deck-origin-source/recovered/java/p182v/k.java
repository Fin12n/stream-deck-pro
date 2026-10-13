package p182v;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class k extends j {
    public k(Object obj) {
        super(obj);
    }

    @Override // v.i.a
    public void b(Surface surface) {
        ((OutputConfiguration) g()).addSurface(surface);
    }

    @Override // v.i.a
    public void d() {
        ((OutputConfiguration) g()).enableSurfaceSharing();
    }

    @Override // p182v.j, v.i.a
    public abstract Object g();
}
