package J0;

import D6.C0933m;
import p215z0.AbstractC3145c;
import p215z0.w1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f3915b = new int[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public w1[] f3916c = new w1[16];

    public final boolean a(Object obj) {
        int iB;
        int i8 = this.f3914a;
        int iC = AbstractC3145c.c(obj);
        if (i8 > 0) {
            iB = b(obj, iC);
            if (iB >= 0) {
                return false;
            }
        } else {
            iB = -1;
        }
        int i9 = -(iB + 1);
        w1[] w1VarArr = this.f3916c;
        int length = w1VarArr.length;
        if (i8 == length) {
            int i10 = length * 2;
            w1[] w1VarArr2 = new w1[i10];
            int[] iArr = new int[i10];
            int i11 = i9 + 1;
            C0933m.i(w1VarArr, w1VarArr2, i11, i9, i8);
            C0933m.m(this.f3916c, w1VarArr2, 0, 0, i9, 6, null);
            C0933m.g(this.f3915b, iArr, i11, i9, i8);
            C0933m.l(this.f3915b, iArr, 0, 0, i9, 6, null);
            this.f3916c = w1VarArr2;
            this.f3915b = iArr;
        } else {
            int i12 = i9 + 1;
            C0933m.i(w1VarArr, w1VarArr, i12, i9, i8);
            int[] iArr2 = this.f3915b;
            C0933m.g(iArr2, iArr2, i12, i9, i8);
        }
        this.f3916c[i9] = new w1(obj);
        this.f3915b[i9] = iC;
        this.f3914a++;
        return true;
    }

    public final int b(Object obj, int i8) {
        int i9 = this.f3914a - 1;
        int i10 = 0;
        while (i10 <= i9) {
            int i11 = (i10 + i9) >>> 1;
            int i12 = this.f3915b[i11];
            if (i12 < i8) {
                i10 = i11 + 1;
            } else {
                if (i12 <= i8) {
                    w1 w1Var = this.f3916c[i11];
                    return obj == (w1Var != null ? w1Var.get() : null) ? i11 : c(i11, obj, i8);
                }
                i9 = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    public final int c(int i8, Object obj, int i9) {
        int i10 = i8 - 1;
        while (true) {
            if (-1 >= i10 || this.f3915b[i10] != i9) {
                break;
            }
            w1 w1Var = this.f3916c[i10];
            if ((w1Var != null ? w1Var.get() : null) == obj) {
                return i10;
            }
            i10--;
        }
        int i11 = i8 + 1;
        int i12 = this.f3914a;
        while (i11 < i12) {
            if (this.f3915b[i11] != i9) {
                return -(i11 + 1);
            }
            w1 w1Var2 = this.f3916c[i11];
            if ((w1Var2 != null ? w1Var2.get() : null) == obj) {
                return i11;
            }
            i11++;
        }
        i11 = this.f3914a;
        return -(i11 + 1);
    }

    public final int[] d() {
        return this.f3915b;
    }

    public final int e() {
        return this.f3914a;
    }

    public final w1[] f() {
        return this.f3916c;
    }

    public final void g(int i8) {
        this.f3914a = i8;
    }
}
