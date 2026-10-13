package p129o2;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f30869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f30870b;

    public b(float[] fArr) {
        this.f30869a = fArr;
        this.f30870b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f8) {
        if (f8 >= 1.0f) {
            return 1.0f;
        }
        if (f8 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f30869a;
        int iMin = Math.min((int) ((fArr.length - 1) * f8), fArr.length - 2);
        float f9 = this.f30870b;
        float f10 = (f8 - (iMin * f9)) / f9;
        float[] fArr2 = this.f30869a;
        float f11 = fArr2[iMin];
        return f11 + (f10 * (fArr2[iMin + 1] - f11));
    }
}
