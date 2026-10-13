package U1;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: U1.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class C1658u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewParent f10157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewParent f10158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f10159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10160d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f10161e;

    public C1658u(View view) {
        this.f10159c = view;
    }

    public boolean a(float f8, float f9, boolean z8) {
        ViewParent viewParentG;
        if (!j() || (viewParentG = g(0)) == null) {
            return false;
        }
        return P.a(viewParentG, this.f10159c, f8, f9, z8);
    }

    public boolean b(float f8, float f9) {
        ViewParent viewParentG;
        if (!j() || (viewParentG = g(0)) == null) {
            return false;
        }
        return P.b(viewParentG, this.f10159c, f8, f9);
    }

    public boolean c(int i8, int i9, int[] iArr, int[] iArr2, int i10) {
        ViewParent viewParentG;
        int i11;
        int i12;
        if (!j() || (viewParentG = g(i10)) == null) {
            return false;
        }
        if (i8 == 0 && i9 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
            return false;
        }
        if (iArr2 != null) {
            this.f10159c.getLocationInWindow(iArr2);
            i11 = iArr2[0];
            i12 = iArr2[1];
        } else {
            i11 = 0;
            i12 = 0;
        }
        if (iArr == null) {
            iArr = h();
        }
        int[] iArr3 = iArr;
        iArr3[0] = 0;
        iArr3[1] = 0;
        P.c(viewParentG, this.f10159c, i8, i9, iArr3, i10);
        if (iArr2 != null) {
            this.f10159c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i11;
            iArr2[1] = iArr2[1] - i12;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public void d(int i8, int i9, int i10, int i11, int[] iArr, int i12, int[] iArr2) {
        f(i8, i9, i10, i11, iArr, i12, iArr2);
    }

    public boolean e(int i8, int i9, int i10, int i11, int[] iArr) {
        return f(i8, i9, i10, i11, iArr, 0, null);
    }

    public final boolean f(int i8, int i9, int i10, int i11, int[] iArr, int i12, int[] iArr2) {
        ViewParent viewParentG;
        int i13;
        int i14;
        int[] iArr3;
        if (!j() || (viewParentG = g(i12)) == null) {
            return false;
        }
        if (i8 == 0 && i9 == 0 && i10 == 0 && i11 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f10159c.getLocationInWindow(iArr);
            i13 = iArr[0];
            i14 = iArr[1];
        } else {
            i13 = 0;
            i14 = 0;
        }
        if (iArr2 == null) {
            int[] iArrH = h();
            iArrH[0] = 0;
            iArrH[1] = 0;
            iArr3 = iArrH;
        } else {
            iArr3 = iArr2;
        }
        P.d(viewParentG, this.f10159c, i8, i9, i10, i11, i12, iArr3);
        if (iArr != null) {
            this.f10159c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i13;
            iArr[1] = iArr[1] - i14;
        }
        return true;
    }

    public final ViewParent g(int i8) {
        if (i8 == 0) {
            return this.f10157a;
        }
        if (i8 != 1) {
            return null;
        }
        return this.f10158b;
    }

    public final int[] h() {
        if (this.f10161e == null) {
            this.f10161e = new int[2];
        }
        return this.f10161e;
    }

    public boolean i(int i8) {
        return g(i8) != null;
    }

    public boolean j() {
        return this.f10160d;
    }

    public void k(boolean z8) {
        if (this.f10160d) {
            I.X(this.f10159c);
        }
        this.f10160d = z8;
    }

    public final void l(int i8, ViewParent viewParent) {
        if (i8 == 0) {
            this.f10157a = viewParent;
        } else {
            if (i8 != 1) {
                return;
            }
            this.f10158b = viewParent;
        }
    }

    public boolean m(int i8, int i9) {
        if (i(i9)) {
            return true;
        }
        if (!j()) {
            return false;
        }
        View view = this.f10159c;
        for (ViewParent parent = this.f10159c.getParent(); parent != null; parent = parent.getParent()) {
            if (P.f(parent, view, this.f10159c, i8, i9)) {
                l(i9, parent);
                P.e(parent, view, this.f10159c, i8, i9);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public void n(int i8) {
        ViewParent viewParentG = g(i8);
        if (viewParentG != null) {
            P.g(viewParentG, this.f10159c, i8);
            l(i8, null);
        }
    }
}
