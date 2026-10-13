package p065h1;

import R0.B0;
import R0.K;
import android.graphics.Matrix;
import android.view.View;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class S implements Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f24159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f24160b;

    public /* synthetic */ S(float[] fArr, AbstractC2633k abstractC2633k) {
        this(fArr);
    }

    @Override // p065h1.Q
    public void a(View view, float[] fArr) {
        B0.h(fArr);
        d(view, fArr);
    }

    public final void b(float[] fArr, Matrix matrix) {
        K.b(this.f24159a, matrix);
        F.h(fArr, this.f24159a);
    }

    public final void c(float[] fArr, float f8, float f9) {
        F.i(fArr, f8, f9, this.f24159a);
    }

    public final void d(View view, float[] fArr) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            d((View) parent, fArr);
            c(fArr, -view.getScrollX(), -view.getScrollY());
            c(fArr, view.getLeft(), view.getTop());
        } else {
            int[] iArr = this.f24160b;
            view.getLocationInWindow(iArr);
            c(fArr, -view.getScrollX(), -view.getScrollY());
            c(fArr, iArr[0], iArr[1]);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        b(fArr, matrix);
    }

    public S(float[] fArr) {
        this.f24159a = fArr;
        this.f24160b = new int[2];
    }
}
