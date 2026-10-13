package p182v;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class j extends n {
    public j(Object obj) {
        super(obj);
    }

    @Override // v.i.a
    public abstract Object g();

    @Override // v.i.a
    public Surface getSurface() {
        return ((OutputConfiguration) g()).getSurface();
    }
}
