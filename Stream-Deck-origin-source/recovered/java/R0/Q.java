package R0;

import android.graphics.Path;
import android.graphics.PathMeasure;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class Q implements K0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PathMeasure f9334a;

    public Q(PathMeasure pathMeasure) {
        this.f9334a = pathMeasure;
    }

    @Override // R0.K0
    public void a(H0 h8, boolean z8) {
        Path pathT;
        PathMeasure pathMeasure = this.f9334a;
        if (h8 == null) {
            pathT = null;
        } else {
            if (!(h8 instanceof N)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            pathT = ((N) h8).t();
        }
        pathMeasure.setPath(pathT, z8);
    }

    @Override // R0.K0
    public boolean b(float f8, float f9, H0 h8, boolean z8) {
        PathMeasure pathMeasure = this.f9334a;
        if (h8 instanceof N) {
            return pathMeasure.getSegment(f8, f9, ((N) h8).t(), z8);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // R0.K0
    public float c() {
        return this.f9334a.getLength();
    }
}
