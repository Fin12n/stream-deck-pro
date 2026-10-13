package p174u;

import A.AbstractC0890p0;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Range;
import android.util.Size;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class A implements y.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StreamConfigurationMap f34312a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {
        public static Size[] a(StreamConfigurationMap streamConfigurationMap, int i8) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i8);
        }
    }

    public A(StreamConfigurationMap streamConfigurationMap) {
        this.f34312a = streamConfigurationMap;
    }

    @Override // u.y.a
    public StreamConfigurationMap a() {
        return this.f34312a;
    }

    @Override // u.y.a
    public Range[] b(Size size) {
        return this.f34312a.getHighSpeedVideoFpsRangesFor(size);
    }

    @Override // u.y.a
    public Size[] c(int i8) {
        return a.a(this.f34312a, i8);
    }

    @Override // u.y.a
    public int[] f() {
        try {
            return this.f34312a.getOutputFormats();
        } catch (IllegalArgumentException | NullPointerException e8) {
            AbstractC0890p0.m("StreamConfigurationMapCompatBaseImpl", "Failed to get output formats from StreamConfigurationMap", e8);
            return null;
        }
    }

    @Override // u.y.a
    public Size[] g() {
        return this.f34312a.getHighSpeedVideoSizes();
    }
}
