package p174u;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class z extends A {
    public z(StreamConfigurationMap streamConfigurationMap) {
        super(streamConfigurationMap);
    }

    @Override // u.y.a
    public long d(int i8, Size size) {
        return this.f34312a.getOutputMinFrameDuration(i8, size);
    }

    @Override // u.y.a
    public Size[] e(int i8) {
        return this.f34312a.getOutputSizes(i8);
    }
}
