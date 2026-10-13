package p065h1;

import R0.K;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class T implements Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f24161a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f24162b = new int[2];

    @Override // p065h1.Q
    public void a(View view, float[] fArr) {
        this.f24161a.reset();
        view.transformMatrixToGlobal(this.f24161a);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        view.getLocationOnScreen(this.f24162b);
        int[] iArr = this.f24162b;
        int i8 = iArr[0];
        int i9 = iArr[1];
        view.getLocationInWindow(iArr);
        int[] iArr2 = this.f24162b;
        this.f24161a.postTranslate(iArr2[0] - i8, iArr2[1] - i9);
        K.b(fArr, this.f24161a);
    }
}
