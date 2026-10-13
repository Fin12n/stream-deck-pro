package p166t;

import A.W0;
import H.C0973d;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class k2 implements W0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f33781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f33782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f33783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f33784d;

    public k2(float f8, float f9) {
        this.f33782b = f8;
        this.f33783c = f9;
    }

    @Override // A.W0
    public float a() {
        return this.f33782b;
    }

    @Override // A.W0
    public float b() {
        return this.f33783c;
    }

    @Override // A.W0
    public float c() {
        return this.f33781a;
    }

    @Override // A.W0
    public float d() {
        return this.f33784d;
    }

    public void e(float f8) {
        float f9 = this.f33782b;
        if (f8 <= f9) {
            float f10 = this.f33783c;
            if (f8 >= f10) {
                this.f33781a = f8;
                this.f33784d = C0973d.u(f8, f10, f9);
                return;
            }
        }
        throw new IllegalArgumentException("Requested zoomRatio " + f8 + " is not within valid range [" + this.f33783c + " , " + this.f33782b + "]");
    }
}
